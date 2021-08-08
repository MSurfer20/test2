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
* Object containing the user group\'s attributes. 
*/
export class UserGroup {
    /**
    * The name of the user group. 
    */
    'name'?: string;
    /**
    * The description of the user group. 
    */
    'description'?: string;
    /**
    * Array containing the id of the users who are members of this user group. 
    */
    'members'?: Array<number>;
    /**
    * The ID of the user group. 
    */
    'id'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string"
        },
        {
            "name": "members",
            "baseName": "members",
            "type": "Array<number>"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return UserGroup.attributeTypeMap;
    }
}

