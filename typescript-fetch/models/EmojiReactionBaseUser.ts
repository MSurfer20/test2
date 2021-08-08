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
 * Dictionary with data on the user who added the reaction, including
 * the user ID as the `id` field.  **Note**: In the [events
 * API](/api/get-events), this `user` dictionary
 * confusing had the user ID in a field called `user_id`
 * instead.  We recommend ignoring fields other than the user
 * ID.  **Deprecated** and to be removed in a future release
 * once core clients have migrated to use the `user_id` field.
 * @export
 * @interface EmojiReactionBaseUser
 */
export interface EmojiReactionBaseUser {
    /**
     * ID of the user.
     * @type {number}
     * @memberof EmojiReactionBaseUser
     */
    id?: number;
    /**
     * Email of the user.
     * @type {string}
     * @memberof EmojiReactionBaseUser
     */
    email?: string;
    /**
     * Full name of the user.
     * @type {string}
     * @memberof EmojiReactionBaseUser
     */
    fullName?: string;
    /**
     * Whether the user is a mirror dummy.
     * @type {boolean}
     * @memberof EmojiReactionBaseUser
     */
    isMirrorDummy?: boolean;
}

export function EmojiReactionBaseUserFromJSON(json: any): EmojiReactionBaseUser {
    return EmojiReactionBaseUserFromJSONTyped(json, false);
}

export function EmojiReactionBaseUserFromJSONTyped(json: any, ignoreDiscriminator: boolean): EmojiReactionBaseUser {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'id': !exists(json, 'id') ? undefined : json['id'],
        'email': !exists(json, 'email') ? undefined : json['email'],
        'fullName': !exists(json, 'full_name') ? undefined : json['full_name'],
        'isMirrorDummy': !exists(json, 'is_mirror_dummy') ? undefined : json['is_mirror_dummy'],
    };
}

export function EmojiReactionBaseUserToJSON(value?: EmojiReactionBaseUser | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'id': value.id,
        'email': value.email,
        'full_name': value.fullName,
        'is_mirror_dummy': value.isMirrorDummy,
    };
}


