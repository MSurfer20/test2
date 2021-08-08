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
#include "OpenAPIAttachmentsMessages.h"

namespace OpenAPI 
{

/*
 * OpenAPIAttachments
 *
 * Dictionary containing details of a file uploaded by a user. 
 */
class OPENAPI_API OpenAPIAttachments : public Model
{
public:
    virtual ~OpenAPIAttachments() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* The unique ID for the attachment.  */
	TOptional<int32> Id;
	/* Name of the uploaded file.  */
	TOptional<FString> Name;
	/* A representation of the path of the file within the repository of user-uploaded files.  If the `path_id` of a file is `{realm_id}/ab/cdef/temp_file.py`, its URL will be: `{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py`.  */
	TOptional<FString> PathId;
	/* Size of the file in bytes.  */
	TOptional<int32> Size;
	/* Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number.  */
	TOptional<int32> CreateTime;
	/* Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file.  */
	TOptional<TArray<OpenAPIAttachmentsMessages>> Messages;
};

}
