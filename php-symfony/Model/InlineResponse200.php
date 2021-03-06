<?php
/**
 * InlineResponse200
 *
 * PHP version 7.1.3
 *
 * @category Class
 * @package  OpenAPI\Server\Model
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Zulip REST API
 *
 * Powerful open source group chat
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\Model;

use Symfony\Component\Validator\Constraints as Assert;
use JMS\Serializer\Annotation\Type;
use JMS\Serializer\Annotation\SerializedName;

/**
 * Class representing the InlineResponse200 model.
 *
 * This is an example of the JSON payload that the Zulip server will &#x60;POST&#x60; to your server
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class InlineResponse200 
{
        /**
     * Email of the bot user.
     *
     * @var string|null
     * @SerializedName("bot_email")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $botEmail;

    /**
     * The full name of the bot user.
     *
     * @var string|null
     * @SerializedName("bot_full_name")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $botFullName;

    /**
     * The message content, in raw Markdown format (not rendered to HTML).
     *
     * @var string|null
     * @SerializedName("data")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $data;

    /**
     * What aspect of the message triggered the outgoing webhook notification. Possible values include &#x60;private_message&#x60; and &#x60;mention&#x60;.
     *
     * @var string|null
     * @SerializedName("trigger")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $trigger;

    /**
     * A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the &#x60;zuliprc&#x60; file downloaded when creating the bot.
     *
     * @var string|null
     * @SerializedName("token")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $token;

    /**
     * A dict containing details on the message that triggered the outgoing webhook, in the format used by [&#x60;GET /messages&#x60;](/api/get-messages).
     *
     * @var MessagesBase|null
     * @SerializedName("message")
     * @Assert\Type("MessagesBase")
     * @Type("MessagesBase")
     */
    protected $message;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->botEmail = isset($data['botEmail']) ? $data['botEmail'] : null;
        $this->botFullName = isset($data['botFullName']) ? $data['botFullName'] : null;
        $this->data = isset($data['data']) ? $data['data'] : null;
        $this->trigger = isset($data['trigger']) ? $data['trigger'] : null;
        $this->token = isset($data['token']) ? $data['token'] : null;
        $this->message = isset($data['message']) ? $data['message'] : null;
    }

    /**
     * Gets botEmail.
     *
     * @return string|null
     */
    public function getBotEmail()
    {
        return $this->botEmail;
    }

    /**
     * Sets botEmail.
     *
     * @param string|null $botEmail  Email of the bot user.
     *
     * @return $this
     */
    public function setBotEmail($botEmail = null)
    {
        $this->botEmail = $botEmail;

        return $this;
    }

    /**
     * Gets botFullName.
     *
     * @return string|null
     */
    public function getBotFullName()
    {
        return $this->botFullName;
    }

    /**
     * Sets botFullName.
     *
     * @param string|null $botFullName  The full name of the bot user.
     *
     * @return $this
     */
    public function setBotFullName($botFullName = null)
    {
        $this->botFullName = $botFullName;

        return $this;
    }

    /**
     * Gets data.
     *
     * @return string|null
     */
    public function getData()
    {
        return $this->data;
    }

    /**
     * Sets data.
     *
     * @param string|null $data  The message content, in raw Markdown format (not rendered to HTML).
     *
     * @return $this
     */
    public function setData($data = null)
    {
        $this->data = $data;

        return $this;
    }

    /**
     * Gets trigger.
     *
     * @return string|null
     */
    public function getTrigger()
    {
        return $this->trigger;
    }

    /**
     * Sets trigger.
     *
     * @param string|null $trigger  What aspect of the message triggered the outgoing webhook notification. Possible values include `private_message` and `mention`.
     *
     * @return $this
     */
    public function setTrigger($trigger = null)
    {
        $this->trigger = $trigger;

        return $this;
    }

    /**
     * Gets token.
     *
     * @return string|null
     */
    public function getToken()
    {
        return $this->token;
    }

    /**
     * Sets token.
     *
     * @param string|null $token  A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the `zuliprc` file downloaded when creating the bot.
     *
     * @return $this
     */
    public function setToken($token = null)
    {
        $this->token = $token;

        return $this;
    }

    /**
     * Gets message.
     *
     * @return MessagesBase|null
     */
    public function getMessage()
    {
        return $this->message;
    }

    /**
     * Sets message.
     *
     * @param MessagesBase|null $message  A dict containing details on the message that triggered the outgoing webhook, in the format used by [`GET /messages`](/api/get-messages).
     *
     * @return $this
     */
    public function setMessage($message = null)
    {
        $this->message = $message;

        return $this;
    }
}


