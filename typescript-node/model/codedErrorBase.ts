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
import { CodedErrorBaseAllOf } from './codedErrorBaseAllOf';
import { JsonErrorBase } from './jsonErrorBase';

export class CodedErrorBase {
    'result': any | null;
    'msg': any | null;
    /**
    * A string that identifies the error. 
    */
    'code'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "result",
            "baseName": "result",
            "type": "any"
        },
        {
            "name": "msg",
            "baseName": "msg",
            "type": "any"
        },
        {
            "name": "code",
            "baseName": "code",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CodedErrorBase.attributeTypeMap;
    }
}
