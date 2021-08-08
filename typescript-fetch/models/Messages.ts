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
    MessagesAllOf,
    MessagesAllOfFromJSON,
    MessagesAllOfFromJSONTyped,
    MessagesAllOfToJSON,
    MessagesBase,
    MessagesBaseFromJSON,
    MessagesBaseFromJSONTyped,
    MessagesBaseToJSON,
} from './';

/**
 * 
 * @export
 * @interface Messages
 */
export interface Messages {
    /**
     * 
     * @type {any}
     * @memberof Messages
     */
    avatarUrl?: any | null;
    /**
     * 
     * @type {any}
     * @memberof Messages
     */
    client?: any | null;
    /**
     * 
     * @type {any}
     * @memberof Messages
     */
    content?: any | null;
    /**
     * 
     * @type {any}
     * @memberof Messages
     */
    contentType?: any | null;
    /**
     * 
     * @type {any}
     * @memberof Messages
     */
    displayRecipient?: any | null;
    /**
     * 
     * @type {any}
     * @memberof Messages
     */
    id?: any | null;
    /**
     * 
     * @type {any}
     * @memberof Messages
     */
    isMeMessage?: any | null;
    /**
     * 
     * @type {any}
     * @memberof Messages
     */
    reactions?: any | null;
    /**
     * 
     * @type {any}
     * @memberof Messages
     */
    recipientId?: any | null;
    /**
     * 
     * @type {any}
     * @memberof Messages
     */
    senderEmail?: any | null;
    /**
     * 
     * @type {any}
     * @memberof Messages
     */
    senderFullName?: any | null;
    /**
     * 
     * @type {any}
     * @memberof Messages
     */
    senderId?: any | null;
    /**
     * 
     * @type {any}
     * @memberof Messages
     */
    senderRealmStr?: any | null;
    /**
     * 
     * @type {any}
     * @memberof Messages
     */
    streamId?: any | null;
    /**
     * 
     * @type {any}
     * @memberof Messages
     */
    subject?: any | null;
    /**
     * 
     * @type {any}
     * @memberof Messages
     */
    topicLinks?: any | null;
    /**
     * 
     * @type {any}
     * @memberof Messages
     */
    submessages?: any | null;
    /**
     * 
     * @type {any}
     * @memberof Messages
     */
    timestamp?: any | null;
    /**
     * 
     * @type {any}
     * @memberof Messages
     */
    type?: any | null;
}

export function MessagesFromJSON(json: any): Messages {
    return MessagesFromJSONTyped(json, false);
}

export function MessagesFromJSONTyped(json: any, ignoreDiscriminator: boolean): Messages {
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
    };
}

export function MessagesToJSON(value?: Messages | null): any {
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
    };
}


