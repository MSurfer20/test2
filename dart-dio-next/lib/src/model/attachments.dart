//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/attachments_messages.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'attachments.g.dart';

/// Dictionary containing details of a file uploaded by a user. 
///
/// Properties:
/// * [id] - The unique ID for the attachment. 
/// * [name] - Name of the uploaded file. 
/// * [pathId] - A representation of the path of the file within the repository of user-uploaded files.  If the `path_id` of a file is `{realm_id}/ab/cdef/temp_file.py`, its URL will be: `{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py`. 
/// * [size] - Size of the file in bytes. 
/// * [createTime] - Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number. 
/// * [messages] - Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file. 
abstract class Attachments implements Built<Attachments, AttachmentsBuilder> {
    /// The unique ID for the attachment. 
    @BuiltValueField(wireName: r'id')
    int? get id;

    /// Name of the uploaded file. 
    @BuiltValueField(wireName: r'name')
    String? get name;

    /// A representation of the path of the file within the repository of user-uploaded files.  If the `path_id` of a file is `{realm_id}/ab/cdef/temp_file.py`, its URL will be: `{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py`. 
    @BuiltValueField(wireName: r'path_id')
    String? get pathId;

    /// Size of the file in bytes. 
    @BuiltValueField(wireName: r'size')
    int? get size;

    /// Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number. 
    @BuiltValueField(wireName: r'create_time')
    int? get createTime;

    /// Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file. 
    @BuiltValueField(wireName: r'messages')
    BuiltList<AttachmentsMessages>? get messages;

    Attachments._();

    static void _initializeBuilder(AttachmentsBuilder b) => b;

    factory Attachments([void updates(AttachmentsBuilder b)]) = _$Attachments;

    @BuiltValueSerializer(custom: true)
    static Serializer<Attachments> get serializer => _$AttachmentsSerializer();
}

class _$AttachmentsSerializer implements StructuredSerializer<Attachments> {
    @override
    final Iterable<Type> types = const [Attachments, _$Attachments];

    @override
    final String wireName = r'Attachments';

    @override
    Iterable<Object?> serialize(Serializers serializers, Attachments object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object?>[];
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
        if (object.pathId != null) {
            result
                ..add(r'path_id')
                ..add(serializers.serialize(object.pathId,
                    specifiedType: const FullType(String)));
        }
        if (object.size != null) {
            result
                ..add(r'size')
                ..add(serializers.serialize(object.size,
                    specifiedType: const FullType(int)));
        }
        if (object.createTime != null) {
            result
                ..add(r'create_time')
                ..add(serializers.serialize(object.createTime,
                    specifiedType: const FullType(int)));
        }
        if (object.messages != null) {
            result
                ..add(r'messages')
                ..add(serializers.serialize(object.messages,
                    specifiedType: const FullType(BuiltList, [FullType(AttachmentsMessages)])));
        }
        return result;
    }

    @override
    Attachments deserialize(Serializers serializers, Iterable<Object?> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = AttachmentsBuilder();

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
                case r'name':
                    result.name = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'path_id':
                    result.pathId = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'size':
                    result.size = serializers.deserialize(value,
                        specifiedType: const FullType(int)) as int;
                    break;
                case r'create_time':
                    result.createTime = serializers.deserialize(value,
                        specifiedType: const FullType(int)) as int;
                    break;
                case r'messages':
                    result.messages.replace(serializers.deserialize(value,
                        specifiedType: const FullType(BuiltList, [FullType(AttachmentsMessages)])) as BuiltList<AttachmentsMessages>);
                    break;
            }
        }
        return result.build();
    }
}

