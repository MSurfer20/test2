#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realm_emoji.h"



realm_emoji_t *realm_emoji_create(
    char *id,
    char *name,
    char *source_url,
    int deactivated,
    int author_id
    ) {
    realm_emoji_t *realm_emoji_local_var = malloc(sizeof(realm_emoji_t));
    if (!realm_emoji_local_var) {
        return NULL;
    }
    realm_emoji_local_var->id = id;
    realm_emoji_local_var->name = name;
    realm_emoji_local_var->source_url = source_url;
    realm_emoji_local_var->deactivated = deactivated;
    realm_emoji_local_var->author_id = author_id;

    return realm_emoji_local_var;
}


void realm_emoji_free(realm_emoji_t *realm_emoji) {
    if(NULL == realm_emoji){
        return ;
    }
    listEntry_t *listEntry;
    if (realm_emoji->id) {
        free(realm_emoji->id);
        realm_emoji->id = NULL;
    }
    if (realm_emoji->name) {
        free(realm_emoji->name);
        realm_emoji->name = NULL;
    }
    if (realm_emoji->source_url) {
        free(realm_emoji->source_url);
        realm_emoji->source_url = NULL;
    }
    free(realm_emoji);
}

cJSON *realm_emoji_convertToJSON(realm_emoji_t *realm_emoji) {
    cJSON *item = cJSON_CreateObject();

    // realm_emoji->id
    if(realm_emoji->id) { 
    if(cJSON_AddStringToObject(item, "id", realm_emoji->id) == NULL) {
    goto fail; //String
    }
     } 


    // realm_emoji->name
    if(realm_emoji->name) { 
    if(cJSON_AddStringToObject(item, "name", realm_emoji->name) == NULL) {
    goto fail; //String
    }
     } 


    // realm_emoji->source_url
    if(realm_emoji->source_url) { 
    if(cJSON_AddStringToObject(item, "source_url", realm_emoji->source_url) == NULL) {
    goto fail; //String
    }
     } 


    // realm_emoji->deactivated
    if(realm_emoji->deactivated) { 
    if(cJSON_AddBoolToObject(item, "deactivated", realm_emoji->deactivated) == NULL) {
    goto fail; //Bool
    }
     } 


    // realm_emoji->author_id
    if(realm_emoji->author_id) { 
    if(cJSON_AddNumberToObject(item, "author_id", realm_emoji->author_id) == NULL) {
    goto fail; //Numeric
    }
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

realm_emoji_t *realm_emoji_parseFromJSON(cJSON *realm_emojiJSON){

    realm_emoji_t *realm_emoji_local_var = NULL;

    // realm_emoji->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(realm_emojiJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }
    }

    // realm_emoji->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(realm_emojiJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }
    }

    // realm_emoji->source_url
    cJSON *source_url = cJSON_GetObjectItemCaseSensitive(realm_emojiJSON, "source_url");
    if (source_url) { 
    if(!cJSON_IsString(source_url))
    {
    goto end; //String
    }
    }

    // realm_emoji->deactivated
    cJSON *deactivated = cJSON_GetObjectItemCaseSensitive(realm_emojiJSON, "deactivated");
    if (deactivated) { 
    if(!cJSON_IsBool(deactivated))
    {
    goto end; //Bool
    }
    }

    // realm_emoji->author_id
    cJSON *author_id = cJSON_GetObjectItemCaseSensitive(realm_emojiJSON, "author_id");
    if (author_id) { 
    if(!cJSON_IsNumber(author_id))
    {
    goto end; //Numeric
    }
    }


    realm_emoji_local_var = realm_emoji_create (
        id ? strdup(id->valuestring) : NULL,
        name ? strdup(name->valuestring) : NULL,
        source_url ? strdup(source_url->valuestring) : NULL,
        deactivated ? deactivated->valueint : 0,
        author_id ? author_id->valuedouble : 0
        );

    return realm_emoji_local_var;
end:
    return NULL;

}
