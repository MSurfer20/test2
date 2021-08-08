-module(openapi_emoji_reaction_base).

-include("openapi.hrl").

-export([openapi_emoji_reaction_base/0]).

-export([openapi_emoji_reaction_base/1]).

-export_type([openapi_emoji_reaction_base/0]).

-type openapi_emoji_reaction_base() ::
  [ {'emoji_code', binary() }
  | {'emoji_name', binary() }
  | {'reaction_type', binary() }
  | {'user_id', integer() }
  | {'user', openapi_emoji_reaction_base_user:openapi_emoji_reaction_base_user() }
  ].


openapi_emoji_reaction_base() ->
    openapi_emoji_reaction_base([]).

openapi_emoji_reaction_base(Fields) ->
  Default = [ {'emoji_code', binary() }
            , {'emoji_name', binary() }
            , {'reaction_type', binary() }
            , {'user_id', integer() }
            , {'user', openapi_emoji_reaction_base_user:openapi_emoji_reaction_base_user() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

