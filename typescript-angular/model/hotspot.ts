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
 * Dictionary containing details of a single hotspot. 
 */
export interface Hotspot { 
    /**
     * The delay after which the user should be shown the hotspot. 
     */
    delay?: number;
    /**
     * The name of the hotspot. 
     */
    name?: string;
    /**
     * The title of the hotspot, as will be displayed to the user. 
     */
    title?: string;
    /**
     * The description of the hotspot, as will be displayed to the user. 
     */
    description?: string;
}

