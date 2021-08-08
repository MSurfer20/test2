-module(openapi_realm_playground).

-include("openapi.hrl").

-export([openapi_realm_playground/0]).

-export([openapi_realm_playground/1]).

-export_type([openapi_realm_playground/0]).

-type openapi_realm_playground() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'pygments_language', binary() }
  | {'url_prefix', binary() }
  ].


openapi_realm_playground() ->
    openapi_realm_playground([]).

openapi_realm_playground(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'pygments_language', binary() }
            , {'url_prefix', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

