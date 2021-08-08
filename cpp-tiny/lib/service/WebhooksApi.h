#ifndef TINY_CPP_CLIENT_WebhooksApi_H_
#define TINY_CPP_CLIENT_WebhooksApi_H_


#include "Response.h"
#include "Arduino.h"
#include "AbstractService.h"
#include "Helpers.h"
#include <list>

#include "Inline_response_200.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class WebhooksApi : public AbstractService {
public:
    WebhooksApi() = default;

    virtual ~WebhooksApi() = default;

    /**
    * Outgoing webhooks.
    *
    * Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 
    */
    Response<
                Inline_response_200
        >
    zulipOutgoingWebhooks(
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_WebhooksApi_H_ */