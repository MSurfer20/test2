//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealmPlayground {
  /// Returns a new [RealmPlayground] instance.
  RealmPlayground({
    this.id,
    this.name,
    this.pygmentsLanguage,
    this.urlPrefix,
  });

  /// The unique ID for the realm playground. 
  int id;

  /// The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49). 
  String name;

  /// The name of the Pygments language lexer for that programming language. 
  String pygmentsLanguage;

  /// The url prefix for the playground. 
  String urlPrefix;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealmPlayground &&
     other.id == id &&
     other.name == name &&
     other.pygmentsLanguage == pygmentsLanguage &&
     other.urlPrefix == urlPrefix;

  @override
  int get hashCode =>
    (id == null ? 0 : id.hashCode) +
    (name == null ? 0 : name.hashCode) +
    (pygmentsLanguage == null ? 0 : pygmentsLanguage.hashCode) +
    (urlPrefix == null ? 0 : urlPrefix.hashCode);

  @override
  String toString() => 'RealmPlayground[id=$id, name=$name, pygmentsLanguage=$pygmentsLanguage, urlPrefix=$urlPrefix]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (id != null) {
      json[r'id'] = id;
    }
    if (name != null) {
      json[r'name'] = name;
    }
    if (pygmentsLanguage != null) {
      json[r'pygments_language'] = pygmentsLanguage;
    }
    if (urlPrefix != null) {
      json[r'url_prefix'] = urlPrefix;
    }
    return json;
  }

  /// Returns a new [RealmPlayground] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static RealmPlayground fromJson(Map<String, dynamic> json) => json == null
    ? null
    : RealmPlayground(
        id: json[r'id'],
        name: json[r'name'],
        pygmentsLanguage: json[r'pygments_language'],
        urlPrefix: json[r'url_prefix'],
    );

  static List<RealmPlayground> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <RealmPlayground>[]
      : json.map((dynamic value) => RealmPlayground.fromJson(value)).toList(growable: true == growable);

  static Map<String, RealmPlayground> mapFromJson(Map<String, dynamic> json) {
    final map = <String, RealmPlayground>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = RealmPlayground.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of RealmPlayground-objects as value to a dart map
  static Map<String, List<RealmPlayground>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<RealmPlayground>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = RealmPlayground.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

