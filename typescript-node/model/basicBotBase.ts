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

import { RequestFile } from './models';

export class BasicBotBase {
    /**
    * The user id of the bot. 
    */
    'userId'?: number;
    /**
    * The full name of the bot. 
    */
    'fullName'?: string;
    /**
    * The API key of the bot which it uses to make API requests. 
    */
    'apiKey'?: string;
    /**
    * The default sending stream of the bot. Null if the bot doesn\'t have a default sending stream. 
    */
    'defaultSendingStream'?: string | null;
    /**
    * The default stream for which the bot receives events/register data. Null if the bot doesn\'t have such a default stream. 
    */
    'defaultEventsRegisterStream'?: string | null;
    /**
    * Whether the bot can send messages to all streams by default. 
    */
    'defaultAllPublicStreams'?: boolean;
    /**
    * The URL of the bot\'s avatar. 
    */
    'avatarUrl'?: string;
    /**
    * The user id of the bot\'s owner.  Null if the bot has no owner. 
    */
    'ownerId'?: number | null;
    /**
    * The \"Services\" array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change. 
    */
    'services'?: Array<object>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "userId",
            "baseName": "user_id",
            "type": "number"
        },
        {
            "name": "fullName",
            "baseName": "full_name",
            "type": "string"
        },
        {
            "name": "apiKey",
            "baseName": "api_key",
            "type": "string"
        },
        {
            "name": "defaultSendingStream",
            "baseName": "default_sending_stream",
            "type": "string"
        },
        {
            "name": "defaultEventsRegisterStream",
            "baseName": "default_events_register_stream",
            "type": "string"
        },
        {
            "name": "defaultAllPublicStreams",
            "baseName": "default_all_public_streams",
            "type": "boolean"
        },
        {
            "name": "avatarUrl",
            "baseName": "avatar_url",
            "type": "string"
        },
        {
            "name": "ownerId",
            "baseName": "owner_id",
            "type": "number"
        },
        {
            "name": "services",
            "baseName": "services",
            "type": "Array<object>"
        }    ];

    static getAttributeTypeMap() {
        return BasicBotBase.attributeTypeMap;
    }
}

