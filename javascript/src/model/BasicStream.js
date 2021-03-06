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
import BasicStreamAllOf from './BasicStreamAllOf';
import BasicStreamBase from './BasicStreamBase';

/**
 * The BasicStream model module.
 * @module model/BasicStream
 * @version 1.0.0
 */
class BasicStream {
    /**
     * Constructs a new <code>BasicStream</code>.
     * @alias module:model/BasicStream
     * @implements module:model/BasicStreamBase
     * @implements module:model/BasicStreamAllOf
     */
    constructor() { 
        BasicStreamBase.initialize(this);BasicStreamAllOf.initialize(this);
        BasicStream.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>BasicStream</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/BasicStream} obj Optional instance to populate.
     * @return {module:model/BasicStream} The populated <code>BasicStream</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BasicStream();
            BasicStreamBase.constructFromObject(data, obj);
            BasicStreamAllOf.constructFromObject(data, obj);

            if (data.hasOwnProperty('stream_id')) {
                obj['stream_id'] = ApiClient.convertToType(data['stream_id'], Object);
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], Object);
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], Object);
            }
            if (data.hasOwnProperty('date_created')) {
                obj['date_created'] = ApiClient.convertToType(data['date_created'], Object);
            }
            if (data.hasOwnProperty('invite_only')) {
                obj['invite_only'] = ApiClient.convertToType(data['invite_only'], Object);
            }
            if (data.hasOwnProperty('rendered_description')) {
                obj['rendered_description'] = ApiClient.convertToType(data['rendered_description'], Object);
            }
            if (data.hasOwnProperty('is_web_public')) {
                obj['is_web_public'] = ApiClient.convertToType(data['is_web_public'], Object);
            }
            if (data.hasOwnProperty('stream_post_policy')) {
                obj['stream_post_policy'] = ApiClient.convertToType(data['stream_post_policy'], Object);
            }
            if (data.hasOwnProperty('message_retention_days')) {
                obj['message_retention_days'] = ApiClient.convertToType(data['message_retention_days'], Object);
            }
            if (data.hasOwnProperty('history_public_to_subscribers')) {
                obj['history_public_to_subscribers'] = ApiClient.convertToType(data['history_public_to_subscribers'], Object);
            }
            if (data.hasOwnProperty('first_message_id')) {
                obj['first_message_id'] = ApiClient.convertToType(data['first_message_id'], Object);
            }
            if (data.hasOwnProperty('is_announcement_only')) {
                obj['is_announcement_only'] = ApiClient.convertToType(data['is_announcement_only'], Object);
            }
        }
        return obj;
    }


}

/**
 * @member {Object} stream_id
 */
BasicStream.prototype['stream_id'] = undefined;

/**
 * @member {Object} name
 */
BasicStream.prototype['name'] = undefined;

/**
 * @member {Object} description
 */
BasicStream.prototype['description'] = undefined;

/**
 * @member {Object} date_created
 */
BasicStream.prototype['date_created'] = undefined;

/**
 * @member {Object} invite_only
 */
BasicStream.prototype['invite_only'] = undefined;

/**
 * @member {Object} rendered_description
 */
BasicStream.prototype['rendered_description'] = undefined;

/**
 * @member {Object} is_web_public
 */
BasicStream.prototype['is_web_public'] = undefined;

/**
 * @member {Object} stream_post_policy
 */
BasicStream.prototype['stream_post_policy'] = undefined;

/**
 * @member {Object} message_retention_days
 */
BasicStream.prototype['message_retention_days'] = undefined;

/**
 * @member {Object} history_public_to_subscribers
 */
BasicStream.prototype['history_public_to_subscribers'] = undefined;

/**
 * @member {Object} first_message_id
 */
BasicStream.prototype['first_message_id'] = undefined;

/**
 * @member {Object} is_announcement_only
 */
BasicStream.prototype['is_announcement_only'] = undefined;


// Implement BasicStreamBase interface:
/**
 * The unique ID of the stream. 
 * @member {Number} stream_id
 */
BasicStreamBase.prototype['stream_id'] = undefined;
/**
 * The name of the stream. 
 * @member {String} name
 */
BasicStreamBase.prototype['name'] = undefined;
/**
 * The short description of the stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description. 
 * @member {String} description
 */
BasicStreamBase.prototype['description'] = undefined;
/**
 * The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). 
 * @member {Number} date_created
 */
BasicStreamBase.prototype['date_created'] = undefined;
/**
 * Specifies whether the stream is private or not. Only people who have been invited can access a private stream. 
 * @member {Boolean} invite_only
 */
BasicStreamBase.prototype['invite_only'] = undefined;
/**
 * The short description of the stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. 
 * @member {String} rendered_description
 */
BasicStreamBase.prototype['rendered_description'] = undefined;
/**
 * Whether the stream has been configured to allow unauthenticated access to its message history from the web. 
 * @member {Boolean} is_web_public
 */
BasicStreamBase.prototype['is_web_public'] = undefined;
/**
 * Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
 * @member {Number} stream_post_policy
 */
BasicStreamBase.prototype['stream_post_policy'] = undefined;
/**
 * Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
 * @member {Number} message_retention_days
 */
BasicStreamBase.prototype['message_retention_days'] = undefined;
/**
 * Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future. 
 * @member {Boolean} history_public_to_subscribers
 */
BasicStreamBase.prototype['history_public_to_subscribers'] = undefined;
/**
 * The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. 
 * @member {Number} first_message_id
 */
BasicStreamBase.prototype['first_message_id'] = undefined;
/**
 * Whether the given stream is announcement only or not.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead. 
 * @member {Boolean} is_announcement_only
 */
BasicStreamBase.prototype['is_announcement_only'] = undefined;
// Implement BasicStreamAllOf interface:
/**
 * @member {Object} stream_id
 */
BasicStreamAllOf.prototype['stream_id'] = undefined;
/**
 * @member {Object} name
 */
BasicStreamAllOf.prototype['name'] = undefined;
/**
 * @member {Object} description
 */
BasicStreamAllOf.prototype['description'] = undefined;
/**
 * @member {Object} date_created
 */
BasicStreamAllOf.prototype['date_created'] = undefined;
/**
 * @member {Object} invite_only
 */
BasicStreamAllOf.prototype['invite_only'] = undefined;
/**
 * @member {Object} rendered_description
 */
BasicStreamAllOf.prototype['rendered_description'] = undefined;
/**
 * @member {Object} is_web_public
 */
BasicStreamAllOf.prototype['is_web_public'] = undefined;
/**
 * @member {Object} stream_post_policy
 */
BasicStreamAllOf.prototype['stream_post_policy'] = undefined;
/**
 * @member {Object} message_retention_days
 */
BasicStreamAllOf.prototype['message_retention_days'] = undefined;
/**
 * @member {Object} history_public_to_subscribers
 */
BasicStreamAllOf.prototype['history_public_to_subscribers'] = undefined;
/**
 * @member {Object} first_message_id
 */
BasicStreamAllOf.prototype['first_message_id'] = undefined;
/**
 * @member {Object} is_announcement_only
 */
BasicStreamAllOf.prototype['is_announcement_only'] = undefined;




export default BasicStream;

