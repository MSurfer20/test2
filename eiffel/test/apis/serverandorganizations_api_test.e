note
    description: "API tests for SERVERANDORGANIZATIONS_API"
    date: "$Date$"
    revision: "$Revision$"


class SERVERANDORGANIZATIONS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_add_code_playground
            -- Add a code playground
            -- 
            -- Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  &#x60;POST {{ api_url }}/v1/realm/playgrounds&#x60;  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57).  
        local
            l_response: JSON_SUCCESS_BASE
            l_name: STRING_32
            l_pygments_language: STRING_32
            l_url_prefix: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_name
            -- l_pygments_language
            -- l_url_prefix
                      
            -- l_response := api.add_code_playground(l_name, l_pygments_language, l_url_prefix)
            assert ("not_implemented", False)
        end
    
    test_add_linkifier
            -- Add a linkifier
            -- 
            -- Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;POST {{ api_url }}/v1/realm/filters&#x60;  
        local
            l_response: JSON_SUCCESS_BASE
            l_pattern: STRING_32
            l_url_format_string: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_pattern
            -- l_url_format_string
                      
            -- l_response := api.add_linkifier(l_pattern, l_url_format_string)
            assert ("not_implemented", False)
        end
    
    test_create_custom_profile_field
            -- Create a custom profile field
            -- 
            -- [Create a custom profile field](/help/add-custom-profile-fields) in the user&#39;s organization.  &#x60;POST {{ api_url }}/v1/realm/profile_fields&#x60;  
        local
            l_response: JSON_SUCCESS_BASE
            l_field_type: INTEGER_32
            l_name: STRING_32
            l_hint: STRING_32
            l_field_data: ANY
        do
            -- TODO: Initialize required params.
            -- l_field_type
                      
            -- l_response := api.create_custom_profile_field(l_field_type, l_name, l_hint, l_field_data)
            assert ("not_implemented", False)
        end
    
    test_custom_emoji
            -- Get all custom emoji
            -- 
            -- Get all the custom emoji in the user&#39;s organization.  &#x60;GET {{ api_url }}/v1/realm/emoji&#x60;  
        local
            l_response: JSON_SUCCESS_BASE
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.custom_emoji
            assert ("not_implemented", False)
        end
    
    test_custom_profile_fields
            -- Get all custom profile fields
            -- 
            -- Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user&#39;s organization.  &#x60;GET {{ api_url }}/v1/realm/profile_fields&#x60;  
        local
            l_response: JSON_SUCCESS_BASE
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.custom_profile_fields
            assert ("not_implemented", False)
        end
    
    test_linkifiers
            -- Get linkifiers
            -- 
            -- List all of an organization&#39;s configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;GET {{ api_url }}/v1/realm/linkifiers&#x60;  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar &#x60;GET /realm/filters&#x60; endpoint was available with each entry in a &#x60;[pattern, url_format, id]&#x60; tuple format.  
        local
            l_response: JSON_SUCCESS_BASE
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.linkifiers
            assert ("not_implemented", False)
        end
    
    test_remove_code_playground
            -- Remove a code playground
            -- 
            -- Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  &#x60;DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 49).  
        local
            l_response: JSON_SUCCESS
            l_playground_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_playground_id
                      
            -- l_response := api.remove_code_playground(l_playground_id)
            assert ("not_implemented", False)
        end
    
    test_remove_linkifier
            -- Remove a linkifier
            -- 
            -- Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;DELETE {{ api_url }}/v1/realm/filters/{filter_id}&#x60;  
        local
            l_response: JSON_SUCCESS
            l_filter_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_filter_id
                      
            -- l_response := api.remove_linkifier(l_filter_id)
            assert ("not_implemented", False)
        end
    
    test_reorder_custom_profile_fields
            -- Reorder custom profile fields
            -- 
            -- Reorder the custom profile fields in the user&#39;s organization.  &#x60;PATCH {{ api_url }}/v1/realm/profile_fields&#x60;  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields).  
        local
            l_response: JSON_SUCCESS
            l_order: LIST [INTEGER_32]
        do
            -- TODO: Initialize required params.
            -- create {ARRAYED_LIST [INTEGER_32]} l_order.make (2)
                      
            -- l_response := api.reorder_custom_profile_fields(l_order)
            assert ("not_implemented", False)
        end
    
    test_server_settings
            -- Get server settings
            -- 
            -- Fetch global settings for a Zulip server.  &#x60;GET {{ api_url }}/v1/server_settings&#x60;  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it&#39;s running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available).  
        local
            l_response: JSON_SUCCESS_BASE
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.server_settings
            assert ("not_implemented", False)
        end
    
    test_update_linkifier
            -- Update a linkifier
            -- 
            -- Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;PATCH {{ api_url }}/v1/realm/filters/{filter_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 57).  
        local
            l_response: JSON_SUCCESS
            l_filter_id: INTEGER_32
            l_pattern: STRING_32
            l_url_format_string: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_filter_id
            -- l_pattern
            -- l_url_format_string
                      
            -- l_response := api.update_linkifier(l_filter_id, l_pattern, l_url_format_string)
            assert ("not_implemented", False)
        end
    
    test_upload_custom_emoji
            -- Upload custom emoji
            -- 
            -- This endpoint is used to upload a custom emoji for use in the user&#39;s organization.  Access to this endpoint depends on the [organization&#39;s configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  &#x60;POST {{ api_url }}/v1/realm/emoji/{emoji_name}&#x60;  
        local
            l_response: JSON_SUCCESS
            l_emoji_name: STRING_32
            l_filename: FILE
        do
            -- TODO: Initialize required params.
            -- l_emoji_name
                      
            -- l_response := api.upload_custom_emoji(l_emoji_name, l_filename)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: SERVERANDORGANIZATIONS_API
            -- Create an object instance of `SERVERANDORGANIZATIONS_API'.
        once            
            create { SERVERANDORGANIZATIONS_API } Result
        end

end
