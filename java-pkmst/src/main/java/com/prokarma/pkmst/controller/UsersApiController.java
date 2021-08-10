package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.CodedError;
import com.prokarma.pkmst.model.JsonError;
import com.prokarma.pkmst.model.JsonSuccess;
import com.prokarma.pkmst.model.JsonSuccessBase;
import com.prokarma.pkmst.model.OneOfobjectobject;
import com.prokarma.pkmst.model.OneOfobjectobjectobject;
import com.prokarma.pkmst.model.OneOfobjectobjectobjectobjectobjectobject;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
/**
 * Api implemention
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2021-08-10T11:44:18.948405Z[Etc/UTC]")
@Controller
public class UsersApiController implements UsersApi {
    private final ObjectMapper objectMapper;
@Autowired
    public UsersApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<JsonSuccessBase> createUser(@ApiParam(value = "The email address of the new user. ", required = true)  @RequestParam(value = "email", required = true) String email,
        @ApiParam(value = "The password of the new user. ", required = true)  @RequestParam(value = "password", required = true) String password,
        @ApiParam(value = "The full name of the new user. ", required = true)  @RequestParam(value = "full_name", required = true) String fullName,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccessBase>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccess> createUserGroup(@ApiParam(value = "The name of the user group. ", required = true)  @RequestParam(value = "name", required = true) String name,
        @ApiParam(value = "The description of the user group. ", required = true)  @RequestParam(value = "description", required = true) String description,
        @ApiParam(value = "An array containing the user IDs of the initial members for the new user group. ", required = true)  @RequestParam(value = "members", required = true) List<Integer> members,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccess>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccess> deactivateOwnUser(@RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccess>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccess> deactivateUser(@ApiParam(value = "The target user's ID. ",required=true ) @PathVariable("user_id") Integer userId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccess>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccessBase> getAttachments(@RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccessBase>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccessBase> getOwnUser(@RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccessBase>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccessBase> getUser(@ApiParam(value = "The target user's ID. ",required=true ) @PathVariable("user_id") Integer userId,
        @ApiParam(value = "Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. ", defaultValue = "false")  @RequestParam(value = "client_gravatar", required = false, defaultValue="false") Boolean clientGravatar,
        @ApiParam(value = "Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. ", defaultValue = "false")  @RequestParam(value = "include_custom_profile_fields", required = false, defaultValue="false") Boolean includeCustomProfileFields,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccessBase>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccessBase> getUserByEmail(@ApiParam(value = "The email address of the user whose details you want to fetch. ",required=true ) @PathVariable("email") String email,
        @ApiParam(value = "Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. ", defaultValue = "false")  @RequestParam(value = "client_gravatar", required = false, defaultValue="false") Boolean clientGravatar,
        @ApiParam(value = "Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. ", defaultValue = "false")  @RequestParam(value = "include_custom_profile_fields", required = false, defaultValue="false") Boolean includeCustomProfileFields,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccessBase>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccessBase> getUserGroups(@RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccessBase>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccessBase> getUserPresence(@ApiParam(value = "The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email. ",required=true ) @PathVariable("user_id_or_email") String userIdOrEmail,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccessBase>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccessBase> getUsers(@ApiParam(value = "Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. ", defaultValue = "false")  @RequestParam(value = "client_gravatar", required = false, defaultValue="false") Boolean clientGravatar,
        @ApiParam(value = "Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. ", defaultValue = "false")  @RequestParam(value = "include_custom_profile_fields", required = false, defaultValue="false") Boolean includeCustomProfileFields,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccessBase>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccess> muteUser(@ApiParam(value = "The ID of the user to mute/un-mute. ",required=true ) @PathVariable("muted_user_id") Integer mutedUserId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccess>(HttpStatus.OK);
    }

    public ResponseEntity<Object> reactivateUser(@ApiParam(value = "The target user's ID. ",required=true ) @PathVariable("user_id") Integer userId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccess> removeUserGroup(@ApiParam(value = "The ID of the target user group. ",required=true ) @PathVariable("user_group_id") Integer userGroupId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccess>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccess> setTypingStatus(@ApiParam(value = "Whether the user has started (`start`) or stopped (`stop`) to type. ", required = true, allowableValues = "start, stop")  @RequestParam(value = "op", required = true) String op,
        @ApiParam(value = "For 'private' type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For 'stream' type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11). ", required = true)  @RequestParam(value = "to", required = true) List<Integer> to,
        @ApiParam(value = "Type of the message being composed. ", allowableValues = "private, stream", defaultValue = "private")  @RequestParam(value = "type", required = false, defaultValue="private") String type,
        @ApiParam(value = "Topic to which message is being typed. Required for the 'stream' type. Ignored in case of 'private' type. ")  @RequestParam(value = "topic", required = false) String topic,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccess>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccess> unmuteUser(@ApiParam(value = "The ID of the user to mute/un-mute. ",required=true ) @PathVariable("muted_user_id") Integer mutedUserId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccess>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccessBase> updateSettings(@ApiParam(value = "A new display name for the user. ")  @RequestParam(value = "full_name", required = false) String fullName,
        @ApiParam(value = "Asks the server to initiate a confirmation sequence to change the user's email address to the indicated value. The user will need to demonstrate control of the new email address by clicking a confirmation link sent to that address. ")  @RequestParam(value = "email", required = false) String email,
        @ApiParam(value = "The user's old Zulip password (or LDAP password, if LDAP authentication is in use).  Required only when sending the `new_password` parameter. ")  @RequestParam(value = "old_password", required = false) String oldPassword,
        @ApiParam(value = "The user's new Zulip password (or LDAP password, if LDAP authentication is in use).  The `old_password` parameter must be included in the request. ")  @RequestParam(value = "new_password", required = false) String newPassword,
        @ApiParam(value = "Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. ")  @RequestParam(value = "twenty_four_hour_time", required = false) Boolean twentyFourHourTime,
        @ApiParam(value = "This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. ")  @RequestParam(value = "dense_mode", required = false) Boolean denseMode,
        @ApiParam(value = "Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. ")  @RequestParam(value = "starred_message_counts", required = false) Boolean starredMessageCounts,
        @ApiParam(value = "Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app's center panel (message feed, recent topics) on wide screens.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. ")  @RequestParam(value = "fluid_layout_width", required = false) Boolean fluidLayoutWidth,
        @ApiParam(value = "This setting is reserved for use to control variations in Zulip's design to help visually impaired users.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. ")  @RequestParam(value = "high_contrast_mode", required = false) Boolean highContrastMode,
        @ApiParam(value = "Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard `prefers-color-scheme` media query.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. ", allowableValues = "1, 2, 3")  @RequestParam(value = "color_scheme", required = false) Integer colorScheme,
        @ApiParam(value = "A boolean parameter to control whether synchronizing drafts is enabled for the user. When synchronization is disabled, all drafts stored in the server will be automatically deleted from the server.  This does not do anything (like sending events) to delete local copies of drafts stored in clients.  **Changes**: New in Zulip 5.0 (feature level 87). ")  @RequestParam(value = "enable_drafts_synchronization", required = false) Boolean enableDraftsSynchronization,
        @ApiParam(value = "Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. ")  @RequestParam(value = "translate_emoticons", required = false) Boolean translateEmoticons,
        @ApiParam(value = "What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, `\"en\"` for English or `\"de\"` for German.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63). ")  @RequestParam(value = "default_language", required = false) String defaultLanguage,
        @ApiParam(value = "The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the `Esc` keyboard shortcut repeatedly.  * \"recent_topics\" - Recent topics view * \"all_messages\" - All messages view  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). ")  @RequestParam(value = "default_view", required = false) String defaultView,
        @ApiParam(value = "Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. ")  @RequestParam(value = "left_side_userlist", required = false) Boolean leftSideUserlist,
        @ApiParam(value = "The user's configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \"google\" - Google modern * \"google-blob\" - Google classic * \"twitter\" - Twitter * \"text\" - Plain text  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). ")  @RequestParam(value = "emojiset", required = false) String emojiset,
        @ApiParam(value = "Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. ", allowableValues = "1, 2, 3")  @RequestParam(value = "demote_inactive_streams", required = false) Integer demoteInactiveStreams,
        @ApiParam(value = "The user's [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). ")  @RequestParam(value = "timezone", required = false) String timezone,
        @ApiParam(value = "Enable visual desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. ")  @RequestParam(value = "enable_stream_desktop_notifications", required = false) Boolean enableStreamDesktopNotifications,
        @ApiParam(value = "Enable email notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. ")  @RequestParam(value = "enable_stream_email_notifications", required = false) Boolean enableStreamEmailNotifications,
        @ApiParam(value = "Enable mobile notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. ")  @RequestParam(value = "enable_stream_push_notifications", required = false) Boolean enableStreamPushNotifications,
        @ApiParam(value = "Enable audible desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. ")  @RequestParam(value = "enable_stream_audible_notifications", required = false) Boolean enableStreamAudibleNotifications,
        @ApiParam(value = "Notification sound name.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63). ")  @RequestParam(value = "notification_sound", required = false) String notificationSound,
        @ApiParam(value = "Enable visual desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. ")  @RequestParam(value = "enable_desktop_notifications", required = false) Boolean enableDesktopNotifications,
        @ApiParam(value = "Enable audible desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. ")  @RequestParam(value = "enable_sounds", required = false) Boolean enableSounds,
        @ApiParam(value = "The duration (in seconds) for which the server should wait to batch email notifications before sending them.  **Changes**: New in Zulip 5.0 (feature level 82) ")  @RequestParam(value = "email_notifications_batching_period_seconds", required = false) Integer emailNotificationsBatchingPeriodSeconds,
        @ApiParam(value = "Enable email notifications for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. ")  @RequestParam(value = "enable_offline_email_notifications", required = false) Boolean enableOfflineEmailNotifications,
        @ApiParam(value = "Enable mobile notification for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. ")  @RequestParam(value = "enable_offline_push_notifications", required = false) Boolean enableOfflinePushNotifications,
        @ApiParam(value = "Enable mobile notification for private messages and @-mentions received when the user is online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. ")  @RequestParam(value = "enable_online_push_notifications", required = false) Boolean enableOnlinePushNotifications,
        @ApiParam(value = "Enable digest emails when the user is away.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. ")  @RequestParam(value = "enable_digest_emails", required = false) Boolean enableDigestEmails,
        @ApiParam(value = "Enable marketing emails. Has no function outside Zulip Cloud.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. ")  @RequestParam(value = "enable_marketing_emails", required = false) Boolean enableMarketingEmails,
        @ApiParam(value = "Enable email notifications for new logins to account.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. ")  @RequestParam(value = "enable_login_emails", required = false) Boolean enableLoginEmails,
        @ApiParam(value = "Include the message's content in email notifications for new messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. ")  @RequestParam(value = "message_content_in_email_notifications", required = false) Boolean messageContentInEmailNotifications,
        @ApiParam(value = "Include content of private messages in desktop notifications.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. ")  @RequestParam(value = "pm_content_in_desktop_notifications", required = false) Boolean pmContentInDesktopNotifications,
        @ApiParam(value = "Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. ")  @RequestParam(value = "wildcard_mentions_notify", required = false) Boolean wildcardMentionsNotify,
        @ApiParam(value = "Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. ", allowableValues = "1, 2, 3")  @RequestParam(value = "desktop_icon_count_display", required = false) Integer desktopIconCountDisplay,
        @ApiParam(value = "Include organization name in subject of message notification emails.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. ")  @RequestParam(value = "realm_name_in_notifications", required = false) Boolean realmNameInNotifications,
        @ApiParam(value = "Display the presence status to other users when online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. ")  @RequestParam(value = "presence_enabled", required = false) Boolean presenceEnabled,
        @ApiParam(value = "Whether pressing Enter in the compose box sends a message (or saves a message edit).  **Changes**: Before Zulip 5.0 (feature level 81), this setting was managed by the `POST /users/me/enter-sends` endpoint, with the same parameter format. ")  @RequestParam(value = "enter_sends", required = false) Boolean enterSends,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccessBase>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccess> updateStatus(@ApiParam(value = "The text content of the status message. Sending the empty string will clear the user's status.  **Note**: The limit on the size of the message is 60 characters. ")  @RequestParam(value = "status_text", required = false) String statusText,
        @ApiParam(value = "Whether the user should be marked as \"away\". ")  @RequestParam(value = "away", required = false) Boolean away,
        @ApiParam(value = "The name for the emoji to associate with this status. ")  @RequestParam(value = "emoji_name", required = false) String emojiName,
        @ApiParam(value = "A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji. ")  @RequestParam(value = "emoji_code", required = false) String emojiCode,
        @ApiParam(value = "One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. ")  @RequestParam(value = "reaction_type", required = false) String reactionType,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccess>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccess> updateUser(@ApiParam(value = "The target user's ID. ",required=true ) @PathVariable("user_id") Integer userId,
        @ApiParam(value = "The user's full name. ")  @RequestParam(value = "full_name", required = false) String fullName,
        @ApiParam(value = "New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of `is_admin` and `is_guest` boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60). ")  @RequestParam(value = "role", required = false) Integer role,
        @ApiParam(value = "A dictionary containing the to be updated custom profile field data for the user. ")  @RequestParam(value = "profile_data", required = false) List<Object> profileData,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccess>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccess> updateUserGroup(@ApiParam(value = "The ID of the target user group. ",required=true ) @PathVariable("user_group_id") Integer userGroupId,
        @ApiParam(value = "The new name of the group. ", required = true)  @RequestParam(value = "name", required = true) String name,
        @ApiParam(value = "The new description of the group. ", required = true)  @RequestParam(value = "description", required = true) String description,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccess>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccess> updateUserGroupMembers(@ApiParam(value = "The ID of the target user group. ",required=true ) @PathVariable("user_group_id") Integer userGroupId,
        @ApiParam(value = "The list of user ids to be removed from the user group. ")  @RequestParam(value = "delete", required = false) List<Integer> delete,
        @ApiParam(value = "The list of user ids to be added to the user group. ")  @RequestParam(value = "add", required = false) List<Integer> add,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccess>(HttpStatus.OK);
    }

}
