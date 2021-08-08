//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class Attachments {
  /// Returns a new [Attachments] instance.
  Attachments({
    this.id,
    this.name,
    this.pathId,
    this.size,
    this.createTime,
    this.messages = const [],
  });

  /// The unique ID for the attachment. 
  int id;

  /// Name of the uploaded file. 
  String name;

  /// A representation of the path of the file within the repository of user-uploaded files.  If the `path_id` of a file is `{realm_id}/ab/cdef/temp_file.py`, its URL will be: `{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py`. 
  String pathId;

  /// Size of the file in bytes. 
  int size;

  /// Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number. 
  int createTime;

  /// Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file. 
  List<AttachmentsMessages> messages;

  @override
  bool operator ==(Object other) => identical(this, other) || other is Attachments &&
     other.id == id &&
     other.name == name &&
     other.pathId == pathId &&
     other.size == size &&
     other.createTime == createTime &&
     other.messages == messages;

  @override
  int get hashCode =>
    (id == null ? 0 : id.hashCode) +
    (name == null ? 0 : name.hashCode) +
    (pathId == null ? 0 : pathId.hashCode) +
    (size == null ? 0 : size.hashCode) +
    (createTime == null ? 0 : createTime.hashCode) +
    (messages == null ? 0 : messages.hashCode);

  @override
  String toString() => 'Attachments[id=$id, name=$name, pathId=$pathId, size=$size, createTime=$createTime, messages=$messages]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (id != null) {
      json[r'id'] = id;
    }
    if (name != null) {
      json[r'name'] = name;
    }
    if (pathId != null) {
      json[r'path_id'] = pathId;
    }
    if (size != null) {
      json[r'size'] = size;
    }
    if (createTime != null) {
      json[r'create_time'] = createTime;
    }
    if (messages != null) {
      json[r'messages'] = messages;
    }
    return json;
  }

  /// Returns a new [Attachments] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static Attachments fromJson(Map<String, dynamic> json) => json == null
    ? null
    : Attachments(
        id: json[r'id'],
        name: json[r'name'],
        pathId: json[r'path_id'],
        size: json[r'size'],
        createTime: json[r'create_time'],
        messages: AttachmentsMessages.listFromJson(json[r'messages']),
    );

  static List<Attachments> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <Attachments>[]
      : json.map((dynamic value) => Attachments.fromJson(value)).toList(growable: true == growable);

  static Map<String, Attachments> mapFromJson(Map<String, dynamic> json) {
    final map = <String, Attachments>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = Attachments.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of Attachments-objects as value to a dart map
  static Map<String, List<Attachments>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<Attachments>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = Attachments.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

