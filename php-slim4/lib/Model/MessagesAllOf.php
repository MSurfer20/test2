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
 * MessagesAllOf
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class MessagesAllOf extends BaseModel
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
    "avatar_url" : { },
    "client" : { },
    "content" : { },
    "content_type" : { },
    "display_recipient" : { },
    "id" : { },
    "is_me_message" : { },
    "reactions" : { },
    "recipient_id" : { },
    "sender_email" : { },
    "sender_full_name" : { },
    "sender_id" : { },
    "sender_realm_str" : { },
    "stream_id" : { },
    "subject" : { },
    "topic_links" : { },
    "submessages" : { },
    "timestamp" : { },
    "type" : { }
  }
}
SCHEMA;
}
