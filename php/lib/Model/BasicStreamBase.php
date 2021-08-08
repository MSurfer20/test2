<?php
/**
 * BasicStreamBase
 *
 * PHP version 7.2
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Zulip REST API
 *
 * Powerful open source group chat
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://openapi-generator.tech
 * OpenAPI Generator version: 5.2.0
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\Model;

use \ArrayAccess;
use \OpenAPI\Client\ObjectSerializer;

/**
 * BasicStreamBase Class Doc Comment
 *
 * @category Class
 * @description Object containing basic details about the stream.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<TKey, TValue>
 * @template TKey int|null
 * @template TValue mixed|null
 */
class BasicStreamBase implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'BasicStreamBase';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'stream_id' => 'int',
        'name' => 'string',
        'description' => 'string',
        'date_created' => 'int',
        'invite_only' => 'bool',
        'rendered_description' => 'string',
        'is_web_public' => 'bool',
        'stream_post_policy' => 'int',
        'message_retention_days' => 'int',
        'history_public_to_subscribers' => 'bool',
        'first_message_id' => 'int',
        'is_announcement_only' => 'bool'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'stream_id' => null,
        'name' => null,
        'description' => null,
        'date_created' => null,
        'invite_only' => null,
        'rendered_description' => null,
        'is_web_public' => null,
        'stream_post_policy' => null,
        'message_retention_days' => null,
        'history_public_to_subscribers' => null,
        'first_message_id' => null,
        'is_announcement_only' => null
    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPITypes()
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPIFormats()
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'stream_id' => 'stream_id',
        'name' => 'name',
        'description' => 'description',
        'date_created' => 'date_created',
        'invite_only' => 'invite_only',
        'rendered_description' => 'rendered_description',
        'is_web_public' => 'is_web_public',
        'stream_post_policy' => 'stream_post_policy',
        'message_retention_days' => 'message_retention_days',
        'history_public_to_subscribers' => 'history_public_to_subscribers',
        'first_message_id' => 'first_message_id',
        'is_announcement_only' => 'is_announcement_only'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'stream_id' => 'setStreamId',
        'name' => 'setName',
        'description' => 'setDescription',
        'date_created' => 'setDateCreated',
        'invite_only' => 'setInviteOnly',
        'rendered_description' => 'setRenderedDescription',
        'is_web_public' => 'setIsWebPublic',
        'stream_post_policy' => 'setStreamPostPolicy',
        'message_retention_days' => 'setMessageRetentionDays',
        'history_public_to_subscribers' => 'setHistoryPublicToSubscribers',
        'first_message_id' => 'setFirstMessageId',
        'is_announcement_only' => 'setIsAnnouncementOnly'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'stream_id' => 'getStreamId',
        'name' => 'getName',
        'description' => 'getDescription',
        'date_created' => 'getDateCreated',
        'invite_only' => 'getInviteOnly',
        'rendered_description' => 'getRenderedDescription',
        'is_web_public' => 'getIsWebPublic',
        'stream_post_policy' => 'getStreamPostPolicy',
        'message_retention_days' => 'getMessageRetentionDays',
        'history_public_to_subscribers' => 'getHistoryPublicToSubscribers',
        'first_message_id' => 'getFirstMessageId',
        'is_announcement_only' => 'getIsAnnouncementOnly'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$openAPIModelName;
    }


    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['stream_id'] = $data['stream_id'] ?? null;
        $this->container['name'] = $data['name'] ?? null;
        $this->container['description'] = $data['description'] ?? null;
        $this->container['date_created'] = $data['date_created'] ?? null;
        $this->container['invite_only'] = $data['invite_only'] ?? null;
        $this->container['rendered_description'] = $data['rendered_description'] ?? null;
        $this->container['is_web_public'] = $data['is_web_public'] ?? null;
        $this->container['stream_post_policy'] = $data['stream_post_policy'] ?? null;
        $this->container['message_retention_days'] = $data['message_retention_days'] ?? null;
        $this->container['history_public_to_subscribers'] = $data['history_public_to_subscribers'] ?? null;
        $this->container['first_message_id'] = $data['first_message_id'] ?? null;
        $this->container['is_announcement_only'] = $data['is_announcement_only'] ?? null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets stream_id
     *
     * @return int|null
     */
    public function getStreamId()
    {
        return $this->container['stream_id'];
    }

    /**
     * Sets stream_id
     *
     * @param int|null $stream_id The unique ID of the stream.
     *
     * @return self
     */
    public function setStreamId($stream_id)
    {
        $this->container['stream_id'] = $stream_id;

        return $this;
    }

    /**
     * Gets name
     *
     * @return string|null
     */
    public function getName()
    {
        return $this->container['name'];
    }

    /**
     * Sets name
     *
     * @param string|null $name The name of the stream.
     *
     * @return self
     */
    public function setName($name)
    {
        $this->container['name'] = $name;

        return $this;
    }

    /**
     * Gets description
     *
     * @return string|null
     */
    public function getDescription()
    {
        return $this->container['description'];
    }

    /**
     * Sets description
     *
     * @param string|null $description The short description of the stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description.
     *
     * @return self
     */
    public function setDescription($description)
    {
        $this->container['description'] = $description;

        return $this;
    }

    /**
     * Gets date_created
     *
     * @return int|null
     */
    public function getDateCreated()
    {
        return $this->container['date_created'];
    }

    /**
     * Sets date_created
     *
     * @param int|null $date_created The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30).
     *
     * @return self
     */
    public function setDateCreated($date_created)
    {
        $this->container['date_created'] = $date_created;

        return $this;
    }

    /**
     * Gets invite_only
     *
     * @return bool|null
     */
    public function getInviteOnly()
    {
        return $this->container['invite_only'];
    }

    /**
     * Sets invite_only
     *
     * @param bool|null $invite_only Specifies whether the stream is private or not. Only people who have been invited can access a private stream.
     *
     * @return self
     */
    public function setInviteOnly($invite_only)
    {
        $this->container['invite_only'] = $invite_only;

        return $this;
    }

    /**
     * Gets rendered_description
     *
     * @return string|null
     */
    public function getRenderedDescription()
    {
        return $this->container['rendered_description'];
    }

    /**
     * Sets rendered_description
     *
     * @param string|null $rendered_description The short description of the stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message.
     *
     * @return self
     */
    public function setRenderedDescription($rendered_description)
    {
        $this->container['rendered_description'] = $rendered_description;

        return $this;
    }

    /**
     * Gets is_web_public
     *
     * @return bool|null
     */
    public function getIsWebPublic()
    {
        return $this->container['is_web_public'];
    }

    /**
     * Sets is_web_public
     *
     * @param bool|null $is_web_public Whether the stream has been configured to allow unauthenticated access to its message history from the web.
     *
     * @return self
     */
    public function setIsWebPublic($is_web_public)
    {
        $this->container['is_web_public'] = $is_web_public;

        return $this;
    }

    /**
     * Gets stream_post_policy
     *
     * @return int|null
     */
    public function getStreamPostPolicy()
    {
        return $this->container['stream_post_policy'];
    }

    /**
     * Sets stream_post_policy
     *
     * @param int|null $stream_post_policy Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean.
     *
     * @return self
     */
    public function setStreamPostPolicy($stream_post_policy)
    {
        $this->container['stream_post_policy'] = $stream_post_policy;

        return $this;
    }

    /**
     * Gets message_retention_days
     *
     * @return int|null
     */
    public function getMessageRetentionDays()
    {
        return $this->container['message_retention_days'];
    }

    /**
     * Sets message_retention_days
     *
     * @param int|null $message_retention_days Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17).
     *
     * @return self
     */
    public function setMessageRetentionDays($message_retention_days)
    {
        $this->container['message_retention_days'] = $message_retention_days;

        return $this;
    }

    /**
     * Gets history_public_to_subscribers
     *
     * @return bool|null
     */
    public function getHistoryPublicToSubscribers()
    {
        return $this->container['history_public_to_subscribers'];
    }

    /**
     * Sets history_public_to_subscribers
     *
     * @param bool|null $history_public_to_subscribers Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future.
     *
     * @return self
     */
    public function setHistoryPublicToSubscribers($history_public_to_subscribers)
    {
        $this->container['history_public_to_subscribers'] = $history_public_to_subscribers;

        return $this;
    }

    /**
     * Gets first_message_id
     *
     * @return int|null
     */
    public function getFirstMessageId()
    {
        return $this->container['first_message_id'];
    }

    /**
     * Sets first_message_id
     *
     * @param int|null $first_message_id The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history.
     *
     * @return self
     */
    public function setFirstMessageId($first_message_id)
    {
        $this->container['first_message_id'] = $first_message_id;

        return $this;
    }

    /**
     * Gets is_announcement_only
     *
     * @return bool|null
     */
    public function getIsAnnouncementOnly()
    {
        return $this->container['is_announcement_only'];
    }

    /**
     * Sets is_announcement_only
     *
     * @param bool|null $is_announcement_only Whether the given stream is announcement only or not.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead.
     *
     * @return self
     */
    public function setIsAnnouncementOnly($is_announcement_only)
    {
        $this->container['is_announcement_only'] = $is_announcement_only;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed|null
     */
    public function offsetGet($offset)
    {
        return $this->container[$offset] ?? null;
    }

    /**
     * Sets value based on offset.
     *
     * @param int|null $offset Offset
     * @param mixed    $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Serializes the object to a value that can be serialized natively by json_encode().
     * @link https://www.php.net/manual/en/jsonserializable.jsonserialize.php
     *
     * @return mixed Returns data which can be serialized by json_encode(), which is a value
     * of any type other than a resource.
     */
    public function jsonSerialize()
    {
       return ObjectSerializer::sanitizeForSerialization($this);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        return json_encode(
            ObjectSerializer::sanitizeForSerialization($this),
            JSON_PRETTY_PRINT
        );
    }

    /**
     * Gets a header-safe presentation of the object
     *
     * @return string
     */
    public function toHeaderValue()
    {
        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}

