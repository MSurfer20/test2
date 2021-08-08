<?php
/**
 * Presence
 */
namespace app\Models;

/**
 * Presence
 */
class Presence {

    /** @var string $client The client&#39;s platform name.*/
    private $client;

    /** @var string $status The status of the user on this client. It is either &#x60;idle&#x60; or &#x60;active&#x60;.*/
    private $status;

    /** @var int $timestamp The UNIX timestamp of when this client sent the user&#39;s presence to the server with the precision of a second.*/
    private $timestamp;

    /** @var bool $pushable Whether the client is capable of showing mobile/push notifications to the user.*/
    private $pushable;

}
