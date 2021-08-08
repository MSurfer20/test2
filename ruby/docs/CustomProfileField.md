# OpenapiClient::CustomProfileField

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The ID of the custom profile field.  This will be referenced in custom the profile fields section of user objects.  | [optional] |
| **type** | **Integer** | An integer indicating the type of the custom profile field, which determines how it is configured and displayed to users.  See the [Add custom profile fields](/help/add-custom-profile-fields) article for details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account  | [optional] |
| **order** | **Integer** | Custom profile fields are displayed in both settings UI and UI showing users&#39; profiles in increasing &#x60;order&#x60;.  | [optional] |
| **name** | **String** | The name of the custom profile field.  | [optional] |
| **hint** | **String** | The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields.  | [optional] |
| **field_data** | **String** | Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the &#x60;field_data&#x60; attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized.  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::CustomProfileField.new(
  id: null,
  type: null,
  order: null,
  name: null,
  hint: null,
  field_data: null
)
```

