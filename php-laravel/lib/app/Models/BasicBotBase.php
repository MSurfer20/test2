<?php
/**
 * BasicBotBase
 */
namespace app\Models;

/**
 * BasicBotBase
 */
class BasicBotBase {

    /** @var int $userId The user id of the bot.*/
    private $userId;

    /** @var string $fullName The full name of the bot.*/
    private $fullName;

    /** @var string $apiKey The API key of the bot which it uses to make API requests.*/
    private $apiKey;

    /** @var string $defaultSendingStream The default sending stream of the bot. Null if the bot doesn&#39;t have a default sending stream.*/
    private $defaultSendingStream;

    /** @var string $defaultEventsRegisterStream The default stream for which the bot receives events/register data. Null if the bot doesn&#39;t have such a default stream.*/
    private $defaultEventsRegisterStream;

    /** @var bool $defaultAllPublicStreams Whether the bot can send messages to all streams by default.*/
    private $defaultAllPublicStreams;

    /** @var string $avatarUrl The URL of the bot&#39;s avatar.*/
    private $avatarUrl;

    /** @var int $ownerId The user id of the bot&#39;s owner.  Null if the bot has no owner.*/
    private $ownerId;

    /** @var OneOfObjectObject[] $services The \&quot;Services\&quot; array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change.*/
    private $services;

}
