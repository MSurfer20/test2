-module(openapi_messages_api).

-export([add_reaction/3, add_reaction/4,
         check_messages_match_narrow/3, check_messages_match_narrow/4,
         delete_message/2, delete_message/3,
         get_file_temporary_url/3, get_file_temporary_url/4,
         get_message_history/2, get_message_history/3,
         get_messages/3, get_messages/4,
         get_raw_message/2, get_raw_message/3,
         mark_all_as_read/1, mark_all_as_read/2,
         mark_stream_as_read/2, mark_stream_as_read/3,
         mark_topic_as_read/3, mark_topic_as_read/4,
         remove_reaction/2, remove_reaction/3,
         render_message/2, render_message/3,
         send_message/4, send_message/5,
         update_message/2, update_message/3,
         update_message_flags/4, update_message_flags/5,
         upload_file/1, upload_file/2]).

-define(BASE_URL, <<"/api/v1">>).

%% @doc Add an emoji reaction
%% Add an [emoji reaction](/help/emoji-reactions) to a message.  `POST {{ api_url }}/v1/messages/{message_id}/reactions` 
-spec add_reaction(ctx:ctx(), integer(), binary()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
add_reaction(Ctx, MessageId, EmojiName) ->
    add_reaction(Ctx, MessageId, EmojiName, #{}).

-spec add_reaction(ctx:ctx(), integer(), binary(), maps:map()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
add_reaction(Ctx, MessageId, EmojiName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/messages/", MessageId, "/reactions">>],
    QS = lists:flatten([{<<"emoji_name">>, EmojiName}])++openapi_utils:optional_params(['emoji_code', 'reaction_type'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Check if messages match a narrow
%% Check whether a set of messages match a [narrow](/api/construct-narrow).  `GET {{ api_url }}/v1/messages/matches_narrow`  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the `match_subject` and `match_content` objects is designed to match those of `GET /messages`, so that a client can splice these fields into a `message` object received from `GET /events` and end up with an extended message object identical to how a `GET /messages` for the current narrow would have returned the message. 
-spec check_messages_match_narrow(ctx:ctx(), list(), list()) -> {ok, openapi_any_type:openapi_any_type(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
check_messages_match_narrow(Ctx, MsgIds, Narrow) ->
    check_messages_match_narrow(Ctx, MsgIds, Narrow, #{}).

-spec check_messages_match_narrow(ctx:ctx(), list(), list(), maps:map()) -> {ok, openapi_any_type:openapi_any_type(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
check_messages_match_narrow(Ctx, MsgIds, Narrow, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/messages/matches_narrow">>],
    QS = lists:flatten([[{<<"msg_ids">>, X} || X <- MsgIds], [{<<"narrow">>, X} || X <- Narrow]])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete a message
%% Permanently delete a message.  `DELETE {{ api_url }}/v1/messages/{msg_id}`  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely 
-spec delete_message(ctx:ctx(), integer()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_message(Ctx, MessageId) ->
    delete_message(Ctx, MessageId, #{}).

-spec delete_message(ctx:ctx(), integer(), maps:map()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_message(Ctx, MessageId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = delete,
    Path = [<<"/messages/", MessageId, "">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get public temporary URL
%% Get a temporary URL for access to the file that doesn't require authentication. 
-spec get_file_temporary_url(ctx:ctx(), integer(), binary()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_file_temporary_url(Ctx, RealmIdStr, Filename) ->
    get_file_temporary_url(Ctx, RealmIdStr, Filename, #{}).

-spec get_file_temporary_url(ctx:ctx(), integer(), binary(), maps:map()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_file_temporary_url(Ctx, RealmIdStr, Filename, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/user_uploads/", RealmIdStr, "/", Filename, "">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get a message's edit history
%% Fetch the message edit history of a previously edited message.  `GET {{ api_url }}/v1/messages/{message_id}/history`  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history 
-spec get_message_history(ctx:ctx(), integer()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_message_history(Ctx, MessageId) ->
    get_message_history(Ctx, MessageId, #{}).

-spec get_message_history(ctx:ctx(), integer(), maps:map()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_message_history(Ctx, MessageId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/messages/", MessageId, "/history">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get messages
%% Fetch message history from a Zulip server.  `GET {{ api_url }}/v1/messages`  This `GET /api/v1/messages` endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip's powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user's message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an `anchor` message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the `num_before` and `num_after` limits.  We recommend using `num_before <= 1000` and `num_after <= 1000` to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error. 
-spec get_messages(ctx:ctx(), integer(), integer()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_messages(Ctx, NumBefore, NumAfter) ->
    get_messages(Ctx, NumBefore, NumAfter, #{}).

-spec get_messages(ctx:ctx(), integer(), integer(), maps:map()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_messages(Ctx, NumBefore, NumAfter, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/messages">>],
    QS = lists:flatten([{<<"num_before">>, NumBefore}, {<<"num_after">>, NumAfter}])++openapi_utils:optional_params(['anchor', 'narrow', 'client_gravatar', 'apply_markdown', 'use_first_unread_anchor'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get a message's raw Markdown
%% Get the raw content of a message.  `GET {{ api_url }}/v1/messages/{msg_id}`  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message's raw Markdown (e.g. for pre-filling a message-editing UI). 
-spec get_raw_message(ctx:ctx(), integer()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_raw_message(Ctx, MessageId) ->
    get_raw_message(Ctx, MessageId, #{}).

-spec get_raw_message(ctx:ctx(), integer(), maps:map()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_raw_message(Ctx, MessageId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/messages/", MessageId, "">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Mark all messages as read
%% Marks all of the current user's unread messages as read.  `POST {{ api_url }}/v1/mark_all_as_read` 
-spec mark_all_as_read(ctx:ctx()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
mark_all_as_read(Ctx) ->
    mark_all_as_read(Ctx, #{}).

-spec mark_all_as_read(ctx:ctx(), maps:map()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
mark_all_as_read(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/mark_all_as_read">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Mark messages in a stream as read
%% Mark all the unread messages in a stream as read. 
-spec mark_stream_as_read(ctx:ctx(), integer()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
mark_stream_as_read(Ctx, StreamId) ->
    mark_stream_as_read(Ctx, StreamId, #{}).

-spec mark_stream_as_read(ctx:ctx(), integer(), maps:map()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
mark_stream_as_read(Ctx, StreamId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/mark_stream_as_read">>],
    QS = lists:flatten([{<<"stream_id">>, StreamId}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Mark messages in a topic as read
%% Mark all the unread messages in a topic as read. 
-spec mark_topic_as_read(ctx:ctx(), integer(), binary()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
mark_topic_as_read(Ctx, StreamId, TopicName) ->
    mark_topic_as_read(Ctx, StreamId, TopicName, #{}).

-spec mark_topic_as_read(ctx:ctx(), integer(), binary(), maps:map()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
mark_topic_as_read(Ctx, StreamId, TopicName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/mark_topic_as_read">>],
    QS = lists:flatten([{<<"stream_id">>, StreamId}, {<<"topic_name">>, TopicName}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Remove an emoji reaction
%% Remove an [emoji reaction](/help/emoji-reactions) from a message.  `DELETE {{ api_url }}/v1/messages/{message_id}/reactions` 
-spec remove_reaction(ctx:ctx(), integer()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
remove_reaction(Ctx, MessageId) ->
    remove_reaction(Ctx, MessageId, #{}).

-spec remove_reaction(ctx:ctx(), integer(), maps:map()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
remove_reaction(Ctx, MessageId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = delete,
    Path = [<<"/messages/", MessageId, "/reactions">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['emoji_name', 'emoji_code', 'reaction_type'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Render message
%% Render a message to HTML.  `POST {{ api_url }}/v1/messages/render` 
-spec render_message(ctx:ctx(), binary()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
render_message(Ctx, Content) ->
    render_message(Ctx, Content, #{}).

-spec render_message(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
render_message(Ctx, Content, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/messages/render">>],
    QS = lists:flatten([{<<"content">>, Content}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Send a message
%% Send a stream or a private message.  `POST {{ api_url }}/v1/messages` 
-spec send_message(ctx:ctx(), binary(), list(), binary()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
send_message(Ctx, Type, To, Content) ->
    send_message(Ctx, Type, To, Content, #{}).

-spec send_message(ctx:ctx(), binary(), list(), binary(), maps:map()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
send_message(Ctx, Type, To, Content, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/messages">>],
    QS = lists:flatten([{<<"type">>, Type}, [{<<"to">>, X} || X <- To], {<<"content">>, Content}])++openapi_utils:optional_params(['topic', 'queue_id', 'local_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Edit a message
%% Edit/update the content or topic of a message.  `PATCH {{ api_url }}/v1/messages/{msg_id}`  `{msg_id}` in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to `✔ {original_topic}`.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion 
-spec update_message(ctx:ctx(), integer()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_message(Ctx, MessageId) ->
    update_message(Ctx, MessageId, #{}).

-spec update_message(ctx:ctx(), integer(), maps:map()) -> {ok, openapi_json_success:openapi_json_success(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_message(Ctx, MessageId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = patch,
    Path = [<<"/messages/", MessageId, "">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['topic', 'propagate_mode', 'send_notification_to_old_thread', 'send_notification_to_new_thread', 'content', 'stream_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update personal message flags
%% Add or remove personal message flags like `read` and `starred` on a collection of message IDs.  `POST {{ api_url }}/v1/messages/flags`  For updating the `read` flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read). 
-spec update_message_flags(ctx:ctx(), list(), binary(), binary()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_message_flags(Ctx, Messages, Op, Flag) ->
    update_message_flags(Ctx, Messages, Op, Flag, #{}).

-spec update_message_flags(ctx:ctx(), list(), binary(), binary(), maps:map()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_message_flags(Ctx, Messages, Op, Flag, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/messages/flags">>],
    QS = lists:flatten([[{<<"messages">>, X} || X <- Messages], {<<"op">>, Op}, {<<"flag">>, Flag}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Upload a file
%% Upload a single file and get the corresponding URI.  `POST {{ api_url }}/v1/user_uploads`  Initially, only you will be able to access the link.  To share the uploaded file, you'll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message 
-spec upload_file(ctx:ctx()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
upload_file(Ctx) ->
    upload_file(Ctx, #{}).

-spec upload_file(ctx:ctx(), maps:map()) -> {ok, openapi_json_success_base:openapi_json_success_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
upload_file(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/user_uploads">>],
    QS = [],
    Headers = [],
    Body1 = {form, []++openapi_utils:optional_params(['filename'], _OptionalParams)},
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"multipart/form-data">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


