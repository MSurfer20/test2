-module(openapi_basic_stream).

-export([encode/1]).

-export_type([openapi_basic_stream/0]).

-type openapi_basic_stream() ::
    #{ 'stream_id' => openapi_any_type:openapi_any_type(),
       'name' => openapi_any_type:openapi_any_type(),
       'description' => openapi_any_type:openapi_any_type(),
       'date_created' => openapi_any_type:openapi_any_type(),
       'invite_only' => openapi_any_type:openapi_any_type(),
       'rendered_description' => openapi_any_type:openapi_any_type(),
       'is_web_public' => openapi_any_type:openapi_any_type(),
       'stream_post_policy' => openapi_any_type:openapi_any_type(),
       'message_retention_days' => openapi_any_type:openapi_any_type(),
       'history_public_to_subscribers' => openapi_any_type:openapi_any_type(),
       'first_message_id' => openapi_any_type:openapi_any_type(),
       'is_announcement_only' => openapi_any_type:openapi_any_type()
     }.

encode(#{ 'stream_id' := StreamId,
          'name' := Name,
          'description' := Description,
          'date_created' := DateCreated,
          'invite_only' := InviteOnly,
          'rendered_description' := RenderedDescription,
          'is_web_public' := IsWebPublic,
          'stream_post_policy' := StreamPostPolicy,
          'message_retention_days' := MessageRetentionDays,
          'history_public_to_subscribers' := HistoryPublicToSubscribers,
          'first_message_id' := FirstMessageId,
          'is_announcement_only' := IsAnnouncementOnly
        }) ->
    #{ 'stream_id' => StreamId,
       'name' => Name,
       'description' => Description,
       'date_created' => DateCreated,
       'invite_only' => InviteOnly,
       'rendered_description' => RenderedDescription,
       'is_web_public' => IsWebPublic,
       'stream_post_policy' => StreamPostPolicy,
       'message_retention_days' => MessageRetentionDays,
       'history_public_to_subscribers' => HistoryPublicToSubscribers,
       'first_message_id' => FirstMessageId,
       'is_announcement_only' => IsAnnouncementOnly
     }.
