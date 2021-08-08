package org.openapitools.api

import org.openapitools.model.AnyType
import org.openapitools.model.CodedError
import org.openapitools.model.JsonError
import org.openapitools.model.JsonSuccess
import org.openapitools.model.JsonSuccessBase
import org.openapitools.model.NonExistingStreamError
import org.openapitools.model.OneOfLessThanObjectCommaObjectCommaObjectCommaObjectCommaObjectCommaObjectGreaterThan
import org.openapitools.model.OneOfLessThanObjectCommaObjectCommaObjectGreaterThan
import org.openapitools.model.OneOfLessThanObjectCommaObjectGreaterThan
import org.openapitools.model.OneOfLessThanStringCommaIntegerGreaterThan
import org.junit.jupiter.api.Test

import org.springframework.http.ResponseEntity

class UsersApiTest {

    
    private val api: UsersApiController = UsersApiController()

    
    /**
    * Create a user
    *
    * {!can-create-users-only.md!}  Create a new user account via the API.  &#x60;POST {{ api_url }}/v1/users&#x60; 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun createUserTest() {
        val email:kotlin.String? = null
        val password:kotlin.String? = null
        val fullName:kotlin.String? = null
        val response: ResponseEntity<JsonSuccessBase> = api.createUser(email!!, password!!, fullName!!)

        // TODO: test validations
    }
    
    /**
    * Deactivate own user
    *
    * Deactivates the user&#39;s account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  &#x60;DELETE {{ api_url }}/v1/users/me&#x60;  This endpoint is primarily useful to Zulip clients providing a user settings UI. 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun deactivateOwnUserTest() {
        val response: ResponseEntity<JsonSuccess> = api.deactivateOwnUser()

        // TODO: test validations
    }
    
    /**
    * Deactivate a user
    *
    * [Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  &#x60;DELETE {{ api_url }}/v1/users/{user_id}&#x60; 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun deactivateUserTest() {
        val userId:kotlin.Int? = null
        val response: ResponseEntity<JsonSuccess> = api.deactivateUser(userId!!)

        // TODO: test validations
    }
    
    /**
    * Get own user
    *
    * Get basic data about the user/bot that requests this endpoint.  &#x60;GET {{ api_url }}/v1/users/me&#x60; 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun getOwnUserTest() {
        val response: ResponseEntity<JsonSuccessBase> = api.getOwnUser()

        // TODO: test validations
    }
    
    /**
    * Get topics in a stream
    *
    * Get all the topics in a specific stream  &#x60;GET {{ api_url }}/v1/users/me/{stream_id}/topics&#x60; 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun getStreamTopicsTest() {
        val streamId:kotlin.Int? = null
        val response: ResponseEntity<JsonSuccessBase> = api.getStreamTopics(streamId!!)

        // TODO: test validations
    }
    
    /**
    * Get subscription status
    *
    * Check whether a user is subscribed to a stream.  &#x60;GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}&#x60;  **Changes**: New in Zulip 3.0 (feature level 11). 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun getSubscriptionStatusTest() {
        val userId:kotlin.Int? = null
        val streamId:kotlin.Int? = null
        val response: ResponseEntity<JsonSuccessBase> = api.getSubscriptionStatus(userId!!, streamId!!)

        // TODO: test validations
    }
    
    /**
    * Get subscribed streams
    *
    * Get all streams that the user is subscribed to.  &#x60;GET {{ api_url }}/v1/users/me/subscriptions&#x60; 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun getSubscriptionsTest() {
        val includeSubscribers:kotlin.Boolean? = null
        val response: ResponseEntity<JsonSuccessBase> = api.getSubscriptions(includeSubscribers!!)

        // TODO: test validations
    }
    
    /**
    * Get a user
    *
    * Fetch details for a single user in the organization.  &#x60;GET {{ api_url }}/v1/users/{user_id}&#x60;  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun getUserTest() {
        val userId:kotlin.Int? = null
        val clientGravatar:kotlin.Boolean? = null
        val includeCustomProfileFields:kotlin.Boolean? = null
        val response: ResponseEntity<JsonSuccessBase> = api.getUser(userId!!, clientGravatar!!, includeCustomProfileFields!!)

        // TODO: test validations
    }
    
    /**
    * Get a user by email
    *
    * Fetch details for a single user in the organization given a Zulip display email address.  &#x60;GET {{ api_url }}/v1/users/{email}&#x60;  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun getUserByEmailTest() {
        val email:kotlin.String? = null
        val clientGravatar:kotlin.Boolean? = null
        val includeCustomProfileFields:kotlin.Boolean? = null
        val response: ResponseEntity<JsonSuccessBase> = api.getUserByEmail(email!!, clientGravatar!!, includeCustomProfileFields!!)

        // TODO: test validations
    }
    
    /**
    * Get user presence
    *
    * Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user&#39;s presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  &#x60;GET {{ api_url }}/v1/users/{user_id_or_email}/presence&#x60;  See [Zulip&#39;s developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun getUserPresenceTest() {
        val userIdOrEmail:kotlin.String? = null
        val response: ResponseEntity<JsonSuccessBase> = api.getUserPresence(userIdOrEmail!!)

        // TODO: test validations
    }
    
    /**
    * Get all users
    *
    * Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  &#x60;GET {{ api_url }}/v1/users&#x60;  You can also [fetch details on a single user](/api/get-user). 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun getUsersTest() {
        val clientGravatar:kotlin.Boolean? = null
        val includeCustomProfileFields:kotlin.Boolean? = null
        val response: ResponseEntity<JsonSuccessBase> = api.getUsers(clientGravatar!!, includeCustomProfileFields!!)

        // TODO: test validations
    }
    
    /**
    * Topic muting
    *
    * This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user&#39;s unread count totals.  &#x60;PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics&#x60; 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun muteTopicTest() {
        val topic:kotlin.String? = null
        val op:kotlin.String? = null
        val stream:kotlin.String? = null
        val streamId:kotlin.Int? = null
        val response: ResponseEntity<JsonSuccess> = api.muteTopic(topic!!, op!!, stream!!, streamId!!)

        // TODO: test validations
    }
    
    /**
    * Mute a user
    *
    * This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you&#39;ve muted will be automatically marked as read and hidden.  &#x60;POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}&#x60;  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \&quot;Muted user\&quot;, rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \&quot;All users that exist   on this stream or realm\&quot;, e.g. for organization   administration or showing stream subscribers, should display   the user&#39;s name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun muteUserTest() {
        val mutedUserId:kotlin.Int? = null
        val response: ResponseEntity<JsonSuccess> = api.muteUser(mutedUserId!!)

        // TODO: test validations
    }
    
    /**
    * Reactivate a user
    *
    * [Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  &#x60;POST {{ api_url }}/v1/users/{user_id}/reactivate&#x60; 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun reactivateUserTest() {
        val userId:kotlin.Int? = null
        val response: ResponseEntity<AnyType> = api.reactivateUser(userId!!)

        // TODO: test validations
    }
    
    /**
    * Subscribe to a stream
    *
    * Subscribe one or more users to one or more streams.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions&#x60;  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like &#x60;invite_only&#x60; detailed below. 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun subscribeTest() {
        val subscriptions:kotlin.collections.List<kotlin.Any>? = null
        val principals:kotlin.collections.List<OneOfLessThanStringCommaIntegerGreaterThan>? = null
        val authorizationErrorsFatal:kotlin.Boolean? = null
        val announce:kotlin.Boolean? = null
        val inviteOnly:kotlin.Boolean? = null
        val historyPublicToSubscribers:kotlin.Boolean? = null
        val streamPostPolicy:kotlin.Int? = null
        val messageRetentionDays:OneOfLessThanStringCommaIntegerGreaterThan? = null
        val response: ResponseEntity<OneOfLessThanObjectCommaObjectGreaterThan> = api.subscribe(subscriptions!!, principals!!, authorizationErrorsFatal!!, announce!!, inviteOnly!!, historyPublicToSubscribers!!, streamPostPolicy!!, messageRetentionDays!!)

        // TODO: test validations
    }
    
    /**
    * Unmute a user
    *
    * This endpoint unmutes a user.  &#x60;DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 48). 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun unmuteUserTest() {
        val mutedUserId:kotlin.Int? = null
        val response: ResponseEntity<JsonSuccess> = api.unmuteUser(mutedUserId!!)

        // TODO: test validations
    }
    
    /**
    * Unsubscribe from a stream
    *
    * Unsubscribe yourself or other users from one or more streams.  &#x60;DELETE {{ api_url }}/v1/users/me/subscriptions&#x60; 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun unsubscribeTest() {
        val subscriptions:kotlin.collections.List<kotlin.String>? = null
        val principals:kotlin.collections.List<OneOfLessThanStringCommaIntegerGreaterThan>? = null
        val response: ResponseEntity<JsonSuccessBase> = api.unsubscribe(subscriptions!!, principals!!)

        // TODO: test validations
    }
    
    /**
    * Update your status
    *
    * Change your [status](/help/status-and-availability).  &#x60;POST {{ api_url }}/v1/users/me/status&#x60;  A request to this endpoint will only change the parameters passed. For example, passing just &#x60;status_text&#x60; requests a change in the status text, but will leave the status emoji unchanged.  Clients that wish to set the user&#39;s status to a specific value should pass all supported parameters. 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun updateStatusTest() {
        val statusText:kotlin.String? = null
        val away:kotlin.Boolean? = null
        val emojiName:kotlin.String? = null
        val emojiCode:kotlin.String? = null
        val reactionType:kotlin.String? = null
        val response: ResponseEntity<JsonSuccess> = api.updateStatus(statusText!!, away!!, emojiName!!, emojiCode!!, reactionType!!)

        // TODO: test validations
    }
    
    /**
    * Update subscription settings
    *
    * This endpoint is used to update the user&#39;s personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions/properties&#x60; 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun updateSubscriptionSettingsTest() {
        val subscriptionData:kotlin.collections.List<kotlin.Any>? = null
        val response: ResponseEntity<JsonSuccessBase> = api.updateSubscriptionSettings(subscriptionData!!)

        // TODO: test validations
    }
    
    /**
    * Update subscriptions
    *
    * Update which streams you are are subscribed to. 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun updateSubscriptionsTest() {
        val delete:kotlin.collections.List<kotlin.String>? = null
        val add:kotlin.collections.List<kotlin.Any>? = null
        val response: ResponseEntity<JsonSuccessBase> = api.updateSubscriptions(delete!!, add!!)

        // TODO: test validations
    }
    
    /**
    * Update a user
    *
    * Administrative endpoint to update the details of another user in the organization.  &#x60;PATCH {{ api_url }}/v1/users/{user_id}&#x60;  Supports everything an administrator can do to edit details of another user&#39;s account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun updateUserTest() {
        val userId:kotlin.Int? = null
        val fullName:kotlin.String? = null
        val role:kotlin.Int? = null
        val profileData:kotlin.collections.List<kotlin.Any>? = null
        val response: ResponseEntity<JsonSuccess> = api.updateUser(userId!!, fullName!!, role!!, profileData!!)

        // TODO: test validations
    }
    
}
