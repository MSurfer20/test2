-module(openapi_messages).

-include("openapi.hrl").

-export([openapi_messages/0]).

-export([openapi_messages/1]).

-export_type([openapi_messages/0]).

-type openapi_messages() ::
  [ {'avatar_url', openapi_any_type:openapi_any_type() }
  | {'client', openapi_any_type:openapi_any_type() }
  | {'content', openapi_any_type:openapi_any_type() }
  | {'content_type', openapi_any_type:openapi_any_type() }
  | {'display_recipient', openapi_any_type:openapi_any_type() }
  | {'id', openapi_any_type:openapi_any_type() }
  | {'is_me_message', openapi_any_type:openapi_any_type() }
  | {'reactions', openapi_any_type:openapi_any_type() }
  | {'recipient_id', openapi_any_type:openapi_any_type() }
  | {'sender_email', openapi_any_type:openapi_any_type() }
  | {'sender_full_name', openapi_any_type:openapi_any_type() }
  | {'sender_id', openapi_any_type:openapi_any_type() }
  | {'sender_realm_str', openapi_any_type:openapi_any_type() }
  | {'stream_id', openapi_any_type:openapi_any_type() }
  | {'subject', openapi_any_type:openapi_any_type() }
  | {'topic_links', openapi_any_type:openapi_any_type() }
  | {'submessages', openapi_any_type:openapi_any_type() }
  | {'timestamp', openapi_any_type:openapi_any_type() }
  | {'type', openapi_any_type:openapi_any_type() }
  ].


openapi_messages() ->
    openapi_messages([]).

openapi_messages(Fields) ->
  Default = [ {'avatar_url', openapi_any_type:openapi_any_type() }
            , {'client', openapi_any_type:openapi_any_type() }
            , {'content', openapi_any_type:openapi_any_type() }
            , {'content_type', openapi_any_type:openapi_any_type() }
            , {'display_recipient', openapi_any_type:openapi_any_type() }
            , {'id', openapi_any_type:openapi_any_type() }
            , {'is_me_message', openapi_any_type:openapi_any_type() }
            , {'reactions', openapi_any_type:openapi_any_type() }
            , {'recipient_id', openapi_any_type:openapi_any_type() }
            , {'sender_email', openapi_any_type:openapi_any_type() }
            , {'sender_full_name', openapi_any_type:openapi_any_type() }
            , {'sender_id', openapi_any_type:openapi_any_type() }
            , {'sender_realm_str', openapi_any_type:openapi_any_type() }
            , {'stream_id', openapi_any_type:openapi_any_type() }
            , {'subject', openapi_any_type:openapi_any_type() }
            , {'topic_links', openapi_any_type:openapi_any_type() }
            , {'submessages', openapi_any_type:openapi_any_type() }
            , {'timestamp', openapi_any_type:openapi_any_type() }
            , {'type', openapi_any_type:openapi_any_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

