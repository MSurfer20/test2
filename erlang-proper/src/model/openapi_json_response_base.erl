-module(openapi_json_response_base).

-include("openapi.hrl").

-export([openapi_json_response_base/0]).

-export([openapi_json_response_base/1]).

-export_type([openapi_json_response_base/0]).

-type openapi_json_response_base() ::
  [ {'result', binary() }
  ].


openapi_json_response_base() ->
    openapi_json_response_base([]).

openapi_json_response_base(Fields) ->
  Default = [ {'result', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

