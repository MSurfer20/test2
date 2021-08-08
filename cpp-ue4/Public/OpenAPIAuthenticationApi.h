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

class OPENAPI_API OpenAPIAuthenticationApi
{
public:
	OpenAPIAuthenticationApi();
	~OpenAPIAuthenticationApi();

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

	class DevFetchApiKeyRequest;
	class DevFetchApiKeyResponse;
	class FetchApiKeyRequest;
	class FetchApiKeyResponse;
	
    DECLARE_DELEGATE_OneParam(FDevFetchApiKeyDelegate, const DevFetchApiKeyResponse&);
    DECLARE_DELEGATE_OneParam(FFetchApiKeyDelegate, const FetchApiKeyResponse&);
    
    FHttpRequestPtr DevFetchApiKey(const DevFetchApiKeyRequest& Request, const FDevFetchApiKeyDelegate& Delegate = FDevFetchApiKeyDelegate()) const;
    FHttpRequestPtr FetchApiKey(const FetchApiKeyRequest& Request, const FFetchApiKeyDelegate& Delegate = FFetchApiKeyDelegate()) const;
    
private:
    void OnDevFetchApiKeyResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FDevFetchApiKeyDelegate Delegate) const;
    void OnFetchApiKeyResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FFetchApiKeyDelegate Delegate) const;
    
	FHttpRequestRef CreateHttpRequest(const Request& Request) const;
	bool IsValid() const;
	void HandleResponse(FHttpResponsePtr HttpResponse, bool bSucceeded, Response& InOutResponse) const;

	FString Url;
	TMap<FString,FString> AdditionalHeaderParams;
	mutable FHttpRetrySystem::FManager* RetryManager = nullptr;
	mutable TUniquePtr<HttpRetryManager> DefaultRetryManager;
};
	
}
