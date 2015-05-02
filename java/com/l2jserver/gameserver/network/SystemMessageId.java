/*
 * Copyright (C) 2004-2015 L2J Server
 * 
 * This file is part of L2J Server.
 * 
 * L2J Server is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * L2J Server is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.l2jserver.gameserver.network;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import com.l2jserver.Config;
import com.l2jserver.gameserver.model.clientstrings.Builder;
import com.l2jserver.gameserver.network.serverpackets.SystemMessage;

/**
 * @author Noctarius, Nille02, crion, Forsaiken
 */
public final class SystemMessageId
{
	private static final Logger _log = Logger.getLogger(SystemMessageId.class.getName());
	private static final SMLocalisation[] EMPTY_SML_ARRAY = new SMLocalisation[0];
	public static final SystemMessageId[] EMPTY_ARRAY = new SystemMessageId[0];
	
	/**
	 * Map containing all SystemMessageIds<br>
	 */
	private static Map<Integer, SystemMessageId> VALUES = new HashMap<>();
	
	@ClientString(id = 0, message = "You have been disconnected from the server.")
	public static SystemMessageId YOU_HAVE_BEEN_DISCONNECTED_FROM_THE_SERVER;
	
	@ClientString(id = 1, message = "The server will be coming down in $s1 second(s).  Please find a safe place to log out.")
	public static SystemMessageId THE_SERVER_WILL_BE_COMING_DOWN_IN_S1_SECOND_S_PLEASE_FIND_A_SAFE_PLACE_TO_LOG_OUT;
	
	@ClientString(id = 2, message = "$s1 does not exist.")
	public static SystemMessageId S1_DOES_NOT_EXIST;
	
	@ClientString(id = 3, message = "$s1 is not currently logged in.")
	public static SystemMessageId S1_IS_NOT_CURRENTLY_LOGGED_IN;
	
	@ClientString(id = 4, message = "You cannot ask yourself to apply to a clan.")
	public static SystemMessageId YOU_CANNOT_ASK_YOURSELF_TO_APPLY_TO_A_CLAN;
	
	@ClientString(id = 5, message = "$s1 already exists.")
	public static SystemMessageId S1_ALREADY_EXISTS;
	
	@ClientString(id = 6, message = "$s1 does not exist.")
	public static SystemMessageId S1_DOES_NOT_EXIST2;
	
	@ClientString(id = 7, message = "You are already a member of $s1.")
	public static SystemMessageId YOU_ARE_ALREADY_A_MEMBER_OF_S1;
	
	@ClientString(id = 8, message = "You are already a member of another clan.")
	public static SystemMessageId YOU_ARE_ALREADY_A_MEMBER_OF_ANOTHER_CLAN;
	
	@ClientString(id = 9, message = "$s1 is not a clan leader.")
	public static SystemMessageId S1_IS_NOT_A_CLAN_LEADER;
	
	@ClientString(id = 10, message = "$s1 is already a member of another clan.")
	public static SystemMessageId S1_IS_ALREADY_A_MEMBER_OF_ANOTHER_CLAN;
	
	@ClientString(id = 11, message = "There are no applicants for this clan.")
	public static SystemMessageId THERE_ARE_NO_APPLICANTS_FOR_THIS_CLAN;
	
	@ClientString(id = 12, message = "Applicant information is incorrect.")
	public static SystemMessageId APPLICANT_INFORMATION_IS_INCORRECT;
	
	@ClientString(id = 13, message = "Unable to dissolve: your clan has requested to participate in a castle siege.")
	public static SystemMessageId UNABLE_TO_DISSOLVE_YOUR_CLAN_HAS_REQUESTED_TO_PARTICIPATE_IN_A_CASTLE_SIEGE;
	
	@ClientString(id = 14, message = "Unable to dissolve: your clan owns one or more castles or clan halls.")
	public static SystemMessageId UNABLE_TO_DISSOLVE_YOUR_CLAN_OWNS_ONE_OR_MORE_CASTLES_OR_CLAN_HALLS;
	
	@ClientString(id = 15, message = "You are in siege.")
	public static SystemMessageId YOU_ARE_IN_SIEGE;
	
	@ClientString(id = 16, message = "You are not in siege.")
	public static SystemMessageId YOU_ARE_NOT_IN_SIEGE;
	
	@ClientString(id = 17, message = "The castle siege has begun.")
	public static SystemMessageId THE_CASTLE_SIEGE_HAS_BEGUN;
	
	@ClientString(id = 18, message = "The castle siege has ended.")
	public static SystemMessageId THE_CASTLE_SIEGE_HAS_ENDED;
	
	@ClientString(id = 19, message = "There is a new Lord of the castle!")
	public static SystemMessageId THERE_IS_A_NEW_LORD_OF_THE_CASTLE;
	
	@ClientString(id = 20, message = "The gate is being opened.")
	public static SystemMessageId THE_GATE_IS_BEING_OPENED;
	
	@ClientString(id = 21, message = "The gate is being destroyed.")
	public static SystemMessageId THE_GATE_IS_BEING_DESTROYED;
	
	@ClientString(id = 22, message = "Your target is out of range.")
	public static SystemMessageId YOUR_TARGET_IS_OUT_OF_RANGE;
	
	@ClientString(id = 23, message = "Not enough HP.")
	public static SystemMessageId NOT_ENOUGH_HP;
	
	@ClientString(id = 24, message = "Not enough MP.")
	public static SystemMessageId NOT_ENOUGH_MP;
	
	@ClientString(id = 25, message = "Rejuvenating HP.")
	public static SystemMessageId REJUVENATING_HP;
	
	@ClientString(id = 26, message = "Rejuvenating MP.")
	public static SystemMessageId REJUVENATING_MP;
	
	@ClientString(id = 27, message = "Your casting has been interrupted.")
	public static SystemMessageId YOUR_CASTING_HAS_BEEN_INTERRUPTED;
	
	@ClientString(id = 28, message = "You have obtained $s1 Adena.")
	public static SystemMessageId YOU_HAVE_OBTAINED_S1_ADENA;
	
	@ClientString(id = 29, message = "You have obtained $s2 $s1.")
	public static SystemMessageId YOU_HAVE_OBTAINED_S2_S1;
	
	@ClientString(id = 30, message = "You have obtained $s1.")
	public static SystemMessageId YOU_HAVE_OBTAINED_S1;
	
	@ClientString(id = 31, message = "You cannot move while sitting.")
	public static SystemMessageId YOU_CANNOT_MOVE_WHILE_SITTING;
	
	@ClientString(id = 32, message = "You are unable to engage in combat. Please go to the nearest restart point.")
	public static SystemMessageId YOU_ARE_UNABLE_TO_ENGAGE_IN_COMBAT_PLEASE_GO_TO_THE_NEAREST_RESTART_POINT;
	
	@ClientString(id = 33, message = "You cannot move while casting.")
	public static SystemMessageId YOU_CANNOT_MOVE_WHILE_CASTING;
	
	@ClientString(id = 34, message = "Welcome to the World of Lineage II.")
	public static SystemMessageId WELCOME_TO_THE_WORLD_OF_LINEAGE_II;
	
	@ClientString(id = 35, message = "You hit for $s1 damage.")
	public static SystemMessageId YOU_HIT_FOR_S1_DAMAGE;
	
	@ClientString(id = 36, message = "$c1 hit you for $s2 damage.")
	public static SystemMessageId C1_HIT_YOU_FOR_S2_DAMAGE;
	
	@ClientString(id = 37, message = "$c1 hit you for $s2 damage.")
	public static SystemMessageId C1_HIT_YOU_FOR_S2_DAMAGE2;
	
	@ClientString(id = 38, message = "The TGS2002 event begins!")
	public static SystemMessageId THE_TGS2002_EVENT_BEGINS;
	
	@ClientString(id = 39, message = "The TGS2002 event is over. Thank you very much.")
	public static SystemMessageId THE_TGS2002_EVENT_IS_OVER_THANK_YOU_VERY_MUCH;
	
	@ClientString(id = 40, message = "This is the TGS demo: the character will immediately be restored.")
	public static SystemMessageId THIS_IS_THE_TGS_DEMO_THE_CHARACTER_WILL_IMMEDIATELY_BE_RESTORED;
	
	@ClientString(id = 41, message = "You carefully nock an arrow.")
	public static SystemMessageId YOU_CAREFULLY_NOCK_AN_ARROW;
	
	@ClientString(id = 42, message = "You have avoided $c1's attack.")
	public static SystemMessageId YOU_HAVE_AVOIDED_C1_S_ATTACK;
	
	@ClientString(id = 43, message = "You have missed.")
	public static SystemMessageId YOU_HAVE_MISSED;
	
	@ClientString(id = 44, message = "Critical hit!")
	public static SystemMessageId CRITICAL_HIT;
	
	@ClientString(id = 45, message = "You have earned $s1 XP.")
	public static SystemMessageId YOU_HAVE_EARNED_S1_XP;
	
	@ClientString(id = 46, message = "You use $s1.")
	public static SystemMessageId YOU_USE_S1;
	
	@ClientString(id = 47, message = "You begin to use a(n) $s1.")
	public static SystemMessageId YOU_BEGIN_TO_USE_A_N_S1;
	
	@ClientString(id = 48, message = "$s1 is not available at this time: being prepared for reuse.")
	public static SystemMessageId S1_IS_NOT_AVAILABLE_AT_THIS_TIME_BEING_PREPARED_FOR_REUSE;
	
	@ClientString(id = 49, message = "You have equipped your $s1.")
	public static SystemMessageId YOU_HAVE_EQUIPPED_YOUR_S1;
	
	@ClientString(id = 50, message = "Your target cannot be found.")
	public static SystemMessageId YOUR_TARGET_CANNOT_BE_FOUND;
	
	@ClientString(id = 51, message = "You cannot use this on yourself.")
	public static SystemMessageId YOU_CANNOT_USE_THIS_ON_YOURSELF;
	
	@ClientString(id = 52, message = "You have earned $s1 Adena.")
	public static SystemMessageId YOU_HAVE_EARNED_S1_ADENA;
	
	@ClientString(id = 53, message = "You have earned $s2 $s1(s).")
	public static SystemMessageId YOU_HAVE_EARNED_S2_S1_S;
	
	@ClientString(id = 54, message = "You have earned $s1.")
	public static SystemMessageId YOU_HAVE_EARNED_S1;
	
	@ClientString(id = 55, message = "You have failed to pick up $s1 Adena.")
	public static SystemMessageId YOU_HAVE_FAILED_TO_PICK_UP_S1_ADENA;
	
	@ClientString(id = 56, message = "You have failed to pick up $s1.")
	public static SystemMessageId YOU_HAVE_FAILED_TO_PICK_UP_S1;
	
	@ClientString(id = 57, message = "You have failed to pick up $s2 $s1(s).")
	public static SystemMessageId YOU_HAVE_FAILED_TO_PICK_UP_S2_S1_S;
	
	@ClientString(id = 58, message = "You have failed to earn $s1 Adena.")
	public static SystemMessageId YOU_HAVE_FAILED_TO_EARN_S1_ADENA;
	
	@ClientString(id = 59, message = "You have failed to earn $s1.")
	public static SystemMessageId YOU_HAVE_FAILED_TO_EARN_S1;
	
	@ClientString(id = 60, message = "You have failed to earn $s2 $s1(s).")
	public static SystemMessageId YOU_HAVE_FAILED_TO_EARN_S2_S1_S;
	
	@ClientString(id = 61, message = "Nothing happened.")
	public static SystemMessageId NOTHING_HAPPENED;
	
	@ClientString(id = 62, message = "Your $s1 has been successfully enchanted.")
	public static SystemMessageId YOUR_S1_HAS_BEEN_SUCCESSFULLY_ENCHANTED;
	
	@ClientString(id = 63, message = "Your +$s1 $s2 has been successfully enchanted.")
	public static SystemMessageId YOUR_S1_S2_HAS_BEEN_SUCCESSFULLY_ENCHANTED;
	
	@ClientString(id = 64, message = "The enchantment has failed!  Your $s1 has been crystallized.")
	public static SystemMessageId THE_ENCHANTMENT_HAS_FAILED_YOUR_S1_HAS_BEEN_CRYSTALLIZED;
	
	@ClientString(id = 65, message = "The enchantment has failed!  Your +$s1 $s2 has been crystallized.")
	public static SystemMessageId THE_ENCHANTMENT_HAS_FAILED_YOUR_S1_S2_HAS_BEEN_CRYSTALLIZED;
	
	@ClientString(id = 66, message = "$c1 is inviting you to join a party. Do you accept?")
	public static SystemMessageId C1_IS_INVITING_YOU_TO_JOIN_A_PARTY_DO_YOU_ACCEPT;
	
	@ClientString(id = 67, message = "$s1 has invited you to join their clan, $s2. Do you wish to join?")
	public static SystemMessageId S1_HAS_INVITED_YOU_TO_JOIN_THEIR_CLAN_S2_DO_YOU_WISH_TO_JOIN;
	
	@ClientString(id = 68, message = "Would you like to withdraw from clan $s1? If you leave, you will have to wait at least a day before joining another clan.")
	public static SystemMessageId WOULD_YOU_LIKE_TO_WITHDRAW_FROM_CLAN_S1_IF_YOU_LEAVE_YOU_WILL_HAVE_TO_WAIT_AT_LEAST_A_DAY_BEFORE_JOINING_ANOTHER_CLAN;
	
	@ClientString(id = 69, message = "Would you like to dismiss $s1 from the clan? If you do so, you will have to wait at least a day before accepting a new member.")
	public static SystemMessageId WOULD_YOU_LIKE_TO_DISMISS_S1_FROM_THE_CLAN_IF_YOU_DO_SO_YOU_WILL_HAVE_TO_WAIT_AT_LEAST_A_DAY_BEFORE_ACCEPTING_A_NEW_MEMBER;
	
	@ClientString(id = 70, message = "Do you wish to disperse the clan, $s1?")
	public static SystemMessageId DO_YOU_WISH_TO_DISPERSE_THE_CLAN_S1;
	
	@ClientString(id = 71, message = "How much $s1(s) do you wish to discard?")
	public static SystemMessageId HOW_MUCH_S1_S_DO_YOU_WISH_TO_DISCARD;
	
	@ClientString(id = 72, message = "How much $s1(s) do you wish to move?")
	public static SystemMessageId HOW_MUCH_S1_S_DO_YOU_WISH_TO_MOVE;
	
	@ClientString(id = 73, message = "How much $s1(s) do you wish to destroy?")
	public static SystemMessageId HOW_MUCH_S1_S_DO_YOU_WISH_TO_DESTROY;
	
	@ClientString(id = 74, message = "Do you wish to destroy your $s1?")
	public static SystemMessageId DO_YOU_WISH_TO_DESTROY_YOUR_S1;
	
	@ClientString(id = 75, message = "ID does not exist.")
	public static SystemMessageId ID_DOES_NOT_EXIST;
	
	@ClientString(id = 76, message = "Incorrect password.")
	public static SystemMessageId INCORRECT_PASSWORD;
	
	@ClientString(id = 77, message = "You cannot create another character. Please delete an existing character and try again.")
	public static SystemMessageId YOU_CANNOT_CREATE_ANOTHER_CHARACTER_PLEASE_DELETE_AN_EXISTING_CHARACTER_AND_TRY_AGAIN;
	
	@ClientString(id = 78, message = "When you delete a character, any items in his/her possession will also be deleted. Do you really wish to delete $s1?")
	public static SystemMessageId WHEN_YOU_DELETE_A_CHARACTER_ANY_ITEMS_IN_HIS_HER_POSSESSION_WILL_ALSO_BE_DELETED_DO_YOU_REALLY_WISH_TO_DELETE_S1;
	
	@ClientString(id = 79, message = "This name already exists.")
	public static SystemMessageId THIS_NAME_ALREADY_EXISTS;
	
	@ClientString(id = 80, message = "Your title cannot exceed 16 characters in length.ﾠ Please try again.")
	public static SystemMessageId YOUR_TITLE_CANNOT_EXCEED_16_CHARACTERS_IN_LENGTH_PLEASE_TRY_AGAIN;
	
	@ClientString(id = 81, message = "Please select your race.")
	public static SystemMessageId PLEASE_SELECT_YOUR_RACE;
	
	@ClientString(id = 82, message = "Please select your occupation.")
	public static SystemMessageId PLEASE_SELECT_YOUR_OCCUPATION;
	
	@ClientString(id = 83, message = "Please select your gender.")
	public static SystemMessageId PLEASE_SELECT_YOUR_GENDER;
	
	@ClientString(id = 84, message = "You may not attack in a peaceful zone.")
	public static SystemMessageId YOU_MAY_NOT_ATTACK_IN_A_PEACEFUL_ZONE;
	
	@ClientString(id = 85, message = "You may not attack this target in a peaceful zone.")
	public static SystemMessageId YOU_MAY_NOT_ATTACK_THIS_TARGET_IN_A_PEACEFUL_ZONE;
	
	@ClientString(id = 86, message = "Please enter your ID.")
	public static SystemMessageId PLEASE_ENTER_YOUR_ID;
	
	@ClientString(id = 87, message = "Please enter your password.")
	public static SystemMessageId PLEASE_ENTER_YOUR_PASSWORD;
	
	@ClientString(id = 88, message = "Your protocol version is different, please restart your client and run a full check.")
	public static SystemMessageId YOUR_PROTOCOL_VERSION_IS_DIFFERENT_PLEASE_RESTART_YOUR_CLIENT_AND_RUN_A_FULL_CHECK;
	
	@ClientString(id = 89, message = "Your protocol version is different, please continue.")
	public static SystemMessageId YOUR_PROTOCOL_VERSION_IS_DIFFERENT_PLEASE_CONTINUE;
	
	@ClientString(id = 90, message = "You are unable to connect to the server.")
	public static SystemMessageId YOU_ARE_UNABLE_TO_CONNECT_TO_THE_SERVER;
	
	@ClientString(id = 91, message = "Please select your hairstyle.")
	public static SystemMessageId PLEASE_SELECT_YOUR_HAIRSTYLE;
	
	@ClientString(id = 92, message = "$s1 has worn off.")
	public static SystemMessageId S1_HAS_WORN_OFF;
	
	@ClientString(id = 93, message = "You do not have enough SP for this.")
	public static SystemMessageId YOU_DO_NOT_HAVE_ENOUGH_SP_FOR_THIS;
	
	@ClientString(id = 94, message = "Copyright ﾩ NCSOFT Corporation. All Rights Reserved.")
	public static SystemMessageId COPYRIGHT_NCSOFT_CORPORATION_ALL_RIGHTS_RESERVED;
	
	@ClientString(id = 95, message = "You have earned $s1 XP and $s2 SP.")
	public static SystemMessageId YOU_HAVE_EARNED_S1_XP_AND_S2_SP;
	
	@ClientString(id = 96, message = "Your level has increased!")
	public static SystemMessageId YOUR_LEVEL_HAS_INCREASED;
	
	@ClientString(id = 97, message = "This item cannot be moved.")
	public static SystemMessageId THIS_ITEM_CANNOT_BE_MOVED;
	
	@ClientString(id = 98, message = "This item cannot be destroyed.")
	public static SystemMessageId THIS_ITEM_CANNOT_BE_DESTROYED;
	
	@ClientString(id = 99, message = "This item cannot be traded or sold.")
	public static SystemMessageId THIS_ITEM_CANNOT_BE_TRADED_OR_SOLD;
	
	@ClientString(id = 100, message = "$c1 is requesting a trade. Do you wish to continue?")
	public static SystemMessageId C1_IS_REQUESTING_A_TRADE_DO_YOU_WISH_TO_CONTINUE;
	
	@ClientString(id = 101, message = "You cannot exit the game while in combat.")
	public static SystemMessageId YOU_CANNOT_EXIT_THE_GAME_WHILE_IN_COMBAT;
	
	@ClientString(id = 102, message = "You cannot restart while in combat.")
	public static SystemMessageId YOU_CANNOT_RESTART_WHILE_IN_COMBAT;
	
	@ClientString(id = 103, message = "This ID is currently logged in.")
	public static SystemMessageId THIS_ID_IS_CURRENTLY_LOGGED_IN;
	
	@ClientString(id = 104, message = "You cannot change weapons during an attack.")
	public static SystemMessageId YOU_CANNOT_CHANGE_WEAPONS_DURING_AN_ATTACK;
	
	@ClientString(id = 105, message = "$c1 has been invited to the party.")
	public static SystemMessageId C1_HAS_BEEN_INVITED_TO_THE_PARTY;
	
	@ClientString(id = 106, message = "You have joined $s1's party.")
	public static SystemMessageId YOU_HAVE_JOINED_S1_S_PARTY;
	
	@ClientString(id = 107, message = "$c1 has joined the party.")
	public static SystemMessageId C1_HAS_JOINED_THE_PARTY;
	
	@ClientString(id = 108, message = "$c1 has left the party.")
	public static SystemMessageId C1_HAS_LEFT_THE_PARTY;
	
	@ClientString(id = 109, message = "Invalid target.")
	public static SystemMessageId INVALID_TARGET;
	
	@ClientString(id = 110, message = "$s1's effect can be felt.")
	public static SystemMessageId S1_S_EFFECT_CAN_BE_FELT;
	
	@ClientString(id = 111, message = "Your shield defense has succeeded.")
	public static SystemMessageId YOUR_SHIELD_DEFENSE_HAS_SUCCEEDED;
	
	@ClientString(id = 112, message = "You have run out of arrows.")
	public static SystemMessageId YOU_HAVE_RUN_OUT_OF_ARROWS;
	
	@ClientString(id = 113, message = "$s1 cannot be used due to unsuitable terms.")
	public static SystemMessageId S1_CANNOT_BE_USED_DUE_TO_UNSUITABLE_TERMS;
	
	@ClientString(id = 114, message = "You have entered the shadow of the Mother Tree.")
	public static SystemMessageId YOU_HAVE_ENTERED_THE_SHADOW_OF_THE_MOTHER_TREE;
	
	@ClientString(id = 115, message = "You have left the shadow of the Mother Tree.")
	public static SystemMessageId YOU_HAVE_LEFT_THE_SHADOW_OF_THE_MOTHER_TREE;
	
	@ClientString(id = 116, message = "You have entered a peace zone.")
	public static SystemMessageId YOU_HAVE_ENTERED_A_PEACE_ZONE;
	
	@ClientString(id = 117, message = "You have left the peace zone.")
	public static SystemMessageId YOU_HAVE_LEFT_THE_PEACE_ZONE;
	
	@ClientString(id = 118, message = "You have requested a trade with $c1.")
	public static SystemMessageId YOU_HAVE_REQUESTED_A_TRADE_WITH_C1;
	
	@ClientString(id = 119, message = "$c1 has denied your request to trade.")
	public static SystemMessageId C1_HAS_DENIED_YOUR_REQUEST_TO_TRADE;
	
	@ClientString(id = 120, message = "You begin trading with $c1.")
	public static SystemMessageId YOU_BEGIN_TRADING_WITH_C1;
	
	@ClientString(id = 121, message = "$c1 has confirmed the trade.")
	public static SystemMessageId C1_HAS_CONFIRMED_THE_TRADE;
	
	@ClientString(id = 122, message = "You may no longer adjust items in the trade because the trade has been confirmed.")
	public static SystemMessageId YOU_MAY_NO_LONGER_ADJUST_ITEMS_IN_THE_TRADE_BECAUSE_THE_TRADE_HAS_BEEN_CONFIRMED;
	
	@ClientString(id = 123, message = "Your trade was successful.")
	public static SystemMessageId YOUR_TRADE_WAS_SUCCESSFUL;
	
	@ClientString(id = 124, message = "$c1 has cancelled the trade.")
	public static SystemMessageId C1_HAS_CANCELLED_THE_TRADE;
	
	@ClientString(id = 125, message = "Do you wish to exit the game?")
	public static SystemMessageId DO_YOU_WISH_TO_EXIT_THE_GAME;
	
	@ClientString(id = 126, message = "Do you wish to exit to the character select screen?")
	public static SystemMessageId DO_YOU_WISH_TO_EXIT_TO_THE_CHARACTER_SELECT_SCREEN;
	
	@ClientString(id = 127, message = "You have been disconnected from the server. Please login again.")
	public static SystemMessageId YOU_HAVE_BEEN_DISCONNECTED_FROM_THE_SERVER_PLEASE_LOGIN_AGAIN;
	
	@ClientString(id = 128, message = "Your character creation has failed.")
	public static SystemMessageId YOUR_CHARACTER_CREATION_HAS_FAILED;
	
	@ClientString(id = 129, message = "Your inventory is full.")
	public static SystemMessageId YOUR_INVENTORY_IS_FULL;
	
	@ClientString(id = 130, message = "Your warehouse is full.")
	public static SystemMessageId YOUR_WAREHOUSE_IS_FULL;
	
	@ClientString(id = 131, message = "$s1 has logged in.")
	public static SystemMessageId S1_HAS_LOGGED_IN;
	
	@ClientString(id = 132, message = "$s1 has been added to your friends list.")
	public static SystemMessageId S1_HAS_BEEN_ADDED_TO_YOUR_FRIENDS_LIST;
	
	@ClientString(id = 133, message = "$s1 has been removed from your friends list.")
	public static SystemMessageId S1_HAS_BEEN_REMOVED_FROM_YOUR_FRIENDS_LIST;
	
	@ClientString(id = 134, message = "Please check your friends list again.")
	public static SystemMessageId PLEASE_CHECK_YOUR_FRIENDS_LIST_AGAIN;
	
	@ClientString(id = 135, message = "$c1 did not reply to your invitation. Your invitation has been cancelled.")
	public static SystemMessageId C1_DID_NOT_REPLY_TO_YOUR_INVITATION_YOUR_INVITATION_HAS_BEEN_CANCELLED;
	
	@ClientString(id = 136, message = "You have not replied to $c1's invitation. The offer has been cancelled.")
	public static SystemMessageId YOU_HAVE_NOT_REPLIED_TO_C1_S_INVITATION_THE_OFFER_HAS_BEEN_CANCELLED;
	
	@ClientString(id = 137, message = "There are no more items in the shortcut.")
	public static SystemMessageId THERE_ARE_NO_MORE_ITEMS_IN_THE_SHORTCUT;
	
	@ClientString(id = 138, message = "Designate shortcut.")
	public static SystemMessageId DESIGNATE_SHORTCUT;
	
	@ClientString(id = 139, message = "$c1 has resisted your $s2.")
	public static SystemMessageId C1_HAS_RESISTED_YOUR_S2;
	
	@ClientString(id = 140, message = "Your skill was deactivated due to lack of MP.")
	public static SystemMessageId YOUR_SKILL_WAS_DEACTIVATED_DUE_TO_LACK_OF_MP;
	
	@ClientString(id = 141, message = "Once a trade is confirmed, the items involved cannot be moved again. If you wish to make a change, cancel the trade and start again.")
	public static SystemMessageId ONCE_A_TRADE_IS_CONFIRMED_THE_ITEMS_INVOLVED_CANNOT_BE_MOVED_AGAIN_IF_YOU_WISH_TO_MAKE_A_CHANGE_CANCEL_THE_TRADE_AND_START_AGAIN;
	
	@ClientString(id = 142, message = "You are already trading with someone.")
	public static SystemMessageId YOU_ARE_ALREADY_TRADING_WITH_SOMEONE;
	
	@ClientString(id = 143, message = "$c1 is already trading with another person. Please try again later.")
	public static SystemMessageId C1_IS_ALREADY_TRADING_WITH_ANOTHER_PERSON_PLEASE_TRY_AGAIN_LATER;
	
	@ClientString(id = 144, message = "That is an incorrect target.")
	public static SystemMessageId THAT_IS_AN_INCORRECT_TARGET;
	
	@ClientString(id = 145, message = "That player is not online.")
	public static SystemMessageId THAT_PLAYER_IS_NOT_ONLINE;
	
	@ClientString(id = 146, message = "Chatting is now permitted.")
	public static SystemMessageId CHATTING_IS_NOW_PERMITTED;
	
	@ClientString(id = 147, message = "Chatting is currently prohibited.")
	public static SystemMessageId CHATTING_IS_CURRENTLY_PROHIBITED;
	
	@ClientString(id = 148, message = "You cannot use quest items.")
	public static SystemMessageId YOU_CANNOT_USE_QUEST_ITEMS;
	
	@ClientString(id = 149, message = "You cannot pick up or use items while trading.")
	public static SystemMessageId YOU_CANNOT_PICK_UP_OR_USE_ITEMS_WHILE_TRADING;
	
	@ClientString(id = 150, message = "You cannot discard or destroy an item while trading at a private store.")
	public static SystemMessageId YOU_CANNOT_DISCARD_OR_DESTROY_AN_ITEM_WHILE_TRADING_AT_A_PRIVATE_STORE;
	
	@ClientString(id = 151, message = "You cannot discard something that far away from you.")
	public static SystemMessageId YOU_CANNOT_DISCARD_SOMETHING_THAT_FAR_AWAY_FROM_YOU;
	
	@ClientString(id = 152, message = "You have invited the wrong target.")
	public static SystemMessageId YOU_HAVE_INVITED_THE_WRONG_TARGET;
	
	@ClientString(id = 153, message = "$c1 is on another task. Please try again later.")
	public static SystemMessageId C1_IS_ON_ANOTHER_TASK_PLEASE_TRY_AGAIN_LATER;
	
	@ClientString(id = 154, message = "Only the leader can give out invitations.")
	public static SystemMessageId ONLY_THE_LEADER_CAN_GIVE_OUT_INVITATIONS;
	
	@ClientString(id = 155, message = "The party is full.")
	public static SystemMessageId THE_PARTY_IS_FULL;
	
	@ClientString(id = 156, message = "Drain was only 50 percent successful.")
	public static SystemMessageId DRAIN_WAS_ONLY_50_PERCENT_SUCCESSFUL;
	
	@ClientString(id = 157, message = "You resisted $c1's drain.")
	public static SystemMessageId YOU_RESISTED_C1_S_DRAIN;
	
	@ClientString(id = 158, message = "Your attack has failed.")
	public static SystemMessageId YOUR_ATTACK_HAS_FAILED;
	
	@ClientString(id = 159, message = "You resisted $c1's magic.")
	public static SystemMessageId YOU_RESISTED_C1_S_MAGIC;
	
	@ClientString(id = 160, message = "$c1 is a member of another party and cannot be invited.")
	public static SystemMessageId C1_IS_A_MEMBER_OF_ANOTHER_PARTY_AND_CANNOT_BE_INVITED;
	
	@ClientString(id = 161, message = "That player is not currently online.")
	public static SystemMessageId THAT_PLAYER_IS_NOT_CURRENTLY_ONLINE;
	
	@ClientString(id = 162, message = "You have moved too far away from the warehouse to perform that action.")
	public static SystemMessageId YOU_HAVE_MOVED_TOO_FAR_AWAY_FROM_THE_WAREHOUSE_TO_PERFORM_THAT_ACTION;
	
	@ClientString(id = 163, message = "You cannot destroy it because the number is incorrect.")
	public static SystemMessageId YOU_CANNOT_DESTROY_IT_BECAUSE_THE_NUMBER_IS_INCORRECT;
	
	@ClientString(id = 164, message = "Waiting for another reply.")
	public static SystemMessageId WAITING_FOR_ANOTHER_REPLY;
	
	@ClientString(id = 165, message = "You cannot add yourself to your own friend list.")
	public static SystemMessageId YOU_CANNOT_ADD_YOURSELF_TO_YOUR_OWN_FRIEND_LIST;
	
	@ClientString(id = 166, message = "Friend list is not ready yet. Please register again later.")
	public static SystemMessageId FRIEND_LIST_IS_NOT_READY_YET_PLEASE_REGISTER_AGAIN_LATER;
	
	@ClientString(id = 167, message = "$c1 is already on your friend list.")
	public static SystemMessageId C1_IS_ALREADY_ON_YOUR_FRIEND_LIST;
	
	@ClientString(id = 168, message = "$c1 has sent a friend request.")
	public static SystemMessageId C1_HAS_SENT_A_FRIEND_REQUEST;
	
	@ClientString(id = 169, message = "Accept friendship 0/1 (1 to accept, 0 to deny)")
	public static SystemMessageId ACCEPT_FRIENDSHIP_0_1_1_TO_ACCEPT_0_TO_DENY;
	
	@ClientString(id = 170, message = "The user who requested to become friends is not found in the game.")
	public static SystemMessageId THE_USER_WHO_REQUESTED_TO_BECOME_FRIENDS_IS_NOT_FOUND_IN_THE_GAME;
	
	@ClientString(id = 171, message = "$c1 is not on your friend list.")
	public static SystemMessageId C1_IS_NOT_ON_YOUR_FRIEND_LIST;
	
	@ClientString(id = 172, message = "You lack the funds needed to pay for this transaction.")
	public static SystemMessageId YOU_LACK_THE_FUNDS_NEEDED_TO_PAY_FOR_THIS_TRANSACTION;
	
	@ClientString(id = 173, message = "You lack the funds needed to pay for this transaction.")
	public static SystemMessageId YOU_LACK_THE_FUNDS_NEEDED_TO_PAY_FOR_THIS_TRANSACTION2;
	
	@ClientString(id = 174, message = "That person's inventory is full.")
	public static SystemMessageId THAT_PERSON_S_INVENTORY_IS_FULL;
	
	@ClientString(id = 175, message = "That skill has been de-activated as HP was fully recovered.")
	public static SystemMessageId THAT_SKILL_HAS_BEEN_DE_ACTIVATED_AS_HP_WAS_FULLY_RECOVERED;
	
	@ClientString(id = 176, message = "That person is in message refusal mode.")
	public static SystemMessageId THAT_PERSON_IS_IN_MESSAGE_REFUSAL_MODE;
	
	@ClientString(id = 177, message = "Message refusal mode.")
	public static SystemMessageId MESSAGE_REFUSAL_MODE;
	
	@ClientString(id = 178, message = "Message acceptance mode.")
	public static SystemMessageId MESSAGE_ACCEPTANCE_MODE;
	
	@ClientString(id = 179, message = "You cannot discard those items here.")
	public static SystemMessageId YOU_CANNOT_DISCARD_THOSE_ITEMS_HERE;
	
	@ClientString(id = 180, message = "You have $s1 day(s) left until deletion.  Do you wish to cancel this action?")
	public static SystemMessageId YOU_HAVE_S1_DAY_S_LEFT_UNTIL_DELETION_DO_YOU_WISH_TO_CANCEL_THIS_ACTION;
	
	@ClientString(id = 181, message = "Cannot see target.")
	public static SystemMessageId CANNOT_SEE_TARGET;
	
	@ClientString(id = 182, message = "Do you wish to stop the currently selected '$s1' quest?")
	public static SystemMessageId DO_YOU_WISH_TO_STOP_THE_CURRENTLY_SELECTED_S1_QUEST;
	
	@ClientString(id = 183, message = "There are too many users on the server. Please try again later.")
	public static SystemMessageId THERE_ARE_TOO_MANY_USERS_ON_THE_SERVER_PLEASE_TRY_AGAIN_LATER;
	
	@ClientString(id = 184, message = "Please try again later.")
	public static SystemMessageId PLEASE_TRY_AGAIN_LATER;
	
	@ClientString(id = 185, message = "You must first select a user to invite to your party.")
	public static SystemMessageId YOU_MUST_FIRST_SELECT_A_USER_TO_INVITE_TO_YOUR_PARTY;
	
	@ClientString(id = 186, message = "You must first select a user to invite to your clan.")
	public static SystemMessageId YOU_MUST_FIRST_SELECT_A_USER_TO_INVITE_TO_YOUR_CLAN;
	
	@ClientString(id = 187, message = "Select user to expel.")
	public static SystemMessageId SELECT_USER_TO_EXPEL;
	
	@ClientString(id = 188, message = "Please create your clan name.")
	public static SystemMessageId PLEASE_CREATE_YOUR_CLAN_NAME;
	
	@ClientString(id = 189, message = "Your clan has been created.")
	public static SystemMessageId YOUR_CLAN_HAS_BEEN_CREATED;
	
	@ClientString(id = 190, message = "You have failed to create a clan.")
	public static SystemMessageId YOU_HAVE_FAILED_TO_CREATE_A_CLAN;
	
	@ClientString(id = 191, message = "Clan member $s1 has been expelled.")
	public static SystemMessageId CLAN_MEMBER_S1_HAS_BEEN_EXPELLED;
	
	@ClientString(id = 192, message = "You have failed to expel $s1 from the clan.")
	public static SystemMessageId YOU_HAVE_FAILED_TO_EXPEL_S1_FROM_THE_CLAN;
	
	@ClientString(id = 193, message = "Clan has dispersed.")
	public static SystemMessageId CLAN_HAS_DISPERSED;
	
	@ClientString(id = 194, message = "You have failed to disperse the clan.")
	public static SystemMessageId YOU_HAVE_FAILED_TO_DISPERSE_THE_CLAN;
	
	@ClientString(id = 195, message = "Entered the clan.")
	public static SystemMessageId ENTERED_THE_CLAN;
	
	@ClientString(id = 196, message = "$s1 declined your clan invitation.")
	public static SystemMessageId S1_DECLINED_YOUR_CLAN_INVITATION;
	
	@ClientString(id = 197, message = "You have withdrawn from the clan.")
	public static SystemMessageId YOU_HAVE_WITHDRAWN_FROM_THE_CLAN;
	
	@ClientString(id = 198, message = "You have failed to withdraw from the $s1 clan.")
	public static SystemMessageId YOU_HAVE_FAILED_TO_WITHDRAW_FROM_THE_S1_CLAN;
	
	@ClientString(id = 199, message = "You have recently been dismissed from a clan.  You are not allowed to join another clan for 24 hours.")
	public static SystemMessageId YOU_HAVE_RECENTLY_BEEN_DISMISSED_FROM_A_CLAN_YOU_ARE_NOT_ALLOWED_TO_JOIN_ANOTHER_CLAN_FOR_24_HOURS;
	
	@ClientString(id = 200, message = "You have withdrawn from the party.")
	public static SystemMessageId YOU_HAVE_WITHDRAWN_FROM_THE_PARTY;
	
	@ClientString(id = 201, message = "$c1 was expelled from the party.")
	public static SystemMessageId C1_WAS_EXPELLED_FROM_THE_PARTY;
	
	@ClientString(id = 202, message = "You have been expelled from the party.")
	public static SystemMessageId YOU_HAVE_BEEN_EXPELLED_FROM_THE_PARTY;
	
	@ClientString(id = 203, message = "The party has dispersed.")
	public static SystemMessageId THE_PARTY_HAS_DISPERSED;
	
	@ClientString(id = 204, message = "Incorrect name. Please try again.")
	public static SystemMessageId INCORRECT_NAME_PLEASE_TRY_AGAIN;
	
	@ClientString(id = 205, message = "Incorrect character name.  Please try again.")
	public static SystemMessageId INCORRECT_CHARACTER_NAME_PLEASE_TRY_AGAIN;
	
	@ClientString(id = 206, message = "Please enter the name of the clan you wish to declare war on.")
	public static SystemMessageId PLEASE_ENTER_THE_NAME_OF_THE_CLAN_YOU_WISH_TO_DECLARE_WAR_ON;
	
	@ClientString(id = 207, message = "$s2 of the clan $s1 requests a declaration of war. Do you accept?")
	public static SystemMessageId S2_OF_THE_CLAN_S1_REQUESTS_A_DECLARATION_OF_WAR_DO_YOU_ACCEPT;
	
	@ClientString(id = 208, message = "Please include file type when entering file path.")
	public static SystemMessageId PLEASE_INCLUDE_FILE_TYPE_WHEN_ENTERING_FILE_PATH;
	
	@ClientString(id = 209, message = "The size of the image file is inappropriate.  Please adjust to 16x12 pixels.")
	public static SystemMessageId THE_SIZE_OF_THE_IMAGE_FILE_IS_INAPPROPRIATE_PLEASE_ADJUST_TO_16X12_PIXELS;
	
	@ClientString(id = 210, message = "Cannot find file. Please enter precise path.")
	public static SystemMessageId CANNOT_FIND_FILE_PLEASE_ENTER_PRECISE_PATH;
	
	@ClientString(id = 211, message = "You can only register a 16x12 pixel 256 color BMP files.")
	public static SystemMessageId YOU_CAN_ONLY_REGISTER_A_16X12_PIXEL_256_COLOR_BMP_FILES;
	
	@ClientString(id = 212, message = "You are not a clan member and cannot perform this action.")
	public static SystemMessageId YOU_ARE_NOT_A_CLAN_MEMBER_AND_CANNOT_PERFORM_THIS_ACTION;
	
	@ClientString(id = 213, message = "Not working. Please try again later.")
	public static SystemMessageId NOT_WORKING_PLEASE_TRY_AGAIN_LATER;
	
	@ClientString(id = 214, message = "Your title has been changed.")
	public static SystemMessageId YOUR_TITLE_HAS_BEEN_CHANGED;
	
	@ClientString(id = 215, message = "A clan war with Clan $s1 has started. The clan that cancels the war first will lose 5,000 Clan Reputation. Any clan that cancels the war will be unable to declare a war for 1 week. If your clan member gets killed by the other clan, XP decreases by 1/4 of the amount that decreases in the hunting ground.")
	public static SystemMessageId A_CLAN_WAR_WITH_CLAN_S1_HAS_STARTED_THE_CLAN_THAT_CANCELS_THE_WAR_FIRST_WILL_LOSE_5_000_CLAN_REPUTATION_ANY_CLAN_THAT_CANCELS_THE_WAR_WILL_BE_UNABLE_TO_DECLARE_A_WAR_FOR_1_WEEK_IF_YOUR_CLAN_MEMBER_GETS_KILLED_BY_THE_OTHER_CLAN_XP_DECREASES_BY_1_4_OF_THE_AMOUNT_THAT_DECREASES_IN_THE_HUNTING_GROUND;
	
	@ClientString(id = 216, message = "War with the $s1 clan has ended.")
	public static SystemMessageId WAR_WITH_THE_S1_CLAN_HAS_ENDED;
	
	@ClientString(id = 217, message = "You have won the war over the $s1 clan!")
	public static SystemMessageId YOU_HAVE_WON_THE_WAR_OVER_THE_S1_CLAN;
	
	@ClientString(id = 218, message = "You have surrendered to the $s1 clan.")
	public static SystemMessageId YOU_HAVE_SURRENDERED_TO_THE_S1_CLAN;
	
	@ClientString(id = 219, message = "Your clan leader has died. You have been defeated by the $s1 Clan.")
	public static SystemMessageId YOUR_CLAN_LEADER_HAS_DIED_YOU_HAVE_BEEN_DEFEATED_BY_THE_S1_CLAN;
	
	@ClientString(id = 220, message = "You have $s1 minute(s) left until the clan war ends.")
	public static SystemMessageId YOU_HAVE_S1_MINUTE_S_LEFT_UNTIL_THE_CLAN_WAR_ENDS;
	
	@ClientString(id = 221, message = "The time limit for the clan war is up. War with the $s1 clan is over.")
	public static SystemMessageId THE_TIME_LIMIT_FOR_THE_CLAN_WAR_IS_UP_WAR_WITH_THE_S1_CLAN_IS_OVER;
	
	@ClientString(id = 222, message = "$s1 has joined the clan.")
	public static SystemMessageId S1_HAS_JOINED_THE_CLAN;
	
	@ClientString(id = 223, message = "$s1 has withdrawn from the clan.")
	public static SystemMessageId S1_HAS_WITHDRAWN_FROM_THE_CLAN;
	
	@ClientString(id = 224, message = "$s1 did not respond: Invitation to the clan has been cancelled.")
	public static SystemMessageId S1_DID_NOT_RESPOND_INVITATION_TO_THE_CLAN_HAS_BEEN_CANCELLED;
	
	@ClientString(id = 225, message = "You didn't respond to $s1's invitation: joining has been cancelled.")
	public static SystemMessageId YOU_DIDN_T_RESPOND_TO_S1_S_INVITATION_JOINING_HAS_BEEN_CANCELLED;
	
	@ClientString(id = 226, message = "The $s1 clan did not respond: war proclamation has been refused.")
	public static SystemMessageId THE_S1_CLAN_DID_NOT_RESPOND_WAR_PROCLAMATION_HAS_BEEN_REFUSED;
	
	@ClientString(id = 227, message = "Clan war has been refused because you did not respond to $s1 clan's war proclamation.")
	public static SystemMessageId CLAN_WAR_HAS_BEEN_REFUSED_BECAUSE_YOU_DID_NOT_RESPOND_TO_S1_CLAN_S_WAR_PROCLAMATION;
	
	@ClientString(id = 228, message = "Request to end war has been denied.")
	public static SystemMessageId REQUEST_TO_END_WAR_HAS_BEEN_DENIED;
	
	@ClientString(id = 229, message = "You do not meet the criteria in order to create a clan.")
	public static SystemMessageId YOU_DO_NOT_MEET_THE_CRITERIA_IN_ORDER_TO_CREATE_A_CLAN;
	
	@ClientString(id = 230, message = "You must wait 10 days before creating a new clan.")
	public static SystemMessageId YOU_MUST_WAIT_10_DAYS_BEFORE_CREATING_A_NEW_CLAN;
	
	@ClientString(id = 231, message = "After a clan member is dismissed from a clan, the clan must wait at least a day before accepting a new member.")
	public static SystemMessageId AFTER_A_CLAN_MEMBER_IS_DISMISSED_FROM_A_CLAN_THE_CLAN_MUST_WAIT_AT_LEAST_A_DAY_BEFORE_ACCEPTING_A_NEW_MEMBER;
	
	@ClientString(id = 232, message = "After leaving or having been dismissed from a clan, you must wait at least a day before joining another clan.")
	public static SystemMessageId AFTER_LEAVING_OR_HAVING_BEEN_DISMISSED_FROM_A_CLAN_YOU_MUST_WAIT_AT_LEAST_A_DAY_BEFORE_JOINING_ANOTHER_CLAN;
	
	@ClientString(id = 233, message = "The Academy/Royal Guard/Order of Knights is full and cannot accept new members at this time.")
	public static SystemMessageId THE_ACADEMY_ROYAL_GUARD_ORDER_OF_KNIGHTS_IS_FULL_AND_CANNOT_ACCEPT_NEW_MEMBERS_AT_THIS_TIME;
	
	@ClientString(id = 234, message = "The target must be a clan member.")
	public static SystemMessageId THE_TARGET_MUST_BE_A_CLAN_MEMBER;
	
	@ClientString(id = 235, message = "You are not authorized to bestow these rights.")
	public static SystemMessageId YOU_ARE_NOT_AUTHORIZED_TO_BESTOW_THESE_RIGHTS;
	
	@ClientString(id = 236, message = "Only the clan leader is enabled.")
	public static SystemMessageId ONLY_THE_CLAN_LEADER_IS_ENABLED;
	
	@ClientString(id = 237, message = "The clan leader could not be found.")
	public static SystemMessageId THE_CLAN_LEADER_COULD_NOT_BE_FOUND;
	
	@ClientString(id = 238, message = "Not joined in any clan.")
	public static SystemMessageId NOT_JOINED_IN_ANY_CLAN;
	
	@ClientString(id = 239, message = "A clan leader cannot withdraw from their own clan.")
	public static SystemMessageId A_CLAN_LEADER_CANNOT_WITHDRAW_FROM_THEIR_OWN_CLAN;
	
	@ClientString(id = 240, message = "You are currently involved in clan war.")
	public static SystemMessageId YOU_ARE_CURRENTLY_INVOLVED_IN_CLAN_WAR;
	
	@ClientString(id = 241, message = "Leader of the $s1 Clan is not logged in.")
	public static SystemMessageId LEADER_OF_THE_S1_CLAN_IS_NOT_LOGGED_IN;
	
	@ClientString(id = 242, message = "Select target.")
	public static SystemMessageId SELECT_TARGET;
	
	@ClientString(id = 243, message = "You cannot declare war on an allied clan.")
	public static SystemMessageId YOU_CANNOT_DECLARE_WAR_ON_AN_ALLIED_CLAN;
	
	@ClientString(id = 244, message = "You are not allowed to issue this challenge.")
	public static SystemMessageId YOU_ARE_NOT_ALLOWED_TO_ISSUE_THIS_CHALLENGE;
	
	@ClientString(id = 245, message = "It has not been 5 days since you refused a clan war. Do you wish to continue?")
	public static SystemMessageId IT_HAS_NOT_BEEN_5_DAYS_SINCE_YOU_REFUSED_A_CLAN_WAR_DO_YOU_WISH_TO_CONTINUE;
	
	@ClientString(id = 246, message = "That clan is currently at war.")
	public static SystemMessageId THAT_CLAN_IS_CURRENTLY_AT_WAR;
	
	@ClientString(id = 247, message = "You have already been at war with the $s1 clan: 5 days must pass before you can challenge this clan again.")
	public static SystemMessageId YOU_HAVE_ALREADY_BEEN_AT_WAR_WITH_THE_S1_CLAN_5_DAYS_MUST_PASS_BEFORE_YOU_CAN_CHALLENGE_THIS_CLAN_AGAIN;
	
	@ClientString(id = 248, message = "You cannot proclaim war: the $s1 clan does not have enough members.")
	public static SystemMessageId YOU_CANNOT_PROCLAIM_WAR_THE_S1_CLAN_DOES_NOT_HAVE_ENOUGH_MEMBERS;
	
	@ClientString(id = 249, message = "Do you wish to surrender to clan $s1?")
	public static SystemMessageId DO_YOU_WISH_TO_SURRENDER_TO_CLAN_S1;
	
	@ClientString(id = 250, message = "You have personally surrendered to the $s1 clan.  You are no longer participating in this clan war.")
	public static SystemMessageId YOU_HAVE_PERSONALLY_SURRENDERED_TO_THE_S1_CLAN_YOU_ARE_NO_LONGER_PARTICIPATING_IN_THIS_CLAN_WAR;
	
	@ClientString(id = 251, message = "You cannot proclaim war: you are at war with another clan.")
	public static SystemMessageId YOU_CANNOT_PROCLAIM_WAR_YOU_ARE_AT_WAR_WITH_ANOTHER_CLAN;
	
	@ClientString(id = 252, message = "Enter the name of the clan you wish to surrender to.")
	public static SystemMessageId ENTER_THE_NAME_OF_THE_CLAN_YOU_WISH_TO_SURRENDER_TO;
	
	@ClientString(id = 253, message = "Enter the name of the clan you wish to end the war with.")
	public static SystemMessageId ENTER_THE_NAME_OF_THE_CLAN_YOU_WISH_TO_END_THE_WAR_WITH;
	
	@ClientString(id = 254, message = "A clan leader cannot personally surrender.")
	public static SystemMessageId A_CLAN_LEADER_CANNOT_PERSONALLY_SURRENDER;
	
	@ClientString(id = 255, message = "The $s1 Clan has requested to end war. Do you agree?")
	public static SystemMessageId THE_S1_CLAN_HAS_REQUESTED_TO_END_WAR_DO_YOU_AGREE;
	
	@ClientString(id = 256, message = "Enter Title")
	public static SystemMessageId ENTER_TITLE;
	
	@ClientString(id = 257, message = "Do you offer the $s1 clan a proposal to end the war?")
	public static SystemMessageId DO_YOU_OFFER_THE_S1_CLAN_A_PROPOSAL_TO_END_THE_WAR;
	
	@ClientString(id = 258, message = "You are not involved in a clan war.")
	public static SystemMessageId YOU_ARE_NOT_INVOLVED_IN_A_CLAN_WAR;
	
	@ClientString(id = 259, message = "Select clan members from list.")
	public static SystemMessageId SELECT_CLAN_MEMBERS_FROM_LIST;
	
	@ClientString(id = 260, message = "Your clan lost 5,000 Reputation points for withdrawing from the Clan War.")
	public static SystemMessageId YOUR_CLAN_LOST_5_000_REPUTATION_POINTS_FOR_WITHDRAWING_FROM_THE_CLAN_WAR;
	
	@ClientString(id = 261, message = "Clan name is invalid.")
	public static SystemMessageId CLAN_NAME_IS_INVALID;
	
	@ClientString(id = 262, message = "Clan name's length is incorrect.")
	public static SystemMessageId CLAN_NAME_S_LENGTH_IS_INCORRECT;
	
	@ClientString(id = 263, message = "You have already requested the dissolution of your clan.")
	public static SystemMessageId YOU_HAVE_ALREADY_REQUESTED_THE_DISSOLUTION_OF_YOUR_CLAN;
	
	@ClientString(id = 264, message = "You cannot dissolve a clan while engaged in a war.")
	public static SystemMessageId YOU_CANNOT_DISSOLVE_A_CLAN_WHILE_ENGAGED_IN_A_WAR;
	
	@ClientString(id = 265, message = "You cannot dissolve a clan during a siege or while protecting a castle.")
	public static SystemMessageId YOU_CANNOT_DISSOLVE_A_CLAN_DURING_A_SIEGE_OR_WHILE_PROTECTING_A_CASTLE;
	
	@ClientString(id = 266, message = "You cannot dissolve a clan while owning a clan hall or castle.")
	public static SystemMessageId YOU_CANNOT_DISSOLVE_A_CLAN_WHILE_OWNING_A_CLAN_HALL_OR_CASTLE;
	
	@ClientString(id = 267, message = "There are no requests to disperse.")
	public static SystemMessageId THERE_ARE_NO_REQUESTS_TO_DISPERSE;
	
	@ClientString(id = 268, message = "That player already belongs to another clan.")
	public static SystemMessageId THAT_PLAYER_ALREADY_BELONGS_TO_ANOTHER_CLAN;
	
	@ClientString(id = 269, message = "You cannot dismiss yourself.")
	public static SystemMessageId YOU_CANNOT_DISMISS_YOURSELF;
	
	@ClientString(id = 270, message = "You have already surrendered.")
	public static SystemMessageId YOU_HAVE_ALREADY_SURRENDERED;
	
	@ClientString(id = 271, message = "A player can only be granted a title if the clan is level 3 or above.")
	public static SystemMessageId A_PLAYER_CAN_ONLY_BE_GRANTED_A_TITLE_IF_THE_CLAN_IS_LEVEL_3_OR_ABOVE;
	
	@ClientString(id = 272, message = "A clan crest can only be registered when the clan's skill level is 3 or above.")
	public static SystemMessageId A_CLAN_CREST_CAN_ONLY_BE_REGISTERED_WHEN_THE_CLAN_S_SKILL_LEVEL_IS_3_OR_ABOVE;
	
	@ClientString(id = 273, message = "A clan war can only be declared when a clan's level is 3 or above.")
	public static SystemMessageId A_CLAN_WAR_CAN_ONLY_BE_DECLARED_WHEN_A_CLAN_S_LEVEL_IS_3_OR_ABOVE;
	
	@ClientString(id = 274, message = "Your clan's level has increased.")
	public static SystemMessageId YOUR_CLAN_S_LEVEL_HAS_INCREASED;
	
	@ClientString(id = 275, message = "The clan has failed to increase its level.")
	public static SystemMessageId THE_CLAN_HAS_FAILED_TO_INCREASE_ITS_LEVEL;
	
	@ClientString(id = 276, message = "You do not have the necessary materials or prerequisites to learn this skill.")
	public static SystemMessageId YOU_DO_NOT_HAVE_THE_NECESSARY_MATERIALS_OR_PREREQUISITES_TO_LEARN_THIS_SKILL;
	
	@ClientString(id = 277, message = "You have earned $s1.")
	public static SystemMessageId YOU_HAVE_EARNED_S12;
	
	@ClientString(id = 278, message = "You do not have enough SP to learn this skill.")
	public static SystemMessageId YOU_DO_NOT_HAVE_ENOUGH_SP_TO_LEARN_THIS_SKILL;
	
	@ClientString(id = 279, message = "You do not have enough Adena.")
	public static SystemMessageId YOU_DO_NOT_HAVE_ENOUGH_ADENA;
	
	@ClientString(id = 280, message = "You do not have any items to sell.")
	public static SystemMessageId YOU_DO_NOT_HAVE_ANY_ITEMS_TO_SELL;
	
	@ClientString(id = 281, message = "You do not have enough Adena to pay the fee.")
	public static SystemMessageId YOU_DO_NOT_HAVE_ENOUGH_ADENA_TO_PAY_THE_FEE;
	
	@ClientString(id = 282, message = "You have not deposited any items in your warehouse.")
	public static SystemMessageId YOU_HAVE_NOT_DEPOSITED_ANY_ITEMS_IN_YOUR_WAREHOUSE;
	
	@ClientString(id = 283, message = "You have entered a combat zone.")
	public static SystemMessageId YOU_HAVE_ENTERED_A_COMBAT_ZONE;
	
	@ClientString(id = 284, message = "You have left a combat zone.")
	public static SystemMessageId YOU_HAVE_LEFT_A_COMBAT_ZONE;
	
	@ClientString(id = 285, message = "Clan $s1 has succeeded in $s2!")
	public static SystemMessageId CLAN_S1_HAS_SUCCEEDED_IN_S2;
	
	@ClientString(id = 286, message = "Your base is being attacked.")
	public static SystemMessageId YOUR_BASE_IS_BEING_ATTACKED;
	
	@ClientString(id = 287, message = "The opposing clan has started $s1.")
	public static SystemMessageId THE_OPPOSING_CLAN_HAS_STARTED_S1;
	
	@ClientString(id = 288, message = "The castle gate has been destroyed.")
	public static SystemMessageId THE_CASTLE_GATE_HAS_BEEN_DESTROYED;
	
	@ClientString(id = 289, message = "An outpost or headquarters cannot be built because one already exists.")
	public static SystemMessageId AN_OUTPOST_OR_HEADQUARTERS_CANNOT_BE_BUILT_BECAUSE_ONE_ALREADY_EXISTS;
	
	@ClientString(id = 290, message = "You cannot set up a base here.")
	public static SystemMessageId YOU_CANNOT_SET_UP_A_BASE_HERE;
	
	@ClientString(id = 291, message = "Clan $s1 is victorious over $s2's castle siege!")
	public static SystemMessageId CLAN_S1_IS_VICTORIOUS_OVER_S2_S_CASTLE_SIEGE;
	
	@ClientString(id = 292, message = "$s1 has announced the next castle siege time.")
	public static SystemMessageId S1_HAS_ANNOUNCED_THE_NEXT_CASTLE_SIEGE_TIME;
	
	@ClientString(id = 293, message = "The registration term for $s1 has ended.")
	public static SystemMessageId THE_REGISTRATION_TERM_FOR_S1_HAS_ENDED;
	
	@ClientString(id = 294, message = "You cannot summon the encampment because you are not a member of the siege clan involved in the castle / fortress / clan hall siege.")
	public static SystemMessageId YOU_CANNOT_SUMMON_THE_ENCAMPMENT_BECAUSE_YOU_ARE_NOT_A_MEMBER_OF_THE_SIEGE_CLAN_INVOLVED_IN_THE_CASTLE_FORTRESS_CLAN_HALL_SIEGE;
	
	@ClientString(id = 295, message = "$s1's siege was canceled because there were no clans that participated.")
	public static SystemMessageId S1_S_SIEGE_WAS_CANCELED_BECAUSE_THERE_WERE_NO_CLANS_THAT_PARTICIPATED;
	
	@ClientString(id = 296, message = "You received $s1 falling damage.")
	public static SystemMessageId YOU_RECEIVED_S1_FALLING_DAMAGE;
	
	@ClientString(id = 297, message = "You have taken $s1 damage because you were unable to breathe.")
	public static SystemMessageId YOU_HAVE_TAKEN_S1_DAMAGE_BECAUSE_YOU_WERE_UNABLE_TO_BREATHE;
	
	@ClientString(id = 298, message = "You have dropped $s1.")
	public static SystemMessageId YOU_HAVE_DROPPED_S1;
	
	@ClientString(id = 299, message = "$c1 has obtained $s3 $s2.")
	public static SystemMessageId C1_HAS_OBTAINED_S3_S2;
	
	@ClientString(id = 300, message = "$c1 has obtained $s2.")
	public static SystemMessageId C1_HAS_OBTAINED_S2;
	
	@ClientString(id = 301, message = "$s2 $s1(s) disappeared.")
	public static SystemMessageId S2_S1_S_DISAPPEARED;
	
	@ClientString(id = 302, message = "$s1 disappeared.")
	public static SystemMessageId S1_DISAPPEARED;
	
	@ClientString(id = 303, message = "Select item to enchant.")
	public static SystemMessageId SELECT_ITEM_TO_ENCHANT;
	
	@ClientString(id = 304, message = "Clan member $s1 has logged into game.")
	public static SystemMessageId CLAN_MEMBER_S1_HAS_LOGGED_INTO_GAME;
	
	@ClientString(id = 305, message = "The player declined to join your party.")
	public static SystemMessageId THE_PLAYER_DECLINED_TO_JOIN_YOUR_PARTY;
	
	@ClientString(id = 306, message = "You have failed to delete the character.")
	public static SystemMessageId YOU_HAVE_FAILED_TO_DELETE_THE_CHARACTER;
	
	@ClientString(id = 307, message = "You cannot trade with a warehouse keeper.")
	public static SystemMessageId YOU_CANNOT_TRADE_WITH_A_WAREHOUSE_KEEPER;
	
	@ClientString(id = 308, message = "The player declined your clan invitation.")
	public static SystemMessageId THE_PLAYER_DECLINED_YOUR_CLAN_INVITATION;
	
	@ClientString(id = 309, message = "You have succeeded in expelling the clan member.")
	public static SystemMessageId YOU_HAVE_SUCCEEDED_IN_EXPELLING_THE_CLAN_MEMBER;
	
	@ClientString(id = 310, message = "You have failed to expel the clan member.")
	public static SystemMessageId YOU_HAVE_FAILED_TO_EXPEL_THE_CLAN_MEMBER;
	
	@ClientString(id = 311, message = "The clan war declaration has been accepted.")
	public static SystemMessageId THE_CLAN_WAR_DECLARATION_HAS_BEEN_ACCEPTED;
	
	@ClientString(id = 312, message = "The clan war declaration has been refused.")
	public static SystemMessageId THE_CLAN_WAR_DECLARATION_HAS_BEEN_REFUSED;
	
	@ClientString(id = 313, message = "The cease war request has been accepted.")
	public static SystemMessageId THE_CEASE_WAR_REQUEST_HAS_BEEN_ACCEPTED;
	
	@ClientString(id = 314, message = "You have failed to surrender.")
	public static SystemMessageId YOU_HAVE_FAILED_TO_SURRENDER;
	
	@ClientString(id = 315, message = "You have failed to personally surrender.")
	public static SystemMessageId YOU_HAVE_FAILED_TO_PERSONALLY_SURRENDER;
	
	@ClientString(id = 316, message = "You have failed to withdraw from the party.")
	public static SystemMessageId YOU_HAVE_FAILED_TO_WITHDRAW_FROM_THE_PARTY;
	
	@ClientString(id = 317, message = "You have failed to expel the party member.")
	public static SystemMessageId YOU_HAVE_FAILED_TO_EXPEL_THE_PARTY_MEMBER;
	
	@ClientString(id = 318, message = "You have failed to disperse the party.")
	public static SystemMessageId YOU_HAVE_FAILED_TO_DISPERSE_THE_PARTY;
	
	@ClientString(id = 319, message = "This door cannot be unlocked.")
	public static SystemMessageId THIS_DOOR_CANNOT_BE_UNLOCKED;
	
	@ClientString(id = 320, message = "You have failed to unlock the door.")
	public static SystemMessageId YOU_HAVE_FAILED_TO_UNLOCK_THE_DOOR;
	
	@ClientString(id = 321, message = "It is not locked.")
	public static SystemMessageId IT_IS_NOT_LOCKED;
	
	@ClientString(id = 322, message = "Please decide on the sales price.")
	public static SystemMessageId PLEASE_DECIDE_ON_THE_SALES_PRICE;
	
	@ClientString(id = 323, message = "Your force has increased to level $s1.")
	public static SystemMessageId YOUR_FORCE_HAS_INCREASED_TO_LEVEL_S1;
	
	@ClientString(id = 324, message = "Your force has reached maximum capacity.")
	public static SystemMessageId YOUR_FORCE_HAS_REACHED_MAXIMUM_CAPACITY;
	
	@ClientString(id = 325, message = "The corpse has already disappeared.")
	public static SystemMessageId THE_CORPSE_HAS_ALREADY_DISAPPEARED;
	
	@ClientString(id = 326, message = "Select target from list.")
	public static SystemMessageId SELECT_TARGET_FROM_LIST;
	
	@ClientString(id = 327, message = "You cannot exceed 80 characters.")
	public static SystemMessageId YOU_CANNOT_EXCEED_80_CHARACTERS;
	
	@ClientString(id = 328, message = "Please input title using less than 128 characters.")
	public static SystemMessageId PLEASE_INPUT_TITLE_USING_LESS_THAN_128_CHARACTERS;
	
	@ClientString(id = 329, message = "Please input contents using less than 3000 characters.")
	public static SystemMessageId PLEASE_INPUT_CONTENTS_USING_LESS_THAN_3000_CHARACTERS;
	
	@ClientString(id = 330, message = "A one-line response may not exceed 128 characters.")
	public static SystemMessageId A_ONE_LINE_RESPONSE_MAY_NOT_EXCEED_128_CHARACTERS;
	
	@ClientString(id = 331, message = "You have acquired $s1 SP.")
	public static SystemMessageId YOU_HAVE_ACQUIRED_S1_SP;
	
	@ClientString(id = 332, message = "Do you want to be restored?")
	public static SystemMessageId DO_YOU_WANT_TO_BE_RESTORED;
	
	@ClientString(id = 333, message = "You have received $s1 damage by Core's barrier.")
	public static SystemMessageId YOU_HAVE_RECEIVED_S1_DAMAGE_BY_CORE_S_BARRIER;
	
	@ClientString(id = 334, message = "Please enter your private store display message.")
	public static SystemMessageId PLEASE_ENTER_YOUR_PRIVATE_STORE_DISPLAY_MESSAGE;
	
	@ClientString(id = 335, message = "$s1 has been aborted.")
	public static SystemMessageId S1_HAS_BEEN_ABORTED;
	
	@ClientString(id = 336, message = "You are attempting to crystallize $s1. Do you wish to continue?")
	public static SystemMessageId YOU_ARE_ATTEMPTING_TO_CRYSTALLIZE_S1_DO_YOU_WISH_TO_CONTINUE;
	
	@ClientString(id = 337, message = "The soulshot you are attempting to use does not match the grade of your equipped weapon.")
	public static SystemMessageId THE_SOULSHOT_YOU_ARE_ATTEMPTING_TO_USE_DOES_NOT_MATCH_THE_GRADE_OF_YOUR_EQUIPPED_WEAPON;
	
	@ClientString(id = 338, message = "You do not have enough soulshots for that.")
	public static SystemMessageId YOU_DO_NOT_HAVE_ENOUGH_SOULSHOTS_FOR_THAT;
	
	@ClientString(id = 339, message = "Cannot use soulshots.")
	public static SystemMessageId CANNOT_USE_SOULSHOTS;
	
	@ClientString(id = 340, message = "Your private store is now open for business.")
	public static SystemMessageId YOUR_PRIVATE_STORE_IS_NOW_OPEN_FOR_BUSINESS;
	
	@ClientString(id = 341, message = "You do not have enough materials to perform that action.")
	public static SystemMessageId YOU_DO_NOT_HAVE_ENOUGH_MATERIALS_TO_PERFORM_THAT_ACTION;
	
	@ClientString(id = 342, message = "Your soulshots are enabled.")
	public static SystemMessageId YOUR_SOULSHOTS_ARE_ENABLED;
	
	@ClientString(id = 343, message = "Sweeper failed, target not spoiled.")
	public static SystemMessageId SWEEPER_FAILED_TARGET_NOT_SPOILED;
	
	@ClientString(id = 344, message = "Your soulshots are disabled.")
	public static SystemMessageId YOUR_SOULSHOTS_ARE_DISABLED;
	
	@ClientString(id = 345, message = "Chat enabled.")
	public static SystemMessageId CHAT_ENABLED;
	
	@ClientString(id = 346, message = "Chat disabled.")
	public static SystemMessageId CHAT_DISABLED;
	
	@ClientString(id = 347, message = "Incorrect item count.")
	public static SystemMessageId INCORRECT_ITEM_COUNT;
	
	@ClientString(id = 348, message = "Incorrect item price.")
	public static SystemMessageId INCORRECT_ITEM_PRICE;
	
	@ClientString(id = 349, message = "Private store already closed.")
	public static SystemMessageId PRIVATE_STORE_ALREADY_CLOSED;
	
	@ClientString(id = 350, message = "Item out of stock.")
	public static SystemMessageId ITEM_OUT_OF_STOCK;
	
	@ClientString(id = 351, message = "Incorrect item count.")
	public static SystemMessageId INCORRECT_ITEM_COUNT2;
	
	@ClientString(id = 352, message = "Incorrect item.")
	public static SystemMessageId INCORRECT_ITEM;
	
	@ClientString(id = 353, message = "Cannot purchase.")
	public static SystemMessageId CANNOT_PURCHASE;
	
	@ClientString(id = 354, message = "Cancel enchant.")
	public static SystemMessageId CANCEL_ENCHANT;
	
	@ClientString(id = 355, message = "Inappropriate enchant conditions.")
	public static SystemMessageId INAPPROPRIATE_ENCHANT_CONDITIONS;
	
	@ClientString(id = 356, message = "Reject resurrection.")
	public static SystemMessageId REJECT_RESURRECTION;
	
	@ClientString(id = 357, message = "It has already been spoiled.")
	public static SystemMessageId IT_HAS_ALREADY_BEEN_SPOILED;
	
	@ClientString(id = 358, message = "$s1 hour(s) until castle siege conclusion.")
	public static SystemMessageId S1_HOUR_S_UNTIL_CASTLE_SIEGE_CONCLUSION;
	
	@ClientString(id = 359, message = "$s1 minute(s) until castle siege conclusion.")
	public static SystemMessageId S1_MINUTE_S_UNTIL_CASTLE_SIEGE_CONCLUSION;
	
	@ClientString(id = 360, message = "This castle siege will end in $s1 second(s)!")
	public static SystemMessageId THIS_CASTLE_SIEGE_WILL_END_IN_S1_SECOND_S;
	
	@ClientString(id = 361, message = "Over-hit!")
	public static SystemMessageId OVER_HIT;
	
	@ClientString(id = 362, message = "You have acquired $s1 bonus XP from a successful over-hit.")
	public static SystemMessageId YOU_HAVE_ACQUIRED_S1_BONUS_XP_FROM_A_SUCCESSFUL_OVER_HIT;
	
	@ClientString(id = 363, message = "Chat available time: $s1 minute(s).")
	public static SystemMessageId CHAT_AVAILABLE_TIME_S1_MINUTE_S;
	
	@ClientString(id = 364, message = "Enter user's name to search.")
	public static SystemMessageId ENTER_USER_S_NAME_TO_SEARCH;
	
	@ClientString(id = 365, message = "Are you sure?")
	public static SystemMessageId ARE_YOU_SURE;
	
	@ClientString(id = 366, message = "Please select your hair color.")
	public static SystemMessageId PLEASE_SELECT_YOUR_HAIR_COLOR;
	
	@ClientString(id = 367, message = "You cannot remove that clan character at this time.")
	public static SystemMessageId YOU_CANNOT_REMOVE_THAT_CLAN_CHARACTER_AT_THIS_TIME;
	
	@ClientString(id = 368, message = "Equipped +$s1 $s2.")
	public static SystemMessageId EQUIPPED_S1_S2;
	
	@ClientString(id = 369, message = "You have obtained a +$s1 $s2.")
	public static SystemMessageId YOU_HAVE_OBTAINED_A_S1_S2;
	
	@ClientString(id = 370, message = "Failed to pick up $s1.")
	public static SystemMessageId FAILED_TO_PICK_UP_S1;
	
	@ClientString(id = 371, message = "Acquired +$s1 $s2.")
	public static SystemMessageId ACQUIRED_S1_S2;
	
	@ClientString(id = 372, message = "Failed to earn $s1.")
	public static SystemMessageId FAILED_TO_EARN_S1;
	
	@ClientString(id = 373, message = "You are trying to destroy +$s1 $s2.  Do you wish to continue?")
	public static SystemMessageId YOU_ARE_TRYING_TO_DESTROY_S1_S2_DO_YOU_WISH_TO_CONTINUE;
	
	@ClientString(id = 374, message = "You are attempting to crystallize +$s1 $s2.  Do you wish to continue?")
	public static SystemMessageId YOU_ARE_ATTEMPTING_TO_CRYSTALLIZE_S1_S2_DO_YOU_WISH_TO_CONTINUE;
	
	@ClientString(id = 375, message = "+$s1$s2 has been dropped.")
	public static SystemMessageId S1_S2_HAS_BEEN_DROPPED;
	
	@ClientString(id = 376, message = "$c1 has obtained +$s2 $s3.")
	public static SystemMessageId C1_HAS_OBTAINED_S2_S3;
	
	@ClientString(id = 377, message = "+$s1 $s2 disappeared.")
	public static SystemMessageId S1_S2_DISAPPEARED;
	
	@ClientString(id = 378, message = "$c1 purchased $s2.")
	public static SystemMessageId C1_PURCHASED_S2;
	
	@ClientString(id = 379, message = "$c1 purchased +$s2 $s3.")
	public static SystemMessageId C1_PURCHASED_S2_S3;
	
	@ClientString(id = 380, message = "$c1 purchased $s3 $s2(s).")
	public static SystemMessageId C1_PURCHASED_S3_S2_S;
	
	@ClientString(id = 381, message = "The game client encountered an error and was unable to connect to the petition server.")
	public static SystemMessageId THE_GAME_CLIENT_ENCOUNTERED_AN_ERROR_AND_WAS_UNABLE_TO_CONNECT_TO_THE_PETITION_SERVER;
	
	@ClientString(id = 382, message = "Currently there are no users that have checked out a GM ID.")
	public static SystemMessageId CURRENTLY_THERE_ARE_NO_USERS_THAT_HAVE_CHECKED_OUT_A_GM_ID;
	
	@ClientString(id = 383, message = "Request confirmed to end consultation at petition server.")
	public static SystemMessageId REQUEST_CONFIRMED_TO_END_CONSULTATION_AT_PETITION_SERVER;
	
	@ClientString(id = 384, message = "The client is not logged onto the game server.")
	public static SystemMessageId THE_CLIENT_IS_NOT_LOGGED_ONTO_THE_GAME_SERVER;
	
	@ClientString(id = 385, message = "Request confirmed to begin consultation at petition server.")
	public static SystemMessageId REQUEST_CONFIRMED_TO_BEGIN_CONSULTATION_AT_PETITION_SERVER;
	
	@ClientString(id = 386, message = "The body of your petition must be more than five characters in length.")
	public static SystemMessageId THE_BODY_OF_YOUR_PETITION_MUST_BE_MORE_THAN_FIVE_CHARACTERS_IN_LENGTH;
	
	@ClientString(id = 387, message = "This ends the GM petition consultation. nPlease give us feedback on the petition service.")
	public static SystemMessageId THIS_ENDS_THE_GM_PETITION_CONSULTATION_NPLEASE_GIVE_US_FEEDBACK_ON_THE_PETITION_SERVICE;
	
	@ClientString(id = 388, message = "Not under petition consultation.")
	public static SystemMessageId NOT_UNDER_PETITION_CONSULTATION;
	
	@ClientString(id = 389, message = "Your petition application has been accepted. nReceipt No. is $s1.")
	public static SystemMessageId YOUR_PETITION_APPLICATION_HAS_BEEN_ACCEPTED_NRECEIPT_NO_IS_S1;
	
	@ClientString(id = 390, message = "You may only submit one petition (active) at a time.")
	public static SystemMessageId YOU_MAY_ONLY_SUBMIT_ONE_PETITION_ACTIVE_AT_A_TIME;
	
	@ClientString(id = 391, message = "Receipt No. $s1: petition cancelled.")
	public static SystemMessageId RECEIPT_NO_S1_PETITION_CANCELLED;
	
	@ClientString(id = 392, message = "Petition underway.")
	public static SystemMessageId PETITION_UNDERWAY;
	
	@ClientString(id = 393, message = "Failed to cancel petition. Please try again later.")
	public static SystemMessageId FAILED_TO_CANCEL_PETITION_PLEASE_TRY_AGAIN_LATER;
	
	@ClientString(id = 394, message = "Starting petition consultation with $c1.")
	public static SystemMessageId STARTING_PETITION_CONSULTATION_WITH_C1;
	
	@ClientString(id = 395, message = "Petition consultation with $c1 has ended.")
	public static SystemMessageId PETITION_CONSULTATION_WITH_C1_HAS_ENDED;
	
	@ClientString(id = 396, message = "Please login after changing your temporary password.")
	public static SystemMessageId PLEASE_LOGIN_AFTER_CHANGING_YOUR_TEMPORARY_PASSWORD;
	
	@ClientString(id = 397, message = "This is not a paid account.")
	public static SystemMessageId THIS_IS_NOT_A_PAID_ACCOUNT;
	
	@ClientString(id = 398, message = "There is no time left on this account.")
	public static SystemMessageId THERE_IS_NO_TIME_LEFT_ON_THIS_ACCOUNT;
	
	@ClientString(id = 399, message = "System error.")
	public static SystemMessageId SYSTEM_ERROR;
	
	@ClientString(id = 400, message = "You are attempting to drop $s1. Do you wish to continue?")
	public static SystemMessageId YOU_ARE_ATTEMPTING_TO_DROP_S1_DO_YOU_WISH_TO_CONTINUE;
	
	@ClientString(id = 401, message = "Too many ongoing quests.")
	public static SystemMessageId TOO_MANY_ONGOING_QUESTS;
	
	@ClientString(id = 402, message = "You do not possess the correct ticket to board the boat.")
	public static SystemMessageId YOU_DO_NOT_POSSESS_THE_CORRECT_TICKET_TO_BOARD_THE_BOAT;
	
	@ClientString(id = 403, message = "You have exceeded your out-of-pocket Adena limit.")
	public static SystemMessageId YOU_HAVE_EXCEEDED_YOUR_OUT_OF_POCKET_ADENA_LIMIT;
	
	@ClientString(id = 404, message = "Your Create Item level is too low to register this recipe.")
	public static SystemMessageId YOUR_CREATE_ITEM_LEVEL_IS_TOO_LOW_TO_REGISTER_THIS_RECIPE;
	
	@ClientString(id = 405, message = "The total price of the product is too high.")
	public static SystemMessageId THE_TOTAL_PRICE_OF_THE_PRODUCT_IS_TOO_HIGH;
	
	@ClientString(id = 406, message = "Petition application accepted.")
	public static SystemMessageId PETITION_APPLICATION_ACCEPTED;
	
	@ClientString(id = 407, message = "Your petition is being processed.")
	public static SystemMessageId YOUR_PETITION_IS_BEING_PROCESSED;
	
	@ClientString(id = 408, message = "Set Period")
	public static SystemMessageId SET_PERIOD;
	
	@ClientString(id = 409, message = "Set Time-$s1: $s2: $s3")
	public static SystemMessageId SET_TIME_S1_S2_S3;
	
	@ClientString(id = 410, message = "Registration Period")
	public static SystemMessageId REGISTRATION_PERIOD;
	
	@ClientString(id = 411, message = "Registration Time-$s1: $s2: $s3")
	public static SystemMessageId REGISTRATION_TIME_S1_S2_S3;
	
	@ClientString(id = 412, message = "Battle begins in $s1: $s2: $s4")
	public static SystemMessageId BATTLE_BEGINS_IN_S1_S2_S4;
	
	@ClientString(id = 413, message = "Battle ends in $s1: $s2: $s5")
	public static SystemMessageId BATTLE_ENDS_IN_S1_S2_S5;
	
	@ClientString(id = 414, message = "Standby")
	public static SystemMessageId STANDBY;
	
	@ClientString(id = 415, message = "Siege is underway")
	public static SystemMessageId SIEGE_IS_UNDERWAY;
	
	@ClientString(id = 416, message = "This item cannot be exchanged.")
	public static SystemMessageId THIS_ITEM_CANNOT_BE_EXCHANGED;
	
	@ClientString(id = 417, message = "$s1 has been unequipped.")
	public static SystemMessageId S1_HAS_BEEN_UNEQUIPPED;
	
	@ClientString(id = 418, message = "There is a significant difference between the item's price and its standard price. Please check again.")
	public static SystemMessageId THERE_IS_A_SIGNIFICANT_DIFFERENCE_BETWEEN_THE_ITEM_S_PRICE_AND_ITS_STANDARD_PRICE_PLEASE_CHECK_AGAIN;
	
	@ClientString(id = 419, message = "$s1 minute(s) of usage time left.")
	public static SystemMessageId S1_MINUTE_S_OF_USAGE_TIME_LEFT;
	
	@ClientString(id = 420, message = "Time expired.")
	public static SystemMessageId TIME_EXPIRED;
	
	@ClientString(id = 421, message = "You are logged in to two places. If you suspect account theft, we recommend changing your password, scanning your computer for viruses and using an anti virus software.")
	public static SystemMessageId YOU_ARE_LOGGED_IN_TO_TWO_PLACES_IF_YOU_SUSPECT_ACCOUNT_THEFT_WE_RECOMMEND_CHANGING_YOUR_PASSWORD_SCANNING_YOUR_COMPUTER_FOR_VIRUSES_AND_USING_AN_ANTI_VIRUS_SOFTWARE;
	
	@ClientString(id = 422, message = "You have exceeded the weight limit.")
	public static SystemMessageId YOU_HAVE_EXCEEDED_THE_WEIGHT_LIMIT;
	
	@ClientString(id = 423, message = "You have cancelled the enchanting process.")
	public static SystemMessageId YOU_HAVE_CANCELLED_THE_ENCHANTING_PROCESS;
	
	@ClientString(id = 424, message = "Does not fit strengthening conditions of the scroll.")
	public static SystemMessageId DOES_NOT_FIT_STRENGTHENING_CONDITIONS_OF_THE_SCROLL;
	
	@ClientString(id = 425, message = "Your Create Item level is too low to register this recipe.")
	public static SystemMessageId YOUR_CREATE_ITEM_LEVEL_IS_TOO_LOW_TO_REGISTER_THIS_RECIPE2;
	
	@ClientString(id = 426, message = "Your account has been reported for not paying for your PC Caf￩ usage.")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_REPORTED_FOR_NOT_PAYING_FOR_YOUR_PC_CAF_USAGE;
	
	@ClientString(id = 427, message = "Please contact us.")
	public static SystemMessageId PLEASE_CONTACT_US;
	
	@ClientString(id = 428, message = "Your account has been restricted for violating the EULA, RoC and/or the User Agreement. When a user violates the terms of the User Agreement, the company can impose a restriction on their account. For more information, please visit the Support Center on the NCSOFT website (https://support.lineage2.com).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_FOR_VIOLATING_THE_EULA_ROC_AND_OR_THE_USER_AGREEMENT_WHEN_A_USER_VIOLATES_THE_TERMS_OF_THE_USER_AGREEMENT_THE_COMPANY_CAN_IMPOSE_A_RESTRICTION_ON_THEIR_ACCOUNT_FOR_MORE_INFORMATION_PLEASE_VISIT_THE_SUPPORT_CENTER_ON_THE_NCSOFT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM;
	
	@ClientString(id = 429, message = "Your account has been restricted in accordance with our terms of service due to your fraudulent report of account theft. Reporting account theft through an account theft report may cause harm to other players. For more information, please visit the Support Center on the NCSOFT website (https://support.lineage2.com).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_IN_ACCORDANCE_WITH_OUR_TERMS_OF_SERVICE_DUE_TO_YOUR_FRAUDULENT_REPORT_OF_ACCOUNT_THEFT_REPORTING_ACCOUNT_THEFT_THROUGH_AN_ACCOUNT_THEFT_REPORT_MAY_CAUSE_HARM_TO_OTHER_PLAYERS_FOR_MORE_INFORMATION_PLEASE_VISIT_THE_SUPPORT_CENTER_ON_THE_NCSOFT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM;
	
	@ClientString(id = 430, message = "Your account has been restricted in accordance with our terms of service as you failed to verify your identity within a given time after an account theft report. You may  undo the restriction by visiting the NCSOFT website (https://support.lineage2.com) and going through the identity verification process in the account theft report. For more information, please visit the Support Center on the NCSOFT website (https://support.lineage2.com).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_IN_ACCORDANCE_WITH_OUR_TERMS_OF_SERVICE_AS_YOU_FAILED_TO_VERIFY_YOUR_IDENTITY_WITHIN_A_GIVEN_TIME_AFTER_AN_ACCOUNT_THEFT_REPORT_YOU_MAY_UNDO_THE_RESTRICTION_BY_VISITING_THE_NCSOFT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM_AND_GOING_THROUGH_THE_IDENTITY_VERIFICATION_PROCESS_IN_THE_ACCOUNT_THEFT_REPORT_FOR_MORE_INFORMATION_PLEASE_VISIT_THE_SUPPORT_CENTER_ON_THE_NCSOFT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM;
	
	@ClientString(id = 431, message = "Your account has been restricted for violating the EULA, RoC and/or the User Agreement. When a user violates the terms of the User Agreement, the company can impose a restriction on their account. For more information, please visit the Support Center on the NCSOFT website (https://support.lineage2.com).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_FOR_VIOLATING_THE_EULA_ROC_AND_OR_THE_USER_AGREEMENT_WHEN_A_USER_VIOLATES_THE_TERMS_OF_THE_USER_AGREEMENT_THE_COMPANY_CAN_IMPOSE_A_RESTRICTION_ON_THEIR_ACCOUNT_FOR_MORE_INFORMATION_PLEASE_VISIT_THE_SUPPORT_CENTER_ON_THE_NCSOFT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM2;
	
	@ClientString(id = 432, message = "Your account has been restricted in accordance with our terms of service due to your selling, or attempting to sell, in-game goods or characters (account) for cash/real goods/goods from  another game. Your account is under suspension for 7 days since the date of exposure as decreed by the EULA, Section 3, Article 14. The account restriction will automatically be lifted after 7 days. For more information, please visit the Support Center on the NCSOFT website (https://support.lineage2.com).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_IN_ACCORDANCE_WITH_OUR_TERMS_OF_SERVICE_DUE_TO_YOUR_SELLING_OR_ATTEMPTING_TO_SELL_IN_GAME_GOODS_OR_CHARACTERS_ACCOUNT_FOR_CASH_REAL_GOODS_GOODS_FROM_ANOTHER_GAME_YOUR_ACCOUNT_IS_UNDER_SUSPENSION_FOR_7_DAYS_SINCE_THE_DATE_OF_EXPOSURE_AS_DECREED_BY_THE_EULA_SECTION_3_ARTICLE_14_THE_ACCOUNT_RESTRICTION_WILL_AUTOMATICALLY_BE_LIFTED_AFTER_7_DAYS_FOR_MORE_INFORMATION_PLEASE_VISIT_THE_SUPPORT_CENTER_ON_THE_NCSOFT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM;
	
	@ClientString(id = 433, message = "Your account has been restricted in accordance with our terms of service due to your selling, or attempting to sell, in-game goods or characters (account) for cash/real goods/goods from another game. Your account is restricted as decreed by the EULA, Section 3, Article 14. For more information, please visit the Support Center on the NCSOFT website (https://support.lineage2.com).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_IN_ACCORDANCE_WITH_OUR_TERMS_OF_SERVICE_DUE_TO_YOUR_SELLING_OR_ATTEMPTING_TO_SELL_IN_GAME_GOODS_OR_CHARACTERS_ACCOUNT_FOR_CASH_REAL_GOODS_GOODS_FROM_ANOTHER_GAME_YOUR_ACCOUNT_IS_RESTRICTED_AS_DECREED_BY_THE_EULA_SECTION_3_ARTICLE_14_FOR_MORE_INFORMATION_PLEASE_VISIT_THE_SUPPORT_CENTER_ON_THE_NCSOFT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM;
	
	@ClientString(id = 434, message = "Your account has been restricted in accordance with our terms of service due to misconduct or fraud. For more information, please visit the Support Center on the NCSOFT website (https://support.lineage2.com).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_IN_ACCORDANCE_WITH_OUR_TERMS_OF_SERVICE_DUE_TO_MISCONDUCT_OR_FRAUD_FOR_MORE_INFORMATION_PLEASE_VISIT_THE_SUPPORT_CENTER_ON_THE_NCSOFT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM;
	
	@ClientString(id = 435, message = "Your account has been restricted due to misconduct. For more information, please visit the Support Center on the NCSOFT website (https://support.lineage2.com).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_DUE_TO_MISCONDUCT_FOR_MORE_INFORMATION_PLEASE_VISIT_THE_SUPPORT_CENTER_ON_THE_NCSOFT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM;
	
	@ClientString(id = 436, message = "Your account has been restricted due to your abuse of system weaknesses or bugs. Abusing bugs can cause grievous system errors or destroy the game balance. For more information, please visit the Support Center on the NCSOFT website (https://support.lineage2.com).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_DUE_TO_YOUR_ABUSE_OF_SYSTEM_WEAKNESSES_OR_BUGS_ABUSING_BUGS_CAN_CAUSE_GRIEVOUS_SYSTEM_ERRORS_OR_DESTROY_THE_GAME_BALANCE_FOR_MORE_INFORMATION_PLEASE_VISIT_THE_SUPPORT_CENTER_ON_THE_NCSOFT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM;
	
	@ClientString(id = 437, message = "Your account has been restricted due to your use of illegal programs. For more information, please visit the Support Center on the NCSOFT website (https://support.lineage2.com).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_DUE_TO_YOUR_USE_OF_ILLEGAL_PROGRAMS_FOR_MORE_INFORMATION_PLEASE_VISIT_THE_SUPPORT_CENTER_ON_THE_NCSOFT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM;
	
	@ClientString(id = 438, message = "Your account has been restricted in accordance with our terms of service due to your impersonation of an official Game Master or staff member. For more information, please visit the Support Center on the NCSOFT website (https://support.lineage2.com).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_IN_ACCORDANCE_WITH_OUR_TERMS_OF_SERVICE_DUE_TO_YOUR_IMPERSONATION_OF_AN_OFFICIAL_GAME_MASTER_OR_STAFF_MEMBER_FOR_MORE_INFORMATION_PLEASE_VISIT_THE_SUPPORT_CENTER_ON_THE_NCSOFT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM;
	
	@ClientString(id = 439, message = "In accordance with the company's User Agreement and Operational Policy this account has been suspended at the account holder's request.  In order to restore the account, please  visit the Support Center on the NCSOFT website (https://support.lineage2.com).")
	public static SystemMessageId IN_ACCORDANCE_WITH_THE_COMPANY_S_USER_AGREEMENT_AND_OPERATIONAL_POLICY_THIS_ACCOUNT_HAS_BEEN_SUSPENDED_AT_THE_ACCOUNT_HOLDER_S_REQUEST_IN_ORDER_TO_RESTORE_THE_ACCOUNT_PLEASE_VISIT_THE_SUPPORT_CENTER_ON_THE_NCSOFT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM;
	
	@ClientString(id = 440, message = "Your account has been restricted at your parent/guardian's request as you are registered as a minor. For more information, please visit the Support Center on the NCSOFT website (https://support.lineage2.com).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_AT_YOUR_PARENT_GUARDIAN_S_REQUEST_AS_YOU_ARE_REGISTERED_AS_A_MINOR_FOR_MORE_INFORMATION_PLEASE_VISIT_THE_SUPPORT_CENTER_ON_THE_NCSOFT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM;
	
	@ClientString(id = 441, message = "Your account has been restricted in accordance with our terms of service due to your fraudulent use of another person's identity. For more information, please visit the Support Center on the NCSOFT website (https://support.lineage2.com).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_IN_ACCORDANCE_WITH_OUR_TERMS_OF_SERVICE_DUE_TO_YOUR_FRAUDULENT_USE_OF_ANOTHER_PERSON_S_IDENTITY_FOR_MORE_INFORMATION_PLEASE_VISIT_THE_SUPPORT_CENTER_ON_THE_NCSOFT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM;
	
	@ClientString(id = 442, message = "Your account has been restricted in accordance with our terms of service due to your fraudulent transactions under another person's identity. For more information, please visit the Support Center on the NCSOFT website (https://support.lineage2.com).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_IN_ACCORDANCE_WITH_OUR_TERMS_OF_SERVICE_DUE_TO_YOUR_FRAUDULENT_TRANSACTIONS_UNDER_ANOTHER_PERSON_S_IDENTITY_FOR_MORE_INFORMATION_PLEASE_VISIT_THE_SUPPORT_CENTER_ON_THE_NCSOFT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM;
	
	@ClientString(id = 443, message = "You cannot use the game services as your identity has not been verified. For more information, please visit the Support Center on the NCSOFT website (https://support.lineage2.com).Service Center(/font).")
	public static SystemMessageId YOU_CANNOT_USE_THE_GAME_SERVICES_AS_YOUR_IDENTITY_HAS_NOT_BEEN_VERIFIED_FOR_MORE_INFORMATION_PLEASE_VISIT_THE_SUPPORT_CENTER_ON_THE_NCSOFT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM_SERVICE_CENTER_FONT;
	
	@ClientString(id = 444, message = "This account and all related accounts have been restricted as you have requested a membership withdrawal.")
	public static SystemMessageId THIS_ACCOUNT_AND_ALL_RELATED_ACCOUNTS_HAVE_BEEN_RESTRICTED_AS_YOU_HAVE_REQUESTED_A_MEMBERSHIP_WITHDRAWAL;
	
	@ClientString(id = 445, message = "(Reference Number Regarding Membership Withdrawal Request: $s1)")
	public static SystemMessageId REFERENCE_NUMBER_REGARDING_MEMBERSHIP_WITHDRAWAL_REQUEST_S1;
	
	@ClientString(id = 446, message = "For more information, please visit the Support Center on the NCSOFT website (https://support.lineage2.com).")
	public static SystemMessageId FOR_MORE_INFORMATION_PLEASE_VISIT_THE_SUPPORT_CENTER_ON_THE_NCSOFT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM;
	
	@ClientString(id = 447, message = ".")
	public static SystemMessageId EMPTY;
	
	@ClientString(id = 448, message = "There is a system error. Please try logging in again later.")
	public static SystemMessageId THERE_IS_A_SYSTEM_ERROR_PLEASE_TRY_LOGGING_IN_AGAIN_LATER;
	
	@ClientString(id = 449, message = "The username and password do not match.")
	public static SystemMessageId THE_USERNAME_AND_PASSWORD_DO_NOT_MATCH;
	
	@ClientString(id = 450, message = "Please check your account information and try logging in again.")
	public static SystemMessageId PLEASE_CHECK_YOUR_ACCOUNT_INFORMATION_AND_TRY_LOGGING_IN_AGAIN;
	
	@ClientString(id = 451, message = "The password you have entered is incorrect.")
	public static SystemMessageId THE_PASSWORD_YOU_HAVE_ENTERED_IS_INCORRECT;
	
	@ClientString(id = 452, message = "Please check your account information and try logging in again.")
	public static SystemMessageId PLEASE_CHECK_YOUR_ACCOUNT_INFORMATION_AND_TRY_LOGGING_IN_AGAIN2;
	
	@ClientString(id = 453, message = "Incorrect account information.")
	public static SystemMessageId INCORRECT_ACCOUNT_INFORMATION;
	
	@ClientString(id = 454, message = "For more details, please contact our customer service center at https://support.lineage2.com.")
	public static SystemMessageId FOR_MORE_DETAILS_PLEASE_CONTACT_OUR_CUSTOMER_SERVICE_CENTER_AT_HTTPS_SUPPORT_LINEAGE2_COM;
	
	@ClientString(id = 455, message = "Account is already in use.")
	public static SystemMessageId ACCOUNT_IS_ALREADY_IN_USE;
	
	@ClientString(id = 456, message = "Lineage II game services may be used by individuals 15 years of age or older except for PvP servers, which may only be used by adults 18 years of age and older. (Korea Only)")
	public static SystemMessageId LINEAGE_II_GAME_SERVICES_MAY_BE_USED_BY_INDIVIDUALS_15_YEARS_OF_AGE_OR_OLDER_EXCEPT_FOR_PVP_SERVERS_WHICH_MAY_ONLY_BE_USED_BY_ADULTS_18_YEARS_OF_AGE_AND_OLDER_KOREA_ONLY;
	
	@ClientString(id = 457, message = "We are currently undergoing game server maintenance. Please log in again later.")
	public static SystemMessageId WE_ARE_CURRENTLY_UNDERGOING_GAME_SERVER_MAINTENANCE_PLEASE_LOG_IN_AGAIN_LATER;
	
	@ClientString(id = 458, message = "Your game time has expired. You can not login.")
	public static SystemMessageId YOUR_GAME_TIME_HAS_EXPIRED_YOU_CAN_NOT_LOGIN;
	
	@ClientString(id = 459, message = "To continue playing, please purchase Lineage II")
	public static SystemMessageId TO_CONTINUE_PLAYING_PLEASE_PURCHASE_LINEAGE_II;
	
	@ClientString(id = 460, message = "either directly from the PlayNC Store or from any leading games retailer.")
	public static SystemMessageId EITHER_DIRECTLY_FROM_THE_PLAYNC_STORE_OR_FROM_ANY_LEADING_GAMES_RETAILER;
	
	@ClientString(id = 461, message = "Access failed.")
	public static SystemMessageId ACCESS_FAILED;
	
	@ClientString(id = 462, message = "Please try again later.")
	public static SystemMessageId PLEASE_TRY_AGAIN_LATER2;
	
	@ClientString(id = 463, message = ".")
	public static SystemMessageId EMPTY2;
	
	@ClientString(id = 464, message = "This feature is only available to alliance leaders.")
	public static SystemMessageId THIS_FEATURE_IS_ONLY_AVAILABLE_TO_ALLIANCE_LEADERS;
	
	@ClientString(id = 465, message = "You are not currently allied with any clans.")
	public static SystemMessageId YOU_ARE_NOT_CURRENTLY_ALLIED_WITH_ANY_CLANS;
	
	@ClientString(id = 466, message = "You have exceeded the limit.")
	public static SystemMessageId YOU_HAVE_EXCEEDED_THE_LIMIT;
	
	@ClientString(id = 467, message = "You may not accept any clan within a day after expelling another clan.")
	public static SystemMessageId YOU_MAY_NOT_ACCEPT_ANY_CLAN_WITHIN_A_DAY_AFTER_EXPELLING_ANOTHER_CLAN;
	
	@ClientString(id = 468, message = "A clan that has withdrawn or been expelled cannot enter into an alliance within one day of withdrawal or expulsion.")
	public static SystemMessageId A_CLAN_THAT_HAS_WITHDRAWN_OR_BEEN_EXPELLED_CANNOT_ENTER_INTO_AN_ALLIANCE_WITHIN_ONE_DAY_OF_WITHDRAWAL_OR_EXPULSION;
	
	@ClientString(id = 469, message = "You may not ally with a clan you are currently at war with.  That would be diabolical and treacherous.")
	public static SystemMessageId YOU_MAY_NOT_ALLY_WITH_A_CLAN_YOU_ARE_CURRENTLY_AT_WAR_WITH_THAT_WOULD_BE_DIABOLICAL_AND_TREACHEROUS;
	
	@ClientString(id = 470, message = "Only the clan leader may apply for withdrawal from the alliance.")
	public static SystemMessageId ONLY_THE_CLAN_LEADER_MAY_APPLY_FOR_WITHDRAWAL_FROM_THE_ALLIANCE;
	
	@ClientString(id = 471, message = "Alliance leaders cannot withdraw.")
	public static SystemMessageId ALLIANCE_LEADERS_CANNOT_WITHDRAW;
	
	@ClientString(id = 472, message = "You cannot expel yourself from the clan.")
	public static SystemMessageId YOU_CANNOT_EXPEL_YOURSELF_FROM_THE_CLAN;
	
	@ClientString(id = 473, message = "Different alliance.")
	public static SystemMessageId DIFFERENT_ALLIANCE;
	
	@ClientString(id = 474, message = "That clan does not exist.")
	public static SystemMessageId THAT_CLAN_DOES_NOT_EXIST;
	
	@ClientString(id = 475, message = "Different alliance.")
	public static SystemMessageId DIFFERENT_ALLIANCE2;
	
	@ClientString(id = 476, message = "Please adjust the image size to 8x12.")
	public static SystemMessageId PLEASE_ADJUST_THE_IMAGE_SIZE_TO_8X12;
	
	@ClientString(id = 477, message = "No response. Invitation to join an alliance has been cancelled.")
	public static SystemMessageId NO_RESPONSE_INVITATION_TO_JOIN_AN_ALLIANCE_HAS_BEEN_CANCELLED;
	
	@ClientString(id = 478, message = "No response. Your entrance to the alliance has been cancelled.")
	public static SystemMessageId NO_RESPONSE_YOUR_ENTRANCE_TO_THE_ALLIANCE_HAS_BEEN_CANCELLED;
	
	@ClientString(id = 479, message = "$s1 has joined as a friend.")
	public static SystemMessageId S1_HAS_JOINED_AS_A_FRIEND;
	
	@ClientString(id = 480, message = "Please check your friends list.")
	public static SystemMessageId PLEASE_CHECK_YOUR_FRIENDS_LIST;
	
	@ClientString(id = 481, message = "$s1 has been deleted from your friends list.")
	public static SystemMessageId S1_HAS_BEEN_DELETED_FROM_YOUR_FRIENDS_LIST;
	
	@ClientString(id = 482, message = "You cannot add yourself to your own friend list.")
	public static SystemMessageId YOU_CANNOT_ADD_YOURSELF_TO_YOUR_OWN_FRIEND_LIST2;
	
	@ClientString(id = 483, message = "This function is inaccessible right now.  Please try again later.")
	public static SystemMessageId THIS_FUNCTION_IS_INACCESSIBLE_RIGHT_NOW_PLEASE_TRY_AGAIN_LATER;
	
	@ClientString(id = 484, message = "This player is already registered on your friends list.")
	public static SystemMessageId THIS_PLAYER_IS_ALREADY_REGISTERED_ON_YOUR_FRIENDS_LIST;
	
	@ClientString(id = 485, message = "No new friend invitations may be accepted.")
	public static SystemMessageId NO_NEW_FRIEND_INVITATIONS_MAY_BE_ACCEPTED;
	
	@ClientString(id = 486, message = "The following user is not on your friends list.")
	public static SystemMessageId THE_FOLLOWING_USER_IS_NOT_ON_YOUR_FRIENDS_LIST;
	
	@ClientString(id = 487, message = "======(Friends List)======")
	public static SystemMessageId FRIENDS_LIST;
	
	@ClientString(id = 488, message = "$s1 (Currently: Online)")
	public static SystemMessageId S1_CURRENTLY_ONLINE;
	
	@ClientString(id = 489, message = "$s1 (Currently: Offline)")
	public static SystemMessageId S1_CURRENTLY_OFFLINE;
	
	@ClientString(id = 490, message = "========================")
	public static SystemMessageId EMPTY3;
	
	@ClientString(id = 491, message = "=======(Alliance Information)=======")
	public static SystemMessageId ALLIANCE_INFORMATION;
	
	@ClientString(id = 492, message = "Alliance Name: $s1")
	public static SystemMessageId ALLIANCE_NAME_S1;
	
	@ClientString(id = 493, message = "Connection: $s1 / Total $s2")
	public static SystemMessageId CONNECTION_S1_TOTAL_S2;
	
	@ClientString(id = 494, message = "Alliance Leader: $s2 of $s1")
	public static SystemMessageId ALLIANCE_LEADER_S2_OF_S1;
	
	@ClientString(id = 495, message = "Affiliated clans: Total $s1 clan(s)")
	public static SystemMessageId AFFILIATED_CLANS_TOTAL_S1_CLAN_S;
	
	@ClientString(id = 496, message = "=====(Clan Information)=====")
	public static SystemMessageId CLAN_INFORMATION;
	
	@ClientString(id = 497, message = "Clan Name: $s1")
	public static SystemMessageId CLAN_NAME_S1;
	
	@ClientString(id = 498, message = "Clan Leader:  $s1")
	public static SystemMessageId CLAN_LEADER_S1;
	
	@ClientString(id = 499, message = "Clan Level: $s1")
	public static SystemMessageId CLAN_LEVEL_S1;
	
	@ClientString(id = 500, message = "------------------------")
	public static SystemMessageId EMPTY4;
	
	@ClientString(id = 501, message = "========================")
	public static SystemMessageId EMPTY5;
	
	@ClientString(id = 502, message = "You already belong to another alliance.")
	public static SystemMessageId YOU_ALREADY_BELONG_TO_ANOTHER_ALLIANCE;
	
	@ClientString(id = 503, message = "Your friend $s1 just logged in.")
	public static SystemMessageId YOUR_FRIEND_S1_JUST_LOGGED_IN;
	
	@ClientString(id = 504, message = "Only clan leaders may create alliances.")
	public static SystemMessageId ONLY_CLAN_LEADERS_MAY_CREATE_ALLIANCES;
	
	@ClientString(id = 505, message = "You cannot create a new alliance within 1 day of dissolution.")
	public static SystemMessageId YOU_CANNOT_CREATE_A_NEW_ALLIANCE_WITHIN_1_DAY_OF_DISSOLUTION;
	
	@ClientString(id = 506, message = "Incorrect alliance name.  Please try again.")
	public static SystemMessageId INCORRECT_ALLIANCE_NAME_PLEASE_TRY_AGAIN;
	
	@ClientString(id = 507, message = "Incorrect length for an alliance name.")
	public static SystemMessageId INCORRECT_LENGTH_FOR_AN_ALLIANCE_NAME;
	
	@ClientString(id = 508, message = "That alliance name already exists.")
	public static SystemMessageId THAT_ALLIANCE_NAME_ALREADY_EXISTS;
	
	@ClientString(id = 509, message = "Unable to proceed. Clan ally is currently registered as an enemy for the siege.")
	public static SystemMessageId UNABLE_TO_PROCEED_CLAN_ALLY_IS_CURRENTLY_REGISTERED_AS_AN_ENEMY_FOR_THE_SIEGE;
	
	@ClientString(id = 510, message = "You have invited someone to your alliance.")
	public static SystemMessageId YOU_HAVE_INVITED_SOMEONE_TO_YOUR_ALLIANCE;
	
	@ClientString(id = 511, message = "You must first select a user to invite.")
	public static SystemMessageId YOU_MUST_FIRST_SELECT_A_USER_TO_INVITE;
	
	@ClientString(id = 512, message = "Do you really wish to withdraw from the alliance?")
	public static SystemMessageId DO_YOU_REALLY_WISH_TO_WITHDRAW_FROM_THE_ALLIANCE;
	
	@ClientString(id = 513, message = "Enter the name of the clan you wish to expel.")
	public static SystemMessageId ENTER_THE_NAME_OF_THE_CLAN_YOU_WISH_TO_EXPEL;
	
	@ClientString(id = 514, message = "Do you really wish to dissolve the alliance? You cannot create a new alliance for 1 day.")
	public static SystemMessageId DO_YOU_REALLY_WISH_TO_DISSOLVE_THE_ALLIANCE_YOU_CANNOT_CREATE_A_NEW_ALLIANCE_FOR_1_DAY;
	
	@ClientString(id = 515, message = "Enter a file name for the alliance crest.")
	public static SystemMessageId ENTER_A_FILE_NAME_FOR_THE_ALLIANCE_CREST;
	
	@ClientString(id = 516, message = "$s1 has invited you to be their friend.")
	public static SystemMessageId S1_HAS_INVITED_YOU_TO_BE_THEIR_FRIEND;
	
	@ClientString(id = 517, message = "You have accepted the alliance.")
	public static SystemMessageId YOU_HAVE_ACCEPTED_THE_ALLIANCE;
	
	@ClientString(id = 518, message = "You have failed to invite a clan into the alliance.")
	public static SystemMessageId YOU_HAVE_FAILED_TO_INVITE_A_CLAN_INTO_THE_ALLIANCE;
	
	@ClientString(id = 519, message = "You have withdrawn from the alliance.")
	public static SystemMessageId YOU_HAVE_WITHDRAWN_FROM_THE_ALLIANCE;
	
	@ClientString(id = 520, message = "You have failed to withdraw from the alliance.")
	public static SystemMessageId YOU_HAVE_FAILED_TO_WITHDRAW_FROM_THE_ALLIANCE;
	
	@ClientString(id = 521, message = "You have succeeded in expelling the clan.")
	public static SystemMessageId YOU_HAVE_SUCCEEDED_IN_EXPELLING_THE_CLAN;
	
	@ClientString(id = 522, message = "You have failed to expel a clan.")
	public static SystemMessageId YOU_HAVE_FAILED_TO_EXPEL_A_CLAN;
	
	@ClientString(id = 523, message = "The alliance has been dissolved.")
	public static SystemMessageId THE_ALLIANCE_HAS_BEEN_DISSOLVED;
	
	@ClientString(id = 524, message = "You have failed to dissolve the alliance.")
	public static SystemMessageId YOU_HAVE_FAILED_TO_DISSOLVE_THE_ALLIANCE;
	
	@ClientString(id = 525, message = "That person has been successfully added to your Friend List")
	public static SystemMessageId THAT_PERSON_HAS_BEEN_SUCCESSFULLY_ADDED_TO_YOUR_FRIEND_LIST;
	
	@ClientString(id = 526, message = "You have failed to add a friend to your friends list.")
	public static SystemMessageId YOU_HAVE_FAILED_TO_ADD_A_FRIEND_TO_YOUR_FRIENDS_LIST;
	
	@ClientString(id = 527, message = "$s1 leader, $s2, has requested an alliance.")
	public static SystemMessageId S1_LEADER_S2_HAS_REQUESTED_AN_ALLIANCE;
	
	@ClientString(id = 528, message = "Unable to find file at target location.")
	public static SystemMessageId UNABLE_TO_FIND_FILE_AT_TARGET_LOCATION;
	
	@ClientString(id = 529, message = "You may only register an 8 x 12 pixel, 256-color BMP.")
	public static SystemMessageId YOU_MAY_ONLY_REGISTER_AN_8_X_12_PIXEL_256_COLOR_BMP;
	
	@ClientString(id = 530, message = "Your Spiritshot does not match the weapon's grade .")
	public static SystemMessageId YOUR_SPIRITSHOT_DOES_NOT_MATCH_THE_WEAPON_S_GRADE;
	
	@ClientString(id = 531, message = "You do not have enough Spiritshot for that.")
	public static SystemMessageId YOU_DO_NOT_HAVE_ENOUGH_SPIRITSHOT_FOR_THAT;
	
	@ClientString(id = 532, message = "You may not use Spiritshots.")
	public static SystemMessageId YOU_MAY_NOT_USE_SPIRITSHOTS;
	
	@ClientString(id = 533, message = "Your spiritshot has been enabled.")
	public static SystemMessageId YOUR_SPIRITSHOT_HAS_BEEN_ENABLED;
	
	@ClientString(id = 534, message = "Your spiritshot has been disabled.")
	public static SystemMessageId YOUR_SPIRITSHOT_HAS_BEEN_DISABLED;
	
	@ClientString(id = 535, message = "Enter a name for your pet.")
	public static SystemMessageId ENTER_A_NAME_FOR_YOUR_PET;
	
	@ClientString(id = 536, message = "How much Adena do you wish to transfer to your Inventory?")
	public static SystemMessageId HOW_MUCH_ADENA_DO_YOU_WISH_TO_TRANSFER_TO_YOUR_INVENTORY;
	
	@ClientString(id = 537, message = "How much will you transfer?")
	public static SystemMessageId HOW_MUCH_WILL_YOU_TRANSFER;
	
	@ClientString(id = 538, message = "Your SP has decreased by $s1.")
	public static SystemMessageId YOUR_SP_HAS_DECREASED_BY_S1;
	
	@ClientString(id = 539, message = "Your XP has decreased by $s1.")
	public static SystemMessageId YOUR_XP_HAS_DECREASED_BY_S1;
	
	@ClientString(id = 540, message = "Clan leaders may not be deleted. Dissolve the clan first and try again.")
	public static SystemMessageId CLAN_LEADERS_MAY_NOT_BE_DELETED_DISSOLVE_THE_CLAN_FIRST_AND_TRY_AGAIN;
	
	@ClientString(id = 541, message = "You may not delete a clan member. Withdraw from the clan first and try again.")
	public static SystemMessageId YOU_MAY_NOT_DELETE_A_CLAN_MEMBER_WITHDRAW_FROM_THE_CLAN_FIRST_AND_TRY_AGAIN;
	
	@ClientString(id = 542, message = "The NPC server is currently down. Pets and servitors cannot be summoned at this time.")
	public static SystemMessageId THE_NPC_SERVER_IS_CURRENTLY_DOWN_PETS_AND_SERVITORS_CANNOT_BE_SUMMONED_AT_THIS_TIME;
	
	@ClientString(id = 543, message = "You already have a pet.")
	public static SystemMessageId YOU_ALREADY_HAVE_A_PET;
	
	@ClientString(id = 544, message = "Your pet cannot carry this item.")
	public static SystemMessageId YOUR_PET_CANNOT_CARRY_THIS_ITEM;
	
	@ClientString(id = 545, message = "Your pet cannot carry any more items.")
	public static SystemMessageId YOUR_PET_CANNOT_CARRY_ANY_MORE_ITEMS;
	
	@ClientString(id = 546, message = "Your pet cannot carry any more items.")
	public static SystemMessageId YOUR_PET_CANNOT_CARRY_ANY_MORE_ITEMS2;
	
	@ClientString(id = 547, message = "Summoning your pet…")
	public static SystemMessageId SUMMONING_YOUR_PET;
	
	@ClientString(id = 548, message = "Your pet's name can be up to 8 characters in length.")
	public static SystemMessageId YOUR_PET_S_NAME_CAN_BE_UP_TO_8_CHARACTERS_IN_LENGTH;
	
	@ClientString(id = 549, message = "To create an alliance, your clan must be Level 5 or higher.")
	public static SystemMessageId TO_CREATE_AN_ALLIANCE_YOUR_CLAN_MUST_BE_LEVEL_5_OR_HIGHER;
	
	@ClientString(id = 550, message = "As you are currently schedule for clan dissolution, no alliance can be created.")
	public static SystemMessageId AS_YOU_ARE_CURRENTLY_SCHEDULE_FOR_CLAN_DISSOLUTION_NO_ALLIANCE_CAN_BE_CREATED;
	
	@ClientString(id = 551, message = "As you are currently schedule for clan dissolution, your clan level cannot be increased.")
	public static SystemMessageId AS_YOU_ARE_CURRENTLY_SCHEDULE_FOR_CLAN_DISSOLUTION_YOUR_CLAN_LEVEL_CANNOT_BE_INCREASED;
	
	@ClientString(id = 552, message = "As you are currently schedule for clan dissolution, you cannot register or delete a Clan Crest.")
	public static SystemMessageId AS_YOU_ARE_CURRENTLY_SCHEDULE_FOR_CLAN_DISSOLUTION_YOU_CANNOT_REGISTER_OR_DELETE_A_CLAN_CREST;
	
	@ClientString(id = 553, message = "The opposing clan has applied for dispersion.")
	public static SystemMessageId THE_OPPOSING_CLAN_HAS_APPLIED_FOR_DISPERSION;
	
	@ClientString(id = 554, message = "You cannot disperse the clans in your alliance.")
	public static SystemMessageId YOU_CANNOT_DISPERSE_THE_CLANS_IN_YOUR_ALLIANCE;
	
	@ClientString(id = 555, message = "You cannot move due to the weight of your inventory.")
	public static SystemMessageId YOU_CANNOT_MOVE_DUE_TO_THE_WEIGHT_OF_YOUR_INVENTORY;
	
	@ClientString(id = 556, message = "You cannot move in this state.")
	public static SystemMessageId YOU_CANNOT_MOVE_IN_THIS_STATE;
	
	@ClientString(id = 557, message = "As your pet is currently out, its summoning item cannot be destroyed.")
	public static SystemMessageId AS_YOUR_PET_IS_CURRENTLY_OUT_ITS_SUMMONING_ITEM_CANNOT_BE_DESTROYED;
	
	@ClientString(id = 558, message = "As your pet is currently summoned, you cannot discard the summoning item.")
	public static SystemMessageId AS_YOUR_PET_IS_CURRENTLY_SUMMONED_YOU_CANNOT_DISCARD_THE_SUMMONING_ITEM;
	
	@ClientString(id = 559, message = "You have purchased $s2 from $c1.")
	public static SystemMessageId YOU_HAVE_PURCHASED_S2_FROM_C1;
	
	@ClientString(id = 560, message = "You have purchased +$s2 $s3 from $c1.")
	public static SystemMessageId YOU_HAVE_PURCHASED_S2_S3_FROM_C1;
	
	@ClientString(id = 561, message = "You have purchased $s3 $s2(s) from $c1.")
	public static SystemMessageId YOU_HAVE_PURCHASED_S3_S2_S_FROM_C1;
	
	@ClientString(id = 562, message = "You may not crystallize this item. Your crystallization skill level is too low.")
	public static SystemMessageId YOU_MAY_NOT_CRYSTALLIZE_THIS_ITEM_YOUR_CRYSTALLIZATION_SKILL_LEVEL_IS_TOO_LOW;
	
	@ClientString(id = 563, message = "Failed to remove enmity.")
	public static SystemMessageId FAILED_TO_REMOVE_ENMITY;
	
	@ClientString(id = 564, message = "Failed to change enmity.")
	public static SystemMessageId FAILED_TO_CHANGE_ENMITY;
	
	@ClientString(id = 565, message = "Not enough energy.")
	public static SystemMessageId NOT_ENOUGH_ENERGY;
	
	@ClientString(id = 566, message = "Failed to cause confusion.")
	public static SystemMessageId FAILED_TO_CAUSE_CONFUSION;
	
	@ClientString(id = 567, message = "Failed to cast Fear.")
	public static SystemMessageId FAILED_TO_CAST_FEAR;
	
	@ClientString(id = 568, message = "Failed to summon Cube.")
	public static SystemMessageId FAILED_TO_SUMMON_CUBE;
	
	@ClientString(id = 569, message = "Caution -- this item's price greatly differs from non-player run shops. Do you wish to continue?")
	public static SystemMessageId CAUTION_THIS_ITEM_S_PRICE_GREATLY_DIFFERS_FROM_NON_PLAYER_RUN_SHOPS_DO_YOU_WISH_TO_CONTINUE;
	
	@ClientString(id = 570, message = "How many $s1(s) do you want to purchase?")
	public static SystemMessageId HOW_MANY_S1_S_DO_YOU_WANT_TO_PURCHASE;
	
	@ClientString(id = 571, message = "How many $s1(s) do you want to delete from the purchase list?")
	public static SystemMessageId HOW_MANY_S1_S_DO_YOU_WANT_TO_DELETE_FROM_THE_PURCHASE_LIST;
	
	@ClientString(id = 572, message = "Do you accept $c1's party invitation? (Item Distribution: Finders Keepers.)")
	public static SystemMessageId DO_YOU_ACCEPT_C1_S_PARTY_INVITATION_ITEM_DISTRIBUTION_FINDERS_KEEPERS;
	
	@ClientString(id = 573, message = "Do you accept $c1's party invitation? (Item Distribution: Random.)")
	public static SystemMessageId DO_YOU_ACCEPT_C1_S_PARTY_INVITATION_ITEM_DISTRIBUTION_RANDOM;
	
	@ClientString(id = 574, message = "Pets and Servitors are not available at this time.")
	public static SystemMessageId PETS_AND_SERVITORS_ARE_NOT_AVAILABLE_AT_THIS_TIME;
	
	@ClientString(id = 575, message = "How much Adena do you wish to transfer to your pet?")
	public static SystemMessageId HOW_MUCH_ADENA_DO_YOU_WISH_TO_TRANSFER_TO_YOUR_PET;
	
	@ClientString(id = 576, message = "How much do you wish to transfer?")
	public static SystemMessageId HOW_MUCH_DO_YOU_WISH_TO_TRANSFER;
	
	@ClientString(id = 577, message = "You cannot summon during a trade or while using a private store.")
	public static SystemMessageId YOU_CANNOT_SUMMON_DURING_A_TRADE_OR_WHILE_USING_A_PRIVATE_STORE;
	
	@ClientString(id = 578, message = "You cannot summon during combat.")
	public static SystemMessageId YOU_CANNOT_SUMMON_DURING_COMBAT;
	
	@ClientString(id = 579, message = "A pet cannot be unsummoned during battle.")
	public static SystemMessageId A_PET_CANNOT_BE_UNSUMMONED_DURING_BATTLE;
	
	@ClientString(id = 580, message = "You may not summon multiple pets at the same time.")
	public static SystemMessageId YOU_MAY_NOT_SUMMON_MULTIPLE_PETS_AT_THE_SAME_TIME;
	
	@ClientString(id = 581, message = "There is a space in the name.")
	public static SystemMessageId THERE_IS_A_SPACE_IN_THE_NAME;
	
	@ClientString(id = 582, message = "Inappropriate character name.")
	public static SystemMessageId INAPPROPRIATE_CHARACTER_NAME;
	
	@ClientString(id = 583, message = "Name includes forbidden words.")
	public static SystemMessageId NAME_INCLUDES_FORBIDDEN_WORDS;
	
	@ClientString(id = 584, message = "This is already in use by another pet.")
	public static SystemMessageId THIS_IS_ALREADY_IN_USE_BY_ANOTHER_PET;
	
	@ClientString(id = 585, message = "Select the purchasing price")
	public static SystemMessageId SELECT_THE_PURCHASING_PRICE;
	
	@ClientString(id = 586, message = "Pet items cannot be registered as shortcuts.")
	public static SystemMessageId PET_ITEMS_CANNOT_BE_REGISTERED_AS_SHORTCUTS;
	
	@ClientString(id = 587, message = "Irregular system speed.")
	public static SystemMessageId IRREGULAR_SYSTEM_SPEED;
	
	@ClientString(id = 588, message = "Your pet's inventory is full.")
	public static SystemMessageId YOUR_PET_S_INVENTORY_IS_FULL;
	
	@ClientString(id = 589, message = "Dead pets cannot be returned to their summoning item.")
	public static SystemMessageId DEAD_PETS_CANNOT_BE_RETURNED_TO_THEIR_SUMMONING_ITEM;
	
	@ClientString(id = 590, message = "Your pet is dead and any attempt you make to give it something goes unrecognized.")
	public static SystemMessageId YOUR_PET_IS_DEAD_AND_ANY_ATTEMPT_YOU_MAKE_TO_GIVE_IT_SOMETHING_GOES_UNRECOGNIZED;
	
	@ClientString(id = 591, message = "An invalid character is included in the pet's name.")
	public static SystemMessageId AN_INVALID_CHARACTER_IS_INCLUDED_IN_THE_PET_S_NAME;
	
	@ClientString(id = 592, message = "Do you wish to dismiss your pet? Dismissing your pet will cause the pet necklace to disappear.")
	public static SystemMessageId DO_YOU_WISH_TO_DISMISS_YOUR_PET_DISMISSING_YOUR_PET_WILL_CAUSE_THE_PET_NECKLACE_TO_DISAPPEAR;
	
	@ClientString(id = 593, message = "Your pet is tired of starving and has left you.")
	public static SystemMessageId YOUR_PET_IS_TIRED_OF_STARVING_AND_HAS_LEFT_YOU;
	
	@ClientString(id = 594, message = "You may not restore a hungry pet.")
	public static SystemMessageId YOU_MAY_NOT_RESTORE_A_HUNGRY_PET;
	
	@ClientString(id = 595, message = "Your pet is very hungry.")
	public static SystemMessageId YOUR_PET_IS_VERY_HUNGRY;
	
	@ClientString(id = 596, message = "Your pet ate a little, but is still hungry.")
	public static SystemMessageId YOUR_PET_ATE_A_LITTLE_BUT_IS_STILL_HUNGRY;
	
	@ClientString(id = 597, message = "Your pet is very hungry. Please be careful.")
	public static SystemMessageId YOUR_PET_IS_VERY_HUNGRY_PLEASE_BE_CAREFUL;
	
	@ClientString(id = 598, message = "You may not chat while you are invisible.")
	public static SystemMessageId YOU_MAY_NOT_CHAT_WHILE_YOU_ARE_INVISIBLE;
	
	@ClientString(id = 599, message = "The GM has an important notice. Chat has been temporarily disabled.")
	public static SystemMessageId THE_GM_HAS_AN_IMPORTANT_NOTICE_CHAT_HAS_BEEN_TEMPORARILY_DISABLED;
	
	@ClientString(id = 600, message = "You may not equip a pet item.")
	public static SystemMessageId YOU_MAY_NOT_EQUIP_A_PET_ITEM;
	
	@ClientString(id = 601, message = "There are $s1 petitions currently on the waiting list.")
	public static SystemMessageId THERE_ARE_S1_PETITIONS_CURRENTLY_ON_THE_WAITING_LIST;
	
	@ClientString(id = 602, message = "The Petition Service is currently unavailable. Please send a support ticket on https://lineage2.custhelp.com.")
	public static SystemMessageId THE_PETITION_SERVICE_IS_CURRENTLY_UNAVAILABLE_PLEASE_SEND_A_SUPPORT_TICKET_ON_HTTPS_LINEAGE2_CUSTHELP_COM;
	
	@ClientString(id = 603, message = "That item cannot be discarded or exchanged.")
	public static SystemMessageId THAT_ITEM_CANNOT_BE_DISCARDED_OR_EXCHANGED;
	
	@ClientString(id = 604, message = "You may not call forth a pet or summoned creature from this location.")
	public static SystemMessageId YOU_MAY_NOT_CALL_FORTH_A_PET_OR_SUMMONED_CREATURE_FROM_THIS_LOCATION;
	
	@ClientString(id = 605, message = "You can only enter up 128 names in your friends list.")
	public static SystemMessageId YOU_CAN_ONLY_ENTER_UP_128_NAMES_IN_YOUR_FRIENDS_LIST;
	
	@ClientString(id = 606, message = "The Friend's List of the person you are trying to add is full, so registration is not possible.")
	public static SystemMessageId THE_FRIEND_S_LIST_OF_THE_PERSON_YOU_ARE_TRYING_TO_ADD_IS_FULL_SO_REGISTRATION_IS_NOT_POSSIBLE;
	
	@ClientString(id = 607, message = "You do not have any further skills to learn. Come back when you have reached Level $s1.")
	public static SystemMessageId YOU_DO_NOT_HAVE_ANY_FURTHER_SKILLS_TO_LEARN_COME_BACK_WHEN_YOU_HAVE_REACHED_LEVEL_S1;
	
	@ClientString(id = 608, message = "$c1 has obtained $s3 $s2(s) by using sweeper.")
	public static SystemMessageId C1_HAS_OBTAINED_S3_S2_S_BY_USING_SWEEPER;
	
	@ClientString(id = 609, message = "$c1 has obtained $s2 by using sweeper.")
	public static SystemMessageId C1_HAS_OBTAINED_S2_BY_USING_SWEEPER;
	
	@ClientString(id = 610, message = "Your skill has been canceled due to lack of HP.")
	public static SystemMessageId YOUR_SKILL_HAS_BEEN_CANCELED_DUE_TO_LACK_OF_HP;
	
	@ClientString(id = 611, message = "You have succeeded in Confusing the enemy.")
	public static SystemMessageId YOU_HAVE_SUCCEEDED_IN_CONFUSING_THE_ENEMY;
	
	@ClientString(id = 612, message = "The Spoil condition has been activated.")
	public static SystemMessageId THE_SPOIL_CONDITION_HAS_BEEN_ACTIVATED;
	
	@ClientString(id = 613, message = "======(Ignore List)======")
	public static SystemMessageId IGNORE_LIST;
	
	@ClientString(id = 614, message = "$c1 : $c2")
	public static SystemMessageId C1_C2;
	
	@ClientString(id = 615, message = "You have failed to register the user to your Ignore List.")
	public static SystemMessageId YOU_HAVE_FAILED_TO_REGISTER_THE_USER_TO_YOUR_IGNORE_LIST;
	
	@ClientString(id = 616, message = "You have failed to delete the character.")
	public static SystemMessageId YOU_HAVE_FAILED_TO_DELETE_THE_CHARACTER2;
	
	@ClientString(id = 617, message = "$s1 has been added to your Ignore List.")
	public static SystemMessageId S1_HAS_BEEN_ADDED_TO_YOUR_IGNORE_LIST;
	
	@ClientString(id = 618, message = "$s1 has been removed from your Ignore List.")
	public static SystemMessageId S1_HAS_BEEN_REMOVED_FROM_YOUR_IGNORE_LIST;
	
	@ClientString(id = 619, message = "$c1 has placed you on his/her Ignore List.")
	public static SystemMessageId C1_HAS_PLACED_YOU_ON_HIS_HER_IGNORE_LIST;
	
	@ClientString(id = 620, message = "$c1 has placed you on his/her Ignore List.")
	public static SystemMessageId C1_HAS_PLACED_YOU_ON_HIS_HER_IGNORE_LIST2;
	
	@ClientString(id = 621, message = "Game connection attempted through a restricted IP.")
	public static SystemMessageId GAME_CONNECTION_ATTEMPTED_THROUGH_A_RESTRICTED_IP;
	
	@ClientString(id = 622, message = "You may not make a declaration of war during an alliance battle.")
	public static SystemMessageId YOU_MAY_NOT_MAKE_A_DECLARATION_OF_WAR_DURING_AN_ALLIANCE_BATTLE;
	
	@ClientString(id = 623, message = "Your opponent has exceeded the number of simultaneous alliance battles allowed.")
	public static SystemMessageId YOUR_OPPONENT_HAS_EXCEEDED_THE_NUMBER_OF_SIMULTANEOUS_ALLIANCE_BATTLES_ALLOWED;
	
	@ClientString(id = 624, message = "Clan leader $s1 is not currently connected to the game server.")
	public static SystemMessageId CLAN_LEADER_S1_IS_NOT_CURRENTLY_CONNECTED_TO_THE_GAME_SERVER;
	
	@ClientString(id = 625, message = "Your request for an Alliance Battle truce has been denied.")
	public static SystemMessageId YOUR_REQUEST_FOR_AN_ALLIANCE_BATTLE_TRUCE_HAS_BEEN_DENIED;
	
	@ClientString(id = 626, message = "The $s1 clan did not respond: war proclamation has been refused.")
	public static SystemMessageId THE_S1_CLAN_DID_NOT_RESPOND_WAR_PROCLAMATION_HAS_BEEN_REFUSED2;
	
	@ClientString(id = 627, message = "Clan battle has been refused because you did not respond to $s1's war proclamation.")
	public static SystemMessageId CLAN_BATTLE_HAS_BEEN_REFUSED_BECAUSE_YOU_DID_NOT_RESPOND_TO_S1_S_WAR_PROCLAMATION;
	
	@ClientString(id = 628, message = "You have already been at war with the $s1 clan: 5 days must pass before you can declare war again.")
	public static SystemMessageId YOU_HAVE_ALREADY_BEEN_AT_WAR_WITH_THE_S1_CLAN_5_DAYS_MUST_PASS_BEFORE_YOU_CAN_DECLARE_WAR_AGAIN;
	
	@ClientString(id = 629, message = "Your opponent has exceeded the number of simultaneous alliance battles allowed.")
	public static SystemMessageId YOUR_OPPONENT_HAS_EXCEEDED_THE_NUMBER_OF_SIMULTANEOUS_ALLIANCE_BATTLES_ALLOWED2;
	
	@ClientString(id = 630, message = "War with clan $s1 has begun.")
	public static SystemMessageId WAR_WITH_CLAN_S1_HAS_BEGUN;
	
	@ClientString(id = 631, message = "War with clan $s1 is over.")
	public static SystemMessageId WAR_WITH_CLAN_S1_IS_OVER;
	
	@ClientString(id = 632, message = "You have won the war over the $s1 clan!")
	public static SystemMessageId YOU_HAVE_WON_THE_WAR_OVER_THE_S1_CLAN2;
	
	@ClientString(id = 633, message = "You have surrendered to the $s1 clan.")
	public static SystemMessageId YOU_HAVE_SURRENDERED_TO_THE_S1_CLAN2;
	
	@ClientString(id = 634, message = "Your alliance leader has been slain. You have been defeated by the $s1 clan.")
	public static SystemMessageId YOUR_ALLIANCE_LEADER_HAS_BEEN_SLAIN_YOU_HAVE_BEEN_DEFEATED_BY_THE_S1_CLAN;
	
	@ClientString(id = 635, message = "The time limit for the clan war has been exceeded. War with the $s1 clan is over.")
	public static SystemMessageId THE_TIME_LIMIT_FOR_THE_CLAN_WAR_HAS_BEEN_EXCEEDED_WAR_WITH_THE_S1_CLAN_IS_OVER;
	
	@ClientString(id = 636, message = "You are not involved in a clan war.")
	public static SystemMessageId YOU_ARE_NOT_INVOLVED_IN_A_CLAN_WAR2;
	
	@ClientString(id = 637, message = "A clan ally has registered itself to the opponent.")
	public static SystemMessageId A_CLAN_ALLY_HAS_REGISTERED_ITSELF_TO_THE_OPPONENT;
	
	@ClientString(id = 638, message = "You have already requested a Castle Siege.")
	public static SystemMessageId YOU_HAVE_ALREADY_REQUESTED_A_CASTLE_SIEGE;
	
	@ClientString(id = 639, message = "Your application has been denied because you have already submitted a request for another Castle Siege.")
	public static SystemMessageId YOUR_APPLICATION_HAS_BEEN_DENIED_BECAUSE_YOU_HAVE_ALREADY_SUBMITTED_A_REQUEST_FOR_ANOTHER_CASTLE_SIEGE;
	
	@ClientString(id = 640, message = "You have failed to refuse castle defense aid.")
	public static SystemMessageId YOU_HAVE_FAILED_TO_REFUSE_CASTLE_DEFENSE_AID;
	
	@ClientString(id = 641, message = "You have failed to approve castle defense aid.")
	public static SystemMessageId YOU_HAVE_FAILED_TO_APPROVE_CASTLE_DEFENSE_AID;
	
	@ClientString(id = 642, message = "You are already registered to the attacker side and must cancel your registration before submitting your request.")
	public static SystemMessageId YOU_ARE_ALREADY_REGISTERED_TO_THE_ATTACKER_SIDE_AND_MUST_CANCEL_YOUR_REGISTRATION_BEFORE_SUBMITTING_YOUR_REQUEST;
	
	@ClientString(id = 643, message = "You have already registered to the defender side and must cancel your registration before submitting your request.")
	public static SystemMessageId YOU_HAVE_ALREADY_REGISTERED_TO_THE_DEFENDER_SIDE_AND_MUST_CANCEL_YOUR_REGISTRATION_BEFORE_SUBMITTING_YOUR_REQUEST;
	
	@ClientString(id = 644, message = "You are not yet registered for the castle siege.")
	public static SystemMessageId YOU_ARE_NOT_YET_REGISTERED_FOR_THE_CASTLE_SIEGE;
	
	@ClientString(id = 645, message = "Only clans of level 5 or above may register for a castle siege.")
	public static SystemMessageId ONLY_CLANS_OF_LEVEL_5_OR_ABOVE_MAY_REGISTER_FOR_A_CASTLE_SIEGE;
	
	@ClientString(id = 646, message = "You do not have the authority to modify the castle defender list.")
	public static SystemMessageId YOU_DO_NOT_HAVE_THE_AUTHORITY_TO_MODIFY_THE_CASTLE_DEFENDER_LIST;
	
	@ClientString(id = 647, message = "You do not have the authority to modify the siege time.")
	public static SystemMessageId YOU_DO_NOT_HAVE_THE_AUTHORITY_TO_MODIFY_THE_SIEGE_TIME;
	
	@ClientString(id = 648, message = "No more registrations may be accepted for the attacker side.")
	public static SystemMessageId NO_MORE_REGISTRATIONS_MAY_BE_ACCEPTED_FOR_THE_ATTACKER_SIDE;
	
	@ClientString(id = 649, message = "No more registrations may be accepted for the defender side.")
	public static SystemMessageId NO_MORE_REGISTRATIONS_MAY_BE_ACCEPTED_FOR_THE_DEFENDER_SIDE;
	
	@ClientString(id = 650, message = "You may not summon from your current location.")
	public static SystemMessageId YOU_MAY_NOT_SUMMON_FROM_YOUR_CURRENT_LOCATION;
	
	@ClientString(id = 651, message = "Place $s1 in the current location and direction. Do you wish to continue?")
	public static SystemMessageId PLACE_S1_IN_THE_CURRENT_LOCATION_AND_DIRECTION_DO_YOU_WISH_TO_CONTINUE;
	
	@ClientString(id = 652, message = "The target of the summoned monster is wrong.")
	public static SystemMessageId THE_TARGET_OF_THE_SUMMONED_MONSTER_IS_WRONG;
	
	@ClientString(id = 653, message = "You do not have the authority to position mercenaries.")
	public static SystemMessageId YOU_DO_NOT_HAVE_THE_AUTHORITY_TO_POSITION_MERCENARIES;
	
	@ClientString(id = 654, message = "You do not have the authority to cancel mercenary positioning.")
	public static SystemMessageId YOU_DO_NOT_HAVE_THE_AUTHORITY_TO_CANCEL_MERCENARY_POSITIONING;
	
	@ClientString(id = 655, message = "Mercenaries cannot be positioned here.")
	public static SystemMessageId MERCENARIES_CANNOT_BE_POSITIONED_HERE;
	
	@ClientString(id = 656, message = "This mercenary cannot be positioned anymore.")
	public static SystemMessageId THIS_MERCENARY_CANNOT_BE_POSITIONED_ANYMORE;
	
	@ClientString(id = 657, message = "Positioning cannot be done here because the distance between mercenaries is too short.")
	public static SystemMessageId POSITIONING_CANNOT_BE_DONE_HERE_BECAUSE_THE_DISTANCE_BETWEEN_MERCENARIES_IS_TOO_SHORT;
	
	@ClientString(id = 658, message = "This is not a mercenary of a castle that you own and so you cannot cancel its positioning.")
	public static SystemMessageId THIS_IS_NOT_A_MERCENARY_OF_A_CASTLE_THAT_YOU_OWN_AND_SO_YOU_CANNOT_CANCEL_ITS_POSITIONING;
	
	@ClientString(id = 659, message = "This is not the time for siege registration and so registrations cannot be accepted or rejected.")
	public static SystemMessageId THIS_IS_NOT_THE_TIME_FOR_SIEGE_REGISTRATION_AND_SO_REGISTRATIONS_CANNOT_BE_ACCEPTED_OR_REJECTED;
	
	@ClientString(id = 660, message = "This is not the time for siege registration and so registration and cancellation cannot be done.")
	public static SystemMessageId THIS_IS_NOT_THE_TIME_FOR_SIEGE_REGISTRATION_AND_SO_REGISTRATION_AND_CANCELLATION_CANNOT_BE_DONE;
	
	@ClientString(id = 661, message = "This character cannot be spoiled.")
	public static SystemMessageId THIS_CHARACTER_CANNOT_BE_SPOILED;
	
	@ClientString(id = 662, message = "The other player is rejecting friend invitations.")
	public static SystemMessageId THE_OTHER_PLAYER_IS_REJECTING_FRIEND_INVITATIONS;
	
	@ClientString(id = 663, message = "The siege time has been declared for $s1. It is not possible to change the time after a siege time has been declared. Do you want to continue?")
	public static SystemMessageId THE_SIEGE_TIME_HAS_BEEN_DECLARED_FOR_S1_IT_IS_NOT_POSSIBLE_TO_CHANGE_THE_TIME_AFTER_A_SIEGE_TIME_HAS_BEEN_DECLARED_DO_YOU_WANT_TO_CONTINUE;
	
	@ClientString(id = 664, message = "Please choose a person to receive.")
	public static SystemMessageId PLEASE_CHOOSE_A_PERSON_TO_RECEIVE;
	
	@ClientString(id = 665, message = "$s2 from $s1 alliance is applying for alliance war. Do you want to accept the challenge?")
	public static SystemMessageId S2_FROM_S1_ALLIANCE_IS_APPLYING_FOR_ALLIANCE_WAR_DO_YOU_WANT_TO_ACCEPT_THE_CHALLENGE;
	
	@ClientString(id = 666, message = "A request for ceasefire has been received from $s1 alliance. Do you agree?")
	public static SystemMessageId A_REQUEST_FOR_CEASEFIRE_HAS_BEEN_RECEIVED_FROM_S1_ALLIANCE_DO_YOU_AGREE;
	
	@ClientString(id = 667, message = "You are registering on the attacking side of the $s1 siege. Do you want to continue?")
	public static SystemMessageId YOU_ARE_REGISTERING_ON_THE_ATTACKING_SIDE_OF_THE_S1_SIEGE_DO_YOU_WANT_TO_CONTINUE;
	
	@ClientString(id = 668, message = "You are registering on the defending side of the $s1 siege. Do you want to continue?")
	public static SystemMessageId YOU_ARE_REGISTERING_ON_THE_DEFENDING_SIDE_OF_THE_S1_SIEGE_DO_YOU_WANT_TO_CONTINUE;
	
	@ClientString(id = 669, message = "You are canceling your application to participate in the $s1 castle siege. Do you want to continue?")
	public static SystemMessageId YOU_ARE_CANCELING_YOUR_APPLICATION_TO_PARTICIPATE_IN_THE_S1_CASTLE_SIEGE_DO_YOU_WANT_TO_CONTINUE;
	
	@ClientString(id = 670, message = "You are declining the registration of clan $s1 as a defender. Do you want to continue?")
	public static SystemMessageId YOU_ARE_DECLINING_THE_REGISTRATION_OF_CLAN_S1_AS_A_DEFENDER_DO_YOU_WANT_TO_CONTINUE;
	
	@ClientString(id = 671, message = "You are accepting the registration of clan $s1 as a defender. Do you want to continue?")
	public static SystemMessageId YOU_ARE_ACCEPTING_THE_REGISTRATION_OF_CLAN_S1_AS_A_DEFENDER_DO_YOU_WANT_TO_CONTINUE;
	
	@ClientString(id = 672, message = "$s1 Adena disappeared.")
	public static SystemMessageId S1_ADENA_DISAPPEARED;
	
	@ClientString(id = 673, message = "Only a clan leader whose clan is of level 2 or above is allowed to participate in a clan hall auction.")
	public static SystemMessageId ONLY_A_CLAN_LEADER_WHOSE_CLAN_IS_OF_LEVEL_2_OR_ABOVE_IS_ALLOWED_TO_PARTICIPATE_IN_A_CLAN_HALL_AUCTION;
	
	@ClientString(id = 674, message = "It has not yet been seven days since canceling an auction.")
	public static SystemMessageId IT_HAS_NOT_YET_BEEN_SEVEN_DAYS_SINCE_CANCELING_AN_AUCTION;
	
	@ClientString(id = 675, message = "There are no clan halls up for auction.")
	public static SystemMessageId THERE_ARE_NO_CLAN_HALLS_UP_FOR_AUCTION;
	
	@ClientString(id = 676, message = "Since you have already submitted a bid, you are not allowed to participate in another auction at this time.")
	public static SystemMessageId SINCE_YOU_HAVE_ALREADY_SUBMITTED_A_BID_YOU_ARE_NOT_ALLOWED_TO_PARTICIPATE_IN_ANOTHER_AUCTION_AT_THIS_TIME;
	
	@ClientString(id = 677, message = "Your bid price must be higher than the minimum price currently being bid.")
	public static SystemMessageId YOUR_BID_PRICE_MUST_BE_HIGHER_THAN_THE_MINIMUM_PRICE_CURRENTLY_BEING_BID;
	
	@ClientString(id = 678, message = "You have submitted a bid for the auction of $s1.")
	public static SystemMessageId YOU_HAVE_SUBMITTED_A_BID_FOR_THE_AUCTION_OF_S1;
	
	@ClientString(id = 679, message = "You have canceled your bid.")
	public static SystemMessageId YOU_HAVE_CANCELED_YOUR_BID;
	
	@ClientString(id = 680, message = "You do not meet the requirements to participate in an auction.")
	public static SystemMessageId YOU_DO_NOT_MEET_THE_REQUIREMENTS_TO_PARTICIPATE_IN_AN_AUCTION;
	
	@ClientString(id = 681, message = "The clan does not own a clan hall.")
	public static SystemMessageId THE_CLAN_DOES_NOT_OWN_A_CLAN_HALL;
	
	@ClientString(id = 682, message = "You are moving to another village. Do you want to continue?")
	public static SystemMessageId YOU_ARE_MOVING_TO_ANOTHER_VILLAGE_DO_YOU_WANT_TO_CONTINUE;
	
	@ClientString(id = 683, message = "There are no priority rights on a sweeper.")
	public static SystemMessageId THERE_ARE_NO_PRIORITY_RIGHTS_ON_A_SWEEPER;
	
	@ClientString(id = 684, message = "You cannot position mercenaries during a siege.")
	public static SystemMessageId YOU_CANNOT_POSITION_MERCENARIES_DURING_A_SIEGE;
	
	@ClientString(id = 685, message = "You cannot apply for clan war with a clan that belongs to the same alliance.")
	public static SystemMessageId YOU_CANNOT_APPLY_FOR_CLAN_WAR_WITH_A_CLAN_THAT_BELONGS_TO_THE_SAME_ALLIANCE;
	
	@ClientString(id = 686, message = "You have received $s1 damage from the fire of magic.")
	public static SystemMessageId YOU_HAVE_RECEIVED_S1_DAMAGE_FROM_THE_FIRE_OF_MAGIC;
	
	@ClientString(id = 687, message = "You cannot move while frozen. Please wait.")
	public static SystemMessageId YOU_CANNOT_MOVE_WHILE_FROZEN_PLEASE_WAIT;
	
	@ClientString(id = 688, message = "Castle-owning clans are automatically registered on the defending side.")
	public static SystemMessageId CASTLE_OWNING_CLANS_ARE_AUTOMATICALLY_REGISTERED_ON_THE_DEFENDING_SIDE;
	
	@ClientString(id = 689, message = "A clan that owns a castle cannot participate in another siege.")
	public static SystemMessageId A_CLAN_THAT_OWNS_A_CASTLE_CANNOT_PARTICIPATE_IN_ANOTHER_SIEGE;
	
	@ClientString(id = 690, message = "You cannot register as an attacker because you are in an alliance with the castle-owning clan.")
	public static SystemMessageId YOU_CANNOT_REGISTER_AS_AN_ATTACKER_BECAUSE_YOU_ARE_IN_AN_ALLIANCE_WITH_THE_CASTLE_OWNING_CLAN;
	
	@ClientString(id = 691, message = "$s1 clan is already a member of $s2 alliance.")
	public static SystemMessageId S1_CLAN_IS_ALREADY_A_MEMBER_OF_S2_ALLIANCE;
	
	@ClientString(id = 692, message = "The other party is frozen. Please wait a moment.")
	public static SystemMessageId THE_OTHER_PARTY_IS_FROZEN_PLEASE_WAIT_A_MOMENT;
	
	@ClientString(id = 693, message = "The package that arrived is in another warehouse.")
	public static SystemMessageId THE_PACKAGE_THAT_ARRIVED_IS_IN_ANOTHER_WAREHOUSE;
	
	@ClientString(id = 694, message = "No packages have arrived.")
	public static SystemMessageId NO_PACKAGES_HAVE_ARRIVED;
	
	@ClientString(id = 695, message = "You cannot set the name of the pet.")
	public static SystemMessageId YOU_CANNOT_SET_THE_NAME_OF_THE_PET;
	
	@ClientString(id = 696, message = "Your account is restricted for not paying your PC room usage fees.")
	public static SystemMessageId YOUR_ACCOUNT_IS_RESTRICTED_FOR_NOT_PAYING_YOUR_PC_ROOM_USAGE_FEES;
	
	@ClientString(id = 697, message = "The item enchant value is strange.")
	public static SystemMessageId THE_ITEM_ENCHANT_VALUE_IS_STRANGE;
	
	@ClientString(id = 698, message = "The price is different than the same item on the sales list.")
	public static SystemMessageId THE_PRICE_IS_DIFFERENT_THAN_THE_SAME_ITEM_ON_THE_SALES_LIST;
	
	@ClientString(id = 699, message = "Currently not purchasing.")
	public static SystemMessageId CURRENTLY_NOT_PURCHASING;
	
	@ClientString(id = 700, message = "The purchase is complete.")
	public static SystemMessageId THE_PURCHASE_IS_COMPLETE;
	
	@ClientString(id = 701, message = "You do not have enough required items.")
	public static SystemMessageId YOU_DO_NOT_HAVE_ENOUGH_REQUIRED_ITEMS;
	
	@ClientString(id = 702, message = "There are no GMs currently visible in the public list as they may be performing other functions at the moment.")
	public static SystemMessageId THERE_ARE_NO_GMS_CURRENTLY_VISIBLE_IN_THE_PUBLIC_LIST_AS_THEY_MAY_BE_PERFORMING_OTHER_FUNCTIONS_AT_THE_MOMENT;
	
	@ClientString(id = 703, message = "======(GM List)======")
	public static SystemMessageId GM_LIST;
	
	@ClientString(id = 704, message = "GM : $c1")
	public static SystemMessageId GM_C1;
	
	@ClientString(id = 705, message = "You cannot exclude yourself.")
	public static SystemMessageId YOU_CANNOT_EXCLUDE_YOURSELF;
	
	@ClientString(id = 706, message = "You can only enter up to 128 names in your block list.")
	public static SystemMessageId YOU_CAN_ONLY_ENTER_UP_TO_128_NAMES_IN_YOUR_BLOCK_LIST;
	
	@ClientString(id = 707, message = "You cannot teleport to a village that is in a siege.")
	public static SystemMessageId YOU_CANNOT_TELEPORT_TO_A_VILLAGE_THAT_IS_IN_A_SIEGE;
	
	@ClientString(id = 708, message = "You do not have the right to use the castle warehouse.")
	public static SystemMessageId YOU_DO_NOT_HAVE_THE_RIGHT_TO_USE_THE_CASTLE_WAREHOUSE;
	
	@ClientString(id = 709, message = "You do not have the right to use the clan warehouse.")
	public static SystemMessageId YOU_DO_NOT_HAVE_THE_RIGHT_TO_USE_THE_CLAN_WAREHOUSE;
	
	@ClientString(id = 710, message = "Only clans of clan level 1 or above can use a clan warehouse.")
	public static SystemMessageId ONLY_CLANS_OF_CLAN_LEVEL_1_OR_ABOVE_CAN_USE_A_CLAN_WAREHOUSE;
	
	@ClientString(id = 711, message = "The $s1 siege has started.")
	public static SystemMessageId THE_S1_SIEGE_HAS_STARTED;
	
	@ClientString(id = 712, message = "The $s1 siege has finished.")
	public static SystemMessageId THE_S1_SIEGE_HAS_FINISHED;
	
	@ClientString(id = 713, message = "$s1/$s2/$s3 $s4:$s5")
	public static SystemMessageId S1_S2_S3_S4_S5;
	
	@ClientString(id = 714, message = "A trap device has been tripped.")
	public static SystemMessageId A_TRAP_DEVICE_HAS_BEEN_TRIPPED;
	
	@ClientString(id = 715, message = "The trap device has been stopped.")
	public static SystemMessageId THE_TRAP_DEVICE_HAS_BEEN_STOPPED;
	
	@ClientString(id = 716, message = "If a base camp does not exist, resurrection is not possible.")
	public static SystemMessageId IF_A_BASE_CAMP_DOES_NOT_EXIST_RESURRECTION_IS_NOT_POSSIBLE;
	
	@ClientString(id = 717, message = "The guardian tower has been destroyed and resurrection is not possible.")
	public static SystemMessageId THE_GUARDIAN_TOWER_HAS_BEEN_DESTROYED_AND_RESURRECTION_IS_NOT_POSSIBLE;
	
	@ClientString(id = 718, message = "The castle gates cannot be opened and closed during a siege.")
	public static SystemMessageId THE_CASTLE_GATES_CANNOT_BE_OPENED_AND_CLOSED_DURING_A_SIEGE;
	
	@ClientString(id = 719, message = "You failed at mixing the item.")
	public static SystemMessageId YOU_FAILED_AT_MIXING_THE_ITEM;
	
	@ClientString(id = 720, message = "The purchase price is higher than the amount of money that you have and so you cannot open a personal store.")
	public static SystemMessageId THE_PURCHASE_PRICE_IS_HIGHER_THAN_THE_AMOUNT_OF_MONEY_THAT_YOU_HAVE_AND_SO_YOU_CANNOT_OPEN_A_PERSONAL_STORE;
	
	@ClientString(id = 721, message = "You cannot create an alliance while participating in a siege.")
	public static SystemMessageId YOU_CANNOT_CREATE_AN_ALLIANCE_WHILE_PARTICIPATING_IN_A_SIEGE;
	
	@ClientString(id = 722, message = "You cannot dissolve an alliance while an affiliated clan is participating in a siege battle.")
	public static SystemMessageId YOU_CANNOT_DISSOLVE_AN_ALLIANCE_WHILE_AN_AFFILIATED_CLAN_IS_PARTICIPATING_IN_A_SIEGE_BATTLE;
	
	@ClientString(id = 723, message = "The opposing clan is participating in a siege battle.")
	public static SystemMessageId THE_OPPOSING_CLAN_IS_PARTICIPATING_IN_A_SIEGE_BATTLE;
	
	@ClientString(id = 724, message = "You cannot leave while participating in a siege battle.")
	public static SystemMessageId YOU_CANNOT_LEAVE_WHILE_PARTICIPATING_IN_A_SIEGE_BATTLE;
	
	@ClientString(id = 725, message = "You cannot banish a clan from an alliance while the clan is participating in a siege.")
	public static SystemMessageId YOU_CANNOT_BANISH_A_CLAN_FROM_AN_ALLIANCE_WHILE_THE_CLAN_IS_PARTICIPATING_IN_A_SIEGE;
	
	@ClientString(id = 726, message = "The frozen condition has started. Please wait a moment.")
	public static SystemMessageId THE_FROZEN_CONDITION_HAS_STARTED_PLEASE_WAIT_A_MOMENT;
	
	@ClientString(id = 727, message = "The frozen condition was removed.")
	public static SystemMessageId THE_FROZEN_CONDITION_WAS_REMOVED;
	
	@ClientString(id = 728, message = "You cannot apply for dissolution again within seven days after a previous application for dissolution.")
	public static SystemMessageId YOU_CANNOT_APPLY_FOR_DISSOLUTION_AGAIN_WITHIN_SEVEN_DAYS_AFTER_A_PREVIOUS_APPLICATION_FOR_DISSOLUTION;
	
	@ClientString(id = 729, message = "That item cannot be discarded.")
	public static SystemMessageId THAT_ITEM_CANNOT_BE_DISCARDED;
	
	@ClientString(id = 730, message = "You have submitted $s1 petition(s). nYou may submit $s2 more petition(s) today.")
	public static SystemMessageId YOU_HAVE_SUBMITTED_S1_PETITION_S_NYOU_MAY_SUBMIT_S2_MORE_PETITION_S_TODAY;
	
	@ClientString(id = 731, message = "A petition has been received by the GM on behalf of $s1. The petition code is $s2.")
	public static SystemMessageId A_PETITION_HAS_BEEN_RECEIVED_BY_THE_GM_ON_BEHALF_OF_S1_THE_PETITION_CODE_IS_S2;
	
	@ClientString(id = 732, message = "$c1 has received a request for a consultation with the GM.")
	public static SystemMessageId C1_HAS_RECEIVED_A_REQUEST_FOR_A_CONSULTATION_WITH_THE_GM;
	
	@ClientString(id = 733, message = "We have received $s1 petitions from you today and that is the maximum that you can submit in one day. You cannot submit any more petitions.")
	public static SystemMessageId WE_HAVE_RECEIVED_S1_PETITIONS_FROM_YOU_TODAY_AND_THAT_IS_THE_MAXIMUM_THAT_YOU_CAN_SUBMIT_IN_ONE_DAY_YOU_CANNOT_SUBMIT_ANY_MORE_PETITIONS;
	
	@ClientString(id = 734, message = "You have failed at submitting a petition on behalf of someone else. $c1 already submitted a petition.")
	public static SystemMessageId YOU_HAVE_FAILED_AT_SUBMITTING_A_PETITION_ON_BEHALF_OF_SOMEONE_ELSE_C1_ALREADY_SUBMITTED_A_PETITION;
	
	@ClientString(id = 735, message = "You have failed at submitting a petition on behalf of $c1. The error number is $s2.")
	public static SystemMessageId YOU_HAVE_FAILED_AT_SUBMITTING_A_PETITION_ON_BEHALF_OF_C1_THE_ERROR_NUMBER_IS_S2;
	
	@ClientString(id = 736, message = "The petition was canceled. You may submit $s1 more petition(s) today.")
	public static SystemMessageId THE_PETITION_WAS_CANCELED_YOU_MAY_SUBMIT_S1_MORE_PETITION_S_TODAY;
	
	@ClientString(id = 737, message = "You have cancelled submitting a petition on behalf of $s1.")
	public static SystemMessageId YOU_HAVE_CANCELLED_SUBMITTING_A_PETITION_ON_BEHALF_OF_S1;
	
	@ClientString(id = 738, message = "You have not submitted a petition.")
	public static SystemMessageId YOU_HAVE_NOT_SUBMITTED_A_PETITION;
	
	@ClientString(id = 739, message = "You have failed at cancelling a petition on behalf of $c1. The error code is $s2.")
	public static SystemMessageId YOU_HAVE_FAILED_AT_CANCELLING_A_PETITION_ON_BEHALF_OF_C1_THE_ERROR_CODE_IS_S2;
	
	@ClientString(id = 740, message = "$c1 participated in a petition chat at the request of the GM.")
	public static SystemMessageId C1_PARTICIPATED_IN_A_PETITION_CHAT_AT_THE_REQUEST_OF_THE_GM;
	
	@ClientString(id = 741, message = "You have failed at adding $c1 to the petition chat. Petition has already been submitted.")
	public static SystemMessageId YOU_HAVE_FAILED_AT_ADDING_C1_TO_THE_PETITION_CHAT_PETITION_HAS_ALREADY_BEEN_SUBMITTED;
	
	@ClientString(id = 742, message = "You have failed at adding $c1 to the petition chat. The error code is $s2.")
	public static SystemMessageId YOU_HAVE_FAILED_AT_ADDING_C1_TO_THE_PETITION_CHAT_THE_ERROR_CODE_IS_S2;
	
	@ClientString(id = 743, message = "$c1 left the petition chat.")
	public static SystemMessageId C1_LEFT_THE_PETITION_CHAT;
	
	@ClientString(id = 744, message = "You failed at removing $s1 from the petition chat. The error code is $s2.")
	public static SystemMessageId YOU_FAILED_AT_REMOVING_S1_FROM_THE_PETITION_CHAT_THE_ERROR_CODE_IS_S2;
	
	@ClientString(id = 745, message = "You are currently not in a petition chat.")
	public static SystemMessageId YOU_ARE_CURRENTLY_NOT_IN_A_PETITION_CHAT;
	
	@ClientString(id = 746, message = "It is not currently a petition.")
	public static SystemMessageId IT_IS_NOT_CURRENTLY_A_PETITION;
	
	@ClientString(id = 747, message = "If you need help, please visit Lineage II's Support Website (https://support.lineage2.com).")
	public static SystemMessageId IF_YOU_NEED_HELP_PLEASE_VISIT_LINEAGE_II_S_SUPPORT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM;
	
	@ClientString(id = 748, message = "The distance is too far and so the casting has been stopped.")
	public static SystemMessageId THE_DISTANCE_IS_TOO_FAR_AND_SO_THE_CASTING_HAS_BEEN_STOPPED;
	
	@ClientString(id = 749, message = "The effect of $s1 has been removed.")
	public static SystemMessageId THE_EFFECT_OF_S1_HAS_BEEN_REMOVED;
	
	@ClientString(id = 750, message = "There are no other skills to learn.")
	public static SystemMessageId THERE_ARE_NO_OTHER_SKILLS_TO_LEARN;
	
	@ClientString(id = 751, message = "As there is a conflict in the siege relationship with a clan in the alliance, you cannot invite that clan to the alliance.")
	public static SystemMessageId AS_THERE_IS_A_CONFLICT_IN_THE_SIEGE_RELATIONSHIP_WITH_A_CLAN_IN_THE_ALLIANCE_YOU_CANNOT_INVITE_THAT_CLAN_TO_THE_ALLIANCE;
	
	@ClientString(id = 752, message = "That name cannot be used.")
	public static SystemMessageId THAT_NAME_CANNOT_BE_USED;
	
	@ClientString(id = 753, message = "You cannot position mercenaries here.")
	public static SystemMessageId YOU_CANNOT_POSITION_MERCENARIES_HERE;
	
	@ClientString(id = 754, message = "There are $s1 hour(s) and $s2 minute(s) left in this week's usage time.")
	public static SystemMessageId THERE_ARE_S1_HOUR_S_AND_S2_MINUTE_S_LEFT_IN_THIS_WEEK_S_USAGE_TIME;
	
	@ClientString(id = 755, message = "There are $s1 minute(s) left in this week's usage time.")
	public static SystemMessageId THERE_ARE_S1_MINUTE_S_LEFT_IN_THIS_WEEK_S_USAGE_TIME;
	
	@ClientString(id = 756, message = "This week's usage time has finished.")
	public static SystemMessageId THIS_WEEK_S_USAGE_TIME_HAS_FINISHED;
	
	@ClientString(id = 757, message = "There are $s1 hour(s) and $s2 minute(s) left in the fixed use time.")
	public static SystemMessageId THERE_ARE_S1_HOUR_S_AND_S2_MINUTE_S_LEFT_IN_THE_FIXED_USE_TIME;
	
	@ClientString(id = 758, message = "There are $s1 hour(s) $s2 minute(s) left in this week's play time.")
	public static SystemMessageId THERE_ARE_S1_HOUR_S_S2_MINUTE_S_LEFT_IN_THIS_WEEK_S_PLAY_TIME;
	
	@ClientString(id = 759, message = "There are $s1 minute(s) left in this week's play time.")
	public static SystemMessageId THERE_ARE_S1_MINUTE_S_LEFT_IN_THIS_WEEK_S_PLAY_TIME;
	
	@ClientString(id = 760, message = "$c1 cannot join the clan because one day has not yet passed since they left another clan.")
	public static SystemMessageId C1_CANNOT_JOIN_THE_CLAN_BECAUSE_ONE_DAY_HAS_NOT_YET_PASSED_SINCE_THEY_LEFT_ANOTHER_CLAN;
	
	@ClientString(id = 761, message = "$s1 clan cannot join the alliance because one day has not yet passed since they left another alliance.")
	public static SystemMessageId S1_CLAN_CANNOT_JOIN_THE_ALLIANCE_BECAUSE_ONE_DAY_HAS_NOT_YET_PASSED_SINCE_THEY_LEFT_ANOTHER_ALLIANCE;
	
	@ClientString(id = 762, message = "$c1 rolled $s2 and $s3 came out.")
	public static SystemMessageId C1_ROLLED_S2_AND_S3_CAME_OUT;
	
	@ClientString(id = 763, message = "You failed at sending the package because you are too far from the warehouse.")
	public static SystemMessageId YOU_FAILED_AT_SENDING_THE_PACKAGE_BECAUSE_YOU_ARE_TOO_FAR_FROM_THE_WAREHOUSE;
	
	@ClientString(id = 764, message = "You have played for $s1 hour(s). Please take a break.")
	public static SystemMessageId YOU_HAVE_PLAYED_FOR_S1_HOUR_S_PLEASE_TAKE_A_BREAK;
	
	@ClientString(id = 765, message = "GameGuard is already running. Please try running it again after rebooting.")
	public static SystemMessageId GAMEGUARD_IS_ALREADY_RUNNING_PLEASE_TRY_RUNNING_IT_AGAIN_AFTER_REBOOTING;
	
	@ClientString(id = 766, message = "There is a GameGuard initialization error. Please try running it again after rebooting.")
	public static SystemMessageId THERE_IS_A_GAMEGUARD_INITIALIZATION_ERROR_PLEASE_TRY_RUNNING_IT_AGAIN_AFTER_REBOOTING;
	
	@ClientString(id = 767, message = "The GameGuard file is damaged. Please reinstall GameGuard.")
	public static SystemMessageId THE_GAMEGUARD_FILE_IS_DAMAGED_PLEASE_REINSTALL_GAMEGUARD;
	
	@ClientString(id = 768, message = "A Windows system file is damaged. Please reinstall Internet Explorer.")
	public static SystemMessageId A_WINDOWS_SYSTEM_FILE_IS_DAMAGED_PLEASE_REINSTALL_INTERNET_EXPLORER;
	
	@ClientString(id = 769, message = "A hacking tool has been discovered. Please try playing again after closing unnecessary programs.")
	public static SystemMessageId A_HACKING_TOOL_HAS_BEEN_DISCOVERED_PLEASE_TRY_PLAYING_AGAIN_AFTER_CLOSING_UNNECESSARY_PROGRAMS;
	
	@ClientString(id = 770, message = "The GameGuard update was canceled. Please check your network connection status or firewall.")
	public static SystemMessageId THE_GAMEGUARD_UPDATE_WAS_CANCELED_PLEASE_CHECK_YOUR_NETWORK_CONNECTION_STATUS_OR_FIREWALL;
	
	@ClientString(id = 771, message = "The GameGuard update was canceled. Please try running it again after doing a virus scan or changing the settings in your PC management program.")
	public static SystemMessageId THE_GAMEGUARD_UPDATE_WAS_CANCELED_PLEASE_TRY_RUNNING_IT_AGAIN_AFTER_DOING_A_VIRUS_SCAN_OR_CHANGING_THE_SETTINGS_IN_YOUR_PC_MANAGEMENT_PROGRAM;
	
	@ClientString(id = 772, message = "There was a problem when running GameGuard.")
	public static SystemMessageId THERE_WAS_A_PROBLEM_WHEN_RUNNING_GAMEGUARD;
	
	@ClientString(id = 773, message = "The game or GameGuard files are damaged.")
	public static SystemMessageId THE_GAME_OR_GAMEGUARD_FILES_ARE_DAMAGED;
	
	@ClientString(id = 774, message = "Play time is no longer accumulating.")
	public static SystemMessageId PLAY_TIME_IS_NO_LONGER_ACCUMULATING;
	
	@ClientString(id = 775, message = "From here on, play time will be expended.")
	public static SystemMessageId FROM_HERE_ON_PLAY_TIME_WILL_BE_EXPENDED;
	
	@ClientString(id = 776, message = "The clan hall which was put up for auction has been awarded to $s1 clan.")
	public static SystemMessageId THE_CLAN_HALL_WHICH_WAS_PUT_UP_FOR_AUCTION_HAS_BEEN_AWARDED_TO_S1_CLAN;
	
	@ClientString(id = 777, message = "The clan hall which had been put up for auction was not sold and therefore has been re-listed.")
	public static SystemMessageId THE_CLAN_HALL_WHICH_HAD_BEEN_PUT_UP_FOR_AUCTION_WAS_NOT_SOLD_AND_THEREFORE_HAS_BEEN_RE_LISTED;
	
	@ClientString(id = 778, message = "You may not log out from this location.")
	public static SystemMessageId YOU_MAY_NOT_LOG_OUT_FROM_THIS_LOCATION;
	
	@ClientString(id = 779, message = "You may not restart in this location.")
	public static SystemMessageId YOU_MAY_NOT_RESTART_IN_THIS_LOCATION;
	
	@ClientString(id = 780, message = "Observation is only possible during a siege.")
	public static SystemMessageId OBSERVATION_IS_ONLY_POSSIBLE_DURING_A_SIEGE;
	
	@ClientString(id = 781, message = "Observers cannot participate.")
	public static SystemMessageId OBSERVERS_CANNOT_PARTICIPATE;
	
	@ClientString(id = 782, message = "You may not observe a siege with a pet or servitor summoned.")
	public static SystemMessageId YOU_MAY_NOT_OBSERVE_A_SIEGE_WITH_A_PET_OR_SERVITOR_SUMMONED;
	
	@ClientString(id = 783, message = "Lottery ticket sales have been temporarily suspended.")
	public static SystemMessageId LOTTERY_TICKET_SALES_HAVE_BEEN_TEMPORARILY_SUSPENDED;
	
	@ClientString(id = 784, message = "Tickets for the current lottery are no longer available.")
	public static SystemMessageId TICKETS_FOR_THE_CURRENT_LOTTERY_ARE_NO_LONGER_AVAILABLE;
	
	@ClientString(id = 785, message = "The results of lottery number $s1 have not yet been published.")
	public static SystemMessageId THE_RESULTS_OF_LOTTERY_NUMBER_S1_HAVE_NOT_YET_BEEN_PUBLISHED;
	
	@ClientString(id = 786, message = "Incorrect syntax.")
	public static SystemMessageId INCORRECT_SYNTAX;
	
	@ClientString(id = 787, message = "The tryouts are finished.")
	public static SystemMessageId THE_TRYOUTS_ARE_FINISHED;
	
	@ClientString(id = 788, message = "The finals are finished.")
	public static SystemMessageId THE_FINALS_ARE_FINISHED;
	
	@ClientString(id = 789, message = "The tryouts have begun.")
	public static SystemMessageId THE_TRYOUTS_HAVE_BEGUN;
	
	@ClientString(id = 790, message = "The finals have begun.")
	public static SystemMessageId THE_FINALS_HAVE_BEGUN;
	
	@ClientString(id = 791, message = "The final match is about to begin. Line up!")
	public static SystemMessageId THE_FINAL_MATCH_IS_ABOUT_TO_BEGIN_LINE_UP;
	
	@ClientString(id = 792, message = "The siege of the clan hall is finished.")
	public static SystemMessageId THE_SIEGE_OF_THE_CLAN_HALL_IS_FINISHED;
	
	@ClientString(id = 793, message = "The siege of the clan hall has begun.")
	public static SystemMessageId THE_SIEGE_OF_THE_CLAN_HALL_HAS_BEGUN;
	
	@ClientString(id = 794, message = "You are not authorized to do that.")
	public static SystemMessageId YOU_ARE_NOT_AUTHORIZED_TO_DO_THAT;
	
	@ClientString(id = 795, message = "Only clan leaders are authorized to set rights.")
	public static SystemMessageId ONLY_CLAN_LEADERS_ARE_AUTHORIZED_TO_SET_RIGHTS;
	
	@ClientString(id = 796, message = "Your remaining observation time is $s1 minute(s).")
	public static SystemMessageId YOUR_REMAINING_OBSERVATION_TIME_IS_S1_MINUTE_S;
	
	@ClientString(id = 797, message = "You may create up to 48 macros.")
	public static SystemMessageId YOU_MAY_CREATE_UP_TO_48_MACROS;
	
	@ClientString(id = 798, message = "Item registration is irreversible. Do you wish to continue?")
	public static SystemMessageId ITEM_REGISTRATION_IS_IRREVERSIBLE_DO_YOU_WISH_TO_CONTINUE;
	
	@ClientString(id = 799, message = "The observation time has expired.")
	public static SystemMessageId THE_OBSERVATION_TIME_HAS_EXPIRED;
	
	@ClientString(id = 800, message = "You are too late. The registration period is over.")
	public static SystemMessageId YOU_ARE_TOO_LATE_THE_REGISTRATION_PERIOD_IS_OVER;
	
	@ClientString(id = 801, message = "Registration for the clan hall siege is closed.")
	public static SystemMessageId REGISTRATION_FOR_THE_CLAN_HALL_SIEGE_IS_CLOSED;
	
	@ClientString(id = 802, message = "Petitions are not being accepted at this time. You may submit your petition after $s1 a.m./p.m.")
	public static SystemMessageId PETITIONS_ARE_NOT_BEING_ACCEPTED_AT_THIS_TIME_YOU_MAY_SUBMIT_YOUR_PETITION_AFTER_S1_A_M_P_M;
	
	@ClientString(id = 803, message = "Enter the specifics of your petition.")
	public static SystemMessageId ENTER_THE_SPECIFICS_OF_YOUR_PETITION;
	
	@ClientString(id = 804, message = "Select your type and check the FAQ content.")
	public static SystemMessageId SELECT_YOUR_TYPE_AND_CHECK_THE_FAQ_CONTENT;
	
	@ClientString(id = 805, message = "Petitions are not being accepted at this time. You may submit your petition after $s1 a.m./p.m.")
	public static SystemMessageId PETITIONS_ARE_NOT_BEING_ACCEPTED_AT_THIS_TIME_YOU_MAY_SUBMIT_YOUR_PETITION_AFTER_S1_A_M_P_M2;
	
	@ClientString(id = 806, message = "If you are unable to move, try typing '/unstuck'.")
	public static SystemMessageId IF_YOU_ARE_UNABLE_TO_MOVE_TRY_TYPING_UNSTUCK;
	
	@ClientString(id = 807, message = "This terrain is navigable. Prepare for transport to the nearest village.")
	public static SystemMessageId THIS_TERRAIN_IS_NAVIGABLE_PREPARE_FOR_TRANSPORT_TO_THE_NEAREST_VILLAGE;
	
	@ClientString(id = 808, message = "You are stuck. You may submit a petition by typing (/gm).")
	public static SystemMessageId YOU_ARE_STUCK_YOU_MAY_SUBMIT_A_PETITION_BY_TYPING_GM;
	
	@ClientString(id = 809, message = "You are stuck. You will be transported to the nearest village in five minutes.")
	public static SystemMessageId YOU_ARE_STUCK_YOU_WILL_BE_TRANSPORTED_TO_THE_NEAREST_VILLAGE_IN_FIVE_MINUTES;
	
	@ClientString(id = 810, message = "Invalid macro. Refer to the Help file for instructions.")
	public static SystemMessageId INVALID_MACRO_REFER_TO_THE_HELP_FILE_FOR_INSTRUCTIONS;
	
	@ClientString(id = 811, message = "You have requested a teleport to ($s1). Do you wish to continue?")
	public static SystemMessageId YOU_HAVE_REQUESTED_A_TELEPORT_TO_S1_DO_YOU_WISH_TO_CONTINUE;
	
	@ClientString(id = 812, message = "The secret trap has inflicted $s1 damage on you.")
	public static SystemMessageId THE_SECRET_TRAP_HAS_INFLICTED_S1_DAMAGE_ON_YOU;
	
	@ClientString(id = 813, message = "You have been poisoned by a Secret Trap.")
	public static SystemMessageId YOU_HAVE_BEEN_POISONED_BY_A_SECRET_TRAP;
	
	@ClientString(id = 814, message = "Your speed has been decreased by a Secret Trap.")
	public static SystemMessageId YOUR_SPEED_HAS_BEEN_DECREASED_BY_A_SECRET_TRAP;
	
	@ClientString(id = 815, message = "The tryouts are about to begin. Line up!")
	public static SystemMessageId THE_TRYOUTS_ARE_ABOUT_TO_BEGIN_LINE_UP;
	
	@ClientString(id = 816, message = "Tickets are now available for Monster Race $s1!")
	public static SystemMessageId TICKETS_ARE_NOW_AVAILABLE_FOR_MONSTER_RACE_S1;
	
	@ClientString(id = 817, message = "Now selling tickets for Monster Race $s1!")
	public static SystemMessageId NOW_SELLING_TICKETS_FOR_MONSTER_RACE_S1;
	
	@ClientString(id = 818, message = "Ticket sales for the Monster Race will end in $s1 minute(s).")
	public static SystemMessageId TICKET_SALES_FOR_THE_MONSTER_RACE_WILL_END_IN_S1_MINUTE_S;
	
	@ClientString(id = 819, message = "Tickets sales are closed for Monster Race $s1. Odds are posted.")
	public static SystemMessageId TICKETS_SALES_ARE_CLOSED_FOR_MONSTER_RACE_S1_ODDS_ARE_POSTED;
	
	@ClientString(id = 820, message = "Monster Race $s2 will begin in $s1 minute(s)!")
	public static SystemMessageId MONSTER_RACE_S2_WILL_BEGIN_IN_S1_MINUTE_S;
	
	@ClientString(id = 821, message = "Monster Race $s1 will begin in 30 seconds!")
	public static SystemMessageId MONSTER_RACE_S1_WILL_BEGIN_IN_30_SECONDS;
	
	@ClientString(id = 822, message = "Monster Race $s1 is about to begin! Countdown in five seconds!")
	public static SystemMessageId MONSTER_RACE_S1_IS_ABOUT_TO_BEGIN_COUNTDOWN_IN_FIVE_SECONDS;
	
	@ClientString(id = 823, message = "The race will begin in $s1 second(s)!")
	public static SystemMessageId THE_RACE_WILL_BEGIN_IN_S1_SECOND_S;
	
	@ClientString(id = 824, message = "They're off!")
	public static SystemMessageId THEY_RE_OFF;
	
	@ClientString(id = 825, message = "Monster Race $s1 is finished!")
	public static SystemMessageId MONSTER_RACE_S1_IS_FINISHED;
	
	@ClientString(id = 826, message = "First prize goes to the player in lane $s1. Second prize goes to the player in lane $s2.")
	public static SystemMessageId FIRST_PRIZE_GOES_TO_THE_PLAYER_IN_LANE_S1_SECOND_PRIZE_GOES_TO_THE_PLAYER_IN_LANE_S2;
	
	@ClientString(id = 827, message = "You may not impose a block on a GM.")
	public static SystemMessageId YOU_MAY_NOT_IMPOSE_A_BLOCK_ON_A_GM;
	
	@ClientString(id = 828, message = "Are you sure you wish to delete the $s1 macro?")
	public static SystemMessageId ARE_YOU_SURE_YOU_WISH_TO_DELETE_THE_S1_MACRO;
	
	@ClientString(id = 829, message = "You cannot recommend yourself.")
	public static SystemMessageId YOU_CANNOT_RECOMMEND_YOURSELF;
	
	@ClientString(id = 830, message = "You have recommended $c1. You have $s2 recommendations left.")
	public static SystemMessageId YOU_HAVE_RECOMMENDED_C1_YOU_HAVE_S2_RECOMMENDATIONS_LEFT;
	
	@ClientString(id = 831, message = "You have been recommended by $c1.")
	public static SystemMessageId YOU_HAVE_BEEN_RECOMMENDED_BY_C1;
	
	@ClientString(id = 832, message = "That character has already been recommended.")
	public static SystemMessageId THAT_CHARACTER_HAS_ALREADY_BEEN_RECOMMENDED;
	
	@ClientString(id = 833, message = "You are not authorized to make further recommendations at this time. You will receive more recommendation credits each day at 1 p.m.")
	public static SystemMessageId YOU_ARE_NOT_AUTHORIZED_TO_MAKE_FURTHER_RECOMMENDATIONS_AT_THIS_TIME_YOU_WILL_RECEIVE_MORE_RECOMMENDATION_CREDITS_EACH_DAY_AT_1_P_M;
	
	@ClientString(id = 834, message = "$c1 has rolled a $s2.")
	public static SystemMessageId C1_HAS_ROLLED_A_S2;
	
	@ClientString(id = 835, message = "You may not throw the dice at this time. Try again later.")
	public static SystemMessageId YOU_MAY_NOT_THROW_THE_DICE_AT_THIS_TIME_TRY_AGAIN_LATER;
	
	@ClientString(id = 836, message = "You have exceeded your inventory volume limit and cannot take this item.")
	public static SystemMessageId YOU_HAVE_EXCEEDED_YOUR_INVENTORY_VOLUME_LIMIT_AND_CANNOT_TAKE_THIS_ITEM;
	
	@ClientString(id = 837, message = "Macro descriptions may contain up to 32 characters.")
	public static SystemMessageId MACRO_DESCRIPTIONS_MAY_CONTAIN_UP_TO_32_CHARACTERS;
	
	@ClientString(id = 838, message = "Enter the name of the macro.")
	public static SystemMessageId ENTER_THE_NAME_OF_THE_MACRO;
	
	@ClientString(id = 839, message = "That name is already assigned to another macro.")
	public static SystemMessageId THAT_NAME_IS_ALREADY_ASSIGNED_TO_ANOTHER_MACRO;
	
	@ClientString(id = 840, message = "That recipe is already registered.")
	public static SystemMessageId THAT_RECIPE_IS_ALREADY_REGISTERED;
	
	@ClientString(id = 841, message = "No further recipes may be registered.")
	public static SystemMessageId NO_FURTHER_RECIPES_MAY_BE_REGISTERED;
	
	@ClientString(id = 842, message = "You are not authorized to register a recipe.")
	public static SystemMessageId YOU_ARE_NOT_AUTHORIZED_TO_REGISTER_A_RECIPE;
	
	@ClientString(id = 843, message = "The siege of $s1 is finished.")
	public static SystemMessageId THE_SIEGE_OF_S1_IS_FINISHED;
	
	@ClientString(id = 844, message = "The siege to conquer $s1 has begun.")
	public static SystemMessageId THE_SIEGE_TO_CONQUER_S1_HAS_BEGUN;
	
	@ClientString(id = 845, message = "The deadline to register for the siege of $s1 has passed.")
	public static SystemMessageId THE_DEADLINE_TO_REGISTER_FOR_THE_SIEGE_OF_S1_HAS_PASSED;
	
	@ClientString(id = 846, message = "The siege of $s1 has been canceled due to lack of interest.")
	public static SystemMessageId THE_SIEGE_OF_S1_HAS_BEEN_CANCELED_DUE_TO_LACK_OF_INTEREST;
	
	@ClientString(id = 847, message = "A clan that owns a clan hall may not participate in a clan hall siege.")
	public static SystemMessageId A_CLAN_THAT_OWNS_A_CLAN_HALL_MAY_NOT_PARTICIPATE_IN_A_CLAN_HALL_SIEGE;
	
	@ClientString(id = 848, message = "$s1 has been deleted.")
	public static SystemMessageId S1_HAS_BEEN_DELETED;
	
	@ClientString(id = 849, message = "$s1 cannot be found.")
	public static SystemMessageId S1_CANNOT_BE_FOUND;
	
	@ClientString(id = 850, message = "$s1 already exists.")
	public static SystemMessageId S1_ALREADY_EXISTS2;
	
	@ClientString(id = 851, message = "$s1 has been added.")
	public static SystemMessageId S1_HAS_BEEN_ADDED;
	
	@ClientString(id = 852, message = "The recipe is incorrect.")
	public static SystemMessageId THE_RECIPE_IS_INCORRECT;
	
	@ClientString(id = 853, message = "You may not alter your recipe book while engaged in manufacturing.")
	public static SystemMessageId YOU_MAY_NOT_ALTER_YOUR_RECIPE_BOOK_WHILE_ENGAGED_IN_MANUFACTURING;
	
	@ClientString(id = 854, message = "You need $s2 more $s1(s).")
	public static SystemMessageId YOU_NEED_S2_MORE_S1_S;
	
	@ClientString(id = 855, message = "$s1 clan has defeated $s2.")
	public static SystemMessageId S1_CLAN_HAS_DEFEATED_S2;
	
	@ClientString(id = 856, message = "The siege of $s1 has ended in a draw.")
	public static SystemMessageId THE_SIEGE_OF_S1_HAS_ENDED_IN_A_DRAW;
	
	@ClientString(id = 857, message = "$s1 clan has won in the preliminary match of $s2.")
	public static SystemMessageId S1_CLAN_HAS_WON_IN_THE_PRELIMINARY_MATCH_OF_S2;
	
	@ClientString(id = 858, message = "The preliminary match of $s1 has ended in a draw.")
	public static SystemMessageId THE_PRELIMINARY_MATCH_OF_S1_HAS_ENDED_IN_A_DRAW;
	
	@ClientString(id = 859, message = "Please register a recipe.")
	public static SystemMessageId PLEASE_REGISTER_A_RECIPE;
	
	@ClientString(id = 860, message = "You may not build your headquarters in close proximity to another headquarters.")
	public static SystemMessageId YOU_MAY_NOT_BUILD_YOUR_HEADQUARTERS_IN_CLOSE_PROXIMITY_TO_ANOTHER_HEADQUARTERS;
	
	@ClientString(id = 861, message = "You have exceeded the maximum number of memos.")
	public static SystemMessageId YOU_HAVE_EXCEEDED_THE_MAXIMUM_NUMBER_OF_MEMOS;
	
	@ClientString(id = 862, message = "Odds are not posted until ticket sales have closed.")
	public static SystemMessageId ODDS_ARE_NOT_POSTED_UNTIL_TICKET_SALES_HAVE_CLOSED;
	
	@ClientString(id = 863, message = "You feel the energy of fire.")
	public static SystemMessageId YOU_FEEL_THE_ENERGY_OF_FIRE;
	
	@ClientString(id = 864, message = "You feel the energy of water.")
	public static SystemMessageId YOU_FEEL_THE_ENERGY_OF_WATER;
	
	@ClientString(id = 865, message = "You feel the energy of wind.")
	public static SystemMessageId YOU_FEEL_THE_ENERGY_OF_WIND;
	
	@ClientString(id = 866, message = "You may no longer gather energy.")
	public static SystemMessageId YOU_MAY_NO_LONGER_GATHER_ENERGY;
	
	@ClientString(id = 867, message = "The energy is depleted.")
	public static SystemMessageId THE_ENERGY_IS_DEPLETED;
	
	@ClientString(id = 868, message = "The energy of fire has been delivered.")
	public static SystemMessageId THE_ENERGY_OF_FIRE_HAS_BEEN_DELIVERED;
	
	@ClientString(id = 869, message = "The energy of water has been delivered.")
	public static SystemMessageId THE_ENERGY_OF_WATER_HAS_BEEN_DELIVERED;
	
	@ClientString(id = 870, message = "The energy of wind has been delivered.")
	public static SystemMessageId THE_ENERGY_OF_WIND_HAS_BEEN_DELIVERED;
	
	@ClientString(id = 871, message = "The seed has been sown.")
	public static SystemMessageId THE_SEED_HAS_BEEN_SOWN;
	
	@ClientString(id = 872, message = "This seed may not be sown here.")
	public static SystemMessageId THIS_SEED_MAY_NOT_BE_SOWN_HERE;
	
	@ClientString(id = 873, message = "That character does not exist.")
	public static SystemMessageId THAT_CHARACTER_DOES_NOT_EXIST;
	
	@ClientString(id = 874, message = "The capacity of the warehouse has been exceeded.")
	public static SystemMessageId THE_CAPACITY_OF_THE_WAREHOUSE_HAS_BEEN_EXCEEDED;
	
	@ClientString(id = 875, message = "The transport of the cargo has been canceled.")
	public static SystemMessageId THE_TRANSPORT_OF_THE_CARGO_HAS_BEEN_CANCELED;
	
	@ClientString(id = 876, message = "The cargo was not delivered.")
	public static SystemMessageId THE_CARGO_WAS_NOT_DELIVERED;
	
	@ClientString(id = 877, message = "The symbol has been added.")
	public static SystemMessageId THE_SYMBOL_HAS_BEEN_ADDED;
	
	@ClientString(id = 878, message = "The symbol has been deleted.")
	public static SystemMessageId THE_SYMBOL_HAS_BEEN_DELETED;
	
	@ClientString(id = 879, message = "The manor system is currently under maintenance.")
	public static SystemMessageId THE_MANOR_SYSTEM_IS_CURRENTLY_UNDER_MAINTENANCE;
	
	@ClientString(id = 880, message = "The transaction is complete.")
	public static SystemMessageId THE_TRANSACTION_IS_COMPLETE;
	
	@ClientString(id = 881, message = "There is a discrepancy on the invoice.")
	public static SystemMessageId THERE_IS_A_DISCREPANCY_ON_THE_INVOICE;
	
	@ClientString(id = 882, message = "The seed quantity is incorrect.")
	public static SystemMessageId THE_SEED_QUANTITY_IS_INCORRECT;
	
	@ClientString(id = 883, message = "The seed information is incorrect.")
	public static SystemMessageId THE_SEED_INFORMATION_IS_INCORRECT;
	
	@ClientString(id = 884, message = "The manor information has been updated.")
	public static SystemMessageId THE_MANOR_INFORMATION_HAS_BEEN_UPDATED;
	
	@ClientString(id = 885, message = "The number of crops is incorrect.")
	public static SystemMessageId THE_NUMBER_OF_CROPS_IS_INCORRECT;
	
	@ClientString(id = 886, message = "The crops are priced incorrectly.")
	public static SystemMessageId THE_CROPS_ARE_PRICED_INCORRECTLY;
	
	@ClientString(id = 887, message = "The type is incorrect.")
	public static SystemMessageId THE_TYPE_IS_INCORRECT;
	
	@ClientString(id = 888, message = "No crops can be purchased at this time.")
	public static SystemMessageId NO_CROPS_CAN_BE_PURCHASED_AT_THIS_TIME;
	
	@ClientString(id = 889, message = "The seed was successfully sown.")
	public static SystemMessageId THE_SEED_WAS_SUCCESSFULLY_SOWN;
	
	@ClientString(id = 890, message = "The seed was not sown.")
	public static SystemMessageId THE_SEED_WAS_NOT_SOWN;
	
	@ClientString(id = 891, message = "You are not authorized to harvest.")
	public static SystemMessageId YOU_ARE_NOT_AUTHORIZED_TO_HARVEST;
	
	@ClientString(id = 892, message = "The harvest has failed.")
	public static SystemMessageId THE_HARVEST_HAS_FAILED;
	
	@ClientString(id = 893, message = "The harvest failed because the seed was not sown.")
	public static SystemMessageId THE_HARVEST_FAILED_BECAUSE_THE_SEED_WAS_NOT_SOWN;
	
	@ClientString(id = 894, message = "Up to $s1 recipes can be registered.")
	public static SystemMessageId UP_TO_S1_RECIPES_CAN_BE_REGISTERED;
	
	@ClientString(id = 895, message = "No recipes have been registered.")
	public static SystemMessageId NO_RECIPES_HAVE_BEEN_REGISTERED;
	
	@ClientString(id = 896, message = "Quest recipes can not be registered.")
	public static SystemMessageId QUEST_RECIPES_CAN_NOT_BE_REGISTERED;
	
	@ClientString(id = 897, message = "The fee to create the item is incorrect.")
	public static SystemMessageId THE_FEE_TO_CREATE_THE_ITEM_IS_INCORRECT;
	
	@ClientString(id = 898, message = "Only characters level 10 or above are authorized to make recommendations.")
	public static SystemMessageId ONLY_CHARACTERS_LEVEL_10_OR_ABOVE_ARE_AUTHORIZED_TO_MAKE_RECOMMENDATIONS;
	
	@ClientString(id = 899, message = "The symbol cannot be drawn.")
	public static SystemMessageId THE_SYMBOL_CANNOT_BE_DRAWN;
	
	@ClientString(id = 900, message = "No slot exists to draw the symbol.")
	public static SystemMessageId NO_SLOT_EXISTS_TO_DRAW_THE_SYMBOL;
	
	@ClientString(id = 901, message = "The symbol information cannot be found.")
	public static SystemMessageId THE_SYMBOL_INFORMATION_CANNOT_BE_FOUND;
	
	@ClientString(id = 902, message = "You don't possess the correct number of items.")
	public static SystemMessageId YOU_DON_T_POSSESS_THE_CORRECT_NUMBER_OF_ITEMS;
	
	@ClientString(id = 903, message = "You may not submit a petition while frozen. Be patient.")
	public static SystemMessageId YOU_MAY_NOT_SUBMIT_A_PETITION_WHILE_FROZEN_BE_PATIENT;
	
	@ClientString(id = 904, message = "Items cannot be discarded while in a private store.")
	public static SystemMessageId ITEMS_CANNOT_BE_DISCARDED_WHILE_IN_A_PRIVATE_STORE;
	
	@ClientString(id = 905, message = "The current score for the Humans is $s1.")
	public static SystemMessageId THE_CURRENT_SCORE_FOR_THE_HUMANS_IS_S1;
	
	@ClientString(id = 906, message = "The current score for the Elves is $s1.")
	public static SystemMessageId THE_CURRENT_SCORE_FOR_THE_ELVES_IS_S1;
	
	@ClientString(id = 907, message = "The current score for the Dark Elves is $s1.")
	public static SystemMessageId THE_CURRENT_SCORE_FOR_THE_DARK_ELVES_IS_S1;
	
	@ClientString(id = 908, message = "The current score for the Orcs is $s1.")
	public static SystemMessageId THE_CURRENT_SCORE_FOR_THE_ORCS_IS_S1;
	
	@ClientString(id = 909, message = "The current score for the Dwarves is $s1.")
	public static SystemMessageId THE_CURRENT_SCORE_FOR_THE_DWARVES_IS_S1;
	
	@ClientString(id = 910, message = "Current location: $s1 / $s2 / $s3 (Near Talking Island Village)")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3_NEAR_TALKING_ISLAND_VILLAGE;
	
	@ClientString(id = 911, message = "Current location: $s1 / $s2 / $s3 (Near Gludin Village)")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3_NEAR_GLUDIN_VILLAGE;
	
	@ClientString(id = 912, message = "Current location: $s1 / $s2 / $s3 (Near the Town of Gludio)")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3_NEAR_THE_TOWN_OF_GLUDIO;
	
	@ClientString(id = 913, message = "Current location: $s1 / $s2 / $s3 (Near the Neutral Zone)")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3_NEAR_THE_NEUTRAL_ZONE;
	
	@ClientString(id = 914, message = "Current location: $s1 / $s2 / $s3 (Near the Elven Village)")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3_NEAR_THE_ELVEN_VILLAGE;
	
	@ClientString(id = 915, message = "Current location: $s1 / $s2 / $s3 (Near the Dark Elf Village)")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3_NEAR_THE_DARK_ELF_VILLAGE;
	
	@ClientString(id = 916, message = "Current location: $s1 / $s2 / $s3 (Near the Town of Dion)")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3_NEAR_THE_TOWN_OF_DION;
	
	@ClientString(id = 917, message = "Current location: $s1 / $s2 / $s3 (Near the Floran Village)")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3_NEAR_THE_FLORAN_VILLAGE;
	
	@ClientString(id = 918, message = "Current location: $s1 / $s2 / $s3 (Near the Town of Giran)")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3_NEAR_THE_TOWN_OF_GIRAN;
	
	@ClientString(id = 919, message = "Current location: $s1 / $s2 / $s3 (Near Giran Harbor)")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3_NEAR_GIRAN_HARBOR;
	
	@ClientString(id = 920, message = "Current location: $s1 / $s2 / $s3 (Near the Orc Village)")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3_NEAR_THE_ORC_VILLAGE;
	
	@ClientString(id = 921, message = "Current location: $s1 / $s2 / $s3 (Near the Dwarven Village)")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3_NEAR_THE_DWARVEN_VILLAGE;
	
	@ClientString(id = 922, message = "Current location: $s1 / $s2 / $s3 (Near the Town of Oren)")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3_NEAR_THE_TOWN_OF_OREN;
	
	@ClientString(id = 923, message = "Current location: $s1 / $s2 / $s3 (Near Hunter's Village)")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3_NEAR_HUNTER_S_VILLAGE;
	
	@ClientString(id = 924, message = "Current location: $s1 / $s2 / $s3 (Near Town of Aden)")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3_NEAR_TOWN_OF_ADEN;
	
	@ClientString(id = 925, message = "Current location: $s1 / $s2 / $s3 (Near the Coliseum)")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3_NEAR_THE_COLISEUM;
	
	@ClientString(id = 926, message = "Current location: $s1 / $s2 / $s3 (Near Heine)")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3_NEAR_HEINE;
	
	@ClientString(id = 927, message = "The current time is $s1:$s2.")
	public static SystemMessageId THE_CURRENT_TIME_IS_S1_S2;
	
	@ClientString(id = 928, message = "The current time is $s1:$s2.")
	public static SystemMessageId THE_CURRENT_TIME_IS_S1_S22;
	
	@ClientString(id = 929, message = "No compensation was given for the farm products.")
	public static SystemMessageId NO_COMPENSATION_WAS_GIVEN_FOR_THE_FARM_PRODUCTS;
	
	@ClientString(id = 930, message = "Lottery tickets are not currently being sold.")
	public static SystemMessageId LOTTERY_TICKETS_ARE_NOT_CURRENTLY_BEING_SOLD;
	
	@ClientString(id = 931, message = "The winning lottery ticket numbers have not yet been announced.")
	public static SystemMessageId THE_WINNING_LOTTERY_TICKET_NUMBERS_HAVE_NOT_YET_BEEN_ANNOUNCED;
	
	@ClientString(id = 932, message = "You cannot chat while in observation mode.")
	public static SystemMessageId YOU_CANNOT_CHAT_WHILE_IN_OBSERVATION_MODE;
	
	@ClientString(id = 933, message = "The seed pricing greatly differs from standard seed prices.")
	public static SystemMessageId THE_SEED_PRICING_GREATLY_DIFFERS_FROM_STANDARD_SEED_PRICES;
	
	@ClientString(id = 934, message = "It is a deleted recipe.")
	public static SystemMessageId IT_IS_A_DELETED_RECIPE;
	
	@ClientString(id = 935, message = "You do not have enough funds in the clan warehouse for the Manor to operate.")
	public static SystemMessageId YOU_DO_NOT_HAVE_ENOUGH_FUNDS_IN_THE_CLAN_WAREHOUSE_FOR_THE_MANOR_TO_OPERATE;
	
	@ClientString(id = 936, message = "Use $s1.")
	public static SystemMessageId USE_S1;
	
	@ClientString(id = 937, message = "Currently preparing for private workshop.")
	public static SystemMessageId CURRENTLY_PREPARING_FOR_PRIVATE_WORKSHOP;
	
	@ClientString(id = 938, message = "The community server is currently offline.")
	public static SystemMessageId THE_COMMUNITY_SERVER_IS_CURRENTLY_OFFLINE;
	
	@ClientString(id = 939, message = "You cannot exchange while blocking everything.")
	public static SystemMessageId YOU_CANNOT_EXCHANGE_WHILE_BLOCKING_EVERYTHING;
	
	@ClientString(id = 940, message = "$s1 is blocking everything.")
	public static SystemMessageId S1_IS_BLOCKING_EVERYTHING;
	
	@ClientString(id = 941, message = "Restart at Talking Island Village.")
	public static SystemMessageId RESTART_AT_TALKING_ISLAND_VILLAGE;
	
	@ClientString(id = 942, message = "Restart at Gludin Village.")
	public static SystemMessageId RESTART_AT_GLUDIN_VILLAGE;
	
	@ClientString(id = 943, message = "Restart at the Town of Gludin.")
	public static SystemMessageId RESTART_AT_THE_TOWN_OF_GLUDIN;
	
	@ClientString(id = 944, message = "Restart at the Neutral Zone.")
	public static SystemMessageId RESTART_AT_THE_NEUTRAL_ZONE;
	
	@ClientString(id = 945, message = "Restart at the Elven Village.")
	public static SystemMessageId RESTART_AT_THE_ELVEN_VILLAGE;
	
	@ClientString(id = 946, message = "Restart at the Dark Elf Village.")
	public static SystemMessageId RESTART_AT_THE_DARK_ELF_VILLAGE;
	
	@ClientString(id = 947, message = "Restart at the Town of Dion.")
	public static SystemMessageId RESTART_AT_THE_TOWN_OF_DION;
	
	@ClientString(id = 948, message = "Restart at Floran Village.")
	public static SystemMessageId RESTART_AT_FLORAN_VILLAGE;
	
	@ClientString(id = 949, message = "Restart at the Town of Giran.")
	public static SystemMessageId RESTART_AT_THE_TOWN_OF_GIRAN;
	
	@ClientString(id = 950, message = "Restart at Giran Harbor.")
	public static SystemMessageId RESTART_AT_GIRAN_HARBOR;
	
	@ClientString(id = 951, message = "Restart at the Orc Village.")
	public static SystemMessageId RESTART_AT_THE_ORC_VILLAGE;
	
	@ClientString(id = 952, message = "Restart at the Dwarven Village.")
	public static SystemMessageId RESTART_AT_THE_DWARVEN_VILLAGE;
	
	@ClientString(id = 953, message = "Restart at the Town of Oren.")
	public static SystemMessageId RESTART_AT_THE_TOWN_OF_OREN;
	
	@ClientString(id = 954, message = "Restart at Hunter's Village.")
	public static SystemMessageId RESTART_AT_HUNTER_S_VILLAGE;
	
	@ClientString(id = 955, message = "Restart at the Town of Aden.")
	public static SystemMessageId RESTART_AT_THE_TOWN_OF_ADEN;
	
	@ClientString(id = 956, message = "Restart at the Coliseum.")
	public static SystemMessageId RESTART_AT_THE_COLISEUM;
	
	@ClientString(id = 957, message = "Restart at Heine.")
	public static SystemMessageId RESTART_AT_HEINE;
	
	@ClientString(id = 958, message = "Items cannot be discarded or destroyed while operating a private store or workshop.")
	public static SystemMessageId ITEMS_CANNOT_BE_DISCARDED_OR_DESTROYED_WHILE_OPERATING_A_PRIVATE_STORE_OR_WORKSHOP;
	
	@ClientString(id = 959, message = "$s1 (*$s2) manufactured successfully.")
	public static SystemMessageId S1_S2_MANUFACTURED_SUCCESSFULLY;
	
	@ClientString(id = 960, message = "You failed to manufacture $s1.")
	public static SystemMessageId YOU_FAILED_TO_MANUFACTURE_S1;
	
	@ClientString(id = 961, message = "You are now blocking everything.")
	public static SystemMessageId YOU_ARE_NOW_BLOCKING_EVERYTHING;
	
	@ClientString(id = 962, message = "You are no longer blocking everything.")
	public static SystemMessageId YOU_ARE_NO_LONGER_BLOCKING_EVERYTHING;
	
	@ClientString(id = 963, message = "Please determine the manufacturing price.")
	public static SystemMessageId PLEASE_DETERMINE_THE_MANUFACTURING_PRICE;
	
	@ClientString(id = 964, message = "Chatting is prohibited for one minute.")
	public static SystemMessageId CHATTING_IS_PROHIBITED_FOR_ONE_MINUTE;
	
	@ClientString(id = 965, message = "The chatting prohibition has been removed.")
	public static SystemMessageId THE_CHATTING_PROHIBITION_HAS_BEEN_REMOVED;
	
	@ClientString(id = 966, message = "Chatting is currently prohibited. If you try to chat before the prohibition is removed, the prohibition time will increase even further.")
	public static SystemMessageId CHATTING_IS_CURRENTLY_PROHIBITED_IF_YOU_TRY_TO_CHAT_BEFORE_THE_PROHIBITION_IS_REMOVED_THE_PROHIBITION_TIME_WILL_INCREASE_EVEN_FURTHER;
	
	@ClientString(id = 967, message = "Do you accept $c1's party invitation? (Item Distribution: Random including spoil.)")
	public static SystemMessageId DO_YOU_ACCEPT_C1_S_PARTY_INVITATION_ITEM_DISTRIBUTION_RANDOM_INCLUDING_SPOIL;
	
	@ClientString(id = 968, message = "Do you accept $c1's party invitation? (Item Distribution: By Turn.)")
	public static SystemMessageId DO_YOU_ACCEPT_C1_S_PARTY_INVITATION_ITEM_DISTRIBUTION_BY_TURN;
	
	@ClientString(id = 969, message = "Do you accept $c1's party invitation? (Item Distribution: By Turn including spoil.)")
	public static SystemMessageId DO_YOU_ACCEPT_C1_S_PARTY_INVITATION_ITEM_DISTRIBUTION_BY_TURN_INCLUDING_SPOIL;
	
	@ClientString(id = 970, message = "$s2's MP has been drained by $c1.")
	public static SystemMessageId S2_S_MP_HAS_BEEN_DRAINED_BY_C1;
	
	@ClientString(id = 971, message = "The petition can contain up to 800 characters.")
	public static SystemMessageId THE_PETITION_CAN_CONTAIN_UP_TO_800_CHARACTERS;
	
	@ClientString(id = 972, message = "This pet cannot use this item.")
	public static SystemMessageId THIS_PET_CANNOT_USE_THIS_ITEM;
	
	@ClientString(id = 973, message = "Please input no more than the number you have.")
	public static SystemMessageId PLEASE_INPUT_NO_MORE_THAN_THE_NUMBER_YOU_HAVE;
	
	@ClientString(id = 974, message = "The soul crystal succeeded in absorbing a soul.")
	public static SystemMessageId THE_SOUL_CRYSTAL_SUCCEEDED_IN_ABSORBING_A_SOUL;
	
	@ClientString(id = 975, message = "The soul crystal was not able to absorb the soul.")
	public static SystemMessageId THE_SOUL_CRYSTAL_WAS_NOT_ABLE_TO_ABSORB_THE_SOUL;
	
	@ClientString(id = 976, message = "The soul crystal broke because it was not able to endure the soul energy.")
	public static SystemMessageId THE_SOUL_CRYSTAL_BROKE_BECAUSE_IT_WAS_NOT_ABLE_TO_ENDURE_THE_SOUL_ENERGY;
	
	@ClientString(id = 977, message = "The soul crystal caused resonation and failed at absorbing a soul.")
	public static SystemMessageId THE_SOUL_CRYSTAL_CAUSED_RESONATION_AND_FAILED_AT_ABSORBING_A_SOUL;
	
	@ClientString(id = 978, message = "The soul crystal is refusing to absorb the soul.")
	public static SystemMessageId THE_SOUL_CRYSTAL_IS_REFUSING_TO_ABSORB_THE_SOUL;
	
	@ClientString(id = 979, message = "The ferry has arrived at Talking Island Harbor.")
	public static SystemMessageId THE_FERRY_HAS_ARRIVED_AT_TALKING_ISLAND_HARBOR;
	
	@ClientString(id = 980, message = "The ferry will leave for Gludin Harbor after anchoring for ten minutes.")
	public static SystemMessageId THE_FERRY_WILL_LEAVE_FOR_GLUDIN_HARBOR_AFTER_ANCHORING_FOR_TEN_MINUTES;
	
	@ClientString(id = 981, message = "The ferry will leave for Gludin Harbor in five minutes.")
	public static SystemMessageId THE_FERRY_WILL_LEAVE_FOR_GLUDIN_HARBOR_IN_FIVE_MINUTES;
	
	@ClientString(id = 982, message = "The ferry will leave for Gludin Harbor in one minute.")
	public static SystemMessageId THE_FERRY_WILL_LEAVE_FOR_GLUDIN_HARBOR_IN_ONE_MINUTE;
	
	@ClientString(id = 983, message = "Those wishing to ride the ferry should make haste to get on.")
	public static SystemMessageId THOSE_WISHING_TO_RIDE_THE_FERRY_SHOULD_MAKE_HASTE_TO_GET_ON;
	
	@ClientString(id = 984, message = "The ferry will be leaving soon for Gludin Harbor.")
	public static SystemMessageId THE_FERRY_WILL_BE_LEAVING_SOON_FOR_GLUDIN_HARBOR;
	
	@ClientString(id = 985, message = "The ferry is leaving for Gludin Harbor.")
	public static SystemMessageId THE_FERRY_IS_LEAVING_FOR_GLUDIN_HARBOR;
	
	@ClientString(id = 986, message = "The ferry has arrived at Gludin Harbor.")
	public static SystemMessageId THE_FERRY_HAS_ARRIVED_AT_GLUDIN_HARBOR;
	
	@ClientString(id = 987, message = "The ferry will leave for Talking Island Harbor after anchoring for ten minutes.")
	public static SystemMessageId THE_FERRY_WILL_LEAVE_FOR_TALKING_ISLAND_HARBOR_AFTER_ANCHORING_FOR_TEN_MINUTES;
	
	@ClientString(id = 988, message = "The ferry will leave for Talking Island Harbor in five minutes.")
	public static SystemMessageId THE_FERRY_WILL_LEAVE_FOR_TALKING_ISLAND_HARBOR_IN_FIVE_MINUTES;
	
	@ClientString(id = 989, message = "The ferry will leave for Talking Island Harbor in one minute.")
	public static SystemMessageId THE_FERRY_WILL_LEAVE_FOR_TALKING_ISLAND_HARBOR_IN_ONE_MINUTE;
	
	@ClientString(id = 990, message = "The ferry will be leaving soon for Talking Island Harbor.")
	public static SystemMessageId THE_FERRY_WILL_BE_LEAVING_SOON_FOR_TALKING_ISLAND_HARBOR;
	
	@ClientString(id = 991, message = "The ferry is leaving for Talking Island Harbor.")
	public static SystemMessageId THE_FERRY_IS_LEAVING_FOR_TALKING_ISLAND_HARBOR;
	
	@ClientString(id = 992, message = "The ferry has arrived at Giran Harbor.")
	public static SystemMessageId THE_FERRY_HAS_ARRIVED_AT_GIRAN_HARBOR;
	
	@ClientString(id = 993, message = "The ferry will leave for Giran Harbor after anchoring for ten minutes.")
	public static SystemMessageId THE_FERRY_WILL_LEAVE_FOR_GIRAN_HARBOR_AFTER_ANCHORING_FOR_TEN_MINUTES;
	
	@ClientString(id = 994, message = "The ferry will leave for Giran Harbor in five minutes.")
	public static SystemMessageId THE_FERRY_WILL_LEAVE_FOR_GIRAN_HARBOR_IN_FIVE_MINUTES;
	
	@ClientString(id = 995, message = "The ferry will leave for Giran Harbor in one minute.")
	public static SystemMessageId THE_FERRY_WILL_LEAVE_FOR_GIRAN_HARBOR_IN_ONE_MINUTE;
	
	@ClientString(id = 996, message = "The ferry will be leaving soon for Giran Harbor.")
	public static SystemMessageId THE_FERRY_WILL_BE_LEAVING_SOON_FOR_GIRAN_HARBOR;
	
	@ClientString(id = 997, message = "The ferry is leaving for Giran Harbor.")
	public static SystemMessageId THE_FERRY_IS_LEAVING_FOR_GIRAN_HARBOR;
	
	@ClientString(id = 998, message = "The Innadril pleasure boat has arrived. It will anchor for ten minutes.")
	public static SystemMessageId THE_INNADRIL_PLEASURE_BOAT_HAS_ARRIVED_IT_WILL_ANCHOR_FOR_TEN_MINUTES;
	
	@ClientString(id = 999, message = "The Innadril pleasure boat will leave in five minutes.")
	public static SystemMessageId THE_INNADRIL_PLEASURE_BOAT_WILL_LEAVE_IN_FIVE_MINUTES;
	
	@ClientString(id = 1000, message = "The Innadril pleasure boat will leave in one minute.")
	public static SystemMessageId THE_INNADRIL_PLEASURE_BOAT_WILL_LEAVE_IN_ONE_MINUTE;
	
	@ClientString(id = 1001, message = "The Innadril pleasure boat will be leaving soon.")
	public static SystemMessageId THE_INNADRIL_PLEASURE_BOAT_WILL_BE_LEAVING_SOON;
	
	@ClientString(id = 1002, message = "The Innadril pleasure boat is leaving.")
	public static SystemMessageId THE_INNADRIL_PLEASURE_BOAT_IS_LEAVING;
	
	@ClientString(id = 1003, message = "Cannot process a monster race ticket.")
	public static SystemMessageId CANNOT_PROCESS_A_MONSTER_RACE_TICKET;
	
	@ClientString(id = 1004, message = "You have registered for a clan hall auction.")
	public static SystemMessageId YOU_HAVE_REGISTERED_FOR_A_CLAN_HALL_AUCTION;
	
	@ClientString(id = 1005, message = "There is not enough Adena in the clan hall warehouse.")
	public static SystemMessageId THERE_IS_NOT_ENOUGH_ADENA_IN_THE_CLAN_HALL_WAREHOUSE;
	
	@ClientString(id = 1006, message = "Your bid has been successfully placed.")
	public static SystemMessageId YOUR_BID_HAS_BEEN_SUCCESSFULLY_PLACED;
	
	@ClientString(id = 1007, message = "The preliminary match registration for $s1 has finished.")
	public static SystemMessageId THE_PRELIMINARY_MATCH_REGISTRATION_FOR_S1_HAS_FINISHED;
	
	@ClientString(id = 1008, message = "A hungry strider cannot be mounted or dismounted.")
	public static SystemMessageId A_HUNGRY_STRIDER_CANNOT_BE_MOUNTED_OR_DISMOUNTED;
	
	@ClientString(id = 1009, message = "A strider cannot be ridden when dead.")
	public static SystemMessageId A_STRIDER_CANNOT_BE_RIDDEN_WHEN_DEAD;
	
	@ClientString(id = 1010, message = "A dead strider cannot be ridden.")
	public static SystemMessageId A_DEAD_STRIDER_CANNOT_BE_RIDDEN;
	
	@ClientString(id = 1011, message = "A strider in battle cannot be ridden.")
	public static SystemMessageId A_STRIDER_IN_BATTLE_CANNOT_BE_RIDDEN;
	
	@ClientString(id = 1012, message = "A strider cannot be ridden while in battle.")
	public static SystemMessageId A_STRIDER_CANNOT_BE_RIDDEN_WHILE_IN_BATTLE;
	
	@ClientString(id = 1013, message = "A strider can be ridden only when standing.")
	public static SystemMessageId A_STRIDER_CAN_BE_RIDDEN_ONLY_WHEN_STANDING;
	
	@ClientString(id = 1014, message = "Your pet gained $s1 XP.")
	public static SystemMessageId YOUR_PET_GAINED_S1_XP;
	
	@ClientString(id = 1015, message = "Your pet hit for $s1 damage.")
	public static SystemMessageId YOUR_PET_HIT_FOR_S1_DAMAGE;
	
	@ClientString(id = 1016, message = "Your pet received $s2 damage by $c1.")
	public static SystemMessageId YOUR_PET_RECEIVED_S2_DAMAGE_BY_C1;
	
	@ClientString(id = 1017, message = "Pet's critical hit!")
	public static SystemMessageId PET_S_CRITICAL_HIT;
	
	@ClientString(id = 1018, message = "Your pet uses $s1.")
	public static SystemMessageId YOUR_PET_USES_S1;
	
	@ClientString(id = 1019, message = "Your pet uses $s1.")
	public static SystemMessageId YOUR_PET_USES_S12;
	
	@ClientString(id = 1020, message = "Your pet picked up $s1.")
	public static SystemMessageId YOUR_PET_PICKED_UP_S1;
	
	@ClientString(id = 1021, message = "Your pet picked up $s2 $s1(s).")
	public static SystemMessageId YOUR_PET_PICKED_UP_S2_S1_S;
	
	@ClientString(id = 1022, message = "Your pet picked up +$s1 $s2.")
	public static SystemMessageId YOUR_PET_PICKED_UP_S1_S2;
	
	@ClientString(id = 1023, message = "Your pet picked up $s1 Adena.")
	public static SystemMessageId YOUR_PET_PICKED_UP_S1_ADENA;
	
	@ClientString(id = 1024, message = "Your pet put on $s1.")
	public static SystemMessageId YOUR_PET_PUT_ON_S1;
	
	@ClientString(id = 1025, message = "Your pet took off $s1.")
	public static SystemMessageId YOUR_PET_TOOK_OFF_S1;
	
	@ClientString(id = 1026, message = "The summoned monster gave damage of $s1.")
	public static SystemMessageId THE_SUMMONED_MONSTER_GAVE_DAMAGE_OF_S1;
	
	@ClientString(id = 1027, message = "Servitor received $s2 damage caused by $c1.")
	public static SystemMessageId SERVITOR_RECEIVED_S2_DAMAGE_CAUSED_BY_C1;
	
	@ClientString(id = 1028, message = "Summoned monster's critical hit!")
	public static SystemMessageId SUMMONED_MONSTER_S_CRITICAL_HIT;
	
	@ClientString(id = 1029, message = "A summoned monster uses $s1.")
	public static SystemMessageId A_SUMMONED_MONSTER_USES_S1;
	
	@ClientString(id = 1030, message = "(Party Information)")
	public static SystemMessageId PARTY_INFORMATION;
	
	@ClientString(id = 1031, message = "Looting method: Finders keepers")
	public static SystemMessageId LOOTING_METHOD_FINDERS_KEEPERS;
	
	@ClientString(id = 1032, message = "Looting method: Random")
	public static SystemMessageId LOOTING_METHOD_RANDOM;
	
	@ClientString(id = 1033, message = "Looting method: Random including spoil")
	public static SystemMessageId LOOTING_METHOD_RANDOM_INCLUDING_SPOIL;
	
	@ClientString(id = 1034, message = "Looting method: By turn")
	public static SystemMessageId LOOTING_METHOD_BY_TURN;
	
	@ClientString(id = 1035, message = "Looting method: By turn including spoil")
	public static SystemMessageId LOOTING_METHOD_BY_TURN_INCLUDING_SPOIL;
	
	@ClientString(id = 1036, message = "You have exceeded the quantity that can be inputted.")
	public static SystemMessageId YOU_HAVE_EXCEEDED_THE_QUANTITY_THAT_CAN_BE_INPUTTED;
	
	@ClientString(id = 1037, message = "$c1 manufactured $s2.")
	public static SystemMessageId C1_MANUFACTURED_S2;
	
	@ClientString(id = 1038, message = "$c1 manufactured $s3 $s2(s).")
	public static SystemMessageId C1_MANUFACTURED_S3_S2_S;
	
	@ClientString(id = 1039, message = "Items left at the clan hall warehouse can only be retrieved by the clan leader. Do you want to continue?")
	public static SystemMessageId ITEMS_LEFT_AT_THE_CLAN_HALL_WAREHOUSE_CAN_ONLY_BE_RETRIEVED_BY_THE_CLAN_LEADER_DO_YOU_WANT_TO_CONTINUE;
	
	@ClientString(id = 1040, message = "Dimensional Items can be retrieved through Dimensional Merchants and Alchemists. Proceed?")
	public static SystemMessageId DIMENSIONAL_ITEMS_CAN_BE_RETRIEVED_THROUGH_DIMENSIONAL_MERCHANTS_AND_ALCHEMISTS_PROCEED;
	
	@ClientString(id = 1041, message = "The next seed purchase price is $s1 Adena.")
	public static SystemMessageId THE_NEXT_SEED_PURCHASE_PRICE_IS_S1_ADENA;
	
	@ClientString(id = 1042, message = "The next farm goods purchase price is $s1 Adena.")
	public static SystemMessageId THE_NEXT_FARM_GOODS_PURCHASE_PRICE_IS_S1_ADENA;
	
	@ClientString(id = 1043, message = "At the current time, the '/unstuck' command cannot be used. Please send in a petition.")
	public static SystemMessageId AT_THE_CURRENT_TIME_THE_UNSTUCK_COMMAND_CANNOT_BE_USED_PLEASE_SEND_IN_A_PETITION;
	
	@ClientString(id = 1044, message = "Monster race payout information is not available while tickets are being sold.")
	public static SystemMessageId MONSTER_RACE_PAYOUT_INFORMATION_IS_NOT_AVAILABLE_WHILE_TICKETS_ARE_BEING_SOLD;
	
	@ClientString(id = 1045, message = "Currently, a monster race is not being set up.")
	public static SystemMessageId CURRENTLY_A_MONSTER_RACE_IS_NOT_BEING_SET_UP;
	
	@ClientString(id = 1046, message = "Monster race tickets are no longer available.")
	public static SystemMessageId MONSTER_RACE_TICKETS_ARE_NO_LONGER_AVAILABLE;
	
	@ClientString(id = 1047, message = "We did not succeed in producing $s1 item.")
	public static SystemMessageId WE_DID_NOT_SUCCEED_IN_PRODUCING_S1_ITEM;
	
	@ClientString(id = 1048, message = "While 'blocking' everything, whispering is not possible.")
	public static SystemMessageId WHILE_BLOCKING_EVERYTHING_WHISPERING_IS_NOT_POSSIBLE;
	
	@ClientString(id = 1049, message = "While 'blocking' everything, it is not possible to send invitations for organizing parties.")
	public static SystemMessageId WHILE_BLOCKING_EVERYTHING_IT_IS_NOT_POSSIBLE_TO_SEND_INVITATIONS_FOR_ORGANIZING_PARTIES;
	
	@ClientString(id = 1050, message = "There are no communities in my clan. Clan communities are allowed for clans with skill levels of 2 and higher.")
	public static SystemMessageId THERE_ARE_NO_COMMUNITIES_IN_MY_CLAN_CLAN_COMMUNITIES_ARE_ALLOWED_FOR_CLANS_WITH_SKILL_LEVELS_OF_2_AND_HIGHER;
	
	@ClientString(id = 1051, message = "Payment for your clan hall has not been made. Please make payment to your clan warehouse by $s1 tomorrow.")
	public static SystemMessageId PAYMENT_FOR_YOUR_CLAN_HALL_HAS_NOT_BEEN_MADE_PLEASE_MAKE_PAYMENT_TO_YOUR_CLAN_WAREHOUSE_BY_S1_TOMORROW;
	
	@ClientString(id = 1052, message = "The clan hall fee is one week overdue; therefore the clan hall ownership has been revoked.")
	public static SystemMessageId THE_CLAN_HALL_FEE_IS_ONE_WEEK_OVERDUE_THEREFORE_THE_CLAN_HALL_OWNERSHIP_HAS_BEEN_REVOKED;
	
	@ClientString(id = 1053, message = "It is not possible to resurrect in battlegrounds where a siege war is taking place.")
	public static SystemMessageId IT_IS_NOT_POSSIBLE_TO_RESURRECT_IN_BATTLEGROUNDS_WHERE_A_SIEGE_WAR_IS_TAKING_PLACE;
	
	@ClientString(id = 1054, message = "You have entered a mystical land.")
	public static SystemMessageId YOU_HAVE_ENTERED_A_MYSTICAL_LAND;
	
	@ClientString(id = 1055, message = "You have left a mystical land.")
	public static SystemMessageId YOU_HAVE_LEFT_A_MYSTICAL_LAND;
	
	@ClientString(id = 1056, message = "You have exceeded the storage capacity of the castle's vault.")
	public static SystemMessageId YOU_HAVE_EXCEEDED_THE_STORAGE_CAPACITY_OF_THE_CASTLE_S_VAULT;
	
	@ClientString(id = 1057, message = "This command can only be used in the relax server.")
	public static SystemMessageId THIS_COMMAND_CAN_ONLY_BE_USED_IN_THE_RELAX_SERVER;
	
	@ClientString(id = 1058, message = "The sales price for seeds is $s1 Adena.")
	public static SystemMessageId THE_SALES_PRICE_FOR_SEEDS_IS_S1_ADENA;
	
	@ClientString(id = 1059, message = "The remaining purchasing amount is $s1 Adena.")
	public static SystemMessageId THE_REMAINING_PURCHASING_AMOUNT_IS_S1_ADENA;
	
	@ClientString(id = 1060, message = "The remainder after selling the seeds is $s1.")
	public static SystemMessageId THE_REMAINDER_AFTER_SELLING_THE_SEEDS_IS_S1;
	
	@ClientString(id = 1061, message = "The recipe cannot be registered.  You do not have the ability to create items.")
	public static SystemMessageId THE_RECIPE_CANNOT_BE_REGISTERED_YOU_DO_NOT_HAVE_THE_ABILITY_TO_CREATE_ITEMS;
	
	@ClientString(id = 1062, message = "Writing something new is possible after level 10.")
	public static SystemMessageId WRITING_SOMETHING_NEW_IS_POSSIBLE_AFTER_LEVEL_10;
	
	@ClientString(id = 1063, message = "The Petition Service is currently unavailable, please send a support ticket on https://lineage2.custhelp.com; If you become trapped or unable to move, please use the '/unstuck' command.")
	public static SystemMessageId THE_PETITION_SERVICE_IS_CURRENTLY_UNAVAILABLE_PLEASE_SEND_A_SUPPORT_TICKET_ON_HTTPS_LINEAGE2_CUSTHELP_COM_IF_YOU_BECOME_TRAPPED_OR_UNABLE_TO_MOVE_PLEASE_USE_THE_UNSTUCK_COMMAND;
	
	@ClientString(id = 1064, message = "The equipment, +$s1 $s2, has been removed.")
	public static SystemMessageId THE_EQUIPMENT_S1_S2_HAS_BEEN_REMOVED;
	
	@ClientString(id = 1065, message = "While operating a private store or workshop, you cannot discard, destroy, or trade an item.")
	public static SystemMessageId WHILE_OPERATING_A_PRIVATE_STORE_OR_WORKSHOP_YOU_CANNOT_DISCARD_DESTROY_OR_TRADE_AN_ITEM;
	
	@ClientString(id = 1066, message = "$s1 HP has been restored.")
	public static SystemMessageId S1_HP_HAS_BEEN_RESTORED;
	
	@ClientString(id = 1067, message = "$s2 HP has been restored by $c1.")
	public static SystemMessageId S2_HP_HAS_BEEN_RESTORED_BY_C1;
	
	@ClientString(id = 1068, message = "$s1 MP has been restored.")
	public static SystemMessageId S1_MP_HAS_BEEN_RESTORED;
	
	@ClientString(id = 1069, message = "$s2 MP has been restored by $c1.")
	public static SystemMessageId S2_MP_HAS_BEEN_RESTORED_BY_C1;
	
	@ClientString(id = 1070, message = "You do not have 'read' permission.")
	public static SystemMessageId YOU_DO_NOT_HAVE_READ_PERMISSION;
	
	@ClientString(id = 1071, message = "You do not have 'write' permission.")
	public static SystemMessageId YOU_DO_NOT_HAVE_WRITE_PERMISSION;
	
	@ClientString(id = 1072, message = "You have obtained a ticket for the Monster Race #$s1  -  Single.")
	public static SystemMessageId YOU_HAVE_OBTAINED_A_TICKET_FOR_THE_MONSTER_RACE_S1_SINGLE;
	
	@ClientString(id = 1073, message = "You have obtained a ticket for the Monster Race #$s1  -  Single.")
	public static SystemMessageId YOU_HAVE_OBTAINED_A_TICKET_FOR_THE_MONSTER_RACE_S1_SINGLE2;
	
	@ClientString(id = 1074, message = "You do not meet the age requirement to purchase a Monster Race Ticket.")
	public static SystemMessageId YOU_DO_NOT_MEET_THE_AGE_REQUIREMENT_TO_PURCHASE_A_MONSTER_RACE_TICKET;
	
	@ClientString(id = 1075, message = "The bid amount must be higher than the previous bid.")
	public static SystemMessageId THE_BID_AMOUNT_MUST_BE_HIGHER_THAN_THE_PREVIOUS_BID;
	
	@ClientString(id = 1076, message = "The game cannot be terminated at this time.")
	public static SystemMessageId THE_GAME_CANNOT_BE_TERMINATED_AT_THIS_TIME;
	
	@ClientString(id = 1077, message = "A GameGuard Execution error has occurred.  Please send the *.erl file(s) located in the GameGuard folder to game@inca.co.kr.")
	public static SystemMessageId A_GAMEGUARD_EXECUTION_ERROR_HAS_OCCURRED_PLEASE_SEND_THE_ERL_FILE_S_LOCATED_IN_THE_GAMEGUARD_FOLDER_TO_GAME_INCA_CO_KR;
	
	@ClientString(id = 1078, message = "When a user's keyboard input exceeds a certain cumulative score a chat ban will be applied. This is done to discourage spamming. Please avoid posting the same message multiple times during a short period.")
	public static SystemMessageId WHEN_A_USER_S_KEYBOARD_INPUT_EXCEEDS_A_CERTAIN_CUMULATIVE_SCORE_A_CHAT_BAN_WILL_BE_APPLIED_THIS_IS_DONE_TO_DISCOURAGE_SPAMMING_PLEASE_AVOID_POSTING_THE_SAME_MESSAGE_MULTIPLE_TIMES_DURING_A_SHORT_PERIOD;
	
	@ClientString(id = 1079, message = "ﾠThe target is currently banned from chatting.")
	public static SystemMessageId THE_TARGET_IS_CURRENTLY_BANNED_FROM_CHATTING;
	
	@ClientString(id = 1080, message = "Being permanent, are you sure you wish to use the facelift potion - Type A?")
	public static SystemMessageId BEING_PERMANENT_ARE_YOU_SURE_YOU_WISH_TO_USE_THE_FACELIFT_POTION_TYPE_A;
	
	@ClientString(id = 1081, message = "Being permanent, are you sure you wish to use the Dye Potion - Type A?")
	public static SystemMessageId BEING_PERMANENT_ARE_YOU_SURE_YOU_WISH_TO_USE_THE_DYE_POTION_TYPE_A;
	
	@ClientString(id = 1082, message = "Do you wish to use the hair style change potion - Type A? It is permanent.")
	public static SystemMessageId DO_YOU_WISH_TO_USE_THE_HAIR_STYLE_CHANGE_POTION_TYPE_A_IT_IS_PERMANENT;
	
	@ClientString(id = 1083, message = "Facelift potion - Type A is being applied.")
	public static SystemMessageId FACELIFT_POTION_TYPE_A_IS_BEING_APPLIED;
	
	@ClientString(id = 1084, message = "Dye Potion - Type A is being applied.")
	public static SystemMessageId DYE_POTION_TYPE_A_IS_BEING_APPLIED;
	
	@ClientString(id = 1085, message = "The hair style change potion - Type A is being used.")
	public static SystemMessageId THE_HAIR_STYLE_CHANGE_POTION_TYPE_A_IS_BEING_USED;
	
	@ClientString(id = 1086, message = "Your facial appearance has been changed.")
	public static SystemMessageId YOUR_FACIAL_APPEARANCE_HAS_BEEN_CHANGED;
	
	@ClientString(id = 1087, message = "Your hair color has been changed.")
	public static SystemMessageId YOUR_HAIR_COLOR_HAS_BEEN_CHANGED;
	
	@ClientString(id = 1088, message = "Your hair style has been changed.")
	public static SystemMessageId YOUR_HAIR_STYLE_HAS_BEEN_CHANGED;
	
	@ClientString(id = 1089, message = "$c1 has obtained a first anniversary commemorative item.")
	public static SystemMessageId C1_HAS_OBTAINED_A_FIRST_ANNIVERSARY_COMMEMORATIVE_ITEM;
	
	@ClientString(id = 1090, message = "Being permanent, are you sure you wish to use the facelift potion - Type B?")
	public static SystemMessageId BEING_PERMANENT_ARE_YOU_SURE_YOU_WISH_TO_USE_THE_FACELIFT_POTION_TYPE_B;
	
	@ClientString(id = 1091, message = "Being permanent, are you sure you wish to use the facelift potion - Type C?")
	public static SystemMessageId BEING_PERMANENT_ARE_YOU_SURE_YOU_WISH_TO_USE_THE_FACELIFT_POTION_TYPE_C;
	
	@ClientString(id = 1092, message = "Being permanent, are you sure you wish to use the Dye Potion - Type B?")
	public static SystemMessageId BEING_PERMANENT_ARE_YOU_SURE_YOU_WISH_TO_USE_THE_DYE_POTION_TYPE_B;
	
	@ClientString(id = 1093, message = "Being permanent, are you sure you wish to use the Dye Potion - Type C?")
	public static SystemMessageId BEING_PERMANENT_ARE_YOU_SURE_YOU_WISH_TO_USE_THE_DYE_POTION_TYPE_C;
	
	@ClientString(id = 1094, message = "Being permanent, are you sure you wish to use the Dye Potion - Type D?")
	public static SystemMessageId BEING_PERMANENT_ARE_YOU_SURE_YOU_WISH_TO_USE_THE_DYE_POTION_TYPE_D;
	
	@ClientString(id = 1095, message = "Do you wish to use the hair style change potion - Type B? It is permanent.")
	public static SystemMessageId DO_YOU_WISH_TO_USE_THE_HAIR_STYLE_CHANGE_POTION_TYPE_B_IT_IS_PERMANENT;
	
	@ClientString(id = 1096, message = "Do you wish to use the hair style change potion - Type C? It is permanent.")
	public static SystemMessageId DO_YOU_WISH_TO_USE_THE_HAIR_STYLE_CHANGE_POTION_TYPE_C_IT_IS_PERMANENT;
	
	@ClientString(id = 1097, message = "Do you wish to use the hair style change potion - Type D? It is permanent.")
	public static SystemMessageId DO_YOU_WISH_TO_USE_THE_HAIR_STYLE_CHANGE_POTION_TYPE_D_IT_IS_PERMANENT;
	
	@ClientString(id = 1098, message = "Do you wish to use the hair style change potion - Type E? It is permanent.")
	public static SystemMessageId DO_YOU_WISH_TO_USE_THE_HAIR_STYLE_CHANGE_POTION_TYPE_E_IT_IS_PERMANENT;
	
	@ClientString(id = 1099, message = "Do you wish to use the hair style change potion - Type F? It is permanent.")
	public static SystemMessageId DO_YOU_WISH_TO_USE_THE_HAIR_STYLE_CHANGE_POTION_TYPE_F_IT_IS_PERMANENT;
	
	@ClientString(id = 1100, message = "Do you wish to use the hair style change potion - Type G? It is permanent.")
	public static SystemMessageId DO_YOU_WISH_TO_USE_THE_HAIR_STYLE_CHANGE_POTION_TYPE_G_IT_IS_PERMANENT;
	
	@ClientString(id = 1101, message = "Facelift potion - Type B is being applied.")
	public static SystemMessageId FACELIFT_POTION_TYPE_B_IS_BEING_APPLIED;
	
	@ClientString(id = 1102, message = "Facelift potion - Type C is being applied.")
	public static SystemMessageId FACELIFT_POTION_TYPE_C_IS_BEING_APPLIED;
	
	@ClientString(id = 1103, message = "Dye Potion - Type B is being applied.")
	public static SystemMessageId DYE_POTION_TYPE_B_IS_BEING_APPLIED;
	
	@ClientString(id = 1104, message = "Dye Potion - Type C is being applied.")
	public static SystemMessageId DYE_POTION_TYPE_C_IS_BEING_APPLIED;
	
	@ClientString(id = 1105, message = "Dye Potion - Type D is being applied.")
	public static SystemMessageId DYE_POTION_TYPE_D_IS_BEING_APPLIED;
	
	@ClientString(id = 1106, message = "The hair style change potion - Type B is being used.")
	public static SystemMessageId THE_HAIR_STYLE_CHANGE_POTION_TYPE_B_IS_BEING_USED;
	
	@ClientString(id = 1107, message = "The hair style change potion - Type C is being used.")
	public static SystemMessageId THE_HAIR_STYLE_CHANGE_POTION_TYPE_C_IS_BEING_USED;
	
	@ClientString(id = 1108, message = "The hair style change potion - Type D is being used.")
	public static SystemMessageId THE_HAIR_STYLE_CHANGE_POTION_TYPE_D_IS_BEING_USED;
	
	@ClientString(id = 1109, message = "The hair style change potion - Type E is being used.")
	public static SystemMessageId THE_HAIR_STYLE_CHANGE_POTION_TYPE_E_IS_BEING_USED;
	
	@ClientString(id = 1110, message = "The hair style change potion - Type F is being used.")
	public static SystemMessageId THE_HAIR_STYLE_CHANGE_POTION_TYPE_F_IS_BEING_USED;
	
	@ClientString(id = 1111, message = "The hair style change potion - Type G is being used.")
	public static SystemMessageId THE_HAIR_STYLE_CHANGE_POTION_TYPE_G_IS_BEING_USED;
	
	@ClientString(id = 1112, message = "The prize amount for the winner of Lottery #$s1 is $s2 Adena.  We have $s3 first prize winners.")
	public static SystemMessageId THE_PRIZE_AMOUNT_FOR_THE_WINNER_OF_LOTTERY_S1_IS_S2_ADENA_WE_HAVE_S3_FIRST_PRIZE_WINNERS;
	
	@ClientString(id = 1113, message = "The prize amount for Lucky Lottery #$s1 is $s2 Adena. There was no first prize winner in this drawing, therefore the jackpot will be added to the next drawing.")
	public static SystemMessageId THE_PRIZE_AMOUNT_FOR_LUCKY_LOTTERY_S1_IS_S2_ADENA_THERE_WAS_NO_FIRST_PRIZE_WINNER_IN_THIS_DRAWING_THEREFORE_THE_JACKPOT_WILL_BE_ADDED_TO_THE_NEXT_DRAWING;
	
	@ClientString(id = 1114, message = "Your clan may not register to participate in a siege while under a grace period of the clan's dissolution.")
	public static SystemMessageId YOUR_CLAN_MAY_NOT_REGISTER_TO_PARTICIPATE_IN_A_SIEGE_WHILE_UNDER_A_GRACE_PERIOD_OF_THE_CLAN_S_DISSOLUTION;
	
	@ClientString(id = 1115, message = "Individuals may not surrender during combat.")
	public static SystemMessageId INDIVIDUALS_MAY_NOT_SURRENDER_DURING_COMBAT;
	
	@ClientString(id = 1116, message = "You cannot leave a clan while engaged in combat.")
	public static SystemMessageId YOU_CANNOT_LEAVE_A_CLAN_WHILE_ENGAGED_IN_COMBAT;
	
	@ClientString(id = 1117, message = "A clan member may not be dismissed during combat.")
	public static SystemMessageId A_CLAN_MEMBER_MAY_NOT_BE_DISMISSED_DURING_COMBAT;
	
	@ClientString(id = 1118, message = "Unable to process this request until your inventory's weight and slot count are less than 80 percent of capacity.")
	public static SystemMessageId UNABLE_TO_PROCESS_THIS_REQUEST_UNTIL_YOUR_INVENTORY_S_WEIGHT_AND_SLOT_COUNT_ARE_LESS_THAN_80_PERCENT_OF_CAPACITY;
	
	@ClientString(id = 1119, message = "Quest was automatically canceled when you attempted to settle the accounts of your quest while your inventory exceeded 80 percent of capacity.")
	public static SystemMessageId QUEST_WAS_AUTOMATICALLY_CANCELED_WHEN_YOU_ATTEMPTED_TO_SETTLE_THE_ACCOUNTS_OF_YOUR_QUEST_WHILE_YOUR_INVENTORY_EXCEEDED_80_PERCENT_OF_CAPACITY;
	
	@ClientString(id = 1120, message = "You are still a member of the clan.")
	public static SystemMessageId YOU_ARE_STILL_A_MEMBER_OF_THE_CLAN;
	
	@ClientString(id = 1121, message = "You do not have the right to vote.")
	public static SystemMessageId YOU_DO_NOT_HAVE_THE_RIGHT_TO_VOTE;
	
	@ClientString(id = 1122, message = "There is no candidate.")
	public static SystemMessageId THERE_IS_NO_CANDIDATE;
	
	@ClientString(id = 1123, message = "Weight and volume limit have been exceeded. That skill is currently unavailable.")
	public static SystemMessageId WEIGHT_AND_VOLUME_LIMIT_HAVE_BEEN_EXCEEDED_THAT_SKILL_IS_CURRENTLY_UNAVAILABLE;
	
	@ClientString(id = 1124, message = "Your recipe book may not be accessed while using a skill.")
	public static SystemMessageId YOUR_RECIPE_BOOK_MAY_NOT_BE_ACCESSED_WHILE_USING_A_SKILL;
	
	@ClientString(id = 1125, message = "Item creation is not possible while engaged in a trade.")
	public static SystemMessageId ITEM_CREATION_IS_NOT_POSSIBLE_WHILE_ENGAGED_IN_A_TRADE;
	
	@ClientString(id = 1126, message = "You cannot enter a negative number.")
	public static SystemMessageId YOU_CANNOT_ENTER_A_NEGATIVE_NUMBER;
	
	@ClientString(id = 1127, message = "The reward must be less than 10 times the standard price.")
	public static SystemMessageId THE_REWARD_MUST_BE_LESS_THAN_10_TIMES_THE_STANDARD_PRICE;
	
	@ClientString(id = 1128, message = "A private store may not be opened while using a skill.")
	public static SystemMessageId A_PRIVATE_STORE_MAY_NOT_BE_OPENED_WHILE_USING_A_SKILL;
	
	@ClientString(id = 1129, message = "This is not allowed while riding a ferry or boat.")
	public static SystemMessageId THIS_IS_NOT_ALLOWED_WHILE_RIDING_A_FERRY_OR_BOAT;
	
	@ClientString(id = 1130, message = "You have dealt $s1 damage to your target and $s2 damage to the servitor.")
	public static SystemMessageId YOU_HAVE_DEALT_S1_DAMAGE_TO_YOUR_TARGET_AND_S2_DAMAGE_TO_THE_SERVITOR;
	
	@ClientString(id = 1131, message = "It is now midnight and the effect of $s1 can be felt.")
	public static SystemMessageId IT_IS_NOW_MIDNIGHT_AND_THE_EFFECT_OF_S1_CAN_BE_FELT;
	
	@ClientString(id = 1132, message = "It is dawn and the effect of $s1 will now disappear.")
	public static SystemMessageId IT_IS_DAWN_AND_THE_EFFECT_OF_S1_WILL_NOW_DISAPPEAR;
	
	@ClientString(id = 1133, message = "Since your HP has decreased, the effect of $s1 can be felt.")
	public static SystemMessageId SINCE_YOUR_HP_HAS_DECREASED_THE_EFFECT_OF_S1_CAN_BE_FELT;
	
	@ClientString(id = 1134, message = "Since your HP has increased, the effect of $s1 will disappear.")
	public static SystemMessageId SINCE_YOUR_HP_HAS_INCREASED_THE_EFFECT_OF_S1_WILL_DISAPPEAR;
	
	@ClientString(id = 1135, message = "While you are engaged in combat, you cannot operate a private store or private workshop.")
	public static SystemMessageId WHILE_YOU_ARE_ENGAGED_IN_COMBAT_YOU_CANNOT_OPERATE_A_PRIVATE_STORE_OR_PRIVATE_WORKSHOP;
	
	@ClientString(id = 1136, message = "Since there was an account that used this IP and attempted to log in illegally, this account is not allowed to connect to the game server for $s1 minute(s). Please use another game server.")
	public static SystemMessageId SINCE_THERE_WAS_AN_ACCOUNT_THAT_USED_THIS_IP_AND_ATTEMPTED_TO_LOG_IN_ILLEGALLY_THIS_ACCOUNT_IS_NOT_ALLOWED_TO_CONNECT_TO_THE_GAME_SERVER_FOR_S1_MINUTE_S_PLEASE_USE_ANOTHER_GAME_SERVER;
	
	@ClientString(id = 1137, message = "$c1 harvested $s3 $s2(s).")
	public static SystemMessageId C1_HARVESTED_S3_S2_S;
	
	@ClientString(id = 1138, message = "$c1 harvested $s2.")
	public static SystemMessageId C1_HARVESTED_S2;
	
	@ClientString(id = 1139, message = "The weight and volume limit of your inventory cannot be exceeded.")
	public static SystemMessageId THE_WEIGHT_AND_VOLUME_LIMIT_OF_YOUR_INVENTORY_CANNOT_BE_EXCEEDED;
	
	@ClientString(id = 1140, message = "Would you like to open the gate?")
	public static SystemMessageId WOULD_YOU_LIKE_TO_OPEN_THE_GATE;
	
	@ClientString(id = 1141, message = "Would you like to close the gate?")
	public static SystemMessageId WOULD_YOU_LIKE_TO_CLOSE_THE_GATE;
	
	@ClientString(id = 1142, message = "Since $s1 already exists nearby, you cannot summon it again.")
	public static SystemMessageId SINCE_S1_ALREADY_EXISTS_NEARBY_YOU_CANNOT_SUMMON_IT_AGAIN;
	
	@ClientString(id = 1143, message = "Since you do not have enough items to maintain the servitor's stay, the servitor has disappeared.")
	public static SystemMessageId SINCE_YOU_DO_NOT_HAVE_ENOUGH_ITEMS_TO_MAINTAIN_THE_SERVITOR_S_STAY_THE_SERVITOR_HAS_DISAPPEARED;
	
	@ClientString(id = 1144, message = "You don't have anybody to chat with in the game.")
	public static SystemMessageId YOU_DON_T_HAVE_ANYBODY_TO_CHAT_WITH_IN_THE_GAME;
	
	@ClientString(id = 1145, message = "$s2 has been created for $c1 after the payment of $s3 Adena was received.")
	public static SystemMessageId S2_HAS_BEEN_CREATED_FOR_C1_AFTER_THE_PAYMENT_OF_S3_ADENA_WAS_RECEIVED;
	
	@ClientString(id = 1146, message = "$c1 created $s2 after receiving $s3 Adena.")
	public static SystemMessageId C1_CREATED_S2_AFTER_RECEIVING_S3_ADENA;
	
	@ClientString(id = 1147, message = "$s3 $s2(s) have been created for $c1 at the price of $s4 Adena.")
	public static SystemMessageId S3_S2_S_HAVE_BEEN_CREATED_FOR_C1_AT_THE_PRICE_OF_S4_ADENA;
	
	@ClientString(id = 1148, message = "$c1 created $s3 $s2(s) at the price of $s4 Adena.")
	public static SystemMessageId C1_CREATED_S3_S2_S_AT_THE_PRICE_OF_S4_ADENA;
	
	@ClientString(id = 1149, message = "You failed to create $s2 for $c1 at the price of $s3 Adena.")
	public static SystemMessageId YOU_FAILED_TO_CREATE_S2_FOR_C1_AT_THE_PRICE_OF_S3_ADENA;
	
	@ClientString(id = 1150, message = "$c1 has failed to create $s2 at the price of $s3 Adena.")
	public static SystemMessageId C1_HAS_FAILED_TO_CREATE_S2_AT_THE_PRICE_OF_S3_ADENA;
	
	@ClientString(id = 1151, message = "$s2 is sold to $c1 for the price of $s3 Adena.")
	public static SystemMessageId S2_IS_SOLD_TO_C1_FOR_THE_PRICE_OF_S3_ADENA;
	
	@ClientString(id = 1152, message = "$s3 $s2(s) have been sold to $c1 for $s4 Adena.")
	public static SystemMessageId S3_S2_S_HAVE_BEEN_SOLD_TO_C1_FOR_S4_ADENA;
	
	@ClientString(id = 1153, message = "$s2 has been purchased from $c1 at the price of $s3 Adena.")
	public static SystemMessageId S2_HAS_BEEN_PURCHASED_FROM_C1_AT_THE_PRICE_OF_S3_ADENA;
	
	@ClientString(id = 1154, message = "$s3 $s2(s) have been purchased from $c1 for $s4 Adena.")
	public static SystemMessageId S3_S2_S_HAVE_BEEN_PURCHASED_FROM_C1_FOR_S4_ADENA;
	
	@ClientString(id = 1155, message = "+$s2 $s3 has been sold to $C1 at the price of $s4 Adena.")
	public static SystemMessageId S2_S3_HAS_BEEN_SOLD_TO_C1_AT_THE_PRICE_OF_S4_ADENA;
	
	@ClientString(id = 1156, message = "+$s2 $s3 has been purchased from $C1 at the price of $s4 Adena.")
	public static SystemMessageId S2_S3_HAS_BEEN_PURCHASED_FROM_C1_AT_THE_PRICE_OF_S4_ADENA;
	
	@ClientString(id = 1157, message = "The preview state only lasts for 10 seconds. If you wish to continue, click OK.")
	public static SystemMessageId THE_PREVIEW_STATE_ONLY_LASTS_FOR_10_SECONDS_IF_YOU_WISH_TO_CONTINUE_CLICK_OK;
	
	@ClientString(id = 1158, message = "You cannot dismount from this elevation.")
	public static SystemMessageId YOU_CANNOT_DISMOUNT_FROM_THIS_ELEVATION;
	
	@ClientString(id = 1159, message = "The ferry from Talking Island will arrive at Gludin Harbor in approximately 10 minutes.")
	public static SystemMessageId THE_FERRY_FROM_TALKING_ISLAND_WILL_ARRIVE_AT_GLUDIN_HARBOR_IN_APPROXIMATELY_10_MINUTES;
	
	@ClientString(id = 1160, message = "The ferry from Talking Island will be arriving at Gludin Harbor in approximately 5 minutes.")
	public static SystemMessageId THE_FERRY_FROM_TALKING_ISLAND_WILL_BE_ARRIVING_AT_GLUDIN_HARBOR_IN_APPROXIMATELY_5_MINUTES;
	
	@ClientString(id = 1161, message = "The ferry from Talking Island will be arriving at Gludin Harbor in approximately 1 minute.")
	public static SystemMessageId THE_FERRY_FROM_TALKING_ISLAND_WILL_BE_ARRIVING_AT_GLUDIN_HARBOR_IN_APPROXIMATELY_1_MINUTE;
	
	@ClientString(id = 1162, message = "The ferry from Giran Harbor will be arriving at Talking Island in approximately 15 minutes.")
	public static SystemMessageId THE_FERRY_FROM_GIRAN_HARBOR_WILL_BE_ARRIVING_AT_TALKING_ISLAND_IN_APPROXIMATELY_15_MINUTES;
	
	@ClientString(id = 1163, message = "The ferry from Giran Harbor will be arriving at Talking Island in approximately 10 minutes.")
	public static SystemMessageId THE_FERRY_FROM_GIRAN_HARBOR_WILL_BE_ARRIVING_AT_TALKING_ISLAND_IN_APPROXIMATELY_10_MINUTES;
	
	@ClientString(id = 1164, message = "The ferry from Giran Harbor will be arriving at Talking Island in approximately 5 minutes.")
	public static SystemMessageId THE_FERRY_FROM_GIRAN_HARBOR_WILL_BE_ARRIVING_AT_TALKING_ISLAND_IN_APPROXIMATELY_5_MINUTES;
	
	@ClientString(id = 1165, message = "The ferry from Giran Harbor will be arriving at Talking Island in approximately 1 minute.")
	public static SystemMessageId THE_FERRY_FROM_GIRAN_HARBOR_WILL_BE_ARRIVING_AT_TALKING_ISLAND_IN_APPROXIMATELY_1_MINUTE;
	
	@ClientString(id = 1166, message = "The ferry from Talking Island will be arriving at Giran Harbor in approximately 20 minutes.")
	public static SystemMessageId THE_FERRY_FROM_TALKING_ISLAND_WILL_BE_ARRIVING_AT_GIRAN_HARBOR_IN_APPROXIMATELY_20_MINUTES;
	
	@ClientString(id = 1167, message = "The ferry from Talking Island will be arriving at Giran Harbor in approximately 15 minutes.")
	public static SystemMessageId THE_FERRY_FROM_TALKING_ISLAND_WILL_BE_ARRIVING_AT_GIRAN_HARBOR_IN_APPROXIMATELY_15_MINUTES;
	
	@ClientString(id = 1168, message = "The ferry from Talking Island will be arriving at Giran Harbor in approximately 10 minutes.")
	public static SystemMessageId THE_FERRY_FROM_TALKING_ISLAND_WILL_BE_ARRIVING_AT_GIRAN_HARBOR_IN_APPROXIMATELY_10_MINUTES;
	
	@ClientString(id = 1169, message = "The ferry from Talking Island will be arriving at Giran Harbor in approximately 5 minutes.")
	public static SystemMessageId THE_FERRY_FROM_TALKING_ISLAND_WILL_BE_ARRIVING_AT_GIRAN_HARBOR_IN_APPROXIMATELY_5_MINUTES;
	
	@ClientString(id = 1170, message = "The ferry from Talking Island will be arriving at Giran Harbor in approximately 1 minute.")
	public static SystemMessageId THE_FERRY_FROM_TALKING_ISLAND_WILL_BE_ARRIVING_AT_GIRAN_HARBOR_IN_APPROXIMATELY_1_MINUTE;
	
	@ClientString(id = 1171, message = "The Innadril pleasure boat will arrive in approximately 20 minutes.")
	public static SystemMessageId THE_INNADRIL_PLEASURE_BOAT_WILL_ARRIVE_IN_APPROXIMATELY_20_MINUTES;
	
	@ClientString(id = 1172, message = "The Innadril pleasure boat will arrive in approximately 15 minutes.")
	public static SystemMessageId THE_INNADRIL_PLEASURE_BOAT_WILL_ARRIVE_IN_APPROXIMATELY_15_MINUTES;
	
	@ClientString(id = 1173, message = "The Innadril pleasure boat will arrive in approximately 10 minutes.")
	public static SystemMessageId THE_INNADRIL_PLEASURE_BOAT_WILL_ARRIVE_IN_APPROXIMATELY_10_MINUTES;
	
	@ClientString(id = 1174, message = "The Innadril pleasure boat will arrive in approximately 5 minutes.")
	public static SystemMessageId THE_INNADRIL_PLEASURE_BOAT_WILL_ARRIVE_IN_APPROXIMATELY_5_MINUTES;
	
	@ClientString(id = 1175, message = "The Innadril pleasure boat will arrive in approximately 1 minute.")
	public static SystemMessageId THE_INNADRIL_PLEASURE_BOAT_WILL_ARRIVE_IN_APPROXIMATELY_1_MINUTE;
	
	@ClientString(id = 1176, message = "The SSQ Competition period is underway.")
	public static SystemMessageId THE_SSQ_COMPETITION_PERIOD_IS_UNDERWAY;
	
	@ClientString(id = 1177, message = "This is the seal validation period.")
	public static SystemMessageId THIS_IS_THE_SEAL_VALIDATION_PERIOD;
	
	@ClientString(id = 1178, message = "This seal permits the group that holds it to exclusive entry to the dungeons opened by the Seal of Avarice during the seal validation period.  It also permits trading with the Merchant of Mammon and permits meetings with Anakim or Lilith in the Disciple's Necropolis.")
	public static SystemMessageId THIS_SEAL_PERMITS_THE_GROUP_THAT_HOLDS_IT_TO_EXCLUSIVE_ENTRY_TO_THE_DUNGEONS_OPENED_BY_THE_SEAL_OF_AVARICE_DURING_THE_SEAL_VALIDATION_PERIOD_IT_ALSO_PERMITS_TRADING_WITH_THE_MERCHANT_OF_MAMMON_AND_PERMITS_MEETINGS_WITH_ANAKIM_OR_LILITH_IN_THE_DISCIPLE_S_NECROPOLIS;
	
	@ClientString(id = 1179, message = "This seal permits the group that holds it to enter the dungeon opened by the Seal of Gnosis, use the teleportation service offered by the priest in the village, and do business with the Blacksmith of Mammon. The Orator of Revelations appears and casts good magic on the winners, and the Preacher of Doom appears and casts bad magic on the losers.")
	public static SystemMessageId THIS_SEAL_PERMITS_THE_GROUP_THAT_HOLDS_IT_TO_ENTER_THE_DUNGEON_OPENED_BY_THE_SEAL_OF_GNOSIS_USE_THE_TELEPORTATION_SERVICE_OFFERED_BY_THE_PRIEST_IN_THE_VILLAGE_AND_DO_BUSINESS_WITH_THE_BLACKSMITH_OF_MAMMON_THE_ORATOR_OF_REVELATIONS_APPEARS_AND_CASTS_GOOD_MAGIC_ON_THE_WINNERS_AND_THE_PREACHER_OF_DOOM_APPEARS_AND_CASTS_BAD_MAGIC_ON_THE_LOSERS;
	
	@ClientString(id = 1180, message = "During the Seal Validation period, the cabal's maximum CP amount increases. In addition, the cabal possessing the seal will benefit from favorable changes in the cost to up-grade Castle defense mercenaries, castle gates and walls; basic P. Def. of castle gates and walls; and the limit imposed on the castle tax rate. The use of siege war weapons will also be limited. If the Revolutionary Army of Dusk takes possession of this seal during the castle siege war, only the clan that owns the castle can come to its defense.")
	public static SystemMessageId DURING_THE_SEAL_VALIDATION_PERIOD_THE_CABAL_S_MAXIMUM_CP_AMOUNT_INCREASES_IN_ADDITION_THE_CABAL_POSSESSING_THE_SEAL_WILL_BENEFIT_FROM_FAVORABLE_CHANGES_IN_THE_COST_TO_UP_GRADE_CASTLE_DEFENSE_MERCENARIES_CASTLE_GATES_AND_WALLS_BASIC_P_DEF_OF_CASTLE_GATES_AND_WALLS_AND_THE_LIMIT_IMPOSED_ON_THE_CASTLE_TAX_RATE_THE_USE_OF_SIEGE_WAR_WEAPONS_WILL_ALSO_BE_LIMITED_IF_THE_REVOLUTIONARY_ARMY_OF_DUSK_TAKES_POSSESSION_OF_THIS_SEAL_DURING_THE_CASTLE_SIEGE_WAR_ONLY_THE_CLAN_THAT_OWNS_THE_CASTLE_CAN_COME_TO_ITS_DEFENSE;
	
	@ClientString(id = 1181, message = "Do you really wish to change the title?")
	public static SystemMessageId DO_YOU_REALLY_WISH_TO_CHANGE_THE_TITLE;
	
	@ClientString(id = 1182, message = "Are you sure you wish to delete the clan crest?")
	public static SystemMessageId ARE_YOU_SURE_YOU_WISH_TO_DELETE_THE_CLAN_CREST;
	
	@ClientString(id = 1183, message = "This is the initial period.")
	public static SystemMessageId THIS_IS_THE_INITIAL_PERIOD;
	
	@ClientString(id = 1184, message = "This is a period when server statistics are calculated.")
	public static SystemMessageId THIS_IS_A_PERIOD_WHEN_SERVER_STATISTICS_ARE_CALCULATED;
	
	@ClientString(id = 1185, message = "days left until deletion.")
	public static SystemMessageId DAYS_LEFT_UNTIL_DELETION;
	
	@ClientString(id = 1186, message = "To create a new account, please visit Lineage II's Support Website (https://support.lineage2.com).")
	public static SystemMessageId TO_CREATE_A_NEW_ACCOUNT_PLEASE_VISIT_LINEAGE_II_S_SUPPORT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM;
	
	@ClientString(id = 1187, message = "If you've forgotten your account information or password, please visit Lineage II's Support Website (https://support.lineage2.com).")
	public static SystemMessageId IF_YOU_VE_FORGOTTEN_YOUR_ACCOUNT_INFORMATION_OR_PASSWORD_PLEASE_VISIT_LINEAGE_II_S_SUPPORT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM;
	
	@ClientString(id = 1188, message = "Your selected target can no longer receive a recommendation.")
	public static SystemMessageId YOUR_SELECTED_TARGET_CAN_NO_LONGER_RECEIVE_A_RECOMMENDATION;
	
	@ClientString(id = 1189, message = "The temporary alliance of the Castle Attacker team is in effect. It will be dissolved when the Castle Lord is replaced.")
	public static SystemMessageId THE_TEMPORARY_ALLIANCE_OF_THE_CASTLE_ATTACKER_TEAM_IS_IN_EFFECT_IT_WILL_BE_DISSOLVED_WHEN_THE_CASTLE_LORD_IS_REPLACED;
	
	@ClientString(id = 1190, message = "The temporary alliance of the Castle Attacker team has been dissolved.")
	public static SystemMessageId THE_TEMPORARY_ALLIANCE_OF_THE_CASTLE_ATTACKER_TEAM_HAS_BEEN_DISSOLVED;
	
	@ClientString(id = 1191, message = "The ferry from Gludin Harbor will be arriving at Talking Island in approximately 10 minutes.")
	public static SystemMessageId THE_FERRY_FROM_GLUDIN_HARBOR_WILL_BE_ARRIVING_AT_TALKING_ISLAND_IN_APPROXIMATELY_10_MINUTES;
	
	@ClientString(id = 1192, message = "The ferry from Gludin Harbor will be arriving at Talking Island in approximately 5 minutes.")
	public static SystemMessageId THE_FERRY_FROM_GLUDIN_HARBOR_WILL_BE_ARRIVING_AT_TALKING_ISLAND_IN_APPROXIMATELY_5_MINUTES;
	
	@ClientString(id = 1193, message = "The ferry from Gludin Harbor will be arriving at Talking Island in approximately 1 minute.")
	public static SystemMessageId THE_FERRY_FROM_GLUDIN_HARBOR_WILL_BE_ARRIVING_AT_TALKING_ISLAND_IN_APPROXIMATELY_1_MINUTE;
	
	@ClientString(id = 1194, message = "A mercenary can be assigned to a position from the beginning of the Seal Validation period until the time when a siege starts.")
	public static SystemMessageId A_MERCENARY_CAN_BE_ASSIGNED_TO_A_POSITION_FROM_THE_BEGINNING_OF_THE_SEAL_VALIDATION_PERIOD_UNTIL_THE_TIME_WHEN_A_SIEGE_STARTS;
	
	@ClientString(id = 1195, message = "This mercenary cannot be assigned to a position by using the Seal of Strife.")
	public static SystemMessageId THIS_MERCENARY_CANNOT_BE_ASSIGNED_TO_A_POSITION_BY_USING_THE_SEAL_OF_STRIFE;
	
	@ClientString(id = 1196, message = "Your force has reached maximum capacity.")
	public static SystemMessageId YOUR_FORCE_HAS_REACHED_MAXIMUM_CAPACITY2;
	
	@ClientString(id = 1197, message = "Summoning a servitor costs $s2 $s1.")
	public static SystemMessageId SUMMONING_A_SERVITOR_COSTS_S2_S1;
	
	@ClientString(id = 1198, message = "The item has been successfully crystallized.")
	public static SystemMessageId THE_ITEM_HAS_BEEN_SUCCESSFULLY_CRYSTALLIZED;
	
	@ClientString(id = 1199, message = "=======(Clan War Target)=======")
	public static SystemMessageId CLAN_WAR_TARGET;
	
	@ClientString(id = 1200, message = "= $s1 ($S2 Alliance)")
	public static SystemMessageId S1_S2_ALLIANCE;
	
	@ClientString(id = 1201, message = "Please select the quest you wish to abort.")
	public static SystemMessageId PLEASE_SELECT_THE_QUEST_YOU_WISH_TO_ABORT;
	
	@ClientString(id = 1202, message = "= $s1 (No Alliance exists)")
	public static SystemMessageId S1_NO_ALLIANCE_EXISTS;
	
	@ClientString(id = 1203, message = "There is no clan war in progress.")
	public static SystemMessageId THERE_IS_NO_CLAN_WAR_IN_PROGRESS;
	
	@ClientString(id = 1204, message = "The screenshot has been saved. ($s1 $s2x$s3)")
	public static SystemMessageId THE_SCREENSHOT_HAS_BEEN_SAVED_S1_S2X_S3;
	
	@ClientString(id = 1205, message = "Your mailbox is full. There is a 100 message limit.")
	public static SystemMessageId YOUR_MAILBOX_IS_FULL_THERE_IS_A_100_MESSAGE_LIMIT;
	
	@ClientString(id = 1206, message = "The memo box is full.  There is a 100 memo limit.")
	public static SystemMessageId THE_MEMO_BOX_IS_FULL_THERE_IS_A_100_MEMO_LIMIT;
	
	@ClientString(id = 1207, message = "Please make an entry in the field.")
	public static SystemMessageId PLEASE_MAKE_AN_ENTRY_IN_THE_FIELD;
	
	@ClientString(id = 1208, message = "$c1 died and dropped $s3 $s2(s).")
	public static SystemMessageId C1_DIED_AND_DROPPED_S3_S2_S;
	
	@ClientString(id = 1209, message = "Congratulations. Your raid was successful.")
	public static SystemMessageId CONGRATULATIONS_YOUR_RAID_WAS_SUCCESSFUL;
	
	@ClientString(id = 1210, message = "Seven Signs: The competition period has begun.  Visit a Priest of Dawn or Priestess of Dusk to participate in the event.")
	public static SystemMessageId SEVEN_SIGNS_THE_COMPETITION_PERIOD_HAS_BEGUN_VISIT_A_PRIEST_OF_DAWN_OR_PRIESTESS_OF_DUSK_TO_PARTICIPATE_IN_THE_EVENT;
	
	@ClientString(id = 1211, message = "Seven Signs: The competition period has ended. The next quest event will start in one week.")
	public static SystemMessageId SEVEN_SIGNS_THE_COMPETITION_PERIOD_HAS_ENDED_THE_NEXT_QUEST_EVENT_WILL_START_IN_ONE_WEEK;
	
	@ClientString(id = 1212, message = "Seven Signs: The Lords of Dawn have obtained the Seal of Avarice.")
	public static SystemMessageId SEVEN_SIGNS_THE_LORDS_OF_DAWN_HAVE_OBTAINED_THE_SEAL_OF_AVARICE;
	
	@ClientString(id = 1213, message = "Seven Signs: The Lords of Dawn have obtained the Seal of Gnosis.")
	public static SystemMessageId SEVEN_SIGNS_THE_LORDS_OF_DAWN_HAVE_OBTAINED_THE_SEAL_OF_GNOSIS;
	
	@ClientString(id = 1214, message = "Seven Signs: The Lords of Dawn have obtained the Seal of Strife.")
	public static SystemMessageId SEVEN_SIGNS_THE_LORDS_OF_DAWN_HAVE_OBTAINED_THE_SEAL_OF_STRIFE;
	
	@ClientString(id = 1215, message = "Seven Signs: The Revolutionaries of Dusk have obtained the Seal of Avarice.")
	public static SystemMessageId SEVEN_SIGNS_THE_REVOLUTIONARIES_OF_DUSK_HAVE_OBTAINED_THE_SEAL_OF_AVARICE;
	
	@ClientString(id = 1216, message = "Seven Signs: The Revolutionaries of Dusk have obtained the Seal of Gnosis.")
	public static SystemMessageId SEVEN_SIGNS_THE_REVOLUTIONARIES_OF_DUSK_HAVE_OBTAINED_THE_SEAL_OF_GNOSIS;
	
	@ClientString(id = 1217, message = "Seven Signs: The Revolutionaries of Dusk have obtained the Seal of Strife.")
	public static SystemMessageId SEVEN_SIGNS_THE_REVOLUTIONARIES_OF_DUSK_HAVE_OBTAINED_THE_SEAL_OF_STRIFE;
	
	@ClientString(id = 1218, message = "Seven Signs: The Seal Validation period has begun.")
	public static SystemMessageId SEVEN_SIGNS_THE_SEAL_VALIDATION_PERIOD_HAS_BEGUN;
	
	@ClientString(id = 1219, message = "Seven Signs: The Seal Validation period has ended.")
	public static SystemMessageId SEVEN_SIGNS_THE_SEAL_VALIDATION_PERIOD_HAS_ENDED;
	
	@ClientString(id = 1220, message = "Are you sure you wish to summon it?")
	public static SystemMessageId ARE_YOU_SURE_YOU_WISH_TO_SUMMON_IT;
	
	@ClientString(id = 1221, message = "Do you really wish to return it?")
	public static SystemMessageId DO_YOU_REALLY_WISH_TO_RETURN_IT;
	
	@ClientString(id = 1222, message = "Current Location: $s1 / $s2 / $s3 (GM Consultation Area)")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3_GM_CONSULTATION_AREA;
	
	@ClientString(id = 1223, message = "We depart for Talking Island in five minutes.")
	public static SystemMessageId WE_DEPART_FOR_TALKING_ISLAND_IN_FIVE_MINUTES;
	
	@ClientString(id = 1224, message = "We depart for Talking Island in one minute.")
	public static SystemMessageId WE_DEPART_FOR_TALKING_ISLAND_IN_ONE_MINUTE;
	
	@ClientString(id = 1225, message = "All aboard for Talking Island!")
	public static SystemMessageId ALL_ABOARD_FOR_TALKING_ISLAND;
	
	@ClientString(id = 1226, message = "We are now leaving for Talking Island.")
	public static SystemMessageId WE_ARE_NOW_LEAVING_FOR_TALKING_ISLAND;
	
	@ClientString(id = 1227, message = "You have $s1 unread messages.")
	public static SystemMessageId YOU_HAVE_S1_UNREAD_MESSAGES;
	
	@ClientString(id = 1228, message = "$c1 has blocked you. You cannot send mail to $c1.")
	public static SystemMessageId C1_HAS_BLOCKED_YOU_YOU_CANNOT_SEND_MAIL_TO_C1;
	
	@ClientString(id = 1229, message = "No more messages may be sent at this time. Each account is allowed 10 messages per day.")
	public static SystemMessageId NO_MORE_MESSAGES_MAY_BE_SENT_AT_THIS_TIME_EACH_ACCOUNT_IS_ALLOWED_10_MESSAGES_PER_DAY;
	
	@ClientString(id = 1230, message = "You are limited to five recipients at a time.")
	public static SystemMessageId YOU_ARE_LIMITED_TO_FIVE_RECIPIENTS_AT_A_TIME;
	
	@ClientString(id = 1231, message = "You've sent mail.")
	public static SystemMessageId YOU_VE_SENT_MAIL;
	
	@ClientString(id = 1232, message = "The message was not sent.")
	public static SystemMessageId THE_MESSAGE_WAS_NOT_SENT;
	
	@ClientString(id = 1233, message = "You've got mail.")
	public static SystemMessageId YOU_VE_GOT_MAIL;
	
	@ClientString(id = 1234, message = "The mail has been stored in your temporary mailbox.")
	public static SystemMessageId THE_MAIL_HAS_BEEN_STORED_IN_YOUR_TEMPORARY_MAILBOX;
	
	@ClientString(id = 1235, message = "Do you wish to delete all your friends?")
	public static SystemMessageId DO_YOU_WISH_TO_DELETE_ALL_YOUR_FRIENDS;
	
	@ClientString(id = 1236, message = "Please enter security card number.")
	public static SystemMessageId PLEASE_ENTER_SECURITY_CARD_NUMBER;
	
	@ClientString(id = 1237, message = "Please enter the card number for number $s1.")
	public static SystemMessageId PLEASE_ENTER_THE_CARD_NUMBER_FOR_NUMBER_S1;
	
	@ClientString(id = 1238, message = "Your temporary mailbox is full.  No more mail can be stored; you have reached the 10 message limit.")
	public static SystemMessageId YOUR_TEMPORARY_MAILBOX_IS_FULL_NO_MORE_MAIL_CAN_BE_STORED_YOU_HAVE_REACHED_THE_10_MESSAGE_LIMIT;
	
	@ClientString(id = 1239, message = "The keyboard security module has failed to load. Please exit the game and try again.")
	public static SystemMessageId THE_KEYBOARD_SECURITY_MODULE_HAS_FAILED_TO_LOAD_PLEASE_EXIT_THE_GAME_AND_TRY_AGAIN;
	
	@ClientString(id = 1240, message = "Seven Signs: The Revolutionaries of Dusk have won.")
	public static SystemMessageId SEVEN_SIGNS_THE_REVOLUTIONARIES_OF_DUSK_HAVE_WON;
	
	@ClientString(id = 1241, message = "Seven Signs: The Lords of Dawn have won.")
	public static SystemMessageId SEVEN_SIGNS_THE_LORDS_OF_DAWN_HAVE_WON;
	
	@ClientString(id = 1242, message = "Users who have not verified their age may not log in between the hours of 10:00 p.m. and 6:00 a.m.")
	public static SystemMessageId USERS_WHO_HAVE_NOT_VERIFIED_THEIR_AGE_MAY_NOT_LOG_IN_BETWEEN_THE_HOURS_OF_10_00_P_M_AND_6_00_A_M;
	
	@ClientString(id = 1243, message = "The security card number is invalid.")
	public static SystemMessageId THE_SECURITY_CARD_NUMBER_IS_INVALID;
	
	@ClientString(id = 1244, message = "Users who have not verified their age may not log in between the hours of 10:00 p.m. and 6:00 a.m. Logging off now.")
	public static SystemMessageId USERS_WHO_HAVE_NOT_VERIFIED_THEIR_AGE_MAY_NOT_LOG_IN_BETWEEN_THE_HOURS_OF_10_00_P_M_AND_6_00_A_M_LOGGING_OFF_NOW;
	
	@ClientString(id = 1245, message = "You will be logged out in $s1 minute(s).")
	public static SystemMessageId YOU_WILL_BE_LOGGED_OUT_IN_S1_MINUTE_S;
	
	@ClientString(id = 1246, message = "$c1 has died and dropped $s2 Adena.")
	public static SystemMessageId C1_HAS_DIED_AND_DROPPED_S2_ADENA;
	
	@ClientString(id = 1247, message = "The corpse is too old. The skill cannot be used.")
	public static SystemMessageId THE_CORPSE_IS_TOO_OLD_THE_SKILL_CANNOT_BE_USED;
	
	@ClientString(id = 1248, message = "You are out of feed. Mount status canceled.")
	public static SystemMessageId YOU_ARE_OUT_OF_FEED_MOUNT_STATUS_CANCELED;
	
	@ClientString(id = 1249, message = "You may only ride a wyvern while you're riding a strider.")
	public static SystemMessageId YOU_MAY_ONLY_RIDE_A_WYVERN_WHILE_YOU_RE_RIDING_A_STRIDER;
	
	@ClientString(id = 1250, message = "Do you really want to surrender? If you surrender during an alliance war, your XP will drop the same as if you were to die once.")
	public static SystemMessageId DO_YOU_REALLY_WANT_TO_SURRENDER_IF_YOU_SURRENDER_DURING_AN_ALLIANCE_WAR_YOUR_XP_WILL_DROP_THE_SAME_AS_IF_YOU_WERE_TO_DIE_ONCE;
	
	@ClientString(id = 1251, message = "Are you sure you want to dismiss the alliance? If you use the /allydismiss command, you will not be able to accept another clan to your alliance for one day.")
	public static SystemMessageId ARE_YOU_SURE_YOU_WANT_TO_DISMISS_THE_ALLIANCE_IF_YOU_USE_THE_ALLYDISMISS_COMMAND_YOU_WILL_NOT_BE_ABLE_TO_ACCEPT_ANOTHER_CLAN_TO_YOUR_ALLIANCE_FOR_ONE_DAY;
	
	@ClientString(id = 1252, message = "Are you sure you want to surrender? XP penalty will be the same as death.")
	public static SystemMessageId ARE_YOU_SURE_YOU_WANT_TO_SURRENDER_XP_PENALTY_WILL_BE_THE_SAME_AS_DEATH;
	
	@ClientString(id = 1253, message = "Are you sure you want to surrender? XP penalty will be the same as death and you will not be allowed to participate in clan war.")
	public static SystemMessageId ARE_YOU_SURE_YOU_WANT_TO_SURRENDER_XP_PENALTY_WILL_BE_THE_SAME_AS_DEATH_AND_YOU_WILL_NOT_BE_ALLOWED_TO_PARTICIPATE_IN_CLAN_WAR;
	
	@ClientString(id = 1254, message = "Thank you for submitting feedback.")
	public static SystemMessageId THANK_YOU_FOR_SUBMITTING_FEEDBACK;
	
	@ClientString(id = 1255, message = "GM consultation has begun.")
	public static SystemMessageId GM_CONSULTATION_HAS_BEGUN;
	
	@ClientString(id = 1256, message = "Please write the name after the command.")
	public static SystemMessageId PLEASE_WRITE_THE_NAME_AFTER_THE_COMMAND;
	
	@ClientString(id = 1257, message = "The special skill of a servitor or pet cannot be registered as a macro.")
	public static SystemMessageId THE_SPECIAL_SKILL_OF_A_SERVITOR_OR_PET_CANNOT_BE_REGISTERED_AS_A_MACRO;
	
	@ClientString(id = 1258, message = "$s1 has been crystallized.")
	public static SystemMessageId S1_HAS_BEEN_CRYSTALLIZED;
	
	@ClientString(id = 1259, message = "=======(Alliance Target)=======")
	public static SystemMessageId ALLIANCE_TARGET;
	
	@ClientString(id = 1260, message = "Seven Signs: Preparations have begun for the next quest event.")
	public static SystemMessageId SEVEN_SIGNS_PREPARATIONS_HAVE_BEGUN_FOR_THE_NEXT_QUEST_EVENT;
	
	@ClientString(id = 1261, message = "Seven Signs: The quest event period has begun. Speak with a Priest of Dawn or Priestess of Dusk if you wish to participate in the event.")
	public static SystemMessageId SEVEN_SIGNS_THE_QUEST_EVENT_PERIOD_HAS_BEGUN_SPEAK_WITH_A_PRIEST_OF_DAWN_OR_PRIESTESS_OF_DUSK_IF_YOU_WISH_TO_PARTICIPATE_IN_THE_EVENT;
	
	@ClientString(id = 1262, message = "Seven Signs: Quest event has ended. Results are being tallied.")
	public static SystemMessageId SEVEN_SIGNS_QUEST_EVENT_HAS_ENDED_RESULTS_ARE_BEING_TALLIED;
	
	@ClientString(id = 1263, message = "Seven Signs: This is the seal validation period. A new quest event period begins next Monday.")
	public static SystemMessageId SEVEN_SIGNS_THIS_IS_THE_SEAL_VALIDATION_PERIOD_A_NEW_QUEST_EVENT_PERIOD_BEGINS_NEXT_MONDAY;
	
	@ClientString(id = 1264, message = "This soul stone cannot currently absorb souls. Absorption has failed.")
	public static SystemMessageId THIS_SOUL_STONE_CANNOT_CURRENTLY_ABSORB_SOULS_ABSORPTION_HAS_FAILED;
	
	@ClientString(id = 1265, message = "You can't absorb souls without a soul stone.")
	public static SystemMessageId YOU_CAN_T_ABSORB_SOULS_WITHOUT_A_SOUL_STONE;
	
	@ClientString(id = 1266, message = "The exchange has ended.")
	public static SystemMessageId THE_EXCHANGE_HAS_ENDED;
	
	@ClientString(id = 1267, message = "Your contribution score has increased by $s1.")
	public static SystemMessageId YOUR_CONTRIBUTION_SCORE_HAS_INCREASED_BY_S1;
	
	@ClientString(id = 1268, message = "Do you wish to add $s1 as your subclass?")
	public static SystemMessageId DO_YOU_WISH_TO_ADD_S1_AS_YOUR_SUBCLASS;
	
	@ClientString(id = 1269, message = "The new subclass has been added.")
	public static SystemMessageId THE_NEW_SUBCLASS_HAS_BEEN_ADDED;
	
	@ClientString(id = 1270, message = "You have successfully switched $s1 to $s2.")
	public static SystemMessageId YOU_HAVE_SUCCESSFULLY_SWITCHED_S1_TO_S2;
	
	@ClientString(id = 1271, message = "Do you wish to participate? Until the next seal validation period, you will be a member of the Lords of Dawn.")
	public static SystemMessageId DO_YOU_WISH_TO_PARTICIPATE_UNTIL_THE_NEXT_SEAL_VALIDATION_PERIOD_YOU_WILL_BE_A_MEMBER_OF_THE_LORDS_OF_DAWN;
	
	@ClientString(id = 1272, message = "Do you wish to participate? Until the next seal validation period, you will be a member of the Revolutionaries of Dusk.")
	public static SystemMessageId DO_YOU_WISH_TO_PARTICIPATE_UNTIL_THE_NEXT_SEAL_VALIDATION_PERIOD_YOU_WILL_BE_A_MEMBER_OF_THE_REVOLUTIONARIES_OF_DUSK;
	
	@ClientString(id = 1273, message = "You will participate in the Seven Signs as a member of the Lords of Dawn.")
	public static SystemMessageId YOU_WILL_PARTICIPATE_IN_THE_SEVEN_SIGNS_AS_A_MEMBER_OF_THE_LORDS_OF_DAWN;
	
	@ClientString(id = 1274, message = "You will participate in the Seven Signs as a member of the Revolutionaries of Dusk.")
	public static SystemMessageId YOU_WILL_PARTICIPATE_IN_THE_SEVEN_SIGNS_AS_A_MEMBER_OF_THE_REVOLUTIONARIES_OF_DUSK;
	
	@ClientString(id = 1275, message = "You've chosen to fight for the Seal of Avarice during this quest event period.")
	public static SystemMessageId YOU_VE_CHOSEN_TO_FIGHT_FOR_THE_SEAL_OF_AVARICE_DURING_THIS_QUEST_EVENT_PERIOD;
	
	@ClientString(id = 1276, message = "You've chosen to fight for the Seal of Gnosis during this quest event period.")
	public static SystemMessageId YOU_VE_CHOSEN_TO_FIGHT_FOR_THE_SEAL_OF_GNOSIS_DURING_THIS_QUEST_EVENT_PERIOD;
	
	@ClientString(id = 1277, message = "You've chosen to fight for the Seal of Strife during this quest event period.")
	public static SystemMessageId YOU_VE_CHOSEN_TO_FIGHT_FOR_THE_SEAL_OF_STRIFE_DURING_THIS_QUEST_EVENT_PERIOD;
	
	@ClientString(id = 1278, message = "The NPC server is not operating at this time.")
	public static SystemMessageId THE_NPC_SERVER_IS_NOT_OPERATING_AT_THIS_TIME;
	
	@ClientString(id = 1279, message = "Contribution level has exceeded the limit. You may not continue.")
	public static SystemMessageId CONTRIBUTION_LEVEL_HAS_EXCEEDED_THE_LIMIT_YOU_MAY_NOT_CONTINUE;
	
	@ClientString(id = 1280, message = "M. Critical!")
	public static SystemMessageId M_CRITICAL;
	
	@ClientString(id = 1281, message = "Your excellent shield defense was a success!")
	public static SystemMessageId YOUR_EXCELLENT_SHIELD_DEFENSE_WAS_A_SUCCESS;
	
	@ClientString(id = 1282, message = "Your Reputation has been changed to $s1.")
	public static SystemMessageId YOUR_REPUTATION_HAS_BEEN_CHANGED_TO_S1;
	
	@ClientString(id = 1283, message = "The Lower Detail option has been activated.")
	public static SystemMessageId THE_LOWER_DETAIL_OPTION_HAS_BEEN_ACTIVATED;
	
	@ClientString(id = 1284, message = "The Lower Detail option has been deactivated.")
	public static SystemMessageId THE_LOWER_DETAIL_OPTION_HAS_BEEN_DEACTIVATED;
	
	@ClientString(id = 1285, message = "No inventory exists. You cannot purchase an item.")
	public static SystemMessageId NO_INVENTORY_EXISTS_YOU_CANNOT_PURCHASE_AN_ITEM;
	
	@ClientString(id = 1286, message = "(Until next Monday at 6:00 p.m.)")
	public static SystemMessageId UNTIL_NEXT_MONDAY_AT_6_00_P_M;
	
	@ClientString(id = 1287, message = "(Until today at 6:00 p.m.)")
	public static SystemMessageId UNTIL_TODAY_AT_6_00_P_M;
	
	@ClientString(id = 1288, message = "If trends continue, $s1 will win and the seal will belong to:")
	public static SystemMessageId IF_TRENDS_CONTINUE_S1_WILL_WIN_AND_THE_SEAL_WILL_BELONG_TO;
	
	@ClientString(id = 1289, message = "The seal was owned during the previous period and 10% or more people have voted.")
	public static SystemMessageId THE_SEAL_WAS_OWNED_DURING_THE_PREVIOUS_PERIOD_AND_10_OR_MORE_PEOPLE_HAVE_VOTED;
	
	@ClientString(id = 1290, message = "Although the seal was not owned, 35% or more people have voted.")
	public static SystemMessageId ALTHOUGH_THE_SEAL_WAS_NOT_OWNED_35_OR_MORE_PEOPLE_HAVE_VOTED;
	
	@ClientString(id = 1291, message = "Although the seal was owned during the previous period, less than 10% of people have voted.")
	public static SystemMessageId ALTHOUGH_THE_SEAL_WAS_OWNED_DURING_THE_PREVIOUS_PERIOD_LESS_THAN_10_OF_PEOPLE_HAVE_VOTED;
	
	@ClientString(id = 1292, message = "Since the seal was not owned during the previous period, and since less than 35 percent of people have voted.")
	public static SystemMessageId SINCE_THE_SEAL_WAS_NOT_OWNED_DURING_THE_PREVIOUS_PERIOD_AND_SINCE_LESS_THAN_35_PERCENT_OF_PEOPLE_HAVE_VOTED;
	
	@ClientString(id = 1293, message = "If current trends continue, it will end in a tie.")
	public static SystemMessageId IF_CURRENT_TRENDS_CONTINUE_IT_WILL_END_IN_A_TIE;
	
	@ClientString(id = 1294, message = "The competition has ended in a tie. Therefore, nobody has been awarded the seal.")
	public static SystemMessageId THE_COMPETITION_HAS_ENDED_IN_A_TIE_THEREFORE_NOBODY_HAS_BEEN_AWARDED_THE_SEAL;
	
	@ClientString(id = 1295, message = "Subclasses may not be created or changed while a skill is in use.")
	public static SystemMessageId SUBCLASSES_MAY_NOT_BE_CREATED_OR_CHANGED_WHILE_A_SKILL_IS_IN_USE;
	
	@ClientString(id = 1296, message = "You cannot open a Private Store here.")
	public static SystemMessageId YOU_CANNOT_OPEN_A_PRIVATE_STORE_HERE;
	
	@ClientString(id = 1297, message = "You cannot open a Private Workshop here.")
	public static SystemMessageId YOU_CANNOT_OPEN_A_PRIVATE_WORKSHOP_HERE;
	
	@ClientString(id = 1298, message = "Please confirm that you would like to exit the Monster Race Track.")
	public static SystemMessageId PLEASE_CONFIRM_THAT_YOU_WOULD_LIKE_TO_EXIT_THE_MONSTER_RACE_TRACK;
	
	@ClientString(id = 1299, message = "$c1's casting has been interrupted.")
	public static SystemMessageId C1_S_CASTING_HAS_BEEN_INTERRUPTED;
	
	@ClientString(id = 1300, message = "You are no longer trying on equipment.")
	public static SystemMessageId YOU_ARE_NO_LONGER_TRYING_ON_EQUIPMENT;
	
	@ClientString(id = 1301, message = "Only a Lord of Dawn may use this.")
	public static SystemMessageId ONLY_A_LORD_OF_DAWN_MAY_USE_THIS;
	
	@ClientString(id = 1302, message = "Only a Revolutionary of Dusk may use this.")
	public static SystemMessageId ONLY_A_REVOLUTIONARY_OF_DUSK_MAY_USE_THIS;
	
	@ClientString(id = 1303, message = "This may only be used during the quest event period.")
	public static SystemMessageId THIS_MAY_ONLY_BE_USED_DURING_THE_QUEST_EVENT_PERIOD;
	
	@ClientString(id = 1304, message = "The influence of the Seal of Strife has caused all defensive registrations to be canceled.")
	public static SystemMessageId THE_INFLUENCE_OF_THE_SEAL_OF_STRIFE_HAS_CAUSED_ALL_DEFENSIVE_REGISTRATIONS_TO_BE_CANCELED;
	
	@ClientString(id = 1305, message = "Seal Stones may only be transferred during the quest event period.")
	public static SystemMessageId SEAL_STONES_MAY_ONLY_BE_TRANSFERRED_DURING_THE_QUEST_EVENT_PERIOD;
	
	@ClientString(id = 1306, message = "You are no longer trying on equipment.")
	public static SystemMessageId YOU_ARE_NO_LONGER_TRYING_ON_EQUIPMENT2;
	
	@ClientString(id = 1307, message = "Only during the seal validation period may you settle your account.")
	public static SystemMessageId ONLY_DURING_THE_SEAL_VALIDATION_PERIOD_MAY_YOU_SETTLE_YOUR_ACCOUNT;
	
	@ClientString(id = 1308, message = "Congratulations - You've completed a class transfer!")
	public static SystemMessageId CONGRATULATIONS_YOU_VE_COMPLETED_A_CLASS_TRANSFER;
	
	@ClientString(id = 1309, message = "To use this option, you must have the latest version of Windows Live Messenger installed on your computer.")
	public static SystemMessageId TO_USE_THIS_OPTION_YOU_MUST_HAVE_THE_LATEST_VERSION_OF_WINDOWS_LIVE_MESSENGER_INSTALLED_ON_YOUR_COMPUTER;
	
	@ClientString(id = 1310, message = "For full functionality, the latest version of Windows Live Messenger must be installed on your computer.")
	public static SystemMessageId FOR_FULL_FUNCTIONALITY_THE_LATEST_VERSION_OF_WINDOWS_LIVE_MESSENGER_MUST_BE_INSTALLED_ON_YOUR_COMPUTER;
	
	@ClientString(id = 1311, message = "Previous versions of Windows Live Messenger only provide the basic features for in-game Windows Live Messenger chat.  Add/Delete Contacts and other Windows Live Messenger options are not available.")
	public static SystemMessageId PREVIOUS_VERSIONS_OF_WINDOWS_LIVE_MESSENGER_ONLY_PROVIDE_THE_BASIC_FEATURES_FOR_IN_GAME_WINDOWS_LIVE_MESSENGER_CHAT_ADD_DELETE_CONTACTS_AND_OTHER_WINDOWS_LIVE_MESSENGER_OPTIONS_ARE_NOT_AVAILABLE;
	
	@ClientString(id = 1312, message = "The latest version of Windows Live Messenger may be obtained from the Windows Live web site (http://explore.live.com/messenger).")
	public static SystemMessageId THE_LATEST_VERSION_OF_WINDOWS_LIVE_MESSENGER_MAY_BE_OBTAINED_FROM_THE_WINDOWS_LIVE_WEB_SITE_HTTP_EXPLORE_LIVE_COM_MESSENGER;
	
	@ClientString(id = 1313, message = "To better serve our customers, all chat histories are stored and maintained by NCSOFT. If you do not agree to have your chat records stored, please close the chat window now. For more information regarding this procedure, please visit our home page at http://us.ncsoft.com/en/legal/user-agreements/lineage-2-user-agreement.html. Thank you!")
	public static SystemMessageId TO_BETTER_SERVE_OUR_CUSTOMERS_ALL_CHAT_HISTORIES_ARE_STORED_AND_MAINTAINED_BY_NCSOFT_IF_YOU_DO_NOT_AGREE_TO_HAVE_YOUR_CHAT_RECORDS_STORED_PLEASE_CLOSE_THE_CHAT_WINDOW_NOW_FOR_MORE_INFORMATION_REGARDING_THIS_PROCEDURE_PLEASE_VISIT_OUR_HOME_PAGE_AT_HTTP_US_NCSOFT_COM_EN_LEGAL_USER_AGREEMENTS_LINEAGE_2_USER_AGREEMENT_HTML_THANK_YOU;
	
	@ClientString(id = 1314, message = "Please enter the passport ID of the person you wish to add to your contact list.")
	public static SystemMessageId PLEASE_ENTER_THE_PASSPORT_ID_OF_THE_PERSON_YOU_WISH_TO_ADD_TO_YOUR_CONTACT_LIST;
	
	@ClientString(id = 1315, message = "Deleting a contact will remove that contact from Windows Live Messenger as well. The contact can still check your online status and will not be blocked from sending you a message.")
	public static SystemMessageId DELETING_A_CONTACT_WILL_REMOVE_THAT_CONTACT_FROM_WINDOWS_LIVE_MESSENGER_AS_WELL_THE_CONTACT_CAN_STILL_CHECK_YOUR_ONLINE_STATUS_AND_WILL_NOT_BE_BLOCKED_FROM_SENDING_YOU_A_MESSAGE;
	
	@ClientString(id = 1316, message = "The contact will be deleted and blocked from your contact list.")
	public static SystemMessageId THE_CONTACT_WILL_BE_DELETED_AND_BLOCKED_FROM_YOUR_CONTACT_LIST;
	
	@ClientString(id = 1317, message = "Would you like to delete this contact?")
	public static SystemMessageId WOULD_YOU_LIKE_TO_DELETE_THIS_CONTACT;
	
	@ClientString(id = 1318, message = "Please select the contact you want to block or unblock.")
	public static SystemMessageId PLEASE_SELECT_THE_CONTACT_YOU_WANT_TO_BLOCK_OR_UNBLOCK;
	
	@ClientString(id = 1319, message = "Please select the name of the contact you wish to change to another group.")
	public static SystemMessageId PLEASE_SELECT_THE_NAME_OF_THE_CONTACT_YOU_WISH_TO_CHANGE_TO_ANOTHER_GROUP;
	
	@ClientString(id = 1320, message = "After selecting the group you wish to move your contact to, press the OK button.")
	public static SystemMessageId AFTER_SELECTING_THE_GROUP_YOU_WISH_TO_MOVE_YOUR_CONTACT_TO_PRESS_THE_OK_BUTTON;
	
	@ClientString(id = 1321, message = "Enter the name of the group you wish to add.")
	public static SystemMessageId ENTER_THE_NAME_OF_THE_GROUP_YOU_WISH_TO_ADD;
	
	@ClientString(id = 1322, message = "Select the group and enter the new name.")
	public static SystemMessageId SELECT_THE_GROUP_AND_ENTER_THE_NEW_NAME;
	
	@ClientString(id = 1323, message = "Select the group you wish to delete and click the OK button.")
	public static SystemMessageId SELECT_THE_GROUP_YOU_WISH_TO_DELETE_AND_CLICK_THE_OK_BUTTON;
	
	@ClientString(id = 1324, message = "Signing in...")
	public static SystemMessageId SIGNING_IN;
	
	@ClientString(id = 1325, message = "You've logged into another computer and have been logged out of the .NET Messenger Service on this computer.")
	public static SystemMessageId YOU_VE_LOGGED_INTO_ANOTHER_COMPUTER_AND_HAVE_BEEN_LOGGED_OUT_OF_THE_NET_MESSENGER_SERVICE_ON_THIS_COMPUTER;
	
	@ClientString(id = 1326, message = "$s1:")
	public static SystemMessageId S1;
	
	@ClientString(id = 1327, message = "The following message could not be delivered:")
	public static SystemMessageId THE_FOLLOWING_MESSAGE_COULD_NOT_BE_DELIVERED;
	
	@ClientString(id = 1328, message = "Members of the Revolutionaries of Dusk will not be resurrected.")
	public static SystemMessageId MEMBERS_OF_THE_REVOLUTIONARIES_OF_DUSK_WILL_NOT_BE_RESURRECTED;
	
	@ClientString(id = 1329, message = "You are currently blocked from using the Private Store and Private Workshop.")
	public static SystemMessageId YOU_ARE_CURRENTLY_BLOCKED_FROM_USING_THE_PRIVATE_STORE_AND_PRIVATE_WORKSHOP;
	
	@ClientString(id = 1330, message = "You may not open a Private Store or Private Workshop for another $s1 minute(s).")
	public static SystemMessageId YOU_MAY_NOT_OPEN_A_PRIVATE_STORE_OR_PRIVATE_WORKSHOP_FOR_ANOTHER_S1_MINUTE_S;
	
	@ClientString(id = 1331, message = "You are no longer blocked from using Private Stores or Private Workshops.")
	public static SystemMessageId YOU_ARE_NO_LONGER_BLOCKED_FROM_USING_PRIVATE_STORES_OR_PRIVATE_WORKSHOPS;
	
	@ClientString(id = 1332, message = "Items may not be used after your character or pet dies.")
	public static SystemMessageId ITEMS_MAY_NOT_BE_USED_AFTER_YOUR_CHARACTER_OR_PET_DIES;
	
	@ClientString(id = 1333, message = "The replay file is not accessible. Please verify that the replay.ini file exists in your Lineage II directory. Please note that footage from previous major updates are not accessible in newer updates.")
	public static SystemMessageId THE_REPLAY_FILE_IS_NOT_ACCESSIBLE_PLEASE_VERIFY_THAT_THE_REPLAY_INI_FILE_EXISTS_IN_YOUR_LINEAGE_II_DIRECTORY_PLEASE_NOTE_THAT_FOOTAGE_FROM_PREVIOUS_MAJOR_UPDATES_ARE_NOT_ACCESSIBLE_IN_NEWER_UPDATES;
	
	@ClientString(id = 1334, message = "Your recording has been stored in the Replay folder.")
	public static SystemMessageId YOUR_RECORDING_HAS_BEEN_STORED_IN_THE_REPLAY_FOLDER;
	
	@ClientString(id = 1335, message = "Your attempt to store this recording has failed.")
	public static SystemMessageId YOUR_ATTEMPT_TO_STORE_THIS_RECORDING_HAS_FAILED;
	
	@ClientString(id = 1336, message = "The replay file, $s1.$s2 has been corrupted, please check the file.")
	public static SystemMessageId THE_REPLAY_FILE_S1_S2_HAS_BEEN_CORRUPTED_PLEASE_CHECK_THE_FILE;
	
	@ClientString(id = 1337, message = "This will terminate the replay.  Do you wish to continue?")
	public static SystemMessageId THIS_WILL_TERMINATE_THE_REPLAY_DO_YOU_WISH_TO_CONTINUE;
	
	@ClientString(id = 1338, message = "You have exceeded the maximum amount that may be transferred at one time.")
	public static SystemMessageId YOU_HAVE_EXCEEDED_THE_MAXIMUM_AMOUNT_THAT_MAY_BE_TRANSFERRED_AT_ONE_TIME;
	
	@ClientString(id = 1339, message = "Once a macro is assigned to a shortcut, it cannot be run as part of a new macro.")
	public static SystemMessageId ONCE_A_MACRO_IS_ASSIGNED_TO_A_SHORTCUT_IT_CANNOT_BE_RUN_AS_PART_OF_A_NEW_MACRO;
	
	@ClientString(id = 1340, message = "This server cannot be accessed with the coupon you are using.")
	public static SystemMessageId THIS_SERVER_CANNOT_BE_ACCESSED_WITH_THE_COUPON_YOU_ARE_USING;
	
	@ClientString(id = 1341, message = "Incorrect name and/or email address.")
	public static SystemMessageId INCORRECT_NAME_AND_OR_EMAIL_ADDRESS;
	
	@ClientString(id = 1342, message = "You are already logged in.")
	public static SystemMessageId YOU_ARE_ALREADY_LOGGED_IN;
	
	@ClientString(id = 1343, message = "Incorrect email address and/or password.  Your attempt to log into .NET Messenger Service has failed.")
	public static SystemMessageId INCORRECT_EMAIL_ADDRESS_AND_OR_PASSWORD_YOUR_ATTEMPT_TO_LOG_INTO_NET_MESSENGER_SERVICE_HAS_FAILED;
	
	@ClientString(id = 1344, message = "Your request to log into the .NET Messenger Service has failed.  Please verify that you are currently connected to the internet.")
	public static SystemMessageId YOUR_REQUEST_TO_LOG_INTO_THE_NET_MESSENGER_SERVICE_HAS_FAILED_PLEASE_VERIFY_THAT_YOU_ARE_CURRENTLY_CONNECTED_TO_THE_INTERNET;
	
	@ClientString(id = 1345, message = "Click on the OK button after you have selected a contact name.")
	public static SystemMessageId CLICK_ON_THE_OK_BUTTON_AFTER_YOU_HAVE_SELECTED_A_CONTACT_NAME;
	
	@ClientString(id = 1346, message = "You are currently entering a chat message.")
	public static SystemMessageId YOU_ARE_CURRENTLY_ENTERING_A_CHAT_MESSAGE;
	
	@ClientString(id = 1347, message = "The Lineage II messenger could not carry out the task you requested.")
	public static SystemMessageId THE_LINEAGE_II_MESSENGER_COULD_NOT_CARRY_OUT_THE_TASK_YOU_REQUESTED;
	
	@ClientString(id = 1348, message = "$s1 has entered the chat room.")
	public static SystemMessageId S1_HAS_ENTERED_THE_CHAT_ROOM;
	
	@ClientString(id = 1349, message = "$s1 has left the chat room.")
	public static SystemMessageId S1_HAS_LEFT_THE_CHAT_ROOM;
	
	@ClientString(id = 1350, message = "Your status will be changed to indicate that you are 'off-line.' All chat windows currently open will be closed.")
	public static SystemMessageId YOUR_STATUS_WILL_BE_CHANGED_TO_INDICATE_THAT_YOU_ARE_OFF_LINE_ALL_CHAT_WINDOWS_CURRENTLY_OPEN_WILL_BE_CLOSED;
	
	@ClientString(id = 1351, message = "Click the Delete button after selecting the contact you wish to remove.")
	public static SystemMessageId CLICK_THE_DELETE_BUTTON_AFTER_SELECTING_THE_CONTACT_YOU_WISH_TO_REMOVE;
	
	@ClientString(id = 1352, message = "You have been added to $s1 ($s2)'s contact list.")
	public static SystemMessageId YOU_HAVE_BEEN_ADDED_TO_S1_S2_S_CONTACT_LIST;
	
	@ClientString(id = 1353, message = "You can set the option to show your status as always being off-line to all of your contacts.")
	public static SystemMessageId YOU_CAN_SET_THE_OPTION_TO_SHOW_YOUR_STATUS_AS_ALWAYS_BEING_OFF_LINE_TO_ALL_OF_YOUR_CONTACTS;
	
	@ClientString(id = 1354, message = "You are not allowed to chat with a contact while a chatting block is imposed.")
	public static SystemMessageId YOU_ARE_NOT_ALLOWED_TO_CHAT_WITH_A_CONTACT_WHILE_A_CHATTING_BLOCK_IS_IMPOSED;
	
	@ClientString(id = 1355, message = "That contact is currently blocked from chatting.")
	public static SystemMessageId THAT_CONTACT_IS_CURRENTLY_BLOCKED_FROM_CHATTING;
	
	@ClientString(id = 1356, message = "That contact is not currently logged in.")
	public static SystemMessageId THAT_CONTACT_IS_NOT_CURRENTLY_LOGGED_IN;
	
	@ClientString(id = 1357, message = "You have been blocked from chatting with that contact.")
	public static SystemMessageId YOU_HAVE_BEEN_BLOCKED_FROM_CHATTING_WITH_THAT_CONTACT;
	
	@ClientString(id = 1358, message = "You are being logged out...")
	public static SystemMessageId YOU_ARE_BEING_LOGGED_OUT;
	
	@ClientString(id = 1359, message = "$s1 has logged in.")
	public static SystemMessageId S1_HAS_LOGGED_IN2;
	
	@ClientString(id = 1360, message = "You have received a message from $s1.")
	public static SystemMessageId YOU_HAVE_RECEIVED_A_MESSAGE_FROM_S1;
	
	@ClientString(id = 1361, message = "Due to a system error, you have been logged out of the .NET Messenger Service.")
	public static SystemMessageId DUE_TO_A_SYSTEM_ERROR_YOU_HAVE_BEEN_LOGGED_OUT_OF_THE_NET_MESSENGER_SERVICE;
	
	@ClientString(id = 1362, message = "Please select the contact you wish to delete.  If you would like to delete a group, click the button next to My Status, and then use the Options menu.")
	public static SystemMessageId PLEASE_SELECT_THE_CONTACT_YOU_WISH_TO_DELETE_IF_YOU_WOULD_LIKE_TO_DELETE_A_GROUP_CLICK_THE_BUTTON_NEXT_TO_MY_STATUS_AND_THEN_USE_THE_OPTIONS_MENU;
	
	@ClientString(id = 1363, message = "Your request to participate to initiate an alliance war has been denied.")
	public static SystemMessageId YOUR_REQUEST_TO_PARTICIPATE_TO_INITIATE_AN_ALLIANCE_WAR_HAS_BEEN_DENIED;
	
	@ClientString(id = 1364, message = "The request for an alliance war has been rejected.")
	public static SystemMessageId THE_REQUEST_FOR_AN_ALLIANCE_WAR_HAS_BEEN_REJECTED;
	
	@ClientString(id = 1365, message = "$s2 of $s1 clan has surrendered as an individual.")
	public static SystemMessageId S2_OF_S1_CLAN_HAS_SURRENDERED_AS_AN_INDIVIDUAL;
	
	@ClientString(id = 1366, message = "In order to delete a group, you must not have any contacts listed under that group.  Please transfer your contact(s) to another group before continuing with deletion.")
	public static SystemMessageId IN_ORDER_TO_DELETE_A_GROUP_YOU_MUST_NOT_HAVE_ANY_CONTACTS_LISTED_UNDER_THAT_GROUP_PLEASE_TRANSFER_YOUR_CONTACT_S_TO_ANOTHER_GROUP_BEFORE_CONTINUING_WITH_DELETION;
	
	@ClientString(id = 1367, message = "Only members of the group are allowed to add records.")
	public static SystemMessageId ONLY_MEMBERS_OF_THE_GROUP_ARE_ALLOWED_TO_ADD_RECORDS;
	
	@ClientString(id = 1368, message = "You can not try those items on at the same time.")
	public static SystemMessageId YOU_CAN_NOT_TRY_THOSE_ITEMS_ON_AT_THE_SAME_TIME;
	
	@ClientString(id = 1369, message = "You've exceeded the maximum.")
	public static SystemMessageId YOU_VE_EXCEEDED_THE_MAXIMUM;
	
	@ClientString(id = 1370, message = "Your message to $c1 did not reach its recipient. You cannot send mail to the GM staff.")
	public static SystemMessageId YOUR_MESSAGE_TO_C1_DID_NOT_REACH_ITS_RECIPIENT_YOU_CANNOT_SEND_MAIL_TO_THE_GM_STAFF;
	
	@ClientString(id = 1371, message = "It has been determined that you're not engaged in normal gameplay and a restriction has been imposed upon you. You may not move for $s1 minute(s).")
	public static SystemMessageId IT_HAS_BEEN_DETERMINED_THAT_YOU_RE_NOT_ENGAGED_IN_NORMAL_GAMEPLAY_AND_A_RESTRICTION_HAS_BEEN_IMPOSED_UPON_YOU_YOU_MAY_NOT_MOVE_FOR_S1_MINUTE_S;
	
	@ClientString(id = 1372, message = "Your punishment will continue for $s1 minute(s).")
	public static SystemMessageId YOUR_PUNISHMENT_WILL_CONTINUE_FOR_S1_MINUTE_S;
	
	@ClientString(id = 1373, message = "$c1 has picked up $s2 that was dropped by the Raid Boss.")
	public static SystemMessageId C1_HAS_PICKED_UP_S2_THAT_WAS_DROPPED_BY_THE_RAID_BOSS;
	
	@ClientString(id = 1374, message = "$c1 has picked up $s3 $s2(s) that were dropped by the Raid Boss.")
	public static SystemMessageId C1_HAS_PICKED_UP_S3_S2_S_THAT_WERE_DROPPED_BY_THE_RAID_BOSS;
	
	@ClientString(id = 1375, message = "$c1 has picked up $s2 Adena that was dropped by the Raid Boss.")
	public static SystemMessageId C1_HAS_PICKED_UP_S2_ADENA_THAT_WAS_DROPPED_BY_THE_RAID_BOSS;
	
	@ClientString(id = 1376, message = "$c1 has picked up $s2 that was dropped by another character.")
	public static SystemMessageId C1_HAS_PICKED_UP_S2_THAT_WAS_DROPPED_BY_ANOTHER_CHARACTER;
	
	@ClientString(id = 1377, message = "$c1 has picked up $s3 $s2(s) that were dropped by another character.")
	public static SystemMessageId C1_HAS_PICKED_UP_S3_S2_S_THAT_WERE_DROPPED_BY_ANOTHER_CHARACTER;
	
	@ClientString(id = 1378, message = "$c1 has picked up +$s3 $s2 that was dropped by another character.")
	public static SystemMessageId C1_HAS_PICKED_UP_S3_S2_THAT_WAS_DROPPED_BY_ANOTHER_CHARACTER;
	
	@ClientString(id = 1379, message = "$c1 has obtained $s2 Adena.")
	public static SystemMessageId C1_HAS_OBTAINED_S2_ADENA;
	
	@ClientString(id = 1380, message = "You can't summon a $s1 while on the battleground.")
	public static SystemMessageId YOU_CAN_T_SUMMON_A_S1_WHILE_ON_THE_BATTLEGROUND;
	
	@ClientString(id = 1381, message = "The party leader has obtained $s2 $s1(s).")
	public static SystemMessageId THE_PARTY_LEADER_HAS_OBTAINED_S2_S1_S;
	
	@ClientString(id = 1382, message = "To fulfill the quest, you must bring the chosen weapon.  Are you sure you want to choose this weapon?")
	public static SystemMessageId TO_FULFILL_THE_QUEST_YOU_MUST_BRING_THE_CHOSEN_WEAPON_ARE_YOU_SURE_YOU_WANT_TO_CHOOSE_THIS_WEAPON;
	
	@ClientString(id = 1383, message = "Are you sure you want to exchange?")
	public static SystemMessageId ARE_YOU_SURE_YOU_WANT_TO_EXCHANGE;
	
	@ClientString(id = 1384, message = "$c1 has become the party leader.")
	public static SystemMessageId C1_HAS_BECOME_THE_PARTY_LEADER;
	
	@ClientString(id = 1385, message = "You are not allowed to dismount in this location.")
	public static SystemMessageId YOU_ARE_NOT_ALLOWED_TO_DISMOUNT_IN_THIS_LOCATION;
	
	@ClientString(id = 1386, message = "You are no longer immobile.")
	public static SystemMessageId YOU_ARE_NO_LONGER_IMMOBILE;
	
	@ClientString(id = 1387, message = "Please select the item you would like to try on.")
	public static SystemMessageId PLEASE_SELECT_THE_ITEM_YOU_WOULD_LIKE_TO_TRY_ON;
	
	@ClientString(id = 1388, message = "You have created a party room.")
	public static SystemMessageId YOU_HAVE_CREATED_A_PARTY_ROOM;
	
	@ClientString(id = 1389, message = "The party room's information has been revised.")
	public static SystemMessageId THE_PARTY_ROOM_S_INFORMATION_HAS_BEEN_REVISED;
	
	@ClientString(id = 1390, message = "You are not allowed to enter the party room.")
	public static SystemMessageId YOU_ARE_NOT_ALLOWED_TO_ENTER_THE_PARTY_ROOM;
	
	@ClientString(id = 1391, message = "You have exited the party room.")
	public static SystemMessageId YOU_HAVE_EXITED_THE_PARTY_ROOM;
	
	@ClientString(id = 1392, message = "$c1 has left the party room.")
	public static SystemMessageId C1_HAS_LEFT_THE_PARTY_ROOM;
	
	@ClientString(id = 1393, message = "You have been ousted from the party room.")
	public static SystemMessageId YOU_HAVE_BEEN_OUSTED_FROM_THE_PARTY_ROOM;
	
	@ClientString(id = 1394, message = "$c1 has been kicked from the party room.")
	public static SystemMessageId C1_HAS_BEEN_KICKED_FROM_THE_PARTY_ROOM;
	
	@ClientString(id = 1395, message = "The party room has been disbanded.")
	public static SystemMessageId THE_PARTY_ROOM_HAS_BEEN_DISBANDED;
	
	@ClientString(id = 1396, message = "The list of party rooms can only be viewed by a person who is not part of a party.")
	public static SystemMessageId THE_LIST_OF_PARTY_ROOMS_CAN_ONLY_BE_VIEWED_BY_A_PERSON_WHO_IS_NOT_PART_OF_A_PARTY;
	
	@ClientString(id = 1397, message = "The leader of the party room has changed.")
	public static SystemMessageId THE_LEADER_OF_THE_PARTY_ROOM_HAS_CHANGED;
	
	@ClientString(id = 1398, message = "We are recruiting party members.")
	public static SystemMessageId WE_ARE_RECRUITING_PARTY_MEMBERS;
	
	@ClientString(id = 1399, message = "Only the leader of the party can transfer party leadership to another player.")
	public static SystemMessageId ONLY_THE_LEADER_OF_THE_PARTY_CAN_TRANSFER_PARTY_LEADERSHIP_TO_ANOTHER_PLAYER;
	
	@ClientString(id = 1400, message = "Please select the person you wish to make the party leader.")
	public static SystemMessageId PLEASE_SELECT_THE_PERSON_YOU_WISH_TO_MAKE_THE_PARTY_LEADER;
	
	@ClientString(id = 1401, message = "Slow down, you are already the party leader.")
	public static SystemMessageId SLOW_DOWN_YOU_ARE_ALREADY_THE_PARTY_LEADER;
	
	@ClientString(id = 1402, message = "You may only transfer party leadership to another member of the party.")
	public static SystemMessageId YOU_MAY_ONLY_TRANSFER_PARTY_LEADERSHIP_TO_ANOTHER_MEMBER_OF_THE_PARTY;
	
	@ClientString(id = 1403, message = "You have failed to transfer party leadership.")
	public static SystemMessageId YOU_HAVE_FAILED_TO_TRANSFER_PARTY_LEADERSHIP;
	
	@ClientString(id = 1404, message = "The owner of the private workshop has changed the price for creating this item.  Please check the new price before trying again.")
	public static SystemMessageId THE_OWNER_OF_THE_PRIVATE_WORKSHOP_HAS_CHANGED_THE_PRICE_FOR_CREATING_THIS_ITEM_PLEASE_CHECK_THE_NEW_PRICE_BEFORE_TRYING_AGAIN;
	
	@ClientString(id = 1405, message = "$s1 CP has been restored.")
	public static SystemMessageId S1_CP_HAS_BEEN_RESTORED;
	
	@ClientString(id = 1406, message = "$s2 CP has been restored by $c1.")
	public static SystemMessageId S2_CP_HAS_BEEN_RESTORED_BY_C1;
	
	@ClientString(id = 1407, message = "You are using a computer that does not allow you to log in with two accounts at the same time.")
	public static SystemMessageId YOU_ARE_USING_A_COMPUTER_THAT_DOES_NOT_ALLOW_YOU_TO_LOG_IN_WITH_TWO_ACCOUNTS_AT_THE_SAME_TIME;
	
	@ClientString(id = 1408, message = "Your prepaid remaining usage time is $s1 hour(s) and $s2 minute(s).  You have $s3 paid reservations left.")
	public static SystemMessageId YOUR_PREPAID_REMAINING_USAGE_TIME_IS_S1_HOUR_S_AND_S2_MINUTE_S_YOU_HAVE_S3_PAID_RESERVATIONS_LEFT;
	
	@ClientString(id = 1409, message = "Your prepaid usage time has expired. Your new prepaid reservation will be used. The remaining usage time is $s1 hour(s) and $s2 minute(s).")
	public static SystemMessageId YOUR_PREPAID_USAGE_TIME_HAS_EXPIRED_YOUR_NEW_PREPAID_RESERVATION_WILL_BE_USED_THE_REMAINING_USAGE_TIME_IS_S1_HOUR_S_AND_S2_MINUTE_S;
	
	@ClientString(id = 1410, message = "Your prepaid usage time has expired. You do not have any more prepaid reservations left.")
	public static SystemMessageId YOUR_PREPAID_USAGE_TIME_HAS_EXPIRED_YOU_DO_NOT_HAVE_ANY_MORE_PREPAID_RESERVATIONS_LEFT;
	
	@ClientString(id = 1411, message = "The number of your prepaid reservations has changed.")
	public static SystemMessageId THE_NUMBER_OF_YOUR_PREPAID_RESERVATIONS_HAS_CHANGED;
	
	@ClientString(id = 1412, message = "Your prepaid usage time has $s1 minute(s) left.")
	public static SystemMessageId YOUR_PREPAID_USAGE_TIME_HAS_S1_MINUTE_S_LEFT;
	
	@ClientString(id = 1413, message = "You do not meet the requirements to enter that party room.")
	public static SystemMessageId YOU_DO_NOT_MEET_THE_REQUIREMENTS_TO_ENTER_THAT_PARTY_ROOM;
	
	@ClientString(id = 1414, message = "The width and length should be 100 or more grids and less than 5,000 grids respectively.")
	public static SystemMessageId THE_WIDTH_AND_LENGTH_SHOULD_BE_100_OR_MORE_GRIDS_AND_LESS_THAN_5_000_GRIDS_RESPECTIVELY;
	
	@ClientString(id = 1415, message = "The command file is not set.")
	public static SystemMessageId THE_COMMAND_FILE_IS_NOT_SET;
	
	@ClientString(id = 1416, message = "The party representative of Team 1 has not been selected.")
	public static SystemMessageId THE_PARTY_REPRESENTATIVE_OF_TEAM_1_HAS_NOT_BEEN_SELECTED;
	
	@ClientString(id = 1417, message = "The party representative of Team 2 has not been selected.")
	public static SystemMessageId THE_PARTY_REPRESENTATIVE_OF_TEAM_2_HAS_NOT_BEEN_SELECTED;
	
	@ClientString(id = 1418, message = "The name of Team 1 has not yet been chosen.")
	public static SystemMessageId THE_NAME_OF_TEAM_1_HAS_NOT_YET_BEEN_CHOSEN;
	
	@ClientString(id = 1419, message = "The name of Team 2 has not yet been chosen.")
	public static SystemMessageId THE_NAME_OF_TEAM_2_HAS_NOT_YET_BEEN_CHOSEN;
	
	@ClientString(id = 1420, message = "The name of Team 1 and the name of Team 2 are identical.")
	public static SystemMessageId THE_NAME_OF_TEAM_1_AND_THE_NAME_OF_TEAM_2_ARE_IDENTICAL;
	
	@ClientString(id = 1421, message = "The race setup file has not been designated.")
	public static SystemMessageId THE_RACE_SETUP_FILE_HAS_NOT_BEEN_DESIGNATED;
	
	@ClientString(id = 1422, message = "Race setup file error - BuffCnt is not specified.")
	public static SystemMessageId RACE_SETUP_FILE_ERROR_BUFFCNT_IS_NOT_SPECIFIED;
	
	@ClientString(id = 1423, message = "Race setup file error - BuffID$s1 is not specified.")
	public static SystemMessageId RACE_SETUP_FILE_ERROR_BUFFID_S1_IS_NOT_SPECIFIED;
	
	@ClientString(id = 1424, message = "Race setup file error - BuffLv$s1 is not specified.")
	public static SystemMessageId RACE_SETUP_FILE_ERROR_BUFFLV_S1_IS_NOT_SPECIFIED;
	
	@ClientString(id = 1425, message = "Race setup file error - DefaultAllow is not specified.")
	public static SystemMessageId RACE_SETUP_FILE_ERROR_DEFAULTALLOW_IS_NOT_SPECIFIED;
	
	@ClientString(id = 1426, message = "Race setup file error - ExpSkillCnt is not specified.")
	public static SystemMessageId RACE_SETUP_FILE_ERROR_EXPSKILLCNT_IS_NOT_SPECIFIED;
	
	@ClientString(id = 1427, message = "Race setup file error - ExpSkillID$s1 is not specified.")
	public static SystemMessageId RACE_SETUP_FILE_ERROR_EXPSKILLID_S1_IS_NOT_SPECIFIED;
	
	@ClientString(id = 1428, message = "Race setup file error - ExpItemCnt is not specified.")
	public static SystemMessageId RACE_SETUP_FILE_ERROR_EXPITEMCNT_IS_NOT_SPECIFIED;
	
	@ClientString(id = 1429, message = "Race setup file error - ExpItemID$s1 is not specified.")
	public static SystemMessageId RACE_SETUP_FILE_ERROR_EXPITEMID_S1_IS_NOT_SPECIFIED;
	
	@ClientString(id = 1430, message = "Race setup file error -  TeleportDelay is not specified.")
	public static SystemMessageId RACE_SETUP_FILE_ERROR_TELEPORTDELAY_IS_NOT_SPECIFIED;
	
	@ClientString(id = 1431, message = "The race will be stopped temporarily.")
	public static SystemMessageId THE_RACE_WILL_BE_STOPPED_TEMPORARILY;
	
	@ClientString(id = 1432, message = "Your opponent is currently in a petrified state.")
	public static SystemMessageId YOUR_OPPONENT_IS_CURRENTLY_IN_A_PETRIFIED_STATE;
	
	@ClientString(id = 1433, message = "The automatic use of $s1 has been activated.")
	public static SystemMessageId THE_AUTOMATIC_USE_OF_S1_HAS_BEEN_ACTIVATED;
	
	@ClientString(id = 1434, message = "The automatic use of $s1 has been deactivated.")
	public static SystemMessageId THE_AUTOMATIC_USE_OF_S1_HAS_BEEN_DEACTIVATED;
	
	@ClientString(id = 1435, message = "Due to insufficient $s1, the automatic use function has been deactivated.")
	public static SystemMessageId DUE_TO_INSUFFICIENT_S1_THE_AUTOMATIC_USE_FUNCTION_HAS_BEEN_DEACTIVATED;
	
	@ClientString(id = 1436, message = "Due to insufficient $s1, the automatic use function cannot be activated.")
	public static SystemMessageId DUE_TO_INSUFFICIENT_S1_THE_AUTOMATIC_USE_FUNCTION_CANNOT_BE_ACTIVATED;
	
	@ClientString(id = 1437, message = "Players are no longer allowed to play dice. Dice can no longer be purchased from a village store. However, you can still sell them to any village store.")
	public static SystemMessageId PLAYERS_ARE_NO_LONGER_ALLOWED_TO_PLAY_DICE_DICE_CAN_NO_LONGER_BE_PURCHASED_FROM_A_VILLAGE_STORE_HOWEVER_YOU_CAN_STILL_SELL_THEM_TO_ANY_VILLAGE_STORE;
	
	@ClientString(id = 1438, message = "There is no skill that enables enchant.")
	public static SystemMessageId THERE_IS_NO_SKILL_THAT_ENABLES_ENCHANT;
	
	@ClientString(id = 1439, message = "You do not have all of the items needed to enchant that skill.")
	public static SystemMessageId YOU_DO_NOT_HAVE_ALL_OF_THE_ITEMS_NEEDED_TO_ENCHANT_THAT_SKILL;
	
	@ClientString(id = 1440, message = "Skill enchant was successful! $s1 has been enchanted.")
	public static SystemMessageId SKILL_ENCHANT_WAS_SUCCESSFUL_S1_HAS_BEEN_ENCHANTED;
	
	@ClientString(id = 1441, message = "Skill enchant failed. The skill will be initialized.")
	public static SystemMessageId SKILL_ENCHANT_FAILED_THE_SKILL_WILL_BE_INITIALIZED;
	
	@ClientString(id = 1442, message = "Remaining Time: $s1 second(s)")
	public static SystemMessageId REMAINING_TIME_S1_SECOND_S;
	
	@ClientString(id = 1443, message = "You do not have enough SP to enchant that skill.")
	public static SystemMessageId YOU_DO_NOT_HAVE_ENOUGH_SP_TO_ENCHANT_THAT_SKILL;
	
	@ClientString(id = 1444, message = "You do not have enough XP to enchant that skill.")
	public static SystemMessageId YOU_DO_NOT_HAVE_ENOUGH_XP_TO_ENCHANT_THAT_SKILL;
	
	@ClientString(id = 1445, message = "Your previous subclass will be removed and replaced with the new subclass at level 40.  Do you wish to continue?")
	public static SystemMessageId YOUR_PREVIOUS_SUBCLASS_WILL_BE_REMOVED_AND_REPLACED_WITH_THE_NEW_SUBCLASS_AT_LEVEL_40_DO_YOU_WISH_TO_CONTINUE;
	
	@ClientString(id = 1446, message = "The ferry from $s1 to $s2 has been delayed.")
	public static SystemMessageId THE_FERRY_FROM_S1_TO_S2_HAS_BEEN_DELAYED;
	
	@ClientString(id = 1447, message = "You cannot do that while fishing.")
	public static SystemMessageId YOU_CANNOT_DO_THAT_WHILE_FISHING;
	
	@ClientString(id = 1448, message = "Only fishing skills may be used at this time.")
	public static SystemMessageId ONLY_FISHING_SKILLS_MAY_BE_USED_AT_THIS_TIME;
	
	@ClientString(id = 1449, message = "You've got a bite!")
	public static SystemMessageId YOU_VE_GOT_A_BITE;
	
	@ClientString(id = 1450, message = "That fish is more determined than you are - it spit the hook!")
	public static SystemMessageId THAT_FISH_IS_MORE_DETERMINED_THAN_YOU_ARE_IT_SPIT_THE_HOOK;
	
	@ClientString(id = 1451, message = "Your bait was stolen by that fish!")
	public static SystemMessageId YOUR_BAIT_WAS_STOLEN_BY_THAT_FISH;
	
	@ClientString(id = 1452, message = "The bait has been lost because the fish got away.")
	public static SystemMessageId THE_BAIT_HAS_BEEN_LOST_BECAUSE_THE_FISH_GOT_AWAY;
	
	@ClientString(id = 1453, message = "You do not have a fishing pole equipped.")
	public static SystemMessageId YOU_DO_NOT_HAVE_A_FISHING_POLE_EQUIPPED;
	
	@ClientString(id = 1454, message = "You must put bait on your hook before you can fish.")
	public static SystemMessageId YOU_MUST_PUT_BAIT_ON_YOUR_HOOK_BEFORE_YOU_CAN_FISH;
	
	@ClientString(id = 1455, message = "You cannot fish while under water.")
	public static SystemMessageId YOU_CANNOT_FISH_WHILE_UNDER_WATER;
	
	@ClientString(id = 1456, message = "You cannot fish when transformed or while riding as a passenger of a boat - it's against the rules.")
	public static SystemMessageId YOU_CANNOT_FISH_WHEN_TRANSFORMED_OR_WHILE_RIDING_AS_A_PASSENGER_OF_A_BOAT_IT_S_AGAINST_THE_RULES;
	
	@ClientString(id = 1457, message = "You can't fish here.")
	public static SystemMessageId YOU_CAN_T_FISH_HERE;
	
	@ClientString(id = 1458, message = "Your attempt at fishing has been cancelled.")
	public static SystemMessageId YOUR_ATTEMPT_AT_FISHING_HAS_BEEN_CANCELLED;
	
	@ClientString(id = 1459, message = "You do not have enough bait.")
	public static SystemMessageId YOU_DO_NOT_HAVE_ENOUGH_BAIT;
	
	@ClientString(id = 1460, message = "You reel your line in and stop fishing.")
	public static SystemMessageId YOU_REEL_YOUR_LINE_IN_AND_STOP_FISHING;
	
	@ClientString(id = 1461, message = "You cast your line and start to fish.")
	public static SystemMessageId YOU_CAST_YOUR_LINE_AND_START_TO_FISH;
	
	@ClientString(id = 1462, message = "You may only use the Pumping skill while you are fishing.")
	public static SystemMessageId YOU_MAY_ONLY_USE_THE_PUMPING_SKILL_WHILE_YOU_ARE_FISHING;
	
	@ClientString(id = 1463, message = "You may only use the Reeling skill while you are fishing.")
	public static SystemMessageId YOU_MAY_ONLY_USE_THE_REELING_SKILL_WHILE_YOU_ARE_FISHING;
	
	@ClientString(id = 1464, message = "The fish has resisted your attempt to bring it in.")
	public static SystemMessageId THE_FISH_HAS_RESISTED_YOUR_ATTEMPT_TO_BRING_IT_IN;
	
	@ClientString(id = 1465, message = "Your pumping is successful, causing $s1 damage.")
	public static SystemMessageId YOUR_PUMPING_IS_SUCCESSFUL_CAUSING_S1_DAMAGE;
	
	@ClientString(id = 1466, message = "You failed to do anything with the fish and it regains $s1 HP.")
	public static SystemMessageId YOU_FAILED_TO_DO_ANYTHING_WITH_THE_FISH_AND_IT_REGAINS_S1_HP;
	
	@ClientString(id = 1467, message = "You reel that fish in closer and cause $s1 damage.")
	public static SystemMessageId YOU_REEL_THAT_FISH_IN_CLOSER_AND_CAUSE_S1_DAMAGE;
	
	@ClientString(id = 1468, message = "You failed to reel that fish in further and it regains $s1 HP.")
	public static SystemMessageId YOU_FAILED_TO_REEL_THAT_FISH_IN_FURTHER_AND_IT_REGAINS_S1_HP;
	
	@ClientString(id = 1469, message = "You caught something!")
	public static SystemMessageId YOU_CAUGHT_SOMETHING;
	
	@ClientString(id = 1470, message = "You cannot do that while fishing.")
	public static SystemMessageId YOU_CANNOT_DO_THAT_WHILE_FISHING2;
	
	@ClientString(id = 1471, message = "You cannot do that while fishing.")
	public static SystemMessageId YOU_CANNOT_DO_THAT_WHILE_FISHING3;
	
	@ClientString(id = 1472, message = "You look oddly at the fishing pole in disbelief and realize that you can't attack anything with this.")
	public static SystemMessageId YOU_LOOK_ODDLY_AT_THE_FISHING_POLE_IN_DISBELIEF_AND_REALIZE_THAT_YOU_CAN_T_ATTACK_ANYTHING_WITH_THIS;
	
	@ClientString(id = 1473, message = "$s1 is not sufficient.")
	public static SystemMessageId S1_IS_NOT_SUFFICIENT;
	
	@ClientString(id = 1474, message = "$s1 is not available.")
	public static SystemMessageId S1_IS_NOT_AVAILABLE;
	
	@ClientString(id = 1475, message = "$s1 in your pet's possession has been dropped.")
	public static SystemMessageId S1_IN_YOUR_PET_S_POSSESSION_HAS_BEEN_DROPPED;
	
	@ClientString(id = 1476, message = "+$s1$s2 in your pet's possession have been dropped.")
	public static SystemMessageId S1_S2_IN_YOUR_PET_S_POSSESSION_HAVE_BEEN_DROPPED;
	
	@ClientString(id = 1477, message = "$s2 $s1(s) in your pet's possession have been dropped.")
	public static SystemMessageId S2_S1_S_IN_YOUR_PET_S_POSSESSION_HAVE_BEEN_DROPPED;
	
	@ClientString(id = 1478, message = "You can register a 24 bit 256x256 or 32 bit TGA or BMP type file.")
	public static SystemMessageId YOU_CAN_REGISTER_A_24_BIT_256X256_OR_32_BIT_TGA_OR_BMP_TYPE_FILE;
	
	@ClientString(id = 1479, message = "That is the wrong grade of soulshot for that fishing pole.")
	public static SystemMessageId THAT_IS_THE_WRONG_GRADE_OF_SOULSHOT_FOR_THAT_FISHING_POLE;
	
	@ClientString(id = 1480, message = "Are you sure you wish to remove yourself from the Olympiad waiting list?")
	public static SystemMessageId ARE_YOU_SURE_YOU_WISH_TO_REMOVE_YOURSELF_FROM_THE_OLYMPIAD_WAITING_LIST;
	
	@ClientString(id = 1481, message = "You have selected an All-Class Battle. Do you wish to participate?")
	public static SystemMessageId YOU_HAVE_SELECTED_AN_ALL_CLASS_BATTLE_DO_YOU_WISH_TO_PARTICIPATE;
	
	@ClientString(id = 1482, message = "You've selected to join a class specific game.  Continue?")
	public static SystemMessageId YOU_VE_SELECTED_TO_JOIN_A_CLASS_SPECIFIC_GAME_CONTINUE;
	
	@ClientString(id = 1483, message = "Are you ready to become a Hero?")
	public static SystemMessageId ARE_YOU_READY_TO_BECOME_A_HERO;
	
	@ClientString(id = 1484, message = "Would you like to use the selected hero weapon?")
	public static SystemMessageId WOULD_YOU_LIKE_TO_USE_THE_SELECTED_HERO_WEAPON;
	
	@ClientString(id = 1485, message = "The ferry from Talking Island to Gludin Harbor has been delayed.")
	public static SystemMessageId THE_FERRY_FROM_TALKING_ISLAND_TO_GLUDIN_HARBOR_HAS_BEEN_DELAYED;
	
	@ClientString(id = 1486, message = "The ferry from Gludin Harbor to Talking Island has been delayed.")
	public static SystemMessageId THE_FERRY_FROM_GLUDIN_HARBOR_TO_TALKING_ISLAND_HAS_BEEN_DELAYED;
	
	@ClientString(id = 1487, message = "The ferry from Giran Harbor to Talking Island has been delayed.")
	public static SystemMessageId THE_FERRY_FROM_GIRAN_HARBOR_TO_TALKING_ISLAND_HAS_BEEN_DELAYED;
	
	@ClientString(id = 1488, message = "The ferry from Talking Island to Giran Harbor has been delayed.")
	public static SystemMessageId THE_FERRY_FROM_TALKING_ISLAND_TO_GIRAN_HARBOR_HAS_BEEN_DELAYED;
	
	@ClientString(id = 1489, message = "The Innadril cruise service has been delayed.")
	public static SystemMessageId THE_INNADRIL_CRUISE_SERVICE_HAS_BEEN_DELAYED;
	
	@ClientString(id = 1490, message = "Traded $s2 of $s1 crops.")
	public static SystemMessageId TRADED_S2_OF_S1_CROPS;
	
	@ClientString(id = 1491, message = "Failed in trading $s2 of $s1 crops.")
	public static SystemMessageId FAILED_IN_TRADING_S2_OF_S1_CROPS;
	
	@ClientString(id = 1492, message = "You will be moved to the Olympiad Stadium in $s1 second(s).")
	public static SystemMessageId YOU_WILL_BE_MOVED_TO_THE_OLYMPIAD_STADIUM_IN_S1_SECOND_S;
	
	@ClientString(id = 1493, message = "Your opponent made haste with their tail between their legs; the match has been cancelled.")
	public static SystemMessageId YOUR_OPPONENT_MADE_HASTE_WITH_THEIR_TAIL_BETWEEN_THEIR_LEGS_THE_MATCH_HAS_BEEN_CANCELLED;
	
	@ClientString(id = 1494, message = "Your opponent does not meet the requirements to do battle; the match has been cancelled.")
	public static SystemMessageId YOUR_OPPONENT_DOES_NOT_MEET_THE_REQUIREMENTS_TO_DO_BATTLE_THE_MATCH_HAS_BEEN_CANCELLED;
	
	@ClientString(id = 1495, message = "The match will start in $s1 second(s).")
	public static SystemMessageId THE_MATCH_WILL_START_IN_S1_SECOND_S;
	
	@ClientString(id = 1496, message = "The match has started. Fight!")
	public static SystemMessageId THE_MATCH_HAS_STARTED_FIGHT;
	
	@ClientString(id = 1497, message = "Congratulations, $c1! You win the match!")
	public static SystemMessageId CONGRATULATIONS_C1_YOU_WIN_THE_MATCH;
	
	@ClientString(id = 1498, message = "There is no victor; the match ends in a tie.")
	public static SystemMessageId THERE_IS_NO_VICTOR_THE_MATCH_ENDS_IN_A_TIE;
	
	@ClientString(id = 1499, message = "You will be moved back to town in $s1 second(s).")
	public static SystemMessageId YOU_WILL_BE_MOVED_BACK_TO_TOWN_IN_S1_SECOND_S;
	
	@ClientString(id = 1500, message = "$c1 does not meet the participation requirements. Subclasses and Duel Classes cannot participate in the Olympiad.")
	public static SystemMessageId C1_DOES_NOT_MEET_THE_PARTICIPATION_REQUIREMENTS_SUBCLASSES_AND_DUEL_CLASSES_CANNOT_PARTICIPATE_IN_THE_OLYMPIAD;
	
	@ClientString(id = 1501, message = "$c1 does not meet the participation requirements. Only Noblesse/Exalted characters can participate in the Olympiad.")
	public static SystemMessageId C1_DOES_NOT_MEET_THE_PARTICIPATION_REQUIREMENTS_ONLY_NOBLESSE_EXALTED_CHARACTERS_CAN_PARTICIPATE_IN_THE_OLYMPIAD;
	
	@ClientString(id = 1502, message = "$c1 is already registered on the match waiting list.")
	public static SystemMessageId C1_IS_ALREADY_REGISTERED_ON_THE_MATCH_WAITING_LIST;
	
	@ClientString(id = 1503, message = "You have been registered for the Olympiad waiting list for a class battle.")
	public static SystemMessageId YOU_HAVE_BEEN_REGISTERED_FOR_THE_OLYMPIAD_WAITING_LIST_FOR_A_CLASS_BATTLE;
	
	@ClientString(id = 1504, message = "You are currently registered for a 1v1 class irrelevant match.")
	public static SystemMessageId YOU_ARE_CURRENTLY_REGISTERED_FOR_A_1V1_CLASS_IRRELEVANT_MATCH;
	
	@ClientString(id = 1505, message = "You have been removed from the Olympiad waiting list.")
	public static SystemMessageId YOU_HAVE_BEEN_REMOVED_FROM_THE_OLYMPIAD_WAITING_LIST;
	
	@ClientString(id = 1506, message = "You are not currently registered for the Olympiad.")
	public static SystemMessageId YOU_ARE_NOT_CURRENTLY_REGISTERED_FOR_THE_OLYMPIAD;
	
	@ClientString(id = 1507, message = "You cannot equip that item in a Olympiad match.")
	public static SystemMessageId YOU_CANNOT_EQUIP_THAT_ITEM_IN_A_OLYMPIAD_MATCH;
	
	@ClientString(id = 1508, message = "You cannot use that item in a Olympiad match.")
	public static SystemMessageId YOU_CANNOT_USE_THAT_ITEM_IN_A_OLYMPIAD_MATCH;
	
	@ClientString(id = 1509, message = "You cannot use that skill in a Olympiad match.")
	public static SystemMessageId YOU_CANNOT_USE_THAT_SKILL_IN_A_OLYMPIAD_MATCH;
	
	@ClientString(id = 1510, message = "$c1 is attempting to do a resurrection that restores $s2($s3%%) XP. Accept?")
	public static SystemMessageId C1_IS_ATTEMPTING_TO_DO_A_RESURRECTION_THAT_RESTORES_S2_S3_XP_ACCEPT;
	
	@ClientString(id = 1511, message = "While a pet is being resurrected, it cannot help in resurrecting its master.")
	public static SystemMessageId WHILE_A_PET_IS_BEING_RESURRECTED_IT_CANNOT_HELP_IN_RESURRECTING_ITS_MASTER;
	
	@ClientString(id = 1512, message = "You cannot resurrect a pet while their owner is being resurrected.")
	public static SystemMessageId YOU_CANNOT_RESURRECT_A_PET_WHILE_THEIR_OWNER_IS_BEING_RESURRECTED;
	
	@ClientString(id = 1513, message = "Resurrection has already been proposed.")
	public static SystemMessageId RESURRECTION_HAS_ALREADY_BEEN_PROPOSED;
	
	@ClientString(id = 1514, message = "You cannot resurrect the owner of a pet while their pet is being resurrected.")
	public static SystemMessageId YOU_CANNOT_RESURRECT_THE_OWNER_OF_A_PET_WHILE_THEIR_PET_IS_BEING_RESURRECTED;
	
	@ClientString(id = 1515, message = "A pet cannot be resurrected while it's owner is in the process of resurrecting.")
	public static SystemMessageId A_PET_CANNOT_BE_RESURRECTED_WHILE_IT_S_OWNER_IS_IN_THE_PROCESS_OF_RESURRECTING;
	
	@ClientString(id = 1516, message = "The target is unavailable for seeding.")
	public static SystemMessageId THE_TARGET_IS_UNAVAILABLE_FOR_SEEDING;
	
	@ClientString(id = 1517, message = "The Blessed Enchant failed. The enchant value of the item became 0.")
	public static SystemMessageId THE_BLESSED_ENCHANT_FAILED_THE_ENCHANT_VALUE_OF_THE_ITEM_BECAME_0;
	
	@ClientString(id = 1518, message = "You do not meet the required condition to equip that item.")
	public static SystemMessageId YOU_DO_NOT_MEET_THE_REQUIRED_CONDITION_TO_EQUIP_THAT_ITEM;
	
	@ClientString(id = 1519, message = "The pet has been killed. If you don't resurrect it within 24 hours, the pet's body will disappear along with all the pet's items.")
	public static SystemMessageId THE_PET_HAS_BEEN_KILLED_IF_YOU_DON_T_RESURRECT_IT_WITHIN_24_HOURS_THE_PET_S_BODY_WILL_DISAPPEAR_ALONG_WITH_ALL_THE_PET_S_ITEMS;
	
	@ClientString(id = 1520, message = "Your servitor passed away.")
	public static SystemMessageId YOUR_SERVITOR_PASSED_AWAY;
	
	@ClientString(id = 1521, message = "Your servitor has vanished! You'll need to summon a new one.")
	public static SystemMessageId YOUR_SERVITOR_HAS_VANISHED_YOU_LL_NEED_TO_SUMMON_A_NEW_ONE;
	
	@ClientString(id = 1522, message = "Your pet's corpse has decayed!")
	public static SystemMessageId YOUR_PET_S_CORPSE_HAS_DECAYED;
	
	@ClientString(id = 1523, message = "You should release your pet or servitor so that it does not fall off of the boat and drown!")
	public static SystemMessageId YOU_SHOULD_RELEASE_YOUR_PET_OR_SERVITOR_SO_THAT_IT_DOES_NOT_FALL_OFF_OF_THE_BOAT_AND_DROWN;
	
	@ClientString(id = 1524, message = "$c1's pet gained $s2.")
	public static SystemMessageId C1_S_PET_GAINED_S2;
	
	@ClientString(id = 1525, message = "$c1's pet gained $s3 $s2(s).")
	public static SystemMessageId C1_S_PET_GAINED_S3_S2_S;
	
	@ClientString(id = 1526, message = "$c1's pet gained +$s2 $s3.")
	public static SystemMessageId C1_S_PET_GAINED_S2_S3;
	
	@ClientString(id = 1527, message = "Your pet was hungry so it ate $s1.")
	public static SystemMessageId YOUR_PET_WAS_HUNGRY_SO_IT_ATE_S1;
	
	@ClientString(id = 1528, message = "You've sent a petition to the GM staff.")
	public static SystemMessageId YOU_VE_SENT_A_PETITION_TO_THE_GM_STAFF;
	
	@ClientString(id = 1529, message = "$c1 is inviting you to a Command Channel. Do you accept?")
	public static SystemMessageId C1_IS_INVITING_YOU_TO_A_COMMAND_CHANNEL_DO_YOU_ACCEPT;
	
	@ClientString(id = 1530, message = "Select a target or enter the name.")
	public static SystemMessageId SELECT_A_TARGET_OR_ENTER_THE_NAME;
	
	@ClientString(id = 1531, message = "Enter the name of the clan that you wish to declare war on.")
	public static SystemMessageId ENTER_THE_NAME_OF_THE_CLAN_THAT_YOU_WISH_TO_DECLARE_WAR_ON;
	
	@ClientString(id = 1532, message = "Enter the name of the clan that you wish to request a cease-fire with.")
	public static SystemMessageId ENTER_THE_NAME_OF_THE_CLAN_THAT_YOU_WISH_TO_REQUEST_A_CEASE_FIRE_WITH;
	
	@ClientString(id = 1533, message = "Attention: $c1 has picked up $s2.")
	public static SystemMessageId ATTENTION_C1_HAS_PICKED_UP_S2;
	
	@ClientString(id = 1534, message = "Attention: $c1 has picked up +$s2 $s3.")
	public static SystemMessageId ATTENTION_C1_HAS_PICKED_UP_S2_S3;
	
	@ClientString(id = 1535, message = "Attention: $c1's pet has picked up $s2.")
	public static SystemMessageId ATTENTION_C1_S_PET_HAS_PICKED_UP_S2;
	
	@ClientString(id = 1536, message = "Attention: $c1's pet has picked up +$s2 $s3.")
	public static SystemMessageId ATTENTION_C1_S_PET_HAS_PICKED_UP_S2_S3;
	
	@ClientString(id = 1537, message = "Current Location:  $s1 / $s2 / $s3 (near Rune Village)")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3_NEAR_RUNE_VILLAGE;
	
	@ClientString(id = 1538, message = "Current Location: $s1 / $s2 / $s3 (near the Town of Goddard)")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3_NEAR_THE_TOWN_OF_GODDARD;
	
	@ClientString(id = 1539, message = "Cargo has arrived at Talking Island Village.")
	public static SystemMessageId CARGO_HAS_ARRIVED_AT_TALKING_ISLAND_VILLAGE;
	
	@ClientString(id = 1540, message = "Cargo has arrived at the Dark Elf Village.")
	public static SystemMessageId CARGO_HAS_ARRIVED_AT_THE_DARK_ELF_VILLAGE;
	
	@ClientString(id = 1541, message = "Cargo has arrived at Elven Village.")
	public static SystemMessageId CARGO_HAS_ARRIVED_AT_ELVEN_VILLAGE;
	
	@ClientString(id = 1542, message = "Cargo has arrived at Orc Village.")
	public static SystemMessageId CARGO_HAS_ARRIVED_AT_ORC_VILLAGE;
	
	@ClientString(id = 1543, message = "Cargo has arrived at Dwarven Village.")
	public static SystemMessageId CARGO_HAS_ARRIVED_AT_DWARVEN_VILLAGE;
	
	@ClientString(id = 1544, message = "Cargo has arrived at Town of Aden.")
	public static SystemMessageId CARGO_HAS_ARRIVED_AT_TOWN_OF_ADEN;
	
	@ClientString(id = 1545, message = "Cargo has arrived at the Town of Oren.")
	public static SystemMessageId CARGO_HAS_ARRIVED_AT_THE_TOWN_OF_OREN;
	
	@ClientString(id = 1546, message = "Cargo has arrived at Hunter's Village.")
	public static SystemMessageId CARGO_HAS_ARRIVED_AT_HUNTER_S_VILLAGE;
	
	@ClientString(id = 1547, message = "Cargo has arrived at the Town of Dion.")
	public static SystemMessageId CARGO_HAS_ARRIVED_AT_THE_TOWN_OF_DION;
	
	@ClientString(id = 1548, message = "Cargo has arrived at Floran Village.")
	public static SystemMessageId CARGO_HAS_ARRIVED_AT_FLORAN_VILLAGE;
	
	@ClientString(id = 1549, message = "Cargo has arrived at Gludin Village.")
	public static SystemMessageId CARGO_HAS_ARRIVED_AT_GLUDIN_VILLAGE;
	
	@ClientString(id = 1550, message = "Cargo has arrived at the Town of Gludio.")
	public static SystemMessageId CARGO_HAS_ARRIVED_AT_THE_TOWN_OF_GLUDIO;
	
	@ClientString(id = 1551, message = "Cargo has arrived at Town of Giran.")
	public static SystemMessageId CARGO_HAS_ARRIVED_AT_TOWN_OF_GIRAN;
	
	@ClientString(id = 1552, message = "Cargo has arrived at Heine.")
	public static SystemMessageId CARGO_HAS_ARRIVED_AT_HEINE;
	
	@ClientString(id = 1553, message = "Cargo has arrived at Rune Village.")
	public static SystemMessageId CARGO_HAS_ARRIVED_AT_RUNE_VILLAGE;
	
	@ClientString(id = 1554, message = "Cargo has arrived at the Town of Goddard.")
	public static SystemMessageId CARGO_HAS_ARRIVED_AT_THE_TOWN_OF_GODDARD;
	
	@ClientString(id = 1555, message = "Do you want to cancel character deletion?")
	public static SystemMessageId DO_YOU_WANT_TO_CANCEL_CHARACTER_DELETION;
	
	@ClientString(id = 1556, message = "Your clan notice has been saved.")
	public static SystemMessageId YOUR_CLAN_NOTICE_HAS_BEEN_SAVED;
	
	@ClientString(id = 1557, message = "Seed price should be more than $s1 and less than $s2.")
	public static SystemMessageId SEED_PRICE_SHOULD_BE_MORE_THAN_S1_AND_LESS_THAN_S2;
	
	@ClientString(id = 1558, message = "The seed quantity should be more than $s1 and less than $s2.")
	public static SystemMessageId THE_SEED_QUANTITY_SHOULD_BE_MORE_THAN_S1_AND_LESS_THAN_S2;
	
	@ClientString(id = 1559, message = "Crop price should be more than $s1 and less than $s2.")
	public static SystemMessageId CROP_PRICE_SHOULD_BE_MORE_THAN_S1_AND_LESS_THAN_S2;
	
	@ClientString(id = 1560, message = "The crop quantity should be more than $s1 and less than $s2 .")
	public static SystemMessageId THE_CROP_QUANTITY_SHOULD_BE_MORE_THAN_S1_AND_LESS_THAN_S2;
	
	@ClientString(id = 1561, message = "$s1 has declared a Clan War. The war will automatically start if you kill $s1 clan members 5 times within a week.")
	public static SystemMessageId S1_HAS_DECLARED_A_CLAN_WAR_THE_WAR_WILL_AUTOMATICALLY_START_IF_YOU_KILL_S1_CLAN_MEMBERS_5_TIMES_WITHIN_A_WEEK;
	
	@ClientString(id = 1562, message = "You have declared a Clan War with $s1.")
	public static SystemMessageId YOU_HAVE_DECLARED_A_CLAN_WAR_WITH_S1;
	
	@ClientString(id = 1563, message = "The clan, $s1, cannot declare a clan war because their clan is level 2 or lower, and or they do not have enough members.")
	public static SystemMessageId THE_CLAN_S1_CANNOT_DECLARE_A_CLAN_WAR_BECAUSE_THEIR_CLAN_IS_LEVEL_2_OR_LOWER_AND_OR_THEY_DO_NOT_HAVE_ENOUGH_MEMBERS;
	
	@ClientString(id = 1564, message = "A clan war can only be declared if the clan is level 5 or above, and the number of clan members is fifteen or greater.")
	public static SystemMessageId A_CLAN_WAR_CAN_ONLY_BE_DECLARED_IF_THE_CLAN_IS_LEVEL_5_OR_ABOVE_AND_THE_NUMBER_OF_CLAN_MEMBERS_IS_FIFTEEN_OR_GREATER;
	
	@ClientString(id = 1565, message = "A clan war cannot be declared against a clan that does not exist!")
	public static SystemMessageId A_CLAN_WAR_CANNOT_BE_DECLARED_AGAINST_A_CLAN_THAT_DOES_NOT_EXIST;
	
	@ClientString(id = 1566, message = "The clan, $s1, has decided to stop the war.")
	public static SystemMessageId THE_CLAN_S1_HAS_DECIDED_TO_STOP_THE_WAR;
	
	@ClientString(id = 1567, message = "The war against $s1 Clan has been stopped.")
	public static SystemMessageId THE_WAR_AGAINST_S1_CLAN_HAS_BEEN_STOPPED;
	
	@ClientString(id = 1568, message = "The target for declaration is wrong.")
	public static SystemMessageId THE_TARGET_FOR_DECLARATION_IS_WRONG;
	
	@ClientString(id = 1569, message = "A declaration of Clan War against an allied clan can't be made.")
	public static SystemMessageId A_DECLARATION_OF_CLAN_WAR_AGAINST_AN_ALLIED_CLAN_CAN_T_BE_MADE;
	
	@ClientString(id = 1570, message = "A declaration of war against more than 30 Clans can't be made at the same time.")
	public static SystemMessageId A_DECLARATION_OF_WAR_AGAINST_MORE_THAN_30_CLANS_CAN_T_BE_MADE_AT_THE_SAME_TIME;
	
	@ClientString(id = 1571, message = "======(Clans You've Declared War On)======")
	public static SystemMessageId CLANS_YOU_VE_DECLARED_WAR_ON;
	
	@ClientString(id = 1572, message = "======(Clans That Have Declared War On You)======")
	public static SystemMessageId CLANS_THAT_HAVE_DECLARED_WAR_ON_YOU;
	
	@ClientString(id = 1573, message = "All is well. There are no clans that have declared war against your clan.")
	public static SystemMessageId ALL_IS_WELL_THERE_ARE_NO_CLANS_THAT_HAVE_DECLARED_WAR_AGAINST_YOUR_CLAN;
	
	@ClientString(id = 1574, message = "Command Channels can only be formed by a party leader who is also the leader of a level 5 clan.")
	public static SystemMessageId COMMAND_CHANNELS_CAN_ONLY_BE_FORMED_BY_A_PARTY_LEADER_WHO_IS_ALSO_THE_LEADER_OF_A_LEVEL_5_CLAN;
	
	@ClientString(id = 1575, message = "Your pet uses spiritshot.")
	public static SystemMessageId YOUR_PET_USES_SPIRITSHOT;
	
	@ClientString(id = 1576, message = "Your servitor uses spiritshot.")
	public static SystemMessageId YOUR_SERVITOR_USES_SPIRITSHOT;
	
	@ClientString(id = 1577, message = "Servitor uses the power of spirit.")
	public static SystemMessageId SERVITOR_USES_THE_POWER_OF_SPIRIT;
	
	@ClientString(id = 1578, message = "Items are not available for a private store or private workshop.")
	public static SystemMessageId ITEMS_ARE_NOT_AVAILABLE_FOR_A_PRIVATE_STORE_OR_PRIVATE_WORKSHOP;
	
	@ClientString(id = 1579, message = "$c1's pet gained $s2 Adena.")
	public static SystemMessageId C1_S_PET_GAINED_S2_ADENA;
	
	@ClientString(id = 1580, message = "The Command Channel has been formed.")
	public static SystemMessageId THE_COMMAND_CHANNEL_HAS_BEEN_FORMED;
	
	@ClientString(id = 1581, message = "The Command Channel has been disbanded.")
	public static SystemMessageId THE_COMMAND_CHANNEL_HAS_BEEN_DISBANDED;
	
	@ClientString(id = 1582, message = "You have joined the Command Channel.")
	public static SystemMessageId YOU_HAVE_JOINED_THE_COMMAND_CHANNEL;
	
	@ClientString(id = 1583, message = "You were dismissed from the Command Channel.")
	public static SystemMessageId YOU_WERE_DISMISSED_FROM_THE_COMMAND_CHANNEL;
	
	@ClientString(id = 1584, message = "$c1's party has been dismissed from the Command Channel.")
	public static SystemMessageId C1_S_PARTY_HAS_BEEN_DISMISSED_FROM_THE_COMMAND_CHANNEL;
	
	@ClientString(id = 1585, message = "The Command Channel has been disbanded.")
	public static SystemMessageId THE_COMMAND_CHANNEL_HAS_BEEN_DISBANDED2;
	
	@ClientString(id = 1586, message = "You have quit the Command Channel.")
	public static SystemMessageId YOU_HAVE_QUIT_THE_COMMAND_CHANNEL;
	
	@ClientString(id = 1587, message = "$c1's party has left the Command Channel.")
	public static SystemMessageId C1_S_PARTY_HAS_LEFT_THE_COMMAND_CHANNEL;
	
	@ClientString(id = 1588, message = "The Command Channel is activated only when there are at least 5 parties participating.")
	public static SystemMessageId THE_COMMAND_CHANNEL_IS_ACTIVATED_ONLY_WHEN_THERE_ARE_AT_LEAST_5_PARTIES_PARTICIPATING;
	
	@ClientString(id = 1589, message = "Command Channel authority has been transferred to $c1.")
	public static SystemMessageId COMMAND_CHANNEL_AUTHORITY_HAS_BEEN_TRANSFERRED_TO_C1;
	
	@ClientString(id = 1590, message = "===(Guild Info (Total Parties: $s1))===")
	public static SystemMessageId GUILD_INFO_TOTAL_PARTIES_S1;
	
	@ClientString(id = 1591, message = "No user has been invited to the Command Channel.")
	public static SystemMessageId NO_USER_HAS_BEEN_INVITED_TO_THE_COMMAND_CHANNEL;
	
	@ClientString(id = 1592, message = "You can no longer set up a Command Channel.")
	public static SystemMessageId YOU_CAN_NO_LONGER_SET_UP_A_COMMAND_CHANNEL;
	
	@ClientString(id = 1593, message = "You do not have authority to invite someone to the Command Channel.")
	public static SystemMessageId YOU_DO_NOT_HAVE_AUTHORITY_TO_INVITE_SOMEONE_TO_THE_COMMAND_CHANNEL;
	
	@ClientString(id = 1594, message = "$c1's party is already a member of the Command Channel.")
	public static SystemMessageId C1_S_PARTY_IS_ALREADY_A_MEMBER_OF_THE_COMMAND_CHANNEL;
	
	@ClientString(id = 1595, message = "$s1 has succeeded.")
	public static SystemMessageId S1_HAS_SUCCEEDED;
	
	@ClientString(id = 1596, message = "You were hit by $s1!")
	public static SystemMessageId YOU_WERE_HIT_BY_S1;
	
	@ClientString(id = 1597, message = "$s1 has failed.")
	public static SystemMessageId S1_HAS_FAILED;
	
	@ClientString(id = 1598, message = "Soulshots and spiritshots are not available for a dead pet or servitor.  Sad, isn't it?")
	public static SystemMessageId SOULSHOTS_AND_SPIRITSHOTS_ARE_NOT_AVAILABLE_FOR_A_DEAD_PET_OR_SERVITOR_SAD_ISN_T_IT;
	
	@ClientString(id = 1599, message = "You cannot 'observe' while you are in combat!")
	public static SystemMessageId YOU_CANNOT_OBSERVE_WHILE_YOU_ARE_IN_COMBAT;
	
	@ClientString(id = 1600, message = "Tomorrow's items will ALL be set to 0.  Do you wish to continue?")
	public static SystemMessageId TOMORROW_S_ITEMS_WILL_ALL_BE_SET_TO_0_DO_YOU_WISH_TO_CONTINUE;
	
	@ClientString(id = 1601, message = "Tomorrow's items will all be set to the same value as today's items.  Do you wish to continue?")
	public static SystemMessageId TOMORROW_S_ITEMS_WILL_ALL_BE_SET_TO_THE_SAME_VALUE_AS_TODAY_S_ITEMS_DO_YOU_WISH_TO_CONTINUE;
	
	@ClientString(id = 1602, message = "Only a party leader can access the Command Channel.")
	public static SystemMessageId ONLY_A_PARTY_LEADER_CAN_ACCESS_THE_COMMAND_CHANNEL;
	
	@ClientString(id = 1603, message = "Only the Command Channel creator can use the Raid Leader text.")
	public static SystemMessageId ONLY_THE_COMMAND_CHANNEL_CREATOR_CAN_USE_THE_RAID_LEADER_TEXT;
	
	@ClientString(id = 1604, message = "While dressed in formal wear, you can't use items that require all skills and casting operations.")
	public static SystemMessageId WHILE_DRESSED_IN_FORMAL_WEAR_YOU_CAN_T_USE_ITEMS_THAT_REQUIRE_ALL_SKILLS_AND_CASTING_OPERATIONS;
	
	@ClientString(id = 1605, message = "* Here, you can buy only seeds of $s1 Manor.")
	public static SystemMessageId HERE_YOU_CAN_BUY_ONLY_SEEDS_OF_S1_MANOR;
	
	@ClientString(id = 1606, message = "Congratulations - You've completed your third-class transfer quest!")
	public static SystemMessageId CONGRATULATIONS_YOU_VE_COMPLETED_YOUR_THIRD_CLASS_TRANSFER_QUEST;
	
	@ClientString(id = 1607, message = "$s1 Adena has been withdrawn to pay for purchasing fees.")
	public static SystemMessageId S1_ADENA_HAS_BEEN_WITHDRAWN_TO_PAY_FOR_PURCHASING_FEES;
	
	@ClientString(id = 1608, message = "Due to insufficient Adena you cannot buy another castle.")
	public static SystemMessageId DUE_TO_INSUFFICIENT_ADENA_YOU_CANNOT_BUY_ANOTHER_CASTLE;
	
	@ClientString(id = 1609, message = "War has already been declared against that clan… but I'll make note that you really don't like them.")
	public static SystemMessageId WAR_HAS_ALREADY_BEEN_DECLARED_AGAINST_THAT_CLAN_BUT_I_LL_MAKE_NOTE_THAT_YOU_REALLY_DON_T_LIKE_THEM;
	
	@ClientString(id = 1610, message = "Fool! You cannot declare war against your own clan!")
	public static SystemMessageId FOOL_YOU_CANNOT_DECLARE_WAR_AGAINST_YOUR_OWN_CLAN;
	
	@ClientString(id = 1611, message = "Party Leader: $c1")
	public static SystemMessageId PARTY_LEADER_C1;
	
	@ClientString(id = 1612, message = "=====(Clan War List)=====")
	public static SystemMessageId CLAN_WAR_LIST;
	
	@ClientString(id = 1613, message = "There is no clan listed on your War List.")
	public static SystemMessageId THERE_IS_NO_CLAN_LISTED_ON_YOUR_WAR_LIST;
	
	@ClientString(id = 1614, message = "You have joined a channel that was already open.")
	public static SystemMessageId YOU_HAVE_JOINED_A_CHANNEL_THAT_WAS_ALREADY_OPEN;
	
	@ClientString(id = 1615, message = "The number of remaining parties is $s1 until a channel is activated.")
	public static SystemMessageId THE_NUMBER_OF_REMAINING_PARTIES_IS_S1_UNTIL_A_CHANNEL_IS_ACTIVATED;
	
	@ClientString(id = 1616, message = "The Command Channel has been activated.")
	public static SystemMessageId THE_COMMAND_CHANNEL_HAS_BEEN_ACTIVATED;
	
	@ClientString(id = 1617, message = "Command Chat cannot be used because you are not an alliance leader or party leader.")
	public static SystemMessageId COMMAND_CHAT_CANNOT_BE_USED_BECAUSE_YOU_ARE_NOT_AN_ALLIANCE_LEADER_OR_PARTY_LEADER;
	
	@ClientString(id = 1618, message = "The ferry from Rune Harbor to Gludin Harbor has been delayed.")
	public static SystemMessageId THE_FERRY_FROM_RUNE_HARBOR_TO_GLUDIN_HARBOR_HAS_BEEN_DELAYED;
	
	@ClientString(id = 1619, message = "The ferry from Gludin Harbor to Rune Harbor has been delayed.")
	public static SystemMessageId THE_FERRY_FROM_GLUDIN_HARBOR_TO_RUNE_HARBOR_HAS_BEEN_DELAYED;
	
	@ClientString(id = 1620, message = "Welcome to Rune Harbor.")
	public static SystemMessageId WELCOME_TO_RUNE_HARBOR;
	
	@ClientString(id = 1621, message = "Departure for Gludin Harbor will take place in five minutes!")
	public static SystemMessageId DEPARTURE_FOR_GLUDIN_HARBOR_WILL_TAKE_PLACE_IN_FIVE_MINUTES;
	
	@ClientString(id = 1622, message = "Departure for Gludin Harbor will take place in one minute!")
	public static SystemMessageId DEPARTURE_FOR_GLUDIN_HARBOR_WILL_TAKE_PLACE_IN_ONE_MINUTE;
	
	@ClientString(id = 1623, message = "Make haste!  We will be departing for Gludin Harbor shortly…")
	public static SystemMessageId MAKE_HASTE_WE_WILL_BE_DEPARTING_FOR_GLUDIN_HARBOR_SHORTLY;
	
	@ClientString(id = 1624, message = "We are now departing for Gludin Harbor. Hold on and enjoy the ride!")
	public static SystemMessageId WE_ARE_NOW_DEPARTING_FOR_GLUDIN_HARBOR_HOLD_ON_AND_ENJOY_THE_RIDE;
	
	@ClientString(id = 1625, message = "Departure for Rune Harbor will take place after anchoring for ten minutes.")
	public static SystemMessageId DEPARTURE_FOR_RUNE_HARBOR_WILL_TAKE_PLACE_AFTER_ANCHORING_FOR_TEN_MINUTES;
	
	@ClientString(id = 1626, message = "Departure for Rune Harbor will take place in five minutes!")
	public static SystemMessageId DEPARTURE_FOR_RUNE_HARBOR_WILL_TAKE_PLACE_IN_FIVE_MINUTES;
	
	@ClientString(id = 1627, message = "Departure for Rune Harbor will take place in one minute!")
	public static SystemMessageId DEPARTURE_FOR_RUNE_HARBOR_WILL_TAKE_PLACE_IN_ONE_MINUTE;
	
	@ClientString(id = 1628, message = "Make haste!  We will be departing for Gludin Harbor shortly…")
	public static SystemMessageId MAKE_HASTE_WE_WILL_BE_DEPARTING_FOR_GLUDIN_HARBOR_SHORTLY2;
	
	@ClientString(id = 1629, message = "We are now departing for Rune Harbor. Hold on and enjoy the ride!")
	public static SystemMessageId WE_ARE_NOW_DEPARTING_FOR_RUNE_HARBOR_HOLD_ON_AND_ENJOY_THE_RIDE;
	
	@ClientString(id = 1630, message = "The ferry from Rune Harbor will be arriving at Gludin Harbor in approximately 15 minutes.")
	public static SystemMessageId THE_FERRY_FROM_RUNE_HARBOR_WILL_BE_ARRIVING_AT_GLUDIN_HARBOR_IN_APPROXIMATELY_15_MINUTES;
	
	@ClientString(id = 1631, message = "The ferry from Rune Harbor will be arriving at Gludin Harbor in approximately 10 minutes.")
	public static SystemMessageId THE_FERRY_FROM_RUNE_HARBOR_WILL_BE_ARRIVING_AT_GLUDIN_HARBOR_IN_APPROXIMATELY_10_MINUTES;
	
	@ClientString(id = 1632, message = "The ferry from Rune Harbor will be arriving at Gludin Harbor in approximately 5 minutes.")
	public static SystemMessageId THE_FERRY_FROM_RUNE_HARBOR_WILL_BE_ARRIVING_AT_GLUDIN_HARBOR_IN_APPROXIMATELY_5_MINUTES;
	
	@ClientString(id = 1633, message = "The ferry from Rune Harbor will be arriving at Gludin Harbor in approximately 1 minute.")
	public static SystemMessageId THE_FERRY_FROM_RUNE_HARBOR_WILL_BE_ARRIVING_AT_GLUDIN_HARBOR_IN_APPROXIMATELY_1_MINUTE;
	
	@ClientString(id = 1634, message = "The ferry from Gludin Harbor will be arriving at Rune Harbor in approximately 15 minutes.")
	public static SystemMessageId THE_FERRY_FROM_GLUDIN_HARBOR_WILL_BE_ARRIVING_AT_RUNE_HARBOR_IN_APPROXIMATELY_15_MINUTES;
	
	@ClientString(id = 1635, message = "The ferry from Gludin Harbor will be arriving at Rune Harbor in approximately 10 minutes.")
	public static SystemMessageId THE_FERRY_FROM_GLUDIN_HARBOR_WILL_BE_ARRIVING_AT_RUNE_HARBOR_IN_APPROXIMATELY_10_MINUTES;
	
	@ClientString(id = 1636, message = "The ferry from Gludin Harbor will be arriving at Rune Harbor in approximately 5 minutes.")
	public static SystemMessageId THE_FERRY_FROM_GLUDIN_HARBOR_WILL_BE_ARRIVING_AT_RUNE_HARBOR_IN_APPROXIMATELY_5_MINUTES;
	
	@ClientString(id = 1637, message = "The ferry from Gludin Harbor will be arriving at Rune Harbor in approximately 1 minute.")
	public static SystemMessageId THE_FERRY_FROM_GLUDIN_HARBOR_WILL_BE_ARRIVING_AT_RUNE_HARBOR_IN_APPROXIMATELY_1_MINUTE;
	
	@ClientString(id = 1638, message = "You cannot fish while using a recipe book, private workshop or private store.")
	public static SystemMessageId YOU_CANNOT_FISH_WHILE_USING_A_RECIPE_BOOK_PRIVATE_WORKSHOP_OR_PRIVATE_STORE;
	
	@ClientString(id = 1639, message = "Round $s1 of the Olympiad Games has started!")
	public static SystemMessageId ROUND_S1_OF_THE_OLYMPIAD_GAMES_HAS_STARTED;
	
	@ClientString(id = 1640, message = "Round $s1 of the Olympiad Games has now ended.")
	public static SystemMessageId ROUND_S1_OF_THE_OLYMPIAD_GAMES_HAS_NOW_ENDED;
	
	@ClientString(id = 1641, message = "Sharpen your swords, tighten the stitching in your armor, and make haste to a Olympiad Manager!  Battles in the Olympiad Games are now taking place!")
	public static SystemMessageId SHARPEN_YOUR_SWORDS_TIGHTEN_THE_STITCHING_IN_YOUR_ARMOR_AND_MAKE_HASTE_TO_A_OLYMPIAD_MANAGER_BATTLES_IN_THE_OLYMPIAD_GAMES_ARE_NOW_TAKING_PLACE;
	
	@ClientString(id = 1642, message = "Much carnage has been left for the cleanup crew of the Olympiad Stadium.  Battles in the Olympiad Games are now over!")
	public static SystemMessageId MUCH_CARNAGE_HAS_BEEN_LEFT_FOR_THE_CLEANUP_CREW_OF_THE_OLYMPIAD_STADIUM_BATTLES_IN_THE_OLYMPIAD_GAMES_ARE_NOW_OVER;
	
	@ClientString(id = 1643, message = "Current Location: $s1 / $s2 / $s3 (Dimensional Gap)")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3_DIMENSIONAL_GAP;
	
	@ClientString(id = 1644, message = "none")
	public static SystemMessageId NONE;
	
	@ClientString(id = 1645, message = "none")
	public static SystemMessageId NONE2;
	
	@ClientString(id = 1646, message = "none")
	public static SystemMessageId NONE3;
	
	@ClientString(id = 1647, message = "none")
	public static SystemMessageId NONE4;
	
	@ClientString(id = 1648, message = "none")
	public static SystemMessageId NONE5;
	
	@ClientString(id = 1649, message = "Play time is now accumulating.")
	public static SystemMessageId PLAY_TIME_IS_NOW_ACCUMULATING;
	
	@ClientString(id = 1650, message = "Due to high server traffic, your login attempt has failed.  Please try again soon.")
	public static SystemMessageId DUE_TO_HIGH_SERVER_TRAFFIC_YOUR_LOGIN_ATTEMPT_HAS_FAILED_PLEASE_TRY_AGAIN_SOON;
	
	@ClientString(id = 1651, message = "The Olympiad Games are not currently in progress.")
	public static SystemMessageId THE_OLYMPIAD_GAMES_ARE_NOT_CURRENTLY_IN_PROGRESS;
	
	@ClientString(id = 1652, message = "You are now recording gameplay.")
	public static SystemMessageId YOU_ARE_NOW_RECORDING_GAMEPLAY;
	
	@ClientString(id = 1653, message = "Your recording has been successfully stored. ($s1)")
	public static SystemMessageId YOUR_RECORDING_HAS_BEEN_SUCCESSFULLY_STORED_S1;
	
	@ClientString(id = 1654, message = "The attempt to record the replay file has failed.")
	public static SystemMessageId THE_ATTEMPT_TO_RECORD_THE_REPLAY_FILE_HAS_FAILED;
	
	@ClientString(id = 1655, message = "You've caught… Goldeen!")
	public static SystemMessageId YOU_VE_CAUGHT_GOLDEEN;
	
	@ClientString(id = 1656, message = "You have successfully traded the item with the NPC.")
	public static SystemMessageId YOU_HAVE_SUCCESSFULLY_TRADED_THE_ITEM_WITH_THE_NPC;
	
	@ClientString(id = 1657, message = "$c1 has earned $s2 points in the Olympiad Games.")
	public static SystemMessageId C1_HAS_EARNED_S2_POINTS_IN_THE_OLYMPIAD_GAMES;
	
	@ClientString(id = 1658, message = "$c1 has lost $s2 points in the Olympiad Games.")
	public static SystemMessageId C1_HAS_LOST_S2_POINTS_IN_THE_OLYMPIAD_GAMES;
	
	@ClientString(id = 1659, message = "Current Location: $s1 / $s2 / $s3 (Cemetery of the Empire).")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3_CEMETERY_OF_THE_EMPIRE;
	
	@ClientString(id = 1660, message = "Channel Creator: $c1")
	public static SystemMessageId CHANNEL_CREATOR_C1;
	
	@ClientString(id = 1661, message = "$c1 has obtained $s3 $s2(s).")
	public static SystemMessageId C1_HAS_OBTAINED_S3_S2_S;
	
	@ClientString(id = 1662, message = "The fish are no longer biting here because you've caught too many!  Try fishing in another location.")
	public static SystemMessageId THE_FISH_ARE_NO_LONGER_BITING_HERE_BECAUSE_YOU_VE_CAUGHT_TOO_MANY_TRY_FISHING_IN_ANOTHER_LOCATION;
	
	@ClientString(id = 1663, message = "The Clan Mark was successfully registered.  The symbol will appear on the clan flag, and the insignia is only displayed on items pertaining to a clan that owns a clan hall or castle.")
	public static SystemMessageId THE_CLAN_MARK_WAS_SUCCESSFULLY_REGISTERED_THE_SYMBOL_WILL_APPEAR_ON_THE_CLAN_FLAG_AND_THE_INSIGNIA_IS_ONLY_DISPLAYED_ON_ITEMS_PERTAINING_TO_A_CLAN_THAT_OWNS_A_CLAN_HALL_OR_CASTLE;
	
	@ClientString(id = 1664, message = "The fish is resisting your efforts to haul it in!  Look at that bobber go!")
	public static SystemMessageId THE_FISH_IS_RESISTING_YOUR_EFFORTS_TO_HAUL_IT_IN_LOOK_AT_THAT_BOBBER_GO;
	
	@ClientString(id = 1665, message = "You've worn that fish out!  It can't even pull the bobber under the water!")
	public static SystemMessageId YOU_VE_WORN_THAT_FISH_OUT_IT_CAN_T_EVEN_PULL_THE_BOBBER_UNDER_THE_WATER;
	
	@ClientString(id = 1666, message = "You have obtained +$s1 $s2.")
	public static SystemMessageId YOU_HAVE_OBTAINED_S1_S2;
	
	@ClientString(id = 1667, message = "Lethal Strike!")
	public static SystemMessageId LETHAL_STRIKE;
	
	@ClientString(id = 1668, message = "Hit with Lethal Strike!")
	public static SystemMessageId HIT_WITH_LETHAL_STRIKE;
	
	@ClientString(id = 1669, message = "There was nothing found inside.")
	public static SystemMessageId THERE_WAS_NOTHING_FOUND_INSIDE;
	
	@ClientString(id = 1670, message = "Due to your Reeling and/or Pumping skill being three or more levels higher than your Fishing skill, a $s1% damage penalty will be applied.")
	public static SystemMessageId DUE_TO_YOUR_REELING_AND_OR_PUMPING_SKILL_BEING_THREE_OR_MORE_LEVELS_HIGHER_THAN_YOUR_FISHING_SKILL_A_S1_DAMAGE_PENALTY_WILL_BE_APPLIED;
	
	@ClientString(id = 1671, message = "Reeling successful! (Mastery Penalty: $s1%)")
	public static SystemMessageId REELING_SUCCESSFUL_MASTERY_PENALTY_S1;
	
	@ClientString(id = 1672, message = "Pumping successful! (Mastery Penalty: $s1%)")
	public static SystemMessageId PUMPING_SUCCESSFUL_MASTERY_PENALTY_S1;
	
	@ClientString(id = 1673, message = "For the current Olympiad you have participated in $s1 match(es) and had $s2 win(s) and $s3 defeat(s). You currently have $s4 Olympiad Point(s).")
	public static SystemMessageId FOR_THE_CURRENT_OLYMPIAD_YOU_HAVE_PARTICIPATED_IN_S1_MATCH_ES_AND_HAD_S2_WIN_S_AND_S3_DEFEAT_S_YOU_CURRENTLY_HAVE_S4_OLYMPIAD_POINT_S;
	
	@ClientString(id = 1674, message = "This command can only be used when the target is an Awakened Noblesse/Exalted.")
	public static SystemMessageId THIS_COMMAND_CAN_ONLY_BE_USED_WHEN_THE_TARGET_IS_AN_AWAKENED_NOBLESSE_EXALTED;
	
	@ClientString(id = 1675, message = "A manor cannot be set up between 4:30 am and 8 pm.")
	public static SystemMessageId A_MANOR_CANNOT_BE_SET_UP_BETWEEN_4_30_AM_AND_8_PM;
	
	@ClientString(id = 1676, message = "You do not have a servitor or pet and therefore cannot use the automatic-use function.")
	public static SystemMessageId YOU_DO_NOT_HAVE_A_SERVITOR_OR_PET_AND_THEREFORE_CANNOT_USE_THE_AUTOMATIC_USE_FUNCTION;
	
	@ClientString(id = 1677, message = "A cease-fire during a Clan War can not be called while members of your clan are engaged in battle.")
	public static SystemMessageId A_CEASE_FIRE_DURING_A_CLAN_WAR_CAN_NOT_BE_CALLED_WHILE_MEMBERS_OF_YOUR_CLAN_ARE_ENGAGED_IN_BATTLE;
	
	@ClientString(id = 1678, message = "You have not declared a Clan War against the clan $s1.")
	public static SystemMessageId YOU_HAVE_NOT_DECLARED_A_CLAN_WAR_AGAINST_THE_CLAN_S1;
	
	@ClientString(id = 1679, message = "Only the creator of a command channel can issue a global command.")
	public static SystemMessageId ONLY_THE_CREATOR_OF_A_COMMAND_CHANNEL_CAN_ISSUE_A_GLOBAL_COMMAND;
	
	@ClientString(id = 1680, message = "$c1 has declined the channel invitation.")
	public static SystemMessageId C1_HAS_DECLINED_THE_CHANNEL_INVITATION;
	
	@ClientString(id = 1681, message = "Since $c1 did not respond, your channel invitation has failed.")
	public static SystemMessageId SINCE_C1_DID_NOT_RESPOND_YOUR_CHANNEL_INVITATION_HAS_FAILED;
	
	@ClientString(id = 1682, message = "Only the creator of a command channel can use the channel dismiss command.")
	public static SystemMessageId ONLY_THE_CREATOR_OF_A_COMMAND_CHANNEL_CAN_USE_THE_CHANNEL_DISMISS_COMMAND;
	
	@ClientString(id = 1683, message = "Only a party leader can leave a command channel.")
	public static SystemMessageId ONLY_A_PARTY_LEADER_CAN_LEAVE_A_COMMAND_CHANNEL;
	
	@ClientString(id = 1684, message = "A Clan War can not be declared against a clan that is being dissolved.")
	public static SystemMessageId A_CLAN_WAR_CAN_NOT_BE_DECLARED_AGAINST_A_CLAN_THAT_IS_BEING_DISSOLVED;
	
	@ClientString(id = 1685, message = "You are unable to equip this item when your PK count is greater than or equal to one.")
	public static SystemMessageId YOU_ARE_UNABLE_TO_EQUIP_THIS_ITEM_WHEN_YOUR_PK_COUNT_IS_GREATER_THAN_OR_EQUAL_TO_ONE;
	
	@ClientString(id = 1686, message = "Stones and mortar tumble to the earth - the castle wall has taken damage!")
	public static SystemMessageId STONES_AND_MORTAR_TUMBLE_TO_THE_EARTH_THE_CASTLE_WALL_HAS_TAKEN_DAMAGE;
	
	@ClientString(id = 1687, message = "This area cannot be entered while mounted atop of a Wyvern.  You will be dismounted from your Wyvern if you do not leave!")
	public static SystemMessageId THIS_AREA_CANNOT_BE_ENTERED_WHILE_MOUNTED_ATOP_OF_A_WYVERN_YOU_WILL_BE_DISMOUNTED_FROM_YOUR_WYVERN_IF_YOU_DO_NOT_LEAVE;
	
	@ClientString(id = 1688, message = "You cannot enchant while operating a Private Store or Private Workshop.")
	public static SystemMessageId YOU_CANNOT_ENCHANT_WHILE_OPERATING_A_PRIVATE_STORE_OR_PRIVATE_WORKSHOP;
	
	@ClientString(id = 1689, message = "$c1 is already registered on the class match waiting list.")
	public static SystemMessageId C1_IS_ALREADY_REGISTERED_ON_THE_CLASS_MATCH_WAITING_LIST;
	
	@ClientString(id = 1690, message = "$c1 is already registered on the waiting list for the All-Class Battle.")
	public static SystemMessageId C1_IS_ALREADY_REGISTERED_ON_THE_WAITING_LIST_FOR_THE_ALL_CLASS_BATTLE;
	
	@ClientString(id = 1691, message = "$c1 does not meet the participation requirements as the inventory weight / slot is filled beyond 80%.")
	public static SystemMessageId C1_DOES_NOT_MEET_THE_PARTICIPATION_REQUIREMENTS_AS_THE_INVENTORY_WEIGHT_SLOT_IS_FILLED_BEYOND_80;
	
	@ClientString(id = 1692, message = "$c1 does not meet the participation requirements. You cannot participate in the Olympiad because you have changed your class to subclass.")
	public static SystemMessageId C1_DOES_NOT_MEET_THE_PARTICIPATION_REQUIREMENTS_YOU_CANNOT_PARTICIPATE_IN_THE_OLYMPIAD_BECAUSE_YOU_HAVE_CHANGED_YOUR_CLASS_TO_SUBCLASS;
	
	@ClientString(id = 1693, message = "You may not observe a Olympiad Games match while you are on the waiting list.")
	public static SystemMessageId YOU_MAY_NOT_OBSERVE_A_OLYMPIAD_GAMES_MATCH_WHILE_YOU_ARE_ON_THE_WAITING_LIST;
	
	@ClientString(id = 1694, message = "Only a clan leader that is a Noblesse/Exalted can view the Siege War Status window during a siege war.")
	public static SystemMessageId ONLY_A_CLAN_LEADER_THAT_IS_A_NOBLESSE_EXALTED_CAN_VIEW_THE_SIEGE_WAR_STATUS_WINDOW_DURING_A_SIEGE_WAR;
	
	@ClientString(id = 1695, message = "You can only use that during a Siege War!")
	public static SystemMessageId YOU_CAN_ONLY_USE_THAT_DURING_A_SIEGE_WAR;
	
	@ClientString(id = 1696, message = "Your accumulated play time is $s1.")
	public static SystemMessageId YOUR_ACCUMULATED_PLAY_TIME_IS_S1;
	
	@ClientString(id = 1697, message = "Your accumulated play time has reached Fatigue level, so you will receive XP or item drops at only 50 percent of the normal rate. For the sake of you physical and emotional health, we encourage you to log out as soon as possible and take a break before returning.")
	public static SystemMessageId YOUR_ACCUMULATED_PLAY_TIME_HAS_REACHED_FATIGUE_LEVEL_SO_YOU_WILL_RECEIVE_XP_OR_ITEM_DROPS_AT_ONLY_50_PERCENT_OF_THE_NORMAL_RATE_FOR_THE_SAKE_OF_YOU_PHYSICAL_AND_EMOTIONAL_HEALTH_WE_ENCOURAGE_YOU_TO_LOG_OUT_AS_SOON_AS_POSSIBLE_AND_TAKE_A_BREAK_BEFORE_RETURNING;
	
	@ClientString(id = 1698, message = "Your accumulated play time has reached Ill-health level, so you will no longer gain experience or item drops. For the sake of your physical and emotional health, please log out as soon as possible and take a break. Once you have been logged out for at least 5 hours, XP and item drop rate penalties will be removed.")
	public static SystemMessageId YOUR_ACCUMULATED_PLAY_TIME_HAS_REACHED_ILL_HEALTH_LEVEL_SO_YOU_WILL_NO_LONGER_GAIN_EXPERIENCE_OR_ITEM_DROPS_FOR_THE_SAKE_OF_YOUR_PHYSICAL_AND_EMOTIONAL_HEALTH_PLEASE_LOG_OUT_AS_SOON_AS_POSSIBLE_AND_TAKE_A_BREAK_ONCE_YOU_HAVE_BEEN_LOGGED_OUT_FOR_AT_LEAST_5_HOURS_XP_AND_ITEM_DROP_RATE_PENALTIES_WILL_BE_REMOVED;
	
	@ClientString(id = 1699, message = "You cannot dismiss a party member by force.")
	public static SystemMessageId YOU_CANNOT_DISMISS_A_PARTY_MEMBER_BY_FORCE;
	
	@ClientString(id = 1700, message = "You don't have enough spiritshots needed for a pet/servitor.")
	public static SystemMessageId YOU_DON_T_HAVE_ENOUGH_SPIRITSHOTS_NEEDED_FOR_A_PET_SERVITOR;
	
	@ClientString(id = 1701, message = "You don't have enough soulshots needed for a pet/servitor.")
	public static SystemMessageId YOU_DON_T_HAVE_ENOUGH_SOULSHOTS_NEEDED_FOR_A_PET_SERVITOR;
	
	@ClientString(id = 1702, message = "$s1 is using a third party program.")
	public static SystemMessageId S1_IS_USING_A_THIRD_PARTY_PROGRAM;
	
	@ClientString(id = 1703, message = "The previously investigated user is not using a third party program.")
	public static SystemMessageId THE_PREVIOUSLY_INVESTIGATED_USER_IS_NOT_USING_A_THIRD_PARTY_PROGRAM;
	
	@ClientString(id = 1704, message = "Please close the  setup window for your private workshop or private store, and try again.")
	public static SystemMessageId PLEASE_CLOSE_THE_SETUP_WINDOW_FOR_YOUR_PRIVATE_WORKSHOP_OR_PRIVATE_STORE_AND_TRY_AGAIN;
	
	@ClientString(id = 1705, message = "You can earn PC Points for a further $s1 hour(s).")
	public static SystemMessageId YOU_CAN_EARN_PC_POINTS_FOR_A_FURTHER_S1_HOUR_S;
	
	@ClientString(id = 1706, message = "You can spend your PC Points for a further $s1 hour(s).")
	public static SystemMessageId YOU_CAN_SPEND_YOUR_PC_POINTS_FOR_A_FURTHER_S1_HOUR_S;
	
	@ClientString(id = 1707, message = "You earned $s1 PC Point(s).")
	public static SystemMessageId YOU_EARNED_S1_PC_POINT_S;
	
	@ClientString(id = 1708, message = "Double points! You earned $s1 PC Point(s).")
	public static SystemMessageId DOUBLE_POINTS_YOU_EARNED_S1_PC_POINT_S;
	
	@ClientString(id = 1709, message = "You are using $s1 point.")
	public static SystemMessageId YOU_ARE_USING_S1_POINT;
	
	@ClientString(id = 1710, message = "You are short of PC points.")
	public static SystemMessageId YOU_ARE_SHORT_OF_PC_POINTS;
	
	@ClientString(id = 1711, message = "You can no longer spend your PC Points.")
	public static SystemMessageId YOU_CAN_NO_LONGER_SPEND_YOUR_PC_POINTS;
	
	@ClientString(id = 1712, message = "You can no longer earn PC Points.")
	public static SystemMessageId YOU_CAN_NO_LONGER_EARN_PC_POINTS;
	
	@ClientString(id = 1713, message = "The games may be delayed due to an insufficient number of players waiting.")
	public static SystemMessageId THE_GAMES_MAY_BE_DELAYED_DUE_TO_AN_INSUFFICIENT_NUMBER_OF_PLAYERS_WAITING;
	
	@ClientString(id = 1714, message = "Current Location: $s1 / $s2 / $s3 (Near the Town of Schuttgart)")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3_NEAR_THE_TOWN_OF_SCHUTTGART;
	
	@ClientString(id = 1715, message = "This is a Peaceful Zonen- PvP is not allowed in this area.")
	public static SystemMessageId THIS_IS_A_PEACEFUL_ZONE_N_PVP_IS_NOT_ALLOWED_IN_THIS_AREA;
	
	@ClientString(id = 1716, message = "Altered Zone")
	public static SystemMessageId ALTERED_ZONE;
	
	@ClientString(id = 1717, message = "Siege War Zone n- A siege is currently in progress in this area.  n If a character dies in this zone, their resurrection ability may be restricted.")
	public static SystemMessageId SIEGE_WAR_ZONE_N_A_SIEGE_IS_CURRENTLY_IN_PROGRESS_IN_THIS_AREA_N_IF_A_CHARACTER_DIES_IN_THIS_ZONE_THEIR_RESURRECTION_ABILITY_MAY_BE_RESTRICTED;
	
	@ClientString(id = 1718, message = "General Field")
	public static SystemMessageId GENERAL_FIELD;
	
	@ClientString(id = 1719, message = "Seven Signs Zone n- Although a character's level may increase while in this area, HP and MP n will not be regenerated.")
	public static SystemMessageId SEVEN_SIGNS_ZONE_N_ALTHOUGH_A_CHARACTER_S_LEVEL_MAY_INCREASE_WHILE_IN_THIS_AREA_HP_AND_MP_N_WILL_NOT_BE_REGENERATED;
	
	@ClientString(id = 1720, message = "---")
	public static SystemMessageId EMPTY6;
	
	@ClientString(id = 1721, message = "Combat Zone")
	public static SystemMessageId COMBAT_ZONE;
	
	@ClientString(id = 1722, message = "Please enter shop message that you wish to search for in the private store and private workshop.")
	public static SystemMessageId PLEASE_ENTER_SHOP_MESSAGE_THAT_YOU_WISH_TO_SEARCH_FOR_IN_THE_PRIVATE_STORE_AND_PRIVATE_WORKSHOP;
	
	@ClientString(id = 1723, message = "Please take a moment to provide feedback about the petition service.")
	public static SystemMessageId PLEASE_TAKE_A_MOMENT_TO_PROVIDE_FEEDBACK_ABOUT_THE_PETITION_SERVICE;
	
	@ClientString(id = 1724, message = "A servitor whom is engaged in battle cannot be de-activated.")
	public static SystemMessageId A_SERVITOR_WHOM_IS_ENGAGED_IN_BATTLE_CANNOT_BE_DE_ACTIVATED;
	
	@ClientString(id = 1725, message = "You have earned $s1 raid point(s).")
	public static SystemMessageId YOU_HAVE_EARNED_S1_RAID_POINT_S;
	
	@ClientString(id = 1726, message = "$s1 has disappeared because due to expiration.")
	public static SystemMessageId S1_HAS_DISAPPEARED_BECAUSE_DUE_TO_EXPIRATION;
	
	@ClientString(id = 1727, message = "$s1 has invited you to room ($s2). Do you wish to accept?")
	public static SystemMessageId S1_HAS_INVITED_YOU_TO_ROOM_S2_DO_YOU_WISH_TO_ACCEPT;
	
	@ClientString(id = 1728, message = "The recipient of your invitation did not accept the party matching invitation.")
	public static SystemMessageId THE_RECIPIENT_OF_YOUR_INVITATION_DID_NOT_ACCEPT_THE_PARTY_MATCHING_INVITATION;
	
	@ClientString(id = 1729, message = "You cannot join a Command Channel while teleporting.")
	public static SystemMessageId YOU_CANNOT_JOIN_A_COMMAND_CHANNEL_WHILE_TELEPORTING;
	
	@ClientString(id = 1730, message = "To establish a Clan Academy, your clan must be Level 5 or higher.")
	public static SystemMessageId TO_ESTABLISH_A_CLAN_ACADEMY_YOUR_CLAN_MUST_BE_LEVEL_5_OR_HIGHER;
	
	@ClientString(id = 1731, message = "Only the clan leader can create a Clan Academy.")
	public static SystemMessageId ONLY_THE_CLAN_LEADER_CAN_CREATE_A_CLAN_ACADEMY;
	
	@ClientString(id = 1732, message = "To create a Clan Academy, a Blood Mark is needed.")
	public static SystemMessageId TO_CREATE_A_CLAN_ACADEMY_A_BLOOD_MARK_IS_NEEDED;
	
	@ClientString(id = 1733, message = "You do not have enough Adena to create a Clan Academy.")
	public static SystemMessageId YOU_DO_NOT_HAVE_ENOUGH_ADENA_TO_CREATE_A_CLAN_ACADEMY;
	
	@ClientString(id = 1734, message = "In order to join the clan academy, you must be unaffiliated with a clan and be an unawakened character Lv. 84 or below fpr both main and subclass.")
	public static SystemMessageId IN_ORDER_TO_JOIN_THE_CLAN_ACADEMY_YOU_MUST_BE_UNAFFILIATED_WITH_A_CLAN_AND_BE_AN_UNAWAKENED_CHARACTER_LV_84_OR_BELOW_FPR_BOTH_MAIN_AND_SUBCLASS;
	
	@ClientString(id = 1735, message = "$s1 does not meet the requirements to join a Clan Academy.")
	public static SystemMessageId S1_DOES_NOT_MEET_THE_REQUIREMENTS_TO_JOIN_A_CLAN_ACADEMY;
	
	@ClientString(id = 1736, message = "The Clan Academy has reached its maximum enrollment.")
	public static SystemMessageId THE_CLAN_ACADEMY_HAS_REACHED_ITS_MAXIMUM_ENROLLMENT;
	
	@ClientString(id = 1737, message = "Your clan has not established a Clan Academy but is eligible to do so.")
	public static SystemMessageId YOUR_CLAN_HAS_NOT_ESTABLISHED_A_CLAN_ACADEMY_BUT_IS_ELIGIBLE_TO_DO_SO;
	
	@ClientString(id = 1738, message = "Your clan has already established a Clan Academy.")
	public static SystemMessageId YOUR_CLAN_HAS_ALREADY_ESTABLISHED_A_CLAN_ACADEMY;
	
	@ClientString(id = 1739, message = "Would you like to create a Clan Academy?")
	public static SystemMessageId WOULD_YOU_LIKE_TO_CREATE_A_CLAN_ACADEMY;
	
	@ClientString(id = 1740, message = "Please enter the name of the Clan Academy.")
	public static SystemMessageId PLEASE_ENTER_THE_NAME_OF_THE_CLAN_ACADEMY;
	
	@ClientString(id = 1741, message = "Congratulations! The $s1's Clan Academy has been created.")
	public static SystemMessageId CONGRATULATIONS_THE_S1_S_CLAN_ACADEMY_HAS_BEEN_CREATED;
	
	@ClientString(id = 1742, message = "A message inviting $s1 to join the Clan Academy is being sent.")
	public static SystemMessageId A_MESSAGE_INVITING_S1_TO_JOIN_THE_CLAN_ACADEMY_IS_BEING_SENT;
	
	@ClientString(id = 1743, message = "To open a Clan Academy, the leader of a Level 5 clan or above must pay XX Proofs of Blood or a certain amount of Adena.")
	public static SystemMessageId TO_OPEN_A_CLAN_ACADEMY_THE_LEADER_OF_A_LEVEL_5_CLAN_OR_ABOVE_MUST_PAY_XX_PROOFS_OF_BLOOD_OR_A_CERTAIN_AMOUNT_OF_ADENA;
	
	@ClientString(id = 1744, message = "There was no response to your invitation to join the Clan Academy, so the invitation has been rescinded.")
	public static SystemMessageId THERE_WAS_NO_RESPONSE_TO_YOUR_INVITATION_TO_JOIN_THE_CLAN_ACADEMY_SO_THE_INVITATION_HAS_BEEN_RESCINDED;
	
	@ClientString(id = 1745, message = "The recipient of your invitation to join the Clan Academy has declined.")
	public static SystemMessageId THE_RECIPIENT_OF_YOUR_INVITATION_TO_JOIN_THE_CLAN_ACADEMY_HAS_DECLINED;
	
	@ClientString(id = 1746, message = "You have already joined a Clan Academy.")
	public static SystemMessageId YOU_HAVE_ALREADY_JOINED_A_CLAN_ACADEMY;
	
	@ClientString(id = 1747, message = "$s1 has sent you an invitation to join the Clan Academy belonging to the $s2 clan. Do you accept?")
	public static SystemMessageId S1_HAS_SENT_YOU_AN_INVITATION_TO_JOIN_THE_CLAN_ACADEMY_BELONGING_TO_THE_S2_CLAN_DO_YOU_ACCEPT;
	
	@ClientString(id = 1748, message = "Clan Academy member $s1 has successfully Awakened, obtaining $s2 Clan Reputation.")
	public static SystemMessageId CLAN_ACADEMY_MEMBER_S1_HAS_SUCCESSFULLY_AWAKENED_OBTAINING_S2_CLAN_REPUTATION;
	
	@ClientString(id = 1749, message = "Congratulations! You will now graduate from the Clan Academy and leave your current clan. You can now join a clan without being subject to any penalties.")
	public static SystemMessageId CONGRATULATIONS_YOU_WILL_NOW_GRADUATE_FROM_THE_CLAN_ACADEMY_AND_LEAVE_YOUR_CURRENT_CLAN_YOU_CAN_NOW_JOIN_A_CLAN_WITHOUT_BEING_SUBJECT_TO_ANY_PENALTIES;
	
	@ClientString(id = 1750, message = "$c1 does not meet the participation requirements. The owner of $s2 cannot participate in the Olympiad.")
	public static SystemMessageId C1_DOES_NOT_MEET_THE_PARTICIPATION_REQUIREMENTS_THE_OWNER_OF_S2_CANNOT_PARTICIPATE_IN_THE_OLYMPIAD;
	
	@ClientString(id = 1751, message = "The Grand Master has given you a commemorative item.")
	public static SystemMessageId THE_GRAND_MASTER_HAS_GIVEN_YOU_A_COMMEMORATIVE_ITEM;
	
	@ClientString(id = 1752, message = "Since the clan has received a graduate of the Clan Academy, it has earned $s1 Reputation.")
	public static SystemMessageId SINCE_THE_CLAN_HAS_RECEIVED_A_GRADUATE_OF_THE_CLAN_ACADEMY_IT_HAS_EARNED_S1_REPUTATION;
	
	@ClientString(id = 1753, message = "The clan leader has decreed that that particular privilege cannot be granted to a Clan Academy member.")
	public static SystemMessageId THE_CLAN_LEADER_HAS_DECREED_THAT_THAT_PARTICULAR_PRIVILEGE_CANNOT_BE_GRANTED_TO_A_CLAN_ACADEMY_MEMBER;
	
	@ClientString(id = 1754, message = "That privilege cannot be granted to a Clan Academy member.")
	public static SystemMessageId THAT_PRIVILEGE_CANNOT_BE_GRANTED_TO_A_CLAN_ACADEMY_MEMBER;
	
	@ClientString(id = 1755, message = "$s2 has been designated as the apprentice of clan member $s1.")
	public static SystemMessageId S2_HAS_BEEN_DESIGNATED_AS_THE_APPRENTICE_OF_CLAN_MEMBER_S1;
	
	@ClientString(id = 1756, message = "Your apprentice, $s1, has logged in.")
	public static SystemMessageId YOUR_APPRENTICE_S1_HAS_LOGGED_IN;
	
	@ClientString(id = 1757, message = "Your apprentice, $c1 , has logged out.")
	public static SystemMessageId YOUR_APPRENTICE_C1_HAS_LOGGED_OUT;
	
	@ClientString(id = 1758, message = "Your sponsor, $c1 , has logged in.")
	public static SystemMessageId YOUR_SPONSOR_C1_HAS_LOGGED_IN;
	
	@ClientString(id = 1759, message = "Your sponsor, $c1 , has logged out.")
	public static SystemMessageId YOUR_SPONSOR_C1_HAS_LOGGED_OUT;
	
	@ClientString(id = 1760, message = "Clan member $c1's title has been changed to $s2.")
	public static SystemMessageId CLAN_MEMBER_C1_S_TITLE_HAS_BEEN_CHANGED_TO_S2;
	
	@ClientString(id = 1761, message = "Clan member $c1's privilege level has been changed to $s2.")
	public static SystemMessageId CLAN_MEMBER_C1_S_PRIVILEGE_LEVEL_HAS_BEEN_CHANGED_TO_S2;
	
	@ClientString(id = 1762, message = "You do not have the right to dismiss an apprentice.")
	public static SystemMessageId YOU_DO_NOT_HAVE_THE_RIGHT_TO_DISMISS_AN_APPRENTICE;
	
	@ClientString(id = 1763, message = "$s2, clan member $c1's apprentice, has been removed.")
	public static SystemMessageId S2_CLAN_MEMBER_C1_S_APPRENTICE_HAS_BEEN_REMOVED;
	
	@ClientString(id = 1764, message = "This item can only be worn by a member of the Clan Academy.")
	public static SystemMessageId THIS_ITEM_CAN_ONLY_BE_WORN_BY_A_MEMBER_OF_THE_CLAN_ACADEMY;
	
	@ClientString(id = 1765, message = "As a graduate of the Clan Academy, you can no longer wear this item.")
	public static SystemMessageId AS_A_GRADUATE_OF_THE_CLAN_ACADEMY_YOU_CAN_NO_LONGER_WEAR_THIS_ITEM;
	
	@ClientString(id = 1766, message = "An application to join the clan has been sent to $c1 in $s2.")
	public static SystemMessageId AN_APPLICATION_TO_JOIN_THE_CLAN_HAS_BEEN_SENT_TO_C1_IN_S2;
	
	@ClientString(id = 1767, message = "An application to join the Clan Academy has been sent to $c1.")
	public static SystemMessageId AN_APPLICATION_TO_JOIN_THE_CLAN_ACADEMY_HAS_BEEN_SENT_TO_C1;
	
	@ClientString(id = 1768, message = "$c1 has invited you to join the Clan Academy of $s2 clan. Would you like to join?")
	public static SystemMessageId C1_HAS_INVITED_YOU_TO_JOIN_THE_CLAN_ACADEMY_OF_S2_CLAN_WOULD_YOU_LIKE_TO_JOIN;
	
	@ClientString(id = 1769, message = "$c1 has sent you an invitation to join the $s3 Order of Knights under the $s2 clan. Would you like to join?")
	public static SystemMessageId C1_HAS_SENT_YOU_AN_INVITATION_TO_JOIN_THE_S3_ORDER_OF_KNIGHTS_UNDER_THE_S2_CLAN_WOULD_YOU_LIKE_TO_JOIN;
	
	@ClientString(id = 1770, message = "The clan's Reputation has dropped below 0. The clan may face certain penalties as a result.")
	public static SystemMessageId THE_CLAN_S_REPUTATION_HAS_DROPPED_BELOW_0_THE_CLAN_MAY_FACE_CERTAIN_PENALTIES_AS_A_RESULT;
	
	@ClientString(id = 1771, message = "Now that your clan level is above Level 5, it can accumulate Clan Reputation.")
	public static SystemMessageId NOW_THAT_YOUR_CLAN_LEVEL_IS_ABOVE_LEVEL_5_IT_CAN_ACCUMULATE_CLAN_REPUTATION;
	
	@ClientString(id = 1772, message = "Since your clan was defeated in a siege, $s1 point(s) have been deducted from your Clan Reputation and given to the opposing clan.")
	public static SystemMessageId SINCE_YOUR_CLAN_WAS_DEFEATED_IN_A_SIEGE_S1_POINT_S_HAVE_BEEN_DEDUCTED_FROM_YOUR_CLAN_REPUTATION_AND_GIVEN_TO_THE_OPPOSING_CLAN;
	
	@ClientString(id = 1773, message = "Since your clan emerged victorious from the siege, $s1 point(s) have been added to your Clan Reputation.")
	public static SystemMessageId SINCE_YOUR_CLAN_EMERGED_VICTORIOUS_FROM_THE_SIEGE_S1_POINT_S_HAVE_BEEN_ADDED_TO_YOUR_CLAN_REPUTATION;
	
	@ClientString(id = 1774, message = "Your clan's newly acquired contested clan hall has added $s1 point(s) to your Clan Reputation.")
	public static SystemMessageId YOUR_CLAN_S_NEWLY_ACQUIRED_CONTESTED_CLAN_HALL_HAS_ADDED_S1_POINT_S_TO_YOUR_CLAN_REPUTATION;
	
	@ClientString(id = 1775, message = "Clan member $c1 was an active member of the highest-ranked party in the Festival of Darkness. $s2 points have been added to your Clan Reputation.")
	public static SystemMessageId CLAN_MEMBER_C1_WAS_AN_ACTIVE_MEMBER_OF_THE_HIGHEST_RANKED_PARTY_IN_THE_FESTIVAL_OF_DARKNESS_S2_POINTS_HAVE_BEEN_ADDED_TO_YOUR_CLAN_REPUTATION;
	
	@ClientString(id = 1776, message = "Clan member $c1 was named a hero. $s2 points have been added to your Clan Reputation.")
	public static SystemMessageId CLAN_MEMBER_C1_WAS_NAMED_A_HERO_S2_POINTS_HAVE_BEEN_ADDED_TO_YOUR_CLAN_REPUTATION;
	
	@ClientString(id = 1777, message = "You have successfully completed a clan quest. $s1 point(s) have been added to your Clan Reputation.")
	public static SystemMessageId YOU_HAVE_SUCCESSFULLY_COMPLETED_A_CLAN_QUEST_S1_POINT_S_HAVE_BEEN_ADDED_TO_YOUR_CLAN_REPUTATION;
	
	@ClientString(id = 1778, message = "An opposing clan has captured your clan's contested clan hall. $s1 point(s) have been deducted from your Clan Reputation.")
	public static SystemMessageId AN_OPPOSING_CLAN_HAS_CAPTURED_YOUR_CLAN_S_CONTESTED_CLAN_HALL_S1_POINT_S_HAVE_BEEN_DEDUCTED_FROM_YOUR_CLAN_REPUTATION;
	
	@ClientString(id = 1779, message = "After losing the contested clan hall, 300 points have been deducted from your Clan Reputation.")
	public static SystemMessageId AFTER_LOSING_THE_CONTESTED_CLAN_HALL_300_POINTS_HAVE_BEEN_DEDUCTED_FROM_YOUR_CLAN_REPUTATION;
	
	@ClientString(id = 1780, message = "Your clan has captured your opponent's contested clan hall. $s1 point(s) have been deducted from your opponent's Clan Reputation.")
	public static SystemMessageId YOUR_CLAN_HAS_CAPTURED_YOUR_OPPONENT_S_CONTESTED_CLAN_HALL_S1_POINT_S_HAVE_BEEN_DEDUCTED_FROM_YOUR_OPPONENT_S_CLAN_REPUTATION;
	
	@ClientString(id = 1781, message = "Your clan has added $s1 point(s) to its Clan Reputation.")
	public static SystemMessageId YOUR_CLAN_HAS_ADDED_S1_POINT_S_TO_ITS_CLAN_REPUTATION;
	
	@ClientString(id = 1782, message = "Your clan member, $c1, was killed. $s2 point(s) have been deducted from your Clan Reputation and added to your opponent's Clan Reputation.")
	public static SystemMessageId YOUR_CLAN_MEMBER_C1_WAS_KILLED_S2_POINT_S_HAVE_BEEN_DEDUCTED_FROM_YOUR_CLAN_REPUTATION_AND_ADDED_TO_YOUR_OPPONENT_S_CLAN_REPUTATION;
	
	@ClientString(id = 1783, message = "For killing an opposing clan member, $s1 point(s) have been deducted from your opponents' Clan Reputation.")
	public static SystemMessageId FOR_KILLING_AN_OPPOSING_CLAN_MEMBER_S1_POINT_S_HAVE_BEEN_DEDUCTED_FROM_YOUR_OPPONENTS_CLAN_REPUTATION;
	
	@ClientString(id = 1784, message = "Your clan has failed to defend the castle. $s1 point(s) have been deducted from your Clan Reputation and added to your opponents'.")
	public static SystemMessageId YOUR_CLAN_HAS_FAILED_TO_DEFEND_THE_CASTLE_S1_POINT_S_HAVE_BEEN_DEDUCTED_FROM_YOUR_CLAN_REPUTATION_AND_ADDED_TO_YOUR_OPPONENTS;
	
	@ClientString(id = 1785, message = "The clan you belong to has been initialized. $s1 point(s) have been deducted from your Clan Reputation.")
	public static SystemMessageId THE_CLAN_YOU_BELONG_TO_HAS_BEEN_INITIALIZED_S1_POINT_S_HAVE_BEEN_DEDUCTED_FROM_YOUR_CLAN_REPUTATION;
	
	@ClientString(id = 1786, message = "Your clan has failed to defend the castle. $s1 point(s) have been deducted from your Clan Reputation.")
	public static SystemMessageId YOUR_CLAN_HAS_FAILED_TO_DEFEND_THE_CASTLE_S1_POINT_S_HAVE_BEEN_DEDUCTED_FROM_YOUR_CLAN_REPUTATION;
	
	@ClientString(id = 1787, message = "$s1 point(s) have been deducted from the clan's Reputation.")
	public static SystemMessageId S1_POINT_S_HAVE_BEEN_DEDUCTED_FROM_THE_CLAN_S_REPUTATION;
	
	@ClientString(id = 1788, message = "The clan skill $s1 has been added.")
	public static SystemMessageId THE_CLAN_SKILL_S1_HAS_BEEN_ADDED;
	
	@ClientString(id = 1789, message = "Since the Clan Reputation has dropped below 0, your clan skill(s) will be de-activated.")
	public static SystemMessageId SINCE_THE_CLAN_REPUTATION_HAS_DROPPED_BELOW_0_YOUR_CLAN_SKILL_S_WILL_BE_DE_ACTIVATED;
	
	@ClientString(id = 1790, message = "The conditions necessary to increase the clan's level have not been met.")
	public static SystemMessageId THE_CONDITIONS_NECESSARY_TO_INCREASE_THE_CLAN_S_LEVEL_HAVE_NOT_BEEN_MET;
	
	@ClientString(id = 1791, message = "The conditions necessary to create a military unit have not been met.")
	public static SystemMessageId THE_CONDITIONS_NECESSARY_TO_CREATE_A_MILITARY_UNIT_HAVE_NOT_BEEN_MET;
	
	@ClientString(id = 1792, message = "Please assign a manager for your new Order of Knights.")
	public static SystemMessageId PLEASE_ASSIGN_A_MANAGER_FOR_YOUR_NEW_ORDER_OF_KNIGHTS;
	
	@ClientString(id = 1793, message = "$c1 has been selected as the captain of $s2.")
	public static SystemMessageId C1_HAS_BEEN_SELECTED_AS_THE_CAPTAIN_OF_S2;
	
	@ClientString(id = 1794, message = "The Knights of $s1 have been created.")
	public static SystemMessageId THE_KNIGHTS_OF_S1_HAVE_BEEN_CREATED;
	
	@ClientString(id = 1795, message = "The Royal Guard of $s1 have been created.")
	public static SystemMessageId THE_ROYAL_GUARD_OF_S1_HAVE_BEEN_CREATED;
	
	@ClientString(id = 1796, message = "Please verify your identity to confirm your ownership of your account at the NCsoft website.  For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId PLEASE_VERIFY_YOUR_IDENTITY_TO_CONFIRM_YOUR_OWNERSHIP_OF_YOUR_ACCOUNT_AT_THE_NCSOFT_WEBSITE_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 1797, message = "$c1 has been promoted to $s2.")
	public static SystemMessageId C1_HAS_BEEN_PROMOTED_TO_S2;
	
	@ClientString(id = 1798, message = "Clan Leader privileges have been transferred to $c1.")
	public static SystemMessageId CLAN_LEADER_PRIVILEGES_HAVE_BEEN_TRANSFERRED_TO_C1;
	
	@ClientString(id = 1799, message = "We are searching for BOT users. Please try again later.")
	public static SystemMessageId WE_ARE_SEARCHING_FOR_BOT_USERS_PLEASE_TRY_AGAIN_LATER;
	
	@ClientString(id = 1800, message = "User $c1 has a history of using BOT.")
	public static SystemMessageId USER_C1_HAS_A_HISTORY_OF_USING_BOT;
	
	@ClientString(id = 1801, message = "The attempt to sell has failed.")
	public static SystemMessageId THE_ATTEMPT_TO_SELL_HAS_FAILED;
	
	@ClientString(id = 1802, message = "The attempt to trade has failed.")
	public static SystemMessageId THE_ATTEMPT_TO_TRADE_HAS_FAILED;
	
	@ClientString(id = 1803, message = "Participation requests are no longer being accepted.")
	public static SystemMessageId PARTICIPATION_REQUESTS_ARE_NO_LONGER_BEING_ACCEPTED;
	
	@ClientString(id = 1804, message = "Your account has been restricted for a duration of 7 days due to your confirmed attempt at trade involving cash/server/other games. For more information, please visit Lineage II's Support Website (https://support.lineage2.com).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_FOR_A_DURATION_OF_7_DAYS_DUE_TO_YOUR_CONFIRMED_ATTEMPT_AT_TRADE_INVOLVING_CASH_SERVER_OTHER_GAMES_FOR_MORE_INFORMATION_PLEASE_VISIT_LINEAGE_II_S_SUPPORT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM;
	
	@ClientString(id = 1805, message = "Your account has been restricted for a duration of 30 days due to your confirmed second attempt at trade involving cash/server/other games. For more information, please visit Lineage II's Support Website (https://support.lineage2.com).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_FOR_A_DURATION_OF_30_DAYS_DUE_TO_YOUR_CONFIRMED_SECOND_ATTEMPT_AT_TRADE_INVOLVING_CASH_SERVER_OTHER_GAMES_FOR_MORE_INFORMATION_PLEASE_VISIT_LINEAGE_II_S_SUPPORT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM;
	
	@ClientString(id = 1806, message = "You account has been temporarily suspended for acquiring an item involved in account theft. Please verify your identity on our website. For more information, please visit Lineage II's Support Website (https://support.lineage2.com).")
	public static SystemMessageId YOU_ACCOUNT_HAS_BEEN_TEMPORARILY_SUSPENDED_FOR_ACQUIRING_AN_ITEM_INVOLVED_IN_ACCOUNT_THEFT_PLEASE_VERIFY_YOUR_IDENTITY_ON_OUR_WEBSITE_FOR_MORE_INFORMATION_PLEASE_VISIT_LINEAGE_II_S_SUPPORT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM;
	
	@ClientString(id = 1807, message = "Your account has been restricted for a duration of 30 days due to your confirmed attempt at trade involving cash/server/other games. For more information, please visit Lineage II's Support Website (https://support.lineage2.com).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_FOR_A_DURATION_OF_30_DAYS_DUE_TO_YOUR_CONFIRMED_ATTEMPT_AT_TRADE_INVOLVING_CASH_SERVER_OTHER_GAMES_FOR_MORE_INFORMATION_PLEASE_VISIT_LINEAGE_II_S_SUPPORT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM;
	
	@ClientString(id = 1808, message = "Your account has been restricted due to your confirmed second attempt at trade involving cash/server/other games. For more information, please visit Lineage II's Support Website (https://support.lineage2.com).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_DUE_TO_YOUR_CONFIRMED_SECOND_ATTEMPT_AT_TRADE_INVOLVING_CASH_SERVER_OTHER_GAMES_FOR_MORE_INFORMATION_PLEASE_VISIT_LINEAGE_II_S_SUPPORT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM;
	
	@ClientString(id = 1809, message = "You cannot use the game services as your identity has not been verified. Please visit the NCSOFT website ( https://support.lineage2.com) and go through the personal verification process to lift the restriction. For more information, please visit the Support Center on the NCSOFT website.")
	public static SystemMessageId YOU_CANNOT_USE_THE_GAME_SERVICES_AS_YOUR_IDENTITY_HAS_NOT_BEEN_VERIFIED_PLEASE_VISIT_THE_NCSOFT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM_AND_GO_THROUGH_THE_PERSONAL_VERIFICATION_PROCESS_TO_LIFT_THE_RESTRICTION_FOR_MORE_INFORMATION_PLEASE_VISIT_THE_SUPPORT_CENTER_ON_THE_NCSOFT_WEBSITE;
	
	@ClientString(id = 1810, message = "The refuse invitation state has been activated.")
	public static SystemMessageId THE_REFUSE_INVITATION_STATE_HAS_BEEN_ACTIVATED;
	
	@ClientString(id = 1811, message = "The refuse invitation state has been removed.")
	public static SystemMessageId THE_REFUSE_INVITATION_STATE_HAS_BEEN_REMOVED;
	
	@ClientString(id = 1812, message = "Since the refuse invitation state is currently activated, no invitation can be made.")
	public static SystemMessageId SINCE_THE_REFUSE_INVITATION_STATE_IS_CURRENTLY_ACTIVATED_NO_INVITATION_CAN_BE_MADE;
	
	@ClientString(id = 1813, message = "$s1 has $s2 hour(s) of usage time remaining.")
	public static SystemMessageId S1_HAS_S2_HOUR_S_OF_USAGE_TIME_REMAINING;
	
	@ClientString(id = 1814, message = "$s1 has $s2 minute(s) of usage time remaining.")
	public static SystemMessageId S1_HAS_S2_MINUTE_S_OF_USAGE_TIME_REMAINING;
	
	@ClientString(id = 1815, message = "$s2 was dropped in the $s1 region.")
	public static SystemMessageId S2_WAS_DROPPED_IN_THE_S1_REGION;
	
	@ClientString(id = 1816, message = "The owner of $s2 has appeared in the $s1 region.")
	public static SystemMessageId THE_OWNER_OF_S2_HAS_APPEARED_IN_THE_S1_REGION;
	
	@ClientString(id = 1817, message = "$s2's owner has logged into the $s1 region.")
	public static SystemMessageId S2_S_OWNER_HAS_LOGGED_INTO_THE_S1_REGION;
	
	@ClientString(id = 1818, message = "$s1 has disappeared.")
	public static SystemMessageId S1_HAS_DISAPPEARED;
	
	@ClientString(id = 1819, message = "An evil is pulsating from $s2 in $s1.")
	public static SystemMessageId AN_EVIL_IS_PULSATING_FROM_S2_IN_S1;
	
	@ClientString(id = 1820, message = "$s1 is currently asleep.")
	public static SystemMessageId S1_IS_CURRENTLY_ASLEEP;
	
	@ClientString(id = 1821, message = "$s2's evil presence is felt in $s1.")
	public static SystemMessageId S2_S_EVIL_PRESENCE_IS_FELT_IN_S1;
	
	@ClientString(id = 1822, message = "$s1 has been sealed.")
	public static SystemMessageId S1_HAS_BEEN_SEALED;
	
	@ClientString(id = 1823, message = "The registration period for a clan hall war has ended.")
	public static SystemMessageId THE_REGISTRATION_PERIOD_FOR_A_CLAN_HALL_WAR_HAS_ENDED;
	
	@ClientString(id = 1824, message = "You have been registered for a clan hall war.  Please move to the left side of the clan hall's arena and get ready.")
	public static SystemMessageId YOU_HAVE_BEEN_REGISTERED_FOR_A_CLAN_HALL_WAR_PLEASE_MOVE_TO_THE_LEFT_SIDE_OF_THE_CLAN_HALL_S_ARENA_AND_GET_READY;
	
	@ClientString(id = 1825, message = "You have failed in your attempt to register for the clan hall war. Please try again.")
	public static SystemMessageId YOU_HAVE_FAILED_IN_YOUR_ATTEMPT_TO_REGISTER_FOR_THE_CLAN_HALL_WAR_PLEASE_TRY_AGAIN;
	
	@ClientString(id = 1826, message = "In $s1 minute(s), the game will begin. All players must hurry and move to the left side of the clan hall's arena.")
	public static SystemMessageId IN_S1_MINUTE_S_THE_GAME_WILL_BEGIN_ALL_PLAYERS_MUST_HURRY_AND_MOVE_TO_THE_LEFT_SIDE_OF_THE_CLAN_HALL_S_ARENA;
	
	@ClientString(id = 1827, message = "In $s1 minute(s), the game will begin. All players, please enter the arena now.")
	public static SystemMessageId IN_S1_MINUTE_S_THE_GAME_WILL_BEGIN_ALL_PLAYERS_PLEASE_ENTER_THE_ARENA_NOW;
	
	@ClientString(id = 1828, message = "In $s1 second(s), the game will begin.")
	public static SystemMessageId IN_S1_SECOND_S_THE_GAME_WILL_BEGIN;
	
	@ClientString(id = 1829, message = "The Command Channel is full.")
	public static SystemMessageId THE_COMMAND_CHANNEL_IS_FULL;
	
	@ClientString(id = 1830, message = "$c1 is not allowed to use the party room invite command. Please update the waiting list.")
	public static SystemMessageId C1_IS_NOT_ALLOWED_TO_USE_THE_PARTY_ROOM_INVITE_COMMAND_PLEASE_UPDATE_THE_WAITING_LIST;
	
	@ClientString(id = 1831, message = "$c1 does not meet the conditions of the party room. Please update the waiting list.")
	public static SystemMessageId C1_DOES_NOT_MEET_THE_CONDITIONS_OF_THE_PARTY_ROOM_PLEASE_UPDATE_THE_WAITING_LIST;
	
	@ClientString(id = 1832, message = "Only a room leader may invite others to a party room.")
	public static SystemMessageId ONLY_A_ROOM_LEADER_MAY_INVITE_OTHERS_TO_A_PARTY_ROOM;
	
	@ClientString(id = 1833, message = "All of $s1 will be dropped. Would you like to continue?")
	public static SystemMessageId ALL_OF_S1_WILL_BE_DROPPED_WOULD_YOU_LIKE_TO_CONTINUE;
	
	@ClientString(id = 1834, message = "The party room is full. No more characters can be invited in.")
	public static SystemMessageId THE_PARTY_ROOM_IS_FULL_NO_MORE_CHARACTERS_CAN_BE_INVITED_IN;
	
	@ClientString(id = 1835, message = "$s1 is full and cannot accept additional clan members at this time.")
	public static SystemMessageId S1_IS_FULL_AND_CANNOT_ACCEPT_ADDITIONAL_CLAN_MEMBERS_AT_THIS_TIME;
	
	@ClientString(id = 1836, message = "You cannot join a Clan Academy because you have successfully completed your 3rd class transfer.")
	public static SystemMessageId YOU_CANNOT_JOIN_A_CLAN_ACADEMY_BECAUSE_YOU_HAVE_SUCCESSFULLY_COMPLETED_YOUR_3RD_CLASS_TRANSFER;
	
	@ClientString(id = 1837, message = "$c1 has sent you an invitation to join the $s3 Royal Guard under the $s2 clan. Would you like to join?")
	public static SystemMessageId C1_HAS_SENT_YOU_AN_INVITATION_TO_JOIN_THE_S3_ROYAL_GUARD_UNDER_THE_S2_CLAN_WOULD_YOU_LIKE_TO_JOIN;
	
	@ClientString(id = 1838, message = "1. The coupon can be used once per character.")
	public static SystemMessageId THE_COUPON_CAN_BE_USED_ONCE_PER_CHARACTER;
	
	@ClientString(id = 1839, message = "2. A used serial number may not be used again.")
	public static SystemMessageId A_USED_SERIAL_NUMBER_MAY_NOT_BE_USED_AGAIN;
	
	@ClientString(id = 1840, message = "3. If you enter the incorrect serial number more than 5 times,n   you may use it again after a certain amount of time passes.")
	public static SystemMessageId IF_YOU_ENTER_THE_INCORRECT_SERIAL_NUMBER_MORE_THAN_5_TIMES_N_YOU_MAY_USE_IT_AGAIN_AFTER_A_CERTAIN_AMOUNT_OF_TIME_PASSES;
	
	@ClientString(id = 1841, message = "This clan hall war has been cancelled.  Not enough clans have registered.")
	public static SystemMessageId THIS_CLAN_HALL_WAR_HAS_BEEN_CANCELLED_NOT_ENOUGH_CLANS_HAVE_REGISTERED;
	
	@ClientString(id = 1842, message = "$c1 wishes to summon you from $s2. Do you accept?")
	public static SystemMessageId C1_WISHES_TO_SUMMON_YOU_FROM_S2_DO_YOU_ACCEPT;
	
	@ClientString(id = 1843, message = "$c1 is engaged in combat and cannot be summoned or teleported.")
	public static SystemMessageId C1_IS_ENGAGED_IN_COMBAT_AND_CANNOT_BE_SUMMONED_OR_TELEPORTED;
	
	@ClientString(id = 1844, message = "$c1 is dead at the moment and cannot be summoned or teleported.")
	public static SystemMessageId C1_IS_DEAD_AT_THE_MOMENT_AND_CANNOT_BE_SUMMONED_OR_TELEPORTED;
	
	@ClientString(id = 1845, message = "Hero weapons cannot be destroyed.")
	public static SystemMessageId HERO_WEAPONS_CANNOT_BE_DESTROYED;
	
	@ClientString(id = 1846, message = "You are too far away from your mount to ride.")
	public static SystemMessageId YOU_ARE_TOO_FAR_AWAY_FROM_YOUR_MOUNT_TO_RIDE;
	
	@ClientString(id = 1847, message = "You caught a fish $s1 in length.")
	public static SystemMessageId YOU_CAUGHT_A_FISH_S1_IN_LENGTH;
	
	@ClientString(id = 1848, message = "Because of the size of fish caught, you will be registered in the ranking.")
	public static SystemMessageId BECAUSE_OF_THE_SIZE_OF_FISH_CAUGHT_YOU_WILL_BE_REGISTERED_IN_THE_RANKING;
	
	@ClientString(id = 1849, message = "All of $s1 will be discarded. Would you like to continue?")
	public static SystemMessageId ALL_OF_S1_WILL_BE_DISCARDED_WOULD_YOU_LIKE_TO_CONTINUE;
	
	@ClientString(id = 1850, message = "The Captain of the Order of Knights cannot be appointed.")
	public static SystemMessageId THE_CAPTAIN_OF_THE_ORDER_OF_KNIGHTS_CANNOT_BE_APPOINTED;
	
	@ClientString(id = 1851, message = "The Royal Guard Captain cannot be appointed.")
	public static SystemMessageId THE_ROYAL_GUARD_CAPTAIN_CANNOT_BE_APPOINTED;
	
	@ClientString(id = 1852, message = "The attempt to acquire the skill has failed because of an insufficient Clan Reputation.")
	public static SystemMessageId THE_ATTEMPT_TO_ACQUIRE_THE_SKILL_HAS_FAILED_BECAUSE_OF_AN_INSUFFICIENT_CLAN_REPUTATION;
	
	@ClientString(id = 1853, message = "Quantity items of the same type cannot be exchanged at the same time.")
	public static SystemMessageId QUANTITY_ITEMS_OF_THE_SAME_TYPE_CANNOT_BE_EXCHANGED_AT_THE_SAME_TIME;
	
	@ClientString(id = 1854, message = "The item was converted successfully.")
	public static SystemMessageId THE_ITEM_WAS_CONVERTED_SUCCESSFULLY;
	
	@ClientString(id = 1855, message = "Another military unit is already using that name. Please enter a different name.")
	public static SystemMessageId ANOTHER_MILITARY_UNIT_IS_ALREADY_USING_THAT_NAME_PLEASE_ENTER_A_DIFFERENT_NAME;
	
	@ClientString(id = 1856, message = "Since your opponent is now the owner of $s1, the Olympiad has been cancelled.")
	public static SystemMessageId SINCE_YOUR_OPPONENT_IS_NOW_THE_OWNER_OF_S1_THE_OLYMPIAD_HAS_BEEN_CANCELLED;
	
	@ClientString(id = 1857, message = "$c1 is the owner of $s2 and cannot participate in the Olympiad.")
	public static SystemMessageId C1_IS_THE_OWNER_OF_S2_AND_CANNOT_PARTICIPATE_IN_THE_OLYMPIAD;
	
	@ClientString(id = 1858, message = "$c1 is currently dead and cannot participate in the Olympiad.")
	public static SystemMessageId C1_IS_CURRENTLY_DEAD_AND_CANNOT_PARTICIPATE_IN_THE_OLYMPIAD;
	
	@ClientString(id = 1859, message = "You have exceeded the quantity that can be moved at one time.")
	public static SystemMessageId YOU_HAVE_EXCEEDED_THE_QUANTITY_THAT_CAN_BE_MOVED_AT_ONE_TIME;
	
	@ClientString(id = 1860, message = "The Clan Reputation is too low.")
	public static SystemMessageId THE_CLAN_REPUTATION_IS_TOO_LOW;
	
	@ClientString(id = 1861, message = "The Clan Mark has been deleted.")
	public static SystemMessageId THE_CLAN_MARK_HAS_BEEN_DELETED;
	
	@ClientString(id = 1862, message = "Clan skills will now be activated since the Clan Reputation is 1 or higher.")
	public static SystemMessageId CLAN_SKILLS_WILL_NOW_BE_ACTIVATED_SINCE_THE_CLAN_REPUTATION_IS_1_OR_HIGHER;
	
	@ClientString(id = 1863, message = "$c1 purchased a clan item, reducing the Clan Reputation by $s2 points.")
	public static SystemMessageId C1_PURCHASED_A_CLAN_ITEM_REDUCING_THE_CLAN_REPUTATION_BY_S2_POINTS;
	
	@ClientString(id = 1864, message = "Your pet/servitor is unresponsive and will not obey any orders.")
	public static SystemMessageId YOUR_PET_SERVITOR_IS_UNRESPONSIVE_AND_WILL_NOT_OBEY_ANY_ORDERS;
	
	@ClientString(id = 1865, message = "Your pet/servitor is currently in a state of distress.")
	public static SystemMessageId YOUR_PET_SERVITOR_IS_CURRENTLY_IN_A_STATE_OF_DISTRESS;
	
	@ClientString(id = 1866, message = "MP was reduced by $s1.")
	public static SystemMessageId MP_WAS_REDUCED_BY_S1;
	
	@ClientString(id = 1867, message = "Your opponent's MP was reduced by $s1.")
	public static SystemMessageId YOUR_OPPONENT_S_MP_WAS_REDUCED_BY_S1;
	
	@ClientString(id = 1868, message = "You cannot exchange an item while it is being used.")
	public static SystemMessageId YOU_CANNOT_EXCHANGE_AN_ITEM_WHILE_IT_IS_BEING_USED;
	
	@ClientString(id = 1869, message = "$c1 has granted the Command Channel's master party the privilege of item looting.")
	public static SystemMessageId C1_HAS_GRANTED_THE_COMMAND_CHANNEL_S_MASTER_PARTY_THE_PRIVILEGE_OF_ITEM_LOOTING;
	
	@ClientString(id = 1870, message = "A Command Channel with looting rights already exists.")
	public static SystemMessageId A_COMMAND_CHANNEL_WITH_LOOTING_RIGHTS_ALREADY_EXISTS;
	
	@ClientString(id = 1871, message = "Do you want to dismiss $c1 from the clan?")
	public static SystemMessageId DO_YOU_WANT_TO_DISMISS_C1_FROM_THE_CLAN;
	
	@ClientString(id = 1872, message = "You have $s1 hour(s) and $s2 minute(s) left.")
	public static SystemMessageId YOU_HAVE_S1_HOUR_S_AND_S2_MINUTE_S_LEFT;
	
	@ClientString(id = 1873, message = "There are $s1 hour(s) and $s2 minute(s) left in the fixed use time for this PC Caf￩.")
	public static SystemMessageId THERE_ARE_S1_HOUR_S_AND_S2_MINUTE_S_LEFT_IN_THE_FIXED_USE_TIME_FOR_THIS_PC_CAF;
	
	@ClientString(id = 1874, message = "There are $s1 minute(s) left for this individual user.")
	public static SystemMessageId THERE_ARE_S1_MINUTE_S_LEFT_FOR_THIS_INDIVIDUAL_USER;
	
	@ClientString(id = 1875, message = "There are $s1 minute(s) left in the fixed use time for this PC Caf￩.")
	public static SystemMessageId THERE_ARE_S1_MINUTE_S_LEFT_IN_THE_FIXED_USE_TIME_FOR_THIS_PC_CAF;
	
	@ClientString(id = 1876, message = "Do you want to leave $s1 clan?")
	public static SystemMessageId DO_YOU_WANT_TO_LEAVE_S1_CLAN;
	
	@ClientString(id = 1877, message = "The game will end in $s1 minute(s).")
	public static SystemMessageId THE_GAME_WILL_END_IN_S1_MINUTE_S;
	
	@ClientString(id = 1878, message = "The game will end in $s1 second(s).")
	public static SystemMessageId THE_GAME_WILL_END_IN_S1_SECOND_S;
	
	@ClientString(id = 1879, message = "In $s1 minute(s), you will be teleported outside of the game arena.")
	public static SystemMessageId IN_S1_MINUTE_S_YOU_WILL_BE_TELEPORTED_OUTSIDE_OF_THE_GAME_ARENA;
	
	@ClientString(id = 1880, message = "In $s1 second(s), you will be teleported outside of the game arena.")
	public static SystemMessageId IN_S1_SECOND_S_YOU_WILL_BE_TELEPORTED_OUTSIDE_OF_THE_GAME_ARENA;
	
	@ClientString(id = 1881, message = "The preliminary match will begin in $s1 second(s). Prepare yourself.")
	public static SystemMessageId THE_PRELIMINARY_MATCH_WILL_BEGIN_IN_S1_SECOND_S_PREPARE_YOURSELF;
	
	@ClientString(id = 1882, message = "Characters cannot be created from this server.")
	public static SystemMessageId CHARACTERS_CANNOT_BE_CREATED_FROM_THIS_SERVER;
	
	@ClientString(id = 1883, message = "There are no offerings I own or I made a bid for.")
	public static SystemMessageId THERE_ARE_NO_OFFERINGS_I_OWN_OR_I_MADE_A_BID_FOR;
	
	@ClientString(id = 1884, message = "Enter the PC Room coupon serial number:")
	public static SystemMessageId ENTER_THE_PC_ROOM_COUPON_SERIAL_NUMBER;
	
	@ClientString(id = 1885, message = "This serial number cannot be entered. Please try again in $s1 minute(s).")
	public static SystemMessageId THIS_SERIAL_NUMBER_CANNOT_BE_ENTERED_PLEASE_TRY_AGAIN_IN_S1_MINUTE_S;
	
	@ClientString(id = 1886, message = "This serial number has already been used.")
	public static SystemMessageId THIS_SERIAL_NUMBER_HAS_ALREADY_BEEN_USED;
	
	@ClientString(id = 1887, message = "Invalid serial number.  Your attempt to enter the number has failed $s1 time(s). You will be allowed to make $s2 more attempt(s).")
	public static SystemMessageId INVALID_SERIAL_NUMBER_YOUR_ATTEMPT_TO_ENTER_THE_NUMBER_HAS_FAILED_S1_TIME_S_YOU_WILL_BE_ALLOWED_TO_MAKE_S2_MORE_ATTEMPT_S;
	
	@ClientString(id = 1888, message = "Invalid serial number. Your attempt to enter the number has failed 5 times. Please try again in 4 hours.")
	public static SystemMessageId INVALID_SERIAL_NUMBER_YOUR_ATTEMPT_TO_ENTER_THE_NUMBER_HAS_FAILED_5_TIMES_PLEASE_TRY_AGAIN_IN_4_HOURS;
	
	@ClientString(id = 1889, message = "Congratulations! You have received $s1.")
	public static SystemMessageId CONGRATULATIONS_YOU_HAVE_RECEIVED_S1;
	
	@ClientString(id = 1890, message = "Since you have already used this coupon, you may not use this serial number.")
	public static SystemMessageId SINCE_YOU_HAVE_ALREADY_USED_THIS_COUPON_YOU_MAY_NOT_USE_THIS_SERIAL_NUMBER;
	
	@ClientString(id = 1891, message = "You may not use items in a private store or private workshop.")
	public static SystemMessageId YOU_MAY_NOT_USE_ITEMS_IN_A_PRIVATE_STORE_OR_PRIVATE_WORKSHOP;
	
	@ClientString(id = 1892, message = "The replay file for the previous version cannot be played.")
	public static SystemMessageId THE_REPLAY_FILE_FOR_THE_PREVIOUS_VERSION_CANNOT_BE_PLAYED;
	
	@ClientString(id = 1893, message = "This file cannot be replayed.")
	public static SystemMessageId THIS_FILE_CANNOT_BE_REPLAYED;
	
	@ClientString(id = 1894, message = "A subclass cannot be created or changed while you are over your weight limit.")
	public static SystemMessageId A_SUBCLASS_CANNOT_BE_CREATED_OR_CHANGED_WHILE_YOU_ARE_OVER_YOUR_WEIGHT_LIMIT;
	
	@ClientString(id = 1895, message = "$c1 is in an area which blocks summoning or teleporting.")
	public static SystemMessageId C1_IS_IN_AN_AREA_WHICH_BLOCKS_SUMMONING_OR_TELEPORTING;
	
	@ClientString(id = 1896, message = "$c1 has already been summoned.")
	public static SystemMessageId C1_HAS_ALREADY_BEEN_SUMMONED;
	
	@ClientString(id = 1897, message = "$s1 is required for summoning.")
	public static SystemMessageId S1_IS_REQUIRED_FOR_SUMMONING;
	
	@ClientString(id = 1898, message = "$c1 is currently trading or operating a private store and cannot be summoned or teleported.")
	public static SystemMessageId C1_IS_CURRENTLY_TRADING_OR_OPERATING_A_PRIVATE_STORE_AND_CANNOT_BE_SUMMONED_OR_TELEPORTED;
	
	@ClientString(id = 1899, message = "You cannot use summoning or teleporting in this area.")
	public static SystemMessageId YOU_CANNOT_USE_SUMMONING_OR_TELEPORTING_IN_THIS_AREA;
	
	@ClientString(id = 1900, message = "$c1 has entered the party room.")
	public static SystemMessageId C1_HAS_ENTERED_THE_PARTY_ROOM;
	
	@ClientString(id = 1901, message = "$s1 has sent an invitation to room ($s2).")
	public static SystemMessageId S1_HAS_SENT_AN_INVITATION_TO_ROOM_S2;
	
	@ClientString(id = 1902, message = "Incompatible item grade.  This item cannot be used.")
	public static SystemMessageId INCOMPATIBLE_ITEM_GRADE_THIS_ITEM_CANNOT_BE_USED;
	
	@ClientString(id = 1903, message = "To request an NC OTP service,nrun the cell phone NC OTP service,nand enter the displayed NC OTP number within 1 minute.nIf you did not make the request,nleave this part blank,nand press the login button.")
	public static SystemMessageId TO_REQUEST_AN_NC_OTP_SERVICE_NRUN_THE_CELL_PHONE_NC_OTP_SERVICE_NAND_ENTER_THE_DISPLAYED_NC_OTP_NUMBER_WITHIN_1_MINUTE_NIF_YOU_DID_NOT_MAKE_THE_REQUEST_NLEAVE_THIS_PART_BLANK_NAND_PRESS_THE_LOGIN_BUTTON;
	
	@ClientString(id = 1904, message = "A subclass may not be created or changed while a servitor or pet is summoned.")
	public static SystemMessageId A_SUBCLASS_MAY_NOT_BE_CREATED_OR_CHANGED_WHILE_A_SERVITOR_OR_PET_IS_SUMMONED;
	
	@ClientString(id = 1905, message = "$s2 from $s1 will be replaced with $c4 from $s3.")
	public static SystemMessageId S2_FROM_S1_WILL_BE_REPLACED_WITH_C4_FROM_S3;
	
	@ClientString(id = 1906, message = "Select the combat unit to transfer to.")
	public static SystemMessageId SELECT_THE_COMBAT_UNIT_TO_TRANSFER_TO;
	
	@ClientString(id = 1907, message = "Select the  character who willn replace the current character.")
	public static SystemMessageId SELECT_THE_CHARACTER_WHO_WILL_N_REPLACE_THE_CURRENT_CHARACTER;
	
	@ClientString(id = 1908, message = "$c1 is in an area which blocks summoning or teleporting.")
	public static SystemMessageId C1_IS_IN_AN_AREA_WHICH_BLOCKS_SUMMONING_OR_TELEPORTING2;
	
	@ClientString(id = 1909, message = "==( List of Clan Academy Graduates During the Past Week )==")
	public static SystemMessageId LIST_OF_CLAN_ACADEMY_GRADUATES_DURING_THE_PAST_WEEK;
	
	@ClientString(id = 1910, message = "Graduates: $c1.")
	public static SystemMessageId GRADUATES_C1;
	
	@ClientString(id = 1911, message = "A user participating in the Olympiad cannot use summoning or teleporting.")
	public static SystemMessageId A_USER_PARTICIPATING_IN_THE_OLYMPIAD_CANNOT_USE_SUMMONING_OR_TELEPORTING;
	
	@ClientString(id = 1912, message = "NC OTP service requester only entry")
	public static SystemMessageId NC_OTP_SERVICE_REQUESTER_ONLY_ENTRY;
	
	@ClientString(id = 1913, message = "The remaining recycle time for $s1 is $s2 minute(s).")
	public static SystemMessageId THE_REMAINING_RECYCLE_TIME_FOR_S1_IS_S2_MINUTE_S;
	
	@ClientString(id = 1914, message = "The remaining recycle time for $s1 is $s2 second(s).")
	public static SystemMessageId THE_REMAINING_RECYCLE_TIME_FOR_S1_IS_S2_SECOND_S;
	
	@ClientString(id = 1915, message = "The game will end in $s1 second(s).")
	public static SystemMessageId THE_GAME_WILL_END_IN_S1_SECOND_S2;
	
	@ClientString(id = 1916, message = "You've been afflicted by Shilen's Breath level $s1.")
	public static SystemMessageId YOU_VE_BEEN_AFFLICTED_BY_SHILEN_S_BREATH_LEVEL_S1;
	
	@ClientString(id = 1917, message = "Shilen's Breath has been purified.")
	public static SystemMessageId SHILEN_S_BREATH_HAS_BEEN_PURIFIED;
	
	@ClientString(id = 1918, message = "Your pet is too high level to control.")
	public static SystemMessageId YOUR_PET_IS_TOO_HIGH_LEVEL_TO_CONTROL;
	
	@ClientString(id = 1919, message = "The Olympiad registration period has ended.")
	public static SystemMessageId THE_OLYMPIAD_REGISTRATION_PERIOD_HAS_ENDED;
	
	@ClientString(id = 1920, message = "Your account is currently inactive because you have not logged into the game for some time. You may reactivate your account by visit Lineage II's Support Website (https://support.lineage2.com).")
	public static SystemMessageId YOUR_ACCOUNT_IS_CURRENTLY_INACTIVE_BECAUSE_YOU_HAVE_NOT_LOGGED_INTO_THE_GAME_FOR_SOME_TIME_YOU_MAY_REACTIVATE_YOUR_ACCOUNT_BY_VISIT_LINEAGE_II_S_SUPPORT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM;
	
	@ClientString(id = 1921, message = "$s2 hour(s) and $s3 minute(s) have passed since $s1 has killed.")
	public static SystemMessageId S2_HOUR_S_AND_S3_MINUTE_S_HAVE_PASSED_SINCE_S1_HAS_KILLED;
	
	@ClientString(id = 1922, message = "Because $s1 failed to kill for one full day, it has expired.")
	public static SystemMessageId BECAUSE_S1_FAILED_TO_KILL_FOR_ONE_FULL_DAY_IT_HAS_EXPIRED;
	
	@ClientString(id = 1923, message = "Court Wizard: The portal has been created!")
	public static SystemMessageId COURT_WIZARD_THE_PORTAL_HAS_BEEN_CREATED;
	
	@ClientString(id = 1924, message = "Current Location: $s1 / $s2 / $s3 (near the Primeval Isle)")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3_NEAR_THE_PRIMEVAL_ISLE;
	
	@ClientString(id = 1925, message = "Due to the affects of the Seal of Strife, it is not possible to summon at this time.")
	public static SystemMessageId DUE_TO_THE_AFFECTS_OF_THE_SEAL_OF_STRIFE_IT_IS_NOT_POSSIBLE_TO_SUMMON_AT_THIS_TIME;
	
	@ClientString(id = 1926, message = "There is no opponent to receive your challenge for a duel.")
	public static SystemMessageId THERE_IS_NO_OPPONENT_TO_RECEIVE_YOUR_CHALLENGE_FOR_A_DUEL;
	
	@ClientString(id = 1927, message = "$c1 has been challenged to a duel.")
	public static SystemMessageId C1_HAS_BEEN_CHALLENGED_TO_A_DUEL;
	
	@ClientString(id = 1928, message = "$c1's party has been challenged to a duel.")
	public static SystemMessageId C1_S_PARTY_HAS_BEEN_CHALLENGED_TO_A_DUEL;
	
	@ClientString(id = 1929, message = "$c1 has accepted your challenge to a duel. The duel will begin in a few moments.")
	public static SystemMessageId C1_HAS_ACCEPTED_YOUR_CHALLENGE_TO_A_DUEL_THE_DUEL_WILL_BEGIN_IN_A_FEW_MOMENTS;
	
	@ClientString(id = 1930, message = "You have accepted $c1's challenge a duel. The duel will begin in a few moments.")
	public static SystemMessageId YOU_HAVE_ACCEPTED_C1_S_CHALLENGE_A_DUEL_THE_DUEL_WILL_BEGIN_IN_A_FEW_MOMENTS;
	
	@ClientString(id = 1931, message = "$c1 has declined your challenge to a duel.")
	public static SystemMessageId C1_HAS_DECLINED_YOUR_CHALLENGE_TO_A_DUEL;
	
	@ClientString(id = 1932, message = "$c1 has declined your challenge to a duel.")
	public static SystemMessageId C1_HAS_DECLINED_YOUR_CHALLENGE_TO_A_DUEL2;
	
	@ClientString(id = 1933, message = "You have accepted $c1's challenge to a party duel. The duel will begin in a few moments.")
	public static SystemMessageId YOU_HAVE_ACCEPTED_C1_S_CHALLENGE_TO_A_PARTY_DUEL_THE_DUEL_WILL_BEGIN_IN_A_FEW_MOMENTS;
	
	@ClientString(id = 1934, message = "$s1 has accepted your challenge to duel against their party. The duel will begin in a few moments.")
	public static SystemMessageId S1_HAS_ACCEPTED_YOUR_CHALLENGE_TO_DUEL_AGAINST_THEIR_PARTY_THE_DUEL_WILL_BEGIN_IN_A_FEW_MOMENTS;
	
	@ClientString(id = 1935, message = "$c1 has declined your challenge to a party duel.")
	public static SystemMessageId C1_HAS_DECLINED_YOUR_CHALLENGE_TO_A_PARTY_DUEL;
	
	@ClientString(id = 1936, message = "The opposing party has declined your challenge to a duel.")
	public static SystemMessageId THE_OPPOSING_PARTY_HAS_DECLINED_YOUR_CHALLENGE_TO_A_DUEL;
	
	@ClientString(id = 1937, message = "Since the person you challenged is not currently in a party, they cannot duel against your party.")
	public static SystemMessageId SINCE_THE_PERSON_YOU_CHALLENGED_IS_NOT_CURRENTLY_IN_A_PARTY_THEY_CANNOT_DUEL_AGAINST_YOUR_PARTY;
	
	@ClientString(id = 1938, message = "$c1 has challenged you to a duel.")
	public static SystemMessageId C1_HAS_CHALLENGED_YOU_TO_A_DUEL;
	
	@ClientString(id = 1939, message = "$c1's party has challenged your party to a duel.")
	public static SystemMessageId C1_S_PARTY_HAS_CHALLENGED_YOUR_PARTY_TO_A_DUEL;
	
	@ClientString(id = 1940, message = "You are unable to request a duel at this time.")
	public static SystemMessageId YOU_ARE_UNABLE_TO_REQUEST_A_DUEL_AT_THIS_TIME;
	
	@ClientString(id = 1941, message = "This is not a suitable place to challenge anyone or party to a duel.")
	public static SystemMessageId THIS_IS_NOT_A_SUITABLE_PLACE_TO_CHALLENGE_ANYONE_OR_PARTY_TO_A_DUEL;
	
	@ClientString(id = 1942, message = "The opposing party is currently unable to accept a challenge to a duel.")
	public static SystemMessageId THE_OPPOSING_PARTY_IS_CURRENTLY_UNABLE_TO_ACCEPT_A_CHALLENGE_TO_A_DUEL;
	
	@ClientString(id = 1943, message = "The opposing party is currently not in a suitable location for a duel.")
	public static SystemMessageId THE_OPPOSING_PARTY_IS_CURRENTLY_NOT_IN_A_SUITABLE_LOCATION_FOR_A_DUEL;
	
	@ClientString(id = 1944, message = "In a moment, you will be transported to the site where the duel will take place.")
	public static SystemMessageId IN_A_MOMENT_YOU_WILL_BE_TRANSPORTED_TO_THE_SITE_WHERE_THE_DUEL_WILL_TAKE_PLACE;
	
	@ClientString(id = 1945, message = "The duel will begin in $s1 second(s).")
	public static SystemMessageId THE_DUEL_WILL_BEGIN_IN_S1_SECOND_S;
	
	@ClientString(id = 1946, message = "$c1 has challenged you to a duel. Will you accept?")
	public static SystemMessageId C1_HAS_CHALLENGED_YOU_TO_A_DUEL_WILL_YOU_ACCEPT;
	
	@ClientString(id = 1947, message = "$c1's party has challenged your party to a duel. Will you accept?")
	public static SystemMessageId C1_S_PARTY_HAS_CHALLENGED_YOUR_PARTY_TO_A_DUEL_WILL_YOU_ACCEPT;
	
	@ClientString(id = 1948, message = "The duel will begin in $s1 second(s).")
	public static SystemMessageId THE_DUEL_WILL_BEGIN_IN_S1_SECOND_S2;
	
	@ClientString(id = 1949, message = "Let the duel begin!")
	public static SystemMessageId LET_THE_DUEL_BEGIN;
	
	@ClientString(id = 1950, message = "$c1 has won the duel.")
	public static SystemMessageId C1_HAS_WON_THE_DUEL;
	
	@ClientString(id = 1951, message = "$c1's party has won the duel.")
	public static SystemMessageId C1_S_PARTY_HAS_WON_THE_DUEL;
	
	@ClientString(id = 1952, message = "The duel has ended in a tie.")
	public static SystemMessageId THE_DUEL_HAS_ENDED_IN_A_TIE;
	
	@ClientString(id = 1953, message = "Since $c1 was disqualified, $s2 has won.")
	public static SystemMessageId SINCE_C1_WAS_DISQUALIFIED_S2_HAS_WON;
	
	@ClientString(id = 1954, message = "Since $c1's party was disqualified, $s2's party has won.")
	public static SystemMessageId SINCE_C1_S_PARTY_WAS_DISQUALIFIED_S2_S_PARTY_HAS_WON;
	
	@ClientString(id = 1955, message = "Since $c1 withdrew from the duel, $s2 has won.")
	public static SystemMessageId SINCE_C1_WITHDREW_FROM_THE_DUEL_S2_HAS_WON;
	
	@ClientString(id = 1956, message = "Since $c1's party withdrew from the duel, $s2's party has won.")
	public static SystemMessageId SINCE_C1_S_PARTY_WITHDREW_FROM_THE_DUEL_S2_S_PARTY_HAS_WON;
	
	@ClientString(id = 1957, message = "Select the item to be augmented.")
	public static SystemMessageId SELECT_THE_ITEM_TO_BE_AUGMENTED;
	
	@ClientString(id = 1958, message = "Select the catalyst for augmentation.")
	public static SystemMessageId SELECT_THE_CATALYST_FOR_AUGMENTATION;
	
	@ClientString(id = 1959, message = "Requires $s2 $s1.")
	public static SystemMessageId REQUIRES_S2_S1;
	
	@ClientString(id = 1960, message = "This is not a suitable item.")
	public static SystemMessageId THIS_IS_NOT_A_SUITABLE_ITEM;
	
	@ClientString(id = 1961, message = "Gemstone quantity is incorrect.")
	public static SystemMessageId GEMSTONE_QUANTITY_IS_INCORRECT;
	
	@ClientString(id = 1962, message = "Augmenting successful!")
	public static SystemMessageId AUGMENTING_SUCCESSFUL;
	
	@ClientString(id = 1963, message = "Select the item from which you wish to remove augmentation.")
	public static SystemMessageId SELECT_THE_ITEM_FROM_WHICH_YOU_WISH_TO_REMOVE_AUGMENTATION;
	
	@ClientString(id = 1964, message = "Augmentation removal can only be done on an augmented item.")
	public static SystemMessageId AUGMENTATION_REMOVAL_CAN_ONLY_BE_DONE_ON_AN_AUGMENTED_ITEM;
	
	@ClientString(id = 1965, message = "Augmentation has been successfully removed from your $s1.")
	public static SystemMessageId AUGMENTATION_HAS_BEEN_SUCCESSFULLY_REMOVED_FROM_YOUR_S1;
	
	@ClientString(id = 1966, message = "Only the clan leader may issue commands.")
	public static SystemMessageId ONLY_THE_CLAN_LEADER_MAY_ISSUE_COMMANDS;
	
	@ClientString(id = 1967, message = "The gate is firmly locked. Please try again later.")
	public static SystemMessageId THE_GATE_IS_FIRMLY_LOCKED_PLEASE_TRY_AGAIN_LATER;
	
	@ClientString(id = 1968, message = "$s1's owner.")
	public static SystemMessageId S1_S_OWNER;
	
	@ClientString(id = 1969, message = "Area where $s1 appears.")
	public static SystemMessageId AREA_WHERE_S1_APPEARS;
	
	@ClientString(id = 1970, message = "Once an item is augmented, it cannot be augmented again.")
	public static SystemMessageId ONCE_AN_ITEM_IS_AUGMENTED_IT_CANNOT_BE_AUGMENTED_AGAIN;
	
	@ClientString(id = 1971, message = "The level of the hardener is too high to be used.")
	public static SystemMessageId THE_LEVEL_OF_THE_HARDENER_IS_TOO_HIGH_TO_BE_USED;
	
	@ClientString(id = 1972, message = "You cannot augment items while a private store or private workshop is in operation.")
	public static SystemMessageId YOU_CANNOT_AUGMENT_ITEMS_WHILE_A_PRIVATE_STORE_OR_PRIVATE_WORKSHOP_IS_IN_OPERATION;
	
	@ClientString(id = 1973, message = "You cannot augment items while frozen.")
	public static SystemMessageId YOU_CANNOT_AUGMENT_ITEMS_WHILE_FROZEN;
	
	@ClientString(id = 1974, message = "You cannot augment items while dead.")
	public static SystemMessageId YOU_CANNOT_AUGMENT_ITEMS_WHILE_DEAD;
	
	@ClientString(id = 1975, message = "You cannot augment items while engaged in trade activities.")
	public static SystemMessageId YOU_CANNOT_AUGMENT_ITEMS_WHILE_ENGAGED_IN_TRADE_ACTIVITIES;
	
	@ClientString(id = 1976, message = "You cannot augment items while paralyzed.")
	public static SystemMessageId YOU_CANNOT_AUGMENT_ITEMS_WHILE_PARALYZED;
	
	@ClientString(id = 1977, message = "You cannot augment items while fishing.")
	public static SystemMessageId YOU_CANNOT_AUGMENT_ITEMS_WHILE_FISHING;
	
	@ClientString(id = 1978, message = "You cannot augment items while sitting down.")
	public static SystemMessageId YOU_CANNOT_AUGMENT_ITEMS_WHILE_SITTING_DOWN;
	
	@ClientString(id = 1979, message = "$s1's remaining Mana is now 10.")
	public static SystemMessageId S1_S_REMAINING_MANA_IS_NOW_10;
	
	@ClientString(id = 1980, message = "$s1's remaining Mana is now 5.")
	public static SystemMessageId S1_S_REMAINING_MANA_IS_NOW_5;
	
	@ClientString(id = 1981, message = "$s1's remaining Mana is now 1. It will disappear soon.")
	public static SystemMessageId S1_S_REMAINING_MANA_IS_NOW_1_IT_WILL_DISAPPEAR_SOON;
	
	@ClientString(id = 1982, message = "$s1's remaining Mana is now 0, and the item has disappeared.")
	public static SystemMessageId S1_S_REMAINING_MANA_IS_NOW_0_AND_THE_ITEM_HAS_DISAPPEARED;
	
	@ClientString(id = 1983, message = "$s1")
	public static SystemMessageId S12;
	
	@ClientString(id = 1984, message = "Press the Augment button to begin.")
	public static SystemMessageId PRESS_THE_AUGMENT_BUTTON_TO_BEGIN;
	
	@ClientString(id = 1985, message = "$s1's drop area ($s2)")
	public static SystemMessageId S1_S_DROP_AREA_S2;
	
	@ClientString(id = 1986, message = "$s1's owner ($s2)")
	public static SystemMessageId S1_S_OWNER_S2;
	
	@ClientString(id = 1987, message = "$s1")
	public static SystemMessageId S13;
	
	@ClientString(id = 1988, message = "The ferry has arrived at Primeval Isle.")
	public static SystemMessageId THE_FERRY_HAS_ARRIVED_AT_PRIMEVAL_ISLE;
	
	@ClientString(id = 1989, message = "The ferry will leave for Rune Harbor after anchoring for three minutes.")
	public static SystemMessageId THE_FERRY_WILL_LEAVE_FOR_RUNE_HARBOR_AFTER_ANCHORING_FOR_THREE_MINUTES;
	
	@ClientString(id = 1990, message = "The ferry is now departing Primeval Isle for Rune Harbor.")
	public static SystemMessageId THE_FERRY_IS_NOW_DEPARTING_PRIMEVAL_ISLE_FOR_RUNE_HARBOR;
	
	@ClientString(id = 1991, message = "The ferry will leave for Primeval Isle after anchoring for three minutes.")
	public static SystemMessageId THE_FERRY_WILL_LEAVE_FOR_PRIMEVAL_ISLE_AFTER_ANCHORING_FOR_THREE_MINUTES;
	
	@ClientString(id = 1992, message = "The ferry is now departing Rune Harbor for Primeval Isle.")
	public static SystemMessageId THE_FERRY_IS_NOW_DEPARTING_RUNE_HARBOR_FOR_PRIMEVAL_ISLE;
	
	@ClientString(id = 1993, message = "The ferry from Primeval Isle to Rune Harbor has been delayed.")
	public static SystemMessageId THE_FERRY_FROM_PRIMEVAL_ISLE_TO_RUNE_HARBOR_HAS_BEEN_DELAYED;
	
	@ClientString(id = 1994, message = "The ferry from Rune Harbor to Primeval Isle has been delayed.")
	public static SystemMessageId THE_FERRY_FROM_RUNE_HARBOR_TO_PRIMEVAL_ISLE_HAS_BEEN_DELAYED;
	
	@ClientString(id = 1995, message = "$s1 channel filtering option")
	public static SystemMessageId S1_CHANNEL_FILTERING_OPTION;
	
	@ClientString(id = 1996, message = "The attack has been blocked.")
	public static SystemMessageId THE_ATTACK_HAS_BEEN_BLOCKED;
	
	@ClientString(id = 1997, message = "$c1 is performing a counterattack.")
	public static SystemMessageId C1_IS_PERFORMING_A_COUNTERATTACK;
	
	@ClientString(id = 1998, message = "You countered $c1's attack.")
	public static SystemMessageId YOU_COUNTERED_C1_S_ATTACK;
	
	@ClientString(id = 1999, message = "$c1 dodged the attack.")
	public static SystemMessageId C1_DODGED_THE_ATTACK;
	
	@ClientString(id = 2000, message = "You have dodged $c1's attack.")
	public static SystemMessageId YOU_HAVE_DODGED_C1_S_ATTACK;
	
	@ClientString(id = 2001, message = "Augmentation failed due to inappropriate conditions.")
	public static SystemMessageId AUGMENTATION_FAILED_DUE_TO_INAPPROPRIATE_CONDITIONS;
	
	@ClientString(id = 2002, message = "Trap failed.")
	public static SystemMessageId TRAP_FAILED;
	
	@ClientString(id = 2003, message = "You obtained an ordinary material.")
	public static SystemMessageId YOU_OBTAINED_AN_ORDINARY_MATERIAL;
	
	@ClientString(id = 2004, message = "You obtained a rare material.")
	public static SystemMessageId YOU_OBTAINED_A_RARE_MATERIAL;
	
	@ClientString(id = 2005, message = "You obtained a unique material.")
	public static SystemMessageId YOU_OBTAINED_A_UNIQUE_MATERIAL;
	
	@ClientString(id = 2006, message = "You obtained the only material of this kind.")
	public static SystemMessageId YOU_OBTAINED_THE_ONLY_MATERIAL_OF_THIS_KIND;
	
	@ClientString(id = 2007, message = "Please enter the recipient's name.")
	public static SystemMessageId PLEASE_ENTER_THE_RECIPIENT_S_NAME;
	
	@ClientString(id = 2008, message = "Please enter the text.")
	public static SystemMessageId PLEASE_ENTER_THE_TEXT;
	
	@ClientString(id = 2009, message = "You cannot exceed 1500 characters.")
	public static SystemMessageId YOU_CANNOT_EXCEED_1500_CHARACTERS;
	
	@ClientString(id = 2010, message = "$s2 $s1")
	public static SystemMessageId S2_S1;
	
	@ClientString(id = 2011, message = "The augmented item cannot be discarded.")
	public static SystemMessageId THE_AUGMENTED_ITEM_CANNOT_BE_DISCARDED;
	
	@ClientString(id = 2012, message = "$s1 has been activated.")
	public static SystemMessageId S1_HAS_BEEN_ACTIVATED;
	
	@ClientString(id = 2013, message = "Your seed or remaining purchase amount is inadequate.")
	public static SystemMessageId YOUR_SEED_OR_REMAINING_PURCHASE_AMOUNT_IS_INADEQUATE;
	
	@ClientString(id = 2014, message = "You cannot proceed because the manor cannot accept any more crops.  All crops have been returned and no Adena withdrawn.")
	public static SystemMessageId YOU_CANNOT_PROCEED_BECAUSE_THE_MANOR_CANNOT_ACCEPT_ANY_MORE_CROPS_ALL_CROPS_HAVE_BEEN_RETURNED_AND_NO_ADENA_WITHDRAWN;
	
	@ClientString(id = 2015, message = "A skill is ready to be used again.")
	public static SystemMessageId A_SKILL_IS_READY_TO_BE_USED_AGAIN;
	
	@ClientString(id = 2016, message = "A skill is ready to be used again but its re-use counter time has increased.")
	public static SystemMessageId A_SKILL_IS_READY_TO_BE_USED_AGAIN_BUT_ITS_RE_USE_COUNTER_TIME_HAS_INCREASED;
	
	@ClientString(id = 2017, message = "$c1 cannot duel because $c1 is currently engaged in a private store or manufacture.")
	public static SystemMessageId C1_CANNOT_DUEL_BECAUSE_C1_IS_CURRENTLY_ENGAGED_IN_A_PRIVATE_STORE_OR_MANUFACTURE;
	
	@ClientString(id = 2018, message = "$c1 cannot duel because $c1 is currently fishing.")
	public static SystemMessageId C1_CANNOT_DUEL_BECAUSE_C1_IS_CURRENTLY_FISHING;
	
	@ClientString(id = 2019, message = "$c1 cannot duel because $c1's HP or MP is below 50%.")
	public static SystemMessageId C1_CANNOT_DUEL_BECAUSE_C1_S_HP_OR_MP_IS_BELOW_50;
	
	@ClientString(id = 2020, message = "$c1 cannot make a challenge to a duel because $c1 is currently in a duel-prohibited area (Peaceful Zone / Battle Zone / Near Water / Restart Prohibited Area).")
	public static SystemMessageId C1_CANNOT_MAKE_A_CHALLENGE_TO_A_DUEL_BECAUSE_C1_IS_CURRENTLY_IN_A_DUEL_PROHIBITED_AREA_PEACEFUL_ZONE_BATTLE_ZONE_NEAR_WATER_RESTART_PROHIBITED_AREA;
	
	@ClientString(id = 2021, message = "$c1 cannot duel because $c1 is currently engaged in battle.")
	public static SystemMessageId C1_CANNOT_DUEL_BECAUSE_C1_IS_CURRENTLY_ENGAGED_IN_BATTLE;
	
	@ClientString(id = 2022, message = "$c1 cannot duel because $c1 is already engaged in a duel.")
	public static SystemMessageId C1_CANNOT_DUEL_BECAUSE_C1_IS_ALREADY_ENGAGED_IN_A_DUEL;
	
	@ClientString(id = 2023, message = "$c1 cannot duel because $c1 is in a chaotic or purple state.")
	public static SystemMessageId C1_CANNOT_DUEL_BECAUSE_C1_IS_IN_A_CHAOTIC_OR_PURPLE_STATE;
	
	@ClientString(id = 2024, message = "$c1 cannot duel because $c1 is participating in the Olympiad or the Ceremony of Chaos.")
	public static SystemMessageId C1_CANNOT_DUEL_BECAUSE_C1_IS_PARTICIPATING_IN_THE_OLYMPIAD_OR_THE_CEREMONY_OF_CHAOS;
	
	@ClientString(id = 2025, message = "$c1 cannot duel because $c1 is participating in a clan hall war.")
	public static SystemMessageId C1_CANNOT_DUEL_BECAUSE_C1_IS_PARTICIPATING_IN_A_CLAN_HALL_WAR;
	
	@ClientString(id = 2026, message = "$c1 cannot duel because $c1 is participating in a siege war.")
	public static SystemMessageId C1_CANNOT_DUEL_BECAUSE_C1_IS_PARTICIPATING_IN_A_SIEGE_WAR;
	
	@ClientString(id = 2027, message = "$c1 cannot duel because $c1 is currently riding a boat, fenrir, or strider.")
	public static SystemMessageId C1_CANNOT_DUEL_BECAUSE_C1_IS_CURRENTLY_RIDING_A_BOAT_FENRIR_OR_STRIDER;
	
	@ClientString(id = 2028, message = "$c1 is too far away to receive a duel challenge.")
	public static SystemMessageId C1_IS_TOO_FAR_AWAY_TO_RECEIVE_A_DUEL_CHALLENGE;
	
	@ClientString(id = 2029, message = "$c1 is currently teleporting and cannot participate in the Olympiad.")
	public static SystemMessageId C1_IS_CURRENTLY_TELEPORTING_AND_CANNOT_PARTICIPATE_IN_THE_OLYMPIAD;
	
	@ClientString(id = 2030, message = "Logging in…")
	public static SystemMessageId LOGGING_IN;
	
	@ClientString(id = 2031, message = "Please wait a moment.")
	public static SystemMessageId PLEASE_WAIT_A_MOMENT;
	
	@ClientString(id = 2032, message = "It is not the right time for purchasing the item.")
	public static SystemMessageId IT_IS_NOT_THE_RIGHT_TIME_FOR_PURCHASING_THE_ITEM;
	
	@ClientString(id = 2033, message = "A subclass cannot be created or changed because you have exceeded your inventory limit.")
	public static SystemMessageId A_SUBCLASS_CANNOT_BE_CREATED_OR_CHANGED_BECAUSE_YOU_HAVE_EXCEEDED_YOUR_INVENTORY_LIMIT;
	
	@ClientString(id = 2034, message = "There are $s1 hour(s) and $s2 minute(s) remaining until the item can be purchased again.")
	public static SystemMessageId THERE_ARE_S1_HOUR_S_AND_S2_MINUTE_S_REMAINING_UNTIL_THE_ITEM_CAN_BE_PURCHASED_AGAIN;
	
	@ClientString(id = 2035, message = "There are $s1 minute(s) remaining until the item can be purchased again.")
	public static SystemMessageId THERE_ARE_S1_MINUTE_S_REMAINING_UNTIL_THE_ITEM_CAN_BE_PURCHASED_AGAIN;
	
	@ClientString(id = 2036, message = "Unable to invite because the party is locked.")
	public static SystemMessageId UNABLE_TO_INVITE_BECAUSE_THE_PARTY_IS_LOCKED;
	
	@ClientString(id = 2037, message = "Unable to create character. You are unable to create a new character on the selected server. A restriction is in place which restricts users from creating characters on different servers where no previous character exists. Please choose another server.")
	public static SystemMessageId UNABLE_TO_CREATE_CHARACTER_YOU_ARE_UNABLE_TO_CREATE_A_NEW_CHARACTER_ON_THE_SELECTED_SERVER_A_RESTRICTION_IS_IN_PLACE_WHICH_RESTRICTS_USERS_FROM_CREATING_CHARACTERS_ON_DIFFERENT_SERVERS_WHERE_NO_PREVIOUS_CHARACTER_EXISTS_PLEASE_CHOOSE_ANOTHER_SERVER;
	
	@ClientString(id = 2038, message = "Some Lineage II features have been limited for free trials. Trial accounts aren't allowed to drop items and/or Adena.  To unlock all of the features of Lineage II, purchase the full version today.")
	public static SystemMessageId SOME_LINEAGE_II_FEATURES_HAVE_BEEN_LIMITED_FOR_FREE_TRIALS_TRIAL_ACCOUNTS_AREN_T_ALLOWED_TO_DROP_ITEMS_AND_OR_ADENA_TO_UNLOCK_ALL_OF_THE_FEATURES_OF_LINEAGE_II_PURCHASE_THE_FULL_VERSION_TODAY;
	
	@ClientString(id = 2039, message = "Some Lineage II features have been limited for free trials. Trial accounts aren't allowed to trade items and/or Adena.  To unlock all of the features of Lineage II, purchase the full version today.")
	public static SystemMessageId SOME_LINEAGE_II_FEATURES_HAVE_BEEN_LIMITED_FOR_FREE_TRIALS_TRIAL_ACCOUNTS_AREN_T_ALLOWED_TO_TRADE_ITEMS_AND_OR_ADENA_TO_UNLOCK_ALL_OF_THE_FEATURES_OF_LINEAGE_II_PURCHASE_THE_FULL_VERSION_TODAY;
	
	@ClientString(id = 2040, message = "Cannot trade items with the targeted user.")
	public static SystemMessageId CANNOT_TRADE_ITEMS_WITH_THE_TARGETED_USER;
	
	@ClientString(id = 2041, message = "Some Lineage II features have been limited for free trials. Trial accounts aren't allowed to setup private stores. To unlock all of the features of Lineage II, purchase the full version today.")
	public static SystemMessageId SOME_LINEAGE_II_FEATURES_HAVE_BEEN_LIMITED_FOR_FREE_TRIALS_TRIAL_ACCOUNTS_AREN_T_ALLOWED_TO_SETUP_PRIVATE_STORES_TO_UNLOCK_ALL_OF_THE_FEATURES_OF_LINEAGE_II_PURCHASE_THE_FULL_VERSION_TODAY;
	
	@ClientString(id = 2042, message = "This account has been suspended for non-payment based on the cell phone payment agreement.nPlease go to http://us.ncsoft.com/en/.")
	public static SystemMessageId THIS_ACCOUNT_HAS_BEEN_SUSPENDED_FOR_NON_PAYMENT_BASED_ON_THE_CELL_PHONE_PAYMENT_AGREEMENT_NPLEASE_GO_TO_HTTP_US_NCSOFT_COM_EN;
	
	@ClientString(id = 2043, message = "You have exceeded your inventory volume limit and may not take this quest item. Please make room in your inventory and try again.")
	public static SystemMessageId YOU_HAVE_EXCEEDED_YOUR_INVENTORY_VOLUME_LIMIT_AND_MAY_NOT_TAKE_THIS_QUEST_ITEM_PLEASE_MAKE_ROOM_IN_YOUR_INVENTORY_AND_TRY_AGAIN;
	
	@ClientString(id = 2044, message = "Some Lineage II features have been limited for free trials.ﾠTrial accounts aren't allowed to set up private workshops. To unlock all of the features of Lineage II, purchase the full version today.")
	public static SystemMessageId SOME_LINEAGE_II_FEATURES_HAVE_BEEN_LIMITED_FOR_FREE_TRIALS_TRIAL_ACCOUNTS_AREN_T_ALLOWED_TO_SET_UP_PRIVATE_WORKSHOPS_TO_UNLOCK_ALL_OF_THE_FEATURES_OF_LINEAGE_II_PURCHASE_THE_FULL_VERSION_TODAY;
	
	@ClientString(id = 2045, message = "Some Lineage II features have been limited for free trials.ﾠTrial accounts aren't allowed to use private workshops.ﾠTo unlock all of the features of Lineage II, purchase the full version today.")
	public static SystemMessageId SOME_LINEAGE_II_FEATURES_HAVE_BEEN_LIMITED_FOR_FREE_TRIALS_TRIAL_ACCOUNTS_AREN_T_ALLOWED_TO_USE_PRIVATE_WORKSHOPS_TO_UNLOCK_ALL_OF_THE_FEATURES_OF_LINEAGE_II_PURCHASE_THE_FULL_VERSION_TODAY;
	
	@ClientString(id = 2046, message = "Some Lineage II features have been limited for free trials.ﾠTrial accounts aren't allowed buy items from private stores.ﾠTo unlock all of the features of Lineage II, purchase the full version today.")
	public static SystemMessageId SOME_LINEAGE_II_FEATURES_HAVE_BEEN_LIMITED_FOR_FREE_TRIALS_TRIAL_ACCOUNTS_AREN_T_ALLOWED_BUY_ITEMS_FROM_PRIVATE_STORES_TO_UNLOCK_ALL_OF_THE_FEATURES_OF_LINEAGE_II_PURCHASE_THE_FULL_VERSION_TODAY;
	
	@ClientString(id = 2047, message = "Some Lineage II features have been limited for free trials. Trial accounts aren't allowed to access clan warehouses.ﾠTo unlock all of the features of Lineage II, purchase the full version today.")
	public static SystemMessageId SOME_LINEAGE_II_FEATURES_HAVE_BEEN_LIMITED_FOR_FREE_TRIALS_TRIAL_ACCOUNTS_AREN_T_ALLOWED_TO_ACCESS_CLAN_WAREHOUSES_TO_UNLOCK_ALL_OF_THE_FEATURES_OF_LINEAGE_II_PURCHASE_THE_FULL_VERSION_TODAY;
	
	@ClientString(id = 2048, message = "The shortcut in use conflicts with $s1. Do you wish to reset the conflicting shortcuts and use the saved shortcut?")
	public static SystemMessageId THE_SHORTCUT_IN_USE_CONFLICTS_WITH_S1_DO_YOU_WISH_TO_RESET_THE_CONFLICTING_SHORTCUTS_AND_USE_THE_SAVED_SHORTCUT;
	
	@ClientString(id = 2049, message = "The shortcut will be applied and saved in the server. Will you continue?")
	public static SystemMessageId THE_SHORTCUT_WILL_BE_APPLIED_AND_SAVED_IN_THE_SERVER_WILL_YOU_CONTINUE;
	
	@ClientString(id = 2050, message = "$s1 clan is trying to display a flag.")
	public static SystemMessageId S1_CLAN_IS_TRYING_TO_DISPLAY_A_FLAG;
	
	@ClientString(id = 2051, message = "You must accept the User Agreement before this account can access Lineage II.n Please try again after accepting the agreement on Lineage II's Support Website (https://support.lineage2.com).")
	public static SystemMessageId YOU_MUST_ACCEPT_THE_USER_AGREEMENT_BEFORE_THIS_ACCOUNT_CAN_ACCESS_LINEAGE_II_N_PLEASE_TRY_AGAIN_AFTER_ACCEPTING_THE_AGREEMENT_ON_LINEAGE_II_S_SUPPORT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM;
	
	@ClientString(id = 2052, message = "A guardian's consent is required before this account can be used to play Lineage II.nPlease try again after this consent is provided.")
	public static SystemMessageId A_GUARDIAN_S_CONSENT_IS_REQUIRED_BEFORE_THIS_ACCOUNT_CAN_BE_USED_TO_PLAY_LINEAGE_II_NPLEASE_TRY_AGAIN_AFTER_THIS_CONSENT_IS_PROVIDED;
	
	@ClientString(id = 2053, message = "This account has declined the User Agreement or is pending a withdrawal request. nPlease try again after cancelling this request.")
	public static SystemMessageId THIS_ACCOUNT_HAS_DECLINED_THE_USER_AGREEMENT_OR_IS_PENDING_A_WITHDRAWAL_REQUEST_NPLEASE_TRY_AGAIN_AFTER_CANCELLING_THIS_REQUEST;
	
	@ClientString(id = 2054, message = "This account has been suspended. nFor more information, please go to https://support.lineage2.com.")
	public static SystemMessageId THIS_ACCOUNT_HAS_BEEN_SUSPENDED_NFOR_MORE_INFORMATION_PLEASE_GO_TO_HTTPS_SUPPORT_LINEAGE2_COM;
	
	@ClientString(id = 2055, message = "Your account has been suspended from all game services.nFor more information, please visit Lineage II's Support Website (https://support.lineage2.com).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_SUSPENDED_FROM_ALL_GAME_SERVICES_NFOR_MORE_INFORMATION_PLEASE_VISIT_LINEAGE_II_S_SUPPORT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM;
	
	@ClientString(id = 2056, message = "Your account has been converted to an integrated account, and is unable to be accessed. nPlease logon with the converted integrated account.")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_CONVERTED_TO_AN_INTEGRATED_ACCOUNT_AND_IS_UNABLE_TO_BE_ACCESSED_NPLEASE_LOGON_WITH_THE_CONVERTED_INTEGRATED_ACCOUNT;
	
	@ClientString(id = 2057, message = "You have blocked $c1.")
	public static SystemMessageId YOU_HAVE_BLOCKED_C1;
	
	@ClientString(id = 2058, message = "You already polymorphed and cannot polymorph again.")
	public static SystemMessageId YOU_ALREADY_POLYMORPHED_AND_CANNOT_POLYMORPH_AGAIN;
	
	@ClientString(id = 2059, message = "The nearby area is too narrow for you to polymorph. Please move to another area and try to polymorph again.")
	public static SystemMessageId THE_NEARBY_AREA_IS_TOO_NARROW_FOR_YOU_TO_POLYMORPH_PLEASE_MOVE_TO_ANOTHER_AREA_AND_TRY_TO_POLYMORPH_AGAIN;
	
	@ClientString(id = 2060, message = "You cannot polymorph into the desired form in water.")
	public static SystemMessageId YOU_CANNOT_POLYMORPH_INTO_THE_DESIRED_FORM_IN_WATER;
	
	@ClientString(id = 2061, message = "You are still under Transformation Penalty and cannot be polymorphed.")
	public static SystemMessageId YOU_ARE_STILL_UNDER_TRANSFORMATION_PENALTY_AND_CANNOT_BE_POLYMORPHED;
	
	@ClientString(id = 2062, message = "You cannot polymorph when you have summoned a servitor/pet.")
	public static SystemMessageId YOU_CANNOT_POLYMORPH_WHEN_YOU_HAVE_SUMMONED_A_SERVITOR_PET;
	
	@ClientString(id = 2063, message = "You cannot transform while riding a pet.")
	public static SystemMessageId YOU_CANNOT_TRANSFORM_WHILE_RIDING_A_PET;
	
	@ClientString(id = 2064, message = "You cannot polymorph while under the effect of a special skill.")
	public static SystemMessageId YOU_CANNOT_POLYMORPH_WHILE_UNDER_THE_EFFECT_OF_A_SPECIAL_SKILL;
	
	@ClientString(id = 2065, message = "That item cannot be taken off.")
	public static SystemMessageId THAT_ITEM_CANNOT_BE_TAKEN_OFF;
	
	@ClientString(id = 2066, message = "That weapon cannot perform any attacks.")
	public static SystemMessageId THAT_WEAPON_CANNOT_PERFORM_ANY_ATTACKS;
	
	@ClientString(id = 2067, message = "That weapon cannot use any other skill except the weapon's skill.")
	public static SystemMessageId THAT_WEAPON_CANNOT_USE_ANY_OTHER_SKILL_EXCEPT_THE_WEAPON_S_SKILL;
	
	@ClientString(id = 2068, message = "You do not have all of the items needed to untrain the enchant skill.")
	public static SystemMessageId YOU_DO_NOT_HAVE_ALL_OF_THE_ITEMS_NEEDED_TO_UNTRAIN_THE_ENCHANT_SKILL;
	
	@ClientString(id = 2069, message = "Untrain of enchant skill was successful. Current level of enchant skill $s1 has been decreased by 1.")
	public static SystemMessageId UNTRAIN_OF_ENCHANT_SKILL_WAS_SUCCESSFUL_CURRENT_LEVEL_OF_ENCHANT_SKILL_S1_HAS_BEEN_DECREASED_BY_1;
	
	@ClientString(id = 2070, message = "Untrain of enchant skill was successful. Current level of enchant skill $s1 became 0 and enchant skill will be initialized.")
	public static SystemMessageId UNTRAIN_OF_ENCHANT_SKILL_WAS_SUCCESSFUL_CURRENT_LEVEL_OF_ENCHANT_SKILL_S1_BECAME_0_AND_ENCHANT_SKILL_WILL_BE_INITIALIZED;
	
	@ClientString(id = 2071, message = "You do not have all of the items needed to enchant skill route change.")
	public static SystemMessageId YOU_DO_NOT_HAVE_ALL_OF_THE_ITEMS_NEEDED_TO_ENCHANT_SKILL_ROUTE_CHANGE;
	
	@ClientString(id = 2072, message = "Enchant skill route change was successful. Lv of enchant skill $s1 has been decreased by $s2.")
	public static SystemMessageId ENCHANT_SKILL_ROUTE_CHANGE_WAS_SUCCESSFUL_LV_OF_ENCHANT_SKILL_S1_HAS_BEEN_DECREASED_BY_S2;
	
	@ClientString(id = 2073, message = "Enchant skill route change was successful. Lv of enchant skill $s1 will remain.")
	public static SystemMessageId ENCHANT_SKILL_ROUTE_CHANGE_WAS_SUCCESSFUL_LV_OF_ENCHANT_SKILL_S1_WILL_REMAIN;
	
	@ClientString(id = 2074, message = "Skill enchant failed. Current level of enchant skill $s1 will remain unchanged.")
	public static SystemMessageId SKILL_ENCHANT_FAILED_CURRENT_LEVEL_OF_ENCHANT_SKILL_S1_WILL_REMAIN_UNCHANGED;
	
	@ClientString(id = 2075, message = "It is not an auction period.")
	public static SystemMessageId IT_IS_NOT_AN_AUCTION_PERIOD;
	
	@ClientString(id = 2076, message = "Bidding is not allowed because the maximum bidding price exceeds 100 billion.")
	public static SystemMessageId BIDDING_IS_NOT_ALLOWED_BECAUSE_THE_MAXIMUM_BIDDING_PRICE_EXCEEDS_100_BILLION;
	
	@ClientString(id = 2077, message = "Your bid must be higher than the current highest bid.")
	public static SystemMessageId YOUR_BID_MUST_BE_HIGHER_THAN_THE_CURRENT_HIGHEST_BID;
	
	@ClientString(id = 2078, message = "You do not have enough Adena for this bid.")
	public static SystemMessageId YOU_DO_NOT_HAVE_ENOUGH_ADENA_FOR_THIS_BID;
	
	@ClientString(id = 2079, message = "You currently have the highest bid, but the reserve has not been met.")
	public static SystemMessageId YOU_CURRENTLY_HAVE_THE_HIGHEST_BID_BUT_THE_RESERVE_HAS_NOT_BEEN_MET;
	
	@ClientString(id = 2080, message = "You have been outbid.")
	public static SystemMessageId YOU_HAVE_BEEN_OUTBID;
	
	@ClientString(id = 2081, message = "There are no funds presently due to you.")
	public static SystemMessageId THERE_ARE_NO_FUNDS_PRESENTLY_DUE_TO_YOU;
	
	@ClientString(id = 2082, message = "You have exceeded the total amount of Adena allowed in inventory.")
	public static SystemMessageId YOU_HAVE_EXCEEDED_THE_TOTAL_AMOUNT_OF_ADENA_ALLOWED_IN_INVENTORY;
	
	@ClientString(id = 2083, message = "The auction has begun.")
	public static SystemMessageId THE_AUCTION_HAS_BEGUN;
	
	@ClientString(id = 2084, message = "Enemy Blood Pledges have intruded into the fortress.")
	public static SystemMessageId ENEMY_BLOOD_PLEDGES_HAVE_INTRUDED_INTO_THE_FORTRESS;
	
	@ClientString(id = 2085, message = "Shout and trade chatting cannot be used while possessing a cursed weapon.")
	public static SystemMessageId SHOUT_AND_TRADE_CHATTING_CANNOT_BE_USED_WHILE_POSSESSING_A_CURSED_WEAPON;
	
	@ClientString(id = 2086, message = "Search on user $c2 for third-party program use will be completed in $s1 minute(s).")
	public static SystemMessageId SEARCH_ON_USER_C2_FOR_THIRD_PARTY_PROGRAM_USE_WILL_BE_COMPLETED_IN_S1_MINUTE_S;
	
	@ClientString(id = 2087, message = "A fortress is under attack!")
	public static SystemMessageId A_FORTRESS_IS_UNDER_ATTACK;
	
	@ClientString(id = 2088, message = "$s1 minute(s) until the fortress battle starts.")
	public static SystemMessageId S1_MINUTE_S_UNTIL_THE_FORTRESS_BATTLE_STARTS;
	
	@ClientString(id = 2089, message = "$s1 second(s) until the fortress battle starts.")
	public static SystemMessageId S1_SECOND_S_UNTIL_THE_FORTRESS_BATTLE_STARTS;
	
	@ClientString(id = 2090, message = "The fortress battle $s1 has begun.")
	public static SystemMessageId THE_FORTRESS_BATTLE_S1_HAS_BEGUN;
	
	@ClientString(id = 2091, message = "Your account can only be used after changing your password and secret question. n Services will be available after changing your password and secret question from Lineage II's Support Website (https://support.lineage2.com).")
	public static SystemMessageId YOUR_ACCOUNT_CAN_ONLY_BE_USED_AFTER_CHANGING_YOUR_PASSWORD_AND_SECRET_QUESTION_N_SERVICES_WILL_BE_AVAILABLE_AFTER_CHANGING_YOUR_PASSWORD_AND_SECRET_QUESTION_FROM_LINEAGE_II_S_SUPPORT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM;
	
	@ClientString(id = 2092, message = "You cannot bid due to a passed-in price.")
	public static SystemMessageId YOU_CANNOT_BID_DUE_TO_A_PASSED_IN_PRICE;
	
	@ClientString(id = 2093, message = "The bid amount was $s1 Adena. Would you like to retrieve the bid amount?")
	public static SystemMessageId THE_BID_AMOUNT_WAS_S1_ADENA_WOULD_YOU_LIKE_TO_RETRIEVE_THE_BID_AMOUNT;
	
	@ClientString(id = 2094, message = "Another user is purchasing. Please try again later.")
	public static SystemMessageId ANOTHER_USER_IS_PURCHASING_PLEASE_TRY_AGAIN_LATER;
	
	@ClientString(id = 2095, message = "Some Lineage II features have been limited for free trials. Trial accounts have limited chatting capabilities. To unlock all of the features of Lineage II, purchase the full version today.")
	public static SystemMessageId SOME_LINEAGE_II_FEATURES_HAVE_BEEN_LIMITED_FOR_FREE_TRIALS_TRIAL_ACCOUNTS_HAVE_LIMITED_CHATTING_CAPABILITIES_TO_UNLOCK_ALL_OF_THE_FEATURES_OF_LINEAGE_II_PURCHASE_THE_FULL_VERSION_TODAY;
	
	@ClientString(id = 2096, message = "$c1 is in a location which cannot be entered, therefore it cannot be processed.")
	public static SystemMessageId C1_IS_IN_A_LOCATION_WHICH_CANNOT_BE_ENTERED_THEREFORE_IT_CANNOT_BE_PROCESSED;
	
	@ClientString(id = 2097, message = "$c1's level does not correspond to the requirements for entry.")
	public static SystemMessageId C1_S_LEVEL_DOES_NOT_CORRESPOND_TO_THE_REQUIREMENTS_FOR_ENTRY;
	
	@ClientString(id = 2098, message = "$c1's quest requirement is not sufficient and cannot be entered.")
	public static SystemMessageId C1_S_QUEST_REQUIREMENT_IS_NOT_SUFFICIENT_AND_CANNOT_BE_ENTERED;
	
	@ClientString(id = 2099, message = "$c1's item requirement is not sufficient and cannot be entered.")
	public static SystemMessageId C1_S_ITEM_REQUIREMENT_IS_NOT_SUFFICIENT_AND_CANNOT_BE_ENTERED;
	
	@ClientString(id = 2100, message = "$c1 may not re-enter yet.")
	public static SystemMessageId C1_MAY_NOT_RE_ENTER_YET;
	
	@ClientString(id = 2101, message = "You are not currently in a party, so you cannot enter.")
	public static SystemMessageId YOU_ARE_NOT_CURRENTLY_IN_A_PARTY_SO_YOU_CANNOT_ENTER;
	
	@ClientString(id = 2102, message = "You cannot enter due to the party having exceeded the limit.")
	public static SystemMessageId YOU_CANNOT_ENTER_DUE_TO_THE_PARTY_HAVING_EXCEEDED_THE_LIMIT;
	
	@ClientString(id = 2103, message = "You cannot enter because you are not associated with the current command channel.")
	public static SystemMessageId YOU_CANNOT_ENTER_BECAUSE_YOU_ARE_NOT_ASSOCIATED_WITH_THE_CURRENT_COMMAND_CHANNEL;
	
	@ClientString(id = 2104, message = "The maximum number of instant zones has been exceeded. You cannot enter.")
	public static SystemMessageId THE_MAXIMUM_NUMBER_OF_INSTANT_ZONES_HAS_BEEN_EXCEEDED_YOU_CANNOT_ENTER;
	
	@ClientString(id = 2105, message = "You have entered another instant zone, therefore you cannot enter corresponding dungeon.")
	public static SystemMessageId YOU_HAVE_ENTERED_ANOTHER_INSTANT_ZONE_THEREFORE_YOU_CANNOT_ENTER_CORRESPONDING_DUNGEON;
	
	@ClientString(id = 2106, message = "This dungeon will expire in $s1 minute(s). You will be forced out of the dungeon when the time expires.")
	public static SystemMessageId THIS_DUNGEON_WILL_EXPIRE_IN_S1_MINUTE_S_YOU_WILL_BE_FORCED_OUT_OF_THE_DUNGEON_WHEN_THE_TIME_EXPIRES;
	
	@ClientString(id = 2107, message = "This instant zone will be terminated in $s1 minute(s). You will be forced out of the dungeon when the time expires.")
	public static SystemMessageId THIS_INSTANT_ZONE_WILL_BE_TERMINATED_IN_S1_MINUTE_S_YOU_WILL_BE_FORCED_OUT_OF_THE_DUNGEON_WHEN_THE_TIME_EXPIRES;
	
	@ClientString(id = 2108, message = "Your account has been restricted due to your use of illegal programs. For more information, please visit the Support Center on the NCSOFT website (https://support.lineage2.com).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_DUE_TO_YOUR_USE_OF_ILLEGAL_PROGRAMS_FOR_MORE_INFORMATION_PLEASE_VISIT_THE_SUPPORT_CENTER_ON_THE_NCSOFT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM2;
	
	@ClientString(id = 2109, message = "During the server merge, your character name, $s1, conflicted with another. Your name may still be available. Please enter your desired name.")
	public static SystemMessageId DURING_THE_SERVER_MERGE_YOUR_CHARACTER_NAME_S1_CONFLICTED_WITH_ANOTHER_YOUR_NAME_MAY_STILL_BE_AVAILABLE_PLEASE_ENTER_YOUR_DESIRED_NAME;
	
	@ClientString(id = 2110, message = "This character name already exists or is an invalid name. Please enter a new name.")
	public static SystemMessageId THIS_CHARACTER_NAME_ALREADY_EXISTS_OR_IS_AN_INVALID_NAME_PLEASE_ENTER_A_NEW_NAME;
	
	@ClientString(id = 2111, message = "Enter a shortcut to assign.")
	public static SystemMessageId ENTER_A_SHORTCUT_TO_ASSIGN;
	
	@ClientString(id = 2112, message = "Sub-key can be CTRL, ALT, SHIFT and you may enter two sub-keys at a time. n Example) CTRL + ALT + A")
	public static SystemMessageId SUB_KEY_CAN_BE_CTRL_ALT_SHIFT_AND_YOU_MAY_ENTER_TWO_SUB_KEYS_AT_A_TIME_N_EXAMPLE_CTRL_ALT_A;
	
	@ClientString(id = 2113, message = "CTRL, ALT, SHIFT keys may be used as sub-key in expanded sub-key mode, and only ALT may be used as a sub-key in standard sub-key mode.")
	public static SystemMessageId CTRL_ALT_SHIFT_KEYS_MAY_BE_USED_AS_SUB_KEY_IN_EXPANDED_SUB_KEY_MODE_AND_ONLY_ALT_MAY_BE_USED_AS_A_SUB_KEY_IN_STANDARD_SUB_KEY_MODE;
	
	@ClientString(id = 2114, message = "Forced attack and stand-in-place attacks assigned previously to Ctrl and Shift will be changed to Alt + Q and Alt + E when set as expanded sub-key mode, and CTRL and SHIFT will be available to assign to another shortcut. Will you continue?")
	public static SystemMessageId FORCED_ATTACK_AND_STAND_IN_PLACE_ATTACKS_ASSIGNED_PREVIOUSLY_TO_CTRL_AND_SHIFT_WILL_BE_CHANGED_TO_ALT_Q_AND_ALT_E_WHEN_SET_AS_EXPANDED_SUB_KEY_MODE_AND_CTRL_AND_SHIFT_WILL_BE_AVAILABLE_TO_ASSIGN_TO_ANOTHER_SHORTCUT_WILL_YOU_CONTINUE;
	
	@ClientString(id = 2115, message = "Your account has been restricted due to your confirmed abuse of a bug pertaining to the NCoin. For more information, please visit http://us.ncsoft.com/en/.")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_DUE_TO_YOUR_CONFIRMED_ABUSE_OF_A_BUG_PERTAINING_TO_THE_NCOIN_FOR_MORE_INFORMATION_PLEASE_VISIT_HTTP_US_NCSOFT_COM_EN;
	
	@ClientString(id = 2116, message = "Your account has been restricted due to your confirmed abuse of free NCoin. For more information, please visit http://us.ncsoft.com/en/.")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_DUE_TO_YOUR_CONFIRMED_ABUSE_OF_FREE_NCOIN_FOR_MORE_INFORMATION_PLEASE_VISIT_HTTP_US_NCSOFT_COM_EN;
	
	@ClientString(id = 2117, message = "Your account has been temporarily denied all game services due to connections with account registration done by means of identity theft. If you have no connection to the issue, please go through the personal verification process.  For more information, please visit Lineage II's Support Website (https://support.lineage2.com).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_TEMPORARILY_DENIED_ALL_GAME_SERVICES_DUE_TO_CONNECTIONS_WITH_ACCOUNT_REGISTRATION_DONE_BY_MEANS_OF_IDENTITY_THEFT_IF_YOU_HAVE_NO_CONNECTION_TO_THE_ISSUE_PLEASE_GO_THROUGH_THE_PERSONAL_VERIFICATION_PROCESS_FOR_MORE_INFORMATION_PLEASE_VISIT_LINEAGE_II_S_SUPPORT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM;
	
	@ClientString(id = 2118, message = "Your account has been denied all game services due to transaction fraud. For more information, please visit Lineage II's Support Website (https://support.lineage2.com)t).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_DENIED_ALL_GAME_SERVICES_DUE_TO_TRANSACTION_FRAUD_FOR_MORE_INFORMATION_PLEASE_VISIT_LINEAGE_II_S_SUPPORT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM_T;
	
	@ClientString(id = 2119, message = "Your account has been denied all game services due to your confirmed account trade. nFor more information, please visit Lineage II's Support Website (https://support.lineage2.com).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_DENIED_ALL_GAME_SERVICES_DUE_TO_YOUR_CONFIRMED_ACCOUNT_TRADE_NFOR_MORE_INFORMATION_PLEASE_VISIT_LINEAGE_II_S_SUPPORT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM;
	
	@ClientString(id = 2120, message = "Your account has been restricted for a duration of 10 days due to your use of illegal programs. All game services are denied for the aforementioned period, and a repeated offense will result in a permanent ban. For more information, please visit Lineage II's Support Website (https://support.lineage2.com).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_FOR_A_DURATION_OF_10_DAYS_DUE_TO_YOUR_USE_OF_ILLEGAL_PROGRAMS_ALL_GAME_SERVICES_ARE_DENIED_FOR_THE_AFOREMENTIONED_PERIOD_AND_A_REPEATED_OFFENSE_WILL_RESULT_IN_A_PERMANENT_BAN_FOR_MORE_INFORMATION_PLEASE_VISIT_LINEAGE_II_S_SUPPORT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM;
	
	@ClientString(id = 2121, message = "Your account has been denied all game services due to your confirmed use of illegal programs. For more information, please visit Lineage II's Support Website (https://support.lineage2.com).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_DENIED_ALL_GAME_SERVICES_DUE_TO_YOUR_CONFIRMED_USE_OF_ILLEGAL_PROGRAMS_FOR_MORE_INFORMATION_PLEASE_VISIT_LINEAGE_II_S_SUPPORT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM;
	
	@ClientString(id = 2122, message = "Your account has been denied all game services due to your confirmed use of illegal programs. For more information, please visit Lineage II's Support Website (https://support.lineage2.com).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_DENIED_ALL_GAME_SERVICES_DUE_TO_YOUR_CONFIRMED_USE_OF_ILLEGAL_PROGRAMS_FOR_MORE_INFORMATION_PLEASE_VISIT_LINEAGE_II_S_SUPPORT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM2;
	
	@ClientString(id = 2123, message = "Your account has been denied all game service at your request. For more information, please visit Lineage II's Support Website (https://support.lineage2.com).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_DENIED_ALL_GAME_SERVICE_AT_YOUR_REQUEST_FOR_MORE_INFORMATION_PLEASE_VISIT_LINEAGE_II_S_SUPPORT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM;
	
	@ClientString(id = 2124, message = "During the server merge, your clan name, $s1, conflicted with another. Your clan name may still be available. Please enter your desired name.")
	public static SystemMessageId DURING_THE_SERVER_MERGE_YOUR_CLAN_NAME_S1_CONFLICTED_WITH_ANOTHER_YOUR_CLAN_NAME_MAY_STILL_BE_AVAILABLE_PLEASE_ENTER_YOUR_DESIRED_NAME;
	
	@ClientString(id = 2125, message = "The clan name already exists or is an invalid name. Please enter another clan name.")
	public static SystemMessageId THE_CLAN_NAME_ALREADY_EXISTS_OR_IS_AN_INVALID_NAME_PLEASE_ENTER_ANOTHER_CLAN_NAME;
	
	@ClientString(id = 2126, message = "Your account has been suspended for regularly posting illegal messages. For more information, please visit Lineage II's Support Website (https://support.lineage2.com).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_SUSPENDED_FOR_REGULARLY_POSTING_ILLEGAL_MESSAGES_FOR_MORE_INFORMATION_PLEASE_VISIT_LINEAGE_II_S_SUPPORT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM;
	
	@ClientString(id = 2127, message = "Your account has been suspended after being detected with an illegal message. For more information, please visit Lineage II's Support Website (https://support.lineage2.com).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_SUSPENDED_AFTER_BEING_DETECTED_WITH_AN_ILLEGAL_MESSAGE_FOR_MORE_INFORMATION_PLEASE_VISIT_LINEAGE_II_S_SUPPORT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM;
	
	@ClientString(id = 2128, message = "Your account has been suspended from all game services for using the game for commercial purposes. For more information, please visit Lineage II's Support Website (https://support.lineage2.com).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_SUSPENDED_FROM_ALL_GAME_SERVICES_FOR_USING_THE_GAME_FOR_COMMERCIAL_PURPOSES_FOR_MORE_INFORMATION_PLEASE_VISIT_LINEAGE_II_S_SUPPORT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM;
	
	@ClientString(id = 2129, message = "The augmented item cannot be converted. Please convert after the augmentation has been removed.")
	public static SystemMessageId THE_AUGMENTED_ITEM_CANNOT_BE_CONVERTED_PLEASE_CONVERT_AFTER_THE_AUGMENTATION_HAS_BEEN_REMOVED;
	
	@ClientString(id = 2130, message = "You cannot convert this item.")
	public static SystemMessageId YOU_CANNOT_CONVERT_THIS_ITEM;
	
	@ClientString(id = 2131, message = "You have bid the highest price and have won the item. The item can be found in your personal warehouse.")
	public static SystemMessageId YOU_HAVE_BID_THE_HIGHEST_PRICE_AND_HAVE_WON_THE_ITEM_THE_ITEM_CAN_BE_FOUND_IN_YOUR_PERSONAL_WAREHOUSE;
	
	@ClientString(id = 2132, message = "You have entered a regular sever.")
	public static SystemMessageId YOU_HAVE_ENTERED_A_REGULAR_SEVER;
	
	@ClientString(id = 2133, message = "You have entered an adults-only sever.")
	public static SystemMessageId YOU_HAVE_ENTERED_AN_ADULTS_ONLY_SEVER;
	
	@ClientString(id = 2134, message = "You have entered a server for juveniles.")
	public static SystemMessageId YOU_HAVE_ENTERED_A_SERVER_FOR_JUVENILES;
	
	@ClientString(id = 2135, message = "Because of your Fatigue level, this is not allowed.")
	public static SystemMessageId BECAUSE_OF_YOUR_FATIGUE_LEVEL_THIS_IS_NOT_ALLOWED;
	
	@ClientString(id = 2136, message = "A clan name change application has been submitted.")
	public static SystemMessageId A_CLAN_NAME_CHANGE_APPLICATION_HAS_BEEN_SUBMITTED;
	
	@ClientString(id = 2137, message = "You are about to bid $s1 item with $s2 Adena. Will you continue?")
	public static SystemMessageId YOU_ARE_ABOUT_TO_BID_S1_ITEM_WITH_S2_ADENA_WILL_YOU_CONTINUE;
	
	@ClientString(id = 2138, message = "Please enter a bid price.")
	public static SystemMessageId PLEASE_ENTER_A_BID_PRICE;
	
	@ClientString(id = 2139, message = "$c1's Pet.")
	public static SystemMessageId C1_S_PET;
	
	@ClientString(id = 2140, message = "$c1's Servitor.")
	public static SystemMessageId C1_S_SERVITOR;
	
	@ClientString(id = 2141, message = "You slightly resisted $c1's magic.")
	public static SystemMessageId YOU_SLIGHTLY_RESISTED_C1_S_MAGIC;
	
	@ClientString(id = 2142, message = "You cannot expel $c1 because $c1 is not a party member.")
	public static SystemMessageId YOU_CANNOT_EXPEL_C1_BECAUSE_C1_IS_NOT_A_PARTY_MEMBER;
	
	@ClientString(id = 2143, message = "You cannot add elemental power while operating a Private Store or Private Workshop.")
	public static SystemMessageId YOU_CANNOT_ADD_ELEMENTAL_POWER_WHILE_OPERATING_A_PRIVATE_STORE_OR_PRIVATE_WORKSHOP;
	
	@ClientString(id = 2144, message = "Please select item to add elemental power.")
	public static SystemMessageId PLEASE_SELECT_ITEM_TO_ADD_ELEMENTAL_POWER;
	
	@ClientString(id = 2145, message = "Attribute item usage has been cancelled.")
	public static SystemMessageId ATTRIBUTE_ITEM_USAGE_HAS_BEEN_CANCELLED;
	
	@ClientString(id = 2146, message = "Elemental power enhancer usage requirement is not sufficient.")
	public static SystemMessageId ELEMENTAL_POWER_ENHANCER_USAGE_REQUIREMENT_IS_NOT_SUFFICIENT;
	
	@ClientString(id = 2147, message = "$s2 elemental power has been added successfully to $s1.")
	public static SystemMessageId S2_ELEMENTAL_POWER_HAS_BEEN_ADDED_SUCCESSFULLY_TO_S1;
	
	@ClientString(id = 2148, message = "$s3 elemental power has been added successfully to +$s1 $s2.")
	public static SystemMessageId S3_ELEMENTAL_POWER_HAS_BEEN_ADDED_SUCCESSFULLY_TO_S1_S2;
	
	@ClientString(id = 2149, message = "You have failed to add elemental power.")
	public static SystemMessageId YOU_HAVE_FAILED_TO_ADD_ELEMENTAL_POWER;
	
	@ClientString(id = 2150, message = "Another elemental power has already been added. This elemental power cannot be added.")
	public static SystemMessageId ANOTHER_ELEMENTAL_POWER_HAS_ALREADY_BEEN_ADDED_THIS_ELEMENTAL_POWER_CANNOT_BE_ADDED;
	
	@ClientString(id = 2151, message = "Your opponent has Magic Resistance, the damage was decreased.")
	public static SystemMessageId YOUR_OPPONENT_HAS_MAGIC_RESISTANCE_THE_DAMAGE_WAS_DECREASED;
	
	@ClientString(id = 2152, message = "The assigned shortcut will be deleted and the initial shortcut setting restored. Will you continue?")
	public static SystemMessageId THE_ASSIGNED_SHORTCUT_WILL_BE_DELETED_AND_THE_INITIAL_SHORTCUT_SETTING_RESTORED_WILL_YOU_CONTINUE;
	
	@ClientString(id = 2153, message = "You are currently logged into 10 of your accounts and can no longer access your other accounts.")
	public static SystemMessageId YOU_ARE_CURRENTLY_LOGGED_INTO_10_OF_YOUR_ACCOUNTS_AND_CAN_NO_LONGER_ACCESS_YOUR_OTHER_ACCOUNTS;
	
	@ClientString(id = 2154, message = "The target is not a flagpole so a flag cannot be displayed.")
	public static SystemMessageId THE_TARGET_IS_NOT_A_FLAGPOLE_SO_A_FLAG_CANNOT_BE_DISPLAYED;
	
	@ClientString(id = 2155, message = "A flag is already being displayed, another flag cannot be displayed.")
	public static SystemMessageId A_FLAG_IS_ALREADY_BEING_DISPLAYED_ANOTHER_FLAG_CANNOT_BE_DISPLAYED;
	
	@ClientString(id = 2156, message = "There are not enough necessary items to use the skill.")
	public static SystemMessageId THERE_ARE_NOT_ENOUGH_NECESSARY_ITEMS_TO_USE_THE_SKILL;
	
	@ClientString(id = 2157, message = "Bid will be attempted with $s1 Adena.")
	public static SystemMessageId BID_WILL_BE_ATTEMPTED_WITH_S1_ADENA;
	
	@ClientString(id = 2158, message = "Force attack is impossible against a temporary allied member during a siege.")
	public static SystemMessageId FORCE_ATTACK_IS_IMPOSSIBLE_AGAINST_A_TEMPORARY_ALLIED_MEMBER_DURING_A_SIEGE;
	
	@ClientString(id = 2159, message = "Bidder exists, the auction time has been extended by 5 minutes.")
	public static SystemMessageId BIDDER_EXISTS_THE_AUCTION_TIME_HAS_BEEN_EXTENDED_BY_5_MINUTES;
	
	@ClientString(id = 2160, message = "Bidder exists, auction time has been extended by 3 minutes.")
	public static SystemMessageId BIDDER_EXISTS_AUCTION_TIME_HAS_BEEN_EXTENDED_BY_3_MINUTES;
	
	@ClientString(id = 2161, message = "There is no space to move to, so teleportation effect does not apply.")
	public static SystemMessageId THERE_IS_NO_SPACE_TO_MOVE_TO_SO_TELEPORTATION_EFFECT_DOES_NOT_APPLY;
	
	@ClientString(id = 2162, message = "Your soul count has increased by $s1. It is now at $s2.")
	public static SystemMessageId YOUR_SOUL_COUNT_HAS_INCREASED_BY_S1_IT_IS_NOW_AT_S2;
	
	@ClientString(id = 2163, message = "Soul cannot be increased anymore.")
	public static SystemMessageId SOUL_CANNOT_BE_INCREASED_ANYMORE;
	
	@ClientString(id = 2164, message = "The barracks have been seized.")
	public static SystemMessageId THE_BARRACKS_HAVE_BEEN_SEIZED;
	
	@ClientString(id = 2165, message = "The barracks function has been restored.")
	public static SystemMessageId THE_BARRACKS_FUNCTION_HAS_BEEN_RESTORED;
	
	@ClientString(id = 2166, message = "All barracks are occupied.")
	public static SystemMessageId ALL_BARRACKS_ARE_OCCUPIED;
	
	@ClientString(id = 2167, message = "A malicious skill cannot be used in a peace zone.")
	public static SystemMessageId A_MALICIOUS_SKILL_CANNOT_BE_USED_IN_A_PEACE_ZONE;
	
	@ClientString(id = 2168, message = "$c1 has acquired the flag.")
	public static SystemMessageId C1_HAS_ACQUIRED_THE_FLAG;
	
	@ClientString(id = 2169, message = "Your clan has been registered to $s1's fortress battle.")
	public static SystemMessageId YOUR_CLAN_HAS_BEEN_REGISTERED_TO_S1_S_FORTRESS_BATTLE;
	
	@ClientString(id = 2170, message = "A malicious skill cannot be used when an opponent is in the peace zone.")
	public static SystemMessageId A_MALICIOUS_SKILL_CANNOT_BE_USED_WHEN_AN_OPPONENT_IS_IN_THE_PEACE_ZONE;
	
	@ClientString(id = 2171, message = "This item cannot be crystallized.")
	public static SystemMessageId THIS_ITEM_CANNOT_BE_CRYSTALLIZED;
	
	@ClientString(id = 2172, message = "+$s1$s2's auction has ended.")
	public static SystemMessageId S1_S2_S_AUCTION_HAS_ENDED;
	
	@ClientString(id = 2173, message = "$s1's auction has ended.")
	public static SystemMessageId S1_S_AUCTION_HAS_ENDED;
	
	@ClientString(id = 2174, message = "$c1 cannot duel because $c1 is currently polymorphed.")
	public static SystemMessageId C1_CANNOT_DUEL_BECAUSE_C1_IS_CURRENTLY_POLYMORPHED;
	
	@ClientString(id = 2175, message = "Party duel cannot be initiated due to a polymorphed party member.")
	public static SystemMessageId PARTY_DUEL_CANNOT_BE_INITIATED_DUE_TO_A_POLYMORPHED_PARTY_MEMBER;
	
	@ClientString(id = 2176, message = "$s1's $s2 attribute has been removed.")
	public static SystemMessageId S1_S_S2_ATTRIBUTE_HAS_BEEN_REMOVED;
	
	@ClientString(id = 2177, message = "+$s1$s2's $s3 attribute has been removed.")
	public static SystemMessageId S1_S2_S_S3_ATTRIBUTE_HAS_BEEN_REMOVED;
	
	@ClientString(id = 2178, message = "Attribute removal has failed.")
	public static SystemMessageId ATTRIBUTE_REMOVAL_HAS_FAILED;
	
	@ClientString(id = 2179, message = "You have the highest bid submitted in a Giran Castle auction.")
	public static SystemMessageId YOU_HAVE_THE_HIGHEST_BID_SUBMITTED_IN_A_GIRAN_CASTLE_AUCTION;
	
	@ClientString(id = 2180, message = "You have the highest bid submitted in an Aden Castle auction.")
	public static SystemMessageId YOU_HAVE_THE_HIGHEST_BID_SUBMITTED_IN_AN_ADEN_CASTLE_AUCTION;
	
	@ClientString(id = 2181, message = "You have highest the bid submitted in a Rune Castle auction.")
	public static SystemMessageId YOU_HAVE_HIGHEST_THE_BID_SUBMITTED_IN_A_RUNE_CASTLE_AUCTION;
	
	@ClientString(id = 2182, message = "You cannot polymorph while riding a boat.")
	public static SystemMessageId YOU_CANNOT_POLYMORPH_WHILE_RIDING_A_BOAT;
	
	@ClientString(id = 2183, message = "The fortress battle of $s1 has finished.")
	public static SystemMessageId THE_FORTRESS_BATTLE_OF_S1_HAS_FINISHED;
	
	@ClientString(id = 2184, message = "$s1 is victorious in the fortress battle of $s2.")
	public static SystemMessageId S1_IS_VICTORIOUS_IN_THE_FORTRESS_BATTLE_OF_S2;
	
	@ClientString(id = 2185, message = "Only a party leader can make the request to enter.")
	public static SystemMessageId ONLY_A_PARTY_LEADER_CAN_MAKE_THE_REQUEST_TO_ENTER;
	
	@ClientString(id = 2186, message = "Soul cannot be absorbed anymore.")
	public static SystemMessageId SOUL_CANNOT_BE_ABSORBED_ANYMORE;
	
	@ClientString(id = 2187, message = "The target is located where you cannot charge.")
	public static SystemMessageId THE_TARGET_IS_LOCATED_WHERE_YOU_CANNOT_CHARGE;
	
	@ClientString(id = 2188, message = "Another enchantment is in progress. Please complete the previous task, then try again")
	public static SystemMessageId ANOTHER_ENCHANTMENT_IS_IN_PROGRESS_PLEASE_COMPLETE_THE_PREVIOUS_TASK_THEN_TRY_AGAIN;
	
	@ClientString(id = 2189, message = "Current location: $s1 / $s2 / $s3 (Near Kamael Village)")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3_NEAR_KAMAEL_VILLAGE;
	
	@ClientString(id = 2190, message = "Current location: $s1 / $s2 / $s3 (near Refugee Camp)")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3_NEAR_REFUGEE_CAMP;
	
	@ClientString(id = 2191, message = "To apply selected options, the game needs to be reloaded. If you don't apply now, it will be applied when you start the game next time. Will you apply now?")
	public static SystemMessageId TO_APPLY_SELECTED_OPTIONS_THE_GAME_NEEDS_TO_BE_RELOADED_IF_YOU_DON_T_APPLY_NOW_IT_WILL_BE_APPLIED_WHEN_YOU_START_THE_GAME_NEXT_TIME_WILL_YOU_APPLY_NOW;
	
	@ClientString(id = 2192, message = "You have bid on an item auction.")
	public static SystemMessageId YOU_HAVE_BID_ON_AN_ITEM_AUCTION;
	
	@ClientString(id = 2193, message = "You are too far from the NPC for that to work.")
	public static SystemMessageId YOU_ARE_TOO_FAR_FROM_THE_NPC_FOR_THAT_TO_WORK;
	
	@ClientString(id = 2194, message = "Current polymorph form cannot be applied with corresponding effects.")
	public static SystemMessageId CURRENT_POLYMORPH_FORM_CANNOT_BE_APPLIED_WITH_CORRESPONDING_EFFECTS;
	
	@ClientString(id = 2195, message = "You do not have enough souls.")
	public static SystemMessageId YOU_DO_NOT_HAVE_ENOUGH_SOULS;
	
	@ClientString(id = 2196, message = "No Owned Clan.")
	public static SystemMessageId NO_OWNED_CLAN;
	
	@ClientString(id = 2197, message = "Owned by clan $s1.")
	public static SystemMessageId OWNED_BY_CLAN_S1;
	
	@ClientString(id = 2198, message = "You currently have the highest bid in an item auction.")
	public static SystemMessageId YOU_CURRENTLY_HAVE_THE_HIGHEST_BID_IN_AN_ITEM_AUCTION;
	
	@ClientString(id = 2199, message = "You cannot enter this instant zone while the NPC server is down.")
	public static SystemMessageId YOU_CANNOT_ENTER_THIS_INSTANT_ZONE_WHILE_THE_NPC_SERVER_IS_DOWN;
	
	@ClientString(id = 2200, message = "This instant zone will be terminated as the NPC server is down. You will be forcibly removed from the dungeon shortly.")
	public static SystemMessageId THIS_INSTANT_ZONE_WILL_BE_TERMINATED_AS_THE_NPC_SERVER_IS_DOWN_YOU_WILL_BE_FORCIBLY_REMOVED_FROM_THE_DUNGEON_SHORTLY;
	
	@ClientString(id = 2201, message = "$s1 year(s) $s2 month(s) $s3 day(s)")
	public static SystemMessageId S1_YEAR_S_S2_MONTH_S_S3_DAY_S;
	
	@ClientString(id = 2202, message = "$s1 hour(s) $s2 minute(s) $s3 second(s)")
	public static SystemMessageId S1_HOUR_S_S2_MINUTE_S_S3_SECOND_S;
	
	@ClientString(id = 2203, message = "$s1/$s2")
	public static SystemMessageId S1_S2;
	
	@ClientString(id = 2204, message = "$s1 hour(s)")
	public static SystemMessageId S1_HOUR_S;
	
	@ClientString(id = 2205, message = "You have entered an area where the mini map cannot be used. Your mini map has been closed.")
	public static SystemMessageId YOU_HAVE_ENTERED_AN_AREA_WHERE_THE_MINI_MAP_CANNOT_BE_USED_YOUR_MINI_MAP_HAS_BEEN_CLOSED;
	
	@ClientString(id = 2206, message = "You have entered an area where the mini map can now be used.")
	public static SystemMessageId YOU_HAVE_ENTERED_AN_AREA_WHERE_THE_MINI_MAP_CAN_NOW_BE_USED;
	
	@ClientString(id = 2207, message = "This is an area where you cannot use the mini map. The mini map cannot be opened.")
	public static SystemMessageId THIS_IS_AN_AREA_WHERE_YOU_CANNOT_USE_THE_MINI_MAP_THE_MINI_MAP_CANNOT_BE_OPENED;
	
	@ClientString(id = 2208, message = "You do not meet the skill level requirements.")
	public static SystemMessageId YOU_DO_NOT_MEET_THE_SKILL_LEVEL_REQUIREMENTS;
	
	@ClientString(id = 2209, message = "This is an area where your radar cannot be used")
	public static SystemMessageId THIS_IS_AN_AREA_WHERE_YOUR_RADAR_CANNOT_BE_USED;
	
	@ClientString(id = 2210, message = "Your skill will be returned to an unenchanted state.")
	public static SystemMessageId YOUR_SKILL_WILL_BE_RETURNED_TO_AN_UNENCHANTED_STATE;
	
	@ClientString(id = 2211, message = "You must learn the Onyx Beast skill before you can learn further skills.")
	public static SystemMessageId YOU_MUST_LEARN_THE_ONYX_BEAST_SKILL_BEFORE_YOU_CAN_LEARN_FURTHER_SKILLS;
	
	@ClientString(id = 2212, message = "You have not completed the necessary quest for skill acquisition.")
	public static SystemMessageId YOU_HAVE_NOT_COMPLETED_THE_NECESSARY_QUEST_FOR_SKILL_ACQUISITION;
	
	@ClientString(id = 2213, message = "You cannot board a ship while you are polymorphed.")
	public static SystemMessageId YOU_CANNOT_BOARD_A_SHIP_WHILE_YOU_ARE_POLYMORPHED;
	
	@ClientString(id = 2214, message = "A new character will be created with the current settings. Continue?")
	public static SystemMessageId A_NEW_CHARACTER_WILL_BE_CREATED_WITH_THE_CURRENT_SETTINGS_CONTINUE;
	
	@ClientString(id = 2215, message = "$s1 P. Def.")
	public static SystemMessageId S1_P_DEF;
	
	@ClientString(id = 2216, message = "The CPU driver is not up-to-date. Please download the latest driver.")
	public static SystemMessageId THE_CPU_DRIVER_IS_NOT_UP_TO_DATE_PLEASE_DOWNLOAD_THE_LATEST_DRIVER;
	
	@ClientString(id = 2217, message = "The ballista has been successfully destroyed. The Clan Reputation will be increased.")
	public static SystemMessageId THE_BALLISTA_HAS_BEEN_SUCCESSFULLY_DESTROYED_THE_CLAN_REPUTATION_WILL_BE_INCREASED;
	
	@ClientString(id = 2218, message = "This is a main class skill only.")
	public static SystemMessageId THIS_IS_A_MAIN_CLASS_SKILL_ONLY;
	
	@ClientString(id = 2219, message = "This squad skill has already been learned.")
	public static SystemMessageId THIS_SQUAD_SKILL_HAS_ALREADY_BEEN_LEARNED;
	
	@ClientString(id = 2220, message = "The previous level skill has not been learned.")
	public static SystemMessageId THE_PREVIOUS_LEVEL_SKILL_HAS_NOT_BEEN_LEARNED;
	
	@ClientString(id = 2221, message = "Do you wish to activate the selected functions?")
	public static SystemMessageId DO_YOU_WISH_TO_ACTIVATE_THE_SELECTED_FUNCTIONS;
	
	@ClientString(id = 2222, message = "It will cost 150,000 Adena to place scouts. Do you wish to continue?")
	public static SystemMessageId IT_WILL_COST_150_000_ADENA_TO_PLACE_SCOUTS_DO_YOU_WISH_TO_CONTINUE;
	
	@ClientString(id = 2223, message = "It will cost 200,000 Adena for a fortress gate enhancement. Do you wish to continue?")
	public static SystemMessageId IT_WILL_COST_200_000_ADENA_FOR_A_FORTRESS_GATE_ENHANCEMENT_DO_YOU_WISH_TO_CONTINUE;
	
	@ClientString(id = 2224, message = "Your crossbow is preparing to fire.")
	public static SystemMessageId YOUR_CROSSBOW_IS_PREPARING_TO_FIRE;
	
	@ClientString(id = 2225, message = "There are no other skills to learn. Please come back after $s1nd class change.")
	public static SystemMessageId THERE_ARE_NO_OTHER_SKILLS_TO_LEARN_PLEASE_COME_BACK_AFTER_S1ND_CLASS_CHANGE;
	
	@ClientString(id = 2226, message = "Not enough bolts.")
	public static SystemMessageId NOT_ENOUGH_BOLTS;
	
	@ClientString(id = 2227, message = "It is not possible to register for the castle siege side or castle siege of a higher castle in the contract.")
	public static SystemMessageId IT_IS_NOT_POSSIBLE_TO_REGISTER_FOR_THE_CASTLE_SIEGE_SIDE_OR_CASTLE_SIEGE_OF_A_HIGHER_CASTLE_IN_THE_CONTRACT;
	
	@ClientString(id = 2228, message = "Instant zone time limit:")
	public static SystemMessageId INSTANT_ZONE_TIME_LIMIT;
	
	@ClientString(id = 2229, message = "There is no instant zone under a time limit.")
	public static SystemMessageId THERE_IS_NO_INSTANT_ZONE_UNDER_A_TIME_LIMIT;
	
	@ClientString(id = 2230, message = "$s1 will be available for re-use after $s2 hour(s) $s3 minute(s).")
	public static SystemMessageId S1_WILL_BE_AVAILABLE_FOR_RE_USE_AFTER_S2_HOUR_S_S3_MINUTE_S;
	
	@ClientString(id = 2231, message = "The supply items have not  been provided because the castle you are in contract with doesn't have enough Clan Reputation.")
	public static SystemMessageId THE_SUPPLY_ITEMS_HAVE_NOT_BEEN_PROVIDED_BECAUSE_THE_CASTLE_YOU_ARE_IN_CONTRACT_WITH_DOESN_T_HAVE_ENOUGH_CLAN_REPUTATION;
	
	@ClientString(id = 2232, message = "$s1 will be crystallized before destruction. Will you continue?")
	public static SystemMessageId S1_WILL_BE_CRYSTALLIZED_BEFORE_DESTRUCTION_WILL_YOU_CONTINUE;
	
	@ClientString(id = 2233, message = "Siege registration is not possible due to your castle contract.")
	public static SystemMessageId SIEGE_REGISTRATION_IS_NOT_POSSIBLE_DUE_TO_YOUR_CASTLE_CONTRACT;
	
	@ClientString(id = 2234, message = "Do you wish to use this Kamael exclusive Hero Weapon?")
	public static SystemMessageId DO_YOU_WISH_TO_USE_THIS_KAMAEL_EXCLUSIVE_HERO_WEAPON;
	
	@ClientString(id = 2235, message = "The instant zone in use has been deleted and cannot be accessed.")
	public static SystemMessageId THE_INSTANT_ZONE_IN_USE_HAS_BEEN_DELETED_AND_CANNOT_BE_ACCESSED;
	
	@ClientString(id = 2236, message = "You have $s1 minute(s) left on your wyvern.")
	public static SystemMessageId YOU_HAVE_S1_MINUTE_S_LEFT_ON_YOUR_WYVERN;
	
	@ClientString(id = 2237, message = "You have $s1 second(s) left on your wyvern.")
	public static SystemMessageId YOU_HAVE_S1_SECOND_S_LEFT_ON_YOUR_WYVERN;
	
	@ClientString(id = 2238, message = "You are participating in the siege of $s1. This siege is scheduled for 2 hours.")
	public static SystemMessageId YOU_ARE_PARTICIPATING_IN_THE_SIEGE_OF_S1_THIS_SIEGE_IS_SCHEDULED_FOR_2_HOURS;
	
	@ClientString(id = 2239, message = "The siege of $s1, in which you are participating, has finished.")
	public static SystemMessageId THE_SIEGE_OF_S1_IN_WHICH_YOU_ARE_PARTICIPATING_HAS_FINISHED;
	
	@ClientString(id = 2240, message = "You cannot register for a Clan Hall War when the Clan Leader is in the process of re-delegating clan authority to another leader.")
	public static SystemMessageId YOU_CANNOT_REGISTER_FOR_A_CLAN_HALL_WAR_WHEN_THE_CLAN_LEADER_IS_IN_THE_PROCESS_OF_RE_DELEGATING_CLAN_AUTHORITY_TO_ANOTHER_LEADER;
	
	@ClientString(id = 2241, message = "You cannot apply for a Clan Leader delegation request if your clan has registered for a Clan Hall War.")
	public static SystemMessageId YOU_CANNOT_APPLY_FOR_A_CLAN_LEADER_DELEGATION_REQUEST_IF_YOUR_CLAN_HAS_REGISTERED_FOR_A_CLAN_HALL_WAR;
	
	@ClientString(id = 2242, message = "Clan members cannot leave or be expelled when they are registered for a Clan Hall War.")
	public static SystemMessageId CLAN_MEMBERS_CANNOT_LEAVE_OR_BE_EXPELLED_WHEN_THEY_ARE_REGISTERED_FOR_A_CLAN_HALL_WAR;
	
	@ClientString(id = 2243, message = "During the Bandit Stronghold or Wild Beast Reserve clan hall war, the previous Clan Leader rather than the new Clan Leader participates in battle.")
	public static SystemMessageId DURING_THE_BANDIT_STRONGHOLD_OR_WILD_BEAST_RESERVE_CLAN_HALL_WAR_THE_PREVIOUS_CLAN_LEADER_RATHER_THAN_THE_NEW_CLAN_LEADER_PARTICIPATES_IN_BATTLE;
	
	@ClientString(id = 2244, message = "$s1 minute(s) remaining.")
	public static SystemMessageId S1_MINUTE_S_REMAINING;
	
	@ClientString(id = 2245, message = "$s1 second(s) remaining.")
	public static SystemMessageId S1_SECOND_S_REMAINING;
	
	@ClientString(id = 2246, message = "The contest will begin in $s1 minute(s).")
	public static SystemMessageId THE_CONTEST_WILL_BEGIN_IN_S1_MINUTE_S;
	
	@ClientString(id = 2247, message = "You cannot board an airship while transformed.")
	public static SystemMessageId YOU_CANNOT_BOARD_AN_AIRSHIP_WHILE_TRANSFORMED;
	
	@ClientString(id = 2248, message = "You cannot board an airship while petrified.")
	public static SystemMessageId YOU_CANNOT_BOARD_AN_AIRSHIP_WHILE_PETRIFIED;
	
	@ClientString(id = 2249, message = "You cannot board an airship while dead.")
	public static SystemMessageId YOU_CANNOT_BOARD_AN_AIRSHIP_WHILE_DEAD;
	
	@ClientString(id = 2250, message = "You cannot board an airship while fishing.")
	public static SystemMessageId YOU_CANNOT_BOARD_AN_AIRSHIP_WHILE_FISHING;
	
	@ClientString(id = 2251, message = "You cannot board an airship while in battle.")
	public static SystemMessageId YOU_CANNOT_BOARD_AN_AIRSHIP_WHILE_IN_BATTLE;
	
	@ClientString(id = 2252, message = "You cannot board an airship while in a duel.")
	public static SystemMessageId YOU_CANNOT_BOARD_AN_AIRSHIP_WHILE_IN_A_DUEL;
	
	@ClientString(id = 2253, message = "You cannot board an airship while sitting.")
	public static SystemMessageId YOU_CANNOT_BOARD_AN_AIRSHIP_WHILE_SITTING;
	
	@ClientString(id = 2254, message = "You cannot board an airship while casting.")
	public static SystemMessageId YOU_CANNOT_BOARD_AN_AIRSHIP_WHILE_CASTING;
	
	@ClientString(id = 2255, message = "You cannot board an airship when a cursed weapon is equipped.")
	public static SystemMessageId YOU_CANNOT_BOARD_AN_AIRSHIP_WHEN_A_CURSED_WEAPON_IS_EQUIPPED;
	
	@ClientString(id = 2256, message = "You cannot board an airship while holding a flag.")
	public static SystemMessageId YOU_CANNOT_BOARD_AN_AIRSHIP_WHILE_HOLDING_A_FLAG;
	
	@ClientString(id = 2257, message = "You cannot board an airship while a pet or a servitor is summoned.")
	public static SystemMessageId YOU_CANNOT_BOARD_AN_AIRSHIP_WHILE_A_PET_OR_A_SERVITOR_IS_SUMMONED;
	
	@ClientString(id = 2258, message = "You have already boarded another airship.")
	public static SystemMessageId YOU_HAVE_ALREADY_BOARDED_ANOTHER_AIRSHIP;
	
	@ClientString(id = 2259, message = "Current Location: $s1 / $s2 / $s3 (near Fantasy Isle)")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3_NEAR_FANTASY_ISLE;
	
	@ClientString(id = 2260, message = "Your pet's hunger gauge is below 10%. If your pet isn't fed soon, it may run away.")
	public static SystemMessageId YOUR_PET_S_HUNGER_GAUGE_IS_BELOW_10_IF_YOUR_PET_ISN_T_FED_SOON_IT_MAY_RUN_AWAY;
	
	@ClientString(id = 2261, message = "$c1 has inflicted $s3 damage on $c2.")
	public static SystemMessageId C1_HAS_INFLICTED_S3_DAMAGE_ON_C2_S4;
	
	@ClientString(id = 2262, message = "$c1 has received $s3 damage from $c2.")
	public static SystemMessageId C1_HAS_RECEIVED_S3_DAMAGE_FROM_C2;
	
	@ClientString(id = 2263, message = "$c1 has received $s3 damage through $c2.")
	public static SystemMessageId C1_HAS_RECEIVED_S3_DAMAGE_THROUGH_C2;
	
	@ClientString(id = 2264, message = "$c1 has evaded $c2's attack.")
	public static SystemMessageId C1_HAS_EVADED_C2_S_ATTACK;
	
	@ClientString(id = 2265, message = "$c1's attack went astray.")
	public static SystemMessageId C1_S_ATTACK_WENT_ASTRAY;
	
	@ClientString(id = 2266, message = "$c1 landed a critical hit!")
	public static SystemMessageId C1_LANDED_A_CRITICAL_HIT;
	
	@ClientString(id = 2267, message = "$c1 resisted $c2's drain.")
	public static SystemMessageId C1_RESISTED_C2_S_DRAIN;
	
	@ClientString(id = 2268, message = "$c1's attack failed.")
	public static SystemMessageId C1_S_ATTACK_FAILED;
	
	@ClientString(id = 2269, message = "$c1 resisted $c2's magic.")
	public static SystemMessageId C1_RESISTED_C2_S_MAGIC;
	
	@ClientString(id = 2270, message = "$c1 has received $s2 damage from the magic fire.")
	public static SystemMessageId C1_HAS_RECEIVED_S2_DAMAGE_FROM_THE_MAGIC_FIRE;
	
	@ClientString(id = 2271, message = "$c1 weakly resisted $c2's magic.")
	public static SystemMessageId C1_WEAKLY_RESISTED_C2_S_MAGIC;
	
	@ClientString(id = 2272, message = "The key you assigned as a shortcut key is not available in regular chatting mode.")
	public static SystemMessageId THE_KEY_YOU_ASSIGNED_AS_A_SHORTCUT_KEY_IS_NOT_AVAILABLE_IN_REGULAR_CHATTING_MODE;
	
	@ClientString(id = 2273, message = "This skill cannot be learned while in the subclass state. Please try again after changing to the main class.")
	public static SystemMessageId THIS_SKILL_CANNOT_BE_LEARNED_WHILE_IN_THE_SUBCLASS_STATE_PLEASE_TRY_AGAIN_AFTER_CHANGING_TO_THE_MAIN_CLASS;
	
	@ClientString(id = 2274, message = "You entered an area where you cannot throw away items.")
	public static SystemMessageId YOU_ENTERED_AN_AREA_WHERE_YOU_CANNOT_THROW_AWAY_ITEMS;
	
	@ClientString(id = 2275, message = "You are in an area where you cannot cancel pet summoning.")
	public static SystemMessageId YOU_ARE_IN_AN_AREA_WHERE_YOU_CANNOT_CANCEL_PET_SUMMONING;
	
	@ClientString(id = 2276, message = "The rebel army recaptured the fortress.")
	public static SystemMessageId THE_REBEL_ARMY_RECAPTURED_THE_FORTRESS;
	
	@ClientString(id = 2277, message = "Party of $s1")
	public static SystemMessageId PARTY_OF_S1;
	
	@ClientString(id = 2278, message = "Remaining Time $s1:$s2")
	public static SystemMessageId REMAINING_TIME_S1_S2;
	
	@ClientString(id = 2279, message = "You can no longer add a quest to the Quest Alerts.")
	public static SystemMessageId YOU_CAN_NO_LONGER_ADD_A_QUEST_TO_THE_QUEST_ALERTS;
	
	@ClientString(id = 2280, message = "Damage is decreased because $c1 resisted $c2's magic.")
	public static SystemMessageId DAMAGE_IS_DECREASED_BECAUSE_C1_RESISTED_C2_S_MAGIC;
	
	@ClientString(id = 2281, message = "$c1 inflicted $s3 damage on $c2 and $s4 damage on the damage transfer target.")
	public static SystemMessageId C1_INFLICTED_S3_DAMAGE_ON_C2_AND_S4_DAMAGE_ON_THE_DAMAGE_TRANSFER_TARGET;
	
	@ClientString(id = 2282, message = "Leave Fantasy Isle.")
	public static SystemMessageId LEAVE_FANTASY_ISLE;
	
	@ClientString(id = 2283, message = "You cannot transform while sitting.")
	public static SystemMessageId YOU_CANNOT_TRANSFORM_WHILE_SITTING;
	
	@ClientString(id = 2284, message = "You have obtained all the points you can get today in a place other than Internet Caf￩.")
	public static SystemMessageId YOU_HAVE_OBTAINED_ALL_THE_POINTS_YOU_CAN_GET_TODAY_IN_A_PLACE_OTHER_THAN_INTERNET_CAF;
	
	@ClientString(id = 2285, message = "This skill cannot remove this trap.")
	public static SystemMessageId THIS_SKILL_CANNOT_REMOVE_THIS_TRAP;
	
	@ClientString(id = 2286, message = "You cannot wear $s1 because you are not wearing a bracelet.")
	public static SystemMessageId YOU_CANNOT_WEAR_S1_BECAUSE_YOU_ARE_NOT_WEARING_A_BRACELET;
	
	@ClientString(id = 2287, message = "You cannot equip $s1 because you do not have any available slots.")
	public static SystemMessageId YOU_CANNOT_EQUIP_S1_BECAUSE_YOU_DO_NOT_HAVE_ANY_AVAILABLE_SLOTS;
	
	@ClientString(id = 2288, message = "Resurrection will occur in $s1 second(s).")
	public static SystemMessageId RESURRECTION_WILL_OCCUR_IN_S1_SECOND_S;
	
	@ClientString(id = 2289, message = "The match between the parties cannot commence because one of the party members is being teleported.")
	public static SystemMessageId THE_MATCH_BETWEEN_THE_PARTIES_CANNOT_COMMENCE_BECAUSE_ONE_OF_THE_PARTY_MEMBERS_IS_BEING_TELEPORTED;
	
	@ClientString(id = 2290, message = "You cannot assign shortcut keys before you log in.")
	public static SystemMessageId YOU_CANNOT_ASSIGN_SHORTCUT_KEYS_BEFORE_YOU_LOG_IN;
	
	@ClientString(id = 2291, message = "You must be in a party in order to operate the machine.")
	public static SystemMessageId YOU_MUST_BE_IN_A_PARTY_IN_ORDER_TO_OPERATE_THE_MACHINE;
	
	@ClientString(id = 2292, message = "Agathion skills can be used only when your Agathion is summoned.")
	public static SystemMessageId AGATHION_SKILLS_CAN_BE_USED_ONLY_WHEN_YOUR_AGATHION_IS_SUMMONED;
	
	@ClientString(id = 2293, message = "Current location: $s1 / $s2 / $s3 (inside the Steel Citadel)")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3_INSIDE_THE_STEEL_CITADEL;
	
	@ClientString(id = 2294, message = "The width of the symbol does not meet the standard requirements.")
	public static SystemMessageId THE_WIDTH_OF_THE_SYMBOL_DOES_NOT_MEET_THE_STANDARD_REQUIREMENTS;
	
	@ClientString(id = 2295, message = "The length of the symbol does not meet the standard requirements.")
	public static SystemMessageId THE_LENGTH_OF_THE_SYMBOL_DOES_NOT_MEET_THE_STANDARD_REQUIREMENTS;
	
	@ClientString(id = 2296, message = "You have gained Vitality points.")
	public static SystemMessageId YOU_HAVE_GAINED_VITALITY_POINTS;
	
	@ClientString(id = 2297, message = "Round $s1")
	public static SystemMessageId ROUND_S1;
	
	@ClientString(id = 2298, message = "The color of the symbol does not meet the standard requirements.")
	public static SystemMessageId THE_COLOR_OF_THE_SYMBOL_DOES_NOT_MEET_THE_STANDARD_REQUIREMENTS;
	
	@ClientString(id = 2299, message = "The file format of the symbol does not meet the standard requirements.")
	public static SystemMessageId THE_FILE_FORMAT_OF_THE_SYMBOL_DOES_NOT_MEET_THE_STANDARD_REQUIREMENTS;
	
	@ClientString(id = 2300, message = "Failed to load keyboard security module. For effective gaming functionality, when the game is over, please check all the files in the Lineage II automatic update.")
	public static SystemMessageId FAILED_TO_LOAD_KEYBOARD_SECURITY_MODULE_FOR_EFFECTIVE_GAMING_FUNCTIONALITY_WHEN_THE_GAME_IS_OVER_PLEASE_CHECK_ALL_THE_FILES_IN_THE_LINEAGE_II_AUTOMATIC_UPDATE;
	
	@ClientString(id = 2301, message = "Current Location: Castle Inside the Steel Citadel")
	public static SystemMessageId CURRENT_LOCATION_CASTLE_INSIDE_THE_STEEL_CITADEL;
	
	@ClientString(id = 2302, message = "Your Dimensional Item has arrived! Visit the Dimensional Merchant in any village to obtain it.")
	public static SystemMessageId YOUR_DIMENSIONAL_ITEM_HAS_ARRIVED_VISIT_THE_DIMENSIONAL_MERCHANT_IN_ANY_VILLAGE_TO_OBTAIN_IT;
	
	@ClientString(id = 2303, message = "There are $s2 second(s) remaining in $s1's re-use time.")
	public static SystemMessageId THERE_ARE_S2_SECOND_S_REMAINING_IN_S1_S_RE_USE_TIME;
	
	@ClientString(id = 2304, message = "There are $s2 minute(s), $s3 second(s) remaining in $s1's re-use time.")
	public static SystemMessageId THERE_ARE_S2_MINUTE_S_S3_SECOND_S_REMAINING_IN_S1_S_RE_USE_TIME;
	
	@ClientString(id = 2305, message = "There are $s2 hour(s), $s3 minute(s), and $s4 second(s) remaining in $s1's re-use time.")
	public static SystemMessageId THERE_ARE_S2_HOUR_S_S3_MINUTE_S_AND_S4_SECOND_S_REMAINING_IN_S1_S_RE_USE_TIME;
	
	@ClientString(id = 2306, message = "Your Charm of Courage is trying to resurrect you. Would you like to resurrect now?")
	public static SystemMessageId YOUR_CHARM_OF_COURAGE_IS_TRYING_TO_RESURRECT_YOU_WOULD_YOU_LIKE_TO_RESURRECT_NOW;
	
	@ClientString(id = 2307, message = "The target is using a Charm of Courage.")
	public static SystemMessageId THE_TARGET_IS_USING_A_CHARM_OF_COURAGE;
	
	@ClientString(id = 2308, message = "Remaining time: $s1 day(s)")
	public static SystemMessageId REMAINING_TIME_S1_DAY_S;
	
	@ClientString(id = 2309, message = "Remaining time: $s1 hour(s)")
	public static SystemMessageId REMAINING_TIME_S1_HOUR_S;
	
	@ClientString(id = 2310, message = "Remaining time: $s1 minute(s)")
	public static SystemMessageId REMAINING_TIME_S1_MINUTE_S;
	
	@ClientString(id = 2311, message = "You do not have a servitor.")
	public static SystemMessageId YOU_DO_NOT_HAVE_A_SERVITOR;
	
	@ClientString(id = 2312, message = "You do not have a pet.")
	public static SystemMessageId YOU_DO_NOT_HAVE_A_PET;
	
	@ClientString(id = 2313, message = "Your Dimensional Item has arrived! Visit the Dimensional Merchant in any village to obtain it.")
	public static SystemMessageId YOUR_DIMENSIONAL_ITEM_HAS_ARRIVED_VISIT_THE_DIMENSIONAL_MERCHANT_IN_ANY_VILLAGE_TO_OBTAIN_IT2;
	
	@ClientString(id = 2314, message = "Your Vitality is at maximum.")
	public static SystemMessageId YOUR_VITALITY_IS_AT_MAXIMUM;
	
	@ClientString(id = 2315, message = "Your Vitality has increased.")
	public static SystemMessageId YOUR_VITALITY_HAS_INCREASED;
	
	@ClientString(id = 2316, message = "Your Vitality has decreased.")
	public static SystemMessageId YOUR_VITALITY_HAS_DECREASED;
	
	@ClientString(id = 2317, message = "Your Vitality is fully exhausted.")
	public static SystemMessageId YOUR_VITALITY_IS_FULLY_EXHAUSTED;
	
	@ClientString(id = 2318, message = "Only an enhanced skill can be cancelled.")
	public static SystemMessageId ONLY_AN_ENHANCED_SKILL_CAN_BE_CANCELLED;
	
	@ClientString(id = 2319, message = "You have acquired $s1 fame.")
	public static SystemMessageId YOU_HAVE_ACQUIRED_S1_FAME;
	
	@ClientString(id = 2320, message = "Masterwork creation possible")
	public static SystemMessageId MASTERWORK_CREATION_POSSIBLE;
	
	@ClientString(id = 2321, message = "Current location: Inside Kamaloka")
	public static SystemMessageId CURRENT_LOCATION_INSIDE_KAMALOKA;
	
	@ClientString(id = 2322, message = "Current location: Inside Nia Kamaloka")
	public static SystemMessageId CURRENT_LOCATION_INSIDE_NIA_KAMALOKA;
	
	@ClientString(id = 2323, message = "Current location: Inside Rim Kamaloka")
	public static SystemMessageId CURRENT_LOCATION_INSIDE_RIM_KAMALOKA;
	
	@ClientString(id = 2324, message = "You do not have enough PC Points.")
	public static SystemMessageId YOU_DO_NOT_HAVE_ENOUGH_PC_POINTS;
	
	@ClientString(id = 2325, message = "Another teleport is taking place. Please try again once the teleport in process ends.")
	public static SystemMessageId ANOTHER_TELEPORT_IS_TAKING_PLACE_PLEASE_TRY_AGAIN_ONCE_THE_TELEPORT_IN_PROCESS_ENDS;
	
	@ClientString(id = 2326, message = "You have acquired 50 Clan Reputation.")
	public static SystemMessageId YOU_HAVE_ACQUIRED_50_CLAN_REPUTATION;
	
	@ClientString(id = 2327, message = "You don't have enough Fame to do that.")
	public static SystemMessageId YOU_DON_T_HAVE_ENOUGH_FAME_TO_DO_THAT;
	
	@ClientString(id = 2328, message = "Only clans who are level 4 or above can register for battle at Devastated Castle and Fortress of the Dead.")
	public static SystemMessageId ONLY_CLANS_WHO_ARE_LEVEL_4_OR_ABOVE_CAN_REGISTER_FOR_BATTLE_AT_DEVASTATED_CASTLE_AND_FORTRESS_OF_THE_DEAD;
	
	@ClientString(id = 2329, message = "Vitality Level $s1 $s2")
	public static SystemMessageId VITALITY_LEVEL_S1_S2;
	
	@ClientString(id = 2330, message = ": XP/SP boosted by $s1.")
	public static SystemMessageId XP_SP_BOOSTED_BY_S1;
	
	@ClientString(id = 2331, message = "(Rare) $s1")
	public static SystemMessageId RARE_S1;
	
	@ClientString(id = 2332, message = "(Supply) $s1")
	public static SystemMessageId SUPPLY_S1;
	
	@ClientString(id = 2333, message = "You cannot receive the dimensional item because you have exceed your inventory weight/quantity limit.")
	public static SystemMessageId YOU_CANNOT_RECEIVE_THE_DIMENSIONAL_ITEM_BECAUSE_YOU_HAVE_EXCEED_YOUR_INVENTORY_WEIGHT_QUANTITY_LIMIT;
	
	@ClientString(id = 2334, message = "Score that shows personal reputation. You may obtain it via Castle Siege, Fortress War, Clan Hall Siege, Underground Coliseum, and the Olympiad.")
	public static SystemMessageId SCORE_THAT_SHOWS_PERSONAL_REPUTATION_YOU_MAY_OBTAIN_IT_VIA_CASTLE_SIEGE_FORTRESS_WAR_CLAN_HALL_SIEGE_UNDERGROUND_COLISEUM_AND_THE_OLYMPIAD;
	
	@ClientString(id = 2335, message = "There are no more dimensional items to be found.")
	public static SystemMessageId THERE_ARE_NO_MORE_DIMENSIONAL_ITEMS_TO_BE_FOUND;
	
	@ClientString(id = 2336, message = "Half-Kill!")
	public static SystemMessageId HALF_KILL;
	
	@ClientString(id = 2337, message = "Your CP was drained because you were hit with a Half-Kill skill.")
	public static SystemMessageId YOUR_CP_WAS_DRAINED_BECAUSE_YOU_WERE_HIT_WITH_A_HALF_KILL_SKILL;
	
	@ClientString(id = 2338, message = "If it's a draw, the player who first entered is first")
	public static SystemMessageId IF_IT_S_A_DRAW_THE_PLAYER_WHO_FIRST_ENTERED_IS_FIRST;
	
	@ClientString(id = 2339, message = "Please place the item to be enchanted in the empty slot below.")
	public static SystemMessageId PLEASE_PLACE_THE_ITEM_TO_BE_ENCHANTED_IN_THE_EMPTY_SLOT_BELOW;
	
	@ClientString(id = 2340, message = "Please place the item for rate increase.")
	public static SystemMessageId PLEASE_PLACE_THE_ITEM_FOR_RATE_INCREASE;
	
	@ClientString(id = 2341, message = "The enchant will begin once you press the Start button below.")
	public static SystemMessageId THE_ENCHANT_WILL_BEGIN_ONCE_YOU_PRESS_THE_START_BUTTON_BELOW;
	
	@ClientString(id = 2342, message = "Success! The item is now a $s1.")
	public static SystemMessageId SUCCESS_THE_ITEM_IS_NOW_A_S1;
	
	@ClientString(id = 2343, message = "Failed. You have obtained $s2 of $s1.")
	public static SystemMessageId FAILED_YOU_HAVE_OBTAINED_S2_OF_S1;
	
	@ClientString(id = 2344, message = "You have been killed by an attack from $c1.")
	public static SystemMessageId YOU_HAVE_BEEN_KILLED_BY_AN_ATTACK_FROM_C1;
	
	@ClientString(id = 2345, message = "You have attacked and killed $c1.")
	public static SystemMessageId YOU_HAVE_ATTACKED_AND_KILLED_C1;
	
	@ClientString(id = 2346, message = "Your account may have been involved in identity theft. As such, it has been temporarily restricted. If this does not apply to you, you may obtain normal service by going through self-identification on the homepage. Please refer to Lineage II's Support Website (https://support.lineage2.com) for more details.")
	public static SystemMessageId YOUR_ACCOUNT_MAY_HAVE_BEEN_INVOLVED_IN_IDENTITY_THEFT_AS_SUCH_IT_HAS_BEEN_TEMPORARILY_RESTRICTED_IF_THIS_DOES_NOT_APPLY_TO_YOU_YOU_MAY_OBTAIN_NORMAL_SERVICE_BY_GOING_THROUGH_SELF_IDENTIFICATION_ON_THE_HOMEPAGE_PLEASE_REFER_TO_LINEAGE_II_S_SUPPORT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM_FOR_MORE_DETAILS;
	
	@ClientString(id = 2347, message = "$s1 second(s) to game end!")
	public static SystemMessageId S1_SECOND_S_TO_GAME_END;
	
	@ClientString(id = 2348, message = "You cannot use My Teleports during a battle.")
	public static SystemMessageId YOU_CANNOT_USE_MY_TELEPORTS_DURING_A_BATTLE;
	
	@ClientString(id = 2349, message = "You cannot use My Teleports while participating a large-scale battle such as a castle siege, fortress siege, or clan hall siege.")
	public static SystemMessageId YOU_CANNOT_USE_MY_TELEPORTS_WHILE_PARTICIPATING_A_LARGE_SCALE_BATTLE_SUCH_AS_A_CASTLE_SIEGE_FORTRESS_SIEGE_OR_CLAN_HALL_SIEGE;
	
	@ClientString(id = 2350, message = "You cannot use My Teleports during a duel.")
	public static SystemMessageId YOU_CANNOT_USE_MY_TELEPORTS_DURING_A_DUEL;
	
	@ClientString(id = 2351, message = "You cannot use My Teleports while flying.")
	public static SystemMessageId YOU_CANNOT_USE_MY_TELEPORTS_WHILE_FLYING;
	
	@ClientString(id = 2352, message = "You cannot use My Teleports while participating in an Olympiad match.")
	public static SystemMessageId YOU_CANNOT_USE_MY_TELEPORTS_WHILE_PARTICIPATING_IN_AN_OLYMPIAD_MATCH;
	
	@ClientString(id = 2353, message = "You cannot use My Teleports while you are in a petrified or paralyzed state.")
	public static SystemMessageId YOU_CANNOT_USE_MY_TELEPORTS_WHILE_YOU_ARE_IN_A_PETRIFIED_OR_PARALYZED_STATE;
	
	@ClientString(id = 2354, message = "You cannot use My Teleports while you are dead.")
	public static SystemMessageId YOU_CANNOT_USE_MY_TELEPORTS_WHILE_YOU_ARE_DEAD;
	
	@ClientString(id = 2355, message = "You cannot use My Teleports in this area.")
	public static SystemMessageId YOU_CANNOT_USE_MY_TELEPORTS_IN_THIS_AREA;
	
	@ClientString(id = 2356, message = "You cannot use My Teleports underwater.")
	public static SystemMessageId YOU_CANNOT_USE_MY_TELEPORTS_UNDERWATER;
	
	@ClientString(id = 2357, message = "You cannot use My Teleports in an instant zone.")
	public static SystemMessageId YOU_CANNOT_USE_MY_TELEPORTS_IN_AN_INSTANT_ZONE;
	
	@ClientString(id = 2358, message = "You have no space to save the teleport location.")
	public static SystemMessageId YOU_HAVE_NO_SPACE_TO_SAVE_THE_TELEPORT_LOCATION;
	
	@ClientString(id = 2359, message = "You cannot teleport because you do not have a teleport item.")
	public static SystemMessageId YOU_CANNOT_TELEPORT_BECAUSE_YOU_DO_NOT_HAVE_A_TELEPORT_ITEM;
	
	@ClientString(id = 2360, message = "My Teleports Spellbk: $s1")
	public static SystemMessageId MY_TELEPORTS_SPELLBK_S1;
	
	@ClientString(id = 2361, message = "Current Location: $s1")
	public static SystemMessageId CURRENT_LOCATION_S1;
	
	@ClientString(id = 2362, message = "The saved teleport location will be deleted. Do you wish to continue?")
	public static SystemMessageId THE_SAVED_TELEPORT_LOCATION_WILL_BE_DELETED_DO_YOU_WISH_TO_CONTINUE;
	
	@ClientString(id = 2363, message = "Your account has been denied all game services due to its confirmed registration under someone else's identity.  For more information, please visit the NCSOFT website (https://support.lineage2.com) Customer Service Center.")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_DENIED_ALL_GAME_SERVICES_DUE_TO_ITS_CONFIRMED_REGISTRATION_UNDER_SOMEONE_ELSE_S_IDENTITY_FOR_MORE_INFORMATION_PLEASE_VISIT_THE_NCSOFT_WEBSITE_HTTPS_SUPPORT_LINEAGE2_COM_CUSTOMER_SERVICE_CENTER;
	
	@ClientString(id = 2364, message = "$s1 has expired.")
	public static SystemMessageId S1_HAS_EXPIRED;
	
	@ClientString(id = 2365, message = "An item in your possession has expired.")
	public static SystemMessageId AN_ITEM_IN_YOUR_POSSESSION_HAS_EXPIRED;
	
	@ClientString(id = 2366, message = "The limited-time item has disappeared because the remaining time ran out.")
	public static SystemMessageId THE_LIMITED_TIME_ITEM_HAS_DISAPPEARED_BECAUSE_THE_REMAINING_TIME_RAN_OUT;
	
	@ClientString(id = 2367, message = "$s1's blessing has recovered HP by $s2.")
	public static SystemMessageId S1_S_BLESSING_HAS_RECOVERED_HP_BY_S2;
	
	@ClientString(id = 2368, message = "$s1's blessing has recovered MP by $s2.")
	public static SystemMessageId S1_S_BLESSING_HAS_RECOVERED_MP_BY_S2;
	
	@ClientString(id = 2369, message = "$s1's blessing has fully recovered HP and MP.")
	public static SystemMessageId S1_S_BLESSING_HAS_FULLY_RECOVERED_HP_AND_MP;
	
	@ClientString(id = 2370, message = "Resurrection will take place in the waiting room after $s1 second(s).")
	public static SystemMessageId RESURRECTION_WILL_TAKE_PLACE_IN_THE_WAITING_ROOM_AFTER_S1_SECOND_S;
	
	@ClientString(id = 2371, message = "$c1 was reported as a BOT.")
	public static SystemMessageId C1_WAS_REPORTED_AS_A_BOT;
	
	@ClientString(id = 2372, message = "There is not much time remaining until the pet leaves.")
	public static SystemMessageId THERE_IS_NOT_MUCH_TIME_REMAINING_UNTIL_THE_PET_LEAVES;
	
	@ClientString(id = 2373, message = "The pet is now leaving.")
	public static SystemMessageId THE_PET_IS_NOW_LEAVING;
	
	@ClientString(id = 2374, message = "End match!")
	public static SystemMessageId END_MATCH;
	
	@ClientString(id = 2375, message = "The minion pet cannot be returned because there is not much time remaining until it leaves.")
	public static SystemMessageId THE_MINION_PET_CANNOT_BE_RETURNED_BECAUSE_THERE_IS_NOT_MUCH_TIME_REMAINING_UNTIL_IT_LEAVES;
	
	@ClientString(id = 2376, message = "You cannot receive a dimensional item during an exchange.")
	public static SystemMessageId YOU_CANNOT_RECEIVE_A_DIMENSIONAL_ITEM_DURING_AN_EXCHANGE;
	
	@ClientString(id = 2377, message = "You cannot report a character who is in a peace zone or a battleground.")
	public static SystemMessageId YOU_CANNOT_REPORT_A_CHARACTER_WHO_IS_IN_A_PEACE_ZONE_OR_A_BATTLEGROUND;
	
	@ClientString(id = 2378, message = "You cannot report when a clan war has been declared.")
	public static SystemMessageId YOU_CANNOT_REPORT_WHEN_A_CLAN_WAR_HAS_BEEN_DECLARED;
	
	@ClientString(id = 2379, message = "You cannot report a character who has not acquired any XP after connecting.")
	public static SystemMessageId YOU_CANNOT_REPORT_A_CHARACTER_WHO_HAS_NOT_ACQUIRED_ANY_XP_AFTER_CONNECTING;
	
	@ClientString(id = 2380, message = "You cannot report this person again at this time.")
	public static SystemMessageId YOU_CANNOT_REPORT_THIS_PERSON_AGAIN_AT_THIS_TIME;
	
	@ClientString(id = 2381, message = "You cannot report this person again at this time.")
	public static SystemMessageId YOU_CANNOT_REPORT_THIS_PERSON_AGAIN_AT_THIS_TIME2;
	
	@ClientString(id = 2382, message = "You cannot report this person again at this time.")
	public static SystemMessageId YOU_CANNOT_REPORT_THIS_PERSON_AGAIN_AT_THIS_TIME3;
	
	@ClientString(id = 2383, message = "You cannot report this person again at this time.")
	public static SystemMessageId YOU_CANNOT_REPORT_THIS_PERSON_AGAIN_AT_THIS_TIME4;
	
	@ClientString(id = 2384, message = "This item does not meet the requirements for the enhancement spellbook.")
	public static SystemMessageId THIS_ITEM_DOES_NOT_MEET_THE_REQUIREMENTS_FOR_THE_ENHANCEMENT_SPELLBOOK;
	
	@ClientString(id = 2385, message = "Incorrect Lucky Enchant Stone.")
	public static SystemMessageId INCORRECT_LUCKY_ENCHANT_STONE;
	
	@ClientString(id = 2386, message = "This item is not compatible with the Lucky Enchant Stone used.")
	public static SystemMessageId THIS_ITEM_IS_NOT_COMPATIBLE_WITH_THE_LUCKY_ENCHANT_STONE_USED;
	
	@ClientString(id = 2387, message = "Failed to enter Lucky Enchant Stone.")
	public static SystemMessageId FAILED_TO_ENTER_LUCKY_ENCHANT_STONE;
	
	@ClientString(id = 2388, message = "A party cannot be formed in this area.")
	public static SystemMessageId A_PARTY_CANNOT_BE_FORMED_IN_THIS_AREA;
	
	@ClientString(id = 2389, message = "You have earned the maximum number of PC Points.")
	public static SystemMessageId YOU_HAVE_EARNED_THE_MAXIMUM_NUMBER_OF_PC_POINTS;
	
	@ClientString(id = 2390, message = "Your number of My Teleports slots has reached its maximum limit.")
	public static SystemMessageId YOUR_NUMBER_OF_MY_TELEPORTS_SLOTS_HAS_REACHED_ITS_MAXIMUM_LIMIT;
	
	@ClientString(id = 2391, message = "You have used the Feather of Blessing to resurrect.")
	public static SystemMessageId YOU_HAVE_USED_THE_FEATHER_OF_BLESSING_TO_RESURRECT;
	
	@ClientString(id = 2392, message = "The Dimensional Item cannot be located because of a temporary connection error.")
	public static SystemMessageId THE_DIMENSIONAL_ITEM_CANNOT_BE_LOCATED_BECAUSE_OF_A_TEMPORARY_CONNECTION_ERROR;
	
	@ClientString(id = 2393, message = "You earned $s1 PC Point(s).")
	public static SystemMessageId YOU_EARNED_S1_PC_POINT_S2;
	
	@ClientString(id = 2394, message = "That skill cannot be used because your pet/servitor lacks sufficient MP.")
	public static SystemMessageId THAT_SKILL_CANNOT_BE_USED_BECAUSE_YOUR_PET_SERVITOR_LACKS_SUFFICIENT_MP;
	
	@ClientString(id = 2395, message = "That skill cannot be used because your pet/servitor lacks sufficient HP.")
	public static SystemMessageId THAT_SKILL_CANNOT_BE_USED_BECAUSE_YOUR_PET_SERVITOR_LACKS_SUFFICIENT_HP;
	
	@ClientString(id = 2396, message = "That pet/servitor skill cannot be used because it is recharging.")
	public static SystemMessageId THAT_PET_SERVITOR_SKILL_CANNOT_BE_USED_BECAUSE_IT_IS_RECHARGING;
	
	@ClientString(id = 2397, message = "Please use a My Teleport Scroll.")
	public static SystemMessageId PLEASE_USE_A_MY_TELEPORT_SCROLL;
	
	@ClientString(id = 2398, message = "You have no open My Teleports slots.")
	public static SystemMessageId YOU_HAVE_NO_OPEN_MY_TELEPORTS_SLOTS;
	
	@ClientString(id = 2399, message = "$s1's ownership expires in $s2 minute(s).")
	public static SystemMessageId S1_S_OWNERSHIP_EXPIRES_IN_S2_MINUTE_S;
	
	@ClientString(id = 2400, message = "Instant Zone currently in use: $s1")
	public static SystemMessageId INSTANT_ZONE_CURRENTLY_IN_USE_S1;
	
	@ClientString(id = 2401, message = "Clan Leader $c2, who leads clan $s1, has been declared the lord of the $s3 territory.")
	public static SystemMessageId CLAN_LEADER_C2_WHO_LEADS_CLAN_S1_HAS_BEEN_DECLARED_THE_LORD_OF_THE_S3_TERRITORY;
	
	@ClientString(id = 2402, message = "The Territory War request period has ended.")
	public static SystemMessageId THE_TERRITORY_WAR_REQUEST_PERIOD_HAS_ENDED;
	
	@ClientString(id = 2403, message = "The Territory War begins in 10 minutes!")
	public static SystemMessageId THE_TERRITORY_WAR_BEGINS_IN_10_MINUTES;
	
	@ClientString(id = 2404, message = "The Territory War begins in 5 minutes!")
	public static SystemMessageId THE_TERRITORY_WAR_BEGINS_IN_5_MINUTES;
	
	@ClientString(id = 2405, message = "The Territory War begins in 1 minute!")
	public static SystemMessageId THE_TERRITORY_WAR_BEGINS_IN_1_MINUTE;
	
	@ClientString(id = 2406, message = "$s1's territory war has begun.")
	public static SystemMessageId S1_S_TERRITORY_WAR_HAS_BEGUN;
	
	@ClientString(id = 2407, message = "$s1's territory war has ended.")
	public static SystemMessageId S1_S_TERRITORY_WAR_HAS_ENDED;
	
	@ClientString(id = 2408, message = "You are currently registered for a 3 vs. 3 class irrelevant team match.")
	public static SystemMessageId YOU_ARE_CURRENTLY_REGISTERED_FOR_A_3_VS_3_CLASS_IRRELEVANT_TEAM_MATCH;
	
	@ClientString(id = 2409, message = "The number of My Teleports slots has been increased.")
	public static SystemMessageId THE_NUMBER_OF_MY_TELEPORTS_SLOTS_HAS_BEEN_INCREASED;
	
	@ClientString(id = 2410, message = "You cannot use My Teleports to reach this area!")
	public static SystemMessageId YOU_CANNOT_USE_MY_TELEPORTS_TO_REACH_THIS_AREA;
	
	@ClientString(id = 2411, message = "Party Invitation is set up to be rejected at Preferences, the Party Invitation of $c1 is automatically rejected.")
	public static SystemMessageId PARTY_INVITATION_IS_SET_UP_TO_BE_REJECTED_AT_PREFERENCES_THE_PARTY_INVITATION_OF_C1_IS_AUTOMATICALLY_REJECTED;
	
	@ClientString(id = 2412, message = "Your birthday gift has been delivered! Visit the Dimensional Merchant in any village to obtain it.")
	public static SystemMessageId YOUR_BIRTHDAY_GIFT_HAS_BEEN_DELIVERED_VISIT_THE_DIMENSIONAL_MERCHANT_IN_ANY_VILLAGE_TO_OBTAIN_IT;
	
	@ClientString(id = 2413, message = "You are registering as a reserve for the Red Team. Do you wish to continue?")
	public static SystemMessageId YOU_ARE_REGISTERING_AS_A_RESERVE_FOR_THE_RED_TEAM_DO_YOU_WISH_TO_CONTINUE;
	
	@ClientString(id = 2414, message = "You are registering as a reserve for the Blue Team. Do you wish to continue?")
	public static SystemMessageId YOU_ARE_REGISTERING_AS_A_RESERVE_FOR_THE_BLUE_TEAM_DO_YOU_WISH_TO_CONTINUE;
	
	@ClientString(id = 2415, message = "You have registered as a reserve for the Red Team. When in battle, the team can change its composition using the Maintain Team Balance function.")
	public static SystemMessageId YOU_HAVE_REGISTERED_AS_A_RESERVE_FOR_THE_RED_TEAM_WHEN_IN_BATTLE_THE_TEAM_CAN_CHANGE_ITS_COMPOSITION_USING_THE_MAINTAIN_TEAM_BALANCE_FUNCTION;
	
	@ClientString(id = 2416, message = "You have registered as a reserve for the Blue Team. When in battle, the team can change its composition using the Maintain Team Balance function.")
	public static SystemMessageId YOU_HAVE_REGISTERED_AS_A_RESERVE_FOR_THE_BLUE_TEAM_WHEN_IN_BATTLE_THE_TEAM_CAN_CHANGE_ITS_COMPOSITION_USING_THE_MAINTAIN_TEAM_BALANCE_FUNCTION;
	
	@ClientString(id = 2417, message = "You are canceling your Aerial Cleft registration. Do you wish to continue?")
	public static SystemMessageId YOU_ARE_CANCELING_YOUR_AERIAL_CLEFT_REGISTRATION_DO_YOU_WISH_TO_CONTINUE;
	
	@ClientString(id = 2418, message = "The Aerial Cleft registration has been canceled.")
	public static SystemMessageId THE_AERIAL_CLEFT_REGISTRATION_HAS_BEEN_CANCELED;
	
	@ClientString(id = 2419, message = "The Aerial Cleft has been activated. Flight transformation will be possible in approximately 40 seconds.")
	public static SystemMessageId THE_AERIAL_CLEFT_HAS_BEEN_ACTIVATED_FLIGHT_TRANSFORMATION_WILL_BE_POSSIBLE_IN_APPROXIMATELY_40_SECONDS;
	
	@ClientString(id = 2420, message = "The battleground closes in 1 minute.")
	public static SystemMessageId THE_BATTLEGROUND_CLOSES_IN_1_MINUTE;
	
	@ClientString(id = 2421, message = "The battleground closes in 10 seconds.")
	public static SystemMessageId THE_BATTLEGROUND_CLOSES_IN_10_SECONDS;
	
	@ClientString(id = 2422, message = "EP, or Energy Points, refers to fuel.")
	public static SystemMessageId EP_OR_ENERGY_POINTS_REFERS_TO_FUEL;
	
	@ClientString(id = 2423, message = "EP can be refilled by using a $s1 while sailing on an airship.")
	public static SystemMessageId EP_CAN_BE_REFILLED_BY_USING_A_S1_WHILE_SAILING_ON_AN_AIRSHIP;
	
	@ClientString(id = 2424, message = "The collection has failed.")
	public static SystemMessageId THE_COLLECTION_HAS_FAILED;
	
	@ClientString(id = 2425, message = "The Aerial Cleft battleground has been closed.")
	public static SystemMessageId THE_AERIAL_CLEFT_BATTLEGROUND_HAS_BEEN_CLOSED;
	
	@ClientString(id = 2426, message = "$c1 has been expelled from the team.")
	public static SystemMessageId C1_HAS_BEEN_EXPELLED_FROM_THE_TEAM;
	
	@ClientString(id = 2427, message = "The Red Team is victorious.")
	public static SystemMessageId THE_RED_TEAM_IS_VICTORIOUS;
	
	@ClientString(id = 2428, message = "The Blue Team is victorious.")
	public static SystemMessageId THE_BLUE_TEAM_IS_VICTORIOUS;
	
	@ClientString(id = 2429, message = "$c1 has been designated as the target.")
	public static SystemMessageId C1_HAS_BEEN_DESIGNATED_AS_THE_TARGET;
	
	@ClientString(id = 2430, message = "$c1 has fallen. The Red Team's points have increased.")
	public static SystemMessageId C1_HAS_FALLEN_THE_RED_TEAM_S_POINTS_HAVE_INCREASED;
	
	@ClientString(id = 2431, message = "$c2 has fallen. The Blue Team's points have increased.")
	public static SystemMessageId C2_HAS_FALLEN_THE_BLUE_TEAM_S_POINTS_HAVE_INCREASED;
	
	@ClientString(id = 2432, message = "The central stronghold's compressor has been destroyed.")
	public static SystemMessageId THE_CENTRAL_STRONGHOLD_S_COMPRESSOR_HAS_BEEN_DESTROYED;
	
	@ClientString(id = 2433, message = "The first stronghold's compressor has been destroyed.")
	public static SystemMessageId THE_FIRST_STRONGHOLD_S_COMPRESSOR_HAS_BEEN_DESTROYED;
	
	@ClientString(id = 2434, message = "The second stronghold's compressor has been destroyed.")
	public static SystemMessageId THE_SECOND_STRONGHOLD_S_COMPRESSOR_HAS_BEEN_DESTROYED;
	
	@ClientString(id = 2435, message = "The third stronghold's compressor has been destroyed.")
	public static SystemMessageId THE_THIRD_STRONGHOLD_S_COMPRESSOR_HAS_BEEN_DESTROYED;
	
	@ClientString(id = 2436, message = "The central stronghold's compressor is working.")
	public static SystemMessageId THE_CENTRAL_STRONGHOLD_S_COMPRESSOR_IS_WORKING;
	
	@ClientString(id = 2437, message = "The first stronghold's compressor is working.")
	public static SystemMessageId THE_FIRST_STRONGHOLD_S_COMPRESSOR_IS_WORKING;
	
	@ClientString(id = 2438, message = "The second stronghold's compressor is working.")
	public static SystemMessageId THE_SECOND_STRONGHOLD_S_COMPRESSOR_IS_WORKING;
	
	@ClientString(id = 2439, message = "The third stronghold's compressor is working.")
	public static SystemMessageId THE_THIRD_STRONGHOLD_S_COMPRESSOR_IS_WORKING;
	
	@ClientString(id = 2440, message = "$c1 is already registered on the waiting list for the 3 vs. 3 class irrelevant team match.")
	public static SystemMessageId C1_IS_ALREADY_REGISTERED_ON_THE_WAITING_LIST_FOR_THE_3_VS_3_CLASS_IRRELEVANT_TEAM_MATCH;
	
	@ClientString(id = 2441, message = "Only a party leader can request a team match.")
	public static SystemMessageId ONLY_A_PARTY_LEADER_CAN_REQUEST_A_TEAM_MATCH;
	
	@ClientString(id = 2442, message = "The request cannot be made because the requirements have not been met. To participate in a team match, you must first form a 3-member party.")
	public static SystemMessageId THE_REQUEST_CANNOT_BE_MADE_BECAUSE_THE_REQUIREMENTS_HAVE_NOT_BEEN_MET_TO_PARTICIPATE_IN_A_TEAM_MATCH_YOU_MUST_FIRST_FORM_A_3_MEMBER_PARTY;
	
	@ClientString(id = 2443, message = "Flames filled with the Wrath of Valakas are engulfing you.")
	public static SystemMessageId FLAMES_FILLED_WITH_THE_WRATH_OF_VALAKAS_ARE_ENGULFING_YOU;
	
	@ClientString(id = 2444, message = "Flames filled with the Authority of Valakas are binding your mind.")
	public static SystemMessageId FLAMES_FILLED_WITH_THE_AUTHORITY_OF_VALAKAS_ARE_BINDING_YOUR_MIND;
	
	@ClientString(id = 2445, message = "The battleground channel has been activated.")
	public static SystemMessageId THE_BATTLEGROUND_CHANNEL_HAS_BEEN_ACTIVATED;
	
	@ClientString(id = 2446, message = "The battleground channel has been deactivated.")
	public static SystemMessageId THE_BATTLEGROUND_CHANNEL_HAS_BEEN_DEACTIVATED;
	
	@ClientString(id = 2447, message = "Five years have passed since this character's creation.")
	public static SystemMessageId FIVE_YEARS_HAVE_PASSED_SINCE_THIS_CHARACTER_S_CREATION;
	
	@ClientString(id = 2448, message = "Happy birthday! Alegria has sent you a birthday gift.")
	public static SystemMessageId HAPPY_BIRTHDAY_ALEGRIA_HAS_SENT_YOU_A_BIRTHDAY_GIFT;
	
	@ClientString(id = 2449, message = "There are $s1 days remaining until your birthday. On your birthday, you will receive a gift that Alegria has carefully prepared.")
	public static SystemMessageId THERE_ARE_S1_DAYS_REMAINING_UNTIL_YOUR_BIRTHDAY_ON_YOUR_BIRTHDAY_YOU_WILL_RECEIVE_A_GIFT_THAT_ALEGRIA_HAS_CAREFULLY_PREPARED;
	
	@ClientString(id = 2450, message = "$c1's birthday is $s3/$s4/$s2.")
	public static SystemMessageId C1_S_BIRTHDAY_IS_S3_S4_S2;
	
	@ClientString(id = 2451, message = "Your cloak has been unequipped because your armor set is no longer complete.")
	public static SystemMessageId YOUR_CLOAK_HAS_BEEN_UNEQUIPPED_BECAUSE_YOUR_ARMOR_SET_IS_NO_LONGER_COMPLETE;
	
	@ClientString(id = 2452, message = "You inventory currently exceeds the normal amount of inventory slots available, so your belt/brooch cannot be equipped or removed.")
	public static SystemMessageId YOU_INVENTORY_CURRENTLY_EXCEEDS_THE_NORMAL_AMOUNT_OF_INVENTORY_SLOTS_AVAILABLE_SO_YOUR_BELT_BROOCH_CANNOT_BE_EQUIPPED_OR_REMOVED;
	
	@ClientString(id = 2453, message = "The cloak cannot be equipped because your armor set is not complete.")
	public static SystemMessageId THE_CLOAK_CANNOT_BE_EQUIPPED_BECAUSE_YOUR_ARMOR_SET_IS_NOT_COMPLETE;
	
	@ClientString(id = 2454, message = "Kresnik Class Airship")
	public static SystemMessageId KRESNIK_CLASS_AIRSHIP;
	
	@ClientString(id = 2455, message = "The airship must be summoned in order for you to board.")
	public static SystemMessageId THE_AIRSHIP_MUST_BE_SUMMONED_IN_ORDER_FOR_YOU_TO_BOARD;
	
	@ClientString(id = 2456, message = "In order to acquire an airship, the clan's level must be level 5 or above.")
	public static SystemMessageId IN_ORDER_TO_ACQUIRE_AN_AIRSHIP_THE_CLAN_S_LEVEL_MUST_BE_LEVEL_5_OR_ABOVE;
	
	@ClientString(id = 2457, message = "An airship cannot be summoned because either you have not registered your airship license, or the airship has not yet been summoned.")
	public static SystemMessageId AN_AIRSHIP_CANNOT_BE_SUMMONED_BECAUSE_EITHER_YOU_HAVE_NOT_REGISTERED_YOUR_AIRSHIP_LICENSE_OR_THE_AIRSHIP_HAS_NOT_YET_BEEN_SUMMONED;
	
	@ClientString(id = 2458, message = "Your clan's airship is already being used by another clan member.")
	public static SystemMessageId YOUR_CLAN_S_AIRSHIP_IS_ALREADY_BEING_USED_BY_ANOTHER_CLAN_MEMBER;
	
	@ClientString(id = 2459, message = "The Airship Summon License has already been acquired.")
	public static SystemMessageId THE_AIRSHIP_SUMMON_LICENSE_HAS_ALREADY_BEEN_ACQUIRED;
	
	@ClientString(id = 2460, message = "The clan owned airship already exists.")
	public static SystemMessageId THE_CLAN_OWNED_AIRSHIP_ALREADY_EXISTS;
	
	@ClientString(id = 2461, message = "Airship Summon License registration can only be done by the clan leader.")
	public static SystemMessageId AIRSHIP_SUMMON_LICENSE_REGISTRATION_CAN_ONLY_BE_DONE_BY_THE_CLAN_LEADER;
	
	@ClientString(id = 2462, message = "An airship cannot be summoned because you don't have enough $s1.")
	public static SystemMessageId AN_AIRSHIP_CANNOT_BE_SUMMONED_BECAUSE_YOU_DON_T_HAVE_ENOUGH_S1;
	
	@ClientString(id = 2463, message = "The airship's fuel (EP) will soon run out.")
	public static SystemMessageId THE_AIRSHIP_S_FUEL_EP_WILL_SOON_RUN_OUT;
	
	@ClientString(id = 2464, message = "The airship's fuel (EP) has run out. The airship's speed will be greatly decreased in this condition.")
	public static SystemMessageId THE_AIRSHIP_S_FUEL_EP_HAS_RUN_OUT_THE_AIRSHIP_S_SPEED_WILL_BE_GREATLY_DECREASED_IN_THIS_CONDITION;
	
	@ClientString(id = 2465, message = "You have selected a 3 vs. 3 classless match. Proceed?")
	public static SystemMessageId YOU_HAVE_SELECTED_A_3_VS_3_CLASSLESS_MATCH_PROCEED;
	
	@ClientString(id = 2466, message = "A pet on auxiliary mode cannot use skills.")
	public static SystemMessageId A_PET_ON_AUXILIARY_MODE_CANNOT_USE_SKILLS;
	
	@ClientString(id = 2467, message = "Do you wish to begin the game now?")
	public static SystemMessageId DO_YOU_WISH_TO_BEGIN_THE_GAME_NOW;
	
	@ClientString(id = 2468, message = "You have used a report point on $c1. You have $s2 points remaining on this account.")
	public static SystemMessageId YOU_HAVE_USED_A_REPORT_POINT_ON_C1_YOU_HAVE_S2_POINTS_REMAINING_ON_THIS_ACCOUNT;
	
	@ClientString(id = 2469, message = "You have used all available points. Points are reset everyday at noon.")
	public static SystemMessageId YOU_HAVE_USED_ALL_AVAILABLE_POINTS_POINTS_ARE_RESET_EVERYDAY_AT_NOON;
	
	@ClientString(id = 2470, message = "This character cannot make a report. You cannot make a report while located inside a peace zone or a battleground, while you are an opposing clan member during a clan war, or while participating in the Olympiad.")
	public static SystemMessageId THIS_CHARACTER_CANNOT_MAKE_A_REPORT_YOU_CANNOT_MAKE_A_REPORT_WHILE_LOCATED_INSIDE_A_PEACE_ZONE_OR_A_BATTLEGROUND_WHILE_YOU_ARE_AN_OPPOSING_CLAN_MEMBER_DURING_A_CLAN_WAR_OR_WHILE_PARTICIPATING_IN_THE_OLYMPIAD;
	
	@ClientString(id = 2471, message = "This character cannot make a report. The target has already been reported by either your clan or alliance, or has already been reported from your current IP.")
	public static SystemMessageId THIS_CHARACTER_CANNOT_MAKE_A_REPORT_THE_TARGET_HAS_ALREADY_BEEN_REPORTED_BY_EITHER_YOUR_CLAN_OR_ALLIANCE_OR_HAS_ALREADY_BEEN_REPORTED_FROM_YOUR_CURRENT_IP;
	
	@ClientString(id = 2472, message = "This character cannot make a report because another character from this account has already done so.")
	public static SystemMessageId THIS_CHARACTER_CANNOT_MAKE_A_REPORT_BECAUSE_ANOTHER_CHARACTER_FROM_THIS_ACCOUNT_HAS_ALREADY_DONE_SO;
	
	@ClientString(id = 2473, message = "You have been reported as an illegal program user, so your chatting will be blocked for 10 minutes.")
	public static SystemMessageId YOU_HAVE_BEEN_REPORTED_AS_AN_ILLEGAL_PROGRAM_USER_SO_YOUR_CHATTING_WILL_BE_BLOCKED_FOR_10_MINUTES;
	
	@ClientString(id = 2474, message = "You have been reported as an illegal program user, so your party participation will be blocked for 60 minutes.")
	public static SystemMessageId YOU_HAVE_BEEN_REPORTED_AS_AN_ILLEGAL_PROGRAM_USER_SO_YOUR_PARTY_PARTICIPATION_WILL_BE_BLOCKED_FOR_60_MINUTES;
	
	@ClientString(id = 2475, message = "You have been reported as an illegal program user, so your party participation will be blocked for 120 minutes.")
	public static SystemMessageId YOU_HAVE_BEEN_REPORTED_AS_AN_ILLEGAL_PROGRAM_USER_SO_YOUR_PARTY_PARTICIPATION_WILL_BE_BLOCKED_FOR_120_MINUTES;
	
	@ClientString(id = 2476, message = "You have been reported as an illegal program user, so your party participation will be blocked for 180 minutes.")
	public static SystemMessageId YOU_HAVE_BEEN_REPORTED_AS_AN_ILLEGAL_PROGRAM_USER_SO_YOUR_PARTY_PARTICIPATION_WILL_BE_BLOCKED_FOR_180_MINUTES;
	
	@ClientString(id = 2477, message = "You have been reported as an illegal program user, so your actions will be restricted for 120 minutes.")
	public static SystemMessageId YOU_HAVE_BEEN_REPORTED_AS_AN_ILLEGAL_PROGRAM_USER_SO_YOUR_ACTIONS_WILL_BE_RESTRICTED_FOR_120_MINUTES;
	
	@ClientString(id = 2478, message = "You have been reported as an illegal program user, so your actions will be restricted for 180 minutes.")
	public static SystemMessageId YOU_HAVE_BEEN_REPORTED_AS_AN_ILLEGAL_PROGRAM_USER_SO_YOUR_ACTIONS_WILL_BE_RESTRICTED_FOR_180_MINUTES;
	
	@ClientString(id = 2479, message = "You have been reported as an illegal program user, so your actions will be restricted for 180 minutes.")
	public static SystemMessageId YOU_HAVE_BEEN_REPORTED_AS_AN_ILLEGAL_PROGRAM_USER_SO_YOUR_ACTIONS_WILL_BE_RESTRICTED_FOR_180_MINUTES2;
	
	@ClientString(id = 2480, message = "You have been reported as an illegal program user, so movement is prohibited for 120 minutes.")
	public static SystemMessageId YOU_HAVE_BEEN_REPORTED_AS_AN_ILLEGAL_PROGRAM_USER_SO_MOVEMENT_IS_PROHIBITED_FOR_120_MINUTES;
	
	@ClientString(id = 2481, message = "$c1 has been reported as an illegal program user and is currently being investigated.")
	public static SystemMessageId C1_HAS_BEEN_REPORTED_AS_AN_ILLEGAL_PROGRAM_USER_AND_IS_CURRENTLY_BEING_INVESTIGATED;
	
	@ClientString(id = 2482, message = "$c1 has been reported as an illegal program user and cannot join a party.")
	public static SystemMessageId C1_HAS_BEEN_REPORTED_AS_AN_ILLEGAL_PROGRAM_USER_AND_CANNOT_JOIN_A_PARTY;
	
	@ClientString(id = 2483, message = "You have been reported as an illegal program user, so chatting is not allowed.")
	public static SystemMessageId YOU_HAVE_BEEN_REPORTED_AS_AN_ILLEGAL_PROGRAM_USER_SO_CHATTING_IS_NOT_ALLOWED;
	
	@ClientString(id = 2484, message = "You have been reported as an illegal program user, so participating in a party is not allowed.")
	public static SystemMessageId YOU_HAVE_BEEN_REPORTED_AS_AN_ILLEGAL_PROGRAM_USER_SO_PARTICIPATING_IN_A_PARTY_IS_NOT_ALLOWED;
	
	@ClientString(id = 2485, message = "You have been reported as an illegal program user so your actions have been restricted.")
	public static SystemMessageId YOU_HAVE_BEEN_REPORTED_AS_AN_ILLEGAL_PROGRAM_USER_SO_YOUR_ACTIONS_HAVE_BEEN_RESTRICTED;
	
	@ClientString(id = 2486, message = "You have been blocked due to verification that you are using a third party program. Subsequent violations may result in termination of your account rather than a penalty within the game.")
	public static SystemMessageId YOU_HAVE_BEEN_BLOCKED_DUE_TO_VERIFICATION_THAT_YOU_ARE_USING_A_THIRD_PARTY_PROGRAM_SUBSEQUENT_VIOLATIONS_MAY_RESULT_IN_TERMINATION_OF_YOUR_ACCOUNT_RATHER_THAN_A_PENALTY_WITHIN_THE_GAME;
	
	@ClientString(id = 2487, message = "You have been reported as an illegal program user, and your connection has been ended. Please contact our CS team to confirm your identity.")
	public static SystemMessageId YOU_HAVE_BEEN_REPORTED_AS_AN_ILLEGAL_PROGRAM_USER_AND_YOUR_CONNECTION_HAS_BEEN_ENDED_PLEASE_CONTACT_OUR_CS_TEAM_TO_CONFIRM_YOUR_IDENTITY;
	
	@ClientString(id = 2488, message = "You cannot enter the Aerial Cleft because you are below the required level. Entry is possible only at level 75 or above.")
	public static SystemMessageId YOU_CANNOT_ENTER_THE_AERIAL_CLEFT_BECAUSE_YOU_ARE_BELOW_THE_REQUIRED_LEVEL_ENTRY_IS_POSSIBLE_ONLY_AT_LEVEL_75_OR_ABOVE;
	
	@ClientString(id = 2489, message = "You must target a control device in order to perform this action.")
	public static SystemMessageId YOU_MUST_TARGET_A_CONTROL_DEVICE_IN_ORDER_TO_PERFORM_THIS_ACTION;
	
	@ClientString(id = 2490, message = "You cannot perform this action because you are too far away from the control device.")
	public static SystemMessageId YOU_CANNOT_PERFORM_THIS_ACTION_BECAUSE_YOU_ARE_TOO_FAR_AWAY_FROM_THE_CONTROL_DEVICE;
	
	@ClientString(id = 2491, message = "Your airship cannot teleport because due to low fuel.")
	public static SystemMessageId YOUR_AIRSHIP_CANNOT_TELEPORT_BECAUSE_DUE_TO_LOW_FUEL;
	
	@ClientString(id = 2492, message = "The airship has been summoned. It will automatically depart in %s minute(s).")
	public static SystemMessageId THE_AIRSHIP_HAS_BEEN_SUMMONED_IT_WILL_AUTOMATICALLY_DEPART_IN_S_MINUTE_S;
	
	@ClientString(id = 2493, message = "Enter chat mode is automatically enabled when you are in a flying transformation state.")
	public static SystemMessageId ENTER_CHAT_MODE_IS_AUTOMATICALLY_ENABLED_WHEN_YOU_ARE_IN_A_FLYING_TRANSFORMATION_STATE;
	
	@ClientString(id = 2494, message = "Enter chat mode is automatically enabled when you are in airship control mode.")
	public static SystemMessageId ENTER_CHAT_MODE_IS_AUTOMATICALLY_ENABLED_WHEN_YOU_ARE_IN_AIRSHIP_CONTROL_MODE;
	
	@ClientString(id = 2495, message = "W (go forward), S (stop), A (turn left), D (turn right), E (increase altitude) and Q (decrease altitude).")
	public static SystemMessageId W_GO_FORWARD_S_STOP_A_TURN_LEFT_D_TURN_RIGHT_E_INCREASE_ALTITUDE_AND_Q_DECREASE_ALTITUDE;
	
	@ClientString(id = 2496, message = "When you click on a skill designated on your shortcut bar, that slot is activated. Once activated, you can press the spacebar to execute the designated skill.")
	public static SystemMessageId WHEN_YOU_CLICK_ON_A_SKILL_DESIGNATED_ON_YOUR_SHORTCUT_BAR_THAT_SLOT_IS_ACTIVATED_ONCE_ACTIVATED_YOU_CAN_PRESS_THE_SPACEBAR_TO_EXECUTE_THE_DESIGNATED_SKILL;
	
	@ClientString(id = 2497, message = "To stop receiving the above tip, please check the box next to Disable Game Tips from your Options menu.")
	public static SystemMessageId TO_STOP_RECEIVING_THE_ABOVE_TIP_PLEASE_CHECK_THE_BOX_NEXT_TO_DISABLE_GAME_TIPS_FROM_YOUR_OPTIONS_MENU;
	
	@ClientString(id = 2498, message = "While piloting an airship, you can change your altitude using the button at the center of the helm image.")
	public static SystemMessageId WHILE_PILOTING_AN_AIRSHIP_YOU_CAN_CHANGE_YOUR_ALTITUDE_USING_THE_BUTTON_AT_THE_CENTER_OF_THE_HELM_IMAGE;
	
	@ClientString(id = 2499, message = "You cannot collect because someone else is already collecting.")
	public static SystemMessageId YOU_CANNOT_COLLECT_BECAUSE_SOMEONE_ELSE_IS_ALREADY_COLLECTING;
	
	@ClientString(id = 2500, message = "Your collection has succeeded.")
	public static SystemMessageId YOUR_COLLECTION_HAS_SUCCEEDED;
	
	@ClientString(id = 2501, message = "You will be moved to the previous chatting channel tab.")
	public static SystemMessageId YOU_WILL_BE_MOVED_TO_THE_PREVIOUS_CHATTING_CHANNEL_TAB;
	
	@ClientString(id = 2502, message = "You will be moved to the next chatting channel tab.")
	public static SystemMessageId YOU_WILL_BE_MOVED_TO_THE_NEXT_CHATTING_CHANNEL_TAB;
	
	@ClientString(id = 2504, message = "You may enter the chatting content.")
	public static SystemMessageId YOU_MAY_ENTER_THE_CHATTING_CONTENT;
	
	@ClientString(id = 2505, message = "Opens or closes the inventory window.")
	public static SystemMessageId OPENS_OR_CLOSES_THE_INVENTORY_WINDOW;
	
	@ClientString(id = 2506, message = "Temporarily hides all open windows.")
	public static SystemMessageId TEMPORARILY_HIDES_ALL_OPEN_WINDOWS;
	
	@ClientString(id = 2507, message = "Closes all open windows.")
	public static SystemMessageId CLOSES_ALL_OPEN_WINDOWS;
	
	@ClientString(id = 2508, message = "Opens the GM manager window.")
	public static SystemMessageId OPENS_THE_GM_MANAGER_WINDOW;
	
	@ClientString(id = 2509, message = "Opens the GM petition window.")
	public static SystemMessageId OPENS_THE_GM_PETITION_WINDOW;
	
	@ClientString(id = 2510, message = "The buff in the party window is toggled. Buff for one input, debuff for two inputs, a song and dance for three inputs, turnoff for 4 inputs")
	public static SystemMessageId THE_BUFF_IN_THE_PARTY_WINDOW_IS_TOGGLED_BUFF_FOR_ONE_INPUT_DEBUFF_FOR_TWO_INPUTS_A_SONG_AND_DANCE_FOR_THREE_INPUTS_TURNOFF_FOR_4_INPUTS;
	
	@ClientString(id = 2511, message = "Activates or deactivates minimum frame function.")
	public static SystemMessageId ACTIVATES_OR_DEACTIVATES_MINIMUM_FRAME_FUNCTION;
	
	@ClientString(id = 2512, message = "Friend Manager window is opened or closed.")
	public static SystemMessageId FRIEND_MANAGER_WINDOW_IS_OPENED_OR_CLOSED;
	
	@ClientString(id = 2513, message = "Assign 1st slot shortcut in the shortcut base window.")
	public static SystemMessageId ASSIGN_1ST_SLOT_SHORTCUT_IN_THE_SHORTCUT_BASE_WINDOW;
	
	@ClientString(id = 2514, message = "Assign 2nd slot shortcut in the shortcut base window.")
	public static SystemMessageId ASSIGN_2ND_SLOT_SHORTCUT_IN_THE_SHORTCUT_BASE_WINDOW;
	
	@ClientString(id = 2515, message = "Assign 3rd slot shortcut in the shortcut base window.")
	public static SystemMessageId ASSIGN_3RD_SLOT_SHORTCUT_IN_THE_SHORTCUT_BASE_WINDOW;
	
	@ClientString(id = 2516, message = "Assign 4th slot shortcut in the shortcut base window.")
	public static SystemMessageId ASSIGN_4TH_SLOT_SHORTCUT_IN_THE_SHORTCUT_BASE_WINDOW;
	
	@ClientString(id = 2517, message = "Assign 5th slot shortcut in the shortcut base window.")
	public static SystemMessageId ASSIGN_5TH_SLOT_SHORTCUT_IN_THE_SHORTCUT_BASE_WINDOW;
	
	@ClientString(id = 2518, message = "Assign 6th slot shortcut in the shortcut base window.")
	public static SystemMessageId ASSIGN_6TH_SLOT_SHORTCUT_IN_THE_SHORTCUT_BASE_WINDOW;
	
	@ClientString(id = 2519, message = "Assign 7th slot shortcut in the shortcut base window.")
	public static SystemMessageId ASSIGN_7TH_SLOT_SHORTCUT_IN_THE_SHORTCUT_BASE_WINDOW;
	
	@ClientString(id = 2520, message = "Assign 8th slot shortcut in the shortcut base window.")
	public static SystemMessageId ASSIGN_8TH_SLOT_SHORTCUT_IN_THE_SHORTCUT_BASE_WINDOW;
	
	@ClientString(id = 2521, message = "Assign 9th slot shortcut in the shortcut base window.")
	public static SystemMessageId ASSIGN_9TH_SLOT_SHORTCUT_IN_THE_SHORTCUT_BASE_WINDOW;
	
	@ClientString(id = 2522, message = "Assign 10th slot shortcut in the shortcut base window.")
	public static SystemMessageId ASSIGN_10TH_SLOT_SHORTCUT_IN_THE_SHORTCUT_BASE_WINDOW;
	
	@ClientString(id = 2523, message = "Assign 11th slot shortcut in the shortcut base window.")
	public static SystemMessageId ASSIGN_11TH_SLOT_SHORTCUT_IN_THE_SHORTCUT_BASE_WINDOW;
	
	@ClientString(id = 2524, message = "Assign 12th slot shortcut in the shortcut base window.")
	public static SystemMessageId ASSIGN_12TH_SLOT_SHORTCUT_IN_THE_SHORTCUT_BASE_WINDOW;
	
	@ClientString(id = 2525, message = "Assign 1st slot shortcut in the 1st shortcut expanded window.")
	public static SystemMessageId ASSIGN_1ST_SLOT_SHORTCUT_IN_THE_1ST_SHORTCUT_EXPANDED_WINDOW;
	
	@ClientString(id = 2526, message = "Assign 2nd slot shortcut in the 1st shortcut expanded window.")
	public static SystemMessageId ASSIGN_2ND_SLOT_SHORTCUT_IN_THE_1ST_SHORTCUT_EXPANDED_WINDOW;
	
	@ClientString(id = 2527, message = "Assign 3rd slot shortcut in the 1st shortcut expanded window.")
	public static SystemMessageId ASSIGN_3RD_SLOT_SHORTCUT_IN_THE_1ST_SHORTCUT_EXPANDED_WINDOW;
	
	@ClientString(id = 2528, message = "Assign 4th slot shortcut in the 1st shortcut expanded window.")
	public static SystemMessageId ASSIGN_4TH_SLOT_SHORTCUT_IN_THE_1ST_SHORTCUT_EXPANDED_WINDOW;
	
	@ClientString(id = 2529, message = "Assign 5th slot shortcut in the 1st shortcut expanded window.")
	public static SystemMessageId ASSIGN_5TH_SLOT_SHORTCUT_IN_THE_1ST_SHORTCUT_EXPANDED_WINDOW;
	
	@ClientString(id = 2530, message = "Assign 6th slot shortcut in the 1st shortcut expanded window.")
	public static SystemMessageId ASSIGN_6TH_SLOT_SHORTCUT_IN_THE_1ST_SHORTCUT_EXPANDED_WINDOW;
	
	@ClientString(id = 2531, message = "Assign 7th slot shortcut in the 1st shortcut expanded window.")
	public static SystemMessageId ASSIGN_7TH_SLOT_SHORTCUT_IN_THE_1ST_SHORTCUT_EXPANDED_WINDOW;
	
	@ClientString(id = 2532, message = "Assign 8th slot shortcut in the 1st shortcut expanded window.")
	public static SystemMessageId ASSIGN_8TH_SLOT_SHORTCUT_IN_THE_1ST_SHORTCUT_EXPANDED_WINDOW;
	
	@ClientString(id = 2533, message = "Assign 9th slot shortcut in the 1st shortcut expanded window.")
	public static SystemMessageId ASSIGN_9TH_SLOT_SHORTCUT_IN_THE_1ST_SHORTCUT_EXPANDED_WINDOW;
	
	@ClientString(id = 2534, message = "Assign 10th slot shortcut in the 1st shortcut expanded window.")
	public static SystemMessageId ASSIGN_10TH_SLOT_SHORTCUT_IN_THE_1ST_SHORTCUT_EXPANDED_WINDOW;
	
	@ClientString(id = 2535, message = "Assign 11th slot shortcut in the 1st shortcut expanded window.")
	public static SystemMessageId ASSIGN_11TH_SLOT_SHORTCUT_IN_THE_1ST_SHORTCUT_EXPANDED_WINDOW;
	
	@ClientString(id = 2536, message = "Assign 12th slot shortcut in the 1st shortcut expanded window.")
	public static SystemMessageId ASSIGN_12TH_SLOT_SHORTCUT_IN_THE_1ST_SHORTCUT_EXPANDED_WINDOW;
	
	@ClientString(id = 2537, message = "Assign 1st slot shortcut in the 2nd shortcut expanded window.")
	public static SystemMessageId ASSIGN_1ST_SLOT_SHORTCUT_IN_THE_2ND_SHORTCUT_EXPANDED_WINDOW;
	
	@ClientString(id = 2538, message = "Assign 2nd slot shortcut in the 2nd shortcut expanded window.")
	public static SystemMessageId ASSIGN_2ND_SLOT_SHORTCUT_IN_THE_2ND_SHORTCUT_EXPANDED_WINDOW;
	
	@ClientString(id = 2539, message = "Assign 3rd slot shortcut in the 2nd shortcut expanded window.")
	public static SystemMessageId ASSIGN_3RD_SLOT_SHORTCUT_IN_THE_2ND_SHORTCUT_EXPANDED_WINDOW;
	
	@ClientString(id = 2540, message = "Assign 4th slot shortcut in the 2nd shortcut expanded window.")
	public static SystemMessageId ASSIGN_4TH_SLOT_SHORTCUT_IN_THE_2ND_SHORTCUT_EXPANDED_WINDOW;
	
	@ClientString(id = 2541, message = "Assign 5th slot shortcut in the 2nd shortcut expanded window.")
	public static SystemMessageId ASSIGN_5TH_SLOT_SHORTCUT_IN_THE_2ND_SHORTCUT_EXPANDED_WINDOW;
	
	@ClientString(id = 2542, message = "Assign 6th slot shortcut in the 2nd shortcut expanded window.")
	public static SystemMessageId ASSIGN_6TH_SLOT_SHORTCUT_IN_THE_2ND_SHORTCUT_EXPANDED_WINDOW;
	
	@ClientString(id = 2543, message = "Assign 7th slot shortcut in the 2nd shortcut expanded window.")
	public static SystemMessageId ASSIGN_7TH_SLOT_SHORTCUT_IN_THE_2ND_SHORTCUT_EXPANDED_WINDOW;
	
	@ClientString(id = 2544, message = "Assign 8th slot shortcut in the 2nd shortcut expanded window.")
	public static SystemMessageId ASSIGN_8TH_SLOT_SHORTCUT_IN_THE_2ND_SHORTCUT_EXPANDED_WINDOW;
	
	@ClientString(id = 2545, message = "Assign 9th slot shortcut in the 2nd shortcut expanded window.")
	public static SystemMessageId ASSIGN_9TH_SLOT_SHORTCUT_IN_THE_2ND_SHORTCUT_EXPANDED_WINDOW;
	
	@ClientString(id = 2546, message = "Assign 10th slot shortcut in the 2nd shortcut expanded window.")
	public static SystemMessageId ASSIGN_10TH_SLOT_SHORTCUT_IN_THE_2ND_SHORTCUT_EXPANDED_WINDOW;
	
	@ClientString(id = 2547, message = "Assign 11th slot shortcut in the 2nd shortcut expanded window.")
	public static SystemMessageId ASSIGN_11TH_SLOT_SHORTCUT_IN_THE_2ND_SHORTCUT_EXPANDED_WINDOW;
	
	@ClientString(id = 2548, message = "Assign 12th slot shortcut in the 2nd shortcut expanded window.")
	public static SystemMessageId ASSIGN_12TH_SLOT_SHORTCUT_IN_THE_2ND_SHORTCUT_EXPANDED_WINDOW;
	
	@ClientString(id = 2549, message = "Move to the shortcut base window's shortcut page 1.")
	public static SystemMessageId MOVE_TO_THE_SHORTCUT_BASE_WINDOW_S_SHORTCUT_PAGE_1;
	
	@ClientString(id = 2550, message = "Move to the shortcut base window's shortcut page 2.")
	public static SystemMessageId MOVE_TO_THE_SHORTCUT_BASE_WINDOW_S_SHORTCUT_PAGE_2;
	
	@ClientString(id = 2551, message = "Move to the shortcut base window's shortcut page 3.")
	public static SystemMessageId MOVE_TO_THE_SHORTCUT_BASE_WINDOW_S_SHORTCUT_PAGE_3;
	
	@ClientString(id = 2552, message = "Move to the shortcut base window's shortcut page 4.")
	public static SystemMessageId MOVE_TO_THE_SHORTCUT_BASE_WINDOW_S_SHORTCUT_PAGE_4;
	
	@ClientString(id = 2553, message = "Move to the shortcut base window's shortcut page 5.")
	public static SystemMessageId MOVE_TO_THE_SHORTCUT_BASE_WINDOW_S_SHORTCUT_PAGE_5;
	
	@ClientString(id = 2554, message = "Move to the shortcut base window's shortcut page 6.")
	public static SystemMessageId MOVE_TO_THE_SHORTCUT_BASE_WINDOW_S_SHORTCUT_PAGE_6;
	
	@ClientString(id = 2555, message = "Move to the shortcut base window's shortcut page 7.")
	public static SystemMessageId MOVE_TO_THE_SHORTCUT_BASE_WINDOW_S_SHORTCUT_PAGE_7;
	
	@ClientString(id = 2556, message = "Move to the shortcut base window's shortcut page 8.")
	public static SystemMessageId MOVE_TO_THE_SHORTCUT_BASE_WINDOW_S_SHORTCUT_PAGE_8;
	
	@ClientString(id = 2557, message = "Move to the shortcut base window's shortcut page 9.")
	public static SystemMessageId MOVE_TO_THE_SHORTCUT_BASE_WINDOW_S_SHORTCUT_PAGE_9;
	
	@ClientString(id = 2558, message = "Move to the shortcut base window's shortcut page 10.")
	public static SystemMessageId MOVE_TO_THE_SHORTCUT_BASE_WINDOW_S_SHORTCUT_PAGE_10;
	
	@ClientString(id = 2559, message = "Open and close action window that the character can do.")
	public static SystemMessageId OPEN_AND_CLOSE_ACTION_WINDOW_THAT_THE_CHARACTER_CAN_DO;
	
	@ClientString(id = 2560, message = "Opens and closes the game bulletin board.")
	public static SystemMessageId OPENS_AND_CLOSES_THE_GAME_BULLETIN_BOARD;
	
	@ClientString(id = 2561, message = "Opens and closes the calculator.")
	public static SystemMessageId OPENS_AND_CLOSES_THE_CALCULATOR;
	
	@ClientString(id = 2562, message = "You may hide and view the chatting window.")
	public static SystemMessageId YOU_MAY_HIDE_AND_VIEW_THE_CHATTING_WINDOW;
	
	@ClientString(id = 2563, message = "Opens and closes the clan window, confirming information of the included clan and performs the various set-ups related to the clan.")
	public static SystemMessageId OPENS_AND_CLOSES_THE_CLAN_WINDOW_CONFIRMING_INFORMATION_OF_THE_INCLUDED_CLAN_AND_PERFORMS_THE_VARIOUS_SET_UPS_RELATED_TO_THE_CLAN;
	
	@ClientString(id = 2564, message = "Opens and closes the status window, showing the detailed status of a character that you created.")
	public static SystemMessageId OPENS_AND_CLOSES_THE_STATUS_WINDOW_SHOWING_THE_DETAILED_STATUS_OF_A_CHARACTER_THAT_YOU_CREATED;
	
	@ClientString(id = 2565, message = "Opens and closes the help window.")
	public static SystemMessageId OPENS_AND_CLOSES_THE_HELP_WINDOW;
	
	@ClientString(id = 2566, message = "Opens or closes the inventory window.")
	public static SystemMessageId OPENS_OR_CLOSES_THE_INVENTORY_WINDOW2;
	
	@ClientString(id = 2567, message = "Opens and closes the macro window for macro settings.")
	public static SystemMessageId OPENS_AND_CLOSES_THE_MACRO_WINDOW_FOR_MACRO_SETTINGS;
	
	@ClientString(id = 2568, message = "Opens and closes the skill window, displaying the list of skills that you can use.")
	public static SystemMessageId OPENS_AND_CLOSES_THE_SKILL_WINDOW_DISPLAYING_THE_LIST_OF_SKILLS_THAT_YOU_CAN_USE;
	
	@ClientString(id = 2569, message = "Not in use")
	public static SystemMessageId NOT_IN_USE;
	
	@ClientString(id = 2570, message = "Opens and closes the mini map, showing detailed information about the game world.")
	public static SystemMessageId OPENS_AND_CLOSES_THE_MINI_MAP_SHOWING_DETAILED_INFORMATION_ABOUT_THE_GAME_WORLD;
	
	@ClientString(id = 2571, message = "Opens and closes the option window.")
	public static SystemMessageId OPENS_AND_CLOSES_THE_OPTION_WINDOW;
	
	@ClientString(id = 2572, message = "Open and close the party matching window, useful in organizing a party by helping to easily find other members looking for a party.")
	public static SystemMessageId OPEN_AND_CLOSE_THE_PARTY_MATCHING_WINDOW_USEFUL_IN_ORGANIZING_A_PARTY_BY_HELPING_TO_EASILY_FIND_OTHER_MEMBERS_LOOKING_FOR_A_PARTY;
	
	@ClientString(id = 2573, message = "Open and close the quest journal, displaying the progress of quests.")
	public static SystemMessageId OPEN_AND_CLOSE_THE_QUEST_JOURNAL_DISPLAYING_THE_PROGRESS_OF_QUESTS;
	
	@ClientString(id = 2574, message = "Hides or re-opens the Radar Map, which always appears by default.")
	public static SystemMessageId HIDES_OR_RE_OPENS_THE_RADAR_MAP_WHICH_ALWAYS_APPEARS_BY_DEFAULT;
	
	@ClientString(id = 2575, message = "Hide or show the status window, the window will show by default.")
	public static SystemMessageId HIDE_OR_SHOW_THE_STATUS_WINDOW_THE_WINDOW_WILL_SHOW_BY_DEFAULT;
	
	@ClientString(id = 2576, message = "Opens and closes the system menu window, enables detailed menu selection.")
	public static SystemMessageId OPENS_AND_CLOSES_THE_SYSTEM_MENU_WINDOW_ENABLES_DETAILED_MENU_SELECTION;
	
	@ClientString(id = 2577, message = "Show or hide items dropped on the ground.")
	public static SystemMessageId SHOW_OR_HIDE_ITEMS_DROPPED_ON_THE_GROUND;
	
	@ClientString(id = 2578, message = "Send whispers to a targeted character.")
	public static SystemMessageId SEND_WHISPERS_TO_A_TARGETED_CHARACTER;
	
	@ClientString(id = 2579, message = "Turns off all game sounds.")
	public static SystemMessageId TURNS_OFF_ALL_GAME_SOUNDS;
	
	@ClientString(id = 2580, message = "Expands each shortcut window.")
	public static SystemMessageId EXPANDS_EACH_SHORTCUT_WINDOW;
	
	@ClientString(id = 2581, message = "Reset all positions of all windows.")
	public static SystemMessageId RESET_ALL_POSITIONS_OF_ALL_WINDOWS;
	
	@ClientString(id = 2582, message = "Spin my character or mountable to the left.")
	public static SystemMessageId SPIN_MY_CHARACTER_OR_MOUNTABLE_TO_THE_LEFT;
	
	@ClientString(id = 2583, message = "Spin my character or mountable to the right.")
	public static SystemMessageId SPIN_MY_CHARACTER_OR_MOUNTABLE_TO_THE_RIGHT;
	
	@ClientString(id = 2584, message = "Spin my character or mountable forward.")
	public static SystemMessageId SPIN_MY_CHARACTER_OR_MOUNTABLE_FORWARD;
	
	@ClientString(id = 2585, message = "Spin my character or mountable to the rear.")
	public static SystemMessageId SPIN_MY_CHARACTER_OR_MOUNTABLE_TO_THE_REAR;
	
	@ClientString(id = 2586, message = "Change character's direction to match the camera's POV.")
	public static SystemMessageId CHANGE_CHARACTER_S_DIRECTION_TO_MATCH_THE_CAMERA_S_POV;
	
	@ClientString(id = 2587, message = "Not in use")
	public static SystemMessageId NOT_IN_USE2;
	
	@ClientString(id = 2588, message = "Not in use")
	public static SystemMessageId NOT_IN_USE3;
	
	@ClientString(id = 2589, message = "Character or the mount turns around 180 degrees. It's useful to turn back quickly during game play.")
	public static SystemMessageId CHARACTER_OR_THE_MOUNT_TURNS_AROUND_180_DEGREES_IT_S_USEFUL_TO_TURN_BACK_QUICKLY_DURING_GAME_PLAY;
	
	@ClientString(id = 2590, message = "Opens the GM manager window.")
	public static SystemMessageId OPENS_THE_GM_MANAGER_WINDOW2;
	
	@ClientString(id = 2591, message = "Opens the GM petition window.")
	public static SystemMessageId OPENS_THE_GM_PETITION_WINDOW2;
	
	@ClientString(id = 2593, message = "Turns the view point of character or the mount into first person POV.")
	public static SystemMessageId TURNS_THE_VIEW_POINT_OF_CHARACTER_OR_THE_MOUNT_INTO_FIRST_PERSON_POV;
	
	@ClientString(id = 2594, message = "Turns the view point of character or the mount into third person POV.")
	public static SystemMessageId TURNS_THE_VIEW_POINT_OF_CHARACTER_OR_THE_MOUNT_INTO_THIRD_PERSON_POV;
	
	@ClientString(id = 2595, message = "Reset the viewing point of my character or mountable.")
	public static SystemMessageId RESET_THE_VIEWING_POINT_OF_MY_CHARACTER_OR_MOUNTABLE;
	
	@ClientString(id = 2596, message = "No translation required")
	public static SystemMessageId NO_TRANSLATION_REQUIRED;
	
	@ClientString(id = 2597, message = "No translation required")
	public static SystemMessageId NO_TRANSLATION_REQUIRED2;
	
	@ClientString(id = 2598, message = "No translation required")
	public static SystemMessageId NO_TRANSLATION_REQUIRED3;
	
	@ClientString(id = 2599, message = "No translation required")
	public static SystemMessageId NO_TRANSLATION_REQUIRED4;
	
	@ClientString(id = 2701, message = "The match is being prepared. Please try again later.")
	public static SystemMessageId THE_MATCH_IS_BEING_PREPARED_PLEASE_TRY_AGAIN_LATER;
	
	@ClientString(id = 2702, message = "You were excluded from the match because the registration count was not correct.")
	public static SystemMessageId YOU_WERE_EXCLUDED_FROM_THE_MATCH_BECAUSE_THE_REGISTRATION_COUNT_WAS_NOT_CORRECT;
	
	@ClientString(id = 2703, message = "Team members were modified because the teams were unbalanced.")
	public static SystemMessageId TEAM_MEMBERS_WERE_MODIFIED_BECAUSE_THE_TEAMS_WERE_UNBALANCED;
	
	@ClientString(id = 2704, message = "You cannot register because capacity has been exceeded.")
	public static SystemMessageId YOU_CANNOT_REGISTER_BECAUSE_CAPACITY_HAS_BEEN_EXCEEDED;
	
	@ClientString(id = 2705, message = "The match waiting time was extended by 1 minute.")
	public static SystemMessageId THE_MATCH_WAITING_TIME_WAS_EXTENDED_BY_1_MINUTE;
	
	@ClientString(id = 2706, message = "You cannot enter because you do not meet the requirements.")
	public static SystemMessageId YOU_CANNOT_ENTER_BECAUSE_YOU_DO_NOT_MEET_THE_REQUIREMENTS;
	
	@ClientString(id = 2707, message = "You must wait 10 seconds before attempting to register again.")
	public static SystemMessageId YOU_MUST_WAIT_10_SECONDS_BEFORE_ATTEMPTING_TO_REGISTER_AGAIN;
	
	@ClientString(id = 2708, message = "You cannot register while in possession of a cursed weapon.")
	public static SystemMessageId YOU_CANNOT_REGISTER_WHILE_IN_POSSESSION_OF_A_CURSED_WEAPON;
	
	@ClientString(id = 2709, message = "Applicants for the Olympiad, Underground Coliseum, or Kratei's Cube matches cannot register.")
	public static SystemMessageId APPLICANTS_FOR_THE_OLYMPIAD_UNDERGROUND_COLISEUM_OR_KRATEI_S_CUBE_MATCHES_CANNOT_REGISTER;
	
	@ClientString(id = 2710, message = "Current location: $s1 / $s2 / $s3 (near the Keucereus Alliance Base)")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3_NEAR_THE_KEUCEREUS_ALLIANCE_BASE;
	
	@ClientString(id = 2711, message = "Current location: $s1 / $s2 / $s3 (inside the Seed of Infinity)")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3_INSIDE_THE_SEED_OF_INFINITY;
	
	@ClientString(id = 2712, message = "Current location: $s1 / $s2 / $s3 (outside the Seed of Infinity)")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3_OUTSIDE_THE_SEED_OF_INFINITY;
	
	@ClientString(id = 2713, message = "------------------------------------------------------")
	public static SystemMessageId EMPTY7;
	
	@ClientString(id = 2714, message = "----------------------------------------------------------------------")
	public static SystemMessageId EMPTY8;
	
	@ClientString(id = 2715, message = "Airships cannot be boarded in the current area.")
	public static SystemMessageId AIRSHIPS_CANNOT_BE_BOARDED_IN_THE_CURRENT_AREA;
	
	@ClientString(id = 2716, message = "Current location: $s1 / $s2 / $s3 (around the Keucereus Alliance Base)")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3_AROUND_THE_KEUCEREUS_ALLIANCE_BASE;
	
	@ClientString(id = 2717, message = "The airship will dock at the wharf shortly.")
	public static SystemMessageId THE_AIRSHIP_WILL_DOCK_AT_THE_WHARF_SHORTLY;
	
	@ClientString(id = 2718, message = "That skill cannot be used because your target's location is too high or low.")
	public static SystemMessageId THAT_SKILL_CANNOT_BE_USED_BECAUSE_YOUR_TARGET_S_LOCATION_IS_TOO_HIGH_OR_LOW;
	
	@ClientString(id = 2719, message = "Only non-compressed 256 color BMP files can be registered.")
	public static SystemMessageId ONLY_NON_COMPRESSED_256_COLOR_BMP_FILES_CAN_BE_REGISTERED;
	
	@ClientString(id = 2720, message = "Instant zone: $s1's entry has been restricted. You can check the next possible entry time by using the command '/instancezone.'")
	public static SystemMessageId INSTANT_ZONE_S1_S_ENTRY_HAS_BEEN_RESTRICTED_YOU_CAN_CHECK_THE_NEXT_POSSIBLE_ENTRY_TIME_BY_USING_THE_COMMAND_INSTANCEZONE;
	
	@ClientString(id = 2721, message = "You are too high to perform this action. Please lower your altitude and try again.")
	public static SystemMessageId YOU_ARE_TOO_HIGH_TO_PERFORM_THIS_ACTION_PLEASE_LOWER_YOUR_ALTITUDE_AND_TRY_AGAIN;
	
	@ClientString(id = 2722, message = "Another airship has already been summoned. Please try again later.")
	public static SystemMessageId ANOTHER_AIRSHIP_HAS_ALREADY_BEEN_SUMMONED_PLEASE_TRY_AGAIN_LATER;
	
	@ClientString(id = 2723, message = "The airship cannot be summoned because you don't have enough $s1.")
	public static SystemMessageId THE_AIRSHIP_CANNOT_BE_SUMMONED_BECAUSE_YOU_DON_T_HAVE_ENOUGH_S1;
	
	@ClientString(id = 2724, message = "The airship cannot be purchased because you don't have enough $s1.")
	public static SystemMessageId THE_AIRSHIP_CANNOT_BE_PURCHASED_BECAUSE_YOU_DON_T_HAVE_ENOUGH_S1;
	
	@ClientString(id = 2725, message = "You cannot summon the airship because you do not meet the requirements.")
	public static SystemMessageId YOU_CANNOT_SUMMON_THE_AIRSHIP_BECAUSE_YOU_DO_NOT_MEET_THE_REQUIREMENTS;
	
	@ClientString(id = 2726, message = "You cannot purchase the airship because you do not meet the requirements.")
	public static SystemMessageId YOU_CANNOT_PURCHASE_THE_AIRSHIP_BECAUSE_YOU_DO_NOT_MEET_THE_REQUIREMENTS;
	
	@ClientString(id = 2727, message = "You cannot board because you do not meet the requirements.")
	public static SystemMessageId YOU_CANNOT_BOARD_BECAUSE_YOU_DO_NOT_MEET_THE_REQUIREMENTS;
	
	@ClientString(id = 2728, message = "This action is prohibited while mounted or on an airship.")
	public static SystemMessageId THIS_ACTION_IS_PROHIBITED_WHILE_MOUNTED_OR_ON_AN_AIRSHIP;
	
	@ClientString(id = 2729, message = "You cannot control the helm while transformed.")
	public static SystemMessageId YOU_CANNOT_CONTROL_THE_HELM_WHILE_TRANSFORMED;
	
	@ClientString(id = 2730, message = "You cannot control the helm while you are petrified.")
	public static SystemMessageId YOU_CANNOT_CONTROL_THE_HELM_WHILE_YOU_ARE_PETRIFIED;
	
	@ClientString(id = 2731, message = "You cannot control the helm when you are dead.")
	public static SystemMessageId YOU_CANNOT_CONTROL_THE_HELM_WHEN_YOU_ARE_DEAD;
	
	@ClientString(id = 2732, message = "You cannot control the helm while fishing.")
	public static SystemMessageId YOU_CANNOT_CONTROL_THE_HELM_WHILE_FISHING;
	
	@ClientString(id = 2733, message = "You cannot control the helm while in a battle.")
	public static SystemMessageId YOU_CANNOT_CONTROL_THE_HELM_WHILE_IN_A_BATTLE;
	
	@ClientString(id = 2734, message = "You cannot control the helm while in a duel.")
	public static SystemMessageId YOU_CANNOT_CONTROL_THE_HELM_WHILE_IN_A_DUEL;
	
	@ClientString(id = 2735, message = "You cannot control the helm while in a sitting position.")
	public static SystemMessageId YOU_CANNOT_CONTROL_THE_HELM_WHILE_IN_A_SITTING_POSITION;
	
	@ClientString(id = 2736, message = "You cannot control the helm while using a skill.")
	public static SystemMessageId YOU_CANNOT_CONTROL_THE_HELM_WHILE_USING_A_SKILL;
	
	@ClientString(id = 2737, message = "You cannot control the helm while a cursed weapon is equipped.")
	public static SystemMessageId YOU_CANNOT_CONTROL_THE_HELM_WHILE_A_CURSED_WEAPON_IS_EQUIPPED;
	
	@ClientString(id = 2738, message = "You cannot control the helm while holding a flag.")
	public static SystemMessageId YOU_CANNOT_CONTROL_THE_HELM_WHILE_HOLDING_A_FLAG;
	
	@ClientString(id = 2739, message = "You cannot control the helm because you do not meet the requirements.")
	public static SystemMessageId YOU_CANNOT_CONTROL_THE_HELM_BECAUSE_YOU_DO_NOT_MEET_THE_REQUIREMENTS;
	
	@ClientString(id = 2740, message = "This action is prohibited while steering.")
	public static SystemMessageId THIS_ACTION_IS_PROHIBITED_WHILE_STEERING;
	
	@ClientString(id = 2741, message = "You can control an airship by targeting the airship's helm and clicking the (Steer) button from your Actions list.")
	public static SystemMessageId YOU_CAN_CONTROL_AN_AIRSHIP_BY_TARGETING_THE_AIRSHIP_S_HELM_AND_CLICKING_THE_STEER_BUTTON_FROM_YOUR_ACTIONS_LIST;
	
	@ClientString(id = 2742, message = "Any character riding the airship can control it.")
	public static SystemMessageId ANY_CHARACTER_RIDING_THE_AIRSHIP_CAN_CONTROL_IT;
	
	@ClientString(id = 2743, message = "If you restart while on an airship, you will return to the departure location.")
	public static SystemMessageId IF_YOU_RESTART_WHILE_ON_AN_AIRSHIP_YOU_WILL_RETURN_TO_THE_DEPARTURE_LOCATION;
	
	@ClientString(id = 2744, message = "If you press the (Control Cancel) action button, you can exit the control state at any time.")
	public static SystemMessageId IF_YOU_PRESS_THE_CONTROL_CANCEL_ACTION_BUTTON_YOU_CAN_EXIT_THE_CONTROL_STATE_AT_ANY_TIME;
	
	@ClientString(id = 2745, message = "The (Exit Airship) button allows you to disembark before the airship departs.")
	public static SystemMessageId THE_EXIT_AIRSHIP_BUTTON_ALLOWS_YOU_TO_DISEMBARK_BEFORE_THE_AIRSHIP_DEPARTS;
	
	@ClientString(id = 2746, message = "Use the (Depart) button from your Destination Map to make the airship depart.")
	public static SystemMessageId USE_THE_DEPART_BUTTON_FROM_YOUR_DESTINATION_MAP_TO_MAKE_THE_AIRSHIP_DEPART;
	
	@ClientString(id = 2747, message = "The Destination Map contains convenient travel locations. Clicking on a dot will display how much fuel (EP) is consumed for that location.")
	public static SystemMessageId THE_DESTINATION_MAP_CONTAINS_CONVENIENT_TRAVEL_LOCATIONS_CLICKING_ON_A_DOT_WILL_DISPLAY_HOW_MUCH_FUEL_EP_IS_CONSUMED_FOR_THAT_LOCATION;
	
	@ClientString(id = 2748, message = "You have been reported as an illegal program user and cannot report other users.")
	public static SystemMessageId YOU_HAVE_BEEN_REPORTED_AS_AN_ILLEGAL_PROGRAM_USER_AND_CANNOT_REPORT_OTHER_USERS;
	
	@ClientString(id = 2749, message = "You have reached your crystallization limit and cannot crystallize any more.")
	public static SystemMessageId YOU_HAVE_REACHED_YOUR_CRYSTALLIZATION_LIMIT_AND_CANNOT_CRYSTALLIZE_ANY_MORE;
	
	@ClientString(id = 2750, message = "The $s1 ward has been destroyed! $c2 now has the territory ward.")
	public static SystemMessageId THE_S1_WARD_HAS_BEEN_DESTROYED_C2_NOW_HAS_THE_TERRITORY_WARD;
	
	@ClientString(id = 2751, message = "The character that acquired $s1's ward has been killed.")
	public static SystemMessageId THE_CHARACTER_THAT_ACQUIRED_S1_S_WARD_HAS_BEEN_KILLED;
	
	@ClientString(id = 2752, message = "The war for $s1 has been declared.")
	public static SystemMessageId THE_WAR_FOR_S1_HAS_BEEN_DECLARED;
	
	@ClientString(id = 2753, message = "This type of attack is prohibited when allied troops are the target.")
	public static SystemMessageId THIS_TYPE_OF_ATTACK_IS_PROHIBITED_WHEN_ALLIED_TROOPS_ARE_THE_TARGET;
	
	@ClientString(id = 2754, message = "You cannot be simultaneously registered for PvP matches such as the Olympiad, Underground Coliseum, Aerial Cleft, Kratei's Cube, and Handy's Block Checkers.")
	public static SystemMessageId YOU_CANNOT_BE_SIMULTANEOUSLY_REGISTERED_FOR_PVP_MATCHES_SUCH_AS_THE_OLYMPIAD_UNDERGROUND_COLISEUM_AERIAL_CLEFT_KRATEI_S_CUBE_AND_HANDY_S_BLOCK_CHECKERS;
	
	@ClientString(id = 2755, message = "$c1 has been designated as CAT (Combat Aerial Target).")
	public static SystemMessageId C1_HAS_BEEN_DESIGNATED_AS_CAT_COMBAT_AERIAL_TARGET;
	
	@ClientString(id = 2756, message = "Another player is probably controlling the target.")
	public static SystemMessageId ANOTHER_PLAYER_IS_PROBABLY_CONTROLLING_THE_TARGET;
	
	@ClientString(id = 2757, message = "The ship is already moving so you have failed to board.")
	public static SystemMessageId THE_SHIP_IS_ALREADY_MOVING_SO_YOU_HAVE_FAILED_TO_BOARD;
	
	@ClientString(id = 2758, message = "You cannot control the target while a pet or servitor is summoned.")
	public static SystemMessageId YOU_CANNOT_CONTROL_THE_TARGET_WHILE_A_PET_OR_SERVITOR_IS_SUMMONED;
	
	@ClientString(id = 2759, message = "When actions are prohibited, you cannot mount a mountable.")
	public static SystemMessageId WHEN_ACTIONS_ARE_PROHIBITED_YOU_CANNOT_MOUNT_A_MOUNTABLE;
	
	@ClientString(id = 2760, message = "When actions are prohibited, you cannot control the target.")
	public static SystemMessageId WHEN_ACTIONS_ARE_PROHIBITED_YOU_CANNOT_CONTROL_THE_TARGET;
	
	@ClientString(id = 2761, message = "You must target the one you wish to control.")
	public static SystemMessageId YOU_MUST_TARGET_THE_ONE_YOU_WISH_TO_CONTROL;
	
	@ClientString(id = 2762, message = "You cannot control because you are too far.")
	public static SystemMessageId YOU_CANNOT_CONTROL_BECAUSE_YOU_ARE_TOO_FAR;
	
	@ClientString(id = 2763, message = "You cannot enter the battleground while in a party state.")
	public static SystemMessageId YOU_CANNOT_ENTER_THE_BATTLEGROUND_WHILE_IN_A_PARTY_STATE;
	
	@ClientString(id = 2764, message = "You cannot enter because the corresponding alliance channel's maximum number of entrants has been reached.")
	public static SystemMessageId YOU_CANNOT_ENTER_BECAUSE_THE_CORRESPONDING_ALLIANCE_CHANNEL_S_MAXIMUM_NUMBER_OF_ENTRANTS_HAS_BEEN_REACHED;
	
	@ClientString(id = 2765, message = "Only the alliance channel leader can attempt entry.")
	public static SystemMessageId ONLY_THE_ALLIANCE_CHANNEL_LEADER_CAN_ATTEMPT_ENTRY;
	
	@ClientString(id = 2766, message = "Seed of Infinity Stage 1 Attack In Progress")
	public static SystemMessageId SEED_OF_INFINITY_STAGE_1_ATTACK_IN_PROGRESS;
	
	@ClientString(id = 2767, message = "Seed of Infinity Stage 2 Attack In Progress")
	public static SystemMessageId SEED_OF_INFINITY_STAGE_2_ATTACK_IN_PROGRESS;
	
	@ClientString(id = 2768, message = "Seed of Infinity Conquest Complete")
	public static SystemMessageId SEED_OF_INFINITY_CONQUEST_COMPLETE;
	
	@ClientString(id = 2769, message = "Seed of Infinity Stage 1 Defense In Progress")
	public static SystemMessageId SEED_OF_INFINITY_STAGE_1_DEFENSE_IN_PROGRESS;
	
	@ClientString(id = 2770, message = "Seed of Infinity Stage 2 Defense In Progress")
	public static SystemMessageId SEED_OF_INFINITY_STAGE_2_DEFENSE_IN_PROGRESS;
	
	@ClientString(id = 2771, message = "Seed of Destruction Attack in Progress")
	public static SystemMessageId SEED_OF_DESTRUCTION_ATTACK_IN_PROGRESS;
	
	@ClientString(id = 2772, message = "Seed of Destruction Conquest Complete")
	public static SystemMessageId SEED_OF_DESTRUCTION_CONQUEST_COMPLETE;
	
	@ClientString(id = 2773, message = "Seed of Destruction Defense in Progress")
	public static SystemMessageId SEED_OF_DESTRUCTION_DEFENSE_IN_PROGRESS;
	
	@ClientString(id = 2774, message = "You can make another report in $s1-minute(s). You have $s2 point(s) remaining on this account.")
	public static SystemMessageId YOU_CAN_MAKE_ANOTHER_REPORT_IN_S1_MINUTE_S_YOU_HAVE_S2_POINT_S_REMAINING_ON_THIS_ACCOUNT;
	
	@ClientString(id = 2775, message = "The match cannot take place because a party member is in the process of boarding.")
	public static SystemMessageId THE_MATCH_CANNOT_TAKE_PLACE_BECAUSE_A_PARTY_MEMBER_IS_IN_THE_PROCESS_OF_BOARDING;
	
	@ClientString(id = 2776, message = "The effect of territory ward is disappearing.")
	public static SystemMessageId THE_EFFECT_OF_TERRITORY_WARD_IS_DISAPPEARING;
	
	@ClientString(id = 2777, message = "The airship summon license has been entered. Your clan can now summon the airship.")
	public static SystemMessageId THE_AIRSHIP_SUMMON_LICENSE_HAS_BEEN_ENTERED_YOUR_CLAN_CAN_NOW_SUMMON_THE_AIRSHIP;
	
	@ClientString(id = 2778, message = "You cannot teleport while in possession of a ward.")
	public static SystemMessageId YOU_CANNOT_TELEPORT_WHILE_IN_POSSESSION_OF_A_WARD;
	
	@ClientString(id = 2779, message = "Further increase in altitude is not allowed.")
	public static SystemMessageId FURTHER_INCREASE_IN_ALTITUDE_IS_NOT_ALLOWED;
	
	@ClientString(id = 2780, message = "Further decrease in altitude is not allowed.")
	public static SystemMessageId FURTHER_DECREASE_IN_ALTITUDE_IS_NOT_ALLOWED;
	
	@ClientString(id = 2781, message = "Number of units: $s1")
	public static SystemMessageId NUMBER_OF_UNITS_S1;
	
	@ClientString(id = 2782, message = "Number of people: $s1")
	public static SystemMessageId NUMBER_OF_PEOPLE_S1;
	
	@ClientString(id = 2783, message = "No one is left from the opposing team, thus victory is yours.")
	public static SystemMessageId NO_ONE_IS_LEFT_FROM_THE_OPPOSING_TEAM_THUS_VICTORY_IS_YOURS;
	
	@ClientString(id = 2784, message = "The battleground has been closed. The match has ended in a tie because the match lasted for $s1-minute(s) and $s2-second(s) and the requirements were not met.")
	public static SystemMessageId THE_BATTLEGROUND_HAS_BEEN_CLOSED_THE_MATCH_HAS_ENDED_IN_A_TIE_BECAUSE_THE_MATCH_LASTED_FOR_S1_MINUTE_S_AND_S2_SECOND_S_AND_THE_REQUIREMENTS_WERE_NOT_MET;
	
	@ClientString(id = 2785, message = "It's a large scaled airship for transportations and battles and can be owned by the unit of clan.")
	public static SystemMessageId IT_S_A_LARGE_SCALED_AIRSHIP_FOR_TRANSPORTATIONS_AND_BATTLES_AND_CAN_BE_OWNED_BY_THE_UNIT_OF_CLAN;
	
	@ClientString(id = 2786, message = "Start action is available only when controlling the airship.")
	public static SystemMessageId START_ACTION_IS_AVAILABLE_ONLY_WHEN_CONTROLLING_THE_AIRSHIP;
	
	@ClientString(id = 2787, message = "$c1 has drained you of $s2 HP.")
	public static SystemMessageId C1_HAS_DRAINED_YOU_OF_S2_HP;
	
	@ClientString(id = 2788, message = "Mercenary participation is requested in $s1 territory.")
	public static SystemMessageId MERCENARY_PARTICIPATION_IS_REQUESTED_IN_S1_TERRITORY;
	
	@ClientString(id = 2789, message = "Mercenary participation request is cancelled in $s1 territory.")
	public static SystemMessageId MERCENARY_PARTICIPATION_REQUEST_IS_CANCELLED_IN_S1_TERRITORY;
	
	@ClientString(id = 2790, message = "Clan participation is requested in $s1 territory.")
	public static SystemMessageId CLAN_PARTICIPATION_IS_REQUESTED_IN_S1_TERRITORY;
	
	@ClientString(id = 2791, message = "Clan participation request is cancelled in $s1 territory.")
	public static SystemMessageId CLAN_PARTICIPATION_REQUEST_IS_CANCELLED_IN_S1_TERRITORY;
	
	@ClientString(id = 2792, message = "50 Clan Reputation will be awarded. Do you wish to continue?")
	public static SystemMessageId CLAN_REPUTATION_WILL_BE_AWARDED_DO_YOU_WISH_TO_CONTINUE;
	
	@ClientString(id = 2793, message = "You must have a minimum of $s1 people to enter this instanced zone.")
	public static SystemMessageId YOU_MUST_HAVE_A_MINIMUM_OF_S1_PEOPLE_TO_ENTER_THIS_INSTANCED_ZONE;
	
	@ClientString(id = 2794, message = "The territory war channel and functions will now be deactivated.")
	public static SystemMessageId THE_TERRITORY_WAR_CHANNEL_AND_FUNCTIONS_WILL_NOW_BE_DEACTIVATED;
	
	@ClientString(id = 2795, message = "You've already requested a territory war in another territory elsewhere.")
	public static SystemMessageId YOU_VE_ALREADY_REQUESTED_A_TERRITORY_WAR_IN_ANOTHER_TERRITORY_ELSEWHERE;
	
	@ClientString(id = 2796, message = "The clan who owns the territory cannot participate in the territory war as mercenaries.")
	public static SystemMessageId THE_CLAN_WHO_OWNS_THE_TERRITORY_CANNOT_PARTICIPATE_IN_THE_TERRITORY_WAR_AS_MERCENARIES;
	
	@ClientString(id = 2797, message = "It is not a territory war registration period, so a request cannot be made at this time.")
	public static SystemMessageId IT_IS_NOT_A_TERRITORY_WAR_REGISTRATION_PERIOD_SO_A_REQUEST_CANNOT_BE_MADE_AT_THIS_TIME;
	
	@ClientString(id = 2798, message = "The territory war will end in $s1-hour(s).")
	public static SystemMessageId THE_TERRITORY_WAR_WILL_END_IN_S1_HOUR_S;
	
	@ClientString(id = 2799, message = "The territory war will end in $s1-minute(s).")
	public static SystemMessageId THE_TERRITORY_WAR_WILL_END_IN_S1_MINUTE_S;
	
	@ClientString(id = 2800, message = "No translation required")
	public static SystemMessageId NO_TRANSLATION_REQUIRED5;
	
	@ClientString(id = 2801, message = "No translation required")
	public static SystemMessageId NO_TRANSLATION_REQUIRED6;
	
	@ClientString(id = 2802, message = "No translation required")
	public static SystemMessageId NO_TRANSLATION_REQUIRED7;
	
	@ClientString(id = 2803, message = "No translation required")
	public static SystemMessageId NO_TRANSLATION_REQUIRED8;
	
	@ClientString(id = 2804, message = "No translation required")
	public static SystemMessageId NO_TRANSLATION_REQUIRED9;
	
	@ClientString(id = 2805, message = "No translation required")
	public static SystemMessageId NO_TRANSLATION_REQUIRED10;
	
	@ClientString(id = 2806, message = "No translation required")
	public static SystemMessageId NO_TRANSLATION_REQUIRED11;
	
	@ClientString(id = 2807, message = "No translation required")
	public static SystemMessageId NO_TRANSLATION_REQUIRED12;
	
	@ClientString(id = 2808, message = "No translation required")
	public static SystemMessageId NO_TRANSLATION_REQUIRED13;
	
	@ClientString(id = 2809, message = "No translation required")
	public static SystemMessageId NO_TRANSLATION_REQUIRED14;
	
	@ClientString(id = 2810, message = "No translation required")
	public static SystemMessageId NO_TRANSLATION_REQUIRED15;
	
	@ClientString(id = 2811, message = "No translation required")
	public static SystemMessageId NO_TRANSLATION_REQUIRED16;
	
	@ClientString(id = 2812, message = "No translation required")
	public static SystemMessageId NO_TRANSLATION_REQUIRED17;
	
	@ClientString(id = 2813, message = "No translation required")
	public static SystemMessageId NO_TRANSLATION_REQUIRED18;
	
	@ClientString(id = 2814, message = "No translation required")
	public static SystemMessageId NO_TRANSLATION_REQUIRED19;
	
	@ClientString(id = 2815, message = "No translation required")
	public static SystemMessageId NO_TRANSLATION_REQUIRED20;
	
	@ClientString(id = 2816, message = "Designate a shortcut key for the Flying Transformed Object Exclusive use shortcut window's No 1 slot.")
	public static SystemMessageId DESIGNATE_A_SHORTCUT_KEY_FOR_THE_FLYING_TRANSFORMED_OBJECT_EXCLUSIVE_USE_SHORTCUT_WINDOW_S_NO_1_SLOT;
	
	@ClientString(id = 2817, message = "Designate a shortcut key for the Flying Transformed Object Exclusive use shortcut window's No 2 slot.")
	public static SystemMessageId DESIGNATE_A_SHORTCUT_KEY_FOR_THE_FLYING_TRANSFORMED_OBJECT_EXCLUSIVE_USE_SHORTCUT_WINDOW_S_NO_2_SLOT;
	
	@ClientString(id = 2818, message = "Designate a shortcut key for the Flying Transformed Object Exclusive use shortcut window's No 3 slot.")
	public static SystemMessageId DESIGNATE_A_SHORTCUT_KEY_FOR_THE_FLYING_TRANSFORMED_OBJECT_EXCLUSIVE_USE_SHORTCUT_WINDOW_S_NO_3_SLOT;
	
	@ClientString(id = 2819, message = "Designate a shortcut key for the Flying Transformed Object Exclusive use shortcut window's No 4 slot.")
	public static SystemMessageId DESIGNATE_A_SHORTCUT_KEY_FOR_THE_FLYING_TRANSFORMED_OBJECT_EXCLUSIVE_USE_SHORTCUT_WINDOW_S_NO_4_SLOT;
	
	@ClientString(id = 2820, message = "Designate a shortcut key for the Flying Transformed Object Exclusive use shortcut window's No 5 slot.")
	public static SystemMessageId DESIGNATE_A_SHORTCUT_KEY_FOR_THE_FLYING_TRANSFORMED_OBJECT_EXCLUSIVE_USE_SHORTCUT_WINDOW_S_NO_5_SLOT;
	
	@ClientString(id = 2821, message = "Designate a shortcut key for the Flying Transformed Object Exclusive use shortcut window's No 6 slot.")
	public static SystemMessageId DESIGNATE_A_SHORTCUT_KEY_FOR_THE_FLYING_TRANSFORMED_OBJECT_EXCLUSIVE_USE_SHORTCUT_WINDOW_S_NO_6_SLOT;
	
	@ClientString(id = 2822, message = "Designate a shortcut key for the Flying Transformed Object Exclusive use shortcut window's No 7 slot.")
	public static SystemMessageId DESIGNATE_A_SHORTCUT_KEY_FOR_THE_FLYING_TRANSFORMED_OBJECT_EXCLUSIVE_USE_SHORTCUT_WINDOW_S_NO_7_SLOT;
	
	@ClientString(id = 2823, message = "Designate a shortcut key for the Flying Transformed Object Exclusive use shortcut window's No 8 slot.")
	public static SystemMessageId DESIGNATE_A_SHORTCUT_KEY_FOR_THE_FLYING_TRANSFORMED_OBJECT_EXCLUSIVE_USE_SHORTCUT_WINDOW_S_NO_8_SLOT;
	
	@ClientString(id = 2824, message = "Designate a shortcut key for the Flying Transformed Object Exclusive use shortcut window's No 9 slot.")
	public static SystemMessageId DESIGNATE_A_SHORTCUT_KEY_FOR_THE_FLYING_TRANSFORMED_OBJECT_EXCLUSIVE_USE_SHORTCUT_WINDOW_S_NO_9_SLOT;
	
	@ClientString(id = 2825, message = "Designate a shortcut key for the Flying Transformed Object Exclusive use shortcut window's No 10 slot.")
	public static SystemMessageId DESIGNATE_A_SHORTCUT_KEY_FOR_THE_FLYING_TRANSFORMED_OBJECT_EXCLUSIVE_USE_SHORTCUT_WINDOW_S_NO_10_SLOT;
	
	@ClientString(id = 2826, message = "Designate a shortcut key for the Flying Transformed Object Exclusive use shortcut window's No 11 slot.")
	public static SystemMessageId DESIGNATE_A_SHORTCUT_KEY_FOR_THE_FLYING_TRANSFORMED_OBJECT_EXCLUSIVE_USE_SHORTCUT_WINDOW_S_NO_11_SLOT;
	
	@ClientString(id = 2827, message = "Designate a shortcut key for the Flying Transformed Object Exclusive use shortcut window's No 12 slot.")
	public static SystemMessageId DESIGNATE_A_SHORTCUT_KEY_FOR_THE_FLYING_TRANSFORMED_OBJECT_EXCLUSIVE_USE_SHORTCUT_WINDOW_S_NO_12_SLOT;
	
	@ClientString(id = 2828, message = "Designate a shortcut key for the Mountable Exclusive use shortcut window's No 1 slot.")
	public static SystemMessageId DESIGNATE_A_SHORTCUT_KEY_FOR_THE_MOUNTABLE_EXCLUSIVE_USE_SHORTCUT_WINDOW_S_NO_1_SLOT;
	
	@ClientString(id = 2829, message = "Designate a shortcut key for the Mountable Exclusive use shortcut window's No 2 slot.")
	public static SystemMessageId DESIGNATE_A_SHORTCUT_KEY_FOR_THE_MOUNTABLE_EXCLUSIVE_USE_SHORTCUT_WINDOW_S_NO_2_SLOT;
	
	@ClientString(id = 2830, message = "Designate a shortcut key for the Mountable Exclusive use shortcut window's No 3 slot.")
	public static SystemMessageId DESIGNATE_A_SHORTCUT_KEY_FOR_THE_MOUNTABLE_EXCLUSIVE_USE_SHORTCUT_WINDOW_S_NO_3_SLOT;
	
	@ClientString(id = 2831, message = "Designate a shortcut key for the Mountable Exclusive use shortcut window's No 4 slot.")
	public static SystemMessageId DESIGNATE_A_SHORTCUT_KEY_FOR_THE_MOUNTABLE_EXCLUSIVE_USE_SHORTCUT_WINDOW_S_NO_4_SLOT;
	
	@ClientString(id = 2832, message = "Designate a shortcut key for the Mountable Exclusive use shortcut window's No 5 slot.")
	public static SystemMessageId DESIGNATE_A_SHORTCUT_KEY_FOR_THE_MOUNTABLE_EXCLUSIVE_USE_SHORTCUT_WINDOW_S_NO_5_SLOT;
	
	@ClientString(id = 2833, message = "Designate a shortcut key for the Mountable Exclusive use shortcut window's No 6 slot.")
	public static SystemMessageId DESIGNATE_A_SHORTCUT_KEY_FOR_THE_MOUNTABLE_EXCLUSIVE_USE_SHORTCUT_WINDOW_S_NO_6_SLOT;
	
	@ClientString(id = 2834, message = "Designate a shortcut key for the Mountable Exclusive use shortcut window's No 7 slot.")
	public static SystemMessageId DESIGNATE_A_SHORTCUT_KEY_FOR_THE_MOUNTABLE_EXCLUSIVE_USE_SHORTCUT_WINDOW_S_NO_7_SLOT;
	
	@ClientString(id = 2835, message = "Designate a shortcut key for the Mountable Exclusive use shortcut window's No 8 slot.")
	public static SystemMessageId DESIGNATE_A_SHORTCUT_KEY_FOR_THE_MOUNTABLE_EXCLUSIVE_USE_SHORTCUT_WINDOW_S_NO_8_SLOT;
	
	@ClientString(id = 2836, message = "Designate a shortcut key for the Mountable Exclusive use shortcut window's No 9 slot.")
	public static SystemMessageId DESIGNATE_A_SHORTCUT_KEY_FOR_THE_MOUNTABLE_EXCLUSIVE_USE_SHORTCUT_WINDOW_S_NO_9_SLOT;
	
	@ClientString(id = 2837, message = "Designate a shortcut key for the Mountable Exclusive use shortcut window's No 10 slot.")
	public static SystemMessageId DESIGNATE_A_SHORTCUT_KEY_FOR_THE_MOUNTABLE_EXCLUSIVE_USE_SHORTCUT_WINDOW_S_NO_10_SLOT;
	
	@ClientString(id = 2838, message = "Designate a shortcut key for the Mountable Exclusive use shortcut window's No 11 slot.")
	public static SystemMessageId DESIGNATE_A_SHORTCUT_KEY_FOR_THE_MOUNTABLE_EXCLUSIVE_USE_SHORTCUT_WINDOW_S_NO_11_SLOT;
	
	@ClientString(id = 2839, message = "Designate a shortcut key for the Mountable Exclusive use shortcut window's No 12 slot.")
	public static SystemMessageId DESIGNATE_A_SHORTCUT_KEY_FOR_THE_MOUNTABLE_EXCLUSIVE_USE_SHORTCUT_WINDOW_S_NO_12_SLOT;
	
	@ClientString(id = 2840, message = "Execute the designated shortcut's action/skill/macro.")
	public static SystemMessageId EXECUTE_THE_DESIGNATED_SHORTCUT_S_ACTION_SKILL_MACRO;
	
	@ClientString(id = 2841, message = "Character moves up away from the ground.")
	public static SystemMessageId CHARACTER_MOVES_UP_AWAY_FROM_THE_GROUND;
	
	@ClientString(id = 2842, message = "Character moves toward the ground.")
	public static SystemMessageId CHARACTER_MOVES_TOWARD_THE_GROUND;
	
	@ClientString(id = 2843, message = "Mount moves away from the ground.")
	public static SystemMessageId MOUNT_MOVES_AWAY_FROM_THE_GROUND;
	
	@ClientString(id = 2844, message = "Mount moves toward the ground.")
	public static SystemMessageId MOUNT_MOVES_TOWARD_THE_GROUND;
	
	@ClientString(id = 2845, message = "Character or the mount moves forward automatically.")
	public static SystemMessageId CHARACTER_OR_THE_MOUNT_MOVES_FORWARD_AUTOMATICALLY;
	
	@ClientString(id = 2846, message = "No translation required")
	public static SystemMessageId NO_TRANSLATION_REQUIRED21;
	
	@ClientString(id = 2847, message = "No translation required")
	public static SystemMessageId NO_TRANSLATION_REQUIRED22;
	
	@ClientString(id = 2848, message = "No translation required")
	public static SystemMessageId NO_TRANSLATION_REQUIRED23;
	
	@ClientString(id = 2849, message = "No translation required")
	public static SystemMessageId NO_TRANSLATION_REQUIRED24;
	
	@ClientString(id = 2850, message = "No translation required")
	public static SystemMessageId NO_TRANSLATION_REQUIRED25;
	
	@ClientString(id = 2851, message = "Stops all movements.")
	public static SystemMessageId STOPS_ALL_MOVEMENTS;
	
	@ClientString(id = 2852, message = "Stop the mountable.")
	public static SystemMessageId STOP_THE_MOUNTABLE;
	
	@ClientString(id = 2853, message = "Character or mount moves to the left.")
	public static SystemMessageId CHARACTER_OR_MOUNT_MOVES_TO_THE_LEFT;
	
	@ClientString(id = 2854, message = "Character or mount moves to the right.")
	public static SystemMessageId CHARACTER_OR_MOUNT_MOVES_TO_THE_RIGHT;
	
	@ClientString(id = 2855, message = "No need for translation")
	public static SystemMessageId NO_NEED_FOR_TRANSLATION;
	
	@ClientString(id = 2856, message = "No need for translation")
	public static SystemMessageId NO_NEED_FOR_TRANSLATION2;
	
	@ClientString(id = 2875, message = "If you join the clan academy, you can become a clan member and learn the game system until you become level 40. If you want more fun, we recommend that you join the clan academy.")
	public static SystemMessageId IF_YOU_JOIN_THE_CLAN_ACADEMY_YOU_CAN_BECOME_A_CLAN_MEMBER_AND_LEARN_THE_GAME_SYSTEM_UNTIL_YOU_BECOME_LEVEL_40_IF_YOU_WANT_MORE_FUN_WE_RECOMMEND_THAT_YOU_JOIN_THE_CLAN_ACADEMY;
	
	@ClientString(id = 2876, message = "If you become level 40, the second class change is available. If you complete the second class change, the character's capability is enhanced.")
	public static SystemMessageId IF_YOU_BECOME_LEVEL_40_THE_SECOND_CLASS_CHANGE_IS_AVAILABLE_IF_YOU_COMPLETE_THE_SECOND_CLASS_CHANGE_THE_CHARACTER_S_CAPABILITY_IS_ENHANCED;
	
	@ClientString(id = 2900, message = "$s1-second(s) to the end of territory war!")
	public static SystemMessageId S1_SECOND_S_TO_THE_END_OF_TERRITORY_WAR;
	
	@ClientString(id = 2901, message = "You cannot force attack a member of the same territory.")
	public static SystemMessageId YOU_CANNOT_FORCE_ATTACK_A_MEMBER_OF_THE_SAME_TERRITORY;
	
	@ClientString(id = 2902, message = "You've acquired the ward. Move quickly to your forces' outpost.")
	public static SystemMessageId YOU_VE_ACQUIRED_THE_WARD_MOVE_QUICKLY_TO_YOUR_FORCES_OUTPOST;
	
	@ClientString(id = 2903, message = "Territory war has begun.")
	public static SystemMessageId TERRITORY_WAR_HAS_BEGUN;
	
	@ClientString(id = 2904, message = "Territory war has ended.")
	public static SystemMessageId TERRITORY_WAR_HAS_ENDED;
	
	@ClientString(id = 2905, message = "Altitude cannot be decreased any further.")
	public static SystemMessageId ALTITUDE_CANNOT_BE_DECREASED_ANY_FURTHER;
	
	@ClientString(id = 2906, message = "Altitude cannot be increased any further.")
	public static SystemMessageId ALTITUDE_CANNOT_BE_INCREASED_ANY_FURTHER;
	
	@ClientString(id = 2907, message = "You have entered a potentially hostile environment so the airship's speed has been greatly decreased.")
	public static SystemMessageId YOU_HAVE_ENTERED_A_POTENTIALLY_HOSTILE_ENVIRONMENT_SO_THE_AIRSHIP_S_SPEED_HAS_BEEN_GREATLY_DECREASED;
	
	@ClientString(id = 2908, message = "As you are leaving the hostile environment, the airship's speed has been returned to normal.")
	public static SystemMessageId AS_YOU_ARE_LEAVING_THE_HOSTILE_ENVIRONMENT_THE_AIRSHIP_S_SPEED_HAS_BEEN_RETURNED_TO_NORMAL;
	
	@ClientString(id = 2909, message = "A servitor or pet cannot be summoned while on an airship.")
	public static SystemMessageId A_SERVITOR_OR_PET_CANNOT_BE_SUMMONED_WHILE_ON_AN_AIRSHIP;
	
	@ClientString(id = 2910, message = "You have entered an incorrect command.")
	public static SystemMessageId YOU_HAVE_ENTERED_AN_INCORRECT_COMMAND;
	
	@ClientString(id = 2911, message = "You've requested $c1 to be on your Friends List.")
	public static SystemMessageId YOU_VE_REQUESTED_C1_TO_BE_ON_YOUR_FRIENDS_LIST;
	
	@ClientString(id = 2912, message = "You've invited $c1 to join your clan.")
	public static SystemMessageId YOU_VE_INVITED_C1_TO_JOIN_YOUR_CLAN;
	
	@ClientString(id = 2913, message = "Clan $s1 has succeeded in capturing $s2's territory ward.")
	public static SystemMessageId CLAN_S1_HAS_SUCCEEDED_IN_CAPTURING_S2_S_TERRITORY_WARD;
	
	@ClientString(id = 2914, message = "The territory war will begin in 20 minutes! Territory related functions (i.e.: battleground channel, Disguise Scrolls, Transformations, etc...) can now be used.")
	public static SystemMessageId THE_TERRITORY_WAR_WILL_BEGIN_IN_20_MINUTES_TERRITORY_RELATED_FUNCTIONS_I_E_BATTLEGROUND_CHANNEL_DISGUISE_SCROLLS_TRANSFORMATIONS_ETC_CAN_NOW_BE_USED;
	
	@ClientString(id = 2915, message = "This clan member cannot withdraw or be expelled while participating in a territory war.")
	public static SystemMessageId THIS_CLAN_MEMBER_CANNOT_WITHDRAW_OR_BE_EXPELLED_WHILE_PARTICIPATING_IN_A_TERRITORY_WAR;
	
	@ClientString(id = 2916, message = "$s1 in battle")
	public static SystemMessageId S1_IN_BATTLE;
	
	@ClientString(id = 2917, message = "Territories are at peace.")
	public static SystemMessageId TERRITORIES_ARE_AT_PEACE;
	
	@ClientString(id = 2918, message = "Only characters who are level 40 or above who have completed their second class transfer can register in a territory war.")
	public static SystemMessageId ONLY_CHARACTERS_WHO_ARE_LEVEL_40_OR_ABOVE_WHO_HAVE_COMPLETED_THEIR_SECOND_CLASS_TRANSFER_CAN_REGISTER_IN_A_TERRITORY_WAR;
	
	@ClientString(id = 2919, message = "While disguised, you cannot operate a private or manufacture store.")
	public static SystemMessageId WHILE_DISGUISED_YOU_CANNOT_OPERATE_A_PRIVATE_OR_MANUFACTURE_STORE;
	
	@ClientString(id = 2920, message = "No more airships can be summoned as the maximum airship limit has been met.")
	public static SystemMessageId NO_MORE_AIRSHIPS_CAN_BE_SUMMONED_AS_THE_MAXIMUM_AIRSHIP_LIMIT_HAS_BEEN_MET;
	
	@ClientString(id = 2921, message = "You cannot board the airship because the maximum number for occupants is met.")
	public static SystemMessageId YOU_CANNOT_BOARD_THE_AIRSHIP_BECAUSE_THE_MAXIMUM_NUMBER_FOR_OCCUPANTS_IS_MET;
	
	@ClientString(id = 2922, message = "Block Checker will end in 5 seconds!")
	public static SystemMessageId BLOCK_CHECKER_WILL_END_IN_5_SECONDS;
	
	@ClientString(id = 2923, message = "Block Checker will end in 4 seconds!!")
	public static SystemMessageId BLOCK_CHECKER_WILL_END_IN_4_SECONDS;
	
	@ClientString(id = 2924, message = "You cannot enter a Seed while in a flying transformation state.")
	public static SystemMessageId YOU_CANNOT_ENTER_A_SEED_WHILE_IN_A_FLYING_TRANSFORMATION_STATE;
	
	@ClientString(id = 2925, message = "Block Checker will end in 3 seconds!!!")
	public static SystemMessageId BLOCK_CHECKER_WILL_END_IN_3_SECONDS;
	
	@ClientString(id = 2926, message = "Block Checker will end in 2 seconds!!!!")
	public static SystemMessageId BLOCK_CHECKER_WILL_END_IN_2_SECONDS;
	
	@ClientString(id = 2927, message = "Block Checker will end in 1 second!!!!!")
	public static SystemMessageId BLOCK_CHECKER_WILL_END_IN_1_SECOND;
	
	@ClientString(id = 2928, message = "The $c1 team has won.")
	public static SystemMessageId THE_C1_TEAM_HAS_WON;
	
	@ClientString(id = 2929, message = "Your request cannot be processed because there's no enough available memory on your graphic card. Please try again after reducing the resolution.")
	public static SystemMessageId YOUR_REQUEST_CANNOT_BE_PROCESSED_BECAUSE_THERE_S_NO_ENOUGH_AVAILABLE_MEMORY_ON_YOUR_GRAPHIC_CARD_PLEASE_TRY_AGAIN_AFTER_REDUCING_THE_RESOLUTION;
	
	@ClientString(id = 2930, message = "A graphic card internal error has occurred. Please install the latest version of the graphic card driver and try again.")
	public static SystemMessageId A_GRAPHIC_CARD_INTERNAL_ERROR_HAS_OCCURRED_PLEASE_INSTALL_THE_LATEST_VERSION_OF_THE_GRAPHIC_CARD_DRIVER_AND_TRY_AGAIN;
	
	@ClientString(id = 2931, message = "The system file may have been damaged. After ending the game, please check the file using the Lineage II auto update.")
	public static SystemMessageId THE_SYSTEM_FILE_MAY_HAVE_BEEN_DAMAGED_AFTER_ENDING_THE_GAME_PLEASE_CHECK_THE_FILE_USING_THE_LINEAGE_II_AUTO_UPDATE;
	
	@ClientString(id = 2932, message = "$s1 Adena")
	public static SystemMessageId S1_ADENA;
	
	@ClientString(id = 2933, message = "Thomas D. Turkey has appeared. Please save Santa.")
	public static SystemMessageId THOMAS_D_TURKEY_HAS_APPEARED_PLEASE_SAVE_SANTA;
	
	@ClientString(id = 2934, message = "You have defeated Thomas D. Turkey and rescued Santa.")
	public static SystemMessageId YOU_HAVE_DEFEATED_THOMAS_D_TURKEY_AND_RESCUED_SANTA;
	
	@ClientString(id = 2935, message = "You failed to rescue Santa, and Thomas D. Turkey has disappeared.")
	public static SystemMessageId YOU_FAILED_TO_RESCUE_SANTA_AND_THOMAS_D_TURKEY_HAS_DISAPPEARED;
	
	@ClientString(id = 2936, message = "The disguise scroll cannot be used because it is meant for use in a different territory.")
	public static SystemMessageId THE_DISGUISE_SCROLL_CANNOT_BE_USED_BECAUSE_IT_IS_MEANT_FOR_USE_IN_A_DIFFERENT_TERRITORY;
	
	@ClientString(id = 2937, message = "A territory owning clan member cannot use a disguise scroll.")
	public static SystemMessageId A_TERRITORY_OWNING_CLAN_MEMBER_CANNOT_USE_A_DISGUISE_SCROLL;
	
	@ClientString(id = 2938, message = "The disguise scroll cannot be used while you are engaged in a private store or manufacture workshop.")
	public static SystemMessageId THE_DISGUISE_SCROLL_CANNOT_BE_USED_WHILE_YOU_ARE_ENGAGED_IN_A_PRIVATE_STORE_OR_MANUFACTURE_WORKSHOP;
	
	@ClientString(id = 2939, message = "A disguise cannot be used when you are in a chaotic state.")
	public static SystemMessageId A_DISGUISE_CANNOT_BE_USED_WHEN_YOU_ARE_IN_A_CHAOTIC_STATE;
	
	@ClientString(id = 2940, message = "You can use enchant success supplements for items enchanted between + 3 and + 15.")
	public static SystemMessageId YOU_CAN_USE_ENCHANT_SUCCESS_SUPPLEMENTS_FOR_ITEMS_ENCHANTED_BETWEEN_3_AND_15;
	
	@ClientString(id = 2941, message = "The request cannot be completed because the requirements are not met. In order to participate in a team match, all team members must have an Olympiad score of 10 or more.")
	public static SystemMessageId THE_REQUEST_CANNOT_BE_COMPLETED_BECAUSE_THE_REQUIREMENTS_ARE_NOT_MET_IN_ORDER_TO_PARTICIPATE_IN_A_TEAM_MATCH_ALL_TEAM_MEMBERS_MUST_HAVE_AN_OLYMPIAD_SCORE_OF_10_OR_MORE;
	
	@ClientString(id = 2942, message = "The first gift's remaining resupply time is $s1 hour(s) $s2 minute(s) $s3 second(s).  (If you resummon the Agathion at the gift supply time, the supply time can take an additional 10 minutes.)")
	public static SystemMessageId THE_FIRST_GIFT_S_REMAINING_RESUPPLY_TIME_IS_S1_HOUR_S_S2_MINUTE_S_S3_SECOND_S_IF_YOU_RESUMMON_THE_AGATHION_AT_THE_GIFT_SUPPLY_TIME_THE_SUPPLY_TIME_CAN_TAKE_AN_ADDITIONAL_10_MINUTES;
	
	@ClientString(id = 2943, message = "The first gift's remaining resupply time is $s1 minute(s) $s2 second(s). (If you resummon the Agathion at the gift supply time, the supply time can take an additional 10 minutes.)")
	public static SystemMessageId THE_FIRST_GIFT_S_REMAINING_RESUPPLY_TIME_IS_S1_MINUTE_S_S2_SECOND_S_IF_YOU_RESUMMON_THE_AGATHION_AT_THE_GIFT_SUPPLY_TIME_THE_SUPPLY_TIME_CAN_TAKE_AN_ADDITIONAL_10_MINUTES;
	
	@ClientString(id = 2944, message = "The first gift's remaining resupply time is $s1 second(s).  (If you resummon the Agathion at the gift supply time, the supply time can take an additional 10 minutes.)")
	public static SystemMessageId THE_FIRST_GIFT_S_REMAINING_RESUPPLY_TIME_IS_S1_SECOND_S_IF_YOU_RESUMMON_THE_AGATHION_AT_THE_GIFT_SUPPLY_TIME_THE_SUPPLY_TIME_CAN_TAKE_AN_ADDITIONAL_10_MINUTES;
	
	@ClientString(id = 2945, message = "The second gift's remaining resupply time is $s1 hour(s) $s2 minute(s) $s3 second(s).  (If you resummon the Agathion at the gift supply time, the supply time can take an additional 1 hour 10 minutes.)")
	public static SystemMessageId THE_SECOND_GIFT_S_REMAINING_RESUPPLY_TIME_IS_S1_HOUR_S_S2_MINUTE_S_S3_SECOND_S_IF_YOU_RESUMMON_THE_AGATHION_AT_THE_GIFT_SUPPLY_TIME_THE_SUPPLY_TIME_CAN_TAKE_AN_ADDITIONAL_1_HOUR_10_MINUTES;
	
	@ClientString(id = 2946, message = "The second gift's remaining resupply time is $s1 minute(s) $s2 second(s). (If you resummon the Agathion at the gift supply time, the supply time can take an additional 1 hour 10 minutes.)")
	public static SystemMessageId THE_SECOND_GIFT_S_REMAINING_RESUPPLY_TIME_IS_S1_MINUTE_S_S2_SECOND_S_IF_YOU_RESUMMON_THE_AGATHION_AT_THE_GIFT_SUPPLY_TIME_THE_SUPPLY_TIME_CAN_TAKE_AN_ADDITIONAL_1_HOUR_10_MINUTES;
	
	@ClientString(id = 2947, message = "The second gift's remaining resupply time is $s1 second(s). (If you resummon the Agathion at the gift supply time, the supply time can take an additional 1 hour 10 minutes.)")
	public static SystemMessageId THE_SECOND_GIFT_S_REMAINING_RESUPPLY_TIME_IS_S1_SECOND_S_IF_YOU_RESUMMON_THE_AGATHION_AT_THE_GIFT_SUPPLY_TIME_THE_SUPPLY_TIME_CAN_TAKE_AN_ADDITIONAL_1_HOUR_10_MINUTES;
	
	@ClientString(id = 2955, message = "The territory war exclusive disguise and transformation can be used 20 minutes before the start of the territory war to 10 minutes after its end.")
	public static SystemMessageId THE_TERRITORY_WAR_EXCLUSIVE_DISGUISE_AND_TRANSFORMATION_CAN_BE_USED_20_MINUTES_BEFORE_THE_START_OF_THE_TERRITORY_WAR_TO_10_MINUTES_AFTER_ITS_END;
	
	@ClientString(id = 2956, message = "A user participating in the Olympiad cannot witness the battle.")
	public static SystemMessageId A_USER_PARTICIPATING_IN_THE_OLYMPIAD_CANNOT_WITNESS_THE_BATTLE;
	
	@ClientString(id = 2957, message = "A character born on February 29 will receive a gift on February 28.")
	public static SystemMessageId A_CHARACTER_BORN_ON_FEBRUARY_29_WILL_RECEIVE_A_GIFT_ON_FEBRUARY_28;
	
	@ClientString(id = 2958, message = "An Agathion has already been summoned.")
	public static SystemMessageId AN_AGATHION_HAS_ALREADY_BEEN_SUMMONED;
	
	@ClientString(id = 2959, message = "Your account has been temporarily restricted due to your speculated abnormal methods of gameplay. If you did not employ abnormal means to play the game, please visit the website and go through the personal verification process to lift the restriction. Please refer to the Support Center on the NCSOFT website (http://us.ncsoft.com/en/support) for more details.")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_TEMPORARILY_RESTRICTED_DUE_TO_YOUR_SPECULATED_ABNORMAL_METHODS_OF_GAMEPLAY_IF_YOU_DID_NOT_EMPLOY_ABNORMAL_MEANS_TO_PLAY_THE_GAME_PLEASE_VISIT_THE_WEBSITE_AND_GO_THROUGH_THE_PERSONAL_VERIFICATION_PROCESS_TO_LIFT_THE_RESTRICTION_PLEASE_REFER_TO_THE_SUPPORT_CENTER_ON_THE_NCSOFT_WEBSITE_HTTP_US_NCSOFT_COM_EN_SUPPORT_FOR_MORE_DETAILS;
	
	@ClientString(id = 2960, message = "You need a(n) $s1.")
	public static SystemMessageId YOU_NEED_A_N_S1;
	
	@ClientString(id = 2961, message = "You need $s2 $s1(s).")
	public static SystemMessageId YOU_NEED_S2_S1_S;
	
	@ClientString(id = 2962, message = "This item cannot be used in the current transformation state.")
	public static SystemMessageId THIS_ITEM_CANNOT_BE_USED_IN_THE_CURRENT_TRANSFORMATION_STATE;
	
	@ClientString(id = 2963, message = "The opponent has not equipped $s1, so $s2 cannot be used.")
	public static SystemMessageId THE_OPPONENT_HAS_NOT_EQUIPPED_S1_SO_S2_CANNOT_BE_USED;
	
	@ClientString(id = 2964, message = "Being appointed as a Noblesse/Exalted will cancel all related quests. Do you wish to continue?")
	public static SystemMessageId BEING_APPOINTED_AS_A_NOBLESSE_EXALTED_WILL_CANCEL_ALL_RELATED_QUESTS_DO_YOU_WISH_TO_CONTINUE;
	
	@ClientString(id = 2965, message = "You cannot purchase and re-purchase the same type of item at the same time.")
	public static SystemMessageId YOU_CANNOT_PURCHASE_AND_RE_PURCHASE_THE_SAME_TYPE_OF_ITEM_AT_THE_SAME_TIME;
	
	@ClientString(id = 2966, message = "It's a Payment Request transaction. Please attach the item.")
	public static SystemMessageId IT_S_A_PAYMENT_REQUEST_TRANSACTION_PLEASE_ATTACH_THE_ITEM;
	
	@ClientString(id = 2967, message = "You are about to send a regular mail with no fees. Proceed?")
	public static SystemMessageId YOU_ARE_ABOUT_TO_SEND_A_REGULAR_MAIL_WITH_NO_FEES_PROCEED;
	
	@ClientString(id = 2968, message = "The mail limit (240) has been exceeded and this cannot be forwarded.")
	public static SystemMessageId THE_MAIL_LIMIT_240_HAS_BEEN_EXCEEDED_AND_THIS_CANNOT_BE_FORWARDED;
	
	@ClientString(id = 2969, message = "The previous mail was forwarded less than 1 minute ago and this cannot be forwarded.")
	public static SystemMessageId THE_PREVIOUS_MAIL_WAS_FORWARDED_LESS_THAN_1_MINUTE_AGO_AND_THIS_CANNOT_BE_FORWARDED;
	
	@ClientString(id = 2970, message = "You cannot forward in a non-peace zone location.")
	public static SystemMessageId YOU_CANNOT_FORWARD_IN_A_NON_PEACE_ZONE_LOCATION;
	
	@ClientString(id = 2971, message = "You cannot forward during an exchange.")
	public static SystemMessageId YOU_CANNOT_FORWARD_DURING_AN_EXCHANGE;
	
	@ClientString(id = 2972, message = "You cannot forward because the private store or workshop is in progress.")
	public static SystemMessageId YOU_CANNOT_FORWARD_BECAUSE_THE_PRIVATE_STORE_OR_WORKSHOP_IS_IN_PROGRESS;
	
	@ClientString(id = 2973, message = "You cannot send mail while enchanting an item, bestowing an attribute, or combining jewels.")
	public static SystemMessageId YOU_CANNOT_SEND_MAIL_WHILE_ENCHANTING_AN_ITEM_BESTOWING_AN_ATTRIBUTE_OR_COMBINING_JEWELS;
	
	@ClientString(id = 2974, message = "The item that you're trying to send cannot be forwarded because it isn't proper.")
	public static SystemMessageId THE_ITEM_THAT_YOU_RE_TRYING_TO_SEND_CANNOT_BE_FORWARDED_BECAUSE_IT_ISN_T_PROPER;
	
	@ClientString(id = 2975, message = "You cannot forward because you don't have enough Adena.")
	public static SystemMessageId YOU_CANNOT_FORWARD_BECAUSE_YOU_DON_T_HAVE_ENOUGH_ADENA;
	
	@ClientString(id = 2976, message = "You cannot receive in a non-peace zone location.")
	public static SystemMessageId YOU_CANNOT_RECEIVE_IN_A_NON_PEACE_ZONE_LOCATION;
	
	@ClientString(id = 2977, message = "You cannot receive during an exchange.")
	public static SystemMessageId YOU_CANNOT_RECEIVE_DURING_AN_EXCHANGE;
	
	@ClientString(id = 2978, message = "You cannot receive because the private store or workshop is in progress.")
	public static SystemMessageId YOU_CANNOT_RECEIVE_BECAUSE_THE_PRIVATE_STORE_OR_WORKSHOP_IS_IN_PROGRESS;
	
	@ClientString(id = 2979, message = "You cannot receive mail while enchanting an item, bestowing an attribute, or combining jewels.")
	public static SystemMessageId YOU_CANNOT_RECEIVE_MAIL_WHILE_ENCHANTING_AN_ITEM_BESTOWING_AN_ATTRIBUTE_OR_COMBINING_JEWELS;
	
	@ClientString(id = 2980, message = "You cannot receive because you don't have enough Adena.")
	public static SystemMessageId YOU_CANNOT_RECEIVE_BECAUSE_YOU_DON_T_HAVE_ENOUGH_ADENA;
	
	@ClientString(id = 2981, message = "You could not receive because your inventory is full.")
	public static SystemMessageId YOU_COULD_NOT_RECEIVE_BECAUSE_YOUR_INVENTORY_IS_FULL;
	
	@ClientString(id = 2982, message = "You cannot cancel in a non-peace zone location.")
	public static SystemMessageId YOU_CANNOT_CANCEL_IN_A_NON_PEACE_ZONE_LOCATION;
	
	@ClientString(id = 2983, message = "You cannot cancel during an exchange.")
	public static SystemMessageId YOU_CANNOT_CANCEL_DURING_AN_EXCHANGE;
	
	@ClientString(id = 2984, message = "You cannot cancel because the private store or workshop is in progress.")
	public static SystemMessageId YOU_CANNOT_CANCEL_BECAUSE_THE_PRIVATE_STORE_OR_WORKSHOP_IS_IN_PROGRESS;
	
	@ClientString(id = 2985, message = "You cannot cancel during an item enhancement or attribute enhancement.")
	public static SystemMessageId YOU_CANNOT_CANCEL_DURING_AN_ITEM_ENHANCEMENT_OR_ATTRIBUTE_ENHANCEMENT;
	
	@ClientString(id = 2986, message = "Please set the amount of Adena to send.")
	public static SystemMessageId PLEASE_SET_THE_AMOUNT_OF_ADENA_TO_SEND;
	
	@ClientString(id = 2987, message = "Please set the amount of Adena to receive.")
	public static SystemMessageId PLEASE_SET_THE_AMOUNT_OF_ADENA_TO_RECEIVE;
	
	@ClientString(id = 2988, message = "You could not cancel receipt because your inventory is full.")
	public static SystemMessageId YOU_COULD_NOT_CANCEL_RECEIPT_BECAUSE_YOUR_INVENTORY_IS_FULL;
	
	@ClientString(id = 2989, message = "Dimensional item $s1 is being used.")
	public static SystemMessageId DIMENSIONAL_ITEM_S1_IS_BEING_USED;
	
	@ClientString(id = 2990, message = "$s2 unit(s) of dimensional item $s1 were consumed.")
	public static SystemMessageId S2_UNIT_S_OF_DIMENSIONAL_ITEM_S1_WERE_CONSUMED;
	
	@ClientString(id = 2991, message = "True input must be entered by someone over 15 years old.")
	public static SystemMessageId TRUE_INPUT_MUST_BE_ENTERED_BY_SOMEONE_OVER_15_YEARS_OLD;
	
	@ClientString(id = 2992, message = "Please choose the 2nd stage type.")
	public static SystemMessageId PLEASE_CHOOSE_THE_2ND_STAGE_TYPE;
	
	@ClientString(id = 2993, message = "If the Command Channel leader leaves the party matching room, then the sessions ends. Do you really wish to exit the room?")
	public static SystemMessageId IF_THE_COMMAND_CHANNEL_LEADER_LEAVES_THE_PARTY_MATCHING_ROOM_THEN_THE_SESSIONS_ENDS_DO_YOU_REALLY_WISH_TO_EXIT_THE_ROOM;
	
	@ClientString(id = 2994, message = "The Command Channel matching room was cancelled.")
	public static SystemMessageId THE_COMMAND_CHANNEL_MATCHING_ROOM_WAS_CANCELLED;
	
	@ClientString(id = 2995, message = "This Command Channel matching room is already cancelled.")
	public static SystemMessageId THIS_COMMAND_CHANNEL_MATCHING_ROOM_IS_ALREADY_CANCELLED;
	
	@ClientString(id = 2996, message = "You cannot enter the Command Channel matching room because you do not meet the requirements.")
	public static SystemMessageId YOU_CANNOT_ENTER_THE_COMMAND_CHANNEL_MATCHING_ROOM_BECAUSE_YOU_DO_NOT_MEET_THE_REQUIREMENTS;
	
	@ClientString(id = 2997, message = "You exited from the Command Channel matching room.")
	public static SystemMessageId YOU_EXITED_FROM_THE_COMMAND_CHANNEL_MATCHING_ROOM;
	
	@ClientString(id = 2998, message = "You were expelled from the Command Channel matching room.")
	public static SystemMessageId YOU_WERE_EXPELLED_FROM_THE_COMMAND_CHANNEL_MATCHING_ROOM;
	
	@ClientString(id = 2999, message = "The Command Channel affiliated party's party member cannot use the matching screen.")
	public static SystemMessageId THE_COMMAND_CHANNEL_AFFILIATED_PARTY_S_PARTY_MEMBER_CANNOT_USE_THE_MATCHING_SCREEN;
	
	@ClientString(id = 3000, message = "The Command Channel matching room was created.")
	public static SystemMessageId THE_COMMAND_CHANNEL_MATCHING_ROOM_WAS_CREATED;
	
	@ClientString(id = 3001, message = "The Command Channel matching room information was edited.")
	public static SystemMessageId THE_COMMAND_CHANNEL_MATCHING_ROOM_INFORMATION_WAS_EDITED;
	
	@ClientString(id = 3002, message = "When the recipient doesn't exist or the character has been deleted, sending mail is not possible.")
	public static SystemMessageId WHEN_THE_RECIPIENT_DOESN_T_EXIST_OR_THE_CHARACTER_HAS_BEEN_DELETED_SENDING_MAIL_IS_NOT_POSSIBLE;
	
	@ClientString(id = 3003, message = "$c1 entered the Command Channel matching room.")
	public static SystemMessageId C1_ENTERED_THE_COMMAND_CHANNEL_MATCHING_ROOM;
	
	@ClientString(id = 3004, message = "I'm sorry to give you a satisfactory response.nnIf you send your comments regarding the unsatisfying parts, we will be able to provide even greater service.nnPlease send us your comments.")
	public static SystemMessageId I_M_SORRY_TO_GIVE_YOU_A_SATISFACTORY_RESPONSE_N_NIF_YOU_SEND_YOUR_COMMENTS_REGARDING_THE_UNSATISFYING_PARTS_WE_WILL_BE_ABLE_TO_PROVIDE_EVEN_GREATER_SERVICE_N_NPLEASE_SEND_US_YOUR_COMMENTS;
	
	@ClientString(id = 3005, message = "This skill cannot be enhanced.")
	public static SystemMessageId THIS_SKILL_CANNOT_BE_ENHANCED;
	
	@ClientString(id = 3006, message = "$s1 PC Points were withdrawn.")
	public static SystemMessageId S1_PC_POINTS_WERE_WITHDRAWN;
	
	@ClientString(id = 3007, message = "Shyeed's roar filled with wrath rings throughout the Stakato Nest.")
	public static SystemMessageId SHYEED_S_ROAR_FILLED_WITH_WRATH_RINGS_THROUGHOUT_THE_STAKATO_NEST;
	
	@ClientString(id = 3008, message = "The mail has arrived.")
	public static SystemMessageId THE_MAIL_HAS_ARRIVED;
	
	@ClientString(id = 3009, message = "Mail successfully sent.")
	public static SystemMessageId MAIL_SUCCESSFULLY_SENT;
	
	@ClientString(id = 3010, message = "Mail successfully returned.")
	public static SystemMessageId MAIL_SUCCESSFULLY_RETURNED;
	
	@ClientString(id = 3011, message = "Mail successfully cancelled.")
	public static SystemMessageId MAIL_SUCCESSFULLY_CANCELLED;
	
	@ClientString(id = 3012, message = "Mail successfully received.")
	public static SystemMessageId MAIL_SUCCESSFULLY_RECEIVED;
	
	@ClientString(id = 3013, message = "$c1 has successfully enchanted a +$s2 $s3.")
	public static SystemMessageId C1_HAS_SUCCESSFULLY_ENCHANTED_A_S2_S3;
	
	@ClientString(id = 3014, message = "Do you wish to erase the selected mail?")
	public static SystemMessageId DO_YOU_WISH_TO_ERASE_THE_SELECTED_MAIL;
	
	@ClientString(id = 3015, message = "Please select the mail to be deleted.")
	public static SystemMessageId PLEASE_SELECT_THE_MAIL_TO_BE_DELETED;
	
	@ClientString(id = 3016, message = "Item selection is possible up to 8.")
	public static SystemMessageId ITEM_SELECTION_IS_POSSIBLE_UP_TO_8;
	
	@ClientString(id = 3017, message = "You cannot use any skill enhancing system under your status. Check out the PC's current status.")
	public static SystemMessageId YOU_CANNOT_USE_ANY_SKILL_ENHANCING_SYSTEM_UNDER_YOUR_STATUS_CHECK_OUT_THE_PC_S_CURRENT_STATUS;
	
	@ClientString(id = 3018, message = "You cannot use skill enhancing system functions for the skills currently not acquired.")
	public static SystemMessageId YOU_CANNOT_USE_SKILL_ENHANCING_SYSTEM_FUNCTIONS_FOR_THE_SKILLS_CURRENTLY_NOT_ACQUIRED;
	
	@ClientString(id = 3019, message = "You cannot send a mail to yourself.")
	public static SystemMessageId YOU_CANNOT_SEND_A_MAIL_TO_YOURSELF;
	
	@ClientString(id = 3020, message = "When not entering the amount for the payment request, you cannot send any mail.")
	public static SystemMessageId WHEN_NOT_ENTERING_THE_AMOUNT_FOR_THE_PAYMENT_REQUEST_YOU_CANNOT_SEND_ANY_MAIL;
	
	@ClientString(id = 3021, message = "Stand-by for the game to begin")
	public static SystemMessageId STAND_BY_FOR_THE_GAME_TO_BEGIN;
	
	@ClientString(id = 3022, message = "All 4 of Kasha's Eyes have appeared.")
	public static SystemMessageId ALL_4_OF_KASHA_S_EYES_HAVE_APPEARED;
	
	@ClientString(id = 3023, message = "A great curse can be felt from Kasha's Eyes!")
	public static SystemMessageId A_GREAT_CURSE_CAN_BE_FELT_FROM_KASHA_S_EYES;
	
	@ClientString(id = 3024, message = "Defeat Kasha's Eyes to lift the great curse!")
	public static SystemMessageId DEFEAT_KASHA_S_EYES_TO_LIFT_THE_GREAT_CURSE;
	
	@ClientString(id = 3025, message = "$s2 has made a payment of $s1 Adena per your payment request mail.")
	public static SystemMessageId S2_HAS_MADE_A_PAYMENT_OF_S1_ADENA_PER_YOUR_PAYMENT_REQUEST_MAIL;
	
	@ClientString(id = 3026, message = "You cannot use the skill enhancing function on this level. You can use the corresponding function on levels higher than Lv. 76.")
	public static SystemMessageId YOU_CANNOT_USE_THE_SKILL_ENHANCING_FUNCTION_ON_THIS_LEVEL_YOU_CAN_USE_THE_CORRESPONDING_FUNCTION_ON_LEVELS_HIGHER_THAN_LV_76;
	
	@ClientString(id = 3027, message = "You cannot use the skill enhancing function in this class. You can use corresponding function when completing the third class change.")
	public static SystemMessageId YOU_CANNOT_USE_THE_SKILL_ENHANCING_FUNCTION_IN_THIS_CLASS_YOU_CAN_USE_CORRESPONDING_FUNCTION_WHEN_COMPLETING_THE_THIRD_CLASS_CHANGE;
	
	@ClientString(id = 3028, message = "You cannot use the skill enhancing function in this state. You can enhance skills when not in battle, and cannot use the function while transformed, in battle, on a mount, or while the skill is on cooldown.")
	public static SystemMessageId YOU_CANNOT_USE_THE_SKILL_ENHANCING_FUNCTION_IN_THIS_STATE_YOU_CAN_ENHANCE_SKILLS_WHEN_NOT_IN_BATTLE_AND_CANNOT_USE_THE_FUNCTION_WHILE_TRANSFORMED_IN_BATTLE_ON_A_MOUNT_OR_WHILE_THE_SKILL_IS_ON_COOLDOWN;
	
	@ClientString(id = 3029, message = "$s1 returned the mail.")
	public static SystemMessageId S1_RETURNED_THE_MAIL;
	
	@ClientString(id = 3030, message = "You cannot cancel sent mail since the recipient received it.")
	public static SystemMessageId YOU_CANNOT_CANCEL_SENT_MAIL_SINCE_THE_RECIPIENT_RECEIVED_IT;
	
	@ClientString(id = 3031, message = "By using the skill of Einhasad's holy sword, defeat the evil Lilims!")
	public static SystemMessageId BY_USING_THE_SKILL_OF_EINHASAD_S_HOLY_SWORD_DEFEAT_THE_EVIL_LILIMS;
	
	@ClientString(id = 3032, message = "In order to help Anakim, activate the sealing device of the Emperor who is possessed by the evil magical curse! Magical curse is very powerful, so we must be careful!")
	public static SystemMessageId IN_ORDER_TO_HELP_ANAKIM_ACTIVATE_THE_SEALING_DEVICE_OF_THE_EMPEROR_WHO_IS_POSSESSED_BY_THE_EVIL_MAGICAL_CURSE_MAGICAL_CURSE_IS_VERY_POWERFUL_SO_WE_MUST_BE_CAREFUL;
	
	@ClientString(id = 3033, message = "By using the invisible skill, sneak into the Dawn's document storage!")
	public static SystemMessageId BY_USING_THE_INVISIBLE_SKILL_SNEAK_INTO_THE_DAWN_S_DOCUMENT_STORAGE;
	
	@ClientString(id = 3034, message = "The door in front of us is the entrance to the Dawn's document storage! Approach to the Code Input Device!")
	public static SystemMessageId THE_DOOR_IN_FRONT_OF_US_IS_THE_ENTRANCE_TO_THE_DAWN_S_DOCUMENT_STORAGE_APPROACH_TO_THE_CODE_INPUT_DEVICE;
	
	@ClientString(id = 3035, message = "My power's weakening. Please activate the sealing device possessed by Lilith' magical curse!")
	public static SystemMessageId MY_POWER_S_WEAKENING_PLEASE_ACTIVATE_THE_SEALING_DEVICE_POSSESSED_BY_LILITH_MAGICAL_CURSE;
	
	@ClientString(id = 3036, message = "You, such a fool! The victory over this war belongs to Shilen!")
	public static SystemMessageId YOU_SUCH_A_FOOL_THE_VICTORY_OVER_THIS_WAR_BELONGS_TO_SHILEN;
	
	@ClientString(id = 3037, message = "Male guards can detect the concealment but the female guards cannot.")
	public static SystemMessageId MALE_GUARDS_CAN_DETECT_THE_CONCEALMENT_BUT_THE_FEMALE_GUARDS_CANNOT;
	
	@ClientString(id = 3038, message = "Female guards notice the disguises from far away better than the male guards do, so beware.")
	public static SystemMessageId FEMALE_GUARDS_NOTICE_THE_DISGUISES_FROM_FAR_AWAY_BETTER_THAN_THE_MALE_GUARDS_DO_SO_BEWARE;
	
	@ClientString(id = 3039, message = "By using the holy water of Einhasad, open the door possessed by the curse of flames.")
	public static SystemMessageId BY_USING_THE_HOLY_WATER_OF_EINHASAD_OPEN_THE_DOOR_POSSESSED_BY_THE_CURSE_OF_FLAMES;
	
	@ClientString(id = 3040, message = "By using the Court Wizard's Magic Staff, open the door on which the magician's barrier is placed.")
	public static SystemMessageId BY_USING_THE_COURT_WIZARD_S_MAGIC_STAFF_OPEN_THE_DOOR_ON_WHICH_THE_MAGICIAN_S_BARRIER_IS_PLACED;
	
	@ClientString(id = 3041, message = "Around fifteen hundred years ago, the lands were riddled with heretics,")
	public static SystemMessageId AROUND_FIFTEEN_HUNDRED_YEARS_AGO_THE_LANDS_WERE_RIDDLED_WITH_HERETICS;
	
	@ClientString(id = 3042, message = "worshippers of Shilen, the Goddess of Death...")
	public static SystemMessageId WORSHIPPERS_OF_SHILEN_THE_GODDESS_OF_DEATH;
	
	@ClientString(id = 3043, message = "But a miracle happened at the enthronement of Shunaiman, the first emperor.")
	public static SystemMessageId BUT_A_MIRACLE_HAPPENED_AT_THE_ENTHRONEMENT_OF_SHUNAIMAN_THE_FIRST_EMPEROR;
	
	@ClientString(id = 3044, message = "Anakim, an angel of Einhasad, came down from the skies,")
	public static SystemMessageId ANAKIM_AN_ANGEL_OF_EINHASAD_CAME_DOWN_FROM_THE_SKIES;
	
	@ClientString(id = 3045, message = "surrounded by sacred flames and three pairs of wings.")
	public static SystemMessageId SURROUNDED_BY_SACRED_FLAMES_AND_THREE_PAIRS_OF_WINGS;
	
	@ClientString(id = 3046, message = "Thus empowered, the Emperor launched a war against 'Shilen's People.'")
	public static SystemMessageId THUS_EMPOWERED_THE_EMPEROR_LAUNCHED_A_WAR_AGAINST_SHILEN_S_PEOPLE;
	
	@ClientString(id = 3047, message = "The emperor's army led by Anakim attacked 'Shilen's People' relentlessly,")
	public static SystemMessageId THE_EMPEROR_S_ARMY_LED_BY_ANAKIM_ATTACKED_SHILEN_S_PEOPLE_RELENTLESSLY;
	
	@ClientString(id = 3048, message = "but in the end some survivors managed to hide in underground Catacombs.")
	public static SystemMessageId BUT_IN_THE_END_SOME_SURVIVORS_MANAGED_TO_HIDE_IN_UNDERGROUND_CATACOMBS;
	
	@ClientString(id = 3049, message = "A new leader emerged, Lilith, who sought to summon Shilen from the afterlife,")
	public static SystemMessageId A_NEW_LEADER_EMERGED_LILITH_WHO_SOUGHT_TO_SUMMON_SHILEN_FROM_THE_AFTERLIFE;
	
	@ClientString(id = 3050, message = "and to rebuild the Lilim army within the eight Necropolises.")
	public static SystemMessageId AND_TO_REBUILD_THE_LILIM_ARMY_WITHIN_THE_EIGHT_NECROPOLISES;
	
	@ClientString(id = 3051, message = "Now, in the midst of impending war, the merchant of Mammon struck a deal.")
	public static SystemMessageId NOW_IN_THE_MIDST_OF_IMPENDING_WAR_THE_MERCHANT_OF_MAMMON_STRUCK_A_DEAL;
	
	@ClientString(id = 3052, message = "He supplies Shunaiman with war funds in exchange for protection.")
	public static SystemMessageId HE_SUPPLIES_SHUNAIMAN_WITH_WAR_FUNDS_IN_EXCHANGE_FOR_PROTECTION;
	
	@ClientString(id = 3053, message = "And right now the document we're looking for is that contract.")
	public static SystemMessageId AND_RIGHT_NOW_THE_DOCUMENT_WE_RE_LOOKING_FOR_IS_THAT_CONTRACT;
	
	@ClientString(id = 3054, message = "Finally you're here! I'm Anakim, I need your help.")
	public static SystemMessageId FINALLY_YOU_RE_HERE_I_M_ANAKIM_I_NEED_YOUR_HELP;
	
	@ClientString(id = 3055, message = "It's the seal devices... I need you to destroy them while I distract Lilith!")
	public static SystemMessageId IT_S_THE_SEAL_DEVICES_I_NEED_YOU_TO_DESTROY_THEM_WHILE_I_DISTRACT_LILITH;
	
	@ClientString(id = 3056, message = "Please hurry. I don't have much time left!")
	public static SystemMessageId PLEASE_HURRY_I_DON_T_HAVE_MUCH_TIME_LEFT;
	
	@ClientString(id = 3057, message = "For Einhasad!")
	public static SystemMessageId FOR_EINHASAD;
	
	@ClientString(id = 3058, message = "Em.bry.o..")
	public static SystemMessageId EM_BRY_O;
	
	@ClientString(id = 3059, message = "$s1 did not receive it during the waiting time, so it was returned automatically.")
	public static SystemMessageId S1_DID_NOT_RECEIVE_IT_DURING_THE_WAITING_TIME_SO_IT_WAS_RETURNED_AUTOMATICALLY;
	
	@ClientString(id = 3060, message = "The sealing device glitters and moves. Activation complete normally!")
	public static SystemMessageId THE_SEALING_DEVICE_GLITTERS_AND_MOVES_ACTIVATION_COMPLETE_NORMALLY;
	
	@ClientString(id = 3061, message = "There comes a sound of opening the heavy door from somewhere.")
	public static SystemMessageId THERE_COMES_A_SOUND_OF_OPENING_THE_HEAVY_DOOR_FROM_SOMEWHERE;
	
	@ClientString(id = 3062, message = "Do you want to pay $s1 Adena?")
	public static SystemMessageId DO_YOU_WANT_TO_PAY_S1_ADENA;
	
	@ClientString(id = 3063, message = "Do you really want to forward?")
	public static SystemMessageId DO_YOU_REALLY_WANT_TO_FORWARD;
	
	@ClientString(id = 3064, message = "You have new mail.")
	public static SystemMessageId YOU_HAVE_NEW_MAIL;
	
	@ClientString(id = 3065, message = "Current location: Inside the Chamber of Delusion")
	public static SystemMessageId CURRENT_LOCATION_INSIDE_THE_CHAMBER_OF_DELUSION;
	
	@ClientString(id = 3066, message = "You cannot receive or send mail with attached items in non-peace zone regions.")
	public static SystemMessageId YOU_CANNOT_RECEIVE_OR_SEND_MAIL_WITH_ATTACHED_ITEMS_IN_NON_PEACE_ZONE_REGIONS;
	
	@ClientString(id = 3067, message = "$s1 canceled the sent mail.")
	public static SystemMessageId S1_CANCELED_THE_SENT_MAIL;
	
	@ClientString(id = 3068, message = "The mail was returned due to the exceeded waiting time.")
	public static SystemMessageId THE_MAIL_WAS_RETURNED_DUE_TO_THE_EXCEEDED_WAITING_TIME;
	
	@ClientString(id = 3069, message = "Do you really want to return this mail to the sender?")
	public static SystemMessageId DO_YOU_REALLY_WANT_TO_RETURN_THIS_MAIL_TO_THE_SENDER;
	
	@ClientString(id = 3070, message = "Skill not available to be enhanced Check skill's Lv and current PC status.")
	public static SystemMessageId SKILL_NOT_AVAILABLE_TO_BE_ENHANCED_CHECK_SKILL_S_LV_AND_CURRENT_PC_STATUS;
	
	@ClientString(id = 3071, message = "Do you really want to reset? 10,000,000(10 million) Adena will be consumed.")
	public static SystemMessageId DO_YOU_REALLY_WANT_TO_RESET_10_000_000_10_MILLION_ADENA_WILL_BE_CONSUMED;
	
	@ClientString(id = 3072, message = "$s1 acquired the attached item to your mail.")
	public static SystemMessageId S1_ACQUIRED_THE_ATTACHED_ITEM_TO_YOUR_MAIL;
	
	@ClientString(id = 3073, message = "You have acquired $s2 $s1.")
	public static SystemMessageId YOU_HAVE_ACQUIRED_S2_S1;
	
	@ClientString(id = 3074, message = "The allowed length for recipient exceeded.")
	public static SystemMessageId THE_ALLOWED_LENGTH_FOR_RECIPIENT_EXCEEDED;
	
	@ClientString(id = 3075, message = "The allowed length for a title exceeded.")
	public static SystemMessageId THE_ALLOWED_LENGTH_FOR_A_TITLE_EXCEEDED;
	
	@ClientString(id = 3076, message = "The allowed length for a title exceeded.")
	public static SystemMessageId THE_ALLOWED_LENGTH_FOR_A_TITLE_EXCEEDED2;
	
	@ClientString(id = 3077, message = "The mail limit (240) of the opponent's character has been exceeded and this cannot be forwarded.")
	public static SystemMessageId THE_MAIL_LIMIT_240_OF_THE_OPPONENT_S_CHARACTER_HAS_BEEN_EXCEEDED_AND_THIS_CANNOT_BE_FORWARDED;
	
	@ClientString(id = 3078, message = "You're making a request for payment. Do you want to proceed?")
	public static SystemMessageId YOU_RE_MAKING_A_REQUEST_FOR_PAYMENT_DO_YOU_WANT_TO_PROCEED;
	
	@ClientString(id = 3079, message = "There are items in your Pet Inventory rendering you unable to sell/trade/drop pet summoning items. Please empty your Pet Inventory.")
	public static SystemMessageId THERE_ARE_ITEMS_IN_YOUR_PET_INVENTORY_RENDERING_YOU_UNABLE_TO_SELL_TRADE_DROP_PET_SUMMONING_ITEMS_PLEASE_EMPTY_YOUR_PET_INVENTORY;
	
	@ClientString(id = 3080, message = "You cannot reset the Skill Link because there is not enough Adena.")
	public static SystemMessageId YOU_CANNOT_RESET_THE_SKILL_LINK_BECAUSE_THERE_IS_NOT_ENOUGH_ADENA;
	
	@ClientString(id = 3081, message = "You cannot receive it because you are under the condition that the opponent cannot acquire any Adena for payment.")
	public static SystemMessageId YOU_CANNOT_RECEIVE_IT_BECAUSE_YOU_ARE_UNDER_THE_CONDITION_THAT_THE_OPPONENT_CANNOT_ACQUIRE_ANY_ADENA_FOR_PAYMENT;
	
	@ClientString(id = 3082, message = "You cannot send mails to any character that has blocked you.")
	public static SystemMessageId YOU_CANNOT_SEND_MAILS_TO_ANY_CHARACTER_THAT_HAS_BLOCKED_YOU;
	
	@ClientString(id = 3083, message = "In the process of working on the previous clan declaration/retreat. Please try again later.")
	public static SystemMessageId IN_THE_PROCESS_OF_WORKING_ON_THE_PREVIOUS_CLAN_DECLARATION_RETREAT_PLEASE_TRY_AGAIN_LATER;
	
	@ClientString(id = 3084, message = "Currently, we are in the process of choosing a hero. Please try again later.")
	public static SystemMessageId CURRENTLY_WE_ARE_IN_THE_PROCESS_OF_CHOOSING_A_HERO_PLEASE_TRY_AGAIN_LATER;
	
	@ClientString(id = 3085, message = "You can summon the pet you are trying to summon now only when you own a clan hall.")
	public static SystemMessageId YOU_CAN_SUMMON_THE_PET_YOU_ARE_TRYING_TO_SUMMON_NOW_ONLY_WHEN_YOU_OWN_A_CLAN_HALL;
	
	@ClientString(id = 3086, message = "Would you like to give $s2 $s1?")
	public static SystemMessageId WOULD_YOU_LIKE_TO_GIVE_S2_S1;
	
	@ClientString(id = 3087, message = "This mail is being sent with a Payment Request. Would you like to continue?")
	public static SystemMessageId THIS_MAIL_IS_BEING_SENT_WITH_A_PAYMENT_REQUEST_WOULD_YOU_LIKE_TO_CONTINUE;
	
	@ClientString(id = 3088, message = "You have $s1 hour(s) $s2 minute(s) and $s3 second(s) left in the Proof of Time and Space . If Agathion is summoned within this time, 10 minutes or more can be added.")
	public static SystemMessageId YOU_HAVE_S1_HOUR_S_S2_MINUTE_S_AND_S3_SECOND_S_LEFT_IN_THE_PROOF_OF_TIME_AND_SPACE_IF_AGATHION_IS_SUMMONED_WITHIN_THIS_TIME_10_MINUTES_OR_MORE_CAN_BE_ADDED;
	
	@ClientString(id = 3089, message = "You have $s1 minute(s) and $s2 second(s) left in the Proof of Time and Space . If Agathion is summoned within this time, 10 minutes or more can be added.")
	public static SystemMessageId YOU_HAVE_S1_MINUTE_S_AND_S2_SECOND_S_LEFT_IN_THE_PROOF_OF_TIME_AND_SPACE_IF_AGATHION_IS_SUMMONED_WITHIN_THIS_TIME_10_MINUTES_OR_MORE_CAN_BE_ADDED;
	
	@ClientString(id = 3090, message = "You have $s1 second(s) left in the Proof of Time and Space . If Agathion is summoned within this time, 10 minutes or more can be added.")
	public static SystemMessageId YOU_HAVE_S1_SECOND_S_LEFT_IN_THE_PROOF_OF_TIME_AND_SPACE_IF_AGATHION_IS_SUMMONED_WITHIN_THIS_TIME_10_MINUTES_OR_MORE_CAN_BE_ADDED;
	
	@ClientString(id = 3091, message = "You cannot delete characters on this server right now.")
	public static SystemMessageId YOU_CANNOT_DELETE_CHARACTERS_ON_THIS_SERVER_RIGHT_NOW;
	
	@ClientString(id = 3092, message = "Transaction completed.")
	public static SystemMessageId TRANSACTION_COMPLETED;
	
	@ClientString(id = 3093, message = "Value is too high. Please try again.")
	public static SystemMessageId VALUE_IS_TOO_HIGH_PLEASE_TRY_AGAIN;
	
	@ClientString(id = 3094, message = "A user currently participating in the Olympiad cannot send party and friend invitations.")
	public static SystemMessageId A_USER_CURRENTLY_PARTICIPATING_IN_THE_OLYMPIAD_CANNOT_SEND_PARTY_AND_FRIEND_INVITATIONS;
	
	@ClientString(id = 3095, message = "The certification failed because you did not enter a valid certification number or you did not enter a certification number at all. If you fail 3 times in a row, you will be blocked from the game for 30 minutes.")
	public static SystemMessageId THE_CERTIFICATION_FAILED_BECAUSE_YOU_DID_NOT_ENTER_A_VALID_CERTIFICATION_NUMBER_OR_YOU_DID_NOT_ENTER_A_CERTIFICATION_NUMBER_AT_ALL_IF_YOU_FAIL_3_TIMES_IN_A_ROW_YOU_WILL_BE_BLOCKED_FROM_THE_GAME_FOR_30_MINUTES;
	
	@ClientString(id = 3096, message = "Due to problems with communications, our telephone certification service is currently unavailable. Please try again later.")
	public static SystemMessageId DUE_TO_PROBLEMS_WITH_COMMUNICATIONS_OUR_TELEPHONE_CERTIFICATION_SERVICE_IS_CURRENTLY_UNAVAILABLE_PLEASE_TRY_AGAIN_LATER;
	
	@ClientString(id = 3097, message = "Due to problems with communications, telephone signals are being delayed. Please try again later.")
	public static SystemMessageId DUE_TO_PROBLEMS_WITH_COMMUNICATIONS_TELEPHONE_SIGNALS_ARE_BEING_DELAYED_PLEASE_TRY_AGAIN_LATER;
	
	@ClientString(id = 3098, message = "The certification failed because the line was busy or the call was not received. Please try again.")
	public static SystemMessageId THE_CERTIFICATION_FAILED_BECAUSE_THE_LINE_WAS_BUSY_OR_THE_CALL_WAS_NOT_RECEIVED_PLEASE_TRY_AGAIN;
	
	@ClientString(id = 3099, message = "An unexpected error has occured. Please contact our Customer Support Team at https://support.lineage2.com")
	public static SystemMessageId AN_UNEXPECTED_ERROR_HAS_OCCURED_PLEASE_CONTACT_OUR_CUSTOMER_SUPPORT_TEAM_AT_HTTPS_SUPPORT_LINEAGE2_COM;
	
	@ClientString(id = 3100, message = "The telephone certification service is currently being checked. Please try again later.")
	public static SystemMessageId THE_TELEPHONE_CERTIFICATION_SERVICE_IS_CURRENTLY_BEING_CHECKED_PLEASE_TRY_AGAIN_LATER;
	
	@ClientString(id = 3101, message = "Due to heavy volume, the telephone certification service cannot be used at this time. Please try again later.")
	public static SystemMessageId DUE_TO_HEAVY_VOLUME_THE_TELEPHONE_CERTIFICATION_SERVICE_CANNOT_BE_USED_AT_THIS_TIME_PLEASE_TRY_AGAIN_LATER;
	
	@ClientString(id = 3102, message = "An unexpected error has occured. Please contact our Customer Support Team at https://support.lineage2.com")
	public static SystemMessageId AN_UNEXPECTED_ERROR_HAS_OCCURED_PLEASE_CONTACT_OUR_CUSTOMER_SUPPORT_TEAM_AT_HTTPS_SUPPORT_LINEAGE2_COM2;
	
	@ClientString(id = 3103, message = "The telephone certification failed 3 times in a row, so game play has been blocked for 30 minutes. Please try again later.")
	public static SystemMessageId THE_TELEPHONE_CERTIFICATION_FAILED_3_TIMES_IN_A_ROW_SO_GAME_PLAY_HAS_BEEN_BLOCKED_FOR_30_MINUTES_PLEASE_TRY_AGAIN_LATER;
	
	@ClientString(id = 3104, message = "The number of uses of the daily telephone certification service has been exceeded.")
	public static SystemMessageId THE_NUMBER_OF_USES_OF_THE_DAILY_TELEPHONE_CERTIFICATION_SERVICE_HAS_BEEN_EXCEEDED;
	
	@ClientString(id = 3105, message = "Telephone certification is already underway. Please try again later.")
	public static SystemMessageId TELEPHONE_CERTIFICATION_IS_ALREADY_UNDERWAY_PLEASE_TRY_AGAIN_LATER;
	
	@ClientString(id = 3106, message = "Telephone certification is underway.")
	public static SystemMessageId TELEPHONE_CERTIFICATION_IS_UNDERWAY;
	
	@ClientString(id = 3107, message = "One moment please.")
	public static SystemMessageId ONE_MOMENT_PLEASE;
	
	@ClientString(id = 3108, message = "You are no longer protected from aggressive monsters.")
	public static SystemMessageId YOU_ARE_NO_LONGER_PROTECTED_FROM_AGGRESSIVE_MONSTERS;
	
	@ClientString(id = 3109, message = "$s1 has achieved $s2 wins in a row in Jack's game.")
	public static SystemMessageId S1_HAS_ACHIEVED_S2_WINS_IN_A_ROW_IN_JACK_S_GAME;
	
	@ClientString(id = 3110, message = "In reward for $s2 wins in a row, $s1 has received $s4 of $s3(s).")
	public static SystemMessageId IN_REWARD_FOR_S2_WINS_IN_A_ROW_S1_HAS_RECEIVED_S4_OF_S3_S;
	
	@ClientString(id = 3111, message = "World: $s1 wins in a row ($s2 ppl)")
	public static SystemMessageId WORLD_S1_WINS_IN_A_ROW_S2_PPL;
	
	@ClientString(id = 3112, message = "My record: $s1 wins in a row")
	public static SystemMessageId MY_RECORD_S1_WINS_IN_A_ROW;
	
	@ClientString(id = 3113, message = "World: Below 4 wins in a row")
	public static SystemMessageId WORLD_BELOW_4_WINS_IN_A_ROW;
	
	@ClientString(id = 3114, message = "My record: Below 4 wins in a row")
	public static SystemMessageId MY_RECORD_BELOW_4_WINS_IN_A_ROW;
	
	@ClientString(id = 3115, message = "This is the Halloween event period.")
	public static SystemMessageId THIS_IS_THE_HALLOWEEN_EVENT_PERIOD;
	
	@ClientString(id = 3116, message = "No record of 10 or more wins in a row.")
	public static SystemMessageId NO_RECORD_OF_10_OR_MORE_WINS_IN_A_ROW;
	
	@ClientString(id = 3117, message = "You can no longer bestow attributes that are the opposite of the currently bestowed attribute.")
	public static SystemMessageId YOU_CAN_NO_LONGER_BESTOW_ATTRIBUTES_THAT_ARE_THE_OPPOSITE_OF_THE_CURRENTLY_BESTOWED_ATTRIBUTE;
	
	@ClientString(id = 3118, message = "Do you wish to accept $c1's $s2 request?")
	public static SystemMessageId DO_YOU_WISH_TO_ACCEPT_C1_S_S2_REQUEST;
	
	@ClientString(id = 3119, message = "The couple action was denied.")
	public static SystemMessageId THE_COUPLE_ACTION_WAS_DENIED;
	
	@ClientString(id = 3120, message = "The request cannot be completed because the target does not meet location requirements.")
	public static SystemMessageId THE_REQUEST_CANNOT_BE_COMPLETED_BECAUSE_THE_TARGET_DOES_NOT_MEET_LOCATION_REQUIREMENTS;
	
	@ClientString(id = 3121, message = "The couple action was cancelled.")
	public static SystemMessageId THE_COUPLE_ACTION_WAS_CANCELLED;
	
	@ClientString(id = 3122, message = "The size of the uploaded symbol does not meet the standard requirements.")
	public static SystemMessageId THE_SIZE_OF_THE_UPLOADED_SYMBOL_DOES_NOT_MEET_THE_STANDARD_REQUIREMENTS;
	
	@ClientString(id = 3123, message = "$c1 is in private store mode or in a battle and cannot be requested for a couple action.")
	public static SystemMessageId C1_IS_IN_PRIVATE_STORE_MODE_OR_IN_A_BATTLE_AND_CANNOT_BE_REQUESTED_FOR_A_COUPLE_ACTION;
	
	@ClientString(id = 3124, message = "$c1 is fishing and cannot be requested for a couple action.")
	public static SystemMessageId C1_IS_FISHING_AND_CANNOT_BE_REQUESTED_FOR_A_COUPLE_ACTION;
	
	@ClientString(id = 3125, message = "$c1 is in a battle and cannot be requested for a couple action.")
	public static SystemMessageId C1_IS_IN_A_BATTLE_AND_CANNOT_BE_REQUESTED_FOR_A_COUPLE_ACTION;
	
	@ClientString(id = 3126, message = "$c1 is already participating in a couple action and cannot be requested for another couple action.")
	public static SystemMessageId C1_IS_ALREADY_PARTICIPATING_IN_A_COUPLE_ACTION_AND_CANNOT_BE_REQUESTED_FOR_ANOTHER_COUPLE_ACTION;
	
	@ClientString(id = 3127, message = "$c1 is in a chaotic state and cannot be requested for a couple action.")
	public static SystemMessageId C1_IS_IN_A_CHAOTIC_STATE_AND_CANNOT_BE_REQUESTED_FOR_A_COUPLE_ACTION;
	
	@ClientString(id = 3128, message = "$c1 is participating in the Olympiad and cannot be requested for a couple action.")
	public static SystemMessageId C1_IS_PARTICIPATING_IN_THE_OLYMPIAD_AND_CANNOT_BE_REQUESTED_FOR_A_COUPLE_ACTION;
	
	@ClientString(id = 3129, message = "$c1 is participating in a clan hall siege and cannot be requested for a couple action.")
	public static SystemMessageId C1_IS_PARTICIPATING_IN_A_CLAN_HALL_SIEGE_AND_CANNOT_BE_REQUESTED_FOR_A_COUPLE_ACTION;
	
	@ClientString(id = 3130, message = "$c1 is in a castle siege and cannot be requested for a couple action.")
	public static SystemMessageId C1_IS_IN_A_CASTLE_SIEGE_AND_CANNOT_BE_REQUESTED_FOR_A_COUPLE_ACTION;
	
	@ClientString(id = 3131, message = "$c1 is riding a ship, steed, or strider and cannot be requested for a couple action.")
	public static SystemMessageId C1_IS_RIDING_A_SHIP_STEED_OR_STRIDER_AND_CANNOT_BE_REQUESTED_FOR_A_COUPLE_ACTION;
	
	@ClientString(id = 3132, message = "$c1 is currently teleporting and cannot be requested for a couple action.")
	public static SystemMessageId C1_IS_CURRENTLY_TELEPORTING_AND_CANNOT_BE_REQUESTED_FOR_A_COUPLE_ACTION;
	
	@ClientString(id = 3133, message = "$c1 is currently transforming and cannot be requested for a couple action.")
	public static SystemMessageId C1_IS_CURRENTLY_TRANSFORMING_AND_CANNOT_BE_REQUESTED_FOR_A_COUPLE_ACTION;
	
	@ClientString(id = 3134, message = "Party loot was changed to '$s1'. Do you consent?")
	public static SystemMessageId PARTY_LOOT_WAS_CHANGED_TO_S1_DO_YOU_CONSENT;
	
	@ClientString(id = 3135, message = "Requesting approval for changing party loot to '$s1'.")
	public static SystemMessageId REQUESTING_APPROVAL_FOR_CHANGING_PARTY_LOOT_TO_S1;
	
	@ClientString(id = 3136, message = "Party loot can now be changed.")
	public static SystemMessageId PARTY_LOOT_CAN_NOW_BE_CHANGED;
	
	@ClientString(id = 3137, message = "Party loot change was cancelled.")
	public static SystemMessageId PARTY_LOOT_CHANGE_WAS_CANCELLED;
	
	@ClientString(id = 3138, message = "Party loot was changed to '$s1'.")
	public static SystemMessageId PARTY_LOOT_WAS_CHANGED_TO_S1;
	
	@ClientString(id = 3139, message = "$c1 is currently dead and cannot be requested for a couple action.")
	public static SystemMessageId C1_IS_CURRENTLY_DEAD_AND_CANNOT_BE_REQUESTED_FOR_A_COUPLE_ACTION;
	
	@ClientString(id = 3140, message = "The crest was successfully registered.")
	public static SystemMessageId THE_CREST_WAS_SUCCESSFULLY_REGISTERED;
	
	@ClientString(id = 3141, message = "$c1 is in the process of changing the party loot. Please try again later.")
	public static SystemMessageId C1_IS_IN_THE_PROCESS_OF_CHANGING_THE_PARTY_LOOT_PLEASE_TRY_AGAIN_LATER;
	
	@ClientString(id = 3142, message = "While party loot change is taking place, another 1:1 request cannot be made.")
	public static SystemMessageId WHILE_PARTY_LOOT_CHANGE_IS_TAKING_PLACE_ANOTHER_1_1_REQUEST_CANNOT_BE_MADE;
	
	@ClientString(id = 3143, message = "You can only register 8x12 pixel 256 color BMP files for clan crests.")
	public static SystemMessageId YOU_CAN_ONLY_REGISTER_8X12_PIXEL_256_COLOR_BMP_FILES_FOR_CLAN_CRESTS;
	
	@ClientString(id = 3144, message = "The $s2's attribute was successfully bestowed on $s1, and resistance to $s3 was increased.")
	public static SystemMessageId THE_S2_S_ATTRIBUTE_WAS_SUCCESSFULLY_BESTOWED_ON_S1_AND_RESISTANCE_TO_S3_WAS_INCREASED;
	
	@ClientString(id = 3145, message = "This item cannot be used because you are already participating in the quest that can be started with this item.")
	public static SystemMessageId THIS_ITEM_CANNOT_BE_USED_BECAUSE_YOU_ARE_ALREADY_PARTICIPATING_IN_THE_QUEST_THAT_CAN_BE_STARTED_WITH_THIS_ITEM;
	
	@ClientString(id = 3146, message = "Do you really wish to remove $s1's $s2 attribute?")
	public static SystemMessageId DO_YOU_REALLY_WISH_TO_REMOVE_S1_S_S2_ATTRIBUTE;
	
	@ClientString(id = 3147, message = "If you are not resurrected within $s1 minute(s), you will be expelled from the instant zone.")
	public static SystemMessageId IF_YOU_ARE_NOT_RESURRECTED_WITHIN_S1_MINUTE_S_YOU_WILL_BE_EXPELLED_FROM_THE_INSTANT_ZONE;
	
	@ClientString(id = 3148, message = "The number of instant zones that can be created has been exceeded. Please try again later.")
	public static SystemMessageId THE_NUMBER_OF_INSTANT_ZONES_THAT_CAN_BE_CREATED_HAS_BEEN_EXCEEDED_PLEASE_TRY_AGAIN_LATER;
	
	@ClientString(id = 3149, message = "One-piece upper and lower body armor can use enchant rate increasing items from +4.")
	public static SystemMessageId ONE_PIECE_UPPER_AND_LOWER_BODY_ARMOR_CAN_USE_ENCHANT_RATE_INCREASING_ITEMS_FROM_4;
	
	@ClientString(id = 3150, message = "You have requested a couple action with $c1.")
	public static SystemMessageId YOU_HAVE_REQUESTED_A_COUPLE_ACTION_WITH_C1;
	
	@ClientString(id = 3151, message = "$c1 accepted the couple action.")
	public static SystemMessageId C1_ACCEPTED_THE_COUPLE_ACTION;
	
	@ClientString(id = 3152, message = "$s1's $s2 attribute was removed, and resistance to $s3 was decreased.")
	public static SystemMessageId S1_S_S2_ATTRIBUTE_WAS_REMOVED_AND_RESISTANCE_TO_S3_WAS_DECREASED;
	
	@ClientString(id = 3153, message = "The attribute that you are trying to bestow has already reached its maximum, so you cannot proceed.")
	public static SystemMessageId THE_ATTRIBUTE_THAT_YOU_ARE_TRYING_TO_BESTOW_HAS_ALREADY_REACHED_ITS_MAXIMUM_SO_YOU_CANNOT_PROCEED;
	
	@ClientString(id = 3154, message = "This item can only have one attribute. An attribute has already been bestowed, so you cannot proceed.")
	public static SystemMessageId THIS_ITEM_CAN_ONLY_HAVE_ONE_ATTRIBUTE_AN_ATTRIBUTE_HAS_ALREADY_BEEN_BESTOWED_SO_YOU_CANNOT_PROCEED;
	
	@ClientString(id = 3155, message = "All attributes have already been maximized, so you cannot proceed.")
	public static SystemMessageId ALL_ATTRIBUTES_HAVE_ALREADY_BEEN_MAXIMIZED_SO_YOU_CANNOT_PROCEED;
	
	@ClientString(id = 3156, message = "You do not have enough funds to cancel this attribute.")
	public static SystemMessageId YOU_DO_NOT_HAVE_ENOUGH_FUNDS_TO_CANCEL_THIS_ATTRIBUTE;
	
	@ClientString(id = 3157, message = "Are you sure you want to delete the Clan Mark?")
	public static SystemMessageId ARE_YOU_SURE_YOU_WANT_TO_DELETE_THE_CLAN_MARK;
	
	@ClientString(id = 3158, message = "This is not the Lilith server. This command can only be used on the Lilith server.")
	public static SystemMessageId THIS_IS_NOT_THE_LILITH_SERVER_THIS_COMMAND_CAN_ONLY_BE_USED_ON_THE_LILITH_SERVER;
	
	@ClientString(id = 3159, message = "First, please select the shortcut key category to be changed.")
	public static SystemMessageId FIRST_PLEASE_SELECT_THE_SHORTCUT_KEY_CATEGORY_TO_BE_CHANGED;
	
	@ClientString(id = 3160, message = "+$s1$s2's $s3 attribute was removed, so resistance to $s4 was decreased.")
	public static SystemMessageId S1_S2_S_S3_ATTRIBUTE_WAS_REMOVED_SO_RESISTANCE_TO_S4_WAS_DECREASED;
	
	@ClientString(id = 3161, message = "Attribute enchant and attribute cancel cannot take place at the same time. Please complete the current task and try again.")
	public static SystemMessageId ATTRIBUTE_ENCHANT_AND_ATTRIBUTE_CANCEL_CANNOT_TAKE_PLACE_AT_THE_SAME_TIME_PLEASE_COMPLETE_THE_CURRENT_TASK_AND_TRY_AGAIN;
	
	@ClientString(id = 3162, message = "The skill cannot be used because the opponent is in a different instant zone.")
	public static SystemMessageId THE_SKILL_CANNOT_BE_USED_BECAUSE_THE_OPPONENT_IS_IN_A_DIFFERENT_INSTANT_ZONE;
	
	@ClientString(id = 3163, message = "The $s3's attribute was successfully bestowed on +$s1$s2, and resistance to $s4 was increased.")
	public static SystemMessageId THE_S3_S_ATTRIBUTE_WAS_SUCCESSFULLY_BESTOWED_ON_S1_S2_AND_RESISTANCE_TO_S4_WAS_INCREASED;
	
	@ClientString(id = 3164, message = "$c1 is set to refuse couple actions and cannot be requested for a couple action.")
	public static SystemMessageId C1_IS_SET_TO_REFUSE_COUPLE_ACTIONS_AND_CANNOT_BE_REQUESTED_FOR_A_COUPLE_ACTION;
	
	@ClientString(id = 3165, message = "No crest is registered.")
	public static SystemMessageId NO_CREST_IS_REGISTERED;
	
	@ClientString(id = 3166, message = "No registered symbol.")
	public static SystemMessageId NO_REGISTERED_SYMBOL;
	
	@ClientString(id = 3167, message = "The crest was successfully deleted.")
	public static SystemMessageId THE_CREST_WAS_SUCCESSFULLY_DELETED;
	
	@ClientString(id = 3168, message = "$c1 is set to refuse party requests and cannot receive a party request.")
	public static SystemMessageId C1_IS_SET_TO_REFUSE_PARTY_REQUESTS_AND_CANNOT_RECEIVE_A_PARTY_REQUEST;
	
	@ClientString(id = 3169, message = "$c1 is set to refuse duel requests and cannot receive a duel request.")
	public static SystemMessageId C1_IS_SET_TO_REFUSE_DUEL_REQUESTS_AND_CANNOT_RECEIVE_A_DUEL_REQUEST;
	
	@ClientString(id = 3170, message = "Current location: $s1 / $s2 / $s3 (outside the Seed of Annihilation)")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3_OUTSIDE_THE_SEED_OF_ANNIHILATION;
	
	@ClientString(id = 3171, message = "The gift's remaining resupply time is $s1 minute(s) $s2 second(s). (If you resummon the Agathion at the gift supply time, the supply time can take an additional 30 minutes.)")
	public static SystemMessageId THE_GIFT_S_REMAINING_RESUPPLY_TIME_IS_S1_MINUTE_S_S2_SECOND_S_IF_YOU_RESUMMON_THE_AGATHION_AT_THE_GIFT_SUPPLY_TIME_THE_SUPPLY_TIME_CAN_TAKE_AN_ADDITIONAL_30_MINUTES;
	
	@ClientString(id = 3172, message = "The gift's remaining resupply time is $s1 second(s). (If you resummon the Agathion at the gift supply time, the supply time can take an additional 30 minutes.)")
	public static SystemMessageId THE_GIFT_S_REMAINING_RESUPPLY_TIME_IS_S1_SECOND_S_IF_YOU_RESUMMON_THE_AGATHION_AT_THE_GIFT_SUPPLY_TIME_THE_SUPPLY_TIME_CAN_TAKE_AN_ADDITIONAL_30_MINUTES;
	
	@ClientString(id = 3173, message = "Hero exclusive items cannot be bestowed with attributes.")
	public static SystemMessageId HERO_EXCLUSIVE_ITEMS_CANNOT_BE_BESTOWED_WITH_ATTRIBUTES;
	
	@ClientString(id = 3174, message = "You dare to shatter the quiet of my castle, again.")
	public static SystemMessageId YOU_DARE_TO_SHATTER_THE_QUIET_OF_MY_CASTLE_AGAIN;
	
	@ClientString(id = 3175, message = "I, Freya Queen of Ice, shall curse you all with eternal winter sleep.")
	public static SystemMessageId I_FREYA_QUEEN_OF_ICE_SHALL_CURSE_YOU_ALL_WITH_ETERNAL_WINTER_SLEEP;
	
	@ClientString(id = 3176, message = "Your hearts will fall into stillness... Even your memories shall disappear.")
	public static SystemMessageId YOUR_HEARTS_WILL_FALL_INTO_STILLNESS_EVEN_YOUR_MEMORIES_SHALL_DISAPPEAR;
	
	@ClientString(id = 3177, message = "I did underestimate you a little bit, I admit! Haha.")
	public static SystemMessageId I_DID_UNDERESTIMATE_YOU_A_LITTLE_BIT_I_ADMIT_HAHA;
	
	@ClientString(id = 3178, message = "Behold my frozen minions.")
	public static SystemMessageId BEHOLD_MY_FROZEN_MINIONS;
	
	@ClientString(id = 3179, message = "Obey my command and attack these invaders.")
	public static SystemMessageId OBEY_MY_COMMAND_AND_ATTACK_THESE_INVADERS;
	
	@ClientString(id = 3180, message = "No!ﾠ How could this be... You are but mere mortals?!")
	public static SystemMessageId NO_HOW_COULD_THIS_BE_YOU_ARE_BUT_MERE_MORTALS;
	
	@ClientString(id = 3181, message = "Very well. I will show you what despair looks like!")
	public static SystemMessageId VERY_WELL_I_WILL_SHOW_YOU_WHAT_DESPAIR_LOOKS_LIKE;
	
	@ClientString(id = 3182, message = "There's no turning back! This ends now!")
	public static SystemMessageId THERE_S_NO_TURNING_BACK_THIS_ENDS_NOW;
	
	@ClientString(id = 3183, message = "Oh furious winds of light, slice through the darkness and defeat this evil!")
	public static SystemMessageId OH_FURIOUS_WINDS_OF_LIGHT_SLICE_THROUGH_THE_DARKNESS_AND_DEFEAT_THIS_EVIL;
	
	@ClientString(id = 3184, message = "To die this way... Such a shameful defeat... Sirra... How could you do this to me…")
	public static SystemMessageId TO_DIE_THIS_WAY_SUCH_A_SHAMEFUL_DEFEAT_SIRRA_HOW_COULD_YOU_DO_THIS_TO_ME;
	
	@ClientString(id = 3185, message = "Meet your end, Freya.")
	public static SystemMessageId MEET_YOUR_END_FREYA;
	
	@ClientString(id = 3186, message = "Ah-hahahaha! Ice Queen, really? You didn't deserve this power.")
	public static SystemMessageId AH_HAHAHAHA_ICE_QUEEN_REALLY_YOU_DIDN_T_DESERVE_THIS_POWER;
	
	@ClientString(id = 3187, message = "Oh, this feeling. So familiar…now all this power is mine!")
	public static SystemMessageId OH_THIS_FEELING_SO_FAMILIAR_NOW_ALL_THIS_POWER_IS_MINE;
	
	@ClientString(id = 3188, message = "You who feel warm life force coursing through your veins.")
	public static SystemMessageId YOU_WHO_FEEL_WARM_LIFE_FORCE_COURSING_THROUGH_YOUR_VEINS;
	
	@ClientString(id = 3189, message = "I shall take your last breath. But not this day, return to me.")
	public static SystemMessageId I_SHALL_TAKE_YOUR_LAST_BREATH_BUT_NOT_THIS_DAY_RETURN_TO_ME;
	
	@ClientString(id = 3190, message = "How dare you ignore my warning... Foolish creatures.ﾠHahaha...")
	public static SystemMessageId HOW_DARE_YOU_IGNORE_MY_WARNING_FOOLISH_CREATURES_HAHAHA;
	
	@ClientString(id = 3191, message = "Say goodbye to sunlight and welcome eternal ice.")
	public static SystemMessageId SAY_GOODBYE_TO_SUNLIGHT_AND_WELCOME_ETERNAL_ICE;
	
	@ClientString(id = 3192, message = "Muhahaha... If you wish to be chilled to the bone, I'll gladly oblige.")
	public static SystemMessageId MUHAHAHA_IF_YOU_WISH_TO_BE_CHILLED_TO_THE_BONE_I_LL_GLADLY_OBLIGE;
	
	@ClientString(id = 3193, message = "How dare you enter my castle!ﾠHahaha... Foolish ones... Leave this place before the frost chills your blood.")
	public static SystemMessageId HOW_DARE_YOU_ENTER_MY_CASTLE_HAHAHA_FOOLISH_ONES_LEAVE_THIS_PLACE_BEFORE_THE_FROST_CHILLS_YOUR_BLOOD;
	
	@ClientString(id = 3194, message = "Hmph!ﾠYou will not dodge my blizzard again!")
	public static SystemMessageId HMPH_YOU_WILL_NOT_DODGE_MY_BLIZZARD_AGAIN;
	
	@ClientString(id = 3195, message = "All those who challenge my power shall feel the curse of ice.")
	public static SystemMessageId ALL_THOSE_WHO_CHALLENGE_MY_POWER_SHALL_FEEL_THE_CURSE_OF_ICE;
	
	@ClientString(id = 3196, message = "I will seal your hearts with ice. Not even your breath will escape.")
	public static SystemMessageId I_WILL_SEAL_YOUR_HEARTS_WITH_ICE_NOT_EVEN_YOUR_BREATH_WILL_ESCAPE;
	
	@ClientString(id = 3197, message = "Really? Even my snowflakes could defeat you.")
	public static SystemMessageId REALLY_EVEN_MY_SNOWFLAKES_COULD_DEFEAT_YOU;
	
	@ClientString(id = 3198, message = "It is all futile.")
	public static SystemMessageId IT_IS_ALL_FUTILE;
	
	@ClientString(id = 3199, message = "How would you like to live an eternity inside my ice?")
	public static SystemMessageId HOW_WOULD_YOU_LIKE_TO_LIVE_AN_ETERNITY_INSIDE_MY_ICE;
	
	@ClientString(id = 3200, message = "Oh, great power of destruction. Come forth and obey me!")
	public static SystemMessageId OH_GREAT_POWER_OF_DESTRUCTION_COME_FORTH_AND_OBEY_ME;
	
	@ClientString(id = 3201, message = "The deep cold and its unwavering eternity. Cover this world with your frigid silence.")
	public static SystemMessageId THE_DEEP_COLD_AND_ITS_UNWAVERING_ETERNITY_COVER_THIS_WORLD_WITH_YOUR_FRIGID_SILENCE;
	
	@ClientString(id = 3202, message = "I summon thee, blizzard of death. Frozen darkness, devour this misery!")
	public static SystemMessageId I_SUMMON_THEE_BLIZZARD_OF_DEATH_FROZEN_DARKNESS_DEVOUR_THIS_MISERY;
	
	@ClientString(id = 3203, message = "This is an unfortunate day for you.")
	public static SystemMessageId THIS_IS_AN_UNFORTUNATE_DAY_FOR_YOU;
	
	@ClientString(id = 3204, message = "This body is completely mine now. Kneel before ultimate power!")
	public static SystemMessageId THIS_BODY_IS_COMPLETELY_MINE_NOW_KNEEL_BEFORE_ULTIMATE_POWER;
	
	@ClientString(id = 3205, message = "You challenge me with all my power unharnessed? What judgment!")
	public static SystemMessageId YOU_CHALLENGE_ME_WITH_ALL_MY_POWER_UNHARNESSED_WHAT_JUDGMENT;
	
	@ClientString(id = 3206, message = "You are out of Recommendations. Try again later.")
	public static SystemMessageId YOU_ARE_OUT_OF_RECOMMENDATIONS_TRY_AGAIN_LATER;
	
	@ClientString(id = 3207, message = "You obtained $s1 Recommendation(s).")
	public static SystemMessageId YOU_OBTAINED_S1_RECOMMENDATION_S;
	
	@ClientString(id = 3208, message = "You will go to the Lineage II homepage. Do you wish to continue?")
	public static SystemMessageId YOU_WILL_GO_TO_THE_LINEAGE_II_HOMEPAGE_DO_YOU_WISH_TO_CONTINUE;
	
	@ClientString(id = 3209, message = "You obtained a Maguen Pet Collar.")
	public static SystemMessageId YOU_OBTAINED_A_MAGUEN_PET_COLLAR;
	
	@ClientString(id = 3210, message = "You obtained an Elite Maguen Pet Collar.")
	public static SystemMessageId YOU_OBTAINED_AN_ELITE_MAGUEN_PET_COLLAR;
	
	@ClientString(id = 3211, message = "You will be directed to the webpage for $s1. Do you wish to continue?")
	public static SystemMessageId YOU_WILL_BE_DIRECTED_TO_THE_WEBPAGE_FOR_S1_DO_YOU_WISH_TO_CONTINUE;
	
	@ClientString(id = 3212, message = "When your pet's hunger gauge is at 0%, you cannot use your pet.")
	public static SystemMessageId WHEN_YOUR_PET_S_HUNGER_GAUGE_IS_AT_0_YOU_CANNOT_USE_YOUR_PET;
	
	@ClientString(id = 3213, message = "Your pet is starving and will not obey until it gets it's food. Feed your pet!")
	public static SystemMessageId YOUR_PET_IS_STARVING_AND_WILL_NOT_OBEY_UNTIL_IT_GETS_IT_S_FOOD_FEED_YOUR_PET;
	
	@ClientString(id = 3214, message = "$s1 was successfully added to your Contact List.")
	public static SystemMessageId S1_WAS_SUCCESSFULLY_ADDED_TO_YOUR_CONTACT_LIST;
	
	@ClientString(id = 3215, message = "The name $s1 doesn't exist. Please try another name.")
	public static SystemMessageId THE_NAME_S1_DOESN_T_EXIST_PLEASE_TRY_ANOTHER_NAME;
	
	@ClientString(id = 3216, message = "The name already exists on the added list.")
	public static SystemMessageId THE_NAME_ALREADY_EXISTS_ON_THE_ADDED_LIST;
	
	@ClientString(id = 3217, message = "The name is not currently registered.")
	public static SystemMessageId THE_NAME_IS_NOT_CURRENTLY_REGISTERED;
	
	@ClientString(id = 3218, message = "Do you really wish to delete $s1?")
	public static SystemMessageId DO_YOU_REALLY_WISH_TO_DELETE_S1;
	
	@ClientString(id = 3219, message = "$s1 was successfully deleted from your Contact List.")
	public static SystemMessageId S1_WAS_SUCCESSFULLY_DELETED_FROM_YOUR_CONTACT_LIST;
	
	@ClientString(id = 3220, message = "The name deletion was cancelled.")
	public static SystemMessageId THE_NAME_DELETION_WAS_CANCELLED;
	
	@ClientString(id = 3221, message = "You cannot add your own name.")
	public static SystemMessageId YOU_CANNOT_ADD_YOUR_OWN_NAME;
	
	@ClientString(id = 3222, message = "The maximum number of names (100) has been reached. You cannot register any more.")
	public static SystemMessageId THE_MAXIMUM_NUMBER_OF_NAMES_100_HAS_BEEN_REACHED_YOU_CANNOT_REGISTER_ANY_MORE;
	
	@ClientString(id = 3223, message = "The previous name is being registered. Please try again later.")
	public static SystemMessageId THE_PREVIOUS_NAME_IS_BEING_REGISTERED_PLEASE_TRY_AGAIN_LATER;
	
	@ClientString(id = 3224, message = "The maximum matches you can participate in 1 week is 30.")
	public static SystemMessageId THE_MAXIMUM_MATCHES_YOU_CAN_PARTICIPATE_IN_1_WEEK_IS_30;
	
	@ClientString(id = 3225, message = "You can enter up to 50 free-for-all battles and 50 class-specific battles per week.")
	public static SystemMessageId YOU_CAN_ENTER_UP_TO_50_FREE_FOR_ALL_BATTLES_AND_50_CLASS_SPECIFIC_BATTLES_PER_WEEK;
	
	@ClientString(id = 3226, message = "You cannot move while speaking to an NPC. One moment please.")
	public static SystemMessageId YOU_CANNOT_MOVE_WHILE_SPEAKING_TO_AN_NPC_ONE_MOMENT_PLEASE;
	
	@ClientString(id = 3227, message = "The large army of Elmoreden is advancing upon the Monastery of Silence.")
	public static SystemMessageId THE_LARGE_ARMY_OF_ELMOREDEN_IS_ADVANCING_UPON_THE_MONASTERY_OF_SILENCE;
	
	@ClientString(id = 3228, message = "Anais fought back bravely with a legion of loyal followers.")
	public static SystemMessageId ANAIS_FOUGHT_BACK_BRAVELY_WITH_A_LEGION_OF_LOYAL_FOLLOWERS;
	
	@ClientString(id = 3229, message = "until they were betrayed by Jude, and slaughtered in battle.")
	public static SystemMessageId UNTIL_THEY_WERE_BETRAYED_BY_JUDE_AND_SLAUGHTERED_IN_BATTLE;
	
	@ClientString(id = 3230, message = "Many disciples were mercilessly killed,")
	public static SystemMessageId MANY_DISCIPLES_WERE_MERCILESSLY_KILLED;
	
	@ClientString(id = 3231, message = "Solina surrendered herself and became a prisoner of war.")
	public static SystemMessageId SOLINA_SURRENDERED_HERSELF_AND_BECAME_A_PRISONER_OF_WAR;
	
	@ClientString(id = 3232, message = "But sentenced to death for treason and heresy, the leader fell, and the remaining followers were forced to flee and hide.")
	public static SystemMessageId BUT_SENTENCED_TO_DEATH_FOR_TREASON_AND_HERESY_THE_LEADER_FELL_AND_THE_REMAINING_FOLLOWERS_WERE_FORCED_TO_FLEE_AND_HIDE;
	
	@ClientString(id = 3233, message = "Jude stole Solina's holy items, the Scepter of Saints and the Book of Saints, which were stored in the monastery.")
	public static SystemMessageId JUDE_STOLE_SOLINA_S_HOLY_ITEMS_THE_SCEPTER_OF_SAINTS_AND_THE_BOOK_OF_SAINTS_WHICH_WERE_STORED_IN_THE_MONASTERY;
	
	@ClientString(id = 3234, message = "Through his possession of holy items stolen from the lady saint, he appointed himself Chief of the Embryos.")
	public static SystemMessageId THROUGH_HIS_POSSESSION_OF_HOLY_ITEMS_STOLEN_FROM_THE_LADY_SAINT_HE_APPOINTED_HIMSELF_CHIEF_OF_THE_EMBRYOS;
	
	@ClientString(id = 3235, message = "And then began plotting a historic conspiracy for his own selfish ambitions.")
	public static SystemMessageId AND_THEN_BEGAN_PLOTTING_A_HISTORIC_CONSPIRACY_FOR_HIS_OWN_SELFISH_AMBITIONS;
	
	@ClientString(id = 3236, message = "Stupid ghost blathers on.")
	public static SystemMessageId STUPID_GHOST_BLATHERS_ON;
	
	@ClientString(id = 3237, message = "now I'll make you disappear as well.")
	public static SystemMessageId NOW_I_LL_MAKE_YOU_DISAPPEAR_AS_WELL;
	
	@ClientString(id = 3238, message = "Are you… Jude van Etina? This can't be!")
	public static SystemMessageId ARE_YOU_JUDE_VAN_ETINA_THIS_CAN_T_BE;
	
	@ClientString(id = 3239, message = "You'd be hundreds of years old!")
	public static SystemMessageId YOU_D_BE_HUNDREDS_OF_YEARS_OLD;
	
	@ClientString(id = 3240, message = "That's right. Jude van Etina was a petty soul that died long ago.")
	public static SystemMessageId THAT_S_RIGHT_JUDE_VAN_ETINA_WAS_A_PETTY_SOUL_THAT_DIED_LONG_AGO;
	
	@ClientString(id = 3241, message = "Now I am the successor of Embryos, Etis van Etina!")
	public static SystemMessageId NOW_I_AM_THE_SUCCESSOR_OF_EMBRYOS_ETIS_VAN_ETINA;
	
	@ClientString(id = 3242, message = "Do not forget, woman of Devastation!!")
	public static SystemMessageId DO_NOT_FORGET_WOMAN_OF_DEVASTATION;
	
	@ClientString(id = 3243, message = "This is getting out of hand. You must flee!")
	public static SystemMessageId THIS_IS_GETTING_OUT_OF_HAND_YOU_MUST_FLEE;
	
	@ClientString(id = 3244, message = "Take that")
	public static SystemMessageId TAKE_THAT;
	
	@ClientString(id = 3247, message = "Argh... Ha ha ha, pretty impressive, as if you cut from the fabric of the gods.")
	public static SystemMessageId ARGH_HA_HA_HA_PRETTY_IMPRESSIVE_AS_IF_YOU_CUT_FROM_THE_FABRIC_OF_THE_GODS;
	
	@ClientString(id = 3248, message = "Yes... You're doing well…")
	public static SystemMessageId YES_YOU_RE_DOING_WELL;
	
	@ClientString(id = 3249, message = "I don't know what you are talking about…")
	public static SystemMessageId I_DON_T_KNOW_WHAT_YOU_ARE_TALKING_ABOUT;
	
	@ClientString(id = 3250, message = "But I will not allow you to have your way so easily, Etis van Etina.")
	public static SystemMessageId BUT_I_WILL_NOT_ALLOW_YOU_TO_HAVE_YOUR_WAY_SO_EASILY_ETIS_VAN_ETINA;
	
	@ClientString(id = 3251, message = "Ah ah ah ah ah... You can talk all you want,")
	public static SystemMessageId AH_AH_AH_AH_AH_YOU_CAN_TALK_ALL_YOU_WANT;
	
	@ClientString(id = 3252, message = "if you want to waste your last precious moments babbling pointlessly,")
	public static SystemMessageId IF_YOU_WANT_TO_WASTE_YOUR_LAST_PRECIOUS_MOMENTS_BABBLING_POINTLESSLY;
	
	@ClientString(id = 3253, message = "for soon my era will begin, the era of Embryos Muah ah ah ah ah.")
	public static SystemMessageId FOR_SOON_MY_ERA_WILL_BEGIN_THE_ERA_OF_EMBRYOS_MUAH_AH_AH_AH_AH;
	
	@ClientString(id = 3254, message = "An error has occurred at the arena, and all matches will handled at no cost.")
	public static SystemMessageId AN_ERROR_HAS_OCCURRED_AT_THE_ARENA_AND_ALL_MATCHES_WILL_HANDLED_AT_NO_COST;
	
	@ClientString(id = 3255, message = "Arcane Shield decreased your MP by $s1 instead of HP.")
	public static SystemMessageId ARCANE_SHIELD_DECREASED_YOUR_MP_BY_S1_INSTEAD_OF_HP;
	
	@ClientString(id = 3256, message = "MP became 0 and the Arcane Shield is disappearing.")
	public static SystemMessageId MP_BECAME_0_AND_THE_ARCANE_SHIELD_IS_DISAPPEARING;
	
	@ClientString(id = 3259, message = "You have acquired $s1 XP (Bonus: $s2) and $s3 SP (Bonus: $s4).")
	public static SystemMessageId YOU_HAVE_ACQUIRED_S1_XP_BONUS_S2_AND_S3_SP_BONUS_S4;
	
	@ClientString(id = 3260, message = "You cannot use the skill because the servitor has not been summoned.")
	public static SystemMessageId YOU_CANNOT_USE_THE_SKILL_BECAUSE_THE_SERVITOR_HAS_NOT_BEEN_SUMMONED;
	
	@ClientString(id = 3261, message = "The matches this week are All-Class Battles, the number of matches that are allowed to participate is $s1.")
	public static SystemMessageId THE_MATCHES_THIS_WEEK_ARE_ALL_CLASS_BATTLES_THE_NUMBER_OF_MATCHES_THAT_ARE_ALLOWED_TO_PARTICIPATE_IS_S1;
	
	@ClientString(id = 3262, message = "You can proceed only when the inventory weight is below 80 percent and the quantity is below 90 percent.")
	public static SystemMessageId YOU_CAN_PROCEED_ONLY_WHEN_THE_INVENTORY_WEIGHT_IS_BELOW_80_PERCENT_AND_THE_QUANTITY_IS_BELOW_90_PERCENT;
	
	@ClientString(id = 3263, message = "There are $s2 second(s) remaining for $s1's re-use time. It is reset every day at 6:30 AM.")
	public static SystemMessageId THERE_ARE_S2_SECOND_S_REMAINING_FOR_S1_S_RE_USE_TIME_IT_IS_RESET_EVERY_DAY_AT_6_30_AM;
	
	@ClientString(id = 3264, message = "There are $s2 minute(s) $s3 second(s) remaining for $s1's re-use time. It is reset every day at 6:30 AM.")
	public static SystemMessageId THERE_ARE_S2_MINUTE_S_S3_SECOND_S_REMAINING_FOR_S1_S_RE_USE_TIME_IT_IS_RESET_EVERY_DAY_AT_6_30_AM;
	
	@ClientString(id = 3265, message = "There are $s2 hour(s) $s3 minute(s) $s4 second(s) remaining for $s1's re-use time. It is reset every day at 6:30 AM.")
	public static SystemMessageId THERE_ARE_S2_HOUR_S_S3_MINUTE_S_S4_SECOND_S_REMAINING_FOR_S1_S_RE_USE_TIME_IT_IS_RESET_EVERY_DAY_AT_6_30_AM;
	
	@ClientString(id = 3266, message = "Nevit has blessed you from above.")
	public static SystemMessageId NEVIT_HAS_BLESSED_YOU_FROM_ABOVE;
	
	@ClientString(id = 3267, message = "You are starting to feel the effects of Nevit's Advent Blessing.")
	public static SystemMessageId YOU_ARE_STARTING_TO_FEEL_THE_EFFECTS_OF_NEVIT_S_ADVENT_BLESSING;
	
	@ClientString(id = 3268, message = "You are further infused with the blessings of Nevit!")
	public static SystemMessageId YOU_ARE_FURTHER_INFUSED_WITH_THE_BLESSINGS_OF_NEVIT;
	
	@ClientString(id = 3269, message = "Nevit's Advent Blessing shines strongly from above.")
	public static SystemMessageId NEVIT_S_ADVENT_BLESSING_SHINES_STRONGLY_FROM_ABOVE;
	
	@ClientString(id = 3270, message = "$s1 second(s) remaining")
	public static SystemMessageId S1_SECOND_S_REMAINING2;
	
	@ClientString(id = 3271, message = "Current Progress: $1")
	public static SystemMessageId CURRENT_PROGRESS_1;
	
	@ClientString(id = 3272, message = "$s1")
	public static SystemMessageId S14;
	
	@ClientString(id = 3273, message = "Trap is not installed, therefore the skill can't be used.")
	public static SystemMessageId TRAP_IS_NOT_INSTALLED_THEREFORE_THE_SKILL_CAN_T_BE_USED;
	
	@ClientString(id = 3274, message = "Angel Nevit's Blessing")
	public static SystemMessageId ANGEL_NEVIT_S_BLESSING;
	
	@ClientString(id = 3275, message = "Nevit's Advent Blessing has ended. Continue your journey and you will surely meet his favor again sometime soon.")
	public static SystemMessageId NEVIT_S_ADVENT_BLESSING_HAS_ENDED_CONTINUE_YOUR_JOURNEY_AND_YOU_WILL_SURELY_MEET_HIS_FAVOR_AGAIN_SOMETIME_SOON;
	
	@ClientString(id = 3276, message = "Crystallization cannot be proceeded because there are no items registered.")
	public static SystemMessageId CRYSTALLIZATION_CANNOT_BE_PROCEEDED_BECAUSE_THERE_ARE_NO_ITEMS_REGISTERED;
	
	@ClientString(id = 3277, message = "Nevit's Advent Blessing: $1")
	public static SystemMessageId NEVIT_S_ADVENT_BLESSING_1;
	
	@ClientString(id = 3278, message = "(allowed after $s1 second(s))")
	public static SystemMessageId ALLOWED_AFTER_S1_SECOND_S;
	
	@ClientString(id = 3279, message = "Subclass $s1 has been upgraded to Duel Class $s2. Congratulations!")
	public static SystemMessageId SUBCLASS_S1_HAS_BEEN_UPGRADED_TO_DUEL_CLASS_S2_CONGRATULATIONS;
	
	@ClientString(id = 3280, message = "Change $s1 to $s2?")
	public static SystemMessageId CHANGE_S1_TO_S2;
	
	@ClientString(id = 3281, message = "You deleted subclass $s1 and chose $s2 instead.")
	public static SystemMessageId YOU_DELETED_SUBCLASS_S1_AND_CHOSE_S2_INSTEAD;
	
	@ClientString(id = 3282, message = "Characters level 40 or below cannot use regular chat functions except answering whispers. Characters level 76 or below cannot use the shout channel.")
	public static SystemMessageId CHARACTERS_LEVEL_40_OR_BELOW_CANNOT_USE_REGULAR_CHAT_FUNCTIONS_EXCEPT_ANSWERING_WHISPERS_CHARACTERS_LEVEL_76_OR_BELOW_CANNOT_USE_THE_SHOUT_CHANNEL;
	
	@ClientString(id = 3283, message = "You cannot declare defeat as it has not been 7 days since starting a clan war with Clan $s1.")
	public static SystemMessageId YOU_CANNOT_DECLARE_DEFEAT_AS_IT_HAS_NOT_BEEN_7_DAYS_SINCE_STARTING_A_CLAN_WAR_WITH_CLAN_S1;
	
	@ClientString(id = 3284, message = "The war ended by your Defeat Declaration with the $s1 clan.")
	public static SystemMessageId THE_WAR_ENDED_BY_YOUR_DEFEAT_DECLARATION_WITH_THE_S1_CLAN;
	
	@ClientString(id = 3285, message = "The war ended by the $s1 clan's Defeat Declaration. You have won the Clan War over the $s1 clan.")
	public static SystemMessageId THE_WAR_ENDED_BY_THE_S1_CLAN_S_DEFEAT_DECLARATION_YOU_HAVE_WON_THE_CLAN_WAR_OVER_THE_S1_CLAN;
	
	@ClientString(id = 3286, message = "You can't declare a war because the 21-day-period hasn't passed after a Defeat Declaration with the $s1 clan.")
	public static SystemMessageId YOU_CAN_T_DECLARE_A_WAR_BECAUSE_THE_21_DAY_PERIOD_HASN_T_PASSED_AFTER_A_DEFEAT_DECLARATION_WITH_THE_S1_CLAN;
	
	@ClientString(id = 3287, message = "You can't declare a war because the 7-day-period hasn't passed after ending a Clan War.")
	public static SystemMessageId YOU_CAN_T_DECLARE_A_WAR_BECAUSE_THE_7_DAY_PERIOD_HASN_T_PASSED_AFTER_ENDING_A_CLAN_WAR;
	
	@ClientString(id = 3288, message = "War with the $s1 clan has ended.")
	public static SystemMessageId WAR_WITH_THE_S1_CLAN_HAS_ENDED2;
	
	@ClientString(id = 3289, message = "This account has already received a gift. The gift can only be given once per account.")
	public static SystemMessageId THIS_ACCOUNT_HAS_ALREADY_RECEIVED_A_GIFT_THE_GIFT_CAN_ONLY_BE_GIVEN_ONCE_PER_ACCOUNT;
	
	@ClientString(id = 3290, message = "Maguen stole $s1 pieces of bio-energy residue.")
	public static SystemMessageId MAGUEN_STOLE_S1_PIECES_OF_BIO_ENERGY_RESIDUE;
	
	@ClientString(id = 3291, message = "$s1 pieces of bio-energy residue is acquired.")
	public static SystemMessageId S1_PIECES_OF_BIO_ENERGY_RESIDUE_IS_ACQUIRED;
	
	@ClientString(id = 3292, message = "Your friend $s1 just logged out.")
	public static SystemMessageId YOUR_FRIEND_S1_JUST_LOGGED_OUT;
	
	@ClientString(id = 3293, message = "To use 24hz service, a desktop playernexclusively for 24hz needs to be installed.nnAre you ready to install now?")
	public static SystemMessageId TO_USE_24HZ_SERVICE_A_DESKTOP_PLAYER_NEXCLUSIVELY_FOR_24HZ_NEEDS_TO_BE_INSTALLED_N_NARE_YOU_READY_TO_INSTALL_NOW;
	
	@ClientString(id = 3294, message = "$s1 Minute(s) Ago")
	public static SystemMessageId S1_MINUTE_S_AGO;
	
	@ClientString(id = 3295, message = "$s1 Hour(s) Ago")
	public static SystemMessageId S1_HOUR_S_AGO;
	
	@ClientString(id = 3296, message = "$s1 Day(s) Ago")
	public static SystemMessageId S1_DAY_S_AGO;
	
	@ClientString(id = 3297, message = "$s1 Month(s) Ago")
	public static SystemMessageId S1_MONTH_S_AGO;
	
	@ClientString(id = 3298, message = "$s1 or more Year(s)")
	public static SystemMessageId S1_OR_MORE_YEAR_S;
	
	@ClientString(id = 3299, message = "The number of graduates of the Clan Academy is $s1. $s2 bonus points have been added to your Clan Reputation.")
	public static SystemMessageId THE_NUMBER_OF_GRADUATES_OF_THE_CLAN_ACADEMY_IS_S1_S2_BONUS_POINTS_HAVE_BEEN_ADDED_TO_YOUR_CLAN_REPUTATION;
	
	@ClientString(id = 3300, message = "Battle status of Seed of Annihilation: Start")
	public static SystemMessageId BATTLE_STATUS_OF_SEED_OF_ANNIHILATION_START;
	
	@ClientString(id = 3301, message = "Battle status of Seed of Annihilation: Challenge")
	public static SystemMessageId BATTLE_STATUS_OF_SEED_OF_ANNIHILATION_CHALLENGE;
	
	@ClientString(id = 3302, message = "Battle status of Seed of Annihilation: Advance")
	public static SystemMessageId BATTLE_STATUS_OF_SEED_OF_ANNIHILATION_ADVANCE;
	
	@ClientString(id = 3303, message = "Battle status of Seed of Annihilation: Stagnant")
	public static SystemMessageId BATTLE_STATUS_OF_SEED_OF_ANNIHILATION_STAGNANT;
	
	@ClientString(id = 3304, message = "$s1h $s2m")
	public static SystemMessageId S1H_S2M;
	
	@ClientString(id = 3305, message = "Number of people: $s1")
	public static SystemMessageId NUMBER_OF_PEOPLE_S12;
	
	@ClientString(id = 3306, message = "You are declaring Clan War against $s1. If you withdraw from the war, your clan will lose 5,000 Reputation points. Proceed?")
	public static SystemMessageId YOU_ARE_DECLARING_CLAN_WAR_AGAINST_S1_IF_YOU_WITHDRAW_FROM_THE_WAR_YOUR_CLAN_WILL_LOSE_5_000_REPUTATION_POINTS_PROCEED;
	
	@ClientString(id = 3307, message = "$s1 will be deleted from Friend List.nDo you want to continue?")
	public static SystemMessageId S1_WILL_BE_DELETED_FROM_FRIEND_LIST_NDO_YOU_WANT_TO_CONTINUE;
	
	@ClientString(id = 3308, message = "No character is selected to add to the list. Please select a character.")
	public static SystemMessageId NO_CHARACTER_IS_SELECTED_TO_ADD_TO_THE_LIST_PLEASE_SELECT_A_CHARACTER;
	
	@ClientString(id = 3309, message = "You are now recording a video. UI can be hidden using Alt + H.")
	public static SystemMessageId YOU_ARE_NOW_RECORDING_A_VIDEO_UI_CAN_BE_HIDDEN_USING_ALT_H;
	
	@ClientString(id = 3310, message = "Recording will be ended due to lack of capacity in the hard disk. The video that has been recorded so far will automatically be stored on the path of $s1.")
	public static SystemMessageId RECORDING_WILL_BE_ENDED_DUE_TO_LACK_OF_CAPACITY_IN_THE_HARD_DISK_THE_VIDEO_THAT_HAS_BEEN_RECORDED_SO_FAR_WILL_AUTOMATICALLY_BE_STORED_ON_THE_PATH_OF_S1;
	
	@ClientString(id = 3311, message = "Your video file has been successfully stored. Recorded videos can be viewed on the path of $s1.")
	public static SystemMessageId YOUR_VIDEO_FILE_HAS_BEEN_SUCCESSFULLY_STORED_RECORDED_VIDEOS_CAN_BE_VIEWED_ON_THE_PATH_OF_S1;
	
	@ClientString(id = 3312, message = "When you execute Open Save Folder, you will exit from the current game screen. Would you like to continue?")
	public static SystemMessageId WHEN_YOU_EXECUTE_OPEN_SAVE_FOLDER_YOU_WILL_EXIT_FROM_THE_CURRENT_GAME_SCREEN_WOULD_YOU_LIKE_TO_CONTINUE;
	
	@ClientString(id = 3313, message = "UI can be hidden while recording by using Alt + H. To immediately start the recording, press '/start_videorecording'.")
	public static SystemMessageId UI_CAN_BE_HIDDEN_WHILE_RECORDING_BY_USING_ALT_H_TO_IMMEDIATELY_START_THE_RECORDING_PRESS_START_VIDEORECORDING;
	
	@ClientString(id = 3314, message = "No character is selected from the list. Please select a character.")
	public static SystemMessageId NO_CHARACTER_IS_SELECTED_FROM_THE_LIST_PLEASE_SELECT_A_CHARACTER;
	
	@ClientString(id = 3315, message = "Incorrect PIN entered. After 5 consecutive failed attempts you cannot log in this account for 8 hours.nAccumulated attempts: $s1 time(s)")
	public static SystemMessageId INCORRECT_PIN_ENTERED_AFTER_5_CONSECUTIVE_FAILED_ATTEMPTS_YOU_CANNOT_LOG_IN_THIS_ACCOUNT_FOR_8_HOURS_NACCUMULATED_ATTEMPTS_S1_TIME_S;
	
	@ClientString(id = 3316, message = "Your account has been blocked for 8 hours because an incorrect PIN number has been entered 5 consecutive times. You can un-block your account by resetting your PIN number on ncsoft.com.")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_BLOCKED_FOR_8_HOURS_BECAUSE_AN_INCORRECT_PIN_NUMBER_HAS_BEEN_ENTERED_5_CONSECUTIVE_TIMES_YOU_CAN_UN_BLOCK_YOUR_ACCOUNT_BY_RESETTING_YOUR_PIN_NUMBER_ON_NCSOFT_COM;
	
	@ClientString(id = 3317, message = "The Character PIN can only be entered by using a mouse.")
	public static SystemMessageId THE_CHARACTER_PIN_CAN_ONLY_BE_ENTERED_BY_USING_A_MOUSE;
	
	@ClientString(id = 3318, message = "The two numbers do not match.nPlease try again.")
	public static SystemMessageId THE_TWO_NUMBERS_DO_NOT_MATCH_NPLEASE_TRY_AGAIN;
	
	@ClientString(id = 3319, message = "You cannot use a PIN number consisting of only one number. Please try again.")
	public static SystemMessageId YOU_CANNOT_USE_A_PIN_NUMBER_CONSISTING_OF_ONLY_ONE_NUMBER_PLEASE_TRY_AGAIN;
	
	@ClientString(id = 3320, message = "You cannot use a PIN number that is already part of your account password. Please try again.")
	public static SystemMessageId YOU_CANNOT_USE_A_PIN_NUMBER_THAT_IS_ALREADY_PART_OF_YOUR_ACCOUNT_PASSWORD_PLEASE_TRY_AGAIN;
	
	@ClientString(id = 3321, message = "You cannot use a PIN number consisting of repeated number patterns. Please try again.")
	public static SystemMessageId YOU_CANNOT_USE_A_PIN_NUMBER_CONSISTING_OF_REPEATED_NUMBER_PATTERNS_PLEASE_TRY_AGAIN;
	
	@ClientString(id = 3322, message = "Your Character PIN has been changed.")
	public static SystemMessageId YOUR_CHARACTER_PIN_HAS_BEEN_CHANGED;
	
	@ClientString(id = 3323, message = "Please change your Character PIN for increased protection. You have to enter your Character PIN when a character is selected or deleted. (Use a password different from your account password.)")
	public static SystemMessageId PLEASE_CHANGE_YOUR_CHARACTER_PIN_FOR_INCREASED_PROTECTION_YOU_HAVE_TO_ENTER_YOUR_CHARACTER_PIN_WHEN_A_CHARACTER_IS_SELECTED_OR_DELETED_USE_A_PASSWORD_DIFFERENT_FROM_YOUR_ACCOUNT_PASSWORD;
	
	@ClientString(id = 3324, message = "Caution: The number arrangement will change at the next login.")
	public static SystemMessageId CAUTION_THE_NUMBER_ARRANGEMENT_WILL_CHANGE_AT_THE_NEXT_LOGIN;
	
	@ClientString(id = 3325, message = "Please enter a new PIN number after entering your current PIN number. (Use a password different from your account password.)")
	public static SystemMessageId PLEASE_ENTER_A_NEW_PIN_NUMBER_AFTER_ENTERING_YOUR_CURRENT_PIN_NUMBER_USE_A_PASSWORD_DIFFERENT_FROM_YOUR_ACCOUNT_PASSWORD;
	
	@ClientString(id = 3326, message = "The offer can be withdrawn within $s1 day(s) and $s2 hour(s).")
	public static SystemMessageId THE_OFFER_CAN_BE_WITHDRAWN_WITHIN_S1_DAY_S_AND_S2_HOUR_S;
	
	@ClientString(id = 3327, message = "The offer can be withdrawn within $s1 day(s).")
	public static SystemMessageId THE_OFFER_CAN_BE_WITHDRAWN_WITHIN_S1_DAY_S;
	
	@ClientString(id = 3328, message = "The offer can be withdrawn within $s1 hour(s).")
	public static SystemMessageId THE_OFFER_CAN_BE_WITHDRAWN_WITHIN_S1_HOUR_S;
	
	@ClientString(id = 3329, message = "The offer cannot be withdrawn.")
	public static SystemMessageId THE_OFFER_CANNOT_BE_WITHDRAWN;
	
	@ClientString(id = 3330, message = "Sale Item (can retract offer within $s1 minute(s))")
	public static SystemMessageId SALE_ITEM_CAN_RETRACT_OFFER_WITHIN_S1_MINUTE_S;
	
	@ClientString(id = 3331, message = "The matches this week are class-specific and free-for-all battles, and out of a total of 30 matches, $s1 are class-specific battles, and $s2 are free-for-all battles.")
	public static SystemMessageId THE_MATCHES_THIS_WEEK_ARE_CLASS_SPECIFIC_AND_FREE_FOR_ALL_BATTLES_AND_OUT_OF_A_TOTAL_OF_30_MATCHES_S1_ARE_CLASS_SPECIFIC_BATTLES_AND_S2_ARE_FREE_FOR_ALL_BATTLES;
	
	@ClientString(id = 3332, message = "Entry to Memo is complete.")
	public static SystemMessageId ENTRY_TO_MEMO_IS_COMPLETE;
	
	@ClientString(id = 3333, message = "End War is not allowed until the remaining time has passed during the war.")
	public static SystemMessageId END_WAR_IS_NOT_ALLOWED_UNTIL_THE_REMAINING_TIME_HAS_PASSED_DURING_THE_WAR;
	
	@ClientString(id = 3334, message = "You hear a voice that echoes throughout you. Do you wish to travel where the voice can be heard?")
	public static SystemMessageId YOU_HEAR_A_VOICE_THAT_ECHOES_THROUGHOUT_YOU_DO_YOU_WISH_TO_TRAVEL_WHERE_THE_VOICE_CAN_BE_HEARD;
	
	@ClientString(id = 3335, message = "If you are ready to be Awakened with new powers, click the star to begin your journey.")
	public static SystemMessageId IF_YOU_ARE_READY_TO_BE_AWAKENED_WITH_NEW_POWERS_CLICK_THE_STAR_TO_BEGIN_YOUR_JOURNEY;
	
	@ClientString(id = 3336, message = "Defensive Tank")
	public static SystemMessageId DEFENSIVE_TANK;
	
	@ClientString(id = 3337, message = "- Strong defense and skillful with shields(br)- Can pull targets using chains(br)- Golden Lion Companion")
	public static SystemMessageId STRONG_DEFENSE_AND_SKILLFUL_WITH_SHIELDS_BR_CAN_PULL_TARGETS_USING_CHAINS_BR_GOLDEN_LION_COMPANION;
	
	@ClientString(id = 3338, message = "Inherited the powers of the Sigel Knight (font color='#FFDF4C')Abelius(/font) who was also known as the Golden Commander for his sense of honor and his ability to motivate troops. His beast companion, the golden lion Kelcion, fought by his side in every battle, inspiring fear and awe through his fierce roar.")
	public static SystemMessageId INHERITED_THE_POWERS_OF_THE_SIGEL_KNIGHT_FONT_COLOR_FFDF4C_ABELIUS_FONT_WHO_WAS_ALSO_KNOWN_AS_THE_GOLDEN_COMMANDER_FOR_HIS_SENSE_OF_HONOR_AND_HIS_ABILITY_TO_MOTIVATE_TROOPS_HIS_BEAST_COMPANION_THE_GOLDEN_LION_KELCION_FOUGHT_BY_HIS_SIDE_IN_EVERY_BATTLE_INSPIRING_FEAR_AND_AWE_THROUGH_HIS_FIERCE_ROAR;
	
	@ClientString(id = 3339, message = "Melee Damage Dealer")
	public static SystemMessageId MELEE_DAMAGE_DEALER;
	
	@ClientString(id = 3340, message = "- Diverse Weapons Expert(br)- Powerful attacks using Momentum(br)- Various Reinforcement Skills")
	public static SystemMessageId DIVERSE_WEAPONS_EXPERT_BR_POWERFUL_ATTACKS_USING_MOMENTUM_BR_VARIOUS_REINFORCEMENT_SKILLS;
	
	@ClientString(id = 3341, message = "Inherited the powers of the Tyrr Warrior (font color='#FFDF4C')Sapyros(/font) who was known as the Tempest Leader for his rough, weather-beaten, unruly demeanor and his tempestuous nature. His fierce hand-to-hand battles were the stuff of legend. Once he engaged combat, he never backed down, and he never lost.")
	public static SystemMessageId INHERITED_THE_POWERS_OF_THE_TYRR_WARRIOR_FONT_COLOR_FFDF4C_SAPYROS_FONT_WHO_WAS_KNOWN_AS_THE_TEMPEST_LEADER_FOR_HIS_ROUGH_WEATHER_BEATEN_UNRULY_DEMEANOR_AND_HIS_TEMPESTUOUS_NATURE_HIS_FIERCE_HAND_TO_HAND_BATTLES_WERE_THE_STUFF_OF_LEGEND_ONCE_HE_ENGAGED_COMBAT_HE_NEVER_BACKED_DOWN_AND_HE_NEVER_LOST;
	
	@ClientString(id = 3342, message = "Dagger Damage Dealer")
	public static SystemMessageId DAGGER_DAMAGE_DEALER;
	
	@ClientString(id = 3343, message = "- Superior stealth Skills(br)- Weakens the enemy with critical attacks(br)- Diverse Skills using poisons and throwing Weapons")
	public static SystemMessageId SUPERIOR_STEALTH_SKILLS_BR_WEAKENS_THE_ENEMY_WITH_CRITICAL_ATTACKS_BR_DIVERSE_SKILLS_USING_POISONS_AND_THROWING_WEAPONS;
	
	@ClientString(id = 3344, message = "Inherited the powers of the Othell Rogue (font color='#FFDF4C')Ashagen(/font), a fearsome warrior whose ferocity matched his cruelty. Brutal enough to strike an enemy's unprotected back, Ashagen was feared by his enemies and shunned by his allies.")
	public static SystemMessageId INHERITED_THE_POWERS_OF_THE_OTHELL_ROGUE_FONT_COLOR_FFDF4C_ASHAGEN_FONT_A_FEARSOME_WARRIOR_WHOSE_FEROCITY_MATCHED_HIS_CRUELTY_BRUTAL_ENOUGH_TO_STRIKE_AN_ENEMY_S_UNPROTECTED_BACK_ASHAGEN_WAS_FEARED_BY_HIS_ENEMIES_AND_SHUNNED_BY_HIS_ALLIES;
	
	@ClientString(id = 3345, message = "Bow and Crossbow Sharpshooter")
	public static SystemMessageId BOW_AND_CROSSBOW_SHARPSHOOTER;
	
	@ClientString(id = 3346, message = "- Master at using Bows and Crossbows(br)- Thunder Hawk Companion(br)- Expertise with traps")
	public static SystemMessageId MASTER_AT_USING_BOWS_AND_CROSSBOWS_BR_THUNDER_HAWK_COMPANION_BR_EXPERTISE_WITH_TRAPS;
	
	@ClientString(id = 3347, message = "Inherited powers from the Yul Archer (font color='#FFDF4C')Cranigg(/font), a Giant hero sharpshooter whose third eye gave him precise accuracy and focus at a very long range.")
	public static SystemMessageId INHERITED_POWERS_FROM_THE_YUL_ARCHER_FONT_COLOR_FFDF4C_CRANIGG_FONT_A_GIANT_HERO_SHARPSHOOTER_WHOSE_THIRD_EYE_GAVE_HIM_PRECISE_ACCURACY_AND_FOCUS_AT_A_VERY_LONG_RANGE;
	
	@ClientString(id = 3348, message = "Magic Damage Dealer")
	public static SystemMessageId MAGIC_DAMAGE_DEALER;
	
	@ClientString(id = 3349, message = "- Master of the four elements(br)- Various debuff Skills(br)- Ability to cast two spells at the same time.")
	public static SystemMessageId MASTER_OF_THE_FOUR_ELEMENTS_BR_VARIOUS_DEBUFF_SKILLS_BR_ABILITY_TO_CAST_TWO_SPELLS_AT_THE_SAME_TIME;
	
	@ClientString(id = 3350, message = "Feoh Wizard (font color='FFDF4C')Soltkreig(/font) was one of the Seven Giant Sages. Soltkreig, a supremely wise and intelligent Giant, was also a strategic tactician. He snatched victory from the claws of defeat many times thanks to his brilliant planning. Through years of study, he became the foremost expert on the four elements and mana theory.")
	public static SystemMessageId FEOH_WIZARD_FONT_COLOR_FFDF4C_SOLTKREIG_FONT_WAS_ONE_OF_THE_SEVEN_GIANT_SAGES_SOLTKREIG_A_SUPREMELY_WISE_AND_INTELLIGENT_GIANT_WAS_ALSO_A_STRATEGIC_TACTICIAN_HE_SNATCHED_VICTORY_FROM_THE_CLAWS_OF_DEFEAT_MANY_TIMES_THANKS_TO_HIS_BRILLIANT_PLANNING_THROUGH_YEARS_OF_STUDY_HE_BECAME_THE_FOREMOST_EXPERT_ON_THE_FOUR_ELEMENTS_AND_MANA_THEORY;
	
	@ClientString(id = 3351, message = "Magic Buffer")
	public static SystemMessageId MAGIC_BUFFER;
	
	@ClientString(id = 3352, message = "- Diverse buff Skills (br)- Expert at ally boosting, enemy weakening, and crowd control(br)- Powerful Rush and Dual Weapon attacks")
	public static SystemMessageId DIVERSE_BUFF_SKILLS_BR_EXPERT_AT_ALLY_BOOSTING_ENEMY_WEAKENING_AND_CROWD_CONTROL_BR_POWERFUL_RUSH_AND_DUAL_WEAPON_ATTACKS;
	
	@ClientString(id = 3353, message = "Inherited the powers of Iss Enchanter (font color='#FFDF4C')Leister(/font), an insightful and observant Giant who combined magic with military strategy and tactics. His ability to anticipate and react to the flow of battle was legendary.")
	public static SystemMessageId INHERITED_THE_POWERS_OF_ISS_ENCHANTER_FONT_COLOR_FFDF4C_LEISTER_FONT_AN_INSIGHTFUL_AND_OBSERVANT_GIANT_WHO_COMBINED_MAGIC_WITH_MILITARY_STRATEGY_AND_TACTICS_HIS_ABILITY_TO_ANTICIPATE_AND_REACT_TO_THE_FLOW_OF_BATTLE_WAS_LEGENDARY;
	
	@ClientString(id = 3354, message = "Summoner and Ranged Magic Attack")
	public static SystemMessageId SUMMONER_AND_RANGED_MAGIC_ATTACK;
	
	@ClientString(id = 3355, message = "- Can be accompanied by multiple servitors at the same time(br)- Specializes in enemy debuffs while servitors do damage")
	public static SystemMessageId CAN_BE_ACCOMPANIED_BY_MULTIPLE_SERVITORS_AT_THE_SAME_TIME_BR_SPECIALIZES_IN_ENEMY_DEBUFFS_WHILE_SERVITORS_DO_DAMAGE;
	
	@ClientString(id = 3356, message = "Inherited the powers of (font color='#FFDF4C')Nabiarov(/font) who had the power to open and close planar dimensions. He passionately sacrificed his eyesight to expand his immense summoning power even further. He was the first mage ever to maintain control over multiple summoned pets simultaneously.")
	public static SystemMessageId INHERITED_THE_POWERS_OF_FONT_COLOR_FFDF4C_NABIAROV_FONT_WHO_HAD_THE_POWER_TO_OPEN_AND_CLOSE_PLANAR_DIMENSIONS_HE_PASSIONATELY_SACRIFICED_HIS_EYESIGHT_TO_EXPAND_HIS_IMMENSE_SUMMONING_POWER_EVEN_FURTHER_HE_WAS_THE_FIRST_MAGE_EVER_TO_MAINTAIN_CONTROL_OVER_MULTIPLE_SUMMONED_PETS_SIMULTANEOUSLY;
	
	@ClientString(id = 3357, message = "Magic Healer")
	public static SystemMessageId MAGIC_HEALER;
	
	@ClientString(id = 3358, message = "- has several healing and resurrection Skills(br)- Specializes in Reinforcement Skills(br)-Unison of Lights Companion")
	public static SystemMessageId HAS_SEVERAL_HEALING_AND_RESURRECTION_SKILLS_BR_SPECIALIZES_IN_REINFORCEMENT_SKILLS_BR_UNISON_OF_LIGHTS_COMPANION;
	
	@ClientString(id = 3359, message = "Aeore Healer (font color='#FFDF4C')Lakcis(/font) was a friend of Einhasad in the early days of the Giants. He combined his holy magic with the creation magic of Einhasad to create a new type of power, Saha. Saha spread rapidly throughout the Giants as the most popular source of healing.")
	public static SystemMessageId AEORE_HEALER_FONT_COLOR_FFDF4C_LAKCIS_FONT_WAS_A_FRIEND_OF_EINHASAD_IN_THE_EARLY_DAYS_OF_THE_GIANTS_HE_COMBINED_HIS_HOLY_MAGIC_WITH_THE_CREATION_MAGIC_OF_EINHASAD_TO_CREATE_A_NEW_TYPE_OF_POWER_SAHA_SAHA_SPREAD_RAPIDLY_THROUGHOUT_THE_GIANTS_AS_THE_MOST_POPULAR_SOURCE_OF_HEALING;
	
	@ClientString(id = 3360, message = "$s1 left")
	public static SystemMessageId S1_LEFT;
	
	@ClientString(id = 3361, message = "Registration is not available because the corresponding item does not exist.")
	public static SystemMessageId REGISTRATION_IS_NOT_AVAILABLE_BECAUSE_THE_CORRESPONDING_ITEM_DOES_NOT_EXIST;
	
	@ClientString(id = 3362, message = "Please try again after ending the previous task.")
	public static SystemMessageId PLEASE_TRY_AGAIN_AFTER_ENDING_THE_PREVIOUS_TASK;
	
	@ClientString(id = 3363, message = "The item cannot be registered because requirements are not met.")
	public static SystemMessageId THE_ITEM_CANNOT_BE_REGISTERED_BECAUSE_REQUIREMENTS_ARE_NOT_MET;
	
	@ClientString(id = 3364, message = "You do not have enough Adena to register the item.")
	public static SystemMessageId YOU_DO_NOT_HAVE_ENOUGH_ADENA_TO_REGISTER_THE_ITEM;
	
	@ClientString(id = 3365, message = "The item has failed to be registered.")
	public static SystemMessageId THE_ITEM_HAS_FAILED_TO_BE_REGISTERED;
	
	@ClientString(id = 3366, message = "Cancellation of Sale has failed because requirements are not met.")
	public static SystemMessageId CANCELLATION_OF_SALE_HAS_FAILED_BECAUSE_REQUIREMENTS_ARE_NOT_MET;
	
	@ClientString(id = 3367, message = "Cancellation of Sale for the registered item has failed.")
	public static SystemMessageId CANCELLATION_OF_SALE_FOR_THE_REGISTERED_ITEM_HAS_FAILED;
	
	@ClientString(id = 3368, message = "There is no registered item or request has failed.")
	public static SystemMessageId THERE_IS_NO_REGISTERED_ITEM_OR_REQUEST_HAS_FAILED;
	
	@ClientString(id = 3369, message = "Currently, there are no registered items.")
	public static SystemMessageId CURRENTLY_THERE_ARE_NO_REGISTERED_ITEMS;
	
	@ClientString(id = 3370, message = "Item Purchase is not available because the corresponding item does not exist.")
	public static SystemMessageId ITEM_PURCHASE_IS_NOT_AVAILABLE_BECAUSE_THE_CORRESPONDING_ITEM_DOES_NOT_EXIST;
	
	@ClientString(id = 3371, message = "Item Purchase has failed.")
	public static SystemMessageId ITEM_PURCHASE_HAS_FAILED;
	
	@ClientString(id = 3372, message = "The item that you searched does not exist or the request has failed.")
	public static SystemMessageId THE_ITEM_THAT_YOU_SEARCHED_DOES_NOT_EXIST_OR_THE_REQUEST_HAS_FAILED;
	
	@ClientString(id = 3373, message = "The item that you searched does not exist.")
	public static SystemMessageId THE_ITEM_THAT_YOU_SEARCHED_DOES_NOT_EXIST;
	
	@ClientString(id = 3374, message = "The search range is too wide. Please reset the range.")
	public static SystemMessageId THE_SEARCH_RANGE_IS_TOO_WIDE_PLEASE_RESET_THE_RANGE;
	
	@ClientString(id = 3375, message = "You cannot use a password that contains continuous numbers. Please enter again.")
	public static SystemMessageId YOU_CANNOT_USE_A_PASSWORD_THAT_CONTAINS_CONTINUOUS_NUMBERS_PLEASE_ENTER_AGAIN;
	
	@ClientString(id = 3376, message = "This account has been locked for 8 hours due to 5 failed PIN attempts. It has $s1 hour(s) until it is unlocked. Visit ncsoft.com to unlock this account instantly after verifying ownership.")
	public static SystemMessageId THIS_ACCOUNT_HAS_BEEN_LOCKED_FOR_8_HOURS_DUE_TO_5_FAILED_PIN_ATTEMPTS_IT_HAS_S1_HOUR_S_UNTIL_IT_IS_UNLOCKED_VISIT_NCSOFT_COM_TO_UNLOCK_THIS_ACCOUNT_INSTANTLY_AFTER_VERIFYING_OWNERSHIP;
	
	@ClientString(id = 3377, message = "There was an error in the request.")
	public static SystemMessageId THERE_WAS_AN_ERROR_IN_THE_REQUEST;
	
	@ClientString(id = 3378, message = "There are currently too many users inquiring about the product inventory. Please try again later.")
	public static SystemMessageId THERE_ARE_CURRENTLY_TOO_MANY_USERS_INQUIRING_ABOUT_THE_PRODUCT_INVENTORY_PLEASE_TRY_AGAIN_LATER;
	
	@ClientString(id = 3379, message = "The previous request has not been completed yet. Please try again later.")
	public static SystemMessageId THE_PREVIOUS_REQUEST_HAS_NOT_BEEN_COMPLETED_YET_PLEASE_TRY_AGAIN_LATER;
	
	@ClientString(id = 3380, message = "The product inventory inquiry cannot be completed. Please try again later.")
	public static SystemMessageId THE_PRODUCT_INVENTORY_INQUIRY_CANNOT_BE_COMPLETED_PLEASE_TRY_AGAIN_LATER;
	
	@ClientString(id = 3381, message = "The offer on the product has already been retracted.")
	public static SystemMessageId THE_OFFER_ON_THE_PRODUCT_HAS_ALREADY_BEEN_RETRACTED;
	
	@ClientString(id = 3382, message = "The product has already been received.")
	public static SystemMessageId THE_PRODUCT_HAS_ALREADY_BEEN_RECEIVED;
	
	@ClientString(id = 3383, message = "The selected product cannot be received on this server.")
	public static SystemMessageId THE_SELECTED_PRODUCT_CANNOT_BE_RECEIVED_ON_THIS_SERVER;
	
	@ClientString(id = 3384, message = "The selected product cannot be received through this character.")
	public static SystemMessageId THE_SELECTED_PRODUCT_CANNOT_BE_RECEIVED_THROUGH_THIS_CHARACTER;
	
	@ClientString(id = 3385, message = "Due to system error, the product inventory cannot be used. Please try again later.")
	public static SystemMessageId DUE_TO_SYSTEM_ERROR_THE_PRODUCT_INVENTORY_CANNOT_BE_USED_PLEASE_TRY_AGAIN_LATER;
	
	@ClientString(id = 3386, message = "The product cannot be received because the game inventory weight/quantity limit has been exceeded. It can be received only when the inventory's weight and slot count are at less than 80% capacity.")
	public static SystemMessageId THE_PRODUCT_CANNOT_BE_RECEIVED_BECAUSE_THE_GAME_INVENTORY_WEIGHT_QUANTITY_LIMIT_HAS_BEEN_EXCEEDED_IT_CAN_BE_RECEIVED_ONLY_WHEN_THE_INVENTORY_S_WEIGHT_AND_SLOT_COUNT_ARE_AT_LESS_THAN_80_CAPACITY;
	
	@ClientString(id = 3387, message = "If you receive the selected product item in your own character's inventory, it will be deemed as the same item being used, and the offer retraction will be limited.nnDo you still wish to receive the selected item?")
	public static SystemMessageId IF_YOU_RECEIVE_THE_SELECTED_PRODUCT_ITEM_IN_YOUR_OWN_CHARACTER_S_INVENTORY_IT_WILL_BE_DEEMED_AS_THE_SAME_ITEM_BEING_USED_AND_THE_OFFER_RETRACTION_WILL_BE_LIMITED_N_NDO_YOU_STILL_WISH_TO_RECEIVE_THE_SELECTED_ITEM;
	
	@ClientString(id = 3388, message = "When the item registration space is used up, no more registration is allowed.")
	public static SystemMessageId WHEN_THE_ITEM_REGISTRATION_SPACE_IS_USED_UP_NO_MORE_REGISTRATION_IS_ALLOWED;
	
	@ClientString(id = 3389, message = "Character PIN has been successfully registered.")
	public static SystemMessageId CHARACTER_PIN_HAS_BEEN_SUCCESSFULLY_REGISTERED;
	
	@ClientString(id = 3390, message = "$s1 Minute(s)")
	public static SystemMessageId S1_MINUTE_S;
	
	@ClientString(id = 3391, message = "There is an error verifying the character PIN. ($s1)")
	public static SystemMessageId THERE_IS_AN_ERROR_VERIFYING_THE_CHARACTER_PIN_S1;
	
	@ClientString(id = 3392, message = "You cannot move while dead.")
	public static SystemMessageId YOU_CANNOT_MOVE_WHILE_DEAD;
	
	@ClientString(id = 3393, message = "You cannot move during combat.")
	public static SystemMessageId YOU_CANNOT_MOVE_DURING_COMBAT;
	
	@ClientString(id = 3394, message = "You cannot teleport in the Instant Zone.")
	public static SystemMessageId YOU_CANNOT_TELEPORT_IN_THE_INSTANT_ZONE;
	
	@ClientString(id = 3395, message = "You cannot move during trading, private store, and workshop setup.")
	public static SystemMessageId YOU_CANNOT_MOVE_DURING_TRADING_PRIVATE_STORE_AND_WORKSHOP_SETUP;
	
	@ClientString(id = 3396, message = "You cannot move while participating in a large-scale battle such as a castle siege, fortress siege, or clan hall siege.")
	public static SystemMessageId YOU_CANNOT_MOVE_WHILE_PARTICIPATING_IN_A_LARGE_SCALE_BATTLE_SUCH_AS_A_CASTLE_SIEGE_FORTRESS_SIEGE_OR_CLAN_HALL_SIEGE;
	
	@ClientString(id = 3397, message = "You cannot move while participating in an Olympiad match.")
	public static SystemMessageId YOU_CANNOT_MOVE_WHILE_PARTICIPATING_IN_AN_OLYMPIAD_MATCH;
	
	@ClientString(id = 3398, message = "You cannot move while participating in a Mini Game.")
	public static SystemMessageId YOU_CANNOT_MOVE_WHILE_PARTICIPATING_IN_A_MINI_GAME;
	
	@ClientString(id = 3399, message = "You cannot move during a duel.")
	public static SystemMessageId YOU_CANNOT_MOVE_DURING_A_DUEL;
	
	@ClientString(id = 3400, message = "You cannot move while boarding on a ship, an airship, or an elevator.")
	public static SystemMessageId YOU_CANNOT_MOVE_WHILE_BOARDING_ON_A_SHIP_AN_AIRSHIP_OR_AN_ELEVATOR;
	
	@ClientString(id = 3401, message = "You cannot move while in an action-inhibiting status such as a petrified or paralyzed state.")
	public static SystemMessageId YOU_CANNOT_MOVE_WHILE_IN_AN_ACTION_INHIBITING_STATUS_SUCH_AS_A_PETRIFIED_OR_PARALYZED_STATE;
	
	@ClientString(id = 3402, message = "You cannot move in water.")
	public static SystemMessageId YOU_CANNOT_MOVE_IN_WATER;
	
	@ClientString(id = 3403, message = "You cannot move during fishing.")
	public static SystemMessageId YOU_CANNOT_MOVE_DURING_FISHING;
	
	@ClientString(id = 3404, message = "You cannot move while in a chaotic state.")
	public static SystemMessageId YOU_CANNOT_MOVE_WHILE_IN_A_CHAOTIC_STATE;
	
	@ClientString(id = 3405, message = "You cannot currently move.")
	public static SystemMessageId YOU_CANNOT_CURRENTLY_MOVE;
	
	@ClientString(id = 3406, message = "$s1 hour(s)")
	public static SystemMessageId S1_HOUR_S2;
	
	@ClientString(id = 3407, message = "less than $s1 hour(s)")
	public static SystemMessageId LESS_THAN_S1_HOUR_S;
	
	@ClientString(id = 3408, message = "less than $s1")
	public static SystemMessageId LESS_THAN_S1;
	
	@ClientString(id = 3409, message = "Do you really want to choose Defeat Declaration with the $s1 clan?")
	public static SystemMessageId DO_YOU_REALLY_WANT_TO_CHOOSE_DEFEAT_DECLARATION_WITH_THE_S1_CLAN;
	
	@ClientString(id = 3410, message = "There are currently too many users so the product cannot be received. Please try again later.")
	public static SystemMessageId THERE_ARE_CURRENTLY_TOO_MANY_USERS_SO_THE_PRODUCT_CANNOT_BE_RECEIVED_PLEASE_TRY_AGAIN_LATER;
	
	@ClientString(id = 3411, message = "You cannot connect to the current product management server. Please try again later.")
	public static SystemMessageId YOU_CANNOT_CONNECT_TO_THE_CURRENT_PRODUCT_MANAGEMENT_SERVER_PLEASE_TRY_AGAIN_LATER;
	
	@ClientString(id = 3412, message = "The product was successfully received. Please check your game inventory.")
	public static SystemMessageId THE_PRODUCT_WAS_SUCCESSFULLY_RECEIVED_PLEASE_CHECK_YOUR_GAME_INVENTORY;
	
	@ClientString(id = 3413, message = "The product inventory cannot be used during trading, private store, and workshop setup.")
	public static SystemMessageId THE_PRODUCT_INVENTORY_CANNOT_BE_USED_DURING_TRADING_PRIVATE_STORE_AND_WORKSHOP_SETUP;
	
	@ClientString(id = 3414, message = "The maximum number of auction house items for registration is 10.")
	public static SystemMessageId THE_MAXIMUM_NUMBER_OF_AUCTION_HOUSE_ITEMS_FOR_REGISTRATION_IS_10;
	
	@ClientString(id = 3415, message = "Please select the auction house item you want to cancel, then press Cancel Sale button.")
	public static SystemMessageId PLEASE_SELECT_THE_AUCTION_HOUSE_ITEM_YOU_WANT_TO_CANCEL_THEN_PRESS_CANCEL_SALE_BUTTON;
	
	@ClientString(id = 3416, message = "The password registration does not conform to the policy.")
	public static SystemMessageId THE_PASSWORD_REGISTRATION_DOES_NOT_CONFORM_TO_THE_POLICY;
	
	@ClientString(id = 3417, message = "The product to be received does not exist in the current product inventory.")
	public static SystemMessageId THE_PRODUCT_TO_BE_RECEIVED_DOES_NOT_EXIST_IN_THE_CURRENT_PRODUCT_INVENTORY;
	
	@ClientString(id = 3418, message = "$s1 day(s)")
	public static SystemMessageId S1_DAY_S;
	
	@ClientString(id = 3419, message = "Inviting $s1 to your clan has failed.")
	public static SystemMessageId INVITING_S1_TO_YOUR_CLAN_HAS_FAILED;
	
	@ClientString(id = 3420, message = "$s1 already graduated from a Clan Academy, therefore re-joining is not allowed.")
	public static SystemMessageId S1_ALREADY_GRADUATED_FROM_A_CLAN_ACADEMY_THEREFORE_RE_JOINING_IS_NOT_ALLOWED;
	
	@ClientString(id = 3421, message = "The following item is being registered for auction.nnItem to Sell:n($s1)nnPrice:n($s2)nnSale Fee:n($s3)nnDo you want to continue with the registration? (The fee is not refundable.)")
	public static SystemMessageId THE_FOLLOWING_ITEM_IS_BEING_REGISTERED_FOR_AUCTION_N_NITEM_TO_SELL_N_S1_N_NPRICE_N_S2_N_NSALE_FEE_N_S3_N_NDO_YOU_WANT_TO_CONTINUE_WITH_THE_REGISTRATION_THE_FEE_IS_NOT_REFUNDABLE;
	
	@ClientString(id = 3422, message = "The following item is being registered for auction.nnItem to Sell:nn($s1)n($s2) unitsnnUnit Price:n($s3)nnTotal Sale Price:n($s4)nnSale Fee:n($s5)nnDo you want to continue with the registration? (The fee is not refundable.)")
	public static SystemMessageId THE_FOLLOWING_ITEM_IS_BEING_REGISTERED_FOR_AUCTION_N_NITEM_TO_SELL_N_N_S1_N_S2_UNITS_N_NUNIT_PRICE_N_S3_N_NTOTAL_SALE_PRICE_N_S4_N_NSALE_FEE_N_S5_N_NDO_YOU_WANT_TO_CONTINUE_WITH_THE_REGISTRATION_THE_FEE_IS_NOT_REFUNDABLE;
	
	@ClientString(id = 3423, message = "$s1 $s2")
	public static SystemMessageId S1_S22;
	
	@ClientString(id = 3424, message = "The following item is being purchased.nnItem to Purchase:n($s1)nnPurchase Price:n($s2)nnDo you want to continue with the purchase?")
	public static SystemMessageId THE_FOLLOWING_ITEM_IS_BEING_PURCHASED_N_NITEM_TO_PURCHASE_N_S1_N_NPURCHASE_PRICE_N_S2_N_NDO_YOU_WANT_TO_CONTINUE_WITH_THE_PURCHASE;
	
	@ClientString(id = 3425, message = "The following item is being purchased.nnItem to Purchase:n($s1)n ($s2) unitsnnUnit Price:n($s3)nnTotal Purchase Price:n($s4)nnDo you want to continue with the purchase?")
	public static SystemMessageId THE_FOLLOWING_ITEM_IS_BEING_PURCHASED_N_NITEM_TO_PURCHASE_N_S1_N_S2_UNITS_N_NUNIT_PRICE_N_S3_N_NTOTAL_PURCHASE_PRICE_N_S4_N_NDO_YOU_WANT_TO_CONTINUE_WITH_THE_PURCHASE;
	
	@ClientString(id = 3426, message = "Cancel Sale is successfully completed.")
	public static SystemMessageId CANCEL_SALE_IS_SUCCESSFULLY_COMPLETED;
	
	@ClientString(id = 3427, message = "Cancel Sale has failed.")
	public static SystemMessageId CANCEL_SALE_HAS_FAILED;
	
	@ClientString(id = 3428, message = "The following item sale is being cancelled.nnItem to Cancel:n($s1)nnPrice:n($s2)nnSale Fee:n($s3)nnDo you want to continue with the cancellation? (The fee is not refundable.)")
	public static SystemMessageId THE_FOLLOWING_ITEM_SALE_IS_BEING_CANCELLED_N_NITEM_TO_CANCEL_N_S1_N_NPRICE_N_S2_N_NSALE_FEE_N_S3_N_NDO_YOU_WANT_TO_CONTINUE_WITH_THE_CANCELLATION_THE_FEE_IS_NOT_REFUNDABLE;
	
	@ClientString(id = 3429, message = "The following item sale is being cancelled.nnItem to Sell:nn($s1)n($s2) unitsnnUnit Price:n($s3)nnTotal Sale Price:n($s4)nnSale Fee:n($s5)nnDo you want to continue with the cancellation? (The fee is not refundable.)")
	public static SystemMessageId THE_FOLLOWING_ITEM_SALE_IS_BEING_CANCELLED_N_NITEM_TO_SELL_N_N_S1_N_S2_UNITS_N_NUNIT_PRICE_N_S3_N_NTOTAL_SALE_PRICE_N_S4_N_NSALE_FEE_N_S5_N_NDO_YOU_WANT_TO_CONTINUE_WITH_THE_CANCELLATION_THE_FEE_IS_NOT_REFUNDABLE;
	
	@ClientString(id = 3430, message = "Congratulations! You will now graduate from the Clan Academy and leave your current clan. You can now join a clan without being subject to any penalties.")
	public static SystemMessageId CONGRATULATIONS_YOU_WILL_NOW_GRADUATE_FROM_THE_CLAN_ACADEMY_AND_LEAVE_YOUR_CURRENT_CLAN_YOU_CAN_NOW_JOIN_A_CLAN_WITHOUT_BEING_SUBJECT_TO_ANY_PENALTIES2;
	
	@ClientString(id = 3431, message = "War with the $s1 clan has ended. It was a tie in the Clan War with the $s1 clan.")
	public static SystemMessageId WAR_WITH_THE_S1_CLAN_HAS_ENDED_IT_WAS_A_TIE_IN_THE_CLAN_WAR_WITH_THE_S1_CLAN;
	
	@ClientString(id = 3432, message = "Stage 1")
	public static SystemMessageId STAGE_1;
	
	@ClientString(id = 3433, message = "Stage 2")
	public static SystemMessageId STAGE_2;
	
	@ClientString(id = 3434, message = "Stage 3")
	public static SystemMessageId STAGE_3;
	
	@ClientString(id = 3435, message = "Stage 4")
	public static SystemMessageId STAGE_4;
	
	@ClientString(id = 3436, message = "Stage 5")
	public static SystemMessageId STAGE_5;
	
	@ClientString(id = 3437, message = "Stage 6")
	public static SystemMessageId STAGE_6;
	
	@ClientString(id = 3438, message = "Stage 7")
	public static SystemMessageId STAGE_7;
	
	@ClientString(id = 3439, message = "Stage 8")
	public static SystemMessageId STAGE_8;
	
	@ClientString(id = 3440, message = "Final Stage")
	public static SystemMessageId FINAL_STAGE;
	
	@ClientString(id = 3441, message = "Boss appeared.")
	public static SystemMessageId BOSS_APPEARED;
	
	@ClientString(id = 3442, message = "(per piece: $s1)")
	public static SystemMessageId PER_PIECE_S1;
	
	@ClientString(id = 3443, message = "Please select the item from the Item List.")
	public static SystemMessageId PLEASE_SELECT_THE_ITEM_FROM_THE_ITEM_LIST;
	
	@ClientString(id = 3444, message = "Item List is not supported in All Items.nPlease enter a word to search the item, ornselect detailed category.")
	public static SystemMessageId ITEM_LIST_IS_NOT_SUPPORTED_IN_ALL_ITEMS_NPLEASE_ENTER_A_WORD_TO_SEARCH_THE_ITEM_OR_NSELECT_DETAILED_CATEGORY;
	
	@ClientString(id = 3445, message = "Looking for a player who will replace $s1.")
	public static SystemMessageId LOOKING_FOR_A_PLAYER_WHO_WILL_REPLACE_S1;
	
	@ClientString(id = 3446, message = "Stopped looking for a player who will replace $s1.")
	public static SystemMessageId STOPPED_LOOKING_FOR_A_PLAYER_WHO_WILL_REPLACE_S1;
	
	@ClientString(id = 3447, message = "You are not currently registered on the waiting list.")
	public static SystemMessageId YOU_ARE_NOT_CURRENTLY_REGISTERED_ON_THE_WAITING_LIST;
	
	@ClientString(id = 3448, message = "It is automatically rejected because your decision to participate was not made within the time frame.")
	public static SystemMessageId IT_IS_AUTOMATICALLY_REJECTED_BECAUSE_YOUR_DECISION_TO_PARTICIPATE_WAS_NOT_MADE_WITHIN_THE_TIME_FRAME;
	
	@ClientString(id = 3449, message = "The party does not exist, and you are again registered on the waiting list.")
	public static SystemMessageId THE_PARTY_DOES_NOT_EXIST_AND_YOU_ARE_AGAIN_REGISTERED_ON_THE_WAITING_LIST;
	
	@ClientString(id = 3450, message = "The player declined to join your party.")
	public static SystemMessageId THE_PLAYER_DECLINED_TO_JOIN_YOUR_PARTY2;
	
	@ClientString(id = 3451, message = "Request of replacement player is not allowed in the area.")
	public static SystemMessageId REQUEST_OF_REPLACEMENT_PLAYER_IS_NOT_ALLOWED_IN_THE_AREA;
	
	@ClientString(id = 3452, message = "You are registered on the waiting list.")
	public static SystemMessageId YOU_ARE_REGISTERED_ON_THE_WAITING_LIST;
	
	@ClientString(id = 3453, message = "Stopped searching the party.")
	public static SystemMessageId STOPPED_SEARCHING_THE_PARTY;
	
	@ClientString(id = 3454, message = "The player to be replaced does not exist, and another player is being searched for.")
	public static SystemMessageId THE_PLAYER_TO_BE_REPLACED_DOES_NOT_EXIST_AND_ANOTHER_PLAYER_IS_BEING_SEARCHED_FOR;
	
	@ClientString(id = 3455, message = "Registration has failed.")
	public static SystemMessageId REGISTRATION_HAS_FAILED;
	
	@ClientString(id = 3456, message = "You are already registered on the waiting list.")
	public static SystemMessageId YOU_ARE_ALREADY_REGISTERED_ON_THE_WAITING_LIST;
	
	@ClientString(id = 3457, message = "Replacing player for $s1 could not be found.")
	public static SystemMessageId REPLACING_PLAYER_FOR_S1_COULD_NOT_BE_FOUND;
	
	@ClientString(id = 3458, message = "All registrations in the corresponding area will be cancelled.")
	public static SystemMessageId ALL_REGISTRATIONS_IN_THE_CORRESPONDING_AREA_WILL_BE_CANCELLED;
	
	@ClientString(id = 3459, message = "Cancellation has failed.")
	public static SystemMessageId CANCELLATION_HAS_FAILED;
	
	@ClientString(id = 3460, message = "There already is a replacement player registered.")
	public static SystemMessageId THERE_ALREADY_IS_A_REPLACEMENT_PLAYER_REGISTERED;
	
	@ClientString(id = 3461, message = "Will you join ($s1), ($s2) party as ($s3)?")
	public static SystemMessageId WILL_YOU_JOIN_S1_S2_PARTY_AS_S3;
	
	@ClientString(id = 3462, message = "You've got a new product. nClick the icon to see it in the Product Inventory.")
	public static SystemMessageId YOU_VE_GOT_A_NEW_PRODUCT_NCLICK_THE_ICON_TO_SEE_IT_IN_THE_PRODUCT_INVENTORY;
	
	@ClientString(id = 3463, message = "$c1 used $s3 on $c2.")
	public static SystemMessageId C1_USED_S3_ON_C2;
	
	@ClientString(id = 3464, message = "War with the $s1 clan has ended. It was a tie in the Clan War with the $s1 clan.")
	public static SystemMessageId WAR_WITH_THE_S1_CLAN_HAS_ENDED_IT_WAS_A_TIE_IN_THE_CLAN_WAR_WITH_THE_S1_CLAN2;
	
	@ClientString(id = 3465, message = "Your bid for the Provisional Clan Hall won.")
	public static SystemMessageId YOUR_BID_FOR_THE_PROVISIONAL_CLAN_HALL_WON;
	
	@ClientString(id = 3466, message = "Your bid for the Provisional Clan Hall lost.")
	public static SystemMessageId YOUR_BID_FOR_THE_PROVISIONAL_CLAN_HALL_LOST;
	
	@ClientString(id = 3467, message = "Clan Level requirements for bidding are not met.")
	public static SystemMessageId CLAN_LEVEL_REQUIREMENTS_FOR_BIDDING_ARE_NOT_MET;
	
	@ClientString(id = 3468, message = "You made a bid at $s1.")
	public static SystemMessageId YOU_MADE_A_BID_AT_S1;
	
	@ClientString(id = 3469, message = "You already made a bid for the Provisional Clan Hall.")
	public static SystemMessageId YOU_ALREADY_MADE_A_BID_FOR_THE_PROVISIONAL_CLAN_HALL;
	
	@ClientString(id = 3470, message = "It is not the bidding period for the Provisional Clan Hall.")
	public static SystemMessageId IT_IS_NOT_THE_BIDDING_PERIOD_FOR_THE_PROVISIONAL_CLAN_HALL;
	
	@ClientString(id = 3471, message = "You cannot make a bid because you don't belong to a clan.")
	public static SystemMessageId YOU_CANNOT_MAKE_A_BID_BECAUSE_YOU_DON_T_BELONG_TO_A_CLAN;
	
	@ClientString(id = 3472, message = "You must have rights to a Clan Hall auction in order to make a bid for Provisional Clan Hall.")
	public static SystemMessageId YOU_MUST_HAVE_RIGHTS_TO_A_CLAN_HALL_AUCTION_IN_ORDER_TO_MAKE_A_BID_FOR_PROVISIONAL_CLAN_HALL;
	
	@ClientString(id = 3473, message = "The player you want to add is not currently logged in.")
	public static SystemMessageId THE_PLAYER_YOU_WANT_TO_ADD_IS_NOT_CURRENTLY_LOGGED_IN;
	
	@ClientString(id = 3474, message = "24hz service is not available for a temporary error.")
	public static SystemMessageId HZ_SERVICE_IS_NOT_AVAILABLE_FOR_A_TEMPORARY_ERROR;
	
	@ClientString(id = 3475, message = "Provisional Clan Hall is returned.")
	public static SystemMessageId PROVISIONAL_CLAN_HALL_IS_RETURNED;
	
	@ClientString(id = 3476, message = "The replacement player cannot be requested because they already belong to a party.")
	public static SystemMessageId THE_REPLACEMENT_PLAYER_CANNOT_BE_REQUESTED_BECAUSE_THEY_ALREADY_BELONG_TO_A_PARTY;
	
	@ClientString(id = 3477, message = "You cannot register/purchase/cancel an item during exchange.")
	public static SystemMessageId YOU_CANNOT_REGISTER_PURCHASE_CANCEL_AN_ITEM_DURING_EXCHANGE;
	
	@ClientString(id = 3478, message = "You cannot register/purchase/cancel an item in a private store or private workshop.")
	public static SystemMessageId YOU_CANNOT_REGISTER_PURCHASE_CANCEL_AN_ITEM_IN_A_PRIVATE_STORE_OR_PRIVATE_WORKSHOP;
	
	@ClientString(id = 3479, message = "You cannot register, purchase, or cancel the purchase of an item while enchanting an item, bestowing an attribute, combining jewels, or crystallizing.")
	public static SystemMessageId YOU_CANNOT_REGISTER_PURCHASE_OR_CANCEL_THE_PURCHASE_OF_AN_ITEM_WHILE_ENCHANTING_AN_ITEM_BESTOWING_AN_ATTRIBUTE_COMBINING_JEWELS_OR_CRYSTALLIZING;
	
	@ClientString(id = 3480, message = "Items that cannot be exchanged/dropped/use a private store or that are for a limited period/augmenting cannot be registered.")
	public static SystemMessageId ITEMS_THAT_CANNOT_BE_EXCHANGED_DROPPED_USE_A_PRIVATE_STORE_OR_THAT_ARE_FOR_A_LIMITED_PERIOD_AUGMENTING_CANNOT_BE_REGISTERED;
	
	@ClientString(id = 3481, message = "If the weight is 80% or more and the inventory number is 90% or more, purchase/cancellation is not possible.")
	public static SystemMessageId IF_THE_WEIGHT_IS_80_OR_MORE_AND_THE_INVENTORY_NUMBER_IS_90_OR_MORE_PURCHASE_CANCELLATION_IS_NOT_POSSIBLE;
	
	@ClientString(id = 3482, message = "The number of allowed Adena has been exceeded.")
	public static SystemMessageId THE_NUMBER_OF_ALLOWED_ADENA_HAS_BEEN_EXCEEDED;
	
	@ClientString(id = 3483, message = "The number of allowed pieces has been exceeded.")
	public static SystemMessageId THE_NUMBER_OF_ALLOWED_PIECES_HAS_BEEN_EXCEEDED;
	
	@ClientString(id = 3484, message = "The item has been successfully registered.")
	public static SystemMessageId THE_ITEM_HAS_BEEN_SUCCESSFULLY_REGISTERED;
	
	@ClientString(id = 3485, message = "Cancellation of Sale for the item is successful.")
	public static SystemMessageId CANCELLATION_OF_SALE_FOR_THE_ITEM_IS_SUCCESSFUL;
	
	@ClientString(id = 3486, message = "The item has been successfully purchased.")
	public static SystemMessageId THE_ITEM_HAS_BEEN_SUCCESSFULLY_PURCHASED;
	
	@ClientString(id = 3487, message = "The offer can be withdrawn within $s1 hour(s) $s2 minute(s).")
	public static SystemMessageId THE_OFFER_CAN_BE_WITHDRAWN_WITHIN_S1_HOUR_S_S2_MINUTE_S;
	
	@ClientString(id = 3488, message = "The offer can be withdrawn within $s1 minute(s).")
	public static SystemMessageId THE_OFFER_CAN_BE_WITHDRAWN_WITHIN_S1_MINUTE_S;
	
	@ClientString(id = 3489, message = "The search result exceeded the maximum allowed range for output. Please search by selecting detailed category.")
	public static SystemMessageId THE_SEARCH_RESULT_EXCEEDED_THE_MAXIMUM_ALLOWED_RANGE_FOR_OUTPUT_PLEASE_SEARCH_BY_SELECTING_DETAILED_CATEGORY;
	
	@ClientString(id = 3490, message = "The item you registered has been sold.")
	public static SystemMessageId THE_ITEM_YOU_REGISTERED_HAS_BEEN_SOLD;
	
	@ClientString(id = 3491, message = "$s1 has been sold.")
	public static SystemMessageId S1_HAS_BEEN_SOLD;
	
	@ClientString(id = 3492, message = "The registration period for the item you registered has expired.")
	public static SystemMessageId THE_REGISTRATION_PERIOD_FOR_THE_ITEM_YOU_REGISTERED_HAS_EXPIRED;
	
	@ClientString(id = 3493, message = "The auction house registration period has expired and the corresponding item is being forwarded.")
	public static SystemMessageId THE_AUCTION_HOUSE_REGISTRATION_PERIOD_HAS_EXPIRED_AND_THE_CORRESPONDING_ITEM_IS_BEING_FORWARDED;
	
	@ClientString(id = 3494, message = "The item that is currently worn cannot be registered.")
	public static SystemMessageId THE_ITEM_THAT_IS_CURRENTLY_WORN_CANNOT_BE_REGISTERED;
	
	@ClientString(id = 3495, message = "A Mark of Adventurer is acquired. This item can be re-acquired after 6:30 a.m. everyday.")
	public static SystemMessageId A_MARK_OF_ADVENTURER_IS_ACQUIRED_THIS_ITEM_CAN_BE_RE_ACQUIRED_AFTER_6_30_A_M_EVERYDAY;
	
	@ClientString(id = 3496, message = "How many $s1(s) do you wish to move? (Max: 99,999 units)")
	public static SystemMessageId HOW_MANY_S1_S_DO_YOU_WISH_TO_MOVE_MAX_99_999_UNITS;
	
	@ClientString(id = 3497, message = "You cannot request to auction several clan halls at once, or request to auction clan halls during castle sieges or clan hall wars.")
	public static SystemMessageId YOU_CANNOT_REQUEST_TO_AUCTION_SEVERAL_CLAN_HALLS_AT_ONCE_OR_REQUEST_TO_AUCTION_CLAN_HALLS_DURING_CASTLE_SIEGES_OR_CLAN_HALL_WARS;
	
	@ClientString(id = 3498, message = "You cannot receive a symbol because you are below the required level.")
	public static SystemMessageId YOU_CANNOT_RECEIVE_A_SYMBOL_BECAUSE_YOU_ARE_BELOW_THE_REQUIRED_LEVEL;
	
	@ClientString(id = 3499, message = "You cannot receive a symbol because you don't have enough Adena.")
	public static SystemMessageId YOU_CANNOT_RECEIVE_A_SYMBOL_BECAUSE_YOU_DON_T_HAVE_ENOUGH_ADENA;
	
	@ClientString(id = 3500, message = "You cannot receive a symbol because you don't have enough dye.")
	public static SystemMessageId YOU_CANNOT_RECEIVE_A_SYMBOL_BECAUSE_YOU_DON_T_HAVE_ENOUGH_DYE;
	
	@ClientString(id = 3501, message = "You cannot receive a symbol because you don't meet the class requirements.")
	public static SystemMessageId YOU_CANNOT_RECEIVE_A_SYMBOL_BECAUSE_YOU_DON_T_MEET_THE_CLASS_REQUIREMENTS;
	
	@ClientString(id = 3502, message = "($s1) nitem does not exist in the Sale List.")
	public static SystemMessageId S1_NITEM_DOES_NOT_EXIST_IN_THE_SALE_LIST;
	
	@ClientString(id = 3503, message = "$s1 day(s) $s2 hour(s)")
	public static SystemMessageId S1_DAY_S_S2_HOUR_S;
	
	@ClientString(id = 3504, message = "$c1 is set to refuse friend requests and cannot receive a friend request.")
	public static SystemMessageId C1_IS_SET_TO_REFUSE_FRIEND_REQUESTS_AND_CANNOT_RECEIVE_A_FRIEND_REQUEST;
	
	@ClientString(id = 3505, message = "Preferences is configured to refuse friend requests, and the friend invitation of $c1 is automatically rejected.")
	public static SystemMessageId PREFERENCES_IS_CONFIGURED_TO_REFUSE_FRIEND_REQUESTS_AND_THE_FRIEND_INVITATION_OF_C1_IS_AUTOMATICALLY_REJECTED;
	
	@ClientString(id = 3506, message = "$c1 refused the friend invitation.")
	public static SystemMessageId C1_REFUSED_THE_FRIEND_INVITATION;
	
	@ClientString(id = 3507, message = "Friend invitation of $c1 is refused.")
	public static SystemMessageId FRIEND_INVITATION_OF_C1_IS_REFUSED;
	
	@ClientString(id = 3508, message = "24hz is already running.")
	public static SystemMessageId HZ_IS_ALREADY_RUNNING;
	
	@ClientString(id = 3509, message = "24hz has ended.")
	public static SystemMessageId HZ_HAS_ENDED;
	
	@ClientString(id = 3510, message = "You cannot perform the action while using Sayune.")
	public static SystemMessageId YOU_CANNOT_PERFORM_THE_ACTION_WHILE_USING_SAYUNE;
	
	@ClientString(id = 3511, message = "A replacement player for $c1 has been found, and an invitation is sent.")
	public static SystemMessageId A_REPLACEMENT_PLAYER_FOR_C1_HAS_BEEN_FOUND_AND_AN_INVITATION_IS_SENT;
	
	@ClientString(id = 3512, message = "The player who was invited rejected the invitation. Please register again.")
	public static SystemMessageId THE_PLAYER_WHO_WAS_INVITED_REJECTED_THE_INVITATION_PLEASE_REGISTER_AGAIN;
	
	@ClientString(id = 3513, message = "Waiting list registration is cancelled because the cursed sword is being used or the status is in a chaotic state.")
	public static SystemMessageId WAITING_LIST_REGISTRATION_IS_CANCELLED_BECAUSE_THE_CURSED_SWORD_IS_BEING_USED_OR_THE_STATUS_IS_IN_A_CHAOTIC_STATE;
	
	@ClientString(id = 3514, message = "Waiting list registration is cancelled because you are in a duel.")
	public static SystemMessageId WAITING_LIST_REGISTRATION_IS_CANCELLED_BECAUSE_YOU_ARE_IN_A_DUEL;
	
	@ClientString(id = 3515, message = "Waiting list registration is cancelled because you are currently participating in Olympiad.")
	public static SystemMessageId WAITING_LIST_REGISTRATION_IS_CANCELLED_BECAUSE_YOU_ARE_CURRENTLY_PARTICIPATING_IN_OLYMPIAD;
	
	@ClientString(id = 3516, message = "Waiting list registration is cancelled because you are currently participating in the Block Checker/Coliseum/Olympiad/Kratei's Cube/Ceremony of Chaos.")
	public static SystemMessageId WAITING_LIST_REGISTRATION_IS_CANCELLED_BECAUSE_YOU_ARE_CURRENTLY_PARTICIPATING_IN_THE_BLOCK_CHECKER_COLISEUM_OLYMPIAD_KRATEI_S_CUBE_CEREMONY_OF_CHAOS;
	
	@ClientString(id = 3517, message = "You cannot register in the waiting list while being inside of a battleground (castle siege/fortress siege).")
	public static SystemMessageId YOU_CANNOT_REGISTER_IN_THE_WAITING_LIST_WHILE_BEING_INSIDE_OF_A_BATTLEGROUND_CASTLE_SIEGE_FORTRESS_SIEGE;
	
	@ClientString(id = 3518, message = "Waiting list registration is not allowed while the cursed sword is being used or the status is in a chaotic state.")
	public static SystemMessageId WAITING_LIST_REGISTRATION_IS_NOT_ALLOWED_WHILE_THE_CURSED_SWORD_IS_BEING_USED_OR_THE_STATUS_IS_IN_A_CHAOTIC_STATE;
	
	@ClientString(id = 3519, message = "You cannot register in the waiting list during a duel.")
	public static SystemMessageId YOU_CANNOT_REGISTER_IN_THE_WAITING_LIST_DURING_A_DUEL;
	
	@ClientString(id = 3520, message = "You cannot register in the waiting list while participating in Olympiad.")
	public static SystemMessageId YOU_CANNOT_REGISTER_IN_THE_WAITING_LIST_WHILE_PARTICIPATING_IN_OLYMPIAD;
	
	@ClientString(id = 3521, message = "You cannot register for the waiting list while participating in the Block Checker/Coliseum/Olympiad/Kratei's Cube/Ceremony of Chaos.")
	public static SystemMessageId YOU_CANNOT_REGISTER_FOR_THE_WAITING_LIST_WHILE_PARTICIPATING_IN_THE_BLOCK_CHECKER_COLISEUM_OLYMPIAD_KRATEI_S_CUBE_CEREMONY_OF_CHAOS;
	
	@ClientString(id = 3522, message = "You cannot register for the waiting list on the battlefield (castle siege/fortress siege).")
	public static SystemMessageId YOU_CANNOT_REGISTER_FOR_THE_WAITING_LIST_ON_THE_BATTLEFIELD_CASTLE_SIEGE_FORTRESS_SIEGE;
	
	@ClientString(id = 3523, message = "Looking for a player who will replace the selected party member.")
	public static SystemMessageId LOOKING_FOR_A_PLAYER_WHO_WILL_REPLACE_THE_SELECTED_PARTY_MEMBER;
	
	@ClientString(id = 3524, message = "You are declaring a Clan War against $s1. The Clan War immediately starts when both parties declare the war. Do you want to continue to declare a war?")
	public static SystemMessageId YOU_ARE_DECLARING_A_CLAN_WAR_AGAINST_S1_THE_CLAN_WAR_IMMEDIATELY_STARTS_WHEN_BOTH_PARTIES_DECLARE_THE_WAR_DO_YOU_WANT_TO_CONTINUE_TO_DECLARE_A_WAR;
	
	@ClientString(id = 3525, message = "Vitality is applied, and you are receiving 200% bonus XP while hunting. You can use a maximum of 5 Vitality items per week, including Replenishing and Maintaining items.")
	public static SystemMessageId VITALITY_IS_APPLIED_AND_YOU_ARE_RECEIVING_200_BONUS_XP_WHILE_HUNTING_YOU_CAN_USE_A_MAXIMUM_OF_5_VITALITY_ITEMS_PER_WEEK_INCLUDING_REPLENISHING_AND_MAINTAINING_ITEMS;
	
	@ClientString(id = 3526, message = "Vitality is not yet applied. Vitality points are all replenished every week during the regular maintenance. You can use a maximum 5 Vitality items per week, including Replenishing and Maintaining items.")
	public static SystemMessageId VITALITY_IS_NOT_YET_APPLIED_VITALITY_POINTS_ARE_ALL_REPLENISHED_EVERY_WEEK_DURING_THE_REGULAR_MAINTENANCE_YOU_CAN_USE_A_MAXIMUM_5_VITALITY_ITEMS_PER_WEEK_INCLUDING_REPLENISHING_AND_MAINTAINING_ITEMS;
	
	@ClientString(id = 3527, message = "The corresponding party is currently in an area where summoning is not allowed, therefore it cannot join the party. Became re-registered on the waiting list.")
	public static SystemMessageId THE_CORRESPONDING_PARTY_IS_CURRENTLY_IN_AN_AREA_WHERE_SUMMONING_IS_NOT_ALLOWED_THEREFORE_IT_CANNOT_JOIN_THE_PARTY_BECAME_RE_REGISTERED_ON_THE_WAITING_LIST;
	
	@ClientString(id = 3528, message = "Vitality effect is applied. There's $s1 vitality effect left that may be applied until the next cycle.")
	public static SystemMessageId VITALITY_EFFECT_IS_APPLIED_THERE_S_S1_VITALITY_EFFECT_LEFT_THAT_MAY_BE_APPLIED_UNTIL_THE_NEXT_CYCLE;
	
	@ClientString(id = 3529, message = "You may not delete a character while item is listed for sale.(br)Please cancel the registration then try again.")
	public static SystemMessageId YOU_MAY_NOT_DELETE_A_CHARACTER_WHILE_ITEM_IS_LISTED_FOR_SALE_BR_PLEASE_CANCEL_THE_REGISTRATION_THEN_TRY_AGAIN;
	
	@ClientString(id = 3530, message = "You have successfully purchased $s2 of $s1.")
	public static SystemMessageId YOU_HAVE_SUCCESSFULLY_PURCHASED_S2_OF_S1;
	
	@ClientString(id = 3531, message = "You are missing both SP and item to learn the skill.")
	public static SystemMessageId YOU_ARE_MISSING_BOTH_SP_AND_ITEM_TO_LEARN_THE_SKILL;
	
	@ClientString(id = 3532, message = "Welcome to Lineage II.nWhen you click on the character generation button in the bottom, you will move to the character generation screen.")
	public static SystemMessageId WELCOME_TO_LINEAGE_II_NWHEN_YOU_CLICK_ON_THE_CHARACTER_GENERATION_BUTTON_IN_THE_BOTTOM_YOU_WILL_MOVE_TO_THE_CHARACTER_GENERATION_SCREEN;
	
	@ClientString(id = 3533, message = "Would you like to generate a new character under the current settings?")
	public static SystemMessageId WOULD_YOU_LIKE_TO_GENERATE_A_NEW_CHARACTER_UNDER_THE_CURRENT_SETTINGS;
	
	@ClientString(id = 3534, message = "You may not register while using the instant zone.")
	public static SystemMessageId YOU_MAY_NOT_REGISTER_WHILE_USING_THE_INSTANT_ZONE;
	
	@ClientString(id = 3535, message = "You cannot register in this region.")
	public static SystemMessageId YOU_CANNOT_REGISTER_IN_THIS_REGION;
	
	@ClientString(id = 3536, message = "Incorrect password.")
	public static SystemMessageId INCORRECT_PASSWORD2;
	
	@ClientString(id = 3537, message = "Please contact customer service.")
	public static SystemMessageId PLEASE_CONTACT_CUSTOMER_SERVICE;
	
	@ClientString(id = 3538, message = "Break the Giants' seal, and the power will be yours.")
	public static SystemMessageId BREAK_THE_GIANTS_SEAL_AND_THE_POWER_WILL_BE_YOURS;
	
	@ClientString(id = 3539, message = "Available name.")
	public static SystemMessageId AVAILABLE_NAME;
	
	@ClientString(id = 3540, message = "($s1) cannot be used due to policy restrictions. Please contact customer service for details.")
	public static SystemMessageId S1_CANNOT_BE_USED_DUE_TO_POLICY_RESTRICTIONS_PLEASE_CONTACT_CUSTOMER_SERVICE_FOR_DETAILS;
	
	@ClientString(id = 3541, message = "Urggghh....")
	public static SystemMessageId URGGGHH;
	
	@ClientString(id = 3542, message = "Rawwwww!")
	public static SystemMessageId RAWWWWW;
	
	@ClientString(id = 3543, message = "Servant of light, you have done enough.")
	public static SystemMessageId SERVANT_OF_LIGHT_YOU_HAVE_DONE_ENOUGH;
	
	@ClientString(id = 3544, message = "I will watch over your weary soul. Bask in the eternal glory of the light.")
	public static SystemMessageId I_WILL_WATCH_OVER_YOUR_WEARY_SOUL_BASK_IN_THE_ETERNAL_GLORY_OF_THE_LIGHT;
	
	@ClientString(id = 3545, message = "Goddess! I betrayed my friends for you. Was it right? Was it worth it?")
	public static SystemMessageId GODDESS_I_BETRAYED_MY_FRIENDS_FOR_YOU_WAS_IT_RIGHT_WAS_IT_WORTH_IT;
	
	@ClientString(id = 3546, message = "How long has it been since I've had a visitor…?")
	public static SystemMessageId HOW_LONG_HAS_IT_BEEN_SINCE_I_VE_HAD_A_VISITOR;
	
	@ClientString(id = 3547, message = "Do you know who I am? Or do you just want to know what my crime was?")
	public static SystemMessageId DO_YOU_KNOW_WHO_I_AM_OR_DO_YOU_JUST_WANT_TO_KNOW_WHAT_MY_CRIME_WAS;
	
	@ClientString(id = 3548, message = "Learn now from me about the tragic past…filled with agony, sorrow…")
	public static SystemMessageId LEARN_NOW_FROM_ME_ABOUT_THE_TRAGIC_PAST_FILLED_WITH_AGONY_SORROW;
	
	@ClientString(id = 3549, message = "…and  learn about the heartless witch that you worship as a goddess! Haha…")
	public static SystemMessageId AND_LEARN_ABOUT_THE_HEARTLESS_WITCH_THAT_YOU_WORSHIP_AS_A_GODDESS_HAHA;
	
	@ClientString(id = 3550, message = "The goddess imprisoned us. She saw us as incomplete, malformed.")
	public static SystemMessageId THE_GODDESS_IMPRISONED_US_SHE_SAW_US_AS_INCOMPLETE_MALFORMED;
	
	@ClientString(id = 3551, message = "We defied her…urghh!")
	public static SystemMessageId WE_DEFIED_HER_URGHH;
	
	@ClientString(id = 3552, message = "Genesis! We gathered at the Garden of Genesis and pleaded to her for mercy.")
	public static SystemMessageId GENESIS_WE_GATHERED_AT_THE_GARDEN_OF_GENESIS_AND_PLEADED_TO_HER_FOR_MERCY;
	
	@ClientString(id = 3553, message = "But Octavis, blinded by the false promises of the light, betrayed us.")
	public static SystemMessageId BUT_OCTAVIS_BLINDED_BY_THE_FALSE_PROMISES_OF_THE_LIGHT_BETRAYED_US;
	
	@ClientString(id = 3554, message = "It doesn't matter either way…as long as you listen to me.")
	public static SystemMessageId IT_DOESN_T_MATTER_EITHER_WAY_AS_LONG_AS_YOU_LISTEN_TO_ME;
	
	@ClientString(id = 3555, message = "You have come this far.")
	public static SystemMessageId YOU_HAVE_COME_THIS_FAR;
	
	@ClientString(id = 3556, message = "Now choose.")
	public static SystemMessageId NOW_CHOOSE;
	
	@ClientString(id = 3557, message = "Betray the goddess, and plunge into the depths of hell…")
	public static SystemMessageId BETRAY_THE_GODDESS_AND_PLUNGE_INTO_THE_DEPTHS_OF_HELL;
	
	@ClientString(id = 3558, message = "Or remain the radiant hero of Orbis.")
	public static SystemMessageId OR_REMAIN_THE_RADIANT_HERO_OF_ORBIS;
	
	@ClientString(id = 3559, message = "You pitiful soul. Einhasad's glory be with you...")
	public static SystemMessageId YOU_PITIFUL_SOUL_EINHASAD_S_GLORY_BE_WITH_YOU;
	
	@ClientString(id = 3560, message = "The darkness will swallow me soon.")
	public static SystemMessageId THE_DARKNESS_WILL_SWALLOW_ME_SOON;
	
	@ClientString(id = 3561, message = "Leave this place…")
	public static SystemMessageId LEAVE_THIS_PLACE;
	
	@ClientString(id = 3562, message = "Before…before your light is tainted by the dark…")
	public static SystemMessageId BEFORE_BEFORE_YOUR_LIGHT_IS_TAINTED_BY_THE_DARK;
	
	@ClientString(id = 3563, message = "However, free warrior...You must go towards the light...")
	public static SystemMessageId HOWEVER_FREE_WARRIOR_YOU_MUST_GO_TOWARDS_THE_LIGHT;
	
	@ClientString(id = 3564, message = "Darkness will take your sense of self as well... leave this place before that happens...")
	public static SystemMessageId DARKNESS_WILL_TAKE_YOUR_SENSE_OF_SELF_AS_WELL_LEAVE_THIS_PLACE_BEFORE_THAT_HAPPENS;
	
	@ClientString(id = 3565, message = "Acquired academy precept skill. #You may give buff that can help academy member.")
	public static SystemMessageId ACQUIRED_ACADEMY_PRECEPT_SKILL_YOU_MAY_GIVE_BUFF_THAT_CAN_HELP_ACADEMY_MEMBER;
	
	@ClientString(id = 3566, message = "Current location: $s1 / $s2 / $s3 (Magmeld, near Ancient City Arcan)")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3_MAGMELD_NEAR_ANCIENT_CITY_ARCAN;
	
	@ClientString(id = 3567, message = "Current location: $s1 / $s2 / $s3 (Magmeld, near Ancient City Arcan)")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3_MAGMELD_NEAR_ANCIENT_CITY_ARCAN2;
	
	@ClientString(id = 3568, message = "The rebel army was annihilated by Octavis' last-minute betrayal.")
	public static SystemMessageId THE_REBEL_ARMY_WAS_ANNIHILATED_BY_OCTAVIS_LAST_MINUTE_BETRAYAL;
	
	@ClientString(id = 3569, message = "Only I remain. Pinned by bars of starlight, and being driven to madness.")
	public static SystemMessageId ONLY_I_REMAIN_PINNED_BY_BARS_OF_STARLIGHT_AND_BEING_DRIVEN_TO_MADNESS;
	
	@ClientString(id = 3570, message = "Krrrr...")
	public static SystemMessageId KRRRR;
	
	@ClientString(id = 3571, message = "Grrrrr...")
	public static SystemMessageId GRRRRR;
	
	@ClientString(id = 3572, message = "Select a glorious death rather than becoming a plaything of the gods!")
	public static SystemMessageId SELECT_A_GLORIOUS_DEATH_RATHER_THAN_BECOMING_A_PLAYTHING_OF_THE_GODS;
	
	@ClientString(id = 3573, message = "A sponsor of an academy trainee must be an Awakened character of Lv. 85 or above.")
	public static SystemMessageId A_SPONSOR_OF_AN_ACADEMY_TRAINEE_MUST_BE_AN_AWAKENED_CHARACTER_OF_LV_85_OR_ABOVE;
	
	@ClientString(id = 3574, message = "You cannot change the class because of identity crisis.")
	public static SystemMessageId YOU_CANNOT_CHANGE_THE_CLASS_BECAUSE_OF_IDENTITY_CRISIS;
	
	@ClientString(id = 3575, message = "The resurrection was a success, but... incomplete.")
	public static SystemMessageId THE_RESURRECTION_WAS_A_SUCCESS_BUT_INCOMPLETE;
	
	@ClientString(id = 3576, message = "Haha…")
	public static SystemMessageId HAHA;
	
	@ClientString(id = 3577, message = "Ah, but it seems we have a little rat watching us.")
	public static SystemMessageId AH_BUT_IT_SEEMS_WE_HAVE_A_LITTLE_RAT_WATCHING_US;
	
	@ClientString(id = 3578, message = "A complete resurrection requires a little more time. Leave for the continent first, Sakum.")
	public static SystemMessageId A_COMPLETE_RESURRECTION_REQUIRES_A_LITTLE_MORE_TIME_LEAVE_FOR_THE_CONTINENT_FIRST_SAKUM;
	
	@ClientString(id = 3579, message = "As for you, I will deal with you myself.")
	public static SystemMessageId AS_FOR_YOU_I_WILL_DEAL_WITH_YOU_MYSELF;
	
	@ClientString(id = 3580, message = "Kyaaaaa...Hyaaaaa… Hayah!")
	public static SystemMessageId KYAAAAA_HYAAAAA_HAYAH;
	
	@ClientString(id = 3581, message = "Hahaha… Defeat wasn't part of my plan. But, it doesn't matter... My research is almost complete…")
	public static SystemMessageId HAHAHA_DEFEAT_WASN_T_PART_OF_MY_PLAN_BUT_IT_DOESN_T_MATTER_MY_RESEARCH_IS_ALMOST_COMPLETE;
	
	@ClientString(id = 3582, message = "I have done it all… for the glory of our goddess…")
	public static SystemMessageId I_HAVE_DONE_IT_ALL_FOR_THE_GLORY_OF_OUR_GODDESS;
	
	@ClientString(id = 3583, message = "For her... I welcome death...ﾠﾠ")
	public static SystemMessageId FOR_HER_I_WELCOME_DEATH;
	
	@ClientString(id = 3584, message = "Ugh!!!...")
	public static SystemMessageId UGH;
	
	@ClientString(id = 3585, message = "Kwaa... aaaahh... argh...")
	public static SystemMessageId KWAA_AAAAHH_ARGH;
	
	@ClientString(id = 3586, message = "Hoho, don't you look delicious!")
	public static SystemMessageId HOHO_DON_T_YOU_LOOK_DELICIOUS;
	
	@ClientString(id = 3587, message = "Come closer, come here.")
	public static SystemMessageId COME_CLOSER_COME_HERE;
	
	@ClientString(id = 3588, message = "I'm Istina, Queen of Annihilation! Come closer to me, and I will give you the honor of becoming my dinner!")
	public static SystemMessageId I_M_ISTINA_QUEEN_OF_ANNIHILATION_COME_CLOSER_TO_ME_AND_I_WILL_GIVE_YOU_THE_HONOR_OF_BECOMING_MY_DINNER;
	
	@ClientString(id = 3589, message = "Now, focus all your power into the magic ballista!")
	public static SystemMessageId NOW_FOCUS_ALL_YOUR_POWER_INTO_THE_MAGIC_BALLISTA;
	
	@ClientString(id = 3590, message = "Ugh!")
	public static SystemMessageId UGH2;
	
	@ClientString(id = 3591, message = "Kiyaaaaa......")
	public static SystemMessageId KIYAAAAA;
	
	@ClientString(id = 3592, message = "How…how can this be? How can you allow my destruction, Shilen? No, my goddess, no!")
	public static SystemMessageId HOW_HOW_CAN_THIS_BE_HOW_CAN_YOU_ALLOW_MY_DESTRUCTION_SHILEN_NO_MY_GODDESS_NO;
	
	@ClientString(id = 3593, message = "Haha, weaklings! You can't even scratch my Spirit Stone with a pathetic effort like that.")
	public static SystemMessageId HAHA_WEAKLINGS_YOU_CAN_T_EVEN_SCRATCH_MY_SPIRIT_STONE_WITH_A_PATHETIC_EFFORT_LIKE_THAT;
	
	@ClientString(id = 3594, message = "Be gone. If you come back, you will sorely regret it!")
	public static SystemMessageId BE_GONE_IF_YOU_COME_BACK_YOU_WILL_SORELY_REGRET_IT;
	
	@ClientString(id = 3595, message = "Beleth controls Witch Parme's mind.")
	public static SystemMessageId BELETH_CONTROLS_WITCH_PARME_S_MIND;
	
	@ClientString(id = 3596, message = "Manipulating her, he has scattered the seeds of evil all over the land.")
	public static SystemMessageId MANIPULATING_HER_HE_HAS_SCATTERED_THE_SEEDS_OF_EVIL_ALL_OVER_THE_LAND;
	
	@ClientString(id = 3597, message = "Even this place has fallen under his control.")
	public static SystemMessageId EVEN_THIS_PLACE_HAS_FALLEN_UNDER_HIS_CONTROL;
	
	@ClientString(id = 3598, message = "He summoned Baylor to guard the Crystal Cavern, where he holds Parme.")
	public static SystemMessageId HE_SUMMONED_BAYLOR_TO_GUARD_THE_CRYSTAL_CAVERN_WHERE_HE_HOLDS_PARME;
	
	@ClientString(id = 3599, message = "Thanks to the efforts of valiant heroes, Baylor fell…")
	public static SystemMessageId THANKS_TO_THE_EFFORTS_OF_VALIANT_HEROES_BAYLOR_FELL;
	
	@ClientString(id = 3600, message = "...and the magical barrier surrounding the Crystal Cavern shattered.")
	public static SystemMessageId AND_THE_MAGICAL_BARRIER_SURROUNDING_THE_CRYSTAL_CAVERN_SHATTERED;
	
	@ClientString(id = 3601, message = "However, Beleth used his diabolical magic to summon something even more terrible from the depths of hell than Baylor:")
	public static SystemMessageId HOWEVER_BELETH_USED_HIS_DIABOLICAL_MAGIC_TO_SUMMON_SOMETHING_EVEN_MORE_TERRIBLE_FROM_THE_DEPTHS_OF_HELL_THAN_BAYLOR;
	
	@ClientString(id = 3602, message = "He summoned the High Demon Balok.")
	public static SystemMessageId HE_SUMMONED_THE_HIGH_DEMON_BALOK;
	
	@ClientString(id = 3603, message = "We must vanquish this new warden…")
	public static SystemMessageId WE_MUST_VANQUISH_THIS_NEW_WARDEN;
	
	@ClientString(id = 3604, message = "...f we are to free the Crystal Oracle from Beleth's devious machinations.")
	public static SystemMessageId F_WE_ARE_TO_FREE_THE_CRYSTAL_ORACLE_FROM_BELETH_S_DEVIOUS_MACHINATIONS;
	
	@ClientString(id = 3605, message = "Your strength is needed now more than ever to defeat Balok.")
	public static SystemMessageId YOUR_STRENGTH_IS_NEEDED_NOW_MORE_THAN_EVER_TO_DEFEAT_BALOK;
	
	@ClientString(id = 3606, message = "Who are you?")
	public static SystemMessageId WHO_ARE_YOU;
	
	@ClientString(id = 3607, message = "Who dares break the seal of a criminal condemned by the gods?")
	public static SystemMessageId WHO_DARES_BREAK_THE_SEAL_OF_A_CRIMINAL_CONDEMNED_BY_THE_GODS;
	
	@ClientString(id = 3608, message = "Foolish creature, expect no mercy from me.")
	public static SystemMessageId FOOLISH_CREATURE_EXPECT_NO_MERCY_FROM_ME;
	
	@ClientString(id = 3609, message = "KAHHHH!!")
	public static SystemMessageId KAHHHH;
	
	@ClientString(id = 3610, message = "Kr....ah..ahhhhh...!!!")
	public static SystemMessageId KR_AH_AHHHHH;
	
	@ClientString(id = 3611, message = "You—you fool.")
	public static SystemMessageId YOU_YOU_FOOL;
	
	@ClientString(id = 3612, message = "Leave this place now!")
	public static SystemMessageId LEAVE_THIS_PLACE_NOW;
	
	@ClientString(id = 3613, message = "If you ever return, I will end you... forever.")
	public static SystemMessageId IF_YOU_EVER_RETURN_I_WILL_END_YOU_FOREVER;
	
	@ClientString(id = 3614, message = "You cannot set ESC key as a short cut key.")
	public static SystemMessageId YOU_CANNOT_SET_ESC_KEY_AS_A_SHORT_CUT_KEY;
	
	@ClientString(id = 3615, message = "You have acquired $s1 Fame.")
	public static SystemMessageId YOU_HAVE_ACQUIRED_S1_FAME2;
	
	@ClientString(id = 3616, message = "You have maximum amount of Fame, so you may not acquire any more.")
	public static SystemMessageId YOU_HAVE_MAXIMUM_AMOUNT_OF_FAME_SO_YOU_MAY_NOT_ACQUIRE_ANY_MORE;
	
	@ClientString(id = 3617, message = "Item has been stored successfully.")
	public static SystemMessageId ITEM_HAS_BEEN_STORED_SUCCESSFULLY;
	
	@ClientString(id = 3618, message = "Item has been stored successfully to the clan warehouse.")
	public static SystemMessageId ITEM_HAS_BEEN_STORED_SUCCESSFULLY_TO_THE_CLAN_WAREHOUSE;
	
	@ClientString(id = 3619, message = "Failed to store the item.")
	public static SystemMessageId FAILED_TO_STORE_THE_ITEM;
	
	@ClientString(id = 3620, message = "Failed to store the item to the clan warehouse.")
	public static SystemMessageId FAILED_TO_STORE_THE_ITEM_TO_THE_CLAN_WAREHOUSE;
	
	@ClientString(id = 3621, message = "Successfully retrieved the item.")
	public static SystemMessageId SUCCESSFULLY_RETRIEVED_THE_ITEM;
	
	@ClientString(id = 3622, message = "Successfully retrieved the item from the clan warehouse.")
	public static SystemMessageId SUCCESSFULLY_RETRIEVED_THE_ITEM_FROM_THE_CLAN_WAREHOUSE;
	
	@ClientString(id = 3623, message = "Successfully retrieved the item from the clan warehouse.")
	public static SystemMessageId SUCCESSFULLY_RETRIEVED_THE_ITEM_FROM_THE_CLAN_WAREHOUSE2;
	
	@ClientString(id = 3624, message = "Failed to retrieve the item from the clan warehouse.")
	public static SystemMessageId FAILED_TO_RETRIEVE_THE_ITEM_FROM_THE_CLAN_WAREHOUSE;
	
	@ClientString(id = 3625, message = "You may not use Sayune while pet or summoned pet is out.")
	public static SystemMessageId YOU_MAY_NOT_USE_SAYUNE_WHILE_PET_OR_SUMMONED_PET_IS_OUT;
	
	@ClientString(id = 3626, message = "I am Hermuncus, leader of the Giants.")
	public static SystemMessageId I_AM_HERMUNCUS_LEADER_OF_THE_GIANTS;
	
	@ClientString(id = 3627, message = "You are a hero. Your valiant soul resonates with the call of my soul.")
	public static SystemMessageId YOU_ARE_A_HERO_YOUR_VALIANT_SOUL_RESONATES_WITH_THE_CALL_OF_MY_SOUL;
	
	@ClientString(id = 3628, message = "The whole world reeks of blood. Can't you smell it? The end of the world is coming.")
	public static SystemMessageId THE_WHOLE_WORLD_REEKS_OF_BLOOD_CAN_T_YOU_SMELL_IT_THE_END_OF_THE_WORLD_IS_COMING;
	
	@ClientString(id = 3629, message = "Behold the monster sent by your so-called goddess as her assassin.ﾠ")
	public static SystemMessageId BEHOLD_THE_MONSTER_SENT_BY_YOUR_SO_CALLED_GODDESS_AS_HER_ASSASSIN;
	
	@ClientString(id = 3630, message = "Hell gate Earth Wyrm Trasken!")
	public static SystemMessageId HELL_GATE_EARTH_WYRM_TRASKEN;
	
	@ClientString(id = 3631, message = "Shilen has sent it to sacrifice me to her!")
	public static SystemMessageId SHILEN_HAS_SENT_IT_TO_SACRIFICE_ME_TO_HER;
	
	@ClientString(id = 3632, message = "Behold, the ocean of blood created from the sacrifice of the Dark Elves!")
	public static SystemMessageId BEHOLD_THE_OCEAN_OF_BLOOD_CREATED_FROM_THE_SACRIFICE_OF_THE_DARK_ELVES;
	
	@ClientString(id = 3633, message = "An even larger sea of blood will soon flood the continent.")
	public static SystemMessageId AN_EVEN_LARGER_SEA_OF_BLOOD_WILL_SOON_FLOOD_THE_CONTINENT;
	
	@ClientString(id = 3634, message = "The forces of light are losing power. Before the world entire is engulfed in darkness…")
	public static SystemMessageId THE_FORCES_OF_LIGHT_ARE_LOSING_POWER_BEFORE_THE_WORLD_ENTIRE_IS_ENGULFED_IN_DARKNESS;
	
	@ClientString(id = 3635, message = "You must come to me. Break the seal that binds me.")
	public static SystemMessageId YOU_MUST_COME_TO_ME_BREAK_THE_SEAL_THAT_BINDS_ME;
	
	@ClientString(id = 3636, message = "Only then may I grant you the power to fight back.")
	public static SystemMessageId ONLY_THEN_MAY_I_GRANT_YOU_THE_POWER_TO_FIGHT_BACK;
	
	@ClientString(id = 3637, message = "Go to the Talking Island Museum. My assistant will tell you where I am.")
	public static SystemMessageId GO_TO_THE_TALKING_ISLAND_MUSEUM_MY_ASSISTANT_WILL_TELL_YOU_WHERE_I_AM;
	
	@ClientString(id = 3638, message = "I...I await you here. Hurry…find me.")
	public static SystemMessageId I_I_AWAIT_YOU_HERE_HURRY_FIND_ME;
	
	@ClientString(id = 3639, message = "$s1 Clan Reputation has been consumed.")
	public static SystemMessageId S1_CLAN_REPUTATION_HAS_BEEN_CONSUMED;
	
	@ClientString(id = 3640, message = "$s1 Fame has been consumed.")
	public static SystemMessageId S1_FAME_HAS_BEEN_CONSUMED;
	
	@ClientString(id = 3641, message = "That item cannot be destroyed.")
	public static SystemMessageId THAT_ITEM_CANNOT_BE_DESTROYED;
	
	@ClientString(id = 3642, message = "Clan Reputation altered by $s1 point(s).")
	public static SystemMessageId CLAN_REPUTATION_ALTERED_BY_S1_POINT_S;
	
	@ClientString(id = 3643, message = "The distance is too far so the teleportation effect does not get applied.")
	public static SystemMessageId THE_DISTANCE_IS_TOO_FAR_SO_THE_TELEPORTATION_EFFECT_DOES_NOT_GET_APPLIED;
	
	@ClientString(id = 3644, message = "Registration will be cancelled while using the instant zone.")
	public static SystemMessageId REGISTRATION_WILL_BE_CANCELLED_WHILE_USING_THE_INSTANT_ZONE;
	
	@ClientString(id = 3645, message = "Party Participation has failed because requirements are not met.")
	public static SystemMessageId PARTY_PARTICIPATION_HAS_FAILED_BECAUSE_REQUIREMENTS_ARE_NOT_MET;
	
	@ClientString(id = 3646, message = "The corresponding work cannot be proceeded because the inventory weight/quantity limit has been exceeded.")
	public static SystemMessageId THE_CORRESPONDING_WORK_CANNOT_BE_PROCEEDED_BECAUSE_THE_INVENTORY_WEIGHT_QUANTITY_LIMIT_HAS_BEEN_EXCEEDED;
	
	@ClientString(id = 3647, message = "..Find... Me!!..")
	public static SystemMessageId FIND_ME;
	
	@ClientString(id = 3648, message = "You cannot use skills in the corresponding region.")
	public static SystemMessageId YOU_CANNOT_USE_SKILLS_IN_THE_CORRESPONDING_REGION;
	
	@ClientString(id = 3649, message = "Hahahaha…")
	public static SystemMessageId HAHAHAHA;
	
	@ClientString(id = 3650, message = "Struggle all you want to, soon my resurrection will be complete...")
	public static SystemMessageId STRUGGLE_ALL_YOU_WANT_TO_SOON_MY_RESURRECTION_WILL_BE_COMPLETE;
	
	@ClientString(id = 3651, message = "That will close this business for all the world. Haha... Hahaha...")
	public static SystemMessageId THAT_WILL_CLOSE_THIS_BUSINESS_FOR_ALL_THE_WORLD_HAHA_HAHAHA;
	
	@ClientString(id = 3652, message = "You cannot Awaken due to your current inventory weight. Please organize your inventory and try again. (Dwarven characters must be at 20% or below the inventory max to Awaken.)")
	public static SystemMessageId YOU_CANNOT_AWAKEN_DUE_TO_YOUR_CURRENT_INVENTORY_WEIGHT_PLEASE_ORGANIZE_YOUR_INVENTORY_AND_TRY_AGAIN_DWARVEN_CHARACTERS_MUST_BE_AT_20_OR_BELOW_THE_INVENTORY_MAX_TO_AWAKEN;
	
	@ClientString(id = 3653, message = "Unable to process this request until your inventory's weight and slot count are less than 70 percent of capacity.")
	public static SystemMessageId UNABLE_TO_PROCESS_THIS_REQUEST_UNTIL_YOUR_INVENTORY_S_WEIGHT_AND_SLOT_COUNT_ARE_LESS_THAN_70_PERCENT_OF_CAPACITY;
	
	@ClientString(id = 3654, message = "You cannot use Sayune while in a chaotic state.")
	public static SystemMessageId YOU_CANNOT_USE_SAYUNE_WHILE_IN_A_CHAOTIC_STATE;
	
	@ClientString(id = 3655, message = "You cannot Awaken while you're transformed or riding.")
	public static SystemMessageId YOU_CANNOT_AWAKEN_WHILE_YOU_RE_TRANSFORMED_OR_RIDING;
	
	@ClientString(id = 3656, message = "You cannot discard an item while an enchantment is in progress.")
	public static SystemMessageId YOU_CANNOT_DISCARD_AN_ITEM_WHILE_AN_ENCHANTMENT_IS_IN_PROGRESS;
	
	@ClientString(id = 3657, message = "(Total: $s1)")
	public static SystemMessageId TOTAL_S1;
	
	@ClientString(id = 3658, message = "Changing attributes is in progress. Please try again after ending the previous task.")
	public static SystemMessageId CHANGING_ATTRIBUTES_IS_IN_PROGRESS_PLEASE_TRY_AGAIN_AFTER_ENDING_THE_PREVIOUS_TASK;
	
	@ClientString(id = 3659, message = "You cannot change an attribute while using a private store or workshop.")
	public static SystemMessageId YOU_CANNOT_CHANGE_AN_ATTRIBUTE_WHILE_USING_A_PRIVATE_STORE_OR_WORKSHOP;
	
	@ClientString(id = 3660, message = "Enchantment or Attribute Enchantment is in progress. Please try again after ending the previous task.")
	public static SystemMessageId ENCHANTMENT_OR_ATTRIBUTE_ENCHANTMENT_IS_IN_PROGRESS_PLEASE_TRY_AGAIN_AFTER_ENDING_THE_PREVIOUS_TASK;
	
	@ClientString(id = 3661, message = "Changing attributes has been failed.")
	public static SystemMessageId CHANGING_ATTRIBUTES_HAS_BEEN_FAILED;
	
	@ClientString(id = 3662, message = "You cannot change attributes while exchanging.")
	public static SystemMessageId YOU_CANNOT_CHANGE_ATTRIBUTES_WHILE_EXCHANGING;
	
	@ClientString(id = 3663, message = "Other operation is in progress. Please try again after ending the previous task.")
	public static SystemMessageId OTHER_OPERATION_IS_IN_PROGRESS_PLEASE_TRY_AGAIN_AFTER_ENDING_THE_PREVIOUS_TASK;
	
	@ClientString(id = 3664, message = "Current Location: $s1 / $s2 / $s3(Near the Magmeld Orbis Temple)")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3_NEAR_THE_MAGMELD_ORBIS_TEMPLE;
	
	@ClientString(id = 3665, message = "If you execute 24hz in the full screen mode, it switches to window mode.")
	public static SystemMessageId IF_YOU_EXECUTE_24HZ_IN_THE_FULL_SCREEN_MODE_IT_SWITCHES_TO_WINDOW_MODE;
	
	@ClientString(id = 3666, message = "($s1)'s ($s2) attribute is changing to ($s3) attribute. Do you really want to change?")
	public static SystemMessageId S1_S_S2_ATTRIBUTE_IS_CHANGING_TO_S3_ATTRIBUTE_DO_YOU_REALLY_WANT_TO_CHANGE;
	
	@ClientString(id = 3667, message = "Please choose the attribute that you want to change first.")
	public static SystemMessageId PLEASE_CHOOSE_THE_ATTRIBUTE_THAT_YOU_WANT_TO_CHANGE_FIRST;
	
	@ClientString(id = 3668, message = "($s1)'s ($s2) attribute has successfully changed to ($s3) attribute.")
	public static SystemMessageId S1_S_S2_ATTRIBUTE_HAS_SUCCESSFULLY_CHANGED_TO_S3_ATTRIBUTE;
	
	@ClientString(id = 3669, message = "The item for changing an attribute does not exist.")
	public static SystemMessageId THE_ITEM_FOR_CHANGING_AN_ATTRIBUTE_DOES_NOT_EXIST;
	
	@ClientString(id = 3670, message = "You have used all Vitality effects available for this period. The next period begins after Wednesday's regular maintenance.")
	public static SystemMessageId YOU_HAVE_USED_ALL_VITALITY_EFFECTS_AVAILABLE_FOR_THIS_PERIOD_THE_NEXT_PERIOD_BEGINS_AFTER_WEDNESDAY_S_REGULAR_MAINTENANCE;
	
	@ClientString(id = 3671, message = "Please enter your ID or email address.")
	public static SystemMessageId PLEASE_ENTER_YOUR_ID_OR_EMAIL_ADDRESS;
	
	@ClientString(id = 3672, message = "Please enter your password.")
	public static SystemMessageId PLEASE_ENTER_YOUR_PASSWORD2;
	
	@ClientString(id = 3673, message = "Current Location: Inside the Provisional Clan Hall (Talking Island)")
	public static SystemMessageId CURRENT_LOCATION_INSIDE_THE_PROVISIONAL_CLAN_HALL_TALKING_ISLAND;
	
	@ClientString(id = 3674, message = "There is not enough warehouse space. Please make more room and try again.")
	public static SystemMessageId THERE_IS_NOT_ENOUGH_WAREHOUSE_SPACE_PLEASE_MAKE_MORE_ROOM_AND_TRY_AGAIN;
	
	@ClientString(id = 3675, message = "There is not enough inventory space. Please make more room and try again.")
	public static SystemMessageId THERE_IS_NOT_ENOUGH_INVENTORY_SPACE_PLEASE_MAKE_MORE_ROOM_AND_TRY_AGAIN;
	
	@ClientString(id = 3676, message = "The number of allowed pieces has been exceeded.")
	public static SystemMessageId THE_NUMBER_OF_ALLOWED_PIECES_HAS_BEEN_EXCEEDED2;
	
	@ClientString(id = 3677, message = "You cannot change classes while you are transformed.")
	public static SystemMessageId YOU_CANNOT_CHANGE_CLASSES_WHILE_YOU_ARE_TRANSFORMED;
	
	@ClientString(id = 3678, message = "$s2 has been destroyed because $s1 is dead.")
	public static SystemMessageId S2_HAS_BEEN_DESTROYED_BECAUSE_S1_IS_DEAD;
	
	@ClientString(id = 3679, message = "Player $s1 will be replaced. Replacement will occur within 3 minutes upon approval by the party leader.")
	public static SystemMessageId PLAYER_S1_WILL_BE_REPLACED_REPLACEMENT_WILL_OCCUR_WITHIN_3_MINUTES_UPON_APPROVAL_BY_THE_PARTY_LEADER;
	
	@ClientString(id = 3680, message = "The replacement player does not meet requirements. Another player is being sought.")
	public static SystemMessageId THE_REPLACEMENT_PLAYER_DOES_NOT_MEET_REQUIREMENTS_ANOTHER_PLAYER_IS_BEING_SOUGHT;
	
	@ClientString(id = 3681, message = "Replacement cannot take place in that region.")
	public static SystemMessageId REPLACEMENT_CANNOT_TAKE_PLACE_IN_THAT_REGION;
	
	@ClientString(id = 3682, message = "You cannot register/cancel while a party member replacement is waiting to take place.")
	public static SystemMessageId YOU_CANNOT_REGISTER_CANCEL_WHILE_A_PARTY_MEMBER_REPLACEMENT_IS_WAITING_TO_TAKE_PLACE;
	
	@ClientString(id = 3683, message = "You have accepted to join a party. Replacement will occur within 3 minutes upon approval by the party leader.")
	public static SystemMessageId YOU_HAVE_ACCEPTED_TO_JOIN_A_PARTY_REPLACEMENT_WILL_OCCUR_WITHIN_3_MINUTES_UPON_APPROVAL_BY_THE_PARTY_LEADER;
	
	@ClientString(id = 3684, message = "You cannot change a class in this region.")
	public static SystemMessageId YOU_CANNOT_CHANGE_A_CLASS_IN_THIS_REGION;
	
	@ClientString(id = 3685, message = "A replacement for $s1 is found. The player will be replaced in 3 minutes.")
	public static SystemMessageId A_REPLACEMENT_FOR_S1_IS_FOUND_THE_PLAYER_WILL_BE_REPLACED_IN_3_MINUTES;
	
	@ClientString(id = 3686, message = "The shared dimensional item has been successfully found.")
	public static SystemMessageId THE_SHARED_DIMENSIONAL_ITEM_HAS_BEEN_SUCCESSFULLY_FOUND;
	
	@ClientString(id = 3687, message = "The NC OTP number is incorrect. Please check the number and enter it again.")
	public static SystemMessageId THE_NC_OTP_NUMBER_IS_INCORRECT_PLEASE_CHECK_THE_NUMBER_AND_ENTER_IT_AGAIN;
	
	@ClientString(id = 3688, message = "The shared dimensional item has not been found.")
	public static SystemMessageId THE_SHARED_DIMENSIONAL_ITEM_HAS_NOT_BEEN_FOUND;
	
	@ClientString(id = 3689, message = "The mentoring relationship with $s1 has been canceled. The mentor cannot obtain another mentee for two days.")
	public static SystemMessageId THE_MENTORING_RELATIONSHIP_WITH_S1_HAS_BEEN_CANCELED_THE_MENTOR_CANNOT_OBTAIN_ANOTHER_MENTEE_FOR_TWO_DAYS;
	
	@ClientString(id = 3690, message = "Do you wish to make $s1 your mentor? (Class: $s2 / Level: $s3)")
	public static SystemMessageId DO_YOU_WISH_TO_MAKE_S1_YOUR_MENTOR_CLASS_S2_LEVEL_S3;
	
	@ClientString(id = 3691, message = "From now on, $s1 will be your mentor.")
	public static SystemMessageId FROM_NOW_ON_S1_WILL_BE_YOUR_MENTOR;
	
	@ClientString(id = 3692, message = "From now on, $s1 will be your mentee.")
	public static SystemMessageId FROM_NOW_ON_S1_WILL_BE_YOUR_MENTEE;
	
	@ClientString(id = 3693, message = "A mentor can have up to 3 mentees at the same time.")
	public static SystemMessageId A_MENTOR_CAN_HAVE_UP_TO_3_MENTEES_AT_THE_SAME_TIME;
	
	@ClientString(id = 3694, message = "You must Awaken in order to become a mentor.")
	public static SystemMessageId YOU_MUST_AWAKEN_IN_ORDER_TO_BECOME_A_MENTOR;
	
	@ClientString(id = 3695, message = "Your mentee $s1 has connected.")
	public static SystemMessageId YOUR_MENTEE_S1_HAS_CONNECTED;
	
	@ClientString(id = 3696, message = "Your mentor $s1 has connected.")
	public static SystemMessageId YOUR_MENTOR_S1_HAS_CONNECTED;
	
	@ClientString(id = 3697, message = "Your mentee $s1 has disconnected.")
	public static SystemMessageId YOUR_MENTEE_S1_HAS_DISCONNECTED;
	
	@ClientString(id = 3698, message = "Your mentor $s1 has disconnected.")
	public static SystemMessageId YOUR_MENTOR_S1_HAS_DISCONNECTED;
	
	@ClientString(id = 3699, message = "$s1 has declined becoming your mentee.")
	public static SystemMessageId S1_HAS_DECLINED_BECOMING_YOUR_MENTEE;
	
	@ClientString(id = 3700, message = "You have declined $s1's mentoring offer.")
	public static SystemMessageId YOU_HAVE_DECLINED_S1_S_MENTORING_OFFER;
	
	@ClientString(id = 3701, message = "You cannot become your own mentee.")
	public static SystemMessageId YOU_CANNOT_BECOME_YOUR_OWN_MENTEE;
	
	@ClientString(id = 3702, message = "$s1 already has a mentor.")
	public static SystemMessageId S1_ALREADY_HAS_A_MENTOR;
	
	@ClientString(id = 3703, message = "$s1 is above level 85 and cannot become a mentee.")
	public static SystemMessageId S1_IS_ABOVE_LEVEL_85_AND_CANNOT_BECOME_A_MENTEE;
	
	@ClientString(id = 3704, message = "$s1 does not have the item needed to become a mentee.")
	public static SystemMessageId S1_DOES_NOT_HAVE_THE_ITEM_NEEDED_TO_BECOME_A_MENTEE;
	
	@ClientString(id = 3705, message = "$s1 has Awakened, and the mentor-mentee relationship has ended. The mentor cannot obtain another mentee for one day after the mentee's graduation.")
	public static SystemMessageId S1_HAS_AWAKENED_AND_THE_MENTOR_MENTEE_RELATIONSHIP_HAS_ENDED_THE_MENTOR_CANNOT_OBTAIN_ANOTHER_MENTEE_FOR_ONE_DAY_AFTER_THE_MENTEE_S_GRADUATION;
	
	@ClientString(id = 3706, message = "Your mentor-mentee relationship with your mentor $s1 has ended as you are an Awakened character of Lv. 85 or above. You can no longer be paired with a mentor.")
	public static SystemMessageId YOUR_MENTOR_MENTEE_RELATIONSHIP_WITH_YOUR_MENTOR_S1_HAS_ENDED_AS_YOU_ARE_AN_AWAKENED_CHARACTER_OF_LV_85_OR_ABOVE_YOU_CAN_NO_LONGER_BE_PAIRED_WITH_A_MENTOR;
	
	@ClientString(id = 3707, message = "You have offered to become $s1's mentor.")
	public static SystemMessageId YOU_HAVE_OFFERED_TO_BECOME_S1_S_MENTOR;
	
	@ClientString(id = 3708, message = "$s1 will be removed from your Ignore List.nProceed?")
	public static SystemMessageId S1_WILL_BE_REMOVED_FROM_YOUR_IGNORE_LIST_NPROCEED;
	
	@ClientString(id = 3709, message = "Could not connect to Authentication Server. Please try again later.")
	public static SystemMessageId COULD_NOT_CONNECT_TO_AUTHENTICATION_SERVER_PLEASE_TRY_AGAIN_LATER;
	
	@ClientString(id = 3710, message = "Invitation can occur only when the mentee is in main class status.")
	public static SystemMessageId INVITATION_CAN_OCCUR_ONLY_WHEN_THE_MENTEE_IS_IN_MAIN_CLASS_STATUS;
	
	@ClientString(id = 3711, message = "Do you wish to end the mentoring relationship with $s1?  If the mentor's contract ends, the mentor cannot obtain another mentee for two days.")
	public static SystemMessageId DO_YOU_WISH_TO_END_THE_MENTORING_RELATIONSHIP_WITH_S1_IF_THE_MENTOR_S_CONTRACT_ENDS_THE_MENTOR_CANNOT_OBTAIN_ANOTHER_MENTEE_FOR_TWO_DAYS;
	
	@ClientString(id = 3712, message = "Plunder skill has been already used on this target.")
	public static SystemMessageId PLUNDER_SKILL_HAS_BEEN_ALREADY_USED_ON_THIS_TARGET;
	
	@ClientString(id = 3713, message = "You can bond with a new mentee in $s1 day(s) $s2 hour(s) $s3 minute(s).")
	public static SystemMessageId YOU_CAN_BOND_WITH_A_NEW_MENTEE_IN_S1_DAY_S_S2_HOUR_S_S3_MINUTE_S;
	
	@ClientString(id = 3714, message = "Shilen is engulfing the entire continent with darkness.")
	public static SystemMessageId SHILEN_IS_ENGULFING_THE_ENTIRE_CONTINENT_WITH_DARKNESS;
	
	@ClientString(id = 3715, message = "Tersi's power is filling the entire continent with light.")
	public static SystemMessageId TERSI_S_POWER_IS_FILLING_THE_ENTIRE_CONTINENT_WITH_LIGHT;
	
	@ClientString(id = 3716, message = "A character with a mentorship relationship cannot be deleted.")
	public static SystemMessageId A_CHARACTER_WITH_A_MENTORSHIP_RELATIONSHIP_CANNOT_BE_DELETED;
	
	@ClientString(id = 3717, message = "$s1 already has a mentoring relationship with another character so it cannot form any more mentoring relationships.")
	public static SystemMessageId S1_ALREADY_HAS_A_MENTORING_RELATIONSHIP_WITH_ANOTHER_CHARACTER_SO_IT_CANNOT_FORM_ANY_MORE_MENTORING_RELATIONSHIPS;
	
	@ClientString(id = 3718, message = "The character's name was not entered.")
	public static SystemMessageId THE_CHARACTER_S_NAME_WAS_NOT_ENTERED;
	
	@ClientString(id = 3719, message = "Do you wish to delete the selected re-play?")
	public static SystemMessageId DO_YOU_WISH_TO_DELETE_THE_SELECTED_RE_PLAY;
	
	@ClientString(id = 3720, message = "$s1 Adena is need to operate the manor.")
	public static SystemMessageId S1_ADENA_IS_NEED_TO_OPERATE_THE_MANOR;
	
	@ClientString(id = 3721, message = "Not in Use - New Field for Addition")
	public static SystemMessageId NOT_IN_USE_NEW_FIELD_FOR_ADDITION;
	
	@ClientString(id = 3722, message = "$s1 has successfully hatched the egg.")
	public static SystemMessageId S1_HAS_SUCCESSFULLY_HATCHED_THE_EGG;
	
	@ClientString(id = 3723, message = "$s1 has failed to hatch the egg.")
	public static SystemMessageId S1_HAS_FAILED_TO_HATCH_THE_EGG;
	
	@ClientString(id = 3724, message = "$s1 has successfully hatched the egg by creating the perfect temperature for incubation.")
	public static SystemMessageId S1_HAS_SUCCESSFULLY_HATCHED_THE_EGG_BY_CREATING_THE_PERFECT_TEMPERATURE_FOR_INCUBATION;
	
	@ClientString(id = 3725, message = "=====(Temperature Raising Rankings)=====")
	public static SystemMessageId TEMPERATURE_RAISING_RANKINGS;
	
	@ClientString(id = 3726, message = "Rank $1: $2 ($3.$4 degrees)")
	public static SystemMessageId RANK_1_2_3_4_DEGREES;
	
	@ClientString(id = 3727, message = "=======================")
	public static SystemMessageId EMPTY9;
	
	@ClientString(id = 3728, message = "$1 receives a prize for raising the temperature most.")
	public static SystemMessageId S1_RECEIVES_A_PRIZE_FOR_RAISING_THE_TEMPERATURE_MOST;
	
	@ClientString(id = 3729, message = "The character and item recipe levels do not match, so it cannot be used normally.")
	public static SystemMessageId THE_CHARACTER_AND_ITEM_RECIPE_LEVELS_DO_NOT_MATCH_SO_IT_CANNOT_BE_USED_NORMALLY;
	
	@ClientString(id = 3730, message = "Cycle $s1 of the Ceremony of Chaos has begun.")
	public static SystemMessageId CYCLE_S1_OF_THE_CEREMONY_OF_CHAOS_HAS_BEGUN;
	
	@ClientString(id = 3731, message = "Cycle $s1 of the Ceremony of Chaos has ended.")
	public static SystemMessageId CYCLE_S1_OF_THE_CEREMONY_OF_CHAOS_HAS_ENDED;
	
	@ClientString(id = 3732, message = "You are now on the waiting list. You will automatically be teleported when the tournament starts, and will be removed from the waiting list if you log out. If you cancel registration (within the last minute of entering the arena after signing up) 30 times or more or forfeit after entering the arena 30 times or more during a cycle, you become ineligible for participation in the Ceremony of Chaos until the next cycle. All the buffs except the Vitality buff will be removed once you enter the arenas.")
	public static SystemMessageId YOU_ARE_NOW_ON_THE_WAITING_LIST_YOU_WILL_AUTOMATICALLY_BE_TELEPORTED_WHEN_THE_TOURNAMENT_STARTS_AND_WILL_BE_REMOVED_FROM_THE_WAITING_LIST_IF_YOU_LOG_OUT_IF_YOU_CANCEL_REGISTRATION_WITHIN_THE_LAST_MINUTE_OF_ENTERING_THE_ARENA_AFTER_SIGNING_UP_30_TIMES_OR_MORE_OR_FORFEIT_AFTER_ENTERING_THE_ARENA_30_TIMES_OR_MORE_DURING_A_CYCLE_YOU_BECOME_INELIGIBLE_FOR_PARTICIPATION_IN_THE_CEREMONY_OF_CHAOS_UNTIL_THE_NEXT_CYCLE_ALL_THE_BUFFS_EXCEPT_THE_VITALITY_BUFF_WILL_BE_REMOVED_ONCE_YOU_ENTER_THE_ARENAS;
	
	@ClientString(id = 3733, message = "Only characters level 85 or above may participate in the tournament.")
	public static SystemMessageId ONLY_CHARACTERS_LEVEL_85_OR_ABOVE_MAY_PARTICIPATE_IN_THE_TOURNAMENT;
	
	@ClientString(id = 3734, message = "There are too many challengers. You cannot participate now.")
	public static SystemMessageId THERE_ARE_TOO_MANY_CHALLENGERS_YOU_CANNOT_PARTICIPATE_NOW;
	
	@ClientString(id = 3735, message = "$c1 cannot participate in the tournament due to having become the owner of $s2.")
	public static SystemMessageId C1_CANNOT_PARTICIPATE_IN_THE_TOURNAMENT_DUE_TO_HAVING_BECOME_THE_OWNER_OF_S2;
	
	@ClientString(id = 3736, message = "You have been taken off the wait list. You may only enter the wait list on Mon-Thurs every quarter of an hour for 5 minutes between 20:00 and 23:40. If you cancel registration or choose to forfeit after entering a match 30 times or more during a cycle, you must wait until the next cycle to participate in the Ceremony of Chaos. Upon entering the arena, all buffs excluding Vitality buffs are removed.")
	public static SystemMessageId YOU_HAVE_BEEN_TAKEN_OFF_THE_WAIT_LIST_YOU_MAY_ONLY_ENTER_THE_WAIT_LIST_ON_MON_THURS_EVERY_QUARTER_OF_AN_HOUR_FOR_5_MINUTES_BETWEEN_20_00_AND_23_40_IF_YOU_CANCEL_REGISTRATION_OR_CHOOSE_TO_FORFEIT_AFTER_ENTERING_A_MATCH_30_TIMES_OR_MORE_DURING_A_CYCLE_YOU_MUST_WAIT_UNTIL_THE_NEXT_CYCLE_TO_PARTICIPATE_IN_THE_CEREMONY_OF_CHAOS_UPON_ENTERING_THE_ARENA_ALL_BUFFS_EXCLUDING_VITALITY_BUFFS_ARE_REMOVED;
	
	@ClientString(id = 3737, message = "You will be moved to the arena in $s1 second(s).")
	public static SystemMessageId YOU_WILL_BE_MOVED_TO_THE_ARENA_IN_S1_SECOND_S;
	
	@ClientString(id = 3738, message = "You have proven your abilities.")
	public static SystemMessageId YOU_HAVE_PROVEN_YOUR_ABILITIES;
	
	@ClientString(id = 3739, message = "Show us what you can do next time!")
	public static SystemMessageId SHOW_US_WHAT_YOU_CAN_DO_NEXT_TIME;
	
	@ClientString(id = 3740, message = "It has ended in a tie.")
	public static SystemMessageId IT_HAS_ENDED_IN_A_TIE;
	
	@ClientString(id = 3741, message = "You cannot chat in the Ceremony of Chaos.")
	public static SystemMessageId YOU_CANNOT_CHAT_IN_THE_CEREMONY_OF_CHAOS;
	
	@ClientString(id = 3742, message = "You cannot open a private store or workshop in the Ceremony of Chaos.")
	public static SystemMessageId YOU_CANNOT_OPEN_A_PRIVATE_STORE_OR_WORKSHOP_IN_THE_CEREMONY_OF_CHAOS;
	
	@ClientString(id = 3743, message = "The invisible effect has been cancelled.")
	public static SystemMessageId THE_INVISIBLE_EFFECT_HAS_BEEN_CANCELLED;
	
	@ClientString(id = 3744, message = "Prove your abilities.")
	public static SystemMessageId PROVE_YOUR_ABILITIES;
	
	@ClientString(id = 3745, message = "There are no allies here; everyone is an enemy.")
	public static SystemMessageId THERE_ARE_NO_ALLIES_HERE_EVERYONE_IS_AN_ENEMY;
	
	@ClientString(id = 3746, message = "It will be a lonely battle, but I wish you victory.")
	public static SystemMessageId IT_WILL_BE_A_LONELY_BATTLE_BUT_I_WISH_YOU_VICTORY;
	
	@ClientString(id = 3747, message = "Begin match!")
	public static SystemMessageId BEGIN_MATCH;
	
	@ClientString(id = 3748, message = "The time of choices has come.")
	public static SystemMessageId THE_TIME_OF_CHOICES_HAS_COME;
	
	@ClientString(id = 3749, message = "In $s1 second(s), you will be moved to where you were before participating in the Ceremony of Chaos.")
	public static SystemMessageId IN_S1_SECOND_S_YOU_WILL_BE_MOVED_TO_WHERE_YOU_WERE_BEFORE_PARTICIPATING_IN_THE_CEREMONY_OF_CHAOS;
	
	@ClientString(id = 3750, message = "Only PC's who belong to a clan that is above level 5 can summon a pet.")
	public static SystemMessageId ONLY_PC_S_WHO_BELONG_TO_A_CLAN_THAT_IS_ABOVE_LEVEL_5_CAN_SUMMON_A_PET;
	
	@ClientString(id = 3751, message = "Only PC's who belong to a clan that is above level 5 can obtain Clan Reputation.")
	public static SystemMessageId ONLY_PC_S_WHO_BELONG_TO_A_CLAN_THAT_IS_ABOVE_LEVEL_5_CAN_OBTAIN_CLAN_REPUTATION;
	
	@ClientString(id = 3752, message = "Only PC's who are above level 40, have completed second class transfer, and belong to a clan that is above level 5, can summon.")
	public static SystemMessageId ONLY_PC_S_WHO_ARE_ABOVE_LEVEL_40_HAVE_COMPLETED_SECOND_CLASS_TRANSFER_AND_BELONG_TO_A_CLAN_THAT_IS_ABOVE_LEVEL_5_CAN_SUMMON;
	
	@ClientString(id = 3753, message = "Only PC's who are above level 40 and have completed second class transfer can obtain Individual Fame.")
	public static SystemMessageId ONLY_PC_S_WHO_ARE_ABOVE_LEVEL_40_AND_HAVE_COMPLETED_SECOND_CLASS_TRANSFER_CAN_OBTAIN_INDIVIDUAL_FAME;
	
	@ClientString(id = 3754, message = "$s1 second(s) to match end!")
	public static SystemMessageId S1_SECOND_S_TO_MATCH_END;
	
	@ClientString(id = 3755, message = "$s1 second(s) to match start!")
	public static SystemMessageId S1_SECOND_S_TO_MATCH_START;
	
	@ClientString(id = 3756, message = "Are you sure you want to quit?")
	public static SystemMessageId ARE_YOU_SURE_YOU_WANT_TO_QUIT;
	
	@ClientString(id = 3757, message = "Darkness spreads… contaminating even my waters' energy...")
	public static SystemMessageId DARKNESS_SPREADS_CONTAMINATING_EVEN_MY_WATERS_ENERGY;
	
	@ClientString(id = 3758, message = "Please, brave warriors… help me…")
	public static SystemMessageId PLEASE_BRAVE_WARRIORS_HELP_ME;
	
	@ClientString(id = 3759, message = "I am Eva, the goddess of water.")
	public static SystemMessageId I_AM_EVA_THE_GODDESS_OF_WATER;
	
	@ClientString(id = 3760, message = "You brave few… who have answered my call…")
	public static SystemMessageId YOU_BRAVE_FEW_WHO_HAVE_ANSWERED_MY_CALL;
	
	@ClientString(id = 3761, message = "I desperately need your aid.")
	public static SystemMessageId I_DESPERATELY_NEED_YOUR_AID;
	
	@ClientString(id = 3762, message = "You dare fight me? Ha - fools!")
	public static SystemMessageId YOU_DARE_FIGHT_ME_HA_FOOLS;
	
	@ClientString(id = 3763, message = "I am nothing like Zariche. I will crush you into dust!")
	public static SystemMessageId I_AM_NOTHING_LIKE_ZARICHE_I_WILL_CRUSH_YOU_INTO_DUST;
	
	@ClientString(id = 3764, message = "You acquired $s1 Individual Fame.")
	public static SystemMessageId YOU_ACQUIRED_S1_INDIVIDUAL_FAME;
	
	@ClientString(id = 3765, message = "Current Location: $s1 / $s2 / $s3 (inside the Seed of Hellfire)")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3_INSIDE_THE_SEED_OF_HELLFIRE;
	
	@ClientString(id = 3766, message = "You are the first to visit me in so many years. Perhaps I should treat you with the respect you deserve.")
	public static SystemMessageId YOU_ARE_THE_FIRST_TO_VISIT_ME_IN_SO_MANY_YEARS_PERHAPS_I_SHOULD_TREAT_YOU_WITH_THE_RESPECT_YOU_DESERVE;
	
	@ClientString(id = 3767, message = "You have already been blessed with the honor of meeting with me!")
	public static SystemMessageId YOU_HAVE_ALREADY_BEEN_BLESSED_WITH_THE_HONOR_OF_MEETING_WITH_ME;
	
	@ClientString(id = 3768, message = "Now, offer your lives and die with grace!")
	public static SystemMessageId NOW_OFFER_YOUR_LIVES_AND_DIE_WITH_GRACE;
	
	@ClientString(id = 3769, message = "Not in Use - New Field for Addition")
	public static SystemMessageId NOT_IN_USE_NEW_FIELD_FOR_ADDITION2;
	
	@ClientString(id = 3770, message = "The Clan Flag, the symbol of your clan, has been summoned.")
	public static SystemMessageId THE_CLAN_FLAG_THE_SYMBOL_OF_YOUR_CLAN_HAS_BEEN_SUMMONED;
	
	@ClientString(id = 3771, message = "The Clan Flag, the symbol of your clan, is under attack.")
	public static SystemMessageId THE_CLAN_FLAG_THE_SYMBOL_OF_YOUR_CLAN_IS_UNDER_ATTACK;
	
	@ClientString(id = 3772, message = "The Clan Flag, the symbol of your clan, has been destroyed.")
	public static SystemMessageId THE_CLAN_FLAG_THE_SYMBOL_OF_YOUR_CLAN_HAS_BEEN_DESTROYED;
	
	@ClientString(id = 3773, message = "The Clan Flag, the symbol of your clan, is no longer.")
	public static SystemMessageId THE_CLAN_FLAG_THE_SYMBOL_OF_YOUR_CLAN_IS_NO_LONGER;
	
	@ClientString(id = 3774, message = "Only characters who are a part of a clan of level 3 or above may participate.")
	public static SystemMessageId ONLY_CHARACTERS_WHO_ARE_A_PART_OF_A_CLAN_OF_LEVEL_3_OR_ABOVE_MAY_PARTICIPATE;
	
	@ClientString(id = 3775, message = "Only characters who have completed the 3rd Class Transfer may participate.")
	public static SystemMessageId ONLY_CHARACTERS_WHO_HAVE_COMPLETED_THE_3RD_CLASS_TRANSFER_MAY_PARTICIPATE;
	
	@ClientString(id = 3776, message = "You may not participate as you are currently participating in another PvP match.")
	public static SystemMessageId YOU_MAY_NOT_PARTICIPATE_AS_YOU_ARE_CURRENTLY_PARTICIPATING_IN_ANOTHER_PVP_MATCH;
	
	@ClientString(id = 3777, message = "You are on the waiting list for the Ceremony of Chaos.")
	public static SystemMessageId YOU_ARE_ON_THE_WAITING_LIST_FOR_THE_CEREMONY_OF_CHAOS;
	
	@ClientString(id = 3778, message = "You may not register as a participant.")
	public static SystemMessageId YOU_MAY_NOT_REGISTER_AS_A_PARTICIPANT;
	
	@ClientString(id = 3779, message = "$c1 may not participate as $c1 is currently in a Dead state.")
	public static SystemMessageId C1_MAY_NOT_PARTICIPATE_AS_C1_IS_CURRENTLY_IN_A_DEAD_STATE;
	
	@ClientString(id = 3780, message = "$c1 may not participate as $c1 is currently teleporting.")
	public static SystemMessageId C1_MAY_NOT_PARTICIPATE_AS_C1_IS_CURRENTLY_TELEPORTING;
	
	@ClientString(id = 3781, message = "Registration for the Ceremony of Chaos has begun.")
	public static SystemMessageId REGISTRATION_FOR_THE_CEREMONY_OF_CHAOS_HAS_BEGUN;
	
	@ClientString(id = 3782, message = "Registration for the Ceremony of Chaos has ended.")
	public static SystemMessageId REGISTRATION_FOR_THE_CEREMONY_OF_CHAOS_HAS_ENDED;
	
	@ClientString(id = 3783, message = "Would you like to cancel your registration in the Ceremony of Chaos?")
	public static SystemMessageId WOULD_YOU_LIKE_TO_CANCEL_YOUR_REGISTRATION_IN_THE_CEREMONY_OF_CHAOS;
	
	@ClientString(id = 3784, message = "The Ceremony of Chaos is not currently open.")
	public static SystemMessageId THE_CEREMONY_OF_CHAOS_IS_NOT_CURRENTLY_OPEN;
	
	@ClientString(id = 3785, message = "You cannot equip this item in the tournament.")
	public static SystemMessageId YOU_CANNOT_EQUIP_THIS_ITEM_IN_THE_TOURNAMENT;
	
	@ClientString(id = 3786, message = "You cannot use this item in the tournament.")
	public static SystemMessageId YOU_CANNOT_USE_THIS_ITEM_IN_THE_TOURNAMENT;
	
	@ClientString(id = 3787, message = "You cannot use this skill in the tournament.")
	public static SystemMessageId YOU_CANNOT_USE_THIS_SKILL_IN_THE_TOURNAMENT;
	
	@ClientString(id = 3788, message = "You can no longer participate in the Ceremony of Chaos as you have cancelled registration or forfeited after entering the arena 30 times or more.")
	public static SystemMessageId YOU_CAN_NO_LONGER_PARTICIPATE_IN_THE_CEREMONY_OF_CHAOS_AS_YOU_HAVE_CANCELLED_REGISTRATION_OR_FORFEITED_AFTER_ENTERING_THE_ARENA_30_TIMES_OR_MORE;
	
	@ClientString(id = 3789, message = "You cannot invite a friend or party while participating in the Ceremony of Chaos.")
	public static SystemMessageId YOU_CANNOT_INVITE_A_FRIEND_OR_PARTY_WHILE_PARTICIPATING_IN_THE_CEREMONY_OF_CHAOS;
	
	@ClientString(id = 3790, message = "You can register a Clan Mark only once every 15 minutes.")
	public static SystemMessageId YOU_CAN_REGISTER_A_CLAN_MARK_ONLY_ONCE_EVERY_15_MINUTES;
	
	@ClientString(id = 3791, message = "You have obtained the first Energy of Destruction. You can obtain up to 2 of these a day, and can begin obtaining them again at 6:30am every day.")
	public static SystemMessageId YOU_HAVE_OBTAINED_THE_FIRST_ENERGY_OF_DESTRUCTION_YOU_CAN_OBTAIN_UP_TO_2_OF_THESE_A_DAY_AND_CAN_BEGIN_OBTAINING_THEM_AGAIN_AT_6_30AM_EVERY_DAY;
	
	@ClientString(id = 3792, message = "You have obtained the second Energy of Destruction. You can obtain up to 2 of these a day, and can begin obtaining them again at 6:30am every day.")
	public static SystemMessageId YOU_HAVE_OBTAINED_THE_SECOND_ENERGY_OF_DESTRUCTION_YOU_CAN_OBTAIN_UP_TO_2_OF_THESE_A_DAY_AND_CAN_BEGIN_OBTAINING_THEM_AGAIN_AT_6_30AM_EVERY_DAY;
	
	@ClientString(id = 3793, message = "You have been transported out of the Ceremony of Chaos as you have forfeited the match.")
	public static SystemMessageId YOU_HAVE_BEEN_TRANSPORTED_OUT_OF_THE_CEREMONY_OF_CHAOS_AS_YOU_HAVE_FORFEITED_THE_MATCH;
	
	@ClientString(id = 3794, message = "You have obtained $s1 Battle Mark(s) during this round of the Ceremony of Chaos.")
	public static SystemMessageId YOU_HAVE_OBTAINED_S1_BATTLE_MARK_S_DURING_THIS_ROUND_OF_THE_CEREMONY_OF_CHAOS;
	
	@ClientString(id = 3795, message = "A victor had been named in the Ceremony of Chaos.")
	public static SystemMessageId A_VICTOR_HAD_BEEN_NAMED_IN_THE_CEREMONY_OF_CHAOS;
	
	@ClientString(id = 3796, message = "Current Location: $s1 / $s2 / $s3 (inside the Ceremony of Chaos)")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3_INSIDE_THE_CEREMONY_OF_CHAOS;
	
	@ClientString(id = 3797, message = "You've obtained the Energy of Destruction. You can obtain up to 2 of these items a day. You can get more after 06:30 AM every day.")
	public static SystemMessageId YOU_VE_OBTAINED_THE_ENERGY_OF_DESTRUCTION_YOU_CAN_OBTAIN_UP_TO_2_OF_THESE_ITEMS_A_DAY_YOU_CAN_GET_MORE_AFTER_06_30_AM_EVERY_DAY;
	
	@ClientString(id = 3798, message = "Can be used only when HP is less than 100%.")
	public static SystemMessageId CAN_BE_USED_ONLY_WHEN_HP_IS_LESS_THAN_100;
	
	@ClientString(id = 3799, message = "Can be used only when MP is less than 100%.")
	public static SystemMessageId CAN_BE_USED_ONLY_WHEN_MP_IS_LESS_THAN_100;
	
	@ClientString(id = 3800, message = "Can be used only when CP is less than 100%.")
	public static SystemMessageId CAN_BE_USED_ONLY_WHEN_CP_IS_LESS_THAN_100;
	
	@ClientString(id = 3801, message = "I heard Dr. Chaos left for Pavel Ruins with his Golem troops.")
	public static SystemMessageId I_HEARD_DR_CHAOS_LEFT_FOR_PAVEL_RUINS_WITH_HIS_GOLEM_TROOPS;
	
	@ClientString(id = 3802, message = "He arrived on the closed Isle of Souls. It seems he went there for Relics of the Giant.")
	public static SystemMessageId HE_ARRIVED_ON_THE_CLOSED_ISLE_OF_SOULS_IT_SEEMS_HE_WENT_THERE_FOR_RELICS_OF_THE_GIANT;
	
	@ClientString(id = 3803, message = "It seems he went there for Relics of the Giant.")
	public static SystemMessageId IT_SEEMS_HE_WENT_THERE_FOR_RELICS_OF_THE_GIANT;
	
	@ClientString(id = 3804, message = "Please hurry. Go chase Dr. Chaos. We have to stop his vain ambition.")
	public static SystemMessageId PLEASE_HURRY_GO_CHASE_DR_CHAOS_WE_HAVE_TO_STOP_HIS_VAIN_AMBITION;
	
	@ClientString(id = 3805, message = "There will be wind of blood and waves of blood...")
	public static SystemMessageId THERE_WILL_BE_WIND_OF_BLOOD_AND_WAVES_OF_BLOOD;
	
	@ClientString(id = 3806, message = "Lots of things disappeared… and died due to the resurrection of darkness.")
	public static SystemMessageId LOTS_OF_THINGS_DISAPPEARED_AND_DIED_DUE_TO_THE_RESURRECTION_OF_DARKNESS;
	
	@ClientString(id = 3807, message = "Warrior, don't forget about the bloody past and fight against destruction.")
	public static SystemMessageId WARRIOR_DON_T_FORGET_ABOUT_THE_BLOODY_PAST_AND_FIGHT_AGAINST_DESTRUCTION;
	
	@ClientString(id = 3808, message = "Someday, I will find you and give you new power.")
	public static SystemMessageId SOMEDAY_I_WILL_FIND_YOU_AND_GIVE_YOU_NEW_POWER;
	
	@ClientString(id = 3809, message = "I request")
	public static SystemMessageId I_REQUEST;
	
	@ClientString(id = 3810, message = "A Contestable Clan Hall War has started.")
	public static SystemMessageId A_CONTESTABLE_CLAN_HALL_WAR_HAS_STARTED;
	
	@ClientString(id = 3811, message = "Because $c1 was killed by a clan member of $s2, Clan Reputation decreased by 1.")
	public static SystemMessageId BECAUSE_C1_WAS_KILLED_BY_A_CLAN_MEMBER_OF_S2_CLAN_REPUTATION_DECREASED_BY_1;
	
	@ClientString(id = 3812, message = "Because a clan member of $s1 was killed by $c2, Clan Reputation increased by 1.")
	public static SystemMessageId BECAUSE_A_CLAN_MEMBER_OF_S1_WAS_KILLED_BY_C2_CLAN_REPUTATION_INCREASED_BY_1;
	
	@ClientString(id = 3813, message = "Because Clan $s1 did not fight back for 1 week, the clan war was cancelled.")
	public static SystemMessageId BECAUSE_CLAN_S1_DID_NOT_FIGHT_BACK_FOR_1_WEEK_THE_CLAN_WAR_WAS_CANCELLED;
	
	@ClientString(id = 3814, message = "A clan war declared by Clan $s1 was cancelled.")
	public static SystemMessageId A_CLAN_WAR_DECLARED_BY_CLAN_S1_WAS_CANCELLED;
	
	@ClientString(id = 3815, message = "A clan member of $s1 was killed by your clan member. If your clan kills $s2 members of Clan $s1, a clan war with Clan $s1 will start.")
	public static SystemMessageId A_CLAN_MEMBER_OF_S1_WAS_KILLED_BY_YOUR_CLAN_MEMBER_IF_YOUR_CLAN_KILLS_S2_MEMBERS_OF_CLAN_S1_A_CLAN_WAR_WITH_CLAN_S1_WILL_START;
	
	@ClientString(id = 3816, message = "If a character dies when PK count is 4 or above, the lower the fame, the higher the item drop rate.")
	public static SystemMessageId IF_A_CHARACTER_DIES_WHEN_PK_COUNT_IS_4_OR_ABOVE_THE_LOWER_THE_FAME_THE_HIGHER_THE_ITEM_DROP_RATE;
	
	@ClientString(id = 3817, message = "The ownership of the Clan Hall has been returned. You can join a Contestable Clan Hall War at 09:00 PM.")
	public static SystemMessageId THE_OWNERSHIP_OF_THE_CLAN_HALL_HAS_BEEN_RETURNED_YOU_CAN_JOIN_A_CONTESTABLE_CLAN_HALL_WAR_AT_09_00_PM;
	
	@ClientString(id = 3818, message = "Key combinations are available only in normal mode.")
	public static SystemMessageId KEY_COMBINATIONS_ARE_AVAILABLE_ONLY_IN_NORMAL_MODE;
	
	@ClientString(id = 3819, message = "The key you entered cannot be used as a shortcut key.")
	public static SystemMessageId THE_KEY_YOU_ENTERED_CANNOT_BE_USED_AS_A_SHORTCUT_KEY;
	
	@ClientString(id = 3820, message = "The key you entered is already used for another function. Click the Apply button to switch the keys.")
	public static SystemMessageId THE_KEY_YOU_ENTERED_IS_ALREADY_USED_FOR_ANOTHER_FUNCTION_CLICK_THE_APPLY_BUTTON_TO_SWITCH_THE_KEYS;
	
	@ClientString(id = 3821, message = "If you want fame and economic development for your clan, select a request from any of the 3 guilds, and start the (font color='#FFDF4C')clan request(/font).(br)(br)But only the clan leader can make a decision.")
	public static SystemMessageId IF_YOU_WANT_FAME_AND_ECONOMIC_DEVELOPMENT_FOR_YOUR_CLAN_SELECT_A_REQUEST_FROM_ANY_OF_THE_3_GUILDS_AND_START_THE_FONT_COLOR_FFDF4C_CLAN_REQUEST_FONT_BR_BR_BUT_ONLY_THE_CLAN_LEADER_CAN_MAKE_A_DECISION;
	
	@ClientString(id = 3822, message = "$s1 has been accepted.")
	public static SystemMessageId S1_HAS_BEEN_ACCEPTED;
	
	@ClientString(id = 3823, message = "Clans are booming with the acquisition of (font color='#FFDF4C')individual request points(/font) earned through private hunts and (font color='#FFDF4C')clan request activities(/font) done with your clanmates.(br)(br)(Redeem individual request points to increase your clan request points. Individual fame goes up with each individual request point you redeem.)")
	public static SystemMessageId CLANS_ARE_BOOMING_WITH_THE_ACQUISITION_OF_FONT_COLOR_FFDF4C_INDIVIDUAL_REQUEST_POINTS_FONT_EARNED_THROUGH_PRIVATE_HUNTS_AND_FONT_COLOR_FFDF4C_CLAN_REQUEST_ACTIVITIES_FONT_DONE_WITH_YOUR_CLANMATES_BR_BR_REDEEM_INDIVIDUAL_REQUEST_POINTS_TO_INCREASE_YOUR_CLAN_REQUEST_POINTS_INDIVIDUAL_FAME_GOES_UP_WITH_EACH_INDIVIDUAL_REQUEST_POINT_YOU_REDEEM;
	
	@ClientString(id = 3824, message = "Redeem individual request points.")
	public static SystemMessageId REDEEM_INDIVIDUAL_REQUEST_POINTS;
	
	@ClientString(id = 3825, message = "Individual request points have been redeemed.")
	public static SystemMessageId INDIVIDUAL_REQUEST_POINTS_HAVE_BEEN_REDEEMED;
	
	@ClientString(id = 3826, message = "Clan requests are categorized into the following difficulty levels. A person can start any request alone but it is hard succeed with fewer people than it is appropriate for specific difficulty levels.(br)(br)Select a clan request to start.(br)(br)7-person request: Party difficulty 1(br)14-person request: Party difficulty 2")
	public static SystemMessageId CLAN_REQUESTS_ARE_CATEGORIZED_INTO_THE_FOLLOWING_DIFFICULTY_LEVELS_A_PERSON_CAN_START_ANY_REQUEST_ALONE_BUT_IT_IS_HARD_SUCCEED_WITH_FEWER_PEOPLE_THAN_IT_IS_APPROPRIATE_FOR_SPECIFIC_DIFFICULTY_LEVELS_BR_BR_SELECT_A_CLAN_REQUEST_TO_START_BR_BR_7_PERSON_REQUEST_PARTY_DIFFICULTY_1_BR_14_PERSON_REQUEST_PARTY_DIFFICULTY_2;
	
	@ClientString(id = 3827, message = "You've received a clan request.")
	public static SystemMessageId YOU_VE_RECEIVED_A_CLAN_REQUEST;
	
	@ClientString(id = 3828, message = "Not enough Adena or fame.")
	public static SystemMessageId NOT_ENOUGH_ADENA_OR_FAME;
	
	@ClientString(id = 3829, message = "Change to .(br)Upon change, clan request points will be reset.")
	public static SystemMessageId CHANGE_TO_BR_UPON_CHANGE_CLAN_REQUEST_POINTS_WILL_BE_RESET;
	
	@ClientString(id = 3830, message = "It has changed to $s1.")
	public static SystemMessageId IT_HAS_CHANGED_TO_S1;
	
	@ClientString(id = 3831, message = "You are giving up on the request.(br)when you give up on it, clan request points will be reset.")
	public static SystemMessageId YOU_ARE_GIVING_UP_ON_THE_REQUEST_BR_WHEN_YOU_GIVE_UP_ON_IT_CLAN_REQUEST_POINTS_WILL_BE_RESET;
	
	@ClientString(id = 3832, message = "You've given up on $s1.")
	public static SystemMessageId YOU_VE_GIVEN_UP_ON_S1;
	
	@ClientString(id = 3833, message = "What is a (font color='#FFDF4C')guild quest(/font)? It's a simple activity you can do before working on a guild request. If you succeed in it, you will get a badge of the guild.(br)(br)Good luck to every guild member.")
	public static SystemMessageId WHAT_IS_A_FONT_COLOR_FFDF4C_GUILD_QUEST_FONT_IT_S_A_SIMPLE_ACTIVITY_YOU_CAN_DO_BEFORE_WORKING_ON_A_GUILD_REQUEST_IF_YOU_SUCCEED_IN_IT_YOU_WILL_GET_A_BADGE_OF_THE_GUILD_BR_BR_GOOD_LUCK_TO_EVERY_GUILD_MEMBER;
	
	@ClientString(id = 3834, message = "$s1 has requested clan member summoning.")
	public static SystemMessageId S1_HAS_REQUESTED_CLAN_MEMBER_SUMMONING;
	
	@ClientString(id = 3835, message = "Summoning $s1…")
	public static SystemMessageId SUMMONING_S1;
	
	@ClientString(id = 3836, message = "Cancelled the summoning of $s1.")
	public static SystemMessageId CANCELLED_THE_SUMMONING_OF_S1;
	
	@ClientString(id = 3837, message = "A clan quest is starting.")
	public static SystemMessageId A_CLAN_QUEST_IS_STARTING;
	
	@ClientString(id = 3838, message = "What is a (font color='#FFDF4C')clan request(/font)? It's a clan activity designed to help a clan become a more solid, powerful organization. With badges of each dwarf guild you've obtained through request activities, you can increase clan level and purchase various rewards.(br)(br)Also, clans of level 5 or higher can obtain Clan Reputation after successfully finishing a clan request.(br)(br)(You can increase clan level through the Grand Master in any village.)")
	public static SystemMessageId WHAT_IS_A_FONT_COLOR_FFDF4C_CLAN_REQUEST_FONT_IT_S_A_CLAN_ACTIVITY_DESIGNED_TO_HELP_A_CLAN_BECOME_A_MORE_SOLID_POWERFUL_ORGANIZATION_WITH_BADGES_OF_EACH_DWARF_GUILD_YOU_VE_OBTAINED_THROUGH_REQUEST_ACTIVITIES_YOU_CAN_INCREASE_CLAN_LEVEL_AND_PURCHASE_VARIOUS_REWARDS_BR_BR_ALSO_CLANS_OF_LEVEL_5_OR_HIGHER_CAN_OBTAIN_CLAN_REPUTATION_AFTER_SUCCESSFULLY_FINISHING_A_CLAN_REQUEST_BR_BR_YOU_CAN_INCREASE_CLAN_LEVEL_THROUGH_THE_GRAND_MASTER_IN_ANY_VILLAGE;
	
	@ClientString(id = 3839, message = "Go to the clan request area.")
	public static SystemMessageId GO_TO_THE_CLAN_REQUEST_AREA;
	
	@ClientString(id = 3840, message = "The trip to the clan request area is starting.")
	public static SystemMessageId THE_TRIP_TO_THE_CLAN_REQUEST_AREA_IS_STARTING;
	
	@ClientString(id = 3841, message = "$s1 has requested clan member summoning.")
	public static SystemMessageId S1_HAS_REQUESTED_CLAN_MEMBER_SUMMONING2;
	
	@ClientString(id = 3842, message = "The summoning of $s1 is starting.")
	public static SystemMessageId THE_SUMMONING_OF_S1_IS_STARTING;
	
	@ClientString(id = 3843, message = "The summoning of $s1 is cancelled.")
	public static SystemMessageId THE_SUMMONING_OF_S1_IS_CANCELLED;
	
	@ClientString(id = 3844, message = "A clan request is starting.")
	public static SystemMessageId A_CLAN_REQUEST_IS_STARTING;
	
	@ClientString(id = 3845, message = "You came out of the clan request area.")
	public static SystemMessageId YOU_CAME_OUT_OF_THE_CLAN_REQUEST_AREA;
	
	@ClientString(id = 3846, message = "You cannot use $s1.")
	public static SystemMessageId YOU_CANNOT_USE_S1;
	
	@ClientString(id = 3847, message = "Use $s1.")
	public static SystemMessageId USE_S12;
	
	@ClientString(id = 3848, message = "$s1 has received Kaliel's Blessing and obtained $s2.")
	public static SystemMessageId S1_HAS_RECEIVED_KALIEL_S_BLESSING_AND_OBTAINED_S2;
	
	@ClientString(id = 3849, message = "You obtained $s1 Kaliel's Token(s).")
	public static SystemMessageId YOU_OBTAINED_S1_KALIEL_S_TOKEN_S;
	
	@ClientString(id = 3850, message = "There is no Kaliel's Token to obtain.")
	public static SystemMessageId THERE_IS_NO_KALIEL_S_TOKEN_TO_OBTAIN;
	
	@ClientString(id = 3851, message = "You've obtained $s1. You can obtain up to 2 of these items a day. You can get more after 06:30 AM every day.")
	public static SystemMessageId YOU_VE_OBTAINED_S1_YOU_CAN_OBTAIN_UP_TO_2_OF_THESE_ITEMS_A_DAY_YOU_CAN_GET_MORE_AFTER_06_30_AM_EVERY_DAY;
	
	@ClientString(id = 3852, message = "Click the Apply button to apply the changes.")
	public static SystemMessageId CLICK_THE_APPLY_BUTTON_TO_APPLY_THE_CHANGES;
	
	@ClientString(id = 3853, message = "You cannot participate in the Ceremony of Chaos as a flying transformed object.")
	public static SystemMessageId YOU_CANNOT_PARTICIPATE_IN_THE_CEREMONY_OF_CHAOS_AS_A_FLYING_TRANSFORMED_OBJECT;
	
	@ClientString(id = 3854, message = "The request has failed.")
	public static SystemMessageId THE_REQUEST_HAS_FAILED;
	
	@ClientString(id = 3855, message = "Only the clan leader can make a request.")
	public static SystemMessageId ONLY_THE_CLAN_LEADER_CAN_MAKE_A_REQUEST;
	
	@ClientString(id = 3856, message = "No request is selected.")
	public static SystemMessageId NO_REQUEST_IS_SELECTED;
	
	@ClientString(id = 3857, message = "Clan work in progress. Please try again later.")
	public static SystemMessageId CLAN_WORK_IN_PROGRESS_PLEASE_TRY_AGAIN_LATER;
	
	@ClientString(id = 3858, message = "You don't belong to any clan.")
	public static SystemMessageId YOU_DON_T_BELONG_TO_ANY_CLAN;
	
	@ClientString(id = 3859, message = "The request change has failed.")
	public static SystemMessageId THE_REQUEST_CHANGE_HAS_FAILED;
	
	@ClientString(id = 3860, message = "Only the clan leader can change requests.")
	public static SystemMessageId ONLY_THE_CLAN_LEADER_CAN_CHANGE_REQUESTS;
	
	@ClientString(id = 3861, message = "The request $s1 is currently selected.")
	public static SystemMessageId THE_REQUEST_S1_IS_CURRENTLY_SELECTED;
	
	@ClientString(id = 3862, message = "Only the clan leader can give up on a request.")
	public static SystemMessageId ONLY_THE_CLAN_LEADER_CAN_GIVE_UP_ON_A_REQUEST;
	
	@ClientString(id = 3863, message = "The request failed.")
	public static SystemMessageId THE_REQUEST_FAILED;
	
	@ClientString(id = 3864, message = "Academy clan members cannot start a request.")
	public static SystemMessageId ACADEMY_CLAN_MEMBERS_CANNOT_START_A_REQUEST;
	
	@ClientString(id = 3865, message = "You've exceeded the maximum number of requests you can make a day.")
	public static SystemMessageId YOU_VE_EXCEEDED_THE_MAXIMUM_NUMBER_OF_REQUESTS_YOU_CAN_MAKE_A_DAY;
	
	@ClientString(id = 3866, message = "You cannot start a request because you don't have enough points.")
	public static SystemMessageId YOU_CANNOT_START_A_REQUEST_BECAUSE_YOU_DON_T_HAVE_ENOUGH_POINTS;
	
	@ClientString(id = 3867, message = "Redeeming has failed.")
	public static SystemMessageId REDEEMING_HAS_FAILED;
	
	@ClientString(id = 3868, message = "The goal number of request points has been reached or no more redeeming is allowed today.")
	public static SystemMessageId THE_GOAL_NUMBER_OF_REQUEST_POINTS_HAS_BEEN_REACHED_OR_NO_MORE_REDEEMING_IS_ALLOWED_TODAY;
	
	@ClientString(id = 3869, message = "You are not a Quest Manager.")
	public static SystemMessageId YOU_ARE_NOT_A_QUEST_MANAGER;
	
	@ClientString(id = 3870, message = "You are not a Request Manager.")
	public static SystemMessageId YOU_ARE_NOT_A_REQUEST_MANAGER;
	
	@ClientString(id = 3871, message = "Your clan is not signed up for request activities.")
	public static SystemMessageId YOUR_CLAN_IS_NOT_SIGNED_UP_FOR_REQUEST_ACTIVITIES;
	
	@ClientString(id = 3872, message = "Another request is in progress.")
	public static SystemMessageId ANOTHER_REQUEST_IS_IN_PROGRESS;
	
	@ClientString(id = 3873, message = "The item $s2 owned by $s1's pet is destroyed.")
	public static SystemMessageId THE_ITEM_S2_OWNED_BY_S1_S_PET_IS_DESTROYED;
	
	@ClientString(id = 3874, message = "The item +$s2$s3 owned by $s1's pet is destroyed.")
	public static SystemMessageId THE_ITEM_S2_S3_OWNED_BY_S1_S_PET_IS_DESTROYED;
	
	@ClientString(id = 3875, message = "$s2$s3 owned by $s1's pet is destroyed.")
	public static SystemMessageId S2_S3_OWNED_BY_S1_S_PET_IS_DESTROYED;
	
	@ClientString(id = 3876, message = "Because $s1 died, the item $s2 is destroyed.")
	public static SystemMessageId BECAUSE_S1_DIED_THE_ITEM_S2_IS_DESTROYED;
	
	@ClientString(id = 3877, message = "You failed to give up on the request.")
	public static SystemMessageId YOU_FAILED_TO_GIVE_UP_ON_THE_REQUEST;
	
	@ClientString(id = 3878, message = "$s1 has accepted the request.")
	public static SystemMessageId S1_HAS_ACCEPTED_THE_REQUEST;
	
	@ClientString(id = 3879, message = "The number of clan request points has increased to $s1.")
	public static SystemMessageId THE_NUMBER_OF_CLAN_REQUEST_POINTS_HAS_INCREASED_TO_S1;
	
	@ClientString(id = 3880, message = "A clan request/quest is in progress. Please try again later.")
	public static SystemMessageId A_CLAN_REQUEST_QUEST_IS_IN_PROGRESS_PLEASE_TRY_AGAIN_LATER;
	
	@ClientString(id = 3881, message = "You cannot redeem it because you don't have  points.")
	public static SystemMessageId YOU_CANNOT_REDEEM_IT_BECAUSE_YOU_DON_T_HAVE_POINTS;
	
	@ClientString(id = 3882, message = "Because $s1 died, $s2 $s3 is destroyed.")
	public static SystemMessageId BECAUSE_S1_DIED_S2_S3_IS_DESTROYED;
	
	@ClientString(id = 3883, message = "If you cancel a declared war, you will lose 5,000 Clan Reputation. Proceed?")
	public static SystemMessageId IF_YOU_CANCEL_A_DECLARED_WAR_YOU_WILL_LOSE_5_000_CLAN_REPUTATION_PROCEED;
	
	@ClientString(id = 3884, message = "Can be used only when HP is less than 100%.")
	public static SystemMessageId CAN_BE_USED_ONLY_WHEN_HP_IS_LESS_THAN_1002;
	
	@ClientString(id = 3885, message = "Can be used only when MP is less than 100%.")
	public static SystemMessageId CAN_BE_USED_ONLY_WHEN_MP_IS_LESS_THAN_1002;
	
	@ClientString(id = 3886, message = "Can be used only when CP is less than 100%.")
	public static SystemMessageId CAN_BE_USED_ONLY_WHEN_CP_IS_LESS_THAN_1002;
	
	@ClientString(id = 3887, message = "Waiting for the event Kaliel's Blessing to start. Until the event starts, you cannot use the item 'Kaliel's Wish'.")
	public static SystemMessageId WAITING_FOR_THE_EVENT_KALIEL_S_BLESSING_TO_START_UNTIL_THE_EVENT_STARTS_YOU_CANNOT_USE_THE_ITEM_KALIEL_S_WISH;
	
	@ClientString(id = 3888, message = "The event Kaliel's Blessing is in progress.")
	public static SystemMessageId THE_EVENT_KALIEL_S_BLESSING_IS_IN_PROGRESS;
	
	@ClientString(id = 3889, message = "The event Kaliel's Blessing has started. For 1 hour from now, all characters of level 40 or higher who have done the 2nd class transfer will be automatically joined in the event. During this time, you cannot use the item 'Kaliel's Wish'.")
	public static SystemMessageId THE_EVENT_KALIEL_S_BLESSING_HAS_STARTED_FOR_1_HOUR_FROM_NOW_ALL_CHARACTERS_OF_LEVEL_40_OR_HIGHER_WHO_HAVE_DONE_THE_2ND_CLASS_TRANSFER_WILL_BE_AUTOMATICALLY_JOINED_IN_THE_EVENT_DURING_THIS_TIME_YOU_CANNOT_USE_THE_ITEM_KALIEL_S_WISH;
	
	@ClientString(id = 3890, message = "Except the vitality buff, all buffs including Art of Seduction will be deleted.")
	public static SystemMessageId EXCEPT_THE_VITALITY_BUFF_ALL_BUFFS_INCLUDING_ART_OF_SEDUCTION_WILL_BE_DELETED;
	
	@ClientString(id = 3891, message = "You've obtained individual request points ($s1/100).")
	public static SystemMessageId YOU_VE_OBTAINED_INDIVIDUAL_REQUEST_POINTS_S1_100;
	
	@ClientString(id = 3892, message = "You are currently not participating in any event. Use a 'Kaliel's Wish' to join an event.(br)You can get 'Kaliel's Wishes' through Event NPC Jolie. You can also get up to two of them a day from hunting.")
	public static SystemMessageId YOU_ARE_CURRENTLY_NOT_PARTICIPATING_IN_ANY_EVENT_USE_A_KALIEL_S_WISH_TO_JOIN_AN_EVENT_BR_YOU_CAN_GET_KALIEL_S_WISHES_THROUGH_EVENT_NPC_JOLIE_YOU_CAN_ALSO_GET_UP_TO_TWO_OF_THEM_A_DAY_FROM_HUNTING;
	
	@ClientString(id = 3893, message = "You cannot receive the item $s1 because you've exceeded the limit on the quantity and weight of the inventory.")
	public static SystemMessageId YOU_CANNOT_RECEIVE_THE_ITEM_S1_BECAUSE_YOU_VE_EXCEEDED_THE_LIMIT_ON_THE_QUANTITY_AND_WEIGHT_OF_THE_INVENTORY;
	
	@ClientString(id = 3894, message = "Level $s1 of the event Kaliel's Blessing is $s2%% completed.(br)(You will be automatically joined in the event for 1 hour, 30 minutes after the server opens.)")
	public static SystemMessageId LEVEL_S1_OF_THE_EVENT_KALIEL_S_BLESSING_IS_S2_COMPLETED_BR_YOU_WILL_BE_AUTOMATICALLY_JOINED_IN_THE_EVENT_FOR_1_HOUR_30_MINUTES_AFTER_THE_SERVER_OPENS;
	
	@ClientString(id = 3895, message = "You cannot go because the maximum number of participants in the clan request has been exceeded.")
	public static SystemMessageId YOU_CANNOT_GO_BECAUSE_THE_MAXIMUM_NUMBER_OF_PARTICIPANTS_IN_THE_CLAN_REQUEST_HAS_BEEN_EXCEEDED;
	
	@ClientString(id = 3896, message = "There's a new clan request! Get it from the Clan Request Manager.")
	public static SystemMessageId THERE_S_A_NEW_CLAN_REQUEST_GET_IT_FROM_THE_CLAN_REQUEST_MANAGER;
	
	@ClientString(id = 3897, message = "You will be automatically joined in the event for 1 hour, 30 minutes after the server opens. So you cannot use the item Kaliel's Wish.")
	public static SystemMessageId YOU_WILL_BE_AUTOMATICALLY_JOINED_IN_THE_EVENT_FOR_1_HOUR_30_MINUTES_AFTER_THE_SERVER_OPENS_SO_YOU_CANNOT_USE_THE_ITEM_KALIEL_S_WISH;
	
	@ClientString(id = 3898, message = "You cannot use the item because the effect is already applied.")
	public static SystemMessageId YOU_CANNOT_USE_THE_ITEM_BECAUSE_THE_EFFECT_IS_ALREADY_APPLIED;
	
	@ClientString(id = 3899, message = "You can purchase rewards through the Clan Request Manager.")
	public static SystemMessageId YOU_CAN_PURCHASE_REWARDS_THROUGH_THE_CLAN_REQUEST_MANAGER;
	
	@ClientString(id = 3900, message = "Change Rank.")
	public static SystemMessageId CHANGE_RANK;
	
	@ClientString(id = 3901, message = "Current location: Last Imperial Tomb")
	public static SystemMessageId CURRENT_LOCATION_LAST_IMPERIAL_TOMB;
	
	@ClientString(id = 3902, message = "Currently, you are restricted from adding a mentee.")
	public static SystemMessageId CURRENTLY_YOU_ARE_RESTRICTED_FROM_ADDING_A_MENTEE;
	
	@ClientString(id = 3903, message = "Adjust cloak display. Using this function could lower your computer performance.")
	public static SystemMessageId ADJUST_CLOAK_DISPLAY_USING_THIS_FUNCTION_COULD_LOWER_YOUR_COMPUTER_PERFORMANCE;
	
	@ClientString(id = 3904, message = "$c1 has left the command channel.")
	public static SystemMessageId C1_HAS_LEFT_THE_COMMAND_CHANNEL;
	
	@ClientString(id = 3905, message = "The +$s1 augmentation on $s2 is deleted and dropped by +$s3$s4.")
	public static SystemMessageId THE_S1_AUGMENTATION_ON_S2_IS_DELETED_AND_DROPPED_BY_S3_S4;
	
	@ClientString(id = 3906, message = "The augmentation on $s1 is deleted and dropped by $s2.")
	public static SystemMessageId THE_AUGMENTATION_ON_S1_IS_DELETED_AND_DROPPED_BY_S2;
	
	@ClientString(id = 3907, message = "$s1 can no longer be a mentee.")
	public static SystemMessageId S1_CAN_NO_LONGER_BE_A_MENTEE;
	
	@ClientString(id = 4001, message = "You can change your character's hair style.")
	public static SystemMessageId YOU_CAN_CHANGE_YOUR_CHARACTER_S_HAIR_STYLE;
	
	@ClientString(id = 4002, message = "You can change your character's face.")
	public static SystemMessageId YOU_CAN_CHANGE_YOUR_CHARACTER_S_FACE;
	
	@ClientString(id = 4003, message = "The style selected will be reset.")
	public static SystemMessageId THE_STYLE_SELECTED_WILL_BE_RESET;
	
	@ClientString(id = 4004, message = "The style change was successful.")
	public static SystemMessageId THE_STYLE_CHANGE_WAS_SUCCESSFUL;
	
	@ClientString(id = 4005, message = "The style change was not successful.")
	public static SystemMessageId THE_STYLE_CHANGE_WAS_NOT_SUCCESSFUL;
	
	@ClientString(id = 4006, message = "The style selected does not exist.")
	public static SystemMessageId THE_STYLE_SELECTED_DOES_NOT_EXIST;
	
	@ClientString(id = 4007, message = "The style change was not successful.")
	public static SystemMessageId THE_STYLE_CHANGE_WAS_NOT_SUCCESSFUL2;
	
	@ClientString(id = 4008, message = "Changed to selectd style.")
	public static SystemMessageId CHANGED_TO_SELECTD_STYLE;
	
	@ClientString(id = 4009, message = "Failed to purchase due to insufficient Adena.")
	public static SystemMessageId FAILED_TO_PURCHASE_DUE_TO_INSUFFICIENT_ADENA;
	
	@ClientString(id = 4010, message = "Item to be traded does not exist.")
	public static SystemMessageId ITEM_TO_BE_TRADED_DOES_NOT_EXIST;
	
	@ClientString(id = 4011, message = "This item has been sold out.")
	public static SystemMessageId THIS_ITEM_HAS_BEEN_SOLD_OUT;
	
	@ClientString(id = 4012, message = "Please try again after completing your current task.")
	public static SystemMessageId PLEASE_TRY_AGAIN_AFTER_COMPLETING_YOUR_CURRENT_TASK;
	
	@ClientString(id = 4013, message = "Before using the Beauty Shop")
	public static SystemMessageId BEFORE_USING_THE_BEAUTY_SHOP;
	
	@ClientString(id = 4014, message = "Current appearance")
	public static SystemMessageId CURRENT_APPEARANCE;
	
	@ClientString(id = 4015, message = "Restoring the appearance to before using the Beauty Shop")
	public static SystemMessageId RESTORING_THE_APPEARANCE_TO_BEFORE_USING_THE_BEAUTY_SHOP;
	
	@ClientString(id = 4016, message = "(BROWN01) The previously purchased style can be equipped again at the Beauty Shop.(br)Do you wish to restore?(/BROWN01)")
	public static SystemMessageId BROWN01_THE_PREVIOUSLY_PURCHASED_STYLE_CAN_BE_EQUIPPED_AGAIN_AT_THE_BEAUTY_SHOP_BR_DO_YOU_WISH_TO_RESTORE_BROWN01;
	
	@ClientString(id = 4017, message = "Restoration to previous appearance complete.")
	public static SystemMessageId RESTORATION_TO_PREVIOUS_APPEARANCE_COMPLETE;
	
	@ClientString(id = 4018, message = "Failed to restore appearance to previous style.")
	public static SystemMessageId FAILED_TO_RESTORE_APPEARANCE_TO_PREVIOUS_STYLE;
	
	@ClientString(id = 4019, message = "Leaving Beauty Shop.")
	public static SystemMessageId LEAVING_BEAUTY_SHOP;
	
	@ClientString(id = 4020, message = "(BROWN01)Hair style would make the equipped (/BROWN01)(br)(RED02)hair accessory(/RED02)(BROWN01) invisible.(br)Proceed with purchase?(/BROWN01)")
	public static SystemMessageId BROWN01_HAIR_STYLE_WOULD_MAKE_THE_EQUIPPED_BROWN01_BR_RED02_HAIR_ACCESSORY_RED02_BROWN01_INVISIBLE_BR_PROCEED_WITH_PURCHASE_BROWN01;
	
	@ClientString(id = 4021, message = "There is no style to be changed.")
	public static SystemMessageId THERE_IS_NO_STYLE_TO_BE_CHANGED;
	
	@ClientString(id = 4022, message = "Restoring appearance…")
	public static SystemMessageId RESTORING_APPEARANCE;
	
	@ClientString(id = 4023, message = "Failed to restore the appearance due to insufficient Adena.")
	public static SystemMessageId FAILED_TO_RESTORE_THE_APPEARANCE_DUE_TO_INSUFFICIENT_ADENA;
	
	@ClientString(id = 4024, message = "Requesting purchase…")
	public static SystemMessageId REQUESTING_PURCHASE;
	
	@ClientString(id = 4025, message = "No style to restore.")
	public static SystemMessageId NO_STYLE_TO_RESTORE;
	
	@ClientString(id = 4026, message = "Finishing appearance restoration.")
	public static SystemMessageId FINISHING_APPEARANCE_RESTORATION;
	
	@ClientString(id = 4027, message = "You have already purchased this style.")
	public static SystemMessageId YOU_HAVE_ALREADY_PURCHASED_THIS_STYLE;
	
	@ClientString(id = 4028, message = "$c1 has leveled up and obtained $s2 Clan Reputation.")
	public static SystemMessageId C1_HAS_LEVELED_UP_AND_OBTAINED_S2_CLAN_REPUTATION;
	
	@ClientString(id = 4029, message = "Crafting Critical!")
	public static SystemMessageId CRAFTING_CRITICAL;
	
	@ClientString(id = 4030, message = "The selected target cannot be resurrected due to Clan Resurrection Lock.")
	public static SystemMessageId THE_SELECTED_TARGET_CANNOT_BE_RESURRECTED_DUE_TO_CLAN_RESURRECTION_LOCK;
	
	@ClientString(id = 4031, message = "Only the clan leader or someone with rank management authority may register the clan.")
	public static SystemMessageId ONLY_THE_CLAN_LEADER_OR_SOMEONE_WITH_RANK_MANAGEMENT_AUTHORITY_MAY_REGISTER_THE_CLAN;
	
	@ClientString(id = 4032, message = "You may register the clan after $s1 minute(s) due to deleting the entered text.")
	public static SystemMessageId YOU_MAY_REGISTER_THE_CLAN_AFTER_S1_MINUTE_S_DUE_TO_DELETING_THE_ENTERED_TEXT;
	
	@ClientString(id = 4033, message = "You can view the list of characters who have applied to the clan. Those without a clan can be entered on the waiting list.")
	public static SystemMessageId YOU_CAN_VIEW_THE_LIST_OF_CHARACTERS_WHO_HAVE_APPLIED_TO_THE_CLAN_THOSE_WITHOUT_A_CLAN_CAN_BE_ENTERED_ON_THE_WAITING_LIST;
	
	@ClientString(id = 4034, message = "You can edit the clan information, but deleting text results in a 5-minute penalty.")
	public static SystemMessageId YOU_CAN_EDIT_THE_CLAN_INFORMATION_BUT_DELETING_TEXT_RESULTS_IN_A_5_MINUTE_PENALTY;
	
	@ClientString(id = 4035, message = "Only the clan leader or someone with rank management authority may change clan information.")
	public static SystemMessageId ONLY_THE_CLAN_LEADER_OR_SOMEONE_WITH_RANK_MANAGEMENT_AUTHORITY_MAY_CHANGE_CLAN_INFORMATION;
	
	@ClientString(id = 4036, message = "Cancelling entry applications results in a 5-minute penalty.")
	public static SystemMessageId CANCELLING_ENTRY_APPLICATIONS_RESULTS_IN_A_5_MINUTE_PENALTY;
	
	@ClientString(id = 4037, message = "Entered into list. Entries are in order of Clan Reputation, recalculated every day at 6:30 am.  You can edit the text, but if you delete the text, you cannot enter clan information for 5 minutes. Entered text will be automatically deleted after 30 days.")
	public static SystemMessageId ENTERED_INTO_LIST_ENTRIES_ARE_IN_ORDER_OF_CLAN_REPUTATION_RECALCULATED_EVERY_DAY_AT_6_30_AM_YOU_CAN_EDIT_THE_TEXT_BUT_IF_YOU_DELETE_THE_TEXT_YOU_CANNOT_ENTER_CLAN_INFORMATION_FOR_5_MINUTES_ENTERED_TEXT_WILL_BE_AUTOMATICALLY_DELETED_AFTER_30_DAYS;
	
	@ClientString(id = 4038, message = "You may apply for entry after $s1 minute(s) due to cancelling your application.")
	public static SystemMessageId YOU_MAY_APPLY_FOR_ENTRY_AFTER_S1_MINUTE_S_DUE_TO_CANCELLING_YOUR_APPLICATION;
	
	@ClientString(id = 4039, message = "Entry application complete. Use 'Entry Application Info' to check or cancel your application. Application is automatically cancelled after 30 days; if you cancel application, you cannot apply again for 5 minutes.")
	public static SystemMessageId ENTRY_APPLICATION_COMPLETE_USE_ENTRY_APPLICATION_INFO_TO_CHECK_OR_CANCEL_YOUR_APPLICATION_APPLICATION_IS_AUTOMATICALLY_CANCELLED_AFTER_30_DAYS_IF_YOU_CANCEL_APPLICATION_YOU_CANNOT_APPLY_AGAIN_FOR_5_MINUTES;
	
	@ClientString(id = 4040, message = "Entry application cancelled. You may apply to a new clan after 5 minutes.")
	public static SystemMessageId ENTRY_APPLICATION_CANCELLED_YOU_MAY_APPLY_TO_A_NEW_CLAN_AFTER_5_MINUTES;
	
	@ClientString(id = 4041, message = "The clan you selected is no longer taking applications as it has too many applicants.")
	public static SystemMessageId THE_CLAN_YOU_SELECTED_IS_NO_LONGER_TAKING_APPLICATIONS_AS_IT_HAS_TOO_MANY_APPLICANTS;
	
	@ClientString(id = 4042, message = "$s1's clan entry application has been rejected.")
	public static SystemMessageId S1_S_CLAN_ENTRY_APPLICATION_HAS_BEEN_REJECTED;
	
	@ClientString(id = 4043, message = "Entered into waiting list. Name is automatically deleted after 30 days. If 'Delete from waiting list' is used, you cannot enter names into the waiting list for 5 minutes.")
	public static SystemMessageId ENTERED_INTO_WAITING_LIST_NAME_IS_AUTOMATICALLY_DELETED_AFTER_30_DAYS_IF_DELETE_FROM_WAITING_LIST_IS_USED_YOU_CANNOT_ENTER_NAMES_INTO_THE_WAITING_LIST_FOR_5_MINUTES;
	
	@ClientString(id = 4044, message = "You may enter names into the waiting list after $s1 minute(s) due to deleting from the waiting list.")
	public static SystemMessageId YOU_MAY_ENTER_NAMES_INTO_THE_WAITING_LIST_AFTER_S1_MINUTE_S_DUE_TO_DELETING_FROM_THE_WAITING_LIST;
	
	@ClientString(id = 4045, message = "Turning on Optimization Uniform function. Please wait 3 seconds to turn it off.")
	public static SystemMessageId TURNING_ON_OPTIMIZATION_UNIFORM_FUNCTION_PLEASE_WAIT_3_SECONDS_TO_TURN_IT_OFF;
	
	@ClientString(id = 4046, message = "Turning off Optimization Uniform function. Please wait 3 seconds to turn it on.")
	public static SystemMessageId TURNING_OFF_OPTIMIZATION_UNIFORM_FUNCTION_PLEASE_WAIT_3_SECONDS_TO_TURN_IT_ON;
	
	@ClientString(id = 4047, message = "You cannot use this function after a dimensional teleport.")
	public static SystemMessageId YOU_CANNOT_USE_THIS_FUNCTION_AFTER_A_DIMENSIONAL_TELEPORT;
	
	@ClientString(id = 4048, message = "Free players cannot purchase through the private store.")
	public static SystemMessageId FREE_PLAYERS_CANNOT_PURCHASE_THROUGH_THE_PRIVATE_STORE;
	
	@ClientString(id = 4049, message = "Free players cannot sell through the auction house.")
	public static SystemMessageId FREE_PLAYERS_CANNOT_SELL_THROUGH_THE_AUCTION_HOUSE;
	
	@ClientString(id = 4050, message = "Free players cannot use Sell chat.")
	public static SystemMessageId FREE_PLAYERS_CANNOT_USE_SELL_CHAT;
	
	@ClientString(id = 4051, message = "Free players cannot Shout.")
	public static SystemMessageId FREE_PLAYERS_CANNOT_SHOUT;
	
	@ClientString(id = 4052, message = "Free players can respond to a whisper, but cannot initiate a whisper.")
	public static SystemMessageId FREE_PLAYERS_CAN_RESPOND_TO_A_WHISPER_BUT_CANNOT_INITIATE_A_WHISPER;
	
	@ClientString(id = 4053, message = "Free players can create up to 2 characters. Please delete a character if you wish to make a create a new one.")
	public static SystemMessageId FREE_PLAYERS_CAN_CREATE_UP_TO_2_CHARACTERS_PLEASE_DELETE_A_CHARACTER_IF_YOU_WISH_TO_MAKE_A_CREATE_A_NEW_ONE;
	
	@ClientString(id = 4054, message = "You can send mail $s1 time for the rest of today.")
	public static SystemMessageId YOU_CAN_SEND_MAIL_S1_TIME_FOR_THE_REST_OF_TODAY;
	
	@ClientString(id = 4055, message = "You have used up the mail allowance for the day. The mail allowance resets every day at 6:30am.")
	public static SystemMessageId YOU_HAVE_USED_UP_THE_MAIL_ALLOWANCE_FOR_THE_DAY_THE_MAIL_ALLOWANCE_RESETS_EVERY_DAY_AT_6_30AM;
	
	@ClientString(id = 4056, message = "Free players cannot attach items or Adena onto mail.")
	public static SystemMessageId FREE_PLAYERS_CANNOT_ATTACH_ITEMS_OR_ADENA_ONTO_MAIL;
	
	@ClientString(id = 4057, message = "Free players cannot create a clan.")
	public static SystemMessageId FREE_PLAYERS_CANNOT_CREATE_A_CLAN;
	
	@ClientString(id = 4058, message = "You cannot declare war if your clan leader is a free player.")
	public static SystemMessageId YOU_CANNOT_DECLARE_WAR_IF_YOUR_CLAN_LEADER_IS_A_FREE_PLAYER;
	
	@ClientString(id = 4059, message = "You cannot use the clan warehouse if your clan leader is a free player.")
	public static SystemMessageId YOU_CANNOT_USE_THE_CLAN_WAREHOUSE_IF_YOUR_CLAN_LEADER_IS_A_FREE_PLAYER;
	
	@ClientString(id = 4060, message = "You cannot participate in a clan hall war if your clan leader is a free player.")
	public static SystemMessageId YOU_CANNOT_PARTICIPATE_IN_A_CLAN_HALL_WAR_IF_YOUR_CLAN_LEADER_IS_A_FREE_PLAYER;
	
	@ClientString(id = 4061, message = "You cannot own a clan hall if your clan leader is a free player.")
	public static SystemMessageId YOU_CANNOT_OWN_A_CLAN_HALL_IF_YOUR_CLAN_LEADER_IS_A_FREE_PLAYER;
	
	@ClientString(id = 4062, message = "You cannot bid for a clan hall if your clan leader is a free player.")
	public static SystemMessageId YOU_CANNOT_BID_FOR_A_CLAN_HALL_IF_YOUR_CLAN_LEADER_IS_A_FREE_PLAYER;
	
	@ClientString(id = 4063, message = "You cannot participate in a fortress siege if your clan leader is a free player.")
	public static SystemMessageId YOU_CANNOT_PARTICIPATE_IN_A_FORTRESS_SIEGE_IF_YOUR_CLAN_LEADER_IS_A_FREE_PLAYER;
	
	@ClientString(id = 4064, message = "You cannot create an alliance if your clan leader is a free player.")
	public static SystemMessageId YOU_CANNOT_CREATE_AN_ALLIANCE_IF_YOUR_CLAN_LEADER_IS_A_FREE_PLAYER;
	
	@ClientString(id = 4065, message = "You cannot leave an alliance if your clan leader is a free player.")
	public static SystemMessageId YOU_CANNOT_LEAVE_AN_ALLIANCE_IF_YOUR_CLAN_LEADER_IS_A_FREE_PLAYER;
	
	@ClientString(id = 4066, message = "You cannot participate in a castle siege if your clan leader is a free player.")
	public static SystemMessageId YOU_CANNOT_PARTICIPATE_IN_A_CASTLE_SIEGE_IF_YOUR_CLAN_LEADER_IS_A_FREE_PLAYER;
	
	@ClientString(id = 4067, message = "You cannot create an Academy if your clan leader is a free player.")
	public static SystemMessageId YOU_CANNOT_CREATE_AN_ACADEMY_IF_YOUR_CLAN_LEADER_IS_A_FREE_PLAYER;
	
	@ClientString(id = 4068, message = "You cannot purchase clan items if your clan leader is a free player.")
	public static SystemMessageId YOU_CANNOT_PURCHASE_CLAN_ITEMS_IF_YOUR_CLAN_LEADER_IS_A_FREE_PLAYER;
	
	@ClientString(id = 4069, message = "You have downed $s1 with a preemptive attack. You have $s2 preemptive attack chances left.")
	public static SystemMessageId YOU_HAVE_DOWNED_S1_WITH_A_PREEMPTIVE_ATTACK_YOU_HAVE_S2_PREEMPTIVE_ATTACK_CHANCES_LEFT;
	
	@ClientString(id = 4070, message = "You are no longer $s1's mentee, as you have reached Lv. 85 and 3rd Liberation.")
	public static SystemMessageId YOU_ARE_NO_LONGER_S1_S_MENTEE_AS_YOU_HAVE_REACHED_LV_85_AND_3RD_LIBERATION;
	
	@ClientString(id = 4071, message = "You are no longer $s1's mentor, as they completed the 3rd Liberation. You must wait 1 day before becoming someone else's mentor.")
	public static SystemMessageId YOU_ARE_NO_LONGER_S1_S_MENTOR_AS_THEY_COMPLETED_THE_3RD_LIBERATION_YOU_MUST_WAIT_1_DAY_BEFORE_BECOMING_SOMEONE_ELSE_S_MENTOR;
	
	@ClientString(id = 4072, message = "$s1 can no longer preemptively attack another player (except players whose names are in purple or are in Chaotic state).")
	public static SystemMessageId S1_CAN_NO_LONGER_PREEMPTIVELY_ATTACK_ANOTHER_PLAYER_EXCEPT_PLAYERS_WHOSE_NAMES_ARE_IN_PURPLE_OR_ARE_IN_CHAOTIC_STATE;
	
	@ClientString(id = 4073, message = "Please select a character you can use for free.")
	public static SystemMessageId PLEASE_SELECT_A_CHARACTER_YOU_CAN_USE_FOR_FREE;
	
	@ClientString(id = 4074, message = "$s1 is a free player. A free player will have limited access to rights as clan leader. Will you transfer clan leadership to $s2?")
	public static SystemMessageId S1_IS_A_FREE_PLAYER_A_FREE_PLAYER_WILL_HAVE_LIMITED_ACCESS_TO_RIGHTS_AS_CLAN_LEADER_WILL_YOU_TRANSFER_CLAN_LEADERSHIP_TO_S2;
	
	@ClientString(id = 4075, message = "Deleting a character will give free benefits to another character in the server. Please check for items you own, as items you have purchased will be deleted. Would you like to delete $s1?")
	public static SystemMessageId DELETING_A_CHARACTER_WILL_GIVE_FREE_BENEFITS_TO_ANOTHER_CHARACTER_IN_THE_SERVER_PLEASE_CHECK_FOR_ITEMS_YOU_OWN_AS_ITEMS_YOU_HAVE_PURCHASED_WILL_BE_DELETED_WOULD_YOU_LIKE_TO_DELETE_S1;
	
	@ClientString(id = 4076, message = "Please check for items you own, as items you have purchased will be deleted. Are you sure you want to delete $s1?")
	public static SystemMessageId PLEASE_CHECK_FOR_ITEMS_YOU_OWN_AS_ITEMS_YOU_HAVE_PURCHASED_WILL_BE_DELETED_ARE_YOU_SURE_YOU_WANT_TO_DELETE_S1;
	
	@ClientString(id = 4077, message = "Congratulations! $s1 has reached Lv. 85. Will you now go on to unearth more exciting mysteries in the world of Aden?")
	public static SystemMessageId CONGRATULATIONS_S1_HAS_REACHED_LV_85_WILL_YOU_NOW_GO_ON_TO_UNEARTH_MORE_EXCITING_MYSTERIES_IN_THE_WORLD_OF_ADEN;
	
	@ClientString(id = 4078, message = "Congratulations! $s1 has reached Lv. 85. Further mysteries of Aden will be revealed to you in $s2 second(s).")
	public static SystemMessageId CONGRATULATIONS_S1_HAS_REACHED_LV_85_FURTHER_MYSTERIES_OF_ADEN_WILL_BE_REVEALED_TO_YOU_IN_S2_SECOND_S;
	
	@ClientString(id = 4079, message = "You cannot play a disabled character. Please select an enabled character.")
	public static SystemMessageId YOU_CANNOT_PLAY_A_DISABLED_CHARACTER_PLEASE_SELECT_AN_ENABLED_CHARACTER;
	
	@ClientString(id = 4080, message = "We hope you enjoyed your free trial of Lineage II. With a play pass, you can go beyond Lv. 85  to explore an even more exciting and expansive world in Aden.")
	public static SystemMessageId WE_HOPE_YOU_ENJOYED_YOUR_FREE_TRIAL_OF_LINEAGE_II_WITH_A_PLAY_PASS_YOU_CAN_GO_BEYOND_LV_85_TO_EXPLORE_AN_EVEN_MORE_EXCITING_AND_EXPANSIVE_WORLD_IN_ADEN;
	
	@ClientString(id = 4081, message = "You can run a maximum of 3 clients on the same PC.")
	public static SystemMessageId YOU_CAN_RUN_A_MAXIMUM_OF_3_CLIENTS_ON_THE_SAME_PC;
	
	@ClientString(id = 4082, message = "(font color='#FFDF4C')Path to Awakening(/font)(br)If you are a new player, you can earn free rewards as you level up by visiting the following website: http://truly-free.lineage2.com/path. Log in with your Lineage II account and claim the rewards when you reach each milestone. Don't miss out!")
	public static SystemMessageId FONT_COLOR_FFDF4C_PATH_TO_AWAKENING_FONT_BR_IF_YOU_ARE_A_NEW_PLAYER_YOU_CAN_EARN_FREE_REWARDS_AS_YOU_LEVEL_UP_BY_VISITING_THE_FOLLOWING_WEBSITE_HTTP_TRULY_FREE_LINEAGE2_COM_PATH_LOG_IN_WITH_YOUR_LINEAGE_II_ACCOUNT_AND_CLAIM_THE_REWARDS_WHEN_YOU_REACH_EACH_MILESTONE_DON_T_MISS_OUT;
	
	@ClientString(id = 4083, message = "Welcome to Lineage II!(br)Please select a character you can use for free, or purchase a Lineage II play pass.")
	public static SystemMessageId WELCOME_TO_LINEAGE_II_BR_PLEASE_SELECT_A_CHARACTER_YOU_CAN_USE_FOR_FREE_OR_PURCHASE_A_LINEAGE_II_PLAY_PASS;
	
	@ClientString(id = 4084, message = "You cannot use the selected character.(br)Please select a character you can use for free, or purchase a Lineage II play pass.")
	public static SystemMessageId YOU_CANNOT_USE_THE_SELECTED_CHARACTER_BR_PLEASE_SELECT_A_CHARACTER_YOU_CAN_USE_FOR_FREE_OR_PURCHASE_A_LINEAGE_II_PLAY_PASS;
	
	@ClientString(id = 4085, message = "You cannot use the $s1 skill due to insufficient summon points.")
	public static SystemMessageId YOU_CANNOT_USE_THE_S1_SKILL_DUE_TO_INSUFFICIENT_SUMMON_POINTS;
	
	@ClientString(id = 4086, message = "Clan introduction will be deleted 30 days after draft, which is $s1/$s2/$s3 at 6:30 am.")
	public static SystemMessageId CLAN_INTRODUCTION_WILL_BE_DELETED_30_DAYS_AFTER_DRAFT_WHICH_IS_S1_S2_S3_AT_6_30_AM;
	
	@ClientString(id = 4087, message = "Clan Entry Application: Deleted 30 days after application, which is $s1/$s2/$s3 at 6:30 am.")
	public static SystemMessageId CLAN_ENTRY_APPLICATION_DELETED_30_DAYS_AFTER_APPLICATION_WHICH_IS_S1_S2_S3_AT_6_30_AM;
	
	@ClientString(id = 4088, message = "Waiting List: Deleted 30 days after application, which is $s1/$s2/$s3 at 6:30 am.")
	public static SystemMessageId WAITING_LIST_DELETED_30_DAYS_AFTER_APPLICATION_WHICH_IS_S1_S2_S3_AT_6_30_AM;
	
	@ClientString(id = 4089, message = "Welcome to Lineage II.(br)You create up to 2 characters within a server and level them up to 85 for free. The free service will end for the server when you reach Lv. 85; please use a Lineage II play pass if you wish to continue playing afterwards.(br)(br)Free play requirements(br)1: Character Level(br)2: Character XP(br)3: Character Creation Date (chronological order)")
	public static SystemMessageId WELCOME_TO_LINEAGE_II_BR_YOU_CREATE_UP_TO_2_CHARACTERS_WITHIN_A_SERVER_AND_LEVEL_THEM_UP_TO_85_FOR_FREE_THE_FREE_SERVICE_WILL_END_FOR_THE_SERVER_WHEN_YOU_REACH_LV_85_PLEASE_USE_A_LINEAGE_II_PLAY_PASS_IF_YOU_WISH_TO_CONTINUE_PLAYING_AFTERWARDS_BR_BR_FREE_PLAY_REQUIREMENTS_BR_1_CHARACTER_LEVEL_BR_2_CHARACTER_XP_BR_3_CHARACTER_CREATION_DATE_CHRONOLOGICAL_ORDER;
	
	@ClientString(id = 4090, message = "Returning players will receive free passes as a welcome-back gift. The pass must be retrieved within 24 hours.nnClick 'Receive' to go to the website for the pass. This will log you out of the game. Do you wish to proceed?nn(Click Cancel if you have already registered the pass.)")
	public static SystemMessageId RETURNING_PLAYERS_WILL_RECEIVE_FREE_PASSES_AS_A_WELCOME_BACK_GIFT_THE_PASS_MUST_BE_RETRIEVED_WITHIN_24_HOURS_N_NCLICK_RECEIVE_TO_GO_TO_THE_WEBSITE_FOR_THE_PASS_THIS_WILL_LOG_YOU_OUT_OF_THE_GAME_DO_YOU_WISH_TO_PROCEED_N_N_CLICK_CANCEL_IF_YOU_HAVE_ALREADY_REGISTERED_THE_PASS;
	
	@ClientString(id = 4091, message = "This quest cannot be deleted.")
	public static SystemMessageId THIS_QUEST_CANNOT_BE_DELETED;
	
	@ClientString(id = 4092, message = "A free player will have limited access to rights as clan leader. Will you transfer clan leadership?")
	public static SystemMessageId A_FREE_PLAYER_WILL_HAVE_LIMITED_ACCESS_TO_RIGHTS_AS_CLAN_LEADER_WILL_YOU_TRANSFER_CLAN_LEADERSHIP;
	
	@ClientString(id = 4093, message = "You have limited access to rights as clan leader as you are a free player.")
	public static SystemMessageId YOU_HAVE_LIMITED_ACCESS_TO_RIGHTS_AS_CLAN_LEADER_AS_YOU_ARE_A_FREE_PLAYER;
	
	@ClientString(id = 4094, message = "Use the system message window.")
	public static SystemMessageId USE_THE_SYSTEM_MESSAGE_WINDOW;
	
	@ClientString(id = 4095, message = "You cannot enchant skills on existing Awakened classes before diversification.")
	public static SystemMessageId YOU_CANNOT_ENCHANT_SKILLS_ON_EXISTING_AWAKENED_CLASSES_BEFORE_DIVERSIFICATION;
	
	@ClientString(id = 4096, message = "You qualify for inactive player benefits. Log into the Lineage II homepage within $s1 hour(s) and $s2 minute(s) to acquire a play pass.")
	public static SystemMessageId YOU_QUALIFY_FOR_INACTIVE_PLAYER_BENEFITS_LOG_INTO_THE_LINEAGE_II_HOMEPAGE_WITHIN_S1_HOUR_S_AND_S2_MINUTE_S_TO_ACQUIRE_A_PLAY_PASS;
	
	@ClientString(id = 4097, message = "Teleport in progress. Please try again later.")
	public static SystemMessageId TELEPORT_IN_PROGRESS_PLEASE_TRY_AGAIN_LATER;
	
	@ClientString(id = 4098, message = "You cannot summon a pet/ servitor during a teleport. Please try again later.")
	public static SystemMessageId YOU_CANNOT_SUMMON_A_PET_SERVITOR_DURING_A_TELEPORT_PLEASE_TRY_AGAIN_LATER;
	
	@ClientString(id = 4099, message = "100,000,000 Adena will be spent on a reset. Proceed?")
	public static SystemMessageId ADENA_WILL_BE_SPENT_ON_A_RESET_PROCEED;
	
	@ClientString(id = 4100, message = "You may register the clan after $s1 second(s) due to deleting the entered text.")
	public static SystemMessageId YOU_MAY_REGISTER_THE_CLAN_AFTER_S1_SECOND_S_DUE_TO_DELETING_THE_ENTERED_TEXT;
	
	@ClientString(id = 4101, message = "You may apply for entry after $s1 second(s) due to cancelling your application.")
	public static SystemMessageId YOU_MAY_APPLY_FOR_ENTRY_AFTER_S1_SECOND_S_DUE_TO_CANCELLING_YOUR_APPLICATION;
	
	@ClientString(id = 4102, message = "You may enter names into the waiting list after $s1 second(s) due to deleting from the waiting list.")
	public static SystemMessageId YOU_MAY_ENTER_NAMES_INTO_THE_WAITING_LIST_AFTER_S1_SECOND_S_DUE_TO_DELETING_FROM_THE_WAITING_LIST;
	
	@ClientString(id = 4103, message = "The Prophecy skill cannot be reset due to insufficient Adena.")
	public static SystemMessageId THE_PROPHECY_SKILL_CANNOT_BE_RESET_DUE_TO_INSUFFICIENT_ADENA;
	
	@ClientString(id = 4104, message = "Players can Shout after Lv. $s1.")
	public static SystemMessageId PLAYERS_CAN_SHOUT_AFTER_LV_S1;
	
	@ClientString(id = 4105, message = "Players can use Trade chat after Lv. $s1.")
	public static SystemMessageId PLAYERS_CAN_USE_TRADE_CHAT_AFTER_LV_S1;
	
	@ClientString(id = 4106, message = "Players can use general chat after Lv. $s1.")
	public static SystemMessageId PLAYERS_CAN_USE_GENERAL_CHAT_AFTER_LV_S1;
	
	@ClientString(id = 4107, message = "Players can respond to a whisper, but cannot initiate a whisper until Lv. $s1.")
	public static SystemMessageId PLAYERS_CAN_RESPOND_TO_A_WHISPER_BUT_CANNOT_INITIATE_A_WHISPER_UNTIL_LV_S1;
	
	@ClientString(id = 4108, message = "Pet summon/ seal or riding in progress. Please try again later.")
	public static SystemMessageId PET_SUMMON_SEAL_OR_RIDING_IN_PROGRESS_PLEASE_TRY_AGAIN_LATER;
	
	@ClientString(id = 4109, message = "Cannot ride while summoning / sealing pet. Please try again later.")
	public static SystemMessageId CANNOT_RIDE_WHILE_SUMMONING_SEALING_PET_PLEASE_TRY_AGAIN_LATER;
	
	@ClientString(id = 4110, message = "Dormant accounts will receive support through in-game mail containing equipment and supplies.(br)(only for characters that have completed the 2nd Class Transfer)")
	public static SystemMessageId DORMANT_ACCOUNTS_WILL_RECEIVE_SUPPORT_THROUGH_IN_GAME_MAIL_CONTAINING_EQUIPMENT_AND_SUPPLIES_BR_ONLY_FOR_CHARACTERS_THAT_HAVE_COMPLETED_THE_2ND_CLASS_TRANSFER;
	
	@ClientString(id = 4111, message = "UI may not display properly in a resolution of 1024*768 or less.")
	public static SystemMessageId UI_MAY_NOT_DISPLAY_PROPERLY_IN_A_RESOLUTION_OF_1024_768_OR_LESS;
	
	@ClientString(id = 4112, message = "The augmentation effects on $s1 have been deleted.")
	public static SystemMessageId THE_AUGMENTATION_EFFECTS_ON_S1_HAVE_BEEN_DELETED;
	
	@ClientString(id = 4113, message = "$s1 has been restored to its previous appearance, as its temporary modification has expired.")
	public static SystemMessageId S1_HAS_BEEN_RESTORED_TO_ITS_PREVIOUS_APPEARANCE_AS_ITS_TEMPORARY_MODIFICATION_HAS_EXPIRED;
	
	@ClientString(id = 4114, message = "You have dropped +$s1$s2.")
	public static SystemMessageId YOU_HAVE_DROPPED_S1_S2;
	
	@ClientString(id = 4115, message = "You have dropped $s1.")
	public static SystemMessageId YOU_HAVE_DROPPED_S12;
	
	@ClientString(id = 4116, message = "The +$s1 augmentation effects on $s2 have been deleted.")
	public static SystemMessageId THE_S1_AUGMENTATION_EFFECTS_ON_S2_HAVE_BEEN_DELETED;
	
	@ClientString(id = 4117, message = "+$s1$s2 has been restored to its previous appearance, as its temporary modification has expired.")
	public static SystemMessageId S1_S2_HAS_BEEN_RESTORED_TO_ITS_PREVIOUS_APPEARANCE_AS_ITS_TEMPORARY_MODIFICATION_HAS_EXPIRED;
	
	@ClientString(id = 4118, message = "You cannot teleport as the Dimensional Space is closed.")
	public static SystemMessageId YOU_CANNOT_TELEPORT_AS_THE_DIMENSIONAL_SPACE_IS_CLOSED;
	
	@ClientString(id = 4119, message = "You cannot teleport to the Dimensional Space as it is full.")
	public static SystemMessageId YOU_CANNOT_TELEPORT_TO_THE_DIMENSIONAL_SPACE_AS_IT_IS_FULL;
	
	@ClientString(id = 4120, message = "You cannot teleport to the Dimensional Space while your pet or servitor is summoned.")
	public static SystemMessageId YOU_CANNOT_TELEPORT_TO_THE_DIMENSIONAL_SPACE_WHILE_YOUR_PET_OR_SERVITOR_IS_SUMMONED;
	
	@ClientString(id = 4121, message = "You cannot use the Beauty Shop as the NPC server is currently not in function.")
	public static SystemMessageId YOU_CANNOT_USE_THE_BEAUTY_SHOP_AS_THE_NPC_SERVER_IS_CURRENTLY_NOT_IN_FUNCTION;
	
	@ClientString(id = 4122, message = "You cannot register/cancel while using the Beauty Shop.")
	public static SystemMessageId YOU_CANNOT_REGISTER_CANCEL_WHILE_USING_THE_BEAUTY_SHOP;
	
	@ClientString(id = 4123, message = "You cannot use the Beauty Shop while using the automatic replacement.")
	public static SystemMessageId YOU_CANNOT_USE_THE_BEAUTY_SHOP_WHILE_USING_THE_AUTOMATIC_REPLACEMENT;
	
	@ClientString(id = 4124, message = "You cannot run the Olympiad while using the Beauty Shop.")
	public static SystemMessageId YOU_CANNOT_RUN_THE_OLYMPIAD_WHILE_USING_THE_BEAUTY_SHOP;
	
	@ClientString(id = 4125, message = "You have been entered on the waiting list again as the replacement player does not fit the requirements.")
	public static SystemMessageId YOU_HAVE_BEEN_ENTERED_ON_THE_WAITING_LIST_AGAIN_AS_THE_REPLACEMENT_PLAYER_DOES_NOT_FIT_THE_REQUIREMENTS;
	
	@ClientString(id = 4126, message = "You cannot use the Beauty Shop while registered in the Ceremony of Chaos.")
	public static SystemMessageId YOU_CANNOT_USE_THE_BEAUTY_SHOP_WHILE_REGISTERED_IN_THE_CEREMONY_OF_CHAOS;
	
	@ClientString(id = 4127, message = "You cannot use the Beauty Shop while registered in the Olympiad.")
	public static SystemMessageId YOU_CANNOT_USE_THE_BEAUTY_SHOP_WHILE_REGISTERED_IN_THE_OLYMPIAD;
	
	@ClientString(id = 4128, message = "Your wish has been entered successfully into the Wish Tree.")
	public static SystemMessageId YOUR_WISH_HAS_BEEN_ENTERED_SUCCESSFULLY_INTO_THE_WISH_TREE;
	
	@ClientString(id = 4129, message = "Go to the event page to view the wish entered into the Wish Tree?")
	public static SystemMessageId GO_TO_THE_EVENT_PAGE_TO_VIEW_THE_WISH_ENTERED_INTO_THE_WISH_TREE;
	
	@ClientString(id = 4130, message = "Failed to enter wish. Please try again by clicking on the wish link.")
	public static SystemMessageId FAILED_TO_ENTER_WISH_PLEASE_TRY_AGAIN_BY_CLICKING_ON_THE_WISH_LINK;
	
	@ClientString(id = 4131, message = "Inventory weight/ slot has been filled to 80%% or more. You cannot enter a wish or obtain rewards in this state. Please organize your inventory and try again.")
	public static SystemMessageId INVENTORY_WEIGHT_SLOT_HAS_BEEN_FILLED_TO_80_OR_MORE_YOU_CANNOT_ENTER_A_WISH_OR_OBTAIN_REWARDS_IN_THIS_STATE_PLEASE_ORGANIZE_YOUR_INVENTORY_AND_TRY_AGAIN;
	
	@ClientString(id = 4132, message = "You have already been rewarded for entering a wish. You can only make 1 wish per character.")
	public static SystemMessageId YOU_HAVE_ALREADY_BEEN_REWARDED_FOR_ENTERING_A_WISH_YOU_CAN_ONLY_MAKE_1_WISH_PER_CHARACTER;
	
	@ClientString(id = 4133, message = "When you log in with a new account, a new account item will be given to the first character to log into each server for 1 week.")
	public static SystemMessageId WHEN_YOU_LOG_IN_WITH_A_NEW_ACCOUNT_A_NEW_ACCOUNT_ITEM_WILL_BE_GIVEN_TO_THE_FIRST_CHARACTER_TO_LOG_INTO_EACH_SERVER_FOR_1_WEEK;
	
	@ClientString(id = 4134, message = "You cannot change your wish once entered. Proceed?")
	public static SystemMessageId YOU_CANNOT_CHANGE_YOUR_WISH_ONCE_ENTERED_PROCEED;
	
	@ClientString(id = 4135, message = "Not in use - new additional possible field")
	public static SystemMessageId NOT_IN_USE_NEW_ADDITIONAL_POSSIBLE_FIELD;
	
	@ClientString(id = 4136, message = "Your personal information collection and usage matters have been changed to adhere to the rules regarding the promotion of usage of the information network system and information protection. After checking the changes, please agree to the collection and usage of the personal information.(br)(font color='#FFDF5F')(If you do not agree, service usage may become limited effective 2/06/2013. Please refer to the personal information treatment (handling) policy on the webpage for further details.)(/font)")
	public static SystemMessageId YOUR_PERSONAL_INFORMATION_COLLECTION_AND_USAGE_MATTERS_HAVE_BEEN_CHANGED_TO_ADHERE_TO_THE_RULES_REGARDING_THE_PROMOTION_OF_USAGE_OF_THE_INFORMATION_NETWORK_SYSTEM_AND_INFORMATION_PROTECTION_AFTER_CHECKING_THE_CHANGES_PLEASE_AGREE_TO_THE_COLLECTION_AND_USAGE_OF_THE_PERSONAL_INFORMATION_BR_FONT_COLOR_FFDF5F_IF_YOU_DO_NOT_AGREE_SERVICE_USAGE_MAY_BECOME_LIMITED_EFFECTIVE_2_06_2013_PLEASE_REFER_TO_THE_PERSONAL_INFORMATION_TREATMENT_HANDLING_POLICY_ON_THE_WEBPAGE_FOR_FURTHER_DETAILS_FONT;
	
	@ClientString(id = 4137, message = "Characters cannot receive requested payment while teleporting between dimensions. Please try again later.")
	public static SystemMessageId CHARACTERS_CANNOT_RECEIVE_REQUESTED_PAYMENT_WHILE_TELEPORTING_BETWEEN_DIMENSIONS_PLEASE_TRY_AGAIN_LATER;
	
	@ClientString(id = 4138, message = "Stopped Party Matching. You have $s1 minute(s) until Party Matching is disabled.")
	public static SystemMessageId STOPPED_PARTY_MATCHING_YOU_HAVE_S1_MINUTE_S_UNTIL_PARTY_MATCHING_IS_DISABLED;
	
	@ClientString(id = 4139, message = "Party Matching usable.")
	public static SystemMessageId PARTY_MATCHING_USABLE;
	
	@ClientString(id = 4140, message = "The attribute enchant of $s2 will be performed at $s1 and $s2.")
	public static SystemMessageId THE_ATTRIBUTE_ENCHANT_OF_S2_WILL_BE_PERFORMED_AT_S1_AND_S2;
	
	@ClientString(id = 4141, message = "Enchanting is complete.nn(Performed Enchant)n$s1 x $s2nn(Successful Enchant)n$s3nn(Failed Enchant)n$s4nn(Unused Enhancement Stones)n$s5")
	public static SystemMessageId ENCHANTING_IS_COMPLETE_N_N_PERFORMED_ENCHANT_N_S1_X_S2_N_N_SUCCESSFUL_ENCHANT_N_S3_N_N_FAILED_ENCHANT_N_S4_N_N_UNUSED_ENHANCEMENT_STONES_N_S5;
	
	@ClientString(id = 4142, message = "Please enter the quantity.")
	public static SystemMessageId PLEASE_ENTER_THE_QUANTITY;
	
	@ClientString(id = 4143, message = "Upon failure, the item is destroyed (crystallization).")
	public static SystemMessageId UPON_FAILURE_THE_ITEM_IS_DESTROYED_CRYSTALLIZATION;
	
	@ClientString(id = 4144, message = "Upon failure, enchant will reset to +0.")
	public static SystemMessageId UPON_FAILURE_ENCHANT_WILL_RESET_TO_0;
	
	@ClientString(id = 4145, message = "Upon failure, the current enchant value will be maintained.")
	public static SystemMessageId UPON_FAILURE_THE_CURRENT_ENCHANT_VALUE_WILL_BE_MAINTAINED;
	
	@ClientString(id = 4146, message = "Please register the Enchant Scroll.")
	public static SystemMessageId PLEASE_REGISTER_THE_ENCHANT_SCROLL;
	
	@ClientString(id = 4147, message = "You cannot delete items while enchanting attributes.")
	public static SystemMessageId YOU_CANNOT_DELETE_ITEMS_WHILE_ENCHANTING_ATTRIBUTES;
	
	@ClientString(id = 4148, message = "You cannot destroy or crystallize items while enchanting attributes.")
	public static SystemMessageId YOU_CANNOT_DESTROY_OR_CRYSTALLIZE_ITEMS_WHILE_ENCHANTING_ATTRIBUTES;
	
	@ClientString(id = 4149, message = "Warning:nnUpon enchant failure, the item will be crystallized.nDo you wish to proceed?")
	public static SystemMessageId WARNING_N_NUPON_ENCHANT_FAILURE_THE_ITEM_WILL_BE_CRYSTALLIZED_NDO_YOU_WISH_TO_PROCEED;
	
	@ClientString(id = 4150, message = "Adena distribution has started.")
	public static SystemMessageId ADENA_DISTRIBUTION_HAS_STARTED;
	
	@ClientString(id = 4151, message = "Adena distribution has been cancelled.")
	public static SystemMessageId ADENA_DISTRIBUTION_HAS_BEEN_CANCELLED;
	
	@ClientString(id = 4152, message = "The adena in possession has been decreased. Adena distribution has been cancelled.")
	public static SystemMessageId THE_ADENA_IN_POSSESSION_HAS_BEEN_DECREASED_ADENA_DISTRIBUTION_HAS_BEEN_CANCELLED;
	
	@ClientString(id = 4153, message = "The distribution participants have changed. Adena distribution has been cancelled.")
	public static SystemMessageId THE_DISTRIBUTION_PARTICIPANTS_HAVE_CHANGED_ADENA_DISTRIBUTION_HAS_BEEN_CANCELLED;
	
	@ClientString(id = 4154, message = "You cannot proceed as you are not in an alliance or party.")
	public static SystemMessageId YOU_CANNOT_PROCEED_AS_YOU_ARE_NOT_IN_AN_ALLIANCE_OR_PARTY;
	
	@ClientString(id = 4155, message = "You cannot proceed as you are not an alliance leader or party leader.")
	public static SystemMessageId YOU_CANNOT_PROCEED_AS_YOU_ARE_NOT_AN_ALLIANCE_LEADER_OR_PARTY_LEADER;
	
	@ClientString(id = 4156, message = "You cannot proceed as you are not a party leader.")
	public static SystemMessageId YOU_CANNOT_PROCEED_AS_YOU_ARE_NOT_A_PARTY_LEADER;
	
	@ClientString(id = 4157, message = "You cannot proceed as there is insufficient Adena.")
	public static SystemMessageId YOU_CANNOT_PROCEED_AS_THERE_IS_INSUFFICIENT_ADENA;
	
	@ClientString(id = 4158, message = "Only Adena distribution can proceed.")
	public static SystemMessageId ONLY_ADENA_DISTRIBUTION_CAN_PROCEED;
	
	@ClientString(id = 4159, message = "Adena was not distributed to $s1.")
	public static SystemMessageId ADENA_WAS_NOT_DISTRIBUTED_TO_S1;
	
	@ClientString(id = 4160, message = "You did not receive Adena distribution.")
	public static SystemMessageId YOU_DID_NOT_RECEIVE_ADENA_DISTRIBUTION;
	
	@ClientString(id = 4161, message = "Distribution cannot proceed as there is insufficient Adena for distribution.")
	public static SystemMessageId DISTRIBUTION_CANNOT_PROCEED_AS_THERE_IS_INSUFFICIENT_ADENA_FOR_DISTRIBUTION;
	
	@ClientString(id = 4162, message = "My Apostle Lilith!")
	public static SystemMessageId MY_APOSTLE_LILITH;
	
	@ClientString(id = 4163, message = "Drink the blood of darkness, and rise again to complete my sacrifice!")
	public static SystemMessageId DRINK_THE_BLOOD_OF_DARKNESS_AND_RISE_AGAIN_TO_COMPLETE_MY_SACRIFICE;
	
	@ClientString(id = 4164, message = "My fallen angel Anakim!")
	public static SystemMessageId MY_FALLEN_ANGEL_ANAKIM;
	
	@ClientString(id = 4165, message = "Drink the blood of darkness, and rise again to complete my sacrifice!")
	public static SystemMessageId DRINK_THE_BLOOD_OF_DARKNESS_AND_RISE_AGAIN_TO_COMPLETE_MY_SACRIFICE2;
	
	@ClientString(id = 4166, message = "The alliance leader or party leader rights have been transferred. Adena distribution has been cancelled.")
	public static SystemMessageId THE_ALLIANCE_LEADER_OR_PARTY_LEADER_RIGHTS_HAVE_BEEN_TRANSFERRED_ADENA_DISTRIBUTION_HAS_BEEN_CANCELLED;
	
	@ClientString(id = 4167, message = "Hair accessories will no longer be displayed.")
	public static SystemMessageId HAIR_ACCESSORIES_WILL_NO_LONGER_BE_DISPLAYED;
	
	@ClientString(id = 4168, message = "Hair accessories will be displayed from now on.")
	public static SystemMessageId HAIR_ACCESSORIES_WILL_BE_DISPLAYED_FROM_NOW_ON;
	
	@ClientString(id = 4169, message = "There is no equipped hair accessory.")
	public static SystemMessageId THERE_IS_NO_EQUIPPED_HAIR_ACCESSORY;
	
	@ClientString(id = 4170, message = "(BROWN01)(/BROWN01)(RED02) Depending on the hair accessory display status in the inventory(/RED02)(BROWN01),(br)the hair style may not be displayed.(br)Do you wish to change the style?(/BROWN01)")
	public static SystemMessageId BROWN01_BROWN01_RED02_DEPENDING_ON_THE_HAIR_ACCESSORY_DISPLAY_STATUS_IN_THE_INVENTORY_RED02_BROWN01_BR_THE_HAIR_STYLE_MAY_NOT_BE_DISPLAYED_BR_DO_YOU_WISH_TO_CHANGE_THE_STYLE_BROWN01;
	
	@ClientString(id = 4171, message = "A member has excessive Adena. Distribution has been cancelled.")
	public static SystemMessageId A_MEMBER_HAS_EXCESSIVE_ADENA_DISTRIBUTION_HAS_BEEN_CANCELLED;
	
	@ClientString(id = 4172, message = "You cannot chat while participating in the Olympiad.")
	public static SystemMessageId YOU_CANNOT_CHAT_WHILE_PARTICIPATING_IN_THE_OLYMPIAD;
	
	@ClientString(id = 4173, message = "You cannot send a whisper to a user who is participating in the Olympiad.")
	public static SystemMessageId YOU_CANNOT_SEND_A_WHISPER_TO_A_USER_WHO_IS_PARTICIPATING_IN_THE_OLYMPIAD;
	
	@ClientString(id = 4174, message = "After about 1 minute, you will move to the Olympiad arena.")
	public static SystemMessageId AFTER_ABOUT_1_MINUTE_YOU_WILL_MOVE_TO_THE_OLYMPIAD_ARENA;
	
	@ClientString(id = 4175, message = "You will shortly move to the Olympiad arena.")
	public static SystemMessageId YOU_WILL_SHORTLY_MOVE_TO_THE_OLYMPIAD_ARENA;
	
	@ClientString(id = 4176, message = "It seemed as if everything had returned to normal.")
	public static SystemMessageId IT_SEEMED_AS_IF_EVERYTHING_HAD_RETURNED_TO_NORMAL;
	
	@ClientString(id = 4177, message = "But had it?")
	public static SystemMessageId BUT_HAD_IT;
	
	@ClientString(id = 4178, message = "I looked closer, and the darkness was still there. Hiding.")
	public static SystemMessageId I_LOOKED_CLOSER_AND_THE_DARKNESS_WAS_STILL_THERE_HIDING;
	
	@ClientString(id = 4179, message = "Waiting for a chance to resurface.")
	public static SystemMessageId WAITING_FOR_A_CHANCE_TO_RESURFACE;
	
	@ClientString(id = 4180, message = "The enemy is never far.")
	public static SystemMessageId THE_ENEMY_IS_NEVER_FAR;
	
	@ClientString(id = 4181, message = "Always remember that, Leona Blackbird.")
	public static SystemMessageId ALWAYS_REMEMBER_THAT_LEONA_BLACKBIRD;
	
	@ClientString(id = 4182, message = "You can convert $s1 SP to 1 Ability Point.")
	public static SystemMessageId YOU_CAN_CONVERT_S1_SP_TO_1_ABILITY_POINT;
	
	@ClientString(id = 4183, message = "After converting $s1 SP to 1 Ability Point, there will be $s2 SP remaining.(YELLOW03)Abilities that are not applied will return to pre-selection state.(/YELLOW03) Proceed?")
	public static SystemMessageId AFTER_CONVERTING_S1_SP_TO_1_ABILITY_POINT_THERE_WILL_BE_S2_SP_REMAINING_YELLOW03_ABILITIES_THAT_ARE_NOT_APPLIED_WILL_RETURN_TO_PRE_SELECTION_STATE_YELLOW03_PROCEED;
	
	@ClientString(id = 4184, message = "Point conversion has failed. Please try again.")
	public static SystemMessageId POINT_CONVERSION_HAS_FAILED_PLEASE_TRY_AGAIN;
	
	@ClientString(id = 4185, message = "You cannot acquire any more Ability Points.")
	public static SystemMessageId YOU_CANNOT_ACQUIRE_ANY_MORE_ABILITY_POINTS;
	
	@ClientString(id = 4186, message = "You need $s1 SP to convert to1 Ability Point.")
	public static SystemMessageId YOU_NEED_S1_SP_TO_CONVERT_TO1_ABILITY_POINT;
	
	@ClientString(id = 4187, message = "The selected Ability will be acquired.")
	public static SystemMessageId THE_SELECTED_ABILITY_WILL_BE_ACQUIRED;
	
	@ClientString(id = 4188, message = "Please select the Ability to be acquired.")
	public static SystemMessageId PLEASE_SELECT_THE_ABILITY_TO_BE_ACQUIRED;
	
	@ClientString(id = 4189, message = "The selected Ability will be acquired. Do you wish to continue?")
	public static SystemMessageId THE_SELECTED_ABILITY_WILL_BE_ACQUIRED_DO_YOU_WISH_TO_CONTINUE;
	
	@ClientString(id = 4190, message = "Failed to acquire Ability. Please try again.")
	public static SystemMessageId FAILED_TO_ACQUIRE_ABILITY_PLEASE_TRY_AGAIN;
	
	@ClientString(id = 4191, message = "$s1 Adena will be consumed and special points will be reset.")
	public static SystemMessageId S1_ADENA_WILL_BE_CONSUMED_AND_SPECIAL_POINTS_WILL_BE_RESET;
	
	@ClientString(id = 4192, message = "$s1 will be consumed to return all Abilities and points. Do you wish to continue?")
	public static SystemMessageId S1_WILL_BE_CONSUMED_TO_RETURN_ALL_ABILITIES_AND_POINTS_DO_YOU_WISH_TO_CONTINUE;
	
	@ClientString(id = 4193, message = "Point reset has failed. Please try again.")
	public static SystemMessageId POINT_RESET_HAS_FAILED_PLEASE_TRY_AGAIN;
	
	@ClientString(id = 4194, message = "Ability Points: $s1")
	public static SystemMessageId ABILITY_POINTS_S1;
	
	@ClientString(id = 4195, message = "Abilities can be used by Noblesse/Exalted Lv. 99 or above.")
	public static SystemMessageId ABILITIES_CAN_BE_USED_BY_NOBLESSE_EXALTED_LV_99_OR_ABOVE;
	
	@ClientString(id = 4196, message = "The requested operation has failed. Please try again.")
	public static SystemMessageId THE_REQUESTED_OPERATION_HAS_FAILED_PLEASE_TRY_AGAIN;
	
	@ClientString(id = 4197, message = "$s1's amount of Adena in possession has exceeded the maximum. Distribution cannot proceed.")
	public static SystemMessageId S1_S_AMOUNT_OF_ADENA_IN_POSSESSION_HAS_EXCEEDED_THE_MAXIMUM_DISTRIBUTION_CANNOT_PROCEED;
	
	@ClientString(id = 4198, message = "When there is mail with an attached item, the character cannot be deleted.(br)Please organize the mailbox and try again.")
	public static SystemMessageId WHEN_THERE_IS_MAIL_WITH_AN_ATTACHED_ITEM_THE_CHARACTER_CANNOT_BE_DELETED_BR_PLEASE_ORGANIZE_THE_MAILBOX_AND_TRY_AGAIN;
	
	@ClientString(id = 4199, message = "Please equip the hair accessory and try again.")
	public static SystemMessageId PLEASE_EQUIP_THE_HAIR_ACCESSORY_AND_TRY_AGAIN;
	
	@ClientString(id = 4200, message = "You will move to the website. Do you wish to continue?")
	public static SystemMessageId YOU_WILL_MOVE_TO_THE_WEBSITE_DO_YOU_WISH_TO_CONTINUE;
	
	@ClientString(id = 4201, message = "You are not in a party.")
	public static SystemMessageId YOU_ARE_NOT_IN_A_PARTY;
	
	@ClientString(id = 4202, message = "You are not in a clan.")
	public static SystemMessageId YOU_ARE_NOT_IN_A_CLAN;
	
	@ClientString(id = 4203, message = "You are not in an alliance.")
	public static SystemMessageId YOU_ARE_NOT_IN_AN_ALLIANCE;
	
	@ClientString(id = 4204, message = "Only Heroes can enter the Hero channel.")
	public static SystemMessageId ONLY_HEROES_CAN_ENTER_THE_HERO_CHANNEL;
	
	@ClientString(id = 4205, message = "Sayune cannot be used while taking other actions.")
	public static SystemMessageId SAYUNE_CANNOT_BE_USED_WHILE_TAKING_OTHER_ACTIONS;
	
	@ClientString(id = 4206, message = "You gained Ability Points as a bonus!")
	public static SystemMessageId YOU_GAINED_ABILITY_POINTS_AS_A_BONUS;
	
	@ClientString(id = 4207, message = "Please beware of chat phishing.")
	public static SystemMessageId PLEASE_BEWARE_OF_CHAT_PHISHING;
	
	@ClientString(id = 4208, message = "Content no. 12 will be deleted. Proceed?")
	public static SystemMessageId CONTENT_NO_12_WILL_BE_DELETED_PROCEED;
	
	@ClientString(id = 4209, message = "You consumed $s1 Raid Points.")
	public static SystemMessageId YOU_CONSUMED_S1_RAID_POINTS;
	
	@ClientString(id = 4210, message = "You have reached the maximum amount of Raid Points, and can acquire no more.")
	public static SystemMessageId YOU_HAVE_REACHED_THE_MAXIMUM_AMOUNT_OF_RAID_POINTS_AND_CAN_ACQUIRE_NO_MORE;
	
	@ClientString(id = 4211, message = "Not enough Raid Points.")
	public static SystemMessageId NOT_ENOUGH_RAID_POINTS;
	
	@ClientString(id = 4212, message = "Failed. Please try again using the correct bait.")
	public static SystemMessageId FAILED_PLEASE_TRY_AGAIN_USING_THE_CORRECT_BAIT;
	
	@ClientString(id = 4213, message = "Use Raid Points to increase Clan Reputation by 50 points?")
	public static SystemMessageId USE_RAID_POINTS_TO_INCREASE_CLAN_REPUTATION_BY_50_POINTS;
	
	@ClientString(id = 4214, message = "$c1 has increased Clan Reputation by $s2 points.")
	public static SystemMessageId C1_HAS_INCREASED_CLAN_REPUTATION_BY_S2_POINTS;
	
	@ClientString(id = 4215, message = "You cannot participate in the Ceremony of Chaos while fishing.")
	public static SystemMessageId YOU_CANNOT_PARTICIPATE_IN_THE_CEREMONY_OF_CHAOS_WHILE_FISHING;
	
	@ClientString(id = 4216, message = "You cannot participate in the Olympiad while fishing.")
	public static SystemMessageId YOU_CANNOT_PARTICIPATE_IN_THE_OLYMPIAD_WHILE_FISHING;
	
	@ClientString(id = 4217, message = "You cannot do that while in a private store or private workshop.")
	public static SystemMessageId YOU_CANNOT_DO_THAT_WHILE_IN_A_PRIVATE_STORE_OR_PRIVATE_WORKSHOP;
	
	@ClientString(id = 4218, message = "No equipment slot available.")
	public static SystemMessageId NO_EQUIPMENT_SLOT_AVAILABLE;
	
	@ClientString(id = 4219, message = "Please finish your ongoing task and try again.")
	public static SystemMessageId PLEASE_FINISH_YOUR_ONGOING_TASK_AND_TRY_AGAIN;
	
	@ClientString(id = 4220, message = "Please select the item to send.")
	public static SystemMessageId PLEASE_SELECT_THE_ITEM_TO_SEND;
	
	@ClientString(id = 4221, message = "This is not a valid combination.")
	public static SystemMessageId THIS_IS_NOT_A_VALID_COMBINATION;
	
	@ClientString(id = 4222, message = "This item this not exist.")
	public static SystemMessageId THIS_ITEM_THIS_NOT_EXIST;
	
	@ClientString(id = 4223, message = "You cannot do that while trading.")
	public static SystemMessageId YOU_CANNOT_DO_THAT_WHILE_TRADING;
	
	@ClientString(id = 4224, message = "You cannot do that while auctioning.")
	public static SystemMessageId YOU_CANNOT_DO_THAT_WHILE_AUCTIONING;
	
	@ClientString(id = 4225, message = "You cannot do that while crystallizing.")
	public static SystemMessageId YOU_CANNOT_DO_THAT_WHILE_CRYSTALLIZING;
	
	@ClientString(id = 4226, message = "Frintezza is playing my victory song!")
	public static SystemMessageId FRINTEZZA_IS_PLAYING_MY_VICTORY_SONG;
	
	@ClientString(id = 4227, message = "Well, it's been nice knowing you. Shall we have the last dance?")
	public static SystemMessageId WELL_IT_S_BEEN_NICE_KNOWING_YOU_SHALL_WE_HAVE_THE_LAST_DANCE;
	
	@ClientString(id = 4228, message = "Back away! I will use Tauti's Cyclone.")
	public static SystemMessageId BACK_AWAY_I_WILL_USE_TAUTI_S_CYCLONE;
	
	@ClientString(id = 4229, message = "Magic and arrows, hm? Well, take a dose of Tauti's Typhoon!")
	public static SystemMessageId MAGIC_AND_ARROWS_HM_WELL_TAKE_A_DOSE_OF_TAUTI_S_TYPHOON;
	
	@ClientString(id = 4230, message = "Talk to Victory for rewards.")
	public static SystemMessageId TALK_TO_VICTORY_FOR_REWARDS;
	
	@ClientString(id = 4231, message = "Talk to Defeat for rewards.")
	public static SystemMessageId TALK_TO_DEFEAT_FOR_REWARDS;
	
	@ClientString(id = 4232, message = "Please select the items to combine.")
	public static SystemMessageId PLEASE_SELECT_THE_ITEMS_TO_COMBINE;
	
	@ClientString(id = 4233, message = "Press Start to combine.")
	public static SystemMessageId PRESS_START_TO_COMBINE;
	
	@ClientString(id = 4234, message = "Failure to combine will result in the loss of 1 Combination Ingredient.nContinue?")
	public static SystemMessageId FAILURE_TO_COMBINE_WILL_RESULT_IN_THE_LOSS_OF_1_COMBINATION_INGREDIENT_NCONTINUE;
	
	@ClientString(id = 4235, message = "Congratulations! You have successfully combined items into $s1.")
	public static SystemMessageId CONGRATULATIONS_YOU_HAVE_SUCCESSFULLY_COMBINED_ITEMS_INTO_S1;
	
	@ClientString(id = 4236, message = "You have failed to combined the items, and lost $s1.")
	public static SystemMessageId YOU_HAVE_FAILED_TO_COMBINED_THE_ITEMS_AND_LOST_S1;
	
	@ClientString(id = 4237, message = "You cannot equip $s1 without equipping a brooch.")
	public static SystemMessageId YOU_CANNOT_EQUIP_S1_WITHOUT_EQUIPPING_A_BROOCH;
	
	@ClientString(id = 4238, message = "You can use World Chat (press and) $s1 more time(s).")
	public static SystemMessageId YOU_CAN_USE_WORLD_CHAT_PRESS_AND_S1_MORE_TIME_S;
	
	@ClientString(id = 4239, message = "You have spent your World Chat quota for the day. A new day starts every day at 18:30.")
	public static SystemMessageId YOU_HAVE_SPENT_YOUR_WORLD_CHAT_QUOTA_FOR_THE_DAY_A_NEW_DAY_STARTS_EVERY_DAY_AT_18_30;
	
	@ClientString(id = 4240, message = "You can use World Chat from Lv. $s1.")
	public static SystemMessageId YOU_CAN_USE_WORLD_CHAT_FROM_LV_S1;
	
	@ClientString(id = 4241, message = "You have $s1 sec. until you are able to use World Chat.")
	public static SystemMessageId YOU_HAVE_S1_SEC_UNTIL_YOU_ARE_ABLE_TO_USE_WORLD_CHAT;
	
	@ClientString(id = 4242, message = "Transmutable after $s1")
	public static SystemMessageId TRANSMUTABLE_AFTER_S1;
	
	@ClientString(id = 4243, message = "Using a Scroll of Escape can help you speed along your quest.")
	public static SystemMessageId USING_A_SCROLL_OF_ESCAPE_CAN_HELP_YOU_SPEED_ALONG_YOUR_QUEST;
	
	@ClientString(id = 4244, message = "Lady Luck smiles upon you!")
	public static SystemMessageId LADY_LUCK_SMILES_UPON_YOU;
	
	@ClientString(id = 4245, message = "Evaded killing blow. Lady Luck watches over you!")
	public static SystemMessageId EVADED_KILLING_BLOW_LADY_LUCK_WATCHES_OVER_YOU;
	
	@ClientString(id = 4246, message = "Exceeded the maximum number of items you can enter.")
	public static SystemMessageId EXCEEDED_THE_MAXIMUM_NUMBER_OF_ITEMS_YOU_CAN_ENTER;
	
	@ClientString(id = 4247, message = "This item cannot be combined.")
	public static SystemMessageId THIS_ITEM_CANNOT_BE_COMBINED;
	
	@ClientString(id = 4248, message = "You obtained $s1 Air Stones.")
	public static SystemMessageId YOU_OBTAINED_S1_AIR_STONES;
	
	@ClientString(id = 4249, message = "By some unknown force, you have gained $s1 $s2(s).")
	public static SystemMessageId BY_SOME_UNKNOWN_FORCE_YOU_HAVE_GAINED_S1_S2_S;
	
	@ClientString(id = 4250, message = "Please enter the combination ingredients.")
	public static SystemMessageId PLEASE_ENTER_THE_COMBINATION_INGREDIENTS;
	
	@ClientString(id = 4251, message = "Click the Combine button below to start the combination.")
	public static SystemMessageId CLICK_THE_COMBINE_BUTTON_BELOW_TO_START_THE_COMBINATION;
	
	@ClientString(id = 4252, message = "You will not gain extra rewards even if you enter Elcyum.")
	public static SystemMessageId YOU_WILL_NOT_GAIN_EXTRA_REWARDS_EVEN_IF_YOU_ENTER_ELCYUM;
	
	@ClientString(id = 4253, message = "Click the Transmute button below to start the Alchemy experiment.")
	public static SystemMessageId CLICK_THE_TRANSMUTE_BUTTON_BELOW_TO_START_THE_ALCHEMY_EXPERIMENT;
	
	@ClientString(id = 4254, message = "Failure to transmute will destroy some ingredients.")
	public static SystemMessageId FAILURE_TO_TRANSMUTE_WILL_DESTROY_SOME_INGREDIENTS;
	
	@ClientString(id = 4255, message = "Current location: $s1 / $s2 / $s3 (near Faeron Village)")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3_NEAR_FAERON_VILLAGE;
	
	@ClientString(id = 4256, message = "Obtained $s1-fold! (Probability Rate: $s2)")
	public static SystemMessageId OBTAINED_S1_FOLD_PROBABILITY_RATE_S2;
	
	@ClientString(id = 4257, message = "Please check the basic rewards before starting the combination.")
	public static SystemMessageId PLEASE_CHECK_THE_BASIC_REWARDS_BEFORE_STARTING_THE_COMBINATION;
	
	@ClientString(id = 4258, message = "You cannot proceed with the experiment without the necessary skills.")
	public static SystemMessageId YOU_CANNOT_PROCEED_WITH_THE_EXPERIMENT_WITHOUT_THE_NECESSARY_SKILLS;
	
	@ClientString(id = 4259, message = "Not enough ingredients.")
	public static SystemMessageId NOT_ENOUGH_INGREDIENTS;
	
	@ClientString(id = 4260, message = "Select the Alchemy you wish to experiment with from the left-hand list.")
	public static SystemMessageId SELECT_THE_ALCHEMY_YOU_WISH_TO_EXPERIMENT_WITH_FROM_THE_LEFT_HAND_LIST;
	
	@ClientString(id = 4261, message = "You must enter 3 combination ingredients before entering Elcyum Crystals.")
	public static SystemMessageId YOU_MUST_ENTER_3_COMBINATION_INGREDIENTS_BEFORE_ENTERING_ELCYUM_CRYSTALS;
	
	@ClientString(id = 4262, message = "How many would you like to enter?")
	public static SystemMessageId HOW_MANY_WOULD_YOU_LIKE_TO_ENTER;
	
	@ClientString(id = 4263, message = "You can use this when you have reached Lv. 40 and learned Alchemy skills.")
	public static SystemMessageId YOU_CAN_USE_THIS_WHEN_YOU_HAVE_REACHED_LV_40_AND_LEARNED_ALCHEMY_SKILLS;
	
	@ClientString(id = 4264, message = "You can experiement $s1 times.")
	public static SystemMessageId YOU_CAN_EXPERIEMENT_S1_TIMES;
	
	@ClientString(id = 4265, message = "You must learn the necessary skills first.")
	public static SystemMessageId YOU_MUST_LEARN_THE_NECESSARY_SKILLS_FIRST;
	
	@ClientString(id = 4266, message = "Experiment failed. Please try again.")
	public static SystemMessageId EXPERIMENT_FAILED_PLEASE_TRY_AGAIN;
	
	@ClientString(id = 4267, message = "You are banned from World Chat.")
	public static SystemMessageId YOU_ARE_BANNED_FROM_WORLD_CHAT;
	
	@ClientString(id = 4268, message = "You can use World Chat.")
	public static SystemMessageId YOU_CAN_USE_WORLD_CHAT;
	
	@ClientString(id = 4269, message = "World Chat has stopped. $s1 minutes left until World Chat is available again.")
	public static SystemMessageId WORLD_CHAT_HAS_STOPPED_S1_MINUTES_LEFT_UNTIL_WORLD_CHAT_IS_AVAILABLE_AGAIN;
	
	@ClientString(id = 4270, message = "You cannot use Alchemy during battle.")
	public static SystemMessageId YOU_CANNOT_USE_ALCHEMY_DURING_BATTLE;
	
	@ClientString(id = 4271, message = "Current location: $s1 / $s2 / $s3")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3;
	
	@ClientString(id = 4272, message = "Aaahh! Urgh...!")
	public static SystemMessageId AAAHH_URGH;
	
	@ClientString(id = 4273, message = "No one lays a finger on my sister!")
	public static SystemMessageId NO_ONE_LAYS_A_FINGER_ON_MY_SISTER;
	
	@ClientString(id = 4274, message = "Ni... Ni... Nidrah!  Ugh... Urrrgh...")
	public static SystemMessageId NI_NI_NIDRAH_UGH_URRRGH;
	
	@ClientString(id = 4275, message = "That is my cue. Til next time!")
	public static SystemMessageId THAT_IS_MY_CUE_TIL_NEXT_TIME;
	
	@ClientString(id = 4276, message = "Leave this to me. Go! We'll meet again.")
	public static SystemMessageId LEAVE_THIS_TO_ME_GO_WE_LL_MEET_AGAIN;
	
	@ClientString(id = 4277, message = "You cannot Awaken when you are a Hero or on the wait list for Hero status.")
	public static SystemMessageId YOU_CANNOT_AWAKEN_WHEN_YOU_ARE_A_HERO_OR_ON_THE_WAIT_LIST_FOR_HERO_STATUS;
	
	@ClientString(id = 4278, message = "Failure will deduct your enchant value by 1.")
	public static SystemMessageId FAILURE_WILL_DEDUCT_YOUR_ENCHANT_VALUE_BY_1;
	
	@ClientString(id = 4279, message = "You cannot combine items that have been enchanted or augmented.")
	public static SystemMessageId YOU_CANNOT_COMBINE_ITEMS_THAT_HAVE_BEEN_ENCHANTED_OR_AUGMENTED;
	
	@ClientString(id = 4280, message = "You cannot use Alchemy while trading or using a private store or shop.")
	public static SystemMessageId YOU_CANNOT_USE_ALCHEMY_WHILE_TRADING_OR_USING_A_PRIVATE_STORE_OR_SHOP;
	
	@ClientString(id = 4281, message = "You cannot use Alchemy while dead.")
	public static SystemMessageId YOU_CANNOT_USE_ALCHEMY_WHILE_DEAD;
	
	@ClientString(id = 4282, message = "You cannot use Alchemy while immobile.")
	public static SystemMessageId YOU_CANNOT_USE_ALCHEMY_WHILE_IMMOBILE;
	
	@ClientString(id = 4283, message = "The Material Realm is still new to us.")
	public static SystemMessageId THE_MATERIAL_REALM_IS_STILL_NEW_TO_US;
	
	@ClientString(id = 4284, message = "The High Priest has repeatedly attempted to reach Lord Sayha…")
	public static SystemMessageId THE_HIGH_PRIEST_HAS_REPEATEDLY_ATTEMPTED_TO_REACH_LORD_SAYHA;
	
	@ClientString(id = 4285, message = "But there has been only silence.")
	public static SystemMessageId BUT_THERE_HAS_BEEN_ONLY_SILENCE;
	
	@ClientString(id = 4286, message = "But we still get by.")
	public static SystemMessageId BUT_WE_STILL_GET_BY;
	
	@ClientString(id = 4287, message = "After all, we were lucky.")
	public static SystemMessageId AFTER_ALL_WE_WERE_LUCKY;
	
	@ClientString(id = 4288, message = "If not for that man Kain, we may have been overrun by the monsters that stormed our town.")
	public static SystemMessageId IF_NOT_FOR_THAT_MAN_KAIN_WE_MAY_HAVE_BEEN_OVERRUN_BY_THE_MONSTERS_THAT_STORMED_OUR_TOWN;
	
	@ClientString(id = 4289, message = "Hopefully Archmage Venir's delegation has met success in the main continent.")
	public static SystemMessageId HOPEFULLY_ARCHMAGE_VENIR_S_DELEGATION_HAS_MET_SUCCESS_IN_THE_MAIN_CONTINENT;
	
	@ClientString(id = 4290, message = "We can only depend on the help of others at this time.")
	public static SystemMessageId WE_CAN_ONLY_DEPEND_ON_THE_HELP_OF_OTHERS_AT_THIS_TIME;
	
	@ClientString(id = 4291, message = "The winds of change are blowing.")
	public static SystemMessageId THE_WINDS_OF_CHANGE_ARE_BLOWING;
	
	@ClientString(id = 4292, message = "The man who covets the power of the gods has opened the dimensional rift.")
	public static SystemMessageId THE_MAN_WHO_COVETS_THE_POWER_OF_THE_GODS_HAS_OPENED_THE_DIMENSIONAL_RIFT;
	
	@ClientString(id = 4293, message = "Now, forgotten creatures will return, and new heroes will arise.")
	public static SystemMessageId NOW_FORGOTTEN_CREATURES_WILL_RETURN_AND_NEW_HEROES_WILL_ARISE;
	
	@ClientString(id = 4294, message = "Aden, what will your destiny be?")
	public static SystemMessageId ADEN_WHAT_WILL_YOUR_DESTINY_BE;
	
	@ClientString(id = 4295, message = "My children…beware the influence of darkness.")
	public static SystemMessageId MY_CHILDREN_BEWARE_THE_INFLUENCE_OF_DARKNESS;
	
	@ClientString(id = 4296, message = "You cannot use or reset Ability Points while participating in the Olympiad or Ceremony of Chaos.")
	public static SystemMessageId YOU_CANNOT_USE_OR_RESET_ABILITY_POINTS_WHILE_PARTICIPATING_IN_THE_OLYMPIAD_OR_CEREMONY_OF_CHAOS;
	
	@ClientString(id = 4297, message = "Soulshot/Spiritshot Damage")
	public static SystemMessageId SOULSHOT_SPIRITSHOT_DAMAGE;
	
	@ClientString(id = 4298, message = "If enchanting fails, your enchant level will drop by 3!")
	public static SystemMessageId IF_ENCHANTING_FAILS_YOUR_ENCHANT_LEVEL_WILL_DROP_BY_3;
	
	@ClientString(id = 4299, message = "You cannot change your subclass while registered in the Ceremony of Chaos.")
	public static SystemMessageId YOU_CANNOT_CHANGE_YOUR_SUBCLASS_WHILE_REGISTERED_IN_THE_CEREMONY_OF_CHAOS;
	
	@ClientString(id = 4300, message = "Current Location: $s1 / $s2 / $s3 (Infinite Depths)")
	public static SystemMessageId CURRENT_LOCATION_S1_S2_S3_INFINITE_DEPTHS;
	
	@ClientString(id = 4301, message = "You have pre-registered your character. The Classic Server will be accessible after the maintenance on 5/28.")
	public static SystemMessageId YOU_HAVE_PRE_REGISTERED_YOUR_CHARACTER_THE_CLASSIC_SERVER_WILL_BE_ACCESSIBLE_AFTER_THE_MAINTENANCE_ON_5_28;
	
	@ClientString(id = 4302, message = "You can only create 1 character, and you’ll be able to create additional characters after the maintenance on 5/28. The wait time to delete a character is 3 minutes.")
	public static SystemMessageId YOU_CAN_ONLY_CREATE_1_CHARACTER_AND_YOU_LL_BE_ABLE_TO_CREATE_ADDITIONAL_CHARACTERS_AFTER_THE_MAINTENANCE_ON_5_28_THE_WAIT_TIME_TO_DELETE_A_CHARACTER_IS_3_MINUTES;
	
	@ClientString(id = 4303, message = "You can only fish during the paid period.")
	public static SystemMessageId YOU_CAN_ONLY_FISH_DURING_THE_PAID_PERIOD;
	
	@ClientString(id = 4304, message = "Pre-registration for characters is available right now. The Classic Server will be accessible after the maintenance on 5/28.")
	public static SystemMessageId PRE_REGISTRATION_FOR_CHARACTERS_IS_AVAILABLE_RIGHT_NOW_THE_CLASSIC_SERVER_WILL_BE_ACCESSIBLE_AFTER_THE_MAINTENANCE_ON_5_28;
	
	@ClientString(id = 4305, message = "The gods no longer look after us.")
	public static SystemMessageId THE_GODS_NO_LONGER_LOOK_AFTER_US;
	
	@ClientString(id = 4306, message = "Don't expect them to help you forever!")
	public static SystemMessageId DON_T_EXPECT_THEM_TO_HELP_YOU_FOREVER;
	
	@ClientString(id = 4307, message = "Forget the limits the gods have set for us,")
	public static SystemMessageId FORGET_THE_LIMITS_THE_GODS_HAVE_SET_FOR_US;
	
	@ClientString(id = 4308, message = "and surpass even the title they've given us.")
	public static SystemMessageId AND_SURPASS_EVEN_THE_TITLE_THEY_VE_GIVEN_US;
	
	@ClientString(id = 4309, message = "Rise -- and become Exalted!")
	public static SystemMessageId RISE_AND_BECOME_EXALTED;
	
	@ClientString(id = 4310, message = "The quest you've just completed can be completed $s1 times. Each account can complete this quest $s2 times per week, and it's reset after each maintenance.")
	public static SystemMessageId THE_QUEST_YOU_VE_JUST_COMPLETED_CAN_BE_COMPLETED_S1_TIMES_EACH_ACCOUNT_CAN_COMPLETE_THIS_QUEST_S2_TIMES_PER_WEEK_AND_IT_S_RESET_AFTER_EACH_MAINTENANCE;
	
	@ClientString(id = 4601, message = "- Great P. Def. and skillful Shield Defense(br)- Increased P. Def. for the whole party(br)- Protect party members")
	public static SystemMessageId GREAT_P_DEF_AND_SKILLFUL_SHIELD_DEFENSE_BR_INCREASED_P_DEF_FOR_THE_WHOLE_PARTY_BR_PROTECT_PARTY_MEMBERS;
	
	@ClientString(id = 4602, message = "By the will of the Chaos, the power of Abelius, the Golden Commander of the ancient giants, has been combined with the ancient power of light. The blessing of the giants and the light upon him gave him the courage to be the fearless shield of the continent.")
	public static SystemMessageId BY_THE_WILL_OF_THE_CHAOS_THE_POWER_OF_ABELIUS_THE_GOLDEN_COMMANDER_OF_THE_ANCIENT_GIANTS_HAS_BEEN_COMBINED_WITH_THE_ANCIENT_POWER_OF_LIGHT_THE_BLESSING_OF_THE_GIANTS_AND_THE_LIGHT_UPON_HIM_GAVE_HIM_THE_COURAGE_TO_BE_THE_FEARLESS_SHIELD_OF_THE_CONTINENT;
	
	@ClientString(id = 4603, message = "- Great P. Def.(br)- Increased P. Atk. For the whole party(br)Vampiric Rage and Reinforced Dark Panther")
	public static SystemMessageId GREAT_P_DEF_BR_INCREASED_P_ATK_FOR_THE_WHOLE_PARTY_BR_VAMPIRIC_RAGE_AND_REINFORCED_DARK_PANTHER;
	
	@ClientString(id = 4604, message = "By the will of the Chaos, the power of Abelius, the Golden Commander of the ancient giants, has been combined with the ancient power of darkness. The heightened power of darkness gave him the strength and will to overcome any opponent.")
	public static SystemMessageId BY_THE_WILL_OF_THE_CHAOS_THE_POWER_OF_ABELIUS_THE_GOLDEN_COMMANDER_OF_THE_ANCIENT_GIANTS_HAS_BEEN_COMBINED_WITH_THE_ANCIENT_POWER_OF_DARKNESS_THE_HEIGHTENED_POWER_OF_DARKNESS_GAVE_HIM_THE_STRENGTH_AND_WILL_TO_OVERCOME_ANY_OPPONENT;
	
	@ClientString(id = 4605, message = "- Great P. Def. and skillful Shield Defense(br)-Increased P. Def. for the whole party(br)- HP/MP Recovery Cubic")
	public static SystemMessageId GREAT_P_DEF_AND_SKILLFUL_SHIELD_DEFENSE_BR_INCREASED_P_DEF_FOR_THE_WHOLE_PARTY_BR_HP_MP_RECOVERY_CUBIC;
	
	@ClientString(id = 4606, message = "By the will of the Chaos, the power of Abelius, the Golden Commander of the ancient giants, has been combined with the ancient power of light and water. The three powers combined increased not only attack power but also survival abilities, such as defense and the protection of allies.")
	public static SystemMessageId BY_THE_WILL_OF_THE_CHAOS_THE_POWER_OF_ABELIUS_THE_GOLDEN_COMMANDER_OF_THE_ANCIENT_GIANTS_HAS_BEEN_COMBINED_WITH_THE_ANCIENT_POWER_OF_LIGHT_AND_WATER_THE_THREE_POWERS_COMBINED_INCREASED_NOT_ONLY_ATTACK_POWER_BUT_ALSO_SURVIVAL_ABILITIES_SUCH_AS_DEFENSE_AND_THE_PROTECTION_OF_ALLIES;
	
	@ClientString(id = 4607, message = "- Great P. Def.(br)- Increased P. Atk. for the whole party(br)- Dynamic Debuffs")
	public static SystemMessageId GREAT_P_DEF_BR_INCREASED_P_ATK_FOR_THE_WHOLE_PARTY_BR_DYNAMIC_DEBUFFS;
	
	@ClientString(id = 4608, message = "By the will of the Chaos, the power of Abelius, the Golden Commander of the ancient giants, has been combined with the ancient power of darkness. This power gave the Shillien Templars powerful, yet efficient, skills and maneuvers.")
	public static SystemMessageId BY_THE_WILL_OF_THE_CHAOS_THE_POWER_OF_ABELIUS_THE_GOLDEN_COMMANDER_OF_THE_ANCIENT_GIANTS_HAS_BEEN_COMBINED_WITH_THE_ANCIENT_POWER_OF_DARKNESS_THIS_POWER_GAVE_THE_SHILLIEN_TEMPLARS_POWERFUL_YET_EFFICIENT_SKILLS_AND_MANEUVERS;
	
	@ClientString(id = 4609, message = "- Physical hardiness and dynamic weapon mastery(br)- Specializes in Dual Swords(br)- Specializes in attacks using Momentum")
	public static SystemMessageId PHYSICAL_HARDINESS_AND_DYNAMIC_WEAPON_MASTERY_BR_SPECIALIZES_IN_DUAL_SWORDS_BR_SPECIALIZES_IN_ATTACKS_USING_MOMENTUM;
	
	@ClientString(id = 4610, message = "By the will of the Chaos, the power of Sapyros, the Stormy Leader of the ancient giants, has been combined with the ancient power of light. This power, dissolved into dual swords, gave speed and strength to give Tyrr Duelists the upper hand in battle.")
	public static SystemMessageId BY_THE_WILL_OF_THE_CHAOS_THE_POWER_OF_SAPYROS_THE_STORMY_LEADER_OF_THE_ANCIENT_GIANTS_HAS_BEEN_COMBINED_WITH_THE_ANCIENT_POWER_OF_LIGHT_THIS_POWER_DISSOLVED_INTO_DUAL_SWORDS_GAVE_SPEED_AND_STRENGTH_TO_GIVE_TYRR_DUELISTS_THE_UPPER_HAND_IN_BATTLE;
	
	@ClientString(id = 4611, message = "- Physical hardiness and dynamic weapon mastery(br)- Specializes in Polearms(br)- Specializes in herding tactics")
	public static SystemMessageId PHYSICAL_HARDINESS_AND_DYNAMIC_WEAPON_MASTERY_BR_SPECIALIZES_IN_POLEARMS_BR_SPECIALIZES_IN_HERDING_TACTICS;
	
	@ClientString(id = 4612, message = "By the will of the Chaos, the power of Sapyros, the Stormy Leader of the ancient giants, has been combined with the ancient power of light. More ferocious than ever, this power is enough to annihilate a group of enemies in an instant.")
	public static SystemMessageId BY_THE_WILL_OF_THE_CHAOS_THE_POWER_OF_SAPYROS_THE_STORMY_LEADER_OF_THE_ANCIENT_GIANTS_HAS_BEEN_COMBINED_WITH_THE_ANCIENT_POWER_OF_LIGHT_MORE_FEROCIOUS_THAN_EVER_THIS_POWER_IS_ENOUGH_TO_ANNIHILATE_A_GROUP_OF_ENEMIES_IN_AN_INSTANT;
	
	@ClientString(id = 4613, message = "- Physical hardiness and dynamic weapon mastery(br)- Specializes in two-handed swords and spears(br)- Able to suddenly increase P. Atk.")
	public static SystemMessageId PHYSICAL_HARDINESS_AND_DYNAMIC_WEAPON_MASTERY_BR_SPECIALIZES_IN_TWO_HANDED_SWORDS_AND_SPEARS_BR_ABLE_TO_SUDDENLY_INCREASE_P_ATK;
	
	@ClientString(id = 4614, message = "By the will of the Chaos, the power of Sapyros, the Stormy Leader of the ancient giants, has been combined with the ancient power of fire. This power made the warriors of the Orc race not only strength but formidable defenses as well.")
	public static SystemMessageId BY_THE_WILL_OF_THE_CHAOS_THE_POWER_OF_SAPYROS_THE_STORMY_LEADER_OF_THE_ANCIENT_GIANTS_HAS_BEEN_COMBINED_WITH_THE_ANCIENT_POWER_OF_FIRE_THIS_POWER_MADE_THE_WARRIORS_OF_THE_ORC_RACE_NOT_ONLY_STRENGTH_BUT_FORMIDABLE_DEFENSES_AS_WELL;
	
	@ClientString(id = 4615, message = "- Physical hardiness and dynamic weapon mastery(br)- Specializes in fist weapons(br)- Specializes in attacks using Momentum")
	public static SystemMessageId PHYSICAL_HARDINESS_AND_DYNAMIC_WEAPON_MASTERY_BR_SPECIALIZES_IN_FIST_WEAPONS_BR_SPECIALIZES_IN_ATTACKS_USING_MOMENTUM;
	
	@ClientString(id = 4616, message = "By the will of the Chaos, the power of Sapyros, the Stormy Leader of the ancient giants, has been combined with the ancient power of fire. Infused into a strong body, this power allows for the usage of the most extreme skills.")
	public static SystemMessageId BY_THE_WILL_OF_THE_CHAOS_THE_POWER_OF_SAPYROS_THE_STORMY_LEADER_OF_THE_ANCIENT_GIANTS_HAS_BEEN_COMBINED_WITH_THE_ANCIENT_POWER_OF_FIRE_INFUSED_INTO_A_STRONG_BODY_THIS_POWER_ALLOWS_FOR_THE_USAGE_OF_THE_MOST_EXTREME_SKILLS;
	
	@ClientString(id = 4617, message = "- Physical hardiness and dynamic weapon mastery(br)- Able to use polearms and two-handed swords(br)- Skillful crafting")
	public static SystemMessageId PHYSICAL_HARDINESS_AND_DYNAMIC_WEAPON_MASTERY_BR_ABLE_TO_USE_POLEARMS_AND_TWO_HANDED_SWORDS_BR_SKILLFUL_CRAFTING;
	
	@ClientString(id = 4618, message = "By the will of the Chaos, the power of Sapyros, the Stormy Leader of the ancient giants, has been combined with the ancient power of the earth. As a result, the artisans of the Dwarven race were given inconceivable technology and power.")
	public static SystemMessageId BY_THE_WILL_OF_THE_CHAOS_THE_POWER_OF_SAPYROS_THE_STORMY_LEADER_OF_THE_ANCIENT_GIANTS_HAS_BEEN_COMBINED_WITH_THE_ANCIENT_POWER_OF_THE_EARTH_AS_A_RESULT_THE_ARTISANS_OF_THE_DWARVEN_RACE_WERE_GIVEN_INCONCEIVABLE_TECHNOLOGY_AND_POWER;
	
	@ClientString(id = 4619, message = "- Physical hardiness and dynamic weapon mastery(br)- Specializes in two-handed swords(br)- Specializes in PvP")
	public static SystemMessageId PHYSICAL_HARDINESS_AND_DYNAMIC_WEAPON_MASTERY_BR_SPECIALIZES_IN_TWO_HANDED_SWORDS_BR_SPECIALIZES_IN_PVP;
	
	@ClientString(id = 4620, message = "By the will of the Chaos, the power of Sapyros, the Stormy Leader of the ancient giants, has been stacked with the ancient power of the giants. Made of the same source, these two powers awakened the slumbering strength of the Kamaels.")
	public static SystemMessageId BY_THE_WILL_OF_THE_CHAOS_THE_POWER_OF_SAPYROS_THE_STORMY_LEADER_OF_THE_ANCIENT_GIANTS_HAS_BEEN_STACKED_WITH_THE_ANCIENT_POWER_OF_THE_GIANTS_MADE_OF_THE_SAME_SOURCE_THESE_TWO_POWERS_AWAKENED_THE_SLUMBERING_STRENGTH_OF_THE_KAMAELS;
	
	@ClientString(id = 4621, message = "- Balanced Critical Damage and Critical Rate(br)- Highest survival rate among similar classes")
	public static SystemMessageId BALANCED_CRITICAL_DAMAGE_AND_CRITICAL_RATE_BR_HIGHEST_SURVIVAL_RATE_AMONG_SIMILAR_CLASSES;
	
	@ClientString(id = 4622, message = "By the will of the Chaos, the power of Ashagen, the greatest assassin of the giants, has been combined with the ancient power of light and wind. This allowed for quicker movement and strengthened the ability to perform extreme maneuvers in an instant.")
	public static SystemMessageId BY_THE_WILL_OF_THE_CHAOS_THE_POWER_OF_ASHAGEN_THE_GREATEST_ASSASSIN_OF_THE_GIANTS_HAS_BEEN_COMBINED_WITH_THE_ANCIENT_POWER_OF_LIGHT_AND_WIND_THIS_ALLOWED_FOR_QUICKER_MOVEMENT_AND_STRENGTHENED_THE_ABILITY_TO_PERFORM_EXTREME_MANEUVERS_IN_AN_INSTANT;
	
	@ClientString(id = 4623, message = "- High Critical Rate(br)- Quick Evasion and Speed")
	public static SystemMessageId HIGH_CRITICAL_RATE_BR_QUICK_EVASION_AND_SPEED;
	
	@ClientString(id = 4624, message = "By the will of the Chaos, the power of Ashagen, the greatest assassin of the giants, has been combined with the ancient power of light and wind. This power allowed for quick, tempestuous attacks.")
	public static SystemMessageId BY_THE_WILL_OF_THE_CHAOS_THE_POWER_OF_ASHAGEN_THE_GREATEST_ASSASSIN_OF_THE_GIANTS_HAS_BEEN_COMBINED_WITH_THE_ANCIENT_POWER_OF_LIGHT_AND_WIND_THIS_POWER_ALLOWED_FOR_QUICK_TEMPESTUOUS_ATTACKS;
	
	@ClientString(id = 4625, message = "- High Critical Damage(br)- Reflect Atk. Skill damage")
	public static SystemMessageId HIGH_CRITICAL_DAMAGE_BR_REFLECT_ATK_SKILL_DAMAGE;
	
	@ClientString(id = 4626, message = "By the will of the Chaos, the power of Ashagen, the greatest assassin of the giants, has been combined with the ancient power of darkness and wind. This power endowed the Othell Ghost Hunters with speed and critical attacks that made them the ultimate assassins.")
	public static SystemMessageId BY_THE_WILL_OF_THE_CHAOS_THE_POWER_OF_ASHAGEN_THE_GREATEST_ASSASSIN_OF_THE_GIANTS_HAS_BEEN_COMBINED_WITH_THE_ANCIENT_POWER_OF_DARKNESS_AND_WIND_THIS_POWER_ENDOWED_THE_OTHELL_GHOST_HUNTERS_WITH_SPEED_AND_CRITICAL_ATTACKS_THAT_MADE_THEM_THE_ULTIMATE_ASSASSINS;
	
	@ClientString(id = 4627, message = "- Specializes in Spoil (Plunder) (br)  (* obtains rare items and ingredients)")
	public static SystemMessageId SPECIALIZES_IN_SPOIL_PLUNDER_BR_OBTAINS_RARE_ITEMS_AND_INGREDIENTS;
	
	@ClientString(id = 4628, message = "By the will of the Chaos, the power of Ashagen, the greatest assassin of the giants, has been combined with the ancient power of the earth and wind. Heightened in all senses, they now utilize their abilities in both battlefield and at home.")
	public static SystemMessageId BY_THE_WILL_OF_THE_CHAOS_THE_POWER_OF_ASHAGEN_THE_GREATEST_ASSASSIN_OF_THE_GIANTS_HAS_BEEN_COMBINED_WITH_THE_ANCIENT_POWER_OF_THE_EARTH_AND_WIND_HEIGHTENED_IN_ALL_SENSES_THEY_NOW_UTILIZE_THEIR_ABILITIES_IN_BOTH_BATTLEFIELD_AND_AT_HOME;
	
	@ClientString(id = 4629, message = "- Balanced Critical Damage and Critical Rate(br)- Stable damage-dealing")
	public static SystemMessageId BALANCED_CRITICAL_DAMAGE_AND_CRITICAL_RATE_BR_STABLE_DAMAGE_DEALING;
	
	@ClientString(id = 4630, message = "By the will of the Chaos, the power of Cranigg, the ancient giant hero with the Third Eye, has been combined with the ancient power of light. The Sagittarius can now pierce not only the body, but also the soul of an opponent as a result.")
	public static SystemMessageId BY_THE_WILL_OF_THE_CHAOS_THE_POWER_OF_CRANIGG_THE_ANCIENT_GIANT_HERO_WITH_THE_THIRD_EYE_HAS_BEEN_COMBINED_WITH_THE_ANCIENT_POWER_OF_LIGHT_THE_SAGITTARIUS_CAN_NOW_PIERCE_NOT_ONLY_THE_BODY_BUT_ALSO_THE_SOUL_OF_AN_OPPONENT_AS_A_RESULT;
	
	@ClientString(id = 4631, message = "- Quick Speed and Atk. Spd.(br)- Advantageous in a small battle")
	public static SystemMessageId QUICK_SPEED_AND_ATK_SPD_BR_ADVANTAGEOUS_IN_A_SMALL_BATTLE;
	
	@ClientString(id = 4632, message = "By the will of the Chaos, the power of Cranigg, the ancient giant hero with the Third Eye, has been combined with the ancient power of light. This power gave the greatest archers the power and concentration they needed.")
	public static SystemMessageId BY_THE_WILL_OF_THE_CHAOS_THE_POWER_OF_CRANIGG_THE_ANCIENT_GIANT_HERO_WITH_THE_THIRD_EYE_HAS_BEEN_COMBINED_WITH_THE_ANCIENT_POWER_OF_LIGHT_THIS_POWER_GAVE_THE_GREATEST_ARCHERS_THE_POWER_AND_CONCENTRATION_THEY_NEEDED;
	
	@ClientString(id = 4633, message = "- Highest P. Atk. among similar classes(br)- Great damage dealt in short time")
	public static SystemMessageId HIGHEST_P_ATK_AMONG_SIMILAR_CLASSES_BR_GREAT_DAMAGE_DEALT_IN_SHORT_TIME;
	
	@ClientString(id = 4634, message = "By the will of the Chaos, the power of Cranigg, the ancient giant hero with the Third Eye, has been combined with the ancient power of darkness. Ghost Sentinels, now endowed with explosive power and concentration, became feared archers throughout the land.")
	public static SystemMessageId BY_THE_WILL_OF_THE_CHAOS_THE_POWER_OF_CRANIGG_THE_ANCIENT_GIANT_HERO_WITH_THE_THIRD_EYE_HAS_BEEN_COMBINED_WITH_THE_ANCIENT_POWER_OF_DARKNESS_GHOST_SENTINELS_NOW_ENDOWED_WITH_EXPLOSIVE_POWER_AND_CONCENTRATION_BECAME_FEARED_ARCHERS_THROUGHOUT_THE_LAND;
	
	@ClientString(id = 4635, message = "- Great PvP skills")
	public static SystemMessageId GREAT_PVP_SKILLS;
	
	@ClientString(id = 4636, message = "By the will of the Chaos, the power of Cranigg, the ancient giant hero with the Third Eye, has been stacked with the ancient power of giants. The great power resulting from this was used to strengthen abilities to protect the self and party members.")
	public static SystemMessageId BY_THE_WILL_OF_THE_CHAOS_THE_POWER_OF_CRANIGG_THE_ANCIENT_GIANT_HERO_WITH_THE_THIRD_EYE_HAS_BEEN_STACKED_WITH_THE_ANCIENT_POWER_OF_GIANTS_THE_GREAT_POWER_RESULTING_FROM_THIS_WAS_USED_TO_STRENGTHEN_ABILITIES_TO_PROTECT_THE_SELF_AND_PARTY_MEMBERS;
	
	@ClientString(id = 4637, message = "- Well-rounded balance(br)- Use ranged magic (Vortex)")
	public static SystemMessageId WELL_ROUNDED_BALANCE_BR_USE_RANGED_MAGIC_VORTEX;
	
	@ClientString(id = 4638, message = "By the will of the Chaos, the power of Soltkreig, one of the 7 Sages of the giants, has been combined with the ancient power of light. Archmages that received this power were able to reach levels of magic that went beyond their present limits.")
	public static SystemMessageId BY_THE_WILL_OF_THE_CHAOS_THE_POWER_OF_SOLTKREIG_ONE_OF_THE_7_SAGES_OF_THE_GIANTS_HAS_BEEN_COMBINED_WITH_THE_ANCIENT_POWER_OF_LIGHT_ARCHMAGES_THAT_RECEIVED_THIS_POWER_WERE_ABLE_TO_REACH_LEVELS_OF_MAGIC_THAT_WENT_BEYOND_THEIR_PRESENT_LIMITS;
	
	@ClientString(id = 4639, message = "- Power M. Atk. paired with debuffs(br)- Advantageous in 1:1 battles")
	public static SystemMessageId POWER_M_ATK_PAIRED_WITH_DEBUFFS_BR_ADVANTAGEOUS_IN_1_1_BATTLES;
	
	@ClientString(id = 4640, message = "By the will of the Chaos, the power of Soltkreig, one of the 7 Sages of the giants, has been combined with the ancient power of darkness. Their strengthened magic allowed for more complex spells to be performed.")
	public static SystemMessageId BY_THE_WILL_OF_THE_CHAOS_THE_POWER_OF_SOLTKREIG_ONE_OF_THE_7_SAGES_OF_THE_GIANTS_HAS_BEEN_COMBINED_WITH_THE_ANCIENT_POWER_OF_DARKNESS_THEIR_STRENGTHENED_MAGIC_ALLOWED_FOR_MORE_COMPLEX_SPELLS_TO_BE_PERFORMED;
	
	@ClientString(id = 4641, message = "- Fast skill usage speed(br)- Use Vortex magic")
	public static SystemMessageId FAST_SKILL_USAGE_SPEED_BR_USE_VORTEX_MAGIC;
	
	@ClientString(id = 4642, message = "By the will of the Chaos, the power of Soltkreig, one of the 7 Sages of the giants, has been combined with the ancient power of light. They were now able to use the ultimate Elemental magic spells.")
	public static SystemMessageId BY_THE_WILL_OF_THE_CHAOS_THE_POWER_OF_SOLTKREIG_ONE_OF_THE_7_SAGES_OF_THE_GIANTS_HAS_BEEN_COMBINED_WITH_THE_ANCIENT_POWER_OF_LIGHT_THEY_WERE_NOW_ABLE_TO_USE_THE_ULTIMATE_ELEMENTAL_MAGIC_SPELLS;
	
	@ClientString(id = 4643, message = "- Highest M. Atk. among similar classes(br)- Use Vortex magic")
	public static SystemMessageId HIGHEST_M_ATK_AMONG_SIMILAR_CLASSES_BR_USE_VORTEX_MAGIC;
	
	@ClientString(id = 4644, message = "By the will of the Chaos, the power of Soltkreig, one of the 7 Sages of the giants, has been combined with the ancient power of light. Attribute magic could now be used beyond its limits.")
	public static SystemMessageId BY_THE_WILL_OF_THE_CHAOS_THE_POWER_OF_SOLTKREIG_ONE_OF_THE_7_SAGES_OF_THE_GIANTS_HAS_BEEN_COMBINED_WITH_THE_ANCIENT_POWER_OF_LIGHT_ATTRIBUTE_MAGIC_COULD_NOW_BE_USED_BEYOND_ITS_LIMITS;
	
	@ClientString(id = 4645, message = "- High P. Def. paired with debuffs(br)- Specializes in PvP")
	public static SystemMessageId HIGH_P_DEF_PAIRED_WITH_DEBUFFS_BR_SPECIALIZES_IN_PVP;
	
	@ClientString(id = 4646, message = "By the will of the Chaos, the power of Soltkreig, one of the 7 Sages of the giants, has been stacked with the ancient power of Katenar the giant. This has resulted in powers that rival even those of the giants.")
	public static SystemMessageId BY_THE_WILL_OF_THE_CHAOS_THE_POWER_OF_SOLTKREIG_ONE_OF_THE_7_SAGES_OF_THE_GIANTS_HAS_BEEN_STACKED_WITH_THE_ANCIENT_POWER_OF_KATENAR_THE_GIANT_THIS_HAS_RESULTED_IN_POWERS_THAT_RIVAL_EVEN_THOSE_OF_THE_GIANTS;
	
	@ClientString(id = 4647, message = "- Party buffer specializing in skills(br)- Shortened skill cooldowns(br)- Use AoE Mutation to aid party")
	public static SystemMessageId PARTY_BUFFER_SPECIALIZING_IN_SKILLS_BR_SHORTENED_SKILL_COOLDOWNS_BR_USE_AOE_MUTATION_TO_AID_PARTY;
	
	@ClientString(id = 4648, message = "By the will of the Chaos, the power of Leister, the giant that commanded the war between the giants and the gods, has been combined with the ancient power of light. As a result, Hierophants can now use other magnificent holy skills.")
	public static SystemMessageId BY_THE_WILL_OF_THE_CHAOS_THE_POWER_OF_LEISTER_THE_GIANT_THAT_COMMANDED_THE_WAR_BETWEEN_THE_GIANTS_AND_THE_GODS_HAS_BEEN_COMBINED_WITH_THE_ANCIENT_POWER_OF_LIGHT_AS_A_RESULT_HIEROPHANTS_CAN_NOW_USE_OTHER_MAGNIFICENT_HOLY_SKILLS;
	
	@ClientString(id = 4649, message = "- Party buffer based on self-defense(br)- Use AoE Silence to aid party")
	public static SystemMessageId PARTY_BUFFER_BASED_ON_SELF_DEFENSE_BR_USE_AOE_SILENCE_TO_AID_PARTY;
	
	@ClientString(id = 4650, message = "By the will of the Chaos, the power of Leister, the giant that commanded the war between the giants and the gods, has been combined with the ancient power of water. This increased magic power gave himself and people around him the holy power that brings out the ultimate strength.")
	public static SystemMessageId BY_THE_WILL_OF_THE_CHAOS_THE_POWER_OF_LEISTER_THE_GIANT_THAT_COMMANDED_THE_WAR_BETWEEN_THE_GIANTS_AND_THE_GODS_HAS_BEEN_COMBINED_WITH_THE_ANCIENT_POWER_OF_WATER_THIS_INCREASED_MAGIC_POWER_GAVE_HIMSELF_AND_PEOPLE_AROUND_HIM_THE_HOLY_POWER_THAT_BRINGS_OUT_THE_ULTIMATE_STRENGTH;
	
	@ClientString(id = 4651, message = "- Party buffer based on attack(br)- Use AoE Petrify to aid party")
	public static SystemMessageId PARTY_BUFFER_BASED_ON_ATTACK_BR_USE_AOE_PETRIFY_TO_AID_PARTY;
	
	@ClientString(id = 4652, message = "By the will of the Chaos, the power of Leister, the giant that commanded the war between the giants and the gods, has been combined with the ancient power of light. This power has maximized the strength of not only the Spectral Dancer but the entire party's attack power.")
	public static SystemMessageId BY_THE_WILL_OF_THE_CHAOS_THE_POWER_OF_LEISTER_THE_GIANT_THAT_COMMANDED_THE_WAR_BETWEEN_THE_GIANTS_AND_THE_GODS_HAS_BEEN_COMBINED_WITH_THE_ANCIENT_POWER_OF_LIGHT_THIS_POWER_HAS_MAXIMIZED_THE_STRENGTH_OF_NOT_ONLY_THE_SPECTRAL_DANCER_BUT_THE_ENTIRE_PARTY_S_ATTACK_POWER;
	
	@ClientString(id = 4653, message = "- Buffer specializing in clan wars and PvP(br)- Restrain standard P. Atk. To aid in clan war(br)- Specializes in clan-level buffs and CP boosts")
	public static SystemMessageId BUFFER_SPECIALIZING_IN_CLAN_WARS_AND_PVP_BR_RESTRAIN_STANDARD_P_ATK_TO_AID_IN_CLAN_WAR_BR_SPECIALIZES_IN_CLAN_LEVEL_BUFFS_AND_CP_BOOSTS;
	
	@ClientString(id = 4654, message = "By the will of the Chaos, the power of Leister, the giant that commanded the war between the giants and the gods, has been combined with the ancient power of light. This power came to protect not only the self but the entire community around the wielder.")
	public static SystemMessageId BY_THE_WILL_OF_THE_CHAOS_THE_POWER_OF_LEISTER_THE_GIANT_THAT_COMMANDED_THE_WAR_BETWEEN_THE_GIANTS_AND_THE_GODS_HAS_BEEN_COMBINED_WITH_THE_ANCIENT_POWER_OF_LIGHT_THIS_POWER_CAME_TO_PROTECT_NOT_ONLY_THE_SELF_BUT_THE_ENTIRE_COMMUNITY_AROUND_THE_WIELDER;
	
	@ClientString(id = 4655, message = "- Party buffer with balanced attack and defense(br)- Decreases enemy HP to aid party")
	public static SystemMessageId PARTY_BUFFER_WITH_BALANCED_ATTACK_AND_DEFENSE_BR_DECREASES_ENEMY_HP_TO_AID_PARTY;
	
	@ClientString(id = 4656, message = "By the will of the Chaos, the power of Leister, the giant that commanded the war between the giants and the gods, has been combined with the ancient power of light. This power came to be used to multiply the power of the self and the surrounding community.")
	public static SystemMessageId BY_THE_WILL_OF_THE_CHAOS_THE_POWER_OF_LEISTER_THE_GIANT_THAT_COMMANDED_THE_WAR_BETWEEN_THE_GIANTS_AND_THE_GODS_HAS_BEEN_COMBINED_WITH_THE_ANCIENT_POWER_OF_LIGHT_THIS_POWER_CAME_TO_BE_USED_TO_MULTIPLY_THE_POWER_OF_THE_SELF_AND_THE_SURROUNDING_COMMUNITY;
	
	@ClientString(id = 4657, message = "- Summoner specializing in Atk. Spd.(br)- Able to use cat-type servitors")
	public static SystemMessageId SUMMONER_SPECIALIZING_IN_ATK_SPD_BR_ABLE_TO_USE_CAT_TYPE_SERVITORS;
	
	@ClientString(id = 4658, message = "By the will of the Chaos, the power of Naviarope, the giant that could open and close the Dimensional Door at will, has been combined with the ancient power of light. This power traversed the dimensions and gave the Arcana Lord true mastery of the art of summoning.")
	public static SystemMessageId BY_THE_WILL_OF_THE_CHAOS_THE_POWER_OF_NAVIAROPE_THE_GIANT_THAT_COULD_OPEN_AND_CLOSE_THE_DIMENSIONAL_DOOR_AT_WILL_HAS_BEEN_COMBINED_WITH_THE_ANCIENT_POWER_OF_LIGHT_THIS_POWER_TRAVERSED_THE_DIMENSIONS_AND_GAVE_THE_ARCANA_LORD_TRUE_MASTERY_OF_THE_ART_OF_SUMMONING;
	
	@ClientString(id = 4659, message = "- Summoner specializing in Critical Damage(br)- Able to use unicorn-type servitors")
	public static SystemMessageId SUMMONER_SPECIALIZING_IN_CRITICAL_DAMAGE_BR_ABLE_TO_USE_UNICORN_TYPE_SERVITORS;
	
	@ClientString(id = 4660, message = "By the will of the Chaos, the power of Naviarope, the giant that could open and close the Dimensional Door at will, has been combined with the ancient power of light. With this power, the Elemental Master came to use summoning skills based on the highest Elemental Magic.")
	public static SystemMessageId BY_THE_WILL_OF_THE_CHAOS_THE_POWER_OF_NAVIAROPE_THE_GIANT_THAT_COULD_OPEN_AND_CLOSE_THE_DIMENSIONAL_DOOR_AT_WILL_HAS_BEEN_COMBINED_WITH_THE_ANCIENT_POWER_OF_LIGHT_WITH_THIS_POWER_THE_ELEMENTAL_MASTER_CAME_TO_USE_SUMMONING_SKILLS_BASED_ON_THE_HIGHEST_ELEMENTAL_MAGIC;
	
	@ClientString(id = 4661, message = "- Summoner specializing in P. Atk.(br)- Able to use phantom-type servitors")
	public static SystemMessageId SUMMONER_SPECIALIZING_IN_P_ATK_BR_ABLE_TO_USE_PHANTOM_TYPE_SERVITORS;
	
	@ClientString(id = 4662, message = "By the will of the Chaos, the power of Naviarope, the giant that could open and close the Dimensional Door at will, has been combined with the ancient power of darkness. This power enabled powerful summoning skills for the Spectral Master.")
	public static SystemMessageId BY_THE_WILL_OF_THE_CHAOS_THE_POWER_OF_NAVIAROPE_THE_GIANT_THAT_COULD_OPEN_AND_CLOSE_THE_DIMENSIONAL_DOOR_AT_WILL_HAS_BEEN_COMBINED_WITH_THE_ANCIENT_POWER_OF_DARKNESS_THIS_POWER_ENABLED_POWERFUL_SUMMONING_SKILLS_FOR_THE_SPECTRAL_MASTER;
	
	@ClientString(id = 4663, message = "- Healer with great restorative powers(br)- Specializes in restoring clan members' HP")
	public static SystemMessageId HEALER_WITH_GREAT_RESTORATIVE_POWERS_BR_SPECIALIZES_IN_RESTORING_CLAN_MEMBERS_HP;
	
	@ClientString(id = 4664, message = "By the will of the Chaos, the power of Lakcis, the forefather of holy magic who took and improved Einhasad's power, has been combined with the ancient power of light. This enabled the Aeore Cardinal to use miraculous magic.")
	public static SystemMessageId BY_THE_WILL_OF_THE_CHAOS_THE_POWER_OF_LAKCIS_THE_FOREFATHER_OF_HOLY_MAGIC_WHO_TOOK_AND_IMPROVED_EINHASAD_S_POWER_HAS_BEEN_COMBINED_WITH_THE_ANCIENT_POWER_OF_LIGHT_THIS_ENABLED_THE_AEORE_CARDINAL_TO_USE_MIRACULOUS_MAGIC;
	
	@ClientString(id = 4665, message = "- Healer with fast chain skill usage(br)- Specializes in MP Recovery")
	public static SystemMessageId HEALER_WITH_FAST_CHAIN_SKILL_USAGE_BR_SPECIALIZES_IN_MP_RECOVERY;
	
	@ClientString(id = 4666, message = "By the will of the Chaos, the power of Lakcis, the forefather of holy magic who took and improved Einhasad's power, has been combined with the ancient power of light and water. This power was used not only to protect one's community but to protect the peace of the world.")
	public static SystemMessageId BY_THE_WILL_OF_THE_CHAOS_THE_POWER_OF_LAKCIS_THE_FOREFATHER_OF_HOLY_MAGIC_WHO_TOOK_AND_IMPROVED_EINHASAD_S_POWER_HAS_BEEN_COMBINED_WITH_THE_ANCIENT_POWER_OF_LIGHT_AND_WATER_THIS_POWER_WAS_USED_NOT_ONLY_TO_PROTECT_ONE_S_COMMUNITY_BUT_TO_PROTECT_THE_PEACE_OF_THE_WORLD;
	
	@ClientString(id = 4667, message = "- Healer with powerful M. Atk.(br)- Specializes in MP Recovery")
	public static SystemMessageId HEALER_WITH_POWERFUL_M_ATK_BR_SPECIALIZES_IN_MP_RECOVERY;
	
	@ClientString(id = 4668, message = "By the will of the Chaos, the power of Lakcis, the forefather of holy magic who took and improved Einhasad's power, has been combined with the ancient power of darkness. The heightened divine power was used to protect one's community and brothers in arms.")
	public static SystemMessageId BY_THE_WILL_OF_THE_CHAOS_THE_POWER_OF_LAKCIS_THE_FOREFATHER_OF_HOLY_MAGIC_WHO_TOOK_AND_IMPROVED_EINHASAD_S_POWER_HAS_BEEN_COMBINED_WITH_THE_ANCIENT_POWER_OF_DARKNESS_THE_HEIGHTENED_DIVINE_POWER_WAS_USED_TO_PROTECT_ONE_S_COMMUNITY_AND_BROTHERS_IN_ARMS;
	
	@ClientString(id = 4669, message = "Melee Damage Dealer")
	public static SystemMessageId MELEE_DAMAGE_DEALER2;
	
	@ClientString(id = 4670, message = "- Specizlizes in Fist Weapons(br) - Attacks from the Side(br) - Fast Atk. Spd.")
	public static SystemMessageId SPECIZLIZES_IN_FIST_WEAPONS_BR_ATTACKS_FROM_THE_SIDE_BR_FAST_ATK_SPD;
	
	@ClientString(id = 4671, message = "Eviscerators can manipulate gravity to their advantage. Their main strength lies in shifting their own center of gravity to add to their speed and attack speed.")
	public static SystemMessageId EVISCERATORS_CAN_MANIPULATE_GRAVITY_TO_THEIR_ADVANTAGE_THEIR_MAIN_STRENGTH_LIES_IN_SHIFTING_THEIR_OWN_CENTER_OF_GRAVITY_TO_ADD_TO_THEIR_SPEED_AND_ATTACK_SPEED;
	
	@ClientString(id = 4672, message = "Magic Damage Dealer")
	public static SystemMessageId MAGIC_DAMAGE_DEALER2;
	
	@ClientString(id = 4673, message = "- Specializes in magical two-handed weapons(br) - Close-range Damage Spells(br) - Uses Wind for Defense")
	public static SystemMessageId SPECIALIZES_IN_MAGICAL_TWO_HANDED_WEAPONS_BR_CLOSE_RANGE_DAMAGE_SPELLS_BR_USES_WIND_FOR_DEFENSE;
	
	@ClientString(id = 4674, message = "Able to tap into the power of the wind god, Sayha's Seers can diffuse themselves into the wind for transport or defenses. Their talents account for their extraordinary survivability.")
	public static SystemMessageId ABLE_TO_TAP_INTO_THE_POWER_OF_THE_WIND_GOD_SAYHA_S_SEERS_CAN_DIFFUSE_THEMSELVES_INTO_THE_WIND_FOR_TRANSPORT_OR_DEFENSES_THEIR_TALENTS_ACCOUNT_FOR_THEIR_EXTRAORDINARY_SURVIVABILITY;
	
	@ClientString(id = 4701, message = "You can easily adjust performance to the factory setting.")
	public static SystemMessageId YOU_CAN_EASILY_ADJUST_PERFORMANCE_TO_THE_FACTORY_SETTING;
	
	@ClientString(id = 4702, message = "Lower the performance of the game you are not playing, to decrease load on the computer.")
	public static SystemMessageId LOWER_THE_PERFORMANCE_OF_THE_GAME_YOU_ARE_NOT_PLAYING_TO_DECREASE_LOAD_ON_THE_COMPUTER;
	
	@ClientString(id = 4703, message = "Hide items dropped on the field.")
	public static SystemMessageId HIDE_ITEMS_DROPPED_ON_THE_FIELD;
	
	@ClientString(id = 4704, message = "Adjust game screen to full screen. Uncheck this to switch to window mode.")
	public static SystemMessageId ADJUST_GAME_SCREEN_TO_FULL_SCREEN_UNCHECK_THIS_TO_SWITCH_TO_WINDOW_MODE;
	
	@ClientString(id = 4705, message = "Adjust game resolution.")
	public static SystemMessageId ADJUST_GAME_RESOLUTION;
	
	@ClientString(id = 4706, message = "Adjust game refresh rate.")
	public static SystemMessageId ADJUST_GAME_REFRESH_RATE;
	
	@ClientString(id = 4707, message = "Adjust game screen brightness.")
	public static SystemMessageId ADJUST_GAME_SCREEN_BRIGHTNESS;
	
	@ClientString(id = 4708, message = "Adjust texture quality. If this is set too high, performance might decrease.")
	public static SystemMessageId ADJUST_TEXTURE_QUALITY_IF_THIS_IS_SET_TOO_HIGH_PERFORMANCE_MIGHT_DECREASE;
	
	@ClientString(id = 4709, message = "Adjust modeling quality. If this is set too high, performance might decrease.")
	public static SystemMessageId ADJUST_MODELING_QUALITY_IF_THIS_IS_SET_TOO_HIGH_PERFORMANCE_MIGHT_DECREASE;
	
	@ClientString(id = 4710, message = "Adjust motion quality. If this is set too high, performance might decrease.")
	public static SystemMessageId ADJUST_MOTION_QUALITY_IF_THIS_IS_SET_TOO_HIGH_PERFORMANCE_MIGHT_DECREASE;
	
	@ClientString(id = 4711, message = "Adjust effect quality. If this is set too high, performance might decrease.")
	public static SystemMessageId ADJUST_EFFECT_QUALITY_IF_THIS_IS_SET_TOO_HIGH_PERFORMANCE_MIGHT_DECREASE;
	
	@ClientString(id = 4712, message = "Adjust terrain expression range. If this is set too high, performance might decrease.")
	public static SystemMessageId ADJUST_TERRAIN_EXPRESSION_RANGE_IF_THIS_IS_SET_TOO_HIGH_PERFORMANCE_MIGHT_DECREASE;
	
	@ClientString(id = 4713, message = "Adjust character expression range. If this is set too high, performance might decrease.")
	public static SystemMessageId ADJUST_CHARACTER_EXPRESSION_RANGE_IF_THIS_IS_SET_TOO_HIGH_PERFORMANCE_MIGHT_DECREASE;
	
	@ClientString(id = 4714, message = "Adjust weather effect. If this is set too high, performance might decrease.")
	public static SystemMessageId ADJUST_WEATHER_EFFECT_IF_THIS_IS_SET_TOO_HIGH_PERFORMANCE_MIGHT_DECREASE;
	
	@ClientString(id = 4715, message = "Adjust the number of characters displayed at the same time. If this is set too high, performance might decrease.")
	public static SystemMessageId ADJUST_THE_NUMBER_OF_CHARACTERS_DISPLAYED_AT_THE_SAME_TIME_IF_THIS_IS_SET_TOO_HIGH_PERFORMANCE_MIGHT_DECREASE;
	
	@ClientString(id = 4716, message = "Improve the aliasing of characters and objects. If this is set too high, performance might decrease.")
	public static SystemMessageId IMPROVE_THE_ALIASING_OF_CHARACTERS_AND_OBJECTS_IF_THIS_IS_SET_TOO_HIGH_PERFORMANCE_MIGHT_DECREASE;
	
	@ClientString(id = 4717, message = "Adjust reflection effect. If you use this function, performance might decrease.")
	public static SystemMessageId ADJUST_REFLECTION_EFFECT_IF_YOU_USE_THIS_FUNCTION_PERFORMANCE_MIGHT_DECREASE;
	
	@ClientString(id = 4718, message = "Adjust glow effect and HDR rendering. If you use this function, performance might decrease.")
	public static SystemMessageId ADJUST_GLOW_EFFECT_AND_HDR_RENDERING_IF_YOU_USE_THIS_FUNCTION_PERFORMANCE_MIGHT_DECREASE;
	
	@ClientString(id = 4719, message = "Use improved shader effect.")
	public static SystemMessageId USE_IMPROVED_SHADER_EFFECT;
	
	@ClientString(id = 4720, message = "Display shadows of characters and objects. If you check this setting, performance might decrease.")
	public static SystemMessageId DISPLAY_SHADOWS_OF_CHARACTERS_AND_OBJECTS_IF_YOU_CHECK_THIS_SETTING_PERFORMANCE_MIGHT_DECREASE;
	
	@ClientString(id = 4721, message = "Display all background objects. If you check this setting, performance might decrease.")
	public static SystemMessageId DISPLAY_ALL_BACKGROUND_OBJECTS_IF_YOU_CHECK_THIS_SETTING_PERFORMANCE_MIGHT_DECREASE;
	
	@ClientString(id = 4722, message = "Use GPU for improved performance.")
	public static SystemMessageId USE_GPU_FOR_IMPROVED_PERFORMANCE;
	
	@ClientString(id = 4723, message = "Lower texture and modeling quality to maintain the minimum frame rate.")
	public static SystemMessageId LOWER_TEXTURE_AND_MODELING_QUALITY_TO_MAINTAIN_THE_MINIMUM_FRAME_RATE;
	
	@ClientString(id = 4724, message = "Apply out-focus effect to the background. If you check this setting, performance might decrease.")
	public static SystemMessageId APPLY_OUT_FOCUS_EFFECT_TO_THE_BACKGROUND_IF_YOU_CHECK_THIS_SETTING_PERFORMANCE_MIGHT_DECREASE;
	
	@ClientString(id = 4725, message = "Express objects realistically. If you check this setting, performance might decrease.")
	public static SystemMessageId EXPRESS_OBJECTS_REALISTICALLY_IF_YOU_CHECK_THIS_SETTING_PERFORMANCE_MIGHT_DECREASE;
	
	@ClientString(id = 4726, message = "Express detailed shadows of characters. If you check this setting, performance might decrease.")
	public static SystemMessageId EXPRESS_DETAILED_SHADOWS_OF_CHARACTERS_IF_YOU_CHECK_THIS_SETTING_PERFORMANCE_MIGHT_DECREASE;
	
	@ClientString(id = 4727, message = "Select a language to use in the game.")
	public static SystemMessageId SELECT_A_LANGUAGE_TO_USE_IN_THE_GAME;
	
	@ClientString(id = 4728, message = "Use keyboard security.")
	public static SystemMessageId USE_KEYBOARD_SECURITY;
	
	@ClientString(id = 4729, message = "Game pad control is supported.")
	public static SystemMessageId GAME_PAD_CONTROL_IS_SUPPORTED;
	
	@ClientString(id = 4730, message = "Match view point and moving direction.")
	public static SystemMessageId MATCH_VIEW_POINT_AND_MOVING_DIRECTION;
	
	@ClientString(id = 4731, message = "Right-click not to use the function for reverting to default view point.")
	public static SystemMessageId RIGHT_CLICK_NOT_TO_USE_THE_FUNCTION_FOR_REVERTING_TO_DEFAULT_VIEW_POINT;
	
	@ClientString(id = 4732, message = "Reverse zoom-in/out of the mouse wheel.")
	public static SystemMessageId REVERSE_ZOOM_IN_OUT_OF_THE_MOUSE_WHEEL;
	
	@ClientString(id = 4733, message = "Right-click to open a simple menu.")
	public static SystemMessageId RIGHT_CLICK_TO_OPEN_A_SIMPLE_MENU;
	
	@ClientString(id = 4734, message = "Mute all.")
	public static SystemMessageId MUTE_ALL;
	
	@ClientString(id = 4735, message = "Adjust volume of all sounds.")
	public static SystemMessageId ADJUST_VOLUME_OF_ALL_SOUNDS;
	
	@ClientString(id = 4736, message = "Adjust volume of the background music.")
	public static SystemMessageId ADJUST_VOLUME_OF_THE_BACKGROUND_MUSIC;
	
	@ClientString(id = 4737, message = "Adjust volume of sound effects.")
	public static SystemMessageId ADJUST_VOLUME_OF_SOUND_EFFECTS;
	
	@ClientString(id = 4738, message = "Adjust volume of environment sounds.")
	public static SystemMessageId ADJUST_VOLUME_OF_ENVIRONMENT_SOUNDS;
	
	@ClientString(id = 4739, message = "Adjust volume of the system voice.")
	public static SystemMessageId ADJUST_VOLUME_OF_THE_SYSTEM_VOICE;
	
	@ClientString(id = 4740, message = "Adjust volume of NPC voices.")
	public static SystemMessageId ADJUST_VOLUME_OF_NPC_VOICES;
	
	@ClientString(id = 4741, message = "Listen to the tutorial voice.")
	public static SystemMessageId LISTEN_TO_THE_TUTORIAL_VOICE;
	
	@ClientString(id = 4742, message = "Display symbols appropriate for the specific chatting type in the window.")
	public static SystemMessageId DISPLAY_SYMBOLS_APPROPRIATE_FOR_THE_SPECIFIC_CHATTING_TYPE_IN_THE_WINDOW;
	
	@ClientString(id = 4743, message = "Press the Enter key to start chatting.")
	public static SystemMessageId PRESS_THE_ENTER_KEY_TO_START_CHATTING;
	
	@ClientString(id = 4744, message = "Show standard chat.")
	public static SystemMessageId SHOW_STANDARD_CHAT;
	
	@ClientString(id = 4745, message = "Show trade chat.")
	public static SystemMessageId SHOW_TRADE_CHAT;
	
	@ClientString(id = 4746, message = "Show party chat.")
	public static SystemMessageId SHOW_PARTY_CHAT;
	
	@ClientString(id = 4747, message = "Show clan chat.")
	public static SystemMessageId SHOW_CLAN_CHAT;
	
	@ClientString(id = 4748, message = "Show alliance chat.")
	public static SystemMessageId SHOW_ALLIANCE_CHAT;
	
	@ClientString(id = 4749, message = "Show battle chat.")
	public static SystemMessageId SHOW_BATTLE_CHAT;
	
	@ClientString(id = 4750, message = "Show command chat.")
	public static SystemMessageId SHOW_COMMAND_CHAT;
	
	@ClientString(id = 4751, message = "Show shouts.")
	public static SystemMessageId SHOW_SHOUTS;
	
	@ClientString(id = 4752, message = "Show whispers.")
	public static SystemMessageId SHOW_WHISPERS;
	
	@ClientString(id = 4753, message = "Show heroes' chat throughout the world.")
	public static SystemMessageId SHOW_HEROES_CHAT_THROUGHOUT_THE_WORLD;
	
	@ClientString(id = 4754, message = "Show NPC dialogue.")
	public static SystemMessageId SHOW_NPC_DIALOGUE;
	
	@ClientString(id = 4755, message = "Show command leader's chat as a screen message.")
	public static SystemMessageId SHOW_COMMAND_LEADER_S_CHAT_AS_A_SCREEN_MESSAGE;
	
	@ClientString(id = 4756, message = "Show damage during a battle.")
	public static SystemMessageId SHOW_DAMAGE_DURING_A_BATTLE;
	
	@ClientString(id = 4757, message = "Show messages about the consumption of consumable items.")
	public static SystemMessageId SHOW_MESSAGES_ABOUT_THE_CONSUMPTION_OF_CONSUMABLE_ITEMS;
	
	@ClientString(id = 4758, message = "Show damage.")
	public static SystemMessageId SHOW_DAMAGE;
	
	@ClientString(id = 4759, message = "Show consumable items' usage status.")
	public static SystemMessageId SHOW_CONSUMABLE_ITEMS_USAGE_STATUS;
	
	@ClientString(id = 4760, message = "Alert with sound effects when there is a new message that contains keywords.")
	public static SystemMessageId ALERT_WITH_SOUND_EFFECTS_WHEN_THERE_IS_A_NEW_MESSAGE_THAT_CONTAINS_KEYWORDS;
	
	@ClientString(id = 4761, message = "Delete the entered keyword.")
	public static SystemMessageId DELETE_THE_ENTERED_KEYWORD;
	
	@ClientString(id = 4762, message = "Make rules about item acquiring during a party hunt.")
	public static SystemMessageId MAKE_RULES_ABOUT_ITEM_ACQUIRING_DURING_A_PARTY_HUNT;
	
	@ClientString(id = 4763, message = "Do not receive duel requests.")
	public static SystemMessageId DO_NOT_RECEIVE_DUEL_REQUESTS;
	
	@ClientString(id = 4764, message = "Do not receive individual trade requests.")
	public static SystemMessageId DO_NOT_RECEIVE_INDIVIDUAL_TRADE_REQUESTS;
	
	@ClientString(id = 4765, message = "Do not receive party requests.")
	public static SystemMessageId DO_NOT_RECEIVE_PARTY_REQUESTS;
	
	@ClientString(id = 4766, message = "Do not receive friend requests.")
	public static SystemMessageId DO_NOT_RECEIVE_FRIEND_REQUESTS;
	
	@ClientString(id = 4767, message = "Do not receive couple emote requests.")
	public static SystemMessageId DO_NOT_RECEIVE_COUPLE_EMOTE_REQUESTS;
	
	@ClientString(id = 4768, message = "Run the automatic substitute function when you log into the game.")
	public static SystemMessageId RUN_THE_AUTOMATIC_SUBSTITUTE_FUNCTION_WHEN_YOU_LOG_INTO_THE_GAME;
	
	@ClientString(id = 4769, message = "Display party members on the radar map.")
	public static SystemMessageId DISPLAY_PARTY_MEMBERS_ON_THE_RADAR_MAP;
	
	@ClientString(id = 4770, message = "Display quest tutorial NPCs on the radar map.")
	public static SystemMessageId DISPLAY_QUEST_TUTORIAL_NPCS_ON_THE_RADAR_MAP;
	
	@ClientString(id = 4771, message = "Display monsters on the radar map.")
	public static SystemMessageId DISPLAY_MONSTERS_ON_THE_RADAR_MAP;
	
	@ClientString(id = 4772, message = "Display my current location on the radar map.")
	public static SystemMessageId DISPLAY_MY_CURRENT_LOCATION_ON_THE_RADAR_MAP;
	
	@ClientString(id = 4773, message = "Lock the radar map so it doesn't rotate according to the character's direction.")
	public static SystemMessageId LOCK_THE_RADAR_MAP_SO_IT_DOESN_T_ROTATE_ACCORDING_TO_THE_CHARACTER_S_DIRECTION;
	
	@ClientString(id = 4774, message = "Display the name of a new location you move into.")
	public static SystemMessageId DISPLAY_THE_NAME_OF_A_NEW_LOCATION_YOU_MOVE_INTO;
	
	@ClientString(id = 4775, message = "Show information useful for game play on the loading screen.")
	public static SystemMessageId SHOW_INFORMATION_USEFUL_FOR_GAME_PLAY_ON_THE_LOADING_SCREEN;
	
	@ClientString(id = 4776, message = "Show the tutorial that teaches basic game play.")
	public static SystemMessageId SHOW_THE_TUTORIAL_THAT_TEACHES_BASIC_GAME_PLAY;
	
	@ClientString(id = 4777, message = "Use the cursor made specifically for the game.")
	public static SystemMessageId USE_THE_CURSOR_MADE_SPECIFICALLY_FOR_THE_GAME;
	
	@ClientString(id = 4778, message = "Hide PC points.")
	public static SystemMessageId HIDE_PC_POINTS;
	
	@ClientString(id = 4779, message = "Display effects that show quest destinations.")
	public static SystemMessageId DISPLAY_EFFECTS_THAT_SHOW_QUEST_DESTINATIONS;
	
	@ClientString(id = 4780, message = "Select screenshot quality.")
	public static SystemMessageId SELECT_SCREENSHOT_QUALITY;
	
	@ClientString(id = 4781, message = "Make inactive windows translucent.")
	public static SystemMessageId MAKE_INACTIVE_WINDOWS_TRANSLUCENT;
	
	@ClientString(id = 4782, message = "Hide all speech balloons.")
	public static SystemMessageId HIDE_ALL_SPEECH_BALLOONS;
	
	@ClientString(id = 4783, message = "Hide all speech balloons of NPCs.")
	public static SystemMessageId HIDE_ALL_SPEECH_BALLOONS_OF_NPCS;
	
	@ClientString(id = 4784, message = "Hide all private stores.")
	public static SystemMessageId HIDE_ALL_PRIVATE_STORES;
	
	@ClientString(id = 4785, message = "Hide all private workshops.")
	public static SystemMessageId HIDE_ALL_PRIVATE_WORKSHOPS;
	
	@ClientString(id = 4786, message = "Turn on or off all name information.")
	public static SystemMessageId TURN_ON_OR_OFF_ALL_NAME_INFORMATION;
	
	@ClientString(id = 4787, message = "Display my name.")
	public static SystemMessageId DISPLAY_MY_NAME;
	
	@ClientString(id = 4788, message = "Display names of monsters.")
	public static SystemMessageId DISPLAY_NAMES_OF_MONSTERS;
	
	@ClientString(id = 4789, message = "Display names of other players.")
	public static SystemMessageId DISPLAY_NAMES_OF_OTHER_PLAYERS;
	
	@ClientString(id = 4790, message = "Display clan member name.")
	public static SystemMessageId DISPLAY_CLAN_MEMBER_NAME;
	
	@ClientString(id = 4791, message = "Display names of party members.")
	public static SystemMessageId DISPLAY_NAMES_OF_PARTY_MEMBERS;
	
	@ClientString(id = 4792, message = "Display names of normal players.")
	public static SystemMessageId DISPLAY_NAMES_OF_NORMAL_PLAYERS;
	
	@ClientString(id = 4793, message = "Turn on or off status of all gauges.")
	public static SystemMessageId TURN_ON_OR_OFF_STATUS_OF_ALL_GAUGES;
	
	@ClientString(id = 4794, message = "Display my gauge status.")
	public static SystemMessageId DISPLAY_MY_GAUGE_STATUS;
	
	@ClientString(id = 4795, message = "Display gauge status of party members.")
	public static SystemMessageId DISPLAY_GAUGE_STATUS_OF_PARTY_MEMBERS;
	
	@ClientString(id = 4796, message = "Show pet and servitor gauge.")
	public static SystemMessageId SHOW_PET_AND_SERVITOR_GAUGE;
	
	@ClientString(id = 4797, message = "Show party members' pet and servitor gauge.")
	public static SystemMessageId SHOW_PARTY_MEMBERS_PET_AND_SERVITOR_GAUGE;
	
	@ClientString(id = 4798, message = "Show NPC gauge.")
	public static SystemMessageId SHOW_NPC_GAUGE;
	
	@ClientString(id = 4799, message = "Adjust cloak display. Using this function could lower your computer performance.")
	public static SystemMessageId ADJUST_CLOAK_DISPLAY_USING_THIS_FUNCTION_COULD_LOWER_YOUR_COMPUTER_PERFORMANCE2;
	
	@ClientString(id = 4800, message = "Turn on or off all information about targets.")
	public static SystemMessageId TURN_ON_OR_OFF_ALL_INFORMATION_ABOUT_TARGETS;
	
	@ClientString(id = 4801, message = "Display casting bar of targeted skills.")
	public static SystemMessageId DISPLAY_CASTING_BAR_OF_TARGETED_SKILLS;
	
	@ClientString(id = 4802, message = "Display abnormal status of all targets.")
	public static SystemMessageId DISPLAY_ABNORMAL_STATUS_OF_ALL_TARGETS;
	
	@ClientString(id = 4803, message = "Turn on or off all my damage text.")
	public static SystemMessageId TURN_ON_OR_OFF_ALL_MY_DAMAGE_TEXT;
	
	@ClientString(id = 4804, message = "Display my HP recovery.")
	public static SystemMessageId DISPLAY_MY_HP_RECOVERY;
	
	@ClientString(id = 4805, message = "Display my Mana recovery.")
	public static SystemMessageId DISPLAY_MY_MANA_RECOVERY;
	
	@ClientString(id = 4806, message = "Display my XP acquiring.")
	public static SystemMessageId DISPLAY_MY_XP_ACQUIRING;
	
	@ClientString(id = 4807, message = "Display my SP acquiring.")
	public static SystemMessageId DISPLAY_MY_SP_ACQUIRING;
	
	@ClientString(id = 4808, message = "Display my normal damage.")
	public static SystemMessageId DISPLAY_MY_NORMAL_DAMAGE;
	
	@ClientString(id = 4809, message = "Display my constant damage.")
	public static SystemMessageId DISPLAY_MY_CONSTANT_DAMAGE;
	
	@ClientString(id = 4810, message = "Display my critical hits.")
	public static SystemMessageId DISPLAY_MY_CRITICAL_HITS;
	
	@ClientString(id = 4811, message = "Display my immunity success.")
	public static SystemMessageId DISPLAY_MY_IMMUNITY_SUCCESS;
	
	@ClientString(id = 4812, message = "Display my resistance success.")
	public static SystemMessageId DISPLAY_MY_RESISTANCE_SUCCESS;
	
	@ClientString(id = 4813, message = "Display my blocking success.")
	public static SystemMessageId DISPLAY_MY_BLOCKING_SUCCESS;
	
	@ClientString(id = 4814, message = "Display my evasion success.")
	public static SystemMessageId DISPLAY_MY_EVASION_SUCCESS;
	
	@ClientString(id = 4815, message = "Turn on or off all damage text of attack targets.")
	public static SystemMessageId TURN_ON_OR_OFF_ALL_DAMAGE_TEXT_OF_ATTACK_TARGETS;
	
	@ClientString(id = 4816, message = "Display normal damage of attack targets.")
	public static SystemMessageId DISPLAY_NORMAL_DAMAGE_OF_ATTACK_TARGETS;
	
	@ClientString(id = 4817, message = "Display constant damage of attack targets.")
	public static SystemMessageId DISPLAY_CONSTANT_DAMAGE_OF_ATTACK_TARGETS;
	
	@ClientString(id = 4818, message = "Display critical hits of attack targets.")
	public static SystemMessageId DISPLAY_CRITICAL_HITS_OF_ATTACK_TARGETS;
	
	@ClientString(id = 4819, message = "Display over-hits of attack targets.")
	public static SystemMessageId DISPLAY_OVER_HITS_OF_ATTACK_TARGETS;
	
	@ClientString(id = 4820, message = "Display immunity success of attack targets.")
	public static SystemMessageId DISPLAY_IMMUNITY_SUCCESS_OF_ATTACK_TARGETS;
	
	@ClientString(id = 4821, message = "Display resistance success of attack targets.")
	public static SystemMessageId DISPLAY_RESISTANCE_SUCCESS_OF_ATTACK_TARGETS;
	
	@ClientString(id = 4822, message = "Display blocking success of attack targets.")
	public static SystemMessageId DISPLAY_BLOCKING_SUCCESS_OF_ATTACK_TARGETS;
	
	@ClientString(id = 4823, message = "Display evasion success of attack targets.")
	public static SystemMessageId DISPLAY_EVASION_SUCCESS_OF_ATTACK_TARGETS;
	
	@ClientString(id = 4824, message = "Turn on or off all damage text of recovery targets.")
	public static SystemMessageId TURN_ON_OR_OFF_ALL_DAMAGE_TEXT_OF_RECOVERY_TARGETS;
	
	@ClientString(id = 4825, message = "Display HP recovery of recovery targets.")
	public static SystemMessageId DISPLAY_HP_RECOVERY_OF_RECOVERY_TARGETS;
	
	@ClientString(id = 4826, message = "Display Mana recovery of recovery targets.")
	public static SystemMessageId DISPLAY_MANA_RECOVERY_OF_RECOVERY_TARGETS;
	
	@ClientString(id = 4827, message = "Display critical hits of recovery targets.")
	public static SystemMessageId DISPLAY_CRITICAL_HITS_OF_RECOVERY_TARGETS;
	
	@ClientString(id = 4828, message = "Display immunity success of recovery targets.")
	public static SystemMessageId DISPLAY_IMMUNITY_SUCCESS_OF_RECOVERY_TARGETS;
	
	@ClientString(id = 4829, message = "Turn on or off all damage text of pets and servitors.")
	public static SystemMessageId TURN_ON_OR_OFF_ALL_DAMAGE_TEXT_OF_PETS_AND_SERVITORS;
	
	@ClientString(id = 4830, message = "Display HP recovery of pets and servitors.")
	public static SystemMessageId DISPLAY_HP_RECOVERY_OF_PETS_AND_SERVITORS;
	
	@ClientString(id = 4831, message = "Display Mana recovery of pets and servitors.")
	public static SystemMessageId DISPLAY_MANA_RECOVERY_OF_PETS_AND_SERVITORS;
	
	@ClientString(id = 4832, message = "Display XP acquiring of pets and servitors.")
	public static SystemMessageId DISPLAY_XP_ACQUIRING_OF_PETS_AND_SERVITORS;
	
	@ClientString(id = 4833, message = "Display normal damage of pets and servitors.")
	public static SystemMessageId DISPLAY_NORMAL_DAMAGE_OF_PETS_AND_SERVITORS;
	
	@ClientString(id = 4834, message = "Display constant damage of pets and servitors.")
	public static SystemMessageId DISPLAY_CONSTANT_DAMAGE_OF_PETS_AND_SERVITORS;
	
	@ClientString(id = 4835, message = "Display critical hits of pets and servitors.")
	public static SystemMessageId DISPLAY_CRITICAL_HITS_OF_PETS_AND_SERVITORS;
	
	@ClientString(id = 4836, message = "Display immunity success of pets and servitors.")
	public static SystemMessageId DISPLAY_IMMUNITY_SUCCESS_OF_PETS_AND_SERVITORS;
	
	@ClientString(id = 4837, message = "Display resistance success of pets and servitors.")
	public static SystemMessageId DISPLAY_RESISTANCE_SUCCESS_OF_PETS_AND_SERVITORS;
	
	@ClientString(id = 4838, message = "Display evasion success of pets and servitors.")
	public static SystemMessageId DISPLAY_EVASION_SUCCESS_OF_PETS_AND_SERVITORS;
	
	@ClientString(id = 4839, message = "Return all windows to their default locations.")
	public static SystemMessageId RETURN_ALL_WINDOWS_TO_THEIR_DEFAULT_LOCATIONS;
	
	@ClientString(id = 4840, message = "Reset the settings of the selected tab.")
	public static SystemMessageId RESET_THE_SETTINGS_OF_THE_SELECTED_TAB;
	
	@ClientString(id = 4841, message = "Apply changes and close the window.")
	public static SystemMessageId APPLY_CHANGES_AND_CLOSE_THE_WINDOW;
	
	@ClientString(id = 4842, message = "Apply changes.")
	public static SystemMessageId APPLY_CHANGES;
	
	@ClientString(id = 4843, message = "Do not apply changes, and close the window.")
	public static SystemMessageId DO_NOT_APPLY_CHANGES_AND_CLOSE_THE_WINDOW;
	
	@ClientString(id = 4844, message = "Turn on or off all speech balloon information.")
	public static SystemMessageId TURN_ON_OR_OFF_ALL_SPEECH_BALLOON_INFORMATION;
	
	@ClientString(id = 4845, message = "Select channel from selected tabs.")
	public static SystemMessageId SELECT_CHANNEL_FROM_SELECTED_TABS;
	
	@ClientString(id = 4846, message = "Set selected channel's message to default.")
	public static SystemMessageId SET_SELECTED_CHANNEL_S_MESSAGE_TO_DEFAULT;
	
	@ClientString(id = 4847, message = "Show system messages.")
	public static SystemMessageId SHOW_SYSTEM_MESSAGES;
	
	@ClientString(id = 4848, message = "Make chat window translucent.")
	public static SystemMessageId MAKE_CHAT_WINDOW_TRANSLUCENT;
	
	@ClientString(id = 4849, message = "Alert with sound effects when there is a new message that contains keywords.")
	public static SystemMessageId ALERT_WITH_SOUND_EFFECTS_WHEN_THERE_IS_A_NEW_MESSAGE_THAT_CONTAINS_KEYWORDS2;
	
	@ClientString(id = 4850, message = "Enter keywords for alerts.")
	public static SystemMessageId ENTER_KEYWORDS_FOR_ALERTS;
	
	@ClientString(id = 4851, message = "Reset all chat option settings.")
	public static SystemMessageId RESET_ALL_CHAT_OPTION_SETTINGS;
	
	@ClientString(id = 4852, message = "Close current favorite chat window.")
	public static SystemMessageId CLOSE_CURRENT_FAVORITE_CHAT_WINDOW;
	
	@ClientString(id = 4853, message = "View character details such as level, HP, MP, etc.")
	public static SystemMessageId VIEW_CHARACTER_DETAILS_SUCH_AS_LEVEL_HP_MP_ETC;
	
	@ClientString(id = 4854, message = "View inventory.")
	public static SystemMessageId VIEW_INVENTORY;
	
	@ClientString(id = 4855, message = "Use standard emotes, social emotes, and marks.")
	public static SystemMessageId USE_STANDARD_EMOTES_SOCIAL_EMOTES_AND_MARKS;
	
	@ClientString(id = 4856, message = "Learn new skills or use learned skills.")
	public static SystemMessageId LEARN_NEW_SKILLS_OR_USE_LEARNED_SKILLS;
	
	@ClientString(id = 4857, message = "View quests currently in progress.")
	public static SystemMessageId VIEW_QUESTS_CURRENTLY_IN_PROGRESS;
	
	@ClientString(id = 4858, message = "View clan-related information such as clans, clan wars, requests, etc.")
	public static SystemMessageId VIEW_CLAN_RELATED_INFORMATION_SUCH_AS_CLANS_CLAN_WARS_REQUESTS_ETC;
	
	@ClientString(id = 4859, message = "View Lineage II world map.")
	public static SystemMessageId VIEW_LINEAGE_II_WORLD_MAP;
	
	@ClientString(id = 4860, message = "View various settings.")
	public static SystemMessageId VIEW_VARIOUS_SETTINGS;
	
	@ClientString(id = 4861, message = "Log out and return to the Login screen.")
	public static SystemMessageId LOG_OUT_AND_RETURN_TO_THE_LOGIN_SCREEN;
	
	@ClientString(id = 4862, message = "Completely close the game.")
	public static SystemMessageId COMPLETELY_CLOSE_THE_GAME;
	
	@ClientString(id = 4863, message = "Manage friends, block list, and mentoring.")
	public static SystemMessageId MANAGE_FRIENDS_BLOCK_LIST_AND_MENTORING;
	
	@ClientString(id = 4864, message = "Look for party members.")
	public static SystemMessageId LOOK_FOR_PARTY_MEMBERS;
	
	@ClientString(id = 4865, message = "Use mail and fee billing.")
	public static SystemMessageId USE_MAIL_AND_FEE_BILLING;
	
	@ClientString(id = 4866, message = "Chat with friends through Windows Live Messenger.")
	public static SystemMessageId CHAT_WITH_FRIENDS_THROUGH_WINDOWS_LIVE_MESSENGER;
	
	@ClientString(id = 4867, message = "Summon shortcut settings.")
	public static SystemMessageId SUMMON_SHORTCUT_SETTINGS;
	
	@ClientString(id = 4868, message = "Edit macros.")
	public static SystemMessageId EDIT_MACROS;
	
	@ClientString(id = 4869, message = "View various records within the world.")
	public static SystemMessageId VIEW_VARIOUS_RECORDS_WITHIN_THE_WORLD;
	
	@ClientString(id = 4870, message = "View instanced zone usage status.")
	public static SystemMessageId VIEW_INSTANCED_ZONE_USAGE_STATUS;
	
	@ClientString(id = 4871, message = "You can view clan information and request entry into clan.")
	public static SystemMessageId YOU_CAN_VIEW_CLAN_INFORMATION_AND_REQUEST_ENTRY_INTO_CLAN;
	
	@ClientString(id = 4872, message = "View PC points.")
	public static SystemMessageId VIEW_PC_POINTS;
	
	@ClientString(id = 4873, message = "View product inventory.")
	public static SystemMessageId VIEW_PRODUCT_INVENTORY;
	
	@ClientString(id = 4874, message = "Right/ left click the mouse simultaneously to move.")
	public static SystemMessageId RIGHT_LEFT_CLICK_THE_MOUSE_SIMULTANEOUSLY_TO_MOVE;
	
	@ClientString(id = 4875, message = "Display the names of yourself, your pet, and your servitor.")
	public static SystemMessageId DISPLAY_THE_NAMES_OF_YOURSELF_YOUR_PET_AND_YOUR_SERVITOR;
	
	@ClientString(id = 4876, message = "Display the names of another player's character, their pet, and their servitor.")
	public static SystemMessageId DISPLAY_THE_NAMES_OF_ANOTHER_PLAYER_S_CHARACTER_THEIR_PET_AND_THEIR_SERVITOR;
	
	@ClientString(id = 4877, message = "Not in Use - New Field for Addition")
	public static SystemMessageId NOT_IN_USE_NEW_FIELD_FOR_ADDITION3;
	
	@ClientString(id = 4878, message = "Use the 1:1 inquiry service.")
	public static SystemMessageId USE_THE_1_1_INQUIRY_SERVICE;
	
	@ClientString(id = 4879, message = "View the guide.")
	public static SystemMessageId VIEW_THE_GUIDE;
	
	@ClientString(id = 4880, message = "View the forums.")
	public static SystemMessageId VIEW_THE_FORUMS;
	
	@ClientString(id = 4881, message = "Go to the Lineage II homepage.")
	public static SystemMessageId GO_TO_THE_LINEAGE_II_HOMEPAGE;
	
	@ClientString(id = 4882, message = "Edit the main menu.")
	public static SystemMessageId EDIT_THE_MAIN_MENU;
	
	@ClientString(id = 4883, message = "Reset the main menu settings.")
	public static SystemMessageId RESET_THE_MAIN_MENU_SETTINGS;
	
	@ClientString(id = 4884, message = "Re-edit the main menu. The edits made until now will not be saved.")
	public static SystemMessageId RE_EDIT_THE_MAIN_MENU_THE_EDITS_MADE_UNTIL_NOW_WILL_NOT_BE_SAVED;
	
	@ClientString(id = 4885, message = "Finish editing and save changes.")
	public static SystemMessageId FINISH_EDITING_AND_SAVE_CHANGES;
	
	@ClientString(id = 4886, message = "Finish editing without saving changes.")
	public static SystemMessageId FINISH_EDITING_WITHOUT_SAVING_CHANGES;
	
	@ClientString(id = 5000, message = "Your account has been restricted due to an account theft issue. If you have an email address registered to your account information, please check your inbox for an email message with details. If you have no direct connection to account theft, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)) and file a petition. For more details, please visit (font color='#FFDF4C')1:1 Customer Service Center(/font).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_DUE_TO_AN_ACCOUNT_THEFT_ISSUE_IF_YOU_HAVE_AN_EMAIL_ADDRESS_REGISTERED_TO_YOUR_ACCOUNT_INFORMATION_PLEASE_CHECK_YOUR_INBOX_FOR_AN_EMAIL_MESSAGE_WITH_DETAILS_IF_YOU_HAVE_NO_DIRECT_CONNECTION_TO_ACCOUNT_THEFT_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT_AND_FILE_A_PETITION_FOR_MORE_DETAILS_PLEASE_VISIT_FONT_COLOR_FFDF4C_1_1_CUSTOMER_SERVICE_CENTER_FONT;
	
	@ClientString(id = 5001, message = "Your account has been restricted in accordance with our terms of service due to your confirmed fraudulent report. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_IN_ACCORDANCE_WITH_OUR_TERMS_OF_SERVICE_DUE_TO_YOUR_CONFIRMED_FRAUDULENT_REPORT_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5002, message = "Your account has been restricted in accordance with our terms of service as you failed to verify your identity within a given time after an account theft report. You may  undo the restriction by visiting the (font color='#FFDF4C')Lineage II Support Website((/font)(font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)(font color='#FFDF4C')) 1:1 Customer Service Center(font color='#FFDF4C')) Support Center(/font) and going through the personal verification process in the account theft report. For more details, please visit (font color='#FFDF4C')1:1 Customer Service Center(/font).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_IN_ACCORDANCE_WITH_OUR_TERMS_OF_SERVICE_AS_YOU_FAILED_TO_VERIFY_YOUR_IDENTITY_WITHIN_A_GIVEN_TIME_AFTER_AN_ACCOUNT_THEFT_REPORT_YOU_MAY_UNDO_THE_RESTRICTION_BY_VISITING_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT_FONT_COLOR_FFDF4C_1_1_CUSTOMER_SERVICE_CENTER_FONT_COLOR_FFDF4C_SUPPORT_CENTER_FONT_AND_GOING_THROUGH_THE_PERSONAL_VERIFICATION_PROCESS_IN_THE_ACCOUNT_THEFT_REPORT_FOR_MORE_DETAILS_PLEASE_VISIT_FONT_COLOR_FFDF4C_1_1_CUSTOMER_SERVICE_CENTER_FONT;
	
	@ClientString(id = 5003, message = "Your account has been restricted due to your abuse of game systems that resulted in damage to other players' gaming experience. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_DUE_TO_YOUR_ABUSE_OF_GAME_SYSTEMS_THAT_RESULTED_IN_DAMAGE_TO_OTHER_PLAYERS_GAMING_EXPERIENCE_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5004, message = "Your account has been restricted in accordance with our terms of service due to your selling, or attempting to sell, in-game goods or characters (account) for cash/real goods/goods from  another game. Your account is under suspension for 7 days since the date of exposure as decreed by the EULA, Section 3, Article 14. The account restriction will automatically be lifted after 7 days. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_IN_ACCORDANCE_WITH_OUR_TERMS_OF_SERVICE_DUE_TO_YOUR_SELLING_OR_ATTEMPTING_TO_SELL_IN_GAME_GOODS_OR_CHARACTERS_ACCOUNT_FOR_CASH_REAL_GOODS_GOODS_FROM_ANOTHER_GAME_YOUR_ACCOUNT_IS_UNDER_SUSPENSION_FOR_7_DAYS_SINCE_THE_DATE_OF_EXPOSURE_AS_DECREED_BY_THE_EULA_SECTION_3_ARTICLE_14_THE_ACCOUNT_RESTRICTION_WILL_AUTOMATICALLY_BE_LIFTED_AFTER_7_DAYS_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5005, message = "Your account has been restricted in accordance with our terms of service due to your selling, or attempting to sell, in-game goods or characters (account) for cash/real goods/goods from another game. Your account is restricted as decreed by the EULA, Section 3, Article 14. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_IN_ACCORDANCE_WITH_OUR_TERMS_OF_SERVICE_DUE_TO_YOUR_SELLING_OR_ATTEMPTING_TO_SELL_IN_GAME_GOODS_OR_CHARACTERS_ACCOUNT_FOR_CASH_REAL_GOODS_GOODS_FROM_ANOTHER_GAME_YOUR_ACCOUNT_IS_RESTRICTED_AS_DECREED_BY_THE_EULA_SECTION_3_ARTICLE_14_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5006, message = "Your account has been restricted in accordance with our terms of service due to misconduct or fraud. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_IN_ACCORDANCE_WITH_OUR_TERMS_OF_SERVICE_DUE_TO_MISCONDUCT_OR_FRAUD_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5007, message = "Your account has been restricted due to misconduct. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_DUE_TO_MISCONDUCT_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5008, message = "Your account has been restricted due to your abuse of system weaknesses or bugs. Abusing bugs can cause grievous system errors or destroy the game balance. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_DUE_TO_YOUR_ABUSE_OF_SYSTEM_WEAKNESSES_OR_BUGS_ABUSING_BUGS_CAN_CAUSE_GRIEVOUS_SYSTEM_ERRORS_OR_DESTROY_THE_GAME_BALANCE_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5009, message = "Your account has been restricted due to your use of illegal programs. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_DUE_TO_YOUR_USE_OF_ILLEGAL_PROGRAMS_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5010, message = "Your account has been restricted in accordance with our terms of service due to your confirmed abuse of in-game systems resulting in abnormal gameplay. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_IN_ACCORDANCE_WITH_OUR_TERMS_OF_SERVICE_DUE_TO_YOUR_CONFIRMED_ABUSE_OF_IN_GAME_SYSTEMS_RESULTING_IN_ABNORMAL_GAMEPLAY_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5011, message = "Your account has been restricted at your request in accordance with our terms of service. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_AT_YOUR_REQUEST_IN_ACCORDANCE_WITH_OUR_TERMS_OF_SERVICE_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5012, message = "Your account has been restricted in accordance with our terms of service due to your confirmed attempts at misconduct or fraud. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_IN_ACCORDANCE_WITH_OUR_TERMS_OF_SERVICE_DUE_TO_YOUR_CONFIRMED_ATTEMPTS_AT_MISCONDUCT_OR_FRAUD_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5013, message = "Your account has been restricted in accordance with our terms of service due to your fraudulent use of another person's identity. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_IN_ACCORDANCE_WITH_OUR_TERMS_OF_SERVICE_DUE_TO_YOUR_FRAUDULENT_USE_OF_ANOTHER_PERSON_S_IDENTITY_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5014, message = "Your account has been restricted in accordance with our terms of service due to your fraudulent transactions under another person's identity. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_IN_ACCORDANCE_WITH_OUR_TERMS_OF_SERVICE_DUE_TO_YOUR_FRAUDULENT_TRANSACTIONS_UNDER_ANOTHER_PERSON_S_IDENTITY_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5015, message = "Your account has been restricted in accordance with our terms of service due to your confirmed in-game gambling activities. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_IN_ACCORDANCE_WITH_OUR_TERMS_OF_SERVICE_DUE_TO_YOUR_CONFIRMED_IN_GAME_GAMBLING_ACTIVITIES_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5016, message = "For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5017, message = "Please inquire through the (font color='#FFDF4C')Lineage II Customer Service Center(/font) or the (font color='#FFDF4C')1:1 support(/font) in the official website.")
	public static SystemMessageId PLEASE_INQUIRE_THROUGH_THE_FONT_COLOR_FFDF4C_LINEAGE_II_CUSTOMER_SERVICE_CENTER_FONT_OR_THE_FONT_COLOR_FFDF4C_1_1_SUPPORT_FONT_IN_THE_OFFICIAL_WEBSITE;
	
	@ClientString(id = 5018, message = "In order to play Lineage II, you must be (font color='#FFDF4C')Ages 15 or above(/font). You must be (font color='#FFDF4C')18 or above(/font) in order to use the PvP servers.")
	public static SystemMessageId IN_ORDER_TO_PLAY_LINEAGE_II_YOU_MUST_BE_FONT_COLOR_FFDF4C_AGES_15_OR_ABOVE_FONT_YOU_MUST_BE_FONT_COLOR_FFDF4C_18_OR_ABOVE_FONT_IN_ORDER_TO_USE_THE_PVP_SERVERS;
	
	@ClientString(id = 5019, message = "To create a new account, please visit the (font color='#FFDF4C')Lineage II Website (/font)(font color='#6699FF')((a href='asfunction:homePage')https://login.lineage2.com/login/loginform(/a))(/font) and click on the New Account Creation link.")
	public static SystemMessageId TO_CREATE_A_NEW_ACCOUNT_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_LOGIN_LINEAGE2_COM_LOGIN_LOGINFORM_A_FONT_AND_CLICK_ON_THE_NEW_ACCOUNT_CREATION_LINK;
	
	@ClientString(id = 5020, message = "If you have lost your account, please visit the  (font color='#FFDF4C')Lineage II Website (/font)(font color='#6699FF')((a href='asfunction:homePage')https://login.lineage2.com/login/loginform(/a))(/font) and click on the Support link at the bottom of the page.")
	public static SystemMessageId IF_YOU_HAVE_LOST_YOUR_ACCOUNT_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_LOGIN_LINEAGE2_COM_LOGIN_LOGINFORM_A_FONT_AND_CLICK_ON_THE_SUPPORT_LINK_AT_THE_BOTTOM_OF_THE_PAGE;
	
	@ClientString(id = 5021, message = "Users who did not complete the (font color='#FFDF4C')Age 18 Verification(/font) may not login between (font color='#FFDF4C')10PM(/font) and (font color='#FFDF4C')6AM(/font) the next day.")
	public static SystemMessageId USERS_WHO_DID_NOT_COMPLETE_THE_FONT_COLOR_FFDF4C_AGE_18_VERIFICATION_FONT_MAY_NOT_LOGIN_BETWEEN_FONT_COLOR_FFDF4C_10PM_FONT_AND_FONT_COLOR_FFDF4C_6AM_FONT_THE_NEXT_DAY;
	
	@ClientString(id = 5022, message = "Please verify your identity to confirm your ownership of your account.  You may go through the verification process by visiting the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId PLEASE_VERIFY_YOUR_IDENTITY_TO_CONFIRM_YOUR_OWNERSHIP_OF_YOUR_ACCOUNT_YOU_MAY_GO_THROUGH_THE_VERIFICATION_PROCESS_BY_VISITING_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5023, message = "Your account has been restricted due to your confirmed attempt at trade involving cash/other servers/other games. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_DUE_TO_YOUR_CONFIRMED_ATTEMPT_AT_TRADE_INVOLVING_CASH_OTHER_SERVERS_OTHER_GAMES_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5024, message = "Your account has been restricted in accordance with an official request from an investigative agency (private law). This action was taken because the official request from the investigative agency has legal force. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_IN_ACCORDANCE_WITH_AN_OFFICIAL_REQUEST_FROM_AN_INVESTIGATIVE_AGENCY_PRIVATE_LAW_THIS_ACTION_WAS_TAKEN_BECAUSE_THE_OFFICIAL_REQUEST_FROM_THE_INVESTIGATIVE_AGENCY_HAS_LEGAL_FORCE_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5025, message = "Your account has been temporarily restricted due to acquisition of an item connected to account theft. Please visit the homepage and go through the personal verification process to lift the restriction. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_TEMPORARILY_RESTRICTED_DUE_TO_ACQUISITION_OF_AN_ITEM_CONNECTED_TO_ACCOUNT_THEFT_PLEASE_VISIT_THE_HOMEPAGE_AND_GO_THROUGH_THE_PERSONAL_VERIFICATION_PROCESS_TO_LIFT_THE_RESTRICTION_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5026, message = "Your account has been restricted due to your confirmed trade history involving cash/other servers/other games.  For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_DUE_TO_YOUR_CONFIRMED_TRADE_HISTORY_INVOLVING_CASH_OTHER_SERVERS_OTHER_GAMES_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5027, message = "Your account has been restricted due to your confirmed cash/account trade activities. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_DUE_TO_YOUR_CONFIRMED_CASH_ACCOUNT_TRADE_ACTIVITIES_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5028, message = "You cannot use the game services as your identity has not been verified. Please the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)) and go to (font color='#FFDF4C'))(/font) to verify your identity. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOU_CANNOT_USE_THE_GAME_SERVICES_AS_YOUR_IDENTITY_HAS_NOT_BEEN_VERIFIED_PLEASE_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT_AND_GO_TO_FONT_COLOR_FFDF4C_FONT_TO_VERIFY_YOUR_IDENTITY_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5029, message = "Your current account is inactive. If you do not log into the game for a period of time, your account turns into an inactive account.  You may convert your account to an active account by visiting the (font color='#FFDF4C')Lineage II Support Website((/font)(font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)(font color='#FFDF4C')) 1:1 Customer Service Center.")
	public static SystemMessageId YOUR_CURRENT_ACCOUNT_IS_INACTIVE_IF_YOU_DO_NOT_LOG_INTO_THE_GAME_FOR_A_PERIOD_OF_TIME_YOUR_ACCOUNT_TURNS_INTO_AN_INACTIVE_ACCOUNT_YOU_MAY_CONVERT_YOUR_ACCOUNT_TO_AN_ACTIVE_ACCOUNT_BY_VISITING_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT_FONT_COLOR_FFDF4C_1_1_CUSTOMER_SERVICE_CENTER;
	
	@ClientString(id = 5030, message = "(font color='#FFDF4C')Logging in.(/font)Please wait.")
	public static SystemMessageId FONT_COLOR_FFDF4C_LOGGING_IN_FONT_PLEASE_WAIT;
	
	@ClientString(id = 5031, message = "The account has been temporarily restricted due to an incomplete cell phone (ARS) transaction. For more information, please visit http://us.ncsoft.com/en/.")
	public static SystemMessageId THE_ACCOUNT_HAS_BEEN_TEMPORARILY_RESTRICTED_DUE_TO_AN_INCOMPLETE_CELL_PHONE_ARS_TRANSACTION_FOR_MORE_INFORMATION_PLEASE_VISIT_HTTP_US_NCSOFT_COM_EN;
	
	@ClientString(id = 5032, message = "Your account has not yet been authenticated. Please visit the (font color='#FFDF4C')homepage((/font)(font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com)(/a)(/font) and confirm your account authentication.")
	public static SystemMessageId YOUR_ACCOUNT_HAS_NOT_YET_BEEN_AUTHENTICATED_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_HOMEPAGE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT_AND_CONFIRM_YOUR_ACCOUNT_AUTHENTICATION;
	
	@ClientString(id = 5033, message = "Your account has not completed the (font color='#FFDF4C')Parental Agreement(/font).(br) Please complete the (font color='#FFDF4C')Parental Agreement(/font) before logging in.")
	public static SystemMessageId YOUR_ACCOUNT_HAS_NOT_COMPLETED_THE_FONT_COLOR_FFDF4C_PARENTAL_AGREEMENT_FONT_BR_PLEASE_COMPLETE_THE_FONT_COLOR_FFDF4C_PARENTAL_AGREEMENT_FONT_BEFORE_LOGGING_IN;
	
	@ClientString(id = 5034, message = "This account has declined the User Agreement or has requested for membership withdrawal.  Please try again after (br)(font color='#FFDF4C')cancelling the Game Agreement declination(/font) or (font color='#FFDF4C')cancelling the membership withdrawal request(/font).")
	public static SystemMessageId THIS_ACCOUNT_HAS_DECLINED_THE_USER_AGREEMENT_OR_HAS_REQUESTED_FOR_MEMBERSHIP_WITHDRAWAL_PLEASE_TRY_AGAIN_AFTER_BR_FONT_COLOR_FFDF4C_CANCELLING_THE_GAME_AGREEMENT_DECLINATION_FONT_OR_FONT_COLOR_FFDF4C_CANCELLING_THE_MEMBERSHIP_WITHDRAWAL_REQUEST_FONT;
	
	@ClientString(id = 5035, message = "All permissions on your account are restricted. (br)Please go to http://us.ncsoft.com/en/ for details.")
	public static SystemMessageId ALL_PERMISSIONS_ON_YOUR_ACCOUNT_ARE_RESTRICTED_BR_PLEASE_GO_TO_HTTP_US_NCSOFT_COM_EN_FOR_DETAILS;
	
	@ClientString(id = 5036, message = "Please inquire through the (font color='#FFDF4C')Lineage II Support Website((/font)(font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)(font color='#FFDF4C')) 1:1 Customer Service Center(font color='#FFDF4C')) Customer Service Center(/font).")
	public static SystemMessageId PLEASE_INQUIRE_THROUGH_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT_FONT_COLOR_FFDF4C_1_1_CUSTOMER_SERVICE_CENTER_FONT_COLOR_FFDF4C_CUSTOMER_SERVICE_CENTER_FONT;
	
	@ClientString(id = 5037, message = "You can no longer log in as your account has been converted to (font color='#FFDF4C')Unified Account(/font). (br)Please try again through the (font color='#FFDF4C')Unified Account(/font).")
	public static SystemMessageId YOU_CAN_NO_LONGER_LOG_IN_AS_YOUR_ACCOUNT_HAS_BEEN_CONVERTED_TO_FONT_COLOR_FFDF4C_UNIFIED_ACCOUNT_FONT_BR_PLEASE_TRY_AGAIN_THROUGH_THE_FONT_COLOR_FFDF4C_UNIFIED_ACCOUNT_FONT;
	
	@ClientString(id = 5038, message = "You must change your password and secret question in order to log in. Please the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)) and (font color='#FFDF4C')change the password and secret question(/font).")
	public static SystemMessageId YOU_MUST_CHANGE_YOUR_PASSWORD_AND_SECRET_QUESTION_IN_ORDER_TO_LOG_IN_PLEASE_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT_AND_FONT_COLOR_FFDF4C_CHANGE_THE_PASSWORD_AND_SECRET_QUESTION_FONT;
	
	@ClientString(id = 5039, message = "Your account has been restricted due to your use of illegal programs. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_DUE_TO_YOUR_USE_OF_ILLEGAL_PROGRAMS_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT2;
	
	@ClientString(id = 5040, message = "Your account has been restricted due to your confirmed abuse of a bug pertaining to the NCoin. For more information, please visit http://us.ncsoft.com/en/.")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_DUE_TO_YOUR_CONFIRMED_ABUSE_OF_A_BUG_PERTAINING_TO_THE_NCOIN_FOR_MORE_INFORMATION_PLEASE_VISIT_HTTP_US_NCSOFT_COM_EN2;
	
	@ClientString(id = 5041, message = "Your account has been restricted due to your confirmed abuse of free NCoin. For more information, please visit http://us.ncsoft.com/en/.")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_DUE_TO_YOUR_CONFIRMED_ABUSE_OF_FREE_NCOIN_FOR_MORE_INFORMATION_PLEASE_VISIT_HTTP_US_NCSOFT_COM_EN2;
	
	@ClientString(id = 5042, message = "Your account has been temporarily denied all game services due to connections with account registration done by means of identity theft. If you have no connection to the issue, please go through the personal verification process.  For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_TEMPORARILY_DENIED_ALL_GAME_SERVICES_DUE_TO_CONNECTIONS_WITH_ACCOUNT_REGISTRATION_DONE_BY_MEANS_OF_IDENTITY_THEFT_IF_YOU_HAVE_NO_CONNECTION_TO_THE_ISSUE_PLEASE_GO_THROUGH_THE_PERSONAL_VERIFICATION_PROCESS_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5043, message = "Your account has been denied all game services due to transaction fraud. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_DENIED_ALL_GAME_SERVICES_DUE_TO_TRANSACTION_FRAUD_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5044, message = "your account has been denied all game services due to your confirmed account trade history. (br)For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_DENIED_ALL_GAME_SERVICES_DUE_TO_YOUR_CONFIRMED_ACCOUNT_TRADE_HISTORY_BR_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5045, message = "Your account has been restricted for a duration of 10 days due to your use of illegal programs. All game services are denied for the aforementioned period, and a repeated offense will result in a permanent ban. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_FOR_A_DURATION_OF_10_DAYS_DUE_TO_YOUR_USE_OF_ILLEGAL_PROGRAMS_ALL_GAME_SERVICES_ARE_DENIED_FOR_THE_AFOREMENTIONED_PERIOD_AND_A_REPEATED_OFFENSE_WILL_RESULT_IN_A_PERMANENT_BAN_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5046, message = "Your account has been denied all game services due to your confirmed use of illegal programs. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_DENIED_ALL_GAME_SERVICES_DUE_TO_YOUR_CONFIRMED_USE_OF_ILLEGAL_PROGRAMS_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5047, message = "Your account has been denied all game services due to your confirmed use of illegal programs. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_DENIED_ALL_GAME_SERVICES_DUE_TO_YOUR_CONFIRMED_USE_OF_ILLEGAL_PROGRAMS_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT2;
	
	@ClientString(id = 5048, message = "Your account has been denied all game service at your request. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_DENIED_ALL_GAME_SERVICE_AT_YOUR_REQUEST_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5049, message = "Your account has been restricted due to frequent posting of inappropriate content. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_DUE_TO_FREQUENT_POSTING_OF_INAPPROPRIATE_CONTENT_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5050, message = "Your account has been restricted due to a confirmed post in violation of the law. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_DUE_TO_A_CONFIRMED_POST_IN_VIOLATION_OF_THE_LAW_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5051, message = "Your account has been denied all game services due to your confirmed use of the game for commercial purposes. For more details, please visit (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_DENIED_ALL_GAME_SERVICES_DUE_TO_YOUR_CONFIRMED_USE_OF_THE_GAME_FOR_COMMERCIAL_PURPOSES_FOR_MORE_DETAILS_PLEASE_VISIT_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5052, message = "You have entered (font color='#FFDF4C')Regular Server(/font).")
	public static SystemMessageId YOU_HAVE_ENTERED_FONT_COLOR_FFDF4C_REGULAR_SERVER_FONT;
	
	@ClientString(id = 5053, message = "You have entered (font color='#FFDF4C')Adult Server(/font).")
	public static SystemMessageId YOU_HAVE_ENTERED_FONT_COLOR_FFDF4C_ADULT_SERVER_FONT;
	
	@ClientString(id = 5054, message = "You have entered (font color='#FFDF4C')Teenage Server(/font).")
	public static SystemMessageId YOU_HAVE_ENTERED_FONT_COLOR_FFDF4C_TEENAGE_SERVER_FONT;
	
	@ClientString(id = 5055, message = "You cannot do that because of (font color='#FFDF4C')Fatigue(/font).")
	public static SystemMessageId YOU_CANNOT_DO_THAT_BECAUSE_OF_FONT_COLOR_FFDF4C_FATIGUE_FONT;
	
	@ClientString(id = 5056, message = "Your account has been put on standby for personal verification due to its speculated registration under someone else's identity. If  this is not the case, please visit the website and go through the personal verification process to lift the restriction. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_PUT_ON_STANDBY_FOR_PERSONAL_VERIFICATION_DUE_TO_ITS_SPECULATED_REGISTRATION_UNDER_SOMEONE_ELSE_S_IDENTITY_IF_THIS_IS_NOT_THE_CASE_PLEASE_VISIT_THE_WEBSITE_AND_GO_THROUGH_THE_PERSONAL_VERIFICATION_PROCESS_TO_LIFT_THE_RESTRICTION_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5057, message = "Your account has been denied all game services due to its confirmed registration under someone else's identity.  For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_DENIED_ALL_GAME_SERVICES_DUE_TO_ITS_CONFIRMED_REGISTRATION_UNDER_SOMEONE_ELSE_S_IDENTITY_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5058, message = "Your account has been temporarily restricted due to your speculated abnormal methods of gameplay. If you did not employ abnormal means to play the game, please visit the website and go through the personal verification process to lift the restriction. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_TEMPORARILY_RESTRICTED_DUE_TO_YOUR_SPECULATED_ABNORMAL_METHODS_OF_GAMEPLAY_IF_YOU_DID_NOT_EMPLOY_ABNORMAL_MEANS_TO_PLAY_THE_GAME_PLEASE_VISIT_THE_WEBSITE_AND_GO_THROUGH_THE_PERSONAL_VERIFICATION_PROCESS_TO_LIFT_THE_RESTRICTION_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5059, message = "Please enter more than (font color='#FFDF4C')1 letter(/font) and less than (font color='#FFDF4C')16 letters(/font).")
	public static SystemMessageId PLEASE_ENTER_MORE_THAN_FONT_COLOR_FFDF4C_1_LETTER_FONT_AND_LESS_THAN_FONT_COLOR_FFDF4C_16_LETTERS_FONT;
	
	@ClientString(id = 5060, message = "Welcome to (font color='#FFDF4C')Lineage II(/font). Please click on the (font color='#FFDF4C')Create Character(/font) tab to go to the Character Creation screen.")
	public static SystemMessageId WELCOME_TO_FONT_COLOR_FFDF4C_LINEAGE_II_FONT_PLEASE_CLICK_ON_THE_FONT_COLOR_FFDF4C_CREATE_CHARACTER_FONT_TAB_TO_GO_TO_THE_CHARACTER_CREATION_SCREEN;
	
	@ClientString(id = 5061, message = "A character belonging to a (font color='#FFDF4C')clan(/font) may not be deleted.")
	public static SystemMessageId A_CHARACTER_BELONGING_TO_A_FONT_COLOR_FFDF4C_CLAN_FONT_MAY_NOT_BE_DELETED;
	
	@ClientString(id = 5062, message = "A (font color='#FFDF4C')Clan Leader(/font) may not be deleted. Please disband the clan and try again.")
	public static SystemMessageId A_FONT_COLOR_FFDF4C_CLAN_LEADER_FONT_MAY_NOT_BE_DELETED_PLEASE_DISBAND_THE_CLAN_AND_TRY_AGAIN;
	
	@ClientString(id = 5063, message = "A (font color='#FFDF4C')Clan Member(/font) may not be deleted. Please leave the clan and try again.")
	public static SystemMessageId A_FONT_COLOR_FFDF4C_CLAN_MEMBER_FONT_MAY_NOT_BE_DELETED_PLEASE_LEAVE_THE_CLAN_AND_TRY_AGAIN;
	
	@ClientString(id = 5064, message = "Authentication has failed as you have entered an incorrect authentication number or did not enter the authentication number.  If you fail authentication (font color='#FFDF4C')3 times(/font) in a row, game access will be restricted for (font color='#FFDF4C')30 minutes(/font).")
	public static SystemMessageId AUTHENTICATION_HAS_FAILED_AS_YOU_HAVE_ENTERED_AN_INCORRECT_AUTHENTICATION_NUMBER_OR_DID_NOT_ENTER_THE_AUTHENTICATION_NUMBER_IF_YOU_FAIL_AUTHENTICATION_FONT_COLOR_FFDF4C_3_TIMES_FONT_IN_A_ROW_GAME_ACCESS_WILL_BE_RESTRICTED_FOR_FONT_COLOR_FFDF4C_30_MINUTES_FONT;
	
	@ClientString(id = 5065, message = "An unexpected error has occured. Please contact our Customer Support Team at https://support.lineage2.com")
	public static SystemMessageId AN_UNEXPECTED_ERROR_HAS_OCCURED_PLEASE_CONTACT_OUR_CUSTOMER_SUPPORT_TEAM_AT_HTTPS_SUPPORT_LINEAGE2_COM3;
	
	@ClientString(id = 5066, message = "An unexpected error has occured. Please contact our Customer Support Team at https://support.lineage2.com")
	public static SystemMessageId AN_UNEXPECTED_ERROR_HAS_OCCURED_PLEASE_CONTACT_OUR_CUSTOMER_SUPPORT_TEAM_AT_HTTPS_SUPPORT_LINEAGE2_COM4;
	
	@ClientString(id = 5067, message = "If you fail authentication (font color='#FFDF4C')3 times(/font) in a row,  game access will be restricted for (font color='#FFDF4C')30 minutes(/font). Please try again later.")
	public static SystemMessageId IF_YOU_FAIL_AUTHENTICATION_FONT_COLOR_FFDF4C_3_TIMES_FONT_IN_A_ROW_GAME_ACCESS_WILL_BE_RESTRICTED_FOR_FONT_COLOR_FFDF4C_30_MINUTES_FONT_PLEASE_TRY_AGAIN_LATER;
	
	@ClientString(id = 5068, message = "To request an NC OTP service,(br)run the cell phone NC OTP service(br)and enter the displayed NC OTP number within 1 minute.(br)If you did not make the request,(br)leave this part blank,(br)and click on the login tab.")
	public static SystemMessageId TO_REQUEST_AN_NC_OTP_SERVICE_BR_RUN_THE_CELL_PHONE_NC_OTP_SERVICE_BR_AND_ENTER_THE_DISPLAYED_NC_OTP_NUMBER_WITHIN_1_MINUTE_BR_IF_YOU_DID_NOT_MAKE_THE_REQUEST_BR_LEAVE_THIS_PART_BLANK_BR_AND_CLICK_ON_THE_LOGIN_TAB;
	
	@ClientString(id = 5069, message = "Please enter card number (font color='#FFDF4C')$s1(/font).")
	public static SystemMessageId PLEASE_ENTER_CARD_NUMBER_FONT_COLOR_FFDF4C_S1_FONT;
	
	@ClientString(id = 5070, message = "(font size='15' color='#FFDF5F')The Lineage II server has been restructured as of 06/11/14.(/font)(br)(font size='13' color='#ABABAB')Bartz, Fehyshar(/font) → Bartz(New)(br)(font size='13' color='#ABABAB')Erica, Gustin, Teon(/font) → Sieghardt(New)(br)(font size='13' color='#ABABAB')Franz, Irene, Aria(/font) → Kain(New)")
	public static SystemMessageId FONT_SIZE_15_COLOR_FFDF5F_THE_LINEAGE_II_SERVER_HAS_BEEN_RESTRUCTURED_AS_OF_06_11_14_FONT_BR_FONT_SIZE_13_COLOR_ABABAB_BARTZ_FEHYSHAR_FONT_BARTZ_NEW_BR_FONT_SIZE_13_COLOR_ABABAB_ERICA_GUSTIN_TEON_FONT_SIEGHARDT_NEW_BR_FONT_SIZE_13_COLOR_ABABAB_FRANZ_IRENE_ARIA_FONT_KAIN_NEW;
	
	@ClientString(id = 5071, message = "(font color='#FFDF4C')We give various benefits to warriors who return after a long time.(/font)")
	public static SystemMessageId FONT_COLOR_FFDF4C_WE_GIVE_VARIOUS_BENEFITS_TO_WARRIORS_WHO_RETURN_AFTER_A_LONG_TIME_FONT;
	
	@ClientString(id = 5072, message = "You can receive the benefits provided to dormant customers on (font color='#FFDF4C')Lineage II Homepage ) Dormant Membership Page(/font)((font color='#6699FF')(a href='asfunction:homePage')lineage2.plaync.co.kr/service/freecoupon/dormancy(/a)(/font)).(br)Receive benefits for dormant customers and log into the game again!")
	public static SystemMessageId YOU_CAN_RECEIVE_THE_BENEFITS_PROVIDED_TO_DORMANT_CUSTOMERS_ON_FONT_COLOR_FFDF4C_LINEAGE_II_HOMEPAGE_DORMANT_MEMBERSHIP_PAGE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_LINEAGE2_PLAYNC_CO_KR_SERVICE_FREECOUPON_DORMANCY_A_FONT_BR_RECEIVE_BENEFITS_FOR_DORMANT_CUSTOMERS_AND_LOG_INTO_THE_GAME_AGAIN;
	
	@ClientString(id = 5300, message = "Your account has been restricted due to an account theft issue. If you have an email address registered to your account information, please check your inbox for an email message with details. If you have no direct connection to account theft, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)) and file a petition. For more details, please visit (font color='#FFDF4C')1:1 Chat in Customer Service Center(/font).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_DUE_TO_AN_ACCOUNT_THEFT_ISSUE_IF_YOU_HAVE_AN_EMAIL_ADDRESS_REGISTERED_TO_YOUR_ACCOUNT_INFORMATION_PLEASE_CHECK_YOUR_INBOX_FOR_AN_EMAIL_MESSAGE_WITH_DETAILS_IF_YOU_HAVE_NO_DIRECT_CONNECTION_TO_ACCOUNT_THEFT_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT_AND_FILE_A_PETITION_FOR_MORE_DETAILS_PLEASE_VISIT_FONT_COLOR_FFDF4C_1_1_CHAT_IN_CUSTOMER_SERVICE_CENTER_FONT;
	
	@ClientString(id = 5301, message = "Your account has been restricted in accordance with our terms of service due to your confirmed abuse of GM services or reporting services. For more details, please visit the (font color='#FFDF4C')website((/font)(font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)(font color='#FFDF4C')) 1:1 Customer Service Center(/font)(font color='#FFDF4C')) 1:1 Customer Service Center(/font).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_IN_ACCORDANCE_WITH_OUR_TERMS_OF_SERVICE_DUE_TO_YOUR_CONFIRMED_ABUSE_OF_GM_SERVICES_OR_REPORTING_SERVICES_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT_FONT_COLOR_FFDF4C_1_1_CUSTOMER_SERVICE_CENTER_FONT_FONT_COLOR_FFDF4C_1_1_CUSTOMER_SERVICE_CENTER_FONT;
	
	@ClientString(id = 5302, message = "Your account has been restricted in accordance with our terms of service as you failed to verify your identity within a given time after an account theft report. You may  undo the restriction by visiting the (font color='#FFDF4C')Lineage II Support Website((/font)(font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)(font color='#FFDF4C')) 1:1 Customer Service Center(font color='#FFDF4C')) Support Center(/font) and going through the identity verification process in the account theft report. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_IN_ACCORDANCE_WITH_OUR_TERMS_OF_SERVICE_AS_YOU_FAILED_TO_VERIFY_YOUR_IDENTITY_WITHIN_A_GIVEN_TIME_AFTER_AN_ACCOUNT_THEFT_REPORT_YOU_MAY_UNDO_THE_RESTRICTION_BY_VISITING_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT_FONT_COLOR_FFDF4C_1_1_CUSTOMER_SERVICE_CENTER_FONT_COLOR_FFDF4C_SUPPORT_CENTER_FONT_AND_GOING_THROUGH_THE_IDENTITY_VERIFICATION_PROCESS_IN_THE_ACCOUNT_THEFT_REPORT_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5303, message = "Your account has been restricted due to your abuse of game systems that resulted in damage to other players' gaming experience. For more details, please the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font))(font color='#FFDF4C'))1:1 Chat in Customer Service Center(/font).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_DUE_TO_YOUR_ABUSE_OF_GAME_SYSTEMS_THAT_RESULTED_IN_DAMAGE_TO_OTHER_PLAYERS_GAMING_EXPERIENCE_FOR_MORE_DETAILS_PLEASE_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT_FONT_COLOR_FFDF4C_1_1_CHAT_IN_CUSTOMER_SERVICE_CENTER_FONT;
	
	@ClientString(id = 5304, message = "Your account has been restricted due to your confirmed attempt at commercial advertising or trade involving cash or other games. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_DUE_TO_YOUR_CONFIRMED_ATTEMPT_AT_COMMERCIAL_ADVERTISING_OR_TRADE_INVOLVING_CASH_OR_OTHER_GAMES_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5305, message = "Your account has been restricted due to your confirmed cash/account trade activities. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_DUE_TO_YOUR_CONFIRMED_CASH_ACCOUNT_TRADE_ACTIVITIES_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT2;
	
	@ClientString(id = 5306, message = "Your account has been restricted in accordance with our terms of service due to misconduct or fraud. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_IN_ACCORDANCE_WITH_OUR_TERMS_OF_SERVICE_DUE_TO_MISCONDUCT_OR_FRAUD_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT2;
	
	@ClientString(id = 5307, message = "Your account has been restricted due to the use of inappropriate language. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_DUE_TO_THE_USE_OF_INAPPROPRIATE_LANGUAGE_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5308, message = "Your account has been restricted due to your abuse of system weaknesses or bugs. Abusing bugs can cause serious system errors or destroy the game balance. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_DUE_TO_YOUR_ABUSE_OF_SYSTEM_WEAKNESSES_OR_BUGS_ABUSING_BUGS_CAN_CAUSE_SERIOUS_SYSTEM_ERRORS_OR_DESTROY_THE_GAME_BALANCE_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5309, message = "Your account has been restricted due to development/distribution of an illegal program or modification of the server program. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_DUE_TO_DEVELOPMENT_DISTRIBUTION_OF_AN_ILLEGAL_PROGRAM_OR_MODIFICATION_OF_THE_SERVER_PROGRAM_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5310, message = "Your account has been restricted in accordance with our terms of service due to your confirmed abuse of in-game systems resulting in abnormal gameplay. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_IN_ACCORDANCE_WITH_OUR_TERMS_OF_SERVICE_DUE_TO_YOUR_CONFIRMED_ABUSE_OF_IN_GAME_SYSTEMS_RESULTING_IN_ABNORMAL_GAMEPLAY_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT2;
	
	@ClientString(id = 5311, message = "Your account has been restricted at your request in accordance with our terms of service. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_AT_YOUR_REQUEST_IN_ACCORDANCE_WITH_OUR_TERMS_OF_SERVICE_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT2;
	
	@ClientString(id = 5312, message = "Your account has been restricted in accordance with our terms of service due to your confirmed attempts at misconduct or fraud. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_IN_ACCORDANCE_WITH_OUR_TERMS_OF_SERVICE_DUE_TO_YOUR_CONFIRMED_ATTEMPTS_AT_MISCONDUCT_OR_FRAUD_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT2;
	
	@ClientString(id = 5313, message = "Your account has been restricted in accordance with our terms of service due to your fraudulent use of another person's identity. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_IN_ACCORDANCE_WITH_OUR_TERMS_OF_SERVICE_DUE_TO_YOUR_FRAUDULENT_USE_OF_ANOTHER_PERSON_S_IDENTITY_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT2;
	
	@ClientString(id = 5314, message = "Your account has been restricted in accordance with our terms of service due to your fraudulent transactions under another person's identity. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_IN_ACCORDANCE_WITH_OUR_TERMS_OF_SERVICE_DUE_TO_YOUR_FRAUDULENT_TRANSACTIONS_UNDER_ANOTHER_PERSON_S_IDENTITY_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT2;
	
	@ClientString(id = 5315, message = "Your account has been restricted in accordance with our terms of service due to your confirmed in-game gambling activities. Please refer to the Support Center on the NCSOFT website (http://us.ncsoft.com/en/support) for more details.")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_IN_ACCORDANCE_WITH_OUR_TERMS_OF_SERVICE_DUE_TO_YOUR_CONFIRMED_IN_GAME_GAMBLING_ACTIVITIES_PLEASE_REFER_TO_THE_SUPPORT_CENTER_ON_THE_NCSOFT_WEBSITE_HTTP_US_NCSOFT_COM_EN_SUPPORT_FOR_MORE_DETAILS;
	
	@ClientString(id = 5316, message = "Your account has been restricted due to your use of illegal programs. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_DUE_TO_YOUR_USE_OF_ILLEGAL_PROGRAMS_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT3;
	
	@ClientString(id = 5317, message = "Your account is temporarily restricted due to a complaint filed in the process of name changing. For more information, visit (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_IS_TEMPORARILY_RESTRICTED_DUE_TO_A_COMPLAINT_FILED_IN_THE_PROCESS_OF_NAME_CHANGING_FOR_MORE_INFORMATION_VISIT_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5318, message = "Please verify your identity to confirm your ownership of your account at the NCsoft website.  For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId PLEASE_VERIFY_YOUR_IDENTITY_TO_CONFIRM_YOUR_OWNERSHIP_OF_YOUR_ACCOUNT_AT_THE_NCSOFT_WEBSITE_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT2;
	
	@ClientString(id = 5319, message = "Your account has been restricted in accordance with an official request from an investigative agency (private law). This action was taken because the official request from the investigative agency has legal force. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_IN_ACCORDANCE_WITH_AN_OFFICIAL_REQUEST_FROM_AN_INVESTIGATIVE_AGENCY_PRIVATE_LAW_THIS_ACTION_WAS_TAKEN_BECAUSE_THE_OFFICIAL_REQUEST_FROM_THE_INVESTIGATIVE_AGENCY_HAS_LEGAL_FORCE_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT2;
	
	@ClientString(id = 5320, message = "Your account has been temporarily restricted due to acquisition of an item connected to account theft. Please visit the homepage and go through the personal verification process to lift the restriction. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_TEMPORARILY_RESTRICTED_DUE_TO_ACQUISITION_OF_AN_ITEM_CONNECTED_TO_ACCOUNT_THEFT_PLEASE_VISIT_THE_HOMEPAGE_AND_GO_THROUGH_THE_PERSONAL_VERIFICATION_PROCESS_TO_LIFT_THE_RESTRICTION_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT2;
	
	@ClientString(id = 5321, message = "Your account has been restricted due to your confirmed trade involving cash or other games. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_DUE_TO_YOUR_CONFIRMED_TRADE_INVOLVING_CASH_OR_OTHER_GAMES_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5322, message = "You cannot use the game services as your identity has not been verified. Please the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)) and go to (font color='#FFDF4C'))(/font) to verify your identity. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOU_CANNOT_USE_THE_GAME_SERVICES_AS_YOUR_IDENTITY_HAS_NOT_BEEN_VERIFIED_PLEASE_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT_AND_GO_TO_FONT_COLOR_FFDF4C_FONT_TO_VERIFY_YOUR_IDENTITY_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT2;
	
	@ClientString(id = 5323, message = "Your account has been restricted due to your use of illegal programs. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_DUE_TO_YOUR_USE_OF_ILLEGAL_PROGRAMS_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT4;
	
	@ClientString(id = 5324, message = "Your account has been restricted due to your unfair acquisition of items and disregard for item distribution rules agreed upon by members of your party. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_DUE_TO_YOUR_UNFAIR_ACQUISITION_OF_ITEMS_AND_DISREGARD_FOR_ITEM_DISTRIBUTION_RULES_AGREED_UPON_BY_MEMBERS_OF_YOUR_PARTY_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5325, message = "Your account has been denied all game services due to your confirmed use of the game for commercial purposes. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_DENIED_ALL_GAME_SERVICES_DUE_TO_YOUR_CONFIRMED_USE_OF_THE_GAME_FOR_COMMERCIAL_PURPOSES_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5326, message = "The account has been temporarily restricted due to an incomplete cell phone (ARS) transaction. For more information, please visit http://us.ncsoft.com/en/.")
	public static SystemMessageId THE_ACCOUNT_HAS_BEEN_TEMPORARILY_RESTRICTED_DUE_TO_AN_INCOMPLETE_CELL_PHONE_ARS_TRANSACTION_FOR_MORE_INFORMATION_PLEASE_VISIT_HTTP_US_NCSOFT_COM_EN2;
	
	@ClientString(id = 5327, message = "Your account has been restricted due to your confirmed attempt at commercial advertising. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_DUE_TO_YOUR_CONFIRMED_ATTEMPT_AT_COMMERCIAL_ADVERTISING_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5328, message = "Your identity verification has been temporarily suspended due to suspected account theft. If you are not involved in account theft, please verify your identity by clicking the 'Release' button in the login page. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_IDENTITY_VERIFICATION_HAS_BEEN_TEMPORARILY_SUSPENDED_DUE_TO_SUSPECTED_ACCOUNT_THEFT_IF_YOU_ARE_NOT_INVOLVED_IN_ACCOUNT_THEFT_PLEASE_VERIFY_YOUR_IDENTITY_BY_CLICKING_THE_RELEASE_BUTTON_IN_THE_LOGIN_PAGE_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 5329, message = "Your account has been temporarily restricted due to your speculated abnormal methods of gameplay. If you did not employ abnormal means to play the game, please visit the website and go through the personal verification process to lift the restriction. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_TEMPORARILY_RESTRICTED_DUE_TO_YOUR_SPECULATED_ABNORMAL_METHODS_OF_GAMEPLAY_IF_YOU_DID_NOT_EMPLOY_ABNORMAL_MEANS_TO_PLAY_THE_GAME_PLEASE_VISIT_THE_WEBSITE_AND_GO_THROUGH_THE_PERSONAL_VERIFICATION_PROCESS_TO_LIFT_THE_RESTRICTION_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT2;
	
	@ClientString(id = 5330, message = "Your account has been restricted due to your abuse of system weaknesses or bugs. Abusing bugs can cause grievous system errors or destroy the game balance. For more details, please visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_HAS_BEEN_RESTRICTED_DUE_TO_YOUR_ABUSE_OF_SYSTEM_WEAKNESSES_OR_BUGS_ABUSING_BUGS_CAN_CAUSE_GRIEVOUS_SYSTEM_ERRORS_OR_DESTROY_THE_GAME_BALANCE_FOR_MORE_DETAILS_PLEASE_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT2;
	
	@ClientString(id = 5331, message = "Your account is temporarily restricted due to a complaint filed in the process of name changing. For more information,visit the (font color='#FFDF4C')Lineage II Support Website(/font)((font color='#6699FF')(a href='asfunction:homePage')https://support.lineage2.com(/a)(/font)).")
	public static SystemMessageId YOUR_ACCOUNT_IS_TEMPORARILY_RESTRICTED_DUE_TO_A_COMPLAINT_FILED_IN_THE_PROCESS_OF_NAME_CHANGING_FOR_MORE_INFORMATION_VISIT_THE_FONT_COLOR_FFDF4C_LINEAGE_II_SUPPORT_WEBSITE_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_HTTPS_SUPPORT_LINEAGE2_COM_A_FONT;
	
	@ClientString(id = 6001, message = "The item has been successfully purchased.")
	public static SystemMessageId THE_ITEM_HAS_BEEN_SUCCESSFULLY_PURCHASED2;
	
	@ClientString(id = 6002, message = "The item has failed to be purchased.")
	public static SystemMessageId THE_ITEM_HAS_FAILED_TO_BE_PURCHASED;
	
	@ClientString(id = 6003, message = "The item you selected cannot be purchased. Unfortunately, the sale period ended.")
	public static SystemMessageId THE_ITEM_YOU_SELECTED_CANNOT_BE_PURCHASED_UNFORTUNATELY_THE_SALE_PERIOD_ENDED;
	
	@ClientString(id = 6004, message = "Enchant failed. The enchant skill for the corresponding item will be exactly retained.")
	public static SystemMessageId ENCHANT_FAILED_THE_ENCHANT_SKILL_FOR_THE_CORRESPONDING_ITEM_WILL_BE_EXACTLY_RETAINED;
	
	@ClientString(id = 6005, message = "You do not have enough NCoin.")
	public static SystemMessageId YOU_DO_NOT_HAVE_ENOUGH_NCOIN;
	
	@ClientString(id = 6006, message = "The item cannot be received because the inventory weight/quantity limit has been exceeded.")
	public static SystemMessageId THE_ITEM_CANNOT_BE_RECEIVED_BECAUSE_THE_INVENTORY_WEIGHT_QUANTITY_LIMIT_HAS_BEEN_EXCEEDED;
	
	@ClientString(id = 6007, message = "The item cannot be received because the inventory weight/quantity limit has been exceeded.")
	public static SystemMessageId THE_ITEM_CANNOT_BE_RECEIVED_BECAUSE_THE_INVENTORY_WEIGHT_QUANTITY_LIMIT_HAS_BEEN_EXCEEDED2;
	
	@ClientString(id = 6008, message = "Product Purchase Error - The product is not right.")
	public static SystemMessageId PRODUCT_PURCHASE_ERROR_THE_PRODUCT_IS_NOT_RIGHT;
	
	@ClientString(id = 6009, message = "Product Purchase Error - The item within the product is not right.")
	public static SystemMessageId PRODUCT_PURCHASE_ERROR_THE_ITEM_WITHIN_THE_PRODUCT_IS_NOT_RIGHT;
	
	@ClientString(id = 6010, message = "Your master account has been restricted.")
	public static SystemMessageId YOUR_MASTER_ACCOUNT_HAS_BEEN_RESTRICTED;
	
	@ClientString(id = 6011, message = "You acquired $s1 XP and $s2 SP. (As a reward you receive $s3% more XP.)")
	public static SystemMessageId YOU_ACQUIRED_S1_XP_AND_S2_SP_AS_A_REWARD_YOU_RECEIVE_S3_MORE_XP;
	
	@ClientString(id = 6012, message = "a blessing that increases XP by $1 $2")
	public static SystemMessageId A_BLESSING_THAT_INCREASES_XP_BY_1_2;
	
	@ClientString(id = 6013, message = "It is not a blessing period. When you reach today's target, you can receive $s1.")
	public static SystemMessageId IT_IS_NOT_A_BLESSING_PERIOD_WHEN_YOU_REACH_TODAY_S_TARGET_YOU_CAN_RECEIVE_S1;
	
	@ClientString(id = 6014, message = "It is Eva's blessing period. $s1 will be effective until $s2.")
	public static SystemMessageId IT_IS_EVA_S_BLESSING_PERIOD_S1_WILL_BE_EFFECTIVE_UNTIL_S2;
	
	@ClientString(id = 6015, message = "It is Eva's blessing period. Until $s1, Jack Sage can gift you with $s2.")
	public static SystemMessageId IT_IS_EVA_S_BLESSING_PERIOD_UNTIL_S1_JACK_SAGE_CAN_GIFT_YOU_WITH_S2;
	
	@ClientString(id = 6016, message = "Progress: Event stage $s1.")
	public static SystemMessageId PROGRESS_EVENT_STAGE_S1;
	
	@ClientString(id = 6017, message = "Eva's Blessing Stage $s1 has begun.")
	public static SystemMessageId EVA_S_BLESSING_STAGE_S1_HAS_BEGUN;
	
	@ClientString(id = 6018, message = "Eva's Blessing Stage $s1 has ended.")
	public static SystemMessageId EVA_S_BLESSING_STAGE_S1_HAS_ENDED;
	
	@ClientString(id = 6019, message = "You cannot buy the item on this day of the week.")
	public static SystemMessageId YOU_CANNOT_BUY_THE_ITEM_ON_THIS_DAY_OF_THE_WEEK;
	
	@ClientString(id = 6020, message = "You cannot buy the item at this hour.")
	public static SystemMessageId YOU_CANNOT_BUY_THE_ITEM_AT_THIS_HOUR;
	
	@ClientString(id = 6021, message = "$s1 reached $s2 consecutive wins in Jack Game.")
	public static SystemMessageId S1_REACHED_S2_CONSECUTIVE_WINS_IN_JACK_GAME;
	
	@ClientString(id = 6022, message = "$s1 received $s4 $s3 as reward for $s2 consecutive wins.")
	public static SystemMessageId S1_RECEIVED_S4_S3_AS_REWARD_FOR_S2_CONSECUTIVE_WINS;
	
	@ClientString(id = 6023, message = "World: $s1 consecutive wins ($s2 ppl.)")
	public static SystemMessageId WORLD_S1_CONSECUTIVE_WINS_S2_PPL;
	
	@ClientString(id = 6024, message = "My Record: $s1 consecutive wins")
	public static SystemMessageId MY_RECORD_S1_CONSECUTIVE_WINS;
	
	@ClientString(id = 6025, message = "World: Under 4 consecutive wins")
	public static SystemMessageId WORLD_UNDER_4_CONSECUTIVE_WINS;
	
	@ClientString(id = 6026, message = "My Record: Under 4 consecutive wins")
	public static SystemMessageId MY_RECORD_UNDER_4_CONSECUTIVE_WINS;
	
	@ClientString(id = 6027, message = "It's Halloween Event period.")
	public static SystemMessageId IT_S_HALLOWEEN_EVENT_PERIOD;
	
	@ClientString(id = 6028, message = "No record over 10 consecutive wins.")
	public static SystemMessageId NO_RECORD_OVER_10_CONSECUTIVE_WINS;
	
	@ClientString(id = 6029, message = "Please help raise reindeer for Santa's Christmas delivery!")
	public static SystemMessageId PLEASE_HELP_RAISE_REINDEER_FOR_SANTA_S_CHRISTMAS_DELIVERY;
	
	@ClientString(id = 6030, message = "Santa has started delivering the Christmas gifts to Aden!")
	public static SystemMessageId SANTA_HAS_STARTED_DELIVERING_THE_CHRISTMAS_GIFTS_TO_ADEN;
	
	@ClientString(id = 6031, message = "Santa has completed the deliveries! See you in 1 hour!")
	public static SystemMessageId SANTA_HAS_COMPLETED_THE_DELIVERIES_SEE_YOU_IN_1_HOUR;
	
	@ClientString(id = 6032, message = "Santa is out delivering the gifts. Happy Holidays!")
	public static SystemMessageId SANTA_IS_OUT_DELIVERING_THE_GIFTS_HAPPY_HOLIDAYS;
	
	@ClientString(id = 6033, message = "Only the top $s1 appear in the ranking, and only the top $s2 are recorded in My Best Ranking.")
	public static SystemMessageId ONLY_THE_TOP_S1_APPEAR_IN_THE_RANKING_AND_ONLY_THE_TOP_S2_ARE_RECORDED_IN_MY_BEST_RANKING;
	
	@ClientString(id = 6034, message = "$s1 have/has been initialized.")
	public static SystemMessageId S1_HAVE_HAS_BEEN_INITIALIZED;
	
	@ClientString(id = 6035, message = "When there are many players with the same score, they appear in the order in which they were achieved.")
	public static SystemMessageId WHEN_THERE_ARE_MANY_PLAYERS_WITH_THE_SAME_SCORE_THEY_APPEAR_IN_THE_ORDER_IN_WHICH_THEY_WERE_ACHIEVED;
	
	@ClientString(id = 6036, message = "Below $s1 point(s)")
	public static SystemMessageId BELOW_S1_POINT_S;
	
	@ClientString(id = 6037, message = "The Lovers' Jubilee has begun!")
	public static SystemMessageId THE_LOVERS_JUBILEE_HAS_BEGUN;
	
	@ClientString(id = 6038, message = "You can use the Evangelist Mark. (/Evangelist on/off is used to toggle)")
	public static SystemMessageId YOU_CAN_USE_THE_EVANGELIST_MARK_EVANGELIST_ON_OFF_IS_USED_TO_TOGGLE;
	
	@ClientString(id = 6039, message = "You have completed the initial level. Congratulations~!")
	public static SystemMessageId YOU_HAVE_COMPLETED_THE_INITIAL_LEVEL_CONGRATULATIONS;
	
	@ClientString(id = 6040, message = "Please type 'on/off' after the command.")
	public static SystemMessageId PLEASE_TYPE_ON_OFF_AFTER_THE_COMMAND;
	
	@ClientString(id = 6041, message = "This is the April Fools' Day event period.")
	public static SystemMessageId THIS_IS_THE_APRIL_FOOLS_DAY_EVENT_PERIOD;
	
	@ClientString(id = 6042, message = "The skill was canceled due to insufficient energy.")
	public static SystemMessageId THE_SKILL_WAS_CANCELED_DUE_TO_INSUFFICIENT_ENERGY;
	
	@ClientString(id = 6043, message = "You cannot replenish energy because you do not meet the requirements.")
	public static SystemMessageId YOU_CANNOT_REPLENISH_ENERGY_BECAUSE_YOU_DO_NOT_MEET_THE_REQUIREMENTS;
	
	@ClientString(id = 6044, message = "Energy was replenished by $s1.")
	public static SystemMessageId ENERGY_WAS_REPLENISHED_BY_S1;
	
	@ClientString(id = 6045, message = "$c1 acquired the April Fools' Day Special Gift.")
	public static SystemMessageId C1_ACQUIRED_THE_APRIL_FOOLS_DAY_SPECIAL_GIFT;
	
	@ClientString(id = 6046, message = "The premium item for this account was provided. If the premium account is terminated, this item will be deleted.")
	public static SystemMessageId THE_PREMIUM_ITEM_FOR_THIS_ACCOUNT_WAS_PROVIDED_IF_THE_PREMIUM_ACCOUNT_IS_TERMINATED_THIS_ITEM_WILL_BE_DELETED;
	
	@ClientString(id = 6047, message = "The premium item cannot be received because the inventory weight/quantity limit has been exceeded.")
	public static SystemMessageId THE_PREMIUM_ITEM_CANNOT_BE_RECEIVED_BECAUSE_THE_INVENTORY_WEIGHT_QUANTITY_LIMIT_HAS_BEEN_EXCEEDED;
	
	@ClientString(id = 6048, message = "The premium account has been terminated. The provided premium item was deleted.")
	public static SystemMessageId THE_PREMIUM_ACCOUNT_HAS_BEEN_TERMINATED_THE_PROVIDED_PREMIUM_ITEM_WAS_DELETED;
	
	@ClientString(id = 6049, message = "$s1 is on the Ignore List. In order to whisper, it must be deleted from the Ignore List. nnDo you want to delete $s1 from the Ignore List?")
	public static SystemMessageId S1_IS_ON_THE_IGNORE_LIST_IN_ORDER_TO_WHISPER_IT_MUST_BE_DELETED_FROM_THE_IGNORE_LIST_N_NDO_YOU_WANT_TO_DELETE_S1_FROM_THE_IGNORE_LIST;
	
	@ClientString(id = 6050, message = "If you have a Maestro's Key, you can use it to open the treasure chest.")
	public static SystemMessageId IF_YOU_HAVE_A_MAESTRO_S_KEY_YOU_CAN_USE_IT_TO_OPEN_THE_TREASURE_CHEST;
	
	@ClientString(id = 6051, message = "You can't log in with an unregistered PC.")
	public static SystemMessageId YOU_CAN_T_LOG_IN_WITH_AN_UNREGISTERED_PC;
	
	@ClientString(id = 6052, message = "You have receive $s1 gift(s). You can receive $s2 more. The gift delivery time will reset every day at 6:30 AM.")
	public static SystemMessageId YOU_HAVE_RECEIVE_S1_GIFT_S_YOU_CAN_RECEIVE_S2_MORE_THE_GIFT_DELIVERY_TIME_WILL_RESET_EVERY_DAY_AT_6_30_AM;
	
	@ClientString(id = 6053, message = "You have earned $s1's XP through the PC Bonus.")
	public static SystemMessageId YOU_HAVE_EARNED_S1_S_XP_THROUGH_THE_PC_BONUS;
	
	@ClientString(id = 6054, message = "You have earned $s1's Fame through the PC Bonus.")
	public static SystemMessageId YOU_HAVE_EARNED_S1_S_FAME_THROUGH_THE_PC_BONUS;
	
	@ClientString(id = 6055, message = "Membership cannot be changed because requirements of a clan member are not met.")
	public static SystemMessageId MEMBERSHIP_CANNOT_BE_CHANGED_BECAUSE_REQUIREMENTS_OF_A_CLAN_MEMBER_ARE_NOT_MET;
	
	@ClientString(id = 6056, message = "$s1 (Currently $s3 time(s) has/have been used out of maximum $s2 times)")
	public static SystemMessageId S1_CURRENTLY_S3_TIME_S_HAS_HAVE_BEEN_USED_OUT_OF_MAXIMUM_S2_TIMES;
	
	@ClientString(id = 6057, message = "You cannot purchase the PC item. Make sure you have enough room in your inventory, and that make you are not suffering from the weight penalty. (The item will be resupplied every 5 minutes.)")
	public static SystemMessageId YOU_CANNOT_PURCHASE_THE_PC_ITEM_MAKE_SURE_YOU_HAVE_ENOUGH_ROOM_IN_YOUR_INVENTORY_AND_THAT_MAKE_YOU_ARE_NOT_SUFFERING_FROM_THE_WEIGHT_PENALTY_THE_ITEM_WILL_BE_RESUPPLIED_EVERY_5_MINUTES;
	
	@ClientString(id = 6058, message = "That account is pending email authentication. Please verify authentication email with registered email account.")
	public static SystemMessageId THAT_ACCOUNT_IS_PENDING_EMAIL_AUTHENTICATION_PLEASE_VERIFY_AUTHENTICATION_EMAIL_WITH_REGISTERED_EMAIL_ACCOUNT;
	
	@ClientString(id = 6059, message = "ID or Email")
	public static SystemMessageId ID_OR_EMAIL;
	
	@ClientString(id = 6060, message = "Password with no more than 16 characters")
	public static SystemMessageId PASSWORD_WITH_NO_MORE_THAN_16_CHARACTERS;
	
	@ClientString(id = 6061, message = "Hero chatting currently prohibited.")
	public static SystemMessageId HERO_CHATTING_CURRENTLY_PROHIBITED;
	
	@ClientString(id = 6062, message = "Hero chatting is currently available.")
	public static SystemMessageId HERO_CHATTING_IS_CURRENTLY_AVAILABLE;
	
	@ClientString(id = 6063, message = "Hero chatting has been stopped. $s1 minute(s) remaining until Hero Chatting will be available.")
	public static SystemMessageId HERO_CHATTING_HAS_BEEN_STOPPED_S1_MINUTE_S_REMAINING_UNTIL_HERO_CHATTING_WILL_BE_AVAILABLE;
	
	@ClientString(id = 6064, message = "Items that were given as gifts cannot be returned for refund. nnDo you want to gift it to $s1?")
	public static SystemMessageId ITEMS_THAT_WERE_GIVEN_AS_GIFTS_CANNOT_BE_RETURNED_FOR_REFUND_N_NDO_YOU_WANT_TO_GIFT_IT_TO_S1;
	
	@ClientString(id = 6065, message = "$s1 has sent you a gift.")
	public static SystemMessageId S1_HAS_SENT_YOU_A_GIFT;
	
	@ClientString(id = 6066, message = "If you cancel sending, the gift item cannot be sent again, and it will be returned to your character.")
	public static SystemMessageId IF_YOU_CANCEL_SENDING_THE_GIFT_ITEM_CANNOT_BE_SENT_AGAIN_AND_IT_WILL_BE_RETURNED_TO_YOUR_CHARACTER;
	
	@ClientString(id = 6067, message = "Vitality is applied, and you receive $s1% bonus XP. A maximum of $s2 Vitality potion(s) can be used per week, including replenishing/maintaining/recovering.")
	public static SystemMessageId VITALITY_IS_APPLIED_AND_YOU_RECEIVE_S1_BONUS_XP_A_MAXIMUM_OF_S2_VITALITY_POTION_S_CAN_BE_USED_PER_WEEK_INCLUDING_REPLENISHING_MAINTAINING_RECOVERING;
	
	@ClientString(id = 6068, message = "Vitality is not yet applied. Vitality is replenished every Wednesday at 6:30 a.m. A maximum of $s1 vitality potion(s) can be used per week, including replenishing/maintaining/recovering.")
	public static SystemMessageId VITALITY_IS_NOT_YET_APPLIED_VITALITY_IS_REPLENISHED_EVERY_WEDNESDAY_AT_6_30_A_M_A_MAXIMUM_OF_S1_VITALITY_POTION_S_CAN_BE_USED_PER_WEEK_INCLUDING_REPLENISHING_MAINTAINING_RECOVERING;
	
	@ClientString(id = 6069, message = "You used the Adventurer's Song. You can use $s1 more. The use limit is reset every Wednesday at 6:30 a.m.")
	public static SystemMessageId YOU_USED_THE_ADVENTURER_S_SONG_YOU_CAN_USE_S1_MORE_THE_USE_LIMIT_IS_RESET_EVERY_WEDNESDAY_AT_6_30_A_M;
	
	@ClientString(id = 6070, message = "A maximum of 8 non-quantity items can be given as gifts. nPlease confirm the quantity.")
	public static SystemMessageId A_MAXIMUM_OF_8_NON_QUANTITY_ITEMS_CAN_BE_GIVEN_AS_GIFTS_NPLEASE_CONFIRM_THE_QUANTITY;
	
	@ClientString(id = 6071, message = "Your item gift-giving was successful. nYou can check the gift item through your mailbox.")
	public static SystemMessageId YOUR_ITEM_GIFT_GIVING_WAS_SUCCESSFUL_NYOU_CAN_CHECK_THE_GIFT_ITEM_THROUGH_YOUR_MAILBOX;
	
	@ClientString(id = 6072, message = "$s1% bonus XP is being applied.")
	public static SystemMessageId S1_BONUS_XP_IS_BEING_APPLIED;
	
	@ClientString(id = 6073, message = "$s1 vitality items can be used.")
	public static SystemMessageId S1_VITALITY_ITEMS_CAN_BE_USED;
	
	@ClientString(id = 6074, message = "The name of the character cannot be in English.")
	public static SystemMessageId THE_NAME_OF_THE_CHARACTER_CANNOT_BE_IN_ENGLISH;
	
	@ClientString(id = 6075, message = "If you press the start button, $s1's appearance will be changed. The Appearance Item will be deleted.")
	public static SystemMessageId IF_YOU_PRESS_THE_START_BUTTON_S1_S_APPEARANCE_WILL_BE_CHANGED_THE_APPEARANCE_ITEM_WILL_BE_DELETED;
	
	@ClientString(id = 6076, message = "If you press the start button, $s1's appearance will be changed. The Appearance Item will remain.")
	public static SystemMessageId IF_YOU_PRESS_THE_START_BUTTON_S1_S_APPEARANCE_WILL_BE_CHANGED_THE_APPEARANCE_ITEM_WILL_REMAIN;
	
	@ClientString(id = 6077, message = "If you press the start button, $s1 will be restored to its original appearance.")
	public static SystemMessageId IF_YOU_PRESS_THE_START_BUTTON_S1_WILL_BE_RESTORED_TO_ITS_ORIGINAL_APPEARANCE;
	
	@ClientString(id = 6078, message = "$s1's Appearance Modification has failed.")
	public static SystemMessageId S1_S_APPEARANCE_MODIFICATION_HAS_FAILED;
	
	@ClientString(id = 6079, message = "$s1's Appearance Modification has finished.")
	public static SystemMessageId S1_S_APPEARANCE_MODIFICATION_HAS_FINISHED;
	
	@ClientString(id = 6080, message = "$s1's appearance will be changed into that of $s2. Proceed? (Warning: Soul Crystal Enchantment, PvP options, etc. could reset the appearance.)")
	public static SystemMessageId S1_S_APPEARANCE_WILL_BE_CHANGED_INTO_THAT_OF_S2_PROCEED_WARNING_SOUL_CRYSTAL_ENCHANTMENT_PVP_OPTIONS_ETC_COULD_RESET_THE_APPEARANCE;
	
	@ClientString(id = 6081, message = "$s1's appearance will be changed. Do you wish to continue?")
	public static SystemMessageId S1_S_APPEARANCE_WILL_BE_CHANGED_DO_YOU_WISH_TO_CONTINUE;
	
	@ClientString(id = 6082, message = "$s1's appearance will be restored. Do you wish to continue?")
	public static SystemMessageId S1_S_APPEARANCE_WILL_BE_RESTORED_DO_YOU_WISH_TO_CONTINUE;
	
	@ClientString(id = 6083, message = "You cannot use this system during trading, private store, and workshop setup.")
	public static SystemMessageId YOU_CANNOT_USE_THIS_SYSTEM_DURING_TRADING_PRIVATE_STORE_AND_WORKSHOP_SETUP;
	
	@ClientString(id = 6084, message = "Appearance Modification or Restoration in progress. Please try again after completing this task.")
	public static SystemMessageId APPEARANCE_MODIFICATION_OR_RESTORATION_IN_PROGRESS_PLEASE_TRY_AGAIN_AFTER_COMPLETING_THIS_TASK;
	
	@ClientString(id = 6085, message = "$s1 now has $s2's appearance.")
	public static SystemMessageId S1_NOW_HAS_S2_S_APPEARANCE;
	
	@ClientString(id = 6086, message = "$s1's appearance has been restored.")
	public static SystemMessageId S1_S_APPEARANCE_HAS_BEEN_RESTORED;
	
	@ClientString(id = 6087, message = "If you've lost your information, please visit (font color='#FFDF4C')$s1((/font)(font color='#6699FF')(a href='asfunction:homePage')$s2(/a)(/font)(font color='#FFDF4C')) 1:1 Customer Service Center(/font) to verify.")
	public static SystemMessageId IF_YOU_VE_LOST_YOUR_INFORMATION_PLEASE_VISIT_FONT_COLOR_FFDF4C_S1_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_S2_A_FONT_FONT_COLOR_FFDF4C_1_1_CUSTOMER_SERVICE_CENTER_FONT_TO_VERIFY;
	
	@ClientString(id = 6088, message = "NC True")
	public static SystemMessageId NC_TRUE;
	
	@ClientString(id = 6089, message = "www.nctrue.com")
	public static SystemMessageId WWW_NCTRUE_COM;
	
	@ClientString(id = 6090, message = "If you want to create a new account, please visit (font color='#FFDF4C')$s1((/font)(font color='#6699FF')(a href='asfunction:homePage')$s2(/a)(/font) and go to (font color='#FFDF4C'))(/font).")
	public static SystemMessageId IF_YOU_WANT_TO_CREATE_A_NEW_ACCOUNT_PLEASE_VISIT_FONT_COLOR_FFDF4C_S1_FONT_FONT_COLOR_6699FF_A_HREF_ASFUNCTION_HOMEPAGE_S2_A_FONT_AND_GO_TO_FONT_COLOR_FFDF4C_FONT;
	
	@ClientString(id = 6091, message = "You cannot select a deactivated character. Activation can occur through the premium account service.")
	public static SystemMessageId YOU_CANNOT_SELECT_A_DEACTIVATED_CHARACTER_ACTIVATION_CAN_OCCUR_THROUGH_THE_PREMIUM_ACCOUNT_SERVICE;
	
	@ClientString(id = 6092, message = "This item cannot be modified or restored.")
	public static SystemMessageId THIS_ITEM_CANNOT_BE_MODIFIED_OR_RESTORED;
	
	@ClientString(id = 6093, message = "This item cannot be used as an Appearance Weapon.")
	public static SystemMessageId THIS_ITEM_CANNOT_BE_USED_AS_AN_APPEARANCE_WEAPON;
	
	@ClientString(id = 6094, message = "This item does not meet requirements.")
	public static SystemMessageId THIS_ITEM_DOES_NOT_MEET_REQUIREMENTS;
	
	@ClientString(id = 6095, message = "You cannot delete a deactivated character. Activation can occur through the premium account service.")
	public static SystemMessageId YOU_CANNOT_DELETE_A_DEACTIVATED_CHARACTER_ACTIVATION_CAN_OCCUR_THROUGH_THE_PREMIUM_ACCOUNT_SERVICE;
	
	@ClientString(id = 6096, message = "Please select an item to change.")
	public static SystemMessageId PLEASE_SELECT_AN_ITEM_TO_CHANGE;
	
	@ClientString(id = 6097, message = "Failed to view the rank.")
	public static SystemMessageId FAILED_TO_VIEW_THE_RANK;
	
	@ClientString(id = 6098, message = "This item cannot be given as a gift.")
	public static SystemMessageId THIS_ITEM_CANNOT_BE_GIVEN_AS_A_GIFT;
	
	@ClientString(id = 6099, message = "You cannot modify as you do not have enough Adena.")
	public static SystemMessageId YOU_CANNOT_MODIFY_AS_YOU_DO_NOT_HAVE_ENOUGH_ADENA;
	
	@ClientString(id = 6100, message = "You have spent $s1 on a successful appearance modification.")
	public static SystemMessageId YOU_HAVE_SPENT_S1_ON_A_SUCCESSFUL_APPEARANCE_MODIFICATION;
	
	@ClientString(id = 6101, message = "Item grades do not match.")
	public static SystemMessageId ITEM_GRADES_DO_NOT_MATCH;
	
	@ClientString(id = 6102, message = "You cannot extract from items that are higher-grade than items to be modified.")
	public static SystemMessageId YOU_CANNOT_EXTRACT_FROM_ITEMS_THAT_ARE_HIGHER_GRADE_THAN_ITEMS_TO_BE_MODIFIED;
	
	@ClientString(id = 6103, message = "You cannot modify or restore No-grade items.")
	public static SystemMessageId YOU_CANNOT_MODIFY_OR_RESTORE_NO_GRADE_ITEMS;
	
	@ClientString(id = 6104, message = "Weapons only.")
	public static SystemMessageId WEAPONS_ONLY;
	
	@ClientString(id = 6105, message = "Armor only.")
	public static SystemMessageId ARMOR_ONLY;
	
	@ClientString(id = 6106, message = "You cannot extract from a modified item.")
	public static SystemMessageId YOU_CANNOT_EXTRACT_FROM_A_MODIFIED_ITEM;
	
	@ClientString(id = 6107, message = "With a premium account service, you can add a mentee.")
	public static SystemMessageId WITH_A_PREMIUM_ACCOUNT_SERVICE_YOU_CAN_ADD_A_MENTEE;
	
	@ClientString(id = 6108, message = "The account has been blocked because OTP verification failed.")
	public static SystemMessageId THE_ACCOUNT_HAS_BEEN_BLOCKED_BECAUSE_OTP_VERIFICATION_FAILED;
	
	@ClientString(id = 6109, message = "There is an error in OTP system.")
	public static SystemMessageId THERE_IS_AN_ERROR_IN_OTP_SYSTEM;
	
	@ClientString(id = 6110, message = "Hair Accessories only.")
	public static SystemMessageId HAIR_ACCESSORIES_ONLY;
	
	@ClientString(id = 6111, message = "The number of Vitality effects usable during this period has increased by $s1. You can currently use $s2 Vitality items.")
	public static SystemMessageId THE_NUMBER_OF_VITALITY_EFFECTS_USABLE_DURING_THIS_PERIOD_HAS_INCREASED_BY_S1_YOU_CAN_CURRENTLY_USE_S2_VITALITY_ITEMS;
	
	@ClientString(id = 6112, message = "You cannot restore items that have not been modified.")
	public static SystemMessageId YOU_CANNOT_RESTORE_ITEMS_THAT_HAVE_NOT_BEEN_MODIFIED;
	
	@ClientString(id = 6113, message = "This character cannot equip the modified items. Please check if the modified appearance is only available to a female character, Kamael race, or the Ertheia race. This item can be equipped if restored.")
	public static SystemMessageId THIS_CHARACTER_CANNOT_EQUIP_THE_MODIFIED_ITEMS_PLEASE_CHECK_IF_THE_MODIFIED_APPEARANCE_IS_ONLY_AVAILABLE_TO_A_FEMALE_CHARACTER_KAMAEL_RACE_OR_THE_ERTHEIA_RACE_THIS_ITEM_CAN_BE_EQUIPPED_IF_RESTORED;
	
	@ClientString(id = 6114, message = "If your extraction target is female-only, the restriction will apply to the modified item once appearance is modified. Proceed?")
	public static SystemMessageId IF_YOUR_EXTRACTION_TARGET_IS_FEMALE_ONLY_THE_RESTRICTION_WILL_APPLY_TO_THE_MODIFIED_ITEM_ONCE_APPEARANCE_IS_MODIFIED_PROCEED;
	
	@ClientString(id = 6115, message = "Do you want to delete all products from your Favorites list?")
	public static SystemMessageId DO_YOU_WANT_TO_DELETE_ALL_PRODUCTS_FROM_YOUR_FAVORITES_LIST;
	
	@ClientString(id = 6116, message = "The product $s1 is now on your Favorites list.")
	public static SystemMessageId THE_PRODUCT_S1_IS_NOW_ON_YOUR_FAVORITES_LIST;
	
	@ClientString(id = 6117, message = "You cannot purchase the item because you've exceeded the maximum number of items you can purchase.")
	public static SystemMessageId YOU_CANNOT_PURCHASE_THE_ITEM_BECAUSE_YOU_VE_EXCEEDED_THE_MAXIMUM_NUMBER_OF_ITEMS_YOU_CAN_PURCHASE;
	
	@ClientString(id = 6118, message = "For more information about the product, check the purchase window.")
	public static SystemMessageId FOR_MORE_INFORMATION_ABOUT_THE_PRODUCT_CHECK_THE_PURCHASE_WINDOW;
	
	@ClientString(id = 6119, message = "Only death await those who refuse to serve Lady Shilen!")
	public static SystemMessageId ONLY_DEATH_AWAIT_THOSE_WHO_REFUSE_TO_SERVE_LADY_SHILEN;
	
	@ClientString(id = 6120, message = "Shilen's shout: I will be taking that power of yours.")
	public static SystemMessageId SHILEN_S_SHOUT_I_WILL_BE_TAKING_THAT_POWER_OF_YOURS;
	
	@ClientString(id = 6121, message = "Only Jermann left. Hurry up and get it over with!")
	public static SystemMessageId ONLY_JERMANN_LEFT_HURRY_UP_AND_GET_IT_OVER_WITH;
	
	@ClientString(id = 6122, message = "You cannot participate in event campaigns in this area.")
	public static SystemMessageId YOU_CANNOT_PARTICIPATE_IN_EVENT_CAMPAIGNS_IN_THIS_AREA;
	
	@ClientString(id = 6123, message = "You cannot participate in event campaigns while you are in a chaotic state.")
	public static SystemMessageId YOU_CANNOT_PARTICIPATE_IN_EVENT_CAMPAIGNS_WHILE_YOU_ARE_IN_A_CHAOTIC_STATE;
	
	@ClientString(id = 6124, message = "You cannot participate in event campaigns while you are a flying transformed object.")
	public static SystemMessageId YOU_CANNOT_PARTICIPATE_IN_EVENT_CAMPAIGNS_WHILE_YOU_ARE_A_FLYING_TRANSFORMED_OBJECT;
	
	@ClientString(id = 6125, message = "You cannot participate in event campaigns.")
	public static SystemMessageId YOU_CANNOT_PARTICIPATE_IN_EVENT_CAMPAIGNS;
	
	@ClientString(id = 6126, message = "You cannot participate in event campaigns because you've exceeded the inventory weight/quantity limit.")
	public static SystemMessageId YOU_CANNOT_PARTICIPATE_IN_EVENT_CAMPAIGNS_BECAUSE_YOU_VE_EXCEEDED_THE_INVENTORY_WEIGHT_QUANTITY_LIMIT;
	
	@ClientString(id = 6127, message = "You have gained $s1 XP and $s2 SP for your contribution in the raid.")
	public static SystemMessageId YOU_HAVE_GAINED_S1_XP_AND_S2_SP_FOR_YOUR_CONTRIBUTION_IN_THE_RAID;
	
	@ClientString(id = 6128, message = "You cannot modify an equipped item into the appearance of an unequippable item. Please check race/gender restrictions. You can modify the appearance if you unequip the item.")
	public static SystemMessageId YOU_CANNOT_MODIFY_AN_EQUIPPED_ITEM_INTO_THE_APPEARANCE_OF_AN_UNEQUIPPABLE_ITEM_PLEASE_CHECK_RACE_GENDER_RESTRICTIONS_YOU_CAN_MODIFY_THE_APPEARANCE_IF_YOU_UNEQUIP_THE_ITEM;
	
	@ClientString(id = 6129, message = "Your level cannot purchase this item.")
	public static SystemMessageId YOUR_LEVEL_CANNOT_PURCHASE_THIS_ITEM;
	
	@ClientString(id = 6130, message = "An Ink Herb was obtained, replenishing the Small Bard's Ink.")
	public static SystemMessageId AN_INK_HERB_WAS_OBTAINED_REPLENISHING_THE_SMALL_BARD_S_INK;
	
	@ClientString(id = 6131, message = "A Great Ink Herb was obtained, replenishing the Small Bard's Ink.")
	public static SystemMessageId A_GREAT_INK_HERB_WAS_OBTAINED_REPLENISHING_THE_SMALL_BARD_S_INK;
	
	@ClientString(id = 6132, message = "The Small Bard's Ink has decreased.")
	public static SystemMessageId THE_SMALL_BARD_S_INK_HAS_DECREASED;
	
	@ClientString(id = 6133, message = "You have been blocked by multiple players. You are now banned from the chat channel.")
	public static SystemMessageId YOU_HAVE_BEEN_BLOCKED_BY_MULTIPLE_PLAYERS_YOU_ARE_NOW_BANNED_FROM_THE_CHAT_CHANNEL;
	
	@ClientString(id = 6134, message = "+$s2$s3 has been destroyed with the death of $s1.")
	public static SystemMessageId S2_S3_HAS_BEEN_DESTROYED_WITH_THE_DEATH_OF_S1;
	
	@ClientString(id = 6135, message = "The party is currently at a place that does not allow summoning or teleporting.")
	public static SystemMessageId THE_PARTY_IS_CURRENTLY_AT_A_PLACE_THAT_DOES_NOT_ALLOW_SUMMONING_OR_TELEPORTING;
	
	@ClientString(id = 6136, message = "You have acquired a clan hall of higher value than the Provisional Clan Hall. #The Provisional Clan Hall ownership will automatically be forfeited.")
	public static SystemMessageId YOU_HAVE_ACQUIRED_A_CLAN_HALL_OF_HIGHER_VALUE_THAN_THE_PROVISIONAL_CLAN_HALL_THE_PROVISIONAL_CLAN_HALL_OWNERSHIP_WILL_AUTOMATICALLY_BE_FORFEITED;
	
	@ClientString(id = 6137, message = "You have exceeded the maximum number of purchases for this item.")
	public static SystemMessageId YOU_HAVE_EXCEEDED_THE_MAXIMUM_NUMBER_OF_PURCHASES_FOR_THIS_ITEM;
	
	@ClientString(id = 6138, message = "You have completed training in the Royal Training Camp, and obtained $s1 XP and $s2 SP.")
	public static SystemMessageId YOU_HAVE_COMPLETED_TRAINING_IN_THE_ROYAL_TRAINING_CAMP_AND_OBTAINED_S1_XP_AND_S2_SP;
	
	@ClientString(id = 6139, message = "Not enough tickets.")
	public static SystemMessageId NOT_ENOUGH_TICKETS;
	
	@ClientString(id = 6140, message = "Your inventory is either full or overweight.")
	public static SystemMessageId YOUR_INVENTORY_IS_EITHER_FULL_OR_OVERWEIGHT;
	
	@ClientString(id = 6141, message = "Congratulations! $c1 has obtained $s2 of $s3 through Fortune Reading.")
	public static SystemMessageId CONGRATULATIONS_C1_HAS_OBTAINED_S2_OF_S3_THROUGH_FORTUNE_READING;
	
	@ClientString(id = 6142, message = "Congratulations! $c1 has obtained $s2 of $s3 in the Luxury Fortune Reading.")
	public static SystemMessageId CONGRATULATIONS_C1_HAS_OBTAINED_S2_OF_S3_IN_THE_LUXURY_FORTUNE_READING;
	
	@ClientString(id = 6143, message = "You can use Lucky Enchant Stones that match their corresponding scrolls for items enchanted between + 3 and + 15.")
	public static SystemMessageId YOU_CAN_USE_LUCKY_ENCHANT_STONES_THAT_MATCH_THEIR_CORRESPONDING_SCROLLS_FOR_ITEMS_ENCHANTED_BETWEEN_3_AND_15;
	
	@ClientString(id = 6144, message = "Not enough Hero Coin.")
	public static SystemMessageId NOT_ENOUGH_HERO_COIN;
	
	@ClientString(id = 6145, message = "Training Stage: Lv. $s1")
	public static SystemMessageId TRAINING_STAGE_LV_S1;
	
	@ClientString(id = 6146, message = "Remaining Training Time: $s1 hr, $s2 min")
	public static SystemMessageId REMAINING_TRAINING_TIME_S1_HR_S2_MIN;
	
	@ClientString(id = 6147, message = "Character Level: $s1")
	public static SystemMessageId CHARACTER_LEVEL_S1;
	
	@ClientString(id = 6148, message = "$s2 (Can level up)")
	public static SystemMessageId S2_CAN_LEVEL_UP;
	
	@ClientString(id = 6149, message = "Acquired XP: $s1")
	public static SystemMessageId ACQUIRED_XP_S1;
	
	@ClientString(id = 6150, message = "Acquired SP: $s1")
	public static SystemMessageId ACQUIRED_SP_S1;
	
	@ClientString(id = 6151, message = "Training Time: $s1 hr, $s2 min")
	public static SystemMessageId TRAINING_TIME_S1_HR_S2_MIN;
	
	@ClientString(id = 6152, message = "Failed to use skill.")
	public static SystemMessageId FAILED_TO_USE_SKILL;
	
	@ClientString(id = 6153, message = "$s1 has expired.")
	public static SystemMessageId S1_HAS_EXPIRED2;
	
	@ClientString(id = 6154, message = "You cannot receive rewards for training if you have trained for less than 1 minute.")
	public static SystemMessageId YOU_CANNOT_RECEIVE_REWARDS_FOR_TRAINING_IF_YOU_HAVE_TRAINED_FOR_LESS_THAN_1_MINUTE;
	
	@ClientString(id = 6155, message = "Your character creation date does not allow for this purchase.")
	public static SystemMessageId YOUR_CHARACTER_CREATION_DATE_DOES_NOT_ALLOW_FOR_THIS_PURCHASE;
	
	@ClientString(id = 6156, message = "You cannot take other action while entering the Training Camp.")
	public static SystemMessageId YOU_CANNOT_TAKE_OTHER_ACTION_WHILE_ENTERING_THE_TRAINING_CAMP;
	
	@ClientString(id = 6157, message = "You cannot request to a character who is entering the Training Camp.")
	public static SystemMessageId YOU_CANNOT_REQUEST_TO_A_CHARACTER_WHO_IS_ENTERING_THE_TRAINING_CAMP;
	
	@ClientString(id = 6158, message = "Round $s1 of Fortune Reading complete.")
	public static SystemMessageId ROUND_S1_OF_FORTUNE_READING_COMPLETE;
	
	@ClientString(id = 6159, message = "Round $s1 of Luxury Fortune Reading complete.")
	public static SystemMessageId ROUND_S1_OF_LUXURY_FORTUNE_READING_COMPLETE;
	
	@ClientString(id = 6160, message = "Congratulations! You have acquired $s1 of $s2.")
	public static SystemMessageId CONGRATULATIONS_YOU_HAVE_ACQUIRED_S1_OF_S2;
	
	@ClientString(id = 6161, message = "Calculating XP and SP obtained from training…")
	public static SystemMessageId CALCULATING_XP_AND_SP_OBTAINED_FROM_TRAINING;
	
	@ClientString(id = 6162, message = "$c1 is currently in the Royal Training Camp, and cannot participate in the Olympiad.")
	public static SystemMessageId C1_IS_CURRENTLY_IN_THE_ROYAL_TRAINING_CAMP_AND_CANNOT_PARTICIPATE_IN_THE_OLYMPIAD;
	
	@ClientString(id = 6163, message = "You can only be rewarded as the class in which you entered the training camp.")
	public static SystemMessageId YOU_CAN_ONLY_BE_REWARDED_AS_THE_CLASS_IN_WHICH_YOU_ENTERED_THE_TRAINING_CAMP;
	
	@ClientString(id = 6164, message = "Up to $s1 per $s2 day(s) per account")
	public static SystemMessageId UP_TO_S1_PER_S2_DAY_S_PER_ACCOUNT;
	
	@ClientString(id = 6165, message = "Up to $s1 per account")
	public static SystemMessageId UP_TO_S1_PER_ACCOUNT;
	
	@ClientString(id = 6166, message = "Only one character per account may enter at any time.")
	public static SystemMessageId ONLY_ONE_CHARACTER_PER_ACCOUNT_MAY_ENTER_AT_ANY_TIME;
	
	@ClientString(id = 6167, message = "You cannot enter the training camp while in a party or using the automatic replacement system.")
	public static SystemMessageId YOU_CANNOT_ENTER_THE_TRAINING_CAMP_WHILE_IN_A_PARTY_OR_USING_THE_AUTOMATIC_REPLACEMENT_SYSTEM;
	
	@ClientString(id = 6168, message = "You cannot enter the training camp with a mount or in a transformed state.")
	public static SystemMessageId YOU_CANNOT_ENTER_THE_TRAINING_CAMP_WITH_A_MOUNT_OR_IN_A_TRANSFORMED_STATE;
	
	@ClientString(id = 6169, message = "You have completed the day's training.")
	public static SystemMessageId YOU_HAVE_COMPLETED_THE_DAY_S_TRAINING;
	
	@ClientString(id = 6170, message = "Lv. $s1 or above")
	public static SystemMessageId LV_S1_OR_ABOVE;
	
	@ClientString(id = 6171, message = "Lv. $s1 or below")
	public static SystemMessageId LV_S1_OR_BELOW;
	
	@ClientString(id = 6172, message = "Redirecting to the Lineage II website. Proceed?")
	public static SystemMessageId REDIRECTING_TO_THE_LINEAGE_II_WEBSITE_PROCEED;
	
	@ClientString(id = 6173, message = "The lower your Fame, the higher your chances of dropping items when you die with a PK count of $s1 or above.")
	public static SystemMessageId THE_LOWER_YOUR_FAME_THE_HIGHER_YOUR_CHANCES_OF_DROPPING_ITEMS_WHEN_YOU_DIE_WITH_A_PK_COUNT_OF_S1_OR_ABOVE;
	
	@ClientString(id = 6501, message = "You cannot bookmark this location because you do not have a My Teleport Flag.")
	public static SystemMessageId YOU_CANNOT_BOOKMARK_THIS_LOCATION_BECAUSE_YOU_DO_NOT_HAVE_A_MY_TELEPORT_FLAG;
	
	@ClientString(id = 6502, message = "My Teleport Flag: $s1")
	public static SystemMessageId MY_TELEPORT_FLAG_S1;
	
	@ClientString(id = 6503, message = "The evil Thomas D. Turkey has appeared. Please save Santa.")
	public static SystemMessageId THE_EVIL_THOMAS_D_TURKEY_HAS_APPEARED_PLEASE_SAVE_SANTA;
	
	@ClientString(id = 6504, message = "You won the battle against Thomas D. Turkey. Santa has been rescued.")
	public static SystemMessageId YOU_WON_THE_BATTLE_AGAINST_THOMAS_D_TURKEY_SANTA_HAS_BEEN_RESCUED;
	
	@ClientString(id = 6505, message = "You did not rescue Santa, and Thomas D. Turkey has disappeared.")
	public static SystemMessageId YOU_DID_NOT_RESCUE_SANTA_AND_THOMAS_D_TURKEY_HAS_DISAPPEARED;
	
	@ClientString(id = 6506, message = "Although you can't be certain, the air seems laden with the scent of freshly baked bread.")
	public static SystemMessageId ALTHOUGH_YOU_CAN_T_BE_CERTAIN_THE_AIR_SEEMS_LADEN_WITH_THE_SCENT_OF_FRESHLY_BAKED_BREAD;
	
	@ClientString(id = 6507, message = "You feel refreshed. Everything appears clear.")
	public static SystemMessageId YOU_FEEL_REFRESHED_EVERYTHING_APPEARS_CLEAR;
	
	static
	{
		buildFastLookupTable();
	}
	
	private static final void buildFastLookupTable()
	{
		final Field[] fields = SystemMessageId.class.getDeclaredFields();
		
		for (final Field field : fields)
		{
			int mod = field.getModifiers();
			if (Modifier.isStatic(mod) && Modifier.isPublic(mod) && field.getType().equals(SystemMessageId.class) && field.isAnnotationPresent(ClientString.class))
			{
				try
				{
					final ClientString annotation = field.getAnnotationsByType(ClientString.class)[0];
					SystemMessageId smId = new SystemMessageId(annotation.id());
					smId.setName(field.getName());
					smId.setParamCount(parseMessageParameters(field.getName()));
					field.set(null, smId);
					VALUES.put(smId.getId(), smId);
				}
				catch (final Exception e)
				{
					_log.log(Level.WARNING, "SystemMessageId: Failed field access for '" + field.getName() + "'", e);
				}
			}
		}
	}
	
	private static final int parseMessageParameters(final String name)
	{
		int paramCount = 0;
		char c1, c2;
		for (int i = 0; i < (name.length() - 1); i++)
		{
			c1 = name.charAt(i);
			if ((c1 == 'C') || (c1 == 'S'))
			{
				c2 = name.charAt(i + 1);
				if (Character.isDigit(c2))
				{
					paramCount = Math.max(paramCount, Character.getNumericValue(c2));
					i++;
				}
			}
		}
		return paramCount;
	}
	
	public static final SystemMessageId getSystemMessageId(final int id)
	{
		final SystemMessageId smi = getSystemMessageIdInternal(id);
		return smi == null ? new SystemMessageId(id) : smi;
	}
	
	private static final SystemMessageId getSystemMessageIdInternal(final int id)
	{
		return VALUES.get(id);
	}
	
	public static final SystemMessageId getSystemMessageId(final String name)
	{
		try
		{
			return (SystemMessageId) SystemMessageId.class.getField(name).get(null);
		}
		catch (final Exception e)
		{
			return null;
		}
	}
	
	public static final void reloadLocalisations()
	{
		for (final SystemMessageId smId : VALUES.values())
		{
			if (smId != null)
			{
				smId.removeAllLocalisations();
			}
		}
		
		if (!Config.L2JMOD_MULTILANG_SM_ENABLE)
		{
			_log.log(Level.INFO, "SystemMessageId: MultiLanguage disabled.");
			return;
		}
		
		final List<String> languages = Config.L2JMOD_MULTILANG_SM_ALLOWED;
		final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setValidating(false);
		factory.setIgnoringComments(true);
		
		File file;
		Node node;
		Document doc;
		NamedNodeMap nnmb;
		SystemMessageId smId;
		String text;
		for (final String lang : languages)
		{
			file = new File(Config.DATAPACK_ROOT, "/lang/" + lang + "/sm/SystemMessageLocalisation.xml");
			if (!file.isFile())
			{
				continue;
			}
			
			_log.log(Level.INFO, "SystemMessageId: Loading localisation for '" + lang + "'");
			
			try
			{
				doc = factory.newDocumentBuilder().parse(file);
				for (Node na = doc.getFirstChild(); na != null; na = na.getNextSibling())
				{
					if ("list".equals(na.getNodeName()))
					{
						for (Node nb = na.getFirstChild(); nb != null; nb = nb.getNextSibling())
						{
							if ("sm".equals(nb.getNodeName()))
							{
								nnmb = nb.getAttributes();
								node = nnmb.getNamedItem("id");
								if (node != null)
								{
									smId = getSystemMessageId(Integer.parseInt(node.getNodeValue()));
									if (smId == null)
									{
										_log.log(Level.WARNING, "SystemMessageId: Unknown SMID '" + node.getNodeValue() + "', lang '" + lang + "'.");
										continue;
									}
								}
								else
								{
									node = nnmb.getNamedItem("name");
									smId = getSystemMessageId(node.getNodeValue());
									if (smId == null)
									{
										_log.log(Level.WARNING, "SystemMessageId: Unknown SMID '" + node.getNodeValue() + "', lang '" + lang + "'.");
										continue;
									}
								}
								
								node = nnmb.getNamedItem("text");
								if (node == null)
								{
									_log.log(Level.WARNING, "SystemMessageId: No text defined for SMID '" + smId + "', lang '" + lang + "'.");
									continue;
								}
								
								text = node.getNodeValue();
								if (text.isEmpty() || (text.length() > 255))
								{
									_log.log(Level.WARNING, "SystemMessageId: Invalid text defined for SMID '" + smId + "' (to long or empty), lang '" + lang + "'.");
									continue;
								}
								
								smId.attachLocalizedText(lang, text);
							}
						}
					}
				}
			}
			catch (final Exception e)
			{
				_log.log(Level.SEVERE, "SystemMessageId: Failed loading '" + file + "'", e);
			}
		}
	}
	
	private final int _id;
	private String _name;
	private byte _params;
	private SMLocalisation[] _localisations;
	private SystemMessage _staticSystemMessage;
	
	private SystemMessageId(final int id)
	{
		_id = id;
		_localisations = EMPTY_SML_ARRAY;
	}
	
	public final int getId()
	{
		return _id;
	}
	
	private final void setName(final String name)
	{
		_name = name;
	}
	
	public final String getName()
	{
		return _name;
	}
	
	public final int getParamCount()
	{
		return _params;
	}
	
	/**
	 * You better don`t touch this!
	 * @param params
	 */
	public final void setParamCount(final int params)
	{
		if (params < 0)
		{
			throw new IllegalArgumentException("Invalid negative param count: " + params);
		}
		
		if (params > 10)
		{
			throw new IllegalArgumentException("Maximum param count exceeded: " + params);
		}
		
		if (params != 0)
		{
			_staticSystemMessage = null;
		}
		
		_params = (byte) params;
	}
	
	public final SMLocalisation getLocalisation(final String lang)
	{
		SMLocalisation sml;
		for (int i = _localisations.length; i-- > 0;)
		{
			sml = _localisations[i];
			if (sml.getLanguage().hashCode() == lang.hashCode())
			{
				return sml;
			}
		}
		return null;
	}
	
	public final void attachLocalizedText(final String lang, final String text)
	{
		final int length = _localisations.length;
		final SMLocalisation[] localisations = Arrays.copyOf(_localisations, length + 1);
		localisations[length] = new SMLocalisation(lang, text);
		_localisations = localisations;
	}
	
	public final void removeAllLocalisations()
	{
		_localisations = EMPTY_SML_ARRAY;
	}
	
	public final SystemMessage getStaticSystemMessage()
	{
		return _staticSystemMessage;
	}
	
	public final void setStaticSystemMessage(final SystemMessage sm)
	{
		_staticSystemMessage = sm;
	}
	
	@Override
	public final String toString()
	{
		return "SM[" + getId() + ":" + getName() + "]";
	}
	
	public static final class SMLocalisation
	{
		private final String _lang;
		private final Builder _builder;
		
		public SMLocalisation(final String lang, final String text)
		{
			_lang = lang;
			_builder = Builder.newBuilder(text);
		}
		
		public final String getLanguage()
		{
			return _lang;
		}
		
		public final String getLocalisation(final Object... params)
		{
			return _builder.toString(params);
		}
	}
}
