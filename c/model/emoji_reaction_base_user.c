#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "emoji_reaction_base_user.h"



emoji_reaction_base_user_t *emoji_reaction_base_user_create(
    int id,
    char *email,
    char *full_name,
    int is_mirror_dummy
    ) {
    emoji_reaction_base_user_t *emoji_reaction_base_user_local_var = malloc(sizeof(emoji_reaction_base_user_t));
    if (!emoji_reaction_base_user_local_var) {
        return NULL;
    }
    emoji_reaction_base_user_local_var->id = id;
    emoji_reaction_base_user_local_var->email = email;
    emoji_reaction_base_user_local_var->full_name = full_name;
    emoji_reaction_base_user_local_var->is_mirror_dummy = is_mirror_dummy;

    return emoji_reaction_base_user_local_var;
}


void emoji_reaction_base_user_free(emoji_reaction_base_user_t *emoji_reaction_base_user) {
    if(NULL == emoji_reaction_base_user){
        return ;
    }
    listEntry_t *listEntry;
    if (emoji_reaction_base_user->email) {
        free(emoji_reaction_base_user->email);
        emoji_reaction_base_user->email = NULL;
    }
    if (emoji_reaction_base_user->full_name) {
        free(emoji_reaction_base_user->full_name);
        emoji_reaction_base_user->full_name = NULL;
    }
    free(emoji_reaction_base_user);
}

cJSON *emoji_reaction_base_user_convertToJSON(emoji_reaction_base_user_t *emoji_reaction_base_user) {
    cJSON *item = cJSON_CreateObject();

    // emoji_reaction_base_user->id
    if(emoji_reaction_base_user->id) { 
    if(cJSON_AddNumberToObject(item, "id", emoji_reaction_base_user->id) == NULL) {
    goto fail; //Numeric
    }
     } 


    // emoji_reaction_base_user->email
    if(emoji_reaction_base_user->email) { 
    if(cJSON_AddStringToObject(item, "email", emoji_reaction_base_user->email) == NULL) {
    goto fail; //String
    }
     } 


    // emoji_reaction_base_user->full_name
    if(emoji_reaction_base_user->full_name) { 
    if(cJSON_AddStringToObject(item, "full_name", emoji_reaction_base_user->full_name) == NULL) {
    goto fail; //String
    }
     } 


    // emoji_reaction_base_user->is_mirror_dummy
    if(emoji_reaction_base_user->is_mirror_dummy) { 
    if(cJSON_AddBoolToObject(item, "is_mirror_dummy", emoji_reaction_base_user->is_mirror_dummy) == NULL) {
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

emoji_reaction_base_user_t *emoji_reaction_base_user_parseFromJSON(cJSON *emoji_reaction_base_userJSON){

    emoji_reaction_base_user_t *emoji_reaction_base_user_local_var = NULL;

    // emoji_reaction_base_user->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(emoji_reaction_base_userJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }

    // emoji_reaction_base_user->email
    cJSON *email = cJSON_GetObjectItemCaseSensitive(emoji_reaction_base_userJSON, "email");
    if (email) { 
    if(!cJSON_IsString(email))
    {
    goto end; //String
    }
    }

    // emoji_reaction_base_user->full_name
    cJSON *full_name = cJSON_GetObjectItemCaseSensitive(emoji_reaction_base_userJSON, "full_name");
    if (full_name) { 
    if(!cJSON_IsString(full_name))
    {
    goto end; //String
    }
    }

    // emoji_reaction_base_user->is_mirror_dummy
    cJSON *is_mirror_dummy = cJSON_GetObjectItemCaseSensitive(emoji_reaction_base_userJSON, "is_mirror_dummy");
    if (is_mirror_dummy) { 
    if(!cJSON_IsBool(is_mirror_dummy))
    {
    goto end; //Bool
    }
    }


    emoji_reaction_base_user_local_var = emoji_reaction_base_user_create (
        id ? id->valuedouble : 0,
        email ? strdup(email->valuestring) : NULL,
        full_name ? strdup(full_name->valuestring) : NULL,
        is_mirror_dummy ? is_mirror_dummy->valueint : 0
        );

    return emoji_reaction_base_user_local_var;
end:
    return NULL;

}
