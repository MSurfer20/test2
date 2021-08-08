-module(openapi_emoji_reaction_all_of).

-export([encode/1]).

-export_type([openapi_emoji_reaction_all_of/0]).

-type openapi_emoji_reaction_all_of() ::
    #{ 'emoji_code' => openapi_any_type:openapi_any_type(),
       'emoji_name' => openapi_any_type:openapi_any_type(),
       'reaction_type' => openapi_any_type:openapi_any_type(),
       'user_id' => openapi_any_type:openapi_any_type(),
       'user' => openapi_any_type:openapi_any_type()
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
