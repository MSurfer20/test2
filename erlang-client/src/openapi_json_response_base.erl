-module(openapi_json_response_base).

-export([encode/1]).

-export_type([openapi_json_response_base/0]).

-type openapi_json_response_base() ::
    #{ 'result' => binary()
     }.

encode(#{ 'result' := Result
        }) ->
    #{ 'result' => Result
     }.
