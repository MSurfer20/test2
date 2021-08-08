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

import { RequestFile } from './models';

export class JsonSuccessBaseAllOf {
    'result': JsonSuccessBaseAllOf.ResultEnum;
    'msg': string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "result",
            "baseName": "result",
            "type": "JsonSuccessBaseAllOf.ResultEnum"
        },
        {
            "name": "msg",
            "baseName": "msg",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return JsonSuccessBaseAllOf.attributeTypeMap;
    }
}

export namespace JsonSuccessBaseAllOf {
    export enum ResultEnum {
        Success = <any> 'success'
    }
}