-module(openapi_realm_emoji).

-include("openapi.hrl").

-export([openapi_realm_emoji/0]).

-export([openapi_realm_emoji/1]).

-export_type([openapi_realm_emoji/0]).

-type openapi_realm_emoji() ::
  [ {'id', binary() }
  | {'name', binary() }
  | {'source_url', binary() }
  | {'deactivated', boolean() }
  | {'author_id', integer() }
  ].


openapi_realm_emoji() ->
    openapi_realm_emoji([]).

openapi_realm_emoji(Fields) ->
  Default = [ {'id', binary() }
            , {'name', binary() }
            , {'source_url', binary() }
            , {'deactivated', boolean() }
            , {'author_id', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

