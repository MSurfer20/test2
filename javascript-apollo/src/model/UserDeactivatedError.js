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
import CodedError from './CodedError';

/**
 * The UserDeactivatedError model module.
 * @module model/UserDeactivatedError
 * @version 1.0.0
 */
class UserDeactivatedError {
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
     * @member {AnyType} result
     * @type {AnyType}
     */
    #result;
    /**
     * @member {AnyType} msg
     * @type {AnyType}
     */
    #msg;
    /**
     * @member {AnyType} code
     * @type {AnyType}
     */
    #code;
    

    /**
     * Constructs a new <code>UserDeactivatedError</code>.
     * @alias module:model/UserDeactivatedError
     * @implements module:model/CodedError
     * @param result {AnyType} 
     * @param msg {AnyType} 
     */
    constructor(result, msg) { 
        CodedError.initialize(this, result, msg);
        UserDeactivatedError.initialize(this, result, msg);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, result, msg) { 
        obj['result'] = result;
        obj['msg'] = msg;
    }

    /**
     * Constructs a <code>UserDeactivatedError</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UserDeactivatedError} obj Optional instance to populate.
     * @return {module:model/UserDeactivatedError} The populated <code>UserDeactivatedError</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UserDeactivatedError();
            CodedError.constructFromObject(data, obj);

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



export default UserDeactivatedError;

