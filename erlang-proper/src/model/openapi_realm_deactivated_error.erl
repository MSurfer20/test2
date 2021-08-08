-module(openapi_realm_deactivated_error).

-include("openapi.hrl").

-export([openapi_realm_deactivated_error/0]).

-export([openapi_realm_deactivated_error/1]).

-export_type([openapi_realm_deactivated_error/0]).

-type openapi_realm_deactivated_error() ::
  [ {'result', openapi_any_type:openapi_any_type() }
  | {'msg', openapi_any_type:openapi_any_type() }
  | {'code', openapi_any_type:openapi_any_type() }
  ].


openapi_realm_deactivated_error() ->
    openapi_realm_deactivated_error([]).

openapi_realm_deactivated_error(Fields) ->
  Default = [ {'result', openapi_any_type:openapi_any_type() }
            , {'msg', openapi_any_type:openapi_any_type() }
            , {'code', openapi_any_type:openapi_any_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

