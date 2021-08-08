<?php
/**
 * RealmExport
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
 * RealmExport Class Doc Comment
 *
 * @category Class
 * @description Object containing details about a realm export.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<TKey, TValue>
 * @template TKey int|null
 * @template TValue mixed|null
 */
class RealmExport implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'RealmExport';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'id' => 'int',
        'acting_user_id' => 'int',
        'export_time' => 'float',
        'deleted_timestamp' => 'float',
        'failed_timestamp' => 'float',
        'export_url' => 'string',
        'pending' => 'bool'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'id' => null,
        'acting_user_id' => null,
        'export_time' => null,
        'deleted_timestamp' => null,
        'failed_timestamp' => null,
        'export_url' => null,
        'pending' => null
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
        'id' => 'id',
        'acting_user_id' => 'acting_user_id',
        'export_time' => 'export_time',
        'deleted_timestamp' => 'deleted_timestamp',
        'failed_timestamp' => 'failed_timestamp',
        'export_url' => 'export_url',
        'pending' => 'pending'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'id' => 'setId',
        'acting_user_id' => 'setActingUserId',
        'export_time' => 'setExportTime',
        'deleted_timestamp' => 'setDeletedTimestamp',
        'failed_timestamp' => 'setFailedTimestamp',
        'export_url' => 'setExportUrl',
        'pending' => 'setPending'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'id' => 'getId',
        'acting_user_id' => 'getActingUserId',
        'export_time' => 'getExportTime',
        'deleted_timestamp' => 'getDeletedTimestamp',
        'failed_timestamp' => 'getFailedTimestamp',
        'export_url' => 'getExportUrl',
        'pending' => 'getPending'
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
        $this->container['id'] = $data['id'] ?? null;
        $this->container['acting_user_id'] = $data['acting_user_id'] ?? null;
        $this->container['export_time'] = $data['export_time'] ?? null;
        $this->container['deleted_timestamp'] = $data['deleted_timestamp'] ?? null;
        $this->container['failed_timestamp'] = $data['failed_timestamp'] ?? null;
        $this->container['export_url'] = $data['export_url'] ?? null;
        $this->container['pending'] = $data['pending'] ?? null;
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
     * Gets id
     *
     * @return int|null
     */
    public function getId()
    {
        return $this->container['id'];
    }

    /**
     * Sets id
     *
     * @param int|null $id The id of the export.
     *
     * @return self
     */
    public function setId($id)
    {
        $this->container['id'] = $id;

        return $this;
    }

    /**
     * Gets acting_user_id
     *
     * @return int|null
     */
    public function getActingUserId()
    {
        return $this->container['acting_user_id'];
    }

    /**
     * Sets acting_user_id
     *
     * @param int|null $acting_user_id The id of the user who did the export.
     *
     * @return self
     */
    public function setActingUserId($acting_user_id)
    {
        $this->container['acting_user_id'] = $acting_user_id;

        return $this;
    }

    /**
     * Gets export_time
     *
     * @return float|null
     */
    public function getExportTime()
    {
        return $this->container['export_time'];
    }

    /**
     * Sets export_time
     *
     * @param float|null $export_time The UNIX timestamp of when the export was made.
     *
     * @return self
     */
    public function setExportTime($export_time)
    {
        $this->container['export_time'] = $export_time;

        return $this;
    }

    /**
     * Gets deleted_timestamp
     *
     * @return float|null
     */
    public function getDeletedTimestamp()
    {
        return $this->container['deleted_timestamp'];
    }

    /**
     * Sets deleted_timestamp
     *
     * @param float|null $deleted_timestamp The timestamp of when the export was deleted. Null if it wasn't.
     *
     * @return self
     */
    public function setDeletedTimestamp($deleted_timestamp)
    {
        $this->container['deleted_timestamp'] = $deleted_timestamp;

        return $this;
    }

    /**
     * Gets failed_timestamp
     *
     * @return float|null
     */
    public function getFailedTimestamp()
    {
        return $this->container['failed_timestamp'];
    }

    /**
     * Sets failed_timestamp
     *
     * @param float|null $failed_timestamp The timestamp of when the export failed. Null if it didn't.
     *
     * @return self
     */
    public function setFailedTimestamp($failed_timestamp)
    {
        $this->container['failed_timestamp'] = $failed_timestamp;

        return $this;
    }

    /**
     * Gets export_url
     *
     * @return string|null
     */
    public function getExportUrl()
    {
        return $this->container['export_url'];
    }

    /**
     * Sets export_url
     *
     * @param string|null $export_url The URL of the export. `null` if there's no URL.
     *
     * @return self
     */
    public function setExportUrl($export_url)
    {
        $this->container['export_url'] = $export_url;

        return $this;
    }

    /**
     * Gets pending
     *
     * @return bool|null
     */
    public function getPending()
    {
        return $this->container['pending'];
    }

    /**
     * Sets pending
     *
     * @param bool|null $pending Whether the export is pending or not.
     *
     * @return self
     */
    public function setPending($pending)
    {
        $this->container['pending'] = $pending;

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

