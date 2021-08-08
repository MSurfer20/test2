-module(openapi_subscriptions).

-include("openapi.hrl").

-export([openapi_subscriptions/0]).

-export([openapi_subscriptions/1]).

-export_type([openapi_subscriptions/0]).

-type openapi_subscriptions() ::
  [ {'stream_id', integer() }
  | {'name', binary() }
  | {'description', binary() }
  | {'rendered_description', binary() }
  | {'date_created', integer() }
  | {'invite_only', boolean() }
  | {'subscribers', list(integer()) }
  | {'desktop_notifications', boolean() }
  | {'email_notifications', boolean() }
  | {'wildcard_mentions_notify', boolean() }
  | {'push_notifications', boolean() }
  | {'audible_notifications', boolean() }
  | {'pin_to_top', boolean() }
  | {'email_address', binary() }
  | {'is_muted', boolean() }
  | {'in_home_view', boolean() }
  | {'is_announcement_only', boolean() }
  | {'is_web_public', boolean() }
  | {'role', integer() }
  | {'color', binary() }
  | {'stream_post_policy', integer() }
  | {'message_retention_days', integer() }
  | {'history_public_to_subscribers', boolean() }
  | {'first_message_id', integer() }
  | {'stream_weekly_traffic', integer() }
  ].


openapi_subscriptions() ->
    openapi_subscriptions([]).

openapi_subscriptions(Fields) ->
  Default = [ {'stream_id', integer() }
            , {'name', binary() }
            , {'description', binary() }
            , {'rendered_description', binary() }
            , {'date_created', integer() }
            , {'invite_only', boolean() }
            , {'subscribers', list(integer()) }
            , {'desktop_notifications', boolean() }
            , {'email_notifications', boolean() }
            , {'wildcard_mentions_notify', boolean() }
            , {'push_notifications', boolean() }
            , {'audible_notifications', boolean() }
            , {'pin_to_top', boolean() }
            , {'email_address', binary() }
            , {'is_muted', boolean() }
            , {'in_home_view', boolean() }
            , {'is_announcement_only', boolean() }
            , {'is_web_public', boolean() }
            , {'role', integer() }
            , {'color', binary() }
            , {'stream_post_policy', integer() }
            , {'message_retention_days', integer() }
            , {'history_public_to_subscribers', boolean() }
            , {'first_message_id', integer() }
            , {'stream_weekly_traffic', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

