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


case class JsonSuccessBase(
  result: JsonSuccessBaseEnums.Result,
  msg: String
)

object JsonSuccessBaseEnums {

  type Result = Result.Value
  object Result extends Enumeration {
    val Success = Value("success")
  }

}

