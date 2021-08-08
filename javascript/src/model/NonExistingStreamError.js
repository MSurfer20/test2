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
import NonExistingStreamErrorAllOf from './NonExistingStreamErrorAllOf';

/**
 * The NonExistingStreamError model module.
 * @module model/NonExistingStreamError
 * @version 1.0.0
 */
class NonExistingStreamError {
    /**
     * Constructs a new <code>NonExistingStreamError</code>.
     * @alias module:model/NonExistingStreamError
     * @implements module:model/CodedErrorBase
     * @implements module:model/NonExistingStreamErrorAllOf
     * @param result {Object} 
     * @param msg {Object} 
     */
    constructor(result, msg) { 
        CodedErrorBase.initialize(this, result, msg);NonExistingStreamErrorAllOf.initialize(this);
        NonExistingStreamError.initialize(this, result, msg);
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
     * Constructs a <code>NonExistingStreamError</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/NonExistingStreamError} obj Optional instance to populate.
     * @return {module:model/NonExistingStreamError} The populated <code>NonExistingStreamError</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NonExistingStreamError();
            CodedErrorBase.constructFromObject(data, obj);
            NonExistingStreamErrorAllOf.constructFromObject(data, obj);

            if (data.hasOwnProperty('result')) {
                obj['result'] = ApiClient.convertToType(data['result'], Object);
            }
            if (data.hasOwnProperty('msg')) {
                obj['msg'] = ApiClient.convertToType(data['msg'], Object);
            }
            if (data.hasOwnProperty('code')) {
                obj['code'] = ApiClient.convertToType(data['code'], Object);
            }
            if (data.hasOwnProperty('stream')) {
                obj['stream'] = ApiClient.convertToType(data['stream'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {Object} result
 */
NonExistingStreamError.prototype['result'] = undefined;

/**
 * @member {Object} msg
 */
NonExistingStreamError.prototype['msg'] = undefined;

/**
 * @member {Object} code
 */
NonExistingStreamError.prototype['code'] = undefined;

/**
 * The name of the stream that could not be found. 
 * @member {String} stream
 */
NonExistingStreamError.prototype['stream'] = undefined;


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
// Implement NonExistingStreamErrorAllOf interface:
/**
 * @member {Object} result
 */
NonExistingStreamErrorAllOf.prototype['result'] = undefined;
/**
 * @member {Object} msg
 */
NonExistingStreamErrorAllOf.prototype['msg'] = undefined;
/**
 * @member {Object} code
 */
NonExistingStreamErrorAllOf.prototype['code'] = undefined;
/**
 * The name of the stream that could not be found. 
 * @member {String} stream
 */
NonExistingStreamErrorAllOf.prototype['stream'] = undefined;




export default NonExistingStreamError;
