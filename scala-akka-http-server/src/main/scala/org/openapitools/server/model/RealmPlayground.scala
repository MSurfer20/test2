package org.openapitools.server.model


/**
 * Object containing details about a realm playground. 
 *
 * @param id The unique ID for the realm playground.  for example: ''null''
 * @param name The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49).  for example: ''null''
 * @param pygmentsLanguage The name of the Pygments language lexer for that programming language.  for example: ''null''
 * @param urlPrefix The url prefix for the playground.  for example: ''null''
*/
final case class RealmPlayground (
  id: Option[Int],
  name: Option[String],
  pygmentsLanguage: Option[String],
  urlPrefix: Option[String]
)

