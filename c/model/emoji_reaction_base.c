#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "emoji_reaction_base.h"



emoji_reaction_base_t *emoji_reaction_base_create(
    char *emoji_code,
    char *emoji_name,
    char *reaction_type,
    int user_id,
    emoji_reaction_base_user_t *user
    ) {
    emoji_reaction_base_t *emoji_reaction_base_local_var = malloc(sizeof(emoji_reaction_base_t));
    if (!emoji_reaction_base_local_var) {
        return NULL;
    }
    emoji_reaction_base_local_var->emoji_code = emoji_code;
    emoji_reaction_base_local_var->emoji_name = emoji_name;
    emoji_reaction_base_local_var->reaction_type = reaction_type;
    emoji_reaction_base_local_var->user_id = user_id;
    emoji_reaction_base_local_var->user = user;

    return emoji_reaction_base_local_var;
}


void emoji_reaction_base_free(emoji_reaction_base_t *emoji_reaction_base) {
    if(NULL == emoji_reaction_base){
        return ;
    }
    listEntry_t *listEntry;
    if (emoji_reaction_base->emoji_code) {
        free(emoji_reaction_base->emoji_code);
        emoji_reaction_base->emoji_code = NULL;
    }
    if (emoji_reaction_base->emoji_name) {
        free(emoji_reaction_base->emoji_name);
        emoji_reaction_base->emoji_name = NULL;
    }
    if (emoji_reaction_base->reaction_type) {
        free(emoji_reaction_base->reaction_type);
        emoji_reaction_base->reaction_type = NULL;
    }
    if (emoji_reaction_base->user) {
        emoji_reaction_base_user_free(emoji_reaction_base->user);
        emoji_reaction_base->user = NULL;
    }
    free(emoji_reaction_base);
}

cJSON *emoji_reaction_base_convertToJSON(emoji_reaction_base_t *emoji_reaction_base) {
    cJSON *item = cJSON_CreateObject();

    // emoji_reaction_base->emoji_code
    if(emoji_reaction_base->emoji_code) { 
    if(cJSON_AddStringToObject(item, "emoji_code", emoji_reaction_base->emoji_code) == NULL) {
    goto fail; //String
    }
     } 


    // emoji_reaction_base->emoji_name
    if(emoji_reaction_base->emoji_name) { 
    if(cJSON_AddStringToObject(item, "emoji_name", emoji_reaction_base->emoji_name) == NULL) {
    goto fail; //String
    }
     } 


    // emoji_reaction_base->reaction_type
    if(emoji_reaction_base->reaction_type) { 
    if(cJSON_AddStringToObject(item, "reaction_type", emoji_reaction_base->reaction_type) == NULL) {
    goto fail; //String
    }
     } 


    // emoji_reaction_base->user_id
    if(emoji_reaction_base->user_id) { 
    if(cJSON_AddNumberToObject(item, "user_id", emoji_reaction_base->user_id) == NULL) {
    goto fail; //Numeric
    }
     } 


    // emoji_reaction_base->user
    if(emoji_reaction_base->user) { 
    cJSON *user_local_JSON = emoji_reaction_base_user_convertToJSON(emoji_reaction_base->user);
    if(user_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "user", user_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

emoji_reaction_base_t *emoji_reaction_base_parseFromJSON(cJSON *emoji_reaction_baseJSON){

    emoji_reaction_base_t *emoji_reaction_base_local_var = NULL;

    // emoji_reaction_base->emoji_code
    cJSON *emoji_code = cJSON_GetObjectItemCaseSensitive(emoji_reaction_baseJSON, "emoji_code");
    if (emoji_code) { 
    if(!cJSON_IsString(emoji_code))
    {
    goto end; //String
    }
    }

    // emoji_reaction_base->emoji_name
    cJSON *emoji_name = cJSON_GetObjectItemCaseSensitive(emoji_reaction_baseJSON, "emoji_name");
    if (emoji_name) { 
    if(!cJSON_IsString(emoji_name))
    {
    goto end; //String
    }
    }

    // emoji_reaction_base->reaction_type
    cJSON *reaction_type = cJSON_GetObjectItemCaseSensitive(emoji_reaction_baseJSON, "reaction_type");
    if (reaction_type) { 
    if(!cJSON_IsString(reaction_type))
    {
    goto end; //String
    }
    }

    // emoji_reaction_base->user_id
    cJSON *user_id = cJSON_GetObjectItemCaseSensitive(emoji_reaction_baseJSON, "user_id");
    if (user_id) { 
    if(!cJSON_IsNumber(user_id))
    {
    goto end; //Numeric
    }
    }

    // emoji_reaction_base->user
    cJSON *user = cJSON_GetObjectItemCaseSensitive(emoji_reaction_baseJSON, "user");
    emoji_reaction_base_user_t *user_local_nonprim = NULL;
    if (user) { 
    user_local_nonprim = emoji_reaction_base_user_parseFromJSON(user); //nonprimitive
    }


    emoji_reaction_base_local_var = emoji_reaction_base_create (
        emoji_code ? strdup(emoji_code->valuestring) : NULL,
        emoji_name ? strdup(emoji_name->valuestring) : NULL,
        reaction_type ? strdup(reaction_type->valuestring) : NULL,
        user_id ? user_id->valuedouble : 0,
        user ? user_local_nonprim : NULL
        );

    return emoji_reaction_base_local_var;
end:
    if (user_local_nonprim) {
        emoji_reaction_base_user_free(user_local_nonprim);
        user_local_nonprim = NULL;
    }
    return NULL;

}
