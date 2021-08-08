-module(openapi_coded_error_base).

-export([encode/1]).

-export_type([openapi_coded_error_base/0]).

-type openapi_coded_error_base() ::
    #{ 'result' := openapi_any_type:openapi_any_type(),
       'msg' := openapi_any_type:openapi_any_type(),
       'code' => binary()
     }.

encode(#{ 'result' := Result,
          'msg' := Msg,
          'code' := Code
        }) ->
    #{ 'result' => Result,
       'msg' => Msg,
       'code' => Code
     }.
