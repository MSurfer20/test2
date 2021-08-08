-module(openapi_hotspot).

-export([encode/1]).

-export_type([openapi_hotspot/0]).

-type openapi_hotspot() ::
    #{ 'delay' => integer(),
       'name' => binary(),
       'title' => binary(),
       'description' => binary()
     }.

encode(#{ 'delay' := Delay,
          'name' := Name,
          'title' := Title,
          'description' := Description
        }) ->
    #{ 'delay' => Delay,
       'name' => Name,
       'title' => Title,
       'description' => Description
     }.
