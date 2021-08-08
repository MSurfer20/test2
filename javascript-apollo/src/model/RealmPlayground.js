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
 * The RealmPlayground model module.
 * @module model/RealmPlayground
 * @version 1.0.0
 */
class RealmPlayground {
    /**
     * @member {Number} id
     * @type {Number}
     */
    id;
    /**
     * @member {String} name
     * @type {String}
     */
    name;
    /**
     * @member {String} pygments_language
     * @type {String}
     */
    pygments_language;
    /**
     * @member {String} url_prefix
     * @type {String}
     */
    url_prefix;

    

    /**
     * Constructs a new <code>RealmPlayground</code>.
     * Object containing details about a realm playground. 
     * @alias module:model/RealmPlayground
     */
    constructor() { 
        
        RealmPlayground.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>RealmPlayground</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RealmPlayground} obj Optional instance to populate.
     * @return {module:model/RealmPlayground} The populated <code>RealmPlayground</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RealmPlayground();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('pygments_language')) {
                obj['pygments_language'] = ApiClient.convertToType(data['pygments_language'], 'String');
            }
            if (data.hasOwnProperty('url_prefix')) {
                obj['url_prefix'] = ApiClient.convertToType(data['url_prefix'], 'String');
            }
        }
        return obj;
    }
}



export default RealmPlayground;

