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


case class BasicBot(
  userId: Option[AnyType] = None,
  fullName: Option[AnyType] = None,
  apiKey: Option[AnyType] = None,
  defaultSendingStream: Option[AnyType] = None,
  defaultEventsRegisterStream: Option[AnyType] = None,
  defaultAllPublicStreams: Option[AnyType] = None,
  avatarUrl: Option[AnyType] = None,
  ownerId: Option[AnyType] = None,
  services: Option[AnyType] = None
)


