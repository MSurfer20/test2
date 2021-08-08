//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.7

// ignore_for_file: unused_import

import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'attachments_messages.g.dart';

abstract class AttachmentsMessages implements Built<AttachmentsMessages, AttachmentsMessagesBuilder> {

    /// Time when the message was sent as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously strangely called `name` and was a floating point number. 
    @nullable
    @BuiltValueField(wireName: r'date_sent')
    int get dateSent;

    /// The unique message ID.  Messages should always be displayed sorted by ID. 
    @nullable
    @BuiltValueField(wireName: r'id')
    int get id;

    AttachmentsMessages._();

    static void _initializeBuilder(AttachmentsMessagesBuilder b) => b;

    factory AttachmentsMessages([void updates(AttachmentsMessagesBuilder b)]) = _$AttachmentsMessages;

    @BuiltValueSerializer(custom: true)
    static Serializer<AttachmentsMessages> get serializer => _$AttachmentsMessagesSerializer();
}

class _$AttachmentsMessagesSerializer implements StructuredSerializer<AttachmentsMessages> {

    @override
    final Iterable<Type> types = const [AttachmentsMessages, _$AttachmentsMessages];
    @override
    final String wireName = r'AttachmentsMessages';

    @override
    Iterable<Object> serialize(Serializers serializers, AttachmentsMessages object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object>[];
        if (object.dateSent != null) {
            result
                ..add(r'date_sent')
                ..add(serializers.serialize(object.dateSent,
                    specifiedType: const FullType(int)));
        }
        if (object.id != null) {
            result
                ..add(r'id')
                ..add(serializers.serialize(object.id,
                    specifiedType: const FullType(int)));
        }
        return result;
    }

    @override
    AttachmentsMessages deserialize(Serializers serializers, Iterable<Object> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = AttachmentsMessagesBuilder();

        final iterator = serialized.iterator;
        while (iterator.moveNext()) {
            final key = iterator.current as String;
            iterator.moveNext();
            final dynamic value = iterator.current;
            switch (key) {
                case r'date_sent':
                    result.dateSent = serializers.deserialize(value,
                        specifiedType: const FullType(int)) as int;
                    break;
                case r'id':
                    result.id = serializers.deserialize(value,
                        specifiedType: const FullType(int)) as int;
                    break;
            }
        }
        return result.build();
    }
}

