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
class INLINE_RESPONSE_200 




feature --Access

    bot_email: detachable STRING_32 
      -- Email of the bot user. 
    bot_full_name: detachable STRING_32 
      -- The full name of the bot user. 
    data: detachable STRING_32 
      -- The message content, in raw Markdown format (not rendered to HTML). 
    trigger: detachable STRING_32 
      -- What aspect of the message triggered the outgoing webhook notification. Possible values include `private_message` and `mention`. 
    token: detachable STRING_32 
      -- A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the `zuliprc` file downloaded when creating the bot. 
    message: detachable MESSAGES_BASE 
      -- A dict containing details on the message that triggered the outgoing webhook, in the format used by [`GET /messages`](/api/get-messages). 

feature -- Change Element  
 
    set_bot_email (a_name: like bot_email)
        -- Set 'bot_email' with 'a_name'.
      do
        bot_email := a_name
      ensure
        bot_email_set: bot_email = a_name		
      end

    set_bot_full_name (a_name: like bot_full_name)
        -- Set 'bot_full_name' with 'a_name'.
      do
        bot_full_name := a_name
      ensure
        bot_full_name_set: bot_full_name = a_name		
      end

    set_data (a_name: like data)
        -- Set 'data' with 'a_name'.
      do
        data := a_name
      ensure
        data_set: data = a_name		
      end

    set_trigger (a_name: like trigger)
        -- Set 'trigger' with 'a_name'.
      do
        trigger := a_name
      ensure
        trigger_set: trigger = a_name		
      end

    set_token (a_name: like token)
        -- Set 'token' with 'a_name'.
      do
        token := a_name
      ensure
        token_set: token = a_name		
      end

    set_message (a_name: like message)
        -- Set 'message' with 'a_name'.
      do
        message := a_name
      ensure
        message_set: message = a_name		
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass INLINE_RESPONSE_200%N")
        if attached bot_email as l_bot_email then
          Result.append ("%Nbot_email:")
          Result.append (l_bot_email.out)
          Result.append ("%N")    
        end  
        if attached bot_full_name as l_bot_full_name then
          Result.append ("%Nbot_full_name:")
          Result.append (l_bot_full_name.out)
          Result.append ("%N")    
        end  
        if attached data as l_data then
          Result.append ("%Ndata:")
          Result.append (l_data.out)
          Result.append ("%N")    
        end  
        if attached trigger as l_trigger then
          Result.append ("%Ntrigger:")
          Result.append (l_trigger.out)
          Result.append ("%N")    
        end  
        if attached token as l_token then
          Result.append ("%Ntoken:")
          Result.append (l_token.out)
          Result.append ("%N")    
        end  
        if attached message as l_message then
          Result.append ("%Nmessage:")
          Result.append (l_message.out)
          Result.append ("%N")    
        end  
      end
end

