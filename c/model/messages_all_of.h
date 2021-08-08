/*
 * messages_all_of.h
 *
 * 
 */

#ifndef _messages_all_of_H_
#define _messages_all_of_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct messages_all_of_t messages_all_of_t;

#include "any_type.h"



typedef struct messages_all_of_t {

} messages_all_of_t;

messages_all_of_t *messages_all_of_create(
);

void messages_all_of_free(messages_all_of_t *messages_all_of);

messages_all_of_t *messages_all_of_parseFromJSON(cJSON *messages_all_ofJSON);

cJSON *messages_all_of_convertToJSON(messages_all_of_t *messages_all_of);

#endif /* _messages_all_of_H_ */

