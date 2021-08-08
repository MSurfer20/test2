import localVarRequest from 'request';

export * from './addSubscriptionsResponse';
export * from './addSubscriptionsResponseAllOf';
export * from './apiKeyResponse';
export * from './apiKeyResponseAllOf';
export * from './attachments';
export * from './attachmentsMessages';
export * from './badEventQueueIdError';
export * from './badEventQueueIdErrorAllOf';
export * from './basicBot';
export * from './basicBotAllOf';
export * from './basicBotBase';
export * from './basicStream';
export * from './basicStreamAllOf';
export * from './basicStreamBase';
export * from './bot';
export * from './botAllOf';
export * from './codedError';
export * from './codedErrorAllOf';
export * from './codedErrorBase';
export * from './codedErrorBaseAllOf';
export * from './customProfileField';
export * from './defaultStreamGroup';
export * from './draft';
export * from './emojiBase';
export * from './emojiReaction';
export * from './emojiReactionAllOf';
export * from './emojiReactionBase';
export * from './emojiReactionBaseAllOf';
export * from './emojiReactionBaseAllOfUser';
export * from './getMessages';
export * from './getMessagesAllOf';
export * from './hotspot';
export * from './inlineResponse200';
export * from './invalidApiKeyError';
export * from './invalidMessageError';
export * from './invalidMessageErrorAllOf';
export * from './jsonError';
export * from './jsonErrorBase';
export * from './jsonErrorBaseAllOf';
export * from './jsonResponseBase';
export * from './jsonSuccess';
export * from './jsonSuccessAllOf';
export * from './jsonSuccessBase';
export * from './jsonSuccessBaseAllOf';
export * from './messages';
export * from './messagesAllOf';
export * from './messagesBase';
export * from './messagesBaseTopicLinks';
export * from './missingArgumentError';
export * from './missingArgumentErrorAllOf';
export * from './nonExistingStreamError';
export * from './nonExistingStreamErrorAllOf';
export * from './presence';
export * from './rateLimitedError';
export * from './realmDeactivatedError';
export * from './realmDomain';
export * from './realmEmoji';
export * from './realmExport';
export * from './realmPlayground';
export * from './subscriptions';
export * from './user';
export * from './userAllOf';
export * from './userBase';
export * from './userDeactivatedError';
export * from './userGroup';
export * from './userNotAuthorizedError';

import * as fs from 'fs';

export interface RequestDetailedFile {
    value: Buffer;
    options?: {
        filename?: string;
        contentType?: string;
    }
}

export type RequestFile = string | Buffer | fs.ReadStream | RequestDetailedFile;


import { AddSubscriptionsResponse } from './addSubscriptionsResponse';
import { AddSubscriptionsResponseAllOf } from './addSubscriptionsResponseAllOf';
import { ApiKeyResponse } from './apiKeyResponse';
import { ApiKeyResponseAllOf } from './apiKeyResponseAllOf';
import { Attachments } from './attachments';
import { AttachmentsMessages } from './attachmentsMessages';
import { BadEventQueueIdError } from './badEventQueueIdError';
import { BadEventQueueIdErrorAllOf } from './badEventQueueIdErrorAllOf';
import { BasicBot } from './basicBot';
import { BasicBotAllOf } from './basicBotAllOf';
import { BasicBotBase } from './basicBotBase';
import { BasicStream } from './basicStream';
import { BasicStreamAllOf } from './basicStreamAllOf';
import { BasicStreamBase } from './basicStreamBase';
import { Bot } from './bot';
import { BotAllOf } from './botAllOf';
import { CodedError } from './codedError';
import { CodedErrorAllOf } from './codedErrorAllOf';
import { CodedErrorBase } from './codedErrorBase';
import { CodedErrorBaseAllOf } from './codedErrorBaseAllOf';
import { CustomProfileField } from './customProfileField';
import { DefaultStreamGroup } from './defaultStreamGroup';
import { Draft } from './draft';
import { EmojiBase } from './emojiBase';
import { EmojiReaction } from './emojiReaction';
import { EmojiReactionAllOf } from './emojiReactionAllOf';
import { EmojiReactionBase } from './emojiReactionBase';
import { EmojiReactionBaseAllOf } from './emojiReactionBaseAllOf';
import { EmojiReactionBaseAllOfUser } from './emojiReactionBaseAllOfUser';
import { GetMessages } from './getMessages';
import { GetMessagesAllOf } from './getMessagesAllOf';
import { Hotspot } from './hotspot';
import { InlineResponse200 } from './inlineResponse200';
import { InvalidApiKeyError } from './invalidApiKeyError';
import { InvalidMessageError } from './invalidMessageError';
import { InvalidMessageErrorAllOf } from './invalidMessageErrorAllOf';
import { JsonError } from './jsonError';
import { JsonErrorBase } from './jsonErrorBase';
import { JsonErrorBaseAllOf } from './jsonErrorBaseAllOf';
import { JsonResponseBase } from './jsonResponseBase';
import { JsonSuccess } from './jsonSuccess';
import { JsonSuccessAllOf } from './jsonSuccessAllOf';
import { JsonSuccessBase } from './jsonSuccessBase';
import { JsonSuccessBaseAllOf } from './jsonSuccessBaseAllOf';
import { Messages } from './messages';
import { MessagesAllOf } from './messagesAllOf';
import { MessagesBase } from './messagesBase';
import { MessagesBaseTopicLinks } from './messagesBaseTopicLinks';
import { MissingArgumentError } from './missingArgumentError';
import { MissingArgumentErrorAllOf } from './missingArgumentErrorAllOf';
import { NonExistingStreamError } from './nonExistingStreamError';
import { NonExistingStreamErrorAllOf } from './nonExistingStreamErrorAllOf';
import { Presence } from './presence';
import { RateLimitedError } from './rateLimitedError';
import { RealmDeactivatedError } from './realmDeactivatedError';
import { RealmDomain } from './realmDomain';
import { RealmEmoji } from './realmEmoji';
import { RealmExport } from './realmExport';
import { RealmPlayground } from './realmPlayground';
import { Subscriptions } from './subscriptions';
import { User } from './user';
import { UserAllOf } from './userAllOf';
import { UserBase } from './userBase';
import { UserDeactivatedError } from './userDeactivatedError';
import { UserGroup } from './userGroup';
import { UserNotAuthorizedError } from './userNotAuthorizedError';

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

