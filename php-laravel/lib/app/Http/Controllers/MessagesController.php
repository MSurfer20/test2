<?php

/**
 * Zulip REST API
 * Powerful open source group chat
 * PHP version 7.2.5
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 * Source files are located at:
 *
 * > https://github.com/OpenAPITools/openapi-generator/blob/master/modules/openapi-generator/src/main/resources/php-laravel/
 */


namespace App\Http\Controllers;

use Illuminate\Support\Facades\Request;

class MessagesController extends Controller
{
    /**
     * Constructor
     */
    public function __construct()
    {
    }

    /**
     * Operation markAllAsRead
     *
     * Mark all messages as read.
     *
     *
     * @return Http response
     */
    public function markAllAsRead()
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing markAllAsRead as a post method ?');
    }
    /**
     * Operation markStreamAsRead
     *
     * Mark messages in a stream as read.
     *
     *
     * @return Http response
     */
    public function markStreamAsRead()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['streamId'])) {
            throw new \InvalidArgumentException('Missing the required parameter $streamId when calling markStreamAsRead');
        }
        $streamId = $input['streamId'];


        return response('How about implementing markStreamAsRead as a post method ?');
    }
    /**
     * Operation markTopicAsRead
     *
     * Mark messages in a topic as read.
     *
     *
     * @return Http response
     */
    public function markTopicAsRead()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['streamId'])) {
            throw new \InvalidArgumentException('Missing the required parameter $streamId when calling markTopicAsRead');
        }
        $streamId = $input['streamId'];

        if (!isset($input['topicName'])) {
            throw new \InvalidArgumentException('Missing the required parameter $topicName when calling markTopicAsRead');
        }
        $topicName = $input['topicName'];


        return response('How about implementing markTopicAsRead as a post method ?');
    }
    /**
     * Operation getMessages
     *
     * Get messages.
     *
     *
     * @return Http response
     */
    public function getMessages()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['numBefore'])) {
            throw new \InvalidArgumentException('Missing the required parameter $numBefore when calling getMessages');
        }
        if ($input['numBefore'] < 0) {
            throw new \InvalidArgumentException('invalid value for $numBefore when calling MessagesController.getMessages, must be bigger than or equal to 0.');
        }
        $numBefore = $input['numBefore'];

        if (!isset($input['numAfter'])) {
            throw new \InvalidArgumentException('Missing the required parameter $numAfter when calling getMessages');
        }
        if ($input['numAfter'] < 0) {
            throw new \InvalidArgumentException('invalid value for $numAfter when calling MessagesController.getMessages, must be bigger than or equal to 0.');
        }
        $numAfter = $input['numAfter'];

        $anchor = $input['anchor'];

        $narrow = $input['narrow'];

        $clientGravatar = $input['clientGravatar'];

        $applyMarkdown = $input['applyMarkdown'];

        $useFirstUnreadAnchor = $input['useFirstUnreadAnchor'];


        return response('How about implementing getMessages as a get method ?');
    }
    /**
     * Operation sendMessage
     *
     * Send a message.
     *
     *
     * @return Http response
     */
    public function sendMessage()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['type'])) {
            throw new \InvalidArgumentException('Missing the required parameter $type when calling sendMessage');
        }
        $type = $input['type'];

        if (!isset($input['to'])) {
            throw new \InvalidArgumentException('Missing the required parameter $to when calling sendMessage');
        }
        $to = $input['to'];

        if (!isset($input['content'])) {
            throw new \InvalidArgumentException('Missing the required parameter $content when calling sendMessage');
        }
        $content = $input['content'];

        $topic = $input['topic'];

        $queueId = $input['queueId'];

        $localId = $input['localId'];


        return response('How about implementing sendMessage as a post method ?');
    }
    /**
     * Operation updateMessageFlags
     *
     * Update personal message flags.
     *
     *
     * @return Http response
     */
    public function updateMessageFlags()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['messages'])) {
            throw new \InvalidArgumentException('Missing the required parameter $messages when calling updateMessageFlags');
        }
        $messages = $input['messages'];

        if (!isset($input['op'])) {
            throw new \InvalidArgumentException('Missing the required parameter $op when calling updateMessageFlags');
        }
        $op = $input['op'];

        if (!isset($input['flag'])) {
            throw new \InvalidArgumentException('Missing the required parameter $flag when calling updateMessageFlags');
        }
        $flag = $input['flag'];


        return response('How about implementing updateMessageFlags as a post method ?');
    }
    /**
     * Operation checkMessagesMatchNarrow
     *
     * Check if messages match a narrow.
     *
     *
     * @return Http response
     */
    public function checkMessagesMatchNarrow()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['msgIds'])) {
            throw new \InvalidArgumentException('Missing the required parameter $msgIds when calling checkMessagesMatchNarrow');
        }
        $msgIds = $input['msgIds'];

        if (!isset($input['narrow'])) {
            throw new \InvalidArgumentException('Missing the required parameter $narrow when calling checkMessagesMatchNarrow');
        }
        $narrow = $input['narrow'];


        return response('How about implementing checkMessagesMatchNarrow as a get method ?');
    }
    /**
     * Operation renderMessage
     *
     * Render message.
     *
     *
     * @return Http response
     */
    public function renderMessage()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['content'])) {
            throw new \InvalidArgumentException('Missing the required parameter $content when calling renderMessage');
        }
        $content = $input['content'];


        return response('How about implementing renderMessage as a post method ?');
    }
    /**
     * Operation deleteMessage
     *
     * Delete a message.
     *
     * @param int $messageId The target message&#39;s ID. (required)
     *
     * @return Http response
     */
    public function deleteMessage($messageId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing deleteMessage as a delete method ?');
    }
    /**
     * Operation getRawMessage
     *
     * Get a message's raw Markdown.
     *
     * @param int $messageId The target message&#39;s ID. (required)
     *
     * @return Http response
     */
    public function getRawMessage($messageId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getRawMessage as a get method ?');
    }
    /**
     * Operation updateMessage
     *
     * Edit a message.
     *
     * @param int $messageId The target message&#39;s ID. (required)
     *
     * @return Http response
     */
    public function updateMessage($messageId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing updateMessage as a patch method ?');
    }
    /**
     * Operation getMessageHistory
     *
     * Get a message's edit history.
     *
     * @param int $messageId The target message&#39;s ID. (required)
     *
     * @return Http response
     */
    public function getMessageHistory($messageId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getMessageHistory as a get method ?');
    }
    /**
     * Operation addReaction
     *
     * Add an emoji reaction.
     *
     * @param int $messageId The target message&#39;s ID. (required)
     *
     * @return Http response
     */
    public function addReaction($messageId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing addReaction as a post method ?');
    }
    /**
     * Operation removeReaction
     *
     * Remove an emoji reaction.
     *
     * @param int $messageId The target message&#39;s ID. (required)
     *
     * @return Http response
     */
    public function removeReaction($messageId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing removeReaction as a delete method ?');
    }
    /**
     * Operation uploadFile
     *
     * Upload a file.
     *
     *
     * @return Http response
     */
    public function uploadFile()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        $filename = $input['filename'];


        return response('How about implementing uploadFile as a post method ?');
    }
    /**
     * Operation getFileTemporaryUrl
     *
     * Get public temporary URL.
     *
     * @param int $realmIdStr The realm id. (required)
     * @param string $filename Path to the URL. (required)
     *
     * @return Http response
     */
    public function getFileTemporaryUrl($realmIdStr, $filename)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getFileTemporaryUrl as a get method ?');
    }
}
