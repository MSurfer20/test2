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
 * @interface JsonErrorBaseAllOf
 */
export interface JsonErrorBaseAllOf {
    /**
     * 
     * @type {string}
     * @memberof JsonErrorBaseAllOf
     */
    result: JsonErrorBaseAllOfResultEnum;
    /**
     * 
     * @type {string}
     * @memberof JsonErrorBaseAllOf
     */
    msg: string;
}

/**
* @export
* @enum {string}
*/
export enum JsonErrorBaseAllOfResultEnum {
    Error = 'error'
}

export function JsonErrorBaseAllOfFromJSON(json: any): JsonErrorBaseAllOf {
    return JsonErrorBaseAllOfFromJSONTyped(json, false);
}

export function JsonErrorBaseAllOfFromJSONTyped(json: any, ignoreDiscriminator: boolean): JsonErrorBaseAllOf {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'result': json['result'],
        'msg': json['msg'],
    };
}

export function JsonErrorBaseAllOfToJSON(value?: JsonErrorBaseAllOf | null): any {
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


