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

export class NonExistingStreamErrorAllOf {
    'result'?: any | null;
    'msg'?: any | null;
    'code'?: any | null;
    /**
    * The name of the stream that could not be found. 
    */
    'stream'?: string;

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
            "type": "any"
        },
        {
            "name": "stream",
            "baseName": "stream",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return NonExistingStreamErrorAllOf.attributeTypeMap;
    }
}

