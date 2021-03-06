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
 *
 */

import ApiClient from '../ApiClient';

/**
 * The CustomProfileField model module.
 * @module model/CustomProfileField
 * @version 1.0.0
 */
class CustomProfileField {
    /**
     * Constructs a new <code>CustomProfileField</code>.
     * Dictionary containing the details of a custom profile field configured for this organization. 
     * @alias module:model/CustomProfileField
     */
    constructor() { 
        
        CustomProfileField.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CustomProfileField</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CustomProfileField} obj Optional instance to populate.
     * @return {module:model/CustomProfileField} The populated <code>CustomProfileField</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CustomProfileField();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'Number');
            }
            if (data.hasOwnProperty('order')) {
                obj['order'] = ApiClient.convertToType(data['order'], 'Number');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('hint')) {
                obj['hint'] = ApiClient.convertToType(data['hint'], 'String');
            }
            if (data.hasOwnProperty('field_data')) {
                obj['field_data'] = ApiClient.convertToType(data['field_data'], 'String');
            }
        }
        return obj;
    }


}

/**
 * The ID of the custom profile field.  This will be referenced in custom the profile fields section of user objects. 
 * @member {Number} id
 */
CustomProfileField.prototype['id'] = undefined;

/**
 * An integer indicating the type of the custom profile field, which determines how it is configured and displayed to users.  See the [Add custom profile fields](/help/add-custom-profile-fields) article for details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account 
 * @member {Number} type
 */
CustomProfileField.prototype['type'] = undefined;

/**
 * Custom profile fields are displayed in both settings UI and UI showing users' profiles in increasing `order`. 
 * @member {Number} order
 */
CustomProfileField.prototype['order'] = undefined;

/**
 * The name of the custom profile field. 
 * @member {String} name
 */
CustomProfileField.prototype['name'] = undefined;

/**
 * The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. 
 * @member {String} hint
 */
CustomProfileField.prototype['hint'] = undefined;

/**
 * Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. 
 * @member {String} field_data
 */
CustomProfileField.prototype['field_data'] = undefined;






export default CustomProfileField;

