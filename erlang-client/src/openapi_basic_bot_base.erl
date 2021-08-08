-module(openapi_basic_bot_base).

-export([encode/1]).

-export_type([openapi_basic_bot_base/0]).

-type openapi_basic_bot_base() ::
    #{ 'user_id' => integer(),
       'full_name' => binary(),
       'api_key' => binary(),
       'default_sending_stream' => binary(),
       'default_events_register_stream' => binary(),
       'default_all_public_streams' => boolean(),
       'avatar_url' => binary(),
       'owner_id' => integer(),
       'services' => list()
     }.

encode(#{ 'user_id' := UserId,
          'full_name' := FullName,
          'api_key' := ApiKey,
          'default_sending_stream' := DefaultSendingStream,
          'default_events_register_stream' := DefaultEventsRegisterStream,
          'default_all_public_streams' := DefaultAllPublicStreams,
          'avatar_url' := AvatarUrl,
          'owner_id' := OwnerId,
          'services' := Services
        }) ->
    #{ 'user_id' => UserId,
       'full_name' => FullName,
       'api_key' => ApiKey,
       'default_sending_stream' => DefaultSendingStream,
       'default_events_register_stream' => DefaultEventsRegisterStream,
       'default_all_public_streams' => DefaultAllPublicStreams,
       'avatar_url' => AvatarUrl,
       'owner_id' => OwnerId,
       'services' => Services
     }.
