//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UserGroup {
  /// Returns a new [UserGroup] instance.
  UserGroup({
    this.name,
    this.description,
    this.members = const [],
    this.id,
  });

  /// The name of the user group. 
  String name;

  /// The description of the user group. 
  String description;

  /// Array containing the id of the users who are members of this user group. 
  List<int> members;

  /// The ID of the user group. 
  int id;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UserGroup &&
     other.name == name &&
     other.description == description &&
     other.members == members &&
     other.id == id;

  @override
  int get hashCode =>
    (name == null ? 0 : name.hashCode) +
    (description == null ? 0 : description.hashCode) +
    (members == null ? 0 : members.hashCode) +
    (id == null ? 0 : id.hashCode);

  @override
  String toString() => 'UserGroup[name=$name, description=$description, members=$members, id=$id]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (name != null) {
      json[r'name'] = name;
    }
    if (description != null) {
      json[r'description'] = description;
    }
    if (members != null) {
      json[r'members'] = members;
    }
    if (id != null) {
      json[r'id'] = id;
    }
    return json;
  }

  /// Returns a new [UserGroup] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static UserGroup fromJson(Map<String, dynamic> json) => json == null
    ? null
    : UserGroup(
        name: json[r'name'],
        description: json[r'description'],
        members: json[r'members'] == null
          ? null
          : (json[r'members'] as List).cast<int>(),
        id: json[r'id'],
    );

  static List<UserGroup> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <UserGroup>[]
      : json.map((dynamic value) => UserGroup.fromJson(value)).toList(growable: true == growable);

  static Map<String, UserGroup> mapFromJson(Map<String, dynamic> json) {
    final map = <String, UserGroup>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = UserGroup.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of UserGroup-objects as value to a dart map
  static Map<String, List<UserGroup>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<UserGroup>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = UserGroup.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

