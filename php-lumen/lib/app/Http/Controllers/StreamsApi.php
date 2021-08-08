<?php

/**
 * Zulip REST API
 * Powerful open source group chat
 * PHP version 7.2.5
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


namespace App\Http\Controllers;

use Illuminate\Support\Facades\Request;

class StreamsApi extends Controller
{
    /**
     * Constructor
     */
    public function __construct()
    {
    }

    /**
     * Operation createBigBlueButtonVideoCall
     *
     * Create BigBlueButton video call.
     *
     *
     * @return Http response
     */
    public function createBigBlueButtonVideoCall()
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing createBigBlueButtonVideoCall as a get method ?');
    }
    /**
     * Operation getStreamId
     *
     * Get stream ID.
     *
     *
     * @return Http response
     */
    public function getStreamId()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['stream'])) {
            throw new \InvalidArgumentException('Missing the required parameter $stream when calling getStreamId');
        }
        $stream = $input['stream'];


        return response('How about implementing getStreamId as a get method ?');
    }
    /**
     * Operation getStreams
     *
     * Get all streams.
     *
     *
     * @return Http response
     */
    public function getStreams()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        $include_public = $input['include_public'];

        $include_web_public = $input['include_web_public'];

        $include_subscribed = $input['include_subscribed'];

        $include_all_active = $input['include_all_active'];

        $include_default = $input['include_default'];

        $include_owner_subscribed = $input['include_owner_subscribed'];


        return response('How about implementing getStreams as a get method ?');
    }
    /**
     * Operation archiveStream
     *
     * Archive a stream.
     *
     * @param int $stream_id The ID of the stream to access. (required)
     *
     * @return Http response
     */
    public function archiveStream($stream_id)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing archiveStream as a delete method ?');
    }
    /**
     * Operation updateStream
     *
     * Update a stream.
     *
     * @param int $stream_id The ID of the stream to access. (required)
     *
     * @return Http response
     */
    public function updateStream($stream_id)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing updateStream as a patch method ?');
    }
    /**
     * Operation getSubscriptions
     *
     * Get subscribed streams.
     *
     *
     * @return Http response
     */
    public function getSubscriptions()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        $include_subscribers = $input['include_subscribers'];


        return response('How about implementing getSubscriptions as a get method ?');
    }
    /**
     * Operation subscribe
     *
     * Subscribe to a stream.
     *
     *
     * @return Http response
     */
    public function subscribe()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['subscriptions'])) {
            throw new \InvalidArgumentException('Missing the required parameter $subscriptions when calling subscribe');
        }
        $subscriptions = $input['subscriptions'];

        $principals = $input['principals'];

        $authorization_errors_fatal = $input['authorization_errors_fatal'];

        $announce = $input['announce'];

        $invite_only = $input['invite_only'];

        $history_public_to_subscribers = $input['history_public_to_subscribers'];

        $stream_post_policy = $input['stream_post_policy'];

        $message_retention_days = $input['message_retention_days'];


        return response('How about implementing subscribe as a post method ?');
    }
    /**
     * Operation unsubscribe
     *
     * Unsubscribe from a stream.
     *
     *
     * @return Http response
     */
    public function unsubscribe()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['subscriptions'])) {
            throw new \InvalidArgumentException('Missing the required parameter $subscriptions when calling unsubscribe');
        }
        $subscriptions = $input['subscriptions'];

        $principals = $input['principals'];


        return response('How about implementing unsubscribe as a delete method ?');
    }
    /**
     * Operation updateSubscriptions
     *
     * Update subscriptions.
     *
     *
     * @return Http response
     */
    public function updateSubscriptions()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        $delete = $input['delete'];

        $add = $input['add'];


        return response('How about implementing updateSubscriptions as a patch method ?');
    }
    /**
     * Operation muteTopic
     *
     * Topic muting.
     *
     *
     * @return Http response
     */
    public function muteTopic()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['topic'])) {
            throw new \InvalidArgumentException('Missing the required parameter $topic when calling muteTopic');
        }
        $topic = $input['topic'];

        if (!isset($input['op'])) {
            throw new \InvalidArgumentException('Missing the required parameter $op when calling muteTopic');
        }
        $op = $input['op'];

        $stream = $input['stream'];

        $stream_id = $input['stream_id'];


        return response('How about implementing muteTopic as a patch method ?');
    }
    /**
     * Operation updateSubscriptionSettings
     *
     * Update subscription settings.
     *
     *
     * @return Http response
     */
    public function updateSubscriptionSettings()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['subscription_data'])) {
            throw new \InvalidArgumentException('Missing the required parameter $subscription_data when calling updateSubscriptionSettings');
        }
        $subscription_data = $input['subscription_data'];


        return response('How about implementing updateSubscriptionSettings as a post method ?');
    }
    /**
     * Operation getStreamTopics
     *
     * Get topics in a stream.
     *
     * @param int $stream_id The ID of the stream to access. (required)
     *
     * @return Http response
     */
    public function getStreamTopics($stream_id)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getStreamTopics as a get method ?');
    }
    /**
     * Operation getSubscriptionStatus
     *
     * Get subscription status.
     *
     * @param int $user_id The target user&#39;s ID. (required)
     * @param int $stream_id The ID of the stream to access. (required)
     *
     * @return Http response
     */
    public function getSubscriptionStatus($user_id, $stream_id)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getSubscriptionStatus as a get method ?');
    }
}