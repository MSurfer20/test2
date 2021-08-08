-module(openapi_server_and_organizations_api).

-export([add_code_playground/4, add_code_playground/5,
         add_linkifier/3, add_linkifier/4,
         create_custom_profile_field/2, create_custom_profile_field/3,
         get_custom_emoji/1, get_custom_emoji/2,
         get_custom_profile_fields/1, get_custom_profile_fields/2,
         get_linkifiers/1, get_linkifiers/2,
         get_server_settings/1, get_server_settings/2,
         remove_code_playground/2, remove_code_playground/3,
         remove_linkifier/2, remove_linkifier/3,
         reorder_custom_profile_fields/2, reorder_custom_profile_fields/3,
         update_linkifier/4, update_linkifier/5,
         upload_custom_emoji/2, upload_custom_emoji/3]).

-define(BASE_URL, <<"/api/v1">>).

%% @doc Add a code playground
%% Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  `POST {{ api_url }}/v1/realm/playgrounds`  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 
-spec add_code_playground(ctx:ctx(), binary(), binary(), binary()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
add_code_playground(Ctx, Name, PygmentsLanguage, UrlPrefix) ->
    add_code_playground(Ctx, Name, PygmentsLanguage, UrlPrefix, #{}).

-spec add_code_playground(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
add_code_playground(Ctx, Name, PygmentsLanguage, UrlPrefix, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/realm/playgrounds">>],
    QS = lists:flatten([{<<"name">>, Name}, {<<"pygments_language">>, PygmentsLanguage}, {<<"url_prefix">>, UrlPrefix}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Add a linkifier
%% Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `POST {{ api_url }}/v1/realm/filters` 
-spec add_linkifier(ctx:ctx(), binary(), binary()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
add_linkifier(Ctx, Pattern, UrlFormatString) ->
    add_linkifier(Ctx, Pattern, UrlFormatString, #{}).

-spec add_linkifier(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
add_linkifier(Ctx, Pattern, UrlFormatString, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/realm/filters">>],
    QS = lists:flatten([{<<"pattern">>, Pattern}, {<<"url_format_string">>, UrlFormatString}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create a custom profile field
%% [Create a custom profile field](/help/add-custom-profile-fields) in the user's organization.  `POST {{ api_url }}/v1/realm/profile_fields` 
-spec create_custom_profile_field(ctx:ctx(), integer()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_custom_profile_field(Ctx, FieldType) ->
    create_custom_profile_field(Ctx, FieldType, #{}).

-spec create_custom_profile_field(ctx:ctx(), integer(), maps:map()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_custom_profile_field(Ctx, FieldType, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/realm/profile_fields">>],
    QS = lists:flatten([{<<"field_type">>, FieldType}])++openapi_utils:optional_params(['name', 'hint', 'field_data'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get all custom emoji
%% Get all the custom emoji in the user's organization.  `GET {{ api_url }}/v1/realm/emoji` 
-spec get_custom_emoji(ctx:ctx()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_custom_emoji(Ctx) ->
    get_custom_emoji(Ctx, #{}).

-spec get_custom_emoji(ctx:ctx(), maps:map()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_custom_emoji(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/realm/emoji">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get all custom profile fields
%% Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user's organization.  `GET {{ api_url }}/v1/realm/profile_fields` 
-spec get_custom_profile_fields(ctx:ctx()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_custom_profile_fields(Ctx) ->
    get_custom_profile_fields(Ctx, #{}).

-spec get_custom_profile_fields(ctx:ctx(), maps:map()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_custom_profile_fields(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/realm/profile_fields">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get linkifiers
%% List all of an organization's configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `GET {{ api_url }}/v1/realm/linkifiers`  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar `GET /realm/filters` endpoint was available with each entry in a `[pattern, url_format, id]` tuple format. 
-spec get_linkifiers(ctx:ctx()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_linkifiers(Ctx) ->
    get_linkifiers(Ctx, #{}).

-spec get_linkifiers(ctx:ctx(), maps:map()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_linkifiers(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/realm/linkifiers">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get server settings
%% Fetch global settings for a Zulip server.  `GET {{ api_url }}/v1/server_settings`  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it's running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 
-spec get_server_settings(ctx:ctx()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_server_settings(Ctx) ->
    get_server_settings(Ctx, #{}).

-spec get_server_settings(ctx:ctx(), maps:map()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_server_settings(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/server_settings">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Remove a code playground
%% Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  `DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}`  **Changes**: New in Zulip 4.0 (feature level 49). 
-spec remove_code_playground(ctx:ctx(), integer()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
remove_code_playground(Ctx, PlaygroundId) ->
    remove_code_playground(Ctx, PlaygroundId, #{}).

-spec remove_code_playground(ctx:ctx(), integer(), maps:map()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
remove_code_playground(Ctx, PlaygroundId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = delete,
    Path = [<<"/realm/playgrounds/", PlaygroundId, "">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Remove a linkifier
%% Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `DELETE {{ api_url }}/v1/realm/filters/{filter_id}` 
-spec remove_linkifier(ctx:ctx(), integer()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
remove_linkifier(Ctx, FilterId) ->
    remove_linkifier(Ctx, FilterId, #{}).

-spec remove_linkifier(ctx:ctx(), integer(), maps:map()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
remove_linkifier(Ctx, FilterId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = delete,
    Path = [<<"/realm/filters/", FilterId, "">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Reorder custom profile fields
%% Reorder the custom profile fields in the user's organization.  `PATCH {{ api_url }}/v1/realm/profile_fields`  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 
-spec reorder_custom_profile_fields(ctx:ctx(), list()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
reorder_custom_profile_fields(Ctx, Order) ->
    reorder_custom_profile_fields(Ctx, Order, #{}).

-spec reorder_custom_profile_fields(ctx:ctx(), list(), maps:map()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
reorder_custom_profile_fields(Ctx, Order, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = patch,
    Path = [<<"/realm/profile_fields">>],
    QS = lists:flatten([[{<<"order">>, X} || X <- Order]])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update a linkifier
%% Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `PATCH {{ api_url }}/v1/realm/filters/{filter_id}`  **Changes**: New in Zulip 4.0 (feature level 57). 
-spec update_linkifier(ctx:ctx(), integer(), binary(), binary()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_linkifier(Ctx, FilterId, Pattern, UrlFormatString) ->
    update_linkifier(Ctx, FilterId, Pattern, UrlFormatString, #{}).

-spec update_linkifier(ctx:ctx(), integer(), binary(), binary(), maps:map()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_linkifier(Ctx, FilterId, Pattern, UrlFormatString, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = patch,
    Path = [<<"/realm/filters/", FilterId, "">>],
    QS = lists:flatten([{<<"pattern">>, Pattern}, {<<"url_format_string">>, UrlFormatString}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Upload custom emoji
%% This endpoint is used to upload a custom emoji for use in the user's organization.  Access to this endpoint depends on the [organization's configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  `POST {{ api_url }}/v1/realm/emoji/{emoji_name}` 
-spec upload_custom_emoji(ctx:ctx(), binary()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
upload_custom_emoji(Ctx, EmojiName) ->
    upload_custom_emoji(Ctx, EmojiName, #{}).

-spec upload_custom_emoji(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
upload_custom_emoji(Ctx, EmojiName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/realm/emoji/", EmojiName, "">>],
    QS = [],
    Headers = [],
    Body1 = {form, []++openapi_utils:optional_params(['filename'], _OptionalParams)},
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"multipart/form-data">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


