//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.7

// ignore_for_file: unused_import

import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'draft.g.dart';

abstract class Draft implements Built<Draft, DraftBuilder> {

    /// The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited. 
    @nullable
    @BuiltValueField(wireName: r'id')
    int get id;

    /// The type of the draft. Either unaddressed (empty string), \"stream\", or \"private\" (for PMs and private group messages). 
    @BuiltValueField(wireName: r'type')
    DraftTypeEnum get type;
    // enum typeEnum {  ,  stream,  private,  };

    /// An array of the tentative target audience IDs. For \"stream\" messages, this should contain exactly 1 ID, the ID of the target stream. For private messages, this should be an array of target user IDs. For unaddressed drafts, this is ignored, and clients should send an empty array. 
    @BuiltValueField(wireName: r'to')
    BuiltList<int> get to;

    /// For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes. 
    @BuiltValueField(wireName: r'topic')
    String get topic;

    /// The body of the draft. Should not contain null bytes. 
    @BuiltValueField(wireName: r'content')
    String get content;

    /// A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server. 
    @nullable
    @BuiltValueField(wireName: r'timestamp')
    num get timestamp;

    Draft._();

    static void _initializeBuilder(DraftBuilder b) => b;

    factory Draft([void updates(DraftBuilder b)]) = _$Draft;

    @BuiltValueSerializer(custom: true)
    static Serializer<Draft> get serializer => _$DraftSerializer();
}

class _$DraftSerializer implements StructuredSerializer<Draft> {

    @override
    final Iterable<Type> types = const [Draft, _$Draft];
    @override
    final String wireName = r'Draft';

    @override
    Iterable<Object> serialize(Serializers serializers, Draft object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object>[];
        if (object.id != null) {
            result
                ..add(r'id')
                ..add(serializers.serialize(object.id,
                    specifiedType: const FullType(int)));
        }
        result
            ..add(r'type')
            ..add(serializers.serialize(object.type,
                specifiedType: const FullType(DraftTypeEnum)));
        result
            ..add(r'to')
            ..add(serializers.serialize(object.to,
                specifiedType: const FullType(BuiltList, [FullType(int)])));
        result
            ..add(r'topic')
            ..add(serializers.serialize(object.topic,
                specifiedType: const FullType(String)));
        result
            ..add(r'content')
            ..add(serializers.serialize(object.content,
                specifiedType: const FullType(String)));
        if (object.timestamp != null) {
            result
                ..add(r'timestamp')
                ..add(serializers.serialize(object.timestamp,
                    specifiedType: const FullType(num)));
        }
        return result;
    }

    @override
    Draft deserialize(Serializers serializers, Iterable<Object> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = DraftBuilder();

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
                case r'type':
                    result.type = serializers.deserialize(value,
                        specifiedType: const FullType(DraftTypeEnum)) as DraftTypeEnum;
                    break;
                case r'to':
                    result.to.replace(serializers.deserialize(value,
                        specifiedType: const FullType(BuiltList, [FullType(int)])) as BuiltList<int>);
                    break;
                case r'topic':
                    result.topic = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'content':
                    result.content = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'timestamp':
                    result.timestamp = serializers.deserialize(value,
                        specifiedType: const FullType(num)) as num;
                    break;
            }
        }
        return result.build();
    }
}

class DraftTypeEnum extends EnumClass {

  /// The type of the draft. Either unaddressed (empty string), \"stream\", or \"private\" (for PMs and private group messages). 
  @BuiltValueEnumConst(wireName: r'')
  static const DraftTypeEnum empty = _$draftTypeEnum_empty;
  /// The type of the draft. Either unaddressed (empty string), \"stream\", or \"private\" (for PMs and private group messages). 
  @BuiltValueEnumConst(wireName: r'stream')
  static const DraftTypeEnum stream = _$draftTypeEnum_stream;
  /// The type of the draft. Either unaddressed (empty string), \"stream\", or \"private\" (for PMs and private group messages). 
  @BuiltValueEnumConst(wireName: r'private')
  static const DraftTypeEnum private = _$draftTypeEnum_private;

  static Serializer<DraftTypeEnum> get serializer => _$draftTypeEnumSerializer;

  const DraftTypeEnum._(String name): super(name);

  static BuiltSet<DraftTypeEnum> get values => _$draftTypeEnumValues;
  static DraftTypeEnum valueOf(String name) => _$draftTypeEnumValueOf(name);
}

