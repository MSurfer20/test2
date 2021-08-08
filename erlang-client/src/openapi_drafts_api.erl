-module(openapi_drafts_api).

-export([create_drafts/1, create_drafts/2,
         delete_draft/2, delete_draft/3,
         edit_draft/3, edit_draft/4,
         get_drafts/1, get_drafts/2]).

-define(BASE_URL, <<"/api/v1">>).

%% @doc Create drafts
%% Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` 
-spec create_drafts(ctx:ctx()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_drafts(Ctx) ->
    create_drafts(Ctx, #{}).

-spec create_drafts(ctx:ctx(), maps:map()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_drafts(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/drafts">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['drafts'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete a draft
%% Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` 
-spec delete_draft(ctx:ctx(), integer()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_draft(Ctx, DraftId) ->
    delete_draft(Ctx, DraftId, #{}).

-spec delete_draft(ctx:ctx(), integer(), maps:map()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_draft(Ctx, DraftId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = delete,
    Path = [<<"/drafts/", DraftId, "">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Edit a draft
%% Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` 
-spec edit_draft(ctx:ctx(), integer(), openapi_draft:openapi_draft()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
edit_draft(Ctx, DraftId, Draft) ->
    edit_draft(Ctx, DraftId, Draft, #{}).

-spec edit_draft(ctx:ctx(), integer(), openapi_draft:openapi_draft(), maps:map()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
edit_draft(Ctx, DraftId, Draft, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = patch,
    Path = [<<"/drafts/", DraftId, "">>],
    QS = lists:flatten([{<<"draft">>, Draft}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get drafts
%% Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` 
-spec get_drafts(ctx:ctx()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_drafts(Ctx) ->
    get_drafts(Ctx, #{}).

-spec get_drafts(ctx:ctx(), maps:map()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_drafts(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/drafts">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


