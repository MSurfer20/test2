-module(openapi_default_stream_group).

-export([encode/1]).

-export_type([openapi_default_stream_group/0]).

-type openapi_default_stream_group() ::
    #{ 'name' => binary(),
       'description' => binary(),
       'id' => integer(),
       'streams' => list()
     }.

encode(#{ 'name' := Name,
          'description' := Description,
          'id' := Id,
          'streams' := Streams
        }) ->
    #{ 'name' => Name,
       'description' => Description,
       'id' => Id,
       'streams' => Streams
     }.
