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
 * BasicStreamAllOf
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class BasicStreamAllOf extends BaseModel
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
    "stream_id" : { },
    "name" : { },
    "description" : { },
    "date_created" : { },
    "invite_only" : { },
    "rendered_description" : { },
    "is_web_public" : { },
    "stream_post_policy" : { },
    "message_retention_days" : { },
    "history_public_to_subscribers" : { },
    "first_message_id" : { },
    "is_announcement_only" : { }
  }
}
SCHEMA;
}