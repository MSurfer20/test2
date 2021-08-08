import 'package:jaguar_serializer/jaguar_serializer.dart';


part 'bot_all_of.jser.dart';

class BotAllOf {
  
  @Alias('user_id', isNullable: true,  )
  final Object userId;
  
  @Alias('full_name', isNullable: true,  )
  final Object fullName;
  
  @Alias('api_key', isNullable: true,  )
  final Object apiKey;
  
  @Alias('default_sending_stream', isNullable: true,  )
  final Object defaultSendingStream;
  
  @Alias('default_events_register_stream', isNullable: true,  )
  final Object defaultEventsRegisterStream;
  
  @Alias('default_all_public_streams', isNullable: true,  )
  final Object defaultAllPublicStreams;
  
  @Alias('avatar_url', isNullable: true,  )
  final Object avatarUrl;
  
  @Alias('owner_id', isNullable: true,  )
  final Object ownerId;
  
  @Alias('services', isNullable: true,  )
  final Object services;
   /* The email of the bot.  */
  @Alias('email', isNullable: false,  )
  final String email;
   /* An integer describing the type of bot: * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot.  */
  @Alias('bot_type', isNullable: true,  )
  final int botType;
   /* A boolean describing whether the user account has been deactivated.  */
  @Alias('is_active', isNullable: false,  )
  final bool isActive;
  

  BotAllOf(
      

{
     this.userId = null,  
     this.fullName = null,  
     this.apiKey = null,  
     this.defaultSendingStream = null,  
     this.defaultEventsRegisterStream = null,  
     this.defaultAllPublicStreams = null,  
     this.avatarUrl = null,  
     this.ownerId = null,  
     this.services = null,  
     this.email = null,  
     this.botType = null,  
     this.isActive = null 
    
    }
  );

  @override
  String toString() {
    return 'BotAllOf[userId=$userId, fullName=$fullName, apiKey=$apiKey, defaultSendingStream=$defaultSendingStream, defaultEventsRegisterStream=$defaultEventsRegisterStream, defaultAllPublicStreams=$defaultAllPublicStreams, avatarUrl=$avatarUrl, ownerId=$ownerId, services=$services, email=$email, botType=$botType, isActive=$isActive, ]';
  }
}

@GenSerializer(nullableFields: true)
class BotAllOfSerializer extends Serializer<BotAllOf> with _$BotAllOfSerializer {

}

