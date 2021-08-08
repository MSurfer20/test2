#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realm_playground.h"



realm_playground_t *realm_playground_create(
    int id,
    char *name,
    char *pygments_language,
    char *url_prefix
    ) {
    realm_playground_t *realm_playground_local_var = malloc(sizeof(realm_playground_t));
    if (!realm_playground_local_var) {
        return NULL;
    }
    realm_playground_local_var->id = id;
    realm_playground_local_var->name = name;
    realm_playground_local_var->pygments_language = pygments_language;
    realm_playground_local_var->url_prefix = url_prefix;

    return realm_playground_local_var;
}


void realm_playground_free(realm_playground_t *realm_playground) {
    if(NULL == realm_playground){
        return ;
    }
    listEntry_t *listEntry;
    if (realm_playground->name) {
        free(realm_playground->name);
        realm_playground->name = NULL;
    }
    if (realm_playground->pygments_language) {
        free(realm_playground->pygments_language);
        realm_playground->pygments_language = NULL;
    }
    if (realm_playground->url_prefix) {
        free(realm_playground->url_prefix);
        realm_playground->url_prefix = NULL;
    }
    free(realm_playground);
}

cJSON *realm_playground_convertToJSON(realm_playground_t *realm_playground) {
    cJSON *item = cJSON_CreateObject();

    // realm_playground->id
    if(realm_playground->id) { 
    if(cJSON_AddNumberToObject(item, "id", realm_playground->id) == NULL) {
    goto fail; //Numeric
    }
     } 


    // realm_playground->name
    if(realm_playground->name) { 
    if(cJSON_AddStringToObject(item, "name", realm_playground->name) == NULL) {
    goto fail; //String
    }
     } 


    // realm_playground->pygments_language
    if(realm_playground->pygments_language) { 
    if(cJSON_AddStringToObject(item, "pygments_language", realm_playground->pygments_language) == NULL) {
    goto fail; //String
    }
     } 


    // realm_playground->url_prefix
    if(realm_playground->url_prefix) { 
    if(cJSON_AddStringToObject(item, "url_prefix", realm_playground->url_prefix) == NULL) {
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

realm_playground_t *realm_playground_parseFromJSON(cJSON *realm_playgroundJSON){

    realm_playground_t *realm_playground_local_var = NULL;

    // realm_playground->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(realm_playgroundJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }

    // realm_playground->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(realm_playgroundJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }
    }

    // realm_playground->pygments_language
    cJSON *pygments_language = cJSON_GetObjectItemCaseSensitive(realm_playgroundJSON, "pygments_language");
    if (pygments_language) { 
    if(!cJSON_IsString(pygments_language))
    {
    goto end; //String
    }
    }

    // realm_playground->url_prefix
    cJSON *url_prefix = cJSON_GetObjectItemCaseSensitive(realm_playgroundJSON, "url_prefix");
    if (url_prefix) { 
    if(!cJSON_IsString(url_prefix))
    {
    goto end; //String
    }
    }


    realm_playground_local_var = realm_playground_create (
        id ? id->valuedouble : 0,
        name ? strdup(name->valuestring) : NULL,
        pygments_language ? strdup(pygments_language->valuestring) : NULL,
        url_prefix ? strdup(url_prefix->valuestring) : NULL
        );

    return realm_playground_local_var;
end:
    return NULL;

}
