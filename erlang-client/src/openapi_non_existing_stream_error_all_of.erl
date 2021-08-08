-module(openapi_non_existing_stream_error_all_of).

-export([encode/1]).

-export_type([openapi_non_existing_stream_error_all_of/0]).

-type openapi_non_existing_stream_error_all_of() ::
    #{ 'result' => openapi_any_type:openapi_any_type(),
       'msg' => openapi_any_type:openapi_any_type(),
       'code' => openapi_any_type:openapi_any_type(),
       'stream' => binary()
     }.

encode(#{ 'result' := Result,
          'msg' := Msg,
          'code' := Code,
          'stream' := Stream
        }) ->
    #{ 'result' => Result,
       'msg' => Msg,
       'code' => Code,
       'stream' => Stream
     }.
