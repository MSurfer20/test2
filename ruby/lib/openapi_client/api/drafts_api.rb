=begin
#Zulip REST API

#Powerful open source group chat 

The version of the OpenAPI document: 1.0.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.2.0

=end

require 'cgi'

module OpenapiClient
  class DraftsApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Create drafts
    # Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` 
    # @param [Hash] opts the optional parameters
    # @option opts [Array<Draft>] :drafts A JSON-encoded list of containing new draft objects. 
    # @return [JsonSuccess]
    def create_drafts(opts = {})
      data, _status_code, _headers = create_drafts_with_http_info(opts)
      data
    end

    # Create drafts
    # Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;POST {{ api_url }}/v1/drafts&#x60; 
    # @param [Hash] opts the optional parameters
    # @option opts [Array<Draft>] :drafts A JSON-encoded list of containing new draft objects. 
    # @return [Array<(JsonSuccess, Integer, Hash)>] JsonSuccess data, response status code and response headers
    def create_drafts_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: DraftsApi.create_drafts ...'
      end
      # resource path
      local_var_path = '/drafts'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'drafts'] = @api_client.build_collection_param(opts[:'drafts'], :multi) if !opts[:'drafts'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'JsonSuccess'

      # auth_names
      auth_names = opts[:debug_auth_names] || []

      new_options = opts.merge(
        :operation => :"DraftsApi.create_drafts",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: DraftsApi#create_drafts\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Delete a draft
    # Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` 
    # @param draft_id [Integer] The ID of the draft you want to delete. 
    # @param [Hash] opts the optional parameters
    # @return [JsonSuccess]
    def delete_draft(draft_id, opts = {})
      data, _status_code, _headers = delete_draft_with_http_info(draft_id, opts)
      data
    end

    # Delete a draft
    # Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a &#x60;drafts&#x60; event.  &#x60;DELETE {{ api_url }}/v1/drafts/{draft_id}&#x60; 
    # @param draft_id [Integer] The ID of the draft you want to delete. 
    # @param [Hash] opts the optional parameters
    # @return [Array<(JsonSuccess, Integer, Hash)>] JsonSuccess data, response status code and response headers
    def delete_draft_with_http_info(draft_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: DraftsApi.delete_draft ...'
      end
      # verify the required parameter 'draft_id' is set
      if @api_client.config.client_side_validation && draft_id.nil?
        fail ArgumentError, "Missing the required parameter 'draft_id' when calling DraftsApi.delete_draft"
      end
      # resource path
      local_var_path = '/drafts/{draft_id}'.sub('{' + 'draft_id' + '}', CGI.escape(draft_id.to_s))

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'JsonSuccess'

      # auth_names
      auth_names = opts[:debug_auth_names] || []

      new_options = opts.merge(
        :operation => :"DraftsApi.delete_draft",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:DELETE, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: DraftsApi#delete_draft\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Edit a draft
    # Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` 
    # @param draft_id [Integer] The ID of the draft to be edited. 
    # @param draft [Draft] A JSON-encoded object containing a replacement draft object for this ID. 
    # @param [Hash] opts the optional parameters
    # @return [JsonSuccess]
    def edit_draft(draft_id, draft, opts = {})
      data, _status_code, _headers = edit_draft_with_http_info(draft_id, draft, opts)
      data
    end

    # Edit a draft
    # Edit a draft on the server. The edit will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;PATCH {{ api_url }}/v1/drafts/{draft_id}&#x60; 
    # @param draft_id [Integer] The ID of the draft to be edited. 
    # @param draft [Draft] A JSON-encoded object containing a replacement draft object for this ID. 
    # @param [Hash] opts the optional parameters
    # @return [Array<(JsonSuccess, Integer, Hash)>] JsonSuccess data, response status code and response headers
    def edit_draft_with_http_info(draft_id, draft, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: DraftsApi.edit_draft ...'
      end
      # verify the required parameter 'draft_id' is set
      if @api_client.config.client_side_validation && draft_id.nil?
        fail ArgumentError, "Missing the required parameter 'draft_id' when calling DraftsApi.edit_draft"
      end
      # verify the required parameter 'draft' is set
      if @api_client.config.client_side_validation && draft.nil?
        fail ArgumentError, "Missing the required parameter 'draft' when calling DraftsApi.edit_draft"
      end
      # resource path
      local_var_path = '/drafts/{draft_id}'.sub('{' + 'draft_id' + '}', CGI.escape(draft_id.to_s))

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'draft'] = draft

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'JsonSuccess'

      # auth_names
      auth_names = opts[:debug_auth_names] || []

      new_options = opts.merge(
        :operation => :"DraftsApi.edit_draft",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:PATCH, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: DraftsApi#edit_draft\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Get drafts
    # Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` 
    # @param [Hash] opts the optional parameters
    # @return [JsonSuccess]
    def get_drafts(opts = {})
      data, _status_code, _headers = get_drafts_with_http_info(opts)
      data
    end

    # Get drafts
    # Fetch all drafts for the current user.  &#x60;GET {{ api_url }}/v1/drafts&#x60; 
    # @param [Hash] opts the optional parameters
    # @return [Array<(JsonSuccess, Integer, Hash)>] JsonSuccess data, response status code and response headers
    def get_drafts_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: DraftsApi.get_drafts ...'
      end
      # resource path
      local_var_path = '/drafts'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'JsonSuccess'

      # auth_names
      auth_names = opts[:debug_auth_names] || []

      new_options = opts.merge(
        :operation => :"DraftsApi.get_drafts",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: DraftsApi#get_drafts\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
