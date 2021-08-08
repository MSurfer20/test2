/*
 * user_base.h
 *
 * A dictionary containing basic data on a given Zulip user. 
 */

#ifndef _user_base_H_
#define _user_base_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct user_base_t user_base_t;

#include "object.h"

// Enum ROLE for user_base

typedef enum  { zulip_rest_api_user_base_ROLE_NULL = 0, zulip_rest_api_user_base_ROLE__100, zulip_rest_api_user_base_ROLE__200, zulip_rest_api_user_base_ROLE__300, zulip_rest_api_user_base_ROLE__400, zulip_rest_api_user_base_ROLE__600 } zulip_rest_api_user_base_ROLE_e;

char* user_base_role_ToString(zulip_rest_api_user_base_ROLE_e role);

zulip_rest_api_user_base_ROLE_e user_base_role_FromString(char* role);



typedef struct user_base_t {
    char *email; // string
    int is_bot; //boolean
    char *avatar_url; // string
    int avatar_version; //numeric
    char *full_name; // string
    int is_admin; //boolean
    int is_owner; //boolean
    int is_billing_admin; //boolean
    int role; //numeric
    int bot_type; //numeric
    int user_id; //numeric
    int bot_owner_id; //numeric
    int is_active; //boolean
    int is_guest; //boolean
    char *timezone; // string
    char *date_joined; // string
    char *delivery_email; // string
    list_t* profile_data; //map

} user_base_t;

user_base_t *user_base_create(
    char *email,
    int is_bot,
    char *avatar_url,
    int avatar_version,
    char *full_name,
    int is_admin,
    int is_owner,
    int is_billing_admin,
    int role,
    int bot_type,
    int user_id,
    int bot_owner_id,
    int is_active,
    int is_guest,
    char *timezone,
    char *date_joined,
    char *delivery_email,
    list_t* profile_data
);

void user_base_free(user_base_t *user_base);

user_base_t *user_base_parseFromJSON(cJSON *user_baseJSON);

cJSON *user_base_convertToJSON(user_base_t *user_base);

#endif /* _user_base_H_ */

