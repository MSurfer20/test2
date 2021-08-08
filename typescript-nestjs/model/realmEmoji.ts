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
 * `{emoji_id}`: Object containing details about the emoji with  the specified ID. It has the following properties: 
 */
export interface RealmEmoji { 
    /**
     * The ID for this emoji, same as the object\'s key. 
     */
    id?: string;
    /**
     * The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (`:name  :`). 
     */
    name?: string;
    /**
     * The path relative to the organization\'s URL where the emoji\'s image can be found. 
     */
    source_url?: string;
    /**
     * Whether the emoji has been deactivated or not. 
     */
    deactivated?: boolean;
    /**
     * The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and `author` object with an `id` field. 
     */
    author_id?: number | null;
}

