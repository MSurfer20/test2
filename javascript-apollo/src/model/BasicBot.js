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
import BasicBotAllOf from './BasicBotAllOf';
import BasicBotBase from './BasicBotBase';

/**
 * The BasicBot model module.
 * @module model/BasicBot
 * @version 1.0.0
 */
class BasicBot {
    /**
     * @member {AnyType} user_id
     * @type {AnyType}
     */
    user_id;
    /**
     * @member {AnyType} full_name
     * @type {AnyType}
     */
    full_name;
    /**
     * @member {AnyType} api_key
     * @type {AnyType}
     */
    api_key;
    /**
     * @member {AnyType} default_sending_stream
     * @type {AnyType}
     */
    default_sending_stream;
    /**
     * @member {AnyType} default_events_register_stream
     * @type {AnyType}
     */
    default_events_register_stream;
    /**
     * @member {AnyType} default_all_public_streams
     * @type {AnyType}
     */
    default_all_public_streams;
    /**
     * @member {AnyType} avatar_url
     * @type {AnyType}
     */
    avatar_url;
    /**
     * @member {AnyType} owner_id
     * @type {AnyType}
     */
    owner_id;
    /**
     * @member {AnyType} services
     * @type {AnyType}
     */
    services;

    /**
     * @member {Number} user_id
     * @type {Number}
     */
    #user_id;
    /**
     * @member {String} full_name
     * @type {String}
     */
    #full_name;
    /**
     * @member {String} api_key
     * @type {String}
     */
    #api_key;
    /**
     * @member {String} default_sending_stream
     * @type {String}
     */
    #default_sending_stream;
    /**
     * @member {String} default_events_register_stream
     * @type {String}
     */
    #default_events_register_stream;
    /**
     * @member {Boolean} default_all_public_streams
     * @type {Boolean}
     */
    #default_all_public_streams;
    /**
     * @member {String} avatar_url
     * @type {String}
     */
    #avatar_url;
    /**
     * @member {Number} owner_id
     * @type {Number}
     */
    #owner_id;
    /**
     * @member {Array.<CodegenProperty{openApiType='OneOfobjectobject', baseName='services', complexType='OneOfobjectobject', getter='getServices', setter='setServices', description='Object containing details extra details.  Which fields appear depend on the type of bot. ', dataType='OneOfobjectobject', datatypeWithEnum='OneOfobjectobject', dataFormat='null', name='services', min='null', max='null', defaultValue='null', defaultValueWithParam=' = ApiClient.convertToType(data['services'], OneOfobjectobject);', baseType='OneOfobjectobject', containerType='null', title='null', unescapedDescription='Object containing details extra details.  Which fields appear depend
on the type of bot.
', maxLength=null, minLength=null, pattern='null', example='null', jsonSchema='{
  "description" : "Object containing details extra details.  Which fields appear depend\non the type of bot.\n",
  "oneOf" : [ {
    "type" : "object",
    "properties" : {
      "base_url" : {
        "type" : "string",
        "description" : "The URL the outgoing webhook is configured to post to.\n"
      },
      "token" : {
        "type" : "string",
        "description" : "A unique token that the third-party service can use to confirm\nthat the request is indeed coming from Zulip.\n"
      },
      "interface" : {
        "type" : "integer",
        "description" : "Integer indicating what format requests are posted in:\n\n* 1 = Zulip's native outgoing webhook format.\n* 2 = Emulate the Slack outgoing webhook format.\n"
      }
    },
    "additionalProperties" : false,
    "description" : "When the bot is an outgoing webhook bot.\n"
  }, {
    "type" : "object",
    "properties" : {
      "service_name" : {
        "type" : "string",
        "description" : "The name of the bot.\n"
      },
      "config_data" : {
        "$ref" : "#/components/schemas/Config"
      }
    },
    "additionalProperties" : false,
    "description" : "When the bot is an embedded bot.\n"
  } ]
}', minimum='null', maximum='null', exclusiveMinimum=false, exclusiveMaximum=false, required=false, deprecated=false, hasMoreNonReadOnly=false, isPrimitiveType=false, isModel=true, isContainer=false, isString=false, isNumeric=false, isInteger=false, isShort=false, isLong=false, isUnboundedInteger=false, isNumber=false, isFloat=false, isDouble=false, isDecimal=false, isByteArray=false, isBinary=false, isFile=false, isBoolean=false, isDate=false, isDateTime=false, isUuid=false, isUri=false, isEmail=false, isFreeFormObject=false, isArray=false, isMap=false, isEnum=false, isReadOnly=false, isWriteOnly=false, isNullable=false, isSelfReference=false, isCircularReference=false, isDiscriminator=false, _enum=null, allowableValues=null, items=null, additionalProperties=null, vars=[], requiredVars=[], mostInnerItems=null, vendorExtensions={}, hasValidation=false, isInherited=false, discriminatorValue='null', nameInCamelCase='Services', nameInSnakeCase='SERVICES', enumName='null', maxItems=null, minItems=null, maxProperties=null, minProperties=null, uniqueItems=false, multipleOf=null, isXmlAttribute=false, xmlPrefix='null', xmlName='null', xmlNamespace='null', isXmlWrapped=false, isNull=false, getAdditionalPropertiesIsAnyType=false, getHasVars=false, getHasRequired=false}>} services
     * @type {Array.<CodegenProperty{openApiType='OneOfobjectobject', baseName='services', complexType='OneOfobjectobject', getter='getServices', setter='setServices', description='Object containing details extra details.  Which fields appear depend on the type of bot. ', dataType='OneOfobjectobject', datatypeWithEnum='OneOfobjectobject', dataFormat='null', name='services', min='null', max='null', defaultValue='null', defaultValueWithParam=' = ApiClient.convertToType(data['services'], OneOfobjectobject);', baseType='OneOfobjectobject', containerType='null', title='null', unescapedDescription='Object containing details extra details.  Which fields appear depend
on the type of bot.
', maxLength=null, minLength=null, pattern='null', example='null', jsonSchema='{
  "description" : "Object containing details extra details.  Which fields appear depend\non the type of bot.\n",
  "oneOf" : [ {
    "type" : "object",
    "properties" : {
      "base_url" : {
        "type" : "string",
        "description" : "The URL the outgoing webhook is configured to post to.\n"
      },
      "token" : {
        "type" : "string",
        "description" : "A unique token that the third-party service can use to confirm\nthat the request is indeed coming from Zulip.\n"
      },
      "interface" : {
        "type" : "integer",
        "description" : "Integer indicating what format requests are posted in:\n\n* 1 = Zulip's native outgoing webhook format.\n* 2 = Emulate the Slack outgoing webhook format.\n"
      }
    },
    "additionalProperties" : false,
    "description" : "When the bot is an outgoing webhook bot.\n"
  }, {
    "type" : "object",
    "properties" : {
      "service_name" : {
        "type" : "string",
        "description" : "The name of the bot.\n"
      },
      "config_data" : {
        "$ref" : "#/components/schemas/Config"
      }
    },
    "additionalProperties" : false,
    "description" : "When the bot is an embedded bot.\n"
  } ]
}', minimum='null', maximum='null', exclusiveMinimum=false, exclusiveMaximum=false, required=false, deprecated=false, hasMoreNonReadOnly=false, isPrimitiveType=false, isModel=true, isContainer=false, isString=false, isNumeric=false, isInteger=false, isShort=false, isLong=false, isUnboundedInteger=false, isNumber=false, isFloat=false, isDouble=false, isDecimal=false, isByteArray=false, isBinary=false, isFile=false, isBoolean=false, isDate=false, isDateTime=false, isUuid=false, isUri=false, isEmail=false, isFreeFormObject=false, isArray=false, isMap=false, isEnum=false, isReadOnly=false, isWriteOnly=false, isNullable=false, isSelfReference=false, isCircularReference=false, isDiscriminator=false, _enum=null, allowableValues=null, items=null, additionalProperties=null, vars=[], requiredVars=[], mostInnerItems=null, vendorExtensions={}, hasValidation=false, isInherited=false, discriminatorValue='null', nameInCamelCase='Services', nameInSnakeCase='SERVICES', enumName='null', maxItems=null, minItems=null, maxProperties=null, minProperties=null, uniqueItems=false, multipleOf=null, isXmlAttribute=false, xmlPrefix='null', xmlName='null', xmlNamespace='null', isXmlWrapped=false, isNull=false, getAdditionalPropertiesIsAnyType=false, getHasVars=false, getHasRequired=false}>}
     */
    #services;
    /**
     * @member {AnyType} user_id
     * @type {AnyType}
     */
    #user_id;
    /**
     * @member {AnyType} full_name
     * @type {AnyType}
     */
    #full_name;
    /**
     * @member {AnyType} api_key
     * @type {AnyType}
     */
    #api_key;
    /**
     * @member {AnyType} default_sending_stream
     * @type {AnyType}
     */
    #default_sending_stream;
    /**
     * @member {AnyType} default_events_register_stream
     * @type {AnyType}
     */
    #default_events_register_stream;
    /**
     * @member {AnyType} default_all_public_streams
     * @type {AnyType}
     */
    #default_all_public_streams;
    /**
     * @member {AnyType} avatar_url
     * @type {AnyType}
     */
    #avatar_url;
    /**
     * @member {AnyType} owner_id
     * @type {AnyType}
     */
    #owner_id;
    /**
     * @member {AnyType} services
     * @type {AnyType}
     */
    #services;
    

