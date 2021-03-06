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

#include "OpenAPIBadEventQueueIdErrorAllOf.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI 
{

void OpenAPIBadEventQueueIdErrorAllOf::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (Result.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("result")); WriteJsonValue(Writer, Result.GetValue());	
	}
	if (Msg.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("msg")); WriteJsonValue(Writer, Msg.GetValue());	
	}
	if (Code.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("code")); WriteJsonValue(Writer, Code.GetValue());	
	}
	if (QueueId.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("queue_id")); WriteJsonValue(Writer, QueueId.GetValue());	
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIBadEventQueueIdErrorAllOf::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("result"), Result);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("msg"), Msg);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("code"), Code);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("queue_id"), QueueId);

	return ParseSuccess;
}

}
