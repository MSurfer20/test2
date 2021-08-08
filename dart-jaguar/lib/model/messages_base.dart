import 'package:jaguar_serializer/jaguar_serializer.dart';


import 'package:openapi/model/emoji_reaction.dart';

import 'package:openapi/model/messages_base_topic_links.dart';

import 'package:openapi/model/one_ofstringarray.dart';

part 'messages_base.jser.dart';

class MessagesBase {
   /* The URL of the user's avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user's email address itself for this user.  */
  @Alias('avatar_url', isNullable: true,  )
  final String avatarUrl;
   /* A Zulip \"client\" string, describing what Zulip client sent the message.  */
  @Alias('client', isNullable: false,  )
  final String client;
   /* The content/body of the message.  */
  @Alias('content', isNullable: false,  )
  final String content;
   /* The HTTP `content_type` for the message content.  This will be `text/html` or `text/x-markdown`, depending on whether `apply_markdown` was set.  */
  @Alias('content_type', isNullable: false,  )
  final String contentType;
   /* Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message.  */
  @Alias('display_recipient', isNullable: false,  )
  final OneOfstringarray displayRecipient;
   /* The unique message ID.  Messages should always be displayed sorted by ID.  */
  @Alias('id', isNullable: false,  )
  final int id;
   /* Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages  */
  @Alias('is_me_message', isNullable: false,  )
  final bool isMeMessage;
   /* Data on any reactions to the message.  */
  @Alias('reactions', isNullable: false,  )
  final List<EmojiReaction> reactions;
   /* A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing.  */
  @Alias('recipient_id', isNullable: false,  )
  final int recipientId;
   /* The Zulip display email address of the message's sender.  */
  @Alias('sender_email', isNullable: false,  )
  final String senderEmail;
   /* The full name of the message's sender.  */
  @Alias('sender_full_name', isNullable: false,  )
  final String senderFullName;
   /* The user ID of the message's sender.  */
  @Alias('sender_id', isNullable: false,  )
  final int senderId;
   /* A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on `example.zulip.com`, this will be `example`.  */
  @Alias('sender_realm_str', isNullable: false,  )
  final String senderRealmStr;
   /* Only present for stream messages; the ID of the stream.  */
  @Alias('stream_id', isNullable: false,  )
  final int streamId;
   /* The `topic` of the message.  Currently always `\"\"` for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \"subjects\" and will eventually change.  */
  @Alias('subject', isNullable: false,  )
  final String subject;
   /* Data on any links to be included in the `topic` line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message's topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called `subject_links`; clients are recommended to rename `subject_links` to `topic_links` if present for compatibility with older Zulip servers.  */
  @Alias('topic_links', isNullable: false,  )
  final List<MessagesBaseTopicLinks> topicLinks;
   /* Data used for certain experimental Zulip integrations.  */
  @Alias('submessages', isNullable: false,  )
  final List<String> submessages;
   /* The UNIX timestamp for when the message was sent, in UTC seconds.  */
  @Alias('timestamp', isNullable: false,  )
  final int timestamp;
   /* The type of the message: `stream` or `private`.  */
  @Alias('type', isNullable: false,  )
  final String type;
  

  MessagesBase(
      

{
     this.avatarUrl = null,  
     this.client = null,  
     this.content = null,  
     this.contentType = null,  
     this.displayRecipient = null,  
     this.id = null,  
     this.isMeMessage = null,  
     this.reactions = const [],  
     this.recipientId = null,  
     this.senderEmail = null,  
     this.senderFullName = null,  
     this.senderId = null,  
     this.senderRealmStr = null,  
     this.streamId = null,  
     this.subject = null,  
     this.topicLinks = const [],  
     this.submessages = const [],  
     this.timestamp = null,  
     this.type = null 
    
    }
  );

  @override
  String toString() {
    return 'MessagesBase[avatarUrl=$avatarUrl, client=$client, content=$content, contentType=$contentType, displayRecipient=$displayRecipient, id=$id, isMeMessage=$isMeMessage, reactions=$reactions, recipientId=$recipientId, senderEmail=$senderEmail, senderFullName=$senderFullName, senderId=$senderId, senderRealmStr=$senderRealmStr, streamId=$streamId, subject=$subject, topicLinks=$topicLinks, submessages=$submessages, timestamp=$timestamp, type=$type, ]';
  }
}

@GenSerializer(nullableFields: true)
class MessagesBaseSerializer extends Serializer<MessagesBase> with _$MessagesBaseSerializer {

}
