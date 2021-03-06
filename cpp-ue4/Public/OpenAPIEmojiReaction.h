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
#include "OpenAPIEmojiReactionAllOf.h"
#include "OpenAPIEmojiReactionBase.h"

namespace OpenAPI 
{

/*
 * OpenAPIEmojiReaction
 *
 * 
 */
class OPENAPI_API OpenAPIEmojiReaction : public Model
{
public:
    virtual ~OpenAPIEmojiReaction() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	TOptional<OpenAPIAnyType> EmojiCode;
	TOptional<OpenAPIAnyType> EmojiName;
	TOptional<OpenAPIAnyType> ReactionType;
	TOptional<OpenAPIAnyType> UserId;
	TOptional<OpenAPIAnyType> User;
};

}
