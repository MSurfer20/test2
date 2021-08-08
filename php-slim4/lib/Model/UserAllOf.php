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
 * UserAllOf
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class UserAllOf extends BaseModel
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
    "email" : { },
    "is_bot" : { },
    "avatar_url" : { },
    "avatar_version" : { },
    "full_name" : { },
    "is_admin" : { },
    "is_owner" : { },
    "is_billing_admin" : { },
    "role" : { },
    "bot_type" : { },
    "user_id" : { },
    "bot_owner_id" : { },
    "is_active" : { },
    "is_guest" : { },
    "timezone" : { },
    "date_joined" : { },
    "delivery_email" : { },
    "profile_data" : { }
  }
}
SCHEMA;
}