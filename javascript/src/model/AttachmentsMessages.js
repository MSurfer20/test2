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
 * The AttachmentsMessages model module.
 * @module model/AttachmentsMessages
 * @version 1.0.0
 */
class AttachmentsMessages {
    /**
     * Constructs a new <code>AttachmentsMessages</code>.
     * @alias module:model/AttachmentsMessages
     */
    constructor() { 
        
        AttachmentsMessages.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>AttachmentsMessages</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/AttachmentsMessages} obj Optional instance to populate.
     * @return {module:model/AttachmentsMessages} The populated <code>AttachmentsMessages</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AttachmentsMessages();

            if (data.hasOwnProperty('date_sent')) {
                obj['date_sent'] = ApiClient.convertToType(data['date_sent'], 'Number');
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Time when the message was sent as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously strangely called `name` and was a floating point number. 
 * @member {Number} date_sent
 */
AttachmentsMessages.prototype['date_sent'] = undefined;

/**
 * The unique message ID.  Messages should always be displayed sorted by ID. 
 * @member {Number} id
 */
AttachmentsMessages.prototype['id'] = undefined;






export default AttachmentsMessages;

