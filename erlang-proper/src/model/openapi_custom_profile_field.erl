-module(openapi_custom_profile_field).

-include("openapi.hrl").

-export([openapi_custom_profile_field/0]).

-export([openapi_custom_profile_field/1]).

-export_type([openapi_custom_profile_field/0]).

-type openapi_custom_profile_field() ::
  [ {'id', integer() }
  | {'type', integer() }
  | {'order', integer() }
  | {'name', binary() }
  | {'hint', binary() }
  | {'field_data', binary() }
  ].


openapi_custom_profile_field() ->
    openapi_custom_profile_field([]).

openapi_custom_profile_field(Fields) ->
  Default = [ {'id', integer() }
            , {'type', integer() }
            , {'order', integer() }
            , {'name', binary() }
            , {'hint', binary() }
            , {'field_data', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

