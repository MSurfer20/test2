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
class DRAFT 




feature --Access

 	id: INTEGER_32 
    	 -- The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited. 
    type: detachable STRING_32 
      -- The type of the draft. Either unaddressed (empty string), \"stream\", or \"private\" (for PMs and private group messages). 
 	to: detachable LIST [INTEGER_32] 
    	 -- An array of the tentative target audience IDs. For \"stream\" messages, this should contain exactly 1 ID, the ID of the target stream. For private messages, this should be an array of target user IDs. For unaddressed drafts, this is ignored, and clients should send an empty array. 
    topic: detachable STRING_32 
      -- For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes. 
    content: detachable STRING_32 
      -- The body of the draft. Should not contain null bytes. 
 	timestamp: REAL_32 
    	 -- A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server. 

feature -- Change Element  
 
    set_id (a_name: like id)
        -- Set 'id' with 'a_name'.
      do
        id := a_name
      ensure
        id_set: id = a_name		
      end

    set_type (a_name: like type)
        -- Set 'type' with 'a_name'.
      do
        type := a_name
      ensure
        type_set: type = a_name		
      end

    set_to (a_name: like to)
        -- Set 'to' with 'a_name'.
      do
        to := a_name
      ensure
        to_set: to = a_name		
      end

    set_topic (a_name: like topic)
        -- Set 'topic' with 'a_name'.
      do
        topic := a_name
      ensure
        topic_set: topic = a_name		
      end

    set_content (a_name: like content)
        -- Set 'content' with 'a_name'.
      do
        content := a_name
      ensure
        content_set: content = a_name		
      end

    set_timestamp (a_name: like timestamp)
        -- Set 'timestamp' with 'a_name'.
      do
        timestamp := a_name
      ensure
        timestamp_set: timestamp = a_name		
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass DRAFT%N")
        if attached id as l_id then
          Result.append ("%Nid:")
          Result.append (l_id.out)
          Result.append ("%N")    
        end  
        if attached type as l_type then
          Result.append ("%Ntype:")
          Result.append (l_type.out)
          Result.append ("%N")    
        end  
        if attached to as l_to then
          across l_to as ic loop
            Result.append ("%N to:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end 
        if attached topic as l_topic then
          Result.append ("%Ntopic:")
          Result.append (l_topic.out)
          Result.append ("%N")    
        end  
        if attached content as l_content then
          Result.append ("%Ncontent:")
          Result.append (l_content.out)
          Result.append ("%N")    
        end  
        if attached timestamp as l_timestamp then
          Result.append ("%Ntimestamp:")
          Result.append (l_timestamp.out)
          Result.append ("%N")    
        end  
      end
end


