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

#include "OpenAPIBasicStream.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI 
{

void OpenAPIBasicStream::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (StreamId.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("stream_id")); WriteJsonValue(Writer, StreamId.GetValue());	
	}
	if (Name.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("name")); WriteJsonValue(Writer, Name.GetValue());	
	}
	if (Description.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("description")); WriteJsonValue(Writer, Description.GetValue());	
	}
	if (DateCreated.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("date_created")); WriteJsonValue(Writer, DateCreated.GetValue());	
	}
	if (InviteOnly.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("invite_only")); WriteJsonValue(Writer, InviteOnly.GetValue());	
	}
	if (RenderedDescription.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("rendered_description")); WriteJsonValue(Writer, RenderedDescription.GetValue());	
	}
	if (IsWebPublic.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("is_web_public")); WriteJsonValue(Writer, IsWebPublic.GetValue());	
	}
	if (StreamPostPolicy.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("stream_post_policy")); WriteJsonValue(Writer, StreamPostPolicy.GetValue());	
	}
	if (MessageRetentionDays.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("message_retention_days")); WriteJsonValue(Writer, MessageRetentionDays.GetValue());	
	}
	if (HistoryPublicToSubscribers.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("history_public_to_subscribers")); WriteJsonValue(Writer, HistoryPublicToSubscribers.GetValue());	
	}
	if (FirstMessageId.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("first_message_id")); WriteJsonValue(Writer, FirstMessageId.GetValue());	
	}
	if (IsAnnouncementOnly.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("is_announcement_only")); WriteJsonValue(Writer, IsAnnouncementOnly.GetValue());	
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIBasicStream::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("stream_id"), StreamId);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("name"), Name);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("description"), Description);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("date_created"), DateCreated);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("invite_only"), InviteOnly);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("rendered_description"), RenderedDescription);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("is_web_public"), IsWebPublic);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("stream_post_policy"), StreamPostPolicy);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("message_retention_days"), MessageRetentionDays);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("history_public_to_subscribers"), HistoryPublicToSubscribers);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("first_message_id"), FirstMessageId);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("is_announcement_only"), IsAnnouncementOnly);

	return ParseSuccess;
}

}
