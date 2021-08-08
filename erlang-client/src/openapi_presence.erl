-module(openapi_presence).

-export([encode/1]).

-export_type([openapi_presence/0]).

-type openapi_presence() ::
    #{ 'client' => binary(),
       'status' => binary(),
       'timestamp' => integer(),
       'pushable' => boolean()
     }.

encode(#{ 'client' := Client,
          'status' := Status,
          'timestamp' := Timestamp,
          'pushable' := Pushable
        }) ->
    #{ 'client' => Client,
       'status' => Status,
       'timestamp' => Timestamp,
       'pushable' => Pushable
     }.
