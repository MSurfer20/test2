<?php
/**
 * UserNotAuthorizedError
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
 * Class representing the UserNotAuthorizedError model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class UserNotAuthorizedError 
{
        /**
     * @var AnyType
     * @SerializedName("result")
     * @Assert\NotNull()
     * @Assert\Valid()
     * @Assert\Type("AnyType")
     * @Type("AnyType")
     */
    protected $result;

    /**
     * @var AnyType
     * @SerializedName("msg")
     * @Assert\NotNull()
     * @Assert\Valid()
     * @Assert\Type("AnyType")
     * @Type("AnyType")
     */
    protected $msg;

    /**
     * @var AnyType|null
     * @SerializedName("code")
     * @Assert\Type("AnyType")
     * @Type("AnyType")
     */
    protected $code;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->result = isset($data['result']) ? $data['result'] : null;
        $this->msg = isset($data['msg']) ? $data['msg'] : null;
        $this->code = isset($data['code']) ? $data['code'] : null;
    }

    /**
     * Gets result.
     *
     * @return AnyType
     */
    public function getResult()
    {
        return $this->result;
    }

    /**
     * Sets result.
     *
     * @param AnyType $result
     *
     * @return $this
     */
    public function setResult($result)
    {
        $this->result = $result;

        return $this;
    }

    /**
     * Gets msg.
     *
     * @return AnyType
     */
    public function getMsg()
    {
        return $this->msg;
    }

    /**
     * Sets msg.
     *
     * @param AnyType $msg
     *
     * @return $this
     */
    public function setMsg($msg)
    {
        $this->msg = $msg;

        return $this;
    }

    /**
     * Gets code.
     *
     * @return AnyType|null
     */
    public function getCode()
    {
        return $this->code;
    }

    /**
     * Sets code.
     *
     * @param AnyType|null $code
     *
     * @return $this
     */
    public function setCode($code = null)
    {
        $this->code = $code;

        return $this;
    }
}


