-module(openapi_authentication_api).

-export([dev_fetch_api_key/2, dev_fetch_api_key/3,
         fetch_api_key/3, fetch_api_key/4]).

-define(BASE_URL, <<"/api/v1">>).

%% @doc Fetch an API key (development only)
%% For easy testing of mobile apps and other clients and against Zulip development servers, we support fetching a Zulip API key for any user on the development server without authentication (so that they can implement analogues of the one-click login process available for Zulip development servers on the web).  **Note:** This endpoint is only available on Zulip development servers; for obvious security reasons it will always return an error in a Zulip production server.  `POST {{ api_url }}/v1/dev_fetch_api_key` 
-spec dev_fetch_api_key(ctx:ctx(), binary()) -> {ok, openapi_api_key_response:openapi_api_key_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dev_fetch_api_key(Ctx, Username) ->
    dev_fetch_api_key(Ctx, Username, #{}).

-spec dev_fetch_api_key(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_api_key_response:openapi_api_key_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dev_fetch_api_key(Ctx, Username, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/dev_fetch_api_key">>],
    QS = lists:flatten([{<<"username">>, Username}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Fetch an API key (production)
%% This API endpoint is used by clients such as the Zulip mobile and terminal apps to implement password-based authentication.  Given the user's Zulip login credentials, it returns a Zulip API key that the client can use to make requests requests as the user.  This endpoint is only useful for Zulip servers/organizations with EmailAuthBackend or LDAPAuthBackend enabled.  The Zulip mobile apps also support SSO/social authentication (GitHub auth, Google auth, SAML, etc.) that does not use this endpoint.  Instead, the mobile apps reuse the web login flow passing the `mobile_flow_otp` in a webview, and the credentials are returned to the app (encrypted) via a redirect to a `zulip://` URL.  !!! warn \"\"     **Note:** If you signed up using passwordless authentication and     never had a password, you can [reset your password](/help/change-your-password).      See the [API keys](/api/api-keys) documentation for     more details on how to download API key manually.  In a [Zulip development environment](https://zulip.readthedocs.io/en/latest/development/overview.html), see also [the unauthenticated variant](/api/dev-fetch-api-key). 
-spec fetch_api_key(ctx:ctx(), binary(), binary()) -> {ok, openapi_api_key_response:openapi_api_key_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
fetch_api_key(Ctx, Username, Password) ->
    fetch_api_key(Ctx, Username, Password, #{}).

-spec fetch_api_key(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_api_key_response:openapi_api_key_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
fetch_api_key(Ctx, Username, Password, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/fetch_api_key">>],
    QS = lists:flatten([{<<"username">>, Username}, {<<"password">>, Password}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


