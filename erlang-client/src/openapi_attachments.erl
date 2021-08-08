-module(openapi_attachments).

-export([encode/1]).

-export_type([openapi_attachments/0]).

-type openapi_attachments() ::
    #{ 'id' => integer(),
       'name' => binary(),
       'path_id' => binary(),
       'size' => integer(),
       'create_time' => integer(),
       'messages' => list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'path_id' := PathId,
          'size' := Size,
          'create_time' := CreateTime,
          'messages' := Messages
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'path_id' => PathId,
       'size' => Size,
       'create_time' => CreateTime,
       'messages' => Messages
     }.
