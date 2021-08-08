@isTest
private class OASDraftsApiTest {
    /**
     * Create drafts
     *
     * Create one or more drafts on the server. These drafts will be automatically\nsynchronized to other clients via &#x60;drafts&#x60; events.\n\n&#x60;POST {{ api_url }}/v1/drafts&#x60;\n
     */
    @isTest
    private static void createDraftsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(201);
        res.setStatus('Created');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'drafts' => new List<OASDraft>{OASDraft.getExample()}
        };

        OASClient client;
        OASDraftsApi api;
        OASJsonSuccess response;
        OASJsonSuccess expectedResponse;
        String js = '';

        api = new OASDraftsApi(new OASClient());

        api.createDrafts(params);
    }

    /**
     * Delete a draft
     *
     * Delete a single draft from the server. The deletion will be automatically\nsynchronized to other clients via a &#x60;drafts&#x60; event.\n\n&#x60;DELETE {{ api_url }}/v1/drafts/{draft_id}&#x60;\n
     */
    @isTest
    private static void deleteDraftTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'draftId' => 1
        };

        OASClient client;
        OASDraftsApi api;
        OASJsonSuccess response;
        OASJsonSuccess expectedResponse;
        String js = '';

        api = new OASDraftsApi(new OASClient());

        api.deleteDraft(params);
    }

    /**
     * Edit a draft
     *
     * Edit a draft on the server. The edit will be automatically\nsynchronized to other clients via &#x60;drafts&#x60; events.\n\n&#x60;PATCH {{ api_url }}/v1/drafts/{draft_id}&#x60;\n
     */
    @isTest
    private static void editDraftTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'draftId' => 2,
            'draft' => ''
        };

        OASClient client;
        OASDraftsApi api;
        OASJsonSuccess response;
        OASJsonSuccess expectedResponse;
        String js = '';

        api = new OASDraftsApi(new OASClient());

        api.editDraft(params);
    }

    /**
     * Get drafts
     *
     * Fetch all drafts for the current user.\n\n&#x60;GET {{ api_url }}/v1/drafts&#x60;\n
     */
    @isTest
    private static void getDraftsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASDraftsApi api;
        OASJsonSuccess response;
        OASJsonSuccess expectedResponse;
        String js = '';

        api = new OASDraftsApi(new OASClient());

        api.getDrafts();
    }
}