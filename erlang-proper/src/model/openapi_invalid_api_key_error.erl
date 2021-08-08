-module(openapi_invalid_api_key_error).

-include("openapi.hrl").

-export([openapi_invalid_api_key_error/0]).

-export([openapi_invalid_api_key_error/1]).

-export_type([openapi_invalid_api_key_error/0]).

-type openapi_invalid_api_key_error() ::
  [ {'result', openapi_any_type:openapi_any_type() }
  | {'msg', openapi_any_type:openapi_any_type() }
  ].


openapi_invalid_api_key_error() ->
    openapi_invalid_api_key_error([]).

openapi_invalid_api_key_error(Fields) ->
  Default = [ {'result', openapi_any_type:openapi_any_type() }
            , {'msg', openapi_any_type:openapi_any_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

