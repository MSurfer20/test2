-module(openapi_invalid_api_key_error).

-export([encode/1]).

-export_type([openapi_invalid_api_key_error/0]).

-type openapi_invalid_api_key_error() ::
    #{ 'result' := openapi_any_type:openapi_any_type(),
       'msg' := openapi_any_type:openapi_any_type()
     }.

encode(#{ 'result' := Result,
          'msg' := Msg
        }) ->
    #{ 'result' => Result,
       'msg' => Msg
     }.
