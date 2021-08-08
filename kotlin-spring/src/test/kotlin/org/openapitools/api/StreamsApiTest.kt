package org.openapitools.api

import org.openapitools.model.CodedError
import org.openapitools.model.JsonError
import org.openapitools.model.JsonSuccess
import org.openapitools.model.JsonSuccessBase
import org.openapitools.model.OneOfLessThanStringCommaIntegerGreaterThan
import org.junit.jupiter.api.Test

import org.springframework.http.ResponseEntity

class StreamsApiTest {

    
    private val api: StreamsApiController = StreamsApiController()

    
    /**
    * Archive a stream
    *
    * [Archive the stream](/help/archive-a-stream) with the ID &#x60;stream_id&#x60;.  &#x60;DELETE {{ api_url }}/v1/streams/{stream_id}&#x60; 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun archiveStreamTest() {
        val streamId:kotlin.Int? = null
        val response: ResponseEntity<JsonSuccess> = api.archiveStream(streamId!!)

        // TODO: test validations
    }
    
    /**
    * Delete a topic
    *
    * Delete all messages in a topic.  &#x60;POST {{ api_url }}/v1/streams/{stream_id}/delete_topic&#x60;  Topics are a field on messages (not an independent data structure), so deleting all the messages in the topic deletes the topic from Zulip. 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun deleteTopicTest() {
        val streamId:kotlin.Int? = null
        val topicName:kotlin.String? = null
        val response: ResponseEntity<JsonSuccess> = api.deleteTopic(streamId!!, topicName!!)

        // TODO: test validations
    }
    
    /**
    * Get all streams
    *
    * Get all streams that the user has access to.  &#x60;GET {{ api_url }}/v1/streams&#x60; 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun getStreamsTest() {
        val includePublic:kotlin.Boolean? = null
        val includeWebPublic:kotlin.Boolean? = null
        val includeSubscribed:kotlin.Boolean? = null
        val includeAllActive:kotlin.Boolean? = null
        val includeDefault:kotlin.Boolean? = null
        val includeOwnerSubscribed:kotlin.Boolean? = null
        val response: ResponseEntity<JsonSuccessBase> = api.getStreams(includePublic!!, includeWebPublic!!, includeSubscribed!!, includeAllActive!!, includeDefault!!, includeOwnerSubscribed!!)

        // TODO: test validations
    }
    
    /**
    * Get the subscribers of a stream
    *
    * Get all users subscribed to a stream.  &#x60;Get {{ api_url }}/v1/streams/{stream_id}/members&#x60; 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun getSubscribersTest() {
        val streamId:kotlin.Int? = null
        val response: ResponseEntity<JsonSuccessBase> = api.getSubscribers(streamId!!)

        // TODO: test validations
    }
    
    /**
    * Update a stream
    *
    * Configure the stream with the ID &#x60;stream_id&#x60;.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  &#x60;PATCH {{ api_url }}/v1/streams/{stream_id}&#x60; 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun updateStreamTest() {
        val streamId:kotlin.Int? = null
        val description:kotlin.String? = null
        val newName:kotlin.String? = null
        val isPrivate:kotlin.Boolean? = null
        val isAnnouncementOnly:kotlin.Boolean? = null
        val streamPostPolicy:kotlin.Int? = null
        val historyPublicToSubscribers:kotlin.Boolean? = null
        val messageRetentionDays:OneOfLessThanStringCommaIntegerGreaterThan? = null
        val response: ResponseEntity<JsonSuccess> = api.updateStream(streamId!!, description!!, newName!!, isPrivate!!, isAnnouncementOnly!!, streamPostPolicy!!, historyPublicToSubscribers!!, messageRetentionDays!!)

        // TODO: test validations
    }
    
}
