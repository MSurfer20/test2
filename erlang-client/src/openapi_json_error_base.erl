-module(openapi_json_error_base).

-export([encode/1]).

-export_type([openapi_json_error_base/0]).

-type openapi_json_error_base() ::
    #{ 'result' := binary(),
       'msg' := binary()
     }.

encode(#{ 'result' := Result,
          'msg' := Msg
        }) ->
    #{ 'result' => Result,
       'msg' => Msg
     }.
