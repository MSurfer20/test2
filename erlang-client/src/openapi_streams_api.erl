-module(openapi_streams_api).

-export([archive_stream/2, archive_stream/3,
         create_big_blue_button_video_call/1, create_big_blue_button_video_call/2,
         delete_topic/3, delete_topic/4,
         get_stream_id/2, get_stream_id/3,
         get_stream_topics/2, get_stream_topics/3,
         get_streams/1, get_streams/2,
         get_subscribers/2, get_subscribers/3,
         get_subscription_status/3, get_subscription_status/4,
         get_subscriptions/1, get_subscriptions/2,
         mute_topic/3, mute_topic/4,
         subscribe/2, subscribe/3,
         unsubscribe/2, unsubscribe/3,
         update_stream/2, update_stream/3,
         update_subscription_settings/2, update_subscription_settings/3,
         update_subscriptions/1, update_subscriptions/2]).

-define(BASE_URL, <<"/api/v1">>).

%% @doc Archive a stream
%% [Archive the stream](/help/archive-a-stream) with the ID `stream_id`.  `DELETE {{ api_url }}/v1/streams/{stream_id}` 
-spec archive_stream(ctx:ctx(), integer()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
archive_stream(Ctx, StreamId) ->
    archive_stream(Ctx, StreamId, #{}).

-spec archive_stream(ctx:ctx(), integer(), maps:map()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
archive_stream(Ctx, StreamId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = delete,
    Path = [<<"/streams/", StreamId, "">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create BigBlueButton video call
%% Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 
-spec create_big_blue_button_video_call(ctx:ctx()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_big_blue_button_video_call(Ctx) ->
    create_big_blue_button_video_call(Ctx, #{}).

-spec create_big_blue_button_video_call(ctx:ctx(), maps:map()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_big_blue_button_video_call(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/calls/bigbluebutton/create">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete a topic
%% Delete all messages in a topic.  `POST {{ api_url }}/v1/streams/{stream_id}/delete_topic`  Topics are a field on messages (not an independent data structure), so deleting all the messages in the topic deletes the topic from Zulip. 
-spec delete_topic(ctx:ctx(), integer(), binary()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_topic(Ctx, StreamId, TopicName) ->
    delete_topic(Ctx, StreamId, TopicName, #{}).

-spec delete_topic(ctx:ctx(), integer(), binary(), maps:map()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_topic(Ctx, StreamId, TopicName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/streams/", StreamId, "/delete_topic">>],
    QS = lists:flatten([{<<"topic_name">>, TopicName}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get stream ID
%% Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id` 
-spec get_stream_id(ctx:ctx(), binary()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_stream_id(Ctx, Stream) ->
    get_stream_id(Ctx, Stream, #{}).

-spec get_stream_id(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_stream_id(Ctx, Stream, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/get_stream_id">>],
    QS = lists:flatten([{<<"stream">>, Stream}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get topics in a stream
%% Get all the topics in a specific stream  `GET {{ api_url }}/v1/users/me/{stream_id}/topics` 
-spec get_stream_topics(ctx:ctx(), integer()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_stream_topics(Ctx, StreamId) ->
    get_stream_topics(Ctx, StreamId, #{}).

-spec get_stream_topics(ctx:ctx(), integer(), maps:map()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_stream_topics(Ctx, StreamId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/users/me/", StreamId, "/topics">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get all streams
%% Get all streams that the user has access to.  `GET {{ api_url }}/v1/streams` 
-spec get_streams(ctx:ctx()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_streams(Ctx) ->
    get_streams(Ctx, #{}).

-spec get_streams(ctx:ctx(), maps:map()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_streams(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/streams">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['include_public', 'include_web_public', 'include_subscribed', 'include_all_active', 'include_default', 'include_owner_subscribed'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get the subscribers of a stream
%% Get all users subscribed to a stream.  `Get {{ api_url }}/v1/streams/{stream_id}/members` 
-spec get_subscribers(ctx:ctx(), integer()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_subscribers(Ctx, StreamId) ->
    get_subscribers(Ctx, StreamId, #{}).

-spec get_subscribers(ctx:ctx(), integer(), maps:map()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_subscribers(Ctx, StreamId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/streams/", StreamId, "/members">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get subscription status
%% Check whether a user is subscribed to a stream.  `GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`  **Changes**: New in Zulip 3.0 (feature level 11). 
-spec get_subscription_status(ctx:ctx(), integer(), integer()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_subscription_status(Ctx, UserId, StreamId) ->
    get_subscription_status(Ctx, UserId, StreamId, #{}).

-spec get_subscription_status(ctx:ctx(), integer(), integer(), maps:map()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_subscription_status(Ctx, UserId, StreamId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/users/", UserId, "/subscriptions/", StreamId, "">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get subscribed streams
%% Get all streams that the user is subscribed to.  `GET {{ api_url }}/v1/users/me/subscriptions` 
-spec get_subscriptions(ctx:ctx()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_subscriptions(Ctx) ->
    get_subscriptions(Ctx, #{}).

-spec get_subscriptions(ctx:ctx(), maps:map()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_subscriptions(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/users/me/subscriptions">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['include_subscribers'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Topic muting
%% This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user's unread count totals.  `PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics` 
-spec mute_topic(ctx:ctx(), binary(), binary()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
mute_topic(Ctx, Topic, Op) ->
    mute_topic(Ctx, Topic, Op, #{}).

-spec mute_topic(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
mute_topic(Ctx, Topic, Op, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = patch,
    Path = [<<"/users/me/subscriptions/muted_topics">>],
    QS = lists:flatten([{<<"topic">>, Topic}, {<<"op">>, Op}])++openapi_utils:optional_params(['stream', 'stream_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Subscribe to a stream
%% Subscribe one or more users to one or more streams.  `POST {{ api_url }}/v1/users/me/subscriptions`  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like `invite_only` detailed below. 
-spec subscribe(ctx:ctx(), list()) -> {ok, openapi_one_of<object,object>:openapi_one_of<object,object>(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
subscribe(Ctx, Subscriptions) ->
    subscribe(Ctx, Subscriptions, #{}).

-spec subscribe(ctx:ctx(), list(), maps:map()) -> {ok, openapi_one_of<object,object>:openapi_one_of<object,object>(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
subscribe(Ctx, Subscriptions, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/users/me/subscriptions">>],
    QS = lists:flatten([[{<<"subscriptions">>, X} || X <- Subscriptions]])++openapi_utils:optional_params(['principals', 'authorization_errors_fatal', 'announce', 'invite_only', 'history_public_to_subscribers', 'stream_post_policy', 'message_retention_days'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Unsubscribe from a stream
%% Unsubscribe yourself or other users from one or more streams.  `DELETE {{ api_url }}/v1/users/me/subscriptions` 
-spec unsubscribe(ctx:ctx(), list()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
unsubscribe(Ctx, Subscriptions) ->
    unsubscribe(Ctx, Subscriptions, #{}).

-spec unsubscribe(ctx:ctx(), list(), maps:map()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
unsubscribe(Ctx, Subscriptions, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = delete,
    Path = [<<"/users/me/subscriptions">>],
    QS = lists:flatten([[{<<"subscriptions">>, X} || X <- Subscriptions]])++openapi_utils:optional_params(['principals'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update a stream
%% Configure the stream with the ID `stream_id`.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  `PATCH {{ api_url }}/v1/streams/{stream_id}` 
-spec update_stream(ctx:ctx(), integer()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_stream(Ctx, StreamId) ->
    update_stream(Ctx, StreamId, #{}).

-spec update_stream(ctx:ctx(), integer(), maps:map()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_stream(Ctx, StreamId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = patch,
    Path = [<<"/streams/", StreamId, "">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['description', 'new_name', 'is_private', 'is_announcement_only', 'stream_post_policy', 'history_public_to_subscribers', 'message_retention_days'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update subscription settings
%% This endpoint is used to update the user's personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  `POST {{ api_url }}/v1/users/me/subscriptions/properties` 
-spec update_subscription_settings(ctx:ctx(), list()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_subscription_settings(Ctx, SubscriptionData) ->
    update_subscription_settings(Ctx, SubscriptionData, #{}).

-spec update_subscription_settings(ctx:ctx(), list(), maps:map()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_subscription_settings(Ctx, SubscriptionData, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/users/me/subscriptions/properties">>],
    QS = lists:flatten([[{<<"subscription_data">>, X} || X <- SubscriptionData]])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update subscriptions
%% Update which streams you are are subscribed to. 
-spec update_subscriptions(ctx:ctx()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_subscriptions(Ctx) ->
    update_subscriptions(Ctx, #{}).

-spec update_subscriptions(ctx:ctx(), maps:map()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_subscriptions(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = patch,
    Path = [<<"/users/me/subscriptions">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['delete', 'add'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


