//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CustomProfileField {
  /// Returns a new [CustomProfileField] instance.
  CustomProfileField({
    this.id,
    this.type,
    this.order,
    this.name,
    this.hint,
    this.fieldData,
  });

  /// The ID of the custom profile field.  This will be referenced in custom the profile fields section of user objects. 
  int id;

  /// An integer indicating the type of the custom profile field, which determines how it is configured and displayed to users.  See the [Add custom profile fields](/help/add-custom-profile-fields) article for details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account 
  int type;

  /// Custom profile fields are displayed in both settings UI and UI showing users' profiles in increasing `order`. 
  int order;

  /// The name of the custom profile field. 
  String name;

  /// The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. 
  String hint;

  /// Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. 
  String fieldData;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CustomProfileField &&
     other.id == id &&
     other.type == type &&
     other.order == order &&
     other.name == name &&
     other.hint == hint &&
     other.fieldData == fieldData;

  @override
  int get hashCode =>
    (id == null ? 0 : id.hashCode) +
    (type == null ? 0 : type.hashCode) +
    (order == null ? 0 : order.hashCode) +
    (name == null ? 0 : name.hashCode) +
    (hint == null ? 0 : hint.hashCode) +
    (fieldData == null ? 0 : fieldData.hashCode);

  @override
  String toString() => 'CustomProfileField[id=$id, type=$type, order=$order, name=$name, hint=$hint, fieldData=$fieldData]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (id != null) {
      json[r'id'] = id;
    }
    if (type != null) {
      json[r'type'] = type;
    }
    if (order != null) {
      json[r'order'] = order;
    }
    if (name != null) {
      json[r'name'] = name;
    }
    if (hint != null) {
      json[r'hint'] = hint;
    }
    if (fieldData != null) {
      json[r'field_data'] = fieldData;
    }
    return json;
  }

  /// Returns a new [CustomProfileField] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static CustomProfileField fromJson(Map<String, dynamic> json) => json == null
    ? null
    : CustomProfileField(
        id: json[r'id'],
        type: json[r'type'],
        order: json[r'order'],
        name: json[r'name'],
        hint: json[r'hint'],
        fieldData: json[r'field_data'],
    );

  static List<CustomProfileField> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <CustomProfileField>[]
      : json.map((dynamic value) => CustomProfileField.fromJson(value)).toList(growable: true == growable);

  static Map<String, CustomProfileField> mapFromJson(Map<String, dynamic> json) {
    final map = <String, CustomProfileField>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = CustomProfileField.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of CustomProfileField-objects as value to a dart map
  static Map<String, List<CustomProfileField>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<CustomProfileField>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = CustomProfileField.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

