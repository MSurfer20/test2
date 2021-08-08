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

#include "OpenAPIDraft.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI 
{

inline FString ToString(const OpenAPIDraft::TypeEnum& Value)
{
	switch (Value)
	{
	case OpenAPIDraft::TypeEnum:::
		return TEXT("");
	case OpenAPIDraft::TypeEnum::Stream:
		return TEXT("stream");
	case OpenAPIDraft::TypeEnum::_Private:
		return TEXT("private");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIDraft::TypeEnum Value (%d)"), (int)Value);	
	return TEXT("");
}

FString OpenAPIDraft::EnumToString(const OpenAPIDraft::TypeEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIDraft::TypeEnum& Value)
{
	static TMap<FString, OpenAPIDraft::TypeEnum> StringToEnum = { 
		{ TEXT(""), OpenAPIDraft::TypeEnum:: },
		{ TEXT("stream"), OpenAPIDraft::TypeEnum::Stream },
		{ TEXT("private"), OpenAPIDraft::TypeEnum::_Private }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIDraft::EnumFromString(const FString& EnumAsString, OpenAPIDraft::TypeEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline FStringFormatArg ToStringFormatArg(const OpenAPIDraft::TypeEnum& Value)
{
	return FStringFormatArg(ToString(Value));
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIDraft::TypeEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIDraft::TypeEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIDraft::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (Id.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("id")); WriteJsonValue(Writer, Id.GetValue());	
	}
	Writer->WriteIdentifierPrefix(TEXT("type")); WriteJsonValue(Writer, Type);
	Writer->WriteIdentifierPrefix(TEXT("to")); WriteJsonValue(Writer, To);
	Writer->WriteIdentifierPrefix(TEXT("topic")); WriteJsonValue(Writer, Topic);
	Writer->WriteIdentifierPrefix(TEXT("content")); WriteJsonValue(Writer, Content);
	if (Timestamp.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("timestamp")); WriteJsonValue(Writer, Timestamp.GetValue());	
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIDraft::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("id"), Id);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("type"), Type);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("to"), To);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("topic"), Topic);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("content"), Content);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("timestamp"), Timestamp);

	return ParseSuccess;
}

}
