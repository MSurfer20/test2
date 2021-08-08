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
    BadEventQueueIdErrorAllOf,
    BadEventQueueIdErrorAllOfFromJSON,
    BadEventQueueIdErrorAllOfFromJSONTyped,
    BadEventQueueIdErrorAllOfToJSON,
    CodedErrorBase,
    CodedErrorBaseFromJSON,
    CodedErrorBaseFromJSONTyped,
    CodedErrorBaseToJSON,
} from './';

/**
 * 
 * @export
 * @interface BadEventQueueIdError
 */
export interface BadEventQueueIdError {
    /**
     * 
     * @type {any}
     * @memberof BadEventQueueIdError
     */
    result: any | null;
    /**
     * 
     * @type {any}
     * @memberof BadEventQueueIdError
     */
    msg: any | null;
    /**
     * 
     * @type {any}
     * @memberof BadEventQueueIdError
     */
    code?: any | null;
    /**
     * The string that identifies the invalid event queue.
     * @type {string}
     * @memberof BadEventQueueIdError
     */
    queueId?: string;
}

export function BadEventQueueIdErrorFromJSON(json: any): BadEventQueueIdError {
    return BadEventQueueIdErrorFromJSONTyped(json, false);
}

export function BadEventQueueIdErrorFromJSONTyped(json: any, ignoreDiscriminator: boolean): BadEventQueueIdError {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'result': json['result'],
        'msg': json['msg'],
        'code': !exists(json, 'code') ? undefined : json['code'],
        'queueId': !exists(json, 'queue_id') ? undefined : json['queue_id'],
    };
}

export function BadEventQueueIdErrorToJSON(value?: BadEventQueueIdError | null): any {
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
        'queue_id': value.queueId,
    };
}

