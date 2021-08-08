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
 * The GetMessagesAllOf model module.
 * @module model/GetMessagesAllOf
 * @version 1.0.0
 */
class GetMessagesAllOf {
    /**
     * @member {AnyType} avatar_url
     * @type {AnyType}
     */
    avatar_url;
    /**
     * @member {AnyType} client
     * @type {AnyType}
     */
    client;
    /**
     * @member {AnyType} content
     * @type {AnyType}
     */
    content;
    /**
     * @member {AnyType} content_type
     * @type {AnyType}
     */
    content_type;
    /**
     * @member {AnyType} display_recipient
     * @type {AnyType}
     */
    display_recipient;
    /**
     * @member {AnyType} id
     * @type {AnyType}
     */
    id;
    /**
     * @member {AnyType} is_me_message
     * @type {AnyType}
     */
    is_me_message;
    /**
     * @member {AnyType} reactions
     * @type {AnyType}
     */
    reactions;
    /**
     * @member {AnyType} recipient_id
     * @type {AnyType}
     */
    recipient_id;
    /**
     * @member {AnyType} sender_email
     * @type {AnyType}
     */
    sender_email;
    /**
     * @member {AnyType} sender_full_name
     * @type {AnyType}
     */
    sender_full_name;
    /**
     * @member {AnyType} sender_id
     * @type {AnyType}
     */
    sender_id;
    /**
     * @member {AnyType} sender_realm_str
     * @type {AnyType}
     */
    sender_realm_str;
    /**
     * @member {AnyType} stream_id
     * @type {AnyType}
     */
    stream_id;
    /**
     * @member {AnyType} subject
     * @type {AnyType}
     */
    subject;
    /**
     * @member {AnyType} topic_links
     * @type {AnyType}
     */
    topic_links;
    /**
     * @member {AnyType} submessages
     * @type {AnyType}
     */
    submessages;
    /**
     * @member {AnyType} timestamp
     * @type {AnyType}
     */
    timestamp;
    /**
     * @member {AnyType} type
     * @type {AnyType}
     */
    type;
    /**
     * @member {Array.<CodegenProperty{openApiType='string', baseName='flags', complexType='null', getter='getFlags', setter='setFlags', description='null', dataType='String', datatypeWithEnum='String', dataFormat='null', name='flags', min='null', max='null', defaultValue='null', defaultValueWithParam=' = ApiClient.convertToType(data['flags'], 'String');', baseType='String', containerType='null', title='null', unescapedDescription='null', maxLength=null, minLength=null, pattern='null', example='null', jsonSchema='{
  "type" : "string"
}', minimum='null', maximum='null', exclusiveMinimum=false, exclusiveMaximum=false, required=false, deprecated=false, hasMoreNonReadOnly=false, isPrimitiveType=true, isModel=false, isContainer=false, isString=true, isNumeric=false, isInteger=false, isShort=false, isLong=false, isUnboundedInteger=false, isNumber=false, isFloat=false, isDouble=false, isDecimal=false, isByteArray=false, isBinary=false, isFile=false, isBoolean=false, isDate=false, isDateTime=false, isUuid=false, isUri=false, isEmail=false, isFreeFormObject=false, isArray=false, isMap=false, isEnum=false, isReadOnly=false, isWriteOnly=false, isNullable=false, isSelfReference=false, isCircularReference=false, isDiscriminator=false, _enum=null, allowableValues=null, items=null, additionalProperties=null, vars=[], requiredVars=[], mostInnerItems=null, vendorExtensions={}, hasValidation=false, isInherited=false, discriminatorValue='null', nameInCamelCase='Flags', nameInSnakeCase='FLAGS', enumName='null', maxItems=null, minItems=null, maxProperties=null, minProperties=null, uniqueItems=false, multipleOf=null, isXmlAttribute=false, xmlPrefix='null', xmlName='null', xmlNamespace='null', isXmlWrapped=false, isNull=false, getAdditionalPropertiesIsAnyType=false, getHasVars=false, getHasRequired=false}>} flags
     * @type {Array.<CodegenProperty{openApiType='string', baseName='flags', complexType='null', getter='getFlags', setter='setFlags', description='null', dataType='String', datatypeWithEnum='String', dataFormat='null', name='flags', min='null', max='null', defaultValue='null', defaultValueWithParam=' = ApiClient.convertToType(data['flags'], 'String');', baseType='String', containerType='null', title='null', unescapedDescription='null', maxLength=null, minLength=null, pattern='null', example='null', jsonSchema='{
  "type" : "string"
}', minimum='null', maximum='null', exclusiveMinimum=false, exclusiveMaximum=false, required=false, deprecated=false, hasMoreNonReadOnly=false, isPrimitiveType=true, isModel=false, isContainer=false, isString=true, isNumeric=false, isInteger=false, isShort=false, isLong=false, isUnboundedInteger=false, isNumber=false, isFloat=false, isDouble=false, isDecimal=false, isByteArray=false, isBinary=false, isFile=false, isBoolean=false, isDate=false, isDateTime=false, isUuid=false, isUri=false, isEmail=false, isFreeFormObject=false, isArray=false, isMap=false, isEnum=false, isReadOnly=false, isWriteOnly=false, isNullable=false, isSelfReference=false, isCircularReference=false, isDiscriminator=false, _enum=null, allowableValues=null, items=null, additionalProperties=null, vars=[], requiredVars=[], mostInnerItems=null, vendorExtensions={}, hasValidation=false, isInherited=false, discriminatorValue='null', nameInCamelCase='Flags', nameInSnakeCase='FLAGS', enumName='null', maxItems=null, minItems=null, maxProperties=null, minProperties=null, uniqueItems=false, multipleOf=null, isXmlAttribute=false, xmlPrefix='null', xmlName='null', xmlNamespace='null', isXmlWrapped=false, isNull=false, getAdditionalPropertiesIsAnyType=false, getHasVars=false, getHasRequired=false}>}
     */
    flags;
    /**
     * @member {Number} last_edit_timestamp
     * @type {Number}
     */
    last_edit_timestamp;
    /**
     * @member {String} match_content
     * @type {String}
     */
    match_content;
    /**
     * @member {String} match_subject
     * @type {String}
     */
    match_subject;

    

