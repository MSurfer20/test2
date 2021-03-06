/**
 * Zulip REST API
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 5.2.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * WebhooksApi.h
 *
 * 
 */

#ifndef WebhooksApi_H_
#define WebhooksApi_H_


#include <memory>
#include <utility>

#include <corvusoft/restbed/session.hpp>
#include <corvusoft/restbed/resource.hpp>
#include <corvusoft/restbed/service.hpp>

#include "Inline_response_200.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

/// <summary>
/// Outgoing webhooks
/// </summary>
/// <remarks>
/// Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 
/// </remarks>
class  WebhooksApiZulip-outgoing-webhookResource: public restbed::Resource
{
public:
	WebhooksApiZulip-outgoing-webhookResource();
    virtual ~WebhooksApiZulip-outgoing-webhookResource();
    void POST_method_handler(const std::shared_ptr<restbed::Session> session);

	void set_handler_POST(
		std::function<std::pair<int, std::string>(
			
		)> handler
	);


private:
	std::function<std::pair<int, std::string>(
		
	)> handler_POST_;


};


//
// The restbed service to actually implement the REST server
//
class  WebhooksApi: public restbed::Service
{
public:
	WebhooksApi();
	~WebhooksApi();
	void startService(int const& port);
	void stopService();
	
protected:
	std::shared_ptr<WebhooksApiZulip-outgoing-webhookResource> m_spWebhooksApiZulip-outgoing-webhookResource;
};


}
}
}
}

#endif /* WebhooksApi_H_ */

