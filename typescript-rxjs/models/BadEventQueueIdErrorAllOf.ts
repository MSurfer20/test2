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
 * @interface BadEventQueueIdErrorAllOf
 */
export interface BadEventQueueIdErrorAllOf {
    /**
     * @type {any}
     * @memberof BadEventQueueIdErrorAllOf
     */
    result?: any | null;
    /**
     * @type {any}
     * @memberof BadEventQueueIdErrorAllOf
     */
    msg?: any | null;
    /**
     * @type {any}
     * @memberof BadEventQueueIdErrorAllOf
     */
    code?: any | null;
    /**
     * The string that identifies the invalid event queue. 
     * @type {string}
     * @memberof BadEventQueueIdErrorAllOf
     */
    queue_id?: string;
}