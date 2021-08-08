-module(openapi_draft).

-include("openapi.hrl").

-export([openapi_draft/0]).

-export([openapi_draft/1]).

-export_type([openapi_draft/0]).

-type openapi_draft() ::
  [ {'id', integer() }
  | {'type', binary() }
  | {'to', list(integer()) }
  | {'topic', binary() }
  | {'content', binary() }
  | {'timestamp', integer() }
  ].


openapi_draft() ->
    openapi_draft([]).

openapi_draft(Fields) ->
  Default = [ {'id', integer() }
            , {'type', elements([<<"">>, <<"stream">>, <<"private">>]) }
            , {'to', list(integer()) }
            , {'topic', binary() }
            , {'content', binary() }
            , {'timestamp', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

