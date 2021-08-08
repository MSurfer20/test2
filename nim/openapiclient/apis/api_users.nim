#
# Zulip REST API
# 
# Powerful open source group chat 
# The version of the OpenAPI document: 1.0.0
# 
# Generated by: https://openapi-generator.tech
#

import httpclient
import json
import logging
import marshal
import options
import strformat
import strutils
import tables
import typetraits
import uri

import ../models/model_any_type
import ../models/model_coded_error
import ../models/model_json_error
import ../models/model_json_success
import ../models/model_json_success_base
import ../models/model_object
import ../models/model_one_of&lt;object,object,object&gt;
import ../models/model_one_of&lt;object,object&gt;

const basepath = "https://example.zulipchat.com/api/v1"

template constructResult[T](response: Response): untyped =
  if response.code in {Http200, Http201, Http202, Http204, Http206}:
    try:
      when name(stripGenericParams(T.typedesc).typedesc) == name(Table):
        (some(json.to(parseJson(response.body), T.typedesc)), response)
      else:
        (some(marshal.to[T](response.body)), response)
    except JsonParsingError:
      # The server returned a malformed response though the response code is 2XX
      # TODO: need better error handling
      error("JsonParsingError")
      (none(T.typedesc), response)
  else:
    (none(T.typedesc), response)


proc createUser*(httpClient: HttpClient, email: string, password: string, fullName: string): (Option[JsonSuccessBase], Response) =
  ## Create a user
  let query_for_api_call = encodeQuery([
    ("email", $email), # The email address of the new user. 
    ("password", $password), # The password of the new user. 
    ("full_name", $fullName), # The full name of the new user. 
  ])

  let response = httpClient.post(basepath & "/users" & "?" & query_for_api_call)
  constructResult[JsonSuccessBase](response)


proc createUserGroup*(httpClient: HttpClient, name: string, description: string, members: seq[int]): (Option[JsonSuccess], Response) =
  ## Create a user group
  let query_for_api_call = encodeQuery([
    ("name", $name), # The name of the user group. 
    ("description", $description), # The description of the user group. 
    ("members", $members.join(",")), # An array containing the user IDs of the initial members for the new user group. 
  ])

  let response = httpClient.post(basepath & "/user_groups/create" & "?" & query_for_api_call)
  constructResult[JsonSuccess](response)


proc deactivateOwnUser*(httpClient: HttpClient): (Option[JsonSuccess], Response) =
  ## Deactivate own user

  let response = httpClient.delete(basepath & "/users/me")
  constructResult[JsonSuccess](response)


proc deactivateUser*(httpClient: HttpClient, userId: int): (Option[JsonSuccess], Response) =
  ## Deactivate a user

  let response = httpClient.delete(basepath & fmt"/users/{user_id}")
  constructResult[JsonSuccess](response)


proc getAttachments*(httpClient: HttpClient): (Option[JsonSuccessBase], Response) =
  ## Get attachments

  let response = httpClient.get(basepath & "/attachments")
  constructResult[JsonSuccessBase](response)


proc getOwnUser*(httpClient: HttpClient): (Option[JsonSuccessBase], Response) =
  ## Get own user

  let response = httpClient.get(basepath & "/users/me")
  constructResult[JsonSuccessBase](response)


proc getUser*(httpClient: HttpClient, userId: int, clientGravatar: bool, includeCustomProfileFields: bool): (Option[JsonSuccessBase], Response) =
  ## Get a user
  let query_for_api_call = encodeQuery([
    ("client_gravatar", $clientGravatar), # Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
    ("include_custom_profile_fields", $includeCustomProfileFields), # Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
  ])

  let response = httpClient.get(basepath & fmt"/users/{user_id}" & "?" & query_for_api_call)
  constructResult[JsonSuccessBase](response)


proc getUserByEmail*(httpClient: HttpClient, email: string, clientGravatar: bool, includeCustomProfileFields: bool): (Option[JsonSuccessBase], Response) =
  ## Get a user by email
  let query_for_api_call = encodeQuery([
    ("client_gravatar", $clientGravatar), # Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
    ("include_custom_profile_fields", $includeCustomProfileFields), # Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
  ])

  let response = httpClient.get(basepath & fmt"/users/{email}" & "?" & query_for_api_call)
  constructResult[JsonSuccessBase](response)


proc getUserGroups*(httpClient: HttpClient): (Option[JsonSuccessBase], Response) =
  ## Get user groups

  let response = httpClient.get(basepath & "/user_groups")
  constructResult[JsonSuccessBase](response)


proc getUserPresence*(httpClient: HttpClient, userIdOrEmail: string): (Option[JsonSuccessBase], Response) =
  ## Get user presence

  let response = httpClient.get(basepath & fmt"/users/{user_id_or_email}/presence")
  constructResult[JsonSuccessBase](response)


