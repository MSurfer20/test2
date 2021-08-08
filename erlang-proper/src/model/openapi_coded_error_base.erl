-module(openapi_coded_error_base).

-include("openapi.hrl").

-export([openapi_coded_error_base/0]).

-export([openapi_coded_error_base/1]).

-export_type([openapi_coded_error_base/0]).

-type openapi_coded_error_base() ::
  [ {'result', openapi_any_type:openapi_any_type() }
  | {'msg', openapi_any_type:openapi_any_type() }
  | {'code', binary() }
  ].


openapi_coded_error_base() ->
    openapi_coded_error_base([]).

openapi_coded_error_base(Fields) ->
  Default = [ {'result', openapi_any_type:openapi_any_type() }
            , {'msg', openapi_any_type:openapi_any_type() }
            , {'code', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

