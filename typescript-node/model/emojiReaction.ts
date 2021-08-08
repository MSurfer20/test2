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
import { EmojiReactionAllOf } from './emojiReactionAllOf';
import { EmojiReactionBase } from './emojiReactionBase';

export class EmojiReaction {
    'emojiCode'?: any | null;
    'emojiName'?: any | null;
    'reactionType'?: any | null;
    'userId'?: any | null;
    'user'?: any | null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "emojiCode",
            "baseName": "emoji_code",
            "type": "any"
        },
        {
            "name": "emojiName",
            "baseName": "emoji_name",
            "type": "any"
        },
        {
            "name": "reactionType",
            "baseName": "reaction_type",
            "type": "any"
        },
        {
            "name": "userId",
            "baseName": "user_id",
            "type": "any"
        },
        {
            "name": "user",
            "baseName": "user",
            "type": "any"
        }    ];

    static getAttributeTypeMap() {
        return EmojiReaction.attributeTypeMap;
    }
}
