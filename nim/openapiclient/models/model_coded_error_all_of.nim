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

type CodedErrorAllOf* = object
  ## 
  result*: AnyType
  msg*: AnyType
  code*: AnyType