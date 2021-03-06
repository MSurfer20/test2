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
class REALM_EXPORT 




feature --Access

 	id: INTEGER_32 
    	 -- The id of the export. 
 	acting_user_id: INTEGER_32 
    	 -- The id of the user who did the export. 
 	export_time: REAL_32 
    	 -- The UNIX timestamp of when the export was made. 
 	deleted_timestamp: REAL_32 
    	 -- The timestamp of when the export was deleted. Null if it wasn't. 
 	failed_timestamp: REAL_32 
    	 -- The timestamp of when the export failed. Null if it didn't. 
    export_url: detachable STRING_32 
      -- The URL of the export. `null` if there's no URL. 
 	pending: BOOLEAN 
    	 -- Whether the export is pending or not. 

feature -- Change Element  
 
    set_id (a_name: like id)
        -- Set 'id' with 'a_name'.
      do
        id := a_name
      ensure
        id_set: id = a_name		
      end

    set_acting_user_id (a_name: like acting_user_id)
        -- Set 'acting_user_id' with 'a_name'.
      do
        acting_user_id := a_name
      ensure
        acting_user_id_set: acting_user_id = a_name		
      end

    set_export_time (a_name: like export_time)
        -- Set 'export_time' with 'a_name'.
      do
        export_time := a_name
      ensure
        export_time_set: export_time = a_name		
      end

    set_deleted_timestamp (a_name: like deleted_timestamp)
        -- Set 'deleted_timestamp' with 'a_name'.
      do
        deleted_timestamp := a_name
      ensure
        deleted_timestamp_set: deleted_timestamp = a_name		
      end

    set_failed_timestamp (a_name: like failed_timestamp)
        -- Set 'failed_timestamp' with 'a_name'.
      do
        failed_timestamp := a_name
      ensure
        failed_timestamp_set: failed_timestamp = a_name		
      end

    set_export_url (a_name: like export_url)
        -- Set 'export_url' with 'a_name'.
      do
        export_url := a_name
      ensure
        export_url_set: export_url = a_name		
      end

    set_pending (a_name: like pending)
        -- Set 'pending' with 'a_name'.
      do
        pending := a_name
      ensure
        pending_set: pending = a_name		
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass REALM_EXPORT%N")
        if attached id as l_id then
          Result.append ("%Nid:")
          Result.append (l_id.out)
          Result.append ("%N")    
        end  
        if attached acting_user_id as l_acting_user_id then
          Result.append ("%Nacting_user_id:")
          Result.append (l_acting_user_id.out)
          Result.append ("%N")    
        end  
        if attached export_time as l_export_time then
          Result.append ("%Nexport_time:")
          Result.append (l_export_time.out)
          Result.append ("%N")    
        end  
        if attached deleted_timestamp as l_deleted_timestamp then
          Result.append ("%Ndeleted_timestamp:")
          Result.append (l_deleted_timestamp.out)
          Result.append ("%N")    
        end  
        if attached failed_timestamp as l_failed_timestamp then
          Result.append ("%Nfailed_timestamp:")
          Result.append (l_failed_timestamp.out)
          Result.append ("%N")    
        end  
        if attached export_url as l_export_url then
          Result.append ("%Nexport_url:")
          Result.append (l_export_url.out)
          Result.append ("%N")    
        end  
        if attached pending as l_pending then
          Result.append ("%Npending:")
          Result.append (l_pending.out)
          Result.append ("%N")    
        end  
      end
end


