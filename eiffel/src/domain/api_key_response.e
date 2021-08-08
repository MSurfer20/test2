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
class API_KEY_RESPONSE 




feature --Access

    var_result: detachable ANY 
      
    msg: detachable ANY 
      
    api_key: detachable STRING_32 
      -- The API key that can be used to authenticate as the requested user. 
    email: detachable STRING_32 
      -- The email address of the user who owns the API key 

feature -- Change Element  
 
    set_var_result (a_name: like var_result)
        -- Set 'var_result' with 'a_name'.
      do
        var_result := a_name
      ensure
        var_result_set: var_result = a_name		
      end

    set_msg (a_name: like msg)
        -- Set 'msg' with 'a_name'.
      do
        msg := a_name
      ensure
        msg_set: msg = a_name		
      end

    set_api_key (a_name: like api_key)
        -- Set 'api_key' with 'a_name'.
      do
        api_key := a_name
      ensure
        api_key_set: api_key = a_name		
      end

    set_email (a_name: like email)
        -- Set 'email' with 'a_name'.
      do
        email := a_name
      ensure
        email_set: email = a_name		
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass API_KEY_RESPONSE%N")
        if attached var_result as l_var_result then
          Result.append ("%Nvar_result:")
          Result.append (l_var_result.out)
          Result.append ("%N")    
        end  
        if attached msg as l_msg then
          Result.append ("%Nmsg:")
          Result.append (l_msg.out)
          Result.append ("%N")    
        end  
        if attached api_key as l_api_key then
          Result.append ("%Napi_key:")
          Result.append (l_api_key.out)
          Result.append ("%N")    
        end  
        if attached email as l_email then
          Result.append ("%Nemail:")
          Result.append (l_email.out)
          Result.append ("%N")    
        end  
      end
end


