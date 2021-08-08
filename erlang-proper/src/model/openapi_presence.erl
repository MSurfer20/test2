-module(openapi_presence).

-include("openapi.hrl").

-export([openapi_presence/0]).

-export([openapi_presence/1]).

-export_type([openapi_presence/0]).

-type openapi_presence() ::
  [ {'client', binary() }
  | {'status', binary() }
  | {'timestamp', integer() }
  | {'pushable', boolean() }
  ].


openapi_presence() ->
    openapi_presence([]).

openapi_presence(Fields) ->
  Default = [ {'client', binary() }
            , {'status', elements([<<"idle">>, <<"active">>]) }
            , {'timestamp', integer() }
            , {'pushable', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

