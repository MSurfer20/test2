-module(openapi_api_key_response).

-include("openapi.hrl").

-export([openapi_api_key_response/0]).

-export([openapi_api_key_response/1]).

-export_type([openapi_api_key_response/0]).

-type openapi_api_key_response() ::
  [ {'result', openapi_any_type:openapi_any_type() }
  | {'msg', openapi_any_type:openapi_any_type() }
  | {'api_key', binary() }
  | {'email', binary() }
  ].


openapi_api_key_response() ->
    openapi_api_key_response([]).

openapi_api_key_response(Fields) ->
  Default = [ {'result', openapi_any_type:openapi_any_type() }
            , {'msg', openapi_any_type:openapi_any_type() }
            , {'api_key', binary() }
            , {'email', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

