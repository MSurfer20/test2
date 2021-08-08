-module(openapi_messages_base_topic_links).

-export([encode/1]).

-export_type([openapi_messages_base_topic_links/0]).

-type openapi_messages_base_topic_links() ::
    #{ 'text' => binary(),
       'url' => binary()
     }.

encode(#{ 'text' := Text,
          'url' := Url
        }) ->
    #{ 'text' => Text,
       'url' => Url
     }.
