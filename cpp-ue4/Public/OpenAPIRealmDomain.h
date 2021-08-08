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
 * OpenAPIRealmDomain
 *
 * Object containing details of the newly added domain. 
 */
class OPENAPI_API OpenAPIRealmDomain : public Model
{
public:
    virtual ~OpenAPIRealmDomain() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* The new allowed domain.  */
	TOptional<FString> Domain;
	/* Whether subdomains are allowed for this domain.  */
	TOptional<bool> AllowSubdomains;
};

}
