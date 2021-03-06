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
#include "OpenAPIEmojiReactionBaseAllOfUser.h"

namespace OpenAPI 
{

/*
 * OpenAPIEmojiReactionBaseAllOf
 *
 * 
 */
class OPENAPI_API OpenAPIEmojiReactionBaseAllOf : public Model
{
public:
    virtual ~OpenAPIEmojiReactionBaseAllOf() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future.  */
	TOptional<int32> UserId;
	TOptional<OpenAPIEmojiReactionBaseAllOfUser> User;
};

}
