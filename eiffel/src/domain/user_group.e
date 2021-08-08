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
class USER_GROUP 




feature --Access

    name: detachable STRING_32 
      -- The name of the user group. 
    description: detachable STRING_32 
      -- The description of the user group. 
 	members: detachable LIST [INTEGER_32] 
    	 -- Array containing the id of the users who are members of this user group. 
 	id: INTEGER_32 
    	 -- The ID of the user group. 

feature -- Change Element  
 
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

    set_members (a_name: like members)
        -- Set 'members' with 'a_name'.
      do
        members := a_name
      ensure
        members_set: members = a_name		
      end

    set_id (a_name: like id)
        -- Set 'id' with 'a_name'.
      do
        id := a_name
      ensure
        id_set: id = a_name		
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass USER_GROUP%N")
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
        if attached members as l_members then
          across l_members as ic loop
            Result.append ("%N members:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end 
        if attached id as l_id then
          Result.append ("%Nid:")
          Result.append (l_id.out)
          Result.append ("%N")    
        end  
      end
end

