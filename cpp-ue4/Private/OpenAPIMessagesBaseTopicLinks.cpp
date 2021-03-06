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

#include "OpenAPIMessagesBaseTopicLinks.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI 
{

void OpenAPIMessagesBaseTopicLinks::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (Text.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("text")); WriteJsonValue(Writer, Text.GetValue());	
	}
	if (Url.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("url")); WriteJsonValue(Writer, Url.GetValue());	
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIMessagesBaseTopicLinks::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("text"), Text);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("url"), Url);

	return ParseSuccess;
}

}
