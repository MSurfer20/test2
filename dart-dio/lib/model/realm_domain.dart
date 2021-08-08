//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.7

// ignore_for_file: unused_import

import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realm_domain.g.dart';

abstract class RealmDomain implements Built<RealmDomain, RealmDomainBuilder> {

    /// The new allowed domain. 
    @nullable
    @BuiltValueField(wireName: r'domain')
    String get domain;

    /// Whether subdomains are allowed for this domain. 
    @nullable
    @BuiltValueField(wireName: r'allow_subdomains')
    bool get allowSubdomains;

    RealmDomain._();

    static void _initializeBuilder(RealmDomainBuilder b) => b;

    factory RealmDomain([void updates(RealmDomainBuilder b)]) = _$RealmDomain;

    @BuiltValueSerializer(custom: true)
    static Serializer<RealmDomain> get serializer => _$RealmDomainSerializer();
}

class _$RealmDomainSerializer implements StructuredSerializer<RealmDomain> {

    @override
    final Iterable<Type> types = const [RealmDomain, _$RealmDomain];
    @override
    final String wireName = r'RealmDomain';

    @override
    Iterable<Object> serialize(Serializers serializers, RealmDomain object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object>[];
        if (object.domain != null) {
            result
                ..add(r'domain')
                ..add(serializers.serialize(object.domain,
                    specifiedType: const FullType(String)));
        }
        if (object.allowSubdomains != null) {
            result
                ..add(r'allow_subdomains')
                ..add(serializers.serialize(object.allowSubdomains,
                    specifiedType: const FullType(bool)));
        }
        return result;
    }

    @override
    RealmDomain deserialize(Serializers serializers, Iterable<Object> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = RealmDomainBuilder();

        final iterator = serialized.iterator;
        while (iterator.moveNext()) {
            final key = iterator.current as String;
            iterator.moveNext();
            final dynamic value = iterator.current;
            switch (key) {
                case r'domain':
                    result.domain = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'allow_subdomains':
                    result.allowSubdomains = serializers.deserialize(value,
                        specifiedType: const FullType(bool)) as bool;
                    break;
            }
        }
        return result.build();
    }
}

