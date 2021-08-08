-module(openapi_emoji_reaction_base_all_of).

-include("openapi.hrl").

-export([openapi_emoji_reaction_base_all_of/0]).

-export([openapi_emoji_reaction_base_all_of/1]).

-export_type([openapi_emoji_reaction_base_all_of/0]).

-type openapi_emoji_reaction_base_all_of() ::
  [ {'user_id', integer() }
  | {'user', openapi_emoji_reaction_base_all_of_user:openapi_emoji_reaction_base_all_of_user() }
  ].


openapi_emoji_reaction_base_all_of() ->
    openapi_emoji_reaction_base_all_of([]).

openapi_emoji_reaction_base_all_of(Fields) ->
  Default = [ {'user_id', integer() }
            , {'user', openapi_emoji_reaction_base_all_of_user:openapi_emoji_reaction_base_all_of_user() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

