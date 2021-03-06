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


case class RealmExport (
  // The id of the export. 
  id: Option[Integer] = None,
  // The id of the user who did the export. 
  actingUserId: Option[Integer] = None,
  // The UNIX timestamp of when the export was made. 
  exportTime: Option[Number] = None,
  // The timestamp of when the export was deleted. Null if it wasn't. 
  deletedTimestamp: Option[Number] = None,
  // The timestamp of when the export failed. Null if it didn't. 
  failedTimestamp: Option[Number] = None,
  // The URL of the export. `null` if there's no URL. 
  exportUrl: Option[String] = None,
  // Whether the export is pending or not. 
  pending: Option[Boolean] = None
)

