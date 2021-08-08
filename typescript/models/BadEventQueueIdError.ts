/**
 * Zulip REST API
 * Powerful open source group chat 
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { AnyType } from './AnyType';
import { BadEventQueueIdErrorAllOf } from './BadEventQueueIdErrorAllOf';
import { CodedErrorBase } from './CodedErrorBase';
import { HttpFile } from '../http/http';

export class BadEventQueueIdError {
    'result': AnyType;
    'msg': AnyType;
    'code'?: AnyType;
    /**
    * The string that identifies the invalid event queue. 
    */
    'queueId'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "result",
            "baseName": "result",
            "type": "AnyType",
            "format": ""
        },
        {
            "name": "msg",
            "baseName": "msg",
            "type": "AnyType",
            "format": ""
        },
        {
            "name": "code",
            "baseName": "code",
            "type": "AnyType",
            "format": ""
        },
        {
            "name": "queueId",
            "baseName": "queue_id",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return BadEventQueueIdError.attributeTypeMap;
    }
    
    public constructor() {
    }
}
