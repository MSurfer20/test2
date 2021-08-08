#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "emoji_reaction_all_of.h"



emoji_reaction_all_of_t *emoji_reaction_all_of_create(
    ) {
    emoji_reaction_all_of_t *emoji_reaction_all_of_local_var = malloc(sizeof(emoji_reaction_all_of_t));
    if (!emoji_reaction_all_of_local_var) {
        return NULL;
    }
    emoji_reaction_all_of_local_var->emoji_code = emoji_code;
    emoji_reaction_all_of_local_var->emoji_name = emoji_name;
    emoji_reaction_all_of_local_var->reaction_type = reaction_type;
    emoji_reaction_all_of_local_var->user_id = user_id;
    emoji_reaction_all_of_local_var->user = user;

    return emoji_reaction_all_of_local_var;
}


void emoji_reaction_all_of_free(emoji_reaction_all_of_t *emoji_reaction_all_of) {
    if(NULL == emoji_reaction_all_of){
        return ;
    }
    listEntry_t *listEntry;
    free(emoji_reaction_all_of);
}

cJSON *emoji_reaction_all_of_convertToJSON(emoji_reaction_all_of_t *emoji_reaction_all_of) {
    cJSON *item = cJSON_CreateObject();

    // emoji_reaction_all_of->emoji_code
    if(emoji_reaction_all_of->emoji_code) { 
     } 


    // emoji_reaction_all_of->emoji_name
    if(emoji_reaction_all_of->emoji_name) { 
     } 


    // emoji_reaction_all_of->reaction_type
    if(emoji_reaction_all_of->reaction_type) { 
     } 


    // emoji_reaction_all_of->user_id
    if(emoji_reaction_all_of->user_id) { 
     } 


    // emoji_reaction_all_of->user
    if(emoji_reaction_all_of->user) { 
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

emoji_reaction_all_of_t *emoji_reaction_all_of_parseFromJSON(cJSON *emoji_reaction_all_ofJSON){

    emoji_reaction_all_of_t *emoji_reaction_all_of_local_var = NULL;

    // emoji_reaction_all_of->emoji_code
    cJSON *emoji_code = cJSON_GetObjectItemCaseSensitive(emoji_reaction_all_ofJSON, "emoji_code");
    }

    // emoji_reaction_all_of->emoji_name
    cJSON *emoji_name = cJSON_GetObjectItemCaseSensitive(emoji_reaction_all_ofJSON, "emoji_name");
    }

    // emoji_reaction_all_of->reaction_type
    cJSON *reaction_type = cJSON_GetObjectItemCaseSensitive(emoji_reaction_all_ofJSON, "reaction_type");
    }

    // emoji_reaction_all_of->user_id
    cJSON *user_id = cJSON_GetObjectItemCaseSensitive(emoji_reaction_all_ofJSON, "user_id");
    }

    // emoji_reaction_all_of->user
    cJSON *user = cJSON_GetObjectItemCaseSensitive(emoji_reaction_all_ofJSON, "user");
    }


    emoji_reaction_all_of_local_var = emoji_reaction_all_of_create (
        );

    return emoji_reaction_all_of_local_var;
end:
    return NULL;

}
