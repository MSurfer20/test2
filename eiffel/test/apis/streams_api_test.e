note
    description: "API tests for STREAMS_API"
    date: "$Date$"
    revision: "$Revision$"


class STREAMS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_archive_stream
            -- Archive a stream
            -- 
            -- [Archive the stream](/help/archive-a-stream) with the ID &#x60;stream_id&#x60;.  &#x60;DELETE {{ api_url }}/v1/streams/{stream_id}&#x60;  
        local
            l_response: JSON_SUCCESS
            l_stream_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_stream_id
                      
            -- l_response := api.archive_stream(l_stream_id)
            assert ("not_implemented", False)
        end
    
    test_create_big_blue_button_video_call
            -- Create BigBlueButton video call
            -- 
            -- Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server.  
        local
            l_response: JSON_SUCCESS_BASE
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.create_big_blue_button_video_call
            assert ("not_implemented", False)
        end
    
    test_mute_topic
            -- Topic muting
            -- 
            -- This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user&#39;s unread count totals.  &#x60;PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics&#x60;  
        local
            l_response: JSON_SUCCESS
            l_topic: STRING_32
            l_op: STRING_32
            l_stream: STRING_32
            l_stream_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_topic
            -- l_op
                      
            -- l_response := api.mute_topic(l_topic, l_op, l_stream, l_stream_id)
            assert ("not_implemented", False)
        end
    
    test_stream_id
            -- Get stream ID
            -- 
            -- Get the unique ID of a given stream.  &#x60;GET {{ api_url }}/v1/get_stream_id&#x60;  
        local
            l_response: JSON_SUCCESS_BASE
            l_stream: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_stream
                      
            -- l_response := api.stream_id(l_stream)
            assert ("not_implemented", False)
        end
    
    test_stream_topics
            -- Get topics in a stream
            -- 
            -- Get all the topics in a specific stream  &#x60;GET {{ api_url }}/v1/users/me/{stream_id}/topics&#x60;  
        local
            l_response: JSON_SUCCESS_BASE
            l_stream_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_stream_id
                      
            -- l_response := api.stream_topics(l_stream_id)
            assert ("not_implemented", False)
        end
    
    test_streams
            -- Get all streams
            -- 
            -- Get all streams that the user has access to.  &#x60;GET {{ api_url }}/v1/streams&#x60;  
        local
            l_response: JSON_SUCCESS_BASE
            l_include_public: BOOLEAN
            l_include_web_public: BOOLEAN
            l_include_subscribed: BOOLEAN
            l_include_all_active: BOOLEAN
            l_include_default: BOOLEAN
            l_include_owner_subscribed: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.streams(l_include_public, l_include_web_public, l_include_subscribed, l_include_all_active, l_include_default, l_include_owner_subscribed)
            assert ("not_implemented", False)
        end
    
    test_subscribe
            -- Subscribe to a stream
            -- 
            -- Subscribe one or more users to one or more streams.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions&#x60;  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like &#x60;invite_only&#x60; detailed below.  
        local
            l_response: ONE_OFOBJECTOBJECT
            l_subscriptions: LIST [ANY]
            l_principals: LIST [ONE_OFSTRINGINTEGER]
            l_authorization_errors_fatal: BOOLEAN
            l_announce: BOOLEAN
            l_invite_only: BOOLEAN
            l_history_public_to_subscribers: BOOLEAN
            l_stream_post_policy: INTEGER_32
            l_message_retention_days: ONE_OFSTRINGINTEGER
        do
            -- TODO: Initialize required params.
            -- create {ARRAYED_LIST [ANY]} l_subscriptions.make (2)
                      
            -- l_response := api.subscribe(l_subscriptions, l_principals, l_authorization_errors_fatal, l_announce, l_invite_only, l_history_public_to_subscribers, l_stream_post_policy, l_message_retention_days)
            assert ("not_implemented", False)
        end
    
    test_subscription_status
            -- Get subscription status
            -- 
            -- Check whether a user is subscribed to a stream.  &#x60;GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}&#x60;  **Changes**: New in Zulip 3.0 (feature level 11).  
        local
            l_response: JSON_SUCCESS_BASE
            l_user_id: INTEGER_32
            l_stream_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_user_id
            -- l_stream_id
                      
            -- l_response := api.subscription_status(l_user_id, l_stream_id)
            assert ("not_implemented", False)
        end
    
    test_subscriptions
            -- Get subscribed streams
            -- 
            -- Get all streams that the user is subscribed to.  &#x60;GET {{ api_url }}/v1/users/me/subscriptions&#x60;  
        local
            l_response: JSON_SUCCESS_BASE
            l_include_subscribers: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.subscriptions(l_include_subscribers)
            assert ("not_implemented", False)
        end
    
    test_unsubscribe
            -- Unsubscribe from a stream
            -- 
            -- Unsubscribe yourself or other users from one or more streams.  &#x60;DELETE {{ api_url }}/v1/users/me/subscriptions&#x60;  
        local
            l_response: JSON_SUCCESS_BASE
            l_subscriptions: LIST [STRING_32]
            l_principals: LIST [ONE_OFSTRINGINTEGER]
        do
            -- TODO: Initialize required params.
            -- create {ARRAYED_LIST [STRING_32]} l_subscriptions.make (2)
                      
            -- l_response := api.unsubscribe(l_subscriptions, l_principals)
            assert ("not_implemented", False)
        end
    
    test_update_stream
            -- Update a stream
            -- 
            -- Configure the stream with the ID &#x60;stream_id&#x60;.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  &#x60;PATCH {{ api_url }}/v1/streams/{stream_id}&#x60;  
        local
            l_response: JSON_SUCCESS
            l_stream_id: INTEGER_32
            l_description: STRING_32
            l_new_name: STRING_32
            l_is_private: BOOLEAN
            l_is_announcement_only: BOOLEAN
            l_stream_post_policy: INTEGER_32
            l_history_public_to_subscribers: BOOLEAN
            l_message_retention_days: ONE_OFSTRINGINTEGER
        do
            -- TODO: Initialize required params.
            -- l_stream_id
                      
            -- l_response := api.update_stream(l_stream_id, l_description, l_new_name, l_is_private, l_is_announcement_only, l_stream_post_policy, l_history_public_to_subscribers, l_message_retention_days)
            assert ("not_implemented", False)
        end
    
    test_update_subscription_settings
            -- Update subscription settings
            -- 
            -- This endpoint is used to update the user&#39;s personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions/properties&#x60;  
        local
            l_response: JSON_SUCCESS_BASE
            l_subscription_data: LIST [ANY]
        do
            -- TODO: Initialize required params.
            -- create {ARRAYED_LIST [ANY]} l_subscription_data.make (2)
                      
            -- l_response := api.update_subscription_settings(l_subscription_data)
            assert ("not_implemented", False)
        end
    
    test_update_subscriptions
            -- Update subscriptions
            -- 
            -- Update which streams you are are subscribed to.  
        local
            l_response: JSON_SUCCESS_BASE
            l_delete: LIST [STRING_32]
            l_add: LIST [ANY]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.update_subscriptions(l_delete, l_add)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: STREAMS_API
            -- Create an object instance of `STREAMS_API'.
        once            
            create { STREAMS_API } Result
        end

end
