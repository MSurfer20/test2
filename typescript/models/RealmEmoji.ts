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

import { HttpFile } from '../http/http';

/**
* `{emoji_id}`: Object containing details about the emoji with  the specified ID. It has the following properties: 
*/
export class RealmEmoji {
    /**
    * The ID for this emoji, same as the object's key. 
    */
    'id'?: string;
    /**
    * The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (`:name  :`). 
    */
    'name'?: string;
    /**
    * The path relative to the organization's URL where the emoji's image can be found. 
    */
    'sourceUrl'?: string;
    /**
    * Whether the emoji has been deactivated or not. 
    */
    'deactivated'?: boolean;
    /**
    * The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and `author` object with an `id` field. 
    */
    'authorId'?: number;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "sourceUrl",
            "baseName": "source_url",
            "type": "string",
            "format": ""
        },
        {
            "name": "deactivated",
            "baseName": "deactivated",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "authorId",
            "baseName": "author_id",
            "type": "number",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return RealmEmoji.attributeTypeMap;
    }
    
    public constructor() {
    }
}

