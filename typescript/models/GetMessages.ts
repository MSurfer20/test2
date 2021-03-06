/**
 * Zulip REST API
 * Powerful open source group chat 
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { AnyType } from './AnyType';
import { GetMessagesAllOf } from './GetMessagesAllOf';
import { MessagesBase } from './MessagesBase';
import { HttpFile } from '../http/http';

export class GetMessages {
    'avatarUrl'?: AnyType;
    'client'?: AnyType;
    'content'?: AnyType;
    'contentType'?: AnyType;
    'displayRecipient'?: AnyType;
    'id'?: AnyType;
    'isMeMessage'?: AnyType;
    'reactions'?: AnyType;
    'recipientId'?: AnyType;
    'senderEmail'?: AnyType;
    'senderFullName'?: AnyType;
    'senderId'?: AnyType;
    'senderRealmStr'?: AnyType;
    'streamId'?: AnyType;
    'subject'?: AnyType;
    'topicLinks'?: AnyType;
    'submessages'?: AnyType;
    'timestamp'?: AnyType;
    'type'?: AnyType;
    /**
    * The user's [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags 
    */
    'flags'?: Array<string>;
    /**
    * The UNIX timestamp for when the message was last edited, in UTC seconds. 
    */
    'lastEditTimestamp'?: number;
    /**
    * Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. 
    */
    'matchContent'?: string;
    /**
    * Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. 
    */
    'matchSubject'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "avatarUrl",
            "baseName": "avatar_url",
            "type": "AnyType",
            "format": ""
        },
        {
            "name": "client",
            "baseName": "client",
            "type": "AnyType",
            "format": ""
        },
        {
            "name": "content",
            "baseName": "content",
            "type": "AnyType",
            "format": ""
        },
        {
            "name": "contentType",
            "baseName": "content_type",
            "type": "AnyType",
            "format": ""
        },
        {
            "name": "displayRecipient",
            "baseName": "display_recipient",
            "type": "AnyType",
            "format": ""
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "AnyType",
            "format": ""
        },
        {
            "name": "isMeMessage",
            "baseName": "is_me_message",
            "type": "AnyType",
            "format": ""
        },
        {
            "name": "reactions",
            "baseName": "reactions",
            "type": "AnyType",
            "format": ""
        },
        {
            "name": "recipientId",
            "baseName": "recipient_id",
            "type": "AnyType",
            "format": ""
        },
        {
            "name": "senderEmail",
            "baseName": "sender_email",
            "type": "AnyType",
            "format": ""
        },
        {
            "name": "senderFullName",
            "baseName": "sender_full_name",
            "type": "AnyType",
            "format": ""
        },
        {
            "name": "senderId",
            "baseName": "sender_id",
            "type": "AnyType",
            "format": ""
        },
        {
            "name": "senderRealmStr",
            "baseName": "sender_realm_str",
            "type": "AnyType",
            "format": ""
        },
        {
            "name": "streamId",
            "baseName": "stream_id",
            "type": "AnyType",
            "format": ""
        },
        {
            "name": "subject",
            "baseName": "subject",
            "type": "AnyType",
            "format": ""
        },
        {
            "name": "topicLinks",
            "baseName": "topic_links",
            "type": "AnyType",
            "format": ""
        },
        {
            "name": "submessages",
            "baseName": "submessages",
            "type": "AnyType",
            "format": ""
        },
        {
            "name": "timestamp",
            "baseName": "timestamp",
            "type": "AnyType",
            "format": ""
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "AnyType",
            "format": ""
        },
        {
            "name": "flags",
            "baseName": "flags",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "lastEditTimestamp",
            "baseName": "last_edit_timestamp",
            "type": "number",
            "format": ""
        },
        {
            "name": "matchContent",
            "baseName": "match_content",
            "type": "string",
            "format": ""
        },
        {
            "name": "matchSubject",
            "baseName": "match_subject",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return GetMessages.attributeTypeMap;
    }
    
    public constructor() {
    }
}

