-module(openapi_messages_base).

-include("openapi.hrl").

-export([openapi_messages_base/0]).

-export([openapi_messages_base/1]).

-export_type([openapi_messages_base/0]).

-type openapi_messages_base() ::
  [ {'avatar_url', binary() }
  | {'client', binary() }
  | {'content', binary() }
  | {'content_type', binary() }
  | {'display_recipient', openapi_one_of&lt;string,array&gt;:openapi_one_of&lt;string,array&gt;() }
  | {'id', integer() }
  | {'is_me_message', boolean() }
  | {'reactions', list(openapi_emoji_reaction:openapi_emoji_reaction()) }
  | {'recipient_id', integer() }
  | {'sender_email', binary() }
  | {'sender_full_name', binary() }
  | {'sender_id', integer() }
  | {'sender_realm_str', binary() }
  | {'stream_id', integer() }
  | {'subject', binary() }
  | {'topic_links', list(openapi_messages_base_topic_links:openapi_messages_base_topic_links()) }
  | {'submessages', list(binary()) }
  | {'timestamp', integer() }
  | {'type', binary() }
  ].


openapi_messages_base() ->
    openapi_messages_base([]).

openapi_messages_base(Fields) ->
  Default = [ {'avatar_url', binary() }
            , {'client', binary() }
            , {'content', binary() }
            , {'content_type', binary() }
            , {'display_recipient', openapi_one_of&lt;string,array&gt;:openapi_one_of&lt;string,array&gt;() }
            , {'id', integer() }
            , {'is_me_message', boolean() }
            , {'reactions', list(openapi_emoji_reaction:openapi_emoji_reaction()) }
            , {'recipient_id', integer() }
            , {'sender_email', binary() }
            , {'sender_full_name', binary() }
            , {'sender_id', integer() }
            , {'sender_realm_str', binary() }
            , {'stream_id', integer() }
            , {'subject', binary() }
            , {'topic_links', list(openapi_messages_base_topic_links:openapi_messages_base_topic_links()) }
            , {'submessages', list(binary()) }
            , {'timestamp', integer() }
            , {'type', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

