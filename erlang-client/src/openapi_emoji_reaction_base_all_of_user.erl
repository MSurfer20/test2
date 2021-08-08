-module(openapi_emoji_reaction_base_all_of_user).

-export([encode/1]).

-export_type([openapi_emoji_reaction_base_all_of_user/0]).

-type openapi_emoji_reaction_base_all_of_user() ::
    #{ 'id' => integer(),
       'email' => binary(),
       'full_name' => binary(),
       'is_mirror_dummy' => boolean()
     }.

encode(#{ 'id' := Id,
          'email' := Email,
          'full_name' := FullName,
          'is_mirror_dummy' := IsMirrorDummy
        }) ->
    #{ 'id' => Id,
       'email' => Email,
       'full_name' => FullName,
       'is_mirror_dummy' => IsMirrorDummy
     }.
