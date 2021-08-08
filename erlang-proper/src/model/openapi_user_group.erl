-module(openapi_user_group).

-include("openapi.hrl").

-export([openapi_user_group/0]).

-export([openapi_user_group/1]).

-export_type([openapi_user_group/0]).

-type openapi_user_group() ::
  [ {'name', binary() }
  | {'description', binary() }
  | {'members', list(integer()) }
  | {'id', integer() }
  ].


openapi_user_group() ->
    openapi_user_group([]).

openapi_user_group(Fields) ->
  Default = [ {'name', binary() }
            , {'description', binary() }
            , {'members', list(integer()) }
            , {'id', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

