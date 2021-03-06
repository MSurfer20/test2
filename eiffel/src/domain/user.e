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
class USER 




feature --Access

    email: detachable ANY 
      
    is_bot: detachable ANY 
      
    avatar_url: detachable ANY 
      
    avatar_version: detachable ANY 
      
    full_name: detachable ANY 
      
    is_admin: detachable ANY 
      
    is_owner: detachable ANY 
      
    is_billing_admin: detachable ANY 
      
    role: detachable ANY 
      
    bot_type: detachable ANY 
      
    user_id: detachable ANY 
      
    bot_owner_id: detachable ANY 
      
    is_active: detachable ANY 
      
    is_guest: detachable ANY 
      
    timezone: detachable ANY 
      
    date_joined: detachable ANY 
      
    delivery_email: detachable ANY 
      
    profile_data: detachable ANY 
      

feature -- Change Element  
 
    set_email (a_name: like email)
        -- Set 'email' with 'a_name'.
      do
        email := a_name
      ensure
        email_set: email = a_name		
      end

    set_is_bot (a_name: like is_bot)
        -- Set 'is_bot' with 'a_name'.
      do
        is_bot := a_name
      ensure
        is_bot_set: is_bot = a_name		
      end

    set_avatar_url (a_name: like avatar_url)
        -- Set 'avatar_url' with 'a_name'.
      do
        avatar_url := a_name
      ensure
        avatar_url_set: avatar_url = a_name		
      end

    set_avatar_version (a_name: like avatar_version)
        -- Set 'avatar_version' with 'a_name'.
      do
        avatar_version := a_name
      ensure
        avatar_version_set: avatar_version = a_name		
      end

    set_full_name (a_name: like full_name)
        -- Set 'full_name' with 'a_name'.
      do
        full_name := a_name
      ensure
        full_name_set: full_name = a_name		
      end

    set_is_admin (a_name: like is_admin)
        -- Set 'is_admin' with 'a_name'.
      do
        is_admin := a_name
      ensure
        is_admin_set: is_admin = a_name		
      end

    set_is_owner (a_name: like is_owner)
        -- Set 'is_owner' with 'a_name'.
      do
        is_owner := a_name
      ensure
        is_owner_set: is_owner = a_name		
      end

    set_is_billing_admin (a_name: like is_billing_admin)
        -- Set 'is_billing_admin' with 'a_name'.
      do
        is_billing_admin := a_name
      ensure
        is_billing_admin_set: is_billing_admin = a_name		
      end

    set_role (a_name: like role)
        -- Set 'role' with 'a_name'.
      do
        role := a_name
      ensure
        role_set: role = a_name		
      end

    set_bot_type (a_name: like bot_type)
        -- Set 'bot_type' with 'a_name'.
      do
        bot_type := a_name
      ensure
        bot_type_set: bot_type = a_name		
      end

    set_user_id (a_name: like user_id)
        -- Set 'user_id' with 'a_name'.
      do
        user_id := a_name
      ensure
        user_id_set: user_id = a_name		
      end

    set_bot_owner_id (a_name: like bot_owner_id)
        -- Set 'bot_owner_id' with 'a_name'.
      do
        bot_owner_id := a_name
      ensure
        bot_owner_id_set: bot_owner_id = a_name		
      end

    set_is_active (a_name: like is_active)
        -- Set 'is_active' with 'a_name'.
      do
        is_active := a_name
      ensure
        is_active_set: is_active = a_name		
      end

    set_is_guest (a_name: like is_guest)
        -- Set 'is_guest' with 'a_name'.
      do
        is_guest := a_name
      ensure
        is_guest_set: is_guest = a_name		
      end

    set_timezone (a_name: like timezone)
        -- Set 'timezone' with 'a_name'.
      do
        timezone := a_name
      ensure
        timezone_set: timezone = a_name		
      end

    set_date_joined (a_name: like date_joined)
        -- Set 'date_joined' with 'a_name'.
      do
        date_joined := a_name
      ensure
        date_joined_set: date_joined = a_name		
      end

    set_delivery_email (a_name: like delivery_email)
        -- Set 'delivery_email' with 'a_name'.
      do
        delivery_email := a_name
      ensure
        delivery_email_set: delivery_email = a_name		
      end

    set_profile_data (a_name: like profile_data)
        -- Set 'profile_data' with 'a_name'.
      do
        profile_data := a_name
      ensure
        profile_data_set: profile_data = a_name		
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass USER%N")
        if attached email as l_email then
          Result.append ("%Nemail:")
          Result.append (l_email.out)
          Result.append ("%N")    
        end  
        if attached is_bot as l_is_bot then
          Result.append ("%Nis_bot:")
          Result.append (l_is_bot.out)
          Result.append ("%N")    
        end  
        if attached avatar_url as l_avatar_url then
          Result.append ("%Navatar_url:")
          Result.append (l_avatar_url.out)
          Result.append ("%N")    
        end  
        if attached avatar_version as l_avatar_version then
          Result.append ("%Navatar_version:")
          Result.append (l_avatar_version.out)
          Result.append ("%N")    
        end  
        if attached full_name as l_full_name then
          Result.append ("%Nfull_name:")
          Result.append (l_full_name.out)
          Result.append ("%N")    
        end  
        if attached is_admin as l_is_admin then
          Result.append ("%Nis_admin:")
          Result.append (l_is_admin.out)
          Result.append ("%N")    
        end  
        if attached is_owner as l_is_owner then
          Result.append ("%Nis_owner:")
          Result.append (l_is_owner.out)
          Result.append ("%N")    
        end  
        if attached is_billing_admin as l_is_billing_admin then
          Result.append ("%Nis_billing_admin:")
          Result.append (l_is_billing_admin.out)
          Result.append ("%N")    
        end  
        if attached role as l_role then
          Result.append ("%Nrole:")
          Result.append (l_role.out)
          Result.append ("%N")    
        end  
        if attached bot_type as l_bot_type then
          Result.append ("%Nbot_type:")
          Result.append (l_bot_type.out)
          Result.append ("%N")    
        end  
        if attached user_id as l_user_id then
          Result.append ("%Nuser_id:")
          Result.append (l_user_id.out)
          Result.append ("%N")    
        end  
        if attached bot_owner_id as l_bot_owner_id then
          Result.append ("%Nbot_owner_id:")
          Result.append (l_bot_owner_id.out)
          Result.append ("%N")    
        end  
        if attached is_active as l_is_active then
          Result.append ("%Nis_active:")
          Result.append (l_is_active.out)
          Result.append ("%N")    
        end  
        if attached is_guest as l_is_guest then
          Result.append ("%Nis_guest:")
          Result.append (l_is_guest.out)
          Result.append ("%N")    
        end  
        if attached timezone as l_timezone then
          Result.append ("%Ntimezone:")
          Result.append (l_timezone.out)
          Result.append ("%N")    
        end  
        if attached date_joined as l_date_joined then
          Result.append ("%Ndate_joined:")
          Result.append (l_date_joined.out)
          Result.append ("%N")    
        end  
        if attached delivery_email as l_delivery_email then
          Result.append ("%Ndelivery_email:")
          Result.append (l_delivery_email.out)
          Result.append ("%N")    
        end  
        if attached profile_data as l_profile_data then
          Result.append ("%Nprofile_data:")
          Result.append (l_profile_data.out)
          Result.append ("%N")    
        end  
      end
end


