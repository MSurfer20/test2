-module(openapi_bad_event_queue_id_error).

-include("openapi.hrl").

-export([openapi_bad_event_queue_id_error/0]).

-export([openapi_bad_event_queue_id_error/1]).

-export_type([openapi_bad_event_queue_id_error/0]).

-type openapi_bad_event_queue_id_error() ::
  [ {'result', openapi_any_type:openapi_any_type() }
  | {'msg', openapi_any_type:openapi_any_type() }
  | {'code', openapi_any_type:openapi_any_type() }
  | {'queue_id', binary() }
  ].


openapi_bad_event_queue_id_error() ->
    openapi_bad_event_queue_id_error([]).

openapi_bad_event_queue_id_error(Fields) ->
  Default = [ {'result', openapi_any_type:openapi_any_type() }
            , {'msg', openapi_any_type:openapi_any_type() }
            , {'code', openapi_any_type:openapi_any_type() }
            , {'queue_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

