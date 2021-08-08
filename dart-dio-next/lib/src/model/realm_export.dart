//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realm_export.g.dart';

/// Object containing details about a realm export. 
///
/// Properties:
/// * [id] - The id of the export. 
/// * [actingUserId] - The id of the user who did the export. 
/// * [exportTime] - The UNIX timestamp of when the export was made. 
/// * [deletedTimestamp] - The timestamp of when the export was deleted. Null if it wasn't. 
/// * [failedTimestamp] - The timestamp of when the export failed. Null if it didn't. 
/// * [exportUrl] - The URL of the export. `null` if there's no URL. 
/// * [pending] - Whether the export is pending or not. 
abstract class RealmExport implements Built<RealmExport, RealmExportBuilder> {
    /// The id of the export. 
    @BuiltValueField(wireName: r'id')
    int? get id;

    /// The id of the user who did the export. 
    @BuiltValueField(wireName: r'acting_user_id')
    int? get actingUserId;

    /// The UNIX timestamp of when the export was made. 
    @BuiltValueField(wireName: r'export_time')
    num? get exportTime;

    /// The timestamp of when the export was deleted. Null if it wasn't. 
    @BuiltValueField(wireName: r'deleted_timestamp')
    num? get deletedTimestamp;

    /// The timestamp of when the export failed. Null if it didn't. 
    @BuiltValueField(wireName: r'failed_timestamp')
    num? get failedTimestamp;

    /// The URL of the export. `null` if there's no URL. 
    @BuiltValueField(wireName: r'export_url')
    String? get exportUrl;

    /// Whether the export is pending or not. 
    @BuiltValueField(wireName: r'pending')
    bool? get pending;

    RealmExport._();

    static void _initializeBuilder(RealmExportBuilder b) => b;

    factory RealmExport([void updates(RealmExportBuilder b)]) = _$RealmExport;

    @BuiltValueSerializer(custom: true)
    static Serializer<RealmExport> get serializer => _$RealmExportSerializer();
}

class _$RealmExportSerializer implements StructuredSerializer<RealmExport> {
    @override
    final Iterable<Type> types = const [RealmExport, _$RealmExport];

    @override
    final String wireName = r'RealmExport';

    @override
    Iterable<Object?> serialize(Serializers serializers, RealmExport object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object?>[];
        if (object.id != null) {
            result
                ..add(r'id')
                ..add(serializers.serialize(object.id,
                    specifiedType: const FullType(int)));
        }
        if (object.actingUserId != null) {
            result
                ..add(r'acting_user_id')
                ..add(serializers.serialize(object.actingUserId,
                    specifiedType: const FullType(int)));
        }
        if (object.exportTime != null) {
            result
                ..add(r'export_time')
                ..add(serializers.serialize(object.exportTime,
                    specifiedType: const FullType(num)));
        }
        if (object.deletedTimestamp != null) {
            result
                ..add(r'deleted_timestamp')
                ..add(serializers.serialize(object.deletedTimestamp,
                    specifiedType: const FullType(num)));
        }
        if (object.failedTimestamp != null) {
            result
                ..add(r'failed_timestamp')
                ..add(serializers.serialize(object.failedTimestamp,
                    specifiedType: const FullType(num)));
        }
        if (object.exportUrl != null) {
            result
                ..add(r'export_url')
                ..add(serializers.serialize(object.exportUrl,
                    specifiedType: const FullType(String)));
        }
        if (object.pending != null) {
            result
                ..add(r'pending')
                ..add(serializers.serialize(object.pending,
                    specifiedType: const FullType(bool)));
        }
        return result;
    }

    @override
    RealmExport deserialize(Serializers serializers, Iterable<Object?> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = RealmExportBuilder();

        final iterator = serialized.iterator;
        while (iterator.moveNext()) {
            final key = iterator.current as String;
            iterator.moveNext();
            final Object? value = iterator.current;
            switch (key) {
                case r'id':
                    result.id = serializers.deserialize(value,
                        specifiedType: const FullType(int)) as int;
                    break;
                case r'acting_user_id':
                    result.actingUserId = serializers.deserialize(value,
                        specifiedType: const FullType(int)) as int;
                    break;
                case r'export_time':
                    result.exportTime = serializers.deserialize(value,
                        specifiedType: const FullType(num)) as num;
                    break;
                case r'deleted_timestamp':
                    result.deletedTimestamp = serializers.deserialize(value,
                        specifiedType: const FullType(num)) as num;
                    break;
                case r'failed_timestamp':
                    result.failedTimestamp = serializers.deserialize(value,
                        specifiedType: const FullType(num)) as num;
                    break;
                case r'export_url':
                    result.exportUrl = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'pending':
                    result.pending = serializers.deserialize(value,
                        specifiedType: const FullType(bool)) as bool;
                    break;
            }
        }
        return result.build();
    }
}

