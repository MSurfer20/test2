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
 * The AddSubscriptionsResponseAllOf model module.
 * @module model/AddSubscriptionsResponseAllOf
 * @version 1.0.0
 */
class AddSubscriptionsResponseAllOf {
    /**
     * Constructs a new <code>AddSubscriptionsResponseAllOf</code>.
     * @alias module:model/AddSubscriptionsResponseAllOf
     */
    constructor() { 
        
        AddSubscriptionsResponseAllOf.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>AddSubscriptionsResponseAllOf</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/AddSubscriptionsResponseAllOf} obj Optional instance to populate.
     * @return {module:model/AddSubscriptionsResponseAllOf} The populated <code>AddSubscriptionsResponseAllOf</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AddSubscriptionsResponseAllOf();

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






export default AddSubscriptionsResponseAllOf;
