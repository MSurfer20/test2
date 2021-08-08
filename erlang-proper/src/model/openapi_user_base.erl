-module(openapi_user_base).

-include("openapi.hrl").

-export([openapi_user_base/0]).

-export([openapi_user_base/1]).

-export_type([openapi_user_base/0]).

-type openapi_user_base() ::
  [ {'email', binary() }
  | {'is_bot', boolean() }
  | {'avatar_url', binary() }
  | {'avatar_version', integer() }
  | {'full_name', binary() }
  | {'is_admin', boolean() }
  | {'is_owner', boolean() }
  | {'is_billing_admin', boolean() }
  | {'role', integer() }
  | {'bot_type', integer() }
  | {'user_id', integer() }
  | {'bot_owner_id', integer() }
  | {'is_active', boolean() }
  | {'is_guest', boolean() }
  | {'timezone', binary() }
  | {'date_joined', binary() }
  | {'delivery_email', binary() }
  | {'profile_data', map() }
  ].


openapi_user_base() ->
    openapi_user_base([]).

openapi_user_base(Fields) ->
  Default = [ {'email', binary() }
            , {'is_bot', boolean() }
            , {'avatar_url', binary() }
            , {'avatar_version', integer() }
            , {'full_name', binary() }
            , {'is_admin', boolean() }
            , {'is_owner', boolean() }
            , {'is_billing_admin', boolean() }
            , {'role', integer() }
            , {'bot_type', integer() }
            , {'user_id', integer() }
            , {'bot_owner_id', integer() }
            , {'is_active', boolean() }
            , {'is_guest', boolean() }
            , {'timezone', binary() }
            , {'date_joined', binary() }
            , {'delivery_email', binary() }
            , {'profile_data', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

