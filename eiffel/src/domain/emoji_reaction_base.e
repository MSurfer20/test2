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
class EMOJI_REACTION_BASE 




feature --Access

    emoji_code: detachable STRING_32 
      -- A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji. 
    emoji_name: detachable STRING_32 
      -- Name of the emoji. 
    reaction_type: detachable STRING_32 
      -- One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. 
 	user_id: INTEGER_32 
    	 -- The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future. 
    user: detachable EMOJI_REACTION_BASE_ALL_OF_USER 
      

feature -- Change Element  
 
    set_emoji_code (a_name: like emoji_code)
        -- Set 'emoji_code' with 'a_name'.
      do
        emoji_code := a_name
      ensure
        emoji_code_set: emoji_code = a_name		
      end

    set_emoji_name (a_name: like emoji_name)
        -- Set 'emoji_name' with 'a_name'.
      do
        emoji_name := a_name
      ensure
        emoji_name_set: emoji_name = a_name		
      end

    set_reaction_type (a_name: like reaction_type)
        -- Set 'reaction_type' with 'a_name'.
      do
        reaction_type := a_name
      ensure
        reaction_type_set: reaction_type = a_name		
      end

    set_user_id (a_name: like user_id)
        -- Set 'user_id' with 'a_name'.
      do
        user_id := a_name
      ensure
        user_id_set: user_id = a_name		
      end

    set_user (a_name: like user)
        -- Set 'user' with 'a_name'.
      do
        user := a_name
      ensure
        user_set: user = a_name		
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass EMOJI_REACTION_BASE%N")
        if attached emoji_code as l_emoji_code then
          Result.append ("%Nemoji_code:")
          Result.append (l_emoji_code.out)
          Result.append ("%N")    
        end  
        if attached emoji_name as l_emoji_name then
          Result.append ("%Nemoji_name:")
          Result.append (l_emoji_name.out)
          Result.append ("%N")    
        end  
        if attached reaction_type as l_reaction_type then
          Result.append ("%Nreaction_type:")
          Result.append (l_reaction_type.out)
          Result.append ("%N")    
        end  
        if attached user_id as l_user_id then
          Result.append ("%Nuser_id:")
          Result.append (l_user_id.out)
          Result.append ("%N")    
        end  
        if attached user as l_user then
          Result.append ("%Nuser:")
          Result.append (l_user.out)
          Result.append ("%N")    
        end  
      end
end


