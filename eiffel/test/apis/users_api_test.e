note
    description: "API tests for USERS_API"
    date: "$Date$"
    revision: "$Revision$"


class USERS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_attachments
            -- Get attachments
            -- 
            -- Fetch metadata on files uploaded by the requesting user.  &#x60;GET {{ api_url }}/v1/attachments&#x60;  
        local
            l_response: JSON_SUCCESS_BASE
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.attachments
            assert ("not_implemented", False)
        end
    
    test_create_user
            -- Create a user
            -- 
            -- {!can-create-users-only.md!}  Create a new user account via the API.  &#x60;POST {{ api_url }}/v1/users&#x60;  
        local
            l_response: JSON_SUCCESS_BASE
            l_email: STRING_32
            l_password: STRING_32
            l_full_name: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_email
            -- l_password
            -- l_full_name
                      
            -- l_response := api.create_user(l_email, l_password, l_full_name)
            assert ("not_implemented", False)
        end
    
    test_create_user_group
            -- Create a user group
            -- 
            -- Create a new [user group](/help/user-groups).  &#x60;POST {{ api_url }}/v1/user_groups/create&#x60;  
        local
            l_response: JSON_SUCCESS
            l_name: STRING_32
            l_description: STRING_32
            l_members: LIST [INTEGER_32]
        do
            -- TODO: Initialize required params.
            -- l_name
            -- l_description
            -- create {ARRAYED_LIST [INTEGER_32]} l_members.make (2)
                      
            -- l_response := api.create_user_group(l_name, l_description, l_members)
            assert ("not_implemented", False)
        end
    
    test_deactivate_own_user
            -- Deactivate own user
            -- 
            -- Deactivates the user&#39;s account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  &#x60;DELETE {{ api_url }}/v1/users/me&#x60;  This endpoint is primarily useful to Zulip clients providing a user settings UI.  
        local
            l_response: JSON_SUCCESS
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.deactivate_own_user
            assert ("not_implemented", False)
        end
    
    test_deactivate_user
            -- Deactivate a user
            -- 
            -- [Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  &#x60;DELETE {{ api_url }}/v1/users/{user_id}&#x60;  
        local
            l_response: JSON_SUCCESS
            l_user_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_user_id
                      
            -- l_response := api.deactivate_user(l_user_id)
            assert ("not_implemented", False)
        end
    
    test_mute_user
            -- Mute a user
            -- 
            -- This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you&#39;ve muted will be automatically marked as read and hidden.  &#x60;POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}&#x60;  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \&quot;Muted user\&quot;, rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \&quot;All users that exist   on this stream or realm\&quot;, e.g. for organization   administration or showing stream subscribers, should display   the user&#39;s name as normal.  **Changes**: New in Zulip 4.0 (feature level 48).  
        local
            l_response: JSON_SUCCESS
            l_muted_user_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_muted_user_id
                      
            -- l_response := api.mute_user(l_muted_user_id)
            assert ("not_implemented", False)
        end
    
    test_own_user
            -- Get own user
            -- 
            -- Get basic data about the user/bot that requests this endpoint.  &#x60;GET {{ api_url }}/v1/users/me&#x60;  
        local
            l_response: JSON_SUCCESS_BASE
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.own_user
            assert ("not_implemented", False)
        end
    
    test_reactivate_user
            -- Reactivate a user
            -- 
            -- [Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  &#x60;POST {{ api_url }}/v1/users/{user_id}/reactivate&#x60;  
        local
            l_response: ANY
            l_user_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_user_id
                      
            -- l_response := api.reactivate_user(l_user_id)
            assert ("not_implemented", False)
        end
    
    test_remove_user_group
            -- Delete a user group
            -- 
            -- Delete a [user group](/help/user-groups).  &#x60;DELETE {{ api_url }}/v1/user_groups/{user_group_id}&#x60;  
        local
            l_response: JSON_SUCCESS
            l_user_group_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_user_group_id
                      
            -- l_response := api.remove_user_group(l_user_group_id)
            assert ("not_implemented", False)
        end
    
    test_set_typing_status
            -- Set \&quot;typing\&quot; status
            -- 
            -- Notify other users whether the current user is typing a message.  &#x60;POST {{ api_url }}/v1/typing&#x60;  Clients implementing Zulip&#39;s typing notifications protocol should work as follows:  * Send a request to this endpoint with &#x60;op&#x3D;\&quot;start\&quot;&#x60; when a user starts typing a message,   and also every &#x60;TYPING_STARTED_WAIT_PERIOD&#x3D;10&#x60; seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with &#x60;op&#x3D;\&quot;stop\&quot;&#x60; when a user pauses using the   compose UI for at least &#x60;TYPING_STOPPED_WAIT_PERIOD&#x3D;5&#x60; seconds or cancels   the compose action (if it had previously sent a \&quot;start\&quot; operation for that   compose action). * Start displaying \&quot;Sender is typing\&quot; for a given conversation when the client   receives an &#x60;op&#x3D;\&quot;start\&quot;&#x60; event from the [events API](/api/get-events). * Continue displaying \&quot;Sender is typing\&quot; until they receive an &#x60;op&#x3D;\&quot;stop\&quot;&#x60; event   from the [events API](/api/get-events) or &#x60;TYPING_STARTED_EXPIRY_PERIOD&#x3D;15&#x60;   seconds have passed without a new &#x60;op&#x3D;\&quot;start\&quot;&#x60; event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   &#x60;stream_typing_notifications&#x60; in the &#x60;client_capabilities&#x60; parameter to &#x60;/register&#x60;.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip&#39;s typing notifications protocol.  
        local
            l_response: JSON_SUCCESS
            l_op: STRING_32
            l_to: LIST [INTEGER_32]
            l_type: STRING_32
            l_topic: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_op
            -- create {ARRAYED_LIST [INTEGER_32]} l_to.make (2)
                      
            -- l_response := api.set_typing_status(l_op, l_to, l_type, l_topic)
            assert ("not_implemented", False)
        end
    
    test_unmute_user
            -- Unmute a user
            -- 
            -- This endpoint unmutes a user.  &#x60;DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 48).  
        local
            l_response: JSON_SUCCESS
            l_muted_user_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_muted_user_id
                      
            -- l_response := api.unmute_user(l_muted_user_id)
            assert ("not_implemented", False)
        end
    
    test_update_display_settings
            -- Update display settings
            -- 
            -- This endpoint is used to edit the current user&#39;s user interface settings.  &#x60;PATCH {{ api_url }}/v1/settings/display&#x60;  
        local
            l_response: JSON_SUCCESS_BASE
            l_twenty_four_hour_time: BOOLEAN
            l_dense_mode: BOOLEAN
            l_starred_message_counts: BOOLEAN
            l_fluid_layout_width: BOOLEAN
            l_high_contrast_mode: BOOLEAN
            l_color_scheme: INTEGER_32
            l_translate_emoticons: BOOLEAN
            l_default_language: STRING_32
            l_default_view: STRING_32
            l_left_side_userlist: BOOLEAN
            l_emojiset: STRING_32
            l_demote_inactive_streams: INTEGER_32
            l_timezone: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.update_display_settings(l_twenty_four_hour_time, l_dense_mode, l_starred_message_counts, l_fluid_layout_width, l_high_contrast_mode, l_color_scheme, l_translate_emoticons, l_default_language, l_default_view, l_left_side_userlist, l_emojiset, l_demote_inactive_streams, l_timezone)
            assert ("not_implemented", False)
        end
    
    test_update_notification_settings
            -- Update notification settings
            -- 
            -- This endpoint is used to edit the user&#39;s global notification settings. See [this endpoint](/api/update-subscription-settings) for per-stream notification settings.  &#x60;PATCH {{ api_url }}/v1/settings/notifications&#x60;  
        local
            l_response: JSON_SUCCESS_BASE
            l_enable_stream_desktop_notifications: BOOLEAN
            l_enable_stream_email_notifications: BOOLEAN
            l_enable_stream_push_notifications: BOOLEAN
            l_enable_stream_audible_notifications: BOOLEAN
            l_notification_sound: STRING_32
            l_enable_desktop_notifications: BOOLEAN
            l_enable_sounds: BOOLEAN
            l_enable_offline_email_notifications: BOOLEAN
            l_enable_offline_push_notifications: BOOLEAN
            l_enable_online_push_notifications: BOOLEAN
            l_enable_digest_emails: BOOLEAN
            l_enable_marketing_emails: BOOLEAN
            l_enable_login_emails: BOOLEAN
            l_message_content_in_email_notifications: BOOLEAN
            l_pm_content_in_desktop_notifications: BOOLEAN
            l_wildcard_mentions_notify: BOOLEAN
            l_desktop_icon_count_display: INTEGER_32
            l_realm_name_in_notifications: BOOLEAN
            l_presence_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.update_notification_settings(l_enable_stream_desktop_notifications, l_enable_stream_email_notifications, l_enable_stream_push_notifications, l_enable_stream_audible_notifications, l_notification_sound, l_enable_desktop_notifications, l_enable_sounds, l_enable_offline_email_notifications, l_enable_offline_push_notifications, l_enable_online_push_notifications, l_enable_digest_emails, l_enable_marketing_emails, l_enable_login_emails, l_message_content_in_email_notifications, l_pm_content_in_desktop_notifications, l_wildcard_mentions_notify, l_desktop_icon_count_display, l_realm_name_in_notifications, l_presence_enabled)
            assert ("not_implemented", False)
        end
    
    test_update_user
            -- Update a user
            -- 
            -- Administrative endpoint to update the details of another user in the organization.  &#x60;PATCH {{ api_url }}/v1/users/{user_id}&#x60;  Supports everything an administrator can do to edit details of another user&#39;s account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields).  
        local
            l_response: JSON_SUCCESS
            l_user_id: INTEGER_32
            l_full_name: STRING_32
            l_role: INTEGER_32
            l_profile_data: LIST [ANY]
        do
            -- TODO: Initialize required params.
            -- l_user_id
                      
            -- l_response := api.update_user(l_user_id, l_full_name, l_role, l_profile_data)
            assert ("not_implemented", False)
        end
    
    test_update_user_group
            -- Update a user group
            -- 
            -- Update the name or description of a [user group](/help/user-groups).  &#x60;PATCH {{ api_url }}/v1/user_groups/{user_group_id}&#x60;  
        local
            l_response: JSON_SUCCESS
            l_user_group_id: INTEGER_32
            l_name: STRING_32
            l_description: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_user_group_id
            -- l_name
            -- l_description
                      
            -- l_response := api.update_user_group(l_user_group_id, l_name, l_description)
            assert ("not_implemented", False)
        end
    
    test_update_user_group_members
            -- Update user group members
            -- 
            -- Update the members of a [user group](/help/user-groups).  &#x60;POST {{ api_url }}/v1/user_groups/{user_group_id}/members&#x60;  
        local
            l_response: JSON_SUCCESS
            l_user_group_id: INTEGER_32
            l_delete: LIST [INTEGER_32]
            l_add: LIST [INTEGER_32]
        do
            -- TODO: Initialize required params.
            -- l_user_group_id
                      
            -- l_response := api.update_user_group_members(l_user_group_id, l_delete, l_add)
            assert ("not_implemented", False)
        end
    
    test_user
            -- Get a user
            -- 
            -- Fetch details for a single user in the organization.  &#x60;GET {{ api_url }}/v1/users/{user_id}&#x60;  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).*  
        local
            l_response: JSON_SUCCESS_BASE
            l_user_id: INTEGER_32
            l_client_gravatar: BOOLEAN
            l_include_custom_profile_fields: BOOLEAN
        do
            -- TODO: Initialize required params.
            -- l_user_id
                      
            -- l_response := api.user(l_user_id, l_client_gravatar, l_include_custom_profile_fields)
            assert ("not_implemented", False)
        end
    
    test_user_by_email
            -- Get a user by email
            -- 
            -- Fetch details for a single user in the organization given a Zulip display email address.  &#x60;GET {{ api_url }}/v1/users/{email}&#x60;  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).*  
        local
            l_response: JSON_SUCCESS_BASE
            l_email: STRING_32
            l_client_gravatar: BOOLEAN
            l_include_custom_profile_fields: BOOLEAN
        do
            -- TODO: Initialize required params.
            -- l_email
                      
            -- l_response := api.user_by_email(l_email, l_client_gravatar, l_include_custom_profile_fields)
            assert ("not_implemented", False)
        end
    
    test_user_groups
            -- Get user groups
            -- 
            -- {!api-members-only.md!}  Fetches all of the user groups in the organization.  &#x60;GET {{ api_url }}/v1/user_groups&#x60;  
        local
            l_response: JSON_SUCCESS_BASE
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.user_groups
            assert ("not_implemented", False)
        end
    
    test_user_presence
            -- Get user presence
            -- 
            -- Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user&#39;s presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  &#x60;GET {{ api_url }}/v1/users/{user_id_or_email}/presence&#x60;  See [Zulip&#39;s developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip.  
        local
            l_response: JSON_SUCCESS_BASE
            l_user_id_or_email: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_user_id_or_email
                      
            -- l_response := api.user_presence(l_user_id_or_email)
            assert ("not_implemented", False)
        end
    
    test_users
            -- Get all users
            -- 
            -- Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  &#x60;GET {{ api_url }}/v1/users&#x60;  You can also [fetch details on a single user](/api/get-user).  
        local
            l_response: JSON_SUCCESS_BASE
            l_client_gravatar: BOOLEAN
            l_include_custom_profile_fields: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.users(l_client_gravatar, l_include_custom_profile_fields)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: USERS_API
            -- Create an object instance of `USERS_API'.
        once            
            create { USERS_API } Result
        end

end