proc getUsers*(httpClient: HttpClient, clientGravatar: bool, includeCustomProfileFields: bool): (Option[JsonSuccessBase], Response) =
  ## Get all users
  let query_for_api_call = encodeQuery([
    ("client_gravatar", $clientGravatar), # Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
    ("include_custom_profile_fields", $includeCustomProfileFields), # Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
  ])

  let response = httpClient.get(basepath & "/users" & "?" & query_for_api_call)
  constructResult[JsonSuccessBase](response)


proc muteUser*(httpClient: HttpClient, mutedUserId: int): (Option[JsonSuccess], Response) =
  ## Mute a user

  let response = httpClient.post(basepath & fmt"/users/me/muted_users/{muted_user_id}")
  constructResult[JsonSuccess](response)


proc reactivateUser*(httpClient: HttpClient, userId: int): (Option[AnyType], Response) =
  ## Reactivate a user

  let response = httpClient.post(basepath & fmt"/users/{user_id}/reactivate")
  constructResult[AnyType](response)


proc removeUserGroup*(httpClient: HttpClient, userGroupId: int): (Option[JsonSuccess], Response) =
  ## Delete a user group

  let response = httpClient.delete(basepath & fmt"/user_groups/{user_group_id}")
  constructResult[JsonSuccess](response)


proc setTypingStatus*(httpClient: HttpClient, op: string, to: seq[int], `type`: string, topic: string): (Option[JsonSuccess], Response) =
  ## Set \"typing\" status
  let query_for_api_call = encodeQuery([
    ("type", $`type`), # Type of the message being composed. 
    ("op", $op), # Whether the user has started (`start`) or stopped (`stop`) to type. 
    ("to", $to.join(",")), # For 'private' type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For 'stream' type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11). 
    ("topic", $topic), # Topic to which message is being typed. Required for the 'stream' type. Ignored in case of 'private' type. 
  ])

  let response = httpClient.post(basepath & "/typing" & "?" & query_for_api_call)
  constructResult[JsonSuccess](response)


proc unmuteUser*(httpClient: HttpClient, mutedUserId: int): (Option[JsonSuccess], Response) =
  ## Unmute a user

  let response = httpClient.delete(basepath & fmt"/users/me/muted_users/{muted_user_id}")
  constructResult[JsonSuccess](response)


proc updateDisplaySettings*(httpClient: HttpClient, twentyFourHourTime: bool, denseMode: bool, starredMessageCounts: bool, fluidLayoutWidth: bool, highContrastMode: bool, colorScheme: ColorScheme, translateEmoticons: bool, defaultLanguage: string, defaultView: string, leftSideUserlist: bool, emojiset: string, demoteInactiveStreams: DemoteInactiveStreams, timezone: string): (Option[JsonSuccessBase], Response) =
  ## Update display settings
  let query_for_api_call = encodeQuery([
    ("twenty_four_hour_time", $twentyFourHourTime), # Whether time should be [displayed in 24-hour notation](/help/change-the-time-format). 
    ("dense_mode", $denseMode), # This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip. 
    ("starred_message_counts", $starredMessageCounts), # Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages). 
    ("fluid_layout_width", $fluidLayoutWidth), # Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app's center panel (message feed, recent topics) on wide screens. 
    ("high_contrast_mode", $highContrastMode), # This setting is reserved for use to control variations in Zulip's design to help visually impaired users. 
    ("color_scheme", $colorScheme), # Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard `prefers-color-scheme` media query. 
    ("translate_emoticons", $translateEmoticons), # Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends. 
    ("default_language", $defaultLanguage), # What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, `\"en\"` for English or `\"de\"` for German.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63). 
    ("default_view", $defaultView), # The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the `Esc` keyboard shortcut repeatedly.  * \"recent_topics\" - Recent topics view * \"all_messages\" - All messages view  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64). 
    ("left_side_userlist", $leftSideUserlist), # Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked. 
    ("emojiset", $emojiset), # The user's configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \"google\" - Google modern * \"google-blob\" - Google classic * \"twitter\" - Twitter * \"text\" - Plain text  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64). 
    ("demote_inactive_streams", $demoteInactiveStreams), # Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never 
    ("timezone", $timezone), # The user's [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64). 
  ])

  let response = httpClient.patch(basepath & "/settings/display" & "?" & query_for_api_call)
  constructResult[JsonSuccessBase](response)


