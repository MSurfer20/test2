import 'package:jaguar_serializer/jaguar_serializer.dart';


import 'package:openapi/model/one_ofobjectobject.dart';

part 'basic_bot_base.jser.dart';

class BasicBotBase {
   /* The user id of the bot.  */
  @Alias('user_id', isNullable: false,  )
  final int userId;
   /* The full name of the bot.  */
  @Alias('full_name', isNullable: false,  )
  final String fullName;
   /* The API key of the bot which it uses to make API requests.  */
  @Alias('api_key', isNullable: false,  )
  final String apiKey;
   /* The default sending stream of the bot. Null if the bot doesn't have a default sending stream.  */
  @Alias('default_sending_stream', isNullable: true,  )
  final String defaultSendingStream;
   /* The default stream for which the bot receives events/register data. Null if the bot doesn't have such a default stream.  */
  @Alias('default_events_register_stream', isNullable: true,  )
  final String defaultEventsRegisterStream;
   /* Whether the bot can send messages to all streams by default.  */
  @Alias('default_all_public_streams', isNullable: false,  )
  final bool defaultAllPublicStreams;
   /* The URL of the bot's avatar.  */
  @Alias('avatar_url', isNullable: false,  )
  final String avatarUrl;
   /* The user id of the bot's owner.  Null if the bot has no owner.  */
  @Alias('owner_id', isNullable: true,  )
  final int ownerId;
   /* The \"Services\" array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change.  */
  @Alias('services', isNullable: false,  )
  final List<OneOfobjectobject> services;
  

  BasicBotBase(
      

{
     this.userId = null,  
     this.fullName = null,  
     this.apiKey = null,  
     this.defaultSendingStream = null,  
     this.defaultEventsRegisterStream = null,  
     this.defaultAllPublicStreams = null,  
     this.avatarUrl = null,  
     this.ownerId = null,  
     this.services = const [] 
    
    }
  );

  @override
  String toString() {
    return 'BasicBotBase[userId=$userId, fullName=$fullName, apiKey=$apiKey, defaultSendingStream=$defaultSendingStream, defaultEventsRegisterStream=$defaultEventsRegisterStream, defaultAllPublicStreams=$defaultAllPublicStreams, avatarUrl=$avatarUrl, ownerId=$ownerId, services=$services, ]';
  }
}

@GenSerializer(nullableFields: true)
class BasicBotBaseSerializer extends Serializer<BasicBotBase> with _$BasicBotBaseSerializer {

}

