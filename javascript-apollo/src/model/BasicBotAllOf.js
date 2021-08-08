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
 * The BasicBotAllOf model module.
 * @module model/BasicBotAllOf
 * @version 1.0.0
 */
class BasicBotAllOf {
    /**
     * @member {AnyType} user_id
     * @type {AnyType}
     */
    user_id;
    /**
     * @member {AnyType} full_name
     * @type {AnyType}
     */
    full_name;
    /**
     * @member {AnyType} api_key
     * @type {AnyType}
     */
    api_key;
    /**
     * @member {AnyType} default_sending_stream
     * @type {AnyType}
     */
    default_sending_stream;
    /**
     * @member {AnyType} default_events_register_stream
     * @type {AnyType}
     */
    default_events_register_stream;
    /**
     * @member {AnyType} default_all_public_streams
     * @type {AnyType}
     */
    default_all_public_streams;
    /**
     * @member {AnyType} avatar_url
     * @type {AnyType}
     */
    avatar_url;
    /**
     * @member {AnyType} owner_id
     * @type {AnyType}
     */
    owner_id;
    /**
     * @member {AnyType} services
     * @type {AnyType}
     */
    services;

    

    /**
     * Constructs a new <code>BasicBotAllOf</code>.
     * @alias module:model/BasicBotAllOf
     */
    constructor() { 
        
        BasicBotAllOf.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>BasicBotAllOf</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/BasicBotAllOf} obj Optional instance to populate.
     * @return {module:model/BasicBotAllOf} The populated <code>BasicBotAllOf</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BasicBotAllOf();

            if (data.hasOwnProperty('user_id')) {
                obj['user_id'] = ApiClient.convertToType(data['user_id'], AnyType);
            }
            if (data.hasOwnProperty('full_name')) {
                obj['full_name'] = ApiClient.convertToType(data['full_name'], AnyType);
            }
            if (data.hasOwnProperty('api_key')) {
                obj['api_key'] = ApiClient.convertToType(data['api_key'], AnyType);
            }
            if (data.hasOwnProperty('default_sending_stream')) {
                obj['default_sending_stream'] = ApiClient.convertToType(data['default_sending_stream'], AnyType);
            }
            if (data.hasOwnProperty('default_events_register_stream')) {
                obj['default_events_register_stream'] = ApiClient.convertToType(data['default_events_register_stream'], AnyType);
            }
            if (data.hasOwnProperty('default_all_public_streams')) {
                obj['default_all_public_streams'] = ApiClient.convertToType(data['default_all_public_streams'], AnyType);
            }
            if (data.hasOwnProperty('avatar_url')) {
                obj['avatar_url'] = ApiClient.convertToType(data['avatar_url'], AnyType);
            }
            if (data.hasOwnProperty('owner_id')) {
                obj['owner_id'] = ApiClient.convertToType(data['owner_id'], AnyType);
            }
            if (data.hasOwnProperty('services')) {
                obj['services'] = ApiClient.convertToType(data['services'], AnyType);
            }
        }
        return obj;
    }
}



export default BasicBotAllOf;
