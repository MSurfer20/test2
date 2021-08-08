#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "add_subscriptions_response.h"



add_subscriptions_response_t *add_subscriptions_response_create(
    list_t* subscribed,
    list_t* already_subscribed,
    list_t *unauthorized
    ) {
    add_subscriptions_response_t *add_subscriptions_response_local_var = malloc(sizeof(add_subscriptions_response_t));
    if (!add_subscriptions_response_local_var) {
        return NULL;
    }
    add_subscriptions_response_local_var->result = result;
    add_subscriptions_response_local_var->msg = msg;
    add_subscriptions_response_local_var->subscribed = subscribed;
    add_subscriptions_response_local_var->already_subscribed = already_subscribed;
    add_subscriptions_response_local_var->unauthorized = unauthorized;

    return add_subscriptions_response_local_var;
}


void add_subscriptions_response_free(add_subscriptions_response_t *add_subscriptions_response) {
    if(NULL == add_subscriptions_response){
        return ;
    }
    listEntry_t *listEntry;
    if (add_subscriptions_response->subscribed) {
        list_ForEach(listEntry, add_subscriptions_response->subscribed) {
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_free(add_subscriptions_response->subscribed);
        add_subscriptions_response->subscribed = NULL;
    }
    if (add_subscriptions_response->already_subscribed) {
        list_ForEach(listEntry, add_subscriptions_response->already_subscribed) {
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_free(add_subscriptions_response->already_subscribed);
        add_subscriptions_response->already_subscribed = NULL;
    }
    if (add_subscriptions_response->unauthorized) {
        list_ForEach(listEntry, add_subscriptions_response->unauthorized) {
            free(listEntry->data);
        }
        list_free(add_subscriptions_response->unauthorized);
        add_subscriptions_response->unauthorized = NULL;
    }
    free(add_subscriptions_response);
}

cJSON *add_subscriptions_response_convertToJSON(add_subscriptions_response_t *add_subscriptions_response) {
    cJSON *item = cJSON_CreateObject();

    // add_subscriptions_response->result
    if (!add_subscriptions_response->result) {
        goto fail;
    }
    


    // add_subscriptions_response->msg
    if (!add_subscriptions_response->msg) {
        goto fail;
    }
    


    // add_subscriptions_response->subscribed
    if(add_subscriptions_response->subscribed) { 
    cJSON *subscribed = cJSON_AddObjectToObject(item, "subscribed");
    if(subscribed == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = subscribed;
    listEntry_t *subscribedListEntry;
    if (add_subscriptions_response->subscribed) {
    list_ForEach(subscribedListEntry, add_subscriptions_response->subscribed) {
        keyValuePair_t *localKeyValue = (keyValuePair_t*)subscribedListEntry->data;
    }
    }
     } 


    // add_subscriptions_response->already_subscribed
    if(add_subscriptions_response->already_subscribed) { 
    cJSON *already_subscribed = cJSON_AddObjectToObject(item, "already_subscribed");
    if(already_subscribed == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = already_subscribed;
    listEntry_t *already_subscribedListEntry;
    if (add_subscriptions_response->already_subscribed) {
    list_ForEach(already_subscribedListEntry, add_subscriptions_response->already_subscribed) {
        keyValuePair_t *localKeyValue = (keyValuePair_t*)already_subscribedListEntry->data;
    }
    }
     } 


    // add_subscriptions_response->unauthorized
    if(add_subscriptions_response->unauthorized) { 
    cJSON *unauthorized = cJSON_AddArrayToObject(item, "unauthorized");
    if(unauthorized == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *unauthorizedListEntry;
    list_ForEach(unauthorizedListEntry, add_subscriptions_response->unauthorized) {
    if(cJSON_AddStringToObject(unauthorized, "", (char*)unauthorizedListEntry->data) == NULL)
    {
        goto fail;
    }
    }
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

add_subscriptions_response_t *add_subscriptions_response_parseFromJSON(cJSON *add_subscriptions_responseJSON){

    add_subscriptions_response_t *add_subscriptions_response_local_var = NULL;

    // add_subscriptions_response->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(add_subscriptions_responseJSON, "result");
    if (!result) {
        goto end;
    }


    // add_subscriptions_response->msg
    cJSON *msg = cJSON_GetObjectItemCaseSensitive(add_subscriptions_responseJSON, "msg");
    if (!msg) {
        goto end;
    }


    // add_subscriptions_response->subscribed
    cJSON *subscribed = cJSON_GetObjectItemCaseSensitive(add_subscriptions_responseJSON, "subscribed");
    list_t *subscribedList;
    if (subscribed) { 
    cJSON *subscribed_local_map;
    if(!cJSON_IsObject(subscribed)) {
        goto end;//primitive map container
    }
    subscribedList = list_create();
    keyValuePair_t *localMapKeyPair;
    cJSON_ArrayForEach(subscribed_local_map, subscribed)
    {
		cJSON *localMapObject = subscribed_local_map;
        list_addElement(subscribedList , localMapKeyPair);
    }
    }

    // add_subscriptions_response->already_subscribed
    cJSON *already_subscribed = cJSON_GetObjectItemCaseSensitive(add_subscriptions_responseJSON, "already_subscribed");
    list_t *already_subscribedList;
    if (already_subscribed) { 
    cJSON *already_subscribed_local_map;
    if(!cJSON_IsObject(already_subscribed)) {
        goto end;//primitive map container
    }
    already_subscribedList = list_create();
    keyValuePair_t *localMapKeyPair;
    cJSON_ArrayForEach(already_subscribed_local_map, already_subscribed)
    {
		cJSON *localMapObject = already_subscribed_local_map;
        list_addElement(already_subscribedList , localMapKeyPair);
    }
    }

    // add_subscriptions_response->unauthorized
    cJSON *unauthorized = cJSON_GetObjectItemCaseSensitive(add_subscriptions_responseJSON, "unauthorized");
    list_t *unauthorizedList;
    if (unauthorized) { 
    cJSON *unauthorized_local;
    if(!cJSON_IsArray(unauthorized)) {
        goto end;//primitive container
    }
    unauthorizedList = list_create();

    cJSON_ArrayForEach(unauthorized_local, unauthorized)
    {
        if(!cJSON_IsString(unauthorized_local))
        {
            goto end;
        }
        list_addElement(unauthorizedList , strdup(unauthorized_local->valuestring));
    }
    }


    add_subscriptions_response_local_var = add_subscriptions_response_create (
        subscribed ? subscribedList : NULL,
        already_subscribed ? already_subscribedList : NULL,
        unauthorized ? unauthorizedList : NULL
        );

    return add_subscriptions_response_local_var;
end:
    return NULL;

}
