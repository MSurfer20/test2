//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'subscriptions.g.dart';

/// Subscriptions
///
/// Properties:
/// * [streamId] - The unique ID of a stream. 
/// * [name] - The name of a stream. 
/// * [description] - The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description. 
/// * [renderedDescription] - A short description of a stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. 
/// * [dateCreated] - The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). 
/// * [inviteOnly] - Specifies whether the stream is private or not. Only people who have been invited can access a private stream. 
/// * [subscribers] - A list of user IDs of users who are also subscribed to a given stream. Included only if `include_subscribers` is `true`. 
/// * [desktopNotifications] - A boolean specifying whether desktop notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_desktop_notifications, for this stream. 
/// * [emailNotifications] - A boolean specifying whether email notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_email_notifications, for this stream. 
/// * [wildcardMentionsNotify] - A boolean specifying whether wildcard mentions trigger notifications as though they were personal mentions in this stream.  A null value means the value of this setting should be inherited from the user-level default setting, wildcard_mentions_notify, for this stream. 
/// * [pushNotifications] - A boolean specifying whether push notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_push_notifications, for this stream. 
/// * [audibleNotifications] - A boolean specifying whether audible notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_audible_notifications, for this stream. 
/// * [pinToTop] - A boolean specifying whether the given stream has been pinned to the top. 
/// * [emailAddress] - Email address of the given stream, used for [sending emails to the stream](/help/message-a-stream-by-email). 
/// * [isMuted] - Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in `All messages` view (previously known as `Home` view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named `in_home_view` (with the opposite value, `in_home_view=!is_muted`). 
/// * [inHomeView] - Legacy property for if the given stream is muted, with inverted meeting.  **Deprecated**; clients should use is_muted where available. 
/// * [isAnnouncementOnly] - Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead. 
/// * [isWebPublic] - Whether the stream has been configured to allow unauthenticated access to its message history from the web. 
/// * [role] - The user's role within the stream (distinct from the user's [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 => Stream administrator. * 50 => Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). 
/// * [color] - The user's personal color for the stream. 
/// * [streamPostPolicy] - Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
/// * [messageRetentionDays] - Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
/// * [historyPublicToSubscribers] - Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future. 
/// * [firstMessageId] - The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. 
/// * [streamWeeklyTraffic] - The average number of messages sent to the stream in recent weeks, rounded to the nearest integer.  Null means the stream was recently created and there is insufficient data to estimate the average traffic. 
abstract class Subscriptions implements Built<Subscriptions, SubscriptionsBuilder> {
    /// The unique ID of a stream. 
    @BuiltValueField(wireName: r'stream_id')
    int? get streamId;

    /// The name of a stream. 
    @BuiltValueField(wireName: r'name')
    String? get name;

    /// The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description. 
    @BuiltValueField(wireName: r'description')
    String? get description;

    /// A short description of a stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. 
    @BuiltValueField(wireName: r'rendered_description')
    String? get renderedDescription;

    /// The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). 
    @BuiltValueField(wireName: r'date_created')
    int? get dateCreated;

    /// Specifies whether the stream is private or not. Only people who have been invited can access a private stream. 
    @BuiltValueField(wireName: r'invite_only')
    bool? get inviteOnly;

    /// A list of user IDs of users who are also subscribed to a given stream. Included only if `include_subscribers` is `true`. 
    @BuiltValueField(wireName: r'subscribers')
    BuiltList<int>? get subscribers;

    /// A boolean specifying whether desktop notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_desktop_notifications, for this stream. 
    @BuiltValueField(wireName: r'desktop_notifications')
    bool? get desktopNotifications;

    /// A boolean specifying whether email notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_email_notifications, for this stream. 
    @BuiltValueField(wireName: r'email_notifications')
    bool? get emailNotifications;

    /// A boolean specifying whether wildcard mentions trigger notifications as though they were personal mentions in this stream.  A null value means the value of this setting should be inherited from the user-level default setting, wildcard_mentions_notify, for this stream. 
    @BuiltValueField(wireName: r'wildcard_mentions_notify')
    bool? get wildcardMentionsNotify;

    /// A boolean specifying whether push notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_push_notifications, for this stream. 
    @BuiltValueField(wireName: r'push_notifications')
    bool? get pushNotifications;

