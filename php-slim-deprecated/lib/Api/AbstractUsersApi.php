<?php
/**
 * AbstractUsersApi
 *
 * PHP version 7
 *
 * @package OpenAPIServer\Api
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */

/**
 * Zulip REST API
 *
 * Powerful open source group chat
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */
namespace OpenAPIServer\Api;

use Psr\Container\ContainerInterface;
use Psr\Http\Message\ServerRequestInterface;
use Psr\Http\Message\ResponseInterface;
use Exception;

/**
 * AbstractUsersApi Class Doc Comment
 *
 * @package OpenAPIServer\Api
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
abstract class AbstractUsersApi
{

    /**
     * @var ContainerInterface Slim app container instance
     */
    protected $container;

    /**
     * Route Controller constructor receives container
     *
     * @param ContainerInterface $container Slim app container instance
     */
    public function __construct(ContainerInterface $container)
    {
        $this->container = $container;
    }


    /**
     * POST createUser
     * Summary: Create a user
     * Notes: {!can-create-users-only.md!}  Create a new user account via the API.  &#x60;POST {{ api_url }}/v1/users&#x60;
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function createUser(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $email = $request->getQueryParam('email');
        $password = $request->getQueryParam('password');
        $fullName = $request->getQueryParam('full_name');
        $message = "How about implementing createUser as a POST method in OpenAPIServer\Api\UsersApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * POST createUserGroup
     * Summary: Create a user group
     * Notes: Create a new [user group](/help/user-groups).  &#x60;POST {{ api_url }}/v1/user_groups/create&#x60;
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function createUserGroup(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $name = $request->getQueryParam('name');
        $description = $request->getQueryParam('description');
        $members = $request->getQueryParam('members');
        $message = "How about implementing createUserGroup as a POST method in OpenAPIServer\Api\UsersApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * DELETE deactivateOwnUser
     * Summary: Deactivate own user
     * Notes: Deactivates the user&#39;s account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  &#x60;DELETE {{ api_url }}/v1/users/me&#x60;  This endpoint is primarily useful to Zulip clients providing a user settings UI.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function deactivateOwnUser(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $message = "How about implementing deactivateOwnUser as a DELETE method in OpenAPIServer\Api\UsersApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * DELETE deactivateUser
     * Summary: Deactivate a user
     * Notes: [Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  &#x60;DELETE {{ api_url }}/v1/users/{user_id}&#x60;
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function deactivateUser(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $userId = $args['user_id'];
        $message = "How about implementing deactivateUser as a DELETE method in OpenAPIServer\Api\UsersApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getAttachments
     * Summary: Get attachments
     * Notes: Fetch metadata on files uploaded by the requesting user.  &#x60;GET {{ api_url }}/v1/attachments&#x60;
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getAttachments(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $message = "How about implementing getAttachments as a GET method in OpenAPIServer\Api\UsersApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getOwnUser
     * Summary: Get own user
     * Notes: Get basic data about the user/bot that requests this endpoint.  &#x60;GET {{ api_url }}/v1/users/me&#x60;
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getOwnUser(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $message = "How about implementing getOwnUser as a GET method in OpenAPIServer\Api\UsersApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getUser
     * Summary: Get a user
     * Notes: Fetch details for a single user in the organization.  &#x60;GET {{ api_url }}/v1/users/{user_id}&#x60;  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).*
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getUser(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $userId = $args['user_id'];
        $queryParams = $request->getQueryParams();
        $clientGravatar = $request->getQueryParam('client_gravatar');
        $includeCustomProfileFields = $request->getQueryParam('include_custom_profile_fields');
        $message = "How about implementing getUser as a GET method in OpenAPIServer\Api\UsersApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getUserByEmail
     * Summary: Get a user by email
     * Notes: Fetch details for a single user in the organization given a Zulip display email address.  &#x60;GET {{ api_url }}/v1/users/{email}&#x60;  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).*
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getUserByEmail(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $email = $args['email'];
        $queryParams = $request->getQueryParams();
        $clientGravatar = $request->getQueryParam('client_gravatar');
        $includeCustomProfileFields = $request->getQueryParam('include_custom_profile_fields');
        $message = "How about implementing getUserByEmail as a GET method in OpenAPIServer\Api\UsersApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getUserGroups
     * Summary: Get user groups
     * Notes: {!api-members-only.md!}  Fetches all of the user groups in the organization.  &#x60;GET {{ api_url }}/v1/user_groups&#x60;
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getUserGroups(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $message = "How about implementing getUserGroups as a GET method in OpenAPIServer\Api\UsersApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getUserPresence
     * Summary: Get user presence
     * Notes: Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user&#39;s presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  &#x60;GET {{ api_url }}/v1/users/{user_id_or_email}/presence&#x60;  See [Zulip&#39;s developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getUserPresence(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $userIdOrEmail = $args['user_id_or_email'];
        $message = "How about implementing getUserPresence as a GET method in OpenAPIServer\Api\UsersApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getUsers
     * Summary: Get all users
     * Notes: Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  &#x60;GET {{ api_url }}/v1/users&#x60;  You can also [fetch details on a single user](/api/get-user).
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getUsers(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $clientGravatar = $request->getQueryParam('client_gravatar');
        $includeCustomProfileFields = $request->getQueryParam('include_custom_profile_fields');
        $message = "How about implementing getUsers as a GET method in OpenAPIServer\Api\UsersApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * POST muteUser
     * Summary: Mute a user
     * Notes: This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you&#39;ve muted will be automatically marked as read and hidden.  &#x60;POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}&#x60;  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \&quot;Muted user\&quot;, rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \&quot;All users that exist   on this stream or realm\&quot;, e.g. for organization   administration or showing stream subscribers, should display   the user&#39;s name as normal.  **Changes**: New in Zulip 4.0 (feature level 48).
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function muteUser(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $mutedUserId = $args['muted_user_id'];
        $message = "How about implementing muteUser as a POST method in OpenAPIServer\Api\UsersApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * POST reactivateUser
     * Summary: Reactivate a user
     * Notes: [Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  &#x60;POST {{ api_url }}/v1/users/{user_id}/reactivate&#x60;
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function reactivateUser(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $userId = $args['user_id'];
        $message = "How about implementing reactivateUser as a POST method in OpenAPIServer\Api\UsersApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * DELETE removeUserGroup
     * Summary: Delete a user group
     * Notes: Delete a [user group](/help/user-groups).  &#x60;DELETE {{ api_url }}/v1/user_groups/{user_group_id}&#x60;
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function removeUserGroup(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $userGroupId = $args['user_group_id'];
        $message = "How about implementing removeUserGroup as a DELETE method in OpenAPIServer\Api\UsersApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * POST setTypingStatus
     * Summary: Set \&quot;typing\&quot; status
     * Notes: Notify other users whether the current user is typing a message.  &#x60;POST {{ api_url }}/v1/typing&#x60;  Clients implementing Zulip&#39;s typing notifications protocol should work as follows:  * Send a request to this endpoint with &#x60;op&#x3D;\&quot;start\&quot;&#x60; when a user starts typing a message,   and also every &#x60;TYPING_STARTED_WAIT_PERIOD&#x3D;10&#x60; seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with &#x60;op&#x3D;\&quot;stop\&quot;&#x60; when a user pauses using the   compose UI for at least &#x60;TYPING_STOPPED_WAIT_PERIOD&#x3D;5&#x60; seconds or cancels   the compose action (if it had previously sent a \&quot;start\&quot; operation for that   compose action). * Start displaying \&quot;Sender is typing\&quot; for a given conversation when the client   receives an &#x60;op&#x3D;\&quot;start\&quot;&#x60; event from the [events API](/api/get-events). * Continue displaying \&quot;Sender is typing\&quot; until they receive an &#x60;op&#x3D;\&quot;stop\&quot;&#x60; event   from the [events API](/api/get-events) or &#x60;TYPING_STARTED_EXPIRY_PERIOD&#x3D;15&#x60;   seconds have passed without a new &#x60;op&#x3D;\&quot;start\&quot;&#x60; event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   &#x60;stream_typing_notifications&#x60; in the &#x60;client_capabilities&#x60; parameter to &#x60;/register&#x60;.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip&#39;s typing notifications protocol.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function setTypingStatus(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $type = $request->getQueryParam('type');
        $op = $request->getQueryParam('op');
        $to = $request->getQueryParam('to');
        $topic = $request->getQueryParam('topic');
        $message = "How about implementing setTypingStatus as a POST method in OpenAPIServer\Api\UsersApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * DELETE unmuteUser
     * Summary: Unmute a user
     * Notes: This endpoint unmutes a user.  &#x60;DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 48).
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function unmuteUser(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $mutedUserId = $args['muted_user_id'];
        $message = "How about implementing unmuteUser as a DELETE method in OpenAPIServer\Api\UsersApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * PATCH updateSettings
     * Summary: Update settings
     * Notes: This endpoint is used to edit the current user&#39;s settings.  &#x60;PATCH {{ api_url }}/v1/settings&#x60;  **Changes**: Prior to Zulip 5.0 (feature level 80), this endpoint only supported the &#x60;full_name&#x60;, &#x60;email&#x60;, &#x60;old_password&#x60;, and &#x60;new_password&#x60; parameters. Notification settings were managed by &#x60;PATCH /settings/notifications&#x60;, and all other settings by &#x60;PATCH /settings/display&#x60;. The feature level 80 migration to merge these endpoints did not change how request parameters are encoded. Note, however, that it did change the handling of any invalid parameters present in a request to change notification or display settings, since the merged endpoint uses the new response format that was introduced for &#x60;/settings&#x60; in Zulip 5.0 (feature level 78).  The &#x60;/settings/display&#x60; and &#x60;/settings/notifications&#x60; endpoints are now deprecated aliases for this endpoint for backwards-compatibility, and will be removed once clients have migrated to use this endpoint.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function updateSettings(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $fullName = $request->getQueryParam('full_name');
        $email = $request->getQueryParam('email');
        $oldPassword = $request->getQueryParam('old_password');
        $newPassword = $request->getQueryParam('new_password');
        $twentyFourHourTime = $request->getQueryParam('twenty_four_hour_time');
        $denseMode = $request->getQueryParam('dense_mode');
        $starredMessageCounts = $request->getQueryParam('starred_message_counts');
        $fluidLayoutWidth = $request->getQueryParam('fluid_layout_width');
        $highContrastMode = $request->getQueryParam('high_contrast_mode');
        $colorScheme = $request->getQueryParam('color_scheme');
        $enableDraftsSynchronization = $request->getQueryParam('enable_drafts_synchronization');
        $translateEmoticons = $request->getQueryParam('translate_emoticons');
        $defaultLanguage = $request->getQueryParam('default_language');
        $defaultView = $request->getQueryParam('default_view');
        $leftSideUserlist = $request->getQueryParam('left_side_userlist');
        $emojiset = $request->getQueryParam('emojiset');
        $demoteInactiveStreams = $request->getQueryParam('demote_inactive_streams');
        $timezone = $request->getQueryParam('timezone');
        $enableStreamDesktopNotifications = $request->getQueryParam('enable_stream_desktop_notifications');
        $enableStreamEmailNotifications = $request->getQueryParam('enable_stream_email_notifications');
        $enableStreamPushNotifications = $request->getQueryParam('enable_stream_push_notifications');
        $enableStreamAudibleNotifications = $request->getQueryParam('enable_stream_audible_notifications');
        $notificationSound = $request->getQueryParam('notification_sound');
        $enableDesktopNotifications = $request->getQueryParam('enable_desktop_notifications');
        $enableSounds = $request->getQueryParam('enable_sounds');
        $emailNotificationsBatchingPeriodSeconds = $request->getQueryParam('email_notifications_batching_period_seconds');
        $enableOfflineEmailNotifications = $request->getQueryParam('enable_offline_email_notifications');
        $enableOfflinePushNotifications = $request->getQueryParam('enable_offline_push_notifications');
        $enableOnlinePushNotifications = $request->getQueryParam('enable_online_push_notifications');
        $enableDigestEmails = $request->getQueryParam('enable_digest_emails');
        $enableMarketingEmails = $request->getQueryParam('enable_marketing_emails');
        $enableLoginEmails = $request->getQueryParam('enable_login_emails');
        $messageContentInEmailNotifications = $request->getQueryParam('message_content_in_email_notifications');
        $pmContentInDesktopNotifications = $request->getQueryParam('pm_content_in_desktop_notifications');
        $wildcardMentionsNotify = $request->getQueryParam('wildcard_mentions_notify');
        $desktopIconCountDisplay = $request->getQueryParam('desktop_icon_count_display');
        $realmNameInNotifications = $request->getQueryParam('realm_name_in_notifications');
        $presenceEnabled = $request->getQueryParam('presence_enabled');
        $enterSends = $request->getQueryParam('enter_sends');
        $message = "How about implementing updateSettings as a PATCH method in OpenAPIServer\Api\UsersApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * POST updateStatus
     * Summary: Update your status
     * Notes: Change your [status](/help/status-and-availability).  &#x60;POST {{ api_url }}/v1/users/me/status&#x60;  A request to this endpoint will only change the parameters passed. For example, passing just &#x60;status_text&#x60; requests a change in the status text, but will leave the status emoji unchanged.  Clients that wish to set the user&#39;s status to a specific value should pass all supported parameters.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function updateStatus(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $statusText = $request->getQueryParam('status_text');
        $away = $request->getQueryParam('away');
        $emojiName = $request->getQueryParam('emoji_name');
        $emojiCode = $request->getQueryParam('emoji_code');
        $reactionType = $request->getQueryParam('reaction_type');
        $message = "How about implementing updateStatus as a POST method in OpenAPIServer\Api\UsersApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * PATCH updateUser
     * Summary: Update a user
     * Notes: Administrative endpoint to update the details of another user in the organization.  &#x60;PATCH {{ api_url }}/v1/users/{user_id}&#x60;  Supports everything an administrator can do to edit details of another user&#39;s account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields).
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function updateUser(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $userId = $args['user_id'];
        $queryParams = $request->getQueryParams();
        $fullName = $request->getQueryParam('full_name');
        $role = $request->getQueryParam('role');
        $profileData = $request->getQueryParam('profile_data');
        $message = "How about implementing updateUser as a PATCH method in OpenAPIServer\Api\UsersApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * PATCH updateUserGroup
     * Summary: Update a user group
     * Notes: Update the name or description of a [user group](/help/user-groups).  &#x60;PATCH {{ api_url }}/v1/user_groups/{user_group_id}&#x60;
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function updateUserGroup(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $userGroupId = $args['user_group_id'];
        $queryParams = $request->getQueryParams();
        $name = $request->getQueryParam('name');
        $description = $request->getQueryParam('description');
        $message = "How about implementing updateUserGroup as a PATCH method in OpenAPIServer\Api\UsersApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * POST updateUserGroupMembers
     * Summary: Update user group members
     * Notes: Update the members of a [user group](/help/user-groups).  &#x60;POST {{ api_url }}/v1/user_groups/{user_group_id}/members&#x60;
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function updateUserGroupMembers(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $userGroupId = $args['user_group_id'];
        $queryParams = $request->getQueryParams();
        $delete = $request->getQueryParam('delete');
        $add = $request->getQueryParam('add');
        $message = "How about implementing updateUserGroupMembers as a POST method in OpenAPIServer\Api\UsersApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }
}
