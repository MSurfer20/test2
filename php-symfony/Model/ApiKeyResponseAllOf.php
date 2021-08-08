<?php
/**
 * ApiKeyResponseAllOf
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
 * Class representing the ApiKeyResponseAllOf model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class ApiKeyResponseAllOf 
{
        /**
     * @var AnyType|null
     * @SerializedName("result")
     * @Assert\Type("AnyType")
     * @Type("AnyType")
     */
    protected $result;

    /**
     * @var AnyType|null
     * @SerializedName("msg")
     * @Assert\Type("AnyType")
     * @Type("AnyType")
     */
    protected $msg;

    /**
     * The API key that can be used to authenticate as the requested user.
     *
     * @var string
     * @SerializedName("api_key")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $apiKey;

    /**
     * The email address of the user who owns the API key
     *
     * @var string
     * @SerializedName("email")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $email;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->result = isset($data['result']) ? $data['result'] : null;
        $this->msg = isset($data['msg']) ? $data['msg'] : null;
        $this->apiKey = isset($data['apiKey']) ? $data['apiKey'] : null;
        $this->email = isset($data['email']) ? $data['email'] : null;
    }

    /**
     * Gets result.
     *
     * @return AnyType|null
     */
    public function getResult()
    {
        return $this->result;
    }

    /**
     * Sets result.
     *
     * @param AnyType|null $result
     *
     * @return $this
     */
    public function setResult($result = null)
    {
        $this->result = $result;

        return $this;
    }

    /**
     * Gets msg.
     *
     * @return AnyType|null
     */
    public function getMsg()
    {
        return $this->msg;
    }

    /**
     * Sets msg.
     *
     * @param AnyType|null $msg
     *
     * @return $this
     */
    public function setMsg($msg = null)
    {
        $this->msg = $msg;

        return $this;
    }

    /**
     * Gets apiKey.
     *
     * @return string
     */
    public function getApiKey()
    {
        return $this->apiKey;
    }

    /**
     * Sets apiKey.
     *
     * @param string $apiKey  The API key that can be used to authenticate as the requested user.
     *
     * @return $this
     */
    public function setApiKey($apiKey)
    {
        $this->apiKey = $apiKey;

        return $this;
    }

    /**
     * Gets email.
     *
     * @return string
     */
    public function getEmail()
    {
        return $this->email;
    }

    /**
     * Sets email.
     *
     * @param string $email  The email address of the user who owns the API key
     *
     * @return $this
     */
    public function setEmail($email)
    {
        $this->email = $email;

        return $this;
    }
}


