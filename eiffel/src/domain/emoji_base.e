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
class EMOJI_BASE 




feature --Access

    emoji_code: detachable STRING_32 
      -- A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji. 
    emoji_name: detachable STRING_32 
      -- Name of the emoji. 
    reaction_type: detachable STRING_32 
      -- One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. 

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


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass EMOJI_BASE%N")
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
      end
end


