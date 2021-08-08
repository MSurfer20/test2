-module(openapi_missing_argument_error_all_of).

-export([encode/1]).

-export_type([openapi_missing_argument_error_all_of/0]).

-type openapi_missing_argument_error_all_of() ::
    #{ 'result' => openapi_any_type:openapi_any_type(),
       'msg' => openapi_any_type:openapi_any_type(),
       'code' => openapi_any_type:openapi_any_type(),
       'var_name' => binary()
     }.

encode(#{ 'result' := Result,
          'msg' := Msg,
          'code' := Code,
          'var_name' := VarName
        }) ->
    #{ 'result' => Result,
       'msg' => Msg,
       'code' => Code,
       'var_name' => VarName
     }.
