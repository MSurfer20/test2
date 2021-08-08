-module(openapi_router).

-export([get_paths/1]).

-type operations() :: #{
    Method :: binary() => openapi_api:operation_id()
}.

-type init_opts()  :: {
    Operations :: operations(),
    LogicHandler :: atom(),
    ValidatorState :: jesse_state:state()
}.

-export_type([init_opts/0]).

-spec get_paths(LogicHandler :: atom()) ->  [{'_',[{
    Path :: string(),
    Handler :: atom(),
    InitOpts :: init_opts()
}]}].

get_paths(LogicHandler) ->
    ValidatorState = prepare_validator(),
    PreparedPaths = maps:fold(
        fun(Path, #{operations := Operations, handler := Handler}, Acc) ->
            [{Path, Handler, Operations} | Acc]
        end,
        [],
        group_paths()
    ),
    [
        {'_',
            [{P, H, {O, LogicHandler, ValidatorState}} || {P, H, O} <- PreparedPaths]
        }
    ].

group_paths() ->
    maps:fold(
        fun(OperationID, #{path := Path, method := Method, handler := Handler}, Acc) ->
            case maps:find(Path, Acc) of
                {ok, PathInfo0 = #{operations := Operations0}} ->
                    Operations = Operations0#{Method => OperationID},
                    PathInfo = PathInfo0#{operations => Operations},
                    Acc#{Path => PathInfo};
                error ->
                    Operations = #{Method => OperationID},
                    PathInfo = #{handler => Handler, operations => Operations},
                    Acc#{Path => PathInfo}
            end
        end,
        #{},
        get_operations()
    ).

get_operations() ->
    #{ 
        'DevFetchApiKey' => #{
            path => "/api/v1/dev_fetch_api_key",
            method => <<"POST">>,
            handler => 'openapi_authentication_handler'
        },
        'FetchApiKey' => #{
            path => "/api/v1/fetch_api_key",
            method => <<"POST">>,
            handler => 'openapi_authentication_handler'
        },
        'CreateDrafts' => #{
            path => "/api/v1/drafts",
            method => <<"POST">>,
            handler => 'openapi_drafts_handler'
        },
        'DeleteDraft' => #{
            path => "/api/v1/drafts/:draft_id",
            method => <<"DELETE">>,
            handler => 'openapi_drafts_handler'
        },
        'EditDraft' => #{
            path => "/api/v1/drafts/:draft_id",
            method => <<"PATCH">>,
            handler => 'openapi_drafts_handler'
        },
        'GetDrafts' => #{
            path => "/api/v1/drafts",
            method => <<"GET">>,
            handler => 'openapi_drafts_handler'
        },
        'AddReaction' => #{
            path => "/api/v1/messages/:message_id/reactions",
            method => <<"POST">>,
            handler => 'openapi_messages_handler'
        },
        'CheckMessagesMatchNarrow' => #{
            path => "/api/v1/messages/matches_narrow",
            method => <<"GET">>,
            handler => 'openapi_messages_handler'
        },
        'DeleteMessage' => #{
            path => "/api/v1/messages/:message_id",
            method => <<"DELETE">>,
            handler => 'openapi_messages_handler'
        },
        'GetFileTemporaryUrl' => #{
            path => "/api/v1/user_uploads/:realm_id_str/:filename",
            method => <<"GET">>,
            handler => 'openapi_messages_handler'
        },
        'GetMessageHistory' => #{
            path => "/api/v1/messages/:message_id/history",
            method => <<"GET">>,
            handler => 'openapi_messages_handler'
        },
        'GetMessages' => #{
            path => "/api/v1/messages",
            method => <<"GET">>,
            handler => 'openapi_messages_handler'
        },
        'GetRawMessage' => #{
            path => "/api/v1/messages/:message_id",
            method => <<"GET">>,
            handler => 'openapi_messages_handler'
        },
        'MarkAllAsRead' => #{
            path => "/api/v1/mark_all_as_read",
            method => <<"POST">>,
            handler => 'openapi_messages_handler'
        },
        'MarkStreamAsRead' => #{
            path => "/api/v1/mark_stream_as_read",
            method => <<"POST">>,
            handler => 'openapi_messages_handler'
        },
        'MarkTopicAsRead' => #{
            path => "/api/v1/mark_topic_as_read",
            method => <<"POST">>,
            handler => 'openapi_messages_handler'
        },
        'RemoveReaction' => #{
            path => "/api/v1/messages/:message_id/reactions",
            method => <<"DELETE">>,
            handler => 'openapi_messages_handler'
        },
        'RenderMessage' => #{
            path => "/api/v1/messages/render",
            method => <<"POST">>,
            handler => 'openapi_messages_handler'
        },
        'SendMessage' => #{
            path => "/api/v1/messages",
            method => <<"POST">>,
            handler => 'openapi_messages_handler'
        },
        'UpdateMessage' => #{
            path => "/api/v1/messages/:message_id",
            method => <<"PATCH">>,
            handler => 'openapi_messages_handler'
        },
        'UpdateMessageFlags' => #{
            path => "/api/v1/messages/flags",
            method => <<"POST">>,
            handler => 'openapi_messages_handler'
        },
        'UploadFile' => #{
            path => "/api/v1/user_uploads",
            method => <<"POST">>,
            handler => 'openapi_messages_handler'
        },
        'DeleteQueue' => #{
            path => "/api/v1/events",
            method => <<"DELETE">>,
            handler => 'openapi_real_time_events_handler'
        },
        'GetEvents' => #{
            path => "/api/v1/events",
            method => <<"GET">>,
            handler => 'openapi_real_time_events_handler'
        },
        'RealTimePost' => #{
            path => "/api/v1/real-time",
            method => <<"POST">>,
            handler => 'openapi_real_time_events_handler'
        },
        'RegisterQueue' => #{
            path => "/api/v1/register",
            method => <<"POST">>,
            handler => 'openapi_real_time_events_handler'
        },
        'RestErrorHandling' => #{
            path => "/api/v1/rest-error-handling",
            method => <<"POST">>,
            handler => 'openapi_real_time_events_handler'
        },
        'AddCodePlayground' => #{
            path => "/api/v1/realm/playgrounds",
            method => <<"POST">>,
            handler => 'openapi_server_and_organizations_handler'
        },
        'AddLinkifier' => #{
            path => "/api/v1/realm/filters",
            method => <<"POST">>,
            handler => 'openapi_server_and_organizations_handler'
        },
        'CreateCustomProfileField' => #{
            path => "/api/v1/realm/profile_fields",
            method => <<"POST">>,
            handler => 'openapi_server_and_organizations_handler'
        },
        'GetCustomEmoji' => #{
            path => "/api/v1/realm/emoji",
            method => <<"GET">>,
            handler => 'openapi_server_and_organizations_handler'
        },
        'GetCustomProfileFields' => #{
            path => "/api/v1/realm/profile_fields",
            method => <<"GET">>,
            handler => 'openapi_server_and_organizations_handler'
        },
        'GetLinkifiers' => #{
            path => "/api/v1/realm/linkifiers",
            method => <<"GET">>,
            handler => 'openapi_server_and_organizations_handler'
        },
        'GetServerSettings' => #{
            path => "/api/v1/server_settings",
            method => <<"GET">>,
            handler => 'openapi_server_and_organizations_handler'
        },
        'RemoveCodePlayground' => #{
            path => "/api/v1/realm/playgrounds/:playground_id",
            method => <<"DELETE">>,
            handler => 'openapi_server_and_organizations_handler'
        },
        'RemoveLinkifier' => #{
            path => "/api/v1/realm/filters/:filter_id",
            method => <<"DELETE">>,
            handler => 'openapi_server_and_organizations_handler'
        },
        'ReorderCustomProfileFields' => #{
            path => "/api/v1/realm/profile_fields",
            method => <<"PATCH">>,
            handler => 'openapi_server_and_organizations_handler'
        },
        'UpdateLinkifier' => #{
            path => "/api/v1/realm/filters/:filter_id",
            method => <<"PATCH">>,
            handler => 'openapi_server_and_organizations_handler'
        },
        'UploadCustomEmoji' => #{
            path => "/api/v1/realm/emoji/:emoji_name",
            method => <<"POST">>,
            handler => 'openapi_server_and_organizations_handler'
        },
        'ArchiveStream' => #{
            path => "/api/v1/streams/:stream_id",
            method => <<"DELETE">>,
            handler => 'openapi_streams_handler'
        },
        'CreateBigBlueButtonVideoCall' => #{
            path => "/api/v1/calls/bigbluebutton/create",
            method => <<"GET">>,
            handler => 'openapi_streams_handler'
        },
        'DeleteTopic' => #{
            path => "/api/v1/streams/:stream_id/delete_topic",
            method => <<"POST">>,
            handler => 'openapi_streams_handler'
        },
        'GetStreamId' => #{
            path => "/api/v1/get_stream_id",
            method => <<"GET">>,
            handler => 'openapi_streams_handler'
        },
        'GetStreamTopics' => #{
            path => "/api/v1/users/me/:stream_id/topics",
            method => <<"GET">>,
            handler => 'openapi_streams_handler'
        },
        'GetStreams' => #{
            path => "/api/v1/streams",
            method => <<"GET">>,
            handler => 'openapi_streams_handler'
        },
        'GetSubscribers' => #{
            path => "/api/v1/streams/:stream_id/members",
            method => <<"GET">>,
            handler => 'openapi_streams_handler'
        },
        'GetSubscriptionStatus' => #{
            path => "/api/v1/users/:user_id/subscriptions/:stream_id",
            method => <<"GET">>,
            handler => 'openapi_streams_handler'
        },
        'GetSubscriptions' => #{
            path => "/api/v1/users/me/subscriptions",
            method => <<"GET">>,
            handler => 'openapi_streams_handler'
        },
        'MuteTopic' => #{
            path => "/api/v1/users/me/subscriptions/muted_topics",
            method => <<"PATCH">>,
            handler => 'openapi_streams_handler'
        },
        'Subscribe' => #{
            path => "/api/v1/users/me/subscriptions",
            method => <<"POST">>,
            handler => 'openapi_streams_handler'
        },
        'Unsubscribe' => #{
            path => "/api/v1/users/me/subscriptions",
            method => <<"DELETE">>,
            handler => 'openapi_streams_handler'
        },
        'UpdateStream' => #{
            path => "/api/v1/streams/:stream_id",
            method => <<"PATCH">>,
            handler => 'openapi_streams_handler'
        },
        'UpdateSubscriptionSettings' => #{
            path => "/api/v1/users/me/subscriptions/properties",
            method => <<"POST">>,
            handler => 'openapi_streams_handler'
        },
        'UpdateSubscriptions' => #{
            path => "/api/v1/users/me/subscriptions",
            method => <<"PATCH">>,
            handler => 'openapi_streams_handler'
        },
        'CreateUser' => #{
            path => "/api/v1/users",
            method => <<"POST">>,
            handler => 'openapi_users_handler'
        },
        'CreateUserGroup' => #{
            path => "/api/v1/user_groups/create",
            method => <<"POST">>,
            handler => 'openapi_users_handler'
        },
        'DeactivateOwnUser' => #{
            path => "/api/v1/users/me",
            method => <<"DELETE">>,
            handler => 'openapi_users_handler'
        },
        'DeactivateUser' => #{
            path => "/api/v1/users/:user_id",
            method => <<"DELETE">>,
            handler => 'openapi_users_handler'
        },
        'GetAttachments' => #{
            path => "/api/v1/attachments",
            method => <<"GET">>,
            handler => 'openapi_users_handler'
        },
        'GetOwnUser' => #{
            path => "/api/v1/users/me",
            method => <<"GET">>,
            handler => 'openapi_users_handler'
        },
        'GetUser' => #{
            path => "/api/v1/users/:user_id",
            method => <<"GET">>,
            handler => 'openapi_users_handler'
        },
        'GetUserByEmail' => #{
            path => "/api/v1/users/:email",
            method => <<"GET">>,
            handler => 'openapi_users_handler'
        },
        'GetUserGroups' => #{
            path => "/api/v1/user_groups",
            method => <<"GET">>,
            handler => 'openapi_users_handler'
        },
        'GetUserPresence' => #{
            path => "/api/v1/users/:user_id_or_email/presence",
            method => <<"GET">>,
            handler => 'openapi_users_handler'
        },
        'GetUsers' => #{
            path => "/api/v1/users",
            method => <<"GET">>,
            handler => 'openapi_users_handler'
        },
        'MuteUser' => #{
            path => "/api/v1/users/me/muted_users/:muted_user_id",
            method => <<"POST">>,
            handler => 'openapi_users_handler'
        },
        'ReactivateUser' => #{
            path => "/api/v1/users/:user_id/reactivate",
            method => <<"POST">>,
            handler => 'openapi_users_handler'
        },
        'RemoveUserGroup' => #{
            path => "/api/v1/user_groups/:user_group_id",
            method => <<"DELETE">>,
            handler => 'openapi_users_handler'
        },
        'SetTypingStatus' => #{
            path => "/api/v1/typing",
            method => <<"POST">>,
            handler => 'openapi_users_handler'
        },
        'UnmuteUser' => #{
            path => "/api/v1/users/me/muted_users/:muted_user_id",
            method => <<"DELETE">>,
            handler => 'openapi_users_handler'
        },
        'UpdateSettings' => #{
            path => "/api/v1/settings",
            method => <<"PATCH">>,
            handler => 'openapi_users_handler'
        },
        'UpdateStatus' => #{
            path => "/api/v1/users/me/status",
            method => <<"POST">>,
            handler => 'openapi_users_handler'
        },
        'UpdateUser' => #{
            path => "/api/v1/users/:user_id",
            method => <<"PATCH">>,
            handler => 'openapi_users_handler'
        },
        'UpdateUserGroup' => #{
            path => "/api/v1/user_groups/:user_group_id",
            method => <<"PATCH">>,
            handler => 'openapi_users_handler'
        },
        'UpdateUserGroupMembers' => #{
            path => "/api/v1/user_groups/:user_group_id/members",
            method => <<"POST">>,
            handler => 'openapi_users_handler'
        },
        'ZulipOutgoingWebhooks' => #{
            path => "/api/v1/zulip-outgoing-webhook",
            method => <<"POST">>,
            handler => 'openapi_webhooks_handler'
        }
    }.

prepare_validator() ->
    R = jsx:decode(element(2, file:read_file(get_openapi_path()))),
    jesse_state:new(R, [{default_schema_ver, <<"http://json-schema.org/draft-04/schema#">>}]).


get_openapi_path() ->
    {ok, AppName} = application:get_application(?MODULE),
    filename:join(openapi_utils:priv_dir(AppName), "openapi.json").


