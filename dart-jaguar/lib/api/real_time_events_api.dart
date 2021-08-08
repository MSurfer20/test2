import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_mimetype/jaguar_mimetype.dart';
import 'dart:async';

import 'package:openapi/model/json_success_base.dart';
import 'package:openapi/model/json_success.dart';
import 'package:openapi/model/one_of_user_deactivated_error_realm_deactivated_error.dart';
import 'package:openapi/model/bad_event_queue_id_error.dart';
import 'package:openapi/model/one_of_invalid_api_key_error_missing_argument_error_user_not_authorized_error.dart';
import 'package:openapi/model/one_of_rate_limited_error.dart';

part 'real_time_events_api.jretro.dart';

@GenApiClient()
class RealTimeEventsApi extends ApiClient with _$RealTimeEventsApiClient {
    final Route base;
    final Map<String, CodecRepo> converters;
    final Duration timeout;

    RealTimeEventsApi({this.base, this.converters, this.timeout = const Duration(minutes: 2)});

    /// Delete an event queue
    ///
    /// Delete a previously registered queue.  &#x60;DELETE {{ api_url }}/v1/events&#x60; 
    @DeleteReq(path: "/events")
    Future<JsonSuccess> deleteQueue(
        
            @QueryParam("queue_id") String queueId
        ) {
        return super.deleteQueue(
        
        queueId

        ).timeout(timeout);
    }

    /// Get events from an event queue
    ///
    /// &#x60;GET {{ api_url }}/v1/events&#x60;  This endpoint allows you to receive new events from [a registered event queue](/api/register-queue).  Long-lived clients should use the &#x60;event_queue_longpoll_timeout_seconds&#x60; property returned by &#x60;POST /register&#x60; as the client-side HTTP request timeout for calls to this endpoint.  It is guaranteed to be higher than heartbeat frequency and should be respected by clients to avoid breaking when heartbeat frequency increases. 
    @GetReq(path: "/events")
    Future<JsonSuccessBase> getEvents(
        
            @QueryParam("queue_id") String queueId, 
        
            @QueryParam("last_event_id") int lastEventId, 
        
            @QueryParam("dont_block") bool dontBlock
        ) {
        return super.getEvents(
        
        queueId, 
        
        lastEventId, 
        
        dontBlock

        ).timeout(timeout);
    }

    /// 
    ///
    /// (Ignored) 
    @PostReq(path: "/real-time")
    Future<void> realTimePost(
        
            @QueryParam("event_types") List<String> eventTypes, 
        
            @QueryParam("narrow") List<List<String>> narrow, 
        
            @QueryParam("all_public_streams") bool allPublicStreams
        ) {
        return super.realTimePost(
        
        eventTypes, 
        
        narrow, 
        
        allPublicStreams

        ).timeout(timeout);
    }

    /// Register an event queue
    ///
    /// &#x60;POST {{ api_url }}/v1/register&#x60;  This powerful endpoint can be used to register a Zulip \&quot;event queue\&quot; (subscribed to certain types of \&quot;events\&quot;, or updates to the messages and other Zulip data the current user has access to), as well as to fetch the current state of that data.  (&#x60;register&#x60; also powers the &#x60;call_on_each_event&#x60; Python API, and is intended primarily for complex applications for which the more convenient &#x60;call_on_each_event&#x60; API is insufficient).  This endpoint returns a &#x60;queue_id&#x60; and a &#x60;last_event_id&#x60;; these can be used in subsequent calls to the [\&quot;events\&quot; endpoint](/api/get-events) to request events from the Zulip server using long-polling.  The server will queue events for up to 10 minutes of inactivity. After 10 minutes, your event queue will be garbage-collected.  The server will send &#x60;heartbeat&#x60; events every minute, which makes it easy to implement a robust client that does not miss events unless the client loses network connectivity with the Zulip server for 10 minutes or longer.  Once the server garbage-collects your event queue, the server will [return an error](/api/get-events#bad_event_queue_id-errors) with a code of &#x60;BAD_EVENT_QUEUE_ID&#x60; if you try to fetch events from the event queue.  Your software will need to handle that error condition by re-initializing itself (e.g. this is what triggers your browser reloading the Zulip web app when your laptop comes back online after being offline for more than 10 minutes).  When prototyping with this API, we recommend first calling &#x60;register&#x60; with no &#x60;event_types&#x60; parameter to see all the available data from all supported event types.  Before using your client in production, you should set appropriate &#x60;event_types&#x60; and &#x60;fetch_event_types&#x60; filters so that your client only requests the data it needs.  A few minutes doing this often saves 90% of the total bandwidth and other resources consumed by a client using this API.  See the [events system developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/events-system.html) if you need deeper details about how the Zulip event queue system works, avoids clients needing to worry about large classes of potentially messy races, etc. 
    @PostReq(path: "/register")
    Future<JsonSuccessBase> registerQueue(
        
            @QueryParam("apply_markdown") bool applyMarkdown, 
        
            @QueryParam("client_gravatar") bool clientGravatar, 
        
            @QueryParam("slim_presence") bool slimPresence, 
        
            @QueryParam("event_types") List<String> eventTypes, 
        
            @QueryParam("all_public_streams") bool allPublicStreams, 
        
            @QueryParam("include_subscribers") bool includeSubscribers, 
        
            @QueryParam("client_capabilities") Object clientCapabilities, 
        
            @QueryParam("fetch_event_types") List<String> fetchEventTypes, 
        
            @QueryParam("narrow") List<List<String>> narrow
        ) {
        return super.registerQueue(
        
        applyMarkdown, 
        
        clientGravatar, 
        
        slimPresence, 
        
        eventTypes, 
        
        allPublicStreams, 
        
        includeSubscribers, 
        
        clientCapabilities, 
        
        fetchEventTypes, 
        
        narrow

        ).timeout(timeout);
    }

    /// Error handling
    ///
    /// Common error to many endpoints 
    @PostReq(path: "/rest-error-handling")
    Future<void> restErrorHandling(
        ) {
        return super.restErrorHandling(

        ).timeout(timeout);
    }


}