    /// A boolean specifying whether audible notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_audible_notifications, for this stream. 
    @BuiltValueField(wireName: r'audible_notifications')
    bool? get audibleNotifications;

    /// A boolean specifying whether the given stream has been pinned to the top. 
    @BuiltValueField(wireName: r'pin_to_top')
    bool? get pinToTop;

    /// Email address of the given stream, used for [sending emails to the stream](/help/message-a-stream-by-email). 
    @BuiltValueField(wireName: r'email_address')
    String? get emailAddress;

    /// Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in `All messages` view (previously known as `Home` view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named `in_home_view` (with the opposite value, `in_home_view=!is_muted`). 
    @BuiltValueField(wireName: r'is_muted')
    bool? get isMuted;

    /// Legacy property for if the given stream is muted, with inverted meeting.  **Deprecated**; clients should use is_muted where available. 
    @BuiltValueField(wireName: r'in_home_view')
    bool? get inHomeView;

    /// Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead. 
    @BuiltValueField(wireName: r'is_announcement_only')
    bool? get isAnnouncementOnly;

    /// Whether the stream has been configured to allow unauthenticated access to its message history from the web. 
    @BuiltValueField(wireName: r'is_web_public')
    bool? get isWebPublic;

    /// The user's role within the stream (distinct from the user's [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 => Stream administrator. * 50 => Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). 
    @BuiltValueField(wireName: r'role')
    SubscriptionsRoleEnum? get role;
    // enum roleEnum {  20,  50,  };

    /// The user's personal color for the stream. 
    @BuiltValueField(wireName: r'color')
    String? get color;

    /// Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
    @BuiltValueField(wireName: r'stream_post_policy')
    int? get streamPostPolicy;

    /// Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
    @BuiltValueField(wireName: r'message_retention_days')
    int? get messageRetentionDays;

    /// Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future. 
    @BuiltValueField(wireName: r'history_public_to_subscribers')
    bool? get historyPublicToSubscribers;

    /// The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. 
    @BuiltValueField(wireName: r'first_message_id')
    int? get firstMessageId;

    /// The average number of messages sent to the stream in recent weeks, rounded to the nearest integer.  Null means the stream was recently created and there is insufficient data to estimate the average traffic. 
    @BuiltValueField(wireName: r'stream_weekly_traffic')
    int? get streamWeeklyTraffic;

    Subscriptions._();

    static void _initializeBuilder(SubscriptionsBuilder b) => b;

    factory Subscriptions([void updates(SubscriptionsBuilder b)]) = _$Subscriptions;

    @BuiltValueSerializer(custom: true)
    static Serializer<Subscriptions> get serializer => _$SubscriptionsSerializer();
}

class _$SubscriptionsSerializer implements StructuredSerializer<Subscriptions> {
    @override
    final Iterable<Type> types = const [Subscriptions, _$Subscriptions];

    @override
    final String wireName = r'Subscriptions';

