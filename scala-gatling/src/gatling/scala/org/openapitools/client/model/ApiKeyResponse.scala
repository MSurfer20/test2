
package org.openapitools.client.model


case class ApiKeyResponse (
    _result: AnyType,
    _msg: AnyType,
    /* The API key that can be used to authenticate as the requested user.  */
    _apiKey: String,
    /* The email address of the user who owns the API key  */
    _email: String
)
object ApiKeyResponse {
    def toStringBody(var_result: Object, var_msg: Object, var_apiKey: Object, var_email: Object) =
        s"""
        | {
        | "result":$var_result,"msg":$var_msg,"apiKey":$var_apiKey,"email":$var_email
        | }
        """.stripMargin
}
