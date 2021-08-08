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

export class ApiKeyResponseAllOf {
    'result'?: any | null;
    'msg'?: any | null;
    /**
    * The API key that can be used to authenticate as the requested user. 
    */
    'apiKey': string;
    /**
    * The email address of the user who owns the API key 
    */
    'email': string;

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
            "name": "apiKey",
            "baseName": "api_key",
            "type": "string"
        },
        {
            "name": "email",
            "baseName": "email",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return ApiKeyResponseAllOf.attributeTypeMap;
    }
}

