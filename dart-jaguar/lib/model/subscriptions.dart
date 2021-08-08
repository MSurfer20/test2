import 'package:jaguar_serializer/jaguar_serializer.dart';


part 'subscriptions.jser.dart';

class Subscriptions {
   /* The unique ID of a stream.  */
  @Alias('stream_id', isNullable: false,  )
  final int streamId;
   /* The name of a stream.  */
  @Alias('name', isNullable: false,  )
  final String name;
   /* The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description.  */
  @Alias('description', isNullable: false,  )
  final String description;
   /* A short description of a stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message.  */
  @Alias('rendered_description', isNullable: false,  )
  final String renderedDescription;
   /* The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30).  */
  @Alias('date_created', isNullable: false,  )
  final int dateCreated;
   /* Specifies whether the stream is private or not. Only people who have been invited can access a private stream.  */
  @Alias('invite_only', isNullable: false,  )
  final bool inviteOnly;
   /* A list of user IDs of users who are also subscribed to a given stream. Included only if `include_subscribers` is `true`.  */
  @Alias('subscribers', isNullable: false,  )
  final List<int> subscribers;
   /* A boolean specifying whether desktop notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_desktop_notifications, for this stream.  */
  @Alias('desktop_notifications', isNullable: true,  )
  final bool desktopNotifications;
   /* A boolean specifying whether email notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_email_notifications, for this stream.  */
  @Alias('email_notifications', isNullable: true,  )
  final bool emailNotifications;
   /* A boolean specifying whether wildcard mentions trigger notifications as though they were personal mentions in this stream.  A null value means the value of this setting should be inherited from the user-level default setting, wildcard_mentions_notify, for this stream.  */
  @Alias('wildcard_mentions_notify', isNullable: true,  )
  final bool wildcardMentionsNotify;
   /* A boolean specifying whether push notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_push_notifications, for this stream.  */
  @Alias('push_notifications', isNullable: true,  )
  final bool pushNotifications;
   /* A boolean specifying whether audible notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_audible_notifications, for this stream.  */
  @Alias('audible_notifications', isNullable: true,  )
  final bool audibleNotifications;
   /* A boolean specifying whether the given stream has been pinned to the top.  */
  @Alias('pin_to_top', isNullable: false,  )
  final bool pinToTop;
   /* Email address of the given stream, used for [sending emails to the stream](/help/message-a-stream-by-email).  */
  @Alias('email_address', isNullable: false,  )
  final String emailAddress;
   /* Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in `All messages` view (previously known as `Home` view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named `in_home_view` (with the opposite value, `in_home_view=!is_muted`).  */
  @Alias('is_muted', isNullable: false,  )
  final bool isMuted;
   /* Legacy property for if the given stream is muted, with inverted meeting.  **Deprecated**; clients should use is_muted where available.  */
  @Alias('in_home_view', isNullable: false,  )
  final bool inHomeView;
   /* Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead.  */
  @Alias('is_announcement_only', isNullable: false,  )
  final bool isAnnouncementOnly;
   /* Whether the stream has been configured to allow unauthenticated access to its message history from the web.  */
  @Alias('is_web_public', isNullable: false,  )
  final bool isWebPublic;
   /* The user's role within the stream (distinct from the user's [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 => Stream administrator. * 50 => Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31).  */
  @Alias('role', isNullable: false,
          
             processor:  const intFieldProcessor(),
          
  )
  final int role;
  //enum roleEnum {  20,  50,  }; /* The user's personal color for the stream.  */
  @Alias('color', isNullable: false,  )
  final String color;
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
   /* The average number of messages sent to the stream in recent weeks, rounded to the nearest integer.  Null means the stream was recently created and there is insufficient data to estimate the average traffic.  */
  @Alias('stream_weekly_traffic', isNullable: true,  )
  final int streamWeeklyTraffic;
  

  Subscriptions(
      

{
     this.streamId = null,  
     this.name = null,  
     this.description = null,  
     this.renderedDescription = null,  
     this.dateCreated = null,  
     this.inviteOnly = null,  
     this.subscribers = const [],  
     this.desktopNotifications = null,  
     this.emailNotifications = null,  
     this.wildcardMentionsNotify = null,  
     this.pushNotifications = null,  
     this.audibleNotifications = null,  
     this.pinToTop = null,  
     this.emailAddress = null,  
     this.isMuted = null,  
     this.inHomeView = null,  
     this.isAnnouncementOnly = null,  
     this.isWebPublic = null,  
     this.role = null,  
     this.color = null,  
     this.streamPostPolicy = null,  
     this.messageRetentionDays = null,  
     this.historyPublicToSubscribers = null,  
     this.firstMessageId = null,  
     this.streamWeeklyTraffic = null 
    
    }
  );

  @override
  String toString() {
    return 'Subscriptions[streamId=$streamId, name=$name, description=$description, renderedDescription=$renderedDescription, dateCreated=$dateCreated, inviteOnly=$inviteOnly, subscribers=$subscribers, desktopNotifications=$desktopNotifications, emailNotifications=$emailNotifications, wildcardMentionsNotify=$wildcardMentionsNotify, pushNotifications=$pushNotifications, audibleNotifications=$audibleNotifications, pinToTop=$pinToTop, emailAddress=$emailAddress, isMuted=$isMuted, inHomeView=$inHomeView, isAnnouncementOnly=$isAnnouncementOnly, isWebPublic=$isWebPublic, role=$role, color=$color, streamPostPolicy=$streamPostPolicy, messageRetentionDays=$messageRetentionDays, historyPublicToSubscribers=$historyPublicToSubscribers, firstMessageId=$firstMessageId, streamWeeklyTraffic=$streamWeeklyTraffic, ]';
  }
}

@GenSerializer(nullableFields: true)
class SubscriptionsSerializer extends Serializer<Subscriptions> with _$SubscriptionsSerializer {

}

