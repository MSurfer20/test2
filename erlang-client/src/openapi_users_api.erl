-module(openapi_users_api).

-export([create_user/4, create_user/5,
         create_user_group/4, create_user_group/5,
         deactivate_own_user/1, deactivate_own_user/2,
         deactivate_user/2, deactivate_user/3,
         get_attachments/1, get_attachments/2,
         get_own_user/1, get_own_user/2,
         get_user/2, get_user/3,
         get_user_by_email/2, get_user_by_email/3,
         get_user_groups/1, get_user_groups/2,
         get_user_presence/2, get_user_presence/3,
         get_users/1, get_users/2,
         mute_user/2, mute_user/3,
         reactivate_user/2, reactivate_user/3,
         remove_user_group/2, remove_user_group/3,
         set_typing_status/3, set_typing_status/4,
         unmute_user/2, unmute_user/3,
         update_display_settings/1, update_display_settings/2,
         update_notification_settings/1, update_notification_settings/2,
         update_user/2, update_user/3,
         update_user_group/4, update_user_group/5,
         update_user_group_members/2, update_user_group_members/3]).

-define(BASE_URL, <<"/api/v1">>).

%% @doc Create a user
%% {!can-create-users-only.md!}  Create a new user account via the API.  `POST {{ api_url }}/v1/users` 
-spec create_user(ctx:ctx(), binary(), binary(), binary()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_user(Ctx, Email, Password, FullName) ->
    create_user(Ctx, Email, Password, FullName, #{}).

-spec create_user(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_user(Ctx, Email, Password, FullName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/users">>],
    QS = lists:flatten([{<<"email">>, Email}, {<<"password">>, Password}, {<<"full_name">>, FullName}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create a user group
%% Create a new [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/create` 
-spec create_user_group(ctx:ctx(), binary(), binary(), list()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_user_group(Ctx, Name, Description, Members) ->
    create_user_group(Ctx, Name, Description, Members, #{}).

-spec create_user_group(ctx:ctx(), binary(), binary(), list(), maps:map()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_user_group(Ctx, Name, Description, Members, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/user_groups/create">>],
    QS = lists:flatten([{<<"name">>, Name}, {<<"description">>, Description}, [{<<"members">>, X} || X <- Members]])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Deactivate own user
%% Deactivates the user's account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  `DELETE {{ api_url }}/v1/users/me`  This endpoint is primarily useful to Zulip clients providing a user settings UI. 
-spec deactivate_own_user(ctx:ctx()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
deactivate_own_user(Ctx) ->
    deactivate_own_user(Ctx, #{}).

-spec deactivate_own_user(ctx:ctx(), maps:map()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
deactivate_own_user(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = delete,
    Path = [<<"/users/me">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Deactivate a user
%% [Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `DELETE {{ api_url }}/v1/users/{user_id}` 
-spec deactivate_user(ctx:ctx(), integer()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
deactivate_user(Ctx, UserId) ->
    deactivate_user(Ctx, UserId, #{}).

-spec deactivate_user(ctx:ctx(), integer(), maps:map()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
deactivate_user(Ctx, UserId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = delete,
    Path = [<<"/users/", UserId, "">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get attachments
%% Fetch metadata on files uploaded by the requesting user.  `GET {{ api_url }}/v1/attachments` 
-spec get_attachments(ctx:ctx()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_attachments(Ctx) ->
    get_attachments(Ctx, #{}).

-spec get_attachments(ctx:ctx(), maps:map()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_attachments(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/attachments">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get own user
%% Get basic data about the user/bot that requests this endpoint.  `GET {{ api_url }}/v1/users/me` 
-spec get_own_user(ctx:ctx()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_own_user(Ctx) ->
    get_own_user(Ctx, #{}).

-spec get_own_user(ctx:ctx(), maps:map()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_own_user(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/users/me">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get a user
%% Fetch details for a single user in the organization.  `GET {{ api_url }}/v1/users/{user_id}`  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 
-spec get_user(ctx:ctx(), integer()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_user(Ctx, UserId) ->
    get_user(Ctx, UserId, #{}).

-spec get_user(ctx:ctx(), integer(), maps:map()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_user(Ctx, UserId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/users/", UserId, "">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['client_gravatar', 'include_custom_profile_fields'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get a user by email
%% Fetch details for a single user in the organization given a Zulip display email address.  `GET {{ api_url }}/v1/users/{email}`  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 
-spec get_user_by_email(ctx:ctx(), binary()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_user_by_email(Ctx, Email) ->
    get_user_by_email(Ctx, Email, #{}).

-spec get_user_by_email(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_user_by_email(Ctx, Email, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/users/", Email, "">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['client_gravatar', 'include_custom_profile_fields'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get user groups
%% {!api-members-only.md!}  Fetches all of the user groups in the organization.  `GET {{ api_url }}/v1/user_groups` 
-spec get_user_groups(ctx:ctx()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_user_groups(Ctx) ->
    get_user_groups(Ctx, #{}).

-spec get_user_groups(ctx:ctx(), maps:map()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_user_groups(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/user_groups">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get user presence
%% Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user's presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  `GET {{ api_url }}/v1/users/{user_id_or_email}/presence`  See [Zulip's developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 
-spec get_user_presence(ctx:ctx(), binary()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_user_presence(Ctx, UserIdOrEmail) ->
    get_user_presence(Ctx, UserIdOrEmail, #{}).

-spec get_user_presence(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_user_presence(Ctx, UserIdOrEmail, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/users/", UserIdOrEmail, "/presence">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get all users
%% Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  `GET {{ api_url }}/v1/users`  You can also [fetch details on a single user](/api/get-user). 
-spec get_users(ctx:ctx()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_users(Ctx) ->
    get_users(Ctx, #{}).

-spec get_users(ctx:ctx(), maps:map()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_users(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/users">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['client_gravatar', 'include_custom_profile_fields'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Mute a user
%% This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you've muted will be automatically marked as read and hidden.  `POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \"Muted user\", rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \"All users that exist   on this stream or realm\", e.g. for organization   administration or showing stream subscribers, should display   the user's name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 
-spec mute_user(ctx:ctx(), integer()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
mute_user(Ctx, MutedUserId) ->
    mute_user(Ctx, MutedUserId, #{}).

-spec mute_user(ctx:ctx(), integer(), maps:map()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
mute_user(Ctx, MutedUserId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/users/me/muted_users/", MutedUserId, "">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Reactivate a user
%% [Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `POST {{ api_url }}/v1/users/{user_id}/reactivate` 
-spec reactivate_user(ctx:ctx(), integer()) -> {ok, openapi_any_type:openapi_any_type(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
reactivate_user(Ctx, UserId) ->
    reactivate_user(Ctx, UserId, #{}).

-spec reactivate_user(ctx:ctx(), integer(), maps:map()) -> {ok, openapi_any_type:openapi_any_type(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
reactivate_user(Ctx, UserId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/users/", UserId, "/reactivate">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete a user group
%% Delete a [user group](/help/user-groups).  `DELETE {{ api_url }}/v1/user_groups/{user_group_id}` 
-spec remove_user_group(ctx:ctx(), integer()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
remove_user_group(Ctx, UserGroupId) ->
    remove_user_group(Ctx, UserGroupId, #{}).

-spec remove_user_group(ctx:ctx(), integer(), maps:map()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
remove_user_group(Ctx, UserGroupId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = delete,
    Path = [<<"/user_groups/", UserGroupId, "">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Set \"typing\" status
%% Notify other users whether the current user is typing a message.  `POST {{ api_url }}/v1/typing`  Clients implementing Zulip's typing notifications protocol should work as follows:  * Send a request to this endpoint with `op=\"start\"` when a user starts typing a message,   and also every `TYPING_STARTED_WAIT_PERIOD=10` seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with `op=\"stop\"` when a user pauses using the   compose UI for at least `TYPING_STOPPED_WAIT_PERIOD=5` seconds or cancels   the compose action (if it had previously sent a \"start\" operation for that   compose action). * Start displaying \"Sender is typing\" for a given conversation when the client   receives an `op=\"start\"` event from the [events API](/api/get-events). * Continue displaying \"Sender is typing\" until they receive an `op=\"stop\"` event   from the [events API](/api/get-events) or `TYPING_STARTED_EXPIRY_PERIOD=15`   seconds have passed without a new `op=\"start\"` event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   `stream_typing_notifications` in the `client_capabilities` parameter to `/register`.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip's typing notifications protocol. 
-spec set_typing_status(ctx:ctx(), binary(), list()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
set_typing_status(Ctx, Op, To) ->
    set_typing_status(Ctx, Op, To, #{}).

-spec set_typing_status(ctx:ctx(), binary(), list(), maps:map()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
set_typing_status(Ctx, Op, To, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/typing">>],
    QS = lists:flatten([{<<"op">>, Op}, [{<<"to">>, X} || X <- To]])++openapi_utils:optional_params(['type', 'topic'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Unmute a user
%% This endpoint unmutes a user.  `DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  **Changes**: New in Zulip 4.0 (feature level 48). 
-spec unmute_user(ctx:ctx(), integer()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
unmute_user(Ctx, MutedUserId) ->
    unmute_user(Ctx, MutedUserId, #{}).

-spec unmute_user(ctx:ctx(), integer(), maps:map()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
unmute_user(Ctx, MutedUserId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = delete,
    Path = [<<"/users/me/muted_users/", MutedUserId, "">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update display settings
%% This endpoint is used to edit the current user's user interface settings.  `PATCH {{ api_url }}/v1/settings/display` 
-spec update_display_settings(ctx:ctx()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_display_settings(Ctx) ->
    update_display_settings(Ctx, #{}).

-spec update_display_settings(ctx:ctx(), maps:map()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_display_settings(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = patch,
    Path = [<<"/settings/display">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['twenty_four_hour_time', 'dense_mode', 'starred_message_counts', 'fluid_layout_width', 'high_contrast_mode', 'color_scheme', 'translate_emoticons', 'default_language', 'default_view', 'left_side_userlist', 'emojiset', 'demote_inactive_streams', 'timezone'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update notification settings
%% This endpoint is used to edit the user's global notification settings. See [this endpoint](/api/update-subscription-settings) for per-stream notification settings.  `PATCH {{ api_url }}/v1/settings/notifications` 
-spec update_notification_settings(ctx:ctx()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_notification_settings(Ctx) ->
    update_notification_settings(Ctx, #{}).

-spec update_notification_settings(ctx:ctx(), maps:map()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_notification_settings(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = patch,
    Path = [<<"/settings/notifications">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['enable_stream_desktop_notifications', 'enable_stream_email_notifications', 'enable_stream_push_notifications', 'enable_stream_audible_notifications', 'notification_sound', 'enable_desktop_notifications', 'enable_sounds', 'enable_offline_email_notifications', 'enable_offline_push_notifications', 'enable_online_push_notifications', 'enable_digest_emails', 'enable_marketing_emails', 'enable_login_emails', 'message_content_in_email_notifications', 'pm_content_in_desktop_notifications', 'wildcard_mentions_notify', 'desktop_icon_count_display', 'realm_name_in_notifications', 'presence_enabled'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update a user
%% Administrative endpoint to update the details of another user in the organization.  `PATCH {{ api_url }}/v1/users/{user_id}`  Supports everything an administrator can do to edit details of another user's account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 
-spec update_user(ctx:ctx(), integer()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_user(Ctx, UserId) ->
    update_user(Ctx, UserId, #{}).

-spec update_user(ctx:ctx(), integer(), maps:map()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_user(Ctx, UserId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = patch,
    Path = [<<"/users/", UserId, "">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['full_name', 'role', 'profile_data'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update a user group
%% Update the name or description of a [user group](/help/user-groups).  `PATCH {{ api_url }}/v1/user_groups/{user_group_id}` 
-spec update_user_group(ctx:ctx(), integer(), binary(), binary()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_user_group(Ctx, UserGroupId, Name, Description) ->
    update_user_group(Ctx, UserGroupId, Name, Description, #{}).

-spec update_user_group(ctx:ctx(), integer(), binary(), binary(), maps:map()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_user_group(Ctx, UserGroupId, Name, Description, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = patch,
    Path = [<<"/user_groups/", UserGroupId, "">>],
    QS = lists:flatten([{<<"name">>, Name}, {<<"description">>, Description}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update user group members
%% Update the members of a [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/{user_group_id}/members` 
-spec update_user_group_members(ctx:ctx(), integer()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_user_group_members(Ctx, UserGroupId) ->
    update_user_group_members(Ctx, UserGroupId, #{}).

-spec update_user_group_members(ctx:ctx(), integer(), maps:map()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_user_group_members(Ctx, UserGroupId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/user_groups/", UserGroupId, "/members">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['delete', 'add'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


