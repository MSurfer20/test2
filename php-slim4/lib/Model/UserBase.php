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
 * UserBase
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class UserBase extends BaseModel
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
    "email" : {
      "type" : "string",
      "description" : "The Zulip API email address of the user or bot.\n\nIf you do not have permission to view the email address of the target user,\nthis will be a fake email address that is usable for the Zulip API but nothing else.\n"
    },
    "is_bot" : {
      "type" : "boolean",
      "description" : "A boolean specifying whether the user is a bot or full account.\n"
    },
    "avatar_url" : {
      "type" : "string",
      "description" : "URL for the user's avatar.  Will be `null` if the `client_gravatar`\nquery parameter was set to `True` and the user's avatar is hosted by\nthe Gravatar provider (i.e. the user has never uploaded an avatar).\n\n**Changes**: In Zulip 3.0 (feature level 18), if the client has the\n`user_avatar_url_field_optional` capability, this will be missing at\nthe server's sole discretion.\n",
      "nullable" : true
    },
    "avatar_version" : {
      "type" : "integer",
      "description" : "Version for the user's avatar.  Used for cache-busting requests\nfor the user's avatar.  Clients generally shouldn't need to use this;\nmost avatar URLs sent by Zulip will already end with `?v={avatar_version}`.\n"
    },
    "full_name" : {
      "type" : "string",
      "description" : "Full name of the user or bot, used for all display purposes.\n"
    },
    "is_admin" : {
      "type" : "boolean",
      "description" : "A boolean specifying whether the user is an organization administrator.\n"
    },
    "is_owner" : {
      "type" : "boolean",
      "description" : "A boolean specifying whether the user is an organization owner.\nIf true, is_admin will also be true.\n\n**Changes**: New in Zulip 3.0 (feature level 8).\n"
    },
    "is_billing_admin" : {
      "type" : "boolean",
      "description" : "A boolean specifying whether the user is a billing administrator.\n\n**Changes**: New in Zulip 5.0 (feature level 73).\n"
    },
    "role" : {
      "type" : "integer",
      "description" : "[Organization-level role](/help/roles-and-permissions)) of the user.\nPoosible values are:\n\n* Organization owner => 100\n* Organization administrator => 200\n* Organization moderator => 300\n* Member => 400\n* Guest => 600\n\n**Changes**: New in Zulip 4.0 (feature level 59).\n",
      "enum" : [ 100, 200, 300, 400, 600 ]
    },
    "bot_type" : {
      "type" : "integer",
      "description" : "An integer describing the type of bot:\n* `null` if the user isn't a bot.\n* `1` for a `Generic` bot.\n* `2` for an `Incoming webhook` bot.\n* `3` for an `Outgoing webhook` bot.\n* `4` for an `Embedded` bot.\n",
      "nullable" : true
    },
    "user_id" : {
      "type" : "integer",
      "description" : "The unique ID of the user.\n"
    },
    "bot_owner_id" : {
      "type" : "integer",
      "description" : "If the user is a bot (i.e. `is_bot` is `True`),\n`bot_owner` is the user ID of the bot's owner (usually, whoever\ncreated the bot).\n\nWill be null for legacy bots that do not have an owner.\n\n**Changes**: New in Zulip 3.0 (feature level\n1).  In previous versions, there was a `bot_owner` field\ncontaining the email address of the bot's owner.\n",
      "nullable" : true
    },
    "is_active" : {
      "type" : "boolean",
      "description" : "A boolean specifying whether the user account has been deactivated.\n"
    },
    "is_guest" : {
      "type" : "boolean",
      "description" : "A boolean specifying whether the user is a guest user.\n"
    },
    "timezone" : {
      "type" : "string",
      "description" : "The time zone of the user.\n"
    },
    "date_joined" : {
      "type" : "string",
      "description" : "The time the user account was created.\n"
    },
    "delivery_email" : {
      "type" : "string",
      "description" : "The user's real email address.  This field is present only if\n[email address visibility](/help/restrict-visibility-of-email-addresses) is\nlimited and you are an administrator with access to real email addresses\nunder the configured policy.\n"
    },
    "profile_data" : {
      "$ref" : "#/components/schemas/profile_data"
    }
  },
  "description" : "A dictionary containing basic data on a given Zulip user.\n"
}
SCHEMA;
}
