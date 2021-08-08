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

namespace OpenAPI 
{

/*
 * OpenAPIUserGroup
 *
 * Object containing the user group&#39;s attributes. 
 */
class OPENAPI_API OpenAPIUserGroup : public Model
{
public:
    virtual ~OpenAPIUserGroup() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* The name of the user group.  */
	TOptional<FString> Name;
	/* The description of the user group.  */
	TOptional<FString> Description;
	/* Array containing the id of the users who are members of this user group.  */
	TOptional<TArray<int32>> Members;
	/* The ID of the user group.  */
	TOptional<int32> Id;
};

}