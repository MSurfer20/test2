#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "add_subscriptions_response_all_of.h"



add_subscriptions_response_all_of_t *add_subscriptions_response_all_of_create(
    list_t* subscribed,
    list_t* already_subscribed,
    list_t *unauthorized
    ) {
    add_subscriptions_response_all_of_t *add_subscriptions_response_all_of_local_var = malloc(sizeof(add_subscriptions_response_all_of_t));
    if (!add_subscriptions_response_all_of_local_var) {
        return NULL;
    }
    add_subscriptions_response_all_of_local_var->result = result;
    add_subscriptions_response_all_of_local_var->msg = msg;
    add_subscriptions_response_all_of_local_var->subscribed = subscribed;
    add_subscriptions_response_all_of_local_var->already_subscribed = already_subscribed;
    add_subscriptions_response_all_of_local_var->unauthorized = unauthorized;

    return add_subscriptions_response_all_of_local_var;
}


void add_subscriptions_response_all_of_free(add_subscriptions_response_all_of_t *add_subscriptions_response_all_of) {
    if(NULL == add_subscriptions_response_all_of){
        return ;
    }
    listEntry_t *listEntry;
    if (add_subscriptions_response_all_of->subscribed) {
        list_ForEach(listEntry, add_subscriptions_response_all_of->subscribed) {
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_free(add_subscriptions_response_all_of->subscribed);
        add_subscriptions_response_all_of->subscribed = NULL;
    }
    if (add_subscriptions_response_all_of->already_subscribed) {
        list_ForEach(listEntry, add_subscriptions_response_all_of->already_subscribed) {
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_free(add_subscriptions_response_all_of->already_subscribed);
        add_subscriptions_response_all_of->already_subscribed = NULL;
    }
    if (add_subscriptions_response_all_of->unauthorized) {
        list_ForEach(listEntry, add_subscriptions_response_all_of->unauthorized) {
            free(listEntry->data);
        }
        list_free(add_subscriptions_response_all_of->unauthorized);
        add_subscriptions_response_all_of->unauthorized = NULL;
    }
    free(add_subscriptions_response_all_of);
}

cJSON *add_subscriptions_response_all_of_convertToJSON(add_subscriptions_response_all_of_t *add_subscriptions_response_all_of) {
    cJSON *item = cJSON_CreateObject();

    // add_subscriptions_response_all_of->result
    if(add_subscriptions_response_all_of->result) { 
     } 


    // add_subscriptions_response_all_of->msg
    if(add_subscriptions_response_all_of->msg) { 
     } 


    // add_subscriptions_response_all_of->subscribed
    if(add_subscriptions_response_all_of->subscribed) { 
    cJSON *subscribed = cJSON_AddObjectToObject(item, "subscribed");
    if(subscribed == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = subscribed;
    listEntry_t *subscribedListEntry;
    if (add_subscriptions_response_all_of->subscribed) {
    list_ForEach(subscribedListEntry, add_subscriptions_response_all_of->subscribed) {
        keyValuePair_t *localKeyValue = (keyValuePair_t*)subscribedListEntry->data;
    }
    }
     } 


    // add_subscriptions_response_all_of->already_subscribed
    if(add_subscriptions_response_all_of->already_subscribed) { 
    cJSON *already_subscribed = cJSON_AddObjectToObject(item, "already_subscribed");
    if(already_subscribed == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = already_subscribed;
    listEntry_t *already_subscribedListEntry;
    if (add_subscriptions_response_all_of->already_subscribed) {
    list_ForEach(already_subscribedListEntry, add_subscriptions_response_all_of->already_subscribed) {
        keyValuePair_t *localKeyValue = (keyValuePair_t*)already_subscribedListEntry->data;
    }
    }
     } 


    // add_subscriptions_response_all_of->unauthorized
    if(add_subscriptions_response_all_of->unauthorized) { 
    cJSON *unauthorized = cJSON_AddArrayToObject(item, "unauthorized");
    if(unauthorized == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *unauthorizedListEntry;
    list_ForEach(unauthorizedListEntry, add_subscriptions_response_all_of->unauthorized) {
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

add_subscriptions_response_all_of_t *add_subscriptions_response_all_of_parseFromJSON(cJSON *add_subscriptions_response_all_ofJSON){

    add_subscriptions_response_all_of_t *add_subscriptions_response_all_of_local_var = NULL;

    // add_subscriptions_response_all_of->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(add_subscriptions_response_all_ofJSON, "result");
    }

    // add_subscriptions_response_all_of->msg
    cJSON *msg = cJSON_GetObjectItemCaseSensitive(add_subscriptions_response_all_ofJSON, "msg");
    }

    // add_subscriptions_response_all_of->subscribed
    cJSON *subscribed = cJSON_GetObjectItemCaseSensitive(add_subscriptions_response_all_ofJSON, "subscribed");
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

    // add_subscriptions_response_all_of->already_subscribed
    cJSON *already_subscribed = cJSON_GetObjectItemCaseSensitive(add_subscriptions_response_all_ofJSON, "already_subscribed");
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

    // add_subscriptions_response_all_of->unauthorized
    cJSON *unauthorized = cJSON_GetObjectItemCaseSensitive(add_subscriptions_response_all_ofJSON, "unauthorized");
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


    add_subscriptions_response_all_of_local_var = add_subscriptions_response_all_of_create (
        subscribed ? subscribedList : NULL,
        already_subscribed ? already_subscribedList : NULL,
        unauthorized ? unauthorizedList : NULL
        );

    return add_subscriptions_response_all_of_local_var;
end:
    return NULL;

}
