#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "RealTimeEventsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)


// Delete an event queue
//
// Delete a previously registered queue.  `DELETE {{ api_url }}/v1/events` 
//
json_success_t*
RealTimeEventsAPI_deleteQueue(apiClient_t *apiClient, char * queue_id )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/events")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/events");




    // query parameters
    char *keyQuery_queue_id = NULL;
    char * valueQuery_queue_id = NULL;
    keyValuePair_t *keyPairQuery_queue_id = 0;
    if (queue_id)
    {
        keyQuery_queue_id = strdup("queue_id");
        valueQuery_queue_id = strdup((queue_id));
        keyPairQuery_queue_id = keyValuePair_create(keyQuery_queue_id, valueQuery_queue_id);
        list_addElement(localVarQueryParameters,keyPairQuery_queue_id);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "DELETE");

    if (apiClient->response_code == 200) {
        printf("%s\n","Success.");
    }
    if (apiClient->response_code == 400) {
        printf("%s\n","Bad request.");
    }
    //nonprimitive not container
    cJSON *RealTimeEventsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_t *elementToReturn = json_success_parseFromJSON(RealTimeEventsAPIlocalVarJSON);
    cJSON_Delete(RealTimeEventsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_free(localVarQueryParameters);
    
    
    list_free(localVarHeaderType);
    
    free(localVarPath);
    if(keyQuery_queue_id){
        free(keyQuery_queue_id);
        keyQuery_queue_id = NULL;
    }
    if(valueQuery_queue_id){
        free(valueQuery_queue_id);
        valueQuery_queue_id = NULL;
    }
    if(keyPairQuery_queue_id){
        keyValuePair_free(keyPairQuery_queue_id);
        keyPairQuery_queue_id = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get events from an event queue
//
// `GET {{ api_url }}/v1/events`  This endpoint allows you to receive new events from [a registered event queue](/api/register-queue).  Long-lived clients should use the `event_queue_longpoll_timeout_seconds` property returned by `POST /register` as the client-side HTTP request timeout for calls to this endpoint.  It is guaranteed to be higher than heartbeat frequency and should be respected by clients to avoid breaking when heartbeat frequency increases. 
//
json_success_base_t*
RealTimeEventsAPI_getEvents(apiClient_t *apiClient, char * queue_id , int last_event_id , int dont_block )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/events")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/events");




    // query parameters
    char *keyQuery_queue_id = NULL;
    char * valueQuery_queue_id = NULL;
    keyValuePair_t *keyPairQuery_queue_id = 0;
    if (queue_id)
    {
        keyQuery_queue_id = strdup("queue_id");
        valueQuery_queue_id = strdup((queue_id));
        keyPairQuery_queue_id = keyValuePair_create(keyQuery_queue_id, valueQuery_queue_id);
        list_addElement(localVarQueryParameters,keyPairQuery_queue_id);
    }

    // query parameters
    char *keyQuery_last_event_id = NULL;
    char * valueQuery_last_event_id = NULL;
    keyValuePair_t *keyPairQuery_last_event_id = 0;
    if (last_event_id)
    {
        keyQuery_last_event_id = strdup("last_event_id");
        valueQuery_last_event_id = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_last_event_id, MAX_NUMBER_LENGTH, "%d", last_event_id);
        keyPairQuery_last_event_id = keyValuePair_create(keyQuery_last_event_id, valueQuery_last_event_id);
        list_addElement(localVarQueryParameters,keyPairQuery_last_event_id);
    }

    // query parameters
    char *keyQuery_dont_block = NULL;
    char * valueQuery_dont_block = NULL;
    keyValuePair_t *keyPairQuery_dont_block = 0;
    if (dont_block)
    {
        keyQuery_dont_block = strdup("dont_block");
        valueQuery_dont_block = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_dont_block, MAX_NUMBER_LENGTH, "%d", dont_block);
        keyPairQuery_dont_block = keyValuePair_create(keyQuery_dont_block, valueQuery_dont_block);
        list_addElement(localVarQueryParameters,keyPairQuery_dont_block);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "GET");

    if (apiClient->response_code == 200) {
        printf("%s\n","Success.");
    }
    if (apiClient->response_code == 400) {
        printf("%s\n","Bad request.");
    }
    //nonprimitive not container
    cJSON *RealTimeEventsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_base_t *elementToReturn = json_success_base_parseFromJSON(RealTimeEventsAPIlocalVarJSON);
    cJSON_Delete(RealTimeEventsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_free(localVarQueryParameters);
    
    
    list_free(localVarHeaderType);
    
    free(localVarPath);
    if(keyQuery_queue_id){
        free(keyQuery_queue_id);
        keyQuery_queue_id = NULL;
    }
    if(valueQuery_queue_id){
        free(valueQuery_queue_id);
        valueQuery_queue_id = NULL;
    }
    if(keyPairQuery_queue_id){
        keyValuePair_free(keyPairQuery_queue_id);
        keyPairQuery_queue_id = NULL;
    }
    if(keyQuery_last_event_id){
        free(keyQuery_last_event_id);
        keyQuery_last_event_id = NULL;
    }
    if(valueQuery_last_event_id){
        free(valueQuery_last_event_id);
        valueQuery_last_event_id = NULL;
    }
    if(keyPairQuery_last_event_id){
        keyValuePair_free(keyPairQuery_last_event_id);
        keyPairQuery_last_event_id = NULL;
    }
    if(keyQuery_dont_block){
        free(keyQuery_dont_block);
        keyQuery_dont_block = NULL;
    }
    if(valueQuery_dont_block){
        free(valueQuery_dont_block);
        valueQuery_dont_block = NULL;
    }
    if(keyPairQuery_dont_block){
        keyValuePair_free(keyPairQuery_dont_block);
        keyPairQuery_dont_block = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// (Ignored) 
//
void
RealTimeEventsAPI_realTimePost(apiClient_t *apiClient, list_t * event_types , list_t * narrow , int all_public_streams )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = NULL;
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/real-time")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/real-time");




    // query parameters
    if (event_types)
    {
        list_addElement(localVarQueryParameters,event_types);
    }

    // query parameters
    if (narrow)
    {
        list_addElement(localVarQueryParameters,narrow);
    }

    // query parameters
    char *keyQuery_all_public_streams = NULL;
    char * valueQuery_all_public_streams = NULL;
    keyValuePair_t *keyPairQuery_all_public_streams = 0;
    if (all_public_streams)
    {
        keyQuery_all_public_streams = strdup("all_public_streams");
        valueQuery_all_public_streams = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_all_public_streams, MAX_NUMBER_LENGTH, "%d", all_public_streams);
        keyPairQuery_all_public_streams = keyValuePair_create(keyQuery_all_public_streams, valueQuery_all_public_streams);
        list_addElement(localVarQueryParameters,keyPairQuery_all_public_streams);
    }
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "POST");

    if (apiClient->response_code == 200) {
        printf("%s\n","Success");
    }
    //No return type
