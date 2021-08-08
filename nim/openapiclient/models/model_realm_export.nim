#
# Zulip REST API
# 
# Powerful open source group chat 
# The version of the OpenAPI document: 1.0.0
# 
# Generated by: https://openapi-generator.tech
#

import json
import tables


type RealmExport* = object
  ## Object containing details about a realm export. 
  id*: int ## The id of the export. 
  actingUserId*: int ## The id of the user who did the export. 
  exportTime*: float ## The UNIX timestamp of when the export was made. 
  deletedTimestamp*: float ## The timestamp of when the export was deleted. Null if it wasn't. 
  failedTimestamp*: float ## The timestamp of when the export failed. Null if it didn't. 
  exportUrl*: string ## The URL of the export. `null` if there's no URL. 
  pending*: bool ## Whether the export is pending or not. 
