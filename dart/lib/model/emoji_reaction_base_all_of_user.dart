//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class EmojiReactionBaseAllOfUser {
  /// Returns a new [EmojiReactionBaseAllOfUser] instance.
  EmojiReactionBaseAllOfUser({
    this.id,
    this.email,
    this.fullName,
    this.isMirrorDummy,
  });

  /// ID of the user. 
  int id;

  /// Email of the user. 
  String email;

  /// Full name of the user. 
  String fullName;

  /// Whether the user is a mirror dummy. 
  bool isMirrorDummy;

  @override
  bool operator ==(Object other) => identical(this, other) || other is EmojiReactionBaseAllOfUser &&
     other.id == id &&
     other.email == email &&
     other.fullName == fullName &&
     other.isMirrorDummy == isMirrorDummy;

  @override
  int get hashCode =>
    (id == null ? 0 : id.hashCode) +
    (email == null ? 0 : email.hashCode) +
    (fullName == null ? 0 : fullName.hashCode) +
    (isMirrorDummy == null ? 0 : isMirrorDummy.hashCode);

  @override
  String toString() => 'EmojiReactionBaseAllOfUser[id=$id, email=$email, fullName=$fullName, isMirrorDummy=$isMirrorDummy]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (id != null) {
      json[r'id'] = id;
    }
    if (email != null) {
      json[r'email'] = email;
    }
    if (fullName != null) {
      json[r'full_name'] = fullName;
    }
    if (isMirrorDummy != null) {
      json[r'is_mirror_dummy'] = isMirrorDummy;
    }
    return json;
  }

  /// Returns a new [EmojiReactionBaseAllOfUser] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static EmojiReactionBaseAllOfUser fromJson(Map<String, dynamic> json) => json == null
    ? null
    : EmojiReactionBaseAllOfUser(
        id: json[r'id'],
        email: json[r'email'],
        fullName: json[r'full_name'],
        isMirrorDummy: json[r'is_mirror_dummy'],
    );

  static List<EmojiReactionBaseAllOfUser> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <EmojiReactionBaseAllOfUser>[]
      : json.map((dynamic value) => EmojiReactionBaseAllOfUser.fromJson(value)).toList(growable: true == growable);

  static Map<String, EmojiReactionBaseAllOfUser> mapFromJson(Map<String, dynamic> json) {
    final map = <String, EmojiReactionBaseAllOfUser>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = EmojiReactionBaseAllOfUser.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of EmojiReactionBaseAllOfUser-objects as value to a dart map
  static Map<String, List<EmojiReactionBaseAllOfUser>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<EmojiReactionBaseAllOfUser>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = EmojiReactionBaseAllOfUser.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

