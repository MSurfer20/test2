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

#include "OpenAPIRealTimeEventsApiOperations.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Dom/JsonObject.h"
#include "Templates/SharedPointer.h"
#include "HttpModule.h"
#include "PlatformHttp.h"

namespace OpenAPI 
{

FString OpenAPIRealTimeEventsApi::DeleteQueueRequest::ComputePath() const
{
	FString Path(TEXT("/events"));
	TArray<FString> QueryParams;
	QueryParams.Add(FString(TEXT("queue_id=")) + ToUrlString(QueueId));
	Path += TCHAR('?');
	Path += FString::Join(QueryParams, TEXT("&"));

	return Path;
}

void OpenAPIRealTimeEventsApi::DeleteQueueRequest::SetupHttpRequest(const FHttpRequestRef& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("DELETE"));

	// Default to Json Body request
	if (Consumes.Num() == 0 || Consumes.Contains(TEXT("application/json")))
	{
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
	}
	else
	{
		UE_LOG(LogOpenAPI, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}

void OpenAPIRealTimeEventsApi::DeleteQueueResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
		SetResponseString(TEXT("Success."));
		break;
	case 400:
		SetResponseString(TEXT("Bad request."));
		break;
	}
}

bool OpenAPIRealTimeEventsApi::DeleteQueueResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

FString OpenAPIRealTimeEventsApi::GetEventsRequest::ComputePath() const
{
	FString Path(TEXT("/events"));
	TArray<FString> QueryParams;
	QueryParams.Add(FString(TEXT("queue_id=")) + ToUrlString(QueueId));
	if(LastEventId.IsSet())
	{
		QueryParams.Add(FString(TEXT("last_event_id=")) + ToUrlString(LastEventId.GetValue()));
	}
	if(DontBlock.IsSet())
	{
		QueryParams.Add(FString(TEXT("dont_block=")) + ToUrlString(DontBlock.GetValue()));
	}
	Path += TCHAR('?');
	Path += FString::Join(QueryParams, TEXT("&"));

	return Path;
}

void OpenAPIRealTimeEventsApi::GetEventsRequest::SetupHttpRequest(const FHttpRequestRef& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("GET"));

	// Default to Json Body request
	if (Consumes.Num() == 0 || Consumes.Contains(TEXT("application/json")))
	{
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
	}
	else
	{
		UE_LOG(LogOpenAPI, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}

void OpenAPIRealTimeEventsApi::GetEventsResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
		SetResponseString(TEXT("Success."));
		break;
	case 400:
		SetResponseString(TEXT("Bad request."));
		break;
	}
}

bool OpenAPIRealTimeEventsApi::GetEventsResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

FString OpenAPIRealTimeEventsApi::RealTimePostRequest::ComputePath() const
{
	FString Path(TEXT("/real-time"));
	TArray<FString> QueryParams;
	if(EventTypes.IsSet())
	{
		QueryParams.Add(FString(TEXT("event_types=")) + CollectionToUrlString_multi(EventTypes.GetValue(), TEXT("event_types")));
	}
	if(Narrow.IsSet())
	{
		QueryParams.Add(FString(TEXT("narrow=")) + CollectionToUrlString_multi(Narrow.GetValue(), TEXT("narrow")));
	}
	if(AllPublicStreams.IsSet())
	{
		QueryParams.Add(FString(TEXT("all_public_streams=")) + ToUrlString(AllPublicStreams.GetValue()));
	}
	Path += TCHAR('?');
	Path += FString::Join(QueryParams, TEXT("&"));

	return Path;
}

void OpenAPIRealTimeEventsApi::RealTimePostRequest::SetupHttpRequest(const FHttpRequestRef& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = {  };

	HttpRequest->SetVerb(TEXT("POST"));

	// Default to Json Body request
	if (Consumes.Num() == 0 || Consumes.Contains(TEXT("application/json")))
	{
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
	}
	else
	{
		UE_LOG(LogOpenAPI, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}

void OpenAPIRealTimeEventsApi::RealTimePostResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
		SetResponseString(TEXT("Success"));
		break;
	}
}

