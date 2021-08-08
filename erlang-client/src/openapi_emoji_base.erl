-module(openapi_emoji_base).

-export([encode/1]).

-export_type([openapi_emoji_base/0]).

-type openapi_emoji_base() ::
    #{ 'emoji_code' => binary(),
       'emoji_name' => binary(),
       'reaction_type' => binary()
     }.

encode(#{ 'emoji_code' := EmojiCode,
          'emoji_name' := EmojiName,
          'reaction_type' := ReactionType
        }) ->
    #{ 'emoji_code' => EmojiCode,
       'emoji_name' => EmojiName,
       'reaction_type' => ReactionType
     }.
