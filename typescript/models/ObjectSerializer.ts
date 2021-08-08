export * from './AddSubscriptionsResponse';
export * from './AddSubscriptionsResponseAllOf';
export * from './ApiKeyResponse';
export * from './ApiKeyResponseAllOf';
export * from './Attachments';
export * from './AttachmentsMessages';
export * from './BadEventQueueIdError';
export * from './BadEventQueueIdErrorAllOf';
export * from './BasicBot';
export * from './BasicBotAllOf';
export * from './BasicBotBase';
export * from './BasicStream';
export * from './BasicStreamAllOf';
export * from './BasicStreamBase';
export * from './Bot';
export * from './BotAllOf';
export * from './CodedError';
export * from './CodedErrorAllOf';
export * from './CodedErrorBase';
export * from './CodedErrorBaseAllOf';
export * from './CustomProfileField';
export * from './DefaultStreamGroup';
export * from './EmojiReaction';
export * from './EmojiReactionAllOf';
export * from './EmojiReactionBase';
export * from './EmojiReactionBaseUser';
export * from './GetMessages';
export * from './GetMessagesAllOf';
export * from './Hotspot';
export * from './InlineResponse200';
export * from './InvalidApiKeyError';
export * from './InvalidMessageError';
export * from './InvalidMessageErrorAllOf';
export * from './JsonError';
export * from './JsonErrorBase';
export * from './JsonErrorBaseAllOf';
export * from './JsonResponseBase';
export * from './JsonSuccess';
export * from './JsonSuccessAllOf';
export * from './JsonSuccessBase';
export * from './JsonSuccessBaseAllOf';
export * from './Messages';
export * from './MessagesAllOf';
export * from './MessagesBase';
export * from './MessagesBaseTopicLinks';
export * from './MissingArgumentError';
export * from './MissingArgumentErrorAllOf';
export * from './NonExistingStreamError';
export * from './NonExistingStreamErrorAllOf';
export * from './Presence';
export * from './RateLimitedError';
export * from './RealmDeactivatedError';
export * from './RealmDomain';
export * from './RealmEmoji';
export * from './RealmExport';
export * from './RealmPlayground';
export * from './Subscriptions';
export * from './User';
export * from './UserAllOf';
export * from './UserBase';
export * from './UserDeactivatedError';
export * from './UserGroup';
export * from './UserNotAuthorizedError';

