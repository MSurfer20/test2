=begin
Zulip REST API

Powerful open source group chat 

The version of the OpenAPI document: 1.0.0
Generated by: https://github.com/openapitools/openapi-generator.git

=end


class Draft < ApplicationRecord
  validates_presence_of :type
  validates_presence_of :to
  validates_presence_of :topic
  validates_presence_of :content

  serialize :to, Array
end