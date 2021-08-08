note
    description: "API tests for MESSAGES_API"
    date: "$Date$"
    revision: "$Revision$"


class MESSAGES_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_add_reaction
            -- Add an emoji reaction
            -- 
            -- Add an [emoji reaction](/help/emoji-reactions) to a message.  &#x60;POST {{ api_url }}/v1/messages/{message_id}/reactions&#x60;  
        local
            l_response: JSON_SUCCESS
            l_message_id: INTEGER_32
            l_emoji_name: STRING_32
            l_emoji_code: STRING_32
            l_reaction_type: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_message_id
            -- l_emoji_name
                      
            -- l_response := api.add_reaction(l_message_id, l_emoji_name, l_emoji_code, l_reaction_type)
            assert ("not_implemented", False)
        end
    
    test_check_messages_match_narrow
            -- Check if messages match a narrow
            -- 
            -- Check whether a set of messages match a [narrow](/api/construct-narrow).  &#x60;GET {{ api_url }}/v1/messages/matches_narrow&#x60;  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the &#x60;match_subject&#x60; and &#x60;match_content&#x60; objects is designed to match those of &#x60;GET /messages&#x60;, so that a client can splice these fields into a &#x60;message&#x60; object received from &#x60;GET /events&#x60; and end up with an extended message object identical to how a &#x60;GET /messages&#x60; for the current narrow would have returned the message.  
        local
            l_response: ANY
            l_msg_ids: LIST [INTEGER_32]
            l_narrow: LIST [ANY]
        do
            -- TODO: Initialize required params.
            -- create {ARRAYED_LIST [INTEGER_32]} l_msg_ids.make (2)
            -- create {ARRAYED_LIST [ANY]} l_narrow.make (2)
                      
            -- l_response := api.check_messages_match_narrow(l_msg_ids, l_narrow)
            assert ("not_implemented", False)
        end
    
    test_delete_message
            -- Delete a message
            -- 
            -- Permanently delete a message.  &#x60;DELETE {{ api_url }}/v1/messages/{msg_id}&#x60;  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely  
        local
            l_response: JSON_SUCCESS
            l_message_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_message_id
                      
            -- l_response := api.delete_message(l_message_id)
            assert ("not_implemented", False)
        end
    
    test_file_temporary_url
            -- Get public temporary URL
            -- 
            -- Get a temporary URL for access to the file that doesn&#39;t require authentication.  
        local
            l_response: JSON_SUCCESS_BASE
            l_realm_id_str: INTEGER_32
            l_filename: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_realm_id_str
            -- l_filename
                      
            -- l_response := api.file_temporary_url(l_realm_id_str, l_filename)
            assert ("not_implemented", False)
        end
    
    test_mark_all_as_read
            -- Mark all messages as read
            -- 
            -- Marks all of the current user&#39;s unread messages as read.  &#x60;POST {{ api_url }}/v1/mark_all_as_read&#x60;  
        local
            l_response: JSON_SUCCESS
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.mark_all_as_read
            assert ("not_implemented", False)
        end
    
    test_mark_stream_as_read
            -- Mark messages in a stream as read
            -- 
            -- Mark all the unread messages in a stream as read.  
        local
            l_response: JSON_SUCCESS
            l_stream_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_stream_id
                      
            -- l_response := api.mark_stream_as_read(l_stream_id)
            assert ("not_implemented", False)
        end
    
    test_mark_topic_as_read
            -- Mark messages in a topic as read
            -- 
            -- Mark all the unread messages in a topic as read.  
        local
            l_response: JSON_SUCCESS
            l_stream_id: INTEGER_32
            l_topic_name: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_stream_id
            -- l_topic_name
                      
            -- l_response := api.mark_topic_as_read(l_stream_id, l_topic_name)
            assert ("not_implemented", False)
        end
    
    test_message_history
            -- Get a message&#39;s edit history
            -- 
            -- Fetch the message edit history of a previously edited message.  &#x60;GET {{ api_url }}/v1/messages/{message_id}/history&#x60;  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history  
        local
            l_response: JSON_SUCCESS_BASE
            l_message_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_message_id
                      
            -- l_response := api.message_history(l_message_id)
            assert ("not_implemented", False)
        end
    
    test_messages
            -- Get messages
            -- 
            -- Fetch message history from a Zulip server.  &#x60;GET {{ api_url }}/v1/messages&#x60;  This &#x60;GET /api/v1/messages&#x60; endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip&#39;s powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user&#39;s message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an &#x60;anchor&#x60; message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the &#x60;num_before&#x60; and &#x60;num_after&#x60; limits.  We recommend using &#x60;num_before &lt;&#x3D; 1000&#x60; and &#x60;num_after &lt;&#x3D; 1000&#x60; to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error.  
        local
            l_response: JSON_SUCCESS_BASE
            l_num_before: INTEGER_32
            l_num_after: INTEGER_32
            l_anchor: ONE_OFSTRINGINTEGER
            l_narrow: LIST [ANY]
            l_client_gravatar: BOOLEAN
            l_apply_markdown: BOOLEAN
            l_use_first_unread_anchor: BOOLEAN
        do
            -- TODO: Initialize required params.
            -- l_num_before
            -- l_num_after
                      
            -- l_response := api.messages(l_num_before, l_num_after, l_anchor, l_narrow, l_client_gravatar, l_apply_markdown, l_use_first_unread_anchor)
            assert ("not_implemented", False)
        end
    
    test_raw_message
            -- Get a message&#39;s raw Markdown
            -- 
            -- Get the raw content of a message.  &#x60;GET {{ api_url }}/v1/messages/{msg_id}&#x60;  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message&#39;s raw Markdown (e.g. for pre-filling a message-editing UI).  
        local
            l_response: JSON_SUCCESS_BASE
            l_message_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_message_id
                      
            -- l_response := api.raw_message(l_message_id)
            assert ("not_implemented", False)
        end
    
    test_remove_reaction
            -- Remove an emoji reaction
            -- 
            -- Remove an [emoji reaction](/help/emoji-reactions) from a message.  &#x60;DELETE {{ api_url }}/v1/messages/{message_id}/reactions&#x60;  
        local
            l_response: JSON_SUCCESS
            l_message_id: INTEGER_32
            l_emoji_name: STRING_32
            l_emoji_code: STRING_32
            l_reaction_type: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_message_id
                      
            -- l_response := api.remove_reaction(l_message_id, l_emoji_name, l_emoji_code, l_reaction_type)
            assert ("not_implemented", False)
        end
    
    test_render_message
            -- Render message
            -- 
            -- Render a message to HTML.  &#x60;POST {{ api_url }}/v1/messages/render&#x60;  
        local
            l_response: JSON_SUCCESS_BASE
            l_content: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_content
                      
            -- l_response := api.render_message(l_content)
            assert ("not_implemented", False)
        end
    
    test_send_message
            -- Send a message
            -- 
            -- Send a stream or a private message.  &#x60;POST {{ api_url }}/v1/messages&#x60;  
        local
            l_response: JSON_SUCCESS_BASE
            l_type: STRING_32
            l_to: LIST [INTEGER_32]
            l_content: STRING_32
            l_topic: STRING_32
            l_queue_id: STRING_32
            l_local_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_type
            -- create {ARRAYED_LIST [INTEGER_32]} l_to.make (2)
            -- l_content
                      
            -- l_response := api.send_message(l_type, l_to, l_content, l_topic, l_queue_id, l_local_id)
            assert ("not_implemented", False)
        end
    
    test_update_message
            -- Edit a message
            -- 
            -- Edit/update the content or topic of a message.  &#x60;PATCH {{ api_url }}/v1/messages/{msg_id}&#x60;  &#x60;{msg_id}&#x60; in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to &#x60;✔ {original_topic}&#x60;.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion  
        local
            l_response: JSON_SUCCESS
            l_message_id: INTEGER_32
            l_topic: STRING_32
            l_propagate_mode: STRING_32
            l_send_notification_to_old_thread: BOOLEAN
            l_send_notification_to_new_thread: BOOLEAN
            l_content: STRING_32
            l_stream_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_message_id
                      
            -- l_response := api.update_message(l_message_id, l_topic, l_propagate_mode, l_send_notification_to_old_thread, l_send_notification_to_new_thread, l_content, l_stream_id)
            assert ("not_implemented", False)
        end
    
    test_update_message_flags
            -- Update personal message flags
            -- 
            -- Add or remove personal message flags like &#x60;read&#x60; and &#x60;starred&#x60; on a collection of message IDs.  &#x60;POST {{ api_url }}/v1/messages/flags&#x60;  For updating the &#x60;read&#x60; flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read).  
        local
            l_response: JSON_SUCCESS_BASE
            l_messages: LIST [INTEGER_32]
            l_op: STRING_32
            l_flag: STRING_32
        do
            -- TODO: Initialize required params.
            -- create {ARRAYED_LIST [INTEGER_32]} l_messages.make (2)
            -- l_op
            -- l_flag
                      
            -- l_response := api.update_message_flags(l_messages, l_op, l_flag)
            assert ("not_implemented", False)
        end
    
    test_upload_file
            -- Upload a file
            -- 
            -- Upload a single file and get the corresponding URI.  &#x60;POST {{ api_url }}/v1/user_uploads&#x60;  Initially, only you will be able to access the link.  To share the uploaded file, you&#39;ll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message  
        local
            l_response: JSON_SUCCESS_BASE
            l_filename: FILE
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.upload_file(l_filename)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: MESSAGES_API
            -- Create an object instance of `MESSAGES_API'.
        once            
            create { MESSAGES_API } Result
        end

end
