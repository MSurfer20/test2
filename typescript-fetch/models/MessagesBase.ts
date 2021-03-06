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
    EmojiReaction,
    EmojiReactionFromJSON,
    EmojiReactionFromJSONTyped,
    EmojiReactionToJSON,
    MessagesBaseTopicLinks,
    MessagesBaseTopicLinksFromJSON,
    MessagesBaseTopicLinksFromJSONTyped,
    MessagesBaseTopicLinksToJSON,
} from './';

/**
 * Object containing details of the message.
 * @export
 * @interface MessagesBase
 */
export interface MessagesBase {
    /**
     * The URL of the user's avatar.  Can be null only if client_gravatar was passed,
     * which means that the user has not uploaded an avatar in Zulip, and the
     * client should compute the gravatar URL by hashing the
     * user's email address itself for this user.
     * @type {string}
     * @memberof MessagesBase
     */
    avatarUrl?: string | null;
    /**
     * A Zulip "client" string, describing what Zulip client
     * sent the message.
     * @type {string}
     * @memberof MessagesBase
     */
    client?: string;
    /**
     * The content/body of the message.
     * @type {string}
     * @memberof MessagesBase
     */
    content?: string;
    /**
     * The HTTP `content_type` for the message content.  This
     * will be `text/html` or `text/x-markdown`, depending on
     * whether `apply_markdown` was set.
     * @type {string}
     * @memberof MessagesBase
     */
    contentType?: string;
    /**
     * Data on the recipient of the message;
     * either the name of a stream or a dictionary containing basic data on
     * the users who received the message.
     * @type {string | Array<object>}
     * @memberof MessagesBase
     */
    displayRecipient?: string | Array<object>;
    /**
     * The unique message ID.  Messages should always be
     * displayed sorted by ID.
     * @type {number}
     * @memberof MessagesBase
     */
    id?: number;
    /**
     * Whether the message is a [/me status message][status-messages]
     * 
     * [status-messages]: /help/format-your-message-using-markdown#status-messages
     * @type {boolean}
     * @memberof MessagesBase
     */
    isMeMessage?: boolean;
    /**
     * Data on any reactions to the message.
     * @type {Array<EmojiReaction>}
     * @memberof MessagesBase
     */
    reactions?: Array<EmojiReaction>;
    /**
     * A unique ID for the set of users receiving the
     * message (either a stream or group of users).  Useful primarily
     * for hashing.
     * @type {number}
     * @memberof MessagesBase
     */
    recipientId?: number;
    /**
     * The Zulip display email address of the message's sender.
     * @type {string}
     * @memberof MessagesBase
     */
    senderEmail?: string;
    /**
     * The full name of the message's sender.
     * @type {string}
     * @memberof MessagesBase
     */
    senderFullName?: string;
    /**
     * The user ID of the message's sender.
     * @type {number}
     * @memberof MessagesBase
     */
    senderId?: number;
    /**
     * A string identifier for the realm the sender is in.  Unique only within
     * the context of a given Zulip server.
     * 
     * E.g. on `example.zulip.com`, this will be `example`.
     * @type {string}
     * @memberof MessagesBase
     */
    senderRealmStr?: string;
    /**
     * Only present for stream messages; the ID of the stream.
     * @type {number}
     * @memberof MessagesBase
     */
    streamId?: number;
    /**
     * The `topic` of the message.  Currently always `""` for private messages,
     * though this could change if Zulip adds support for topics in private
     * message conversations.
     * 
     * The field name is a legacy holdover from when topics were
     * called "subjects" and will eventually change.
     * @type {string}
     * @memberof MessagesBase
     */
    subject?: string;
    /**
     * Data on any links to be included in the `topic`
     * line (these are generated by [custom linkification
     * filters](/help/add-a-custom-linkifier) that match content in the
     * message's topic.)
     * 
     * **Changes**: This field contained a list of urls before
     *   Zulip 4.0 (feature level 46).
     * 
     * New in Zulip 3.0 (feature level 1): Previously, this field was called
     * `subject_links`; clients are recommended to rename `subject_links` to `topic_links`
     * if present for compatibility with older Zulip servers.
     * @type {Array<MessagesBaseTopicLinks>}
     * @memberof MessagesBase
     */
    topicLinks?: Array<MessagesBaseTopicLinks>;
    /**
     * Data used for certain experimental Zulip integrations.
     * @type {Array<string>}
     * @memberof MessagesBase
     */
    submessages?: Array<string>;
    /**
     * The UNIX timestamp for when the message was sent,
     * in UTC seconds.
     * @type {number}
     * @memberof MessagesBase
     */
    timestamp?: number;
    /**
     * The type of the message: `stream` or `private`.
     * @type {string}
     * @memberof MessagesBase
     */
    type?: string;
}

