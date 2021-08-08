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
import JsonResponseBase from './JsonResponseBase';
import JsonSuccessBaseAllOf from './JsonSuccessBaseAllOf';

/**
 * The JsonSuccessBase model module.
 * @module model/JsonSuccessBase
 * @version 1.0.0
 */
class JsonSuccessBase {
    /**
     * @member {JsonSuccessBase.ResultEnum} result
     * @type {JsonSuccessBase.ResultEnum}
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
     * @member {JsonSuccessBaseAllOf.ResultEnum} result
     * @type {JsonSuccessBaseAllOf.ResultEnum}
     */
    #result;
    /**
     * @member {String} msg
     * @type {String}
     */
    #msg;
    

    /**
     * Constructs a new <code>JsonSuccessBase</code>.
     * @alias module:model/JsonSuccessBase
     * @implements module:model/JsonResponseBase
     * @implements module:model/JsonSuccessBaseAllOf
     * @param result {JsonSuccessBase.ResultEnum} 
     * @param msg {String} 
     */
    constructor(result, msg) { 
        JsonResponseBase.initialize(this);JsonSuccessBaseAllOf.initialize(this, result, msg);
        JsonSuccessBase.initialize(this, result, msg);
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
     * Constructs a <code>JsonSuccessBase</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/JsonSuccessBase} obj Optional instance to populate.
     * @return {module:model/JsonSuccessBase} The populated <code>JsonSuccessBase</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new JsonSuccessBase();
            JsonResponseBase.constructFromObject(data, obj);
            JsonSuccessBaseAllOf.constructFromObject(data, obj);

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
JsonSuccessBase['ResultEnum'] = {

    /**
     * value: "success"
     * @const
     */
    "success": "success"
};



export default JsonSuccessBase;

