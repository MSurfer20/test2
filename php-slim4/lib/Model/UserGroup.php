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
 * UserGroup
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class UserGroup extends BaseModel
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
    "name" : {
      "type" : "string",
      "description" : "The name of the user group.\n"
    },
    "description" : {
      "type" : "string",
      "description" : "The description of the user group.\n"
    },
    "members" : {
      "type" : "array",
      "description" : "Array containing the id of the users who are\nmembers of this user group.\n",
      "items" : {
        "type" : "integer"
      }
    },
    "id" : {
      "type" : "integer",
      "description" : "The ID of the user group.\n"
    }
  },
  "additionalProperties" : false,
  "description" : "Object containing the user group's attributes.\n"
}
SCHEMA;
}
