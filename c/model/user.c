#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "user.h"



user_t *user_create(
    ) {
    user_t *user_local_var = malloc(sizeof(user_t));
    if (!user_local_var) {
        return NULL;
    }
    user_local_var->email = email;
    user_local_var->is_bot = is_bot;
    user_local_var->avatar_url = avatar_url;
    user_local_var->avatar_version = avatar_version;
    user_local_var->full_name = full_name;
    user_local_var->is_admin = is_admin;
    user_local_var->is_owner = is_owner;
    user_local_var->is_billing_admin = is_billing_admin;
    user_local_var->role = role;
    user_local_var->bot_type = bot_type;
    user_local_var->user_id = user_id;
    user_local_var->bot_owner_id = bot_owner_id;
    user_local_var->is_active = is_active;
    user_local_var->is_guest = is_guest;
    user_local_var->timezone = timezone;
    user_local_var->date_joined = date_joined;
    user_local_var->delivery_email = delivery_email;
    user_local_var->profile_data = profile_data;

    return user_local_var;
}


void user_free(user_t *user) {
    if(NULL == user){
        return ;
    }
    listEntry_t *listEntry;
    free(user);
}

cJSON *user_convertToJSON(user_t *user) {
    cJSON *item = cJSON_CreateObject();

    // user->email
    if(user->email) { 
     } 


    // user->is_bot
    if(user->is_bot) { 
     } 


    // user->avatar_url
    if(user->avatar_url) { 
     } 


    // user->avatar_version
    if(user->avatar_version) { 
     } 


    // user->full_name
    if(user->full_name) { 
     } 


    // user->is_admin
    if(user->is_admin) { 
     } 


    // user->is_owner
    if(user->is_owner) { 
     } 


    // user->is_billing_admin
    if(user->is_billing_admin) { 
     } 


    // user->role
    if(user->role) { 
     } 


    // user->bot_type
    if(user->bot_type) { 
     } 


    // user->user_id
    if(user->user_id) { 
     } 


    // user->bot_owner_id
    if(user->bot_owner_id) { 
     } 


    // user->is_active
    if(user->is_active) { 
     } 


    // user->is_guest
    if(user->is_guest) { 
     } 


    // user->timezone
    if(user->timezone) { 
     } 


    // user->date_joined
    if(user->date_joined) { 
     } 


    // user->delivery_email
    if(user->delivery_email) { 
     } 


    // user->profile_data
    if(user->profile_data) { 
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

user_t *user_parseFromJSON(cJSON *userJSON){

    user_t *user_local_var = NULL;

    // user->email
    cJSON *email = cJSON_GetObjectItemCaseSensitive(userJSON, "email");
    }

    // user->is_bot
    cJSON *is_bot = cJSON_GetObjectItemCaseSensitive(userJSON, "is_bot");
    }

    // user->avatar_url
    cJSON *avatar_url = cJSON_GetObjectItemCaseSensitive(userJSON, "avatar_url");
    }

    // user->avatar_version
    cJSON *avatar_version = cJSON_GetObjectItemCaseSensitive(userJSON, "avatar_version");
    }

    // user->full_name
    cJSON *full_name = cJSON_GetObjectItemCaseSensitive(userJSON, "full_name");
    }

    // user->is_admin
    cJSON *is_admin = cJSON_GetObjectItemCaseSensitive(userJSON, "is_admin");
    }

    // user->is_owner
    cJSON *is_owner = cJSON_GetObjectItemCaseSensitive(userJSON, "is_owner");
    }

    // user->is_billing_admin
    cJSON *is_billing_admin = cJSON_GetObjectItemCaseSensitive(userJSON, "is_billing_admin");
    }

    // user->role
    cJSON *role = cJSON_GetObjectItemCaseSensitive(userJSON, "role");
    }

    // user->bot_type
    cJSON *bot_type = cJSON_GetObjectItemCaseSensitive(userJSON, "bot_type");
    }

    // user->user_id
    cJSON *user_id = cJSON_GetObjectItemCaseSensitive(userJSON, "user_id");
    }

    // user->bot_owner_id
    cJSON *bot_owner_id = cJSON_GetObjectItemCaseSensitive(userJSON, "bot_owner_id");
    }

    // user->is_active
    cJSON *is_active = cJSON_GetObjectItemCaseSensitive(userJSON, "is_active");
    }

    // user->is_guest
    cJSON *is_guest = cJSON_GetObjectItemCaseSensitive(userJSON, "is_guest");
    }

    // user->timezone
    cJSON *timezone = cJSON_GetObjectItemCaseSensitive(userJSON, "timezone");
    }

    // user->date_joined
    cJSON *date_joined = cJSON_GetObjectItemCaseSensitive(userJSON, "date_joined");
    }

    // user->delivery_email
    cJSON *delivery_email = cJSON_GetObjectItemCaseSensitive(userJSON, "delivery_email");
    }

    // user->profile_data
    cJSON *profile_data = cJSON_GetObjectItemCaseSensitive(userJSON, "profile_data");
    }


    user_local_var = user_create (
        );

    return user_local_var;
end:
    return NULL;

}
