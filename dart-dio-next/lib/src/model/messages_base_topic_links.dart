//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'messages_base_topic_links.g.dart';

/// MessagesBaseTopicLinks
///
/// Properties:
/// * [text] - The original link text present in the topic. 
/// * [url] - The expanded target url which the link points to. 
abstract class MessagesBaseTopicLinks implements Built<MessagesBaseTopicLinks, MessagesBaseTopicLinksBuilder> {
    /// The original link text present in the topic. 
    @BuiltValueField(wireName: r'text')
    String? get text;

    /// The expanded target url which the link points to. 
    @BuiltValueField(wireName: r'url')
    String? get url;

    MessagesBaseTopicLinks._();

    static void _initializeBuilder(MessagesBaseTopicLinksBuilder b) => b;

    factory MessagesBaseTopicLinks([void updates(MessagesBaseTopicLinksBuilder b)]) = _$MessagesBaseTopicLinks;

    @BuiltValueSerializer(custom: true)
    static Serializer<MessagesBaseTopicLinks> get serializer => _$MessagesBaseTopicLinksSerializer();
}

class _$MessagesBaseTopicLinksSerializer implements StructuredSerializer<MessagesBaseTopicLinks> {
    @override
    final Iterable<Type> types = const [MessagesBaseTopicLinks, _$MessagesBaseTopicLinks];

    @override
    final String wireName = r'MessagesBaseTopicLinks';

    @override
    Iterable<Object?> serialize(Serializers serializers, MessagesBaseTopicLinks object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object?>[];
        if (object.text != null) {
            result
                ..add(r'text')
                ..add(serializers.serialize(object.text,
                    specifiedType: const FullType(String)));
        }
        if (object.url != null) {
            result
                ..add(r'url')
                ..add(serializers.serialize(object.url,
                    specifiedType: const FullType(String)));
        }
        return result;
    }

    @override
    MessagesBaseTopicLinks deserialize(Serializers serializers, Iterable<Object?> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = MessagesBaseTopicLinksBuilder();

        final iterator = serialized.iterator;
        while (iterator.moveNext()) {
            final key = iterator.current as String;
            iterator.moveNext();
            final Object? value = iterator.current;
            switch (key) {
                case r'text':
                    result.text = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'url':
                    result.url = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
            }
        }
        return result.build();
    }
}

