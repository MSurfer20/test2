-module(openapi_user_all_of).

-include("openapi.hrl").

-export([openapi_user_all_of/0]).

-export([openapi_user_all_of/1]).

-export_type([openapi_user_all_of/0]).

-type openapi_user_all_of() ::
  [ {'email', openapi_any_type:openapi_any_type() }
  | {'is_bot', openapi_any_type:openapi_any_type() }
  | {'avatar_url', openapi_any_type:openapi_any_type() }
  | {'avatar_version', openapi_any_type:openapi_any_type() }
  | {'full_name', openapi_any_type:openapi_any_type() }
  | {'is_admin', openapi_any_type:openapi_any_type() }
  | {'is_owner', openapi_any_type:openapi_any_type() }
  | {'is_billing_admin', openapi_any_type:openapi_any_type() }
  | {'role', openapi_any_type:openapi_any_type() }
  | {'bot_type', openapi_any_type:openapi_any_type() }
  | {'user_id', openapi_any_type:openapi_any_type() }
  | {'bot_owner_id', openapi_any_type:openapi_any_type() }
  | {'is_active', openapi_any_type:openapi_any_type() }
  | {'is_guest', openapi_any_type:openapi_any_type() }
  | {'timezone', openapi_any_type:openapi_any_type() }
  | {'date_joined', openapi_any_type:openapi_any_type() }
  | {'delivery_email', openapi_any_type:openapi_any_type() }
  | {'profile_data', openapi_any_type:openapi_any_type() }
  ].


openapi_user_all_of() ->
    openapi_user_all_of([]).

openapi_user_all_of(Fields) ->
  Default = [ {'email', openapi_any_type:openapi_any_type() }
            , {'is_bot', openapi_any_type:openapi_any_type() }
            , {'avatar_url', openapi_any_type:openapi_any_type() }
            , {'avatar_version', openapi_any_type:openapi_any_type() }
            , {'full_name', openapi_any_type:openapi_any_type() }
            , {'is_admin', openapi_any_type:openapi_any_type() }
            , {'is_owner', openapi_any_type:openapi_any_type() }
            , {'is_billing_admin', openapi_any_type:openapi_any_type() }
            , {'role', openapi_any_type:openapi_any_type() }
            , {'bot_type', openapi_any_type:openapi_any_type() }
            , {'user_id', openapi_any_type:openapi_any_type() }
            , {'bot_owner_id', openapi_any_type:openapi_any_type() }
            , {'is_active', openapi_any_type:openapi_any_type() }
            , {'is_guest', openapi_any_type:openapi_any_type() }
            , {'timezone', openapi_any_type:openapi_any_type() }
            , {'date_joined', openapi_any_type:openapi_any_type() }
            , {'delivery_email', openapi_any_type:openapi_any_type() }
            , {'profile_data', openapi_any_type:openapi_any_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

