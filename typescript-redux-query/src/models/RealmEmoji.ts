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
 * `{emoji_id}`: Object containing details about the emoji with  the specified ID. It has the following properties: 
 * @export
 * @interface RealmEmoji
 */
export interface RealmEmoji  {
    /**
     * The ID for this emoji, same as the object\'s key. 
     * @type {string}
     * @memberof RealmEmoji
     */
    id?: string;
    /**
     * The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (`:name  :`). 
     * @type {string}
     * @memberof RealmEmoji
     */
    name?: string;
    /**
     * The path relative to the organization\'s URL where the emoji\'s image can be found. 
     * @type {string}
     * @memberof RealmEmoji
     */
    sourceUrl?: string;
    /**
     * Whether the emoji has been deactivated or not. 
     * @type {boolean}
     * @memberof RealmEmoji
     */
    deactivated?: boolean;
    /**
     * The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and `author` object with an `id` field. 
     * @type {number}
     * @memberof RealmEmoji
     */
    authorId?: number;
}

export function RealmEmojiFromJSON(json: any): RealmEmoji {
    return {
        'id': !exists(json, 'id') ? undefined : json['id'],
        'name': !exists(json, 'name') ? undefined : json['name'],
        'sourceUrl': !exists(json, 'source_url') ? undefined : json['source_url'],
        'deactivated': !exists(json, 'deactivated') ? undefined : json['deactivated'],
        'authorId': !exists(json, 'author_id') ? undefined : json['author_id'],
    };
}

export function RealmEmojiToJSON(value?: RealmEmoji): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'id': value.id,
        'name': value.name,
        'source_url': value.sourceUrl,
        'deactivated': value.deactivated,
        'author_id': value.authorId,
    };
}

