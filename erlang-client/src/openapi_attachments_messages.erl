-module(openapi_attachments_messages).

-export([encode/1]).

-export_type([openapi_attachments_messages/0]).

-type openapi_attachments_messages() ::
    #{ 'date_sent' => integer(),
       'id' => integer()
     }.

encode(#{ 'date_sent' := DateSent,
          'id' := Id
        }) ->
    #{ 'date_sent' => DateSent,
       'id' => Id
     }.
