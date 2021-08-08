
package org.openapitools.client.model


case class JsonResponseBase (
    _result: Option[String]
)
object JsonResponseBase {
    def toStringBody(var_result: Object) =
        s"""
        | {
        | "result":$var_result
        | }
        """.stripMargin
}
