package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * Dictionary containing the details of a custom profile field configured for this organization. 
 * @param id The ID of the custom profile field.  This will be referenced in custom the profile fields section of user objects. 
 * @param type An integer indicating the type of the custom profile field, which determines how it is configured and displayed to users.  See the [Add custom profile fields](/help/add-custom-profile-fields) article for details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account 
 * @param order Custom profile fields are displayed in both settings UI and UI showing users' profiles in increasing `order`. 
 * @param name The name of the custom profile field. 
 * @param hint The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. 
 * @param fieldData Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. 
 */
data class CustomProfileField(

    @field:JsonProperty("id") val id: kotlin.Int? = null,

    @field:JsonProperty("type") val type: kotlin.Int? = null,

    @field:JsonProperty("order") val order: kotlin.Int? = null,

    @field:JsonProperty("name") val name: kotlin.String? = null,

    @field:JsonProperty("hint") val hint: kotlin.String? = null,

    @field:JsonProperty("field_data") val fieldData: kotlin.String? = null
) {

}

