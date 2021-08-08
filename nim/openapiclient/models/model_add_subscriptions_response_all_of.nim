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

import model_any_type
import model_map

type AddSubscriptionsResponseAllOf* = object
  ## 
  result*: AnyType
  msg*: AnyType
  subscribed*: Table[string, seq[string]] ## A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. 
  alreadySubscribed*: Table[string, seq[string]] ## A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. 
  unauthorized*: seq[string] ## A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`. 
