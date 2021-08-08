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

import { HttpFile } from '../http/http';

/**
* Dictionary containing the details of a custom profile field configured for this organization. 
*/
export class CustomProfileField {
    /**
    * The ID of the custom profile field.  This will be referenced in custom the profile fields section of user objects. 
    */
    'id'?: number;
    /**
    * An integer indicating the type of the custom profile field, which determines how it is configured and displayed to users.  See the [Add custom profile fields](/help/add-custom-profile-fields) article for details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account 
    */
    'type'?: number;
    /**
    * Custom profile fields are displayed in both settings UI and UI showing users' profiles in increasing `order`. 
    */
    'order'?: number;
    /**
    * The name of the custom profile field. 
    */
    'name'?: string;
    /**
    * The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. 
    */
    'hint'?: string;
    /**
    * Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. 
    */
    'fieldData'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "number",
            "format": ""
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "number",
            "format": ""
        },
        {
            "name": "order",
            "baseName": "order",
            "type": "number",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "hint",
            "baseName": "hint",
            "type": "string",
            "format": ""
        },
        {
            "name": "fieldData",
            "baseName": "field_data",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return CustomProfileField.attributeTypeMap;
    }
    
    public constructor() {
    }
}
