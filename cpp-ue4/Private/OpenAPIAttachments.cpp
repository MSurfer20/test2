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

#include "OpenAPIAttachments.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI 
{

void OpenAPIAttachments::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (Id.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("id")); WriteJsonValue(Writer, Id.GetValue());	
	}
	if (Name.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("name")); WriteJsonValue(Writer, Name.GetValue());	
	}
	if (PathId.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("path_id")); WriteJsonValue(Writer, PathId.GetValue());	
	}
	if (Size.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("size")); WriteJsonValue(Writer, Size.GetValue());	
	}
	if (CreateTime.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("create_time")); WriteJsonValue(Writer, CreateTime.GetValue());	
	}
	if (Messages.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("messages")); WriteJsonValue(Writer, Messages.GetValue());	
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIAttachments::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("id"), Id);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("name"), Name);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("path_id"), PathId);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("size"), Size);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("create_time"), CreateTime);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("messages"), Messages);

	return ParseSuccess;
}

}
