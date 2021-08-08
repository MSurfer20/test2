-module(openapi_api).

-export([request_params/1]).
-export([request_param_info/2]).
-export([populate_request/3]).
-export([validate_response/4]).
%% exported to silence openapi complains
-export([get_value/3, validate_response_body/4]).

-type operation_id() :: atom().
-type request_param() :: atom().

-export_type([operation_id/0]).

-spec request_params(OperationID :: operation_id()) -> [Param :: request_param()].


request_params('DevFetchApiKey') ->
    [
        'username'
    ];

request_params('FetchApiKey') ->
    [
        'username',
        'password'
    ];


request_params('AddReaction') ->
    [
        'message_id',
        'emoji_name',
        'emoji_code',
        'reaction_type'
    ];

request_params('CheckMessagesMatchNarrow') ->
    [
        'msg_ids',
        'narrow'
    ];

request_params('DeleteMessage') ->
    [
        'message_id'
    ];

request_params('GetFileTemporaryUrl') ->
    [
        'realm_id_str',
        'filename'
    ];

request_params('GetMessageHistory') ->
    [
        'message_id'
    ];

request_params('GetMessages') ->
    [
        'num_before',
        'num_after',
        'anchor',
        'narrow',
        'client_gravatar',
        'apply_markdown',
        'use_first_unread_anchor'
    ];

request_params('GetRawMessage') ->
    [
        'message_id'
    ];

request_params('MarkAllAsRead') ->
    [
    ];

request_params('MarkStreamAsRead') ->
    [
        'stream_id'
    ];

request_params('MarkTopicAsRead') ->
    [
        'stream_id',
        'topic_name'
    ];

request_params('RemoveReaction') ->
    [
        'message_id',
        'emoji_name',
        'emoji_code',
        'reaction_type'
    ];

request_params('RenderMessage') ->
    [
        'content'
    ];

request_params('SendMessage') ->
    [
        'type',
        'to',
        'content',
        'topic',
        'queue_id',
        'local_id'
    ];

request_params('UpdateMessage') ->
    [
        'message_id',
        'topic',
        'propagate_mode',
        'send_notification_to_old_thread',
        'send_notification_to_new_thread',
        'content',
        'stream_id'
    ];

request_params('UpdateMessageFlags') ->
    [
        'messages',
        'op',
        'flag'
    ];

request_params('UploadFile') ->
    [
        'filename'
    ];


request_params('DeleteQueue') ->
    [
        'queue_id'
    ];

request_params('GetEvents') ->
    [
        'queue_id',
        'last_event_id',
        'dont_block'
    ];

request_params('RealTimePost') ->
    [
        'event_types',
        'narrow',
        'all_public_streams'
    ];

request_params('RegisterQueue') ->
    [
        'apply_markdown',
        'client_gravatar',
        'slim_presence',
        'event_types',
        'all_public_streams',
        'include_subscribers',
        'client_capabilities',
        'fetch_event_types',
        'narrow'
    ];

request_params('RestErrorHandling') ->
    [
    ];


request_params('AddCodePlayground') ->
    [
        'name',
        'pygments_language',
        'url_prefix'
    ];

request_params('AddLinkifier') ->
    [
        'pattern',
        'url_format_string'
    ];

request_params('CreateCustomProfileField') ->
    [
        'field_type',
        'name',
        'hint',
        'field_data'
    ];

request_params('GetCustomEmoji') ->
    [
    ];

request_params('GetCustomProfileFields') ->
    [
    ];

request_params('GetLinkifiers') ->
    [
    ];

request_params('GetServerSettings') ->
    [
    ];

request_params('RemoveCodePlayground') ->
    [
        'playground_id'
    ];

request_params('RemoveLinkifier') ->
    [
        'filter_id'
    ];

request_params('ReorderCustomProfileFields') ->
    [
        'order'
    ];

request_params('UpdateLinkifier') ->
    [
        'filter_id',
        'pattern',
        'url_format_string'
    ];

request_params('UploadCustomEmoji') ->
    [
        'emoji_name',
        'filename'
    ];


request_params('ArchiveStream') ->
    [
        'stream_id'
    ];

request_params('CreateBigBlueButtonVideoCall') ->
    [
    ];

request_params('GetStreamId') ->
    [
        'stream'
    ];

request_params('GetStreamTopics') ->
    [
        'stream_id'
    ];

request_params('GetStreams') ->
    [
        'include_public',
        'include_web_public',
        'include_subscribed',
        'include_all_active',
        'include_default',
        'include_owner_subscribed'
    ];

request_params('GetSubscriptionStatus') ->
    [
        'user_id',
        'stream_id'
    ];

request_params('GetSubscriptions') ->
    [
        'include_subscribers'
    ];

request_params('MuteTopic') ->
    [
        'topic',
        'op',
        'stream',
        'stream_id'
    ];

request_params('Subscribe') ->
    [
        'subscriptions',
        'principals',
        'authorization_errors_fatal',
        'announce',
        'invite_only',
        'history_public_to_subscribers',
        'stream_post_policy',
        'message_retention_days'
    ];

