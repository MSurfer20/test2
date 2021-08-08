=begin
#Zulip REST API

#Powerful open source group chat 

The version of the OpenAPI document: 1.0.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.2.0

=end

require 'spec_helper'
require 'json'

# Unit tests for OpenapiClient::DraftsApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'DraftsApi' do
  before do
    # run before each test
    @api_instance = OpenapiClient::DraftsApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of DraftsApi' do
    it 'should create an instance of DraftsApi' do
      expect(@api_instance).to be_instance_of(OpenapiClient::DraftsApi)
    end
  end

  # unit tests for create_drafts
  # Create drafts
  # Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;POST {{ api_url }}/v1/drafts&#x60; 
  # @param [Hash] opts the optional parameters
  # @option opts [Array<Draft>] :drafts A JSON-encoded list of containing new draft objects. 
  # @return [JsonSuccess]
  describe 'create_drafts test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_draft
  # Delete a draft
  # Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a &#x60;drafts&#x60; event.  &#x60;DELETE {{ api_url }}/v1/drafts/{draft_id}&#x60; 
  # @param draft_id The ID of the draft you want to delete. 
  # @param [Hash] opts the optional parameters
  # @return [JsonSuccess]
  describe 'delete_draft test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for edit_draft
  # Edit a draft
  # Edit a draft on the server. The edit will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;PATCH {{ api_url }}/v1/drafts/{draft_id}&#x60; 
  # @param draft_id The ID of the draft to be edited. 
  # @param draft A JSON-encoded object containing a replacement draft object for this ID. 
  # @param [Hash] opts the optional parameters
  # @return [JsonSuccess]
  describe 'edit_draft test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_drafts
  # Get drafts
  # Fetch all drafts for the current user.  &#x60;GET {{ api_url }}/v1/drafts&#x60; 
  # @param [Hash] opts the optional parameters
  # @return [JsonSuccess]
  describe 'get_drafts test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end