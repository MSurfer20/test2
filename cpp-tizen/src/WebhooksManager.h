#ifndef _WebhooksManager_H_
#define _WebhooksManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Inline_response_200.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Webhooks Webhooks
 * \ingroup Operations
 *  @{
 */
class WebhooksManager {
public:
	WebhooksManager();
	virtual ~WebhooksManager();

/*! \brief Outgoing webhooks. *Synchronous*
 *
 * Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool zulipOutgoingWebhooksSync(char * accessToken,
	
	void(* handler)(Inline_response_200, Error, void* )
	, void* userData);

/*! \brief Outgoing webhooks. *Asynchronous*
 *
 * Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool zulipOutgoingWebhooksAsync(char * accessToken,
	
	void(* handler)(Inline_response_200, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://example.zulipchat.com/api/v1";
	}
};
/** @}*/

}
}
#endif /* WebhooksManager_H_ */
