//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class Subscriptions {
  /// Returns a new [Subscriptions] instance.
  Subscriptions({
    this.streamId,
    this.name,
    this.description,
    this.renderedDescription,
    this.dateCreated,
    this.inviteOnly,
    this.subscribers = const [],
    this.desktopNotifications,
    this.emailNotifications,
    this.wildcardMentionsNotify,
    this.pushNotifications,
    this.audibleNotifications,
    this.pinToTop,
    this.emailAddress,
    this.isMuted,
    this.inHomeView,
    this.isAnnouncementOnly,
    this.isWebPublic,
    this.role,
    this.color,
    this.streamPostPolicy,
    this.messageRetentionDays,
    this.historyPublicToSubscribers,
    this.firstMessageId,
    this.streamWeeklyTraffic,
  });

  /// The unique ID of a stream. 
  int streamId;

  /// The name of a stream. 
  String name;

  /// The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description. 
  String description;

  /// A short description of a stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. 
  String renderedDescription;

  /// The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). 
  int dateCreated;

  /// Specifies whether the stream is private or not. Only people who have been invited can access a private stream. 
  bool inviteOnly;

  /// A list of user IDs of users who are also subscribed to a given stream. Included only if `include_subscribers` is `true`. 
  List<int> subscribers;

  /// A boolean specifying whether desktop notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_desktop_notifications, for this stream. 
  bool desktopNotifications;

  /// A boolean specifying whether email notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_email_notifications, for this stream. 
  bool emailNotifications;

  /// A boolean specifying whether wildcard mentions trigger notifications as though they were personal mentions in this stream.  A null value means the value of this setting should be inherited from the user-level default setting, wildcard_mentions_notify, for this stream. 
  bool wildcardMentionsNotify;

  /// A boolean specifying whether push notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_push_notifications, for this stream. 
  bool pushNotifications;

  /// A boolean specifying whether audible notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_audible_notifications, for this stream. 
  bool audibleNotifications;

  /// A boolean specifying whether the given stream has been pinned to the top. 
  bool pinToTop;

  /// Email address of the given stream, used for [sending emails to the stream](/help/message-a-stream-by-email). 
  String emailAddress;

  /// Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in `All messages` view (previously known as `Home` view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named `in_home_view` (with the opposite value, `in_home_view=!is_muted`). 
  bool isMuted;

  /// Legacy property for if the given stream is muted, with inverted meeting.  **Deprecated**; clients should use is_muted where available. 
  bool inHomeView;

  /// Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead. 
  bool isAnnouncementOnly;

  /// Whether the stream has been configured to allow unauthenticated access to its message history from the web. 
  bool isWebPublic;

  /// The user's role within the stream (distinct from the user's [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 => Stream administrator. * 50 => Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). 
  SubscriptionsRoleEnum role;

  /// The user's personal color for the stream. 
  String color;

  /// Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
  int streamPostPolicy;

  /// Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
  int messageRetentionDays;

  /// Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future. 
  bool historyPublicToSubscribers;

  /// The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. 
  int firstMessageId;

  /// The average number of messages sent to the stream in recent weeks, rounded to the nearest integer.  Null means the stream was recently created and there is insufficient data to estimate the average traffic. 
  int streamWeeklyTraffic;

  @override
  bool operator ==(Object other) => identical(this, other) || other is Subscriptions &&
     other.streamId == streamId &&
     other.name == name &&
     other.description == description &&
     other.renderedDescription == renderedDescription &&
     other.dateCreated == dateCreated &&
     other.inviteOnly == inviteOnly &&
     other.subscribers == subscribers &&
     other.desktopNotifications == desktopNotifications &&
     other.emailNotifications == emailNotifications &&
     other.wildcardMentionsNotify == wildcardMentionsNotify &&
     other.pushNotifications == pushNotifications &&
     other.audibleNotifications == audibleNotifications &&
     other.pinToTop == pinToTop &&
     other.emailAddress == emailAddress &&
     other.isMuted == isMuted &&
     other.inHomeView == inHomeView &&
     other.isAnnouncementOnly == isAnnouncementOnly &&
     other.isWebPublic == isWebPublic &&
     other.role == role &&
     other.color == color &&
     other.streamPostPolicy == streamPostPolicy &&
     other.messageRetentionDays == messageRetentionDays &&
     other.historyPublicToSubscribers == historyPublicToSubscribers &&
     other.firstMessageId == firstMessageId &&
     other.streamWeeklyTraffic == streamWeeklyTraffic;

  @override
  int get hashCode =>
    (streamId == null ? 0 : streamId.hashCode) +
    (name == null ? 0 : name.hashCode) +
    (description == null ? 0 : description.hashCode) +
    (renderedDescription == null ? 0 : renderedDescription.hashCode) +
    (dateCreated == null ? 0 : dateCreated.hashCode) +
    (inviteOnly == null ? 0 : inviteOnly.hashCode) +
    (subscribers == null ? 0 : subscribers.hashCode) +
    (desktopNotifications == null ? 0 : desktopNotifications.hashCode) +
    (emailNotifications == null ? 0 : emailNotifications.hashCode) +
    (wildcardMentionsNotify == null ? 0 : wildcardMentionsNotify.hashCode) +
    (pushNotifications == null ? 0 : pushNotifications.hashCode) +
    (audibleNotifications == null ? 0 : audibleNotifications.hashCode) +
    (pinToTop == null ? 0 : pinToTop.hashCode) +
    (emailAddress == null ? 0 : emailAddress.hashCode) +
    (isMuted == null ? 0 : isMuted.hashCode) +
    (inHomeView == null ? 0 : inHomeView.hashCode) +
    (isAnnouncementOnly == null ? 0 : isAnnouncementOnly.hashCode) +
    (isWebPublic == null ? 0 : isWebPublic.hashCode) +
    (role == null ? 0 : role.hashCode) +
    (color == null ? 0 : color.hashCode) +
    (streamPostPolicy == null ? 0 : streamPostPolicy.hashCode) +
    (messageRetentionDays == null ? 0 : messageRetentionDays.hashCode) +
    (historyPublicToSubscribers == null ? 0 : historyPublicToSubscribers.hashCode) +
    (firstMessageId == null ? 0 : firstMessageId.hashCode) +
    (streamWeeklyTraffic == null ? 0 : streamWeeklyTraffic.hashCode);

  @override
  String toString() => 'Subscriptions[streamId=$streamId, name=$name, description=$description, renderedDescription=$renderedDescription, dateCreated=$dateCreated, inviteOnly=$inviteOnly, subscribers=$subscribers, desktopNotifications=$desktopNotifications, emailNotifications=$emailNotifications, wildcardMentionsNotify=$wildcardMentionsNotify, pushNotifications=$pushNotifications, audibleNotifications=$audibleNotifications, pinToTop=$pinToTop, emailAddress=$emailAddress, isMuted=$isMuted, inHomeView=$inHomeView, isAnnouncementOnly=$isAnnouncementOnly, isWebPublic=$isWebPublic, role=$role, color=$color, streamPostPolicy=$streamPostPolicy, messageRetentionDays=$messageRetentionDays, historyPublicToSubscribers=$historyPublicToSubscribers, firstMessageId=$firstMessageId, streamWeeklyTraffic=$streamWeeklyTraffic]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (streamId != null) {
      json[r'stream_id'] = streamId;
    }
    if (name != null) {
      json[r'name'] = name;
    }
    if (description != null) {
      json[r'description'] = description;
    }
    if (renderedDescription != null) {
      json[r'rendered_description'] = renderedDescription;
    }
    if (dateCreated != null) {
      json[r'date_created'] = dateCreated;
    }
    if (inviteOnly != null) {
      json[r'invite_only'] = inviteOnly;
    }
    if (subscribers != null) {
      json[r'subscribers'] = subscribers;
    }
    if (desktopNotifications != null) {
      json[r'desktop_notifications'] = desktopNotifications;
    }
    if (emailNotifications != null) {
      json[r'email_notifications'] = emailNotifications;
    }
    if (wildcardMentionsNotify != null) {
      json[r'wildcard_mentions_notify'] = wildcardMentionsNotify;
    }
    if (pushNotifications != null) {
      json[r'push_notifications'] = pushNotifications;
    }
    if (audibleNotifications != null) {
      json[r'audible_notifications'] = audibleNotifications;
    }
    if (pinToTop != null) {
      json[r'pin_to_top'] = pinToTop;
    }
    if (emailAddress != null) {
      json[r'email_address'] = emailAddress;
    }
    if (isMuted != null) {
      json[r'is_muted'] = isMuted;
    }
    if (inHomeView != null) {
      json[r'in_home_view'] = inHomeView;
    }
    if (isAnnouncementOnly != null) {
      json[r'is_announcement_only'] = isAnnouncementOnly;
    }
    if (isWebPublic != null) {
      json[r'is_web_public'] = isWebPublic;
    }
    if (role != null) {
      json[r'role'] = role;
    }
    if (color != null) {
      json[r'color'] = color;
    }
    if (streamPostPolicy != null) {
      json[r'stream_post_policy'] = streamPostPolicy;
    }
    if (messageRetentionDays != null) {
      json[r'message_retention_days'] = messageRetentionDays;
    }
    if (historyPublicToSubscribers != null) {
      json[r'history_public_to_subscribers'] = historyPublicToSubscribers;
    }
    if (firstMessageId != null) {
      json[r'first_message_id'] = firstMessageId;
    }
    if (streamWeeklyTraffic != null) {
      json[r'stream_weekly_traffic'] = streamWeeklyTraffic;
    }
    return json;
  }

  /// Returns a new [Subscriptions] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static Subscriptions fromJson(Map<String, dynamic> json) => json == null
    ? null
    : Subscriptions(
        streamId: json[r'stream_id'],
        name: json[r'name'],
        description: json[r'description'],
        renderedDescription: json[r'rendered_description'],
        dateCreated: json[r'date_created'],
        inviteOnly: json[r'invite_only'],
        subscribers: json[r'subscribers'] == null
          ? null
          : (json[r'subscribers'] as List).cast<int>(),
        desktopNotifications: json[r'desktop_notifications'],
        emailNotifications: json[r'email_notifications'],
        wildcardMentionsNotify: json[r'wildcard_mentions_notify'],
        pushNotifications: json[r'push_notifications'],
        audibleNotifications: json[r'audible_notifications'],
        pinToTop: json[r'pin_to_top'],
        emailAddress: json[r'email_address'],
        isMuted: json[r'is_muted'],
        inHomeView: json[r'in_home_view'],
        isAnnouncementOnly: json[r'is_announcement_only'],
        isWebPublic: json[r'is_web_public'],
        role: SubscriptionsRoleEnum.fromJson(json[r'role']),
        color: json[r'color'],
        streamPostPolicy: json[r'stream_post_policy'],
        messageRetentionDays: json[r'message_retention_days'],
        historyPublicToSubscribers: json[r'history_public_to_subscribers'],
        firstMessageId: json[r'first_message_id'],
        streamWeeklyTraffic: json[r'stream_weekly_traffic'],
    );

  static List<Subscriptions> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <Subscriptions>[]
      : json.map((dynamic value) => Subscriptions.fromJson(value)).toList(growable: true == growable);

  static Map<String, Subscriptions> mapFromJson(Map<String, dynamic> json) {
    final map = <String, Subscriptions>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = Subscriptions.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of Subscriptions-objects as value to a dart map
  static Map<String, List<Subscriptions>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<Subscriptions>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = Subscriptions.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

/// The user's role within the stream (distinct from the user's [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 => Stream administrator. * 50 => Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). 
class SubscriptionsRoleEnum {
  /// Instantiate a new enum with the provided [value].
  const SubscriptionsRoleEnum._(this.value);

  /// The underlying value of this enum member.
  final int value;

  @override
  String toString() => value.toString();

  int toJson() => value;

  static const number20 = SubscriptionsRoleEnum._(20);
  static const number50 = SubscriptionsRoleEnum._(50);

  /// List of all possible values in this [enum][SubscriptionsRoleEnum].
  static const values = <SubscriptionsRoleEnum>[
    number20,
    number50,
  ];

  static SubscriptionsRoleEnum fromJson(dynamic value) =>
    SubscriptionsRoleEnumTypeTransformer().decode(value);

  static List<SubscriptionsRoleEnum> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <SubscriptionsRoleEnum>[]
      : json
          .map((value) => SubscriptionsRoleEnum.fromJson(value))
          .toList(growable: true == growable);
}

/// Transformation class that can [encode] an instance of [SubscriptionsRoleEnum] to int,
/// and [decode] dynamic data back to [SubscriptionsRoleEnum].
class SubscriptionsRoleEnumTypeTransformer {
  const SubscriptionsRoleEnumTypeTransformer._();

  factory SubscriptionsRoleEnumTypeTransformer() => _instance ??= SubscriptionsRoleEnumTypeTransformer._();

  int encode(SubscriptionsRoleEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a SubscriptionsRoleEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  SubscriptionsRoleEnum decode(dynamic data, {bool allowNull}) {
    switch (data) {
      case 20: return SubscriptionsRoleEnum.number20;
      case 50: return SubscriptionsRoleEnum.number50;
      default:
        if (allowNull == false) {
          throw ArgumentError('Unknown enum value to decode: $data');
        }
    }
    return null;
  }

  /// Singleton [SubscriptionsRoleEnumTypeTransformer] instance.
  static SubscriptionsRoleEnumTypeTransformer _instance;
}

