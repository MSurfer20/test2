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


case class EmojiReactionBaseAllOfUser (
  // ID of the user. 
  id: Option[Integer] = None,
  // Email of the user. 
  email: Option[String] = None,
  // Full name of the user. 
  fullName: Option[String] = None,
  // Whether the user is a mirror dummy. 
  isMirrorDummy: Option[Boolean] = None
)

