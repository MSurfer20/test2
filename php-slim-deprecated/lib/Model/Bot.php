<?php
/**
 * Bot
 *
 * PHP version 7
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 */
namespace OpenAPIServer\Model;

/**
 * Bot
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class Bot
{
    
    /** @var mixed $userId */
    private $userId;
    
    /** @var mixed $fullName */
    private $fullName;
    
    /** @var mixed $apiKey */
    private $apiKey;
    
    /** @var mixed $defaultSendingStream */
    private $defaultSendingStream;
    
    /** @var mixed $defaultEventsRegisterStream */
    private $defaultEventsRegisterStream;
    
    /** @var mixed $defaultAllPublicStreams */
    private $defaultAllPublicStreams;
    
    /** @var mixed $avatarUrl */
    private $avatarUrl;
    
    /** @var mixed $ownerId */
    private $ownerId;
    
    /** @var mixed $services */
    private $services;
    
    /** @var string $email The email of the bot.*/
    private $email;
    
    /** @var int $botType An integer describing the type of bot: * &#x60;1&#x60; for a &#x60;Generic&#x60; bot. * &#x60;2&#x60; for an &#x60;Incoming webhook&#x60; bot. * &#x60;3&#x60; for an &#x60;Outgoing webhook&#x60; bot. * &#x60;4&#x60; for an &#x60;Embedded&#x60; bot.*/
    private $botType;
    
    /** @var bool $isActive A boolean describing whether the user account has been deactivated.*/
    private $isActive;
}
