// TODO: better import syntax?
import { BaseAPIRequestFactory, RequiredError } from './baseapi';
import {Configuration} from '../configuration';
import { RequestContext, HttpMethod, ResponseContext, HttpFile} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {isCodeInRange} from '../util';

import { AddSubscriptionsResponse } from '../models/AddSubscriptionsResponse';
import { CodedError } from '../models/CodedError';
import { JsonError } from '../models/JsonError';
import { JsonSuccess } from '../models/JsonSuccess';
import { JsonSuccessBase } from '../models/JsonSuccessBase';
import { NonExistingStreamError } from '../models/NonExistingStreamError';
import { String | number } from '../models/string | number';

/**
 * no description
 */
export class StreamsApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * [Archive the stream](/help/archive-a-stream) with the ID `stream_id`.  `DELETE {{ api_url }}/v1/streams/{stream_id}` 
     * Archive a stream
     * @param streamId The ID of the stream to access. 
     */
    public async archiveStream(streamId: number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'streamId' is not null or undefined
        if (streamId === null || streamId === undefined) {
            throw new RequiredError('Required parameter streamId was null or undefined when calling archiveStream.');
        }


        // Path Params
        const localVarPath = '/streams/{stream_id}'
            .replace('{' + 'stream_id' + '}', encodeURIComponent(String(streamId)));

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
     * Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 
     * Create BigBlueButton video call
     */
    public async createBigBlueButtonVideoCall(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/calls/bigbluebutton/create';

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
     * Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id` 
     * Get stream ID
     * @param stream The name of the stream to access. 
     */
    public async getStreamId(stream: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'stream' is not null or undefined
        if (stream === null || stream === undefined) {
            throw new RequiredError('Required parameter stream was null or undefined when calling getStreamId.');
        }


        // Path Params
        const localVarPath = '/get_stream_id';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (stream !== undefined) {
            requestContext.setQueryParam("stream", ObjectSerializer.serialize(stream, "string", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Get all the topics in a specific stream  `GET {{ api_url }}/v1/users/me/{stream_id}/topics` 
     * Get topics in a stream
     * @param streamId The ID of the stream to access. 
     */
    public async getStreamTopics(streamId: number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'streamId' is not null or undefined
        if (streamId === null || streamId === undefined) {
            throw new RequiredError('Required parameter streamId was null or undefined when calling getStreamTopics.');
        }


        // Path Params
        const localVarPath = '/users/me/{stream_id}/topics'
            .replace('{' + 'stream_id' + '}', encodeURIComponent(String(streamId)));

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
     * Get all streams that the user has access to.  `GET {{ api_url }}/v1/streams` 
     * Get all streams
     * @param includePublic Include all public streams. 
     * @param includeWebPublic Include all web public streams. 
     * @param includeSubscribed Include all streams that the user is subscribed to. 
     * @param includeAllActive Include all active streams. The user must have administrative privileges to use this parameter. 
     * @param includeDefault Include all default streams for the user&#39;s realm. 
     * @param includeOwnerSubscribed If the user is a bot, include all streams that the bot&#39;s owner is subscribed to. 
     */
    public async getStreams(includePublic?: boolean, includeWebPublic?: boolean, includeSubscribed?: boolean, includeAllActive?: boolean, includeDefault?: boolean, includeOwnerSubscribed?: boolean, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;







        // Path Params
        const localVarPath = '/streams';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (includePublic !== undefined) {
            requestContext.setQueryParam("include_public", ObjectSerializer.serialize(includePublic, "boolean", ""));
        }
        if (includeWebPublic !== undefined) {
            requestContext.setQueryParam("include_web_public", ObjectSerializer.serialize(includeWebPublic, "boolean", ""));
        }
        if (includeSubscribed !== undefined) {
            requestContext.setQueryParam("include_subscribed", ObjectSerializer.serialize(includeSubscribed, "boolean", ""));
        }
        if (includeAllActive !== undefined) {
            requestContext.setQueryParam("include_all_active", ObjectSerializer.serialize(includeAllActive, "boolean", ""));
        }
        if (includeDefault !== undefined) {
            requestContext.setQueryParam("include_default", ObjectSerializer.serialize(includeDefault, "boolean", ""));
        }
        if (includeOwnerSubscribed !== undefined) {
            requestContext.setQueryParam("include_owner_subscribed", ObjectSerializer.serialize(includeOwnerSubscribed, "boolean", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Check whether a user is subscribed to a stream.  `GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`  **Changes**: New in Zulip 3.0 (feature level 11). 
     * Get subscription status
     * @param userId The target user&#39;s ID. 
     * @param streamId The ID of the stream to access. 
     */
    public async getSubscriptionStatus(userId: number, streamId: number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'userId' is not null or undefined
        if (userId === null || userId === undefined) {
            throw new RequiredError('Required parameter userId was null or undefined when calling getSubscriptionStatus.');
        }


        // verify required parameter 'streamId' is not null or undefined
        if (streamId === null || streamId === undefined) {
            throw new RequiredError('Required parameter streamId was null or undefined when calling getSubscriptionStatus.');
        }


        // Path Params
        const localVarPath = '/users/{user_id}/subscriptions/{stream_id}'
            .replace('{' + 'user_id' + '}', encodeURIComponent(String(userId)))
            .replace('{' + 'stream_id' + '}', encodeURIComponent(String(streamId)));

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
     * Get all streams that the user is subscribed to.  `GET {{ api_url }}/v1/users/me/subscriptions` 
     * Get subscribed streams
     * @param includeSubscribers Whether each returned stream object should include a &#x60;subscribers&#x60; field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0. 
     */
    public async getSubscriptions(includeSubscribers?: boolean, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/users/me/subscriptions';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (includeSubscribers !== undefined) {
            requestContext.setQueryParam("include_subscribers", ObjectSerializer.serialize(includeSubscribers, "boolean", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user's unread count totals.  `PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics` 
     * Topic muting
     * @param topic The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic. 
     * @param op Whether to mute (&#x60;add&#x60;) or unmute (&#x60;remove&#x60;) the provided topic. 
     * @param stream The name of the stream to access. 
     * @param streamId The ID of the stream to access. 
     */
    public async muteTopic(topic: string, op: 'add' | 'remove', stream?: string, streamId?: number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'topic' is not null or undefined
        if (topic === null || topic === undefined) {
            throw new RequiredError('Required parameter topic was null or undefined when calling muteTopic.');
        }


        // verify required parameter 'op' is not null or undefined
        if (op === null || op === undefined) {
            throw new RequiredError('Required parameter op was null or undefined when calling muteTopic.');
        }




        // Path Params
        const localVarPath = '/users/me/subscriptions/muted_topics';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PATCH);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (stream !== undefined) {
            requestContext.setQueryParam("stream", ObjectSerializer.serialize(stream, "string", ""));
        }
        if (streamId !== undefined) {
            requestContext.setQueryParam("stream_id", ObjectSerializer.serialize(streamId, "number", ""));
        }
        if (topic !== undefined) {
            requestContext.setQueryParam("topic", ObjectSerializer.serialize(topic, "string", ""));
        }
        if (op !== undefined) {
            requestContext.setQueryParam("op", ObjectSerializer.serialize(op, "'add' | 'remove'", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Subscribe one or more users to one or more streams.  `POST {{ api_url }}/v1/users/me/subscriptions`  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like `invite_only` detailed below. 
     * Subscribe to a stream
     * @param subscriptions A list of dictionaries containing the key &#x60;name&#x60; and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key &#x60;description&#x60; with an appropriate value. 
     * @param principals A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). 
     * @param authorizationErrorsFatal A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When &#x60;True&#x60;, an authorization error is reported as such. When set to &#x60;False&#x60;, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the &#x60;unauthorized&#x60; key. 
     * @param announce If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream&#39;s creation. 
     * @param inviteOnly As described above, this endpoint will create a new stream if passed a stream name that doesn&#39;t already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams. 
     * @param historyPublicToSubscribers Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. 
     * @param streamPostPolicy Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. 
     * @param messageRetentionDays Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
     */
    public async subscribe(subscriptions: Array<any>, principals?: Array<string | number>, authorizationErrorsFatal?: boolean, announce?: boolean, inviteOnly?: boolean, historyPublicToSubscribers?: boolean, streamPostPolicy?: number, messageRetentionDays?: string | number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'subscriptions' is not null or undefined
        if (subscriptions === null || subscriptions === undefined) {
            throw new RequiredError('Required parameter subscriptions was null or undefined when calling subscribe.');
        }









        // Path Params
        const localVarPath = '/users/me/subscriptions';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (subscriptions !== undefined) {
            requestContext.setQueryParam("subscriptions", ObjectSerializer.serialize(subscriptions, "Array<any>", ""));
        }
        if (principals !== undefined) {
            requestContext.setQueryParam("principals", ObjectSerializer.serialize(principals, "Array<string | number>", ""));
        }
        if (authorizationErrorsFatal !== undefined) {
            requestContext.setQueryParam("authorization_errors_fatal", ObjectSerializer.serialize(authorizationErrorsFatal, "boolean", ""));
        }
        if (announce !== undefined) {
            requestContext.setQueryParam("announce", ObjectSerializer.serialize(announce, "boolean", ""));
        }
        if (inviteOnly !== undefined) {
            requestContext.setQueryParam("invite_only", ObjectSerializer.serialize(inviteOnly, "boolean", ""));
        }
        if (historyPublicToSubscribers !== undefined) {
            requestContext.setQueryParam("history_public_to_subscribers", ObjectSerializer.serialize(historyPublicToSubscribers, "boolean", ""));
        }
        if (streamPostPolicy !== undefined) {
            requestContext.setQueryParam("stream_post_policy", ObjectSerializer.serialize(streamPostPolicy, "number", ""));
        }
        if (messageRetentionDays !== undefined) {
            requestContext.setQueryParam("message_retention_days", ObjectSerializer.serialize(messageRetentionDays, "string | number", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Unsubscribe yourself or other users from one or more streams.  `DELETE {{ api_url }}/v1/users/me/subscriptions` 
     * Unsubscribe from a stream
     * @param subscriptions A list of stream names to unsubscribe from. This parameter is called &#x60;streams&#x60; in our Python API. 
     * @param principals A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). 
     */
    public async unsubscribe(subscriptions: Array<string>, principals?: Array<string | number>, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'subscriptions' is not null or undefined
        if (subscriptions === null || subscriptions === undefined) {
            throw new RequiredError('Required parameter subscriptions was null or undefined when calling unsubscribe.');
        }



        // Path Params
        const localVarPath = '/users/me/subscriptions';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (subscriptions !== undefined) {
            requestContext.setQueryParam("subscriptions", ObjectSerializer.serialize(subscriptions, "Array<string>", ""));
        }
        if (principals !== undefined) {
            requestContext.setQueryParam("principals", ObjectSerializer.serialize(principals, "Array<string | number>", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Configure the stream with the ID `stream_id`.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  `PATCH {{ api_url }}/v1/streams/{stream_id}` 
     * Update a stream
     * @param streamId The ID of the stream to access. 
     * @param description The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). 
     * @param newName The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). 
     * @param isPrivate Change whether the stream is a private stream. 
     * @param isAnnouncementOnly Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   &#x60;stream_post_policy&#x60; instead. 
     * @param streamPostPolicy Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. 
     * @param historyPublicToSubscribers Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. 
     * @param messageRetentionDays Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
     */
    public async updateStream(streamId: number, description?: string, newName?: string, isPrivate?: boolean, isAnnouncementOnly?: boolean, streamPostPolicy?: number, historyPublicToSubscribers?: boolean, messageRetentionDays?: string | number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'streamId' is not null or undefined
        if (streamId === null || streamId === undefined) {
            throw new RequiredError('Required parameter streamId was null or undefined when calling updateStream.');
        }









        // Path Params
        const localVarPath = '/streams/{stream_id}'
            .replace('{' + 'stream_id' + '}', encodeURIComponent(String(streamId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PATCH);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (description !== undefined) {
            requestContext.setQueryParam("description", ObjectSerializer.serialize(description, "string", ""));
        }
        if (newName !== undefined) {
            requestContext.setQueryParam("new_name", ObjectSerializer.serialize(newName, "string", ""));
        }
        if (isPrivate !== undefined) {
            requestContext.setQueryParam("is_private", ObjectSerializer.serialize(isPrivate, "boolean", ""));
        }
        if (isAnnouncementOnly !== undefined) {
            requestContext.setQueryParam("is_announcement_only", ObjectSerializer.serialize(isAnnouncementOnly, "boolean", ""));
        }
        if (streamPostPolicy !== undefined) {
            requestContext.setQueryParam("stream_post_policy", ObjectSerializer.serialize(streamPostPolicy, "number", ""));
        }
        if (historyPublicToSubscribers !== undefined) {
            requestContext.setQueryParam("history_public_to_subscribers", ObjectSerializer.serialize(historyPublicToSubscribers, "boolean", ""));
        }
        if (messageRetentionDays !== undefined) {
            requestContext.setQueryParam("message_retention_days", ObjectSerializer.serialize(messageRetentionDays, "string | number", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * This endpoint is used to update the user's personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  `POST {{ api_url }}/v1/users/me/subscriptions/properties` 
     * Update subscription settings
     * @param subscriptionData A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a &#x60;stream_id&#x60; key that identifies the stream, as well as the &#x60;property&#x60; being modified and its new &#x60;value&#x60;.  The possible values for each &#x60;property&#x60; and &#x60;value&#x60; pairs are:  * &#x60;color&#x60; (string): the hex value of the user&#39;s display color for the stream. * &#x60;is_muted&#x60; (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named &#x60;in_home_view&#x60; (with the   opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;); for   backwards-compatibility, modern Zulip still accepts that value. * &#x60;pin_to_top&#x60; (boolean): whether to pin the stream at the top of the stream list. * &#x60;desktop_notifications&#x60; (boolean): whether to show desktop notifications     for all messages sent to the stream. * &#x60;audible_notifications&#x60; (boolean): whether to play a sound   notification for all messages sent to the stream. * &#x60;push_notifications&#x60; (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * &#x60;email_notifications&#x60; (boolean): whether to trigger an email     notification for all messages sent to the stream. 
     */
    public async updateSubscriptionSettings(subscriptionData: Array<any>, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'subscriptionData' is not null or undefined
        if (subscriptionData === null || subscriptionData === undefined) {
            throw new RequiredError('Required parameter subscriptionData was null or undefined when calling updateSubscriptionSettings.');
        }


        // Path Params
        const localVarPath = '/users/me/subscriptions/properties';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (subscriptionData !== undefined) {
            requestContext.setQueryParam("subscription_data", ObjectSerializer.serialize(subscriptionData, "Array<any>", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Update which streams you are are subscribed to. 
     * Update subscriptions
     * @param _delete A list of stream names to unsubscribe from. 
     * @param add A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description. 
     */
    public async updateSubscriptions(_delete?: Array<string>, add?: Array<any>, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;



        // Path Params
        const localVarPath = '/users/me/subscriptions';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PATCH);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (_delete !== undefined) {
            requestContext.setQueryParam("delete", ObjectSerializer.serialize(_delete, "Array<string>", ""));
        }
        if (add !== undefined) {
            requestContext.setQueryParam("add", ObjectSerializer.serialize(add, "Array<any>", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

}

export class StreamsApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to archiveStream
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async archiveStream(response: ResponseContext): Promise<JsonSuccess > {
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
     * @params response Response returned by the server for a request to createBigBlueButtonVideoCall
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async createBigBlueButtonVideoCall(response: ResponseContext): Promise<JsonSuccessBase > {
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
     * @params response Response returned by the server for a request to getStreamId
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getStreamId(response: ResponseContext): Promise<JsonSuccessBase > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
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
     * @params response Response returned by the server for a request to getStreamTopics
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getStreamTopics(response: ResponseContext): Promise<JsonSuccessBase > {
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
     * @params response Response returned by the server for a request to getStreams
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getStreams(response: ResponseContext): Promise<JsonSuccessBase > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
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
     * @params response Response returned by the server for a request to getSubscriptionStatus
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getSubscriptionStatus(response: ResponseContext): Promise<JsonSuccessBase > {
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
     * @params response Response returned by the server for a request to getSubscriptions
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getSubscriptions(response: ResponseContext): Promise<JsonSuccessBase > {
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
     * @params response Response returned by the server for a request to muteTopic
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async muteTopic(response: ResponseContext): Promise<JsonSuccess > {
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
     * @params response Response returned by the server for a request to subscribe
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async subscribe(response: ResponseContext): Promise<AddSubscriptionsResponse > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: AddSubscriptionsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "AddSubscriptionsResponse", ""
            ) as AddSubscriptionsResponse;
            return body;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: AddSubscriptionsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "AddSubscriptionsResponse", ""
            ) as AddSubscriptionsResponse;
            throw new ApiException<AddSubscriptionsResponse>(400, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: AddSubscriptionsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "AddSubscriptionsResponse", ""
            ) as AddSubscriptionsResponse;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to unsubscribe
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async unsubscribe(response: ResponseContext): Promise<JsonSuccessBase > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: NonExistingStreamError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "NonExistingStreamError", ""
            ) as NonExistingStreamError;
            throw new ApiException<NonExistingStreamError>(400, body);
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
     * @params response Response returned by the server for a request to updateStream
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async updateStream(response: ResponseContext): Promise<JsonSuccess > {
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
     * @params response Response returned by the server for a request to updateSubscriptionSettings
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async updateSubscriptionSettings(response: ResponseContext): Promise<JsonSuccessBase > {
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
     * @params response Response returned by the server for a request to updateSubscriptions
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async updateSubscriptions(response: ResponseContext): Promise<JsonSuccessBase > {
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

}
