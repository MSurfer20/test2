# #Zulip REST API
#
##Powerful open source group chat 
#
#The version of the OpenAPI document: 1.0.0
#
#Generated by: https://openapi-generator.tech
#OpenAPI Generator version: 5.2.0
#

require "../spec_helper"
require "json"
require "time"

# Unit tests for ::UsersApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe "UsersApi" do
  describe "test an instance of UsersApi" do
    it "should create an instance of UsersApi" do
      api_instance = ::UsersApi.new
      # TODO expect(api_instance).to be_instance_of(::UsersApi)
    end
  end

  # unit tests for create_user
  # Create a user
  # {!can-create-users-only.md!}  Create a new user account via the API.  &#x60;POST {{ api_url }}/v1/users&#x60; 
  # @param email The email address of the new user. 
  # @param password The password of the new user. 
  # @param full_name The full name of the new user. 
  # @param [Hash] opts the optional parameters
  # @return [JsonSuccessBase]
  describe "create_user test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for create_user_group
  # Create a user group
  # Create a new [user group](/help/user-groups).  &#x60;POST {{ api_url }}/v1/user_groups/create&#x60; 
  # @param name The name of the user group. 
  # @param description The description of the user group. 
  # @param members An array containing the user IDs of the initial members for the new user group. 
  # @param [Hash] opts the optional parameters
  # @return [JsonSuccess]
  describe "create_user_group test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for deactivate_own_user
  # Deactivate own user
  # Deactivates the user&#39;s account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  &#x60;DELETE {{ api_url }}/v1/users/me&#x60;  This endpoint is primarily useful to Zulip clients providing a user settings UI. 
  # @param [Hash] opts the optional parameters
  # @return [JsonSuccess]
  describe "deactivate_own_user test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for deactivate_user
  # Deactivate a user
  # [Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  &#x60;DELETE {{ api_url }}/v1/users/{user_id}&#x60; 
  # @param user_id The target user&#39;s ID. 
  # @param [Hash] opts the optional parameters
  # @return [JsonSuccess]
  describe "deactivate_user test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_attachments
  # Get attachments
  # Fetch metadata on files uploaded by the requesting user.  &#x60;GET {{ api_url }}/v1/attachments&#x60; 
  # @param [Hash] opts the optional parameters
  # @return [JsonSuccessBase]
  describe "get_attachments test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_own_user
  # Get own user
  # Get basic data about the user/bot that requests this endpoint.  &#x60;GET {{ api_url }}/v1/users/me&#x60; 
  # @param [Hash] opts the optional parameters
  # @return [JsonSuccessBase]
  describe "get_own_user test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_user
  # Get a user
  # Fetch details for a single user in the organization.  &#x60;GET {{ api_url }}/v1/users/{user_id}&#x60;  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 
  # @param user_id The target user&#39;s ID. 
  # @param [Hash] opts the optional parameters
  # @option opts [Bool] :client_gravatar Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. 
  # @option opts [Bool] :include_custom_profile_fields Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
  # @return [JsonSuccessBase]
  describe "get_user test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_user_by_email
  # Get a user by email
  # Fetch details for a single user in the organization given a Zulip display email address.  &#x60;GET {{ api_url }}/v1/users/{email}&#x60;  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 
  # @param email The email address of the user whose details you want to fetch. 
  # @param [Hash] opts the optional parameters
  # @option opts [Bool] :client_gravatar Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. 
  # @option opts [Bool] :include_custom_profile_fields Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
  # @return [JsonSuccessBase]
  describe "get_user_by_email test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_user_groups
  # Get user groups
  # {!api-members-only.md!}  Fetches all of the user groups in the organization.  &#x60;GET {{ api_url }}/v1/user_groups&#x60; 
  # @param [Hash] opts the optional parameters
  # @return [JsonSuccessBase]
  describe "get_user_groups test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_user_presence
  # Get user presence
  # Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user&#39;s presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  &#x60;GET {{ api_url }}/v1/users/{user_id_or_email}/presence&#x60;  See [Zulip&#39;s developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 
  # @param user_id_or_email The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email. 
  # @param [Hash] opts the optional parameters
  # @return [JsonSuccessBase]
  describe "get_user_presence test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_users
  # Get all users
  # Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  &#x60;GET {{ api_url }}/v1/users&#x60;  You can also [fetch details on a single user](/api/get-user). 
  # @param [Hash] opts the optional parameters
  # @option opts [Bool] :client_gravatar Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. 
  # @option opts [Bool] :include_custom_profile_fields Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
  # @return [JsonSuccessBase]
  describe "get_users test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for mute_user
  # Mute a user
  # This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you&#39;ve muted will be automatically marked as read and hidden.  &#x60;POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}&#x60;  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \&quot;Muted user\&quot;, rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \&quot;All users that exist   on this stream or realm\&quot;, e.g. for organization   administration or showing stream subscribers, should display   the user&#39;s name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 
  # @param muted_user_id The ID of the user to mute/un-mute. 
  # @param [Hash] opts the optional parameters
  # @return [JsonSuccess]
  describe "mute_user test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for reactivate_user
  # Reactivate a user
  # [Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  &#x60;POST {{ api_url }}/v1/users/{user_id}/reactivate&#x60; 
  # @param user_id The target user&#39;s ID. 
  # @param [Hash] opts the optional parameters
  # @return [AnyType]
  describe "reactivate_user test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for remove_user_group
  # Delete a user group
  # Delete a [user group](/help/user-groups).  &#x60;DELETE {{ api_url }}/v1/user_groups/{user_group_id}&#x60; 
  # @param user_group_id The ID of the target user group. 
  # @param [Hash] opts the optional parameters
  # @return [JsonSuccess]
  describe "remove_user_group test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for set_typing_status
  # Set \&quot;typing\&quot; status
  # Notify other users whether the current user is typing a message.  &#x60;POST {{ api_url }}/v1/typing&#x60;  Clients implementing Zulip&#39;s typing notifications protocol should work as follows:  * Send a request to this endpoint with &#x60;op&#x3D;\&quot;start\&quot;&#x60; when a user starts typing a message,   and also every &#x60;TYPING_STARTED_WAIT_PERIOD&#x3D;10&#x60; seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with &#x60;op&#x3D;\&quot;stop\&quot;&#x60; when a user pauses using the   compose UI for at least &#x60;TYPING_STOPPED_WAIT_PERIOD&#x3D;5&#x60; seconds or cancels   the compose action (if it had previously sent a \&quot;start\&quot; operation for that   compose action). * Start displaying \&quot;Sender is typing\&quot; for a given conversation when the client   receives an &#x60;op&#x3D;\&quot;start\&quot;&#x60; event from the [events API](/api/get-events). * Continue displaying \&quot;Sender is typing\&quot; until they receive an &#x60;op&#x3D;\&quot;stop\&quot;&#x60; event   from the [events API](/api/get-events) or &#x60;TYPING_STARTED_EXPIRY_PERIOD&#x3D;15&#x60;   seconds have passed without a new &#x60;op&#x3D;\&quot;start\&quot;&#x60; event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   &#x60;stream_typing_notifications&#x60; in the &#x60;client_capabilities&#x60; parameter to &#x60;/register&#x60;.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip&#39;s typing notifications protocol. 
  # @param op Whether the user has started (&#x60;start&#x60;) or stopped (&#x60;stop&#x60;) to type. 
  # @param to For &#39;private&#39; type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For &#39;stream&#39; type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11). 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :_type Type of the message being composed. 
  # @option opts [String] :topic Topic to which message is being typed. Required for the &#39;stream&#39; type. Ignored in case of &#39;private&#39; type. 
  # @return [JsonSuccess]
  describe "set_typing_status test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for unmute_user
  # Unmute a user
  # This endpoint unmutes a user.  &#x60;DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 48). 
  # @param muted_user_id The ID of the user to mute/un-mute. 
  # @param [Hash] opts the optional parameters
  # @return [JsonSuccess]
  describe "unmute_user test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for update_display_settings
  # Update display settings
  # This endpoint is used to edit the current user&#39;s user interface settings.  &#x60;PATCH {{ api_url }}/v1/settings/display&#x60; 
  # @param [Hash] opts the optional parameters
  # @option opts [Bool] :twenty_four_hour_time Whether time should be [displayed in 24-hour notation](/help/change-the-time-format). 
  # @option opts [Bool] :dense_mode This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip. 
  # @option opts [Bool] :starred_message_counts Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages). 
  # @option opts [Bool] :fluid_layout_width Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app&#39;s center panel (message feed, recent topics) on wide screens. 
  # @option opts [Bool] :high_contrast_mode This setting is reserved for use to control variations in Zulip&#39;s design to help visually impaired users. 
  # @option opts [Int32] :color_scheme Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard &#x60;prefers-color-scheme&#x60; media query. 
  # @option opts [Bool] :translate_emoticons Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends. 
  # @option opts [String] :default_language What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, &#x60;\&quot;en\&quot;&#x60; for English or &#x60;\&quot;de\&quot;&#x60; for German.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63). 
  # @option opts [String] :default_view The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the &#x60;Esc&#x60; keyboard shortcut repeatedly.  * \&quot;recent_topics\&quot; - Recent topics view * \&quot;all_messages\&quot; - All messages view  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64). 
  # @option opts [Bool] :left_side_userlist Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked. 
  # @option opts [String] :emojiset The user&#39;s configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \&quot;google\&quot; - Google modern * \&quot;google-blob\&quot; - Google classic * \&quot;twitter\&quot; - Twitter * \&quot;text\&quot; - Plain text  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64). 
  # @option opts [Int32] :demote_inactive_streams Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never 
  # @option opts [String] :timezone The user&#39;s [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64). 
  # @return [JsonSuccessBase]
  describe "update_display_settings test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for update_notification_settings
  # Update notification settings
  # This endpoint is used to edit the user&#39;s global notification settings. See [this endpoint](/api/update-subscription-settings) for per-stream notification settings.  &#x60;PATCH {{ api_url }}/v1/settings/notifications&#x60; 
  # @param [Hash] opts the optional parameters
  # @option opts [Bool] :enable_stream_desktop_notifications Enable visual desktop notifications for stream messages. 
  # @option opts [Bool] :enable_stream_email_notifications Enable email notifications for stream messages. 
  # @option opts [Bool] :enable_stream_push_notifications Enable mobile notifications for stream messages. 
  # @option opts [Bool] :enable_stream_audible_notifications Enable audible desktop notifications for stream messages. 
  # @option opts [String] :notification_sound Notification sound name.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63). 
  # @option opts [Bool] :enable_desktop_notifications Enable visual desktop notifications for private messages and @-mentions. 
  # @option opts [Bool] :enable_sounds Enable audible desktop notifications for private messages and @-mentions. 
  # @option opts [Bool] :enable_offline_email_notifications Enable email notifications for private messages and @-mentions received when the user is offline. 
  # @option opts [Bool] :enable_offline_push_notifications Enable mobile notification for private messages and @-mentions received when the user is offline. 
  # @option opts [Bool] :enable_online_push_notifications Enable mobile notification for private messages and @-mentions received when the user is online. 
  # @option opts [Bool] :enable_digest_emails Enable digest emails when the user is away. 
  # @option opts [Bool] :enable_marketing_emails Enable marketing emails. Has no function outside Zulip Cloud. 
  # @option opts [Bool] :enable_login_emails Enable email notifications for new logins to account. 
  # @option opts [Bool] :message_content_in_email_notifications Include the message&#39;s content in email notifications for new messages. 
  # @option opts [Bool] :pm_content_in_desktop_notifications Include content of private messages in desktop notifications. 
  # @option opts [Bool] :wildcard_mentions_notify Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention. 
  # @option opts [Int32] :desktop_icon_count_display Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None 
  # @option opts [Bool] :realm_name_in_notifications Include organization name in subject of message notification emails. 
  # @option opts [Bool] :presence_enabled Display the presence status to other users when online. 
  # @return [JsonSuccessBase]
  describe "update_notification_settings test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for update_user
  # Update a user
  # Administrative endpoint to update the details of another user in the organization.  &#x60;PATCH {{ api_url }}/v1/users/{user_id}&#x60;  Supports everything an administrator can do to edit details of another user&#39;s account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 
  # @param user_id The target user&#39;s ID. 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :full_name The user&#39;s full name. 
  # @option opts [Int32] :role New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of &#x60;is_admin&#x60; and &#x60;is_guest&#x60; boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60). 
  # @option opts [Array(Object)] :profile_data A dictionary containing the to be updated custom profile field data for the user. 
  # @return [JsonSuccess]
  describe "update_user test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for update_user_group
  # Update a user group
  # Update the name or description of a [user group](/help/user-groups).  &#x60;PATCH {{ api_url }}/v1/user_groups/{user_group_id}&#x60; 
  # @param user_group_id The ID of the target user group. 
  # @param name The new name of the group. 
  # @param description The new description of the group. 
  # @param [Hash] opts the optional parameters
  # @return [JsonSuccess]
  describe "update_user_group test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for update_user_group_members
  # Update user group members
  # Update the members of a [user group](/help/user-groups).  &#x60;POST {{ api_url }}/v1/user_groups/{user_group_id}/members&#x60; 
  # @param user_group_id The ID of the target user group. 
  # @param [Hash] opts the optional parameters
  # @option opts [Array(Int32)] :delete The list of user ids to be removed from the user group. 
  # @option opts [Array(Int32)] :add The list of user ids to be added to the user group. 
  # @return [JsonSuccess]
  describe "update_user_group_members test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

end
