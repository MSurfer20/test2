-module(openapi_attachments_messages).

-include("openapi.hrl").

-export([openapi_attachments_messages/0]).

-export([openapi_attachments_messages/1]).

-export_type([openapi_attachments_messages/0]).

-type openapi_attachments_messages() ::
  [ {'date_sent', integer() }
  | {'id', integer() }
  ].


openapi_attachments_messages() ->
    openapi_attachments_messages([]).

openapi_attachments_messages(Fields) ->
  Default = [ {'date_sent', integer() }
            , {'id', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

