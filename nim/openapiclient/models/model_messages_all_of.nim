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

type MessagesAllOf* = object
  ## 
  avatarUrl*: AnyType
  client*: AnyType
  content*: AnyType
  contentType*: AnyType
  displayRecipient*: AnyType
  id*: AnyType
  isMeMessage*: AnyType
  reactions*: AnyType
  recipientId*: AnyType
  senderEmail*: AnyType
  senderFullName*: AnyType
  senderId*: AnyType
  senderRealmStr*: AnyType
  streamId*: AnyType
  subject*: AnyType
  topicLinks*: AnyType
  submessages*: AnyType
  timestamp*: AnyType
  `type`*: AnyType
