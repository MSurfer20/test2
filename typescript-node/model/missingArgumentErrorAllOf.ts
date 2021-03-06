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

/**
* ## Missing request parameter(s)  A typical failed JSON response for when a required request parameter is not supplied 
*/
export class MissingArgumentErrorAllOf {
    'result'?: any | null;
    'msg'?: any | null;
    'code'?: any | null;
    /**
    * It contains the information about the missing parameter. 
    */
    'varName'?: string;

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
            "name": "varName",
            "baseName": "var_name",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return MissingArgumentErrorAllOf.attributeTypeMap;
    }
}

