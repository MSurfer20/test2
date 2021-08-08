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
import OneOfobjectobject from './OneOfobjectobject';

/**
 * The BasicBotBase model module.
 * @module model/BasicBotBase
 * @version 1.0.0
 */
class BasicBotBase {
    /**
     * Constructs a new <code>BasicBotBase</code>.
     * @alias module:model/BasicBotBase
     */
    constructor() { 
        
        BasicBotBase.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>BasicBotBase</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/BasicBotBase} obj Optional instance to populate.
     * @return {module:model/BasicBotBase} The populated <code>BasicBotBase</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BasicBotBase();

            if (data.hasOwnProperty('user_id')) {
                obj['user_id'] = ApiClient.convertToType(data['user_id'], 'Number');
            }
            if (data.hasOwnProperty('full_name')) {
                obj['full_name'] = ApiClient.convertToType(data['full_name'], 'String');
            }
            if (data.hasOwnProperty('api_key')) {
                obj['api_key'] = ApiClient.convertToType(data['api_key'], 'String');
            }
            if (data.hasOwnProperty('default_sending_stream')) {
                obj['default_sending_stream'] = ApiClient.convertToType(data['default_sending_stream'], 'String');
            }
            if (data.hasOwnProperty('default_events_register_stream')) {
                obj['default_events_register_stream'] = ApiClient.convertToType(data['default_events_register_stream'], 'String');
            }
            if (data.hasOwnProperty('default_all_public_streams')) {
                obj['default_all_public_streams'] = ApiClient.convertToType(data['default_all_public_streams'], 'Boolean');
            }
            if (data.hasOwnProperty('avatar_url')) {
                obj['avatar_url'] = ApiClient.convertToType(data['avatar_url'], 'String');
            }
            if (data.hasOwnProperty('owner_id')) {
                obj['owner_id'] = ApiClient.convertToType(data['owner_id'], 'Number');
            }
            if (data.hasOwnProperty('services')) {
                obj['services'] = ApiClient.convertToType(data['services'], [OneOfobjectobject]);
            }
        }
        return obj;
    }


}

/**
 * The user id of the bot. 
 * @member {Number} user_id
 */
BasicBotBase.prototype['user_id'] = undefined;

/**
 * The full name of the bot. 
 * @member {String} full_name
 */
BasicBotBase.prototype['full_name'] = undefined;

/**
 * The API key of the bot which it uses to make API requests. 
 * @member {String} api_key
 */
BasicBotBase.prototype['api_key'] = undefined;

/**
 * The default sending stream of the bot. Null if the bot doesn't have a default sending stream. 
 * @member {String} default_sending_stream
 */
BasicBotBase.prototype['default_sending_stream'] = undefined;

/**
 * The default stream for which the bot receives events/register data. Null if the bot doesn't have such a default stream. 
 * @member {String} default_events_register_stream
 */
BasicBotBase.prototype['default_events_register_stream'] = undefined;

/**
 * Whether the bot can send messages to all streams by default. 
 * @member {Boolean} default_all_public_streams
 */
BasicBotBase.prototype['default_all_public_streams'] = undefined;

/**
 * The URL of the bot's avatar. 
 * @member {String} avatar_url
 */
BasicBotBase.prototype['avatar_url'] = undefined;

/**
 * The user id of the bot's owner.  Null if the bot has no owner. 
 * @member {Number} owner_id
 */
BasicBotBase.prototype['owner_id'] = undefined;

/**
 * The \"Services\" array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change. 
 * @member {Array.<module:model/OneOfobjectobject>} services
 */
BasicBotBase.prototype['services'] = undefined;






export default BasicBotBase;
