-module(openapi_custom_profile_field).

-export([encode/1]).

-export_type([openapi_custom_profile_field/0]).

-type openapi_custom_profile_field() ::
    #{ 'id' => integer(),
       'type' => integer(),
       'order' => integer(),
       'name' => binary(),
       'hint' => binary(),
       'field_data' => binary()
     }.

encode(#{ 'id' := Id,
          'type' := Type,
          'order' := Order,
          'name' := Name,
          'hint' := Hint,
          'field_data' := FieldData
        }) ->
    #{ 'id' => Id,
       'type' => Type,
       'order' => Order,
       'name' => Name,
       'hint' => Hint,
       'field_data' => FieldData
     }.
