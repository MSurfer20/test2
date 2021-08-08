package org.openapitools.server.model


/**
 * @param result  for example: ''null''
 * @param msg  for example: ''null''
 * @param apiKey The API key that can be used to authenticate as the requested user.  for example: ''null''
 * @param email The email address of the user who owns the API key  for example: ''null''
*/
final case class ApiKeyResponseAllOf (
  result: Option[AnyType],
  msg: Option[AnyType],
  apiKey: String,
  email: String
)

