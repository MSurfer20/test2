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
 * @interface JsonSuccessBaseAllOf
 */
export interface JsonSuccessBaseAllOf {
    /**
     * @type {string}
     * @memberof JsonSuccessBaseAllOf
     */
    result: JsonSuccessBaseAllOfResultEnum;
    /**
     * @type {string}
     * @memberof JsonSuccessBaseAllOf
     */
    msg: string;
}

/**
 * @export
 * @enum {string}
 */
export enum JsonSuccessBaseAllOfResultEnum {
    Success = 'success'
}

