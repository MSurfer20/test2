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
import EmojiReaction from './EmojiReaction';
import MessagesBaseTopicLinks from './MessagesBaseTopicLinks';
import OneOfstringarray from './OneOfstringarray';

/**
 * The MessagesBase model module.
 * @module model/MessagesBase
 * @version 1.0.0
 */
class MessagesBase {
    /**
     * @member {String} avatar_url
     * @type {String}
     */
    avatar_url;
    /**
     * @member {String} client
     * @type {String}
     */
    client;
    /**
     * @member {String} content
     * @type {String}
     */
    content;
    /**
     * @member {String} content_type
     * @type {String}
     */
    content_type;
    /**
     * @member {OneOfstringarray} display_recipient
     * @type {OneOfstringarray}
     */
    display_recipient;
    /**
     * @member {Number} id
     * @type {Number}
     */
    id;
    /**
     * @member {Boolean} is_me_message
     * @type {Boolean}
     */
    is_me_message;
    /**
     * @member {Array.<CodegenProperty{openApiType='EmojiReaction', baseName='reactions', complexType='EmojiReaction', getter='getReactions', setter='setReactions', description='null', dataType='EmojiReaction', datatypeWithEnum='EmojiReaction', dataFormat='null', name='reactions', min='null', max='null', defaultValue='null', defaultValueWithParam=' = EmojiReaction.constructFromObject(data['reactions']);', baseType='EmojiReaction', containerType='null', title='null', unescapedDescription='null', maxLength=null, minLength=null, pattern='null', example='null', jsonSchema='{
  "$ref" : "#/components/schemas/EmojiReaction"
}', minimum='null', maximum='null', exclusiveMinimum=false, exclusiveMaximum=false, required=false, deprecated=false, hasMoreNonReadOnly=false, isPrimitiveType=false, isModel=true, isContainer=false, isString=false, isNumeric=false, isInteger=false, isShort=false, isLong=false, isUnboundedInteger=false, isNumber=false, isFloat=false, isDouble=false, isDecimal=false, isByteArray=false, isBinary=false, isFile=false, isBoolean=false, isDate=false, isDateTime=false, isUuid=false, isUri=false, isEmail=false, isFreeFormObject=false, isArray=false, isMap=false, isEnum=false, isReadOnly=false, isWriteOnly=false, isNullable=false, isSelfReference=false, isCircularReference=false, isDiscriminator=false, _enum=null, allowableValues=null, items=null, additionalProperties=null, vars=[], requiredVars=[], mostInnerItems=null, vendorExtensions={}, hasValidation=false, isInherited=false, discriminatorValue='null', nameInCamelCase='Reactions', nameInSnakeCase='REACTIONS', enumName='null', maxItems=null, minItems=null, maxProperties=null, minProperties=null, uniqueItems=false, multipleOf=null, isXmlAttribute=false, xmlPrefix='null', xmlName='null', xmlNamespace='null', isXmlWrapped=false, isNull=false, getAdditionalPropertiesIsAnyType=false, getHasVars=false, getHasRequired=false}>} reactions
     * @type {Array.<CodegenProperty{openApiType='EmojiReaction', baseName='reactions', complexType='EmojiReaction', getter='getReactions', setter='setReactions', description='null', dataType='EmojiReaction', datatypeWithEnum='EmojiReaction', dataFormat='null', name='reactions', min='null', max='null', defaultValue='null', defaultValueWithParam=' = EmojiReaction.constructFromObject(data['reactions']);', baseType='EmojiReaction', containerType='null', title='null', unescapedDescription='null', maxLength=null, minLength=null, pattern='null', example='null', jsonSchema='{
  "$ref" : "#/components/schemas/EmojiReaction"
}', minimum='null', maximum='null', exclusiveMinimum=false, exclusiveMaximum=false, required=false, deprecated=false, hasMoreNonReadOnly=false, isPrimitiveType=false, isModel=true, isContainer=false, isString=false, isNumeric=false, isInteger=false, isShort=false, isLong=false, isUnboundedInteger=false, isNumber=false, isFloat=false, isDouble=false, isDecimal=false, isByteArray=false, isBinary=false, isFile=false, isBoolean=false, isDate=false, isDateTime=false, isUuid=false, isUri=false, isEmail=false, isFreeFormObject=false, isArray=false, isMap=false, isEnum=false, isReadOnly=false, isWriteOnly=false, isNullable=false, isSelfReference=false, isCircularReference=false, isDiscriminator=false, _enum=null, allowableValues=null, items=null, additionalProperties=null, vars=[], requiredVars=[], mostInnerItems=null, vendorExtensions={}, hasValidation=false, isInherited=false, discriminatorValue='null', nameInCamelCase='Reactions', nameInSnakeCase='REACTIONS', enumName='null', maxItems=null, minItems=null, maxProperties=null, minProperties=null, uniqueItems=false, multipleOf=null, isXmlAttribute=false, xmlPrefix='null', xmlName='null', xmlNamespace='null', isXmlWrapped=false, isNull=false, getAdditionalPropertiesIsAnyType=false, getHasVars=false, getHasRequired=false}>}
     */
    reactions;
    /**
     * @member {Number} recipient_id
     * @type {Number}
     */
    recipient_id;
    /**
     * @member {String} sender_email
     * @type {String}
     */
    sender_email;
    /**
     * @member {String} sender_full_name
     * @type {String}
     */
    sender_full_name;
    /**
     * @member {Number} sender_id
     * @type {Number}
     */
    sender_id;
    /**
     * @member {String} sender_realm_str
     * @type {String}
     */
    sender_realm_str;
    /**
     * @member {Number} stream_id
     * @type {Number}
     */
    stream_id;
    /**
     * @member {String} subject
     * @type {String}
     */
    subject;
    /**
     * @member {Array.<CodegenProperty{openApiType='MessagesBaseTopicLinks', baseName='topicLinks', complexType='MessagesBaseTopicLinks', getter='getTopicLinks', setter='setTopicLinks', description='null', dataType='MessagesBaseTopicLinks', datatypeWithEnum='MessagesBaseTopicLinks', dataFormat='null', name='topicLinks', min='null', max='null', defaultValue='null', defaultValueWithParam=' = MessagesBaseTopicLinks.constructFromObject(data['topicLinks']);', baseType='MessagesBaseTopicLinks', containerType='null', title='null', unescapedDescription='null', maxLength=null, minLength=null, pattern='null', example='null', jsonSchema='{
  "$ref" : "#/components/schemas/MessagesBase_topic_links"
}', minimum='null', maximum='null', exclusiveMinimum=false, exclusiveMaximum=false, required=false, deprecated=false, hasMoreNonReadOnly=false, isPrimitiveType=false, isModel=true, isContainer=false, isString=false, isNumeric=false, isInteger=false, isShort=false, isLong=false, isUnboundedInteger=false, isNumber=false, isFloat=false, isDouble=false, isDecimal=false, isByteArray=false, isBinary=false, isFile=false, isBoolean=false, isDate=false, isDateTime=false, isUuid=false, isUri=false, isEmail=false, isFreeFormObject=false, isArray=false, isMap=false, isEnum=false, isReadOnly=false, isWriteOnly=false, isNullable=false, isSelfReference=false, isCircularReference=false, isDiscriminator=false, _enum=null, allowableValues=null, items=null, additionalProperties=null, vars=[], requiredVars=[], mostInnerItems=null, vendorExtensions={}, hasValidation=false, isInherited=false, discriminatorValue='null', nameInCamelCase='TopicLinks', nameInSnakeCase='TOPIC_LINKS', enumName='null', maxItems=null, minItems=null, maxProperties=null, minProperties=null, uniqueItems=false, multipleOf=null, isXmlAttribute=false, xmlPrefix='null', xmlName='null', xmlNamespace='null', isXmlWrapped=false, isNull=false, getAdditionalPropertiesIsAnyType=false, getHasVars=false, getHasRequired=false}>} topic_links
     * @type {Array.<CodegenProperty{openApiType='MessagesBaseTopicLinks', baseName='topicLinks', complexType='MessagesBaseTopicLinks', getter='getTopicLinks', setter='setTopicLinks', description='null', dataType='MessagesBaseTopicLinks', datatypeWithEnum='MessagesBaseTopicLinks', dataFormat='null', name='topicLinks', min='null', max='null', defaultValue='null', defaultValueWithParam=' = MessagesBaseTopicLinks.constructFromObject(data['topicLinks']);', baseType='MessagesBaseTopicLinks', containerType='null', title='null', unescapedDescription='null', maxLength=null, minLength=null, pattern='null', example='null', jsonSchema='{
  "$ref" : "#/components/schemas/MessagesBase_topic_links"
}', minimum='null', maximum='null', exclusiveMinimum=false, exclusiveMaximum=false, required=false, deprecated=false, hasMoreNonReadOnly=false, isPrimitiveType=false, isModel=true, isContainer=false, isString=false, isNumeric=false, isInteger=false, isShort=false, isLong=false, isUnboundedInteger=false, isNumber=false, isFloat=false, isDouble=false, isDecimal=false, isByteArray=false, isBinary=false, isFile=false, isBoolean=false, isDate=false, isDateTime=false, isUuid=false, isUri=false, isEmail=false, isFreeFormObject=false, isArray=false, isMap=false, isEnum=false, isReadOnly=false, isWriteOnly=false, isNullable=false, isSelfReference=false, isCircularReference=false, isDiscriminator=false, _enum=null, allowableValues=null, items=null, additionalProperties=null, vars=[], requiredVars=[], mostInnerItems=null, vendorExtensions={}, hasValidation=false, isInherited=false, discriminatorValue='null', nameInCamelCase='TopicLinks', nameInSnakeCase='TOPIC_LINKS', enumName='null', maxItems=null, minItems=null, maxProperties=null, minProperties=null, uniqueItems=false, multipleOf=null, isXmlAttribute=false, xmlPrefix='null', xmlName='null', xmlNamespace='null', isXmlWrapped=false, isNull=false, getAdditionalPropertiesIsAnyType=false, getHasVars=false, getHasRequired=false}>}
     */
    topic_links;
    /**
     * @member {Array.<CodegenProperty{openApiType='string', baseName='submessages', complexType='null', getter='getSubmessages', setter='setSubmessages', description='null', dataType='String', datatypeWithEnum='String', dataFormat='null', name='submessages', min='null', max='null', defaultValue='null', defaultValueWithParam=' = ApiClient.convertToType(data['submessages'], 'String');', baseType='String', containerType='null', title='null', unescapedDescription='null', maxLength=null, minLength=null, pattern='null', example='null', jsonSchema='{
  "type" : "string"
}', minimum='null', maximum='null', exclusiveMinimum=false, exclusiveMaximum=false, required=false, deprecated=false, hasMoreNonReadOnly=false, isPrimitiveType=true, isModel=false, isContainer=false, isString=true, isNumeric=false, isInteger=false, isShort=false, isLong=false, isUnboundedInteger=false, isNumber=false, isFloat=false, isDouble=false, isDecimal=false, isByteArray=false, isBinary=false, isFile=false, isBoolean=false, isDate=false, isDateTime=false, isUuid=false, isUri=false, isEmail=false, isFreeFormObject=false, isArray=false, isMap=false, isEnum=false, isReadOnly=false, isWriteOnly=false, isNullable=false, isSelfReference=false, isCircularReference=false, isDiscriminator=false, _enum=null, allowableValues=null, items=null, additionalProperties=null, vars=[], requiredVars=[], mostInnerItems=null, vendorExtensions={}, hasValidation=false, isInherited=false, discriminatorValue='null', nameInCamelCase='Submessages', nameInSnakeCase='SUBMESSAGES', enumName='null', maxItems=null, minItems=null, maxProperties=null, minProperties=null, uniqueItems=false, multipleOf=null, isXmlAttribute=false, xmlPrefix='null', xmlName='null', xmlNamespace='null', isXmlWrapped=false, isNull=false, getAdditionalPropertiesIsAnyType=false, getHasVars=false, getHasRequired=false}>} submessages
     * @type {Array.<CodegenProperty{openApiType='string', baseName='submessages', complexType='null', getter='getSubmessages', setter='setSubmessages', description='null', dataType='String', datatypeWithEnum='String', dataFormat='null', name='submessages', min='null', max='null', defaultValue='null', defaultValueWithParam=' = ApiClient.convertToType(data['submessages'], 'String');', baseType='String', containerType='null', title='null', unescapedDescription='null', maxLength=null, minLength=null, pattern='null', example='null', jsonSchema='{
  "type" : "string"
}', minimum='null', maximum='null', exclusiveMinimum=false, exclusiveMaximum=false, required=false, deprecated=false, hasMoreNonReadOnly=false, isPrimitiveType=true, isModel=false, isContainer=false, isString=true, isNumeric=false, isInteger=false, isShort=false, isLong=false, isUnboundedInteger=false, isNumber=false, isFloat=false, isDouble=false, isDecimal=false, isByteArray=false, isBinary=false, isFile=false, isBoolean=false, isDate=false, isDateTime=false, isUuid=false, isUri=false, isEmail=false, isFreeFormObject=false, isArray=false, isMap=false, isEnum=false, isReadOnly=false, isWriteOnly=false, isNullable=false, isSelfReference=false, isCircularReference=false, isDiscriminator=false, _enum=null, allowableValues=null, items=null, additionalProperties=null, vars=[], requiredVars=[], mostInnerItems=null, vendorExtensions={}, hasValidation=false, isInherited=false, discriminatorValue='null', nameInCamelCase='Submessages', nameInSnakeCase='SUBMESSAGES', enumName='null', maxItems=null, minItems=null, maxProperties=null, minProperties=null, uniqueItems=false, multipleOf=null, isXmlAttribute=false, xmlPrefix='null', xmlName='null', xmlNamespace='null', isXmlWrapped=false, isNull=false, getAdditionalPropertiesIsAnyType=false, getHasVars=false, getHasRequired=false}>}
     */
    submessages;
    /**
     * @member {Number} timestamp
     * @type {Number}
     */
    timestamp;
    /**
     * @member {String} type
     * @type {String}
     */
    type;

    

