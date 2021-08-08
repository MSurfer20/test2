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
 * @export
 * @interface ApiKeyResponseAllOf
 */
export interface ApiKeyResponseAllOf {
    /**
     * @type {any}
     * @memberof ApiKeyResponseAllOf
     */
    result?: any | null;
    /**
     * @type {any}
     * @memberof ApiKeyResponseAllOf
     */
    msg?: any | null;
    /**
     * The API key that can be used to authenticate as the requested user. 
     * @type {string}
     * @memberof ApiKeyResponseAllOf
     */
    api_key: string;
    /**
     * The email address of the user who owns the API key 
     * @type {string}
     * @memberof ApiKeyResponseAllOf
     */
    email: string;
}
