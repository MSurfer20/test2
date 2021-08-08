-module(openapi_json_error).

-export([encode/1]).

-export_type([openapi_json_error/0]).

-type openapi_json_error() ::
    #{ 'result' := openapi_any_type:openapi_any_type(),
       'msg' := openapi_any_type:openapi_any_type()
     }.

encode(#{ 'result' := Result,
          'msg' := Msg
        }) ->
    #{ 'result' => Result,
       'msg' => Msg
     }.
