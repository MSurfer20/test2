@isTest
private class OASAuthenticationApiTest {
    /**
     * Fetch an API key (development only)
     *
     * For easy testing of mobile apps and other clients and against Zulip\ndevelopment servers, we support fetching a Zulip API key for any user\non the development server without authentication (so that they can\nimplement analogues of the one-click login process available for Zulip\ndevelopment servers on the web).\n\n**Note:** This endpoint is only available on Zulip development\nservers; for obvious security reasons it will always return an error\nin a Zulip production server.\n\n&#x60;POST {{ api_url }}/v1/dev_fetch_api_key&#x60;\n
     */
    @isTest
    private static void devFetchApiKeyTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'username' => iago@zulip.com
        };

        OASClient client;
        OASAuthenticationApi api;
        OASApiKeyResponse response;
        OASApiKeyResponse expectedResponse;
        String js = '';

        api = new OASAuthenticationApi(new OASClient());

        api.devFetchApiKey(params);
    }

    /**
     * Fetch an API key (production)
     *
     * This API endpoint is used by clients such as the Zulip mobile and\nterminal apps to implement password-based authentication.  Given the\nuser\&#39;s Zulip login credentials, it returns a Zulip API key that the client\ncan use to make requests requests as the user.\n\nThis endpoint is only useful for Zulip servers/organizations with\nEmailAuthBackend or LDAPAuthBackend enabled.\n\nThe Zulip mobile apps also support SSO/social authentication (GitHub\nauth, Google auth, SAML, etc.) that does not use this endpoint.  Instead,\nthe mobile apps reuse the web login flow passing the &#x60;mobile_flow_otp&#x60; in\na webview, and the credentials are returned to the app (encrypted) via a redirect\nto a &#x60;zulip://&#x60; URL.\n\n!!! warn &quot;&quot;\n    **Note:** If you signed up using passwordless authentication and\n    never had a password, you can [reset your password](/help/change-your-password).\n\n    See the [API keys](/api/api-keys) documentation for\n    more details on how to download API key manually.\n\nIn a [Zulip development environment](https://zulip.readthedocs.io/en/latest/development/overview.html),\nsee also [the unauthenticated variant](/api/dev-fetch-api-key).\n
     */
    @isTest
    private static void fetchApiKeyTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'username' => iago@zulip.com,
            'password' => abcd1234
        };

        OASClient client;
        OASAuthenticationApi api;
        OASApiKeyResponse response;
        OASApiKeyResponse expectedResponse;
        String js = '';

        api = new OASAuthenticationApi(new OASClient());

        api.fetchApiKey(params);
    }
}