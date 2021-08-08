-module(openapi_json_error).

-include("openapi.hrl").

-export([openapi_json_error/0]).

-export([openapi_json_error/1]).

-export_type([openapi_json_error/0]).

-type openapi_json_error() ::
  [ {'result', openapi_any_type:openapi_any_type() }
  | {'msg', openapi_any_type:openapi_any_type() }
  ].


openapi_json_error() ->
    openapi_json_error([]).

openapi_json_error(Fields) ->
  Default = [ {'result', openapi_any_type:openapi_any_type() }
            , {'msg', openapi_any_type:openapi_any_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