request_params('Unsubscribe') ->
    [
        'subscriptions',
        'principals'
    ];

request_params('UpdateStream') ->
    [
        'stream_id',
        'description',
        'new_name',
        'is_private',
        'is_announcement_only',
        'stream_post_policy',
        'history_public_to_subscribers',
        'message_retention_days'
    ];

request_params('UpdateSubscriptionSettings') ->
    [
        'subscription_data'
    ];

request_params('UpdateSubscriptions') ->
    [
        'delete',
        'add'
    ];


request_params('CreateUser') ->
    [
        'email',
        'password',
        'full_name'
    ];

request_params('CreateUserGroup') ->
    [
        'name',
        'description',
        'members'
    ];

request_params('DeactivateOwnUser') ->
    [
    ];

request_params('DeactivateUser') ->
    [
        'user_id'
    ];

request_params('GetAttachments') ->
    [
    ];

request_params('GetOwnUser') ->
    [
    ];

request_params('GetUser') ->
    [
        'user_id',
        'client_gravatar',
        'include_custom_profile_fields'
    ];

request_params('GetUserByEmail') ->
    [
        'email',
        'client_gravatar',
        'include_custom_profile_fields'
    ];

request_params('GetUserGroups') ->
    [
    ];

request_params('GetUserPresence') ->
    [
        'user_id_or_email'
    ];

request_params('GetUsers') ->
    [
        'client_gravatar',
        'include_custom_profile_fields'
    ];

request_params('MuteUser') ->
    [
        'muted_user_id'
    ];

request_params('ReactivateUser') ->
    [
        'user_id'
    ];

request_params('RemoveUserGroup') ->
    [
        'user_group_id'
    ];

request_params('SetTypingStatus') ->
    [
        'op',
        'to',
        'type',
        'topic'
    ];

request_params('UnmuteUser') ->
    [
        'muted_user_id'
    ];

request_params('UpdateDisplaySettings') ->
    [
        'twenty_four_hour_time',
        'dense_mode',
        'starred_message_counts',
        'fluid_layout_width',
        'high_contrast_mode',
        'color_scheme',
        'translate_emoticons',
        'default_language',
        'default_view',
        'left_side_userlist',
        'emojiset',
        'demote_inactive_streams',
        'timezone'
    ];

request_params('UpdateNotificationSettings') ->
    [
        'enable_stream_desktop_notifications',
        'enable_stream_email_notifications',
        'enable_stream_push_notifications',
        'enable_stream_audible_notifications',
        'notification_sound',
        'enable_desktop_notifications',
        'enable_sounds',
        'enable_offline_email_notifications',
        'enable_offline_push_notifications',
        'enable_online_push_notifications',
        'enable_digest_emails',
        'enable_marketing_emails',
        'enable_login_emails',
        'message_content_in_email_notifications',
        'pm_content_in_desktop_notifications',
        'wildcard_mentions_notify',
        'desktop_icon_count_display',
        'realm_name_in_notifications',
        'presence_enabled'
    ];

request_params('UpdateUser') ->
    [
        'user_id',
        'full_name',
        'role',
        'profile_data'
    ];

request_params('UpdateUserGroup') ->
    [
        'user_group_id',
        'name',
        'description'
    ];

request_params('UpdateUserGroupMembers') ->
    [
        'user_group_id',
        'delete',
        'add'
    ];


request_params('ZulipOutgoingWebhooks') ->
    [
    ];

request_params(_) ->
    error(unknown_operation).

-type rule() ::
    {type, 'binary'} |
    {type, 'integer'} |
    {type, 'float'} |
    {type, 'binary'} |
    {type, 'boolean'} |
    {type, 'date'} |
    {type, 'datetime'} |
    {enum, [atom()]} |
    {max, Max :: number()} |
    {exclusive_max, Max :: number()} |
    {min, Min :: number()} |
    {exclusive_min, Min :: number()} |
    {max_length, MaxLength :: integer()} |
    {min_length, MaxLength :: integer()} |
    {pattern, Pattern :: string()} |
    schema |
    required |
    not_required.

-spec request_param_info(OperationID :: operation_id(), Name :: request_param()) -> #{
    source => qs_val | binding | header | body,
    rules => [rule()]
}.



request_param_info('DevFetchApiKey', 'username') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('FetchApiKey', 'username') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('FetchApiKey', 'password') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };


request_param_info('AddReaction', 'message_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('AddReaction', 'emoji_name') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('AddReaction', 'emoji_code') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('AddReaction', 'reaction_type') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('CheckMessagesMatchNarrow', 'msg_ids') ->
    #{
        source => qs_val  ,
        rules => [
            required
        ]
    };

request_param_info('CheckMessagesMatchNarrow', 'narrow') ->
    #{
        source => qs_val  ,
        rules => [
            required
        ]
    };

request_param_info('DeleteMessage', 'message_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetFileTemporaryUrl', 'realm_id_str') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetFileTemporaryUrl', 'filename') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetMessageHistory', 'message_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetMessages', 'num_before') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {min, 0 },
            required
        ]
    };

request_param_info('GetMessages', 'num_after') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {min, 0 },
            required
        ]
    };

