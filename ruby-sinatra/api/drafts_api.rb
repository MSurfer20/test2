require 'json'


MyApp.add_route('POST', '/api/v1/drafts', {
  "resourcePath" => "/Drafts",
  "summary" => "Create drafts",
  "nickname" => "create_drafts", 
  "responseClass" => "JsonSuccess",
  "endpoint" => "/drafts", 
  "notes" => "Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` ",
  "parameters" => [
    {
      "name" => "drafts",
      "description" => "A JSON-encoded list of containing new draft objects. ",
      "dataType" => "Array<Draft>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/api/v1/drafts/{draft_id}', {
  "resourcePath" => "/Drafts",
  "summary" => "Delete a draft",
  "nickname" => "delete_draft", 
  "responseClass" => "JsonSuccess",
  "endpoint" => "/drafts/{draft_id}", 
  "notes" => "Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` ",
  "parameters" => [
    {
      "name" => "draft_id",
      "description" => "The ID of the draft you want to delete. ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/api/v1/drafts/{draft_id}', {
  "resourcePath" => "/Drafts",
  "summary" => "Edit a draft",
  "nickname" => "edit_draft", 
  "responseClass" => "JsonSuccess",
  "endpoint" => "/drafts/{draft_id}", 
  "notes" => "Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` ",
  "parameters" => [
    {
      "name" => "draft",
      "description" => "A JSON-encoded object containing a replacement draft object for this ID. ",
      "dataType" => "Draft",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "draft_id",
      "description" => "The ID of the draft to be edited. ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/v1/drafts', {
  "resourcePath" => "/Drafts",
  "summary" => "Get drafts",
  "nickname" => "get_drafts", 
  "responseClass" => "JsonSuccess",
  "endpoint" => "/drafts", 
  "notes" => "Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` ",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

