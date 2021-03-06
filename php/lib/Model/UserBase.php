<?php
/**
 * UserBase
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
 * UserBase Class Doc Comment
 *
 * @category Class
 * @description A dictionary containing basic data on a given Zulip user.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<TKey, TValue>
 * @template TKey int|null
 * @template TValue mixed|null
 */
class UserBase implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'UserBase';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'email' => 'string',
        'is_bot' => 'bool',
        'avatar_url' => 'string',
        'avatar_version' => 'int',
        'full_name' => 'string',
        'is_admin' => 'bool',
        'is_owner' => 'bool',
        'is_billing_admin' => 'bool',
        'role' => 'int',
        'bot_type' => 'int',
        'user_id' => 'int',
        'bot_owner_id' => 'int',
        'is_active' => 'bool',
        'is_guest' => 'bool',
        'timezone' => 'string',
        'date_joined' => 'string',
        'delivery_email' => 'string',
        'profile_data' => 'array<string,object>'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'email' => null,
        'is_bot' => null,
        'avatar_url' => null,
        'avatar_version' => null,
        'full_name' => null,
        'is_admin' => null,
        'is_owner' => null,
        'is_billing_admin' => null,
        'role' => null,
        'bot_type' => null,
        'user_id' => null,
        'bot_owner_id' => null,
        'is_active' => null,
        'is_guest' => null,
        'timezone' => null,
        'date_joined' => null,
        'delivery_email' => null,
        'profile_data' => null
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
        'email' => 'email',
        'is_bot' => 'is_bot',
        'avatar_url' => 'avatar_url',
        'avatar_version' => 'avatar_version',
        'full_name' => 'full_name',
        'is_admin' => 'is_admin',
        'is_owner' => 'is_owner',
        'is_billing_admin' => 'is_billing_admin',
        'role' => 'role',
        'bot_type' => 'bot_type',
        'user_id' => 'user_id',
        'bot_owner_id' => 'bot_owner_id',
        'is_active' => 'is_active',
        'is_guest' => 'is_guest',
        'timezone' => 'timezone',
        'date_joined' => 'date_joined',
        'delivery_email' => 'delivery_email',
        'profile_data' => 'profile_data'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'email' => 'setEmail',
        'is_bot' => 'setIsBot',
        'avatar_url' => 'setAvatarUrl',
        'avatar_version' => 'setAvatarVersion',
        'full_name' => 'setFullName',
        'is_admin' => 'setIsAdmin',
        'is_owner' => 'setIsOwner',
        'is_billing_admin' => 'setIsBillingAdmin',
        'role' => 'setRole',
        'bot_type' => 'setBotType',
        'user_id' => 'setUserId',
        'bot_owner_id' => 'setBotOwnerId',
        'is_active' => 'setIsActive',
        'is_guest' => 'setIsGuest',
        'timezone' => 'setTimezone',
        'date_joined' => 'setDateJoined',
        'delivery_email' => 'setDeliveryEmail',
        'profile_data' => 'setProfileData'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'email' => 'getEmail',
        'is_bot' => 'getIsBot',
        'avatar_url' => 'getAvatarUrl',
        'avatar_version' => 'getAvatarVersion',
        'full_name' => 'getFullName',
        'is_admin' => 'getIsAdmin',
        'is_owner' => 'getIsOwner',
        'is_billing_admin' => 'getIsBillingAdmin',
        'role' => 'getRole',
        'bot_type' => 'getBotType',
        'user_id' => 'getUserId',
        'bot_owner_id' => 'getBotOwnerId',
        'is_active' => 'getIsActive',
        'is_guest' => 'getIsGuest',
        'timezone' => 'getTimezone',
        'date_joined' => 'getDateJoined',
        'delivery_email' => 'getDeliveryEmail',
        'profile_data' => 'getProfileData'
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

    const ROLE_100 = 100;
    const ROLE_200 = 200;
    const ROLE_300 = 300;
    const ROLE_400 = 400;
    const ROLE_600 = 600;

    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getRoleAllowableValues()
    {
        return [
            self::ROLE_100,
            self::ROLE_200,
            self::ROLE_300,
            self::ROLE_400,
            self::ROLE_600,
        ];
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
        $this->container['email'] = $data['email'] ?? null;
        $this->container['is_bot'] = $data['is_bot'] ?? null;
        $this->container['avatar_url'] = $data['avatar_url'] ?? null;
        $this->container['avatar_version'] = $data['avatar_version'] ?? null;
        $this->container['full_name'] = $data['full_name'] ?? null;
        $this->container['is_admin'] = $data['is_admin'] ?? null;
        $this->container['is_owner'] = $data['is_owner'] ?? null;
        $this->container['is_billing_admin'] = $data['is_billing_admin'] ?? null;
        $this->container['role'] = $data['role'] ?? null;
        $this->container['bot_type'] = $data['bot_type'] ?? null;
        $this->container['user_id'] = $data['user_id'] ?? null;
        $this->container['bot_owner_id'] = $data['bot_owner_id'] ?? null;
        $this->container['is_active'] = $data['is_active'] ?? null;
        $this->container['is_guest'] = $data['is_guest'] ?? null;
        $this->container['timezone'] = $data['timezone'] ?? null;
        $this->container['date_joined'] = $data['date_joined'] ?? null;
        $this->container['delivery_email'] = $data['delivery_email'] ?? null;
        $this->container['profile_data'] = $data['profile_data'] ?? null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        $allowedValues = $this->getRoleAllowableValues();
        if (!is_null($this->container['role']) && !in_array($this->container['role'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value '%s' for 'role', must be one of '%s'",
                $this->container['role'],
                implode("', '", $allowedValues)
            );
        }

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
     * @param string|null $email The Zulip API email address of the user or bot.  If you do not have permission to view the email address of the target user, this will be a fake email address that is usable for the Zulip API but nothing else.
     *
     * @return self
     */
    public function setEmail($email)
    {
        $this->container['email'] = $email;

        return $this;
    }

    /**
     * Gets is_bot
     *
     * @return bool|null
     */
    public function getIsBot()
    {
        return $this->container['is_bot'];
    }

    /**
     * Sets is_bot
     *
     * @param bool|null $is_bot A boolean specifying whether the user is a bot or full account.
     *
     * @return self
     */
    public function setIsBot($is_bot)
    {
        $this->container['is_bot'] = $is_bot;

        return $this;
    }

    /**
     * Gets avatar_url
     *
     * @return string|null
     */
    public function getAvatarUrl()
    {
        return $this->container['avatar_url'];
    }

    /**
     * Sets avatar_url
     *
     * @param string|null $avatar_url URL for the user's avatar.  Will be `null` if the `client_gravatar` query parameter was set to `True` and the user's avatar is hosted by the Gravatar provider (i.e. the user has never uploaded an avatar).  **Changes**: In Zulip 3.0 (feature level 18), if the client has the `user_avatar_url_field_optional` capability, this will be missing at the server's sole discretion.
     *
     * @return self
     */
    public function setAvatarUrl($avatar_url)
    {
        $this->container['avatar_url'] = $avatar_url;

        return $this;
    }

    /**
     * Gets avatar_version
     *
     * @return int|null
     */
    public function getAvatarVersion()
    {
        return $this->container['avatar_version'];
    }

    /**
     * Sets avatar_version
     *
     * @param int|null $avatar_version Version for the user's avatar.  Used for cache-busting requests for the user's avatar.  Clients generally shouldn't need to use this; most avatar URLs sent by Zulip will already end with `?v={avatar_version}`.
     *
     * @return self
     */
    public function setAvatarVersion($avatar_version)
    {
        $this->container['avatar_version'] = $avatar_version;

        return $this;
    }

    /**
     * Gets full_name
     *
     * @return string|null
     */
    public function getFullName()
    {
        return $this->container['full_name'];
    }

    /**
     * Sets full_name
     *
     * @param string|null $full_name Full name of the user or bot, used for all display purposes.
     *
     * @return self
     */
    public function setFullName($full_name)
    {
        $this->container['full_name'] = $full_name;

        return $this;
    }

    /**
     * Gets is_admin
     *
     * @return bool|null
     */
    public function getIsAdmin()
    {
        return $this->container['is_admin'];
    }

    /**
     * Sets is_admin
     *
     * @param bool|null $is_admin A boolean specifying whether the user is an organization administrator.
     *
     * @return self
     */
    public function setIsAdmin($is_admin)
    {
        $this->container['is_admin'] = $is_admin;

        return $this;
    }

    /**
     * Gets is_owner
     *
     * @return bool|null
     */
    public function getIsOwner()
    {
        return $this->container['is_owner'];
    }

    /**
     * Sets is_owner
     *
     * @param bool|null $is_owner A boolean specifying whether the user is an organization owner. If true, is_admin will also be true.  **Changes**: New in Zulip 3.0 (feature level 8).
     *
     * @return self
     */
    public function setIsOwner($is_owner)
    {
        $this->container['is_owner'] = $is_owner;

        return $this;
    }

    /**
     * Gets is_billing_admin
     *
     * @return bool|null
     */
    public function getIsBillingAdmin()
    {
        return $this->container['is_billing_admin'];
    }

    /**
     * Sets is_billing_admin
     *
     * @param bool|null $is_billing_admin A boolean specifying whether the user is a billing administrator.  **Changes**: New in Zulip 5.0 (feature level 73).
     *
     * @return self
     */
    public function setIsBillingAdmin($is_billing_admin)
    {
        $this->container['is_billing_admin'] = $is_billing_admin;

        return $this;
    }

    /**
     * Gets role
     *
     * @return int|null
     */
    public function getRole()
    {
        return $this->container['role'];
    }

    /**
     * Sets role
     *
     * @param int|null $role [Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner => 100 * Organization administrator => 200 * Organization moderator => 300 * Member => 400 * Guest => 600  **Changes**: New in Zulip 4.0 (feature level 59).
     *
     * @return self
     */
    public function setRole($role)
    {
        $allowedValues = $this->getRoleAllowableValues();
        if (!is_null($role) && !in_array($role, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value '%s' for 'role', must be one of '%s'",
                    $role,
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['role'] = $role;

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
     * @param int|null $bot_type An integer describing the type of bot: * `null` if the user isn't a bot. * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot.
     *
     * @return self
     */
    public function setBotType($bot_type)
    {
        $this->container['bot_type'] = $bot_type;

        return $this;
    }

    /**
     * Gets user_id
     *
     * @return int|null
     */
    public function getUserId()
    {
        return $this->container['user_id'];
    }

    /**
     * Sets user_id
     *
     * @param int|null $user_id The unique ID of the user.
     *
     * @return self
     */
    public function setUserId($user_id)
    {
        $this->container['user_id'] = $user_id;

        return $this;
    }

    /**
     * Gets bot_owner_id
     *
     * @return int|null
     */
    public function getBotOwnerId()
    {
        return $this->container['bot_owner_id'];
    }

    /**
     * Sets bot_owner_id
     *
     * @param int|null $bot_owner_id If the user is a bot (i.e. `is_bot` is `True`), `bot_owner` is the user ID of the bot's owner (usually, whoever created the bot).  Will be null for legacy bots that do not have an owner.  **Changes**: New in Zulip 3.0 (feature level 1).  In previous versions, there was a `bot_owner` field containing the email address of the bot's owner.
     *
     * @return self
     */
    public function setBotOwnerId($bot_owner_id)
    {
        $this->container['bot_owner_id'] = $bot_owner_id;

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
     * @param bool|null $is_active A boolean specifying whether the user account has been deactivated.
     *
     * @return self
     */
    public function setIsActive($is_active)
    {
        $this->container['is_active'] = $is_active;

        return $this;
    }

    /**
     * Gets is_guest
     *
     * @return bool|null
     */
    public function getIsGuest()
    {
        return $this->container['is_guest'];
    }

    /**
     * Sets is_guest
     *
     * @param bool|null $is_guest A boolean specifying whether the user is a guest user.
     *
     * @return self
     */
    public function setIsGuest($is_guest)
    {
        $this->container['is_guest'] = $is_guest;

        return $this;
    }

    /**
     * Gets timezone
     *
     * @return string|null
     */
    public function getTimezone()
    {
        return $this->container['timezone'];
    }

    /**
     * Sets timezone
     *
     * @param string|null $timezone The time zone of the user.
     *
     * @return self
     */
    public function setTimezone($timezone)
    {
        $this->container['timezone'] = $timezone;

        return $this;
    }

    /**
     * Gets date_joined
     *
     * @return string|null
     */
    public function getDateJoined()
    {
        return $this->container['date_joined'];
    }

    /**
     * Sets date_joined
     *
     * @param string|null $date_joined The time the user account was created.
     *
     * @return self
     */
    public function setDateJoined($date_joined)
    {
        $this->container['date_joined'] = $date_joined;

        return $this;
    }

    /**
     * Gets delivery_email
     *
     * @return string|null
     */
    public function getDeliveryEmail()
    {
        return $this->container['delivery_email'];
    }

    /**
     * Sets delivery_email
     *
     * @param string|null $delivery_email The user's real email address.  This field is present only if [email address visibility](/help/restrict-visibility-of-email-addresses) is limited and you are an administrator with access to real email addresses under the configured policy.
     *
     * @return self
     */
    public function setDeliveryEmail($delivery_email)
    {
        $this->container['delivery_email'] = $delivery_email;

        return $this;
    }

    /**
     * Gets profile_data
     *
     * @return array<string,object>|null
     */
    public function getProfileData()
    {
        return $this->container['profile_data'];
    }

    /**
     * Sets profile_data
     *
     * @param array<string,object>|null $profile_data A dictionary containing custom profile field data for the user. Each entry maps the integer ID of a custom profile field in the organization to a dictionary containing the user's data for that field.  Generally the data includes just a single `value` key; for those custom profile fields supporting Markdown, a `rendered_value` key will also be present.
     *
     * @return self
     */
    public function setProfileData($profile_data)
    {
        $this->container['profile_data'] = $profile_data;

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


