package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.JsonErrorBaseAllOf
import org.openapitools.model.JsonResponseBase
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
 * @param result 
 * @param msg 
 */
data class JsonErrorBase(

    @field:JsonProperty("result", required = true) val result: JsonErrorBase.Result,

    @field:JsonProperty("msg", required = true) val msg: kotlin.String
) {

    /**
    * 
    * Values: error
    */
    enum class Result(val value: kotlin.String) {
    
        @JsonProperty("error") error("error");
    
    }

}

