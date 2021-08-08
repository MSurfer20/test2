//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'custom_profile_field.g.dart';

/// Dictionary containing the details of a custom profile field configured for this organization. 
///
/// Properties:
/// * [id] - The ID of the custom profile field.  This will be referenced in custom the profile fields section of user objects. 
/// * [type] - An integer indicating the type of the custom profile field, which determines how it is configured and displayed to users.  See the [Add custom profile fields](/help/add-custom-profile-fields) article for details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account 
/// * [order] - Custom profile fields are displayed in both settings UI and UI showing users' profiles in increasing `order`. 
/// * [name] - The name of the custom profile field. 
/// * [hint] - The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. 
/// * [fieldData] - Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. 
abstract class CustomProfileField implements Built<CustomProfileField, CustomProfileFieldBuilder> {
    /// The ID of the custom profile field.  This will be referenced in custom the profile fields section of user objects. 
    @BuiltValueField(wireName: r'id')
    int? get id;

    /// An integer indicating the type of the custom profile field, which determines how it is configured and displayed to users.  See the [Add custom profile fields](/help/add-custom-profile-fields) article for details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account 
    @BuiltValueField(wireName: r'type')
    int? get type;

    /// Custom profile fields are displayed in both settings UI and UI showing users' profiles in increasing `order`. 
    @BuiltValueField(wireName: r'order')
    int? get order;

    /// The name of the custom profile field. 
    @BuiltValueField(wireName: r'name')
    String? get name;

    /// The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. 
    @BuiltValueField(wireName: r'hint')
    String? get hint;

    /// Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. 
    @BuiltValueField(wireName: r'field_data')
    String? get fieldData;

    CustomProfileField._();

    static void _initializeBuilder(CustomProfileFieldBuilder b) => b;

    factory CustomProfileField([void updates(CustomProfileFieldBuilder b)]) = _$CustomProfileField;

    @BuiltValueSerializer(custom: true)
    static Serializer<CustomProfileField> get serializer => _$CustomProfileFieldSerializer();
}

class _$CustomProfileFieldSerializer implements StructuredSerializer<CustomProfileField> {
    @override
    final Iterable<Type> types = const [CustomProfileField, _$CustomProfileField];

    @override
    final String wireName = r'CustomProfileField';

    @override
    Iterable<Object?> serialize(Serializers serializers, CustomProfileField object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object?>[];
        if (object.id != null) {
            result
                ..add(r'id')
                ..add(serializers.serialize(object.id,
                    specifiedType: const FullType(int)));
        }
        if (object.type != null) {
            result
                ..add(r'type')
                ..add(serializers.serialize(object.type,
                    specifiedType: const FullType(int)));
        }
        if (object.order != null) {
            result
                ..add(r'order')
                ..add(serializers.serialize(object.order,
                    specifiedType: const FullType(int)));
        }
        if (object.name != null) {
            result
                ..add(r'name')
                ..add(serializers.serialize(object.name,
                    specifiedType: const FullType(String)));
        }
        if (object.hint != null) {
            result
                ..add(r'hint')
                ..add(serializers.serialize(object.hint,
                    specifiedType: const FullType(String)));
        }
        if (object.fieldData != null) {
            result
                ..add(r'field_data')
                ..add(serializers.serialize(object.fieldData,
                    specifiedType: const FullType(String)));
        }
        return result;
    }

    @override
    CustomProfileField deserialize(Serializers serializers, Iterable<Object?> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = CustomProfileFieldBuilder();

        final iterator = serialized.iterator;
        while (iterator.moveNext()) {
            final key = iterator.current as String;
            iterator.moveNext();
            final Object? value = iterator.current;
            switch (key) {
                case r'id':
                    result.id = serializers.deserialize(value,
                        specifiedType: const FullType(int)) as int;
                    break;
                case r'type':
                    result.type = serializers.deserialize(value,
                        specifiedType: const FullType(int)) as int;
                    break;
                case r'order':
                    result.order = serializers.deserialize(value,
                        specifiedType: const FullType(int)) as int;
                    break;
                case r'name':
                    result.name = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'hint':
                    result.hint = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'field_data':
                    result.fieldData = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
            }
        }
        return result.build();
    }
}

