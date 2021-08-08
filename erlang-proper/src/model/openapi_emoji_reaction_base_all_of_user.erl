-module(openapi_emoji_reaction_base_all_of_user).

-include("openapi.hrl").

-export([openapi_emoji_reaction_base_all_of_user/0]).

-export([openapi_emoji_reaction_base_all_of_user/1]).

-export_type([openapi_emoji_reaction_base_all_of_user/0]).

-type openapi_emoji_reaction_base_all_of_user() ::
  [ {'id', integer() }
  | {'email', binary() }
  | {'full_name', binary() }
  | {'is_mirror_dummy', boolean() }
  ].


openapi_emoji_reaction_base_all_of_user() ->
    openapi_emoji_reaction_base_all_of_user([]).

openapi_emoji_reaction_base_all_of_user(Fields) ->
  Default = [ {'id', integer() }
            , {'email', binary() }
            , {'full_name', binary() }
            , {'is_mirror_dummy', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

