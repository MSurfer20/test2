
package org.openapitools.client.model


case class ApiKeyResponseAllOf (
    _result: Option[AnyType],
    _msg: Option[AnyType],
    /* The API key that can be used to authenticate as the requested user.  */
    _apiKey: String,
    /* The email address of the user who owns the API key  */
    _email: String
)
object ApiKeyResponseAllOf {
    def toStringBody(var_result: Object, var_msg: Object, var_apiKey: Object, var_email: Object) =
        s"""
        | {
        | "result":$var_result,"msg":$var_msg,"apiKey":$var_apiKey,"email":$var_email
        | }
        """.stripMargin
}
