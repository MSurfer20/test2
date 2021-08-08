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
class REALM_EMOJI 




feature --Access

    id: detachable STRING_32 
      -- The ID for this emoji, same as the object's key. 
    name: detachable STRING_32 
      -- The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (`:name  :`). 
    source_url: detachable STRING_32 
      -- The path relative to the organization's URL where the emoji's image can be found. 
 	deactivated: BOOLEAN 
    	 -- Whether the emoji has been deactivated or not. 
 	author_id: INTEGER_32 
    	 -- The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and `author` object with an `id` field. 

feature -- Change Element  
 
    set_id (a_name: like id)
        -- Set 'id' with 'a_name'.
      do
        id := a_name
      ensure
        id_set: id = a_name		
      end

    set_name (a_name: like name)
        -- Set 'name' with 'a_name'.
      do
        name := a_name
      ensure
        name_set: name = a_name		
      end

    set_source_url (a_name: like source_url)
        -- Set 'source_url' with 'a_name'.
      do
        source_url := a_name
      ensure
        source_url_set: source_url = a_name		
      end

    set_deactivated (a_name: like deactivated)
        -- Set 'deactivated' with 'a_name'.
      do
        deactivated := a_name
      ensure
        deactivated_set: deactivated = a_name		
      end

    set_author_id (a_name: like author_id)
        -- Set 'author_id' with 'a_name'.
      do
        author_id := a_name
      ensure
        author_id_set: author_id = a_name		
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass REALM_EMOJI%N")
        if attached id as l_id then
          Result.append ("%Nid:")
          Result.append (l_id.out)
          Result.append ("%N")    
        end  
        if attached name as l_name then
          Result.append ("%Nname:")
          Result.append (l_name.out)
          Result.append ("%N")    
        end  
        if attached source_url as l_source_url then
          Result.append ("%Nsource_url:")
          Result.append (l_source_url.out)
          Result.append ("%N")    
        end  
        if attached deactivated as l_deactivated then
          Result.append ("%Ndeactivated:")
          Result.append (l_deactivated.out)
          Result.append ("%N")    
        end  
        if attached author_id as l_author_id then
          Result.append ("%Nauthor_id:")
          Result.append (l_author_id.out)
          Result.append ("%N")    
        end  
      end
end


