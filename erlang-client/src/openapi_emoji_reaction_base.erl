-module(openapi_emoji_reaction_base).

-export([encode/1]).

-export_type([openapi_emoji_reaction_base/0]).

-type openapi_emoji_reaction_base() ::
    #{ 'emoji_code' => binary(),
       'emoji_name' => binary(),
       'reaction_type' => binary(),
       'user_id' => integer(),
       'user' => openapi_emoji_reaction_base_all_of_user:openapi_emoji_reaction_base_all_of_user()
     }.

encode(#{ 'emoji_code' := EmojiCode,
          'emoji_name' := EmojiName,
          'reaction_type' := ReactionType,
          'user_id' := UserId,
          'user' := User
        }) ->
    #{ 'emoji_code' => EmojiCode,
       'emoji_name' => EmojiName,
       'reaction_type' => ReactionType,
       'user_id' => UserId,
       'user' => User
     }.
