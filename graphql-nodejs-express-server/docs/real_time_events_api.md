# real_time_events_api

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteQueue**](real_time_events_api.md#DeleteQueue) | **DELETE** /events | Delete an event queue
[**GetEvents**](real_time_events_api.md#GetEvents) | **GET** /events | Get events from an event queue
[**RealTimePost**](real_time_events_api.md#RealTimePost) | **POST** /real-time | 
[**RegisterQueue**](real_time_events_api.md#RegisterQueue) | **POST** /register | Register an event queue
[**RestErrorHandling**](real_time_events_api.md#RestErrorHandling) | **POST** /rest-error-handling | Error handling


<a name="DeleteQueue"></a>
# **DeleteQueue**
> JsonSuccess DeleteQueue(queueId)

Delete an event queue

Delete a previously registered queue.  &#x60;DELETE {{ api_url }}/v1/events&#x60; 
<a name="GetEvents"></a>
# **GetEvents**
> JsonSuccessBase GetEvents(queueId, lastEventId, dontBlock)

Get events from an event queue

&#x60;GET {{ api_url }}/v1/events&#x60;  This endpoint allows you to receive new events from [a registered event queue](/api/register-queue).  Long-lived clients should use the &#x60;event_queue_longpoll_timeout_seconds&#x60; property returned by &#x60;POST /register&#x60; as the client-side HTTP request timeout for calls to this endpoint.  It is guaranteed to be higher than heartbeat frequency and should be respected by clients to avoid breaking when heartbeat frequency increases. 
<a name="RealTimePost"></a>
# **RealTimePost**
> RealTimePost(eventTypes, narrow, allPublicStreams)



(Ignored) 
<a name="RegisterQueue"></a>
# **RegisterQueue**
> JsonSuccessBase RegisterQueue(applyMarkdown, clientGravatar, slimPresence, eventTypes, allPublicStreams, includeSubscribers, clientCapabilities, fetchEventTypes, narrow)

Register an event queue

&#x60;POST {{ api_url }}/v1/register&#x60;  This powerful endpoint can be used to register a Zulip \&quot;event queue\&quot; (subscribed to certain types of \&quot;events\&quot;, or updates to the messages and other Zulip data the current user has access to), as well as to fetch the current state of that data.  (&#x60;register&#x60; also powers the &#x60;call_on_each_event&#x60; Python API, and is intended primarily for complex applications for which the more convenient &#x60;call_on_each_event&#x60; API is insufficient).  This endpoint returns a &#x60;queue_id&#x60; and a &#x60;last_event_id&#x60;; these can be used in subsequent calls to the [\&quot;events\&quot; endpoint](/api/get-events) to request events from the Zulip server using long-polling.  The server will queue events for up to 10 minutes of inactivity. After 10 minutes, your event queue will be garbage-collected.  The server will send &#x60;heartbeat&#x60; events every minute, which makes it easy to implement a robust client that does not miss events unless the client loses network connectivity with the Zulip server for 10 minutes or longer.  Once the server garbage-collects your event queue, the server will [return an error](/api/get-events#bad_event_queue_id-errors) with a code of &#x60;BAD_EVENT_QUEUE_ID&#x60; if you try to fetch events from the event queue.  Your software will need to handle that error condition by re-initializing itself (e.g. this is what triggers your browser reloading the Zulip web app when your laptop comes back online after being offline for more than 10 minutes).  When prototyping with this API, we recommend first calling &#x60;register&#x60; with no &#x60;event_types&#x60; parameter to see all the available data from all supported event types.  Before using your client in production, you should set appropriate &#x60;event_types&#x60; and &#x60;fetch_event_types&#x60; filters so that your client only requests the data it needs.  A few minutes doing this often saves 90% of the total bandwidth and other resources consumed by a client using this API.  See the [events system developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/events-system.html) if you need deeper details about how the Zulip event queue system works, avoids clients needing to worry about large classes of potentially messy races, etc. 
<a name="RestErrorHandling"></a>
# **RestErrorHandling**
> RestErrorHandling()

Error handling

Common error to many endpoints 
