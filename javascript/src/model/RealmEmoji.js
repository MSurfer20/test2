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

/**
 * The ID for this emoji, same as the object's key. 
 * @member {String} id
 */
RealmEmoji.prototype['id'] = undefined;

/**
 * The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (`:name  :`). 
 * @member {String} name
 */
RealmEmoji.prototype['name'] = undefined;

/**
 * The path relative to the organization's URL where the emoji's image can be found. 
 * @member {String} source_url
 */
RealmEmoji.prototype['source_url'] = undefined;

/**
 * Whether the emoji has been deactivated or not. 
 * @member {Boolean} deactivated
 */
RealmEmoji.prototype['deactivated'] = undefined;

/**
 * The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and `author` object with an `id` field. 
 * @member {Number} author_id
 */
RealmEmoji.prototype['author_id'] = undefined;






export default RealmEmoji;