end:
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_free(localVarQueryParameters);
    
    
    
    
    free(localVarPath);

}

// Register an event queue
//
// `POST {{ api_url }}/v1/register`  This powerful endpoint can be used to register a Zulip \"event queue\" (subscribed to certain types of \"events\", or updates to the messages and other Zulip data the current user has access to), as well as to fetch the current state of that data.  (`register` also powers the `call_on_each_event` Python API, and is intended primarily for complex applications for which the more convenient `call_on_each_event` API is insufficient).  This endpoint returns a `queue_id` and a `last_event_id`; these can be used in subsequent calls to the [\"events\" endpoint](/api/get-events) to request events from the Zulip server using long-polling.  The server will queue events for up to 10 minutes of inactivity. After 10 minutes, your event queue will be garbage-collected.  The server will send `heartbeat` events every minute, which makes it easy to implement a robust client that does not miss events unless the client loses network connectivity with the Zulip server for 10 minutes or longer.  Once the server garbage-collects your event queue, the server will [return an error](/api/get-events#bad_event_queue_id-errors) with a code of `BAD_EVENT_QUEUE_ID` if you try to fetch events from the event queue.  Your software will need to handle that error condition by re-initializing itself (e.g. this is what triggers your browser reloading the Zulip web app when your laptop comes back online after being offline for more than 10 minutes).  When prototyping with this API, we recommend first calling `register` with no `event_types` parameter to see all the available data from all supported event types.  Before using your client in production, you should set appropriate `event_types` and `fetch_event_types` filters so that your client only requests the data it needs.  A few minutes doing this often saves 90% of the total bandwidth and other resources consumed by a client using this API.  See the [events system developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/events-system.html) if you need deeper details about how the Zulip event queue system works, avoids clients needing to worry about large classes of potentially messy races, etc. 
//
json_success_base_t*
RealTimeEventsAPI_registerQueue(apiClient_t *apiClient, int apply_markdown , int client_gravatar , int slim_presence , list_t * event_types , int all_public_streams , int include_subscribers ,  client_capabilities , list_t * fetch_event_types , list_t * narrow )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/register")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/register");




    // query parameters
    char *keyQuery_apply_markdown = NULL;
    char * valueQuery_apply_markdown = NULL;
    keyValuePair_t *keyPairQuery_apply_markdown = 0;
    if (apply_markdown)
    {
        keyQuery_apply_markdown = strdup("apply_markdown");
        valueQuery_apply_markdown = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_apply_markdown, MAX_NUMBER_LENGTH, "%d", apply_markdown);
        keyPairQuery_apply_markdown = keyValuePair_create(keyQuery_apply_markdown, valueQuery_apply_markdown);
        list_addElement(localVarQueryParameters,keyPairQuery_apply_markdown);
    }

    // query parameters
    char *keyQuery_client_gravatar = NULL;
    char * valueQuery_client_gravatar = NULL;
    keyValuePair_t *keyPairQuery_client_gravatar = 0;
    if (client_gravatar)
    {
        keyQuery_client_gravatar = strdup("client_gravatar");
        valueQuery_client_gravatar = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_client_gravatar, MAX_NUMBER_LENGTH, "%d", client_gravatar);
        keyPairQuery_client_gravatar = keyValuePair_create(keyQuery_client_gravatar, valueQuery_client_gravatar);
        list_addElement(localVarQueryParameters,keyPairQuery_client_gravatar);
    }

    // query parameters
    char *keyQuery_slim_presence = NULL;
    char * valueQuery_slim_presence = NULL;
    keyValuePair_t *keyPairQuery_slim_presence = 0;
    if (slim_presence)
    {
        keyQuery_slim_presence = strdup("slim_presence");
        valueQuery_slim_presence = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_slim_presence, MAX_NUMBER_LENGTH, "%d", slim_presence);
        keyPairQuery_slim_presence = keyValuePair_create(keyQuery_slim_presence, valueQuery_slim_presence);
        list_addElement(localVarQueryParameters,keyPairQuery_slim_presence);
    }

    // query parameters
    if (event_types)
    {
        list_addElement(localVarQueryParameters,event_types);
    }

    // query parameters
    char *keyQuery_all_public_streams = NULL;
    char * valueQuery_all_public_streams = NULL;
    keyValuePair_t *keyPairQuery_all_public_streams = 0;
    if (all_public_streams)
    {
        keyQuery_all_public_streams = strdup("all_public_streams");
        valueQuery_all_public_streams = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_all_public_streams, MAX_NUMBER_LENGTH, "%d", all_public_streams);
        keyPairQuery_all_public_streams = keyValuePair_create(keyQuery_all_public_streams, valueQuery_all_public_streams);
        list_addElement(localVarQueryParameters,keyPairQuery_all_public_streams);
    }

    // query parameters
    char *keyQuery_include_subscribers = NULL;
    char * valueQuery_include_subscribers = NULL;
    keyValuePair_t *keyPairQuery_include_subscribers = 0;
    if (include_subscribers)
    {
        keyQuery_include_subscribers = strdup("include_subscribers");
        valueQuery_include_subscribers = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_include_subscribers, MAX_NUMBER_LENGTH, "%d", include_subscribers);
        keyPairQuery_include_subscribers = keyValuePair_create(keyQuery_include_subscribers, valueQuery_include_subscribers);
        list_addElement(localVarQueryParameters,keyPairQuery_include_subscribers);
    }

    // query parameters
    char *keyQuery_client_capabilities = NULL;
     valueQuery_client_capabilities ;
    keyValuePair_t *keyPairQuery_client_capabilities = 0;
    if (client_capabilities)
    {
        keyQuery_client_capabilities = strdup("client_capabilities");
        valueQuery_client_capabilities = (client_capabilities);
        keyPairQuery_client_capabilities = keyValuePair_create(keyQuery_client_capabilities, &valueQuery_client_capabilities);
        list_addElement(localVarQueryParameters,keyPairQuery_client_capabilities);
    }

    // query parameters
    if (fetch_event_types)
    {
        list_addElement(localVarQueryParameters,fetch_event_types);
    }

    // query parameters
    if (narrow)
    {
        list_addElement(localVarQueryParameters,narrow);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "POST");

    if (apiClient->response_code == 200) {
        printf("%s\n","Success.");
    }
    //nonprimitive not container
    cJSON *RealTimeEventsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_base_t *elementToReturn = json_success_base_parseFromJSON(RealTimeEventsAPIlocalVarJSON);
    cJSON_Delete(RealTimeEventsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_free(localVarQueryParameters);
    
    
    list_free(localVarHeaderType);
    
    free(localVarPath);
    if(keyQuery_apply_markdown){
        free(keyQuery_apply_markdown);
        keyQuery_apply_markdown = NULL;
    }
    if(valueQuery_apply_markdown){
        free(valueQuery_apply_markdown);
        valueQuery_apply_markdown = NULL;
    }
    if(keyPairQuery_apply_markdown){
        keyValuePair_free(keyPairQuery_apply_markdown);
        keyPairQuery_apply_markdown = NULL;
    }
    if(keyQuery_client_gravatar){
        free(keyQuery_client_gravatar);
        keyQuery_client_gravatar = NULL;
    }
    if(valueQuery_client_gravatar){
        free(valueQuery_client_gravatar);
        valueQuery_client_gravatar = NULL;
    }
    if(keyPairQuery_client_gravatar){
        keyValuePair_free(keyPairQuery_client_gravatar);
        keyPairQuery_client_gravatar = NULL;
    }
    if(keyQuery_slim_presence){
        free(keyQuery_slim_presence);
        keyQuery_slim_presence = NULL;
    }
    if(valueQuery_slim_presence){
        free(valueQuery_slim_presence);
        valueQuery_slim_presence = NULL;
    }
    if(keyPairQuery_slim_presence){
        keyValuePair_free(keyPairQuery_slim_presence);
        keyPairQuery_slim_presence = NULL;
    }
    if(keyQuery_all_public_streams){
        free(keyQuery_all_public_streams);
        keyQuery_all_public_streams = NULL;
    }
    if(valueQuery_all_public_streams){
        free(valueQuery_all_public_streams);
        valueQuery_all_public_streams = NULL;
    }
    if(keyPairQuery_all_public_streams){
        keyValuePair_free(keyPairQuery_all_public_streams);
        keyPairQuery_all_public_streams = NULL;
    }
    if(keyQuery_include_subscribers){
        free(keyQuery_include_subscribers);
        keyQuery_include_subscribers = NULL;
    }
    if(valueQuery_include_subscribers){
        free(valueQuery_include_subscribers);
        valueQuery_include_subscribers = NULL;
    }
    if(keyPairQuery_include_subscribers){
        keyValuePair_free(keyPairQuery_include_subscribers);
        keyPairQuery_include_subscribers = NULL;
    }
    if(keyQuery_client_capabilities){
        free(keyQuery_client_capabilities);
        keyQuery_client_capabilities = NULL;
    }
    if(keyPairQuery_client_capabilities){
        keyValuePair_free(keyPairQuery_client_capabilities);
        keyPairQuery_client_capabilities = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Error handling
//
// Common error to many endpoints 
//
void
RealTimeEventsAPI_restErrorHandling(apiClient_t *apiClient)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/rest-error-handling")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/rest-error-handling");



    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "POST");

    if (apiClient->response_code == 400) {
        printf("%s\n","Bad request. ");
    }
    if (apiClient->response_code == 401) {
        printf("%s\n","Unauthorized. ");
    }
    if (apiClient->response_code == 429) {
        printf("%s\n","Rate limit exceeded. ");
    }
    //No return type
end:
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_free(localVarHeaderType);
    
    free(localVarPath);

}

