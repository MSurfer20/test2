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

#pragma once

#include "OpenAPIBaseModel.h"
#include "OpenAPIJsonErrorBaseAllOf.h"
#include "OpenAPIJsonResponseBase.h"

namespace OpenAPI 
{

/*
 * OpenAPIJsonErrorBase
 *
 * 
 */
class OPENAPI_API OpenAPIJsonErrorBase : public Model
{
public:
    virtual ~OpenAPIJsonErrorBase() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	enum class ResultEnum
	{
		Error,
  	};
	
	static FString EnumToString(const ResultEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, ResultEnum& EnumValue);
	ResultEnum Result;
	FString Msg;
};

}
