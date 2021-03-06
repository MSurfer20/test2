/**
 * Zulip REST API
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import * as models from '../model/models';

/* tslint:disable:no-unused-variable member-ordering */

export class StreamsApi {
    protected basePath = 'https://example.zulipchat.com/api/v1';
    public defaultHeaders : any = {};

    static $inject: string[] = ['$http', '$httpParamSerializer', 'basePath'];

    constructor(protected $http: ng.IHttpService, protected $httpParamSerializer?: (d: any) => any, basePath?: string) {
        if (basePath !== undefined) {
            this.basePath = basePath;
        }
    }

    /**
     * [Archive the stream](/help/archive-a-stream) with the ID `stream_id`.  `DELETE {{ api_url }}/v1/streams/{stream_id}` 
     * @summary Archive a stream
     * @param streamId The ID of the stream to access. 
     */
    public archiveStream (streamId: number, extraHttpRequestParams?: any ) : ng.IHttpPromise<models.models.JsonSuccess> {
        const localVarPath = this.basePath + '/streams/{stream_id}'
            .replace('{' + 'stream_id' + '}', encodeURIComponent(String(streamId)));

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'streamId' is not null or undefined
        if (streamId === null || streamId === undefined) {
            throw new Error('Required parameter streamId was null or undefined when calling archiveStream.');
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'DELETE',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 
     * @summary Create BigBlueButton video call
     */
    public createBigBlueButtonVideoCall (extraHttpRequestParams?: any ) : ng.IHttpPromise<models.models.JsonSuccessBase & object> {
        const localVarPath = this.basePath + '/calls/bigbluebutton/create';

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let httpRequestParams: ng.IRequestConfig = {
            method: 'GET',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * Delete all messages in a topic.  `POST {{ api_url }}/v1/streams/{stream_id}/delete_topic`  Topics are a field on messages (not an independent data structure), so deleting all the messages in the topic deletes the topic from Zulip. 
     * @summary Delete a topic
     * @param streamId The ID of the stream to access. 
     * @param topicName The name of the topic to delete. 
     */
    public deleteTopic (streamId: number, topicName: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<models.models.JsonSuccess> {
        const localVarPath = this.basePath + '/streams/{stream_id}/delete_topic'
            .replace('{' + 'stream_id' + '}', encodeURIComponent(String(streamId)));

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'streamId' is not null or undefined
        if (streamId === null || streamId === undefined) {
            throw new Error('Required parameter streamId was null or undefined when calling deleteTopic.');
        }

        // verify required parameter 'topicName' is not null or undefined
        if (topicName === null || topicName === undefined) {
            throw new Error('Required parameter topicName was null or undefined when calling deleteTopic.');
        }

        if (topicName !== undefined) {
            queryParameters['topic_name'] = topicName;
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'POST',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id` 
     * @summary Get stream ID
     * @param stream The name of the stream to access. 
     */
    public getStreamId (stream: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<models.models.JsonSuccessBase & object> {
        const localVarPath = this.basePath + '/get_stream_id';

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'stream' is not null or undefined
        if (stream === null || stream === undefined) {
            throw new Error('Required parameter stream was null or undefined when calling getStreamId.');
        }

        if (stream !== undefined) {
            queryParameters['stream'] = stream;
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'GET',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * Get all the topics in a specific stream  `GET {{ api_url }}/v1/users/me/{stream_id}/topics` 
     * @summary Get topics in a stream
     * @param streamId The ID of the stream to access. 
     */
    public getStreamTopics (streamId: number, extraHttpRequestParams?: any ) : ng.IHttpPromise<models.models.JsonSuccessBase & object> {
        const localVarPath = this.basePath + '/users/me/{stream_id}/topics'
            .replace('{' + 'stream_id' + '}', encodeURIComponent(String(streamId)));

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'streamId' is not null or undefined
        if (streamId === null || streamId === undefined) {
            throw new Error('Required parameter streamId was null or undefined when calling getStreamTopics.');
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'GET',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * Get all streams that the user has access to.  `GET {{ api_url }}/v1/streams` 
     * @summary Get all streams
     * @param includePublic Include all public streams. 
     * @param includeWebPublic Include all web public streams. 
     * @param includeSubscribed Include all streams that the user is subscribed to. 
     * @param includeAllActive Include all active streams. The user must have administrative privileges to use this parameter. 
     * @param includeDefault Include all default streams for the user\&#39;s realm. 
     * @param includeOwnerSubscribed If the user is a bot, include all streams that the bot\&#39;s owner is subscribed to. 
     */
    public getStreams (includePublic?: boolean, includeWebPublic?: boolean, includeSubscribed?: boolean, includeAllActive?: boolean, includeDefault?: boolean, includeOwnerSubscribed?: boolean, extraHttpRequestParams?: any ) : ng.IHttpPromise<models.models.JsonSuccessBase & object> {
        const localVarPath = this.basePath + '/streams';

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        if (includePublic !== undefined) {
            queryParameters['include_public'] = includePublic;
        }

        if (includeWebPublic !== undefined) {
            queryParameters['include_web_public'] = includeWebPublic;
        }

        if (includeSubscribed !== undefined) {
            queryParameters['include_subscribed'] = includeSubscribed;
        }

        if (includeAllActive !== undefined) {
            queryParameters['include_all_active'] = includeAllActive;
        }

        if (includeDefault !== undefined) {
            queryParameters['include_default'] = includeDefault;
        }

        if (includeOwnerSubscribed !== undefined) {
            queryParameters['include_owner_subscribed'] = includeOwnerSubscribed;
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'GET',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * Get all users subscribed to a stream.  `Get {{ api_url }}/v1/streams/{stream_id}/members` 
     * @summary Get the subscribers of a stream
     * @param streamId The ID of the stream to access. 
     */
    public getSubscribers (streamId: number, extraHttpRequestParams?: any ) : ng.IHttpPromise<models.models.JsonSuccessBase & object> {
        const localVarPath = this.basePath + '/streams/{stream_id}/members'
            .replace('{' + 'stream_id' + '}', encodeURIComponent(String(streamId)));

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'streamId' is not null or undefined
        if (streamId === null || streamId === undefined) {
            throw new Error('Required parameter streamId was null or undefined when calling getSubscribers.');
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'GET',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * Check whether a user is subscribed to a stream.  `GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`  **Changes**: New in Zulip 3.0 (feature level 11). 
     * @summary Get subscription status
     * @param userId The target user\&#39;s ID. 
     * @param streamId The ID of the stream to access. 
     */
    public getSubscriptionStatus (userId: number, streamId: number, extraHttpRequestParams?: any ) : ng.IHttpPromise<models.models.JsonSuccessBase & object> {
        const localVarPath = this.basePath + '/users/{user_id}/subscriptions/{stream_id}'
            .replace('{' + 'user_id' + '}', encodeURIComponent(String(userId)))
            .replace('{' + 'stream_id' + '}', encodeURIComponent(String(streamId)));

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'userId' is not null or undefined
        if (userId === null || userId === undefined) {
            throw new Error('Required parameter userId was null or undefined when calling getSubscriptionStatus.');
        }

        // verify required parameter 'streamId' is not null or undefined
        if (streamId === null || streamId === undefined) {
            throw new Error('Required parameter streamId was null or undefined when calling getSubscriptionStatus.');
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'GET',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * Get all streams that the user is subscribed to.  `GET {{ api_url }}/v1/users/me/subscriptions` 
     * @summary Get subscribed streams
     * @param includeSubscribers Whether each returned stream object should include a &#x60;subscribers&#x60; field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0. 
     */
    public getSubscriptions (includeSubscribers?: boolean, extraHttpRequestParams?: any ) : ng.IHttpPromise<models.models.JsonSuccessBase & object> {
        const localVarPath = this.basePath + '/users/me/subscriptions';

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        if (includeSubscribers !== undefined) {
            queryParameters['include_subscribers'] = includeSubscribers;
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'GET',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user\'s unread count totals.  `PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics` 
     * @summary Topic muting
     * @param topic The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic. 
     * @param op Whether to mute (&#x60;add&#x60;) or unmute (&#x60;remove&#x60;) the provided topic. 
     * @param stream The name of the stream to access. 
     * @param streamId The ID of the stream to access. 
     */
    public muteTopic (topic: string, op: 'add' | 'remove', stream?: string, streamId?: number, extraHttpRequestParams?: any ) : ng.IHttpPromise<models.models.JsonSuccess> {
        const localVarPath = this.basePath + '/users/me/subscriptions/muted_topics';

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'topic' is not null or undefined
        if (topic === null || topic === undefined) {
            throw new Error('Required parameter topic was null or undefined when calling muteTopic.');
        }

        // verify required parameter 'op' is not null or undefined
        if (op === null || op === undefined) {
            throw new Error('Required parameter op was null or undefined when calling muteTopic.');
        }

        if (stream !== undefined) {
            queryParameters['stream'] = stream;
        }

        if (streamId !== undefined) {
            queryParameters['stream_id'] = streamId;
        }

        if (topic !== undefined) {
            queryParameters['topic'] = topic;
        }

        if (op !== undefined) {
            queryParameters['op'] = op;
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'PATCH',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * Subscribe one or more users to one or more streams.  `POST {{ api_url }}/v1/users/me/subscriptions`  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like `invite_only` detailed below. 
     * @summary Subscribe to a stream
     * @param subscriptions A list of dictionaries containing the key &#x60;name&#x60; and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key &#x60;description&#x60; with an appropriate value. 
     * @param principals A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). 
     * @param authorizationErrorsFatal A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When &#x60;True&#x60;, an authorization error is reported as such. When set to &#x60;False&#x60;, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the &#x60;unauthorized&#x60; key. 
     * @param announce If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream\&#39;s creation. 
     * @param inviteOnly As described above, this endpoint will create a new stream if passed a stream name that doesn\&#39;t already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams. 
     * @param historyPublicToSubscribers Whether the stream\&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. 
     * @param streamPostPolicy Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. 
     * @param messageRetentionDays Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
     */
    public subscribe (subscriptions: Array<object>, principals?: Array<models.string | number>, authorizationErrorsFatal?: boolean, announce?: boolean, inviteOnly?: boolean, historyPublicToSubscribers?: boolean, streamPostPolicy?: number, messageRetentionDays?: models.string | number, extraHttpRequestParams?: any ) : ng.IHttpPromise<models.models.models.AddSubscriptionsResponse> {
        const localVarPath = this.basePath + '/users/me/subscriptions';

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'subscriptions' is not null or undefined
        if (subscriptions === null || subscriptions === undefined) {
            throw new Error('Required parameter subscriptions was null or undefined when calling subscribe.');
        }

        if (subscriptions !== undefined) {
            queryParameters['subscriptions'] = subscriptions;
        }

        if (principals !== undefined) {
            queryParameters['principals'] = principals;
        }

        if (authorizationErrorsFatal !== undefined) {
            queryParameters['authorization_errors_fatal'] = authorizationErrorsFatal;
        }

        if (announce !== undefined) {
            queryParameters['announce'] = announce;
        }

        if (inviteOnly !== undefined) {
            queryParameters['invite_only'] = inviteOnly;
        }

        if (historyPublicToSubscribers !== undefined) {
            queryParameters['history_public_to_subscribers'] = historyPublicToSubscribers;
        }

        if (streamPostPolicy !== undefined) {
            queryParameters['stream_post_policy'] = streamPostPolicy;
        }

        if (messageRetentionDays !== undefined) {
            queryParameters['message_retention_days'] = messageRetentionDays;
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'POST',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * Unsubscribe yourself or other users from one or more streams.  `DELETE {{ api_url }}/v1/users/me/subscriptions` 
     * @summary Unsubscribe from a stream
     * @param subscriptions A list of stream names to unsubscribe from. This parameter is called &#x60;streams&#x60; in our Python API. 
     * @param principals A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). 
     */
    public unsubscribe (subscriptions: Array<string>, principals?: Array<models.string | number>, extraHttpRequestParams?: any ) : ng.IHttpPromise<models.models.JsonSuccessBase & object> {
        const localVarPath = this.basePath + '/users/me/subscriptions';

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'subscriptions' is not null or undefined
        if (subscriptions === null || subscriptions === undefined) {
            throw new Error('Required parameter subscriptions was null or undefined when calling unsubscribe.');
        }

        if (subscriptions !== undefined) {
            queryParameters['subscriptions'] = subscriptions;
        }

        if (principals !== undefined) {
            queryParameters['principals'] = principals;
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'DELETE',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * Configure the stream with the ID `stream_id`.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  `PATCH {{ api_url }}/v1/streams/{stream_id}` 
     * @summary Update a stream
     * @param streamId The ID of the stream to access. 
     * @param description The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). 
     * @param newName The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). 
     * @param isPrivate Change whether the stream is a private stream. 
     * @param isAnnouncementOnly Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   &#x60;stream_post_policy&#x60; instead. 
     * @param streamPostPolicy Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. 
     * @param historyPublicToSubscribers Whether the stream\&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. 
     * @param messageRetentionDays Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
     */
    public updateStream (streamId: number, description?: string, newName?: string, isPrivate?: boolean, isAnnouncementOnly?: boolean, streamPostPolicy?: number, historyPublicToSubscribers?: boolean, messageRetentionDays?: models.string | number, extraHttpRequestParams?: any ) : ng.IHttpPromise<models.models.JsonSuccess> {
        const localVarPath = this.basePath + '/streams/{stream_id}'
            .replace('{' + 'stream_id' + '}', encodeURIComponent(String(streamId)));

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'streamId' is not null or undefined
        if (streamId === null || streamId === undefined) {
            throw new Error('Required parameter streamId was null or undefined when calling updateStream.');
        }

        if (description !== undefined) {
            queryParameters['description'] = description;
        }

        if (newName !== undefined) {
            queryParameters['new_name'] = newName;
        }

        if (isPrivate !== undefined) {
            queryParameters['is_private'] = isPrivate;
        }

        if (isAnnouncementOnly !== undefined) {
            queryParameters['is_announcement_only'] = isAnnouncementOnly;
        }

        if (streamPostPolicy !== undefined) {
            queryParameters['stream_post_policy'] = streamPostPolicy;
        }

        if (historyPublicToSubscribers !== undefined) {
            queryParameters['history_public_to_subscribers'] = historyPublicToSubscribers;
        }

        if (messageRetentionDays !== undefined) {
            queryParameters['message_retention_days'] = messageRetentionDays;
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'PATCH',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * This endpoint is used to update the user\'s personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  `POST {{ api_url }}/v1/users/me/subscriptions/properties` 
     * @summary Update subscription settings
     * @param subscriptionData A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a &#x60;stream_id&#x60; key that identifies the stream, as well as the &#x60;property&#x60; being modified and its new &#x60;value&#x60;.  The possible values for each &#x60;property&#x60; and &#x60;value&#x60; pairs are:  * &#x60;color&#x60; (string): the hex value of the user\&#39;s display color for the stream. * &#x60;is_muted&#x60; (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named &#x60;in_home_view&#x60; (with the   opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;); for   backwards-compatibility, modern Zulip still accepts that value. * &#x60;pin_to_top&#x60; (boolean): whether to pin the stream at the top of the stream list. * &#x60;desktop_notifications&#x60; (boolean): whether to show desktop notifications     for all messages sent to the stream. * &#x60;audible_notifications&#x60; (boolean): whether to play a sound   notification for all messages sent to the stream. * &#x60;push_notifications&#x60; (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * &#x60;email_notifications&#x60; (boolean): whether to trigger an email     notification for all messages sent to the stream. 
     */
    public updateSubscriptionSettings (subscriptionData: Array<object>, extraHttpRequestParams?: any ) : ng.IHttpPromise<models.models.JsonSuccessBase & object> {
        const localVarPath = this.basePath + '/users/me/subscriptions/properties';

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'subscriptionData' is not null or undefined
        if (subscriptionData === null || subscriptionData === undefined) {
            throw new Error('Required parameter subscriptionData was null or undefined when calling updateSubscriptionSettings.');
        }

        if (subscriptionData !== undefined) {
            queryParameters['subscription_data'] = subscriptionData;
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'POST',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * Update which streams you are are subscribed to. 
     * @summary Update subscriptions
     * @param _delete A list of stream names to unsubscribe from. 
     * @param add A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description. 
     */
    public updateSubscriptions (_delete?: Array<string>, add?: Array<object>, extraHttpRequestParams?: any ) : ng.IHttpPromise<models.models.JsonSuccessBase & object> {
        const localVarPath = this.basePath + '/users/me/subscriptions';

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        if (_delete !== undefined) {
            queryParameters['delete'] = _delete;
        }

        if (add !== undefined) {
            queryParameters['add'] = add;
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'PATCH',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
}
