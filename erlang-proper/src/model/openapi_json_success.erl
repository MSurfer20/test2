-module(openapi_json_success).

-include("openapi.hrl").

-export([openapi_json_success/0]).

-export([openapi_json_success/1]).

-export_type([openapi_json_success/0]).

-type openapi_json_success() ::
  [ {'result', openapi_any_type:openapi_any_type() }
  | {'msg', openapi_any_type:openapi_any_type() }
  ].


openapi_json_success() ->
    openapi_json_success([]).

openapi_json_success(Fields) ->
  Default = [ {'result', openapi_any_type:openapi_any_type() }
            , {'msg', openapi_any_type:openapi_any_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

