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


type MessagesBaseTopicLinks* = object
  ## 
  text*: string ## The original link text present in the topic. 
  url*: string ## The expanded target url which the link points to. 