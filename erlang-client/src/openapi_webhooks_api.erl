-module(openapi_webhooks_api).

-export([zulip_outgoing_webhooks/1, zulip_outgoing_webhooks/2]).

-define(BASE_URL, <<"/api/v1">>).

%% @doc Outgoing webhooks
%% Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 
-spec zulip_outgoing_webhooks(ctx:ctx()) -> {ok, openapi_inline_response_200:openapi_inline_response_200(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
zulip_outgoing_webhooks(Ctx) ->
    zulip_outgoing_webhooks(Ctx, #{}).

-spec zulip_outgoing_webhooks(ctx:ctx(), maps:map()) -> {ok, openapi_inline_response_200:openapi_inline_response_200(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
zulip_outgoing_webhooks(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/zulip-outgoing-webhook">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


