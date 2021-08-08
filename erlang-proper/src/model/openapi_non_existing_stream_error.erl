-module(openapi_non_existing_stream_error).

-include("openapi.hrl").

-export([openapi_non_existing_stream_error/0]).

-export([openapi_non_existing_stream_error/1]).

-export_type([openapi_non_existing_stream_error/0]).

-type openapi_non_existing_stream_error() ::
  [ {'result', openapi_any_type:openapi_any_type() }
  | {'msg', openapi_any_type:openapi_any_type() }
  | {'code', openapi_any_type:openapi_any_type() }
  | {'stream', binary() }
  ].


openapi_non_existing_stream_error() ->
    openapi_non_existing_stream_error([]).

openapi_non_existing_stream_error(Fields) ->
  Default = [ {'result', openapi_any_type:openapi_any_type() }
            , {'msg', openapi_any_type:openapi_any_type() }
            , {'code', openapi_any_type:openapi_any_type() }
            , {'stream', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

