/*
 * messages.h
 *
 * 
 */

#ifndef _messages_H_
#define _messages_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct messages_t messages_t;

#include "any_type.h"
#include "messages_all_of.h"
#include "messages_base.h"



typedef struct messages_t {

} messages_t;

messages_t *messages_create(
);

void messages_free(messages_t *messages);

messages_t *messages_parseFromJSON(cJSON *messagesJSON);

cJSON *messages_convertToJSON(messages_t *messages);

#endif /* _messages_H_ */

