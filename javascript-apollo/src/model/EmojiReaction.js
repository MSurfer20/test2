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
import EmojiReactionAllOf from './EmojiReactionAllOf';
import EmojiReactionBase from './EmojiReactionBase';

/**
 * The EmojiReaction model module.
 * @module model/EmojiReaction
 * @version 1.0.0
 */
class EmojiReaction {
    /**
     * @member {AnyType} emoji_code
     * @type {AnyType}
     */
    emoji_code;
    /**
     * @member {AnyType} emoji_name
     * @type {AnyType}
     */
    emoji_name;
    /**
     * @member {AnyType} reaction_type
     * @type {AnyType}
     */
    reaction_type;
    /**
     * @member {AnyType} user_id
     * @type {AnyType}
     */
    user_id;
    /**
     * @member {AnyType} user
     * @type {AnyType}
     */
    user;

    /**
     * @member {String} emoji_code
     * @type {String}
     */
    #emoji_code;
    /**
     * @member {String} emoji_name
     * @type {String}
     */
    #emoji_name;
    /**
     * @member {String} reaction_type
     * @type {String}
     */
    #reaction_type;
    /**
     * @member {Number} user_id
     * @type {Number}
     */
    #user_id;
    /**
     * @member {EmojiReactionBaseAllOfUser} user
     * @type {EmojiReactionBaseAllOfUser}
     */
    #user;
    /**
     * @member {AnyType} emoji_code
     * @type {AnyType}
     */
    #emoji_code;
    /**
     * @member {AnyType} emoji_name
     * @type {AnyType}
     */
    #emoji_name;
    /**
     * @member {AnyType} reaction_type
     * @type {AnyType}
     */
    #reaction_type;
    /**
     * @member {AnyType} user_id
     * @type {AnyType}
     */
    #user_id;
    /**
     * @member {AnyType} user
     * @type {AnyType}
     */
    #user;
    

    /**
     * Constructs a new <code>EmojiReaction</code>.
     * @alias module:model/EmojiReaction
     * @implements module:model/EmojiReactionBase
     * @implements module:model/EmojiReactionAllOf
     */
    constructor() { 
        EmojiReactionBase.initialize(this);EmojiReactionAllOf.initialize(this);
        EmojiReaction.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>EmojiReaction</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/EmojiReaction} obj Optional instance to populate.
     * @return {module:model/EmojiReaction} The populated <code>EmojiReaction</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EmojiReaction();
            EmojiReactionBase.constructFromObject(data, obj);
            EmojiReactionAllOf.constructFromObject(data, obj);

            if (data.hasOwnProperty('emoji_code')) {
                obj['emoji_code'] = ApiClient.convertToType(data['emoji_code'], AnyType);
            }
            if (data.hasOwnProperty('emoji_name')) {
                obj['emoji_name'] = ApiClient.convertToType(data['emoji_name'], AnyType);
            }
            if (data.hasOwnProperty('reaction_type')) {
                obj['reaction_type'] = ApiClient.convertToType(data['reaction_type'], AnyType);
            }
            if (data.hasOwnProperty('user_id')) {
                obj['user_id'] = ApiClient.convertToType(data['user_id'], AnyType);
            }
            if (data.hasOwnProperty('user')) {
                obj['user'] = ApiClient.convertToType(data['user'], AnyType);
            }
        }
        return obj;
    }
}



export default EmojiReaction;

