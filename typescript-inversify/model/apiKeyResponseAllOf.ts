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


export interface ApiKeyResponseAllOf { 
    result?: any | null;
    msg?: any | null;
    /**
     * The API key that can be used to authenticate as the requested user. 
     */
    api_key: string;
    /**
     * The email address of the user who owns the API key 
     */
    email: string;
}