proc updateNotificationSettings*(httpClient: HttpClient, enableStreamDesktopNotifications: bool, enableStreamEmailNotifications: bool, enableStreamPushNotifications: bool, enableStreamAudibleNotifications: bool, notificationSound: string, enableDesktopNotifications: bool, enableSounds: bool, enableOfflineEmailNotifications: bool, enableOfflinePushNotifications: bool, enableOnlinePushNotifications: bool, enableDigestEmails: bool, enableMarketingEmails: bool, enableLoginEmails: bool, messageContentInEmailNotifications: bool, pmContentInDesktopNotifications: bool, wildcardMentionsNotify: bool, desktopIconCountDisplay: DesktopIconCountDisplay, realmNameInNotifications: bool, presenceEnabled: bool): (Option[JsonSuccessBase], Response) =
  ## Update notification settings
  let query_for_api_call = encodeQuery([
    ("enable_stream_desktop_notifications", $enableStreamDesktopNotifications), # Enable visual desktop notifications for stream messages. 
    ("enable_stream_email_notifications", $enableStreamEmailNotifications), # Enable email notifications for stream messages. 
    ("enable_stream_push_notifications", $enableStreamPushNotifications), # Enable mobile notifications for stream messages. 
    ("enable_stream_audible_notifications", $enableStreamAudibleNotifications), # Enable audible desktop notifications for stream messages. 
    ("notification_sound", $notificationSound), # Notification sound name.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63). 
    ("enable_desktop_notifications", $enableDesktopNotifications), # Enable visual desktop notifications for private messages and @-mentions. 
    ("enable_sounds", $enableSounds), # Enable audible desktop notifications for private messages and @-mentions. 
    ("enable_offline_email_notifications", $enableOfflineEmailNotifications), # Enable email notifications for private messages and @-mentions received when the user is offline. 
    ("enable_offline_push_notifications", $enableOfflinePushNotifications), # Enable mobile notification for private messages and @-mentions received when the user is offline. 
    ("enable_online_push_notifications", $enableOnlinePushNotifications), # Enable mobile notification for private messages and @-mentions received when the user is online. 
    ("enable_digest_emails", $enableDigestEmails), # Enable digest emails when the user is away. 
    ("enable_marketing_emails", $enableMarketingEmails), # Enable marketing emails. Has no function outside Zulip Cloud. 
    ("enable_login_emails", $enableLoginEmails), # Enable email notifications for new logins to account. 
    ("message_content_in_email_notifications", $messageContentInEmailNotifications), # Include the message's content in email notifications for new messages. 
    ("pm_content_in_desktop_notifications", $pmContentInDesktopNotifications), # Include content of private messages in desktop notifications. 
    ("wildcard_mentions_notify", $wildcardMentionsNotify), # Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention. 
    ("desktop_icon_count_display", $desktopIconCountDisplay), # Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None 
    ("realm_name_in_notifications", $realmNameInNotifications), # Include organization name in subject of message notification emails. 
    ("presence_enabled", $presenceEnabled), # Display the presence status to other users when online. 
  ])

  let response = httpClient.patch(basepath & "/settings/notifications" & "?" & query_for_api_call)
  constructResult[JsonSuccessBase](response)


proc updateUser*(httpClient: HttpClient, userId: int, fullName: string, role: int, profileData: seq[object]): (Option[JsonSuccess], Response) =
  ## Update a user
  let query_for_api_call = encodeQuery([
    ("full_name", $fullName), # The user's full name. 
    ("role", $role), # New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of `is_admin` and `is_guest` boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60). 
    ("profile_data", $profileData.join(",")), # A dictionary containing the to be updated custom profile field data for the user. 
  ])

  let response = httpClient.patch(basepath & fmt"/users/{user_id}" & "?" & query_for_api_call)
  constructResult[JsonSuccess](response)


proc updateUserGroup*(httpClient: HttpClient, userGroupId: int, name: string, description: string): (Option[JsonSuccess], Response) =
  ## Update a user group
  let query_for_api_call = encodeQuery([
    ("name", $name), # The new name of the group. 
    ("description", $description), # The new description of the group. 
  ])

  let response = httpClient.patch(basepath & fmt"/user_groups/{user_group_id}" & "?" & query_for_api_call)
  constructResult[JsonSuccess](response)


proc updateUserGroupMembers*(httpClient: HttpClient, userGroupId: int, delete: seq[int], add: seq[int]): (Option[JsonSuccess], Response) =
  ## Update user group members
  let query_for_api_call = encodeQuery([
    ("delete", $delete.join(",")), # The list of user ids to be removed from the user group. 
    ("add", $add.join(",")), # The list of user ids to be added to the user group. 
  ])

  let response = httpClient.post(basepath & fmt"/user_groups/{user_group_id}/members" & "?" & query_for_api_call)
  constructResult[JsonSuccess](response)
