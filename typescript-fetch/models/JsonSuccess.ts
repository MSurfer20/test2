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
import {
    JsonSuccessAllOf,
    JsonSuccessAllOfFromJSON,
    JsonSuccessAllOfFromJSONTyped,
    JsonSuccessAllOfToJSON,
    JsonSuccessBase,
    JsonSuccessBaseFromJSON,
    JsonSuccessBaseFromJSONTyped,
    JsonSuccessBaseToJSON,
} from './';

/**
 * 
 * @export
 * @interface JsonSuccess
 */
export interface JsonSuccess {
    /**
     * 
     * @type {any}
     * @memberof JsonSuccess
     */
    result: any | null;
    /**
     * 
     * @type {any}
     * @memberof JsonSuccess
     */
    msg: any | null;
}

export function JsonSuccessFromJSON(json: any): JsonSuccess {
    return JsonSuccessFromJSONTyped(json, false);
}

export function JsonSuccessFromJSONTyped(json: any, ignoreDiscriminator: boolean): JsonSuccess {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'result': json['result'],
        'msg': json['msg'],
    };
}

export function JsonSuccessToJSON(value?: JsonSuccess | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'result': value.result,
        'msg': value.msg,
    };
}

