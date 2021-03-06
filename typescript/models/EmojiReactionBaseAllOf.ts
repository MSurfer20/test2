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

import { EmojiReactionBaseAllOfUser } from './EmojiReactionBaseAllOfUser';
import { HttpFile } from '../http/http';

export class EmojiReactionBaseAllOf {
    /**
    * The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future. 
    */
    'userId'?: number;
    'user'?: EmojiReactionBaseAllOfUser;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "userId",
            "baseName": "user_id",
            "type": "number",
            "format": ""
        },
        {
            "name": "user",
            "baseName": "user",
            "type": "EmojiReactionBaseAllOfUser",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return EmojiReactionBaseAllOf.attributeTypeMap;
    }
    
    public constructor() {
    }
}

