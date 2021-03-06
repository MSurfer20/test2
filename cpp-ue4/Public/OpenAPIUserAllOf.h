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
 * OpenAPIUserAllOf
 *
 * 
 */
class OPENAPI_API OpenAPIUserAllOf : public Model
{
public:
    virtual ~OpenAPIUserAllOf() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	TOptional<OpenAPIAnyType> Email;
	TOptional<OpenAPIAnyType> IsBot;
	TOptional<OpenAPIAnyType> AvatarUrl;
	TOptional<OpenAPIAnyType> AvatarVersion;
	TOptional<OpenAPIAnyType> FullName;
	TOptional<OpenAPIAnyType> IsAdmin;
	TOptional<OpenAPIAnyType> IsOwner;
	TOptional<OpenAPIAnyType> IsBillingAdmin;
	TOptional<OpenAPIAnyType> Role;
	TOptional<OpenAPIAnyType> BotType;
	TOptional<OpenAPIAnyType> UserId;
	TOptional<OpenAPIAnyType> BotOwnerId;
	TOptional<OpenAPIAnyType> IsActive;
	TOptional<OpenAPIAnyType> IsGuest;
	TOptional<OpenAPIAnyType> Timezone;
	TOptional<OpenAPIAnyType> DateJoined;
	TOptional<OpenAPIAnyType> DeliveryEmail;
	TOptional<OpenAPIAnyType> ProfileData;
};

}
