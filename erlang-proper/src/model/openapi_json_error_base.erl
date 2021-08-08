-module(openapi_json_error_base).

-include("openapi.hrl").

-export([openapi_json_error_base/0]).

-export([openapi_json_error_base/1]).

-export_type([openapi_json_error_base/0]).

-type openapi_json_error_base() ::
  [ {'result', binary() }
  | {'msg', binary() }
  ].


openapi_json_error_base() ->
    openapi_json_error_base([]).

openapi_json_error_base(Fields) ->
  Default = [ {'result', elements([<<"error">>]) }
            , {'msg', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

