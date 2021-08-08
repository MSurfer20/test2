//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class Hotspot {
  /// Returns a new [Hotspot] instance.
  Hotspot({
    this.delay,
    this.name,
    this.title,
    this.description,
  });

  /// The delay after which the user should be shown the hotspot. 
  num delay;

  /// The name of the hotspot. 
  String name;

  /// The title of the hotspot, as will be displayed to the user. 
  String title;

  /// The description of the hotspot, as will be displayed to the user. 
  String description;

  @override
  bool operator ==(Object other) => identical(this, other) || other is Hotspot &&
     other.delay == delay &&
     other.name == name &&
     other.title == title &&
     other.description == description;

  @override
  int get hashCode =>
    (delay == null ? 0 : delay.hashCode) +
    (name == null ? 0 : name.hashCode) +
    (title == null ? 0 : title.hashCode) +
    (description == null ? 0 : description.hashCode);

  @override
  String toString() => 'Hotspot[delay=$delay, name=$name, title=$title, description=$description]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (delay != null) {
      json[r'delay'] = delay;
    }
    if (name != null) {
      json[r'name'] = name;
    }
    if (title != null) {
      json[r'title'] = title;
    }
    if (description != null) {
      json[r'description'] = description;
    }
    return json;
  }

  /// Returns a new [Hotspot] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static Hotspot fromJson(Map<String, dynamic> json) => json == null
    ? null
    : Hotspot(
        delay: json[r'delay'] == null ?
          null :
          json[r'delay'].toDouble(),
        name: json[r'name'],
        title: json[r'title'],
        description: json[r'description'],
    );

  static List<Hotspot> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <Hotspot>[]
      : json.map((dynamic value) => Hotspot.fromJson(value)).toList(growable: true == growable);

  static Map<String, Hotspot> mapFromJson(Map<String, dynamic> json) {
    final map = <String, Hotspot>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = Hotspot.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of Hotspot-objects as value to a dart map
  static Map<String, List<Hotspot>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<Hotspot>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = Hotspot.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

