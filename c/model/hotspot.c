#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "hotspot.h"



hotspot_t *hotspot_create(
    double delay,
    char *name,
    char *title,
    char *description
    ) {
    hotspot_t *hotspot_local_var = malloc(sizeof(hotspot_t));
    if (!hotspot_local_var) {
        return NULL;
    }
    hotspot_local_var->delay = delay;
    hotspot_local_var->name = name;
    hotspot_local_var->title = title;
    hotspot_local_var->description = description;

    return hotspot_local_var;
}


void hotspot_free(hotspot_t *hotspot) {
    if(NULL == hotspot){
        return ;
    }
    listEntry_t *listEntry;
    if (hotspot->name) {
        free(hotspot->name);
        hotspot->name = NULL;
    }
    if (hotspot->title) {
        free(hotspot->title);
        hotspot->title = NULL;
    }
    if (hotspot->description) {
        free(hotspot->description);
        hotspot->description = NULL;
    }
    free(hotspot);
}

cJSON *hotspot_convertToJSON(hotspot_t *hotspot) {
    cJSON *item = cJSON_CreateObject();

    // hotspot->delay
    if(hotspot->delay) { 
    if(cJSON_AddNumberToObject(item, "delay", hotspot->delay) == NULL) {
    goto fail; //Numeric
    }
     } 


    // hotspot->name
    if(hotspot->name) { 
    if(cJSON_AddStringToObject(item, "name", hotspot->name) == NULL) {
    goto fail; //String
    }
     } 


    // hotspot->title
    if(hotspot->title) { 
    if(cJSON_AddStringToObject(item, "title", hotspot->title) == NULL) {
    goto fail; //String
    }
     } 


    // hotspot->description
    if(hotspot->description) { 
    if(cJSON_AddStringToObject(item, "description", hotspot->description) == NULL) {
    goto fail; //String
    }
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

hotspot_t *hotspot_parseFromJSON(cJSON *hotspotJSON){

    hotspot_t *hotspot_local_var = NULL;

    // hotspot->delay
    cJSON *delay = cJSON_GetObjectItemCaseSensitive(hotspotJSON, "delay");
    if (delay) { 
    if(!cJSON_IsNumber(delay))
    {
    goto end; //Numeric
    }
    }

    // hotspot->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(hotspotJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }
    }

    // hotspot->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(hotspotJSON, "title");
    if (title) { 
    if(!cJSON_IsString(title))
    {
    goto end; //String
    }
    }

    // hotspot->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(hotspotJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description))
    {
    goto end; //String
    }
    }


    hotspot_local_var = hotspot_create (
        delay ? delay->valuedouble : 0,
        name ? strdup(name->valuestring) : NULL,
        title ? strdup(title->valuestring) : NULL,
        description ? strdup(description->valuestring) : NULL
        );

    return hotspot_local_var;
end:
    return NULL;

}
