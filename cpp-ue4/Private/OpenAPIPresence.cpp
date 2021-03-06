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

#include "OpenAPIPresence.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI 
{

inline FString ToString(const OpenAPIPresence::StatusEnum& Value)
{
	switch (Value)
	{
	case OpenAPIPresence::StatusEnum::Idle:
		return TEXT("idle");
	case OpenAPIPresence::StatusEnum::Active:
		return TEXT("active");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIPresence::StatusEnum Value (%d)"), (int)Value);	
	return TEXT("");
}

FString OpenAPIPresence::EnumToString(const OpenAPIPresence::StatusEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIPresence::StatusEnum& Value)
{
	static TMap<FString, OpenAPIPresence::StatusEnum> StringToEnum = { 
		{ TEXT("idle"), OpenAPIPresence::StatusEnum::Idle },
		{ TEXT("active"), OpenAPIPresence::StatusEnum::Active }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIPresence::EnumFromString(const FString& EnumAsString, OpenAPIPresence::StatusEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline FStringFormatArg ToStringFormatArg(const OpenAPIPresence::StatusEnum& Value)
{
	return FStringFormatArg(ToString(Value));
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIPresence::StatusEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIPresence::StatusEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIPresence::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (Client.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("client")); WriteJsonValue(Writer, Client.GetValue());	
	}
	if (Status.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("status")); WriteJsonValue(Writer, Status.GetValue());	
	}
	if (Timestamp.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("timestamp")); WriteJsonValue(Writer, Timestamp.GetValue());	
	}
	if (Pushable.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("pushable")); WriteJsonValue(Writer, Pushable.GetValue());	
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIPresence::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("client"), Client);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("status"), Status);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("timestamp"), Timestamp);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("pushable"), Pushable);

	return ParseSuccess;
}

}
