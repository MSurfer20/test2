@isTest
private class OASUsersApiTest {
    /**
     * Create a user
     *
     * {!can-create-users-only.md!}\n\nCreate a new user account via the API.\n\n&#x60;POST {{ api_url }}/v1/users&#x60;\n
     */
    @isTest
    private static void createUserTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(201);
        res.setStatus('Created');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'email' => username@example.com,
            'password' => abcd1234,
            'fullName' => New User
        };

        OASClient client;
        OASUsersApi api;
        OASJsonSuccessBase response;
        OASJsonSuccessBase expectedResponse;
        String js = '';

        api = new OASUsersApi(new OASClient());

        api.createUser(params);
    }

    /**
     * Create a user group
     *
     * Create a new [user group](/help/user-groups).\n\n&#x60;POST {{ api_url }}/v1/user_groups/create&#x60;\n
     */
    @isTest
    private static void createUserGroupTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'name' => marketing,
            'description' => The marketing team.,
            'members' => new List<Integer>{0}
        };

        OASClient client;
        OASUsersApi api;
        OASJsonSuccess response;
        OASJsonSuccess expectedResponse;
        String js = '';

        api = new OASUsersApi(new OASClient());

        api.createUserGroup(params);
    }

    /**
     * Deactivate own user
     *
     * Deactivates the user\&#39;s account.  See also the administrative endpoint for\n[deactivating another user](/api/deactivate-user).\n\n&#x60;DELETE {{ api_url }}/v1/users/me&#x60;\n\nThis endpoint is primarily useful to Zulip clients providing a user settings UI.\n
     */
    @isTest
    private static void deactivateOwnUserTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASUsersApi api;
        OASJsonSuccess response;
        OASJsonSuccess expectedResponse;
        String js = '';

        api = new OASUsersApi(new OASClient());

        api.deactivateOwnUser();
    }

    /**
     * Deactivate a user
     *
     * [Deactivates a\nuser](https://zulip.com/help/deactivate-or-reactivate-a-user)\ngiven their user ID.\n\n&#x60;DELETE {{ api_url }}/v1/users/{user_id}&#x60;\n
     */
    @isTest
    private static void deactivateUserTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'userId' => 12
        };

        OASClient client;
        OASUsersApi api;
        OASJsonSuccess response;
        OASJsonSuccess expectedResponse;
        String js = '';

        api = new OASUsersApi(new OASClient());

        api.deactivateUser(params);
    }

    /**
     * Get attachments
     *
     * Fetch metadata on files uploaded by the requesting user.\n\n&#x60;GET {{ api_url }}/v1/attachments&#x60;\n
     */
    @isTest
    private static void getAttachmentsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASUsersApi api;
        OASJsonSuccessBase response;
        OASJsonSuccessBase expectedResponse;
        String js = '';

        api = new OASUsersApi(new OASClient());

        api.getAttachments();
    }

    /**
     * Get own user
     *
     * Get basic data about the user/bot that requests this endpoint.\n\n&#x60;GET {{ api_url }}/v1/users/me&#x60;\n
     */
    @isTest
    private static void getOwnUserTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASUsersApi api;
        OASJsonSuccessBase response;
        OASJsonSuccessBase expectedResponse;
        String js = '';

        api = new OASUsersApi(new OASClient());

        api.getOwnUser();
    }

    /**
     * Get a user
     *
     * Fetch details for a single user in the organization.\n\n&#x60;GET {{ api_url }}/v1/users/{user_id}&#x60;\n\nYou can also fetch details on [all users in the organization](/api/get-users)\nor [by email](/api/get-user-by-email).\n\n*This endpoint is new in Zulip Server 3.0 (feature level 1).*\n
     */
    @isTest
    private static void getUserTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'userId' => 12,
            'clientGravatar' => true,
            'includeCustomProfileFields' => true
        };

        OASClient client;
        OASUsersApi api;
        OASJsonSuccessBase response;
        OASJsonSuccessBase expectedResponse;
        String js = '';

        api = new OASUsersApi(new OASClient());

        api.getUser(params);
    }

    /**
     * Get a user by email
     *
     * Fetch details for a single user in the organization given a Zulip display\nemail address.\n\n&#x60;GET {{ api_url }}/v1/users/{email}&#x60;\n\nNote that this endpoint uses Zulip display emails addresses\nfor organizations that have configured limited [email address\nvisibility](/help/restrict-visibility-of-email-addresses).\n\nYou can also fetch details on [all users in the organization](/api/get-users) or\n[by user ID](/api/get-user).  Fetching by user ID is generally recommended\nwhen possible, as users can\n[change their email address](/help/change-your-email-address).\n\n*This endpoint is new in Zulip Server 4.0 (feature level 39).*\n
     */
    @isTest
    private static void getUserByEmailTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'email' => iago@zulip.com,
            'clientGravatar' => true,
            'includeCustomProfileFields' => true
        };

        OASClient client;
        OASUsersApi api;
        OASJsonSuccessBase response;
        OASJsonSuccessBase expectedResponse;
        String js = '';

        api = new OASUsersApi(new OASClient());

        api.getUserByEmail(params);
    }

    /**
     * Get user groups
     *
     * {!api-members-only.md!}\n\nFetches all of the user groups in the organization.\n\n&#x60;GET {{ api_url }}/v1/user_groups&#x60;\n
     */
    @isTest
    private static void getUserGroupsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASUsersApi api;
        OASJsonSuccessBase response;
        OASJsonSuccessBase expectedResponse;
        String js = '';

        api = new OASUsersApi(new OASClient());

        api.getUserGroups();
    }

    /**
     * Get user presence
     *
     * Get the presence status for a specific user.\n\nThis endpoint is most useful for embedding data about a user\&#39;s\npresence status in other sites (E.g. an employee directory).  Full\nZulip clients like mobile/desktop apps will want to use the main\npresence endpoint, which returns data for all active users in the\norganization, instead.\n\n&#x60;GET {{ api_url }}/v1/users/{user_id_or_email}/presence&#x60;\n\nSee\n[Zulip\&#39;s developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html)\nfor details on the data model for presence in Zulip.\n
     */
    @isTest
    private static void getUserPresenceTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'userIdOrEmail' => iago@zulip.com
        };

        OASClient client;
        OASUsersApi api;
        OASJsonSuccessBase response;
        OASJsonSuccessBase expectedResponse;
        String js = '';

        api = new OASUsersApi(new OASClient());

        api.getUserPresence(params);
    }

    /**
     * Get all users
     *
     * Retrieve details on all users in the organization.  Optionally\nincludes values of [custom profile field](/help/add-custom-profile-fields).\n\n&#x60;GET {{ api_url }}/v1/users&#x60;\n\nYou can also [fetch details on a single user](/api/get-user).\n
     */
    @isTest
    private static void getUsersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'clientGravatar' => true,
            'includeCustomProfileFields' => true
        };

        OASClient client;
        OASUsersApi api;
        OASJsonSuccessBase response;
        OASJsonSuccessBase expectedResponse;
        String js = '';

        api = new OASUsersApi(new OASClient());

        api.getUsers(params);
    }

    /**
     * Mute a user
     *
     * This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users\nyou\&#39;ve muted will be automatically marked as read and hidden.\n\n&#x60;POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}&#x60;\n\nMuted users should be implemented by clients as follows:\n\n* The server will immediately mark all messages sent by the muted\n  user as read.  This will automatically clear any existing mobile\n  push notifications related to the muted user.\n* The server will mark any new messages sent by the muted user as read\n  for your account, which prevents all email and mobile push notifications.\n* Clients should exclude muted users from presence lists or other UI\n  for viewing or composing 1:1 private messages. 1:1 private messages sent by\n  muted users should be hidden everywhere in the Zulip UI.\n* Stream messages and group private messages sent by the muted\n  user should avoid displaying the content and name/avatar,\n  but should display that N messages by a muted user were\n  hidden (so that it is possible to interpret the messages by\n  other users who are talking with the muted user).\n* Group private message conversations including the muted user\n  should display muted users as &quot;Muted user&quot;, rather than\n  showing their name, in lists of such conversations, along with using\n  a blank grey avatar where avatars are displayed.\n* Administrative/settings UI elements for showing &quot;All users that exist\n  on this stream or realm&quot;, e.g. for organization\n  administration or showing stream subscribers, should display\n  the user\&#39;s name as normal.\n\n**Changes**: New in Zulip 4.0 (feature level 48).\n
     */
    @isTest
    private static void muteUserTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'mutedUserId' => 10
        };

        OASClient client;
        OASUsersApi api;
        OASJsonSuccess response;
        OASJsonSuccess expectedResponse;
        String js = '';

        api = new OASUsersApi(new OASClient());

        api.muteUser(params);
    }

    /**
     * Reactivate a user
     *
     * [Reactivates a\nuser](https://zulip.com/help/deactivate-or-reactivate-a-user)\ngiven their user ID.\n\n&#x60;POST {{ api_url }}/v1/users/{user_id}/reactivate&#x60;\n
     */
    @isTest
    private static void reactivateUserTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'userId' => 12
        };

        OASClient client;
        OASUsersApi api;
        oas_any_type_not_mapped response;
        oas_any_type_not_mapped expectedResponse;
        String js = '';

        api = new OASUsersApi(new OASClient());

        api.reactivateUser(params);
    }

    /**
     * Delete a user group
     *
     * Delete a [user group](/help/user-groups).\n\n&#x60;DELETE {{ api_url }}/v1/user_groups/{user_group_id}&#x60;\n
     */
    @isTest
    private static void removeUserGroupTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'userGroupId' => 1
        };

        OASClient client;
        OASUsersApi api;
        OASJsonSuccess response;
        OASJsonSuccess expectedResponse;
        String js = '';

        api = new OASUsersApi(new OASClient());

        api.removeUserGroup(params);
    }

    /**
     * Set &quot;typing&quot; status
     *
     * Notify other users whether the current user is typing a message.\n\n&#x60;POST {{ api_url }}/v1/typing&#x60;\n\nClients implementing Zulip\&#39;s typing notifications protocol should work as follows:\n\n* Send a request to this endpoint with &#x60;op&#x3D;&quot;start&quot;&#x60; when a user starts typing a message,\n  and also every &#x60;TYPING_STARTED_WAIT_PERIOD&#x3D;10&#x60; seconds that the user continues to\n  actively type or otherwise interact with the compose UI (E.g. interacting with the\n  compose box emoji picker).\n* Send a request to this endpoint with &#x60;op&#x3D;&quot;stop&quot;&#x60; when a user pauses using the\n  compose UI for at least &#x60;TYPING_STOPPED_WAIT_PERIOD&#x3D;5&#x60; seconds or cancels\n  the compose action (if it had previously sent a &quot;start&quot; operation for that\n  compose action).\n* Start displaying &quot;Sender is typing&quot; for a given conversation when the client\n  receives an &#x60;op&#x3D;&quot;start&quot;&#x60; event from the [events API](/api/get-events).\n* Continue displaying &quot;Sender is typing&quot; until they receive an &#x60;op&#x3D;&quot;stop&quot;&#x60; event\n  from the [events API](/api/get-events) or &#x60;TYPING_STARTED_EXPIRY_PERIOD&#x3D;15&#x60;\n  seconds have passed without a new &#x60;op&#x3D;&quot;start&quot;&#x60; event for that conversation.\n* Clients that support displaying stream typing notifications (new in Zulip 4.0)\n  should indicate they support processing stream typing events via the\n  &#x60;stream_typing_notifications&#x60; in the &#x60;client_capabilities&#x60; parameter to &#x60;/register&#x60;.\n\nThis protocol is designed to allow the server-side typing notifications implementation\nto be stateless while being resilient; network failures cannot result in a user being\nincorrectly displayed as perpetually typing.\n\nSee\n[the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html)\nfor additional design details on Zulip\&#39;s typing notifications protocol.\n
     */
    @isTest
    private static void setTypingStatusTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'op' => start,
            'to' => new List<Integer>{0},
            'type' => private,
            'topic' => typing notifications
        };

        OASClient client;
        OASUsersApi api;
        OASJsonSuccess response;
        OASJsonSuccess expectedResponse;
        String js = '';

        api = new OASUsersApi(new OASClient());

        api.setTypingStatus(params);
    }

    /**
     * Unmute a user
     *
     * This endpoint unmutes a user.\n\n&#x60;DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}&#x60;\n\n**Changes**: New in Zulip 4.0 (feature level 48).\n
     */
    @isTest
    private static void unmuteUserTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'mutedUserId' => 10
        };

        OASClient client;
        OASUsersApi api;
        OASJsonSuccess response;
        OASJsonSuccess expectedResponse;
        String js = '';

        api = new OASUsersApi(new OASClient());

        api.unmuteUser(params);
    }

    /**
     * Update settings
     *
     * This endpoint is used to edit the current user\&#39;s settings.\n\n&#x60;PATCH {{ api_url }}/v1/settings&#x60;\n\n**Changes**: Prior to Zulip 5.0 (feature level 80), this\nendpoint only supported the &#x60;full_name&#x60;, &#x60;email&#x60;,\n&#x60;old_password&#x60;, and &#x60;new_password&#x60; parameters. Notification\nsettings were managed by &#x60;PATCH /settings/notifications&#x60;, and\nall other settings by &#x60;PATCH /settings/display&#x60;. The feature level\n80 migration to merge these endpoints did not change how request\nparameters are encoded. Note, however, that it did change the\nhandling of any invalid parameters present in a request to change\nnotification or display settings, since the merged endpoint uses\nthe new response format that was introduced for &#x60;/settings&#x60; in\nZulip 5.0 (feature level 78).\n\nThe &#x60;/settings/display&#x60; and &#x60;/settings/notifications&#x60;\nendpoints are now deprecated aliases for this endpoint for\nbackwards-compatibility, and will be removed once clients have\nmigrated to use this endpoint.\n
     */
    @isTest
    private static void updateSettingsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'fullName' => NewName,
            'email' => newname@example.com,
            'oldPassword' => old12345,
            'newPassword' => new12345,
            'twentyFourHourTime' => true,
            'denseMode' => true,
            'starredMessageCounts' => true,
            'fluidLayoutWidth' => true,
            'highContrastMode' => true,
            'colorScheme' => '',
            'enableDraftsSynchronization' => true,
            'translateEmoticons' => true,
            'defaultLanguage' => en,
            'defaultView' => all_messages,
            'leftSideUserlist' => true,
            'emojiset' => google,
            'demoteInactiveStreams' => '',
            'timezone' => Asia/Kolkata,
            'enableStreamDesktopNotifications' => true,
            'enableStreamEmailNotifications' => true,
            'enableStreamPushNotifications' => true,
            'enableStreamAudibleNotifications' => true,
            'notificationSound' => ding,
            'enableDesktopNotifications' => true,
            'enableSounds' => true,
            'emailNotificationsBatchingPeriodSeconds' => 120,
            'enableOfflineEmailNotifications' => true,
            'enableOfflinePushNotifications' => true,
            'enableOnlinePushNotifications' => true,
            'enableDigestEmails' => true,
            'enableMarketingEmails' => true,
            'enableLoginEmails' => true,
            'messageContentInEmailNotifications' => true,
            'pmContentInDesktopNotifications' => true,
            'wildcardMentionsNotify' => true,
            'desktopIconCountDisplay' => '',
            'realmNameInNotifications' => true,
            'presenceEnabled' => true,
            'enterSends' => true
        };

        OASClient client;
        OASUsersApi api;
        OASJsonSuccessBase response;
        OASJsonSuccessBase expectedResponse;
        String js = '';

        api = new OASUsersApi(new OASClient());

        api.updateSettings(params);
    }

    /**
     * Update your status
     *
     * Change your [status](/help/status-and-availability).\n\n&#x60;POST {{ api_url }}/v1/users/me/status&#x60;\n\nA request to this endpoint will only change the parameters passed.\nFor example, passing just &#x60;status_text&#x60; requests a change in the status\ntext, but will leave the status emoji unchanged.\n\nClients that wish to set the user\&#39;s status to a specific value should\npass all supported parameters.\n
     */
    @isTest
    private static void updateStatusTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'statusText' => on vacation,
            'away' => true,
            'emojiName' => car,
            'emojiCode' => 1f697,
            'reactionType' => unicode_emoji
        };

        OASClient client;
        OASUsersApi api;
        OASJsonSuccess response;
        OASJsonSuccess expectedResponse;
        String js = '';

        api = new OASUsersApi(new OASClient());

        api.updateStatus(params);
    }

    /**
     * Update a user
     *
     * Administrative endpoint to update the details of another user in the organization.\n\n&#x60;PATCH {{ api_url }}/v1/users/{user_id}&#x60;\n\nSupports everything an administrator can do to edit details of another\nuser\&#39;s account, including editing full name,\n[role](/help/roles-and-permissions), and [custom profile\nfields](/help/add-custom-profile-fields).\n
     */
    @isTest
    private static void updateUserTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'userId' => 12,
            'fullName' => 'null',
            'role' => 400,
            'profileData' => new List<Object>{null}
        };

        OASClient client;
        OASUsersApi api;
        OASJsonSuccess response;
        OASJsonSuccess expectedResponse;
        String js = '';

        api = new OASUsersApi(new OASClient());

        api.updateUser(params);
    }

    /**
     * Update a user group
     *
     * Update the name or description of a [user group](/help/user-groups).\n\n&#x60;PATCH {{ api_url }}/v1/user_groups/{user_group_id}&#x60;\n
     */
    @isTest
    private static void updateUserGroupTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'userGroupId' => 1,
            'name' => marketing team,
            'description' => The marketing team.
        };

        OASClient client;
        OASUsersApi api;
        OASJsonSuccess response;
        OASJsonSuccess expectedResponse;
        String js = '';

        api = new OASUsersApi(new OASClient());

        api.updateUserGroup(params);
    }

    /**
     * Update user group members
     *
     * Update the members of a [user group](/help/user-groups).\n\n&#x60;POST {{ api_url }}/v1/user_groups/{user_group_id}/members&#x60;\n
     */
    @isTest
    private static void updateUserGroupMembersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'userGroupId' => 1,
            'r_delete' => new List<Integer>{0},
            'add' => new List<Integer>{0}
        };

        OASClient client;
        OASUsersApi api;
        OASJsonSuccess response;
        OASJsonSuccess expectedResponse;
        String js = '';

        api = new OASUsersApi(new OASClient());

        api.updateUserGroupMembers(params);
    }
}