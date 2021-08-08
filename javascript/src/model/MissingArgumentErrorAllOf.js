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
 * The MissingArgumentErrorAllOf model module.
 * @module model/MissingArgumentErrorAllOf
 * @version 1.0.0
 */
class MissingArgumentErrorAllOf {
    /**
     * Constructs a new <code>MissingArgumentErrorAllOf</code>.
     * ## Missing request parameter(s)  A typical failed JSON response for when a required request parameter is not supplied 
     * @alias module:model/MissingArgumentErrorAllOf
     */
    constructor() { 
        
        MissingArgumentErrorAllOf.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>MissingArgumentErrorAllOf</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/MissingArgumentErrorAllOf} obj Optional instance to populate.
     * @return {module:model/MissingArgumentErrorAllOf} The populated <code>MissingArgumentErrorAllOf</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MissingArgumentErrorAllOf();

            if (data.hasOwnProperty('result')) {
                obj['result'] = ApiClient.convertToType(data['result'], Object);
            }
            if (data.hasOwnProperty('msg')) {
                obj['msg'] = ApiClient.convertToType(data['msg'], Object);
            }
            if (data.hasOwnProperty('code')) {
                obj['code'] = ApiClient.convertToType(data['code'], Object);
            }
            if (data.hasOwnProperty('var_name')) {
                obj['var_name'] = ApiClient.convertToType(data['var_name'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {Object} result
 */
MissingArgumentErrorAllOf.prototype['result'] = undefined;

/**
 * @member {Object} msg
 */
MissingArgumentErrorAllOf.prototype['msg'] = undefined;

/**
 * @member {Object} code
 */
MissingArgumentErrorAllOf.prototype['code'] = undefined;

/**
 * It contains the information about the missing parameter. 
 * @member {String} var_name
 */
MissingArgumentErrorAllOf.prototype['var_name'] = undefined;






export default MissingArgumentErrorAllOf;
