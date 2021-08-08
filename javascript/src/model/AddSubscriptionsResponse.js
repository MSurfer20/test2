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
import AddSubscriptionsResponseAllOf from './AddSubscriptionsResponseAllOf';
import JsonSuccessBase from './JsonSuccessBase';

/**
 * The AddSubscriptionsResponse model module.
 * @module model/AddSubscriptionsResponse
 * @version 1.0.0
 */
class AddSubscriptionsResponse {
    /**
     * Constructs a new <code>AddSubscriptionsResponse</code>.
     * @alias module:model/AddSubscriptionsResponse
     * @implements module:model/JsonSuccessBase
     * @implements module:model/AddSubscriptionsResponseAllOf
     * @param result {Object} 
     * @param msg {Object} 
     */
    constructor(result, msg) { 
        JsonSuccessBase.initialize(this, result, msg);AddSubscriptionsResponseAllOf.initialize(this);
        AddSubscriptionsResponse.initialize(this, result, msg);
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
     * Constructs a <code>AddSubscriptionsResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/AddSubscriptionsResponse} obj Optional instance to populate.
     * @return {module:model/AddSubscriptionsResponse} The populated <code>AddSubscriptionsResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AddSubscriptionsResponse();
            JsonSuccessBase.constructFromObject(data, obj);
            AddSubscriptionsResponseAllOf.constructFromObject(data, obj);

            if (data.hasOwnProperty('result')) {
                obj['result'] = ApiClient.convertToType(data['result'], Object);
            }
            if (data.hasOwnProperty('msg')) {
                obj['msg'] = ApiClient.convertToType(data['msg'], Object);
            }
            if (data.hasOwnProperty('subscribed')) {
                obj['subscribed'] = ApiClient.convertToType(data['subscribed'], {'String': ['String']});
            }
            if (data.hasOwnProperty('already_subscribed')) {
                obj['already_subscribed'] = ApiClient.convertToType(data['already_subscribed'], {'String': ['String']});
            }
            if (data.hasOwnProperty('unauthorized')) {
                obj['unauthorized'] = ApiClient.convertToType(data['unauthorized'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * @member {Object} result
 */
AddSubscriptionsResponse.prototype['result'] = undefined;

/**
 * @member {Object} msg
 */
AddSubscriptionsResponse.prototype['msg'] = undefined;

/**
 * A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. 
 * @member {Object.<String, Array.<String>>} subscribed
 */
AddSubscriptionsResponse.prototype['subscribed'] = undefined;

/**
 * A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. 
 * @member {Object.<String, Array.<String>>} already_subscribed
 */
AddSubscriptionsResponse.prototype['already_subscribed'] = undefined;

/**
 * A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`. 
 * @member {Array.<String>} unauthorized
 */
AddSubscriptionsResponse.prototype['unauthorized'] = undefined;


// Implement JsonSuccessBase interface:
/**
 * @member {module:model/JsonSuccessBase.ResultEnum} result
 */
JsonSuccessBase.prototype['result'] = undefined;
/**
 * @member {String} msg
 */
JsonSuccessBase.prototype['msg'] = undefined;
// Implement AddSubscriptionsResponseAllOf interface:
/**
 * @member {Object} result
 */
AddSubscriptionsResponseAllOf.prototype['result'] = undefined;
/**
 * @member {Object} msg
 */
AddSubscriptionsResponseAllOf.prototype['msg'] = undefined;
/**
 * A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. 
 * @member {Object.<String, Array.<String>>} subscribed
 */
AddSubscriptionsResponseAllOf.prototype['subscribed'] = undefined;
/**
 * A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. 
 * @member {Object.<String, Array.<String>>} already_subscribed
 */
AddSubscriptionsResponseAllOf.prototype['already_subscribed'] = undefined;
/**
 * A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`. 
 * @member {Array.<String>} unauthorized
 */
AddSubscriptionsResponseAllOf.prototype['unauthorized'] = undefined;




export default AddSubscriptionsResponse;

