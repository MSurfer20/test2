-module(openapi_realm_export).

-include("openapi.hrl").

-export([openapi_realm_export/0]).

-export([openapi_realm_export/1]).

-export_type([openapi_realm_export/0]).

-type openapi_realm_export() ::
  [ {'id', integer() }
  | {'acting_user_id', integer() }
  | {'export_time', integer() }
  | {'deleted_timestamp', integer() }
  | {'failed_timestamp', integer() }
  | {'export_url', binary() }
  | {'pending', boolean() }
  ].


openapi_realm_export() ->
    openapi_realm_export([]).

openapi_realm_export(Fields) ->
  Default = [ {'id', integer() }
            , {'acting_user_id', integer() }
            , {'export_time', integer() }
            , {'deleted_timestamp', integer() }
            , {'failed_timestamp', integer() }
            , {'export_url', binary() }
            , {'pending', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

