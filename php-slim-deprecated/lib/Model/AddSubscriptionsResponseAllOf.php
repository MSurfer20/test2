<?php
/**
 * AddSubscriptionsResponseAllOf
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
 * AddSubscriptionsResponseAllOf
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class AddSubscriptionsResponseAllOf
{
    
    /** @var mixed $result */
    private $result;
    
    /** @var mixed $msg */
    private $msg;
    
    /** @var array&lt;string,string[]&gt; $subscribed A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query.*/
    private $subscribed;
    
    /** @var array&lt;string,string[]&gt; $alreadySubscribed A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to.*/
    private $alreadySubscribed;
    
    /** @var string[] $unauthorized A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if &#x60;authorization_errors_fatal&#x3D;false&#x60;.*/
    private $unauthorized;
}
