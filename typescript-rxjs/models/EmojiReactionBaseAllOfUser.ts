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

/**
 * Whether the user is a mirror dummy. Dictionary with data on the user who added the reaction, including the user ID as the `id` field.  **Note**: In the [events API](/api/get-events), this `user` dictionary confusing had the user ID in a field called `user_id` instead.  We recommend ignoring fields other than the user ID.  **Deprecated** and to be removed in a future release once core clients have migrated to use the `user_id` field. 
 * @export
 * @interface EmojiReactionBaseAllOfUser
 */
export interface EmojiReactionBaseAllOfUser {
    /**
     * ID of the user. 
     * @type {number}
     * @memberof EmojiReactionBaseAllOfUser
     */
    id?: number;
    /**
     * Email of the user. 
     * @type {string}
     * @memberof EmojiReactionBaseAllOfUser
     */
    email?: string;
    /**
     * Full name of the user. 
     * @type {string}
     * @memberof EmojiReactionBaseAllOfUser
     */
    full_name?: string;
    /**
     * Whether the user is a mirror dummy. 
     * @type {boolean}
     * @memberof EmojiReactionBaseAllOfUser
     */
    is_mirror_dummy?: boolean;
}
