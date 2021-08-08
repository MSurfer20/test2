// TODO: better import syntax?
import { BaseAPIRequestFactory, RequiredError } from './baseapi';
import {Configuration} from '../configuration';
import { RequestContext, HttpMethod, ResponseContext, HttpFile} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {isCodeInRange} from '../util';

import { AnyType } from '../models/AnyType';
import { CodedError } from '../models/CodedError';
import { JsonError } from '../models/JsonError';
import { JsonSuccess } from '../models/JsonSuccess';
import { JsonSuccessBase } from '../models/JsonSuccessBase';

/**
 * no description
 */
export class UsersApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * {!can-create-users-only.md!}  Create a new user account via the API.  `POST {{ api_url }}/v1/users` 
     * Create a user
     * @param email The email address of the new user. 
     * @param password The password of the new user. 
     * @param fullName The full name of the new user. 
     */
    public async createUser(email: string, password: string, fullName: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'email' is not null or undefined
        if (email === null || email === undefined) {
            throw new RequiredError('Required parameter email was null or undefined when calling createUser.');
        }


        // verify required parameter 'password' is not null or undefined
        if (password === null || password === undefined) {
            throw new RequiredError('Required parameter password was null or undefined when calling createUser.');
        }


        // verify required parameter 'fullName' is not null or undefined
        if (fullName === null || fullName === undefined) {
            throw new RequiredError('Required parameter fullName was null or undefined when calling createUser.');
        }


        // Path Params
        const localVarPath = '/users';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (email !== undefined) {
            requestContext.setQueryParam("email", ObjectSerializer.serialize(email, "string", ""));
        }
        if (password !== undefined) {
            requestContext.setQueryParam("password", ObjectSerializer.serialize(password, "string", ""));
        }
        if (fullName !== undefined) {
            requestContext.setQueryParam("full_name", ObjectSerializer.serialize(fullName, "string", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Create a new [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/create` 
     * Create a user group
     * @param name The name of the user group. 
     * @param description The description of the user group. 
     * @param members An array containing the user IDs of the initial members for the new user group. 
     */
    public async createUserGroup(name: string, description: string, members: Array<number>, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'name' is not null or undefined
        if (name === null || name === undefined) {
            throw new RequiredError('Required parameter name was null or undefined when calling createUserGroup.');
        }


        // verify required parameter 'description' is not null or undefined
        if (description === null || description === undefined) {
            throw new RequiredError('Required parameter description was null or undefined when calling createUserGroup.');
        }


        // verify required parameter 'members' is not null or undefined
        if (members === null || members === undefined) {
            throw new RequiredError('Required parameter members was null or undefined when calling createUserGroup.');
        }


        // Path Params
        const localVarPath = '/user_groups/create';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (name !== undefined) {
            requestContext.setQueryParam("name", ObjectSerializer.serialize(name, "string", ""));
        }
        if (description !== undefined) {
            requestContext.setQueryParam("description", ObjectSerializer.serialize(description, "string", ""));
        }
        if (members !== undefined) {
            requestContext.setQueryParam("members", ObjectSerializer.serialize(members, "Array<number>", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Deactivates the user's account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  `DELETE {{ api_url }}/v1/users/me`  This endpoint is primarily useful to Zulip clients providing a user settings UI. 
     * Deactivate own user
     */
    public async deactivateOwnUser(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/users/me';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * [Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `DELETE {{ api_url }}/v1/users/{user_id}` 
     * Deactivate a user
     * @param userId The target user&#39;s ID. 
     */
    public async deactivateUser(userId: number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'userId' is not null or undefined
        if (userId === null || userId === undefined) {
            throw new RequiredError('Required parameter userId was null or undefined when calling deactivateUser.');
        }


        // Path Params
        const localVarPath = '/users/{user_id}'
            .replace('{' + 'user_id' + '}', encodeURIComponent(String(userId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Fetch metadata on files uploaded by the requesting user.  `GET {{ api_url }}/v1/attachments` 
     * Get attachments
     */
    public async getAttachments(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/attachments';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Get basic data about the user/bot that requests this endpoint.  `GET {{ api_url }}/v1/users/me` 
     * Get own user
     */
    public async getOwnUser(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/users/me';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Fetch details for a single user in the organization.  `GET {{ api_url }}/v1/users/{user_id}`  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 
     * Get a user
     * @param userId The target user&#39;s ID. 
     * @param clientGravatar Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. 
     * @param includeCustomProfileFields Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
     */
    public async getUser(userId: number, clientGravatar?: boolean, includeCustomProfileFields?: boolean, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'userId' is not null or undefined
        if (userId === null || userId === undefined) {
            throw new RequiredError('Required parameter userId was null or undefined when calling getUser.');
        }




        // Path Params
        const localVarPath = '/users/{user_id}'
            .replace('{' + 'user_id' + '}', encodeURIComponent(String(userId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (clientGravatar !== undefined) {
            requestContext.setQueryParam("client_gravatar", ObjectSerializer.serialize(clientGravatar, "boolean", ""));
        }
        if (includeCustomProfileFields !== undefined) {
            requestContext.setQueryParam("include_custom_profile_fields", ObjectSerializer.serialize(includeCustomProfileFields, "boolean", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Fetch details for a single user in the organization given a Zulip display email address.  `GET {{ api_url }}/v1/users/{email}`  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 
     * Get a user by email
     * @param email The email address of the user whose details you want to fetch. 
     * @param clientGravatar Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. 
     * @param includeCustomProfileFields Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
     */
    public async getUserByEmail(email: string, clientGravatar?: boolean, includeCustomProfileFields?: boolean, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'email' is not null or undefined
        if (email === null || email === undefined) {
            throw new RequiredError('Required parameter email was null or undefined when calling getUserByEmail.');
        }




        // Path Params
        const localVarPath = '/users/{email}'
            .replace('{' + 'email' + '}', encodeURIComponent(String(email)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (clientGravatar !== undefined) {
            requestContext.setQueryParam("client_gravatar", ObjectSerializer.serialize(clientGravatar, "boolean", ""));
        }
        if (includeCustomProfileFields !== undefined) {
            requestContext.setQueryParam("include_custom_profile_fields", ObjectSerializer.serialize(includeCustomProfileFields, "boolean", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * {!api-members-only.md!}  Fetches all of the user groups in the organization.  `GET {{ api_url }}/v1/user_groups` 
     * Get user groups
     */
    public async getUserGroups(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/user_groups';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user's presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  `GET {{ api_url }}/v1/users/{user_id_or_email}/presence`  See [Zulip's developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 
     * Get user presence
     * @param userIdOrEmail The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email. 
     */
    public async getUserPresence(userIdOrEmail: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'userIdOrEmail' is not null or undefined
        if (userIdOrEmail === null || userIdOrEmail === undefined) {
            throw new RequiredError('Required parameter userIdOrEmail was null or undefined when calling getUserPresence.');
        }


        // Path Params
        const localVarPath = '/users/{user_id_or_email}/presence'
            .replace('{' + 'user_id_or_email' + '}', encodeURIComponent(String(userIdOrEmail)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  `GET {{ api_url }}/v1/users`  You can also [fetch details on a single user](/api/get-user). 
     * Get all users
     * @param clientGravatar Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. 
     * @param includeCustomProfileFields Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
     */
    public async getUsers(clientGravatar?: boolean, includeCustomProfileFields?: boolean, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;



        // Path Params
        const localVarPath = '/users';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (clientGravatar !== undefined) {
            requestContext.setQueryParam("client_gravatar", ObjectSerializer.serialize(clientGravatar, "boolean", ""));
        }
        if (includeCustomProfileFields !== undefined) {
            requestContext.setQueryParam("include_custom_profile_fields", ObjectSerializer.serialize(includeCustomProfileFields, "boolean", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you've muted will be automatically marked as read and hidden.  `POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \"Muted user\", rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \"All users that exist   on this stream or realm\", e.g. for organization   administration or showing stream subscribers, should display   the user's name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 
     * Mute a user
     * @param mutedUserId The ID of the user to mute/un-mute. 
     */
    public async muteUser(mutedUserId: number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'mutedUserId' is not null or undefined
        if (mutedUserId === null || mutedUserId === undefined) {
            throw new RequiredError('Required parameter mutedUserId was null or undefined when calling muteUser.');
        }


        // Path Params
        const localVarPath = '/users/me/muted_users/{muted_user_id}'
            .replace('{' + 'muted_user_id' + '}', encodeURIComponent(String(mutedUserId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * [Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `POST {{ api_url }}/v1/users/{user_id}/reactivate` 
     * Reactivate a user
     * @param userId The target user&#39;s ID. 
     */
    public async reactivateUser(userId: number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'userId' is not null or undefined
        if (userId === null || userId === undefined) {
            throw new RequiredError('Required parameter userId was null or undefined when calling reactivateUser.');
        }


        // Path Params
        const localVarPath = '/users/{user_id}/reactivate'
            .replace('{' + 'user_id' + '}', encodeURIComponent(String(userId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Delete a [user group](/help/user-groups).  `DELETE {{ api_url }}/v1/user_groups/{user_group_id}` 
     * Delete a user group
     * @param userGroupId The ID of the target user group. 
     */
    public async removeUserGroup(userGroupId: number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'userGroupId' is not null or undefined
        if (userGroupId === null || userGroupId === undefined) {
            throw new RequiredError('Required parameter userGroupId was null or undefined when calling removeUserGroup.');
        }


        // Path Params
        const localVarPath = '/user_groups/{user_group_id}'
            .replace('{' + 'user_group_id' + '}', encodeURIComponent(String(userGroupId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Notify other users whether the current user is typing a message.  `POST {{ api_url }}/v1/typing`  Clients implementing Zulip's typing notifications protocol should work as follows:  * Send a request to this endpoint with `op=\"start\"` when a user starts typing a message,   and also every `TYPING_STARTED_WAIT_PERIOD=10` seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with `op=\"stop\"` when a user pauses using the   compose UI for at least `TYPING_STOPPED_WAIT_PERIOD=5` seconds or cancels   the compose action (if it had previously sent a \"start\" operation for that   compose action). * Start displaying \"Sender is typing\" for a given conversation when the client   receives an `op=\"start\"` event from the [events API](/api/get-events). * Continue displaying \"Sender is typing\" until they receive an `op=\"stop\"` event   from the [events API](/api/get-events) or `TYPING_STARTED_EXPIRY_PERIOD=15`   seconds have passed without a new `op=\"start\"` event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   `stream_typing_notifications` in the `client_capabilities` parameter to `/register`.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip's typing notifications protocol. 
     * Set \"typing\" status
     * @param op Whether the user has started (&#x60;start&#x60;) or stopped (&#x60;stop&#x60;) to type. 
     * @param to For &#39;private&#39; type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For &#39;stream&#39; type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11). 
     * @param type Type of the message being composed. 
     * @param topic Topic to which message is being typed. Required for the &#39;stream&#39; type. Ignored in case of &#39;private&#39; type. 
     */
    public async setTypingStatus(op: 'start' | 'stop', to: Array<number>, type?: 'private' | 'stream', topic?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'op' is not null or undefined
        if (op === null || op === undefined) {
            throw new RequiredError('Required parameter op was null or undefined when calling setTypingStatus.');
        }


        // verify required parameter 'to' is not null or undefined
        if (to === null || to === undefined) {
            throw new RequiredError('Required parameter to was null or undefined when calling setTypingStatus.');
        }




        // Path Params
        const localVarPath = '/typing';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (type !== undefined) {
            requestContext.setQueryParam("type", ObjectSerializer.serialize(type, "'private' | 'stream'", ""));
        }
        if (op !== undefined) {
            requestContext.setQueryParam("op", ObjectSerializer.serialize(op, "'start' | 'stop'", ""));
        }
        if (to !== undefined) {
            requestContext.setQueryParam("to", ObjectSerializer.serialize(to, "Array<number>", ""));
        }
        if (topic !== undefined) {
            requestContext.setQueryParam("topic", ObjectSerializer.serialize(topic, "string", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * This endpoint unmutes a user.  `DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  **Changes**: New in Zulip 4.0 (feature level 48). 
     * Unmute a user
     * @param mutedUserId The ID of the user to mute/un-mute. 
     */
    public async unmuteUser(mutedUserId: number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'mutedUserId' is not null or undefined
        if (mutedUserId === null || mutedUserId === undefined) {
            throw new RequiredError('Required parameter mutedUserId was null or undefined when calling unmuteUser.');
        }


        // Path Params
        const localVarPath = '/users/me/muted_users/{muted_user_id}'
            .replace('{' + 'muted_user_id' + '}', encodeURIComponent(String(mutedUserId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * This endpoint is used to edit the current user's settings.  `PATCH {{ api_url }}/v1/settings`  **Changes**: Prior to Zulip 5.0 (feature level 80), this endpoint only supported the `full_name`, `email`, `old_password`, and `new_password` parameters. Notification settings were managed by `PATCH /settings/notifications`, and all other settings by `PATCH /settings/display`. The feature level 80 migration to merge these endpoints did not change how request parameters are encoded. Note, however, that it did change the handling of any invalid parameters present in a request to change notification or display settings, since the merged endpoint uses the new response format that was introduced for `/settings` in Zulip 5.0 (feature level 78).  The `/settings/display` and `/settings/notifications` endpoints are now deprecated aliases for this endpoint for backwards-compatibility, and will be removed once clients have migrated to use this endpoint. 
     * Update settings
     * @param fullName A new display name for the user. 
     * @param email Asks the server to initiate a confirmation sequence to change the user&#39;s email address to the indicated value. The user will need to demonstrate control of the new email address by clicking a confirmation link sent to that address. 
     * @param oldPassword The user&#39;s old Zulip password (or LDAP password, if LDAP authentication is in use).  Required only when sending the &#x60;new_password&#x60; parameter. 
     * @param newPassword The user&#39;s new Zulip password (or LDAP password, if LDAP authentication is in use).  The &#x60;old_password&#x60; parameter must be included in the request. 
     * @param twentyFourHourTime Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. 
     * @param denseMode This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. 
     * @param starredMessageCounts Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. 
     * @param fluidLayoutWidth Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app&#39;s center panel (message feed, recent topics) on wide screens.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. 
     * @param highContrastMode This setting is reserved for use to control variations in Zulip&#39;s design to help visually impaired users.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. 
     * @param colorScheme Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard &#x60;prefers-color-scheme&#x60; media query.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. 
     * @param enableDraftsSynchronization A boolean parameter to control whether synchronizing drafts is enabled for the user. When synchronization is disabled, all drafts stored in the server will be automatically deleted from the server.  This does not do anything (like sending events) to delete local copies of drafts stored in clients.  **Changes**: New in Zulip 5.0 (feature level 87). 
     * @param translateEmoticons Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. 
     * @param defaultLanguage What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, &#x60;\&quot;en\&quot;&#x60; for English or &#x60;\&quot;de\&quot;&#x60; for German.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63). 
     * @param defaultView The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the &#x60;Esc&#x60; keyboard shortcut repeatedly.  * \&quot;recent_topics\&quot; - Recent topics view * \&quot;all_messages\&quot; - All messages view  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). 
     * @param leftSideUserlist Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. 
     * @param emojiset The user&#39;s configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \&quot;google\&quot; - Google modern * \&quot;google-blob\&quot; - Google classic * \&quot;twitter\&quot; - Twitter * \&quot;text\&quot; - Plain text  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). 
     * @param demoteInactiveStreams Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. 
     * @param timezone The user&#39;s [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). 
     * @param enableStreamDesktopNotifications Enable visual desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
     * @param enableStreamEmailNotifications Enable email notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
     * @param enableStreamPushNotifications Enable mobile notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
     * @param enableStreamAudibleNotifications Enable audible desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
     * @param notificationSound Notification sound name.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63). 
     * @param enableDesktopNotifications Enable visual desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
     * @param enableSounds Enable audible desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
     * @param emailNotificationsBatchingPeriodSeconds The duration (in seconds) for which the server should wait to batch email notifications before sending them.  **Changes**: New in Zulip 5.0 (feature level 82) 
     * @param enableOfflineEmailNotifications Enable email notifications for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
     * @param enableOfflinePushNotifications Enable mobile notification for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
     * @param enableOnlinePushNotifications Enable mobile notification for private messages and @-mentions received when the user is online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
     * @param enableDigestEmails Enable digest emails when the user is away.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
     * @param enableMarketingEmails Enable marketing emails. Has no function outside Zulip Cloud.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
     * @param enableLoginEmails Enable email notifications for new logins to account.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
     * @param messageContentInEmailNotifications Include the message&#39;s content in email notifications for new messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
     * @param pmContentInDesktopNotifications Include content of private messages in desktop notifications.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
     * @param wildcardMentionsNotify Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
     * @param desktopIconCountDisplay Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
     * @param realmNameInNotifications Include organization name in subject of message notification emails.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
     * @param presenceEnabled Display the presence status to other users when online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
     * @param enterSends Whether pressing Enter in the compose box sends a message (or saves a message edit).  **Changes**: Before Zulip 5.0 (feature level 81), this setting was managed by the &#x60;POST /users/me/enter-sends&#x60; endpoint, with the same parameter format. 
     */
    public async updateSettings(fullName?: string, email?: string, oldPassword?: string, newPassword?: string, twentyFourHourTime?: boolean, denseMode?: boolean, starredMessageCounts?: boolean, fluidLayoutWidth?: boolean, highContrastMode?: boolean, colorScheme?: 1 | 2 | 3, enableDraftsSynchronization?: boolean, translateEmoticons?: boolean, defaultLanguage?: string, defaultView?: string, leftSideUserlist?: boolean, emojiset?: string, demoteInactiveStreams?: 1 | 2 | 3, timezone?: string, enableStreamDesktopNotifications?: boolean, enableStreamEmailNotifications?: boolean, enableStreamPushNotifications?: boolean, enableStreamAudibleNotifications?: boolean, notificationSound?: string, enableDesktopNotifications?: boolean, enableSounds?: boolean, emailNotificationsBatchingPeriodSeconds?: number, enableOfflineEmailNotifications?: boolean, enableOfflinePushNotifications?: boolean, enableOnlinePushNotifications?: boolean, enableDigestEmails?: boolean, enableMarketingEmails?: boolean, enableLoginEmails?: boolean, messageContentInEmailNotifications?: boolean, pmContentInDesktopNotifications?: boolean, wildcardMentionsNotify?: boolean, desktopIconCountDisplay?: 1 | 2 | 3, realmNameInNotifications?: boolean, presenceEnabled?: boolean, enterSends?: boolean, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;








































        // Path Params
        const localVarPath = '/settings';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PATCH);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (fullName !== undefined) {
            requestContext.setQueryParam("full_name", ObjectSerializer.serialize(fullName, "string", ""));
        }
        if (email !== undefined) {
            requestContext.setQueryParam("email", ObjectSerializer.serialize(email, "string", ""));
        }
        if (oldPassword !== undefined) {
            requestContext.setQueryParam("old_password", ObjectSerializer.serialize(oldPassword, "string", ""));
        }
        if (newPassword !== undefined) {
            requestContext.setQueryParam("new_password", ObjectSerializer.serialize(newPassword, "string", ""));
        }
        if (twentyFourHourTime !== undefined) {
            requestContext.setQueryParam("twenty_four_hour_time", ObjectSerializer.serialize(twentyFourHourTime, "boolean", ""));
        }
        if (denseMode !== undefined) {
            requestContext.setQueryParam("dense_mode", ObjectSerializer.serialize(denseMode, "boolean", ""));
        }
        if (starredMessageCounts !== undefined) {
            requestContext.setQueryParam("starred_message_counts", ObjectSerializer.serialize(starredMessageCounts, "boolean", ""));
        }
        if (fluidLayoutWidth !== undefined) {
            requestContext.setQueryParam("fluid_layout_width", ObjectSerializer.serialize(fluidLayoutWidth, "boolean", ""));
        }
        if (highContrastMode !== undefined) {
            requestContext.setQueryParam("high_contrast_mode", ObjectSerializer.serialize(highContrastMode, "boolean", ""));
        }
        if (colorScheme !== undefined) {
            requestContext.setQueryParam("color_scheme", ObjectSerializer.serialize(colorScheme, "1 | 2 | 3", ""));
        }
        if (enableDraftsSynchronization !== undefined) {
            requestContext.setQueryParam("enable_drafts_synchronization", ObjectSerializer.serialize(enableDraftsSynchronization, "boolean", ""));
        }
        if (translateEmoticons !== undefined) {
            requestContext.setQueryParam("translate_emoticons", ObjectSerializer.serialize(translateEmoticons, "boolean", ""));
        }
        if (defaultLanguage !== undefined) {
            requestContext.setQueryParam("default_language", ObjectSerializer.serialize(defaultLanguage, "string", ""));
        }
        if (defaultView !== undefined) {
            requestContext.setQueryParam("default_view", ObjectSerializer.serialize(defaultView, "string", ""));
        }
        if (leftSideUserlist !== undefined) {
            requestContext.setQueryParam("left_side_userlist", ObjectSerializer.serialize(leftSideUserlist, "boolean", ""));
        }
        if (emojiset !== undefined) {
            requestContext.setQueryParam("emojiset", ObjectSerializer.serialize(emojiset, "string", ""));
        }
        if (demoteInactiveStreams !== undefined) {
            requestContext.setQueryParam("demote_inactive_streams", ObjectSerializer.serialize(demoteInactiveStreams, "1 | 2 | 3", ""));
        }
        if (timezone !== undefined) {
            requestContext.setQueryParam("timezone", ObjectSerializer.serialize(timezone, "string", ""));
        }
        if (enableStreamDesktopNotifications !== undefined) {
            requestContext.setQueryParam("enable_stream_desktop_notifications", ObjectSerializer.serialize(enableStreamDesktopNotifications, "boolean", ""));
        }
        if (enableStreamEmailNotifications !== undefined) {
            requestContext.setQueryParam("enable_stream_email_notifications", ObjectSerializer.serialize(enableStreamEmailNotifications, "boolean", ""));
        }
        if (enableStreamPushNotifications !== undefined) {
            requestContext.setQueryParam("enable_stream_push_notifications", ObjectSerializer.serialize(enableStreamPushNotifications, "boolean", ""));
        }
        if (enableStreamAudibleNotifications !== undefined) {
            requestContext.setQueryParam("enable_stream_audible_notifications", ObjectSerializer.serialize(enableStreamAudibleNotifications, "boolean", ""));
        }
        if (notificationSound !== undefined) {
            requestContext.setQueryParam("notification_sound", ObjectSerializer.serialize(notificationSound, "string", ""));
        }
        if (enableDesktopNotifications !== undefined) {
            requestContext.setQueryParam("enable_desktop_notifications", ObjectSerializer.serialize(enableDesktopNotifications, "boolean", ""));
        }
        if (enableSounds !== undefined) {
            requestContext.setQueryParam("enable_sounds", ObjectSerializer.serialize(enableSounds, "boolean", ""));
        }
        if (emailNotificationsBatchingPeriodSeconds !== undefined) {
            requestContext.setQueryParam("email_notifications_batching_period_seconds", ObjectSerializer.serialize(emailNotificationsBatchingPeriodSeconds, "number", ""));
        }
        if (enableOfflineEmailNotifications !== undefined) {
            requestContext.setQueryParam("enable_offline_email_notifications", ObjectSerializer.serialize(enableOfflineEmailNotifications, "boolean", ""));
        }
        if (enableOfflinePushNotifications !== undefined) {
            requestContext.setQueryParam("enable_offline_push_notifications", ObjectSerializer.serialize(enableOfflinePushNotifications, "boolean", ""));
        }
        if (enableOnlinePushNotifications !== undefined) {
            requestContext.setQueryParam("enable_online_push_notifications", ObjectSerializer.serialize(enableOnlinePushNotifications, "boolean", ""));
        }
        if (enableDigestEmails !== undefined) {
            requestContext.setQueryParam("enable_digest_emails", ObjectSerializer.serialize(enableDigestEmails, "boolean", ""));
        }
        if (enableMarketingEmails !== undefined) {
            requestContext.setQueryParam("enable_marketing_emails", ObjectSerializer.serialize(enableMarketingEmails, "boolean", ""));
        }
        if (enableLoginEmails !== undefined) {
            requestContext.setQueryParam("enable_login_emails", ObjectSerializer.serialize(enableLoginEmails, "boolean", ""));
        }
        if (messageContentInEmailNotifications !== undefined) {
            requestContext.setQueryParam("message_content_in_email_notifications", ObjectSerializer.serialize(messageContentInEmailNotifications, "boolean", ""));
        }
        if (pmContentInDesktopNotifications !== undefined) {
            requestContext.setQueryParam("pm_content_in_desktop_notifications", ObjectSerializer.serialize(pmContentInDesktopNotifications, "boolean", ""));
        }
        if (wildcardMentionsNotify !== undefined) {
            requestContext.setQueryParam("wildcard_mentions_notify", ObjectSerializer.serialize(wildcardMentionsNotify, "boolean", ""));
        }
        if (desktopIconCountDisplay !== undefined) {
            requestContext.setQueryParam("desktop_icon_count_display", ObjectSerializer.serialize(desktopIconCountDisplay, "1 | 2 | 3", ""));
        }
        if (realmNameInNotifications !== undefined) {
            requestContext.setQueryParam("realm_name_in_notifications", ObjectSerializer.serialize(realmNameInNotifications, "boolean", ""));
        }
        if (presenceEnabled !== undefined) {
            requestContext.setQueryParam("presence_enabled", ObjectSerializer.serialize(presenceEnabled, "boolean", ""));
        }
        if (enterSends !== undefined) {
            requestContext.setQueryParam("enter_sends", ObjectSerializer.serialize(enterSends, "boolean", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Change your [status](/help/status-and-availability).  `POST {{ api_url }}/v1/users/me/status`  A request to this endpoint will only change the parameters passed. For example, passing just `status_text` requests a change in the status text, but will leave the status emoji unchanged.  Clients that wish to set the user's status to a specific value should pass all supported parameters. 
     * Update your status
     * @param statusText The text content of the status message. Sending the empty string will clear the user&#39;s status.  **Note**: The limit on the size of the message is 60 characters. 
     * @param away Whether the user should be marked as \&quot;away\&quot;. 
     * @param emojiName The name for the emoji to associate with this status. 
     * @param emojiCode A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For example, for &#x60;unicode_emoji&#x60;, this will be an encoding of the Unicode codepoint; for &#x60;realm_emoji&#x60;, it&#39;ll be the ID of the realm emoji. 
     * @param reactionType One of the following values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode   codepoint). * &#x60;realm_emoji&#x60;: [Custom emoji](/help/add-custom-emoji).   (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to   namespace the &#x60;zulip&#x60; emoji. 
     */
    public async updateStatus(statusText?: string, away?: boolean, emojiName?: string, emojiCode?: string, reactionType?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;






        // Path Params
        const localVarPath = '/users/me/status';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (statusText !== undefined) {
            requestContext.setQueryParam("status_text", ObjectSerializer.serialize(statusText, "string", ""));
        }
        if (away !== undefined) {
            requestContext.setQueryParam("away", ObjectSerializer.serialize(away, "boolean", ""));
        }
        if (emojiName !== undefined) {
            requestContext.setQueryParam("emoji_name", ObjectSerializer.serialize(emojiName, "string", ""));
        }
        if (emojiCode !== undefined) {
            requestContext.setQueryParam("emoji_code", ObjectSerializer.serialize(emojiCode, "string", ""));
        }
        if (reactionType !== undefined) {
            requestContext.setQueryParam("reaction_type", ObjectSerializer.serialize(reactionType, "string", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Administrative endpoint to update the details of another user in the organization.  `PATCH {{ api_url }}/v1/users/{user_id}`  Supports everything an administrator can do to edit details of another user's account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 
     * Update a user
     * @param userId The target user&#39;s ID. 
     * @param fullName The user&#39;s full name. 
     * @param role New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of &#x60;is_admin&#x60; and &#x60;is_guest&#x60; boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60). 
     * @param profileData A dictionary containing the to be updated custom profile field data for the user. 
     */
    public async updateUser(userId: number, fullName?: string, role?: number, profileData?: Array<any>, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'userId' is not null or undefined
        if (userId === null || userId === undefined) {
            throw new RequiredError('Required parameter userId was null or undefined when calling updateUser.');
        }





        // Path Params
        const localVarPath = '/users/{user_id}'
            .replace('{' + 'user_id' + '}', encodeURIComponent(String(userId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PATCH);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (fullName !== undefined) {
            requestContext.setQueryParam("full_name", ObjectSerializer.serialize(fullName, "string", ""));
        }
        if (role !== undefined) {
            requestContext.setQueryParam("role", ObjectSerializer.serialize(role, "number", ""));
        }
        if (profileData !== undefined) {
            requestContext.setQueryParam("profile_data", ObjectSerializer.serialize(profileData, "Array<any>", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Update the name or description of a [user group](/help/user-groups).  `PATCH {{ api_url }}/v1/user_groups/{user_group_id}` 
     * Update a user group
     * @param userGroupId The ID of the target user group. 
     * @param name The new name of the group. 
     * @param description The new description of the group. 
     */
    public async updateUserGroup(userGroupId: number, name: string, description: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'userGroupId' is not null or undefined
        if (userGroupId === null || userGroupId === undefined) {
            throw new RequiredError('Required parameter userGroupId was null or undefined when calling updateUserGroup.');
        }


        // verify required parameter 'name' is not null or undefined
        if (name === null || name === undefined) {
            throw new RequiredError('Required parameter name was null or undefined when calling updateUserGroup.');
        }


        // verify required parameter 'description' is not null or undefined
        if (description === null || description === undefined) {
            throw new RequiredError('Required parameter description was null or undefined when calling updateUserGroup.');
        }


        // Path Params
        const localVarPath = '/user_groups/{user_group_id}'
            .replace('{' + 'user_group_id' + '}', encodeURIComponent(String(userGroupId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PATCH);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (name !== undefined) {
            requestContext.setQueryParam("name", ObjectSerializer.serialize(name, "string", ""));
        }
        if (description !== undefined) {
            requestContext.setQueryParam("description", ObjectSerializer.serialize(description, "string", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Update the members of a [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/{user_group_id}/members` 
     * Update user group members
     * @param userGroupId The ID of the target user group. 
     * @param _delete The list of user ids to be removed from the user group. 
     * @param add The list of user ids to be added to the user group. 
     */
    public async updateUserGroupMembers(userGroupId: number, _delete?: Array<number>, add?: Array<number>, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'userGroupId' is not null or undefined
        if (userGroupId === null || userGroupId === undefined) {
            throw new RequiredError('Required parameter userGroupId was null or undefined when calling updateUserGroupMembers.');
        }




        // Path Params
        const localVarPath = '/user_groups/{user_group_id}/members'
            .replace('{' + 'user_group_id' + '}', encodeURIComponent(String(userGroupId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (_delete !== undefined) {
            requestContext.setQueryParam("delete", ObjectSerializer.serialize(_delete, "Array<number>", ""));
        }
        if (add !== undefined) {
            requestContext.setQueryParam("add", ObjectSerializer.serialize(add, "Array<number>", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

}

export class UsersApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to createUser
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async createUser(response: ResponseContext): Promise<JsonSuccessBase > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: JsonError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonError", ""
            ) as JsonError;
            throw new ApiException<JsonError>(400, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to createUserGroup
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async createUserGroup(response: ResponseContext): Promise<JsonSuccess > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: JsonError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonError", ""
            ) as JsonError;
            throw new ApiException<JsonError>(400, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deactivateOwnUser
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async deactivateOwnUser(response: ResponseContext): Promise<JsonSuccess > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: JsonError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonError", ""
            ) as JsonError;
            throw new ApiException<JsonError>(400, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deactivateUser
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async deactivateUser(response: ResponseContext): Promise<JsonSuccess > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: JsonError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonError", ""
            ) as JsonError;
            throw new ApiException<JsonError>(400, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getAttachments
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getAttachments(response: ResponseContext): Promise<JsonSuccessBase > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getOwnUser
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getOwnUser(response: ResponseContext): Promise<JsonSuccessBase > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getUser
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getUser(response: ResponseContext): Promise<JsonSuccessBase > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getUserByEmail
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getUserByEmail(response: ResponseContext): Promise<JsonSuccessBase > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getUserGroups
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getUserGroups(response: ResponseContext): Promise<JsonSuccessBase > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getUserPresence
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getUserPresence(response: ResponseContext): Promise<JsonSuccessBase > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getUsers
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getUsers(response: ResponseContext): Promise<JsonSuccessBase > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to muteUser
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async muteUser(response: ResponseContext): Promise<JsonSuccess > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: JsonError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonError", ""
            ) as JsonError;
            throw new ApiException<JsonError>(400, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reactivateUser
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reactivateUser(response: ResponseContext): Promise<AnyType > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: AnyType = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "AnyType", ""
            ) as AnyType;
            return body;
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: AnyType = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "AnyType", ""
            ) as AnyType;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to removeUserGroup
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async removeUserGroup(response: ResponseContext): Promise<JsonSuccess > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: JsonError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonError", ""
            ) as JsonError;
            throw new ApiException<JsonError>(400, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to setTypingStatus
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async setTypingStatus(response: ResponseContext): Promise<JsonSuccess > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: JsonError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonError", ""
            ) as JsonError;
            throw new ApiException<JsonError>(400, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to unmuteUser
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async unmuteUser(response: ResponseContext): Promise<JsonSuccess > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: JsonError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonError", ""
            ) as JsonError;
            throw new ApiException<JsonError>(400, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateSettings
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async updateSettings(response: ResponseContext): Promise<JsonSuccessBase > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateStatus
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async updateStatus(response: ResponseContext): Promise<JsonSuccess > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: CodedError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "CodedError", ""
            ) as CodedError;
            throw new ApiException<CodedError>(400, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateUser
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async updateUser(response: ResponseContext): Promise<JsonSuccess > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: CodedError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "CodedError", ""
            ) as CodedError;
            throw new ApiException<CodedError>(400, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateUserGroup
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async updateUserGroup(response: ResponseContext): Promise<JsonSuccess > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: JsonError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonError", ""
            ) as JsonError;
            throw new ApiException<JsonError>(400, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateUserGroupMembers
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async updateUserGroupMembers(response: ResponseContext): Promise<JsonSuccess > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

}
