/*
 * draft.h
 *
 * A dictionary for representing a message draft. 
 */

#ifndef _draft_H_
#define _draft_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct draft_t draft_t;


// Enum TYPE for draft

typedef enum  { zulip_rest_api_draft_TYPE_NULL = 0, zulip_rest_api_draft_TYPE_, zulip_rest_api_draft_TYPE_stream, zulip_rest_api_draft_TYPE__private } zulip_rest_api_draft_TYPE_e;

char* draft_type_ToString(zulip_rest_api_draft_TYPE_e type);

zulip_rest_api_draft_TYPE_e draft_type_FromString(char* type);



typedef struct draft_t {
    int id; //numeric
    zulip_rest_api_draft_TYPE_e type; //enum
    list_t *to; //primitive container
    char *topic; // string
    char *content; // string
    double timestamp; //numeric

} draft_t;

draft_t *draft_create(
    int id,
    zulip_rest_api_draft_TYPE_e type,
    list_t *to,
    char *topic,
    char *content,
    double timestamp
);

void draft_free(draft_t *draft);

draft_t *draft_parseFromJSON(cJSON *draftJSON);

cJSON *draft_convertToJSON(draft_t *draft);

#endif /* _draft_H_ */

