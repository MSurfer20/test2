<?php
/**
 * GetMessagesAllOf
 */
namespace app\Models;

/**
 * GetMessagesAllOf
 */
class GetMessagesAllOf {

    /** @var mixed $avatarUrl */
    private $avatarUrl;

    /** @var mixed $client */
    private $client;

    /** @var mixed $content */
    private $content;

    /** @var mixed $contentType */
    private $contentType;

    /** @var mixed $displayRecipient */
    private $displayRecipient;

    /** @var mixed $id */
    private $id;

    /** @var mixed $isMeMessage */
    private $isMeMessage;

    /** @var mixed $reactions */
    private $reactions;

    /** @var mixed $recipientId */
    private $recipientId;

    /** @var mixed $senderEmail */
    private $senderEmail;

    /** @var mixed $senderFullName */
    private $senderFullName;

    /** @var mixed $senderId */
    private $senderId;

    /** @var mixed $senderRealmStr */
    private $senderRealmStr;

    /** @var mixed $streamId */
    private $streamId;

    /** @var mixed $subject */
    private $subject;

    /** @var mixed $topicLinks */
    private $topicLinks;

    /** @var mixed $submessages */
    private $submessages;

    /** @var mixed $timestamp */
    private $timestamp;

    /** @var mixed $type */
    private $type;

    /** @var string[] $flags The user&#39;s [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags*/
    private $flags;

    /** @var int $lastEditTimestamp The UNIX timestamp for when the message was last edited, in UTC seconds.*/
    private $lastEditTimestamp;

    /** @var string $matchContent Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with &#x60;&lt;span class&#x3D;\&quot;highlight\&quot;&gt;&#x60; elements wrapping the matches for the search keywords.*/
    private $matchContent;

    /** @var string $matchSubject Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with &#x60;&lt;span class&#x3D;\&quot;highlight\&quot;&gt;&#x60; elements wrapping the matches for the search keywords.*/
    private $matchSubject;

}
