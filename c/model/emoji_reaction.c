#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "emoji_reaction.h"



emoji_reaction_t *emoji_reaction_create(
    ) {
    emoji_reaction_t *emoji_reaction_local_var = malloc(sizeof(emoji_reaction_t));
    if (!emoji_reaction_local_var) {
        return NULL;
    }
    emoji_reaction_local_var->emoji_code = emoji_code;
    emoji_reaction_local_var->emoji_name = emoji_name;
    emoji_reaction_local_var->reaction_type = reaction_type;
    emoji_reaction_local_var->user_id = user_id;
    emoji_reaction_local_var->user = user;

    return emoji_reaction_local_var;
}


void emoji_reaction_free(emoji_reaction_t *emoji_reaction) {
    if(NULL == emoji_reaction){
        return ;
    }
    listEntry_t *listEntry;
    free(emoji_reaction);
}

cJSON *emoji_reaction_convertToJSON(emoji_reaction_t *emoji_reaction) {
    cJSON *item = cJSON_CreateObject();

    // emoji_reaction->emoji_code
    if(emoji_reaction->emoji_code) { 
     } 


    // emoji_reaction->emoji_name
    if(emoji_reaction->emoji_name) { 
     } 


    // emoji_reaction->reaction_type
    if(emoji_reaction->reaction_type) { 
     } 


    // emoji_reaction->user_id
    if(emoji_reaction->user_id) { 
     } 


    // emoji_reaction->user
    if(emoji_reaction->user) { 
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

emoji_reaction_t *emoji_reaction_parseFromJSON(cJSON *emoji_reactionJSON){

    emoji_reaction_t *emoji_reaction_local_var = NULL;

    // emoji_reaction->emoji_code
    cJSON *emoji_code = cJSON_GetObjectItemCaseSensitive(emoji_reactionJSON, "emoji_code");
    }

    // emoji_reaction->emoji_name
    cJSON *emoji_name = cJSON_GetObjectItemCaseSensitive(emoji_reactionJSON, "emoji_name");
    }

    // emoji_reaction->reaction_type
    cJSON *reaction_type = cJSON_GetObjectItemCaseSensitive(emoji_reactionJSON, "reaction_type");
    }

    // emoji_reaction->user_id
    cJSON *user_id = cJSON_GetObjectItemCaseSensitive(emoji_reactionJSON, "user_id");
    }

    // emoji_reaction->user
    cJSON *user = cJSON_GetObjectItemCaseSensitive(emoji_reactionJSON, "user");
    }


    emoji_reaction_local_var = emoji_reaction_create (
        );

    return emoji_reaction_local_var;
end:
    return NULL;

}
