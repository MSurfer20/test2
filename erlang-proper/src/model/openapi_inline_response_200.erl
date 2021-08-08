-module(openapi_inline_response_200).

-include("openapi.hrl").

-export([openapi_inline_response_200/0]).

-export([openapi_inline_response_200/1]).

-export_type([openapi_inline_response_200/0]).

-type openapi_inline_response_200() ::
  [ {'bot_email', binary() }
  | {'bot_full_name', binary() }
  | {'data', binary() }
  | {'trigger', binary() }
  | {'token', binary() }
  | {'message', openapi_messages_base:openapi_messages_base() }
  ].


openapi_inline_response_200() ->
    openapi_inline_response_200([]).

openapi_inline_response_200(Fields) ->
  Default = [ {'bot_email', binary() }
            , {'bot_full_name', binary() }
            , {'data', binary() }
            , {'trigger', binary() }
            , {'token', binary() }
            , {'message', openapi_messages_base:openapi_messages_base() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

