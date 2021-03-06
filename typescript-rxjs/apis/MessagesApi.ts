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
    CodedError,
    InvalidMessageError,
    JsonSuccess,
    JsonSuccessBase,
    NonExistingStreamError,
} from '../models';

export interface AddReactionRequest {
    messageId: number;
    emojiName: string;
    emojiCode?: string;
    reactionType?: string;
}

export interface CheckMessagesMatchNarrowRequest {
    msgIds: Array<number>;
    narrow: Array<object>;
}

export interface DeleteMessageRequest {
    messageId: number;
}

export interface GetFileTemporaryUrlRequest {
    realmIdStr: number;
    filename: string;
}

export interface GetMessageHistoryRequest {
    messageId: number;
}

export interface GetMessagesRequest {
    numBefore: number;
    numAfter: number;
    anchor?: string | number;
    narrow?: Array<object>;
    clientGravatar?: boolean;
    applyMarkdown?: boolean;
    useFirstUnreadAnchor?: boolean;
}

export interface GetRawMessageRequest {
    messageId: number;
}

export interface MarkStreamAsReadRequest {
    streamId: number;
}

export interface MarkTopicAsReadRequest {
    streamId: number;
    topicName: string;
}

export interface RemoveReactionRequest {
    messageId: number;
    emojiName?: string;
    emojiCode?: string;
    reactionType?: string;
}

export interface RenderMessageRequest {
    content: string;
}

export interface SendMessageRequest {
    type: SendMessageTypeEnum;
    to: Array<number>;
    content: string;
    topic?: string;
    queueId?: string;
    localId?: string;
}

export interface UpdateMessageRequest {
    messageId: number;
    topic?: string;
    propagateMode?: UpdateMessagePropagateModeEnum;
    sendNotificationToOldThread?: boolean;
    sendNotificationToNewThread?: boolean;
    content?: string;
    streamId?: number;
}

export interface UpdateMessageFlagsRequest {
    messages: Array<number>;
    op: UpdateMessageFlagsOpEnum;
    flag: string;
}

export interface UploadFileRequest {
    filename?: Blob;
}

/**
 * no description
 */
export class MessagesApi extends BaseAPI {

