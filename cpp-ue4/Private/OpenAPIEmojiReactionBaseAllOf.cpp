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

#include "OpenAPIEmojiReactionBaseAllOf.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI 
{

void OpenAPIEmojiReactionBaseAllOf::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (UserId.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("user_id")); WriteJsonValue(Writer, UserId.GetValue());	
	}
	if (User.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("user")); WriteJsonValue(Writer, User.GetValue());	
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIEmojiReactionBaseAllOf::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("user_id"), UserId);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("user"), User);

	return ParseSuccess;
}

}