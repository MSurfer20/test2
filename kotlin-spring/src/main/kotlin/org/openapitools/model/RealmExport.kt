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
 * Object containing details about a realm export. 
 * @param id The id of the export. 
 * @param actingUserId The id of the user who did the export. 
 * @param exportTime The UNIX timestamp of when the export was made. 
 * @param deletedTimestamp The timestamp of when the export was deleted. Null if it wasn't. 
 * @param failedTimestamp The timestamp of when the export failed. Null if it didn't. 
 * @param exportUrl The URL of the export. `null` if there's no URL. 
 * @param pending Whether the export is pending or not. 
 */
data class RealmExport(

    @field:JsonProperty("id") val id: kotlin.Int? = null,

    @field:JsonProperty("acting_user_id") val actingUserId: kotlin.Int? = null,

    @field:JsonProperty("export_time") val exportTime: java.math.BigDecimal? = null,

    @field:JsonProperty("deleted_timestamp") val deletedTimestamp: java.math.BigDecimal? = null,

    @field:JsonProperty("failed_timestamp") val failedTimestamp: java.math.BigDecimal? = null,

    @field:JsonProperty("export_url") val exportUrl: kotlin.String? = null,

    @field:JsonProperty("pending") val pending: kotlin.Boolean? = null
) {

}

