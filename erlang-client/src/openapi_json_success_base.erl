-module(openapi_json_success_base).

-export([encode/1]).

-export_type([openapi_json_success_base/0]).

-type openapi_json_success_base() ::
    #{ 'result' := binary(),
       'msg' := binary()
     }.

encode(#{ 'result' := Result,
          'msg' := Msg
        }) ->
    #{ 'result' => Result,
       'msg' => Msg
     }.
