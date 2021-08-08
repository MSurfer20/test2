@isTest
private class OASMessagesApiTest {
    /**
     * Add an emoji reaction
     *
     * Add an [emoji reaction](/help/emoji-reactions) to a message.\n\n&#x60;POST {{ api_url }}/v1/messages/{message_id}/reactions&#x60;\n
     */
    @isTest
    private static void addReactionTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'messageId' => 42,
            'emojiName' => octopus,
            'emojiCode' => 1f419,
            'reactionType' => unicode_emoji
        };

        OASClient client;
        OASMessagesApi api;
        OASJsonSuccess response;
        OASJsonSuccess expectedResponse;
        String js = '';

        api = new OASMessagesApi(new OASClient());

        api.addReaction(params);
    }

    /**
     * Check if messages match a narrow
     *
     * Check whether a set of messages match a [narrow](/api/construct-narrow).\n\n&#x60;GET {{ api_url }}/v1/messages/matches_narrow&#x60;\n\nFor many common narrows (E.g. a topic), clients can write an\nefficient client-side check to determine whether a\nnewly arrived message belongs in the view.\n\nThis endpoint is designed to allow clients to handle more complex narrows\nfor which the client does not (or in the case of full-text search,\ncannot) implement this check.\n\nThe format of the &#x60;match_subject&#x60; and &#x60;match_content&#x60; objects is designed to match\nthose of &#x60;GET /messages&#x60;, so that a client can splice these fields into a\n&#x60;message&#x60; object received from &#x60;GET /events&#x60; and end up with an extended message\nobject identical to how a &#x60;GET /messages&#x60; for the current narrow would have\nreturned the message.\n
     */
    @isTest
    private static void checkMessagesMatchNarrowTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'msgIds' => new List<Integer>{0},
            'narrow' => new List<Object>{null}
        };

        OASClient client;
        OASMessagesApi api;
        oas_any_type_not_mapped response;
        oas_any_type_not_mapped expectedResponse;
        String js = '';

        api = new OASMessagesApi(new OASClient());

        api.checkMessagesMatchNarrow(params);
    }

    /**
     * Delete a message
     *
     * Permanently delete a message.\n\n&#x60;DELETE {{ api_url }}/v1/messages/{msg_id}&#x60;\n\nThis API corresponds to the\n[delete a message completely][delete-completely] feature documented in\nthe Zulip Help Center.\n\n[delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely\n
     */
    @isTest
    private static void deleteMessageTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'messageId' => 42
        };

        OASClient client;
        OASMessagesApi api;
        OASJsonSuccess response;
        OASJsonSuccess expectedResponse;
        String js = '';

        api = new OASMessagesApi(new OASClient());

        api.deleteMessage(params);
    }

    /**
     * Get public temporary URL
     *
     * Get a temporary URL for access to the file that doesn\&#39;t require authentication.\n
     */
    @isTest
    private static void getFileTemporaryUrlTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'realmIdStr' => 1,
            'filename' => 4e/m2A3MSqFnWRLUf9SaPzQ0Up_/zulip.txt
        };

        OASClient client;
        OASMessagesApi api;
        OASJsonSuccessBase response;
        OASJsonSuccessBase expectedResponse;
        String js = '';

        api = new OASMessagesApi(new OASClient());

        api.getFileTemporaryUrl(params);
    }

    /**
     * Get a message\&#39;s edit history
     *
     * Fetch the message edit history of a previously edited message.\n\n&#x60;GET {{ api_url }}/v1/messages/{message_id}/history&#x60;\n\nNote that edit history may be disabled in some organizations; see the\n[Zulip Help Center documentation on editing messages][edit-settings].\n\n[edit-settings]: /help/view-a-messages-edit-history\n
     */
    @isTest
    private static void getMessageHistoryTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'messageId' => 42
        };

        OASClient client;
        OASMessagesApi api;
        OASJsonSuccessBase response;
        OASJsonSuccessBase expectedResponse;
        String js = '';

        api = new OASMessagesApi(new OASClient());

        api.getMessageHistory(params);
    }

    /**
     * Get messages
     *
     * Fetch message history from a Zulip server.\n\n&#x60;GET {{ api_url }}/v1/messages&#x60;\n\nThis &#x60;GET /api/v1/messages&#x60; endpoint is the primary way to fetch\nmessage history from a Zulip server.  It is useful both for Zulip\nclients (e.g. the web, desktop, mobile, and terminal clients) as well\nas bots, API clients, backup scripts, etc.\n\nBy specifying a [narrow filter](/api/construct-narrow), you can use\nthis endpoint to fetch the messages matching any search query that is\nsupported by Zulip\&#39;s powerful full-text search backend.\n\nWhen a narrow is not specified, it can be used to fetch a user\&#39;s\nmessage history. (We recommend paginating to 1000 messages at a time.)\n\nIn either case, you specify an &#x60;anchor&#x60; message (or ask the server to\ncalculate the first unread message for you and use that as the\nanchor), as well as a number of messages before and after the anchor\nmessage.  The server returns those messages, sorted by message ID, as\nwell as some metadata that makes it easy for a client to determine\nwhether there are more messages matching the query that were not\nreturned due to the &#x60;num_before&#x60; and &#x60;num_after&#x60; limits.\n\nWe recommend using &#x60;num_before &lt;&#x3D; 1000&#x60; and &#x60;num_after &lt;&#x3D; 1000&#x60; to\navoid generating very large HTTP responses. A maximum of 5000 messages\ncan be obtained per request; attempting to exceed this will result in an\nerror.\n
     */
    @isTest
    private static void getMessagesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'numBefore' => 4,
            'numAfter' => 8,
            'anchor' => 42,
            'narrow' => new List<Object>{null},
            'clientGravatar' => true,
            'applyMarkdown' => false,
            'useFirstUnreadAnchor' => true
        };

        OASClient client;
        OASMessagesApi api;
        OASJsonSuccessBase response;
        OASJsonSuccessBase expectedResponse;
        String js = '';

        api = new OASMessagesApi(new OASClient());

        api.getMessages(params);
    }

    /**
     * Get a message\&#39;s raw Markdown
     *
     * Get the raw content of a message.\n\n&#x60;GET {{ api_url }}/v1/messages/{msg_id}&#x60;\n\nThis is a rarely-used endpoint relevant for clients that primarily\nwork with HTML-rendered messages but might need to occasionally fetch\nthe message\&#39;s raw Markdown (e.g. for pre-filling a message-editing\nUI).\n
     */
    @isTest
    private static void getRawMessageTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'messageId' => 42
        };

        OASClient client;
        OASMessagesApi api;
        OASJsonSuccessBase response;
        OASJsonSuccessBase expectedResponse;
        String js = '';

        api = new OASMessagesApi(new OASClient());

        api.getRawMessage(params);
    }

    /**
     * Mark all messages as read
     *
     * Marks all of the current user\&#39;s unread messages as read.\n\n&#x60;POST {{ api_url }}/v1/mark_all_as_read&#x60;\n
     */
    @isTest
    private static void markAllAsReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASMessagesApi api;
        OASJsonSuccess response;
        OASJsonSuccess expectedResponse;
        String js = '';

        api = new OASMessagesApi(new OASClient());

        api.markAllAsRead();
    }

    /**
     * Mark messages in a stream as read
     *
     * Mark all the unread messages in a stream as read.\n
     */
    @isTest
    private static void markStreamAsReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'streamId' => 42
        };

        OASClient client;
        OASMessagesApi api;
        OASJsonSuccess response;
        OASJsonSuccess expectedResponse;
        String js = '';

        api = new OASMessagesApi(new OASClient());

        api.markStreamAsRead(params);
    }

    /**
     * Mark messages in a topic as read
     *
     * Mark all the unread messages in a topic as read.\n
     */
    @isTest
    private static void markTopicAsReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'streamId' => 42,
            'topicName' => new coffee machine
        };

        OASClient client;
        OASMessagesApi api;
        OASJsonSuccess response;
        OASJsonSuccess expectedResponse;
        String js = '';

        api = new OASMessagesApi(new OASClient());

        api.markTopicAsRead(params);
    }

    /**
     * Remove an emoji reaction
     *
     * Remove an [emoji reaction](/help/emoji-reactions) from a message.\n\n&#x60;DELETE {{ api_url }}/v1/messages/{message_id}/reactions&#x60;\n
     */
    @isTest
    private static void removeReactionTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'messageId' => 42,
            'emojiName' => octopus,
            'emojiCode' => 1f419,
            'reactionType' => unicode_emoji
        };

        OASClient client;
        OASMessagesApi api;
        OASJsonSuccess response;
        OASJsonSuccess expectedResponse;
        String js = '';

        api = new OASMessagesApi(new OASClient());

        api.removeReaction(params);
    }

    /**
     * Render message
     *
     * Render a message to HTML.\n\n&#x60;POST {{ api_url }}/v1/messages/render&#x60;\n
     */
    @isTest
    private static void renderMessageTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'content' => Hello
        };

        OASClient client;
        OASMessagesApi api;
        OASJsonSuccessBase response;
        OASJsonSuccessBase expectedResponse;
        String js = '';

        api = new OASMessagesApi(new OASClient());

        api.renderMessage(params);
    }

    /**
     * Send a message
     *
     * Send a stream or a private message.\n\n&#x60;POST {{ api_url }}/v1/messages&#x60;\n
     */
    @isTest
    private static void sendMessageTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(201);
        res.setStatus('Created');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'type' => private,
            'to' => new List<Integer>{0},
            'content' => Hello,
            'topic' => Castle,
            'queueId' => 1593114627:0,
            'localId' => 100.01
        };

        OASClient client;
        OASMessagesApi api;
        OASJsonSuccessBase response;
        OASJsonSuccessBase expectedResponse;
        String js = '';

        api = new OASMessagesApi(new OASClient());

        api.sendMessage(params);
    }

    /**
     * Edit a message
     *
     * Edit/update the content or topic of a message.\n\n&#x60;PATCH {{ api_url }}/v1/messages/{msg_id}&#x60;\n\n&#x60;{msg_id}&#x60; in the above URL should be replaced with the ID of the\nmessage you wish you update.\n\nYou can [resolve topics](/help/resolve-a-topic) by editing the\ntopic to &#x60;✔ {original_topic}&#x60;.\n\n**Note**: See [configuring message\nediting][config-message-editing] for detailed documentation on\nwhen users are allowed to edit topics.\n\n[config-message-editing]: /help/configure-message-editing-and-deletion\n
     */
    @isTest
    private static void updateMessageTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'messageId' => 42,
            'topic' => Castle,
            'propagateMode' => change_all,
            'sendNotificationToOldThread' => true,
            'sendNotificationToNewThread' => true,
            'content' => Hello,
            'streamId' => 42
        };

        OASClient client;
        OASMessagesApi api;
        OASJsonSuccess response;
        OASJsonSuccess expectedResponse;
        String js = '';

        api = new OASMessagesApi(new OASClient());

        api.updateMessage(params);
    }

    /**
     * Update personal message flags
     *
     * Add or remove personal message flags like &#x60;read&#x60; and &#x60;starred&#x60;\non a collection of message IDs.\n\n&#x60;POST {{ api_url }}/v1/messages/flags&#x60;\n\nFor updating the &#x60;read&#x60; flag on common collections of messages, see also\nthe\n[special endpoints for marking message as read in bulk](/api/mark-all-as-read).\n
     */
    @isTest
    private static void updateMessageFlagsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'messages' => new List<Integer>{0},
            'op' => add,
            'flag' => read
        };

        OASClient client;
        OASMessagesApi api;
        OASJsonSuccessBase response;
        OASJsonSuccessBase expectedResponse;
        String js = '';

        api = new OASMessagesApi(new OASClient());

        api.updateMessageFlags(params);
    }

    /**
     * Upload a file
     *
     * Upload a single file and get the corresponding URI.\n\n&#x60;POST {{ api_url }}/v1/user_uploads&#x60;\n\nInitially, only you will be able to access the link.  To share the\nuploaded file, you\&#39;ll need to [send a message][send-message]\ncontaining the resulting link.  Users who can already access the link\ncan reshare it with other users by sending additional Zulip messages\ncontaining the link.\n\n[uploaded-files]: /help/manage-your-uploaded-files\n[send-message]: /api/send-message\n
     */
    @isTest
    private static void uploadFileTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'filename' => Blob.valueOf('Sample text file\nContents')
        };

        OASClient client;
        OASMessagesApi api;
        OASJsonSuccessBase response;
        OASJsonSuccessBase expectedResponse;
        String js = '';

        api = new OASMessagesApi(new OASClient());

        api.uploadFile(params);
    }
}