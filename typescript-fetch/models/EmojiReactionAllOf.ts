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
/**
 * 
 * @export
 * @interface EmojiReactionAllOf
 */
export interface EmojiReactionAllOf {
    /**
     * 
     * @type {any}
     * @memberof EmojiReactionAllOf
     */
    emojiCode?: any | null;
    /**
     * 
     * @type {any}
     * @memberof EmojiReactionAllOf
     */
    emojiName?: any | null;
    /**
     * 
     * @type {any}
     * @memberof EmojiReactionAllOf
     */
    reactionType?: any | null;
    /**
     * 
     * @type {any}
     * @memberof EmojiReactionAllOf
     */
    userId?: any | null;
    /**
     * 
     * @type {any}
     * @memberof EmojiReactionAllOf
     */
    user?: any | null;
}

export function EmojiReactionAllOfFromJSON(json: any): EmojiReactionAllOf {
    return EmojiReactionAllOfFromJSONTyped(json, false);
}

export function EmojiReactionAllOfFromJSONTyped(json: any, ignoreDiscriminator: boolean): EmojiReactionAllOf {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'emojiCode': !exists(json, 'emoji_code') ? undefined : json['emoji_code'],
        'emojiName': !exists(json, 'emoji_name') ? undefined : json['emoji_name'],
        'reactionType': !exists(json, 'reaction_type') ? undefined : json['reaction_type'],
        'userId': !exists(json, 'user_id') ? undefined : json['user_id'],
        'user': !exists(json, 'user') ? undefined : json['user'],
    };
}

export function EmojiReactionAllOfToJSON(value?: EmojiReactionAllOf | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'emoji_code': value.emojiCode,
        'emoji_name': value.emojiName,
        'reaction_type': value.reactionType,
        'user_id': value.userId,
        'user': value.user,
    };
}

