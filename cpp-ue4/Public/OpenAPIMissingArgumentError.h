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
#include "OpenAPIAnyType.h"
#include "OpenAPICodedErrorBase.h"
#include "OpenAPIMissingArgumentErrorAllOf.h"

namespace OpenAPI 
{

/*
 * OpenAPIMissingArgumentError
 *
 * 
 */
class OPENAPI_API OpenAPIMissingArgumentError : public Model
{
public:
    virtual ~OpenAPIMissingArgumentError() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	OpenAPIAnyType Result;
	OpenAPIAnyType Msg;
	TOptional<OpenAPIAnyType> Code;
	/* It contains the information about the missing parameter.  */
	TOptional<FString> VarName;
};

}
