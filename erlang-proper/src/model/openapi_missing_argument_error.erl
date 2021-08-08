-module(openapi_missing_argument_error).

-include("openapi.hrl").

-export([openapi_missing_argument_error/0]).

-export([openapi_missing_argument_error/1]).

-export_type([openapi_missing_argument_error/0]).

-type openapi_missing_argument_error() ::
  [ {'result', openapi_any_type:openapi_any_type() }
  | {'msg', openapi_any_type:openapi_any_type() }
  | {'code', openapi_any_type:openapi_any_type() }
  | {'var_name', binary() }
  ].


openapi_missing_argument_error() ->
    openapi_missing_argument_error([]).

openapi_missing_argument_error(Fields) ->
  Default = [ {'result', openapi_any_type:openapi_any_type() }
            , {'msg', openapi_any_type:openapi_any_type() }
            , {'code', openapi_any_type:openapi_any_type() }
            , {'var_name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

