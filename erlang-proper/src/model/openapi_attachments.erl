-module(openapi_attachments).

-include("openapi.hrl").

-export([openapi_attachments/0]).

-export([openapi_attachments/1]).

-export_type([openapi_attachments/0]).

-type openapi_attachments() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'path_id', binary() }
  | {'size', integer() }
  | {'create_time', integer() }
  | {'messages', list(openapi_attachments_messages:openapi_attachments_messages()) }
  ].


openapi_attachments() ->
    openapi_attachments([]).

openapi_attachments(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'path_id', binary() }
            , {'size', integer() }
            , {'create_time', integer() }
            , {'messages', list(openapi_attachments_messages:openapi_attachments_messages()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

