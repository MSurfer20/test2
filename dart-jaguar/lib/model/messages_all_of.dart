import 'package:jaguar_serializer/jaguar_serializer.dart';


part 'messages_all_of.jser.dart';

class MessagesAllOf {
  
  @Alias('avatar_url', isNullable: true,  )
  final Object avatarUrl;
  
  @Alias('client', isNullable: true,  )
  final Object client;
  
  @Alias('content', isNullable: true,  )
  final Object content;
  
  @Alias('content_type', isNullable: true,  )
  final Object contentType;
  
  @Alias('display_recipient', isNullable: true,  )
  final Object displayRecipient;
  
  @Alias('id', isNullable: true,  )
  final Object id;
  
  @Alias('is_me_message', isNullable: true,  )
  final Object isMeMessage;
  
  @Alias('reactions', isNullable: true,  )
  final Object reactions;
  
  @Alias('recipient_id', isNullable: true,  )
  final Object recipientId;
  
  @Alias('sender_email', isNullable: true,  )
  final Object senderEmail;
  
  @Alias('sender_full_name', isNullable: true,  )
  final Object senderFullName;
  
  @Alias('sender_id', isNullable: true,  )
  final Object senderId;
  
  @Alias('sender_realm_str', isNullable: true,  )
  final Object senderRealmStr;
  
  @Alias('stream_id', isNullable: true,  )
  final Object streamId;
  
  @Alias('subject', isNullable: true,  )
  final Object subject;
  
  @Alias('topic_links', isNullable: true,  )
  final Object topicLinks;
  
  @Alias('submessages', isNullable: true,  )
  final Object submessages;
  
  @Alias('timestamp', isNullable: true,  )
  final Object timestamp;
  
  @Alias('type', isNullable: true,  )
  final Object type;
  

  MessagesAllOf(
      

{
     this.avatarUrl = null,  
     this.client = null,  
     this.content = null,  
     this.contentType = null,  
     this.displayRecipient = null,  
     this.id = null,  
     this.isMeMessage = null,  
     this.reactions = null,  
     this.recipientId = null,  
     this.senderEmail = null,  
     this.senderFullName = null,  
     this.senderId = null,  
     this.senderRealmStr = null,  
     this.streamId = null,  
     this.subject = null,  
     this.topicLinks = null,  
     this.submessages = null,  
     this.timestamp = null,  
     this.type = null 
    
    }
  );

  @override
  String toString() {
    return 'MessagesAllOf[avatarUrl=$avatarUrl, client=$client, content=$content, contentType=$contentType, displayRecipient=$displayRecipient, id=$id, isMeMessage=$isMeMessage, reactions=$reactions, recipientId=$recipientId, senderEmail=$senderEmail, senderFullName=$senderFullName, senderId=$senderId, senderRealmStr=$senderRealmStr, streamId=$streamId, subject=$subject, topicLinks=$topicLinks, submessages=$submessages, timestamp=$timestamp, type=$type, ]';
  }
}

@GenSerializer(nullableFields: true)
class MessagesAllOfSerializer extends Serializer<MessagesAllOf> with _$MessagesAllOfSerializer {

}

