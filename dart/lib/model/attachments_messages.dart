//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AttachmentsMessages {
  /// Returns a new [AttachmentsMessages] instance.
  AttachmentsMessages({
    this.dateSent,
    this.id,
  });

  /// Time when the message was sent as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously strangely called `name` and was a floating point number. 
  int dateSent;

  /// The unique message ID.  Messages should always be displayed sorted by ID. 
  int id;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AttachmentsMessages &&
     other.dateSent == dateSent &&
     other.id == id;

  @override
  int get hashCode =>
    (dateSent == null ? 0 : dateSent.hashCode) +
    (id == null ? 0 : id.hashCode);

  @override
  String toString() => 'AttachmentsMessages[dateSent=$dateSent, id=$id]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (dateSent != null) {
      json[r'date_sent'] = dateSent;
    }
    if (id != null) {
      json[r'id'] = id;
    }
    return json;
  }

  /// Returns a new [AttachmentsMessages] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static AttachmentsMessages fromJson(Map<String, dynamic> json) => json == null
    ? null
    : AttachmentsMessages(
        dateSent: json[r'date_sent'],
        id: json[r'id'],
    );

  static List<AttachmentsMessages> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <AttachmentsMessages>[]
      : json.map((dynamic value) => AttachmentsMessages.fromJson(value)).toList(growable: true == growable);

  static Map<String, AttachmentsMessages> mapFromJson(Map<String, dynamic> json) {
    final map = <String, AttachmentsMessages>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = AttachmentsMessages.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of AttachmentsMessages-objects as value to a dart map
  static Map<String, List<AttachmentsMessages>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<AttachmentsMessages>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = AttachmentsMessages.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

