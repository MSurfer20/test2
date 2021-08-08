-module(openapi_rate_limited_error).

-include("openapi.hrl").

-export([openapi_rate_limited_error/0]).

-export([openapi_rate_limited_error/1]).

-export_type([openapi_rate_limited_error/0]).

-type openapi_rate_limited_error() ::
  [ {'result', openapi_any_type:openapi_any_type() }
  | {'msg', openapi_any_type:openapi_any_type() }
  | {'code', openapi_any_type:openapi_any_type() }
  ].


openapi_rate_limited_error() ->
    openapi_rate_limited_error([]).

openapi_rate_limited_error(Fields) ->
  Default = [ {'result', openapi_any_type:openapi_any_type() }
            , {'msg', openapi_any_type:openapi_any_type() }
            , {'code', openapi_any_type:openapi_any_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

