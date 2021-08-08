<?php

/**
 * Zulip REST API
 * PHP version 7.2
 *
 * @package OpenAPIServer
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */

/**
 * Powerful open source group chat
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 */
namespace OpenAPIServer\Model;

use OpenAPIServer\BaseModel;

/**
 * RealmPlayground
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class RealmPlayground extends BaseModel
{
    /**
     * @var string Models namespace.
     * Can be required for data deserialization when model contains referenced schemas.
     */
    protected const MODELS_NAMESPACE = '\OpenAPIServer\Model';

    /**
     * @var string Constant with OAS schema of current class.
     * Should be overwritten by inherited class.
     */
    protected const MODEL_SCHEMA = <<<'SCHEMA'
{
  "type" : "object",
  "properties" : {
    "id" : {
      "type" : "integer",
      "description" : "The unique ID for the realm playground.\n"
    },
    "name" : {
      "type" : "string",
      "description" : "The user-visible display name of the playground.  Clients\nshould display this in UI for picking which playground to\nopen a code block in, to differentiate between multiple\nconfigured playground options for a given pygments\nlanguage.\n\n**Changes**: New in Zulip 4.0 (feature level 49).\n"
    },
    "pygments_language" : {
      "type" : "string",
      "description" : "The name of the Pygments language lexer for that\nprogramming language.\n"
    },
    "url_prefix" : {
      "type" : "string",
      "description" : "The url prefix for the playground.\n"
    }
  },
  "additionalProperties" : false,
  "description" : "Object containing details about a realm playground.\n"
}
SCHEMA;
}