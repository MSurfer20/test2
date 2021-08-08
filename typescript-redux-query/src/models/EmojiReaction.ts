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

import {
    EmojiReactionAllOf,
    EmojiReactionAllOfFromJSON,
    EmojiReactionAllOfToJSON,
    EmojiReactionBase,
    EmojiReactionBaseFromJSON,
    EmojiReactionBaseToJSON,
} from './';

/**
 * @type EmojiReaction
 * @export
 */
export interface EmojiReaction extends EmojiReactionAllOf, EmojiReactionBase {
}

export function EmojiReactionFromJSON(json: any): EmojiReaction {
    return {
        ...EmojiReactionAllOfFromJSON(json),
        ...EmojiReactionBaseFromJSON(json),
    };
}

export function EmojiReactionToJSON(value?: EmojiReaction): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        ...EmojiReactionAllOfToJSON(value),
        ...EmojiReactionBaseToJSON(value),
    };
}
