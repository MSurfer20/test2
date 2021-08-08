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
class BASIC_STREAM_BASE 




feature --Access

 	stream_id: INTEGER_32 
    	 -- The unique ID of the stream. 
    name: detachable STRING_32 
      -- The name of the stream. 
    description: detachable STRING_32 
      -- The short description of the stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description. 
 	date_created: INTEGER_32 
    	 -- The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). 
 	invite_only: BOOLEAN 
    	 -- Specifies whether the stream is private or not. Only people who have been invited can access a private stream. 
    rendered_description: detachable STRING_32 
      -- The short description of the stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. 
 	is_web_public: BOOLEAN 
    	 -- Whether the stream has been configured to allow unauthenticated access to its message history from the web. 
 	stream_post_policy: INTEGER_32 
    	 -- Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
 	message_retention_days: INTEGER_32 
    	 -- Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
 	history_public_to_subscribers: BOOLEAN 
    	 -- Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future. 
 	first_message_id: INTEGER_32 
    	 -- The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. 
 	is_announcement_only: BOOLEAN 
    	 -- Whether the given stream is announcement only or not.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead. 

feature -- Change Element  
 
    set_stream_id (a_name: like stream_id)
        -- Set 'stream_id' with 'a_name'.
      do
        stream_id := a_name
      ensure
        stream_id_set: stream_id = a_name		
      end

    set_name (a_name: like name)
        -- Set 'name' with 'a_name'.
      do
        name := a_name
      ensure
        name_set: name = a_name		
      end

    set_description (a_name: like description)
        -- Set 'description' with 'a_name'.
      do
        description := a_name
      ensure
        description_set: description = a_name		
      end

    set_date_created (a_name: like date_created)
        -- Set 'date_created' with 'a_name'.
      do
        date_created := a_name
      ensure
        date_created_set: date_created = a_name		
      end

    set_invite_only (a_name: like invite_only)
        -- Set 'invite_only' with 'a_name'.
      do
        invite_only := a_name
      ensure
        invite_only_set: invite_only = a_name		
      end

    set_rendered_description (a_name: like rendered_description)
        -- Set 'rendered_description' with 'a_name'.
      do
        rendered_description := a_name
      ensure
        rendered_description_set: rendered_description = a_name		
      end

    set_is_web_public (a_name: like is_web_public)
        -- Set 'is_web_public' with 'a_name'.
      do
        is_web_public := a_name
      ensure
        is_web_public_set: is_web_public = a_name		
      end

    set_stream_post_policy (a_name: like stream_post_policy)
        -- Set 'stream_post_policy' with 'a_name'.
      do
        stream_post_policy := a_name
      ensure
        stream_post_policy_set: stream_post_policy = a_name		
      end

    set_message_retention_days (a_name: like message_retention_days)
        -- Set 'message_retention_days' with 'a_name'.
      do
        message_retention_days := a_name
      ensure
        message_retention_days_set: message_retention_days = a_name		
      end

    set_history_public_to_subscribers (a_name: like history_public_to_subscribers)
        -- Set 'history_public_to_subscribers' with 'a_name'.
      do
        history_public_to_subscribers := a_name
      ensure
        history_public_to_subscribers_set: history_public_to_subscribers = a_name		
      end

    set_first_message_id (a_name: like first_message_id)
        -- Set 'first_message_id' with 'a_name'.
      do
        first_message_id := a_name
      ensure
        first_message_id_set: first_message_id = a_name		
      end

    set_is_announcement_only (a_name: like is_announcement_only)
        -- Set 'is_announcement_only' with 'a_name'.
      do
        is_announcement_only := a_name
      ensure
        is_announcement_only_set: is_announcement_only = a_name		
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass BASIC_STREAM_BASE%N")
        if attached stream_id as l_stream_id then
          Result.append ("%Nstream_id:")
          Result.append (l_stream_id.out)
          Result.append ("%N")    
        end  
        if attached name as l_name then
          Result.append ("%Nname:")
          Result.append (l_name.out)
          Result.append ("%N")    
        end  
        if attached description as l_description then
          Result.append ("%Ndescription:")
          Result.append (l_description.out)
          Result.append ("%N")    
        end  
        if attached date_created as l_date_created then
          Result.append ("%Ndate_created:")
          Result.append (l_date_created.out)
          Result.append ("%N")    
        end  
        if attached invite_only as l_invite_only then
          Result.append ("%Ninvite_only:")
          Result.append (l_invite_only.out)
          Result.append ("%N")    
        end  
        if attached rendered_description as l_rendered_description then
          Result.append ("%Nrendered_description:")
          Result.append (l_rendered_description.out)
          Result.append ("%N")    
        end  
        if attached is_web_public as l_is_web_public then
          Result.append ("%Nis_web_public:")
          Result.append (l_is_web_public.out)
          Result.append ("%N")    
        end  
        if attached stream_post_policy as l_stream_post_policy then
          Result.append ("%Nstream_post_policy:")
          Result.append (l_stream_post_policy.out)
          Result.append ("%N")    
        end  
        if attached message_retention_days as l_message_retention_days then
          Result.append ("%Nmessage_retention_days:")
          Result.append (l_message_retention_days.out)
          Result.append ("%N")    
        end  
        if attached history_public_to_subscribers as l_history_public_to_subscribers then
          Result.append ("%Nhistory_public_to_subscribers:")
          Result.append (l_history_public_to_subscribers.out)
          Result.append ("%N")    
        end  
        if attached first_message_id as l_first_message_id then
          Result.append ("%Nfirst_message_id:")
          Result.append (l_first_message_id.out)
          Result.append ("%N")    
        end  
        if attached is_announcement_only as l_is_announcement_only then
          Result.append ("%Nis_announcement_only:")
          Result.append (l_is_announcement_only.out)
          Result.append ("%N")    
        end  
      end
end

