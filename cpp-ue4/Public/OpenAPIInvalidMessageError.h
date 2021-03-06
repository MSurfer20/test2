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
#include "OpenAPIInvalidMessageErrorAllOf.h"
#include "OpenAPIJsonSuccessBase.h"

namespace OpenAPI 
{

/*
 * OpenAPIInvalidMessageError
 *
 * 
 */
class OPENAPI_API OpenAPIInvalidMessageError : public Model
{
public:
    virtual ~OpenAPIInvalidMessageError() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	OpenAPIAnyType Result;
	OpenAPIAnyType Msg;
	/* The raw content of the message.  */
	TOptional<FString> RawContent;
};

}
