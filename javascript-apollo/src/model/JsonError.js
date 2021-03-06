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
import JsonErrorBase from './JsonErrorBase';
import JsonSuccessAllOf from './JsonSuccessAllOf';

/**
 * The JsonError model module.
 * @module model/JsonError
 * @version 1.0.0
 */
class JsonError {
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
     * @member {JsonErrorBase.ResultEnum} result
     * @type {JsonErrorBase.ResultEnum}
     */
    #result;
    /**
     * @member {String} msg
     * @type {String}
     */
    #msg;
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
     * Constructs a new <code>JsonError</code>.
     * @alias module:model/JsonError
     * @implements module:model/JsonErrorBase
     * @implements module:model/JsonSuccessAllOf
     * @param result {AnyType} 
     * @param msg {AnyType} 
     */
    constructor(result, msg) { 
        JsonErrorBase.initialize(this, result, msg);JsonSuccessAllOf.initialize(this);
        JsonError.initialize(this, result, msg);
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
     * Constructs a <code>JsonError</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/JsonError} obj Optional instance to populate.
     * @return {module:model/JsonError} The populated <code>JsonError</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new JsonError();
            JsonErrorBase.constructFromObject(data, obj);
            JsonSuccessAllOf.constructFromObject(data, obj);

            if (data.hasOwnProperty('result')) {
                obj['result'] = ApiClient.convertToType(data['result'], AnyType);
            }
            if (data.hasOwnProperty('msg')) {
                obj['msg'] = ApiClient.convertToType(data['msg'], AnyType);
            }
        }
        return obj;
    }
}



export default JsonError;

