/**
 * Zulip REST API
 * Powerful open source group chat 
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#pragma once

#include "OpenAPIBaseModel.h"
#include "OpenAPIAnyType.h"

namespace OpenAPI 
{

/*
 * OpenAPIBotAllOf
 *
 * Object containing details of a bot. 
 */
class OPENAPI_API OpenAPIBotAllOf : public Model
{
public:
    virtual ~OpenAPIBotAllOf() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	TOptional<OpenAPIAnyType> UserId;
	TOptional<OpenAPIAnyType> FullName;
	TOptional<OpenAPIAnyType> ApiKey;
	TOptional<OpenAPIAnyType> DefaultSendingStream;
	TOptional<OpenAPIAnyType> DefaultEventsRegisterStream;
	TOptional<OpenAPIAnyType> DefaultAllPublicStreams;
	TOptional<OpenAPIAnyType> AvatarUrl;
	TOptional<OpenAPIAnyType> OwnerId;
	TOptional<OpenAPIAnyType> Services;
	/* The email of the bot.  */
	TOptional<FString> Email;
	/* An integer describing the type of bot: * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot.  */
	TOptional<int32> BotType;
	/* A boolean describing whether the user account has been deactivated.  */
	TOptional<bool> IsActive;
};

}
