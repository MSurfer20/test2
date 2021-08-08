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

#include "OpenAPIAddSubscriptionsResponse.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI 
{

void OpenAPIAddSubscriptionsResponse::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("result")); WriteJsonValue(Writer, Result);
	Writer->WriteIdentifierPrefix(TEXT("msg")); WriteJsonValue(Writer, Msg);
	if (Subscribed.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("subscribed")); WriteJsonValue(Writer, Subscribed.GetValue());	
	}
	if (AlreadySubscribed.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("already_subscribed")); WriteJsonValue(Writer, AlreadySubscribed.GetValue());	
	}
	if (Unauthorized.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("unauthorized")); WriteJsonValue(Writer, Unauthorized.GetValue());	
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIAddSubscriptionsResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("result"), Result);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("msg"), Msg);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("subscribed"), Subscribed);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("already_subscribed"), AlreadySubscribed);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("unauthorized"), Unauthorized);

	return ParseSuccess;
}

}
