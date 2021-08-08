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
import EmojiReactionBaseAllOfUser from './EmojiReactionBaseAllOfUser';

/**
 * The EmojiReactionBaseAllOf model module.
 * @module model/EmojiReactionBaseAllOf
 * @version 1.0.0
 */
class EmojiReactionBaseAllOf {
    /**
     * Constructs a new <code>EmojiReactionBaseAllOf</code>.
     * @alias module:model/EmojiReactionBaseAllOf
     */
    constructor() { 
        
        EmojiReactionBaseAllOf.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>EmojiReactionBaseAllOf</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/EmojiReactionBaseAllOf} obj Optional instance to populate.
     * @return {module:model/EmojiReactionBaseAllOf} The populated <code>EmojiReactionBaseAllOf</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EmojiReactionBaseAllOf();

            if (data.hasOwnProperty('user_id')) {
                obj['user_id'] = ApiClient.convertToType(data['user_id'], 'Number');
            }
            if (data.hasOwnProperty('user')) {
                obj['user'] = EmojiReactionBaseAllOfUser.constructFromObject(data['user']);
            }
        }
        return obj;
    }


}

/**
 * The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future. 
 * @member {Number} user_id
 */
EmojiReactionBaseAllOf.prototype['user_id'] = undefined;

/**
 * @member {module:model/EmojiReactionBaseAllOfUser} user
 */
EmojiReactionBaseAllOf.prototype['user'] = undefined;






export default EmojiReactionBaseAllOf;

