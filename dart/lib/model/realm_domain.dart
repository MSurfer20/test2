//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealmDomain {
  /// Returns a new [RealmDomain] instance.
  RealmDomain({
    this.domain,
    this.allowSubdomains,
  });

  /// The new allowed domain. 
  String domain;

  /// Whether subdomains are allowed for this domain. 
  bool allowSubdomains;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealmDomain &&
     other.domain == domain &&
     other.allowSubdomains == allowSubdomains;

  @override
  int get hashCode =>
    (domain == null ? 0 : domain.hashCode) +
    (allowSubdomains == null ? 0 : allowSubdomains.hashCode);

  @override
  String toString() => 'RealmDomain[domain=$domain, allowSubdomains=$allowSubdomains]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (domain != null) {
      json[r'domain'] = domain;
    }
    if (allowSubdomains != null) {
      json[r'allow_subdomains'] = allowSubdomains;
    }
    return json;
  }

  /// Returns a new [RealmDomain] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static RealmDomain fromJson(Map<String, dynamic> json) => json == null
    ? null
    : RealmDomain(
        domain: json[r'domain'],
        allowSubdomains: json[r'allow_subdomains'],
    );

  static List<RealmDomain> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <RealmDomain>[]
      : json.map((dynamic value) => RealmDomain.fromJson(value)).toList(growable: true == growable);

  static Map<String, RealmDomain> mapFromJson(Map<String, dynamic> json) {
    final map = <String, RealmDomain>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = RealmDomain.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of RealmDomain-objects as value to a dart map
  static Map<String, List<RealmDomain>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<RealmDomain>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = RealmDomain.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

