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
class JSON_ERROR_BASE_ALL_OF 




feature --Access

    var_result: detachable STRING_32 
      
    msg: detachable STRING_32 
      

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


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass JSON_ERROR_BASE_ALL_OF%N")
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
      end
end


