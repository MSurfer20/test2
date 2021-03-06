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
 * @interface NonExistingStreamErrorAllOf
 */
export interface NonExistingStreamErrorAllOf {
    /**
     * 
     * @type {any}
     * @memberof NonExistingStreamErrorAllOf
     */
    result?: any | null;
    /**
     * 
     * @type {any}
     * @memberof NonExistingStreamErrorAllOf
     */
    msg?: any | null;
    /**
     * 
     * @type {any}
     * @memberof NonExistingStreamErrorAllOf
     */
    code?: any | null;
    /**
     * The name of the stream that could not be found.
     * @type {string}
     * @memberof NonExistingStreamErrorAllOf
     */
    stream?: string;
}

export function NonExistingStreamErrorAllOfFromJSON(json: any): NonExistingStreamErrorAllOf {
    return NonExistingStreamErrorAllOfFromJSONTyped(json, false);
}

export function NonExistingStreamErrorAllOfFromJSONTyped(json: any, ignoreDiscriminator: boolean): NonExistingStreamErrorAllOf {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'result': !exists(json, 'result') ? undefined : json['result'],
        'msg': !exists(json, 'msg') ? undefined : json['msg'],
        'code': !exists(json, 'code') ? undefined : json['code'],
        'stream': !exists(json, 'stream') ? undefined : json['stream'],
    };
}

export function NonExistingStreamErrorAllOfToJSON(value?: NonExistingStreamErrorAllOf | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'result': value.result,
        'msg': value.msg,
        'code': value.code,
        'stream': value.stream,
    };
}


