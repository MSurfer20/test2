#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "presence.h"


char* statuspresence_ToString(zulip_rest_api_presence_STATUS_e status) {
    char* statusArray[] =  { "NULL", "idle", "active" };
	return statusArray[status];
}

zulip_rest_api_presence_STATUS_e statuspresence_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "idle", "active" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

presence_t *presence_create(
    char *client,
    zulip_rest_api_presence_STATUS_e status,
    int timestamp,
    int pushable
    ) {
    presence_t *presence_local_var = malloc(sizeof(presence_t));
    if (!presence_local_var) {
        return NULL;
    }
    presence_local_var->client = client;
    presence_local_var->status = status;
    presence_local_var->timestamp = timestamp;
    presence_local_var->pushable = pushable;

    return presence_local_var;
}


void presence_free(presence_t *presence) {
    if(NULL == presence){
        return ;
    }
    listEntry_t *listEntry;
    if (presence->client) {
        free(presence->client);
        presence->client = NULL;
    }
    free(presence);
}

cJSON *presence_convertToJSON(presence_t *presence) {
    cJSON *item = cJSON_CreateObject();

    // presence->client
    if(presence->client) { 
    if(cJSON_AddStringToObject(item, "client", presence->client) == NULL) {
    goto fail; //String
    }
     } 


    // presence->status
    
    if(cJSON_AddStringToObject(item, "status", statuspresence_ToString(presence->status)) == NULL)
    {
    goto fail; //Enum
    }
    


    // presence->timestamp
    if(presence->timestamp) { 
    if(cJSON_AddNumberToObject(item, "timestamp", presence->timestamp) == NULL) {
    goto fail; //Numeric
    }
     } 


    // presence->pushable
    if(presence->pushable) { 
    if(cJSON_AddBoolToObject(item, "pushable", presence->pushable) == NULL) {
    goto fail; //Bool
    }
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

presence_t *presence_parseFromJSON(cJSON *presenceJSON){

    presence_t *presence_local_var = NULL;

    // presence->client
    cJSON *client = cJSON_GetObjectItemCaseSensitive(presenceJSON, "client");
    if (client) { 
    if(!cJSON_IsString(client))
    {
    goto end; //String
    }
    }

    // presence->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(presenceJSON, "status");
    zulip_rest_api_presence_STATUS_e statusVariable;
    if (status) { 
    if(!cJSON_IsString(status))
    {
    goto end; //Enum
    }
    statusVariable = statuspresence_FromString(status->valuestring);
    }

    // presence->timestamp
    cJSON *timestamp = cJSON_GetObjectItemCaseSensitive(presenceJSON, "timestamp");
    if (timestamp) { 
    if(!cJSON_IsNumber(timestamp))
    {
    goto end; //Numeric
    }
    }

    // presence->pushable
    cJSON *pushable = cJSON_GetObjectItemCaseSensitive(presenceJSON, "pushable");
    if (pushable) { 
    if(!cJSON_IsBool(pushable))
    {
    goto end; //Bool
    }
    }


    presence_local_var = presence_create (
        client ? strdup(client->valuestring) : NULL,
        status ? statusVariable : -1,
        timestamp ? timestamp->valuedouble : 0,
        pushable ? pushable->valueint : 0
        );

    return presence_local_var;
end:
    return NULL;

}
