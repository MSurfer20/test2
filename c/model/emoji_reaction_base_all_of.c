#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "emoji_reaction_base_all_of.h"



emoji_reaction_base_all_of_t *emoji_reaction_base_all_of_create(
    int user_id,
    emoji_reaction_base_all_of_user_t *user
    ) {
    emoji_reaction_base_all_of_t *emoji_reaction_base_all_of_local_var = malloc(sizeof(emoji_reaction_base_all_of_t));
    if (!emoji_reaction_base_all_of_local_var) {
        return NULL;
    }
    emoji_reaction_base_all_of_local_var->user_id = user_id;
    emoji_reaction_base_all_of_local_var->user = user;

    return emoji_reaction_base_all_of_local_var;
}


void emoji_reaction_base_all_of_free(emoji_reaction_base_all_of_t *emoji_reaction_base_all_of) {
    if(NULL == emoji_reaction_base_all_of){
        return ;
    }
    listEntry_t *listEntry;
    if (emoji_reaction_base_all_of->user) {
        emoji_reaction_base_all_of_user_free(emoji_reaction_base_all_of->user);
        emoji_reaction_base_all_of->user = NULL;
    }
    free(emoji_reaction_base_all_of);
}

cJSON *emoji_reaction_base_all_of_convertToJSON(emoji_reaction_base_all_of_t *emoji_reaction_base_all_of) {
    cJSON *item = cJSON_CreateObject();

    // emoji_reaction_base_all_of->user_id
    if(emoji_reaction_base_all_of->user_id) { 
    if(cJSON_AddNumberToObject(item, "user_id", emoji_reaction_base_all_of->user_id) == NULL) {
    goto fail; //Numeric
    }
     } 


    // emoji_reaction_base_all_of->user
    if(emoji_reaction_base_all_of->user) { 
    cJSON *user_local_JSON = emoji_reaction_base_all_of_user_convertToJSON(emoji_reaction_base_all_of->user);
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

emoji_reaction_base_all_of_t *emoji_reaction_base_all_of_parseFromJSON(cJSON *emoji_reaction_base_all_ofJSON){

    emoji_reaction_base_all_of_t *emoji_reaction_base_all_of_local_var = NULL;

    // emoji_reaction_base_all_of->user_id
    cJSON *user_id = cJSON_GetObjectItemCaseSensitive(emoji_reaction_base_all_ofJSON, "user_id");
    if (user_id) { 
    if(!cJSON_IsNumber(user_id))
    {
    goto end; //Numeric
    }
    }

    // emoji_reaction_base_all_of->user
    cJSON *user = cJSON_GetObjectItemCaseSensitive(emoji_reaction_base_all_ofJSON, "user");
    emoji_reaction_base_all_of_user_t *user_local_nonprim = NULL;
    if (user) { 
    user_local_nonprim = emoji_reaction_base_all_of_user_parseFromJSON(user); //nonprimitive
    }


    emoji_reaction_base_all_of_local_var = emoji_reaction_base_all_of_create (
        user_id ? user_id->valuedouble : 0,
        user ? user_local_nonprim : NULL
        );

    return emoji_reaction_base_all_of_local_var;
end:
    if (user_local_nonprim) {
        emoji_reaction_base_all_of_user_free(user_local_nonprim);
        user_local_nonprim = NULL;
    }
    return NULL;

}
