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
 * RealmDeactivatedError
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class RealmDeactivatedError extends BaseModel
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
  "allOf" : [ {
    "$ref" : "#/components/schemas/CodedError"
  }, {
    "description" : "## Realm deactivated\n\n**Changes**: These errors used the HTTP 403 status code\n  before Zulip 5.0 (feature level 76).\n\nA typical failed json response for when user's organization is deactivated\n",
    "example" : {
      "code" : "REALM_DEACTIVATED",
      "msg" : "This organization is deactivated",
      "result" : "error"
    }
  } ]
}
SCHEMA;
}
