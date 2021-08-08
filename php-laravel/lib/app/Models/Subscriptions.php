<?php
/**
 * Subscriptions
 */
namespace app\Models;

/**
 * Subscriptions
 */
class Subscriptions {

    /** @var int $streamId The unique ID of a stream.*/
    private $streamId;

    /** @var string $name The name of a stream.*/
    private $name;

    /** @var string $description The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream&#39;s description.*/
    private $description;

    /** @var string $renderedDescription A short description of a stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message.*/
    private $renderedDescription;

    /** @var int $dateCreated The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30).*/
    private $dateCreated;

    /** @var bool $inviteOnly Specifies whether the stream is private or not. Only people who have been invited can access a private stream.*/
    private $inviteOnly;

    /** @var int[] $subscribers A list of user IDs of users who are also subscribed to a given stream. Included only if &#x60;include_subscribers&#x60; is &#x60;true&#x60;.*/
    private $subscribers;

    /** @var bool $desktopNotifications A boolean specifying whether desktop notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_desktop_notifications, for this stream.*/
    private $desktopNotifications;

    /** @var bool $emailNotifications A boolean specifying whether email notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_email_notifications, for this stream.*/
    private $emailNotifications;

    /** @var bool $wildcardMentionsNotify A boolean specifying whether wildcard mentions trigger notifications as though they were personal mentions in this stream.  A null value means the value of this setting should be inherited from the user-level default setting, wildcard_mentions_notify, for this stream.*/
    private $wildcardMentionsNotify;

    /** @var bool $pushNotifications A boolean specifying whether push notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_push_notifications, for this stream.*/
    private $pushNotifications;

    /** @var bool $audibleNotifications A boolean specifying whether audible notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_audible_notifications, for this stream.*/
    private $audibleNotifications;

    /** @var bool $pinToTop A boolean specifying whether the given stream has been pinned to the top.*/
    private $pinToTop;

    /** @var string $emailAddress Email address of the given stream, used for [sending emails to the stream](/help/message-a-stream-by-email).*/
    private $emailAddress;

    /** @var bool $isMuted Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in &#x60;All messages&#x60; view (previously known as &#x60;Home&#x60; view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named &#x60;in_home_view&#x60; (with the opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;).*/
    private $isMuted;

    /** @var bool $inHomeView Legacy property for if the given stream is muted, with inverted meeting.  **Deprecated**; clients should use is_muted where available.*/
    private $inHomeView;

    /** @var bool $isAnnouncementOnly Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use &#x60;stream_post_policy&#x60; instead.*/
    private $isAnnouncementOnly;

    /** @var bool $isWebPublic Whether the stream has been configured to allow unauthenticated access to its message history from the web.*/
    private $isWebPublic;

    /** @var int $role The user&#39;s role within the stream (distinct from the user&#39;s [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 &#x3D;&gt; Stream administrator. * 50 &#x3D;&gt; Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31).*/
    private $role;

    /** @var string $color The user&#39;s personal color for the stream.*/
    private $color;

    /** @var int $streamPostPolicy Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean.*/
    private $streamPostPolicy;

    /** @var int $messageRetentionDays Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * &#x60;null&#x60;, the default, means the stream will inherit the organization   level setting. * &#x60;-1&#x60; encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17).*/
    private $messageRetentionDays;

    /** @var bool $historyPublicToSubscribers Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only&#x3D;False implies history_public_to_subscribers&#x3D;True), but clients should not make that assumption, as we may change that behavior in the future.*/
    private $historyPublicToSubscribers;

    /** @var int $firstMessageId The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \&quot;more topics\&quot; widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history.*/
    private $firstMessageId;

    /** @var int $streamWeeklyTraffic The average number of messages sent to the stream in recent weeks, rounded to the nearest integer.  Null means the stream was recently created and there is insufficient data to estimate the average traffic.*/
    private $streamWeeklyTraffic;

}