request_param_info('GetMessages', 'anchor') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('GetMessages', 'narrow') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('GetMessages', 'client_gravatar') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('GetMessages', 'apply_markdown') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('GetMessages', 'use_first_unread_anchor') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('GetRawMessage', 'message_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('MarkStreamAsRead', 'stream_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('MarkTopicAsRead', 'stream_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('MarkTopicAsRead', 'topic_name') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('RemoveReaction', 'message_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('RemoveReaction', 'emoji_name') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('RemoveReaction', 'emoji_code') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('RemoveReaction', 'reaction_type') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('RenderMessage', 'content') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('SendMessage', 'type') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['private', 'stream'] },
            required
        ]
    };

request_param_info('SendMessage', 'to') ->
    #{
        source => qs_val  ,
        rules => [
            required
        ]
    };

request_param_info('SendMessage', 'content') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('SendMessage', 'topic') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('SendMessage', 'queue_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('SendMessage', 'local_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('UpdateMessage', 'message_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('UpdateMessage', 'topic') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('UpdateMessage', 'propagate_mode') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['change_one', 'change_later', 'change_all'] },
            not_required
        ]
    };

request_param_info('UpdateMessage', 'send_notification_to_old_thread') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('UpdateMessage', 'send_notification_to_new_thread') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('UpdateMessage', 'content') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('UpdateMessage', 'stream_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('UpdateMessageFlags', 'messages') ->
    #{
        source => qs_val  ,
        rules => [
            required
        ]
    };

request_param_info('UpdateMessageFlags', 'op') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['add', 'remove'] },
            required
        ]
    };

request_param_info('UpdateMessageFlags', 'flag') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('UploadFile', 'filename') ->
    #{
        source =>   body,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };


request_param_info('DeleteQueue', 'queue_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetEvents', 'queue_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetEvents', 'last_event_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('GetEvents', 'dont_block') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('RealTimePost', 'event_types') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('RealTimePost', 'narrow') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('RealTimePost', 'all_public_streams') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('RegisterQueue', 'apply_markdown') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('RegisterQueue', 'client_gravatar') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('RegisterQueue', 'slim_presence') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('RegisterQueue', 'event_types') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('RegisterQueue', 'all_public_streams') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('RegisterQueue', 'include_subscribers') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('RegisterQueue', 'client_capabilities') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('RegisterQueue', 'fetch_event_types') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('RegisterQueue', 'narrow') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };


request_param_info('AddCodePlayground', 'name') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('AddCodePlayground', 'pygments_language') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('AddCodePlayground', 'url_prefix') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('AddLinkifier', 'pattern') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('AddLinkifier', 'url_format_string') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('CreateCustomProfileField', 'field_type') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('CreateCustomProfileField', 'name') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('CreateCustomProfileField', 'hint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('CreateCustomProfileField', 'field_data') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('RemoveCodePlayground', 'playground_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('RemoveLinkifier', 'filter_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('ReorderCustomProfileFields', 'order') ->
    #{
        source => qs_val  ,
        rules => [
            required
        ]
    };

request_param_info('UpdateLinkifier', 'filter_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('UpdateLinkifier', 'pattern') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('UpdateLinkifier', 'url_format_string') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('UploadCustomEmoji', 'emoji_name') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('UploadCustomEmoji', 'filename') ->
    #{
        source =>   body,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };


request_param_info('ArchiveStream', 'stream_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetStreamId', 'stream') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetStreamTopics', 'stream_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetStreams', 'include_public') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('GetStreams', 'include_web_public') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('GetStreams', 'include_subscribed') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('GetStreams', 'include_all_active') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('GetStreams', 'include_default') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('GetStreams', 'include_owner_subscribed') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('GetSubscriptionStatus', 'user_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetSubscriptionStatus', 'stream_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetSubscriptions', 'include_subscribers') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('MuteTopic', 'topic') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('MuteTopic', 'op') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['add', 'remove'] },
            required
        ]
    };

request_param_info('MuteTopic', 'stream') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('MuteTopic', 'stream_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('Subscribe', 'subscriptions') ->
    #{
        source => qs_val  ,
        rules => [
            required
        ]
    };

request_param_info('Subscribe', 'principals') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('Subscribe', 'authorization_errors_fatal') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('Subscribe', 'announce') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('Subscribe', 'invite_only') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('Subscribe', 'history_public_to_subscribers') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('Subscribe', 'stream_post_policy') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('Subscribe', 'message_retention_days') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('Unsubscribe', 'subscriptions') ->
    #{
        source => qs_val  ,
        rules => [
            required
        ]
    };

request_param_info('Unsubscribe', 'principals') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('UpdateStream', 'stream_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('UpdateStream', 'description') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('UpdateStream', 'new_name') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('UpdateStream', 'is_private') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('UpdateStream', 'is_announcement_only') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('UpdateStream', 'stream_post_policy') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('UpdateStream', 'history_public_to_subscribers') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('UpdateStream', 'message_retention_days') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('UpdateSubscriptionSettings', 'subscription_data') ->
    #{
        source => qs_val  ,
        rules => [
            required
        ]
    };

