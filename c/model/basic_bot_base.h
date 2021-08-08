/*
 * basic_bot_base.h
 *
 * 
 */

#ifndef _basic_bot_base_H_
#define _basic_bot_base_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct basic_bot_base_t basic_bot_base_t;

#include "one_ofobjectobject.h"



typedef struct basic_bot_base_t {
    int user_id; //numeric
    char *full_name; // string
    char *api_key; // string
    char *default_sending_stream; // string
    char *default_events_register_stream; // string
    int default_all_public_streams; //boolean
    char *avatar_url; // string
    int owner_id; //numeric
    list_t *services; //nonprimitive container

} basic_bot_base_t;

basic_bot_base_t *basic_bot_base_create(
    int user_id,
    char *full_name,
    char *api_key,
    char *default_sending_stream,
    char *default_events_register_stream,
    int default_all_public_streams,
    char *avatar_url,
    int owner_id,
    list_t *services
);

void basic_bot_base_free(basic_bot_base_t *basic_bot_base);

basic_bot_base_t *basic_bot_base_parseFromJSON(cJSON *basic_bot_baseJSON);

cJSON *basic_bot_base_convertToJSON(basic_bot_base_t *basic_bot_base);

#endif /* _basic_bot_base_H_ */

