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

import { exists, mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface JsonResponseBase
 */
export interface JsonResponseBase  {
    /**
     * 
     * @type {string}
     * @memberof JsonResponseBase
     */
    result?: string;
}

export function JsonResponseBaseFromJSON(json: any): JsonResponseBase {
    return {
        'result': !exists(json, 'result') ? undefined : json['result'],
    };
}

export function JsonResponseBaseToJSON(value?: JsonResponseBase): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'result': value.result,
    };
}