import { AddSubscriptionsResponse } from './AddSubscriptionsResponse';
import { AddSubscriptionsResponseAllOf } from './AddSubscriptionsResponseAllOf';
import { ApiKeyResponse } from './ApiKeyResponse';
import { ApiKeyResponseAllOf } from './ApiKeyResponseAllOf';
import { Attachments } from './Attachments';
import { AttachmentsMessages } from './AttachmentsMessages';
import { BadEventQueueIdError } from './BadEventQueueIdError';
import { BadEventQueueIdErrorAllOf } from './BadEventQueueIdErrorAllOf';
import { BasicBot } from './BasicBot';
import { BasicBotAllOf } from './BasicBotAllOf';
import { BasicBotBase } from './BasicBotBase';
import { BasicStream } from './BasicStream';
import { BasicStreamAllOf } from './BasicStreamAllOf';
import { BasicStreamBase } from './BasicStreamBase';
import { Bot } from './Bot';
import { BotAllOf } from './BotAllOf';
import { CodedError } from './CodedError';
import { CodedErrorAllOf } from './CodedErrorAllOf';
import { CodedErrorBase } from './CodedErrorBase';
import { CodedErrorBaseAllOf } from './CodedErrorBaseAllOf';
import { CustomProfileField } from './CustomProfileField';
import { DefaultStreamGroup } from './DefaultStreamGroup';
import { EmojiReaction } from './EmojiReaction';
import { EmojiReactionAllOf } from './EmojiReactionAllOf';
import { EmojiReactionBase } from './EmojiReactionBase';
import { EmojiReactionBaseUser } from './EmojiReactionBaseUser';
import { GetMessages } from './GetMessages';
import { GetMessagesAllOf } from './GetMessagesAllOf';
import { Hotspot } from './Hotspot';
import { InlineResponse200 } from './InlineResponse200';
import { InvalidApiKeyError } from './InvalidApiKeyError';
import { InvalidMessageError } from './InvalidMessageError';
import { InvalidMessageErrorAllOf } from './InvalidMessageErrorAllOf';
import { JsonError } from './JsonError';
import { JsonErrorBase, JsonErrorBaseResultEnum    } from './JsonErrorBase';
import { JsonErrorBaseAllOf, JsonErrorBaseAllOfResultEnum    } from './JsonErrorBaseAllOf';
import { JsonResponseBase } from './JsonResponseBase';
import { JsonSuccess } from './JsonSuccess';
import { JsonSuccessAllOf } from './JsonSuccessAllOf';
import { JsonSuccessBase, JsonSuccessBaseResultEnum    } from './JsonSuccessBase';
import { JsonSuccessBaseAllOf, JsonSuccessBaseAllOfResultEnum    } from './JsonSuccessBaseAllOf';
import { Messages } from './Messages';
import { MessagesAllOf } from './MessagesAllOf';
import { MessagesBase } from './MessagesBase';
import { MessagesBaseTopicLinks } from './MessagesBaseTopicLinks';
import { MissingArgumentError } from './MissingArgumentError';
import { MissingArgumentErrorAllOf } from './MissingArgumentErrorAllOf';
import { NonExistingStreamError } from './NonExistingStreamError';
import { NonExistingStreamErrorAllOf } from './NonExistingStreamErrorAllOf';
import { Presence , PresenceStatusEnum     } from './Presence';
import { RateLimitedError } from './RateLimitedError';
import { RealmDeactivatedError } from './RealmDeactivatedError';
import { RealmDomain } from './RealmDomain';
import { RealmEmoji } from './RealmEmoji';
import { RealmExport } from './RealmExport';
import { RealmPlayground } from './RealmPlayground';
import { Subscriptions                  , SubscriptionsRoleEnum         } from './Subscriptions';
import { User } from './User';
import { UserAllOf } from './UserAllOf';
import { UserBase        , UserBaseRoleEnum            } from './UserBase';
import { UserDeactivatedError } from './UserDeactivatedError';
import { UserGroup } from './UserGroup';
import { UserNotAuthorizedError } from './UserNotAuthorizedError';

/* tslint:disable:no-unused-variable */
let primitives = [
                    "string",
                    "boolean",
                    "double",
                    "integer",
                    "long",
                    "float",
                    "number",
                    "any"
                 ];

const supportedMediaTypes: { [mediaType: string]: number } = {
  "application/json": Infinity,
  "application/octet-stream": 0
}

                 
let enumsMap: Set<string> = new Set<string>([
    "JsonErrorBaseResultEnum",
    "JsonErrorBaseAllOfResultEnum",
    "JsonSuccessBaseResultEnum",
    "JsonSuccessBaseAllOfResultEnum",
    "PresenceStatusEnum",
    "SubscriptionsRoleEnum",
    "UserBaseRoleEnum",
]);

