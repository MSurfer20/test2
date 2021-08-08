-module(openapi_hotspot).

-include("openapi.hrl").

-export([openapi_hotspot/0]).

-export([openapi_hotspot/1]).

-export_type([openapi_hotspot/0]).

-type openapi_hotspot() ::
  [ {'delay', integer() }
  | {'name', binary() }
  | {'title', binary() }
  | {'description', binary() }
  ].


openapi_hotspot() ->
    openapi_hotspot([]).

openapi_hotspot(Fields) ->
  Default = [ {'delay', integer() }
            , {'name', binary() }
            , {'title', binary() }
            , {'description', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