    /**
     * Constructs a new <code>GetMessagesAllOf</code>.
     * @alias module:model/GetMessagesAllOf
     */
    constructor() { 
        
        GetMessagesAllOf.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>GetMessagesAllOf</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GetMessagesAllOf} obj Optional instance to populate.
     * @return {module:model/GetMessagesAllOf} The populated <code>GetMessagesAllOf</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GetMessagesAllOf();

            if (data.hasOwnProperty('avatar_url')) {
                obj['avatar_url'] = ApiClient.convertToType(data['avatar_url'], AnyType);
            }
            if (data.hasOwnProperty('client')) {
                obj['client'] = ApiClient.convertToType(data['client'], AnyType);
            }
            if (data.hasOwnProperty('content')) {
                obj['content'] = ApiClient.convertToType(data['content'], AnyType);
            }
            if (data.hasOwnProperty('content_type')) {
                obj['content_type'] = ApiClient.convertToType(data['content_type'], AnyType);
            }
            if (data.hasOwnProperty('display_recipient')) {
                obj['display_recipient'] = ApiClient.convertToType(data['display_recipient'], AnyType);
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], AnyType);
            }
            if (data.hasOwnProperty('is_me_message')) {
                obj['is_me_message'] = ApiClient.convertToType(data['is_me_message'], AnyType);
            }
            if (data.hasOwnProperty('reactions')) {
                obj['reactions'] = ApiClient.convertToType(data['reactions'], AnyType);
            }
            if (data.hasOwnProperty('recipient_id')) {
                obj['recipient_id'] = ApiClient.convertToType(data['recipient_id'], AnyType);
            }
            if (data.hasOwnProperty('sender_email')) {
                obj['sender_email'] = ApiClient.convertToType(data['sender_email'], AnyType);
            }
            if (data.hasOwnProperty('sender_full_name')) {
                obj['sender_full_name'] = ApiClient.convertToType(data['sender_full_name'], AnyType);
            }
            if (data.hasOwnProperty('sender_id')) {
                obj['sender_id'] = ApiClient.convertToType(data['sender_id'], AnyType);
            }
            if (data.hasOwnProperty('sender_realm_str')) {
                obj['sender_realm_str'] = ApiClient.convertToType(data['sender_realm_str'], AnyType);
            }
            if (data.hasOwnProperty('stream_id')) {
                obj['stream_id'] = ApiClient.convertToType(data['stream_id'], AnyType);
            }
            if (data.hasOwnProperty('subject')) {
                obj['subject'] = ApiClient.convertToType(data['subject'], AnyType);
            }
            if (data.hasOwnProperty('topic_links')) {
                obj['topic_links'] = ApiClient.convertToType(data['topic_links'], AnyType);
            }
            if (data.hasOwnProperty('submessages')) {
                obj['submessages'] = ApiClient.convertToType(data['submessages'], AnyType);
            }
            if (data.hasOwnProperty('timestamp')) {
                obj['timestamp'] = ApiClient.convertToType(data['timestamp'], AnyType);
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], AnyType);
            }
            if (data.hasOwnProperty('flags')) {
                obj['flags'] = ApiClient.convertToType(data['flags'], ['String']);
            }
            if (data.hasOwnProperty('last_edit_timestamp')) {
                obj['last_edit_timestamp'] = ApiClient.convertToType(data['last_edit_timestamp'], 'Number');
            }
            if (data.hasOwnProperty('match_content')) {
                obj['match_content'] = ApiClient.convertToType(data['match_content'], 'String');
            }
            if (data.hasOwnProperty('match_subject')) {
                obj['match_subject'] = ApiClient.convertToType(data['match_subject'], 'String');
            }
        }
        return obj;
    }
}



export default GetMessagesAllOf;
