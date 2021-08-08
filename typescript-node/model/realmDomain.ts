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
* Object containing details of the newly added domain. 
*/
export class RealmDomain {
    /**
    * The new allowed domain. 
    */
    'domain'?: string;
    /**
    * Whether subdomains are allowed for this domain. 
    */
    'allowSubdomains'?: boolean;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "domain",
            "baseName": "domain",
            "type": "string"
        },
        {
            "name": "allowSubdomains",
            "baseName": "allow_subdomains",
            "type": "boolean"
        }    ];

    static getAttributeTypeMap() {
        return RealmDomain.attributeTypeMap;
    }
}

