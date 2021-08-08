-module(openapi_inline_response_200).

-export([encode/1]).

-export_type([openapi_inline_response_200/0]).

-type openapi_inline_response_200() ::
    #{ 'bot_email' => binary(),
       'bot_full_name' => binary(),
       'data' => binary(),
       'trigger' => binary(),
       'token' => binary(),
       'message' => openapi_messages_base:openapi_messages_base()
     }.

encode(#{ 'bot_email' := BotEmail,
          'bot_full_name' := BotFullName,
          'data' := Data,
          'trigger' := Trigger,
          'token' := Token,
          'message' := Message
        }) ->
    #{ 'bot_email' => BotEmail,
       'bot_full_name' => BotFullName,
       'data' => Data,
       'trigger' => Trigger,
       'token' => Token,
       'message' => Message
     }.
