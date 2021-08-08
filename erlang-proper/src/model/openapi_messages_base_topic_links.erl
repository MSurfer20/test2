-module(openapi_messages_base_topic_links).

-include("openapi.hrl").

-export([openapi_messages_base_topic_links/0]).

-export([openapi_messages_base_topic_links/1]).

-export_type([openapi_messages_base_topic_links/0]).

-type openapi_messages_base_topic_links() ::
  [ {'text', binary() }
  | {'url', binary() }
  ].


openapi_messages_base_topic_links() ->
    openapi_messages_base_topic_links([]).

openapi_messages_base_topic_links(Fields) ->
  Default = [ {'text', binary() }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

