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
#include "OpenAPIJsonSuccessAllOf.h"
#include "OpenAPIJsonSuccessBase.h"

namespace OpenAPI 
{

/*
 * OpenAPIJsonSuccess
 *
 * 
 */
class OPENAPI_API OpenAPIJsonSuccess : public Model
{
public:
    virtual ~OpenAPIJsonSuccess() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	OpenAPIAnyType Result;
	OpenAPIAnyType Msg;
};

}
