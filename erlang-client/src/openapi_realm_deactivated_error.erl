-module(openapi_realm_deactivated_error).

-export([encode/1]).

-export_type([openapi_realm_deactivated_error/0]).

-type openapi_realm_deactivated_error() ::
    #{ 'result' := openapi_any_type:openapi_any_type(),
       'msg' := openapi_any_type:openapi_any_type(),
       'code' => openapi_any_type:openapi_any_type()
     }.

encode(#{ 'result' := Result,
          'msg' := Msg,
          'code' := Code
        }) ->
    #{ 'result' => Result,
       'msg' => Msg,
       'code' => Code
     }.
