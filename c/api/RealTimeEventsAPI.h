#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/bad_event_queue_id_error.h"
#include "../model/json_success.h"
#include "../model/json_success_base.h"
#include "../model/object.h"
#include "../model/one_of_invalid_api_key_error_missing_argument_error_user_not_authorized_error.h"
#include "../model/one_of_rate_limited_error.h"
#include "../model/one_of_user_deactivated_error_realm_deactivated_error.h"


// Delete an event queue
//
// Delete a previously registered queue.  `DELETE {{ api_url }}/v1/events` 
//
json_success_t*
RealTimeEventsAPI_deleteQueue(apiClient_t *apiClient, char * queue_id );


// Get events from an event queue
//
// `GET {{ api_url }}/v1/events`  This endpoint allows you to receive new events from [a registered event queue](/api/register-queue).  Long-lived clients should use the `event_queue_longpoll_timeout_seconds` property returned by `POST /register` as the client-side HTTP request timeout for calls to this endpoint.  It is guaranteed to be higher than heartbeat frequency and should be respected by clients to avoid breaking when heartbeat frequency increases. 
//
json_success_base_t*
RealTimeEventsAPI_getEvents(apiClient_t *apiClient, char * queue_id , int last_event_id , int dont_block );


// (Ignored) 
//
void
RealTimeEventsAPI_realTimePost(apiClient_t *apiClient, list_t * event_types , list_t * narrow , int all_public_streams );


// Register an event queue
//
// `POST {{ api_url }}/v1/register`  This powerful endpoint can be used to register a Zulip \"event queue\" (subscribed to certain types of \"events\", or updates to the messages and other Zulip data the current user has access to), as well as to fetch the current state of that data.  (`register` also powers the `call_on_each_event` Python API, and is intended primarily for complex applications for which the more convenient `call_on_each_event` API is insufficient).  This endpoint returns a `queue_id` and a `last_event_id`; these can be used in subsequent calls to the [\"events\" endpoint](/api/get-events) to request events from the Zulip server using long-polling.  The server will queue events for up to 10 minutes of inactivity. After 10 minutes, your event queue will be garbage-collected.  The server will send `heartbeat` events every minute, which makes it easy to implement a robust client that does not miss events unless the client loses network connectivity with the Zulip server for 10 minutes or longer.  Once the server garbage-collects your event queue, the server will [return an error](/api/get-events#bad_event_queue_id-errors) with a code of `BAD_EVENT_QUEUE_ID` if you try to fetch events from the event queue.  Your software will need to handle that error condition by re-initializing itself (e.g. this is what triggers your browser reloading the Zulip web app when your laptop comes back online after being offline for more than 10 minutes).  When prototyping with this API, we recommend first calling `register` with no `event_types` parameter to see all the available data from all supported event types.  Before using your client in production, you should set appropriate `event_types` and `fetch_event_types` filters so that your client only requests the data it needs.  A few minutes doing this often saves 90% of the total bandwidth and other resources consumed by a client using this API.  See the [events system developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/events-system.html) if you need deeper details about how the Zulip event queue system works, avoids clients needing to worry about large classes of potentially messy races, etc. 
//
json_success_base_t*
RealTimeEventsAPI_registerQueue(apiClient_t *apiClient, int apply_markdown , int client_gravatar , int slim_presence , list_t * event_types , int all_public_streams , int include_subscribers ,  client_capabilities , list_t * fetch_event_types , list_t * narrow );


// Error handling
//
// Common error to many endpoints 
//
void
RealTimeEventsAPI_restErrorHandling(apiClient_t *apiClient);


