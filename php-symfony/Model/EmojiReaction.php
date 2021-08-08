<?php
/**
 * EmojiReaction
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
 * Class representing the EmojiReaction model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class EmojiReaction 
{
        /**
     * @var AnyType|null
     * @SerializedName("emoji_code")
     * @Assert\Type("AnyType")
     * @Type("AnyType")
     */
    protected $emojiCode;

    /**
     * @var AnyType|null
     * @SerializedName("emoji_name")
     * @Assert\Type("AnyType")
     * @Type("AnyType")
     */
    protected $emojiName;

    /**
     * @var AnyType|null
     * @SerializedName("reaction_type")
     * @Assert\Type("AnyType")
     * @Type("AnyType")
     */
    protected $reactionType;

    /**
     * @var AnyType|null
     * @SerializedName("user_id")
     * @Assert\Type("AnyType")
     * @Type("AnyType")
     */
    protected $userId;

    /**
     * @var AnyType|null
     * @SerializedName("user")
     * @Assert\Type("AnyType")
     * @Type("AnyType")
     */
    protected $user;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->emojiCode = isset($data['emojiCode']) ? $data['emojiCode'] : null;
        $this->emojiName = isset($data['emojiName']) ? $data['emojiName'] : null;
        $this->reactionType = isset($data['reactionType']) ? $data['reactionType'] : null;
        $this->userId = isset($data['userId']) ? $data['userId'] : null;
        $this->user = isset($data['user']) ? $data['user'] : null;
    }

    /**
     * Gets emojiCode.
     *
     * @return AnyType|null
     */
    public function getEmojiCode()
    {
        return $this->emojiCode;
    }

    /**
     * Sets emojiCode.
     *
     * @param AnyType|null $emojiCode
     *
     * @return $this
     */
    public function setEmojiCode($emojiCode = null)
    {
        $this->emojiCode = $emojiCode;

        return $this;
    }

    /**
     * Gets emojiName.
     *
     * @return AnyType|null
     */
    public function getEmojiName()
    {
        return $this->emojiName;
    }

    /**
     * Sets emojiName.
     *
     * @param AnyType|null $emojiName
     *
     * @return $this
     */
    public function setEmojiName($emojiName = null)
    {
        $this->emojiName = $emojiName;

        return $this;
    }

    /**
     * Gets reactionType.
     *
     * @return AnyType|null
     */
    public function getReactionType()
    {
        return $this->reactionType;
    }

    /**
     * Sets reactionType.
     *
     * @param AnyType|null $reactionType
     *
     * @return $this
     */
    public function setReactionType($reactionType = null)
    {
        $this->reactionType = $reactionType;

        return $this;
    }

    /**
     * Gets userId.
     *
     * @return AnyType|null
     */
    public function getUserId()
    {
        return $this->userId;
    }

    /**
     * Sets userId.
     *
     * @param AnyType|null $userId
     *
     * @return $this
     */
    public function setUserId($userId = null)
    {
        $this->userId = $userId;

        return $this;
    }

    /**
     * Gets user.
     *
     * @return AnyType|null
     */
    public function getUser()
    {
        return $this->user;
    }

    /**
     * Sets user.
     *
     * @param AnyType|null $user
     *
     * @return $this
     */
    public function setUser($user = null)
    {
        $this->user = $user;

        return $this;
    }
}


