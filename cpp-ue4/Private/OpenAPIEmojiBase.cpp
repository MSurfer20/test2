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

#include "OpenAPIEmojiBase.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI 
{

void OpenAPIEmojiBase::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (EmojiCode.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("emoji_code")); WriteJsonValue(Writer, EmojiCode.GetValue());	
	}
	if (EmojiName.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("emoji_name")); WriteJsonValue(Writer, EmojiName.GetValue());	
	}
	if (ReactionType.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("reaction_type")); WriteJsonValue(Writer, ReactionType.GetValue());	
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIEmojiBase::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("emoji_code"), EmojiCode);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("emoji_name"), EmojiName);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("reaction_type"), ReactionType);

	return ParseSuccess;
}

}
