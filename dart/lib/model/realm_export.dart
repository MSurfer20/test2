//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealmExport {
  /// Returns a new [RealmExport] instance.
  RealmExport({
    this.id,
    this.actingUserId,
    this.exportTime,
    this.deletedTimestamp,
    this.failedTimestamp,
    this.exportUrl,
    this.pending,
  });

  /// The id of the export. 
  int id;

  /// The id of the user who did the export. 
  int actingUserId;

  /// The UNIX timestamp of when the export was made. 
  num exportTime;

  /// The timestamp of when the export was deleted. Null if it wasn't. 
  num deletedTimestamp;

  /// The timestamp of when the export failed. Null if it didn't. 
  num failedTimestamp;

  /// The URL of the export. `null` if there's no URL. 
  String exportUrl;

  /// Whether the export is pending or not. 
  bool pending;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealmExport &&
     other.id == id &&
     other.actingUserId == actingUserId &&
     other.exportTime == exportTime &&
     other.deletedTimestamp == deletedTimestamp &&
     other.failedTimestamp == failedTimestamp &&
     other.exportUrl == exportUrl &&
     other.pending == pending;

  @override
  int get hashCode =>
    (id == null ? 0 : id.hashCode) +
    (actingUserId == null ? 0 : actingUserId.hashCode) +
    (exportTime == null ? 0 : exportTime.hashCode) +
    (deletedTimestamp == null ? 0 : deletedTimestamp.hashCode) +
    (failedTimestamp == null ? 0 : failedTimestamp.hashCode) +
    (exportUrl == null ? 0 : exportUrl.hashCode) +
    (pending == null ? 0 : pending.hashCode);

  @override
  String toString() => 'RealmExport[id=$id, actingUserId=$actingUserId, exportTime=$exportTime, deletedTimestamp=$deletedTimestamp, failedTimestamp=$failedTimestamp, exportUrl=$exportUrl, pending=$pending]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (id != null) {
      json[r'id'] = id;
    }
    if (actingUserId != null) {
      json[r'acting_user_id'] = actingUserId;
    }
    if (exportTime != null) {
      json[r'export_time'] = exportTime;
    }
    if (deletedTimestamp != null) {
      json[r'deleted_timestamp'] = deletedTimestamp;
    }
    if (failedTimestamp != null) {
      json[r'failed_timestamp'] = failedTimestamp;
    }
    if (exportUrl != null) {
      json[r'export_url'] = exportUrl;
    }
    if (pending != null) {
      json[r'pending'] = pending;
    }
    return json;
  }

  /// Returns a new [RealmExport] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static RealmExport fromJson(Map<String, dynamic> json) => json == null
    ? null
    : RealmExport(
        id: json[r'id'],
        actingUserId: json[r'acting_user_id'],
        exportTime: json[r'export_time'] == null ?
          null :
          json[r'export_time'].toDouble(),
        deletedTimestamp: json[r'deleted_timestamp'] == null ?
          null :
          json[r'deleted_timestamp'].toDouble(),
        failedTimestamp: json[r'failed_timestamp'] == null ?
          null :
          json[r'failed_timestamp'].toDouble(),
        exportUrl: json[r'export_url'],
        pending: json[r'pending'],
    );

  static List<RealmExport> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <RealmExport>[]
      : json.map((dynamic value) => RealmExport.fromJson(value)).toList(growable: true == growable);

  static Map<String, RealmExport> mapFromJson(Map<String, dynamic> json) {
    final map = <String, RealmExport>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = RealmExport.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of RealmExport-objects as value to a dart map
  static Map<String, List<RealmExport>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<RealmExport>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = RealmExport.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

