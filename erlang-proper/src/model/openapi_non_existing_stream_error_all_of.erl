-module(openapi_non_existing_stream_error_all_of).

-include("openapi.hrl").

-export([openapi_non_existing_stream_error_all_of/0]).

-export([openapi_non_existing_stream_error_all_of/1]).

-export_type([openapi_non_existing_stream_error_all_of/0]).

-type openapi_non_existing_stream_error_all_of() ::
  [ {'result', openapi_any_type:openapi_any_type() }
  | {'msg', openapi_any_type:openapi_any_type() }
  | {'code', openapi_any_type:openapi_any_type() }
  | {'stream', binary() }
  ].


openapi_non_existing_stream_error_all_of() ->
    openapi_non_existing_stream_error_all_of([]).

openapi_non_existing_stream_error_all_of(Fields) ->
  Default = [ {'result', openapi_any_type:openapi_any_type() }
            , {'msg', openapi_any_type:openapi_any_type() }
            , {'code', openapi_any_type:openapi_any_type() }
            , {'stream', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

