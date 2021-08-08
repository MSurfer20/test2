using System;
using Nancy;
using Nancy.ModelBinding;
using System.Collections.Generic;
using Sharpility.Base;
using Org.OpenAPITools._api_v1.Models;
using Org.OpenAPITools._api_v1.Utils;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Modules
{ 
    /// <summary>
    /// Whether the user has started (&#x60;start&#x60;) or stopped (&#x60;stop&#x60;) to type. 
    /// </summary>
    public enum SetTypingStatusOpEnum
    {
        start = 1, 
        stop = 2
    };

    /// <summary>
    /// Type of the message being composed. 
    /// </summary>
    public enum SetTypingStatusTypeEnum
    {
        private = 1, 
        stream = 2
    };

    /// <summary>
    /// Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard &#x60;prefers-color-scheme&#x60; media query. 
    /// </summary>
    public enum UpdateDisplaySettingsColorSchemeEnum
    {
        1, 
        2, 
        3
    };

    /// <summary>
    /// Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never 
    /// </summary>
    public enum UpdateDisplaySettingsDemoteInactiveStreamsEnum
    {
        1, 
        2, 
        3
    };

    /// <summary>
    /// Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None 
    /// </summary>
    public enum UpdateNotificationSettingsDesktopIconCountDisplayEnum
    {
        1, 
        2, 
        3
    };


    /// <summary>
    /// Module processing requests of Users domain.
    /// </summary>
    public sealed class UsersModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public UsersModule(UsersService service) : base("/api/v1")
        { 
            Post["/users"] = parameters =>
            {
                var email = Parameters.ValueOf<string>(parameters, Context.Request, "email", ParameterType.Query);
                var password = Parameters.ValueOf<string>(parameters, Context.Request, "password", ParameterType.Query);
                var fullName = Parameters.ValueOf<string>(parameters, Context.Request, "fullName", ParameterType.Query);
                Preconditions.IsNotNull(email, "Required parameter: 'email' is missing at 'CreateUser'");
                
                Preconditions.IsNotNull(password, "Required parameter: 'password' is missing at 'CreateUser'");
                
                Preconditions.IsNotNull(fullName, "Required parameter: 'fullName' is missing at 'CreateUser'");
                
                return service.CreateUser(Context, email, password, fullName);
            };

            Post["/user_groups/create"] = parameters =>
            {
                var name = Parameters.ValueOf<string>(parameters, Context.Request, "name", ParameterType.Query);
                var description = Parameters.ValueOf<string>(parameters, Context.Request, "description", ParameterType.Query);
                var members = Parameters.ValueOf<List<int?>>(parameters, Context.Request, "members", ParameterType.Query);
                Preconditions.IsNotNull(name, "Required parameter: 'name' is missing at 'CreateUserGroup'");
                
                Preconditions.IsNotNull(description, "Required parameter: 'description' is missing at 'CreateUserGroup'");
                
                Preconditions.IsNotNull(members, "Required parameter: 'members' is missing at 'CreateUserGroup'");
                
                return service.CreateUserGroup(Context, name, description, members);
            };

            Delete["/users/me"] = parameters =>
            {
                
                return service.DeactivateOwnUser(Context);
            };

            Delete["/users/{user_id}"] = parameters =>
            {
                var userId = Parameters.ValueOf<int?>(parameters, Context.Request, "userId", ParameterType.Path);
                Preconditions.IsNotNull(userId, "Required parameter: 'userId' is missing at 'DeactivateUser'");
                
                return service.DeactivateUser(Context, userId);
            };

            Get["/attachments"] = parameters =>
            {
                
                return service.GetAttachments(Context);
            };

            Get["/users/me"] = parameters =>
            {
                
                return service.GetOwnUser(Context);
            };

            Get["/users/{user_id}"] = parameters =>
            {
                var userId = Parameters.ValueOf<int?>(parameters, Context.Request, "userId", ParameterType.Path);
                var clientGravatar = Parameters.ValueOf<bool?>(parameters, Context.Request, "clientGravatar", ParameterType.Query);
                var includeCustomProfileFields = Parameters.ValueOf<bool?>(parameters, Context.Request, "includeCustomProfileFields", ParameterType.Query);
                Preconditions.IsNotNull(userId, "Required parameter: 'userId' is missing at 'GetUser'");
                
                return service.GetUser(Context, userId, clientGravatar, includeCustomProfileFields);
            };

            Get["/users/{email}"] = parameters =>
            {
                var email = Parameters.ValueOf<string>(parameters, Context.Request, "email", ParameterType.Path);
                var clientGravatar = Parameters.ValueOf<bool?>(parameters, Context.Request, "clientGravatar", ParameterType.Query);
                var includeCustomProfileFields = Parameters.ValueOf<bool?>(parameters, Context.Request, "includeCustomProfileFields", ParameterType.Query);
                Preconditions.IsNotNull(email, "Required parameter: 'email' is missing at 'GetUserByEmail'");
                
                return service.GetUserByEmail(Context, email, clientGravatar, includeCustomProfileFields);
            };

            Get["/user_groups"] = parameters =>
            {
                
                return service.GetUserGroups(Context);
            };

            Get["/users/{user_id_or_email}/presence"] = parameters =>
            {
                var userIdOrEmail = Parameters.ValueOf<string>(parameters, Context.Request, "userIdOrEmail", ParameterType.Path);
                Preconditions.IsNotNull(userIdOrEmail, "Required parameter: 'userIdOrEmail' is missing at 'GetUserPresence'");
                
                return service.GetUserPresence(Context, userIdOrEmail);
            };

            Get["/users"] = parameters =>
            {
                var clientGravatar = Parameters.ValueOf<bool?>(parameters, Context.Request, "clientGravatar", ParameterType.Query);
                var includeCustomProfileFields = Parameters.ValueOf<bool?>(parameters, Context.Request, "includeCustomProfileFields", ParameterType.Query);
                return service.GetUsers(Context, clientGravatar, includeCustomProfileFields);
            };

            Post["/users/me/muted_users/{muted_user_id}"] = parameters =>
            {
                var mutedUserId = Parameters.ValueOf<int?>(parameters, Context.Request, "mutedUserId", ParameterType.Path);
                Preconditions.IsNotNull(mutedUserId, "Required parameter: 'mutedUserId' is missing at 'MuteUser'");
                
                return service.MuteUser(Context, mutedUserId);
            };

            Post["/users/{user_id}/reactivate"] = parameters =>
            {
                var userId = Parameters.ValueOf<int?>(parameters, Context.Request, "userId", ParameterType.Path);
                Preconditions.IsNotNull(userId, "Required parameter: 'userId' is missing at 'ReactivateUser'");
                
                return service.ReactivateUser(Context, userId);
            };

            Delete["/user_groups/{user_group_id}"] = parameters =>
            {
                var userGroupId = Parameters.ValueOf<int?>(parameters, Context.Request, "userGroupId", ParameterType.Path);
                Preconditions.IsNotNull(userGroupId, "Required parameter: 'userGroupId' is missing at 'RemoveUserGroup'");
                
                return service.RemoveUserGroup(Context, userGroupId);
            };

            Post["/typing"] = parameters =>
            {
                var op = Parameters.ValueOf<SetTypingStatusOpEnum?>(parameters, Context.Request, "op", ParameterType.Query);
                var to = Parameters.ValueOf<List<int?>>(parameters, Context.Request, "to", ParameterType.Query);
                var type = Parameters.ValueOf<SetTypingStatusTypeEnum?>(parameters, Context.Request, "type", ParameterType.Query);
                var topic = Parameters.ValueOf<string>(parameters, Context.Request, "topic", ParameterType.Query);
                Preconditions.IsNotNull(op, "Required parameter: 'op' is missing at 'SetTypingStatus'");
                
                Preconditions.IsNotNull(to, "Required parameter: 'to' is missing at 'SetTypingStatus'");
                
                return service.SetTypingStatus(Context, op, to, type, topic);
            };

            Delete["/users/me/muted_users/{muted_user_id}"] = parameters =>
            {
                var mutedUserId = Parameters.ValueOf<int?>(parameters, Context.Request, "mutedUserId", ParameterType.Path);
                Preconditions.IsNotNull(mutedUserId, "Required parameter: 'mutedUserId' is missing at 'UnmuteUser'");
                
                return service.UnmuteUser(Context, mutedUserId);
            };

            Patch["/settings/display"] = parameters =>
            {
                var twentyFourHourTime = Parameters.ValueOf<bool?>(parameters, Context.Request, "twentyFourHourTime", ParameterType.Query);
                var denseMode = Parameters.ValueOf<bool?>(parameters, Context.Request, "denseMode", ParameterType.Query);
                var starredMessageCounts = Parameters.ValueOf<bool?>(parameters, Context.Request, "starredMessageCounts", ParameterType.Query);
                var fluidLayoutWidth = Parameters.ValueOf<bool?>(parameters, Context.Request, "fluidLayoutWidth", ParameterType.Query);
                var highContrastMode = Parameters.ValueOf<bool?>(parameters, Context.Request, "highContrastMode", ParameterType.Query);
                var colorScheme = Parameters.ValueOf<UpdateDisplaySettingsColorSchemeEnum?>(parameters, Context.Request, "colorScheme", ParameterType.Query);
                var translateEmoticons = Parameters.ValueOf<bool?>(parameters, Context.Request, "translateEmoticons", ParameterType.Query);
                var defaultLanguage = Parameters.ValueOf<string>(parameters, Context.Request, "defaultLanguage", ParameterType.Query);
                var defaultView = Parameters.ValueOf<string>(parameters, Context.Request, "defaultView", ParameterType.Query);
                var leftSideUserlist = Parameters.ValueOf<bool?>(parameters, Context.Request, "leftSideUserlist", ParameterType.Query);
                var emojiset = Parameters.ValueOf<string>(parameters, Context.Request, "emojiset", ParameterType.Query);
                var demoteInactiveStreams = Parameters.ValueOf<UpdateDisplaySettingsDemoteInactiveStreamsEnum?>(parameters, Context.Request, "demoteInactiveStreams", ParameterType.Query);
                var timezone = Parameters.ValueOf<string>(parameters, Context.Request, "timezone", ParameterType.Query);
                return service.UpdateDisplaySettings(Context, twentyFourHourTime, denseMode, starredMessageCounts, fluidLayoutWidth, highContrastMode, colorScheme, translateEmoticons, defaultLanguage, defaultView, leftSideUserlist, emojiset, demoteInactiveStreams, timezone);
            };

            Patch["/settings/notifications"] = parameters =>
            {
                var enableStreamDesktopNotifications = Parameters.ValueOf<bool?>(parameters, Context.Request, "enableStreamDesktopNotifications", ParameterType.Query);
                var enableStreamEmailNotifications = Parameters.ValueOf<bool?>(parameters, Context.Request, "enableStreamEmailNotifications", ParameterType.Query);
                var enableStreamPushNotifications = Parameters.ValueOf<bool?>(parameters, Context.Request, "enableStreamPushNotifications", ParameterType.Query);
                var enableStreamAudibleNotifications = Parameters.ValueOf<bool?>(parameters, Context.Request, "enableStreamAudibleNotifications", ParameterType.Query);
                var notificationSound = Parameters.ValueOf<string>(parameters, Context.Request, "notificationSound", ParameterType.Query);
                var enableDesktopNotifications = Parameters.ValueOf<bool?>(parameters, Context.Request, "enableDesktopNotifications", ParameterType.Query);
                var enableSounds = Parameters.ValueOf<bool?>(parameters, Context.Request, "enableSounds", ParameterType.Query);
                var enableOfflineEmailNotifications = Parameters.ValueOf<bool?>(parameters, Context.Request, "enableOfflineEmailNotifications", ParameterType.Query);
                var enableOfflinePushNotifications = Parameters.ValueOf<bool?>(parameters, Context.Request, "enableOfflinePushNotifications", ParameterType.Query);
                var enableOnlinePushNotifications = Parameters.ValueOf<bool?>(parameters, Context.Request, "enableOnlinePushNotifications", ParameterType.Query);
                var enableDigestEmails = Parameters.ValueOf<bool?>(parameters, Context.Request, "enableDigestEmails", ParameterType.Query);
                var enableMarketingEmails = Parameters.ValueOf<bool?>(parameters, Context.Request, "enableMarketingEmails", ParameterType.Query);
                var enableLoginEmails = Parameters.ValueOf<bool?>(parameters, Context.Request, "enableLoginEmails", ParameterType.Query);
                var messageContentInEmailNotifications = Parameters.ValueOf<bool?>(parameters, Context.Request, "messageContentInEmailNotifications", ParameterType.Query);
                var pmContentInDesktopNotifications = Parameters.ValueOf<bool?>(parameters, Context.Request, "pmContentInDesktopNotifications", ParameterType.Query);
                var wildcardMentionsNotify = Parameters.ValueOf<bool?>(parameters, Context.Request, "wildcardMentionsNotify", ParameterType.Query);
                var desktopIconCountDisplay = Parameters.ValueOf<UpdateNotificationSettingsDesktopIconCountDisplayEnum?>(parameters, Context.Request, "desktopIconCountDisplay", ParameterType.Query);
                var realmNameInNotifications = Parameters.ValueOf<bool?>(parameters, Context.Request, "realmNameInNotifications", ParameterType.Query);
                var presenceEnabled = Parameters.ValueOf<bool?>(parameters, Context.Request, "presenceEnabled", ParameterType.Query);
                return service.UpdateNotificationSettings(Context, enableStreamDesktopNotifications, enableStreamEmailNotifications, enableStreamPushNotifications, enableStreamAudibleNotifications, notificationSound, enableDesktopNotifications, enableSounds, enableOfflineEmailNotifications, enableOfflinePushNotifications, enableOnlinePushNotifications, enableDigestEmails, enableMarketingEmails, enableLoginEmails, messageContentInEmailNotifications, pmContentInDesktopNotifications, wildcardMentionsNotify, desktopIconCountDisplay, realmNameInNotifications, presenceEnabled);
            };

            Patch["/users/{user_id}"] = parameters =>
            {
                var userId = Parameters.ValueOf<int?>(parameters, Context.Request, "userId", ParameterType.Path);
                var fullName = Parameters.ValueOf<string>(parameters, Context.Request, "fullName", ParameterType.Query);
                var role = Parameters.ValueOf<int?>(parameters, Context.Request, "role", ParameterType.Query);
                var profileData = Parameters.ValueOf<List<Object>>(parameters, Context.Request, "profileData", ParameterType.Query);
                Preconditions.IsNotNull(userId, "Required parameter: 'userId' is missing at 'UpdateUser'");
                
                return service.UpdateUser(Context, userId, fullName, role, profileData);
            };

            Patch["/user_groups/{user_group_id}"] = parameters =>
            {
                var userGroupId = Parameters.ValueOf<int?>(parameters, Context.Request, "userGroupId", ParameterType.Path);
                var name = Parameters.ValueOf<string>(parameters, Context.Request, "name", ParameterType.Query);
                var description = Parameters.ValueOf<string>(parameters, Context.Request, "description", ParameterType.Query);
                Preconditions.IsNotNull(userGroupId, "Required parameter: 'userGroupId' is missing at 'UpdateUserGroup'");
                
                Preconditions.IsNotNull(name, "Required parameter: 'name' is missing at 'UpdateUserGroup'");
                
                Preconditions.IsNotNull(description, "Required parameter: 'description' is missing at 'UpdateUserGroup'");
                
                return service.UpdateUserGroup(Context, userGroupId, name, description);
            };

            Post["/user_groups/{user_group_id}/members"] = parameters =>
            {
                var userGroupId = Parameters.ValueOf<int?>(parameters, Context.Request, "userGroupId", ParameterType.Path);
                var delete = Parameters.ValueOf<List<int?>>(parameters, Context.Request, "delete", ParameterType.Query);
                var add = Parameters.ValueOf<List<int?>>(parameters, Context.Request, "add", ParameterType.Query);
                Preconditions.IsNotNull(userGroupId, "Required parameter: 'userGroupId' is missing at 'UpdateUserGroupMembers'");
                
                return service.UpdateUserGroupMembers(Context, userGroupId, delete, add);
            };
        }
    }

    /// <summary>
    /// Service handling Users requests.
    /// </summary>
    public interface UsersService
    {
        /// <summary>
        /// {!can-create-users-only.md!}  Create a new user account via the API.  &#x60;POST {{ api_url }}/v1/users&#x60; 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="email">The email address of the new user. </param>
        /// <param name="password">The password of the new user. </param>
        /// <param name="fullName">The full name of the new user. </param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase CreateUser(NancyContext context, string email, string password, string fullName);

        /// <summary>
        /// Create a new [user group](/help/user-groups).  &#x60;POST {{ api_url }}/v1/user_groups/create&#x60; 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="name">The name of the user group. </param>
        /// <param name="description">The description of the user group. </param>
        /// <param name="members">An array containing the user IDs of the initial members for the new user group. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess CreateUserGroup(NancyContext context, string name, string description, List<int?> members);

        /// <summary>
        /// Deactivates the user&#39;s account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  &#x60;DELETE {{ api_url }}/v1/users/me&#x60;  This endpoint is primarily useful to Zulip clients providing a user settings UI. 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess DeactivateOwnUser(NancyContext context);

        /// <summary>
        /// [Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  &#x60;DELETE {{ api_url }}/v1/users/{user_id}&#x60; 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="userId">The target user&#39;s ID. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess DeactivateUser(NancyContext context, int? userId);

        /// <summary>
        /// Fetch metadata on files uploaded by the requesting user.  &#x60;GET {{ api_url }}/v1/attachments&#x60; 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase GetAttachments(NancyContext context);

        /// <summary>
        /// Get basic data about the user/bot that requests this endpoint.  &#x60;GET {{ api_url }}/v1/users/me&#x60; 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase GetOwnUser(NancyContext context);

        /// <summary>
        /// Fetch details for a single user in the organization.  &#x60;GET {{ api_url }}/v1/users/{user_id}&#x60;  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="userId">The target user&#39;s ID. </param>
        /// <param name="clientGravatar">Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  (optional, default to false)</param>
        /// <param name="includeCustomProfileFields">Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  (optional, default to false)</param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase GetUser(NancyContext context, int? userId, bool? clientGravatar, bool? includeCustomProfileFields);

        /// <summary>
        /// Fetch details for a single user in the organization given a Zulip display email address.  &#x60;GET {{ api_url }}/v1/users/{email}&#x60;  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="email">The email address of the user whose details you want to fetch. </param>
        /// <param name="clientGravatar">Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  (optional, default to false)</param>
        /// <param name="includeCustomProfileFields">Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  (optional, default to false)</param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase GetUserByEmail(NancyContext context, string email, bool? clientGravatar, bool? includeCustomProfileFields);

        /// <summary>
        /// {!api-members-only.md!}  Fetches all of the user groups in the organization.  &#x60;GET {{ api_url }}/v1/user_groups&#x60; 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase GetUserGroups(NancyContext context);

        /// <summary>
        /// Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user&#39;s presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  &#x60;GET {{ api_url }}/v1/users/{user_id_or_email}/presence&#x60;  See [Zulip&#39;s developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="userIdOrEmail">The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email. </param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase GetUserPresence(NancyContext context, string userIdOrEmail);

        /// <summary>
        /// Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  &#x60;GET {{ api_url }}/v1/users&#x60;  You can also [fetch details on a single user](/api/get-user). 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="clientGravatar">Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  (optional, default to false)</param>
        /// <param name="includeCustomProfileFields">Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  (optional, default to false)</param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase GetUsers(NancyContext context, bool? clientGravatar, bool? includeCustomProfileFields);

        /// <summary>
        /// This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you&#39;ve muted will be automatically marked as read and hidden.  &#x60;POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}&#x60;  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \&quot;Muted user\&quot;, rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \&quot;All users that exist   on this stream or realm\&quot;, e.g. for organization   administration or showing stream subscribers, should display   the user&#39;s name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="mutedUserId">The ID of the user to mute/un-mute. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess MuteUser(NancyContext context, int? mutedUserId);

        /// <summary>
        /// [Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  &#x60;POST {{ api_url }}/v1/users/{user_id}/reactivate&#x60; 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="userId">The target user&#39;s ID. </param>
        /// <returns>Object</returns>
        Object ReactivateUser(NancyContext context, int? userId);

        /// <summary>
        /// Delete a [user group](/help/user-groups).  &#x60;DELETE {{ api_url }}/v1/user_groups/{user_group_id}&#x60; 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="userGroupId">The ID of the target user group. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess RemoveUserGroup(NancyContext context, int? userGroupId);

        /// <summary>
        /// Notify other users whether the current user is typing a message.  &#x60;POST {{ api_url }}/v1/typing&#x60;  Clients implementing Zulip&#39;s typing notifications protocol should work as follows:  * Send a request to this endpoint with &#x60;op&#x3D;\&quot;start\&quot;&#x60; when a user starts typing a message,   and also every &#x60;TYPING_STARTED_WAIT_PERIOD&#x3D;10&#x60; seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with &#x60;op&#x3D;\&quot;stop\&quot;&#x60; when a user pauses using the   compose UI for at least &#x60;TYPING_STOPPED_WAIT_PERIOD&#x3D;5&#x60; seconds or cancels   the compose action (if it had previously sent a \&quot;start\&quot; operation for that   compose action). * Start displaying \&quot;Sender is typing\&quot; for a given conversation when the client   receives an &#x60;op&#x3D;\&quot;start\&quot;&#x60; event from the [events API](/api/get-events). * Continue displaying \&quot;Sender is typing\&quot; until they receive an &#x60;op&#x3D;\&quot;stop\&quot;&#x60; event   from the [events API](/api/get-events) or &#x60;TYPING_STARTED_EXPIRY_PERIOD&#x3D;15&#x60;   seconds have passed without a new &#x60;op&#x3D;\&quot;start\&quot;&#x60; event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   &#x60;stream_typing_notifications&#x60; in the &#x60;client_capabilities&#x60; parameter to &#x60;/register&#x60;.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip&#39;s typing notifications protocol. 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="op">Whether the user has started (&#x60;start&#x60;) or stopped (&#x60;stop&#x60;) to type. </param>
        /// <param name="to">For &#39;private&#39; type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For &#39;stream&#39; type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11). </param>
        /// <param name="type">Type of the message being composed.  (optional, default to private)</param>
        /// <param name="topic">Topic to which message is being typed. Required for the &#39;stream&#39; type. Ignored in case of &#39;private&#39; type.  (optional)</param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess SetTypingStatus(NancyContext context, SetTypingStatusOpEnum? op, List<int?> to, SetTypingStatusTypeEnum? type, string topic);

        /// <summary>
        /// This endpoint unmutes a user.  &#x60;DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 48). 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="mutedUserId">The ID of the user to mute/un-mute. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess UnmuteUser(NancyContext context, int? mutedUserId);

        /// <summary>
        /// This endpoint is used to edit the current user&#39;s user interface settings.  &#x60;PATCH {{ api_url }}/v1/settings/display&#x60; 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="twentyFourHourTime">Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).  (optional)</param>
        /// <param name="denseMode">This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip.  (optional)</param>
        /// <param name="starredMessageCounts">Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages).  (optional)</param>
        /// <param name="fluidLayoutWidth">Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app&#39;s center panel (message feed, recent topics) on wide screens.  (optional)</param>
        /// <param name="highContrastMode">This setting is reserved for use to control variations in Zulip&#39;s design to help visually impaired users.  (optional)</param>
        /// <param name="colorScheme">Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard &#x60;prefers-color-scheme&#x60; media query.  (optional)</param>
        /// <param name="translateEmoticons">Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends.  (optional)</param>
        /// <param name="defaultLanguage">What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, &#x60;\&quot;en\&quot;&#x60; for English or &#x60;\&quot;de\&quot;&#x60; for German.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63).  (optional)</param>
        /// <param name="defaultView">The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the &#x60;Esc&#x60; keyboard shortcut repeatedly.  * \&quot;recent_topics\&quot; - Recent topics view * \&quot;all_messages\&quot; - All messages view  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64).  (optional)</param>
        /// <param name="leftSideUserlist">Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked.  (optional)</param>
        /// <param name="emojiset">The user&#39;s configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \&quot;google\&quot; - Google modern * \&quot;google-blob\&quot; - Google classic * \&quot;twitter\&quot; - Twitter * \&quot;text\&quot; - Plain text  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64).  (optional)</param>
        /// <param name="demoteInactiveStreams">Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never  (optional)</param>
        /// <param name="timezone">The user&#39;s [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64).  (optional)</param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase UpdateDisplaySettings(NancyContext context, bool? twentyFourHourTime, bool? denseMode, bool? starredMessageCounts, bool? fluidLayoutWidth, bool? highContrastMode, UpdateDisplaySettingsColorSchemeEnum? colorScheme, bool? translateEmoticons, string defaultLanguage, string defaultView, bool? leftSideUserlist, string emojiset, UpdateDisplaySettingsDemoteInactiveStreamsEnum? demoteInactiveStreams, string timezone);

        /// <summary>
        /// This endpoint is used to edit the user&#39;s global notification settings. See [this endpoint](/api/update-subscription-settings) for per-stream notification settings.  &#x60;PATCH {{ api_url }}/v1/settings/notifications&#x60; 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="enableStreamDesktopNotifications">Enable visual desktop notifications for stream messages.  (optional)</param>
        /// <param name="enableStreamEmailNotifications">Enable email notifications for stream messages.  (optional)</param>
        /// <param name="enableStreamPushNotifications">Enable mobile notifications for stream messages.  (optional)</param>
        /// <param name="enableStreamAudibleNotifications">Enable audible desktop notifications for stream messages.  (optional)</param>
        /// <param name="notificationSound">Notification sound name.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63).  (optional)</param>
        /// <param name="enableDesktopNotifications">Enable visual desktop notifications for private messages and @-mentions.  (optional)</param>
        /// <param name="enableSounds">Enable audible desktop notifications for private messages and @-mentions.  (optional)</param>
        /// <param name="enableOfflineEmailNotifications">Enable email notifications for private messages and @-mentions received when the user is offline.  (optional)</param>
        /// <param name="enableOfflinePushNotifications">Enable mobile notification for private messages and @-mentions received when the user is offline.  (optional)</param>
        /// <param name="enableOnlinePushNotifications">Enable mobile notification for private messages and @-mentions received when the user is online.  (optional)</param>
        /// <param name="enableDigestEmails">Enable digest emails when the user is away.  (optional)</param>
        /// <param name="enableMarketingEmails">Enable marketing emails. Has no function outside Zulip Cloud.  (optional)</param>
        /// <param name="enableLoginEmails">Enable email notifications for new logins to account.  (optional)</param>
        /// <param name="messageContentInEmailNotifications">Include the message&#39;s content in email notifications for new messages.  (optional)</param>
        /// <param name="pmContentInDesktopNotifications">Include content of private messages in desktop notifications.  (optional)</param>
        /// <param name="wildcardMentionsNotify">Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention.  (optional)</param>
        /// <param name="desktopIconCountDisplay">Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None  (optional)</param>
        /// <param name="realmNameInNotifications">Include organization name in subject of message notification emails.  (optional)</param>
        /// <param name="presenceEnabled">Display the presence status to other users when online.  (optional)</param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase UpdateNotificationSettings(NancyContext context, bool? enableStreamDesktopNotifications, bool? enableStreamEmailNotifications, bool? enableStreamPushNotifications, bool? enableStreamAudibleNotifications, string notificationSound, bool? enableDesktopNotifications, bool? enableSounds, bool? enableOfflineEmailNotifications, bool? enableOfflinePushNotifications, bool? enableOnlinePushNotifications, bool? enableDigestEmails, bool? enableMarketingEmails, bool? enableLoginEmails, bool? messageContentInEmailNotifications, bool? pmContentInDesktopNotifications, bool? wildcardMentionsNotify, UpdateNotificationSettingsDesktopIconCountDisplayEnum? desktopIconCountDisplay, bool? realmNameInNotifications, bool? presenceEnabled);

        /// <summary>
        /// Administrative endpoint to update the details of another user in the organization.  &#x60;PATCH {{ api_url }}/v1/users/{user_id}&#x60;  Supports everything an administrator can do to edit details of another user&#39;s account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="userId">The target user&#39;s ID. </param>
        /// <param name="fullName">The user&#39;s full name.  (optional)</param>
        /// <param name="role">New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of &#x60;is_admin&#x60; and &#x60;is_guest&#x60; boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60).  (optional)</param>
        /// <param name="profileData">A dictionary containing the to be updated custom profile field data for the user.  (optional)</param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess UpdateUser(NancyContext context, int? userId, string fullName, int? role, List<Object> profileData);

        /// <summary>
        /// Update the name or description of a [user group](/help/user-groups).  &#x60;PATCH {{ api_url }}/v1/user_groups/{user_group_id}&#x60; 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="userGroupId">The ID of the target user group. </param>
        /// <param name="name">The new name of the group. </param>
        /// <param name="description">The new description of the group. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess UpdateUserGroup(NancyContext context, int? userGroupId, string name, string description);

        /// <summary>
        /// Update the members of a [user group](/help/user-groups).  &#x60;POST {{ api_url }}/v1/user_groups/{user_group_id}/members&#x60; 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="userGroupId">The ID of the target user group. </param>
        /// <param name="delete">The list of user ids to be removed from the user group.  (optional)</param>
        /// <param name="add">The list of user ids to be added to the user group.  (optional)</param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess UpdateUserGroupMembers(NancyContext context, int? userGroupId, List<int?> delete, List<int?> add);
    }

    /// <summary>
    /// Abstraction of UsersService.
    /// </summary>
    public abstract class AbstractUsersService: UsersService
    {
        public virtual JsonSuccessBase CreateUser(NancyContext context, string email, string password, string fullName)
        {
            return CreateUser(email, password, fullName);
        }

        public virtual JsonSuccess CreateUserGroup(NancyContext context, string name, string description, List<int?> members)
        {
            return CreateUserGroup(name, description, members);
        }

        public virtual JsonSuccess DeactivateOwnUser(NancyContext context)
        {
            return DeactivateOwnUser();
        }

        public virtual JsonSuccess DeactivateUser(NancyContext context, int? userId)
        {
            return DeactivateUser(userId);
        }

        public virtual JsonSuccessBase GetAttachments(NancyContext context)
        {
            return GetAttachments();
        }

        public virtual JsonSuccessBase GetOwnUser(NancyContext context)
        {
            return GetOwnUser();
        }

        public virtual JsonSuccessBase GetUser(NancyContext context, int? userId, bool? clientGravatar, bool? includeCustomProfileFields)
        {
            return GetUser(userId, clientGravatar, includeCustomProfileFields);
        }

        public virtual JsonSuccessBase GetUserByEmail(NancyContext context, string email, bool? clientGravatar, bool? includeCustomProfileFields)
        {
            return GetUserByEmail(email, clientGravatar, includeCustomProfileFields);
        }

        public virtual JsonSuccessBase GetUserGroups(NancyContext context)
        {
            return GetUserGroups();
        }

        public virtual JsonSuccessBase GetUserPresence(NancyContext context, string userIdOrEmail)
        {
            return GetUserPresence(userIdOrEmail);
        }

        public virtual JsonSuccessBase GetUsers(NancyContext context, bool? clientGravatar, bool? includeCustomProfileFields)
        {
            return GetUsers(clientGravatar, includeCustomProfileFields);
        }

        public virtual JsonSuccess MuteUser(NancyContext context, int? mutedUserId)
        {
            return MuteUser(mutedUserId);
        }

        public virtual Object ReactivateUser(NancyContext context, int? userId)
        {
            return ReactivateUser(userId);
        }

        public virtual JsonSuccess RemoveUserGroup(NancyContext context, int? userGroupId)
        {
            return RemoveUserGroup(userGroupId);
        }

        public virtual JsonSuccess SetTypingStatus(NancyContext context, SetTypingStatusOpEnum? op, List<int?> to, SetTypingStatusTypeEnum? type, string topic)
        {
            return SetTypingStatus(op, to, type, topic);
        }

        public virtual JsonSuccess UnmuteUser(NancyContext context, int? mutedUserId)
        {
            return UnmuteUser(mutedUserId);
        }

        public virtual JsonSuccessBase UpdateDisplaySettings(NancyContext context, bool? twentyFourHourTime, bool? denseMode, bool? starredMessageCounts, bool? fluidLayoutWidth, bool? highContrastMode, UpdateDisplaySettingsColorSchemeEnum? colorScheme, bool? translateEmoticons, string defaultLanguage, string defaultView, bool? leftSideUserlist, string emojiset, UpdateDisplaySettingsDemoteInactiveStreamsEnum? demoteInactiveStreams, string timezone)
        {
            return UpdateDisplaySettings(twentyFourHourTime, denseMode, starredMessageCounts, fluidLayoutWidth, highContrastMode, colorScheme, translateEmoticons, defaultLanguage, defaultView, leftSideUserlist, emojiset, demoteInactiveStreams, timezone);
        }

        public virtual JsonSuccessBase UpdateNotificationSettings(NancyContext context, bool? enableStreamDesktopNotifications, bool? enableStreamEmailNotifications, bool? enableStreamPushNotifications, bool? enableStreamAudibleNotifications, string notificationSound, bool? enableDesktopNotifications, bool? enableSounds, bool? enableOfflineEmailNotifications, bool? enableOfflinePushNotifications, bool? enableOnlinePushNotifications, bool? enableDigestEmails, bool? enableMarketingEmails, bool? enableLoginEmails, bool? messageContentInEmailNotifications, bool? pmContentInDesktopNotifications, bool? wildcardMentionsNotify, UpdateNotificationSettingsDesktopIconCountDisplayEnum? desktopIconCountDisplay, bool? realmNameInNotifications, bool? presenceEnabled)
        {
            return UpdateNotificationSettings(enableStreamDesktopNotifications, enableStreamEmailNotifications, enableStreamPushNotifications, enableStreamAudibleNotifications, notificationSound, enableDesktopNotifications, enableSounds, enableOfflineEmailNotifications, enableOfflinePushNotifications, enableOnlinePushNotifications, enableDigestEmails, enableMarketingEmails, enableLoginEmails, messageContentInEmailNotifications, pmContentInDesktopNotifications, wildcardMentionsNotify, desktopIconCountDisplay, realmNameInNotifications, presenceEnabled);
        }

        public virtual JsonSuccess UpdateUser(NancyContext context, int? userId, string fullName, int? role, List<Object> profileData)
        {
            return UpdateUser(userId, fullName, role, profileData);
        }

        public virtual JsonSuccess UpdateUserGroup(NancyContext context, int? userGroupId, string name, string description)
        {
            return UpdateUserGroup(userGroupId, name, description);
        }

        public virtual JsonSuccess UpdateUserGroupMembers(NancyContext context, int? userGroupId, List<int?> delete, List<int?> add)
        {
            return UpdateUserGroupMembers(userGroupId, delete, add);
        }

        protected abstract JsonSuccessBase CreateUser(string email, string password, string fullName);

        protected abstract JsonSuccess CreateUserGroup(string name, string description, List<int?> members);

        protected abstract JsonSuccess DeactivateOwnUser();

        protected abstract JsonSuccess DeactivateUser(int? userId);

        protected abstract JsonSuccessBase GetAttachments();

        protected abstract JsonSuccessBase GetOwnUser();

        protected abstract JsonSuccessBase GetUser(int? userId, bool? clientGravatar, bool? includeCustomProfileFields);

        protected abstract JsonSuccessBase GetUserByEmail(string email, bool? clientGravatar, bool? includeCustomProfileFields);

        protected abstract JsonSuccessBase GetUserGroups();

        protected abstract JsonSuccessBase GetUserPresence(string userIdOrEmail);

        protected abstract JsonSuccessBase GetUsers(bool? clientGravatar, bool? includeCustomProfileFields);

        protected abstract JsonSuccess MuteUser(int? mutedUserId);

        protected abstract Object ReactivateUser(int? userId);

        protected abstract JsonSuccess RemoveUserGroup(int? userGroupId);

        protected abstract JsonSuccess SetTypingStatus(SetTypingStatusOpEnum? op, List<int?> to, SetTypingStatusTypeEnum? type, string topic);

        protected abstract JsonSuccess UnmuteUser(int? mutedUserId);

        protected abstract JsonSuccessBase UpdateDisplaySettings(bool? twentyFourHourTime, bool? denseMode, bool? starredMessageCounts, bool? fluidLayoutWidth, bool? highContrastMode, UpdateDisplaySettingsColorSchemeEnum? colorScheme, bool? translateEmoticons, string defaultLanguage, string defaultView, bool? leftSideUserlist, string emojiset, UpdateDisplaySettingsDemoteInactiveStreamsEnum? demoteInactiveStreams, string timezone);

        protected abstract JsonSuccessBase UpdateNotificationSettings(bool? enableStreamDesktopNotifications, bool? enableStreamEmailNotifications, bool? enableStreamPushNotifications, bool? enableStreamAudibleNotifications, string notificationSound, bool? enableDesktopNotifications, bool? enableSounds, bool? enableOfflineEmailNotifications, bool? enableOfflinePushNotifications, bool? enableOnlinePushNotifications, bool? enableDigestEmails, bool? enableMarketingEmails, bool? enableLoginEmails, bool? messageContentInEmailNotifications, bool? pmContentInDesktopNotifications, bool? wildcardMentionsNotify, UpdateNotificationSettingsDesktopIconCountDisplayEnum? desktopIconCountDisplay, bool? realmNameInNotifications, bool? presenceEnabled);

        protected abstract JsonSuccess UpdateUser(int? userId, string fullName, int? role, List<Object> profileData);

        protected abstract JsonSuccess UpdateUserGroup(int? userGroupId, string name, string description);

        protected abstract JsonSuccess UpdateUserGroupMembers(int? userGroupId, List<int?> delete, List<int?> add);
    }

}
