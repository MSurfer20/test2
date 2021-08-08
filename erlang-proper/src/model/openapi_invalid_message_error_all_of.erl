-module(openapi_invalid_message_error_all_of).

-include("openapi.hrl").

-export([openapi_invalid_message_error_all_of/0]).

-export([openapi_invalid_message_error_all_of/1]).

-export_type([openapi_invalid_message_error_all_of/0]).

-type openapi_invalid_message_error_all_of() ::
  [ {'result', openapi_any_type:openapi_any_type() }
  | {'msg', openapi_any_type:openapi_any_type() }
  | {'raw_content', binary() }
  ].


openapi_invalid_message_error_all_of() ->
    openapi_invalid_message_error_all_of([]).

openapi_invalid_message_error_all_of(Fields) ->
  Default = [ {'result', openapi_any_type:openapi_any_type() }
            , {'msg', openapi_any_type:openapi_any_type() }
            , {'raw_content', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

