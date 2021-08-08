package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AnyType
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * 
 * @param email 
 * @param isBot 
 * @param avatarUrl 
 * @param avatarVersion 
 * @param fullName 
 * @param isAdmin 
 * @param isOwner 
 * @param isBillingAdmin 
 * @param role 
 * @param botType 
 * @param userId 
 * @param botOwnerId 
 * @param isActive 
 * @param isGuest 
 * @param timezone 
 * @param dateJoined 
 * @param deliveryEmail 
 * @param profileData 
 */
data class UserAllOf(

    @field:Valid
    @field:JsonProperty("email") val email: AnyType? = null,

    @field:Valid
    @field:JsonProperty("is_bot") val isBot: AnyType? = null,

    @field:Valid
    @field:JsonProperty("avatar_url") val avatarUrl: AnyType? = null,

    @field:Valid
    @field:JsonProperty("avatar_version") val avatarVersion: AnyType? = null,

    @field:Valid
    @field:JsonProperty("full_name") val fullName: AnyType? = null,

    @field:Valid
    @field:JsonProperty("is_admin") val isAdmin: AnyType? = null,

    @field:Valid
    @field:JsonProperty("is_owner") val isOwner: AnyType? = null,

    @field:Valid
    @field:JsonProperty("is_billing_admin") val isBillingAdmin: AnyType? = null,

    @field:Valid
    @field:JsonProperty("role") val role: AnyType? = null,

    @field:Valid
    @field:JsonProperty("bot_type") val botType: AnyType? = null,

    @field:Valid
    @field:JsonProperty("user_id") val userId: AnyType? = null,

    @field:Valid
    @field:JsonProperty("bot_owner_id") val botOwnerId: AnyType? = null,

    @field:Valid
    @field:JsonProperty("is_active") val isActive: AnyType? = null,

    @field:Valid
    @field:JsonProperty("is_guest") val isGuest: AnyType? = null,

    @field:Valid
    @field:JsonProperty("timezone") val timezone: AnyType? = null,

    @field:Valid
    @field:JsonProperty("date_joined") val dateJoined: AnyType? = null,

    @field:Valid
    @field:JsonProperty("delivery_email") val deliveryEmail: AnyType? = null,

    @field:Valid
    @field:JsonProperty("profile_data") val profileData: AnyType? = null
) {

}

