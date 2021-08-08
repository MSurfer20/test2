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
 * The RealmExport model module.
 * @module model/RealmExport
 * @version 1.0.0
 */
class RealmExport {
    /**
     * Constructs a new <code>RealmExport</code>.
     * Object containing details about a realm export. 
     * @alias module:model/RealmExport
     */
    constructor() { 
        
        RealmExport.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>RealmExport</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RealmExport} obj Optional instance to populate.
     * @return {module:model/RealmExport} The populated <code>RealmExport</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RealmExport();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('acting_user_id')) {
                obj['acting_user_id'] = ApiClient.convertToType(data['acting_user_id'], 'Number');
            }
            if (data.hasOwnProperty('export_time')) {
                obj['export_time'] = ApiClient.convertToType(data['export_time'], 'Number');
            }
            if (data.hasOwnProperty('deleted_timestamp')) {
                obj['deleted_timestamp'] = ApiClient.convertToType(data['deleted_timestamp'], 'Number');
            }
            if (data.hasOwnProperty('failed_timestamp')) {
                obj['failed_timestamp'] = ApiClient.convertToType(data['failed_timestamp'], 'Number');
            }
            if (data.hasOwnProperty('export_url')) {
                obj['export_url'] = ApiClient.convertToType(data['export_url'], 'String');
            }
            if (data.hasOwnProperty('pending')) {
                obj['pending'] = ApiClient.convertToType(data['pending'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * The id of the export. 
 * @member {Number} id
 */
RealmExport.prototype['id'] = undefined;

/**
 * The id of the user who did the export. 
 * @member {Number} acting_user_id
 */
RealmExport.prototype['acting_user_id'] = undefined;

/**
 * The UNIX timestamp of when the export was made. 
 * @member {Number} export_time
 */
RealmExport.prototype['export_time'] = undefined;

/**
 * The timestamp of when the export was deleted. Null if it wasn't. 
 * @member {Number} deleted_timestamp
 */
RealmExport.prototype['deleted_timestamp'] = undefined;

/**
 * The timestamp of when the export failed. Null if it didn't. 
 * @member {Number} failed_timestamp
 */
RealmExport.prototype['failed_timestamp'] = undefined;

/**
 * The URL of the export. `null` if there's no URL. 
 * @member {String} export_url
 */
RealmExport.prototype['export_url'] = undefined;

/**
 * Whether the export is pending or not. 
 * @member {Boolean} pending
 */
RealmExport.prototype['pending'] = undefined;






export default RealmExport;
