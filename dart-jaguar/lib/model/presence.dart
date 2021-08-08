import 'package:jaguar_serializer/jaguar_serializer.dart';


part 'presence.jser.dart';

class Presence {
   /* The client's platform name.  */
  @Alias('client', isNullable: false,  )
  final String client;
   /* The status of the user on this client. It is either `idle` or `active`.  */
  @Alias('status', isNullable: false,
          
  )
  final String status;
  //enum statusEnum {  idle,  active,  }; /* The UNIX timestamp of when this client sent the user's presence to the server with the precision of a second.  */
  @Alias('timestamp', isNullable: false,  )
  final int timestamp;
   /* Whether the client is capable of showing mobile/push notifications to the user.  */
  @Alias('pushable', isNullable: false,  )
  final bool pushable;
  

  Presence(
      

{
     this.client = null,  
     this.status = null,  
     this.timestamp = null,  
     this.pushable = null 
    
    }
  );

  @override
  String toString() {
    return 'Presence[client=$client, status=$status, timestamp=$timestamp, pushable=$pushable, ]';
  }
}

@GenSerializer(nullableFields: true)
class PresenceSerializer extends Serializer<Presence> with _$PresenceSerializer {

}

