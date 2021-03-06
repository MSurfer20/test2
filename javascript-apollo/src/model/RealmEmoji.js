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
 * The RealmEmoji model module.
 * @module model/RealmEmoji
 * @version 1.0.0
 */
class RealmEmoji {
    /**
     * @member {String} id
     * @type {String}
     */
    id;
    /**
     * @member {String} name
     * @type {String}
     */
    name;
    /**
     * @member {String} source_url
     * @type {String}
     */
    source_url;
    /**
     * @member {Boolean} deactivated
     * @type {Boolean}
     */
    deactivated;
    /**
     * @member {Number} author_id
     * @type {Number}
     */
    author_id;

    

    /**
     * Constructs a new <code>RealmEmoji</code>.
     * &#x60;{emoji_id}&#x60;: Object containing details about the emoji with  the specified ID. It has the following properties: 
     * @alias module:model/RealmEmoji
     */
    constructor() { 
        
        RealmEmoji.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>RealmEmoji</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RealmEmoji} obj Optional instance to populate.
     * @return {module:model/RealmEmoji} The populated <code>RealmEmoji</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RealmEmoji();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('source_url')) {
                obj['source_url'] = ApiClient.convertToType(data['source_url'], 'String');
            }
            if (data.hasOwnProperty('deactivated')) {
                obj['deactivated'] = ApiClient.convertToType(data['deactivated'], 'Boolean');
            }
            if (data.hasOwnProperty('author_id')) {
                obj['author_id'] = ApiClient.convertToType(data['author_id'], 'Number');
            }
        }
        return obj;
    }
}



export default RealmEmoji;

