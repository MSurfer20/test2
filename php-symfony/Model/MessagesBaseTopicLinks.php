<?php
/**
 * MessagesBaseTopicLinks
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
 * Class representing the MessagesBaseTopicLinks model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class MessagesBaseTopicLinks 
{
        /**
     * The original link text present in the topic.
     *
     * @var string|null
     * @SerializedName("text")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $text;

    /**
     * The expanded target url which the link points to.
     *
     * @var string|null
     * @SerializedName("url")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $url;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->text = isset($data['text']) ? $data['text'] : null;
        $this->url = isset($data['url']) ? $data['url'] : null;
    }

    /**
     * Gets text.
     *
     * @return string|null
     */
    public function getText()
    {
        return $this->text;
    }

    /**
     * Sets text.
     *
     * @param string|null $text  The original link text present in the topic.
     *
     * @return $this
     */
    public function setText($text = null)
    {
        $this->text = $text;

        return $this;
    }

    /**
     * Gets url.
     *
     * @return string|null
     */
    public function getUrl()
    {
        return $this->url;
    }

    /**
     * Sets url.
     *
     * @param string|null $url  The expanded target url which the link points to.
     *
     * @return $this
     */
    public function setUrl($url = null)
    {
        $this->url = $url;

        return $this;
    }
}

