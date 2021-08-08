-module(openapi_basic_stream_base).

-export([encode/1]).

-export_type([openapi_basic_stream_base/0]).

-type openapi_basic_stream_base() ::
    #{ 'stream_id' => integer(),
       'name' => binary(),
       'description' => binary(),
       'date_created' => integer(),
       'invite_only' => boolean(),
       'rendered_description' => binary(),
       'is_web_public' => boolean(),
       'stream_post_policy' => integer(),
       'message_retention_days' => integer(),
       'history_public_to_subscribers' => boolean(),
       'first_message_id' => integer(),
       'is_announcement_only' => boolean()
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
