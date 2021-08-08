<?php
/**
 * DefaultStreamGroup
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
 * Class representing the DefaultStreamGroup model.
 *
 * Dictionary containing details of a default stream group.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class DefaultStreamGroup 
{
        /**
     * Name of the default stream group.
     *
     * @var string|null
     * @SerializedName("name")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $name;

    /**
     * Description of the default stream group.
     *
     * @var string|null
     * @SerializedName("description")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $description;

    /**
     * id of the default stream group.
     *
     * @var int|null
     * @SerializedName("id")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $id;

    /**
     * Array containing details about the streams in the default stream group.
     *
     * @var OpenAPI\Server\Model\BasicStream[]|null
     * @SerializedName("streams")
     * @Assert\All({
     *   @Assert\Type("OpenAPI\Server\Model\BasicStream")
     * })
     * @Type("array<OpenAPI\Server\Model\BasicStream>")
     */
    protected $streams;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->name = isset($data['name']) ? $data['name'] : null;
        $this->description = isset($data['description']) ? $data['description'] : null;
        $this->id = isset($data['id']) ? $data['id'] : null;
        $this->streams = isset($data['streams']) ? $data['streams'] : null;
    }

    /**
     * Gets name.
     *
     * @return string|null
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * Sets name.
     *
     * @param string|null $name  Name of the default stream group.
     *
     * @return $this
     */
    public function setName($name = null)
    {
        $this->name = $name;

        return $this;
    }

    /**
     * Gets description.
     *
     * @return string|null
     */
    public function getDescription()
    {
        return $this->description;
    }

    /**
     * Sets description.
     *
     * @param string|null $description  Description of the default stream group.
     *
     * @return $this
     */
    public function setDescription($description = null)
    {
        $this->description = $description;

        return $this;
    }

    /**
     * Gets id.
     *
     * @return int|null
     */
    public function getId()
    {
        return $this->id;
    }

    /**
     * Sets id.
     *
     * @param int|null $id  id of the default stream group.
     *
     * @return $this
     */
    public function setId($id = null)
    {
        $this->id = $id;

        return $this;
    }

    /**
     * Gets streams.
     *
     * @return OpenAPI\Server\Model\BasicStream[]|null
     */
    public function getStreams(): ?array
    {
        return $this->streams;
    }

    /**
     * Sets streams.
     *
     * @param OpenAPI\Server\Model\BasicStream[]|null $streams  Array containing details about the streams in the default stream group.
     *
     * @return $this
     */
    public function setStreams(array $streams = null)
    {
        $this->streams = $streams;

        return $this;
    }
}

