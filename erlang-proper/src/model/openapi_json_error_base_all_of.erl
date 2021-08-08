-module(openapi_json_error_base_all_of).

-include("openapi.hrl").

-export([openapi_json_error_base_all_of/0]).

-export([openapi_json_error_base_all_of/1]).

-export_type([openapi_json_error_base_all_of/0]).

-type openapi_json_error_base_all_of() ::
  [ {'result', binary() }
  | {'msg', binary() }
  ].


openapi_json_error_base_all_of() ->
    openapi_json_error_base_all_of([]).

openapi_json_error_base_all_of(Fields) ->
  Default = [ {'result', elements([<<"error">>]) }
            , {'msg', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

