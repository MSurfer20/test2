require 'json'


MyApp.add_route('POST', '/api/v1/realm/playgrounds', {
  "resourcePath" => "/ServerAndOrganizations",
  "summary" => "Add a code playground",
  "nickname" => "add_code_playground", 
  "responseClass" => "JsonSuccessBase",
  "endpoint" => "/realm/playgrounds", 
  "notes" => "Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  `POST {{ api_url }}/v1/realm/playgrounds`  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). ",
  "parameters" => [
    {
      "name" => "name",
      "description" => "The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "pygments_language",
      "description" => "The name of the Pygments language lexer for that programming language. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "url_prefix",
      "description" => "The url prefix for the playground. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/v1/realm/filters', {
  "resourcePath" => "/ServerAndOrganizations",
  "summary" => "Add a linkifier",
  "nickname" => "add_linkifier", 
  "responseClass" => "JsonSuccessBase",
  "endpoint" => "/realm/filters", 
  "notes" => "Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `POST {{ api_url }}/v1/realm/filters` ",
  "parameters" => [
    {
      "name" => "pattern",
      "description" => "The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "url_format_string",
      "description" => "The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/v1/realm/profile_fields', {
  "resourcePath" => "/ServerAndOrganizations",
  "summary" => "Create a custom profile field",
  "nickname" => "create_custom_profile_field", 
  "responseClass" => "JsonSuccessBase",
  "endpoint" => "/realm/profile_fields", 
  "notes" => "[Create a custom profile field](/help/add-custom-profile-fields) in the user's organization.  `POST {{ api_url }}/v1/realm/profile_fields` ",
  "parameters" => [
    {
      "name" => "name",
      "description" => "The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user&#39;s profile. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "hint",
      "description" => "The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "field_type",
      "description" => "The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account ",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "field_data",
      "description" => "Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the &#x60;field_data&#x60; attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. ",
      "dataType" => "Object",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/v1/realm/emoji', {
  "resourcePath" => "/ServerAndOrganizations",
  "summary" => "Get all custom emoji",
  "nickname" => "get_custom_emoji", 
  "responseClass" => "JsonSuccessBase",
  "endpoint" => "/realm/emoji", 
  "notes" => "Get all the custom emoji in the user's organization.  `GET {{ api_url }}/v1/realm/emoji` ",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/v1/realm/profile_fields', {
  "resourcePath" => "/ServerAndOrganizations",
  "summary" => "Get all custom profile fields",
  "nickname" => "get_custom_profile_fields", 
  "responseClass" => "JsonSuccessBase",
  "endpoint" => "/realm/profile_fields", 
  "notes" => "Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user's organization.  `GET {{ api_url }}/v1/realm/profile_fields` ",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/v1/realm/linkifiers', {
  "resourcePath" => "/ServerAndOrganizations",
  "summary" => "Get linkifiers",
  "nickname" => "get_linkifiers", 
  "responseClass" => "JsonSuccessBase",
  "endpoint" => "/realm/linkifiers", 
  "notes" => "List all of an organization's configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `GET {{ api_url }}/v1/realm/linkifiers`  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar `GET /realm/filters` endpoint was available with each entry in a `[pattern, url_format, id]` tuple format. ",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/v1/server_settings', {
  "resourcePath" => "/ServerAndOrganizations",
  "summary" => "Get server settings",
  "nickname" => "get_server_settings", 
  "responseClass" => "JsonSuccessBase",
  "endpoint" => "/server_settings", 
  "notes" => "Fetch global settings for a Zulip server.  `GET {{ api_url }}/v1/server_settings`  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it's running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). ",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/api/v1/realm/playgrounds/{playground_id}', {
  "resourcePath" => "/ServerAndOrganizations",
  "summary" => "Remove a code playground",
  "nickname" => "remove_code_playground", 
  "responseClass" => "JsonSuccess",
  "endpoint" => "/realm/playgrounds/{playground_id}", 
  "notes" => "Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  `DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}`  **Changes**: New in Zulip 4.0 (feature level 49). ",
  "parameters" => [
    {
      "name" => "playground_id",
      "description" => "The ID of the playground that you want to remove. ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/api/v1/realm/filters/{filter_id}', {
  "resourcePath" => "/ServerAndOrganizations",
  "summary" => "Remove a linkifier",
  "nickname" => "remove_linkifier", 
  "responseClass" => "JsonSuccess",
  "endpoint" => "/realm/filters/{filter_id}", 
  "notes" => "Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `DELETE {{ api_url }}/v1/realm/filters/{filter_id}` ",
  "parameters" => [
    {
      "name" => "filter_id",
      "description" => "The ID of the linkifier that you want to remove. ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/api/v1/realm/profile_fields', {
  "resourcePath" => "/ServerAndOrganizations",
  "summary" => "Reorder custom profile fields",
  "nickname" => "reorder_custom_profile_fields", 
  "responseClass" => "JsonSuccess",
  "endpoint" => "/realm/profile_fields", 
  "notes" => "Reorder the custom profile fields in the user's organization.  `PATCH {{ api_url }}/v1/realm/profile_fields`  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). ",
  "parameters" => [
    {
      "name" => "order",
      "description" => "A list of the IDs of all the custom profile fields defined in this organization, in the desired new order. ",
      "dataType" => "Array<Integer>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/api/v1/realm/filters/{filter_id}', {
  "resourcePath" => "/ServerAndOrganizations",
  "summary" => "Update a linkifier",
  "nickname" => "update_linkifier", 
  "responseClass" => "JsonSuccess",
  "endpoint" => "/realm/filters/{filter_id}", 
  "notes" => "Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `PATCH {{ api_url }}/v1/realm/filters/{filter_id}`  **Changes**: New in Zulip 4.0 (feature level 57). ",
  "parameters" => [
    {
      "name" => "pattern",
      "description" => "The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "url_format_string",
      "description" => "The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "filter_id",
      "description" => "The ID of the linkifier that you want to update. ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/v1/realm/emoji/{emoji_name}', {
  "resourcePath" => "/ServerAndOrganizations",
  "summary" => "Upload custom emoji",
  "nickname" => "upload_custom_emoji", 
  "responseClass" => "JsonSuccess",
  "endpoint" => "/realm/emoji/{emoji_name}", 
  "notes" => "This endpoint is used to upload a custom emoji for use in the user's organization.  Access to this endpoint depends on the [organization's configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  `POST {{ api_url }}/v1/realm/emoji/{emoji_name}` ",
  "parameters" => [
    {
      "name" => "emoji_name",
      "description" => "The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji). ",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

