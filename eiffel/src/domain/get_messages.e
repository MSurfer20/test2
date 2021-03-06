note
 description:"[
		Zulip REST API
 		Powerful open source group chat 
  		The version of the OpenAPI document: 1.0.0
 	    

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class GET_MESSAGES 




feature --Access

    avatar_url: detachable ANY 
      
    client: detachable ANY 
      
    content: detachable ANY 
      
    content_type: detachable ANY 
      
    display_recipient: detachable ANY 
      
    id: detachable ANY 
      
    is_me_message: detachable ANY 
      
    reactions: detachable ANY 
      
    recipient_id: detachable ANY 
      
    sender_email: detachable ANY 
      
    sender_full_name: detachable ANY 
      
    sender_id: detachable ANY 
      
    sender_realm_str: detachable ANY 
      
    stream_id: detachable ANY 
      
    subject: detachable ANY 
      
    topic_links: detachable ANY 
      
    submessages: detachable ANY 
      
    timestamp: detachable ANY 
      
    type: detachable ANY 
      
    flags: detachable LIST [STRING_32] 
      -- The user's [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags 
 	last_edit_timestamp: INTEGER_32 
    	 -- The UNIX timestamp for when the message was last edited, in UTC seconds. 
    match_content: detachable STRING_32 
      -- Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. 
    match_subject: detachable STRING_32 
      -- Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. 

