-module(openapi_basic_bot_base).

-include("openapi.hrl").

-export([openapi_basic_bot_base/0]).

-export([openapi_basic_bot_base/1]).

-export_type([openapi_basic_bot_base/0]).

-type openapi_basic_bot_base() ::
  [ {'user_id', integer() }
  | {'full_name', binary() }
  | {'api_key', binary() }
  | {'default_sending_stream', binary() }
  | {'default_events_register_stream', binary() }
  | {'default_all_public_streams', boolean() }
  | {'avatar_url', binary() }
  | {'owner_id', integer() }
  | {'services', list(openapi_one_of&lt;object,object&gt;:openapi_one_of&lt;object,object&gt;()) }
  ].


openapi_basic_bot_base() ->
    openapi_basic_bot_base([]).

openapi_basic_bot_base(Fields) ->
  Default = [ {'user_id', integer() }
            , {'full_name', binary() }
            , {'api_key', binary() }
            , {'default_sending_stream', binary() }
            , {'default_events_register_stream', binary() }
            , {'default_all_public_streams', boolean() }
            , {'avatar_url', binary() }
            , {'owner_id', integer() }
            , {'services', list(openapi_one_of&lt;object,object&gt;:openapi_one_of&lt;object,object&gt;()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

