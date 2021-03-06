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
#include "OpenAPIWebhooksApi.h"

#include "OpenAPIInlineResponse200.h"

namespace OpenAPI 
{

/* Outgoing webhooks
 *
 * Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 
*/
class OPENAPI_API OpenAPIWebhooksApi::ZulipOutgoingWebhooksRequest : public Request
{
public:
    virtual ~ZulipOutgoingWebhooksRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;
    
};

class OPENAPI_API OpenAPIWebhooksApi::ZulipOutgoingWebhooksResponse : public Response
{
public:
    virtual ~ZulipOutgoingWebhooksResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
    
    OpenAPIInlineResponse200 Content;
};

}
