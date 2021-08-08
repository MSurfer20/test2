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
import JsonErrorBaseAllOf from './JsonErrorBaseAllOf';
import JsonResponseBase from './JsonResponseBase';

/**
 * The JsonErrorBase model module.
 * @module model/JsonErrorBase
 * @version 1.0.0
 */
class JsonErrorBase {
    /**
     * @member {JsonErrorBase.ResultEnum} result
     * @type {JsonErrorBase.ResultEnum}
     */
    result;
    /**
     * @member {String} msg
     * @type {String}
     */
    msg;

    /**
     * @member {String} result
     * @type {String}
     */
    #result;
    /**
     * @member {JsonErrorBaseAllOf.ResultEnum} result
     * @type {JsonErrorBaseAllOf.ResultEnum}
     */
    #result;
    /**
     * @member {String} msg
     * @type {String}
     */
    #msg;
    

    /**
     * Constructs a new <code>JsonErrorBase</code>.
     * @alias module:model/JsonErrorBase
     * @implements module:model/JsonResponseBase
     * @implements module:model/JsonErrorBaseAllOf
     * @param result {JsonErrorBase.ResultEnum} 
     * @param msg {String} 
     */
    constructor(result, msg) { 
        JsonResponseBase.initialize(this);JsonErrorBaseAllOf.initialize(this, result, msg);
        JsonErrorBase.initialize(this, result, msg);
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
     * Constructs a <code>JsonErrorBase</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/JsonErrorBase} obj Optional instance to populate.
     * @return {module:model/JsonErrorBase} The populated <code>JsonErrorBase</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new JsonErrorBase();
            JsonResponseBase.constructFromObject(data, obj);
            JsonErrorBaseAllOf.constructFromObject(data, obj);

            if (data.hasOwnProperty('result')) {
                obj['result'] = ApiClient.convertToType(data['result'], 'String');
            }
            if (data.hasOwnProperty('msg')) {
                obj['msg'] = ApiClient.convertToType(data['msg'], 'String');
            }
        }
        return obj;
    }
}


/**
 * Allowed values for the <code>result</code> property.
 * @enum {String}
 * @readonly
 */
JsonErrorBase['ResultEnum'] = {

    /**
     * value: "error"
     * @const
     */
    "error": "error"
};



export default JsonErrorBase;

