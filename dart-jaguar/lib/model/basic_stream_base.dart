import 'package:jaguar_serializer/jaguar_serializer.dart';


part 'basic_stream_base.jser.dart';

class BasicStreamBase {
   /* The unique ID of the stream.  */
  @Alias('stream_id', isNullable: false,  )
  final int streamId;
   /* The name of the stream.  */
  @Alias('name', isNullable: false,  )
  final String name;
   /* The short description of the stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description.  */
  @Alias('description', isNullable: false,  )
  final String description;
   /* The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30).  */
  @Alias('date_created', isNullable: false,  )
  final int dateCreated;
   /* Specifies whether the stream is private or not. Only people who have been invited can access a private stream.  */
  @Alias('invite_only', isNullable: false,  )
  final bool inviteOnly;
   /* The short description of the stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message.  */
  @Alias('rendered_description', isNullable: false,  )
  final String renderedDescription;
   /* Whether the stream has been configured to allow unauthenticated access to its message history from the web.  */
  @Alias('is_web_public', isNullable: false,  )
  final bool isWebPublic;
   /* Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean.  */
  @Alias('stream_post_policy', isNullable: false,  )
  final int streamPostPolicy;
   /* Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17).  */
  @Alias('message_retention_days', isNullable: true,  )
  final int messageRetentionDays;
   /* Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future.  */
  @Alias('history_public_to_subscribers', isNullable: false,  )
  final bool historyPublicToSubscribers;
   /* The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history.  */
  @Alias('first_message_id', isNullable: true,  )
  final int firstMessageId;
   /* Whether the given stream is announcement only or not.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead.  */
  @Alias('is_announcement_only', isNullable: false,  )
  final bool isAnnouncementOnly;
  

  BasicStreamBase(
      

{
     this.streamId = null,  
     this.name = null,  
     this.description = null,  
     this.dateCreated = null,  
     this.inviteOnly = null,  
     this.renderedDescription = null,  
     this.isWebPublic = null,  
     this.streamPostPolicy = null,  
     this.messageRetentionDays = null,  
     this.historyPublicToSubscribers = null,  
     this.firstMessageId = null,  
     this.isAnnouncementOnly = null 
    
    }
  );

  @override
  String toString() {
    return 'BasicStreamBase[streamId=$streamId, name=$name, description=$description, dateCreated=$dateCreated, inviteOnly=$inviteOnly, renderedDescription=$renderedDescription, isWebPublic=$isWebPublic, streamPostPolicy=$streamPostPolicy, messageRetentionDays=$messageRetentionDays, historyPublicToSubscribers=$historyPublicToSubscribers, firstMessageId=$firstMessageId, isAnnouncementOnly=$isAnnouncementOnly, ]';
  }
}

@GenSerializer(nullableFields: true)
class BasicStreamBaseSerializer extends Serializer<BasicStreamBase> with _$BasicStreamBaseSerializer {

}

