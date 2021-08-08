<?php
/**
 * MessagesBase
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
 * Class representing the MessagesBase model.
 *
 * Object containing details of the message.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class MessagesBase 
{
        /**
     * The URL of the user&#39;s avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user&#39;s email address itself for this user.
     *
     * @var string|null
     * @SerializedName("avatar_url")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $avatarUrl;

    /**
     * A Zulip \&quot;client\&quot; string, describing what Zulip client sent the message.
     *
     * @var string|null
     * @SerializedName("client")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $client;

    /**
     * The content/body of the message.
     *
     * @var string|null
     * @SerializedName("content")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $content;

    /**
     * The HTTP &#x60;content_type&#x60; for the message content.  This will be &#x60;text/html&#x60; or &#x60;text/x-markdown&#x60;, depending on whether &#x60;apply_markdown&#x60; was set.
     *
     * @var string|null
     * @SerializedName("content_type")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $contentType;

    /**
     * Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message.
     *
     * @var OneOfStringArray|null
     * @SerializedName("display_recipient")
     * @Assert\Type("OneOfStringArray")
     * @Type("OneOfStringArray")
     */
    protected $displayRecipient;

    /**
     * The unique message ID.  Messages should always be displayed sorted by ID.
     *
     * @var int|null
     * @SerializedName("id")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $id;

    /**
     * Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages
     *
     * @var bool|null
     * @SerializedName("is_me_message")
     * @Assert\Type("bool")
     * @Type("bool")
     */
    protected $isMeMessage;

    /**
     * Data on any reactions to the message.
     *
     * @var OpenAPI\Server\Model\EmojiReaction[]|null
     * @SerializedName("reactions")
     * @Assert\All({
     *   @Assert\Type("OpenAPI\Server\Model\EmojiReaction")
     * })
     * @Type("array<OpenAPI\Server\Model\EmojiReaction>")
     */
    protected $reactions;

    /**
     * A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing.
     *
     * @var int|null
     * @SerializedName("recipient_id")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $recipientId;

    /**
     * The Zulip display email address of the message&#39;s sender.
     *
     * @var string|null
     * @SerializedName("sender_email")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $senderEmail;

    /**
     * The full name of the message&#39;s sender.
     *
     * @var string|null
     * @SerializedName("sender_full_name")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $senderFullName;

    /**
     * The user ID of the message&#39;s sender.
     *
     * @var int|null
     * @SerializedName("sender_id")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $senderId;

    /**
     * A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on &#x60;example.zulip.com&#x60;, this will be &#x60;example&#x60;.
     *
     * @var string|null
     * @SerializedName("sender_realm_str")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $senderRealmStr;

    /**
     * Only present for stream messages; the ID of the stream.
     *
     * @var int|null
     * @SerializedName("stream_id")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $streamId;

    /**
     * The &#x60;topic&#x60; of the message.  Currently always &#x60;\&quot;\&quot;&#x60; for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \&quot;subjects\&quot; and will eventually change.
     *
     * @var string|null
     * @SerializedName("subject")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $subject;

    /**
     * Data on any links to be included in the &#x60;topic&#x60; line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message&#39;s topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called &#x60;subject_links&#x60;; clients are recommended to rename &#x60;subject_links&#x60; to &#x60;topic_links&#x60; if present for compatibility with older Zulip servers.
     *
     * @var OpenAPI\Server\Model\MessagesBaseTopicLinks[]|null
     * @SerializedName("topic_links")
     * @Assert\All({
     *   @Assert\Type("OpenAPI\Server\Model\MessagesBaseTopicLinks")
     * })
     * @Type("array<OpenAPI\Server\Model\MessagesBaseTopicLinks>")
     */
    protected $topicLinks;

    /**
     * Data used for certain experimental Zulip integrations.
     *
     * @var string[]|null
     * @SerializedName("submessages")
     * @Assert\All({
     *   @Assert\Type("string")
     * })
     * @Type("array<string>")
     */
    protected $submessages;

    /**
     * The UNIX timestamp for when the message was sent, in UTC seconds.
     *
     * @var int|null
     * @SerializedName("timestamp")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $timestamp;

    /**
     * The type of the message: &#x60;stream&#x60; or &#x60;private&#x60;.
     *
     * @var string|null
     * @SerializedName("type")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $type;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->avatarUrl = isset($data['avatarUrl']) ? $data['avatarUrl'] : null;
        $this->client = isset($data['client']) ? $data['client'] : null;
        $this->content = isset($data['content']) ? $data['content'] : null;
        $this->contentType = isset($data['contentType']) ? $data['contentType'] : null;
        $this->displayRecipient = isset($data['displayRecipient']) ? $data['displayRecipient'] : null;
        $this->id = isset($data['id']) ? $data['id'] : null;
        $this->isMeMessage = isset($data['isMeMessage']) ? $data['isMeMessage'] : null;
        $this->reactions = isset($data['reactions']) ? $data['reactions'] : null;
        $this->recipientId = isset($data['recipientId']) ? $data['recipientId'] : null;
        $this->senderEmail = isset($data['senderEmail']) ? $data['senderEmail'] : null;
        $this->senderFullName = isset($data['senderFullName']) ? $data['senderFullName'] : null;
        $this->senderId = isset($data['senderId']) ? $data['senderId'] : null;
        $this->senderRealmStr = isset($data['senderRealmStr']) ? $data['senderRealmStr'] : null;
        $this->streamId = isset($data['streamId']) ? $data['streamId'] : null;
        $this->subject = isset($data['subject']) ? $data['subject'] : null;
        $this->topicLinks = isset($data['topicLinks']) ? $data['topicLinks'] : null;
        $this->submessages = isset($data['submessages']) ? $data['submessages'] : null;
        $this->timestamp = isset($data['timestamp']) ? $data['timestamp'] : null;
        $this->type = isset($data['type']) ? $data['type'] : null;
    }

    /**
     * Gets avatarUrl.
     *
     * @return string|null
     */
    public function getAvatarUrl()
    {
        return $this->avatarUrl;
    }

    /**
     * Sets avatarUrl.
     *
     * @param string|null $avatarUrl  The URL of the user's avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user's email address itself for this user.
     *
     * @return $this
     */
    public function setAvatarUrl($avatarUrl = null)
    {
        $this->avatarUrl = $avatarUrl;

        return $this;
    }

    /**
     * Gets client.
     *
     * @return string|null
     */
    public function getClient()
    {
        return $this->client;
    }

    /**
     * Sets client.
     *
     * @param string|null $client  A Zulip \"client\" string, describing what Zulip client sent the message.
     *
     * @return $this
     */
    public function setClient($client = null)
    {
        $this->client = $client;

        return $this;
    }

    /**
     * Gets content.
     *
     * @return string|null
     */
    public function getContent()
    {
        return $this->content;
    }

    /**
     * Sets content.
     *
     * @param string|null $content  The content/body of the message.
     *
     * @return $this
     */
    public function setContent($content = null)
    {
        $this->content = $content;

        return $this;
    }

    /**
     * Gets contentType.
     *
     * @return string|null
     */
    public function getContentType()
    {
        return $this->contentType;
    }

    /**
     * Sets contentType.
     *
     * @param string|null $contentType  The HTTP `content_type` for the message content.  This will be `text/html` or `text/x-markdown`, depending on whether `apply_markdown` was set.
     *
     * @return $this
     */
    public function setContentType($contentType = null)
    {
        $this->contentType = $contentType;

        return $this;
    }

    /**
     * Gets displayRecipient.
     *
     * @return OneOfStringArray|null
     */
    public function getDisplayRecipient()
    {
        return $this->displayRecipient;
    }

    /**
     * Sets displayRecipient.
     *
     * @param OneOfStringArray|null $displayRecipient  Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message.
     *
     * @return $this
     */
    public function setDisplayRecipient($displayRecipient = null)
    {
        $this->displayRecipient = $displayRecipient;

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
     * @param int|null $id  The unique message ID.  Messages should always be displayed sorted by ID.
     *
     * @return $this
     */
    public function setId($id = null)
    {
        $this->id = $id;

        return $this;
    }

    /**
     * Gets isMeMessage.
     *
     * @return bool|null
     */
    public function isIsMeMessage()
    {
        return $this->isMeMessage;
    }

    /**
     * Sets isMeMessage.
     *
     * @param bool|null $isMeMessage  Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages
     *
     * @return $this
     */
    public function setIsMeMessage($isMeMessage = null)
    {
        $this->isMeMessage = $isMeMessage;

        return $this;
    }

    /**
     * Gets reactions.
     *
     * @return OpenAPI\Server\Model\EmojiReaction[]|null
     */
    public function getReactions(): ?array
    {
        return $this->reactions;
    }

    /**
     * Sets reactions.
     *
     * @param OpenAPI\Server\Model\EmojiReaction[]|null $reactions  Data on any reactions to the message.
     *
     * @return $this
     */
    public function setReactions(array $reactions = null)
    {
        $this->reactions = $reactions;

        return $this;
    }

    /**
     * Gets recipientId.
     *
     * @return int|null
     */
    public function getRecipientId()
    {
        return $this->recipientId;
    }

    /**
     * Sets recipientId.
     *
     * @param int|null $recipientId  A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing.
     *
     * @return $this
     */
    public function setRecipientId($recipientId = null)
    {
        $this->recipientId = $recipientId;

        return $this;
    }

    /**
     * Gets senderEmail.
     *
     * @return string|null
     */
    public function getSenderEmail()
    {
        return $this->senderEmail;
    }

    /**
     * Sets senderEmail.
     *
     * @param string|null $senderEmail  The Zulip display email address of the message's sender.
     *
     * @return $this
     */
    public function setSenderEmail($senderEmail = null)
    {
        $this->senderEmail = $senderEmail;

        return $this;
    }

    /**
     * Gets senderFullName.
     *
     * @return string|null
     */
    public function getSenderFullName()
    {
        return $this->senderFullName;
    }

    /**
     * Sets senderFullName.
     *
     * @param string|null $senderFullName  The full name of the message's sender.
     *
     * @return $this
     */
    public function setSenderFullName($senderFullName = null)
    {
        $this->senderFullName = $senderFullName;

        return $this;
    }

    /**
     * Gets senderId.
     *
     * @return int|null
     */
    public function getSenderId()
    {
        return $this->senderId;
    }

    /**
     * Sets senderId.
     *
     * @param int|null $senderId  The user ID of the message's sender.
     *
     * @return $this
     */
    public function setSenderId($senderId = null)
    {
        $this->senderId = $senderId;

        return $this;
    }

    /**
     * Gets senderRealmStr.
     *
     * @return string|null
     */
    public function getSenderRealmStr()
    {
        return $this->senderRealmStr;
    }

    /**
     * Sets senderRealmStr.
     *
     * @param string|null $senderRealmStr  A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on `example.zulip.com`, this will be `example`.
     *
     * @return $this
     */
    public function setSenderRealmStr($senderRealmStr = null)
    {
        $this->senderRealmStr = $senderRealmStr;

        return $this;
    }

    /**
     * Gets streamId.
     *
     * @return int|null
     */
    public function getStreamId()
    {
        return $this->streamId;
    }

    /**
     * Sets streamId.
     *
     * @param int|null $streamId  Only present for stream messages; the ID of the stream.
     *
     * @return $this
     */
    public function setStreamId($streamId = null)
    {
        $this->streamId = $streamId;

        return $this;
    }

    /**
     * Gets subject.
     *
     * @return string|null
     */
    public function getSubject()
    {
        return $this->subject;
    }

    /**
     * Sets subject.
     *
     * @param string|null $subject  The `topic` of the message.  Currently always `\"\"` for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \"subjects\" and will eventually change.
     *
     * @return $this
     */
    public function setSubject($subject = null)
    {
        $this->subject = $subject;

        return $this;
    }

    /**
     * Gets topicLinks.
     *
     * @return OpenAPI\Server\Model\MessagesBaseTopicLinks[]|null
     */
    public function getTopicLinks(): ?array
    {
        return $this->topicLinks;
    }

    /**
     * Sets topicLinks.
     *
     * @param OpenAPI\Server\Model\MessagesBaseTopicLinks[]|null $topicLinks  Data on any links to be included in the `topic` line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message's topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called `subject_links`; clients are recommended to rename `subject_links` to `topic_links` if present for compatibility with older Zulip servers.
     *
     * @return $this
     */
    public function setTopicLinks(array $topicLinks = null)
    {
        $this->topicLinks = $topicLinks;

        return $this;
    }

    /**
     * Gets submessages.
     *
     * @return string[]|null
     */
    public function getSubmessages(): ?array
    {
        return $this->submessages;
    }

    /**
     * Sets submessages.
     *
     * @param string[]|null $submessages  Data used for certain experimental Zulip integrations.
     *
     * @return $this
     */
    public function setSubmessages(array $submessages = null)
    {
        $this->submessages = $submessages;

        return $this;
    }

    /**
     * Gets timestamp.
     *
     * @return int|null
     */
    public function getTimestamp()
    {
        return $this->timestamp;
    }

    /**
     * Sets timestamp.
     *
     * @param int|null $timestamp  The UNIX timestamp for when the message was sent, in UTC seconds.
     *
     * @return $this
     */
    public function setTimestamp($timestamp = null)
    {
        $this->timestamp = $timestamp;

        return $this;
    }

    /**
     * Gets type.
     *
     * @return string|null
     */
    public function getType()
    {
        return $this->type;
    }

    /**
     * Sets type.
     *
     * @param string|null $type  The type of the message: `stream` or `private`.
     *
     * @return $this
     */
    public function setType($type = null)
    {
        $this->type = $type;

        return $this;
    }
}


