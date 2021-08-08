import 'package:jaguar_serializer/jaguar_serializer.dart';


part 'basic_bot_all_of.jser.dart';

class BasicBotAllOf {
  
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
  

  BasicBotAllOf(
      

{
     this.userId = null,  
     this.fullName = null,  
     this.apiKey = null,  
     this.defaultSendingStream = null,  
     this.defaultEventsRegisterStream = null,  
     this.defaultAllPublicStreams = null,  
     this.avatarUrl = null,  
     this.ownerId = null,  
     this.services = null 
    
    }
  );

  @override
  String toString() {
    return 'BasicBotAllOf[userId=$userId, fullName=$fullName, apiKey=$apiKey, defaultSendingStream=$defaultSendingStream, defaultEventsRegisterStream=$defaultEventsRegisterStream, defaultAllPublicStreams=$defaultAllPublicStreams, avatarUrl=$avatarUrl, ownerId=$ownerId, services=$services, ]';
  }
}

@GenSerializer(nullableFields: true)
class BasicBotAllOfSerializer extends Serializer<BasicBotAllOf> with _$BasicBotAllOfSerializer {

}

