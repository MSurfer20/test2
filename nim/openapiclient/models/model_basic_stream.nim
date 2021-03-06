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
import model_basic_stream_all_of
import model_basic_stream_base

type BasicStream* = object
  ## 
  streamId*: AnyType
  name*: AnyType
  description*: AnyType
  dateCreated*: AnyType
  inviteOnly*: AnyType
  renderedDescription*: AnyType
  isWebPublic*: AnyType
  streamPostPolicy*: AnyType
  messageRetentionDays*: AnyType
  historyPublicToSubscribers*: AnyType
  firstMessageId*: AnyType
  isAnnouncementOnly*: AnyType
