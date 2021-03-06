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

#include "OpenAPIJsonSuccessBaseAllOf.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI 
{

inline FString ToString(const OpenAPIJsonSuccessBaseAllOf::ResultEnum& Value)
{
	switch (Value)
	{
	case OpenAPIJsonSuccessBaseAllOf::ResultEnum::Success:
		return TEXT("success");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIJsonSuccessBaseAllOf::ResultEnum Value (%d)"), (int)Value);	
	return TEXT("");
}

FString OpenAPIJsonSuccessBaseAllOf::EnumToString(const OpenAPIJsonSuccessBaseAllOf::ResultEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIJsonSuccessBaseAllOf::ResultEnum& Value)
{
	static TMap<FString, OpenAPIJsonSuccessBaseAllOf::ResultEnum> StringToEnum = { 
		{ TEXT("success"), OpenAPIJsonSuccessBaseAllOf::ResultEnum::Success }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIJsonSuccessBaseAllOf::EnumFromString(const FString& EnumAsString, OpenAPIJsonSuccessBaseAllOf::ResultEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline FStringFormatArg ToStringFormatArg(const OpenAPIJsonSuccessBaseAllOf::ResultEnum& Value)
{
	return FStringFormatArg(ToString(Value));
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIJsonSuccessBaseAllOf::ResultEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIJsonSuccessBaseAllOf::ResultEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIJsonSuccessBaseAllOf::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("result")); WriteJsonValue(Writer, Result);
	Writer->WriteIdentifierPrefix(TEXT("msg")); WriteJsonValue(Writer, Msg);
	Writer->WriteObjectEnd();
}

bool OpenAPIJsonSuccessBaseAllOf::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
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