    /**
     * Constructs a new <code>BasicBot</code>.
     * @alias module:model/BasicBot
     * @implements module:model/BasicBotBase
     * @implements module:model/BasicBotAllOf
     */
    constructor() { 
        BasicBotBase.initialize(this);BasicBotAllOf.initialize(this);
        BasicBot.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>BasicBot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/BasicBot} obj Optional instance to populate.
     * @return {module:model/BasicBot} The populated <code>BasicBot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BasicBot();
            BasicBotBase.constructFromObject(data, obj);
            BasicBotAllOf.constructFromObject(data, obj);

            if (data.hasOwnProperty('user_id')) {
                obj['user_id'] = ApiClient.convertToType(data['user_id'], AnyType);
            }
            if (data.hasOwnProperty('full_name')) {
                obj['full_name'] = ApiClient.convertToType(data['full_name'], AnyType);
            }
            if (data.hasOwnProperty('api_key')) {
                obj['api_key'] = ApiClient.convertToType(data['api_key'], AnyType);
            }
            if (data.hasOwnProperty('default_sending_stream')) {
                obj['default_sending_stream'] = ApiClient.convertToType(data['default_sending_stream'], AnyType);
            }
            if (data.hasOwnProperty('default_events_register_stream')) {
                obj['default_events_register_stream'] = ApiClient.convertToType(data['default_events_register_stream'], AnyType);
            }
            if (data.hasOwnProperty('default_all_public_streams')) {
                obj['default_all_public_streams'] = ApiClient.convertToType(data['default_all_public_streams'], AnyType);
            }
            if (data.hasOwnProperty('avatar_url')) {
                obj['avatar_url'] = ApiClient.convertToType(data['avatar_url'], AnyType);
            }
            if (data.hasOwnProperty('owner_id')) {
                obj['owner_id'] = ApiClient.convertToType(data['owner_id'], AnyType);
            }
            if (data.hasOwnProperty('services')) {
                obj['services'] = ApiClient.convertToType(data['services'], AnyType);
            }
        }
        return obj;
    }
}



export default BasicBot;

