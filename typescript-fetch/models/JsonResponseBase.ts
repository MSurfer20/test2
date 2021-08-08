/* tslint:disable */
/* eslint-disable */
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
export interface JsonResponseBase {
    /**
     * 
     * @type {string}
     * @memberof JsonResponseBase
     */
    result?: string;
}

export function JsonResponseBaseFromJSON(json: any): JsonResponseBase {
    return JsonResponseBaseFromJSONTyped(json, false);
}

export function JsonResponseBaseFromJSONTyped(json: any, ignoreDiscriminator: boolean): JsonResponseBase {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'result': !exists(json, 'result') ? undefined : json['result'],
    };
}

export function JsonResponseBaseToJSON(value?: JsonResponseBase | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'result': value.result,
    };
}

