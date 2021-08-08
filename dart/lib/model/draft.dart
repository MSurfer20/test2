//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class Draft {
  /// Returns a new [Draft] instance.
  Draft({
    this.id,
    @required this.type,
    this.to = const [],
    @required this.topic,
    @required this.content,
    this.timestamp,
  });

  /// The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited. 
  int id;

  /// The type of the draft. Either unaddressed (empty string), \"stream\", or \"private\" (for PMs and private group messages). 
  DraftTypeEnum type;

  /// An array of the tentative target audience IDs. For \"stream\" messages, this should contain exactly 1 ID, the ID of the target stream. For private messages, this should be an array of target user IDs. For unaddressed drafts, this is ignored, and clients should send an empty array. 
  List<int> to;

  /// For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes. 
  String topic;

  /// The body of the draft. Should not contain null bytes. 
  String content;

  /// A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server. 
  num timestamp;

  @override
  bool operator ==(Object other) => identical(this, other) || other is Draft &&
     other.id == id &&
     other.type == type &&
     other.to == to &&
     other.topic == topic &&
     other.content == content &&
     other.timestamp == timestamp;

  @override
  int get hashCode =>
    (id == null ? 0 : id.hashCode) +
    (type == null ? 0 : type.hashCode) +
    (to == null ? 0 : to.hashCode) +
    (topic == null ? 0 : topic.hashCode) +
    (content == null ? 0 : content.hashCode) +
    (timestamp == null ? 0 : timestamp.hashCode);

  @override
  String toString() => 'Draft[id=$id, type=$type, to=$to, topic=$topic, content=$content, timestamp=$timestamp]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (id != null) {
      json[r'id'] = id;
    }
      json[r'type'] = type;
      json[r'to'] = to;
      json[r'topic'] = topic;
      json[r'content'] = content;
    if (timestamp != null) {
      json[r'timestamp'] = timestamp;
    }
    return json;
  }

  /// Returns a new [Draft] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static Draft fromJson(Map<String, dynamic> json) => json == null
    ? null
    : Draft(
        id: json[r'id'],
        type: DraftTypeEnum.fromJson(json[r'type']),
        to: json[r'to'] == null
          ? null
          : (json[r'to'] as List).cast<int>(),
        topic: json[r'topic'],
        content: json[r'content'],
        timestamp: json[r'timestamp'] == null ?
          null :
          json[r'timestamp'].toDouble(),
    );

  static List<Draft> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <Draft>[]
      : json.map((dynamic value) => Draft.fromJson(value)).toList(growable: true == growable);

  static Map<String, Draft> mapFromJson(Map<String, dynamic> json) {
    final map = <String, Draft>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = Draft.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of Draft-objects as value to a dart map
  static Map<String, List<Draft>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<Draft>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = Draft.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

/// The type of the draft. Either unaddressed (empty string), \"stream\", or \"private\" (for PMs and private group messages). 
class DraftTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const DraftTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const empty = DraftTypeEnum._(r'');
  static const stream = DraftTypeEnum._(r'stream');
  static const private = DraftTypeEnum._(r'private');

  /// List of all possible values in this [enum][DraftTypeEnum].
  static const values = <DraftTypeEnum>[
    empty,
    stream,
    private,
  ];

  static DraftTypeEnum fromJson(dynamic value) =>
    DraftTypeEnumTypeTransformer().decode(value);

  static List<DraftTypeEnum> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <DraftTypeEnum>[]
      : json
          .map((value) => DraftTypeEnum.fromJson(value))
          .toList(growable: true == growable);
}

/// Transformation class that can [encode] an instance of [DraftTypeEnum] to String,
/// and [decode] dynamic data back to [DraftTypeEnum].
class DraftTypeEnumTypeTransformer {
  const DraftTypeEnumTypeTransformer._();

  factory DraftTypeEnumTypeTransformer() => _instance ??= DraftTypeEnumTypeTransformer._();

  String encode(DraftTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a DraftTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  DraftTypeEnum decode(dynamic data, {bool allowNull}) {
    switch (data) {
      case r'': return DraftTypeEnum.empty;
      case r'stream': return DraftTypeEnum.stream;
      case r'private': return DraftTypeEnum.private;
      default:
        if (allowNull == false) {
          throw ArgumentError('Unknown enum value to decode: $data');
        }
    }
    return null;
  }

  /// Singleton [DraftTypeEnumTypeTransformer] instance.
  static DraftTypeEnumTypeTransformer _instance;
}

