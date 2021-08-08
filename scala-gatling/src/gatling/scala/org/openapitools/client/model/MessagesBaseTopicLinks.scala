
package org.openapitools.client.model


case class MessagesBaseTopicLinks (
    /* The original link text present in the topic.  */
    _text: Option[String],
    /* The expanded target url which the link points to.  */
    _url: Option[String]
)
object MessagesBaseTopicLinks {
    def toStringBody(var_text: Object, var_url: Object) =
        s"""
        | {
        | "text":$var_text,"url":$var_url
        | }
        """.stripMargin
}
