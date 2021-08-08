//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.7

// ignore_for_file: unused_import

import 'package:openapi/model/basic_stream.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'default_stream_group.g.dart';

abstract class DefaultStreamGroup implements Built<DefaultStreamGroup, DefaultStreamGroupBuilder> {

    /// Name of the default stream group. 
    @nullable
    @BuiltValueField(wireName: r'name')
    String get name;

    /// Description of the default stream group. 
    @nullable
    @BuiltValueField(wireName: r'description')
    String get description;

    /// id of the default stream group. 
    @nullable
    @BuiltValueField(wireName: r'id')
    int get id;

    /// Array containing details about the streams in the default stream group. 
    @nullable
    @BuiltValueField(wireName: r'streams')
    BuiltList<BasicStream> get streams;

    DefaultStreamGroup._();

    static void _initializeBuilder(DefaultStreamGroupBuilder b) => b;

    factory DefaultStreamGroup([void updates(DefaultStreamGroupBuilder b)]) = _$DefaultStreamGroup;

    @BuiltValueSerializer(custom: true)
    static Serializer<DefaultStreamGroup> get serializer => _$DefaultStreamGroupSerializer();
}

class _$DefaultStreamGroupSerializer implements StructuredSerializer<DefaultStreamGroup> {

    @override
    final Iterable<Type> types = const [DefaultStreamGroup, _$DefaultStreamGroup];
    @override
    final String wireName = r'DefaultStreamGroup';

    @override
    Iterable<Object> serialize(Serializers serializers, DefaultStreamGroup object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object>[];
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
        if (object.id != null) {
            result
                ..add(r'id')
                ..add(serializers.serialize(object.id,
                    specifiedType: const FullType(int)));
        }
        if (object.streams != null) {
            result
                ..add(r'streams')
                ..add(serializers.serialize(object.streams,
                    specifiedType: const FullType(BuiltList, [FullType(BasicStream)])));
        }
        return result;
    }

    @override
    DefaultStreamGroup deserialize(Serializers serializers, Iterable<Object> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = DefaultStreamGroupBuilder();

        final iterator = serialized.iterator;
        while (iterator.moveNext()) {
            final key = iterator.current as String;
            iterator.moveNext();
            final dynamic value = iterator.current;
            switch (key) {
                case r'name':
                    result.name = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'description':
                    result.description = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'id':
                    result.id = serializers.deserialize(value,
                        specifiedType: const FullType(int)) as int;
                    break;
                case r'streams':
                    result.streams.replace(serializers.deserialize(value,
                        specifiedType: const FullType(BuiltList, [FullType(BasicStream)])) as BuiltList<BasicStream>);
                    break;
            }
        }
        return result.build();
    }
}

