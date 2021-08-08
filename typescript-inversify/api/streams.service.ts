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
/* tslint:disable:no-unused-variable member-ordering */

import { Observable } from 'rxjs/Observable';

import { map } from 'rxjs/operators';
import IHttpClient from '../IHttpClient';
import { inject, injectable } from 'inversify';
import { IAPIConfiguration } from '../IAPIConfiguration';
import { Headers } from '../Headers';
import HttpResponse from '../HttpResponse';

import { AddSubscriptionsResponse } from '../model/addSubscriptionsResponse';
import { CodedError } from '../model/codedError';
import { JsonError } from '../model/jsonError';
import { JsonSuccess } from '../model/jsonSuccess';
import { JsonSuccessBase } from '../model/jsonSuccessBase';
import { NonExistingStreamError } from '../model/nonExistingStreamError';

import { COLLECTION_FORMATS }  from '../variables';



@injectable()
export class StreamsService {
    private basePath: string = 'https://example.zulipchat.com/api/v1';

    constructor(@inject('IApiHttpClient') private httpClient: IHttpClient,
        @inject('IAPIConfiguration') private APIConfiguration: IAPIConfiguration ) {
        if(this.APIConfiguration.basePath)
            this.basePath = this.APIConfiguration.basePath;
    }

    /**
     * Archive a stream
     * [Archive the stream](/help/archive-a-stream) with the ID &#x60;stream_id&#x60;.  &#x60;DELETE {{ api_url }}/v1/streams/{stream_id}&#x60; 
     * @param streamId The ID of the stream to access. 
     
     */
    public archiveStream(streamId: number, observe?: 'body', headers?: Headers): Observable<JsonSuccess>;
    public archiveStream(streamId: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<JsonSuccess>>;
    public archiveStream(streamId: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (streamId === null || streamId === undefined){
            throw new Error('Required parameter streamId was null or undefined when calling archiveStream.');
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<JsonSuccess>> = this.httpClient.delete(`${this.basePath}/streams/${encodeURIComponent(String(streamId))}`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <JsonSuccess>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * Create BigBlueButton video call
     * Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 
     
     */
    public createBigBlueButtonVideoCall(observe?: 'body', headers?: Headers): Observable<JsonSuccessBase & object>;
    public createBigBlueButtonVideoCall(observe?: 'response', headers?: Headers): Observable<HttpResponse<JsonSuccessBase & object>>;
    public createBigBlueButtonVideoCall(observe: any = 'body', headers: Headers = {}): Observable<any> {
        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<JsonSuccessBase & object>> = this.httpClient.get(`${this.basePath}/calls/bigbluebutton/create`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <JsonSuccessBase & object>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * Get stream ID
     * Get the unique ID of a given stream.  &#x60;GET {{ api_url }}/v1/get_stream_id&#x60; 
     * @param stream The name of the stream to access. 
     
     */
    public getStreamId(stream: string, observe?: 'body', headers?: Headers): Observable<JsonSuccessBase & object>;
    public getStreamId(stream: string, observe?: 'response', headers?: Headers): Observable<HttpResponse<JsonSuccessBase & object>>;
    public getStreamId(stream: string, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (stream === null || stream === undefined){
            throw new Error('Required parameter stream was null or undefined when calling getStreamId.');
        }

        let queryParameters: string[] = [];
        if (stream !== undefined) {
            queryParameters.push('stream='+encodeURIComponent(String(stream)));
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<JsonSuccessBase & object>> = this.httpClient.get(`${this.basePath}/get_stream_id?${queryParameters.join('&')}`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <JsonSuccessBase & object>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * Get topics in a stream
     * Get all the topics in a specific stream  &#x60;GET {{ api_url }}/v1/users/me/{stream_id}/topics&#x60; 
     * @param streamId The ID of the stream to access. 
     
     */
    public getStreamTopics(streamId: number, observe?: 'body', headers?: Headers): Observable<JsonSuccessBase & object>;
    public getStreamTopics(streamId: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<JsonSuccessBase & object>>;
    public getStreamTopics(streamId: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (streamId === null || streamId === undefined){
            throw new Error('Required parameter streamId was null or undefined when calling getStreamTopics.');
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<JsonSuccessBase & object>> = this.httpClient.get(`${this.basePath}/users/me/${encodeURIComponent(String(streamId))}/topics`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <JsonSuccessBase & object>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * Get all streams
     * Get all streams that the user has access to.  &#x60;GET {{ api_url }}/v1/streams&#x60; 
     * @param includePublic Include all public streams. 
     * @param includeWebPublic Include all web public streams. 
     * @param includeSubscribed Include all streams that the user is subscribed to. 
     * @param includeAllActive Include all active streams. The user must have administrative privileges to use this parameter. 
     * @param includeDefault Include all default streams for the user\&#39;s realm. 
     * @param includeOwnerSubscribed If the user is a bot, include all streams that the bot\&#39;s owner is subscribed to. 
     
     */
    public getStreams(includePublic?: boolean, includeWebPublic?: boolean, includeSubscribed?: boolean, includeAllActive?: boolean, includeDefault?: boolean, includeOwnerSubscribed?: boolean, observe?: 'body', headers?: Headers): Observable<JsonSuccessBase & object>;
    public getStreams(includePublic?: boolean, includeWebPublic?: boolean, includeSubscribed?: boolean, includeAllActive?: boolean, includeDefault?: boolean, includeOwnerSubscribed?: boolean, observe?: 'response', headers?: Headers): Observable<HttpResponse<JsonSuccessBase & object>>;
    public getStreams(includePublic?: boolean, includeWebPublic?: boolean, includeSubscribed?: boolean, includeAllActive?: boolean, includeDefault?: boolean, includeOwnerSubscribed?: boolean, observe: any = 'body', headers: Headers = {}): Observable<any> {
        let queryParameters: string[] = [];
        if (includePublic !== undefined) {
            queryParameters.push('includePublic='+encodeURIComponent(String(includePublic)));
        }
        if (includeWebPublic !== undefined) {
            queryParameters.push('includeWebPublic='+encodeURIComponent(String(includeWebPublic)));
        }
        if (includeSubscribed !== undefined) {
            queryParameters.push('includeSubscribed='+encodeURIComponent(String(includeSubscribed)));
        }
        if (includeAllActive !== undefined) {
            queryParameters.push('includeAllActive='+encodeURIComponent(String(includeAllActive)));
        }
        if (includeDefault !== undefined) {
            queryParameters.push('includeDefault='+encodeURIComponent(String(includeDefault)));
        }
        if (includeOwnerSubscribed !== undefined) {
            queryParameters.push('includeOwnerSubscribed='+encodeURIComponent(String(includeOwnerSubscribed)));
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<JsonSuccessBase & object>> = this.httpClient.get(`${this.basePath}/streams?${queryParameters.join('&')}`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <JsonSuccessBase & object>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * Get subscription status
     * Check whether a user is subscribed to a stream.  &#x60;GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}&#x60;  **Changes**: New in Zulip 3.0 (feature level 11). 
     * @param userId The target user\&#39;s ID. 
     * @param streamId The ID of the stream to access. 
     
     */
    public getSubscriptionStatus(userId: number, streamId: number, observe?: 'body', headers?: Headers): Observable<JsonSuccessBase & object>;
    public getSubscriptionStatus(userId: number, streamId: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<JsonSuccessBase & object>>;
    public getSubscriptionStatus(userId: number, streamId: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (userId === null || userId === undefined){
            throw new Error('Required parameter userId was null or undefined when calling getSubscriptionStatus.');
        }

        if (streamId === null || streamId === undefined){
            throw new Error('Required parameter streamId was null or undefined when calling getSubscriptionStatus.');
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<JsonSuccessBase & object>> = this.httpClient.get(`${this.basePath}/users/${encodeURIComponent(String(userId))}/subscriptions/${encodeURIComponent(String(streamId))}`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <JsonSuccessBase & object>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * Get subscribed streams
     * Get all streams that the user is subscribed to.  &#x60;GET {{ api_url }}/v1/users/me/subscriptions&#x60; 
     * @param includeSubscribers Whether each returned stream object should include a &#x60;subscribers&#x60; field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0. 
     
     */
    public getSubscriptions(includeSubscribers?: boolean, observe?: 'body', headers?: Headers): Observable<JsonSuccessBase & object>;
    public getSubscriptions(includeSubscribers?: boolean, observe?: 'response', headers?: Headers): Observable<HttpResponse<JsonSuccessBase & object>>;
    public getSubscriptions(includeSubscribers?: boolean, observe: any = 'body', headers: Headers = {}): Observable<any> {
        let queryParameters: string[] = [];
        if (includeSubscribers !== undefined) {
            queryParameters.push('includeSubscribers='+encodeURIComponent(String(includeSubscribers)));
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<JsonSuccessBase & object>> = this.httpClient.get(`${this.basePath}/users/me/subscriptions?${queryParameters.join('&')}`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <JsonSuccessBase & object>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * Topic muting
     * This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user\&#39;s unread count totals.  &#x60;PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics&#x60; 
     * @param topic The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic. 
     * @param op Whether to mute (&#x60;add&#x60;) or unmute (&#x60;remove&#x60;) the provided topic. 
     * @param stream The name of the stream to access. 
     * @param streamId The ID of the stream to access. 
     
     */
    public muteTopic(topic: string, op: 'add' | 'remove', stream?: string, streamId?: number, observe?: 'body', headers?: Headers): Observable<JsonSuccess>;
    public muteTopic(topic: string, op: 'add' | 'remove', stream?: string, streamId?: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<JsonSuccess>>;
    public muteTopic(topic: string, op: 'add' | 'remove', stream?: string, streamId?: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (topic === null || topic === undefined){
            throw new Error('Required parameter topic was null or undefined when calling muteTopic.');
        }

        if (op === null || op === undefined){
            throw new Error('Required parameter op was null or undefined when calling muteTopic.');
        }

        let queryParameters: string[] = [];
        if (stream !== undefined) {
            queryParameters.push('stream='+encodeURIComponent(String(stream)));
        }
        if (streamId !== undefined) {
            queryParameters.push('streamId='+encodeURIComponent(String(streamId)));
        }
        if (topic !== undefined) {
            queryParameters.push('topic='+encodeURIComponent(String(topic)));
        }
        if (op !== undefined) {
            queryParameters.push('op='+encodeURIComponent(String(op)));
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<JsonSuccess>> = this.httpClient.patch(`${this.basePath}/users/me/subscriptions/muted_topics?${queryParameters.join('&')}`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <JsonSuccess>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * Subscribe to a stream
     * Subscribe one or more users to one or more streams.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions&#x60;  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like &#x60;invite_only&#x60; detailed below. 
     * @param subscriptions A list of dictionaries containing the key &#x60;name&#x60; and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key &#x60;description&#x60; with an appropriate value. 
     * @param principals A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). 
     * @param authorizationErrorsFatal A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When &#x60;True&#x60;, an authorization error is reported as such. When set to &#x60;False&#x60;, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the &#x60;unauthorized&#x60; key. 
     * @param announce If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream\&#39;s creation. 
     * @param inviteOnly As described above, this endpoint will create a new stream if passed a stream name that doesn\&#39;t already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams. 
     * @param historyPublicToSubscribers Whether the stream\&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. 
     * @param streamPostPolicy Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. 
     * @param messageRetentionDays Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
     
     */
    public subscribe(subscriptions: Array<object>, principals?: Array<string | number>, authorizationErrorsFatal?: boolean, announce?: boolean, inviteOnly?: boolean, historyPublicToSubscribers?: boolean, streamPostPolicy?: number, messageRetentionDays?: string | number, observe?: 'body', headers?: Headers): Observable<AddSubscriptionsResponse>;
    public subscribe(subscriptions: Array<object>, principals?: Array<string | number>, authorizationErrorsFatal?: boolean, announce?: boolean, inviteOnly?: boolean, historyPublicToSubscribers?: boolean, streamPostPolicy?: number, messageRetentionDays?: string | number, observe?: 'response', headers?: Headers): Observable<HttpResponse<AddSubscriptionsResponse>>;
    public subscribe(subscriptions: Array<object>, principals?: Array<string | number>, authorizationErrorsFatal?: boolean, announce?: boolean, inviteOnly?: boolean, historyPublicToSubscribers?: boolean, streamPostPolicy?: number, messageRetentionDays?: string | number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (subscriptions === null || subscriptions === undefined){
            throw new Error('Required parameter subscriptions was null or undefined when calling subscribe.');
        }

        let queryParameters: string[] = [];
        if (subscriptions) {
            subscriptions.forEach((element) => {
                queryParameters.push('subscriptions='+encodeURIComponent(String(element)));
            })
        }
        if (principals) {
            principals.forEach((element) => {
                queryParameters.push('principals='+encodeURIComponent(String(element)));
            })
        }
        if (authorizationErrorsFatal !== undefined) {
            queryParameters.push('authorizationErrorsFatal='+encodeURIComponent(String(authorizationErrorsFatal)));
        }
        if (announce !== undefined) {
            queryParameters.push('announce='+encodeURIComponent(String(announce)));
        }
        if (inviteOnly !== undefined) {
            queryParameters.push('inviteOnly='+encodeURIComponent(String(inviteOnly)));
        }
        if (historyPublicToSubscribers !== undefined) {
            queryParameters.push('historyPublicToSubscribers='+encodeURIComponent(String(historyPublicToSubscribers)));
        }
        if (streamPostPolicy !== undefined) {
            queryParameters.push('streamPostPolicy='+encodeURIComponent(String(streamPostPolicy)));
        }
        if (messageRetentionDays !== undefined) {
            queryParameters.push('messageRetentionDays='+encodeURIComponent(String(messageRetentionDays)));
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<AddSubscriptionsResponse>> = this.httpClient.post(`${this.basePath}/users/me/subscriptions?${queryParameters.join('&')}`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <AddSubscriptionsResponse>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * Unsubscribe from a stream
     * Unsubscribe yourself or other users from one or more streams.  &#x60;DELETE {{ api_url }}/v1/users/me/subscriptions&#x60; 
     * @param subscriptions A list of stream names to unsubscribe from. This parameter is called &#x60;streams&#x60; in our Python API. 
     * @param principals A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). 
     
     */
    public unsubscribe(subscriptions: Array<string>, principals?: Array<string | number>, observe?: 'body', headers?: Headers): Observable<JsonSuccessBase & object>;
    public unsubscribe(subscriptions: Array<string>, principals?: Array<string | number>, observe?: 'response', headers?: Headers): Observable<HttpResponse<JsonSuccessBase & object>>;
    public unsubscribe(subscriptions: Array<string>, principals?: Array<string | number>, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (subscriptions === null || subscriptions === undefined){
            throw new Error('Required parameter subscriptions was null or undefined when calling unsubscribe.');
        }

        let queryParameters: string[] = [];
        if (subscriptions) {
            subscriptions.forEach((element) => {
                queryParameters.push('subscriptions='+encodeURIComponent(String(element)));
            })
        }
        if (principals) {
            principals.forEach((element) => {
                queryParameters.push('principals='+encodeURIComponent(String(element)));
            })
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<JsonSuccessBase & object>> = this.httpClient.delete(`${this.basePath}/users/me/subscriptions?${queryParameters.join('&')}`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <JsonSuccessBase & object>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * Update a stream
     * Configure the stream with the ID &#x60;stream_id&#x60;.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  &#x60;PATCH {{ api_url }}/v1/streams/{stream_id}&#x60; 
     * @param streamId The ID of the stream to access. 
     * @param description The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). 
     * @param newName The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). 
     * @param isPrivate Change whether the stream is a private stream. 
     * @param isAnnouncementOnly Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   &#x60;stream_post_policy&#x60; instead. 
     * @param streamPostPolicy Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. 
     * @param historyPublicToSubscribers Whether the stream\&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. 
     * @param messageRetentionDays Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
     
     */
    public updateStream(streamId: number, description?: string, newName?: string, isPrivate?: boolean, isAnnouncementOnly?: boolean, streamPostPolicy?: number, historyPublicToSubscribers?: boolean, messageRetentionDays?: string | number, observe?: 'body', headers?: Headers): Observable<JsonSuccess>;
    public updateStream(streamId: number, description?: string, newName?: string, isPrivate?: boolean, isAnnouncementOnly?: boolean, streamPostPolicy?: number, historyPublicToSubscribers?: boolean, messageRetentionDays?: string | number, observe?: 'response', headers?: Headers): Observable<HttpResponse<JsonSuccess>>;
    public updateStream(streamId: number, description?: string, newName?: string, isPrivate?: boolean, isAnnouncementOnly?: boolean, streamPostPolicy?: number, historyPublicToSubscribers?: boolean, messageRetentionDays?: string | number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (streamId === null || streamId === undefined){
            throw new Error('Required parameter streamId was null or undefined when calling updateStream.');
        }

        let queryParameters: string[] = [];
        if (description !== undefined) {
            queryParameters.push('description='+encodeURIComponent(String(description)));
        }
        if (newName !== undefined) {
            queryParameters.push('newName='+encodeURIComponent(String(newName)));
        }
        if (isPrivate !== undefined) {
            queryParameters.push('isPrivate='+encodeURIComponent(String(isPrivate)));
        }
        if (isAnnouncementOnly !== undefined) {
            queryParameters.push('isAnnouncementOnly='+encodeURIComponent(String(isAnnouncementOnly)));
        }
        if (streamPostPolicy !== undefined) {
            queryParameters.push('streamPostPolicy='+encodeURIComponent(String(streamPostPolicy)));
        }
        if (historyPublicToSubscribers !== undefined) {
            queryParameters.push('historyPublicToSubscribers='+encodeURIComponent(String(historyPublicToSubscribers)));
        }
        if (messageRetentionDays !== undefined) {
            queryParameters.push('messageRetentionDays='+encodeURIComponent(String(messageRetentionDays)));
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<JsonSuccess>> = this.httpClient.patch(`${this.basePath}/streams/${encodeURIComponent(String(streamId))}?${queryParameters.join('&')}`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <JsonSuccess>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * Update subscription settings
     * This endpoint is used to update the user\&#39;s personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions/properties&#x60; 
     * @param subscriptionData A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a &#x60;stream_id&#x60; key that identifies the stream, as well as the &#x60;property&#x60; being modified and its new &#x60;value&#x60;.  The possible values for each &#x60;property&#x60; and &#x60;value&#x60; pairs are:  * &#x60;color&#x60; (string): the hex value of the user\&#39;s display color for the stream. * &#x60;is_muted&#x60; (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named &#x60;in_home_view&#x60; (with the   opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;); for   backwards-compatibility, modern Zulip still accepts that value. * &#x60;pin_to_top&#x60; (boolean): whether to pin the stream at the top of the stream list. * &#x60;desktop_notifications&#x60; (boolean): whether to show desktop notifications     for all messages sent to the stream. * &#x60;audible_notifications&#x60; (boolean): whether to play a sound   notification for all messages sent to the stream. * &#x60;push_notifications&#x60; (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * &#x60;email_notifications&#x60; (boolean): whether to trigger an email     notification for all messages sent to the stream. 
     
     */
    public updateSubscriptionSettings(subscriptionData: Array<object>, observe?: 'body', headers?: Headers): Observable<JsonSuccessBase & object>;
    public updateSubscriptionSettings(subscriptionData: Array<object>, observe?: 'response', headers?: Headers): Observable<HttpResponse<JsonSuccessBase & object>>;
    public updateSubscriptionSettings(subscriptionData: Array<object>, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (subscriptionData === null || subscriptionData === undefined){
            throw new Error('Required parameter subscriptionData was null or undefined when calling updateSubscriptionSettings.');
        }

        let queryParameters: string[] = [];
        if (subscriptionData) {
            subscriptionData.forEach((element) => {
                queryParameters.push('subscriptionData='+encodeURIComponent(String(element)));
            })
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<JsonSuccessBase & object>> = this.httpClient.post(`${this.basePath}/users/me/subscriptions/properties?${queryParameters.join('&')}`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <JsonSuccessBase & object>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * Update subscriptions
     * Update which streams you are are subscribed to. 
     * @param _delete A list of stream names to unsubscribe from. 
     * @param add A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description. 
     
     */
    public updateSubscriptions(_delete?: Array<string>, add?: Array<object>, observe?: 'body', headers?: Headers): Observable<JsonSuccessBase & object>;
    public updateSubscriptions(_delete?: Array<string>, add?: Array<object>, observe?: 'response', headers?: Headers): Observable<HttpResponse<JsonSuccessBase & object>>;
    public updateSubscriptions(_delete?: Array<string>, add?: Array<object>, observe: any = 'body', headers: Headers = {}): Observable<any> {
        let queryParameters: string[] = [];
        if (_delete) {
            _delete.forEach((element) => {
                queryParameters.push('_delete='+encodeURIComponent(String(element)));
            })
        }
        if (add) {
            add.forEach((element) => {
                queryParameters.push('add='+encodeURIComponent(String(element)));
            })
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<JsonSuccessBase & object>> = this.httpClient.patch(`${this.basePath}/users/me/subscriptions?${queryParameters.join('&')}`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <JsonSuccessBase & object>(httpResponse.response))
               );
        }
        return response;
    }

}
