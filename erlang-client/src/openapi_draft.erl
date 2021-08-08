-module(openapi_draft).

-export([encode/1]).

-export_type([openapi_draft/0]).

-type openapi_draft() ::
    #{ 'id' => integer(),
       'type' := binary(),
       'to' := list(),
       'topic' := binary(),
       'content' := binary(),
       'timestamp' => integer()
     }.

encode(#{ 'id' := Id,
          'type' := Type,
          'to' := To,
          'topic' := Topic,
          'content' := Content,
          'timestamp' := Timestamp
        }) ->
    #{ 'id' => Id,
       'type' => Type,
       'to' => To,
       'topic' => Topic,
       'content' => Content,
       'timestamp' => Timestamp
     }.
