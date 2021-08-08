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


case class BasicStreamAllOf(
  streamId: Option[AnyType] = None,
  name: Option[AnyType] = None,
  description: Option[AnyType] = None,
  dateCreated: Option[AnyType] = None,
  inviteOnly: Option[AnyType] = None,
  renderedDescription: Option[AnyType] = None,
  isWebPublic: Option[AnyType] = None,
  streamPostPolicy: Option[AnyType] = None,
  messageRetentionDays: Option[AnyType] = None,
  historyPublicToSubscribers: Option[AnyType] = None,
  firstMessageId: Option[AnyType] = None,
  isAnnouncementOnly: Option[AnyType] = None
)

