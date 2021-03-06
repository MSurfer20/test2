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

#include "OpenAPIUserAllOf.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI 
{

void OpenAPIUserAllOf::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (Email.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("email")); WriteJsonValue(Writer, Email.GetValue());	
	}
	if (IsBot.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("is_bot")); WriteJsonValue(Writer, IsBot.GetValue());	
	}
	if (AvatarUrl.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("avatar_url")); WriteJsonValue(Writer, AvatarUrl.GetValue());	
	}
	if (AvatarVersion.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("avatar_version")); WriteJsonValue(Writer, AvatarVersion.GetValue());	
	}
	if (FullName.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("full_name")); WriteJsonValue(Writer, FullName.GetValue());	
	}
	if (IsAdmin.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("is_admin")); WriteJsonValue(Writer, IsAdmin.GetValue());	
	}
	if (IsOwner.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("is_owner")); WriteJsonValue(Writer, IsOwner.GetValue());	
	}
	if (IsBillingAdmin.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("is_billing_admin")); WriteJsonValue(Writer, IsBillingAdmin.GetValue());	
	}
	if (Role.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("role")); WriteJsonValue(Writer, Role.GetValue());	
	}
	if (BotType.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("bot_type")); WriteJsonValue(Writer, BotType.GetValue());	
	}
	if (UserId.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("user_id")); WriteJsonValue(Writer, UserId.GetValue());	
	}
	if (BotOwnerId.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("bot_owner_id")); WriteJsonValue(Writer, BotOwnerId.GetValue());	
	}
	if (IsActive.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("is_active")); WriteJsonValue(Writer, IsActive.GetValue());	
	}
	if (IsGuest.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("is_guest")); WriteJsonValue(Writer, IsGuest.GetValue());	
	}
	if (Timezone.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("timezone")); WriteJsonValue(Writer, Timezone.GetValue());	
	}
	if (DateJoined.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("date_joined")); WriteJsonValue(Writer, DateJoined.GetValue());	
	}
	if (DeliveryEmail.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("delivery_email")); WriteJsonValue(Writer, DeliveryEmail.GetValue());	
	}
	if (ProfileData.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("profile_data")); WriteJsonValue(Writer, ProfileData.GetValue());	
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIUserAllOf::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("email"), Email);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("is_bot"), IsBot);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("avatar_url"), AvatarUrl);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("avatar_version"), AvatarVersion);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("full_name"), FullName);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("is_admin"), IsAdmin);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("is_owner"), IsOwner);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("is_billing_admin"), IsBillingAdmin);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("role"), Role);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("bot_type"), BotType);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("user_id"), UserId);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("bot_owner_id"), BotOwnerId);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("is_active"), IsActive);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("is_guest"), IsGuest);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("timezone"), Timezone);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("date_joined"), DateJoined);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("delivery_email"), DeliveryEmail);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("profile_data"), ProfileData);

	return ParseSuccess;
}

}