let typeMap: {[index: string]: any} = {
    "AddSubscriptionsResponse": AddSubscriptionsResponse,
    "AddSubscriptionsResponseAllOf": AddSubscriptionsResponseAllOf,
    "ApiKeyResponse": ApiKeyResponse,
    "ApiKeyResponseAllOf": ApiKeyResponseAllOf,
    "Attachments": Attachments,
    "AttachmentsMessages": AttachmentsMessages,
    "BadEventQueueIdError": BadEventQueueIdError,
    "BadEventQueueIdErrorAllOf": BadEventQueueIdErrorAllOf,
    "BasicBot": BasicBot,
    "BasicBotAllOf": BasicBotAllOf,
    "BasicBotBase": BasicBotBase,
    "BasicStream": BasicStream,
    "BasicStreamAllOf": BasicStreamAllOf,
    "BasicStreamBase": BasicStreamBase,
    "Bot": Bot,
    "BotAllOf": BotAllOf,
    "CodedError": CodedError,
    "CodedErrorAllOf": CodedErrorAllOf,
    "CodedErrorBase": CodedErrorBase,
    "CodedErrorBaseAllOf": CodedErrorBaseAllOf,
    "CustomProfileField": CustomProfileField,
    "DefaultStreamGroup": DefaultStreamGroup,
    "EmojiReaction": EmojiReaction,
    "EmojiReactionAllOf": EmojiReactionAllOf,
    "EmojiReactionBase": EmojiReactionBase,
    "EmojiReactionBaseUser": EmojiReactionBaseUser,
    "GetMessages": GetMessages,
    "GetMessagesAllOf": GetMessagesAllOf,
    "Hotspot": Hotspot,
    "InlineResponse200": InlineResponse200,
    "InvalidApiKeyError": InvalidApiKeyError,
    "InvalidMessageError": InvalidMessageError,
    "InvalidMessageErrorAllOf": InvalidMessageErrorAllOf,
    "JsonError": JsonError,
    "JsonErrorBase": JsonErrorBase,
    "JsonErrorBaseAllOf": JsonErrorBaseAllOf,
    "JsonResponseBase": JsonResponseBase,
    "JsonSuccess": JsonSuccess,
    "JsonSuccessAllOf": JsonSuccessAllOf,
    "JsonSuccessBase": JsonSuccessBase,
    "JsonSuccessBaseAllOf": JsonSuccessBaseAllOf,
    "Messages": Messages,
    "MessagesAllOf": MessagesAllOf,
    "MessagesBase": MessagesBase,
    "MessagesBaseTopicLinks": MessagesBaseTopicLinks,
    "MissingArgumentError": MissingArgumentError,
    "MissingArgumentErrorAllOf": MissingArgumentErrorAllOf,
    "NonExistingStreamError": NonExistingStreamError,
    "NonExistingStreamErrorAllOf": NonExistingStreamErrorAllOf,
    "Presence": Presence,
    "RateLimitedError": RateLimitedError,
    "RealmDeactivatedError": RealmDeactivatedError,
    "RealmDomain": RealmDomain,
    "RealmEmoji": RealmEmoji,
    "RealmExport": RealmExport,
    "RealmPlayground": RealmPlayground,
    "Subscriptions": Subscriptions,
    "User": User,
    "UserAllOf": UserAllOf,
    "UserBase": UserBase,
    "UserDeactivatedError": UserDeactivatedError,
    "UserGroup": UserGroup,
    "UserNotAuthorizedError": UserNotAuthorizedError,
}

export class ObjectSerializer {
    public static findCorrectType(data: any, expectedType: string) {
        if (data == undefined) {
            return expectedType;
        } else if (primitives.indexOf(expectedType.toLowerCase()) !== -1) {
            return expectedType;
        } else if (expectedType === "Date") {
            return expectedType;
        } else {
            if (enumsMap.has(expectedType)) {
                return expectedType;
            }

            if (!typeMap[expectedType]) {
                return expectedType; // w/e we don't know the type
            }

            // Check the discriminator
            let discriminatorProperty = typeMap[expectedType].discriminator;
            if (discriminatorProperty == null) {
                return expectedType; // the type does not have a discriminator. use it.
            } else {
                if (data[discriminatorProperty]) {
                    var discriminatorType = data[discriminatorProperty];
                    if(typeMap[discriminatorType]){
                        return discriminatorType; // use the type given in the discriminator
                    } else {
                        return expectedType; // discriminator did not map to a type
                    }
                } else {
                    return expectedType; // discriminator was not present (or an empty string)
                }
            }
        }
    }

