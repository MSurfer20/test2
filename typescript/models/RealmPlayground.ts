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
* Object containing details about a realm playground. 
*/
export class RealmPlayground {
    /**
    * The unique ID for the realm playground. 
    */
    'id'?: number;
    /**
    * The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49). 
    */
    'name'?: string;
    /**
    * The name of the Pygments language lexer for that programming language. 
    */
    'pygmentsLanguage'?: string;
    /**
    * The url prefix for the playground. 
    */
    'urlPrefix'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "number",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "pygmentsLanguage",
            "baseName": "pygments_language",
            "type": "string",
            "format": ""
        },
        {
            "name": "urlPrefix",
            "baseName": "url_prefix",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return RealmPlayground.attributeTypeMap;
    }
    
    public constructor() {
    }
}

