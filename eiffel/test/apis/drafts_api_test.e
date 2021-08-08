note
    description: "API tests for DRAFTS_API"
    date: "$Date$"
    revision: "$Revision$"


class DRAFTS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_create_drafts
            -- Create drafts
            -- 
            -- Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;POST {{ api_url }}/v1/drafts&#x60;  
        local
            l_response: JSON_SUCCESS
            l_drafts: LIST [DRAFT]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.create_drafts(l_drafts)
            assert ("not_implemented", False)
        end
    
    test_delete_draft
            -- Delete a draft
            -- 
            -- Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a &#x60;drafts&#x60; event.  &#x60;DELETE {{ api_url }}/v1/drafts/{draft_id}&#x60;  
        local
            l_response: JSON_SUCCESS
            l_draft_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_draft_id
                      
            -- l_response := api.delete_draft(l_draft_id)
            assert ("not_implemented", False)
        end
    
    test_drafts
            -- Get drafts
            -- 
            -- Fetch all drafts for the current user.  &#x60;GET {{ api_url }}/v1/drafts&#x60;  
        local
            l_response: JSON_SUCCESS
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.drafts
            assert ("not_implemented", False)
        end
    
    test_edit_draft
            -- Edit a draft
            -- 
            -- Edit a draft on the server. The edit will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;PATCH {{ api_url }}/v1/drafts/{draft_id}&#x60;  
        local
            l_response: JSON_SUCCESS
            l_draft_id: INTEGER_32
            l_draft: DRAFT
        do
            -- TODO: Initialize required params.
            -- l_draft_id
            -- l_draft
                      
            -- l_response := api.edit_draft(l_draft_id, l_draft)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: DRAFTS_API
            -- Create an object instance of `DRAFTS_API'.
        once            
            create { DRAFTS_API } Result
        end

end
