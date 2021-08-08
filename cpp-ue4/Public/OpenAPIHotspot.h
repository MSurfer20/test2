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
 * OpenAPIHotspot
 *
 * Dictionary containing details of a single hotspot. 
 */
class OPENAPI_API OpenAPIHotspot : public Model
{
public:
    virtual ~OpenAPIHotspot() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* The delay after which the user should be shown the hotspot.  */
	TOptional<double> Delay;
	/* The name of the hotspot.  */
	TOptional<FString> Name;
	/* The title of the hotspot, as will be displayed to the user.  */
	TOptional<FString> Title;
	/* The description of the hotspot, as will be displayed to the user.  */
	TOptional<FString> Description;
};

}
