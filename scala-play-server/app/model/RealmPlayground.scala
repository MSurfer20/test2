package model

import play.api.libs.json._

/**
  * Object containing details about a realm playground. 
  * @param id The unique ID for the realm playground. 
  * @param name The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49). 
  * @param pygmentsLanguage The name of the Pygments language lexer for that programming language. 
  * @param urlPrefix The url prefix for the playground. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T21:15:31.623147Z[Etc/UTC]")
case class RealmPlayground(
  id: Option[Int],
  name: Option[String],
  pygmentsLanguage: Option[String],
  urlPrefix: Option[String]
)

object RealmPlayground {
  implicit lazy val realmPlaygroundJsonFormat: Format[RealmPlayground] = Json.format[RealmPlayground]
}

