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
import { BasicStreamAllOf } from './BasicStreamAllOf';
import { BasicStreamBase } from './BasicStreamBase';
import { HttpFile } from '../http/http';

export class BasicStream {
    'streamId'?: AnyType;
    'name'?: AnyType;
    'description'?: AnyType;
    'dateCreated'?: AnyType;
    'inviteOnly'?: AnyType;
    'renderedDescription'?: AnyType;
    'isWebPublic'?: AnyType;
    'streamPostPolicy'?: AnyType;
    'messageRetentionDays'?: AnyType;
    'historyPublicToSubscribers'?: AnyType;
    'firstMessageId'?: AnyType;
    'isAnnouncementOnly'?: AnyType;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "streamId",
            "baseName": "stream_id",
            "type": "AnyType",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "AnyType",
            "format": ""
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "AnyType",
            "format": ""
        },
        {
            "name": "dateCreated",
            "baseName": "date_created",
            "type": "AnyType",
            "format": ""
        },
        {
            "name": "inviteOnly",
            "baseName": "invite_only",
            "type": "AnyType",
            "format": ""
        },
        {
            "name": "renderedDescription",
            "baseName": "rendered_description",
            "type": "AnyType",
            "format": ""
        },
        {
            "name": "isWebPublic",
            "baseName": "is_web_public",
            "type": "AnyType",
            "format": ""
        },
        {
            "name": "streamPostPolicy",
            "baseName": "stream_post_policy",
            "type": "AnyType",
            "format": ""
        },
        {
            "name": "messageRetentionDays",
            "baseName": "message_retention_days",
            "type": "AnyType",
            "format": ""
        },
        {
            "name": "historyPublicToSubscribers",
            "baseName": "history_public_to_subscribers",
            "type": "AnyType",
            "format": ""
        },
        {
            "name": "firstMessageId",
            "baseName": "first_message_id",
            "type": "AnyType",
            "format": ""
        },
        {
            "name": "isAnnouncementOnly",
            "baseName": "is_announcement_only",
            "type": "AnyType",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return BasicStream.attributeTypeMap;
    }
    
    public constructor() {
    }
}

