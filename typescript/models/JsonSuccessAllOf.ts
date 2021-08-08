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
import { HttpFile } from '../http/http';

export class JsonSuccessAllOf {
    'result'?: AnyType;
    'msg'?: AnyType;

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
        }    ];

    static getAttributeTypeMap() {
        return JsonSuccessAllOf.attributeTypeMap;
    }
    
    public constructor() {
    }
}

