// tslint:disable
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

import { Observable } from 'rxjs';
import { BaseAPI, HttpQuery, throwIfNullOrUndefined, encodeURI, OperationOpts, RawAjaxResponse } from '../runtime';
import {
    AddSubscriptionsResponse,
    CodedError,
    JsonError,
    JsonSuccess,
    JsonSuccessBase,
    NonExistingStreamError,
} from '../models';

export interface ArchiveStreamRequest {
    streamId: number;
}

export interface GetStreamIdRequest {
    stream: string;
}

export interface GetStreamTopicsRequest {
    streamId: number;
}

export interface GetStreamsRequest {
    includePublic?: boolean;
    includeWebPublic?: boolean;
    includeSubscribed?: boolean;
    includeAllActive?: boolean;
    includeDefault?: boolean;
    includeOwnerSubscribed?: boolean;
}

export interface GetSubscriptionStatusRequest {
    userId: number;
    streamId: number;
}

export interface GetSubscriptionsRequest {
    includeSubscribers?: boolean;
}

export interface MuteTopicRequest {
    topic: string;
    op: MuteTopicOpEnum;
    stream?: string;
    streamId?: number;
}

export interface SubscribeRequest {
    subscriptions: Array<object>;
    principals?: Array<string | number>;
    authorizationErrorsFatal?: boolean;
    announce?: boolean;
    inviteOnly?: boolean;
    historyPublicToSubscribers?: boolean;
    streamPostPolicy?: number;
    messageRetentionDays?: string | number;
}

export interface UnsubscribeRequest {
    subscriptions: Array<string>;
    principals?: Array<string | number>;
}

export interface UpdateStreamRequest {
    streamId: number;
    description?: string;
    newName?: string;
    isPrivate?: boolean;
    isAnnouncementOnly?: boolean;
    streamPostPolicy?: number;
    historyPublicToSubscribers?: boolean;
    messageRetentionDays?: string | number;
}

export interface UpdateSubscriptionSettingsRequest {
    subscriptionData: Array<object>;
}

export interface UpdateSubscriptionsRequest {
    _delete?: Array<string>;
    add?: Array<object>;
}

/**
 * no description
 */
export class StreamsApi extends BaseAPI {

    /**
     * [Archive the stream](/help/archive-a-stream) with the ID `stream_id`.  `DELETE {{ api_url }}/v1/streams/{stream_id}` 
     * Archive a stream
     */
    archiveStream({ streamId }: ArchiveStreamRequest): Observable<JsonSuccess>
    archiveStream({ streamId }: ArchiveStreamRequest, opts?: OperationOpts): Observable<RawAjaxResponse<JsonSuccess>>
    archiveStream({ streamId }: ArchiveStreamRequest, opts?: OperationOpts): Observable<JsonSuccess | RawAjaxResponse<JsonSuccess>> {
        throwIfNullOrUndefined(streamId, 'streamId', 'archiveStream');

        return this.request<JsonSuccess>({
            url: '/streams/{stream_id}'.replace('{stream_id}', encodeURI(streamId)),
            method: 'DELETE',
        }, opts?.responseOpts);
    };

    /**
     * Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 
     * Create BigBlueButton video call
     */
    createBigBlueButtonVideoCall(): Observable<JsonSuccessBase & object>
    createBigBlueButtonVideoCall(opts?: OperationOpts): Observable<RawAjaxResponse<JsonSuccessBase & object>>
    createBigBlueButtonVideoCall(opts?: OperationOpts): Observable<JsonSuccessBase & object | RawAjaxResponse<JsonSuccessBase & object>> {
        return this.request<JsonSuccessBase & object>({
            url: '/calls/bigbluebutton/create',
            method: 'GET',
        }, opts?.responseOpts);
    };

