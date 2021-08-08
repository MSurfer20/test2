-module(openapi_basic_bot_all_of).

-export([encode/1]).

-export_type([openapi_basic_bot_all_of/0]).

-type openapi_basic_bot_all_of() ::
    #{ 'user_id' => openapi_any_type:openapi_any_type(),
       'full_name' => openapi_any_type:openapi_any_type(),
       'api_key' => openapi_any_type:openapi_any_type(),
       'default_sending_stream' => openapi_any_type:openapi_any_type(),
       'default_events_register_stream' => openapi_any_type:openapi_any_type(),
       'default_all_public_streams' => openapi_any_type:openapi_any_type(),
       'avatar_url' => openapi_any_type:openapi_any_type(),
       'owner_id' => openapi_any_type:openapi_any_type(),
       'services' => openapi_any_type:openapi_any_type()
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
