-module(openapi_emoji_base).

-include("openapi.hrl").

-export([openapi_emoji_base/0]).

-export([openapi_emoji_base/1]).

-export_type([openapi_emoji_base/0]).

-type openapi_emoji_base() ::
  [ {'emoji_code', binary() }
  | {'emoji_name', binary() }
  | {'reaction_type', binary() }
  ].


openapi_emoji_base() ->
    openapi_emoji_base([]).

openapi_emoji_base(Fields) ->
  Default = [ {'emoji_code', binary() }
            , {'emoji_name', binary() }
            , {'reaction_type', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

