=begin
Zulip REST API

Powerful open source group chat 

The version of the OpenAPI document: 1.0.0
Generated by: https://github.com/openapitools/openapi-generator.git

=end
class WebhooksController < ApplicationController

  def zulip_outgoing_webhooks
    # Your code here

    render json: {"message" => "yes, it worked"}
  end
end
