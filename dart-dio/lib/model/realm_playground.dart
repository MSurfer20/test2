//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.7

// ignore_for_file: unused_import

import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realm_playground.g.dart';

abstract class RealmPlayground implements Built<RealmPlayground, RealmPlaygroundBuilder> {

    /// The unique ID for the realm playground. 
    @nullable
    @BuiltValueField(wireName: r'id')
    int get id;

    /// The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49). 
    @nullable
    @BuiltValueField(wireName: r'name')
    String get name;

    /// The name of the Pygments language lexer for that programming language. 
    @nullable
    @BuiltValueField(wireName: r'pygments_language')
    String get pygmentsLanguage;

    /// The url prefix for the playground. 
    @nullable
    @BuiltValueField(wireName: r'url_prefix')
    String get urlPrefix;

    RealmPlayground._();

    static void _initializeBuilder(RealmPlaygroundBuilder b) => b;

    factory RealmPlayground([void updates(RealmPlaygroundBuilder b)]) = _$RealmPlayground;

    @BuiltValueSerializer(custom: true)
    static Serializer<RealmPlayground> get serializer => _$RealmPlaygroundSerializer();
}

class _$RealmPlaygroundSerializer implements StructuredSerializer<RealmPlayground> {

    @override
    final Iterable<Type> types = const [RealmPlayground, _$RealmPlayground];
    @override
    final String wireName = r'RealmPlayground';

    @override
    Iterable<Object> serialize(Serializers serializers, RealmPlayground object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object>[];
        if (object.id != null) {
            result
                ..add(r'id')
                ..add(serializers.serialize(object.id,
                    specifiedType: const FullType(int)));
        }
        if (object.name != null) {
            result
                ..add(r'name')
                ..add(serializers.serialize(object.name,
                    specifiedType: const FullType(String)));
        }
        if (object.pygmentsLanguage != null) {
            result
                ..add(r'pygments_language')
                ..add(serializers.serialize(object.pygmentsLanguage,
                    specifiedType: const FullType(String)));
        }
        if (object.urlPrefix != null) {
            result
                ..add(r'url_prefix')
                ..add(serializers.serialize(object.urlPrefix,
                    specifiedType: const FullType(String)));
        }
        return result;
    }

    @override
    RealmPlayground deserialize(Serializers serializers, Iterable<Object> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = RealmPlaygroundBuilder();

        final iterator = serialized.iterator;
        while (iterator.moveNext()) {
            final key = iterator.current as String;
            iterator.moveNext();
            final dynamic value = iterator.current;
            switch (key) {
                case r'id':
                    result.id = serializers.deserialize(value,
                        specifiedType: const FullType(int)) as int;
                    break;
                case r'name':
                    result.name = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'pygments_language':
                    result.pygmentsLanguage = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'url_prefix':
                    result.urlPrefix = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
            }
        }
        return result.build();
    }
}

