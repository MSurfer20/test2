=begin
Zulip REST API

Powerful open source group chat 

The version of the OpenAPI document: 1.0.0
Generated by: https://github.com/openapitools/openapi-generator.git

=end


class NonExistingStreamError < ApplicationRecord
  validates_presence_of :result
  validates_presence_of :msg

end
