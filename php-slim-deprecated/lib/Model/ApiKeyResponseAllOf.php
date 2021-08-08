<?php
/**
 * ApiKeyResponseAllOf
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
 * ApiKeyResponseAllOf
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class ApiKeyResponseAllOf
{
    
    /** @var mixed $result */
    private $result;
    
    /** @var mixed $msg */
    private $msg;
    
    /** @var string $apiKey The API key that can be used to authenticate as the requested user.*/
    private $apiKey;
    
    /** @var string $email The email address of the user who owns the API key*/
    private $email;
}