request_param_info('UpdateSubscriptions', 'delete') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('UpdateSubscriptions', 'add') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };


request_param_info('CreateUser', 'email') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('CreateUser', 'password') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('CreateUser', 'full_name') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('CreateUserGroup', 'name') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('CreateUserGroup', 'description') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('CreateUserGroup', 'members') ->
    #{
        source => qs_val  ,
        rules => [
            required
        ]
    };

request_param_info('DeactivateUser', 'user_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetUser', 'user_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetUser', 'client_gravatar') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('GetUser', 'include_custom_profile_fields') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('GetUserByEmail', 'email') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetUserByEmail', 'client_gravatar') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('GetUserByEmail', 'include_custom_profile_fields') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('GetUserPresence', 'user_id_or_email') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetUsers', 'client_gravatar') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('GetUsers', 'include_custom_profile_fields') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('MuteUser', 'muted_user_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('ReactivateUser', 'user_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('RemoveUserGroup', 'user_group_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('SetTypingStatus', 'op') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['start', 'stop'] },
            required
        ]
    };

request_param_info('SetTypingStatus', 'to') ->
    #{
        source => qs_val  ,
        rules => [
            required
        ]
    };

request_param_info('SetTypingStatus', 'type') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['private', 'stream'] },
            not_required
        ]
    };

request_param_info('SetTypingStatus', 'topic') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('UnmuteUser', 'muted_user_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('UpdateDisplaySettings', 'twenty_four_hour_time') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('UpdateDisplaySettings', 'dense_mode') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('UpdateDisplaySettings', 'starred_message_counts') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('UpdateDisplaySettings', 'fluid_layout_width') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('UpdateDisplaySettings', 'high_contrast_mode') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('UpdateDisplaySettings', 'color_scheme') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['1', '2', '3'] },
            not_required
        ]
    };

request_param_info('UpdateDisplaySettings', 'translate_emoticons') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('UpdateDisplaySettings', 'default_language') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('UpdateDisplaySettings', 'default_view') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('UpdateDisplaySettings', 'left_side_userlist') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('UpdateDisplaySettings', 'emojiset') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('UpdateDisplaySettings', 'demote_inactive_streams') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['1', '2', '3'] },
            not_required
        ]
    };

request_param_info('UpdateDisplaySettings', 'timezone') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('UpdateNotificationSettings', 'enable_stream_desktop_notifications') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('UpdateNotificationSettings', 'enable_stream_email_notifications') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('UpdateNotificationSettings', 'enable_stream_push_notifications') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('UpdateNotificationSettings', 'enable_stream_audible_notifications') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('UpdateNotificationSettings', 'notification_sound') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('UpdateNotificationSettings', 'enable_desktop_notifications') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('UpdateNotificationSettings', 'enable_sounds') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('UpdateNotificationSettings', 'enable_offline_email_notifications') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('UpdateNotificationSettings', 'enable_offline_push_notifications') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('UpdateNotificationSettings', 'enable_online_push_notifications') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('UpdateNotificationSettings', 'enable_digest_emails') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('UpdateNotificationSettings', 'enable_marketing_emails') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('UpdateNotificationSettings', 'enable_login_emails') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('UpdateNotificationSettings', 'message_content_in_email_notifications') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('UpdateNotificationSettings', 'pm_content_in_desktop_notifications') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('UpdateNotificationSettings', 'wildcard_mentions_notify') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('UpdateNotificationSettings', 'desktop_icon_count_display') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['1', '2', '3'] },
            not_required
        ]
    };