    @override
    Iterable<Object?> serialize(Serializers serializers, Subscriptions object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object?>[];
        if (object.streamId != null) {
            result
                ..add(r'stream_id')
                ..add(serializers.serialize(object.streamId,
                    specifiedType: const FullType(int)));
        }
        if (object.name != null) {
            result
                ..add(r'name')
                ..add(serializers.serialize(object.name,
                    specifiedType: const FullType(String)));
        }
        if (object.description != null) {
            result
                ..add(r'description')
                ..add(serializers.serialize(object.description,
                    specifiedType: const FullType(String)));
        }
        if (object.renderedDescription != null) {
            result
                ..add(r'rendered_description')
                ..add(serializers.serialize(object.renderedDescription,
                    specifiedType: const FullType(String)));
        }
        if (object.dateCreated != null) {
            result
                ..add(r'date_created')
                ..add(serializers.serialize(object.dateCreated,
                    specifiedType: const FullType(int)));
        }
        if (object.inviteOnly != null) {
            result
                ..add(r'invite_only')
                ..add(serializers.serialize(object.inviteOnly,
                    specifiedType: const FullType(bool)));
        }
        if (object.subscribers != null) {
            result
                ..add(r'subscribers')
                ..add(serializers.serialize(object.subscribers,
                    specifiedType: const FullType(BuiltList, [FullType(int)])));
        }
        if (object.desktopNotifications != null) {
            result
                ..add(r'desktop_notifications')
                ..add(serializers.serialize(object.desktopNotifications,
                    specifiedType: const FullType(bool)));
        }
        if (object.emailNotifications != null) {
            result
                ..add(r'email_notifications')
                ..add(serializers.serialize(object.emailNotifications,
                    specifiedType: const FullType(bool)));
        }
        if (object.wildcardMentionsNotify != null) {
            result
                ..add(r'wildcard_mentions_notify')
                ..add(serializers.serialize(object.wildcardMentionsNotify,
                    specifiedType: const FullType(bool)));
        }
        if (object.pushNotifications != null) {
            result
                ..add(r'push_notifications')
                ..add(serializers.serialize(object.pushNotifications,
                    specifiedType: const FullType(bool)));
        }
        if (object.audibleNotifications != null) {
            result
                ..add(r'audible_notifications')
                ..add(serializers.serialize(object.audibleNotifications,
                    specifiedType: const FullType(bool)));
        }
        if (object.pinToTop != null) {
            result
                ..add(r'pin_to_top')
                ..add(serializers.serialize(object.pinToTop,
                    specifiedType: const FullType(bool)));
        }
        if (object.emailAddress != null) {
            result
                ..add(r'email_address')
                ..add(serializers.serialize(object.emailAddress,
                    specifiedType: const FullType(String)));
        }
        if (object.isMuted != null) {
            result
                ..add(r'is_muted')
                ..add(serializers.serialize(object.isMuted,
                    specifiedType: const FullType(bool)));
        }
        if (object.inHomeView != null) {
            result
                ..add(r'in_home_view')
                ..add(serializers.serialize(object.inHomeView,
                    specifiedType: const FullType(bool)));
        }
        if (object.isAnnouncementOnly != null) {
            result
                ..add(r'is_announcement_only')
                ..add(serializers.serialize(object.isAnnouncementOnly,
                    specifiedType: const FullType(bool)));
        }
        if (object.isWebPublic != null) {
            result
                ..add(r'is_web_public')
                ..add(serializers.serialize(object.isWebPublic,
                    specifiedType: const FullType(bool)));
        }
        if (object.role != null) {
            result
                ..add(r'role')
                ..add(serializers.serialize(object.role,
                    specifiedType: const FullType(SubscriptionsRoleEnum)));
        }
        if (object.color != null) {
            result
                ..add(r'color')
                ..add(serializers.serialize(object.color,
                    specifiedType: const FullType(String)));
        }
        if (object.streamPostPolicy != null) {
            result
                ..add(r'stream_post_policy')
                ..add(serializers.serialize(object.streamPostPolicy,
                    specifiedType: const FullType(int)));
        }
        if (object.messageRetentionDays != null) {
            result
                ..add(r'message_retention_days')
                ..add(serializers.serialize(object.messageRetentionDays,
                    specifiedType: const FullType(int)));
        }
        if (object.historyPublicToSubscribers != null) {
            result
                ..add(r'history_public_to_subscribers')
                ..add(serializers.serialize(object.historyPublicToSubscribers,
                    specifiedType: const FullType(bool)));
        }
        if (object.firstMessageId != null) {
            result
                ..add(r'first_message_id')
                ..add(serializers.serialize(object.firstMessageId,
                    specifiedType: const FullType(int)));
        }
        if (object.streamWeeklyTraffic != null) {
            result
                ..add(r'stream_weekly_traffic')
                ..add(serializers.serialize(object.streamWeeklyTraffic,
                    specifiedType: const FullType(int)));
        }
        return result;
    }