    public static serialize(data: any, type: string, format: string) {
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (type.lastIndexOf("Array<", 0) === 0) { // string.startsWith pre es6
            let subType: string = type.replace("Array<", ""); // Array<Type> => Type>
            subType = subType.substring(0, subType.length - 1); // Type> => Type
            let transformedData: any[] = [];
            for (let index in data) {
                let date = data[index];
                transformedData.push(ObjectSerializer.serialize(date, subType, format));
            }
            return transformedData;
        } else if (type === "Date") {
            if (format == "date") {
                let month = data.getMonth()+1
                month = month < 10 ? "0" + month.toString() : month.toString()
                let day = data.getDate();
                day = day < 10 ? "0" + day.toString() : day.toString();

                return data.getFullYear() + "-" + month + "-" + day;
            } else {
                return data.toISOString();
            }
        } else {
            if (enumsMap.has(type)) {
                return data;
            }
            if (!typeMap[type]) { // in case we dont know the type
                return data;
            }
            
            // Get the actual type of this object
            type = this.findCorrectType(data, type);

            // get the map for the correct type.
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            let instance: {[index: string]: any} = {};
            for (let index in attributeTypes) {
                let attributeType = attributeTypes[index];
                instance[attributeType.baseName] = ObjectSerializer.serialize(data[attributeType.name], attributeType.type, attributeType.format);
            }
            return instance;
        }
    }

    public static deserialize(data: any, type: string, format: string) {
        // polymorphism may change the actual type.
        type = ObjectSerializer.findCorrectType(data, type);
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (type.lastIndexOf("Array<", 0) === 0) { // string.startsWith pre es6
            let subType: string = type.replace("Array<", ""); // Array<Type> => Type>
            subType = subType.substring(0, subType.length - 1); // Type> => Type
            let transformedData: any[] = [];
            for (let index in data) {
                let date = data[index];
                transformedData.push(ObjectSerializer.deserialize(date, subType, format));
            }
            return transformedData;
        } else if (type === "Date") {
            return new Date(data);
        } else {
            if (enumsMap.has(type)) {// is Enum
                return data;
            }

            if (!typeMap[type]) { // dont know the type
                return data;
            }
            let instance = new typeMap[type]();
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            for (let index in attributeTypes) {
                let attributeType = attributeTypes[index];
                instance[attributeType.name] = ObjectSerializer.deserialize(data[attributeType.baseName], attributeType.type, attributeType.format);
            }
            return instance;
        }
    }


    /**
     * Normalize media type
     *
     * We currently do not handle any media types attributes, i.e. anything
     * after a semicolon. All content is assumed to be UTF-8 compatible.
     */
    public static normalizeMediaType(mediaType: string | undefined): string | undefined {
        if (mediaType === undefined) {
            return undefined;
        }
        return mediaType.split(";")[0].trim().toLowerCase();
    }

    /**
     * From a list of possible media types, choose the one we can handle best.
     *
     * The order of the given media types does not have any impact on the choice
     * made.
     */
    public static getPreferredMediaType(mediaTypes: Array<string>): string {
        /** According to OAS 3 we should default to json */
        if (!mediaTypes) {
            return "application/json";
        }

        const normalMediaTypes = mediaTypes.map(this.normalizeMediaType);
        let selectedMediaType: string | undefined = undefined;
        let selectedRank: number = -Infinity;
        for (const mediaType of normalMediaTypes) {
            if (supportedMediaTypes[mediaType!] > selectedRank) {
                selectedMediaType = mediaType;
                selectedRank = supportedMediaTypes[mediaType!];
            }
        }

        if (selectedMediaType === undefined) {
            throw new Error("None of the given media types are supported: " + mediaTypes.join(", "));
        }

        return selectedMediaType!;
    }

    /**
     * Convert data to a string according the given media type
     */
    public static stringify(data: any, mediaType: string): string {
        if (mediaType === "application/json") {
            return JSON.stringify(data);
        }

        throw new Error("The mediaType " + mediaType + " is not supported by ObjectSerializer.stringify.");
    }

    /**
     * Parse data from a string according to the given media type
     */
    public static parse(rawData: string, mediaType: string | undefined) {
        if (mediaType === undefined) {
            throw new Error("Cannot parse content. No Content-Type defined.");
        }

        if (mediaType === "application/json") {
            return JSON.parse(rawData);
        }

        throw new Error("The mediaType " + mediaType + " is not supported by ObjectSerializer.parse.");
    }
}
