/**
 * Zulip REST API
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.model

import org.openapitools.client.core.ApiModel

case class JsonErrorBaseAllOf (
  result: JsonErrorBaseAllOfEnums.Result,
  msg: String
) extends ApiModel

object JsonErrorBaseAllOfEnums {

  type Result = Result.Value
  object Result extends Enumeration {
    val Error = Value("error")
  }

}

