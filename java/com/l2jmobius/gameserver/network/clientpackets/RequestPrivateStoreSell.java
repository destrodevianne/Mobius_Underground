/*
 * This file is part of the L2J Mobius project.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.l2jmobius.gameserver.network.clientpackets;

import static com.l2jmobius.gameserver.model.actor.L2Npc.INTERACTION_DISTANCE;

import com.l2jmobius.Config;
import com.l2jmobius.gameserver.data.sql.impl.OfflineTradersTable;
import com.l2jmobius.gameserver.enums.PrivateStoreType;
import com.l2jmobius.gameserver.model.ItemRequest;
import com.l2jmobius.gameserver.model.L2World;
import com.l2jmobius.gameserver.model.TradeList;
import com.l2jmobius.gameserver.model.actor.instance.L2PcInstance;
import com.l2jmobius.gameserver.network.serverpackets.ActionFailed;

/**
 * This class ...
 * @version $Revision: 1.2.2.1.2.4 $ $Date: 2005/03/27 15:29:30 $
 */
public final class RequestPrivateStoreSell extends L2GameClientPacket
{
	private static final String _C__9F_REQUESTPRIVATESTORESELL = "[C] 9F RequestPrivateStoreSell";
	
	private static final int BATCH_LENGTH = 34; // length of the one item
	
	private int _storePlayerId;
	private ItemRequest[] _items = null;
	
	@Override
	protected void readImpl()
	{
		_storePlayerId = readD();
		final int count = readD();
		if ((count <= 0) || (count > Config.MAX_ITEM_IN_PACKET) || ((count * BATCH_LENGTH) != _buf.remaining()))
		{
			return;
		}
		_items = new ItemRequest[count];
		
		for (int i = 0; i < count; i++)
		{
			final int objectId = readD();
			final int itemId = readD();
			readH(); // TODO analyse this
			readH(); // TODO analyse this
			final long cnt = readQ();
			final long price = readQ();
			readD(); // TODO analyse this
			readH(); // TODO analyse this
			
			if ((itemId < 1) || (cnt < 1) || (price < 0))
			{
				_items = null;
				return;
			}
			_items[i] = new ItemRequest(objectId, itemId, cnt, price);
		}
	}
	
	@Override
	protected void runImpl()
	{
		final L2PcInstance player = getClient().getActiveChar();
		if (player == null)
		{
			return;
		}
		
		if (_items == null)
		{
			sendPacket(ActionFailed.STATIC_PACKET);
			return;
		}
		
		if (!getClient().getFloodProtectors().getTransaction().tryPerformAction("privatestoresell"))
		{
			player.sendMessage("You are selling items too fast.");
			return;
		}
		
		final L2PcInstance object = L2World.getInstance().getPlayer(_storePlayerId);
		if (object == null)
		{
			return;
		}
		
		final L2PcInstance storePlayer = object;
		if (!player.isInsideRadius(storePlayer, INTERACTION_DISTANCE, true, false))
		{
			return;
		}
		
		if ((player.getInstanceId() != storePlayer.getInstanceId()) && (player.getInstanceId() != -1))
		{
			return;
		}
		
		if (storePlayer.getPrivateStoreType() != PrivateStoreType.BUY)
		{
			return;
		}
		
		if (player.isCursedWeaponEquipped())
		{
			return;
		}
		
		final TradeList storeList = storePlayer.getBuyList();
		if (storeList == null)
		{
			return;
		}
		
		if (!player.getAccessLevel().allowTransaction())
		{
			player.sendMessage("Transactions are disabled for your Access Level.");
			sendPacket(ActionFailed.STATIC_PACKET);
			return;
		}
		
		if (!storeList.privateStoreSell(player, _items))
		{
			sendPacket(ActionFailed.STATIC_PACKET);
			_log.warning("PrivateStore sell has failed due to invalid list or request. Player: " + player.getName() + ", Private store of: " + storePlayer.getName());
			return;
		}
		
		if (Config.FACTION_SYSTEM_ENABLED)
		{
			if ((storePlayer.isEvil() && player.isGood()) || (storePlayer.isGood() && player.isEvil()))
			{
				player.sendMessage("You cant sell on different faction members.");
				return;
			}
		}
		
		// Update offline trade record, if realtime saving is enabled
		if (Config.OFFLINE_TRADE_ENABLE && Config.STORE_OFFLINE_TRADE_IN_REALTIME && ((storePlayer.getClient() == null) || storePlayer.getClient().isDetached()))
		{
			OfflineTradersTable.onTransaction(storePlayer, storeList.getItemCount() == 0, false);
		}
		
		if (storeList.getItemCount() == 0)
		{
			storePlayer.setPrivateStoreType(PrivateStoreType.NONE);
			storePlayer.broadcastUserInfo();
		}
	}
	
	@Override
	public String getType()
	{
		return _C__9F_REQUESTPRIVATESTORESELL;
	}
	
	@Override
	protected boolean triggersOnActionRequest()
	{
		return false;
	}
}
