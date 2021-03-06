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
import CodedErrorBase from './CodedErrorBase';
import MissingArgumentErrorAllOf from './MissingArgumentErrorAllOf';

/**
 * The MissingArgumentError model module.
 * @module model/MissingArgumentError
 * @version 1.0.0
 */
class MissingArgumentError {
    /**
     * Constructs a new <code>MissingArgumentError</code>.
     * @alias module:model/MissingArgumentError
     * @implements module:model/CodedErrorBase
     * @implements module:model/MissingArgumentErrorAllOf
     * @param result {Object} 
     * @param msg {Object} 
     */
    constructor(result, msg) { 
        CodedErrorBase.initialize(this, result, msg);MissingArgumentErrorAllOf.initialize(this);
        MissingArgumentError.initialize(this, result, msg);
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
     * Constructs a <code>MissingArgumentError</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/MissingArgumentError} obj Optional instance to populate.
     * @return {module:model/MissingArgumentError} The populated <code>MissingArgumentError</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MissingArgumentError();
            CodedErrorBase.constructFromObject(data, obj);
            MissingArgumentErrorAllOf.constructFromObject(data, obj);

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
MissingArgumentError.prototype['result'] = undefined;

/**
 * @member {Object} msg
 */
MissingArgumentError.prototype['msg'] = undefined;

/**
 * @member {Object} code
 */
MissingArgumentError.prototype['code'] = undefined;

/**
 * It contains the information about the missing parameter. 
 * @member {String} var_name
 */
MissingArgumentError.prototype['var_name'] = undefined;


// Implement CodedErrorBase interface:
/**
 * @member {Object} result
 */
CodedErrorBase.prototype['result'] = undefined;
/**
 * @member {Object} msg
 */
CodedErrorBase.prototype['msg'] = undefined;
/**
 * A string that identifies the error. 
 * @member {String} code
 */
CodedErrorBase.prototype['code'] = undefined;
// Implement MissingArgumentErrorAllOf interface:
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




export default MissingArgumentError;

