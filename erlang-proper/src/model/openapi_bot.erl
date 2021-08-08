-module(openapi_bot).

-include("openapi.hrl").

-export([openapi_bot/0]).

-export([openapi_bot/1]).

-export_type([openapi_bot/0]).

-type openapi_bot() ::
  [ {'user_id', openapi_any_type:openapi_any_type() }
  | {'full_name', openapi_any_type:openapi_any_type() }
  | {'api_key', openapi_any_type:openapi_any_type() }
  | {'default_sending_stream', openapi_any_type:openapi_any_type() }
  | {'default_events_register_stream', openapi_any_type:openapi_any_type() }
  | {'default_all_public_streams', openapi_any_type:openapi_any_type() }
  | {'avatar_url', openapi_any_type:openapi_any_type() }
  | {'owner_id', openapi_any_type:openapi_any_type() }
  | {'services', openapi_any_type:openapi_any_type() }
  | {'email', binary() }
  | {'bot_type', integer() }
  | {'is_active', boolean() }
  ].


openapi_bot() ->
    openapi_bot([]).

openapi_bot(Fields) ->
  Default = [ {'user_id', openapi_any_type:openapi_any_type() }
            , {'full_name', openapi_any_type:openapi_any_type() }
            , {'api_key', openapi_any_type:openapi_any_type() }
            , {'default_sending_stream', openapi_any_type:openapi_any_type() }
            , {'default_events_register_stream', openapi_any_type:openapi_any_type() }
            , {'default_all_public_streams', openapi_any_type:openapi_any_type() }
            , {'avatar_url', openapi_any_type:openapi_any_type() }
            , {'owner_id', openapi_any_type:openapi_any_type() }
            , {'services', openapi_any_type:openapi_any_type() }
            , {'email', binary() }
            , {'bot_type', integer() }
            , {'is_active', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