export function MessagesBaseFromJSON(json: any): MessagesBase {
    return MessagesBaseFromJSONTyped(json, false);
}

export function MessagesBaseFromJSONTyped(json: any, ignoreDiscriminator: boolean): MessagesBase {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'avatarUrl': !exists(json, 'avatar_url') ? undefined : json['avatar_url'],
        'client': !exists(json, 'client') ? undefined : json['client'],
        'content': !exists(json, 'content') ? undefined : json['content'],
        'contentType': !exists(json, 'content_type') ? undefined : json['content_type'],
        'displayRecipient': !exists(json, 'display_recipient') ? undefined : string | Array&lt;object&gt;FromJSON(json['display_recipient']),
        'id': !exists(json, 'id') ? undefined : json['id'],
        'isMeMessage': !exists(json, 'is_me_message') ? undefined : json['is_me_message'],
        'reactions': !exists(json, 'reactions') ? undefined : ((json['reactions'] as Array<any>).map(EmojiReactionFromJSON)),
        'recipientId': !exists(json, 'recipient_id') ? undefined : json['recipient_id'],
        'senderEmail': !exists(json, 'sender_email') ? undefined : json['sender_email'],
        'senderFullName': !exists(json, 'sender_full_name') ? undefined : json['sender_full_name'],
        'senderId': !exists(json, 'sender_id') ? undefined : json['sender_id'],
        'senderRealmStr': !exists(json, 'sender_realm_str') ? undefined : json['sender_realm_str'],
        'streamId': !exists(json, 'stream_id') ? undefined : json['stream_id'],
        'subject': !exists(json, 'subject') ? undefined : json['subject'],
        'topicLinks': !exists(json, 'topic_links') ? undefined : ((json['topic_links'] as Array<any>).map(MessagesBaseTopicLinksFromJSON)),
        'submessages': !exists(json, 'submessages') ? undefined : json['submessages'],
        'timestamp': !exists(json, 'timestamp') ? undefined : json['timestamp'],
        'type': !exists(json, 'type') ? undefined : json['type'],
    };
}

export function MessagesBaseToJSON(value?: MessagesBase | null): any {
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
        'display_recipient': string | Array&lt;object&gt;ToJSON(value.displayRecipient),
        'id': value.id,
        'is_me_message': value.isMeMessage,
        'reactions': value.reactions === undefined ? undefined : ((value.reactions as Array<any>).map(EmojiReactionToJSON)),
        'recipient_id': value.recipientId,
        'sender_email': value.senderEmail,
        'sender_full_name': value.senderFullName,
        'sender_id': value.senderId,
        'sender_realm_str': value.senderRealmStr,
        'stream_id': value.streamId,
        'subject': value.subject,
        'topic_links': value.topicLinks === undefined ? undefined : ((value.topicLinks as Array<any>).map(MessagesBaseTopicLinksToJSON)),
        'submessages': value.submessages,
        'timestamp': value.timestamp,
        'type': value.type,
    };
}


