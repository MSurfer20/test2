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
 * The UserAllOf model module.
 * @module model/UserAllOf
 * @version 1.0.0
 */
class UserAllOf {
    /**
     * @member {AnyType} email
     * @type {AnyType}
     */
    email;
    /**
     * @member {AnyType} is_bot
     * @type {AnyType}
     */
    is_bot;
    /**
     * @member {AnyType} avatar_url
     * @type {AnyType}
     */
    avatar_url;
    /**
     * @member {AnyType} avatar_version
     * @type {AnyType}
     */
    avatar_version;
    /**
     * @member {AnyType} full_name
     * @type {AnyType}
     */
    full_name;
    /**
     * @member {AnyType} is_admin
     * @type {AnyType}
     */
    is_admin;
    /**
     * @member {AnyType} is_owner
     * @type {AnyType}
     */
    is_owner;
    /**
     * @member {AnyType} is_billing_admin
     * @type {AnyType}
     */
    is_billing_admin;
    /**
     * @member {AnyType} role
     * @type {AnyType}
     */
    role;
    /**
     * @member {AnyType} bot_type
     * @type {AnyType}
     */
    bot_type;
    /**
     * @member {AnyType} user_id
     * @type {AnyType}
     */
    user_id;
    /**
     * @member {AnyType} bot_owner_id
     * @type {AnyType}
     */
    bot_owner_id;
    /**
     * @member {AnyType} is_active
     * @type {AnyType}
     */
    is_active;
    /**
     * @member {AnyType} is_guest
     * @type {AnyType}
     */
    is_guest;
    /**
     * @member {AnyType} timezone
     * @type {AnyType}
     */
    timezone;
    /**
     * @member {AnyType} date_joined
     * @type {AnyType}
     */
    date_joined;
    /**
     * @member {AnyType} delivery_email
     * @type {AnyType}
     */
    delivery_email;
    /**
     * @member {AnyType} profile_data
     * @type {AnyType}
     */
    profile_data;

    

    /**
     * Constructs a new <code>UserAllOf</code>.
     * @alias module:model/UserAllOf
     */
    constructor() { 
        
        UserAllOf.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>UserAllOf</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UserAllOf} obj Optional instance to populate.
     * @return {module:model/UserAllOf} The populated <code>UserAllOf</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UserAllOf();

            if (data.hasOwnProperty('email')) {
                obj['email'] = ApiClient.convertToType(data['email'], AnyType);
            }
            if (data.hasOwnProperty('is_bot')) {
                obj['is_bot'] = ApiClient.convertToType(data['is_bot'], AnyType);
            }
            if (data.hasOwnProperty('avatar_url')) {
                obj['avatar_url'] = ApiClient.convertToType(data['avatar_url'], AnyType);
            }
            if (data.hasOwnProperty('avatar_version')) {
                obj['avatar_version'] = ApiClient.convertToType(data['avatar_version'], AnyType);
            }
            if (data.hasOwnProperty('full_name')) {
                obj['full_name'] = ApiClient.convertToType(data['full_name'], AnyType);
            }
            if (data.hasOwnProperty('is_admin')) {
                obj['is_admin'] = ApiClient.convertToType(data['is_admin'], AnyType);
            }
            if (data.hasOwnProperty('is_owner')) {
                obj['is_owner'] = ApiClient.convertToType(data['is_owner'], AnyType);
            }
            if (data.hasOwnProperty('is_billing_admin')) {
                obj['is_billing_admin'] = ApiClient.convertToType(data['is_billing_admin'], AnyType);
            }
            if (data.hasOwnProperty('role')) {
                obj['role'] = ApiClient.convertToType(data['role'], AnyType);
            }
            if (data.hasOwnProperty('bot_type')) {
                obj['bot_type'] = ApiClient.convertToType(data['bot_type'], AnyType);
            }
            if (data.hasOwnProperty('user_id')) {
                obj['user_id'] = ApiClient.convertToType(data['user_id'], AnyType);
            }
            if (data.hasOwnProperty('bot_owner_id')) {
                obj['bot_owner_id'] = ApiClient.convertToType(data['bot_owner_id'], AnyType);
            }
            if (data.hasOwnProperty('is_active')) {
                obj['is_active'] = ApiClient.convertToType(data['is_active'], AnyType);
            }
            if (data.hasOwnProperty('is_guest')) {
                obj['is_guest'] = ApiClient.convertToType(data['is_guest'], AnyType);
            }
            if (data.hasOwnProperty('timezone')) {
                obj['timezone'] = ApiClient.convertToType(data['timezone'], AnyType);
            }
            if (data.hasOwnProperty('date_joined')) {
                obj['date_joined'] = ApiClient.convertToType(data['date_joined'], AnyType);
            }
            if (data.hasOwnProperty('delivery_email')) {
                obj['delivery_email'] = ApiClient.convertToType(data['delivery_email'], AnyType);
            }
            if (data.hasOwnProperty('profile_data')) {
                obj['profile_data'] = ApiClient.convertToType(data['profile_data'], AnyType);
            }
        }
        return obj;
    }
}



export default UserAllOf;

