require 'json'


MyApp.add_route('POST', '/api/v1/users', {
  "resourcePath" => "/Users",
  "summary" => "Create a user",
  "nickname" => "create_user", 
  "responseClass" => "JsonSuccessBase",
  "endpoint" => "/users", 
  "notes" => "{!can-create-users-only.md!}  Create a new user account via the API.  `POST {{ api_url }}/v1/users` ",
  "parameters" => [
    {
      "name" => "email",
      "description" => "The email address of the new user. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "password",
      "description" => "The password of the new user. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "full_name",
      "description" => "The full name of the new user. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/v1/user_groups/create', {
  "resourcePath" => "/Users",
  "summary" => "Create a user group",
  "nickname" => "create_user_group", 
  "responseClass" => "JsonSuccess",
  "endpoint" => "/user_groups/create", 
  "notes" => "Create a new [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/create` ",
  "parameters" => [
    {
      "name" => "name",
      "description" => "The name of the user group. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "description",
      "description" => "The description of the user group. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "members",
      "description" => "An array containing the user IDs of the initial members for the new user group. ",
      "dataType" => "Array<Integer>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/api/v1/users/me', {
  "resourcePath" => "/Users",
  "summary" => "Deactivate own user",
  "nickname" => "deactivate_own_user", 
  "responseClass" => "JsonSuccess",
  "endpoint" => "/users/me", 
  "notes" => "Deactivates the user's account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  `DELETE {{ api_url }}/v1/users/me`  This endpoint is primarily useful to Zulip clients providing a user settings UI. ",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/api/v1/users/{user_id}', {
  "resourcePath" => "/Users",
  "summary" => "Deactivate a user",
  "nickname" => "deactivate_user", 
  "responseClass" => "JsonSuccess",
  "endpoint" => "/users/{user_id}", 
  "notes" => "[Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `DELETE {{ api_url }}/v1/users/{user_id}` ",
  "parameters" => [
    {
      "name" => "user_id",
      "description" => "The target user&#39;s ID. ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/v1/attachments', {
  "resourcePath" => "/Users",
  "summary" => "Get attachments",
  "nickname" => "get_attachments", 
  "responseClass" => "JsonSuccessBase",
  "endpoint" => "/attachments", 
  "notes" => "Fetch metadata on files uploaded by the requesting user.  `GET {{ api_url }}/v1/attachments` ",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/v1/users/me', {
  "resourcePath" => "/Users",
  "summary" => "Get own user",
  "nickname" => "get_own_user", 
  "responseClass" => "JsonSuccessBase",
  "endpoint" => "/users/me", 
  "notes" => "Get basic data about the user/bot that requests this endpoint.  `GET {{ api_url }}/v1/users/me` ",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/v1/users/{user_id}', {
  "resourcePath" => "/Users",
  "summary" => "Get a user",
  "nickname" => "get_user", 
  "responseClass" => "JsonSuccessBase",
  "endpoint" => "/users/{user_id}", 
  "notes" => "Fetch details for a single user in the organization.  `GET {{ api_url }}/v1/users/{user_id}`  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* ",
  "parameters" => [
    {
      "name" => "client_gravatar",
      "description" => "Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "include_custom_profile_fields",
      "description" => "Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "user_id",
      "description" => "The target user&#39;s ID. ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/v1/users/{email}', {
  "resourcePath" => "/Users",
  "summary" => "Get a user by email",
  "nickname" => "get_user_by_email", 
  "responseClass" => "JsonSuccessBase",
  "endpoint" => "/users/{email}", 
  "notes" => "Fetch details for a single user in the organization given a Zulip display email address.  `GET {{ api_url }}/v1/users/{email}`  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* ",
  "parameters" => [
    {
      "name" => "client_gravatar",
      "description" => "Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "include_custom_profile_fields",
      "description" => "Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "email",
      "description" => "The email address of the user whose details you want to fetch. ",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/v1/user_groups', {
  "resourcePath" => "/Users",
  "summary" => "Get user groups",
  "nickname" => "get_user_groups", 
  "responseClass" => "JsonSuccessBase",
  "endpoint" => "/user_groups", 
  "notes" => "{!api-members-only.md!}  Fetches all of the user groups in the organization.  `GET {{ api_url }}/v1/user_groups` ",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/v1/users/{user_id_or_email}/presence', {
  "resourcePath" => "/Users",
  "summary" => "Get user presence",
  "nickname" => "get_user_presence", 
  "responseClass" => "JsonSuccessBase",
  "endpoint" => "/users/{user_id_or_email}/presence", 
  "notes" => "Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user's presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  `GET {{ api_url }}/v1/users/{user_id_or_email}/presence`  See [Zulip's developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. ",
  "parameters" => [
    {
      "name" => "user_id_or_email",
      "description" => "The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email. ",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/v1/users', {
  "resourcePath" => "/Users",
  "summary" => "Get all users",
  "nickname" => "get_users", 
  "responseClass" => "JsonSuccessBase",
  "endpoint" => "/users", 
  "notes" => "Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  `GET {{ api_url }}/v1/users`  You can also [fetch details on a single user](/api/get-user). ",
  "parameters" => [
    {
      "name" => "client_gravatar",
      "description" => "Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "include_custom_profile_fields",
      "description" => "Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/v1/users/me/muted_users/{muted_user_id}', {
  "resourcePath" => "/Users",
  "summary" => "Mute a user",
  "nickname" => "mute_user", 
  "responseClass" => "JsonSuccess",
  "endpoint" => "/users/me/muted_users/{muted_user_id}", 
  "notes" => "This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you've muted will be automatically marked as read and hidden.  `POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \"Muted user\", rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \"All users that exist   on this stream or realm\", e.g. for organization   administration or showing stream subscribers, should display   the user's name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). ",
  "parameters" => [
    {
      "name" => "muted_user_id",
      "description" => "The ID of the user to mute/un-mute. ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/v1/users/{user_id}/reactivate', {
  "resourcePath" => "/Users",
  "summary" => "Reactivate a user",
  "nickname" => "reactivate_user", 
  "responseClass" => "AnyType",
  "endpoint" => "/users/{user_id}/reactivate", 
  "notes" => "[Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `POST {{ api_url }}/v1/users/{user_id}/reactivate` ",
  "parameters" => [
    {
      "name" => "user_id",
      "description" => "The target user&#39;s ID. ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/api/v1/user_groups/{user_group_id}', {
  "resourcePath" => "/Users",
  "summary" => "Delete a user group",
  "nickname" => "remove_user_group", 
  "responseClass" => "JsonSuccess",
  "endpoint" => "/user_groups/{user_group_id}", 
  "notes" => "Delete a [user group](/help/user-groups).  `DELETE {{ api_url }}/v1/user_groups/{user_group_id}` ",
  "parameters" => [
    {
      "name" => "user_group_id",
      "description" => "The ID of the target user group. ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/v1/typing', {
  "resourcePath" => "/Users",
  "summary" => "Set \"typing\" status",
  "nickname" => "set_typing_status", 
  "responseClass" => "JsonSuccess",
  "endpoint" => "/typing", 
  "notes" => "Notify other users whether the current user is typing a message.  `POST {{ api_url }}/v1/typing`  Clients implementing Zulip's typing notifications protocol should work as follows:  * Send a request to this endpoint with `op=\"start\"` when a user starts typing a message,   and also every `TYPING_STARTED_WAIT_PERIOD=10` seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with `op=\"stop\"` when a user pauses using the   compose UI for at least `TYPING_STOPPED_WAIT_PERIOD=5` seconds or cancels   the compose action (if it had previously sent a \"start\" operation for that   compose action). * Start displaying \"Sender is typing\" for a given conversation when the client   receives an `op=\"start\"` event from the [events API](/api/get-events). * Continue displaying \"Sender is typing\" until they receive an `op=\"stop\"` event   from the [events API](/api/get-events) or `TYPING_STARTED_EXPIRY_PERIOD=15`   seconds have passed without a new `op=\"start\"` event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   `stream_typing_notifications` in the `client_capabilities` parameter to `/register`.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip's typing notifications protocol. ",
  "parameters" => [
    {
      "name" => "type",
      "description" => "Type of the message being composed. ",
      "dataType" => "String",
      "allowableValues" => "[private, stream]",
      "defaultValue" => "'private'",
      "paramType" => "query",
    },
    {
      "name" => "op",
      "description" => "Whether the user has started (&#x60;start&#x60;) or stopped (&#x60;stop&#x60;) to type. ",
      "dataType" => "String",
      "allowableValues" => "[start, stop]",
      "paramType" => "query",
    },
    {
      "name" => "to",
      "description" => "For &#39;private&#39; type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For &#39;stream&#39; type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11). ",
      "dataType" => "Array<Integer>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "topic",
      "description" => "Topic to which message is being typed. Required for the &#39;stream&#39; type. Ignored in case of &#39;private&#39; type. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/api/v1/users/me/muted_users/{muted_user_id}', {
  "resourcePath" => "/Users",
  "summary" => "Unmute a user",
  "nickname" => "unmute_user", 
  "responseClass" => "JsonSuccess",
  "endpoint" => "/users/me/muted_users/{muted_user_id}", 
  "notes" => "This endpoint unmutes a user.  `DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  **Changes**: New in Zulip 4.0 (feature level 48). ",
  "parameters" => [
    {
      "name" => "muted_user_id",
      "description" => "The ID of the user to mute/un-mute. ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/api/v1/settings/display', {
  "resourcePath" => "/Users",
  "summary" => "Update display settings",
  "nickname" => "update_display_settings", 
  "responseClass" => "JsonSuccessBase",
  "endpoint" => "/settings/display", 
  "notes" => "This endpoint is used to edit the current user's user interface settings.  `PATCH {{ api_url }}/v1/settings/display` ",
  "parameters" => [
    {
      "name" => "twenty_four_hour_time",
      "description" => "Whether time should be [displayed in 24-hour notation](/help/change-the-time-format). ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "dense_mode",
      "description" => "This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "starred_message_counts",
      "description" => "Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages). ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "fluid_layout_width",
      "description" => "Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app&#39;s center panel (message feed, recent topics) on wide screens. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "high_contrast_mode",
      "description" => "This setting is reserved for use to control variations in Zulip&#39;s design to help visually impaired users. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "color_scheme",
      "description" => "Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard &#x60;prefers-color-scheme&#x60; media query. ",
      "dataType" => "Integer",
      "allowableValues" => "[1, 2, 3]",
      "paramType" => "query",
    },
    {
      "name" => "translate_emoticons",
      "description" => "Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "default_language",
      "description" => "What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, &#x60;\&quot;en\&quot;&#x60; for English or &#x60;\&quot;de\&quot;&#x60; for German.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63). ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "default_view",
      "description" => "The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the &#x60;Esc&#x60; keyboard shortcut repeatedly.  * \&quot;recent_topics\&quot; - Recent topics view * \&quot;all_messages\&quot; - All messages view  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64). ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "left_side_userlist",
      "description" => "Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "emojiset",
      "description" => "The user&#39;s configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \&quot;google\&quot; - Google modern * \&quot;google-blob\&quot; - Google classic * \&quot;twitter\&quot; - Twitter * \&quot;text\&quot; - Plain text  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64). ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "demote_inactive_streams",
      "description" => "Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never ",
      "dataType" => "Integer",
      "allowableValues" => "[1, 2, 3]",
      "paramType" => "query",
    },
    {
      "name" => "timezone",
      "description" => "The user&#39;s [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64). ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/api/v1/settings/notifications', {
  "resourcePath" => "/Users",
  "summary" => "Update notification settings",
  "nickname" => "update_notification_settings", 
  "responseClass" => "JsonSuccessBase",
  "endpoint" => "/settings/notifications", 
  "notes" => "This endpoint is used to edit the user's global notification settings. See [this endpoint](/api/update-subscription-settings) for per-stream notification settings.  `PATCH {{ api_url }}/v1/settings/notifications` ",
  "parameters" => [
    {
      "name" => "enable_stream_desktop_notifications",
      "description" => "Enable visual desktop notifications for stream messages. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "enable_stream_email_notifications",
      "description" => "Enable email notifications for stream messages. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "enable_stream_push_notifications",
      "description" => "Enable mobile notifications for stream messages. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "enable_stream_audible_notifications",
      "description" => "Enable audible desktop notifications for stream messages. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "notification_sound",
      "description" => "Notification sound name.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63). ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "enable_desktop_notifications",
      "description" => "Enable visual desktop notifications for private messages and @-mentions. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "enable_sounds",
      "description" => "Enable audible desktop notifications for private messages and @-mentions. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "enable_offline_email_notifications",
      "description" => "Enable email notifications for private messages and @-mentions received when the user is offline. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "enable_offline_push_notifications",
      "description" => "Enable mobile notification for private messages and @-mentions received when the user is offline. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "enable_online_push_notifications",
      "description" => "Enable mobile notification for private messages and @-mentions received when the user is online. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "enable_digest_emails",
      "description" => "Enable digest emails when the user is away. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "enable_marketing_emails",
      "description" => "Enable marketing emails. Has no function outside Zulip Cloud. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "enable_login_emails",
      "description" => "Enable email notifications for new logins to account. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "message_content_in_email_notifications",
      "description" => "Include the message&#39;s content in email notifications for new messages. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "pm_content_in_desktop_notifications",
      "description" => "Include content of private messages in desktop notifications. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "wildcard_mentions_notify",
      "description" => "Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "desktop_icon_count_display",
      "description" => "Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None ",
      "dataType" => "Integer",
      "allowableValues" => "[1, 2, 3]",
      "paramType" => "query",
    },
    {
      "name" => "realm_name_in_notifications",
      "description" => "Include organization name in subject of message notification emails. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "presence_enabled",
      "description" => "Display the presence status to other users when online. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/api/v1/users/{user_id}', {
  "resourcePath" => "/Users",
  "summary" => "Update a user",
  "nickname" => "update_user", 
  "responseClass" => "JsonSuccess",
  "endpoint" => "/users/{user_id}", 
  "notes" => "Administrative endpoint to update the details of another user in the organization.  `PATCH {{ api_url }}/v1/users/{user_id}`  Supports everything an administrator can do to edit details of another user's account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). ",
  "parameters" => [
    {
      "name" => "full_name",
      "description" => "The user&#39;s full name. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "role",
      "description" => "New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of &#x60;is_admin&#x60; and &#x60;is_guest&#x60; boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60). ",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "profile_data",
      "description" => "A dictionary containing the to be updated custom profile field data for the user. ",
      "dataType" => "Array<Object>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "user_id",
      "description" => "The target user&#39;s ID. ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/api/v1/user_groups/{user_group_id}', {
  "resourcePath" => "/Users",
  "summary" => "Update a user group",
  "nickname" => "update_user_group", 
  "responseClass" => "JsonSuccess",
  "endpoint" => "/user_groups/{user_group_id}", 
  "notes" => "Update the name or description of a [user group](/help/user-groups).  `PATCH {{ api_url }}/v1/user_groups/{user_group_id}` ",
  "parameters" => [
    {
      "name" => "name",
      "description" => "The new name of the group. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "description",
      "description" => "The new description of the group. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "user_group_id",
      "description" => "The ID of the target user group. ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/v1/user_groups/{user_group_id}/members', {
  "resourcePath" => "/Users",
  "summary" => "Update user group members",
  "nickname" => "update_user_group_members", 
  "responseClass" => "JsonSuccess",
  "endpoint" => "/user_groups/{user_group_id}/members", 
  "notes" => "Update the members of a [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/{user_group_id}/members` ",
  "parameters" => [
    {
      "name" => "delete",
      "description" => "The list of user ids to be removed from the user group. ",
      "dataType" => "Array<Integer>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "add",
      "description" => "The list of user ids to be added to the user group. ",
      "dataType" => "Array<Integer>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "user_group_id",
      "description" => "The ID of the target user group. ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

