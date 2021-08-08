-module(openapi_default_stream_group).

-include("openapi.hrl").

-export([openapi_default_stream_group/0]).

-export([openapi_default_stream_group/1]).

-export_type([openapi_default_stream_group/0]).

-type openapi_default_stream_group() ::
  [ {'name', binary() }
  | {'description', binary() }
  | {'id', integer() }
  | {'streams', list(openapi_basic_stream:openapi_basic_stream()) }
  ].


openapi_default_stream_group() ->
    openapi_default_stream_group([]).

openapi_default_stream_group(Fields) ->
  Default = [ {'name', binary() }
            , {'description', binary() }
            , {'id', integer() }
            , {'streams', list(openapi_basic_stream:openapi_basic_stream()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

