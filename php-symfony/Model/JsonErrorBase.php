<?php
/**
 * JsonErrorBase
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
 * Class representing the JsonErrorBase model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class JsonErrorBase 
{
        /**
     * @var string
     * @SerializedName("result")
     * @Assert\NotNull()
     * @Assert\Choice({ "error" })
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $result;

    /**
     * @var string
     * @SerializedName("msg")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $msg;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->result = isset($data['result']) ? $data['result'] : null;
        $this->msg = isset($data['msg']) ? $data['msg'] : null;
    }

    /**
     * Gets result.
     *
     * @return string
     */
    public function getResult()
    {
        return $this->result;
    }

    /**
     * Sets result.
     *
     * @param string $result
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
     * @return string
     */
    public function getMsg()
    {
        return $this->msg;
    }

    /**
     * Sets msg.
     *
     * @param string $msg
     *
     * @return $this
     */
    public function setMsg($msg)
    {
        $this->msg = $msg;

        return $this;
    }
}