    @override
    Subscriptions deserialize(Serializers serializers, Iterable<Object?> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = SubscriptionsBuilder();

        final iterator = serialized.iterator;
        while (iterator.moveNext()) {
            final key = iterator.current as String;
            iterator.moveNext();
            final Object? value = iterator.current;
            switch (key) {
                case r'stream_id':
                    result.streamId = serializers.deserialize(value,
                        specifiedType: const FullType(int)) as int;
                    break;
                case r'name':
                    result.name = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'description':
                    result.description = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'rendered_description':
                    result.renderedDescription = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'date_created':
                    result.dateCreated = serializers.deserialize(value,
                        specifiedType: const FullType(int)) as int;
                    break;
                case r'invite_only':
                    result.inviteOnly = serializers.deserialize(value,
                        specifiedType: const FullType(bool)) as bool;
                    break;
                case r'subscribers':
                    result.subscribers.replace(serializers.deserialize(value,
                        specifiedType: const FullType(BuiltList, [FullType(int)])) as BuiltList<int>);
                    break;
                case r'desktop_notifications':
                    result.desktopNotifications = serializers.deserialize(value,
                        specifiedType: const FullType(bool)) as bool;
                    break;
                case r'email_notifications':
                    result.emailNotifications = serializers.deserialize(value,
                        specifiedType: const FullType(bool)) as bool;
                    break;
                case r'wildcard_mentions_notify':
                    result.wildcardMentionsNotify = serializers.deserialize(value,
                        specifiedType: const FullType(bool)) as bool;
                    break;
                case r'push_notifications':
                    result.pushNotifications = serializers.deserialize(value,
                        specifiedType: const FullType(bool)) as bool;
                    break;
                case r'audible_notifications':
                    result.audibleNotifications = serializers.deserialize(value,
                        specifiedType: const FullType(bool)) as bool;
                    break;
                case r'pin_to_top':
                    result.pinToTop = serializers.deserialize(value,
                        specifiedType: const FullType(bool)) as bool;
                    break;
                case r'email_address':
                    result.emailAddress = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'is_muted':
                    result.isMuted = serializers.deserialize(value,
                        specifiedType: const FullType(bool)) as bool;
                    break;
                case r'in_home_view':
                    result.inHomeView = serializers.deserialize(value,
                        specifiedType: const FullType(bool)) as bool;
                    break;
                case r'is_announcement_only':
                    result.isAnnouncementOnly = serializers.deserialize(value,
                        specifiedType: const FullType(bool)) as bool;
                    break;
                case r'is_web_public':
                    result.isWebPublic = serializers.deserialize(value,
                        specifiedType: const FullType(bool)) as bool;
                    break;
                case r'role':
                    result.role = serializers.deserialize(value,
                        specifiedType: const FullType(SubscriptionsRoleEnum)) as SubscriptionsRoleEnum;
                    break;
                case r'color':
                    result.color = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'stream_post_policy':
                    result.streamPostPolicy = serializers.deserialize(value,
                        specifiedType: const FullType(int)) as int;
                    break;
                case r'message_retention_days':
                    result.messageRetentionDays = serializers.deserialize(value,
                        specifiedType: const FullType(int)) as int;
                    break;
                case r'history_public_to_subscribers':
                    result.historyPublicToSubscribers = serializers.deserialize(value,
                        specifiedType: const FullType(bool)) as bool;
                    break;
                case r'first_message_id':
                    result.firstMessageId = serializers.deserialize(value,
                        specifiedType: const FullType(int)) as int;
                    break;
                case r'stream_weekly_traffic':
                    result.streamWeeklyTraffic = serializers.deserialize(value,
                        specifiedType: const FullType(int)) as int;
                    break;
            }
        }
        return result.build();
    }
}

class SubscriptionsRoleEnum extends EnumClass {

  /// The user's role within the stream (distinct from the user's [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 => Stream administrator. * 50 => Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). 
  @BuiltValueEnumConst(wireNumber: 20)
  static const SubscriptionsRoleEnum number20 = _$subscriptionsRoleEnum_number20;
  /// The user's role within the stream (distinct from the user's [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 => Stream administrator. * 50 => Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). 
  @BuiltValueEnumConst(wireNumber: 50)
  static const SubscriptionsRoleEnum number50 = _$subscriptionsRoleEnum_number50;

  static Serializer<SubscriptionsRoleEnum> get serializer => _$subscriptionsRoleEnumSerializer;

  const SubscriptionsRoleEnum._(String name): super(name);

  static BuiltSet<SubscriptionsRoleEnum> get values => _$subscriptionsRoleEnumValues;
  static SubscriptionsRoleEnum valueOf(String name) => _$subscriptionsRoleEnumValueOf(name);
}

