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
#include "OpenAPIDraftsApi.h"

#include "OpenAPICodedError.h"
#include "OpenAPIDraft.h"
#include "OpenAPIJsonError.h"
#include "OpenAPIJsonSuccess.h"

namespace OpenAPI 
{

/* Create drafts
 *
 * Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;POST {{ api_url }}/v1/drafts&#x60; 
*/
class OPENAPI_API OpenAPIDraftsApi::CreateDraftsRequest : public Request
{
public:
    virtual ~CreateDraftsRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* A JSON-encoded list of containing new draft objects.  */
	TOptional<TArray<OpenAPIDraft>> Drafts;
};

class OPENAPI_API OpenAPIDraftsApi::CreateDraftsResponse : public Response
{
public:
    virtual ~CreateDraftsResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
    
    OpenAPIJsonSuccess Content;
};

/* Delete a draft
 *
 * Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a &#x60;drafts&#x60; event.  &#x60;DELETE {{ api_url }}/v1/drafts/{draft_id}&#x60; 
*/
class OPENAPI_API OpenAPIDraftsApi::DeleteDraftRequest : public Request
{
public:
    virtual ~DeleteDraftRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* The ID of the draft you want to delete.  */
	int32 DraftId = 0;
};

class OPENAPI_API OpenAPIDraftsApi::DeleteDraftResponse : public Response
{
public:
    virtual ~DeleteDraftResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
    
    OpenAPIJsonSuccess Content;
};

/* Edit a draft
 *
 * Edit a draft on the server. The edit will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;PATCH {{ api_url }}/v1/drafts/{draft_id}&#x60; 
*/
class OPENAPI_API OpenAPIDraftsApi::EditDraftRequest : public Request
{
public:
    virtual ~EditDraftRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* The ID of the draft to be edited.  */
	int32 DraftId = 0;
	/* A JSON-encoded object containing a replacement draft object for this ID.  */
	OpenAPIDraft Draft;
};

class OPENAPI_API OpenAPIDraftsApi::EditDraftResponse : public Response
{
public:
    virtual ~EditDraftResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
    
    OpenAPIJsonSuccess Content;
};

/* Get drafts
 *
 * Fetch all drafts for the current user.  &#x60;GET {{ api_url }}/v1/drafts&#x60; 
*/
class OPENAPI_API OpenAPIDraftsApi::GetDraftsRequest : public Request
{
public:
    virtual ~GetDraftsRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;
    
};

class OPENAPI_API OpenAPIDraftsApi::GetDraftsResponse : public Response
{
public:
    virtual ~GetDraftsResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
    
    OpenAPIJsonSuccess Content;
};

}
