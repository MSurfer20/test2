package org.openapitools.api

import org.openapitools.model.BadEventQueueIdError
import org.openapitools.model.JsonSuccess
import org.openapitools.model.JsonSuccessBase
import org.junit.jupiter.api.Test

import org.springframework.http.ResponseEntity

class EventsApiTest {

    
    private val api: EventsApiController = EventsApiController()

    
    /**
    * Delete an event queue
    *
    * Delete a previously registered queue.  &#x60;DELETE {{ api_url }}/v1/events&#x60; 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun deleteQueueTest() {
        val queueId:kotlin.String? = null
        val response: ResponseEntity<JsonSuccess> = api.deleteQueue(queueId!!)

        // TODO: test validations
    }
    
    /**
    * Get events from an event queue
    *
    * &#x60;GET {{ api_url }}/v1/events&#x60;  This endpoint allows you to receive new events from [a registered event queue](/api/register-queue).  Long-lived clients should use the &#x60;event_queue_longpoll_timeout_seconds&#x60; property returned by &#x60;POST /register&#x60; as the client-side HTTP request timeout for calls to this endpoint.  It is guaranteed to be higher than heartbeat frequency and should be respected by clients to avoid breaking when heartbeat frequency increases. 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun getEventsTest() {
        val queueId:kotlin.String? = null
        val lastEventId:kotlin.Int? = null
        val dontBlock:kotlin.Boolean? = null
        val response: ResponseEntity<JsonSuccessBase> = api.getEvents(queueId!!, lastEventId!!, dontBlock!!)

        // TODO: test validations
    }
    
}
