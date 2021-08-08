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
 * OpenAPIAddSubscriptionsResponseAllOf
 *
 * 
 */
class OPENAPI_API OpenAPIAddSubscriptionsResponseAllOf : public Model
{
public:
    virtual ~OpenAPIAddSubscriptionsResponseAllOf() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	TOptional<OpenAPIAnyType> Result;
	TOptional<OpenAPIAnyType> Msg;
	/* A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query.  */
	TOptional<TMap<FString, TArray>> Subscribed;
	/* A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to.  */
	TOptional<TMap<FString, TArray>> AlreadySubscribed;
	/* A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`.  */
	TOptional<TArray<FString>> Unauthorized;
};

}