bool OpenAPIRealTimeEventsApi::RealTimePostResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return true;
}

FString OpenAPIRealTimeEventsApi::RegisterQueueRequest::ComputePath() const
{
	FString Path(TEXT("/register"));
	TArray<FString> QueryParams;
	if(ApplyMarkdown.IsSet())
	{
		QueryParams.Add(FString(TEXT("apply_markdown=")) + ToUrlString(ApplyMarkdown.GetValue()));
	}
	if(ClientGravatar.IsSet())
	{
		QueryParams.Add(FString(TEXT("client_gravatar=")) + ToUrlString(ClientGravatar.GetValue()));
	}
	if(SlimPresence.IsSet())
	{
		QueryParams.Add(FString(TEXT("slim_presence=")) + ToUrlString(SlimPresence.GetValue()));
	}
	if(EventTypes.IsSet())
	{
		QueryParams.Add(FString(TEXT("event_types=")) + CollectionToUrlString_multi(EventTypes.GetValue(), TEXT("event_types")));
	}
	if(AllPublicStreams.IsSet())
	{
		QueryParams.Add(FString(TEXT("all_public_streams=")) + ToUrlString(AllPublicStreams.GetValue()));
	}
	if(IncludeSubscribers.IsSet())
	{
		QueryParams.Add(FString(TEXT("include_subscribers=")) + ToUrlString(IncludeSubscribers.GetValue()));
	}
	if(ClientCapabilities.IsSet())
	{
		QueryParams.Add(FString(TEXT("client_capabilities=")) + ToUrlString(ClientCapabilities.GetValue()));
	}
	if(FetchEventTypes.IsSet())
	{
		QueryParams.Add(FString(TEXT("fetch_event_types=")) + CollectionToUrlString_multi(FetchEventTypes.GetValue(), TEXT("fetch_event_types")));
	}
	if(Narrow.IsSet())
	{
		QueryParams.Add(FString(TEXT("narrow=")) + CollectionToUrlString_multi(Narrow.GetValue(), TEXT("narrow")));
	}
	Path += TCHAR('?');
	Path += FString::Join(QueryParams, TEXT("&"));

	return Path;
}

void OpenAPIRealTimeEventsApi::RegisterQueueRequest::SetupHttpRequest(const FHttpRequestRef& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("POST"));

	// Default to Json Body request
	if (Consumes.Num() == 0 || Consumes.Contains(TEXT("application/json")))
	{
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
	}
	else
	{
		UE_LOG(LogOpenAPI, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}

void OpenAPIRealTimeEventsApi::RegisterQueueResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
		SetResponseString(TEXT("Success."));
		break;
	}
}

bool OpenAPIRealTimeEventsApi::RegisterQueueResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

FString OpenAPIRealTimeEventsApi::RestErrorHandlingRequest::ComputePath() const
{
	FString Path(TEXT("/rest-error-handling"));
	return Path;
}

void OpenAPIRealTimeEventsApi::RestErrorHandlingRequest::SetupHttpRequest(const FHttpRequestRef& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("POST"));

	// Default to Json Body request
	if (Consumes.Num() == 0 || Consumes.Contains(TEXT("application/json")))
	{
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
	}
	else
	{
		UE_LOG(LogOpenAPI, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}

void OpenAPIRealTimeEventsApi::RestErrorHandlingResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 400:
		SetResponseString(TEXT("Bad request. "));
		break;
	case 401:
		SetResponseString(TEXT("Unauthorized. "));
		break;
	case 429:
		SetResponseString(TEXT("Rate limit exceeded. "));
		break;
	}
}

bool OpenAPIRealTimeEventsApi::RestErrorHandlingResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return true;
}

}