    /**
     * Add an [emoji reaction](/help/emoji-reactions) to a message.  `POST {{ api_url }}/v1/messages/{message_id}/reactions` 
     * Add an emoji reaction
     */
    addReaction({ messageId, emojiName, emojiCode, reactionType }: AddReactionRequest): Observable<JsonSuccess>
    addReaction({ messageId, emojiName, emojiCode, reactionType }: AddReactionRequest, opts?: OperationOpts): Observable<RawAjaxResponse<JsonSuccess>>
    addReaction({ messageId, emojiName, emojiCode, reactionType }: AddReactionRequest, opts?: OperationOpts): Observable<JsonSuccess | RawAjaxResponse<JsonSuccess>> {
        throwIfNullOrUndefined(messageId, 'messageId', 'addReaction');
        throwIfNullOrUndefined(emojiName, 'emojiName', 'addReaction');

        const query: HttpQuery = { // required parameters are used directly since they are already checked by throwIfNullOrUndefined
            'emoji_name': emojiName,
        };

        if (emojiCode != null) { query['emoji_code'] = emojiCode; }
        if (reactionType != null) { query['reaction_type'] = reactionType; }

        return this.request<JsonSuccess>({
            url: '/messages/{message_id}/reactions'.replace('{message_id}', encodeURI(messageId)),
            method: 'POST',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Check whether a set of messages match a [narrow](/api/construct-narrow).  `GET {{ api_url }}/v1/messages/matches_narrow`  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the `match_subject` and `match_content` objects is designed to match those of `GET /messages`, so that a client can splice these fields into a `message` object received from `GET /events` and end up with an extended message object identical to how a `GET /messages` for the current narrow would have returned the message. 
     * Check if messages match a narrow
     */
    checkMessagesMatchNarrow({ msgIds, narrow }: CheckMessagesMatchNarrowRequest): Observable<JsonSuccessBase & object>
    checkMessagesMatchNarrow({ msgIds, narrow }: CheckMessagesMatchNarrowRequest, opts?: OperationOpts): Observable<RawAjaxResponse<JsonSuccessBase & object>>
    checkMessagesMatchNarrow({ msgIds, narrow }: CheckMessagesMatchNarrowRequest, opts?: OperationOpts): Observable<JsonSuccessBase & object | RawAjaxResponse<JsonSuccessBase & object>> {
        throwIfNullOrUndefined(msgIds, 'msgIds', 'checkMessagesMatchNarrow');
        throwIfNullOrUndefined(narrow, 'narrow', 'checkMessagesMatchNarrow');

        const query: HttpQuery = { // required parameters are used directly since they are already checked by throwIfNullOrUndefined
            'msg_ids': msgIds,
            'narrow': narrow,
        };

        return this.request<JsonSuccessBase & object>({
            url: '/messages/matches_narrow',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Permanently delete a message.  `DELETE {{ api_url }}/v1/messages/{msg_id}`  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely 
     * Delete a message
     */
    deleteMessage({ messageId }: DeleteMessageRequest): Observable<JsonSuccess>
    deleteMessage({ messageId }: DeleteMessageRequest, opts?: OperationOpts): Observable<RawAjaxResponse<JsonSuccess>>
    deleteMessage({ messageId }: DeleteMessageRequest, opts?: OperationOpts): Observable<JsonSuccess | RawAjaxResponse<JsonSuccess>> {
        throwIfNullOrUndefined(messageId, 'messageId', 'deleteMessage');

        return this.request<JsonSuccess>({
            url: '/messages/{message_id}'.replace('{message_id}', encodeURI(messageId)),
            method: 'DELETE',
        }, opts?.responseOpts);
    };

    /**
     * Get a temporary URL for access to the file that doesn\'t require authentication. 
     * Get public temporary URL
     */
    getFileTemporaryUrl({ realmIdStr, filename }: GetFileTemporaryUrlRequest): Observable<JsonSuccessBase & object>
    getFileTemporaryUrl({ realmIdStr, filename }: GetFileTemporaryUrlRequest, opts?: OperationOpts): Observable<RawAjaxResponse<JsonSuccessBase & object>>
    getFileTemporaryUrl({ realmIdStr, filename }: GetFileTemporaryUrlRequest, opts?: OperationOpts): Observable<JsonSuccessBase & object | RawAjaxResponse<JsonSuccessBase & object>> {
        throwIfNullOrUndefined(realmIdStr, 'realmIdStr', 'getFileTemporaryUrl');
        throwIfNullOrUndefined(filename, 'filename', 'getFileTemporaryUrl');

        return this.request<JsonSuccessBase & object>({
            url: '/user_uploads/{realm_id_str}/{filename}'.replace('{realm_id_str}', encodeURI(realmIdStr)).replace('{filename}', encodeURI(filename)),
            method: 'GET',
        }, opts?.responseOpts);
    };

    /**
     * Fetch the message edit history of a previously edited message.  `GET {{ api_url }}/v1/messages/{message_id}/history`  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history 
     * Get a message\'s edit history
     */
    getMessageHistory({ messageId }: GetMessageHistoryRequest): Observable<JsonSuccessBase & object>
    getMessageHistory({ messageId }: GetMessageHistoryRequest, opts?: OperationOpts): Observable<RawAjaxResponse<JsonSuccessBase & object>>
    getMessageHistory({ messageId }: GetMessageHistoryRequest, opts?: OperationOpts): Observable<JsonSuccessBase & object | RawAjaxResponse<JsonSuccessBase & object>> {
        throwIfNullOrUndefined(messageId, 'messageId', 'getMessageHistory');

        return this.request<JsonSuccessBase & object>({
            url: '/messages/{message_id}/history'.replace('{message_id}', encodeURI(messageId)),
            method: 'GET',
        }, opts?.responseOpts);
    };

    /**
     * Fetch message history from a Zulip server.  `GET {{ api_url }}/v1/messages`  This `GET /api/v1/messages` endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip\'s powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user\'s message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an `anchor` message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the `num_before` and `num_after` limits.  We recommend using `num_before <= 1000` and `num_after <= 1000` to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error. 
     * Get messages
     */
    getMessages({ numBefore, numAfter, anchor, narrow, clientGravatar, applyMarkdown, useFirstUnreadAnchor }: GetMessagesRequest): Observable<JsonSuccessBase & object>
    getMessages({ numBefore, numAfter, anchor, narrow, clientGravatar, applyMarkdown, useFirstUnreadAnchor }: GetMessagesRequest, opts?: OperationOpts): Observable<RawAjaxResponse<JsonSuccessBase & object>>
    getMessages({ numBefore, numAfter, anchor, narrow, clientGravatar, applyMarkdown, useFirstUnreadAnchor }: GetMessagesRequest, opts?: OperationOpts): Observable<JsonSuccessBase & object | RawAjaxResponse<JsonSuccessBase & object>> {
        throwIfNullOrUndefined(numBefore, 'numBefore', 'getMessages');
        throwIfNullOrUndefined(numAfter, 'numAfter', 'getMessages');

        const query: HttpQuery = { // required parameters are used directly since they are already checked by throwIfNullOrUndefined
            'num_before': numBefore,
            'num_after': numAfter,
        };

        if (anchor != null) { query['anchor'] = anchor; }
        if (narrow != null) { query['narrow'] = narrow; }
        if (clientGravatar != null) { query['client_gravatar'] = clientGravatar; }
        if (applyMarkdown != null) { query['apply_markdown'] = applyMarkdown; }
        if (useFirstUnreadAnchor != null) { query['use_first_unread_anchor'] = useFirstUnreadAnchor; }

        return this.request<JsonSuccessBase & object>({
            url: '/messages',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Get the raw content of a message.  `GET {{ api_url }}/v1/messages/{msg_id}`  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message\'s raw Markdown (e.g. for pre-filling a message-editing UI). 
     * Get a message\'s raw Markdown
     */
    getRawMessage({ messageId }: GetRawMessageRequest): Observable<JsonSuccessBase & object>
    getRawMessage({ messageId }: GetRawMessageRequest, opts?: OperationOpts): Observable<RawAjaxResponse<JsonSuccessBase & object>>
    getRawMessage({ messageId }: GetRawMessageRequest, opts?: OperationOpts): Observable<JsonSuccessBase & object | RawAjaxResponse<JsonSuccessBase & object>> {
        throwIfNullOrUndefined(messageId, 'messageId', 'getRawMessage');

        return this.request<JsonSuccessBase & object>({
            url: '/messages/{message_id}'.replace('{message_id}', encodeURI(messageId)),
            method: 'GET',
        }, opts?.responseOpts);
    };

    /**
     * Marks all of the current user\'s unread messages as read.  `POST {{ api_url }}/v1/mark_all_as_read` 
     * Mark all messages as read
     */
    markAllAsRead(): Observable<JsonSuccess>
    markAllAsRead(opts?: OperationOpts): Observable<RawAjaxResponse<JsonSuccess>>
    markAllAsRead(opts?: OperationOpts): Observable<JsonSuccess | RawAjaxResponse<JsonSuccess>> {
        return this.request<JsonSuccess>({
            url: '/mark_all_as_read',
            method: 'POST',
        }, opts?.responseOpts);
    };

    /**
     * Mark all the unread messages in a stream as read. 
     * Mark messages in a stream as read
     */
    markStreamAsRead({ streamId }: MarkStreamAsReadRequest): Observable<JsonSuccess>
    markStreamAsRead({ streamId }: MarkStreamAsReadRequest, opts?: OperationOpts): Observable<RawAjaxResponse<JsonSuccess>>
    markStreamAsRead({ streamId }: MarkStreamAsReadRequest, opts?: OperationOpts): Observable<JsonSuccess | RawAjaxResponse<JsonSuccess>> {
        throwIfNullOrUndefined(streamId, 'streamId', 'markStreamAsRead');

        const query: HttpQuery = { // required parameters are used directly since they are already checked by throwIfNullOrUndefined
            'stream_id': streamId,
        };

        return this.request<JsonSuccess>({
            url: '/mark_stream_as_read',
            method: 'POST',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Mark all the unread messages in a topic as read. 
     * Mark messages in a topic as read
     */
    markTopicAsRead({ streamId, topicName }: MarkTopicAsReadRequest): Observable<JsonSuccess>
    markTopicAsRead({ streamId, topicName }: MarkTopicAsReadRequest, opts?: OperationOpts): Observable<RawAjaxResponse<JsonSuccess>>
    markTopicAsRead({ streamId, topicName }: MarkTopicAsReadRequest, opts?: OperationOpts): Observable<JsonSuccess | RawAjaxResponse<JsonSuccess>> {
        throwIfNullOrUndefined(streamId, 'streamId', 'markTopicAsRead');
        throwIfNullOrUndefined(topicName, 'topicName', 'markTopicAsRead');

        const query: HttpQuery = { // required parameters are used directly since they are already checked by throwIfNullOrUndefined
            'stream_id': streamId,
            'topic_name': topicName,
        };

        return this.request<JsonSuccess>({
            url: '/mark_topic_as_read',
            method: 'POST',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Remove an [emoji reaction](/help/emoji-reactions) from a message.  `DELETE {{ api_url }}/v1/messages/{message_id}/reactions` 
     * Remove an emoji reaction
     */
    removeReaction({ messageId, emojiName, emojiCode, reactionType }: RemoveReactionRequest): Observable<JsonSuccess>
    removeReaction({ messageId, emojiName, emojiCode, reactionType }: RemoveReactionRequest, opts?: OperationOpts): Observable<RawAjaxResponse<JsonSuccess>>
    removeReaction({ messageId, emojiName, emojiCode, reactionType }: RemoveReactionRequest, opts?: OperationOpts): Observable<JsonSuccess | RawAjaxResponse<JsonSuccess>> {
        throwIfNullOrUndefined(messageId, 'messageId', 'removeReaction');

        const query: HttpQuery = {};

        if (emojiName != null) { query['emoji_name'] = emojiName; }
        if (emojiCode != null) { query['emoji_code'] = emojiCode; }
        if (reactionType != null) { query['reaction_type'] = reactionType; }

        return this.request<JsonSuccess>({
            url: '/messages/{message_id}/reactions'.replace('{message_id}', encodeURI(messageId)),
            method: 'DELETE',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Render a message to HTML.  `POST {{ api_url }}/v1/messages/render` 
     * Render message
     */
    renderMessage({ content }: RenderMessageRequest): Observable<JsonSuccessBase & object>
    renderMessage({ content }: RenderMessageRequest, opts?: OperationOpts): Observable<RawAjaxResponse<JsonSuccessBase & object>>
    renderMessage({ content }: RenderMessageRequest, opts?: OperationOpts): Observable<JsonSuccessBase & object | RawAjaxResponse<JsonSuccessBase & object>> {
        throwIfNullOrUndefined(content, 'content', 'renderMessage');

        const query: HttpQuery = { // required parameters are used directly since they are already checked by throwIfNullOrUndefined
            'content': content,
        };

        return this.request<JsonSuccessBase & object>({
            url: '/messages/render',
            method: 'POST',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Send a stream or a private message.  `POST {{ api_url }}/v1/messages` 
     * Send a message
     */
    sendMessage({ type, to, content, topic, queueId, localId }: SendMessageRequest): Observable<JsonSuccessBase & object>
    sendMessage({ type, to, content, topic, queueId, localId }: SendMessageRequest, opts?: OperationOpts): Observable<RawAjaxResponse<JsonSuccessBase & object>>
    sendMessage({ type, to, content, topic, queueId, localId }: SendMessageRequest, opts?: OperationOpts): Observable<JsonSuccessBase & object | RawAjaxResponse<JsonSuccessBase & object>> {
        throwIfNullOrUndefined(type, 'type', 'sendMessage');
        throwIfNullOrUndefined(to, 'to', 'sendMessage');
        throwIfNullOrUndefined(content, 'content', 'sendMessage');

        const query: HttpQuery = { // required parameters are used directly since they are already checked by throwIfNullOrUndefined
            'type': type,
            'to': to,
            'content': content,
        };

        if (topic != null) { query['topic'] = topic; }
        if (queueId != null) { query['queue_id'] = queueId; }
        if (localId != null) { query['local_id'] = localId; }

        return this.request<JsonSuccessBase & object>({
            url: '/messages',
            method: 'POST',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Edit/update the content or topic of a message.  `PATCH {{ api_url }}/v1/messages/{msg_id}`  `{msg_id}` in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to `??? {original_topic}`.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion 
     * Edit a message
     */
    updateMessage({ messageId, topic, propagateMode, sendNotificationToOldThread, sendNotificationToNewThread, content, streamId }: UpdateMessageRequest): Observable<JsonSuccess>
    updateMessage({ messageId, topic, propagateMode, sendNotificationToOldThread, sendNotificationToNewThread, content, streamId }: UpdateMessageRequest, opts?: OperationOpts): Observable<RawAjaxResponse<JsonSuccess>>
    updateMessage({ messageId, topic, propagateMode, sendNotificationToOldThread, sendNotificationToNewThread, content, streamId }: UpdateMessageRequest, opts?: OperationOpts): Observable<JsonSuccess | RawAjaxResponse<JsonSuccess>> {
        throwIfNullOrUndefined(messageId, 'messageId', 'updateMessage');

        const query: HttpQuery = {};

        if (topic != null) { query['topic'] = topic; }
        if (propagateMode != null) { query['propagate_mode'] = propagateMode; }
        if (sendNotificationToOldThread != null) { query['send_notification_to_old_thread'] = sendNotificationToOldThread; }
        if (sendNotificationToNewThread != null) { query['send_notification_to_new_thread'] = sendNotificationToNewThread; }
        if (content != null) { query['content'] = content; }
        if (streamId != null) { query['stream_id'] = streamId; }

        return this.request<JsonSuccess>({
            url: '/messages/{message_id}'.replace('{message_id}', encodeURI(messageId)),
            method: 'PATCH',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Add or remove personal message flags like `read` and `starred` on a collection of message IDs.  `POST {{ api_url }}/v1/messages/flags`  For updating the `read` flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read). 
     * Update personal message flags
     */
    updateMessageFlags({ messages, op, flag }: UpdateMessageFlagsRequest): Observable<JsonSuccessBase & object>
    updateMessageFlags({ messages, op, flag }: UpdateMessageFlagsRequest, opts?: OperationOpts): Observable<RawAjaxResponse<JsonSuccessBase & object>>
    updateMessageFlags({ messages, op, flag }: UpdateMessageFlagsRequest, opts?: OperationOpts): Observable<JsonSuccessBase & object | RawAjaxResponse<JsonSuccessBase & object>> {
        throwIfNullOrUndefined(messages, 'messages', 'updateMessageFlags');
        throwIfNullOrUndefined(op, 'op', 'updateMessageFlags');
        throwIfNullOrUndefined(flag, 'flag', 'updateMessageFlags');

        const query: HttpQuery = { // required parameters are used directly since they are already checked by throwIfNullOrUndefined
            'messages': messages,
            'op': op,
            'flag': flag,
        };

        return this.request<JsonSuccessBase & object>({
            url: '/messages/flags',
            method: 'POST',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Upload a single file and get the corresponding URI.  `POST {{ api_url }}/v1/user_uploads`  Initially, only you will be able to access the link.  To share the uploaded file, you\'ll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message 
     * Upload a file
     */
    uploadFile({ filename }: UploadFileRequest): Observable<JsonSuccessBase & object>
    uploadFile({ filename }: UploadFileRequest, opts?: OperationOpts): Observable<RawAjaxResponse<JsonSuccessBase & object>>
    uploadFile({ filename }: UploadFileRequest, opts?: OperationOpts): Observable<JsonSuccessBase & object | RawAjaxResponse<JsonSuccessBase & object>> {

        const formData = new FormData();
        if (filename !== undefined) { formData.append('filename', filename as any); }

        return this.request<JsonSuccessBase & object>({
            url: '/user_uploads',
            method: 'POST',
            body: formData,
        }, opts?.responseOpts);
    };

}

/**
 * @export
 * @enum {string}
 */
export enum SendMessageTypeEnum {
    Private = 'private',
    Stream = 'stream'
}
/**
 * @export
 * @enum {string}
 */
export enum UpdateMessagePropagateModeEnum {
    One = 'change_one',
    Later = 'change_later',
    All = 'change_all'
}
/**
 * @export
 * @enum {string}
 */
export enum UpdateMessageFlagsOpEnum {
    Add = 'add',
    Remove = 'remove'
}
