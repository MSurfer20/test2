@isTest
private class OASServerAndOrganizationsApiTest {
    /**
     * Add a code playground
     *
     * Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.\n\n&#x60;POST {{ api_url }}/v1/realm/playgrounds&#x60;\n\n**Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was\nfixed in Zulip 4.0 (feature level 57).\n
     */
    @isTest
    private static void addCodePlaygroundTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'name' => Python playground,
            'pygmentsLanguage' => Python,
            'urlPrefix' => https://python.example.com
        };

        OASClient client;
        OASServerAndOrganizationsApi api;
        OASJsonSuccessBase response;
        OASJsonSuccessBase expectedResponse;
        String js = '';

        api = new OASServerAndOrganizationsApi(new OASClient());

        api.addCodePlayground(params);
    }

    /**
     * Add a linkifier
     *
     * Configure [linkifiers](/help/add-a-custom-linkifier),\nregular expression patterns that are automatically linkified when they\nappear in messages and topics.\n\n&#x60;POST {{ api_url }}/v1/realm/filters&#x60;\n
     */
    @isTest
    private static void addLinkifierTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'pattern' => #(?P<id>[0-9]+),
            'urlFormatString' => https://github.com/zulip/zulip/issues/%(id)s
        };

        OASClient client;
        OASServerAndOrganizationsApi api;
        OASJsonSuccessBase response;
        OASJsonSuccessBase expectedResponse;
        String js = '';

        api = new OASServerAndOrganizationsApi(new OASClient());

        api.addLinkifier(params);
    }

    /**
     * Create a custom profile field
     *
     * [Create a custom profile field](/help/add-custom-profile-fields) in the user\&#39;s organization.\n\n&#x60;POST {{ api_url }}/v1/realm/profile_fields&#x60;\n
     */
    @isTest
    private static void createCustomProfileFieldTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'fieldType' => 3,
            'name' => Favorite programming language,
            'r_hint' => Your favorite programming language.,
            'fieldData' => 
        };

        OASClient client;
        OASServerAndOrganizationsApi api;
        OASJsonSuccessBase response;
        OASJsonSuccessBase expectedResponse;
        String js = '';

        api = new OASServerAndOrganizationsApi(new OASClient());

        api.createCustomProfileField(params);
    }

    /**
     * Get all custom emoji
     *
     * Get all the custom emoji in the user\&#39;s organization.\n\n&#x60;GET {{ api_url }}/v1/realm/emoji&#x60;\n
     */
    @isTest
    private static void getCustomEmojiTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASServerAndOrganizationsApi api;
        OASJsonSuccessBase response;
        OASJsonSuccessBase expectedResponse;
        String js = '';

        api = new OASServerAndOrganizationsApi(new OASClient());

        api.getCustomEmoji();
    }

    /**
     * Get all custom profile fields
     *
     * Get all the [custom profile fields](/help/add-custom-profile-fields)\nconfigured for the user\&#39;s organization.\n\n&#x60;GET {{ api_url }}/v1/realm/profile_fields&#x60;\n
     */
    @isTest
    private static void getCustomProfileFieldsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASServerAndOrganizationsApi api;
        OASJsonSuccessBase response;
        OASJsonSuccessBase expectedResponse;
        String js = '';

        api = new OASServerAndOrganizationsApi(new OASClient());

        api.getCustomProfileFields();
    }

    /**
     * Get linkifiers
     *
     * List all of an organization\&#39;s configured\n[linkifiers](/help/add-a-custom-linkifier), regular\nexpression patterns that are automatically linkified when they appear\nin messages and topics.\n\n&#x60;GET {{ api_url }}/v1/realm/linkifiers&#x60;\n\n**Changes**: New in Zulip 4.0 (feature level 54). On older versions,\na similar &#x60;GET /realm/filters&#x60; endpoint was available with each entry in\na &#x60;[pattern, url_format, id]&#x60; tuple format.\n
     */
    @isTest
    private static void getLinkifiersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASServerAndOrganizationsApi api;
        OASJsonSuccessBase response;
        OASJsonSuccessBase expectedResponse;
        String js = '';

        api = new OASServerAndOrganizationsApi(new OASClient());

        api.getLinkifiers();
    }

    /**
     * Get server settings
     *
     * Fetch global settings for a Zulip server.\n\n&#x60;GET {{ api_url }}/v1/server_settings&#x60;\n\n**Note:** this endpoint does not require any authentication at all, and you can use it to check:\n\n* If this is a Zulip server, and if so, what version of Zulip it\&#39;s running.\n* What a Zulip client (e.g. a mobile app or\n[zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to\nknow in order to display a login prompt for the server (e.g. what\nauthentication methods are available).\n
     */
    @isTest
    private static void getServerSettingsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASServerAndOrganizationsApi api;
        OASJsonSuccessBase response;
        OASJsonSuccessBase expectedResponse;
        String js = '';

        api = new OASServerAndOrganizationsApi(new OASClient());

        api.getServerSettings();
    }

    /**
     * Remove a code playground
     *
     * Remove a [code playground](/help/code-blocks#code-playgrounds) previously\nconfigured for an organization.\n\n&#x60;DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}&#x60;\n\n**Changes**: New in Zulip 4.0 (feature level 49).\n
     */
    @isTest
    private static void removeCodePlaygroundTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'playgroundId' => 1
        };

        OASClient client;
        OASServerAndOrganizationsApi api;
        OASJsonSuccess response;
        OASJsonSuccess expectedResponse;
        String js = '';

        api = new OASServerAndOrganizationsApi(new OASClient());

        api.removeCodePlayground(params);
    }

    /**
     * Remove a linkifier
     *
     * Remove [linkifiers](/help/add-a-custom-linkifier), regular\nexpression patterns that are automatically linkified when they appear\nin messages and topics.\n\n&#x60;DELETE {{ api_url }}/v1/realm/filters/{filter_id}&#x60;\n
     */
    @isTest
    private static void removeLinkifierTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'filterId' => 42
        };

        OASClient client;
        OASServerAndOrganizationsApi api;
        OASJsonSuccess response;
        OASJsonSuccess expectedResponse;
        String js = '';

        api = new OASServerAndOrganizationsApi(new OASClient());

        api.removeLinkifier(params);
    }

    /**
     * Reorder custom profile fields
     *
     * Reorder the custom profile fields in the user\&#39;s organization.\n\n&#x60;PATCH {{ api_url }}/v1/realm/profile_fields&#x60;\n\nCustom profile fields are displayed in Zulip UI widgets in order; this\nendpoint allows administrative settings UI to change the field ordering.\n\nThis endpoint is used to implement the dragging feature described in the\n[custom profile fields documentation](/help/add-custom-profile-fields).\n
     */
    @isTest
    private static void reorderCustomProfileFieldsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'order' => new List<Integer>{0}
        };

        OASClient client;
        OASServerAndOrganizationsApi api;
        OASJsonSuccess response;
        OASJsonSuccess expectedResponse;
        String js = '';

        api = new OASServerAndOrganizationsApi(new OASClient());

        api.reorderCustomProfileFields(params);
    }

    /**
     * Update a linkifier
     *
     * Update a [linkifier](/help/add-a-custom-linkifier), regular\nexpression patterns that are automatically linkified when they appear\nin messages and topics.\n\n&#x60;PATCH {{ api_url }}/v1/realm/filters/{filter_id}&#x60;\n\n**Changes**: New in Zulip 4.0 (feature level 57).\n
     */
    @isTest
    private static void updateLinkifierTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'filterId' => 2,
            'pattern' => #(?P<id>[0-9]+),
            'urlFormatString' => https://github.com/zulip/zulip/issues/%(id)s
        };

        OASClient client;
        OASServerAndOrganizationsApi api;
        OASJsonSuccess response;
        OASJsonSuccess expectedResponse;
        String js = '';

        api = new OASServerAndOrganizationsApi(new OASClient());

        api.updateLinkifier(params);
    }

    /**
     * Upload custom emoji
     *
     * This endpoint is used to upload a custom emoji for use in the user\&#39;s\norganization.  Access to this endpoint depends on the\n[organization\&#39;s configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).\n\n&#x60;POST {{ api_url }}/v1/realm/emoji/{emoji_name}&#x60;\n
     */
    @isTest
    private static void uploadCustomEmojiTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'emojiName' => smile,
            'filename' => Blob.valueOf('Sample text file\nContents')
        };

        OASClient client;
        OASServerAndOrganizationsApi api;
        OASJsonSuccess response;
        OASJsonSuccess expectedResponse;
        String js = '';

        api = new OASServerAndOrganizationsApi(new OASClient());

        api.uploadCustomEmoji(params);
    }
}