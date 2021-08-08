require 'json'


MyApp.add_route('POST', '/api/v1/zulip-outgoing-webhook', {
  "resourcePath" => "/Webhooks",
  "summary" => "Outgoing webhooks",
  "nickname" => "zulip_outgoing_webhooks", 
  "responseClass" => "inline_response_200",
  "endpoint" => "/zulip-outgoing-webhook", 
  "notes" => "Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. ",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

