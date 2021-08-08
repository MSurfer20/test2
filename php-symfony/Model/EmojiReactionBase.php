<?php
/**
 * EmojiReactionBase
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
 * Class representing the EmojiReactionBase model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class EmojiReactionBase 
{
        /**
     * A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For example, for &#x60;unicode_emoji&#x60;, this will be an encoding of the Unicode codepoint.
     *
     * @var string|null
     * @SerializedName("emoji_code")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $emojiCode;

    /**
     * Name of the emoji.
     *
     * @var string|null
     * @SerializedName("emoji_name")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $emojiName;

    /**
     * One of the following values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode   codepoint). * &#x60;realm_emoji&#x60;: [Custom emoji](/help/add-custom-emoji).   (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to   namespace the &#x60;zulip&#x60; emoji.
     *
     * @var string|null
     * @SerializedName("reaction_type")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $reactionType;

    /**
     * The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The &#x60;user&#x60; object is deprecated and will be removed in the future.
     *
     * @var int|null
     * @SerializedName("user_id")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $userId;

    /**
     * @var OpenAPI\Server\Model\EmojiReactionBaseUser|null
     * @SerializedName("user")
     * @Assert\Type("OpenAPI\Server\Model\EmojiReactionBaseUser")
     * @Type("OpenAPI\Server\Model\EmojiReactionBaseUser")
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
     * @return string|null
     */
    public function getEmojiCode()
    {
        return $this->emojiCode;
    }

    /**
     * Sets emojiCode.
     *
     * @param string|null $emojiCode  A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint.
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
     * @return string|null
     */
    public function getEmojiName()
    {
        return $this->emojiName;
    }

    /**
     * Sets emojiName.
     *
     * @param string|null $emojiName  Name of the emoji.
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
     * @return string|null
     */
    public function getReactionType()
    {
        return $this->reactionType;
    }

    /**
     * Sets reactionType.
     *
     * @param string|null $reactionType  One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji.
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
     * @return int|null
     */
    public function getUserId()
    {
        return $this->userId;
    }

    /**
     * Sets userId.
     *
     * @param int|null $userId  The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future.
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
     * @return OpenAPI\Server\Model\EmojiReactionBaseUser|null
     */
    public function getUser(): ?EmojiReactionBaseUser
    {
        return $this->user;
    }

    /**
     * Sets user.
     *
     * @param OpenAPI\Server\Model\EmojiReactionBaseUser|null $user
     *
     * @return $this
     */
    public function setUser(EmojiReactionBaseUser $user = null)
    {
        $this->user = $user;

        return $this;
    }
}

