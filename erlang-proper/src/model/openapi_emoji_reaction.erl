-module(openapi_emoji_reaction).

-include("openapi.hrl").

-export([openapi_emoji_reaction/0]).

-export([openapi_emoji_reaction/1]).

-export_type([openapi_emoji_reaction/0]).

-type openapi_emoji_reaction() ::
  [ {'emoji_code', openapi_any_type:openapi_any_type() }
  | {'emoji_name', openapi_any_type:openapi_any_type() }
  | {'reaction_type', openapi_any_type:openapi_any_type() }
  | {'user_id', openapi_any_type:openapi_any_type() }
  | {'user', openapi_any_type:openapi_any_type() }
  ].


openapi_emoji_reaction() ->
    openapi_emoji_reaction([]).

openapi_emoji_reaction(Fields) ->
  Default = [ {'emoji_code', openapi_any_type:openapi_any_type() }
            , {'emoji_name', openapi_any_type:openapi_any_type() }
            , {'reaction_type', openapi_any_type:openapi_any_type() }
            , {'user_id', openapi_any_type:openapi_any_type() }
            , {'user', openapi_any_type:openapi_any_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

