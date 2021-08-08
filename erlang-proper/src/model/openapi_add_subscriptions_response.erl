-module(openapi_add_subscriptions_response).

-include("openapi.hrl").

-export([openapi_add_subscriptions_response/0]).

-export([openapi_add_subscriptions_response/1]).

-export_type([openapi_add_subscriptions_response/0]).

-type openapi_add_subscriptions_response() ::
  [ {'result', openapi_any_type:openapi_any_type() }
  | {'msg', openapi_any_type:openapi_any_type() }
  | {'subscribed', map() }
  | {'already_subscribed', map() }
  | {'unauthorized', list(binary()) }
  ].


openapi_add_subscriptions_response() ->
    openapi_add_subscriptions_response([]).

openapi_add_subscriptions_response(Fields) ->
  Default = [ {'result', openapi_any_type:openapi_any_type() }
            , {'msg', openapi_any_type:openapi_any_type() }
            , {'subscribed', map() }
            , {'already_subscribed', map() }
            , {'unauthorized', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

