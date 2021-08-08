-module(openapi_realm_domain).

-include("openapi.hrl").

-export([openapi_realm_domain/0]).

-export([openapi_realm_domain/1]).

-export_type([openapi_realm_domain/0]).

-type openapi_realm_domain() ::
  [ {'domain', binary() }
  | {'allow_subdomains', boolean() }
  ].


openapi_realm_domain() ->
    openapi_realm_domain([]).

openapi_realm_domain(Fields) ->
  Default = [ {'domain', binary() }
            , {'allow_subdomains', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

