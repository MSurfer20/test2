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
import { CodedError } from './CodedError';
import { HttpFile } from '../http/http';

export class RealmDeactivatedError {
    'result': AnyType;
    'msg': AnyType;
    'code'?: AnyType;

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
        }    ];

    static getAttributeTypeMap() {
        return RealmDeactivatedError.attributeTypeMap;
    }
    
    public constructor() {
    }
}

