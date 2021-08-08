@isTest
private class OASRealTimeEventsApiTest {
    /**
     * Delete an event queue
     *
     * Delete a previously registered queue.\n\n&#x60;DELETE {{ api_url }}/v1/events&#x60;\n
     */
    @isTest
    private static void deleteQueueTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'queueId' => 1375801870:2942
        };

        OASClient client;
        OASRealTimeEventsApi api;
        OASJsonSuccess response;
        OASJsonSuccess expectedResponse;
        String js = '';

        api = new OASRealTimeEventsApi(new OASClient());

        api.deleteQueue(params);
    }

    /**
     * Get events from an event queue
     *
     * &#x60;GET {{ api_url }}/v1/events&#x60;\n\nThis endpoint allows you to receive new events from\n[a registered event queue](/api/register-queue).\n\nLong-lived clients should use the\n&#x60;event_queue_longpoll_timeout_seconds&#x60; property returned by\n&#x60;POST /register&#x60; as the client-side HTTP request timeout for\ncalls to this endpoint.  It is guaranteed to be higher than\nheartbeat frequency and should be respected by clients to\navoid breaking when heartbeat frequency increases.\n
     */
    @isTest
    private static void getEventsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'queueId' => 1375801870:2942,
            'lastEventId' => -1,
            'dontBlock' => true
        };

        OASClient client;
        OASRealTimeEventsApi api;
        OASJsonSuccessBase response;
        OASJsonSuccessBase expectedResponse;
        String js = '';

        api = new OASRealTimeEventsApi(new OASClient());

        api.getEvents(params);
    }

    /**
     * 
     *
     * (Ignored)\n
     */
    @isTest
    private static void realTimePostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'eventTypes' => new List<String>{''},
            'narrow' => new List<List<String>>{new List<String>{''}},
            'allPublicStreams' => true
        };

        OASClient client;
        OASRealTimeEventsApi api;
        String js = '';

        api = new OASRealTimeEventsApi(new OASClient());

        api.realTimePost(params);
    }

    /**
     * Register an event queue
     *
     * &#x60;POST {{ api_url }}/v1/register&#x60;\n\nThis powerful endpoint can be used to register a Zulip &quot;event queue&quot;\n(subscribed to certain types of &quot;events&quot;, or updates to the messages\nand other Zulip data the current user has access to), as well as to\nfetch the current state of that data.\n\n(&#x60;register&#x60; also powers the &#x60;call_on_each_event&#x60; Python API, and is\nintended primarily for complex applications for which the more convenient\n&#x60;call_on_each_event&#x60; API is insufficient).\n\nThis endpoint returns a &#x60;queue_id&#x60; and a &#x60;last_event_id&#x60;; these can be\nused in subsequent calls to the\n[&quot;events&quot; endpoint](/api/get-events) to request events from\nthe Zulip server using long-polling.\n\nThe server will queue events for up to 10 minutes of inactivity.\nAfter 10 minutes, your event queue will be garbage-collected.  The\nserver will send &#x60;heartbeat&#x60; events every minute, which makes it easy\nto implement a robust client that does not miss events unless the\nclient loses network connectivity with the Zulip server for 10 minutes\nor longer.\n\nOnce the server garbage-collects your event queue, the server will\n[return an error](/api/get-events#bad_event_queue_id-errors)\nwith a code of &#x60;BAD_EVENT_QUEUE_ID&#x60; if you try to fetch events from\nthe event queue.  Your software will need to handle that error\ncondition by re-initializing itself (e.g. this is what triggers your\nbrowser reloading the Zulip web app when your laptop comes back online\nafter being offline for more than 10 minutes).\n\nWhen prototyping with this API, we recommend first calling &#x60;register&#x60;\nwith no &#x60;event_types&#x60; parameter to see all the available data from all\nsupported event types.  Before using your client in production, you\nshould set appropriate &#x60;event_types&#x60; and &#x60;fetch_event_types&#x60; filters\nso that your client only requests the data it needs.  A few minutes\ndoing this often saves 90% of the total bandwidth and other resources\nconsumed by a client using this API.\n\nSee the\n[events system developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/events-system.html)\nif you need deeper details about how the Zulip event queue system\nworks, avoids clients needing to worry about large classes of\npotentially messy races, etc.\n
     */
    @isTest
    private static void registerQueueTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'applyMarkdown' => true,
            'clientGravatar' => true,
            'slimPresence' => true,
            'eventTypes' => new List<String>{''},
            'allPublicStreams' => true,
            'includeSubscribers' => true,
            'clientCapabilities' => ,
            'fetchEventTypes' => new List<String>{''},
            'narrow' => new List<List<String>>{new List<String>{''}}
        };

        OASClient client;
        OASRealTimeEventsApi api;
        OASJsonSuccessBase response;
        OASJsonSuccessBase expectedResponse;
        String js = '';

        api = new OASRealTimeEventsApi(new OASClient());

        api.registerQueue(params);
    }

    /**
     * Error handling
     *
     * Common error to many endpoints\n
     */
    @isTest
    private static void restErrorHandlingTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASRealTimeEventsApi api;
        String js = '';

        api = new OASRealTimeEventsApi(new OASClient());

        api.restErrorHandling();
    }
}