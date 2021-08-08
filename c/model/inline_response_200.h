/*
 * inline_response_200.h
 *
 * This is an example of the JSON payload that the Zulip server will &#x60;POST&#x60; to your server 
 */

#ifndef _inline_response_200_H_
#define _inline_response_200_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct inline_response_200_t inline_response_200_t;

#include "messages_base.h"



typedef struct inline_response_200_t {
    char *bot_email; // string
    char *bot_full_name; // string
    char *data; // string
    char *trigger; // string
    char *token; // string
    struct messages_base_t *message; //model

} inline_response_200_t;

inline_response_200_t *inline_response_200_create(
    char *bot_email,
    char *bot_full_name,
    char *data,
    char *trigger,
    char *token,
    messages_base_t *message
);

void inline_response_200_free(inline_response_200_t *inline_response_200);

inline_response_200_t *inline_response_200_parseFromJSON(cJSON *inline_response_200JSON);

cJSON *inline_response_200_convertToJSON(inline_response_200_t *inline_response_200);

#endif /* _inline_response_200_H_ */

