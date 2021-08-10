package model

import play.api.libs.json._

/**
  * A dictionary for representing a message draft. 
  * @param id The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited. 
  * @param `type` The type of the draft. Either unaddressed (empty string), \"stream\", or \"private\" (for PMs and private group messages). 
  * @param to An array of the tentative target audience IDs. For \"stream\" messages, this should contain exactly 1 ID, the ID of the target stream. For private messages, this should be an array of target user IDs. For unaddressed drafts, this is ignored, and clients should send an empty array. 
  * @param topic For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes. 
  * @param content The body of the draft. Should not contain null bytes. 
  * @param timestamp A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-10T11:47:30.086135Z[Etc/UTC]")
case class Draft(
  id: Option[Int],
  `type`: Draft.Type.Value,
  to: List[Int],
  topic: String,
  content: String,
  timestamp: Option[BigDecimal]
)

object Draft {
  implicit lazy val draftJsonFormat: Format[Draft] = Json.format[Draft]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val EMPTY = Value("")
    val Stream = Value("stream")
    val Private = Value("private")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

