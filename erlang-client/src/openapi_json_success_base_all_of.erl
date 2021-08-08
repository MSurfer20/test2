-module(openapi_json_success_base_all_of).

-export([encode/1]).

-export_type([openapi_json_success_base_all_of/0]).

-type openapi_json_success_base_all_of() ::
    #{ 'result' := binary(),
       'msg' := binary()
     }.

encode(#{ 'result' := Result,
          'msg' := Msg
        }) ->
    #{ 'result' => Result,
       'msg' => Msg
     }.
