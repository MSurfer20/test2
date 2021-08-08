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
 * RealmEmoji
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class RealmEmoji extends BaseModel
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
      "type" : "string",
      "description" : "The ID for this emoji, same as the object's key.\n"
    },
    "name" : {
      "type" : "string",
      "description" : "The user-friendly name for this emoji. Users in the organization\ncan use this emoji by writing this name between colons (`:name  :`).\n"
    },
    "source_url" : {
      "type" : "string",
      "description" : "The path relative to the organization's URL where the\nemoji's image can be found.\n"
    },
    "deactivated" : {
      "type" : "boolean",
      "description" : "Whether the emoji has been deactivated or not.\n"
    },
    "author_id" : {
      "type" : "integer",
      "description" : "The user ID of the user who uploaded the custom emoji.\nWill be null if the uploader is unknown.\n\n**Changes**: New in Zulip 3.0 (feature level 7).  Previously\nwas accessible via and `author` object with an `id` field.\n",
      "nullable" : true
    }
  },
  "additionalProperties" : false,
  "description" : "`{emoji_id}`: Object containing details about the emoji with\n the specified ID. It has the following properties:\n"
}
SCHEMA;
}
