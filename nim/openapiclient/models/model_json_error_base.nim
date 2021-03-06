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

import model_json_error_base_all_of
import model_json_response_base

type Result* {.pure.} = enum
  Error

type JsonErrorBase* = object
  ## 
  result*: Result
  msg*: string

func `%`*(v: Result): JsonNode =
  let str = case v:
    of Result.Error: "error"

  JsonNode(kind: JString, str: str)

func `$`*(v: Result): string =
  result = case v:
    of Result.Error: "error"
