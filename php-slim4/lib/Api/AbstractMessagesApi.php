<?php

/**
 * Zulip REST API
 * PHP version 7.2
 *
 * @package OpenAPIServer
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */

/**
 * Powerful open source group chat
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */
namespace OpenAPIServer\Api;

use Psr\Container\ContainerInterface;
use Psr\Http\Message\ServerRequestInterface;
use Psr\Http\Message\ResponseInterface;
use Slim\Exception\HttpNotImplementedException;

/**
 * AbstractMessagesApi Class Doc Comment
 *
 * @package OpenAPIServer\Api
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
abstract class AbstractMessagesApi
{

    /**
     * @var ContainerInterface|null Slim app container instance
     */
    protected $container;

    /**
     * Route Controller constructor receives container
     *
     * @param ContainerInterface|null $container Slim app container instance
     */
    public function __construct(ContainerInterface $container = null)
    {
        $this->container = $container;
    }


    /**
     * POST addReaction
     * Summary: Add an emoji reaction
     * Notes: Add an [emoji reaction](/help/emoji-reactions) to a message.  &#x60;POST {{ api_url }}/v1/messages/{message_id}/reactions&#x60;
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function addReaction(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $messageId = $args['message_id'];
        $queryParams = $request->getQueryParams();
        $emojiName = (key_exists('emoji_name', $queryParams)) ? $queryParams['emoji_name'] : null;
        $emojiCode = (key_exists('emoji_code', $queryParams)) ? $queryParams['emoji_code'] : null;
        $reactionType = (key_exists('reaction_type', $queryParams)) ? $queryParams['reaction_type'] : null;
        $message = "How about implementing addReaction as a POST method in OpenAPIServer\Api\MessagesApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * GET checkMessagesMatchNarrow
     * Summary: Check if messages match a narrow
     * Notes: Check whether a set of messages match a [narrow](/api/construct-narrow).  &#x60;GET {{ api_url }}/v1/messages/matches_narrow&#x60;  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the &#x60;match_subject&#x60; and &#x60;match_content&#x60; objects is designed to match those of &#x60;GET /messages&#x60;, so that a client can splice these fields into a &#x60;message&#x60; object received from &#x60;GET /events&#x60; and end up with an extended message object identical to how a &#x60;GET /messages&#x60; for the current narrow would have returned the message.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function checkMessagesMatchNarrow(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $msgIds = (key_exists('msg_ids', $queryParams)) ? $queryParams['msg_ids'] : null;
        $narrow = (key_exists('narrow', $queryParams)) ? $queryParams['narrow'] : null;
        $message = "How about implementing checkMessagesMatchNarrow as a GET method in OpenAPIServer\Api\MessagesApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * DELETE deleteMessage
     * Summary: Delete a message
     * Notes: Permanently delete a message.  &#x60;DELETE {{ api_url }}/v1/messages/{msg_id}&#x60;  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function deleteMessage(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $messageId = $args['message_id'];
        $message = "How about implementing deleteMessage as a DELETE method in OpenAPIServer\Api\MessagesApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * GET getFileTemporaryUrl
     * Summary: Get public temporary URL
     * Notes: Get a temporary URL for access to the file that doesn&#39;t require authentication.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function getFileTemporaryUrl(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $realmIdStr = $args['realm_id_str'];
        $filename = $args['filename'];
        $message = "How about implementing getFileTemporaryUrl as a GET method in OpenAPIServer\Api\MessagesApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * GET getMessageHistory
     * Summary: Get a message&#39;s edit history
     * Notes: Fetch the message edit history of a previously edited message.  &#x60;GET {{ api_url }}/v1/messages/{message_id}/history&#x60;  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function getMessageHistory(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $messageId = $args['message_id'];
        $message = "How about implementing getMessageHistory as a GET method in OpenAPIServer\Api\MessagesApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * GET getMessages
     * Summary: Get messages
     * Notes: Fetch message history from a Zulip server.  &#x60;GET {{ api_url }}/v1/messages&#x60;  This &#x60;GET /api/v1/messages&#x60; endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip&#39;s powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user&#39;s message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an &#x60;anchor&#x60; message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the &#x60;num_before&#x60; and &#x60;num_after&#x60; limits.  We recommend using &#x60;num_before &lt;&#x3D; 1000&#x60; and &#x60;num_after &lt;&#x3D; 1000&#x60; to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function getMessages(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $anchor = (key_exists('anchor', $queryParams)) ? $queryParams['anchor'] : null;
        $numBefore = (key_exists('num_before', $queryParams)) ? $queryParams['num_before'] : null;
        $numAfter = (key_exists('num_after', $queryParams)) ? $queryParams['num_after'] : null;
        $narrow = (key_exists('narrow', $queryParams)) ? $queryParams['narrow'] : null;
        $clientGravatar = (key_exists('client_gravatar', $queryParams)) ? $queryParams['client_gravatar'] : null;
        $applyMarkdown = (key_exists('apply_markdown', $queryParams)) ? $queryParams['apply_markdown'] : null;
        $useFirstUnreadAnchor = (key_exists('use_first_unread_anchor', $queryParams)) ? $queryParams['use_first_unread_anchor'] : null;
        $message = "How about implementing getMessages as a GET method in OpenAPIServer\Api\MessagesApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * GET getRawMessage
     * Summary: Get a message&#39;s raw Markdown
     * Notes: Get the raw content of a message.  &#x60;GET {{ api_url }}/v1/messages/{msg_id}&#x60;  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message&#39;s raw Markdown (e.g. for pre-filling a message-editing UI).
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function getRawMessage(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $messageId = $args['message_id'];
        $message = "How about implementing getRawMessage as a GET method in OpenAPIServer\Api\MessagesApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * POST markAllAsRead
     * Summary: Mark all messages as read
     * Notes: Marks all of the current user&#39;s unread messages as read.  &#x60;POST {{ api_url }}/v1/mark_all_as_read&#x60;
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function markAllAsRead(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $message = "How about implementing markAllAsRead as a POST method in OpenAPIServer\Api\MessagesApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * POST markStreamAsRead
     * Summary: Mark messages in a stream as read
     * Notes: Mark all the unread messages in a stream as read.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function markStreamAsRead(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $streamId = (key_exists('stream_id', $queryParams)) ? $queryParams['stream_id'] : null;
        $message = "How about implementing markStreamAsRead as a POST method in OpenAPIServer\Api\MessagesApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * POST markTopicAsRead
     * Summary: Mark messages in a topic as read
     * Notes: Mark all the unread messages in a topic as read.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function markTopicAsRead(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $streamId = (key_exists('stream_id', $queryParams)) ? $queryParams['stream_id'] : null;
        $topicName = (key_exists('topic_name', $queryParams)) ? $queryParams['topic_name'] : null;
        $message = "How about implementing markTopicAsRead as a POST method in OpenAPIServer\Api\MessagesApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * DELETE removeReaction
     * Summary: Remove an emoji reaction
     * Notes: Remove an [emoji reaction](/help/emoji-reactions) from a message.  &#x60;DELETE {{ api_url }}/v1/messages/{message_id}/reactions&#x60;
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function removeReaction(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $messageId = $args['message_id'];
        $queryParams = $request->getQueryParams();
        $emojiName = (key_exists('emoji_name', $queryParams)) ? $queryParams['emoji_name'] : null;
        $emojiCode = (key_exists('emoji_code', $queryParams)) ? $queryParams['emoji_code'] : null;
        $reactionType = (key_exists('reaction_type', $queryParams)) ? $queryParams['reaction_type'] : null;
        $message = "How about implementing removeReaction as a DELETE method in OpenAPIServer\Api\MessagesApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * POST renderMessage
     * Summary: Render message
     * Notes: Render a message to HTML.  &#x60;POST {{ api_url }}/v1/messages/render&#x60;
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function renderMessage(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $content = (key_exists('content', $queryParams)) ? $queryParams['content'] : null;
        $message = "How about implementing renderMessage as a POST method in OpenAPIServer\Api\MessagesApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * POST sendMessage
     * Summary: Send a message
     * Notes: Send a stream or a private message.  &#x60;POST {{ api_url }}/v1/messages&#x60;
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function sendMessage(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $type = (key_exists('type', $queryParams)) ? $queryParams['type'] : null;
        $to = (key_exists('to', $queryParams)) ? $queryParams['to'] : null;
        $content = (key_exists('content', $queryParams)) ? $queryParams['content'] : null;
        $topic = (key_exists('topic', $queryParams)) ? $queryParams['topic'] : null;
        $queueId = (key_exists('queue_id', $queryParams)) ? $queryParams['queue_id'] : null;
        $localId = (key_exists('local_id', $queryParams)) ? $queryParams['local_id'] : null;
        $message = "How about implementing sendMessage as a POST method in OpenAPIServer\Api\MessagesApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * PATCH updateMessage
     * Summary: Edit a message
     * Notes: Edit/update the content or topic of a message.  &#x60;PATCH {{ api_url }}/v1/messages/{msg_id}&#x60;  &#x60;{msg_id}&#x60; in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to &#x60;??? {original_topic}&#x60;.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function updateMessage(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $messageId = $args['message_id'];
        $queryParams = $request->getQueryParams();
        $topic = (key_exists('topic', $queryParams)) ? $queryParams['topic'] : null;
        $propagateMode = (key_exists('propagate_mode', $queryParams)) ? $queryParams['propagate_mode'] : null;
        $sendNotificationToOldThread = (key_exists('send_notification_to_old_thread', $queryParams)) ? $queryParams['send_notification_to_old_thread'] : null;
        $sendNotificationToNewThread = (key_exists('send_notification_to_new_thread', $queryParams)) ? $queryParams['send_notification_to_new_thread'] : null;
        $content = (key_exists('content', $queryParams)) ? $queryParams['content'] : null;
        $streamId = (key_exists('stream_id', $queryParams)) ? $queryParams['stream_id'] : null;
        $message = "How about implementing updateMessage as a PATCH method in OpenAPIServer\Api\MessagesApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * POST updateMessageFlags
     * Summary: Update personal message flags
     * Notes: Add or remove personal message flags like &#x60;read&#x60; and &#x60;starred&#x60; on a collection of message IDs.  &#x60;POST {{ api_url }}/v1/messages/flags&#x60;  For updating the &#x60;read&#x60; flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read).
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function updateMessageFlags(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $messages = (key_exists('messages', $queryParams)) ? $queryParams['messages'] : null;
        $op = (key_exists('op', $queryParams)) ? $queryParams['op'] : null;
        $flag = (key_exists('flag', $queryParams)) ? $queryParams['flag'] : null;
        $message = "How about implementing updateMessageFlags as a POST method in OpenAPIServer\Api\MessagesApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * POST uploadFile
     * Summary: Upload a file
     * Notes: Upload a single file and get the corresponding URI.  &#x60;POST {{ api_url }}/v1/user_uploads&#x60;  Initially, only you will be able to access the link.  To share the uploaded file, you&#39;ll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function uploadFile(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $body = $request->getParsedBody();
        $filename = (key_exists('filename', $request->getUploadedFiles())) ? $request->getUploadedFiles()['filename'] : null;
        $message = "How about implementing uploadFile as a POST method in OpenAPIServer\Api\MessagesApi class?";
        throw new HttpNotImplementedException($request, $message);
    }
}