let enumsMap: {[index: string]: any} = {
        "Draft.TypeEnum": Draft.TypeEnum,
        "JsonErrorBase.ResultEnum": JsonErrorBase.ResultEnum,
        "JsonErrorBaseAllOf.ResultEnum": JsonErrorBaseAllOf.ResultEnum,
        "JsonSuccessBase.ResultEnum": JsonSuccessBase.ResultEnum,
        "JsonSuccessBaseAllOf.ResultEnum": JsonSuccessBaseAllOf.ResultEnum,
        "Presence.StatusEnum": Presence.StatusEnum,
        "Subscriptions.RoleEnum": Subscriptions.RoleEnum,
        "UserBase.RoleEnum": UserBase.RoleEnum,
}

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
    "Draft": Draft,
    "EmojiBase": EmojiBase,
    "EmojiReaction": EmojiReaction,
    "EmojiReactionAllOf": EmojiReactionAllOf,
    "EmojiReactionBase": EmojiReactionBase,
    "EmojiReactionBaseAllOf": EmojiReactionBaseAllOf,
    "EmojiReactionBaseAllOfUser": EmojiReactionBaseAllOfUser,
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
            if (enumsMap[expectedType]) {
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

    public static serialize(data: any, type: string) {
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (type.lastIndexOf("Array<", 0) === 0) { // string.startsWith pre es6
            let subType: string = type.replace("Array<", ""); // Array<Type> => Type>
            subType = subType.substring(0, subType.length - 1); // Type> => Type
            let transformedData: any[] = [];
            for (let index = 0; index < data.length; index++) {
                let datum = data[index];
                transformedData.push(ObjectSerializer.serialize(datum, subType));
            }
            return transformedData;
        } else if (type === "Date") {
            return data.toISOString();
        } else {
            if (enumsMap[type]) {
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
            for (let index = 0; index < attributeTypes.length; index++) {
                let attributeType = attributeTypes[index];
                instance[attributeType.baseName] = ObjectSerializer.serialize(data[attributeType.name], attributeType.type);
            }
            return instance;
        }
    }

    public static deserialize(data: any, type: string) {
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
            for (let index = 0; index < data.length; index++) {
                let datum = data[index];
                transformedData.push(ObjectSerializer.deserialize(datum, subType));
            }
            return transformedData;
        } else if (type === "Date") {
            return new Date(data);
        } else {
            if (enumsMap[type]) {// is Enum
                return data;
            }

            if (!typeMap[type]) { // dont know the type
                return data;
            }
            let instance = new typeMap[type]();
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            for (let index = 0; index < attributeTypes.length; index++) {
                let attributeType = attributeTypes[index];
                instance[attributeType.name] = ObjectSerializer.deserialize(data[attributeType.baseName], attributeType.type);
            }
            return instance;
        }
    }
}

export interface Authentication {
    /**
    * Apply authentication settings to header and query params.
    */
    applyToRequest(requestOptions: localVarRequest.Options): Promise<void> | void;
}

export class HttpBasicAuth implements Authentication {
    public username: string = '';
    public password: string = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        requestOptions.auth = {
            username: this.username, password: this.password
        }
    }
}

export class HttpBearerAuth implements Authentication {
    public accessToken: string | (() => string) = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (requestOptions && requestOptions.headers) {
            const accessToken = typeof this.accessToken === 'function'
                            ? this.accessToken()
                            : this.accessToken;
            requestOptions.headers["Authorization"] = "Bearer " + accessToken;
        }
    }
}

export class ApiKeyAuth implements Authentication {
    public apiKey: string = '';

    constructor(private location: string, private paramName: string) {
    }

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (this.location == "query") {
            (<any>requestOptions.qs)[this.paramName] = this.apiKey;
        } else if (this.location == "header" && requestOptions && requestOptions.headers) {
            requestOptions.headers[this.paramName] = this.apiKey;
        } else if (this.location == 'cookie' && requestOptions && requestOptions.headers) {
            if (requestOptions.headers['Cookie']) {
                requestOptions.headers['Cookie'] += '; ' + this.paramName + '=' + encodeURIComponent(this.apiKey);
            }
            else {
                requestOptions.headers['Cookie'] = this.paramName + '=' + encodeURIComponent(this.apiKey);
            }
        }
    }
}

export class OAuth implements Authentication {
    public accessToken: string = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (requestOptions && requestOptions.headers) {
            requestOptions.headers["Authorization"] = "Bearer " + this.accessToken;
        }
    }
}

export class VoidAuth implements Authentication {
    public username: string = '';
    public password: string = '';

    applyToRequest(_: localVarRequest.Options): void {
        // Do nothing
    }
}

export type Interceptor = (requestOptions: localVarRequest.Options) => (Promise<void> | void);
