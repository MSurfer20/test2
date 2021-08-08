<?php
/**
 * Bot
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
 * Bot Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<TKey, TValue>
 * @template TKey int|null
 * @template TValue mixed|null
 */
class Bot implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'Bot';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'user_id' => 'mixed',
        'full_name' => 'mixed',
        'api_key' => 'mixed',
        'default_sending_stream' => 'mixed',
        'default_events_register_stream' => 'mixed',
        'default_all_public_streams' => 'mixed',
        'avatar_url' => 'mixed',
        'owner_id' => 'mixed',
        'services' => 'mixed',
        'email' => 'string',
        'bot_type' => 'int',
        'is_active' => 'bool'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'user_id' => null,
        'full_name' => null,
        'api_key' => null,
        'default_sending_stream' => null,
        'default_events_register_stream' => null,
        'default_all_public_streams' => null,
        'avatar_url' => null,
        'owner_id' => null,
        'services' => null,
        'email' => null,
        'bot_type' => null,
        'is_active' => null
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
        'user_id' => 'user_id',
        'full_name' => 'full_name',
        'api_key' => 'api_key',
        'default_sending_stream' => 'default_sending_stream',
        'default_events_register_stream' => 'default_events_register_stream',
        'default_all_public_streams' => 'default_all_public_streams',
        'avatar_url' => 'avatar_url',
        'owner_id' => 'owner_id',
        'services' => 'services',
        'email' => 'email',
        'bot_type' => 'bot_type',
        'is_active' => 'is_active'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'user_id' => 'setUserId',
        'full_name' => 'setFullName',
        'api_key' => 'setApiKey',
        'default_sending_stream' => 'setDefaultSendingStream',
        'default_events_register_stream' => 'setDefaultEventsRegisterStream',
        'default_all_public_streams' => 'setDefaultAllPublicStreams',
        'avatar_url' => 'setAvatarUrl',
        'owner_id' => 'setOwnerId',
        'services' => 'setServices',
        'email' => 'setEmail',
        'bot_type' => 'setBotType',
        'is_active' => 'setIsActive'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'user_id' => 'getUserId',
        'full_name' => 'getFullName',
        'api_key' => 'getApiKey',
        'default_sending_stream' => 'getDefaultSendingStream',
        'default_events_register_stream' => 'getDefaultEventsRegisterStream',
        'default_all_public_streams' => 'getDefaultAllPublicStreams',
        'avatar_url' => 'getAvatarUrl',
        'owner_id' => 'getOwnerId',
        'services' => 'getServices',
        'email' => 'getEmail',
        'bot_type' => 'getBotType',
        'is_active' => 'getIsActive'
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
        $this->container['user_id'] = $data['user_id'] ?? null;
        $this->container['full_name'] = $data['full_name'] ?? null;
        $this->container['api_key'] = $data['api_key'] ?? null;
        $this->container['default_sending_stream'] = $data['default_sending_stream'] ?? null;
        $this->container['default_events_register_stream'] = $data['default_events_register_stream'] ?? null;
        $this->container['default_all_public_streams'] = $data['default_all_public_streams'] ?? null;
        $this->container['avatar_url'] = $data['avatar_url'] ?? null;
        $this->container['owner_id'] = $data['owner_id'] ?? null;
        $this->container['services'] = $data['services'] ?? null;
        $this->container['email'] = $data['email'] ?? null;
        $this->container['bot_type'] = $data['bot_type'] ?? null;
        $this->container['is_active'] = $data['is_active'] ?? null;
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
     * Gets user_id
     *
     * @return mixed|null
     */
    public function getUserId()
    {
        return $this->container['user_id'];
    }

    /**
     * Sets user_id
     *
     * @param mixed|null $user_id user_id
     *
     * @return self
     */
    public function setUserId($user_id)
    {
        $this->container['user_id'] = $user_id;

        return $this;
    }

    /**
     * Gets full_name
     *
     * @return mixed|null
     */
    public function getFullName()
    {
        return $this->container['full_name'];
    }

    /**
     * Sets full_name
     *
     * @param mixed|null $full_name full_name
     *
     * @return self
     */
    public function setFullName($full_name)
    {
        $this->container['full_name'] = $full_name;

        return $this;
    }

    /**
     * Gets api_key
     *
     * @return mixed|null
     */
    public function getApiKey()
    {
        return $this->container['api_key'];
    }

    /**
     * Sets api_key
     *
     * @param mixed|null $api_key api_key
     *
     * @return self
     */
    public function setApiKey($api_key)
    {
        $this->container['api_key'] = $api_key;

        return $this;
    }

    /**
     * Gets default_sending_stream
     *
     * @return mixed|null
     */
    public function getDefaultSendingStream()
    {
        return $this->container['default_sending_stream'];
    }

    /**
     * Sets default_sending_stream
     *
     * @param mixed|null $default_sending_stream default_sending_stream
     *
     * @return self
     */
    public function setDefaultSendingStream($default_sending_stream)
    {
        $this->container['default_sending_stream'] = $default_sending_stream;

        return $this;
    }

    /**
     * Gets default_events_register_stream
     *
     * @return mixed|null
     */
    public function getDefaultEventsRegisterStream()
    {
        return $this->container['default_events_register_stream'];
    }

    /**
     * Sets default_events_register_stream
     *
     * @param mixed|null $default_events_register_stream default_events_register_stream
     *
     * @return self
     */
    public function setDefaultEventsRegisterStream($default_events_register_stream)
    {
        $this->container['default_events_register_stream'] = $default_events_register_stream;

        return $this;
    }

    /**
     * Gets default_all_public_streams
     *
     * @return mixed|null
     */
    public function getDefaultAllPublicStreams()
    {
        return $this->container['default_all_public_streams'];
    }

    /**
     * Sets default_all_public_streams
     *
     * @param mixed|null $default_all_public_streams default_all_public_streams
     *
     * @return self
     */
    public function setDefaultAllPublicStreams($default_all_public_streams)
    {
        $this->container['default_all_public_streams'] = $default_all_public_streams;

        return $this;
    }

    /**
     * Gets avatar_url
     *
     * @return mixed|null
     */
    public function getAvatarUrl()
    {
        return $this->container['avatar_url'];
    }

    /**
     * Sets avatar_url
     *
     * @param mixed|null $avatar_url avatar_url
     *
     * @return self
     */
    public function setAvatarUrl($avatar_url)
    {
        $this->container['avatar_url'] = $avatar_url;

        return $this;
    }

    /**
     * Gets owner_id
     *
     * @return mixed|null
     */
    public function getOwnerId()
    {
        return $this->container['owner_id'];
    }

    /**
     * Sets owner_id
     *
     * @param mixed|null $owner_id owner_id
     *
     * @return self
     */
    public function setOwnerId($owner_id)
    {
        $this->container['owner_id'] = $owner_id;

        return $this;
    }

    /**
     * Gets services
     *
     * @return mixed|null
     */
    public function getServices()
    {
        return $this->container['services'];
    }

    /**
     * Sets services
     *
     * @param mixed|null $services services
     *
     * @return self
     */
    public function setServices($services)
    {
        $this->container['services'] = $services;

        return $this;
    }

    /**
     * Gets email
     *
     * @return string|null
     */
    public function getEmail()
    {
        return $this->container['email'];
    }

    /**
     * Sets email
     *
     * @param string|null $email The email of the bot.
     *
     * @return self
     */
    public function setEmail($email)
    {
        $this->container['email'] = $email;

        return $this;
    }

    /**
     * Gets bot_type
     *
     * @return int|null
     */
    public function getBotType()
    {
        return $this->container['bot_type'];
    }

    /**
     * Sets bot_type
     *
     * @param int|null $bot_type An integer describing the type of bot: * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot.
     *
     * @return self
     */
    public function setBotType($bot_type)
    {
        $this->container['bot_type'] = $bot_type;

        return $this;
    }

    /**
     * Gets is_active
     *
     * @return bool|null
     */
    public function getIsActive()
    {
        return $this->container['is_active'];
    }

    /**
     * Sets is_active
     *
     * @param bool|null $is_active A boolean describing whether the user account has been deactivated.
     *
     * @return self
     */
    public function setIsActive($is_active)
    {
        $this->container['is_active'] = $is_active;

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


