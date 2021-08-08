@isTest
private class OASWebhooksApiTest {
    /**
     * Outgoing webhooks
     *
     * Outgoing webhooks allows to build or set up Zulip integrations which are\nnotified when certain types of messages are sent in Zulip.\n
     */
    @isTest
    private static void zulipOutgoingWebhooksTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASWebhooksApi api;
        OASInlineResponse200 response;
        OASInlineResponse200 expectedResponse;
        String js = '';

        api = new OASWebhooksApi(new OASClient());

        js = JSON.serialize(OASInlineResponse200.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASInlineResponse200.getExample();
        response = (OASInlineResponse200) api.zulipOutgoingWebhooks();
        System.assertEquals(expectedResponse, response);
    }
}