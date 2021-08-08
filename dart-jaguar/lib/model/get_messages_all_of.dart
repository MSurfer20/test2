import 'package:jaguar_serializer/jaguar_serializer.dart';


part 'get_messages_all_of.jser.dart';

class GetMessagesAllOf {
  
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
   /* The user's [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags  */
  @Alias('flags', isNullable: false,  )
  final List<String> flags;
   /* The UNIX timestamp for when the message was last edited, in UTC seconds.  */
  @Alias('last_edit_timestamp', isNullable: false,  )
  final int lastEditTimestamp;
   /* Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords.  */
  @Alias('match_content', isNullable: false,  )
  final String matchContent;
   /* Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords.  */
  @Alias('match_subject', isNullable: false,  )
  final String matchSubject;
  

  GetMessagesAllOf(
      

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
     this.type = null,  
     this.flags = const [],  
     this.lastEditTimestamp = null,  
     this.matchContent = null,  
     this.matchSubject = null 
    
    }
  );

  @override
  String toString() {
    return 'GetMessagesAllOf[avatarUrl=$avatarUrl, client=$client, content=$content, contentType=$contentType, displayRecipient=$displayRecipient, id=$id, isMeMessage=$isMeMessage, reactions=$reactions, recipientId=$recipientId, senderEmail=$senderEmail, senderFullName=$senderFullName, senderId=$senderId, senderRealmStr=$senderRealmStr, streamId=$streamId, subject=$subject, topicLinks=$topicLinks, submessages=$submessages, timestamp=$timestamp, type=$type, flags=$flags, lastEditTimestamp=$lastEditTimestamp, matchContent=$matchContent, matchSubject=$matchSubject, ]';
  }
}

@GenSerializer(nullableFields: true)
class GetMessagesAllOfSerializer extends Serializer<GetMessagesAllOf> with _$GetMessagesAllOfSerializer {

}

