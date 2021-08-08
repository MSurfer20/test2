@isTest
private class OASStreamsApiTest {
    /**
     * Archive a stream
     *
     * [Archive the stream](/help/archive-a-stream) with the ID &#x60;stream_id&#x60;.\n\n&#x60;DELETE {{ api_url }}/v1/streams/{stream_id}&#x60;\n
     */
    @isTest
    private static void archiveStreamTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'streamId' => 1
        };

        OASClient client;
        OASStreamsApi api;
        OASJsonSuccess response;
        OASJsonSuccess expectedResponse;
        String js = '';

        api = new OASStreamsApi(new OASClient());

        api.archiveStream(params);
    }

    /**
     * Create BigBlueButton video call
     *
     * Create a video call URL for a BigBlueButton video call.\nRequires BigBlueButton to be configured on the Zulip server.\n
     */
    @isTest
    private static void createBigBlueButtonVideoCallTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASStreamsApi api;
        OASJsonSuccessBase response;
        OASJsonSuccessBase expectedResponse;
        String js = '';

        api = new OASStreamsApi(new OASClient());

        api.createBigBlueButtonVideoCall();
    }

    /**
     * Delete a topic
     *
     * Delete all messages in a topic.\n\n&#x60;POST {{ api_url }}/v1/streams/{stream_id}/delete_topic&#x60;\n\nTopics are a field on messages (not an independent\ndata structure), so deleting all the messages in the topic\ndeletes the topic from Zulip.\n
     */
    @isTest
    private static void deleteTopicTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'streamId' => 1,
            'topicName' => new coffee machine
        };

        OASClient client;
        OASStreamsApi api;
        OASJsonSuccess response;
        OASJsonSuccess expectedResponse;
        String js = '';

        api = new OASStreamsApi(new OASClient());

        api.deleteTopic(params);
    }

    /**
     * Get stream ID
     *
     * Get the unique ID of a given stream.\n\n&#x60;GET {{ api_url }}/v1/get_stream_id&#x60;\n
     */
    @isTest
    private static void getStreamIdTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'stream' => Denmark
        };

        OASClient client;
        OASStreamsApi api;
        OASJsonSuccessBase response;
        OASJsonSuccessBase expectedResponse;
        String js = '';

        api = new OASStreamsApi(new OASClient());

        api.getStreamId(params);
    }

    /**
     * Get topics in a stream
     *
     * Get all the topics in a specific stream\n\n&#x60;GET {{ api_url }}/v1/users/me/{stream_id}/topics&#x60;\n
     */
    @isTest
    private static void getStreamTopicsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'streamId' => 1
        };

        OASClient client;
        OASStreamsApi api;
        OASJsonSuccessBase response;
        OASJsonSuccessBase expectedResponse;
        String js = '';

        api = new OASStreamsApi(new OASClient());

        api.getStreamTopics(params);
    }

    /**
     * Get all streams
     *
     * Get all streams that the user has access to.\n\n&#x60;GET {{ api_url }}/v1/streams&#x60;\n
     */
    @isTest
    private static void getStreamsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'includePublic' => false,
            'includeWebPublic' => true,
            'includeSubscribed' => false,
            'includeAllActive' => true,
            'includeDefault' => true,
            'includeOwnerSubscribed' => true
        };

        OASClient client;
        OASStreamsApi api;
        OASJsonSuccessBase response;
        OASJsonSuccessBase expectedResponse;
        String js = '';

        api = new OASStreamsApi(new OASClient());

        api.getStreams(params);
    }

    /**
     * Get the subscribers of a stream
     *
     * Get all users subscribed to a stream.\n\n&#x60;Get {{ api_url }}/v1/streams/{stream_id}/members&#x60;\n
     */
    @isTest
    private static void getSubscribersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'streamId' => 1
        };

        OASClient client;
        OASStreamsApi api;
        OASJsonSuccessBase response;
        OASJsonSuccessBase expectedResponse;
        String js = '';

        api = new OASStreamsApi(new OASClient());

        api.getSubscribers(params);
    }

    /**
     * Get subscription status
     *
     * Check whether a user is subscribed to a stream.\n\n&#x60;GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}&#x60;\n\n**Changes**: New in Zulip 3.0 (feature level 11).\n
     */
    @isTest
    private static void getSubscriptionStatusTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'userId' => 12,
            'streamId' => 1
        };

        OASClient client;
        OASStreamsApi api;
        OASJsonSuccessBase response;
        OASJsonSuccessBase expectedResponse;
        String js = '';

        api = new OASStreamsApi(new OASClient());

        api.getSubscriptionStatus(params);
    }

    /**
     * Get subscribed streams
     *
     * Get all streams that the user is subscribed to.\n\n&#x60;GET {{ api_url }}/v1/users/me/subscriptions&#x60;\n
     */
    @isTest
    private static void getSubscriptionsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'includeSubscribers' => true
        };

        OASClient client;
        OASStreamsApi api;
        OASJsonSuccessBase response;
        OASJsonSuccessBase expectedResponse;
        String js = '';

        api = new OASStreamsApi(new OASClient());

        api.getSubscriptions(params);
    }

    /**
     * Topic muting
     *
     * This endpoint mutes/unmutes a topic within a stream that the current\nuser is subscribed to.  Muted topics are displayed faded in the Zulip\nUI, and are not included in the user\&#39;s unread count totals.\n\n&#x60;PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics&#x60;\n
     */
    @isTest
    private static void muteTopicTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'topic' => dinner,
            'op' => add,
            'stream' => Denmark,
            'streamId' => 42
        };

        OASClient client;
        OASStreamsApi api;
        OASJsonSuccess response;
        OASJsonSuccess expectedResponse;
        String js = '';

        api = new OASStreamsApi(new OASClient());

        api.muteTopic(params);
    }

    /**
     * Subscribe to a stream
     *
     * Subscribe one or more users to one or more streams.\n\n&#x60;POST {{ api_url }}/v1/users/me/subscriptions&#x60;\n\nIf any of the specified streams do not exist, they are automatically\ncreated.  The initial [stream settings](/api/update-stream) will be determined\nby the optional parameters like &#x60;invite_only&#x60; detailed below.\n
     */
    @isTest
    private static void subscribeTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'subscriptions' => new List<Object>{null},
            'principals' => new List<OASOneOfstringinteger>{OASOneOfstringinteger.getExample()},
            'authorizationErrorsFatal' => false,
            'announce' => true,
            'inviteOnly' => true,
            'historyPublicToSubscribers' => false,
            'streamPostPolicy' => 2,
            'messageRetentionDays' => 20
        };

        OASClient client;
        OASStreamsApi api;
        OASOneOfobjectobject response;
        OASOneOfobjectobject expectedResponse;
        String js = '';

        api = new OASStreamsApi(new OASClient());

        api.subscribe(params);
    }

    /**
     * Unsubscribe from a stream
     *
     * Unsubscribe yourself or other users from one or more streams.\n\n&#x60;DELETE {{ api_url }}/v1/users/me/subscriptions&#x60;\n
     */
    @isTest
    private static void unsubscribeTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'subscriptions' => new List<String>{''},
            'principals' => new List<OASOneOfstringinteger>{OASOneOfstringinteger.getExample()}
        };

        OASClient client;
        OASStreamsApi api;
        OASJsonSuccessBase response;
        OASJsonSuccessBase expectedResponse;
        String js = '';

        api = new OASStreamsApi(new OASClient());

        api.unsubscribe(params);
    }

    /**
     * Update a stream
     *
     * Configure the stream with the ID &#x60;stream_id&#x60;.  This endpoint supports\nan organization administrator editing any property of a stream,\nincluding:\n\n* Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description)\n* Stream [permissions](/help/stream-permissions), including\n[privacy](/help/change-the-privacy-of-a-stream) and [who can\nsend](/help/stream-sending-policy).\n\n&#x60;PATCH {{ api_url }}/v1/streams/{stream_id}&#x60;\n
     */
    @isTest
    private static void updateStreamTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'streamId' => 1,
            'description' => Discuss Italian history and travel destinations.,
            'newName' => Italy,
            'isPrivate' => true,
            'isAnnouncementOnly' => true,
            'streamPostPolicy' => 2,
            'historyPublicToSubscribers' => false,
            'messageRetentionDays' => 20
        };

        OASClient client;
        OASStreamsApi api;
        OASJsonSuccess response;
        OASJsonSuccess expectedResponse;
        String js = '';

        api = new OASStreamsApi(new OASClient());

        api.updateStream(params);
    }

    /**
     * Update subscription settings
     *
     * This endpoint is used to update the user\&#39;s personal settings for the\nstreams they are subscribed to, including muting, color, pinning, and\nper-stream notification settings.\n\n&#x60;POST {{ api_url }}/v1/users/me/subscriptions/properties&#x60;\n
     */
    @isTest
    private static void updateSubscriptionSettingsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'subscriptionData' => new List<Object>{null}
        };

        OASClient client;
        OASStreamsApi api;
        OASJsonSuccessBase response;
        OASJsonSuccessBase expectedResponse;
        String js = '';

        api = new OASStreamsApi(new OASClient());

        api.updateSubscriptionSettings(params);
    }

    /**
     * Update subscriptions
     *
     * Update which streams you are are subscribed to.\n
     */
    @isTest
    private static void updateSubscriptionsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_delete' => new List<String>{''},
            'add' => new List<Object>{null}
        };

        OASClient client;
        OASStreamsApi api;
        OASJsonSuccessBase response;
        OASJsonSuccessBase expectedResponse;
        String js = '';

        api = new OASStreamsApi(new OASClient());

        api.updateSubscriptions(params);
    }
}