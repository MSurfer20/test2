-module(openapi_basic_stream_base).

-include("openapi.hrl").

-export([openapi_basic_stream_base/0]).

-export([openapi_basic_stream_base/1]).

-export_type([openapi_basic_stream_base/0]).

-type openapi_basic_stream_base() ::
  [ {'stream_id', integer() }
  | {'name', binary() }
  | {'description', binary() }
  | {'date_created', integer() }
  | {'invite_only', boolean() }
  | {'rendered_description', binary() }
  | {'is_web_public', boolean() }
  | {'stream_post_policy', integer() }
  | {'message_retention_days', integer() }
  | {'history_public_to_subscribers', boolean() }
  | {'first_message_id', integer() }
  | {'is_announcement_only', boolean() }
  ].


openapi_basic_stream_base() ->
    openapi_basic_stream_base([]).

openapi_basic_stream_base(Fields) ->
  Default = [ {'stream_id', integer() }
            , {'name', binary() }
            , {'description', binary() }
            , {'date_created', integer() }
            , {'invite_only', boolean() }
            , {'rendered_description', binary() }
            , {'is_web_public', boolean() }
            , {'stream_post_policy', integer() }
            , {'message_retention_days', integer() }
            , {'history_public_to_subscribers', boolean() }
            , {'first_message_id', integer() }
            , {'is_announcement_only', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

