-module(openapi_realm_emoji).

-export([encode/1]).

-export_type([openapi_realm_emoji/0]).

-type openapi_realm_emoji() ::
    #{ 'id' => binary(),
       'name' => binary(),
       'source_url' => binary(),
       'deactivated' => boolean(),
       'author_id' => integer()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'source_url' := SourceUrl,
          'deactivated' := Deactivated,
          'author_id' := AuthorId
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'source_url' => SourceUrl,
       'deactivated' => Deactivated,
       'author_id' => AuthorId
     }.
