-module(openapi_bad_event_queue_id_error).

-export([encode/1]).

-export_type([openapi_bad_event_queue_id_error/0]).

-type openapi_bad_event_queue_id_error() ::
    #{ 'result' := openapi_any_type:openapi_any_type(),
       'msg' := openapi_any_type:openapi_any_type(),
       'code' => openapi_any_type:openapi_any_type(),
       'queue_id' => binary()
     }.

encode(#{ 'result' := Result,
          'msg' := Msg,
          'code' := Code,
          'queue_id' := QueueId
        }) ->
    #{ 'result' => Result,
       'msg' => Msg,
       'code' => Code,
       'queue_id' => QueueId
     }.
