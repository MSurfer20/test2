#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "user_all_of.h"



user_all_of_t *user_all_of_create(
    ) {
    user_all_of_t *user_all_of_local_var = malloc(sizeof(user_all_of_t));
    if (!user_all_of_local_var) {
        return NULL;
    }
    user_all_of_local_var->email = email;
    user_all_of_local_var->is_bot = is_bot;
    user_all_of_local_var->avatar_url = avatar_url;
    user_all_of_local_var->avatar_version = avatar_version;
    user_all_of_local_var->full_name = full_name;
    user_all_of_local_var->is_admin = is_admin;
    user_all_of_local_var->is_owner = is_owner;
    user_all_of_local_var->is_billing_admin = is_billing_admin;
    user_all_of_local_var->role = role;
    user_all_of_local_var->bot_type = bot_type;
    user_all_of_local_var->user_id = user_id;
    user_all_of_local_var->bot_owner_id = bot_owner_id;
    user_all_of_local_var->is_active = is_active;
    user_all_of_local_var->is_guest = is_guest;
    user_all_of_local_var->timezone = timezone;
    user_all_of_local_var->date_joined = date_joined;
    user_all_of_local_var->delivery_email = delivery_email;
    user_all_of_local_var->profile_data = profile_data;

    return user_all_of_local_var;
}


void user_all_of_free(user_all_of_t *user_all_of) {
    if(NULL == user_all_of){
        return ;
    }
    listEntry_t *listEntry;
    free(user_all_of);
}

cJSON *user_all_of_convertToJSON(user_all_of_t *user_all_of) {
    cJSON *item = cJSON_CreateObject();

    // user_all_of->email
    if(user_all_of->email) { 
     } 


    // user_all_of->is_bot
    if(user_all_of->is_bot) { 
     } 


    // user_all_of->avatar_url
    if(user_all_of->avatar_url) { 
     } 


    // user_all_of->avatar_version
    if(user_all_of->avatar_version) { 
     } 


    // user_all_of->full_name
    if(user_all_of->full_name) { 
     } 


    // user_all_of->is_admin
    if(user_all_of->is_admin) { 
     } 


    // user_all_of->is_owner
    if(user_all_of->is_owner) { 
     } 


    // user_all_of->is_billing_admin
    if(user_all_of->is_billing_admin) { 
     } 


    // user_all_of->role
    if(user_all_of->role) { 
     } 


    // user_all_of->bot_type
    if(user_all_of->bot_type) { 
     } 


    // user_all_of->user_id
    if(user_all_of->user_id) { 
     } 


    // user_all_of->bot_owner_id
    if(user_all_of->bot_owner_id) { 
     } 


    // user_all_of->is_active
    if(user_all_of->is_active) { 
     } 


    // user_all_of->is_guest
    if(user_all_of->is_guest) { 
     } 


    // user_all_of->timezone
    if(user_all_of->timezone) { 
     } 


    // user_all_of->date_joined
    if(user_all_of->date_joined) { 
     } 


    // user_all_of->delivery_email
    if(user_all_of->delivery_email) { 
     } 


    // user_all_of->profile_data
    if(user_all_of->profile_data) { 
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

user_all_of_t *user_all_of_parseFromJSON(cJSON *user_all_ofJSON){

    user_all_of_t *user_all_of_local_var = NULL;

    // user_all_of->email
    cJSON *email = cJSON_GetObjectItemCaseSensitive(user_all_ofJSON, "email");
    }

    // user_all_of->is_bot
    cJSON *is_bot = cJSON_GetObjectItemCaseSensitive(user_all_ofJSON, "is_bot");
    }

    // user_all_of->avatar_url
    cJSON *avatar_url = cJSON_GetObjectItemCaseSensitive(user_all_ofJSON, "avatar_url");
    }

    // user_all_of->avatar_version
    cJSON *avatar_version = cJSON_GetObjectItemCaseSensitive(user_all_ofJSON, "avatar_version");
    }

    // user_all_of->full_name
    cJSON *full_name = cJSON_GetObjectItemCaseSensitive(user_all_ofJSON, "full_name");
    }

    // user_all_of->is_admin
    cJSON *is_admin = cJSON_GetObjectItemCaseSensitive(user_all_ofJSON, "is_admin");
    }

    // user_all_of->is_owner
    cJSON *is_owner = cJSON_GetObjectItemCaseSensitive(user_all_ofJSON, "is_owner");
    }

    // user_all_of->is_billing_admin
    cJSON *is_billing_admin = cJSON_GetObjectItemCaseSensitive(user_all_ofJSON, "is_billing_admin");
    }

    // user_all_of->role
    cJSON *role = cJSON_GetObjectItemCaseSensitive(user_all_ofJSON, "role");
    }

    // user_all_of->bot_type
    cJSON *bot_type = cJSON_GetObjectItemCaseSensitive(user_all_ofJSON, "bot_type");
    }

    // user_all_of->user_id
    cJSON *user_id = cJSON_GetObjectItemCaseSensitive(user_all_ofJSON, "user_id");
    }

    // user_all_of->bot_owner_id
    cJSON *bot_owner_id = cJSON_GetObjectItemCaseSensitive(user_all_ofJSON, "bot_owner_id");
    }

    // user_all_of->is_active
    cJSON *is_active = cJSON_GetObjectItemCaseSensitive(user_all_ofJSON, "is_active");
    }

    // user_all_of->is_guest
    cJSON *is_guest = cJSON_GetObjectItemCaseSensitive(user_all_ofJSON, "is_guest");
    }

    // user_all_of->timezone
    cJSON *timezone = cJSON_GetObjectItemCaseSensitive(user_all_ofJSON, "timezone");
    }

    // user_all_of->date_joined
    cJSON *date_joined = cJSON_GetObjectItemCaseSensitive(user_all_ofJSON, "date_joined");
    }

    // user_all_of->delivery_email
    cJSON *delivery_email = cJSON_GetObjectItemCaseSensitive(user_all_ofJSON, "delivery_email");
    }

    // user_all_of->profile_data
    cJSON *profile_data = cJSON_GetObjectItemCaseSensitive(user_all_ofJSON, "profile_data");
    }


    user_all_of_local_var = user_all_of_create (
        );

    return user_all_of_local_var;
end:
    return NULL;

}