    /**
     * Constructs a new <code>MessagesBase</code>.
     * Object containing details of the message. 
     * @alias module:model/MessagesBase
     */
    constructor() { 
        
        MessagesBase.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>MessagesBase</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/MessagesBase} obj Optional instance to populate.
     * @return {module:model/MessagesBase} The populated <code>MessagesBase</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MessagesBase();

            if (data.hasOwnProperty('avatar_url')) {
                obj['avatar_url'] = ApiClient.convertToType(data['avatar_url'], 'String');
            }
            if (data.hasOwnProperty('client')) {
                obj['client'] = ApiClient.convertToType(data['client'], 'String');
            }
            if (data.hasOwnProperty('content')) {
                obj['content'] = ApiClient.convertToType(data['content'], 'String');
            }
            if (data.hasOwnProperty('content_type')) {
                obj['content_type'] = ApiClient.convertToType(data['content_type'], 'String');
            }
            if (data.hasOwnProperty('display_recipient')) {
                obj['display_recipient'] = ApiClient.convertToType(data['display_recipient'], OneOfstringarray);
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('is_me_message')) {
                obj['is_me_message'] = ApiClient.convertToType(data['is_me_message'], 'Boolean');
            }
            if (data.hasOwnProperty('reactions')) {
                obj['reactions'] = ApiClient.convertToType(data['reactions'], [EmojiReaction]);
            }
            if (data.hasOwnProperty('recipient_id')) {
                obj['recipient_id'] = ApiClient.convertToType(data['recipient_id'], 'Number');
            }
            if (data.hasOwnProperty('sender_email')) {
                obj['sender_email'] = ApiClient.convertToType(data['sender_email'], 'String');
            }
            if (data.hasOwnProperty('sender_full_name')) {
                obj['sender_full_name'] = ApiClient.convertToType(data['sender_full_name'], 'String');
            }
            if (data.hasOwnProperty('sender_id')) {
                obj['sender_id'] = ApiClient.convertToType(data['sender_id'], 'Number');
            }
            if (data.hasOwnProperty('sender_realm_str')) {
                obj['sender_realm_str'] = ApiClient.convertToType(data['sender_realm_str'], 'String');
            }
            if (data.hasOwnProperty('stream_id')) {
                obj['stream_id'] = ApiClient.convertToType(data['stream_id'], 'Number');
            }
            if (data.hasOwnProperty('subject')) {
                obj['subject'] = ApiClient.convertToType(data['subject'], 'String');
            }
            if (data.hasOwnProperty('topic_links')) {
                obj['topic_links'] = ApiClient.convertToType(data['topic_links'], [MessagesBaseTopicLinks]);
            }
            if (data.hasOwnProperty('submessages')) {
                obj['submessages'] = ApiClient.convertToType(data['submessages'], ['String']);
            }
            if (data.hasOwnProperty('timestamp')) {
                obj['timestamp'] = ApiClient.convertToType(data['timestamp'], 'Number');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
        }
        return obj;
    }
}



export default MessagesBase;

