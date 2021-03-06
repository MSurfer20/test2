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
 * EmojiReactionBaseAllOfUser
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class EmojiReactionBaseAllOfUser extends BaseModel
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
      "description" : "ID of the user.\n"
    },
    "email" : {
      "type" : "string",
      "description" : "Email of the user.\n"
    },
    "full_name" : {
      "type" : "string",
      "description" : "Full name of the user.\n"
    },
    "is_mirror_dummy" : {
      "type" : "boolean",
      "description" : "Whether the user is a mirror dummy.\n"
    }
  },
  "description" : "Whether the user is a mirror dummy.\nDictionary with data on the user who added the reaction, including\nthe user ID as the `id` field.  **Note**: In the [events\nAPI](/api/get-events), this `user` dictionary\nconfusing had the user ID in a field called `user_id`\ninstead.  We recommend ignoring fields other than the user\nID.  **Deprecated** and to be removed in a future release\nonce core clients have migrated to use the `user_id` field.\n",
  "deprecated" : true
}
SCHEMA;
}
