#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "emoji_base.h"



emoji_base_t *emoji_base_create(
    char *emoji_code,
    char *emoji_name,
    char *reaction_type
    ) {
    emoji_base_t *emoji_base_local_var = malloc(sizeof(emoji_base_t));
    if (!emoji_base_local_var) {
        return NULL;
    }
    emoji_base_local_var->emoji_code = emoji_code;
    emoji_base_local_var->emoji_name = emoji_name;
    emoji_base_local_var->reaction_type = reaction_type;

    return emoji_base_local_var;
}


void emoji_base_free(emoji_base_t *emoji_base) {
    if(NULL == emoji_base){
        return ;
    }
    listEntry_t *listEntry;
    if (emoji_base->emoji_code) {
        free(emoji_base->emoji_code);
        emoji_base->emoji_code = NULL;
    }
    if (emoji_base->emoji_name) {
        free(emoji_base->emoji_name);
        emoji_base->emoji_name = NULL;
    }
    if (emoji_base->reaction_type) {
        free(emoji_base->reaction_type);
        emoji_base->reaction_type = NULL;
    }
    free(emoji_base);
}

cJSON *emoji_base_convertToJSON(emoji_base_t *emoji_base) {
    cJSON *item = cJSON_CreateObject();

    // emoji_base->emoji_code
    if(emoji_base->emoji_code) { 
    if(cJSON_AddStringToObject(item, "emoji_code", emoji_base->emoji_code) == NULL) {
    goto fail; //String
    }
     } 


    // emoji_base->emoji_name
    if(emoji_base->emoji_name) { 
    if(cJSON_AddStringToObject(item, "emoji_name", emoji_base->emoji_name) == NULL) {
    goto fail; //String
    }
     } 


    // emoji_base->reaction_type
    if(emoji_base->reaction_type) { 
    if(cJSON_AddStringToObject(item, "reaction_type", emoji_base->reaction_type) == NULL) {
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

emoji_base_t *emoji_base_parseFromJSON(cJSON *emoji_baseJSON){

    emoji_base_t *emoji_base_local_var = NULL;

    // emoji_base->emoji_code
    cJSON *emoji_code = cJSON_GetObjectItemCaseSensitive(emoji_baseJSON, "emoji_code");
    if (emoji_code) { 
    if(!cJSON_IsString(emoji_code))
    {
    goto end; //String
    }
    }

    // emoji_base->emoji_name
    cJSON *emoji_name = cJSON_GetObjectItemCaseSensitive(emoji_baseJSON, "emoji_name");
    if (emoji_name) { 
    if(!cJSON_IsString(emoji_name))
    {
    goto end; //String
    }
    }

    // emoji_base->reaction_type
    cJSON *reaction_type = cJSON_GetObjectItemCaseSensitive(emoji_baseJSON, "reaction_type");
    if (reaction_type) { 
    if(!cJSON_IsString(reaction_type))
    {
    goto end; //String
    }
    }


    emoji_base_local_var = emoji_base_create (
        emoji_code ? strdup(emoji_code->valuestring) : NULL,
        emoji_name ? strdup(emoji_name->valuestring) : NULL,
        reaction_type ? strdup(reaction_type->valuestring) : NULL
        );

    return emoji_base_local_var;
end:
    return NULL;

}
