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

#include "OpenAPIJsonErrorBase.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI 
{

inline FString ToString(const OpenAPIJsonErrorBase::ResultEnum& Value)
{
	switch (Value)
	{
	case OpenAPIJsonErrorBase::ResultEnum::Error:
		return TEXT("error");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIJsonErrorBase::ResultEnum Value (%d)"), (int)Value);	
	return TEXT("");
}

FString OpenAPIJsonErrorBase::EnumToString(const OpenAPIJsonErrorBase::ResultEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIJsonErrorBase::ResultEnum& Value)
{
	static TMap<FString, OpenAPIJsonErrorBase::ResultEnum> StringToEnum = { 
		{ TEXT("error"), OpenAPIJsonErrorBase::ResultEnum::Error }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIJsonErrorBase::EnumFromString(const FString& EnumAsString, OpenAPIJsonErrorBase::ResultEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline FStringFormatArg ToStringFormatArg(const OpenAPIJsonErrorBase::ResultEnum& Value)
{
	return FStringFormatArg(ToString(Value));
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIJsonErrorBase::ResultEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIJsonErrorBase::ResultEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIJsonErrorBase::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("result")); WriteJsonValue(Writer, Result);
	Writer->WriteIdentifierPrefix(TEXT("msg")); WriteJsonValue(Writer, Msg);
	Writer->WriteObjectEnd();
}

bool OpenAPIJsonErrorBase::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("result"), Result);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("msg"), Msg);

	return ParseSuccess;
}

}