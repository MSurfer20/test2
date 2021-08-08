note
    description: "API tests for WEBHOOKS_API"
    date: "$Date$"
    revision: "$Revision$"


class WEBHOOKS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_zulip_outgoing_webhooks
            -- Outgoing webhooks
            -- 
            -- Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip.  
        local
            l_response: INLINE_RESPONSE_200
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.zulip_outgoing_webhooks
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: WEBHOOKS_API
            -- Create an object instance of `WEBHOOKS_API'.
        once            
            create { WEBHOOKS_API } Result
        end

end
