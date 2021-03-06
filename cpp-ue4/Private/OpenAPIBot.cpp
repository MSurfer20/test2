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

#include "OpenAPIBot.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI 
{

void OpenAPIBot::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (UserId.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("user_id")); WriteJsonValue(Writer, UserId.GetValue());	
	}
	if (FullName.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("full_name")); WriteJsonValue(Writer, FullName.GetValue());	
	}
	if (ApiKey.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("api_key")); WriteJsonValue(Writer, ApiKey.GetValue());	
	}
	if (DefaultSendingStream.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("default_sending_stream")); WriteJsonValue(Writer, DefaultSendingStream.GetValue());	
	}
	if (DefaultEventsRegisterStream.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("default_events_register_stream")); WriteJsonValue(Writer, DefaultEventsRegisterStream.GetValue());	
	}
	if (DefaultAllPublicStreams.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("default_all_public_streams")); WriteJsonValue(Writer, DefaultAllPublicStreams.GetValue());	
	}
	if (AvatarUrl.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("avatar_url")); WriteJsonValue(Writer, AvatarUrl.GetValue());	
	}
	if (OwnerId.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("owner_id")); WriteJsonValue(Writer, OwnerId.GetValue());	
	}
	if (Services.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("services")); WriteJsonValue(Writer, Services.GetValue());	
	}
	if (Email.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("email")); WriteJsonValue(Writer, Email.GetValue());	
	}
	if (BotType.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("bot_type")); WriteJsonValue(Writer, BotType.GetValue());	
	}
	if (IsActive.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("is_active")); WriteJsonValue(Writer, IsActive.GetValue());	
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIBot::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("user_id"), UserId);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("full_name"), FullName);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("api_key"), ApiKey);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("default_sending_stream"), DefaultSendingStream);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("default_events_register_stream"), DefaultEventsRegisterStream);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("default_all_public_streams"), DefaultAllPublicStreams);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("avatar_url"), AvatarUrl);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("owner_id"), OwnerId);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("services"), Services);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("email"), Email);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("bot_type"), BotType);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("is_active"), IsActive);

	return ParseSuccess;
}

}
