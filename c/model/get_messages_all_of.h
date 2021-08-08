/*
 * get_messages_all_of.h
 *
 * 
 */

#ifndef _get_messages_all_of_H_
#define _get_messages_all_of_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_messages_all_of_t get_messages_all_of_t;

#include "any_type.h"



typedef struct get_messages_all_of_t {
    list_t *flags; //primitive container
    int last_edit_timestamp; //numeric
    char *match_content; // string
    char *match_subject; // string

} get_messages_all_of_t;

get_messages_all_of_t *get_messages_all_of_create(
    list_t *flags,
    int last_edit_timestamp,
    char *match_content,
    char *match_subject
);

void get_messages_all_of_free(get_messages_all_of_t *get_messages_all_of);

get_messages_all_of_t *get_messages_all_of_parseFromJSON(cJSON *get_messages_all_ofJSON);

cJSON *get_messages_all_of_convertToJSON(get_messages_all_of_t *get_messages_all_of);

#endif /* _get_messages_all_of_H_ */

