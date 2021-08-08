import 'package:jaguar_serializer/jaguar_serializer.dart';


part 'custom_profile_field.jser.dart';

class CustomProfileField {
   /* The ID of the custom profile field.  This will be referenced in custom the profile fields section of user objects.  */
  @Alias('id', isNullable: false,  )
  final int id;
   /* An integer indicating the type of the custom profile field, which determines how it is configured and displayed to users.  See the [Add custom profile fields](/help/add-custom-profile-fields) article for details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account  */
  @Alias('type', isNullable: false,  )
  final int type;
   /* Custom profile fields are displayed in both settings UI and UI showing users' profiles in increasing `order`.  */
  @Alias('order', isNullable: false,  )
  final int order;
   /* The name of the custom profile field.  */
  @Alias('name', isNullable: false,  )
  final String name;
   /* The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields.  */
  @Alias('hint', isNullable: false,  )
  final String hint;
   /* Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized.  */
  @Alias('field_data', isNullable: false,  )
  final String fieldData;
  

  CustomProfileField(
      

{
     this.id = null,  
     this.type = null,  
     this.order = null,  
     this.name = null,  
     this.hint = null,  
     this.fieldData = null 
    
    }
  );

  @override
  String toString() {
    return 'CustomProfileField[id=$id, type=$type, order=$order, name=$name, hint=$hint, fieldData=$fieldData, ]';
  }
}

@GenSerializer(nullableFields: true)
class CustomProfileFieldSerializer extends Serializer<CustomProfileField> with _$CustomProfileFieldSerializer {

}