feature -- Change Element  
 
    set_avatar_url (a_name: like avatar_url)
        -- Set 'avatar_url' with 'a_name'.
      do
        avatar_url := a_name
      ensure
        avatar_url_set: avatar_url = a_name		
      end

    set_client (a_name: like client)
        -- Set 'client' with 'a_name'.
      do
        client := a_name
      ensure
        client_set: client = a_name		
      end

    set_content (a_name: like content)
        -- Set 'content' with 'a_name'.
      do
        content := a_name
      ensure
        content_set: content = a_name		
      end

    set_content_type (a_name: like content_type)
        -- Set 'content_type' with 'a_name'.
      do
        content_type := a_name
      ensure
        content_type_set: content_type = a_name		
      end

    set_display_recipient (a_name: like display_recipient)
        -- Set 'display_recipient' with 'a_name'.
      do
        display_recipient := a_name
      ensure
        display_recipient_set: display_recipient = a_name		
      end

    set_id (a_name: like id)
        -- Set 'id' with 'a_name'.
      do
        id := a_name
      ensure
        id_set: id = a_name		
      end

    set_is_me_message (a_name: like is_me_message)
        -- Set 'is_me_message' with 'a_name'.
      do
        is_me_message := a_name
      ensure
        is_me_message_set: is_me_message = a_name		
      end

    set_reactions (a_name: like reactions)
        -- Set 'reactions' with 'a_name'.
      do
        reactions := a_name
      ensure
        reactions_set: reactions = a_name		
      end

    set_recipient_id (a_name: like recipient_id)
        -- Set 'recipient_id' with 'a_name'.
      do
        recipient_id := a_name
      ensure
        recipient_id_set: recipient_id = a_name		
      end

    set_sender_email (a_name: like sender_email)
        -- Set 'sender_email' with 'a_name'.
      do
        sender_email := a_name
      ensure
        sender_email_set: sender_email = a_name		
      end

    set_sender_full_name (a_name: like sender_full_name)
        -- Set 'sender_full_name' with 'a_name'.
      do
        sender_full_name := a_name
      ensure
        sender_full_name_set: sender_full_name = a_name		
      end

    set_sender_id (a_name: like sender_id)
        -- Set 'sender_id' with 'a_name'.
      do
        sender_id := a_name
      ensure
        sender_id_set: sender_id = a_name		
      end

    set_sender_realm_str (a_name: like sender_realm_str)
        -- Set 'sender_realm_str' with 'a_name'.
      do
        sender_realm_str := a_name
      ensure
        sender_realm_str_set: sender_realm_str = a_name		
      end

    set_stream_id (a_name: like stream_id)
        -- Set 'stream_id' with 'a_name'.
      do
        stream_id := a_name
      ensure
        stream_id_set: stream_id = a_name		
      end

    set_subject (a_name: like subject)
        -- Set 'subject' with 'a_name'.
      do
        subject := a_name
      ensure
        subject_set: subject = a_name		
      end

    set_topic_links (a_name: like topic_links)
        -- Set 'topic_links' with 'a_name'.
      do
        topic_links := a_name
      ensure
        topic_links_set: topic_links = a_name		
      end

    set_submessages (a_name: like submessages)
        -- Set 'submessages' with 'a_name'.
      do
        submessages := a_name
      ensure
        submessages_set: submessages = a_name		
      end

    set_timestamp (a_name: like timestamp)
        -- Set 'timestamp' with 'a_name'.
      do
        timestamp := a_name
      ensure
        timestamp_set: timestamp = a_name		
      end

    set_type (a_name: like type)
        -- Set 'type' with 'a_name'.
      do
        type := a_name
      ensure
        type_set: type = a_name		
      end

    set_flags (a_name: like flags)
        -- Set 'flags' with 'a_name'.
      do
        flags := a_name
      ensure
        flags_set: flags = a_name		
      end

    set_last_edit_timestamp (a_name: like last_edit_timestamp)
        -- Set 'last_edit_timestamp' with 'a_name'.
      do
        last_edit_timestamp := a_name
      ensure
        last_edit_timestamp_set: last_edit_timestamp = a_name		
      end

    set_match_content (a_name: like match_content)
        -- Set 'match_content' with 'a_name'.
      do
        match_content := a_name
      ensure
        match_content_set: match_content = a_name		
      end

    set_match_subject (a_name: like match_subject)
        -- Set 'match_subject' with 'a_name'.
      do
        match_subject := a_name
      ensure
        match_subject_set: match_subject = a_name		
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass GET_MESSAGES%N")
        if attached avatar_url as l_avatar_url then
          Result.append ("%Navatar_url:")
          Result.append (l_avatar_url.out)
          Result.append ("%N")    
        end  
        if attached client as l_client then
          Result.append ("%Nclient:")
          Result.append (l_client.out)
          Result.append ("%N")    
        end  
        if attached content as l_content then
          Result.append ("%Ncontent:")
          Result.append (l_content.out)
          Result.append ("%N")    
        end  
        if attached content_type as l_content_type then
          Result.append ("%Ncontent_type:")
          Result.append (l_content_type.out)
          Result.append ("%N")    
        end  
        if attached display_recipient as l_display_recipient then
          Result.append ("%Ndisplay_recipient:")
          Result.append (l_display_recipient.out)
          Result.append ("%N")    
        end  
        if attached id as l_id then
          Result.append ("%Nid:")
          Result.append (l_id.out)
          Result.append ("%N")    
        end  
        if attached is_me_message as l_is_me_message then
          Result.append ("%Nis_me_message:")
          Result.append (l_is_me_message.out)
          Result.append ("%N")    
        end  
        if attached reactions as l_reactions then
          Result.append ("%Nreactions:")
          Result.append (l_reactions.out)
          Result.append ("%N")    
        end  
        if attached recipient_id as l_recipient_id then
          Result.append ("%Nrecipient_id:")
          Result.append (l_recipient_id.out)
          Result.append ("%N")    
        end  
        if attached sender_email as l_sender_email then
          Result.append ("%Nsender_email:")
          Result.append (l_sender_email.out)
          Result.append ("%N")    
        end  
        if attached sender_full_name as l_sender_full_name then
          Result.append ("%Nsender_full_name:")
          Result.append (l_sender_full_name.out)
          Result.append ("%N")    
        end  
        if attached sender_id as l_sender_id then
          Result.append ("%Nsender_id:")
          Result.append (l_sender_id.out)
          Result.append ("%N")    
        end  
        if attached sender_realm_str as l_sender_realm_str then
          Result.append ("%Nsender_realm_str:")
          Result.append (l_sender_realm_str.out)
          Result.append ("%N")    
        end  
        if attached stream_id as l_stream_id then
          Result.append ("%Nstream_id:")
          Result.append (l_stream_id.out)
          Result.append ("%N")    
        end  
        if attached subject as l_subject then
          Result.append ("%Nsubject:")
          Result.append (l_subject.out)
          Result.append ("%N")    
        end  
        if attached topic_links as l_topic_links then
          Result.append ("%Ntopic_links:")
          Result.append (l_topic_links.out)
          Result.append ("%N")    
        end  
        if attached submessages as l_submessages then
          Result.append ("%Nsubmessages:")
          Result.append (l_submessages.out)
          Result.append ("%N")    
        end  
        if attached timestamp as l_timestamp then
          Result.append ("%Ntimestamp:")
          Result.append (l_timestamp.out)
          Result.append ("%N")    
        end  
        if attached type as l_type then
          Result.append ("%Ntype:")
          Result.append (l_type.out)
          Result.append ("%N")    
        end  
        if attached flags as l_flags then
          across l_flags as ic loop
            Result.append ("%N flags:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end 
        if attached last_edit_timestamp as l_last_edit_timestamp then
          Result.append ("%Nlast_edit_timestamp:")
          Result.append (l_last_edit_timestamp.out)
          Result.append ("%N")    
        end  
        if attached match_content as l_match_content then
          Result.append ("%Nmatch_content:")
          Result.append (l_match_content.out)
          Result.append ("%N")    
        end  
        if attached match_subject as l_match_subject then
          Result.append ("%Nmatch_subject:")
          Result.append (l_match_subject.out)
          Result.append ("%N")    
        end  
      end
end


