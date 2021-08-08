-module(openapi_invalid_message_error_all_of).

-export([encode/1]).

-export_type([openapi_invalid_message_error_all_of/0]).

-type openapi_invalid_message_error_all_of() ::
    #{ 'result' => openapi_any_type:openapi_any_type(),
       'msg' => openapi_any_type:openapi_any_type(),
       'raw_content' => binary()
     }.

encode(#{ 'result' := Result,
          'msg' := Msg,
          'raw_content' := RawContent
        }) ->
    #{ 'result' => Result,
       'msg' => Msg,
       'raw_content' => RawContent
     }.
