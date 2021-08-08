goog.provide('API.Client.Subscriptions');

/**
 * @record
 */
API.Client.Subscriptions = function() {}

/**
 * The unique ID of a stream. 
 * @type {!number}
 * @export
 */
API.Client.Subscriptions.prototype.streamId;

/**
 * The name of a stream. 
 * @type {!string}
 * @export
 */
API.Client.Subscriptions.prototype.name;

/**
 * The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description. 
 * @type {!string}
 * @export
 */
API.Client.Subscriptions.prototype.description;

/**
 * A short description of a stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. 
 * @type {!string}
 * @export
 */
API.Client.Subscriptions.prototype.renderedDescription;

/**
 * The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). 
 * @type {!number}
 * @export
 */
API.Client.Subscriptions.prototype.dateCreated;

/**
 * Specifies whether the stream is private or not. Only people who have been invited can access a private stream. 
 * @type {!boolean}
 * @export
 */
API.Client.Subscriptions.prototype.inviteOnly;

/**
 * A list of user IDs of users who are also subscribed to a given stream. Included only if `include_subscribers` is `true`. 
 * @type {!Array<!number>}
 * @export
 */
API.Client.Subscriptions.prototype.subscribers;

/**
 * A boolean specifying whether desktop notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_desktop_notifications, for this stream. 
 * @type {!boolean}
 * @export
 */
API.Client.Subscriptions.prototype.desktopNotifications;

/**
 * A boolean specifying whether email notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_email_notifications, for this stream. 
 * @type {!boolean}
 * @export
 */
API.Client.Subscriptions.prototype.emailNotifications;

/**
 * A boolean specifying whether wildcard mentions trigger notifications as though they were personal mentions in this stream.  A null value means the value of this setting should be inherited from the user-level default setting, wildcard_mentions_notify, for this stream. 
 * @type {!boolean}
 * @export
 */
API.Client.Subscriptions.prototype.wildcardMentionsNotify;

/**
 * A boolean specifying whether push notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_push_notifications, for this stream. 
 * @type {!boolean}
 * @export
 */
API.Client.Subscriptions.prototype.pushNotifications;

/**
 * A boolean specifying whether audible notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_audible_notifications, for this stream. 
 * @type {!boolean}
 * @export
 */
API.Client.Subscriptions.prototype.audibleNotifications;

/**
 * A boolean specifying whether the given stream has been pinned to the top. 
 * @type {!boolean}
 * @export
 */
API.Client.Subscriptions.prototype.pinToTop;

/**
 * Email address of the given stream, used for [sending emails to the stream](/help/message-a-stream-by-email). 
 * @type {!string}
 * @export
 */
API.Client.Subscriptions.prototype.emailAddress;

/**
 * Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in `All messages` view (previously known as `Home` view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named `in_home_view` (with the opposite value, `in_home_view=!is_muted`). 
 * @type {!boolean}
 * @export
 */
API.Client.Subscriptions.prototype.isMuted;

/**
 * Legacy property for if the given stream is muted, with inverted meeting.  **Deprecated**; clients should use is_muted where available. 
 * @type {!boolean}
 * @export
 */
API.Client.Subscriptions.prototype.inHomeView;

/**
 * Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead. 
 * @type {!boolean}
 * @export
 */
API.Client.Subscriptions.prototype.isAnnouncementOnly;

/**
 * Whether the stream has been configured to allow unauthenticated access to its message history from the web. 
 * @type {!boolean}
 * @export
 */
API.Client.Subscriptions.prototype.isWebPublic;

/**
 * The user's role within the stream (distinct from the user's [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 => Stream administrator. * 50 => Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). 
 * @type {!number}
 * @export
 */
API.Client.Subscriptions.prototype.role;

/**
 * The user's personal color for the stream. 
 * @type {!string}
 * @export
 */
API.Client.Subscriptions.prototype.color;

/**
 * Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
 * @type {!number}
 * @export
 */
API.Client.Subscriptions.prototype.streamPostPolicy;

/**
 * Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
 * @type {!number}
 * @export
 */
API.Client.Subscriptions.prototype.messageRetentionDays;

/**
 * Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future. 
 * @type {!boolean}
 * @export
 */
API.Client.Subscriptions.prototype.historyPublicToSubscribers;

/**
 * The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. 
 * @type {!number}
 * @export
 */
API.Client.Subscriptions.prototype.firstMessageId;

/**
 * The average number of messages sent to the stream in recent weeks, rounded to the nearest integer.  Null means the stream was recently created and there is insufficient data to estimate the average traffic. 
 * @type {!number}
 * @export
 */
API.Client.Subscriptions.prototype.streamWeeklyTraffic;

/** @enum {string} */
API.Client.Subscriptions.RoleEnum = { 
  20: '20',
  50: '50',
}
