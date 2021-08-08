-module(openapi_user_group).

-export([encode/1]).

-export_type([openapi_user_group/0]).

-type openapi_user_group() ::
    #{ 'name' => binary(),
       'description' => binary(),
       'members' => list(),
       'id' => integer()
     }.

encode(#{ 'name' := Name,
          'description' := Description,
          'members' := Members,
          'id' := Id
        }) ->
    #{ 'name' => Name,
       'description' => Description,
       'members' => Members,
       'id' => Id
     }.
