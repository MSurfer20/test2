-module(openapi_realm_export).

-export([encode/1]).

-export_type([openapi_realm_export/0]).

-type openapi_realm_export() ::
    #{ 'id' => integer(),
       'acting_user_id' => integer(),
       'export_time' => integer(),
       'deleted_timestamp' => integer(),
       'failed_timestamp' => integer(),
       'export_url' => binary(),
       'pending' => boolean()
     }.

encode(#{ 'id' := Id,
          'acting_user_id' := ActingUserId,
          'export_time' := ExportTime,
          'deleted_timestamp' := DeletedTimestamp,
          'failed_timestamp' := FailedTimestamp,
          'export_url' := ExportUrl,
          'pending' := Pending
        }) ->
    #{ 'id' => Id,
       'acting_user_id' => ActingUserId,
       'export_time' => ExportTime,
       'deleted_timestamp' => DeletedTimestamp,
       'failed_timestamp' => FailedTimestamp,
       'export_url' => ExportUrl,
       'pending' => Pending
     }.
