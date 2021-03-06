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
import AnyType from './AnyType';

/**
 * The InvalidMessageErrorAllOf model module.
 * @module model/InvalidMessageErrorAllOf
 * @version 1.0.0
 */
class InvalidMessageErrorAllOf {
    /**
     * @member {AnyType} result
     * @type {AnyType}
     */
    result;
    /**
     * @member {AnyType} msg
     * @type {AnyType}
     */
    msg;
    /**
     * @member {String} raw_content
     * @type {String}
     */
    raw_content;

    

    /**
     * Constructs a new <code>InvalidMessageErrorAllOf</code>.
     * @alias module:model/InvalidMessageErrorAllOf
     */
    constructor() { 
        
        InvalidMessageErrorAllOf.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InvalidMessageErrorAllOf</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InvalidMessageErrorAllOf} obj Optional instance to populate.
     * @return {module:model/InvalidMessageErrorAllOf} The populated <code>InvalidMessageErrorAllOf</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InvalidMessageErrorAllOf();

            if (data.hasOwnProperty('result')) {
                obj['result'] = ApiClient.convertToType(data['result'], AnyType);
            }
            if (data.hasOwnProperty('msg')) {
                obj['msg'] = ApiClient.convertToType(data['msg'], AnyType);
            }
            if (data.hasOwnProperty('raw_content')) {
                obj['raw_content'] = ApiClient.convertToType(data['raw_content'], 'String');
            }
        }
        return obj;
    }
}



export default InvalidMessageErrorAllOf;