request_param_info('UpdateNotificationSettings', 'realm_name_in_notifications') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('UpdateNotificationSettings', 'presence_enabled') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('UpdateUser', 'user_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('UpdateUser', 'full_name') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('UpdateUser', 'role') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('UpdateUser', 'profile_data') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('UpdateUserGroup', 'user_group_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('UpdateUserGroup', 'name') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('UpdateUserGroup', 'description') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('UpdateUserGroupMembers', 'user_group_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('UpdateUserGroupMembers', 'delete') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('UpdateUserGroupMembers', 'add') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };


request_param_info(OperationID, Name) ->
    error({unknown_param, OperationID, Name}).

-spec populate_request(
    OperationID :: operation_id(),
    Req :: cowboy_req:req(),
    ValidatorState :: jesse_state:state()
) ->
    {ok, Model :: #{}, Req :: cowboy_req:req()} |
    {error, Reason :: any(), Req :: cowboy_req:req()}.

populate_request(OperationID, Req, ValidatorState) ->
    Params = request_params(OperationID),
    populate_request_params(OperationID, Params, Req, ValidatorState, #{}).

populate_request_params(_, [], Req, _, Model) ->
    {ok, Model, Req};

populate_request_params(OperationID, [FieldParams | T], Req0, ValidatorState, Model) ->
    case populate_request_param(OperationID, FieldParams, Req0, ValidatorState) of
        {ok, K, V, Req} ->
            populate_request_params(OperationID, T, Req, ValidatorState, maps:put(K, V, Model));
        Error ->
            Error
    end.

populate_request_param(OperationID, Name, Req0, ValidatorState) ->
    #{rules := Rules, source := Source} = request_param_info(OperationID, Name),
    case get_value(Source, Name, Req0) of
        {error, Reason, Req} ->
            {error, Reason, Req};
        {Value, Req} ->
            case prepare_param(Rules, Name, Value, ValidatorState) of
                {ok, Result} -> {ok, Name, Result, Req};
                {error, Reason} ->
                    {error, Reason, Req}
            end
    end.

-spec validate_response(
    OperationID :: operation_id(),
    Code :: 200..599,
    Body :: jesse:json_term(),
    ValidatorState :: jesse_state:state()
) -> ok | no_return().


validate_response('DevFetchApiKey', 200, Body, ValidatorState) ->
    validate_response_body('ApiKeyResponse', 'ApiKeyResponse', Body, ValidatorState);

validate_response('FetchApiKey', 200, Body, ValidatorState) ->
    validate_response_body('ApiKeyResponse', 'ApiKeyResponse', Body, ValidatorState);


validate_response('AddReaction', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccess', 'JsonSuccess', Body, ValidatorState);
validate_response('AddReaction', 400, Body, ValidatorState) ->
    validate_response_body('CodedError', 'CodedError', Body, ValidatorState);

validate_response('CheckMessagesMatchNarrow', 200, Body, ValidatorState) ->
    validate_response_body('AnyType', 'AnyType', Body, ValidatorState);

validate_response('DeleteMessage', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccess', 'JsonSuccess', Body, ValidatorState);
validate_response('DeleteMessage', 400, Body, ValidatorState) ->
    validate_response_body('oneOf&lt;object,object&gt;', 'oneOf&lt;object,object&gt;', Body, ValidatorState);

validate_response('GetFileTemporaryUrl', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccessBase', 'JsonSuccessBase', Body, ValidatorState);

validate_response('GetMessageHistory', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccessBase', 'JsonSuccessBase', Body, ValidatorState);
validate_response('GetMessageHistory', 400, Body, ValidatorState) ->
    validate_response_body('InvalidMessageError', 'InvalidMessageError', Body, ValidatorState);

validate_response('GetMessages', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccessBase', 'JsonSuccessBase', Body, ValidatorState);

validate_response('GetRawMessage', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccessBase', 'JsonSuccessBase', Body, ValidatorState);
validate_response('GetRawMessage', 400, Body, ValidatorState) ->
    validate_response_body('InvalidMessageError', 'InvalidMessageError', Body, ValidatorState);

validate_response('MarkAllAsRead', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccess', 'JsonSuccess', Body, ValidatorState);

validate_response('MarkStreamAsRead', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccess', 'JsonSuccess', Body, ValidatorState);

validate_response('MarkTopicAsRead', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccess', 'JsonSuccess', Body, ValidatorState);

validate_response('RemoveReaction', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccess', 'JsonSuccess', Body, ValidatorState);
validate_response('RemoveReaction', 400, Body, ValidatorState) ->
    validate_response_body('CodedError', 'CodedError', Body, ValidatorState);

validate_response('RenderMessage', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccessBase', 'JsonSuccessBase', Body, ValidatorState);

validate_response('SendMessage', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccessBase', 'JsonSuccessBase', Body, ValidatorState);
validate_response('SendMessage', 400, Body, ValidatorState) ->
    validate_response_body('oneOf&lt;object,object&gt;', 'oneOf&lt;object,object&gt;', Body, ValidatorState);

validate_response('UpdateMessage', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccess', 'JsonSuccess', Body, ValidatorState);
validate_response('UpdateMessage', 400, Body, ValidatorState) ->
    validate_response_body('CodedError', 'CodedError', Body, ValidatorState);

validate_response('UpdateMessageFlags', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccessBase', 'JsonSuccessBase', Body, ValidatorState);

validate_response('UploadFile', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccessBase', 'JsonSuccessBase', Body, ValidatorState);


validate_response('DeleteQueue', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccess', 'JsonSuccess', Body, ValidatorState);
validate_response('DeleteQueue', 400, Body, ValidatorState) ->
    validate_response_body('BadEventQueueIdError', 'BadEventQueueIdError', Body, ValidatorState);

validate_response('GetEvents', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccessBase', 'JsonSuccessBase', Body, ValidatorState);
validate_response('GetEvents', 400, Body, ValidatorState) ->
    validate_response_body('BadEventQueueIdError', 'BadEventQueueIdError', Body, ValidatorState);

validate_response('RealTimePost', 200, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);

validate_response('RegisterQueue', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccessBase', 'JsonSuccessBase', Body, ValidatorState);

validate_response('RestErrorHandling', 400, Body, ValidatorState) ->
    validate_response_body('oneOf&lt;InvalidApiKeyError,MissingArgumentError,UserNotAuthorizedError&gt;', 'oneOf&lt;InvalidApiKeyError,MissingArgumentError,UserNotAuthorizedError&gt;', Body, ValidatorState);
validate_response('RestErrorHandling', 401, Body, ValidatorState) ->
    validate_response_body('oneOf&lt;UserDeactivatedError,RealmDeactivatedError&gt;', 'oneOf&lt;UserDeactivatedError,RealmDeactivatedError&gt;', Body, ValidatorState);
validate_response('RestErrorHandling', 429, Body, ValidatorState) ->
    validate_response_body('oneOf&lt;RateLimitedError&gt;', 'oneOf&lt;RateLimitedError&gt;', Body, ValidatorState);


validate_response('AddCodePlayground', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccessBase', 'JsonSuccessBase', Body, ValidatorState);

validate_response('AddLinkifier', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccessBase', 'JsonSuccessBase', Body, ValidatorState);

validate_response('CreateCustomProfileField', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccessBase', 'JsonSuccessBase', Body, ValidatorState);

validate_response('GetCustomEmoji', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccessBase', 'JsonSuccessBase', Body, ValidatorState);

validate_response('GetCustomProfileFields', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccessBase', 'JsonSuccessBase', Body, ValidatorState);

validate_response('GetLinkifiers', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccessBase', 'JsonSuccessBase', Body, ValidatorState);

validate_response('GetServerSettings', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccessBase', 'JsonSuccessBase', Body, ValidatorState);

validate_response('RemoveCodePlayground', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccess', 'JsonSuccess', Body, ValidatorState);

validate_response('RemoveLinkifier', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccess', 'JsonSuccess', Body, ValidatorState);

validate_response('ReorderCustomProfileFields', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccess', 'JsonSuccess', Body, ValidatorState);

validate_response('UpdateLinkifier', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccess', 'JsonSuccess', Body, ValidatorState);

validate_response('UploadCustomEmoji', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccess', 'JsonSuccess', Body, ValidatorState);


validate_response('ArchiveStream', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccess', 'JsonSuccess', Body, ValidatorState);
validate_response('ArchiveStream', 400, Body, ValidatorState) ->
    validate_response_body('JsonError', 'JsonError', Body, ValidatorState);

validate_response('CreateBigBlueButtonVideoCall', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccessBase', 'JsonSuccessBase', Body, ValidatorState);

validate_response('GetStreamId', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccessBase', 'JsonSuccessBase', Body, ValidatorState);
validate_response('GetStreamId', 400, Body, ValidatorState) ->
    validate_response_body('CodedError', 'CodedError', Body, ValidatorState);

validate_response('GetStreamTopics', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccessBase', 'JsonSuccessBase', Body, ValidatorState);
validate_response('GetStreamTopics', 400, Body, ValidatorState) ->
    validate_response_body('JsonError', 'JsonError', Body, ValidatorState);

validate_response('GetStreams', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccessBase', 'JsonSuccessBase', Body, ValidatorState);
validate_response('GetStreams', 400, Body, ValidatorState) ->
    validate_response_body('CodedError', 'CodedError', Body, ValidatorState);

validate_response('GetSubscriptionStatus', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccessBase', 'JsonSuccessBase', Body, ValidatorState);

validate_response('GetSubscriptions', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccessBase', 'JsonSuccessBase', Body, ValidatorState);

validate_response('MuteTopic', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccess', 'JsonSuccess', Body, ValidatorState);
validate_response('MuteTopic', 400, Body, ValidatorState) ->
    validate_response_body('oneOf&lt;object,object&gt;', 'oneOf&lt;object,object&gt;', Body, ValidatorState);

validate_response('Subscribe', 200, Body, ValidatorState) ->
    validate_response_body('oneOf&lt;object,object&gt;', 'oneOf&lt;object,object&gt;', Body, ValidatorState);
validate_response('Subscribe', 400, Body, ValidatorState) ->
    validate_response_body('oneOf&lt;object,object&gt;', 'oneOf&lt;object,object&gt;', Body, ValidatorState);

validate_response('Unsubscribe', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccessBase', 'JsonSuccessBase', Body, ValidatorState);
validate_response('Unsubscribe', 400, Body, ValidatorState) ->
    validate_response_body('NonExistingStreamError', 'NonExistingStreamError', Body, ValidatorState);

validate_response('UpdateStream', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccess', 'JsonSuccess', Body, ValidatorState);
validate_response('UpdateStream', 400, Body, ValidatorState) ->
    validate_response_body('JsonError', 'JsonError', Body, ValidatorState);

validate_response('UpdateSubscriptionSettings', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccessBase', 'JsonSuccessBase', Body, ValidatorState);

validate_response('UpdateSubscriptions', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccessBase', 'JsonSuccessBase', Body, ValidatorState);


validate_response('CreateUser', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccessBase', 'JsonSuccessBase', Body, ValidatorState);
validate_response('CreateUser', 400, Body, ValidatorState) ->
    validate_response_body('JsonError', 'JsonError', Body, ValidatorState);

validate_response('CreateUserGroup', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccess', 'JsonSuccess', Body, ValidatorState);
validate_response('CreateUserGroup', 400, Body, ValidatorState) ->
    validate_response_body('JsonError', 'JsonError', Body, ValidatorState);

validate_response('DeactivateOwnUser', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccess', 'JsonSuccess', Body, ValidatorState);
validate_response('DeactivateOwnUser', 400, Body, ValidatorState) ->
    validate_response_body('JsonError', 'JsonError', Body, ValidatorState);

validate_response('DeactivateUser', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccess', 'JsonSuccess', Body, ValidatorState);
validate_response('DeactivateUser', 400, Body, ValidatorState) ->
    validate_response_body('JsonError', 'JsonError', Body, ValidatorState);

validate_response('GetAttachments', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccessBase', 'JsonSuccessBase', Body, ValidatorState);

validate_response('GetOwnUser', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccessBase', 'JsonSuccessBase', Body, ValidatorState);

validate_response('GetUser', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccessBase', 'JsonSuccessBase', Body, ValidatorState);

validate_response('GetUserByEmail', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccessBase', 'JsonSuccessBase', Body, ValidatorState);

validate_response('GetUserGroups', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccessBase', 'JsonSuccessBase', Body, ValidatorState);

validate_response('GetUserPresence', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccessBase', 'JsonSuccessBase', Body, ValidatorState);

validate_response('GetUsers', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccessBase', 'JsonSuccessBase', Body, ValidatorState);

validate_response('MuteUser', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccess', 'JsonSuccess', Body, ValidatorState);
validate_response('MuteUser', 400, Body, ValidatorState) ->
    validate_response_body('oneOf&lt;object,object,object&gt;', 'oneOf&lt;object,object,object&gt;', Body, ValidatorState);

validate_response('ReactivateUser', 200, Body, ValidatorState) ->
    validate_response_body('AnyType', 'AnyType', Body, ValidatorState);

validate_response('RemoveUserGroup', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccess', 'JsonSuccess', Body, ValidatorState);
validate_response('RemoveUserGroup', 400, Body, ValidatorState) ->
    validate_response_body('JsonError', 'JsonError', Body, ValidatorState);

validate_response('SetTypingStatus', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccess', 'JsonSuccess', Body, ValidatorState);
validate_response('SetTypingStatus', 400, Body, ValidatorState) ->
    validate_response_body('JsonError', 'JsonError', Body, ValidatorState);

validate_response('UnmuteUser', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccess', 'JsonSuccess', Body, ValidatorState);
validate_response('UnmuteUser', 400, Body, ValidatorState) ->
    validate_response_body('oneOf&lt;object,object&gt;', 'oneOf&lt;object,object&gt;', Body, ValidatorState);

validate_response('UpdateDisplaySettings', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccessBase', 'JsonSuccessBase', Body, ValidatorState);

validate_response('UpdateNotificationSettings', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccessBase', 'JsonSuccessBase', Body, ValidatorState);

validate_response('UpdateUser', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccess', 'JsonSuccess', Body, ValidatorState);
validate_response('UpdateUser', 400, Body, ValidatorState) ->
    validate_response_body('CodedError', 'CodedError', Body, ValidatorState);

validate_response('UpdateUserGroup', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccess', 'JsonSuccess', Body, ValidatorState);
validate_response('UpdateUserGroup', 400, Body, ValidatorState) ->
    validate_response_body('JsonError', 'JsonError', Body, ValidatorState);

validate_response('UpdateUserGroupMembers', 200, Body, ValidatorState) ->
    validate_response_body('JsonSuccess', 'JsonSuccess', Body, ValidatorState);


validate_response('ZulipOutgoingWebhooks', 200, Body, ValidatorState) ->
    validate_response_body('inline_response_200', 'inline_response_200', Body, ValidatorState);


validate_response(_OperationID, _Code, _Body, _ValidatorState) ->
    ok.

validate_response_body('list', ReturnBaseType, Body, ValidatorState) ->
    [
        validate(schema, ReturnBaseType, Item, ValidatorState)
    || Item <- Body];

validate_response_body(_, ReturnBaseType, Body, ValidatorState) ->
    validate(schema, ReturnBaseType, Body, ValidatorState).

%%%
validate(Rule = required, Name, Value, _ValidatorState) ->
    case Value of
        undefined -> validation_error(Rule, Name);
        _ -> ok
    end;

validate(not_required, _Name, _Value, _ValidatorState) ->
    ok;

validate(_, _Name, undefined, _ValidatorState) ->
    ok;

validate(Rule = {type, 'integer'}, Name, Value, _ValidatorState) ->
    try
        {ok, openapi_utils:to_int(Value)}
    catch
        error:badarg ->
            validation_error(Rule, Name)
    end;

validate(Rule = {type, 'float'}, Name, Value, _ValidatorState) ->
    try
        {ok, openapi_utils:to_float(Value)}
    catch
        error:badarg ->
            validation_error(Rule, Name)
    end;

validate(Rule = {type, 'binary'}, Name, Value, _ValidatorState) ->
    case is_binary(Value) of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(_Rule = {type, 'boolean'}, _Name, Value, _ValidatorState) when is_boolean(Value) ->
    {ok, Value};

validate(Rule = {type, 'boolean'}, Name, Value, _ValidatorState) ->
    V = binary_to_lower(Value),
    try
        case binary_to_existing_atom(V, utf8) of
            B when is_boolean(B) -> {ok, B};
            _ -> validation_error(Rule, Name)
        end
    catch
        error:badarg ->
            validation_error(Rule, Name)
    end;

validate(Rule = {type, 'date'}, Name, Value, _ValidatorState) ->
    case is_binary(Value) of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {type, 'datetime'}, Name, Value, _ValidatorState) ->
    case is_binary(Value) of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {enum, Values}, Name, Value, _ValidatorState) ->
    try
        FormattedValue = erlang:binary_to_existing_atom(Value, utf8),
        case lists:member(FormattedValue, Values) of
            true -> {ok, FormattedValue};
            false -> validation_error(Rule, Name)
        end
    catch
        error:badarg ->
            validation_error(Rule, Name)
    end;

validate(Rule = {max, Max}, Name, Value, _ValidatorState) ->
    case Value =< Max of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {exclusive_max, ExclusiveMax}, Name, Value, _ValidatorState) ->
    case Value > ExclusiveMax of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {min, Min}, Name, Value, _ValidatorState) ->
    case Value >= Min of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {exclusive_min, ExclusiveMin}, Name, Value, _ValidatorState) ->
    case Value =< ExclusiveMin of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {max_length, MaxLength}, Name, Value, _ValidatorState) ->
    case size(Value) =< MaxLength of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {min_length, MinLength}, Name, Value, _ValidatorState) ->
    case size(Value) >= MinLength of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {pattern, Pattern}, Name, Value, _ValidatorState) ->
    {ok, MP} = re:compile(Pattern),
    case re:run(Value, MP) of
        {match, _} -> ok;
        _ -> validation_error(Rule, Name)
    end;

validate(Rule = schema, Name, Value, ValidatorState) ->
    Definition =  list_to_binary("#/components/schemas/" ++ openapi_utils:to_list(Name)),
    try
        _ = validate_with_schema(Value, Definition, ValidatorState),
        ok
    catch
        throw:[{schema_invalid, _, Error} | _] ->
            Info = #{
                type => schema_invalid,
                error => Error
            },
            validation_error(Rule, Name, Info);
        throw:[{data_invalid, Schema, Error, _, Path} | _] ->
            Info = #{
                type => data_invalid,
                error => Error,
                schema => Schema,
                path => Path
            },
            validation_error(Rule, Name, Info)
    end;

validate(Rule, Name, _Value, _ValidatorState) ->
    error_logger:info_msg("Can't validate ~p with ~p", [Name, Rule]),
    error({unknown_validation_rule, Rule}).

-spec validation_error(Rule :: any(), Name :: any()) -> no_return().

validation_error(ViolatedRule, Name) ->
    validation_error(ViolatedRule, Name, #{}).

-spec validation_error(Rule :: any(), Name :: any(), Info :: #{}) -> no_return().

validation_error(ViolatedRule, Name, Info) ->
    throw({wrong_param, Name, ViolatedRule, Info}).

-spec get_value(body | qs_val | header | binding, Name :: any(), Req0 :: cowboy_req:req()) ->
    {Value :: any(), Req :: cowboy_req:req()} | 
    {error, Reason :: any(), Req :: cowboy_req:req()}.
get_value(body, _Name, Req0) ->
    {ok, Body, Req} = cowboy_req:read_body(Req0),
    case prepare_body(Body) of
        {error, Reason} ->
            {error, Reason, Req};
        Value ->
            {Value, Req}
    end;

get_value(qs_val, Name, Req) ->
    QS = cowboy_req:parse_qs(Req),
    Value = openapi_utils:get_opt(openapi_utils:to_qs(Name), QS),
    {Value, Req};

get_value(header, Name, Req) ->
    Headers = cowboy_req:headers(Req),
    Value =  maps:get(openapi_utils:to_header(Name), Headers, undefined),
    {Value, Req};

get_value(binding, Name, Req) ->
    Value = cowboy_req:binding(openapi_utils:to_binding(Name), Req),
    {Value, Req}.

prepare_body(Body) ->
    case Body of
        <<"">> -> <<"">>;
        _ ->
            try
                jsx:decode(Body, [return_maps]) 
            catch
              error:_ ->
                {error, {invalid_body, not_json, Body}}
            end
    end.

validate_with_schema(Body, Definition, ValidatorState) ->
    jesse_schema_validator:validate_with_state(
        [{<<"$ref">>, Definition}],
        Body,
        ValidatorState
    ).

prepare_param(Rules, Name, Value, ValidatorState) ->
    try
        Result = lists:foldl(
            fun(Rule, Acc) ->
                case validate(Rule, Name, Acc, ValidatorState) of
                    ok -> Acc;
                    {ok, Prepared} -> Prepared
                end
            end,
            Value,
            Rules
        ),
        {ok, Result}
    catch
        throw:Reason ->
            {error, Reason}
    end.

binary_to_lower(V) when is_binary(V) ->
    list_to_binary(string:to_lower(openapi_utils:to_list(V))).
