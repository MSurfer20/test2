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

import { exists, mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface EmojiBase
 */
export interface EmojiBase  {
    /**
     * A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it\'ll be the ID of the realm emoji. 
     * @type {string}
     * @memberof EmojiBase
     */
    emojiCode?: string;
    /**
     * Name of the emoji. 
     * @type {string}
     * @memberof EmojiBase
     */
    emojiName?: string;
    /**
     * One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. 
     * @type {string}
     * @memberof EmojiBase
     */
    reactionType?: string;
}

export function EmojiBaseFromJSON(json: any): EmojiBase {
    return {
        'emojiCode': !exists(json, 'emoji_code') ? undefined : json['emoji_code'],
        'emojiName': !exists(json, 'emoji_name') ? undefined : json['emoji_name'],
        'reactionType': !exists(json, 'reaction_type') ? undefined : json['reaction_type'],
    };
}

export function EmojiBaseToJSON(value?: EmojiBase): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'emoji_code': value.emojiCode,
        'emoji_name': value.emojiName,
        'reaction_type': value.reactionType,
    };
}


