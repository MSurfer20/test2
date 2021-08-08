-module(openapi_realm_playground).

-export([encode/1]).

-export_type([openapi_realm_playground/0]).

-type openapi_realm_playground() ::
    #{ 'id' => integer(),
       'name' => binary(),
       'pygments_language' => binary(),
       'url_prefix' => binary()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'pygments_language' := PygmentsLanguage,
          'url_prefix' := UrlPrefix
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'pygments_language' => PygmentsLanguage,
       'url_prefix' => UrlPrefix
     }.
