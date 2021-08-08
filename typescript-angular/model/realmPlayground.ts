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
 * Object containing details about a realm playground. 
 */
export interface RealmPlayground { 
    /**
     * The unique ID for the realm playground. 
     */
    id?: number;
    /**
     * The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49). 
     */
    name?: string;
    /**
     * The name of the Pygments language lexer for that programming language. 
     */
    pygments_language?: string;
    /**
     * The url prefix for the playground. 
     */
    url_prefix?: string;
}

