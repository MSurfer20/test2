//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'basic_stream_base.g.dart';

/// Object containing basic details about the stream. 
///
/// Properties:
/// * [streamId] - The unique ID of the stream. 
/// * [name] - The name of the stream. 
/// * [description] - The short description of the stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description. 
/// * [dateCreated] - The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). 
/// * [inviteOnly] - Specifies whether the stream is private or not. Only people who have been invited can access a private stream. 
/// * [renderedDescription] - The short description of the stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. 
/// * [isWebPublic] - Whether the stream has been configured to allow unauthenticated access to its message history from the web. 
/// * [streamPostPolicy] - Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
/// * [messageRetentionDays] - Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
/// * [historyPublicToSubscribers] - Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future. 
/// * [firstMessageId] - The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. 
/// * [isAnnouncementOnly] - Whether the given stream is announcement only or not.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead. 
abstract class BasicStreamBase implements Built<BasicStreamBase, BasicStreamBaseBuilder> {
    /// The unique ID of the stream. 
    @BuiltValueField(wireName: r'stream_id')
    int? get streamId;

    /// The name of the stream. 
    @BuiltValueField(wireName: r'name')
    String? get name;

    /// The short description of the stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description. 
    @BuiltValueField(wireName: r'description')
    String? get description;

    /// The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). 
    @BuiltValueField(wireName: r'date_created')
    int? get dateCreated;

    /// Specifies whether the stream is private or not. Only people who have been invited can access a private stream. 
    @BuiltValueField(wireName: r'invite_only')
    bool? get inviteOnly;

    /// The short description of the stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. 
    @BuiltValueField(wireName: r'rendered_description')
    String? get renderedDescription;

    /// Whether the stream has been configured to allow unauthenticated access to its message history from the web. 
    @BuiltValueField(wireName: r'is_web_public')
    bool? get isWebPublic;

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

    /// Whether the given stream is announcement only or not.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead. 
    @BuiltValueField(wireName: r'is_announcement_only')
    bool? get isAnnouncementOnly;

    BasicStreamBase._();

    static void _initializeBuilder(BasicStreamBaseBuilder b) => b;

    factory BasicStreamBase([void updates(BasicStreamBaseBuilder b)]) = _$BasicStreamBase;

    @BuiltValueSerializer(custom: true)
    static Serializer<BasicStreamBase> get serializer => _$BasicStreamBaseSerializer();
}

class _$BasicStreamBaseSerializer implements StructuredSerializer<BasicStreamBase> {
    @override
    final Iterable<Type> types = const [BasicStreamBase, _$BasicStreamBase];

    @override
    final String wireName = r'BasicStreamBase';

    @override
    Iterable<Object?> serialize(Serializers serializers, BasicStreamBase object,
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
        if (object.renderedDescription != null) {
            result
                ..add(r'rendered_description')
                ..add(serializers.serialize(object.renderedDescription,
                    specifiedType: const FullType(String)));
        }
        if (object.isWebPublic != null) {
            result
                ..add(r'is_web_public')
                ..add(serializers.serialize(object.isWebPublic,
                    specifiedType: const FullType(bool)));
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
        if (object.isAnnouncementOnly != null) {
            result
                ..add(r'is_announcement_only')
                ..add(serializers.serialize(object.isAnnouncementOnly,
                    specifiedType: const FullType(bool)));
        }
        return result;
    }

    @override
    BasicStreamBase deserialize(Serializers serializers, Iterable<Object?> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = BasicStreamBaseBuilder();

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
                case r'date_created':
                    result.dateCreated = serializers.deserialize(value,
                        specifiedType: const FullType(int)) as int;
                    break;
                case r'invite_only':
                    result.inviteOnly = serializers.deserialize(value,
                        specifiedType: const FullType(bool)) as bool;
                    break;
                case r'rendered_description':
                    result.renderedDescription = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'is_web_public':
                    result.isWebPublic = serializers.deserialize(value,
                        specifiedType: const FullType(bool)) as bool;
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
                case r'is_announcement_only':
                    result.isAnnouncementOnly = serializers.deserialize(value,
                        specifiedType: const FullType(bool)) as bool;
                    break;
            }
        }
        return result.build();
    }
}

