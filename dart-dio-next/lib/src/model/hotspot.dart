//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'hotspot.g.dart';

/// Dictionary containing details of a single hotspot. 
///
/// Properties:
/// * [delay] - The delay after which the user should be shown the hotspot. 
/// * [name] - The name of the hotspot. 
/// * [title] - The title of the hotspot, as will be displayed to the user. 
/// * [description] - The description of the hotspot, as will be displayed to the user. 
abstract class Hotspot implements Built<Hotspot, HotspotBuilder> {
    /// The delay after which the user should be shown the hotspot. 
    @BuiltValueField(wireName: r'delay')
    num? get delay;

    /// The name of the hotspot. 
    @BuiltValueField(wireName: r'name')
    String? get name;

    /// The title of the hotspot, as will be displayed to the user. 
    @BuiltValueField(wireName: r'title')
    String? get title;

    /// The description of the hotspot, as will be displayed to the user. 
    @BuiltValueField(wireName: r'description')
    String? get description;

    Hotspot._();

    static void _initializeBuilder(HotspotBuilder b) => b;

    factory Hotspot([void updates(HotspotBuilder b)]) = _$Hotspot;

    @BuiltValueSerializer(custom: true)
    static Serializer<Hotspot> get serializer => _$HotspotSerializer();
}

class _$HotspotSerializer implements StructuredSerializer<Hotspot> {
    @override
    final Iterable<Type> types = const [Hotspot, _$Hotspot];

    @override
    final String wireName = r'Hotspot';

    @override
    Iterable<Object?> serialize(Serializers serializers, Hotspot object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object?>[];
        if (object.delay != null) {
            result
                ..add(r'delay')
                ..add(serializers.serialize(object.delay,
                    specifiedType: const FullType(num)));
        }
        if (object.name != null) {
            result
                ..add(r'name')
                ..add(serializers.serialize(object.name,
                    specifiedType: const FullType(String)));
        }
        if (object.title != null) {
            result
                ..add(r'title')
                ..add(serializers.serialize(object.title,
                    specifiedType: const FullType(String)));
        }
        if (object.description != null) {
            result
                ..add(r'description')
                ..add(serializers.serialize(object.description,
                    specifiedType: const FullType(String)));
        }
        return result;
    }

    @override
    Hotspot deserialize(Serializers serializers, Iterable<Object?> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = HotspotBuilder();

        final iterator = serialized.iterator;
        while (iterator.moveNext()) {
            final key = iterator.current as String;
            iterator.moveNext();
            final Object? value = iterator.current;
            switch (key) {
                case r'delay':
                    result.delay = serializers.deserialize(value,
                        specifiedType: const FullType(num)) as num;
                    break;
                case r'name':
                    result.name = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'title':
                    result.title = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'description':
                    result.description = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
            }
        }
        return result.build();
    }
}

