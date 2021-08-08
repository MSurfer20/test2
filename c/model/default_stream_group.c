#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "default_stream_group.h"



default_stream_group_t *default_stream_group_create(
    char *name,
    char *description,
    int id,
    list_t *streams
    ) {
    default_stream_group_t *default_stream_group_local_var = malloc(sizeof(default_stream_group_t));
    if (!default_stream_group_local_var) {
        return NULL;
    }
    default_stream_group_local_var->name = name;
    default_stream_group_local_var->description = description;
    default_stream_group_local_var->id = id;
    default_stream_group_local_var->streams = streams;

    return default_stream_group_local_var;
}


void default_stream_group_free(default_stream_group_t *default_stream_group) {
    if(NULL == default_stream_group){
        return ;
    }
    listEntry_t *listEntry;
    if (default_stream_group->name) {
        free(default_stream_group->name);
        default_stream_group->name = NULL;
    }
    if (default_stream_group->description) {
        free(default_stream_group->description);
        default_stream_group->description = NULL;
    }
    if (default_stream_group->streams) {
        list_ForEach(listEntry, default_stream_group->streams) {
            basic_stream_free(listEntry->data);
        }
        list_free(default_stream_group->streams);
        default_stream_group->streams = NULL;
    }
    free(default_stream_group);
}

cJSON *default_stream_group_convertToJSON(default_stream_group_t *default_stream_group) {
    cJSON *item = cJSON_CreateObject();

    // default_stream_group->name
    if(default_stream_group->name) { 
    if(cJSON_AddStringToObject(item, "name", default_stream_group->name) == NULL) {
    goto fail; //String
    }
     } 


    // default_stream_group->description
    if(default_stream_group->description) { 
    if(cJSON_AddStringToObject(item, "description", default_stream_group->description) == NULL) {
    goto fail; //String
    }
     } 


    // default_stream_group->id
    if(default_stream_group->id) { 
    if(cJSON_AddNumberToObject(item, "id", default_stream_group->id) == NULL) {
    goto fail; //Numeric
    }
     } 


    // default_stream_group->streams
    if(default_stream_group->streams) { 
    cJSON *streams = cJSON_AddArrayToObject(item, "streams");
    if(streams == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *streamsListEntry;
    if (default_stream_group->streams) {
    list_ForEach(streamsListEntry, default_stream_group->streams) {
    cJSON *itemLocal = basic_stream_convertToJSON(streamsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(streams, itemLocal);
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

default_stream_group_t *default_stream_group_parseFromJSON(cJSON *default_stream_groupJSON){

    default_stream_group_t *default_stream_group_local_var = NULL;

    // default_stream_group->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(default_stream_groupJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }
    }

    // default_stream_group->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(default_stream_groupJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description))
    {
    goto end; //String
    }
    }

    // default_stream_group->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(default_stream_groupJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }

    // default_stream_group->streams
    cJSON *streams = cJSON_GetObjectItemCaseSensitive(default_stream_groupJSON, "streams");
    list_t *streamsList;
    if (streams) { 
    cJSON *streams_local_nonprimitive;
    if(!cJSON_IsArray(streams)){
        goto end; //nonprimitive container
    }

    streamsList = list_create();

    cJSON_ArrayForEach(streams_local_nonprimitive,streams )
    {
        if(!cJSON_IsObject(streams_local_nonprimitive)){
            goto end;
        }
        basic_stream_t *streamsItem = basic_stream_parseFromJSON(streams_local_nonprimitive);

        list_addElement(streamsList, streamsItem);
    }
    }


    default_stream_group_local_var = default_stream_group_create (
        name ? strdup(name->valuestring) : NULL,
        description ? strdup(description->valuestring) : NULL,
        id ? id->valuedouble : 0,
        streams ? streamsList : NULL
        );

    return default_stream_group_local_var;
end:
    return NULL;

}
