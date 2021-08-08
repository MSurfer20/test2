<?php
/**
 * AddSubscriptionsResponseAllOf
 */
namespace app\Models;

/**
 * AddSubscriptionsResponseAllOf
 */
class AddSubscriptionsResponseAllOf {

    /** @var mixed $result */
    private $result;

    /** @var mixed $msg */
    private $msg;

    /** @var array<string,string[]> $subscribed A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query.*/
    private $subscribed;

    /** @var array<string,string[]> $alreadySubscribed A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to.*/
    private $alreadySubscribed;

    /** @var string[] $unauthorized A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if &#x60;authorization_errors_fatal&#x3D;false&#x60;.*/
    private $unauthorized;

}
