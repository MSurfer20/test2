/* tslint:disable */
/* eslint-disable */
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

import { exists, mapValues } from '../runtime';
import {
    GetMessagesAllOf,
    GetMessagesAllOfFromJSON,
    GetMessagesAllOfFromJSONTyped,
    GetMessagesAllOfToJSON,
    MessagesBase,
    MessagesBaseFromJSON,
    MessagesBaseFromJSONTyped,
    MessagesBaseToJSON,
} from './';

/**
 * 
 * @export
 * @interface GetMessages
 */
export interface GetMessages {
    /**
     * 
     * @type {any}
     * @memberof GetMessages
     */
    avatarUrl?: any | null;
    /**
     * 
     * @type {any}
     * @memberof GetMessages
     */
    client?: any | null;
    /**
     * 
     * @type {any}
     * @memberof GetMessages
     */
    content?: any | null;
    /**
     * 
     * @type {any}
     * @memberof GetMessages
     */
    contentType?: any | null;
    /**
     * 
     * @type {any}
     * @memberof GetMessages
     */
    displayRecipient?: any | null;
    /**
     * 
     * @type {any}
     * @memberof GetMessages
     */
    id?: any | null;
    /**
     * 
     * @type {any}
     * @memberof GetMessages
     */
    isMeMessage?: any | null;
    /**
     * 
     * @type {any}
     * @memberof GetMessages
     */
    reactions?: any | null;
    /**
     * 
     * @type {any}
     * @memberof GetMessages
     */
    recipientId?: any | null;
    /**
     * 
     * @type {any}
     * @memberof GetMessages
     */
    senderEmail?: any | null;
    /**
     * 
     * @type {any}
     * @memberof GetMessages
     */
    senderFullName?: any | null;
    /**
     * 
     * @type {any}
     * @memberof GetMessages
     */
    senderId?: any | null;
    /**
     * 
     * @type {any}
     * @memberof GetMessages
     */
    senderRealmStr?: any | null;
    /**
     * 
     * @type {any}
     * @memberof GetMessages
     */
    streamId?: any | null;
    /**
     * 
     * @type {any}
     * @memberof GetMessages
     */
    subject?: any | null;
    /**
     * 
     * @type {any}
     * @memberof GetMessages
     */
    topicLinks?: any | null;
    /**
     * 
     * @type {any}
     * @memberof GetMessages
     */
    submessages?: any | null;
    /**
     * 
     * @type {any}
     * @memberof GetMessages
     */
    timestamp?: any | null;
    /**
     * 
     * @type {any}
     * @memberof GetMessages
     */
    type?: any | null;
    /**
     * The user's [message flags][message-flags] for the message.
     * 
     * [message-flags]: /api/update-message-flags#available-flags
     * @type {Array<string>}
     * @memberof GetMessages
     */
    flags?: Array<string>;
    /**
     * The UNIX timestamp for when the message was last edited,
     * in UTC seconds.
     * @type {number}
     * @memberof GetMessages
     */
    lastEditTimestamp?: number;
    /**
     * Only present if keyword search was included among the narrow parameters.
     * HTML content of a queried message that matches the narrow, with
     * `<span class="highlight">` elements wrapping the matches for the
     * search keywords.
     * @type {string}
     * @memberof GetMessages
     */
    matchContent?: string;
    /**
     * Only present if keyword search was included among the narrow parameters.
     * HTML-escaped topic of a queried message that matches the narrow, with
     * `<span class="highlight">` elements wrapping the matches for the
     * search keywords.
     * @type {string}
     * @memberof GetMessages
     */
    matchSubject?: string;
}

export function GetMessagesFromJSON(json: any): GetMessages {
    return GetMessagesFromJSONTyped(json, false);
}

export function GetMessagesFromJSONTyped(json: any, ignoreDiscriminator: boolean): GetMessages {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'avatarUrl': !exists(json, 'avatar_url') ? undefined : json['avatar_url'],
        'client': !exists(json, 'client') ? undefined : json['client'],
        'content': !exists(json, 'content') ? undefined : json['content'],
        'contentType': !exists(json, 'content_type') ? undefined : json['content_type'],
        'displayRecipient': !exists(json, 'display_recipient') ? undefined : json['display_recipient'],
        'id': !exists(json, 'id') ? undefined : json['id'],
        'isMeMessage': !exists(json, 'is_me_message') ? undefined : json['is_me_message'],
        'reactions': !exists(json, 'reactions') ? undefined : json['reactions'],
        'recipientId': !exists(json, 'recipient_id') ? undefined : json['recipient_id'],
        'senderEmail': !exists(json, 'sender_email') ? undefined : json['sender_email'],
        'senderFullName': !exists(json, 'sender_full_name') ? undefined : json['sender_full_name'],
        'senderId': !exists(json, 'sender_id') ? undefined : json['sender_id'],
        'senderRealmStr': !exists(json, 'sender_realm_str') ? undefined : json['sender_realm_str'],
        'streamId': !exists(json, 'stream_id') ? undefined : json['stream_id'],
        'subject': !exists(json, 'subject') ? undefined : json['subject'],
        'topicLinks': !exists(json, 'topic_links') ? undefined : json['topic_links'],
        'submessages': !exists(json, 'submessages') ? undefined : json['submessages'],
        'timestamp': !exists(json, 'timestamp') ? undefined : json['timestamp'],
        'type': !exists(json, 'type') ? undefined : json['type'],
        'flags': !exists(json, 'flags') ? undefined : json['flags'],
        'lastEditTimestamp': !exists(json, 'last_edit_timestamp') ? undefined : json['last_edit_timestamp'],
        'matchContent': !exists(json, 'match_content') ? undefined : json['match_content'],
        'matchSubject': !exists(json, 'match_subject') ? undefined : json['match_subject'],
    };
}

export function GetMessagesToJSON(value?: GetMessages | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'avatar_url': value.avatarUrl,
        'client': value.client,
        'content': value.content,
        'content_type': value.contentType,
        'display_recipient': value.displayRecipient,
        'id': value.id,
        'is_me_message': value.isMeMessage,
        'reactions': value.reactions,
        'recipient_id': value.recipientId,
        'sender_email': value.senderEmail,
        'sender_full_name': value.senderFullName,
        'sender_id': value.senderId,
        'sender_realm_str': value.senderRealmStr,
        'stream_id': value.streamId,
        'subject': value.subject,
        'topic_links': value.topicLinks,
        'submessages': value.submessages,
        'timestamp': value.timestamp,
        'type': value.type,
        'flags': value.flags,
        'last_edit_timestamp': value.lastEditTimestamp,
        'match_content': value.matchContent,
        'match_subject': value.matchSubject,
    };
}


