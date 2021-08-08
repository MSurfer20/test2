import 'package:jaguar_serializer/jaguar_serializer.dart';


import 'package:openapi/model/messages_base.dart';

part 'inline_response200.jser.dart';

class InlineResponse200 {
   /* Email of the bot user.  */
  @Alias('bot_email', isNullable: false,  )
  final String botEmail;
   /* The full name of the bot user.  */
  @Alias('bot_full_name', isNullable: false,  )
  final String botFullName;
   /* The message content, in raw Markdown format (not rendered to HTML).  */
  @Alias('data', isNullable: false,  )
  final String data;
   /* What aspect of the message triggered the outgoing webhook notification. Possible values include `private_message` and `mention`.  */
  @Alias('trigger', isNullable: false,  )
  final String trigger;
   /* A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the `zuliprc` file downloaded when creating the bot.  */
  @Alias('token', isNullable: false,  )
  final String token;
   /* A dict containing details on the message that triggered the outgoing webhook, in the format used by [`GET /messages`](/api/get-messages).  */
  @Alias('message', isNullable: false,  )
  final MessagesBase message;
  

  InlineResponse200(
      

{
     this.botEmail = null,  
     this.botFullName = null,  
     this.data = null,  
     this.trigger = null,  
     this.token = null,  
     this.message = null 
    
    }
  );

  @override
  String toString() {
    return 'InlineResponse200[botEmail=$botEmail, botFullName=$botFullName, data=$data, trigger=$trigger, token=$token, message=$message, ]';
  }
}

@GenSerializer(nullableFields: true)
class InlineResponse200Serializer extends Serializer<InlineResponse200> with _$InlineResponse200Serializer {

}

