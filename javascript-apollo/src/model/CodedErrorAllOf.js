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
 * The CodedErrorAllOf model module.
 * @module model/CodedErrorAllOf
 * @version 1.0.0
 */
class CodedErrorAllOf {
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
     * @member {AnyType} code
     * @type {AnyType}
     */
    code;

    

    /**
     * Constructs a new <code>CodedErrorAllOf</code>.
     * @alias module:model/CodedErrorAllOf
     */
    constructor() { 
        
        CodedErrorAllOf.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CodedErrorAllOf</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CodedErrorAllOf} obj Optional instance to populate.
     * @return {module:model/CodedErrorAllOf} The populated <code>CodedErrorAllOf</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CodedErrorAllOf();

            if (data.hasOwnProperty('result')) {
                obj['result'] = ApiClient.convertToType(data['result'], AnyType);
            }
            if (data.hasOwnProperty('msg')) {
                obj['msg'] = ApiClient.convertToType(data['msg'], AnyType);
            }
            if (data.hasOwnProperty('code')) {
                obj['code'] = ApiClient.convertToType(data['code'], AnyType);
            }
        }
        return obj;
    }
}



export default CodedErrorAllOf;

