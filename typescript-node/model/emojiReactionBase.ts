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
import { EmojiBase } from './emojiBase';
import { EmojiReactionBaseAllOf } from './emojiReactionBaseAllOf';
import { EmojiReactionBaseAllOfUser } from './emojiReactionBaseAllOfUser';

export class EmojiReactionBase {
    /**
    * A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it\'ll be the ID of the realm emoji. 
    */
    'emojiCode'?: string;
    /**
    * Name of the emoji. 
    */
    'emojiName'?: string;
    /**
    * One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. 
    */
    'reactionType'?: string;
    /**
    * The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future. 
    */
    'userId'?: number;
    'user'?: EmojiReactionBaseAllOfUser;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "emojiCode",
            "baseName": "emoji_code",
            "type": "string"
        },
        {
            "name": "emojiName",
            "baseName": "emoji_name",
            "type": "string"
        },
        {
            "name": "reactionType",
            "baseName": "reaction_type",
            "type": "string"
        },
        {
            "name": "userId",
            "baseName": "user_id",
            "type": "number"
        },
        {
            "name": "user",
            "baseName": "user",
            "type": "EmojiReactionBaseAllOfUser"
        }    ];

    static getAttributeTypeMap() {
        return EmojiReactionBase.attributeTypeMap;
    }
}

