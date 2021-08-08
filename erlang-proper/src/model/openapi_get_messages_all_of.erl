-module(openapi_get_messages_all_of).

-include("openapi.hrl").

-export([openapi_get_messages_all_of/0]).

-export([openapi_get_messages_all_of/1]).

-export_type([openapi_get_messages_all_of/0]).

-type openapi_get_messages_all_of() ::
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
  | {'flags', list(binary()) }
  | {'last_edit_timestamp', integer() }
  | {'match_content', binary() }
  | {'match_subject', binary() }
  ].


openapi_get_messages_all_of() ->
    openapi_get_messages_all_of([]).

openapi_get_messages_all_of(Fields) ->
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
            , {'flags', list(binary()) }
            , {'last_edit_timestamp', integer() }
            , {'match_content', binary() }
            , {'match_subject', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

