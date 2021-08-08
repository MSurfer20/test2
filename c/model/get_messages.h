/*
 * get_messages.h
 *
 * 
 */

#ifndef _get_messages_H_
#define _get_messages_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_messages_t get_messages_t;

#include "any_type.h"
#include "get_messages_all_of.h"
#include "messages_base.h"



typedef struct get_messages_t {
    list_t *flags; //primitive container
    int last_edit_timestamp; //numeric
    char *match_content; // string
    char *match_subject; // string

} get_messages_t;

get_messages_t *get_messages_create(
    list_t *flags,
    int last_edit_timestamp,
    char *match_content,
    char *match_subject
);

void get_messages_free(get_messages_t *get_messages);

get_messages_t *get_messages_parseFromJSON(cJSON *get_messagesJSON);

cJSON *get_messages_convertToJSON(get_messages_t *get_messages);

#endif /* _get_messages_H_ */

