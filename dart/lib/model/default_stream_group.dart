//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class DefaultStreamGroup {
  /// Returns a new [DefaultStreamGroup] instance.
  DefaultStreamGroup({
    this.name,
    this.description,
    this.id,
    this.streams = const [],
  });

  /// Name of the default stream group. 
  String name;

  /// Description of the default stream group. 
  String description;

  /// id of the default stream group. 
  int id;

  /// Array containing details about the streams in the default stream group. 
  List<BasicStream> streams;

  @override
  bool operator ==(Object other) => identical(this, other) || other is DefaultStreamGroup &&
     other.name == name &&
     other.description == description &&
     other.id == id &&
     other.streams == streams;

  @override
  int get hashCode =>
    (name == null ? 0 : name.hashCode) +
    (description == null ? 0 : description.hashCode) +
    (id == null ? 0 : id.hashCode) +
    (streams == null ? 0 : streams.hashCode);

  @override
  String toString() => 'DefaultStreamGroup[name=$name, description=$description, id=$id, streams=$streams]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (name != null) {
      json[r'name'] = name;
    }
    if (description != null) {
      json[r'description'] = description;
    }
    if (id != null) {
      json[r'id'] = id;
    }
    if (streams != null) {
      json[r'streams'] = streams;
    }
    return json;
  }

  /// Returns a new [DefaultStreamGroup] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static DefaultStreamGroup fromJson(Map<String, dynamic> json) => json == null
    ? null
    : DefaultStreamGroup(
        name: json[r'name'],
        description: json[r'description'],
        id: json[r'id'],
        streams: BasicStream.listFromJson(json[r'streams']),
    );

  static List<DefaultStreamGroup> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <DefaultStreamGroup>[]
      : json.map((dynamic value) => DefaultStreamGroup.fromJson(value)).toList(growable: true == growable);

  static Map<String, DefaultStreamGroup> mapFromJson(Map<String, dynamic> json) {
    final map = <String, DefaultStreamGroup>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = DefaultStreamGroup.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of DefaultStreamGroup-objects as value to a dart map
  static Map<String, List<DefaultStreamGroup>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<DefaultStreamGroup>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = DefaultStreamGroup.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

