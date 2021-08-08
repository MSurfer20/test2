-module(openapi_invalid_message_error).

-include("openapi.hrl").

-export([openapi_invalid_message_error/0]).

-export([openapi_invalid_message_error/1]).

-export_type([openapi_invalid_message_error/0]).

-type openapi_invalid_message_error() ::
  [ {'result', openapi_any_type:openapi_any_type() }
  | {'msg', openapi_any_type:openapi_any_type() }
  | {'raw_content', binary() }
  ].


openapi_invalid_message_error() ->
    openapi_invalid_message_error([]).

openapi_invalid_message_error(Fields) ->
  Default = [ {'result', openapi_any_type:openapi_any_type() }
            , {'msg', openapi_any_type:openapi_any_type() }
            , {'raw_content', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

