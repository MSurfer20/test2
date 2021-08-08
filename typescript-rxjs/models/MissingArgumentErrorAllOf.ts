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
 * ## Missing request parameter(s)  A typical failed JSON response for when a required request parameter is not supplied 
 * @export
 * @interface MissingArgumentErrorAllOf
 */
export interface MissingArgumentErrorAllOf {
    /**
     * @type {any}
     * @memberof MissingArgumentErrorAllOf
     */
    result?: any | null;
    /**
     * @type {any}
     * @memberof MissingArgumentErrorAllOf
     */
    msg?: any | null;
    /**
     * @type {any}
     * @memberof MissingArgumentErrorAllOf
     */
    code?: any | null;
    /**
     * It contains the information about the missing parameter. 
     * @type {string}
     * @memberof MissingArgumentErrorAllOf
     */
    var_name?: string;
}