    /**
     * Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id` 
     * Get stream ID
     */
    getStreamId({ stream }: GetStreamIdRequest): Observable<JsonSuccessBase & object>
    getStreamId({ stream }: GetStreamIdRequest, opts?: OperationOpts): Observable<RawAjaxResponse<JsonSuccessBase & object>>
    getStreamId({ stream }: GetStreamIdRequest, opts?: OperationOpts): Observable<JsonSuccessBase & object | RawAjaxResponse<JsonSuccessBase & object>> {
        throwIfNullOrUndefined(stream, 'stream', 'getStreamId');

        const query: HttpQuery = { // required parameters are used directly since they are already checked by throwIfNullOrUndefined
            'stream': stream,
        };

        return this.request<JsonSuccessBase & object>({
            url: '/get_stream_id',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Get all the topics in a specific stream  `GET {{ api_url }}/v1/users/me/{stream_id}/topics` 
     * Get topics in a stream
     */
    getStreamTopics({ streamId }: GetStreamTopicsRequest): Observable<JsonSuccessBase & object>
    getStreamTopics({ streamId }: GetStreamTopicsRequest, opts?: OperationOpts): Observable<RawAjaxResponse<JsonSuccessBase & object>>
    getStreamTopics({ streamId }: GetStreamTopicsRequest, opts?: OperationOpts): Observable<JsonSuccessBase & object | RawAjaxResponse<JsonSuccessBase & object>> {
        throwIfNullOrUndefined(streamId, 'streamId', 'getStreamTopics');

        return this.request<JsonSuccessBase & object>({
            url: '/users/me/{stream_id}/topics'.replace('{stream_id}', encodeURI(streamId)),
            method: 'GET',
        }, opts?.responseOpts);
    };

    /**
     * Get all streams that the user has access to.  `GET {{ api_url }}/v1/streams` 
     * Get all streams
     */
    getStreams({ includePublic, includeWebPublic, includeSubscribed, includeAllActive, includeDefault, includeOwnerSubscribed }: GetStreamsRequest): Observable<JsonSuccessBase & object>
    getStreams({ includePublic, includeWebPublic, includeSubscribed, includeAllActive, includeDefault, includeOwnerSubscribed }: GetStreamsRequest, opts?: OperationOpts): Observable<RawAjaxResponse<JsonSuccessBase & object>>
    getStreams({ includePublic, includeWebPublic, includeSubscribed, includeAllActive, includeDefault, includeOwnerSubscribed }: GetStreamsRequest, opts?: OperationOpts): Observable<JsonSuccessBase & object | RawAjaxResponse<JsonSuccessBase & object>> {

        const query: HttpQuery = {};

        if (includePublic != null) { query['include_public'] = includePublic; }
        if (includeWebPublic != null) { query['include_web_public'] = includeWebPublic; }
        if (includeSubscribed != null) { query['include_subscribed'] = includeSubscribed; }
        if (includeAllActive != null) { query['include_all_active'] = includeAllActive; }
        if (includeDefault != null) { query['include_default'] = includeDefault; }
        if (includeOwnerSubscribed != null) { query['include_owner_subscribed'] = includeOwnerSubscribed; }

        return this.request<JsonSuccessBase & object>({
            url: '/streams',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Check whether a user is subscribed to a stream.  `GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`  **Changes**: New in Zulip 3.0 (feature level 11). 
     * Get subscription status
     */
    getSubscriptionStatus({ userId, streamId }: GetSubscriptionStatusRequest): Observable<JsonSuccessBase & object>
    getSubscriptionStatus({ userId, streamId }: GetSubscriptionStatusRequest, opts?: OperationOpts): Observable<RawAjaxResponse<JsonSuccessBase & object>>
    getSubscriptionStatus({ userId, streamId }: GetSubscriptionStatusRequest, opts?: OperationOpts): Observable<JsonSuccessBase & object | RawAjaxResponse<JsonSuccessBase & object>> {
        throwIfNullOrUndefined(userId, 'userId', 'getSubscriptionStatus');
        throwIfNullOrUndefined(streamId, 'streamId', 'getSubscriptionStatus');

        return this.request<JsonSuccessBase & object>({
            url: '/users/{user_id}/subscriptions/{stream_id}'.replace('{user_id}', encodeURI(userId)).replace('{stream_id}', encodeURI(streamId)),
            method: 'GET',
        }, opts?.responseOpts);
    };

    /**
     * Get all streams that the user is subscribed to.  `GET {{ api_url }}/v1/users/me/subscriptions` 
     * Get subscribed streams
     */
    getSubscriptions({ includeSubscribers }: GetSubscriptionsRequest): Observable<JsonSuccessBase & object>
    getSubscriptions({ includeSubscribers }: GetSubscriptionsRequest, opts?: OperationOpts): Observable<RawAjaxResponse<JsonSuccessBase & object>>
    getSubscriptions({ includeSubscribers }: GetSubscriptionsRequest, opts?: OperationOpts): Observable<JsonSuccessBase & object | RawAjaxResponse<JsonSuccessBase & object>> {

        const query: HttpQuery = {};

        if (includeSubscribers != null) { query['include_subscribers'] = includeSubscribers; }

        return this.request<JsonSuccessBase & object>({
            url: '/users/me/subscriptions',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user\'s unread count totals.  `PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics` 
     * Topic muting
     */
    muteTopic({ topic, op, stream, streamId }: MuteTopicRequest): Observable<JsonSuccess>
    muteTopic({ topic, op, stream, streamId }: MuteTopicRequest, opts?: OperationOpts): Observable<RawAjaxResponse<JsonSuccess>>
    muteTopic({ topic, op, stream, streamId }: MuteTopicRequest, opts?: OperationOpts): Observable<JsonSuccess | RawAjaxResponse<JsonSuccess>> {
        throwIfNullOrUndefined(topic, 'topic', 'muteTopic');
        throwIfNullOrUndefined(op, 'op', 'muteTopic');

        const query: HttpQuery = { // required parameters are used directly since they are already checked by throwIfNullOrUndefined
            'topic': topic,
            'op': op,
        };

        if (stream != null) { query['stream'] = stream; }
        if (streamId != null) { query['stream_id'] = streamId; }

        return this.request<JsonSuccess>({
            url: '/users/me/subscriptions/muted_topics',
            method: 'PATCH',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Subscribe one or more users to one or more streams.  `POST {{ api_url }}/v1/users/me/subscriptions`  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like `invite_only` detailed below. 
     * Subscribe to a stream
     */
    subscribe({ subscriptions, principals, authorizationErrorsFatal, announce, inviteOnly, historyPublicToSubscribers, streamPostPolicy, messageRetentionDays }: SubscribeRequest): Observable<AddSubscriptionsResponse>
    subscribe({ subscriptions, principals, authorizationErrorsFatal, announce, inviteOnly, historyPublicToSubscribers, streamPostPolicy, messageRetentionDays }: SubscribeRequest, opts?: OperationOpts): Observable<RawAjaxResponse<AddSubscriptionsResponse>>
    subscribe({ subscriptions, principals, authorizationErrorsFatal, announce, inviteOnly, historyPublicToSubscribers, streamPostPolicy, messageRetentionDays }: SubscribeRequest, opts?: OperationOpts): Observable<AddSubscriptionsResponse | RawAjaxResponse<AddSubscriptionsResponse>> {
        throwIfNullOrUndefined(subscriptions, 'subscriptions', 'subscribe');

        const query: HttpQuery = { // required parameters are used directly since they are already checked by throwIfNullOrUndefined
            'subscriptions': subscriptions,
        };

        if (principals != null) { query['principals'] = principals; }
        if (authorizationErrorsFatal != null) { query['authorization_errors_fatal'] = authorizationErrorsFatal; }
        if (announce != null) { query['announce'] = announce; }
        if (inviteOnly != null) { query['invite_only'] = inviteOnly; }
        if (historyPublicToSubscribers != null) { query['history_public_to_subscribers'] = historyPublicToSubscribers; }
        if (streamPostPolicy != null) { query['stream_post_policy'] = streamPostPolicy; }
        if (messageRetentionDays != null) { query['message_retention_days'] = messageRetentionDays; }

        return this.request<AddSubscriptionsResponse>({
            url: '/users/me/subscriptions',
            method: 'POST',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Unsubscribe yourself or other users from one or more streams.  `DELETE {{ api_url }}/v1/users/me/subscriptions` 
     * Unsubscribe from a stream
     */
    unsubscribe({ subscriptions, principals }: UnsubscribeRequest): Observable<JsonSuccessBase & object>
    unsubscribe({ subscriptions, principals }: UnsubscribeRequest, opts?: OperationOpts): Observable<RawAjaxResponse<JsonSuccessBase & object>>
    unsubscribe({ subscriptions, principals }: UnsubscribeRequest, opts?: OperationOpts): Observable<JsonSuccessBase & object | RawAjaxResponse<JsonSuccessBase & object>> {
        throwIfNullOrUndefined(subscriptions, 'subscriptions', 'unsubscribe');

        const query: HttpQuery = { // required parameters are used directly since they are already checked by throwIfNullOrUndefined
            'subscriptions': subscriptions,
        };

        if (principals != null) { query['principals'] = principals; }

        return this.request<JsonSuccessBase & object>({
            url: '/users/me/subscriptions',
            method: 'DELETE',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Configure the stream with the ID `stream_id`.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  `PATCH {{ api_url }}/v1/streams/{stream_id}` 
     * Update a stream
     */
    updateStream({ streamId, description, newName, isPrivate, isAnnouncementOnly, streamPostPolicy, historyPublicToSubscribers, messageRetentionDays }: UpdateStreamRequest): Observable<JsonSuccess>
    updateStream({ streamId, description, newName, isPrivate, isAnnouncementOnly, streamPostPolicy, historyPublicToSubscribers, messageRetentionDays }: UpdateStreamRequest, opts?: OperationOpts): Observable<RawAjaxResponse<JsonSuccess>>
    updateStream({ streamId, description, newName, isPrivate, isAnnouncementOnly, streamPostPolicy, historyPublicToSubscribers, messageRetentionDays }: UpdateStreamRequest, opts?: OperationOpts): Observable<JsonSuccess | RawAjaxResponse<JsonSuccess>> {
        throwIfNullOrUndefined(streamId, 'streamId', 'updateStream');

        const query: HttpQuery = {};

        if (description != null) { query['description'] = description; }
        if (newName != null) { query['new_name'] = newName; }
        if (isPrivate != null) { query['is_private'] = isPrivate; }
        if (isAnnouncementOnly != null) { query['is_announcement_only'] = isAnnouncementOnly; }
        if (streamPostPolicy != null) { query['stream_post_policy'] = streamPostPolicy; }
        if (historyPublicToSubscribers != null) { query['history_public_to_subscribers'] = historyPublicToSubscribers; }
        if (messageRetentionDays != null) { query['message_retention_days'] = messageRetentionDays; }

        return this.request<JsonSuccess>({
            url: '/streams/{stream_id}'.replace('{stream_id}', encodeURI(streamId)),
            method: 'PATCH',
            query,
        }, opts?.responseOpts);
    };

    /**
     * This endpoint is used to update the user\'s personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  `POST {{ api_url }}/v1/users/me/subscriptions/properties` 
     * Update subscription settings
     */
    updateSubscriptionSettings({ subscriptionData }: UpdateSubscriptionSettingsRequest): Observable<JsonSuccessBase & object>
    updateSubscriptionSettings({ subscriptionData }: UpdateSubscriptionSettingsRequest, opts?: OperationOpts): Observable<RawAjaxResponse<JsonSuccessBase & object>>
    updateSubscriptionSettings({ subscriptionData }: UpdateSubscriptionSettingsRequest, opts?: OperationOpts): Observable<JsonSuccessBase & object | RawAjaxResponse<JsonSuccessBase & object>> {
        throwIfNullOrUndefined(subscriptionData, 'subscriptionData', 'updateSubscriptionSettings');

        const query: HttpQuery = { // required parameters are used directly since they are already checked by throwIfNullOrUndefined
            'subscription_data': subscriptionData,
        };

        return this.request<JsonSuccessBase & object>({
            url: '/users/me/subscriptions/properties',
            method: 'POST',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Update which streams you are are subscribed to. 
     * Update subscriptions
     */
    updateSubscriptions({ _delete, add }: UpdateSubscriptionsRequest): Observable<JsonSuccessBase & object>
    updateSubscriptions({ _delete, add }: UpdateSubscriptionsRequest, opts?: OperationOpts): Observable<RawAjaxResponse<JsonSuccessBase & object>>
    updateSubscriptions({ _delete, add }: UpdateSubscriptionsRequest, opts?: OperationOpts): Observable<JsonSuccessBase & object | RawAjaxResponse<JsonSuccessBase & object>> {

        const query: HttpQuery = {};

        if (_delete != null) { query['delete'] = _delete; }
        if (add != null) { query['add'] = add; }

        return this.request<JsonSuccessBase & object>({
            url: '/users/me/subscriptions',
            method: 'PATCH',
            query,
        }, opts?.responseOpts);
    };

}

/**
 * @export
 * @enum {string}
 */
export enum MuteTopicOpEnum {
    Add = 'add',
    Remove = 'remove'
}
