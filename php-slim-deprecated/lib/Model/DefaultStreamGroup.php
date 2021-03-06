<?php
/**
 * DefaultStreamGroup
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
 * DefaultStreamGroup
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class DefaultStreamGroup
{
    
    /** @var string $name Name of the default stream group.*/
    private $name;
    
    /** @var string $description Description of the default stream group.*/
    private $description;
    
    /** @var int $id id of the default stream group.*/
    private $id;
    
    /** @var \OpenAPIServer\Model\BasicStream[] $streams Array containing details about the streams in the default stream group.*/
    private $streams;
}
