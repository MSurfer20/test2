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
 * AbstractStreamsApi Class Doc Comment
 *
 * @package OpenAPIServer\Api
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
abstract class AbstractStreamsApi
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
     * DELETE archiveStream
     * Summary: Archive a stream
     * Notes: [Archive the stream](/help/archive-a-stream) with the ID &#x60;stream_id&#x60;.  &#x60;DELETE {{ api_url }}/v1/streams/{stream_id}&#x60;
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function archiveStream(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $streamId = $args['stream_id'];
        $message = "How about implementing archiveStream as a DELETE method in OpenAPIServer\Api\StreamsApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * GET createBigBlueButtonVideoCall
     * Summary: Create BigBlueButton video call
     * Notes: Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function createBigBlueButtonVideoCall(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $message = "How about implementing createBigBlueButtonVideoCall as a GET method in OpenAPIServer\Api\StreamsApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * POST deleteTopic
     * Summary: Delete a topic
     * Notes: Delete all messages in a topic.  &#x60;POST {{ api_url }}/v1/streams/{stream_id}/delete_topic&#x60;  Topics are a field on messages (not an independent data structure), so deleting all the messages in the topic deletes the topic from Zulip.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function deleteTopic(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $streamId = $args['stream_id'];
        $queryParams = $request->getQueryParams();
        $topicName = (key_exists('topic_name', $queryParams)) ? $queryParams['topic_name'] : null;
        $message = "How about implementing deleteTopic as a POST method in OpenAPIServer\Api\StreamsApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * GET getStreamId
     * Summary: Get stream ID
     * Notes: Get the unique ID of a given stream.  &#x60;GET {{ api_url }}/v1/get_stream_id&#x60;
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function getStreamId(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $stream = (key_exists('stream', $queryParams)) ? $queryParams['stream'] : null;
        $message = "How about implementing getStreamId as a GET method in OpenAPIServer\Api\StreamsApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * GET getStreamTopics
     * Summary: Get topics in a stream
     * Notes: Get all the topics in a specific stream  &#x60;GET {{ api_url }}/v1/users/me/{stream_id}/topics&#x60;
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function getStreamTopics(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $streamId = $args['stream_id'];
        $message = "How about implementing getStreamTopics as a GET method in OpenAPIServer\Api\StreamsApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * GET getStreams
     * Summary: Get all streams
     * Notes: Get all streams that the user has access to.  &#x60;GET {{ api_url }}/v1/streams&#x60;
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function getStreams(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $includePublic = (key_exists('include_public', $queryParams)) ? $queryParams['include_public'] : null;
        $includeWebPublic = (key_exists('include_web_public', $queryParams)) ? $queryParams['include_web_public'] : null;
        $includeSubscribed = (key_exists('include_subscribed', $queryParams)) ? $queryParams['include_subscribed'] : null;
        $includeAllActive = (key_exists('include_all_active', $queryParams)) ? $queryParams['include_all_active'] : null;
        $includeDefault = (key_exists('include_default', $queryParams)) ? $queryParams['include_default'] : null;
        $includeOwnerSubscribed = (key_exists('include_owner_subscribed', $queryParams)) ? $queryParams['include_owner_subscribed'] : null;
        $message = "How about implementing getStreams as a GET method in OpenAPIServer\Api\StreamsApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * GET getSubscribers
     * Summary: Get the subscribers of a stream
     * Notes: Get all users subscribed to a stream.  &#x60;Get {{ api_url }}/v1/streams/{stream_id}/members&#x60;
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function getSubscribers(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $streamId = $args['stream_id'];
        $message = "How about implementing getSubscribers as a GET method in OpenAPIServer\Api\StreamsApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * GET getSubscriptionStatus
     * Summary: Get subscription status
     * Notes: Check whether a user is subscribed to a stream.  &#x60;GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}&#x60;  **Changes**: New in Zulip 3.0 (feature level 11).
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function getSubscriptionStatus(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $userId = $args['user_id'];
        $streamId = $args['stream_id'];
        $message = "How about implementing getSubscriptionStatus as a GET method in OpenAPIServer\Api\StreamsApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * GET getSubscriptions
     * Summary: Get subscribed streams
     * Notes: Get all streams that the user is subscribed to.  &#x60;GET {{ api_url }}/v1/users/me/subscriptions&#x60;
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function getSubscriptions(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $includeSubscribers = (key_exists('include_subscribers', $queryParams)) ? $queryParams['include_subscribers'] : null;
        $message = "How about implementing getSubscriptions as a GET method in OpenAPIServer\Api\StreamsApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * PATCH muteTopic
     * Summary: Topic muting
     * Notes: This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user&#39;s unread count totals.  &#x60;PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics&#x60;
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function muteTopic(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $stream = (key_exists('stream', $queryParams)) ? $queryParams['stream'] : null;
        $streamId = (key_exists('stream_id', $queryParams)) ? $queryParams['stream_id'] : null;
        $topic = (key_exists('topic', $queryParams)) ? $queryParams['topic'] : null;
        $op = (key_exists('op', $queryParams)) ? $queryParams['op'] : null;
        $message = "How about implementing muteTopic as a PATCH method in OpenAPIServer\Api\StreamsApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * POST subscribe
     * Summary: Subscribe to a stream
     * Notes: Subscribe one or more users to one or more streams.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions&#x60;  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like &#x60;invite_only&#x60; detailed below.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function subscribe(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $subscriptions = (key_exists('subscriptions', $queryParams)) ? $queryParams['subscriptions'] : null;
        $principals = (key_exists('principals', $queryParams)) ? $queryParams['principals'] : null;
        $authorizationErrorsFatal = (key_exists('authorization_errors_fatal', $queryParams)) ? $queryParams['authorization_errors_fatal'] : null;
        $announce = (key_exists('announce', $queryParams)) ? $queryParams['announce'] : null;
        $inviteOnly = (key_exists('invite_only', $queryParams)) ? $queryParams['invite_only'] : null;
        $historyPublicToSubscribers = (key_exists('history_public_to_subscribers', $queryParams)) ? $queryParams['history_public_to_subscribers'] : null;
        $streamPostPolicy = (key_exists('stream_post_policy', $queryParams)) ? $queryParams['stream_post_policy'] : null;
        $messageRetentionDays = (key_exists('message_retention_days', $queryParams)) ? $queryParams['message_retention_days'] : null;
        $message = "How about implementing subscribe as a POST method in OpenAPIServer\Api\StreamsApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * DELETE unsubscribe
     * Summary: Unsubscribe from a stream
     * Notes: Unsubscribe yourself or other users from one or more streams.  &#x60;DELETE {{ api_url }}/v1/users/me/subscriptions&#x60;
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function unsubscribe(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $subscriptions = (key_exists('subscriptions', $queryParams)) ? $queryParams['subscriptions'] : null;
        $principals = (key_exists('principals', $queryParams)) ? $queryParams['principals'] : null;
        $message = "How about implementing unsubscribe as a DELETE method in OpenAPIServer\Api\StreamsApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * PATCH updateStream
     * Summary: Update a stream
     * Notes: Configure the stream with the ID &#x60;stream_id&#x60;.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  &#x60;PATCH {{ api_url }}/v1/streams/{stream_id}&#x60;
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function updateStream(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $streamId = $args['stream_id'];
        $queryParams = $request->getQueryParams();
        $description = (key_exists('description', $queryParams)) ? $queryParams['description'] : null;
        $newName = (key_exists('new_name', $queryParams)) ? $queryParams['new_name'] : null;
        $isPrivate = (key_exists('is_private', $queryParams)) ? $queryParams['is_private'] : null;
        $isAnnouncementOnly = (key_exists('is_announcement_only', $queryParams)) ? $queryParams['is_announcement_only'] : null;
        $streamPostPolicy = (key_exists('stream_post_policy', $queryParams)) ? $queryParams['stream_post_policy'] : null;
        $historyPublicToSubscribers = (key_exists('history_public_to_subscribers', $queryParams)) ? $queryParams['history_public_to_subscribers'] : null;
        $messageRetentionDays = (key_exists('message_retention_days', $queryParams)) ? $queryParams['message_retention_days'] : null;
        $message = "How about implementing updateStream as a PATCH method in OpenAPIServer\Api\StreamsApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * POST updateSubscriptionSettings
     * Summary: Update subscription settings
     * Notes: This endpoint is used to update the user&#39;s personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions/properties&#x60;
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function updateSubscriptionSettings(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $subscriptionData = (key_exists('subscription_data', $queryParams)) ? $queryParams['subscription_data'] : null;
        $message = "How about implementing updateSubscriptionSettings as a POST method in OpenAPIServer\Api\StreamsApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * PATCH updateSubscriptions
     * Summary: Update subscriptions
     * Notes: Update which streams you are are subscribed to.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function updateSubscriptions(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $delete = (key_exists('delete', $queryParams)) ? $queryParams['delete'] : null;
        $add = (key_exists('add', $queryParams)) ? $queryParams['add'] : null;
        $message = "How about implementing updateSubscriptions as a PATCH method in OpenAPIServer\Api\StreamsApi class?";
        throw new HttpNotImplementedException($request, $message);
    }
}
