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

#include "CoreMinimal.h"
#include "OpenAPIBaseModel.h"

namespace OpenAPI 
{

class OPENAPI_API OpenAPIRealTimeEventsApi
{
public:
	OpenAPIRealTimeEventsApi();
	~OpenAPIRealTimeEventsApi();

	/* Sets the URL Endpoint. 
	* Note: several fallback endpoints can be configured in request retry policies, see Request::SetShouldRetry */
	void SetURL(const FString& Url);

	/* Adds global header params to all requests */
	void AddHeaderParam(const FString& Key, const FString& Value);
	void ClearHeaderParams();
	
	/* Sets the retry manager to the user-defined retry manager. User must manage the lifetime of the retry manager.
	* If no retry manager is specified and a request needs retries, a default retry manager will be used. 
	* See also: Request::SetShouldRetry */
	void SetHttpRetryManager(FHttpRetrySystem::FManager& RetryManager);
	FHttpRetrySystem::FManager& GetHttpRetryManager();

	class DeleteQueueRequest;
	class DeleteQueueResponse;
	class GetEventsRequest;
	class GetEventsResponse;
	class RealTimePostRequest;
	class RealTimePostResponse;
	class RegisterQueueRequest;
	class RegisterQueueResponse;
	class RestErrorHandlingRequest;
	class RestErrorHandlingResponse;
	
    DECLARE_DELEGATE_OneParam(FDeleteQueueDelegate, const DeleteQueueResponse&);
    DECLARE_DELEGATE_OneParam(FGetEventsDelegate, const GetEventsResponse&);
    DECLARE_DELEGATE_OneParam(FRealTimePostDelegate, const RealTimePostResponse&);
    DECLARE_DELEGATE_OneParam(FRegisterQueueDelegate, const RegisterQueueResponse&);
    DECLARE_DELEGATE_OneParam(FRestErrorHandlingDelegate, const RestErrorHandlingResponse&);
    
    FHttpRequestPtr DeleteQueue(const DeleteQueueRequest& Request, const FDeleteQueueDelegate& Delegate = FDeleteQueueDelegate()) const;
    FHttpRequestPtr GetEvents(const GetEventsRequest& Request, const FGetEventsDelegate& Delegate = FGetEventsDelegate()) const;
    FHttpRequestPtr RealTimePost(const RealTimePostRequest& Request, const FRealTimePostDelegate& Delegate = FRealTimePostDelegate()) const;
    FHttpRequestPtr RegisterQueue(const RegisterQueueRequest& Request, const FRegisterQueueDelegate& Delegate = FRegisterQueueDelegate()) const;
    FHttpRequestPtr RestErrorHandling(const RestErrorHandlingRequest& Request, const FRestErrorHandlingDelegate& Delegate = FRestErrorHandlingDelegate()) const;
    
private:
    void OnDeleteQueueResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FDeleteQueueDelegate Delegate) const;
    void OnGetEventsResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FGetEventsDelegate Delegate) const;
    void OnRealTimePostResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FRealTimePostDelegate Delegate) const;
    void OnRegisterQueueResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FRegisterQueueDelegate Delegate) const;
    void OnRestErrorHandlingResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FRestErrorHandlingDelegate Delegate) const;
    
	FHttpRequestRef CreateHttpRequest(const Request& Request) const;
	bool IsValid() const;
	void HandleResponse(FHttpResponsePtr HttpResponse, bool bSucceeded, Response& InOutResponse) const;

	FString Url;
	TMap<FString,FString> AdditionalHeaderParams;
	mutable FHttpRetrySystem::FManager* RetryManager = nullptr;
	mutable TUniquePtr<HttpRetryManager> DefaultRetryManager;
};
	
}
