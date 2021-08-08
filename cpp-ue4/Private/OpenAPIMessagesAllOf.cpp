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

#include "OpenAPIMessagesAllOf.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI 
{

void OpenAPIMessagesAllOf::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (AvatarUrl.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("avatar_url")); WriteJsonValue(Writer, AvatarUrl.GetValue());	
	}
	if (Client.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("client")); WriteJsonValue(Writer, Client.GetValue());	
	}
	if (Content.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("content")); WriteJsonValue(Writer, Content.GetValue());	
	}
	if (ContentType.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("content_type")); WriteJsonValue(Writer, ContentType.GetValue());	
	}
	if (DisplayRecipient.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("display_recipient")); WriteJsonValue(Writer, DisplayRecipient.GetValue());	
	}
	if (Id.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("id")); WriteJsonValue(Writer, Id.GetValue());	
	}
	if (IsMeMessage.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("is_me_message")); WriteJsonValue(Writer, IsMeMessage.GetValue());	
	}
	if (Reactions.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("reactions")); WriteJsonValue(Writer, Reactions.GetValue());	
	}
	if (RecipientId.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("recipient_id")); WriteJsonValue(Writer, RecipientId.GetValue());	
	}
	if (SenderEmail.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("sender_email")); WriteJsonValue(Writer, SenderEmail.GetValue());	
	}
	if (SenderFullName.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("sender_full_name")); WriteJsonValue(Writer, SenderFullName.GetValue());	
	}
	if (SenderId.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("sender_id")); WriteJsonValue(Writer, SenderId.GetValue());	
	}
	if (SenderRealmStr.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("sender_realm_str")); WriteJsonValue(Writer, SenderRealmStr.GetValue());	
	}
	if (StreamId.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("stream_id")); WriteJsonValue(Writer, StreamId.GetValue());	
	}
	if (Subject.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("subject")); WriteJsonValue(Writer, Subject.GetValue());	
	}
	if (TopicLinks.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("topic_links")); WriteJsonValue(Writer, TopicLinks.GetValue());	
	}
	if (Submessages.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("submessages")); WriteJsonValue(Writer, Submessages.GetValue());	
	}
	if (Timestamp.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("timestamp")); WriteJsonValue(Writer, Timestamp.GetValue());	
	}
	if (Type.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("type")); WriteJsonValue(Writer, Type.GetValue());	
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIMessagesAllOf::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("avatar_url"), AvatarUrl);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("client"), Client);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("content"), Content);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("content_type"), ContentType);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("display_recipient"), DisplayRecipient);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("id"), Id);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("is_me_message"), IsMeMessage);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("reactions"), Reactions);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("recipient_id"), RecipientId);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("sender_email"), SenderEmail);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("sender_full_name"), SenderFullName);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("sender_id"), SenderId);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("sender_realm_str"), SenderRealmStr);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("stream_id"), StreamId);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("subject"), Subject);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("topic_links"), TopicLinks);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("submessages"), Submessages);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("timestamp"), Timestamp);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("type"), Type);

	return ParseSuccess;
}

}
