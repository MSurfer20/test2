-module(openapi_basic_stream_all_of).

-include("openapi.hrl").

-export([openapi_basic_stream_all_of/0]).

-export([openapi_basic_stream_all_of/1]).

-export_type([openapi_basic_stream_all_of/0]).

-type openapi_basic_stream_all_of() ::
  [ {'stream_id', openapi_any_type:openapi_any_type() }
  | {'name', openapi_any_type:openapi_any_type() }
  | {'description', openapi_any_type:openapi_any_type() }
  | {'date_created', openapi_any_type:openapi_any_type() }
  | {'invite_only', openapi_any_type:openapi_any_type() }
  | {'rendered_description', openapi_any_type:openapi_any_type() }
  | {'is_web_public', openapi_any_type:openapi_any_type() }
  | {'stream_post_policy', openapi_any_type:openapi_any_type() }
  | {'message_retention_days', openapi_any_type:openapi_any_type() }
  | {'history_public_to_subscribers', openapi_any_type:openapi_any_type() }
  | {'first_message_id', openapi_any_type:openapi_any_type() }
  | {'is_announcement_only', openapi_any_type:openapi_any_type() }
  ].


openapi_basic_stream_all_of() ->
    openapi_basic_stream_all_of([]).

openapi_basic_stream_all_of(Fields) ->
  Default = [ {'stream_id', openapi_any_type:openapi_any_type() }
            , {'name', openapi_any_type:openapi_any_type() }
            , {'description', openapi_any_type:openapi_any_type() }
            , {'date_created', openapi_any_type:openapi_any_type() }
            , {'invite_only', openapi_any_type:openapi_any_type() }
            , {'rendered_description', openapi_any_type:openapi_any_type() }
            , {'is_web_public', openapi_any_type:openapi_any_type() }
            , {'stream_post_policy', openapi_any_type:openapi_any_type() }
            , {'message_retention_days', openapi_any_type:openapi_any_type() }
            , {'history_public_to_subscribers', openapi_any_type:openapi_any_type() }
            , {'first_message_id', openapi_any_type:openapi_any_type() }
            , {'is_announcement_only', openapi_any_type:openapi_any_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

