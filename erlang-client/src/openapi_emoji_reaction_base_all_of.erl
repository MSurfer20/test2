-module(openapi_emoji_reaction_base_all_of).

-export([encode/1]).

-export_type([openapi_emoji_reaction_base_all_of/0]).

-type openapi_emoji_reaction_base_all_of() ::
    #{ 'user_id' => integer(),
       'user' => openapi_emoji_reaction_base_all_of_user:openapi_emoji_reaction_base_all_of_user()
     }.

encode(#{ 'user_id' := UserId,
          'user' := User
        }) ->
    #{ 'user_id' => UserId,
       'user' => User
     }.
