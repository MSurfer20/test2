-module(openapi_json_success_all_of).

-include("openapi.hrl").

-export([openapi_json_success_all_of/0]).

-export([openapi_json_success_all_of/1]).

-export_type([openapi_json_success_all_of/0]).

-type openapi_json_success_all_of() ::
  [ {'result', openapi_any_type:openapi_any_type() }
  | {'msg', openapi_any_type:openapi_any_type() }
  ].


openapi_json_success_all_of() ->
    openapi_json_success_all_of([]).

openapi_json_success_all_of(Fields) ->
  Default = [ {'result', openapi_any_type:openapi_any_type() }
            , {'msg', openapi_any_type:openapi_any_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

