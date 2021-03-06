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

namespace OpenAPI 
{

/*
 * OpenAPICodedErrorBaseAllOf
 *
 * 
 */
class OPENAPI_API OpenAPICodedErrorBaseAllOf : public Model
{
public:
    virtual ~OpenAPICodedErrorBaseAllOf() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	TOptional<OpenAPIAnyType> Result;
	TOptional<OpenAPIAnyType> Msg;
	/* A string that identifies the error.  */
	TOptional<FString> Code;
};

}
