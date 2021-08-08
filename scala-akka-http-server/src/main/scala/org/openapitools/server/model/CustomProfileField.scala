package org.openapitools.server.model


/**
 * Dictionary containing the details of a custom profile field configured for this organization. 
 *
 * @param id The ID of the custom profile field.  This will be referenced in custom the profile fields section of user objects.  for example: ''null''
 * @param `type` An integer indicating the type of the custom profile field, which determines how it is configured and displayed to users.  See the [Add custom profile fields](/help/add-custom-profile-fields) article for details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account  for example: ''null''
 * @param order Custom profile fields are displayed in both settings UI and UI showing users' profiles in increasing `order`.  for example: ''null''
 * @param name The name of the custom profile field.  for example: ''null''
 * @param hint The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields.  for example: ''null''
 * @param fieldData Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized.  for example: ''null''
*/
final case class CustomProfileField (
  id: Option[Int],
  `type`: Option[Int],
  order: Option[Int],
  name: Option[String],
  hint: Option[String],
  fieldData: Option[String]
)

