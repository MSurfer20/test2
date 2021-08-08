<?php
/**
 * InlineResponse200
 */
namespace app\Models;

/**
 * InlineResponse200
 */
class InlineResponse200 {

    /** @var string $botEmail Email of the bot user.*/
    private $botEmail;

    /** @var string $botFullName The full name of the bot user.*/
    private $botFullName;

    /** @var string $data The message content, in raw Markdown format (not rendered to HTML).*/
    private $data;

    /** @var string $trigger What aspect of the message triggered the outgoing webhook notification. Possible values include &#x60;private_message&#x60; and &#x60;mention&#x60;.*/
    private $trigger;

    /** @var string $token A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the &#x60;zuliprc&#x60; file downloaded when creating the bot.*/
    private $token;

    /** @var MessagesBase $message A dict containing details on the message that triggered the outgoing webhook, in the format used by [&#x60;GET /messages&#x60;](/api/get-messages).*/
    private $message;

}
