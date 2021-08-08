-module(openapi_add_subscriptions_response_all_of).

-export([encode/1]).

-export_type([openapi_add_subscriptions_response_all_of/0]).

-type openapi_add_subscriptions_response_all_of() ::
    #{ 'result' => openapi_any_type:openapi_any_type(),
       'msg' => openapi_any_type:openapi_any_type(),
       'subscribed' => maps:map(),
       'already_subscribed' => maps:map(),
       'unauthorized' => list()
     }.

encode(#{ 'result' := Result,
          'msg' := Msg,
          'subscribed' := Subscribed,
          'already_subscribed' := AlreadySubscribed,
          'unauthorized' := Unauthorized
        }) ->
    #{ 'result' => Result,
       'msg' => Msg,
       'subscribed' => Subscribed,
       'already_subscribed' => AlreadySubscribed,
       'unauthorized' => Unauthorized
     }.
