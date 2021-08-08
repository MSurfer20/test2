package org.openapitools.server.model


/**
 * @param result  for example: ''null''
 * @param msg  for example: ''null''
 * @param subscribed A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query.  for example: ''null''
 * @param alreadySubscribed A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to.  for example: ''null''
 * @param unauthorized A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`.  for example: ''null''
*/
final case class AddSubscriptionsResponse (
  result: AnyType,
  msg: AnyType,
  subscribed: Option[Map[String, Seq[String]]],
  alreadySubscribed: Option[Map[String, Seq[String]]],
  unauthorized: Option[Seq[String]]
)

