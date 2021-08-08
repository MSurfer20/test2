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
     * @member {Number} id
     * @type {Number}
     */
    id;
    /**
     * @member {Number} type
     * @type {Number}
     */
    type;
    /**
     * @member {Number} order
     * @type {Number}
     */
    order;
    /**
     * @member {String} name
     * @type {String}
     */
    name;
    /**
     * @member {String} hint
     * @type {String}
     */
    hint;
    /**
     * @member {String} field_data
     * @type {String}
     */
    field_data;

    

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



export default CustomProfileField;

