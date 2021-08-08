/*
 * basic_stream_base.h
 *
 * Object containing basic details about the stream. 
 */

#ifndef _basic_stream_base_H_
#define _basic_stream_base_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct basic_stream_base_t basic_stream_base_t;




typedef struct basic_stream_base_t {
    int stream_id; //numeric
    char *name; // string
    char *description; // string
    int date_created; //numeric
    int invite_only; //boolean
    char *rendered_description; // string
    int is_web_public; //boolean
    int stream_post_policy; //numeric
    int message_retention_days; //numeric
    int history_public_to_subscribers; //boolean
    int first_message_id; //numeric
    int is_announcement_only; //boolean

} basic_stream_base_t;

basic_stream_base_t *basic_stream_base_create(
    int stream_id,
    char *name,
    char *description,
    int date_created,
    int invite_only,
    char *rendered_description,
    int is_web_public,
    int stream_post_policy,
    int message_retention_days,
    int history_public_to_subscribers,
    int first_message_id,
    int is_announcement_only
);

void basic_stream_base_free(basic_stream_base_t *basic_stream_base);

basic_stream_base_t *basic_stream_base_parseFromJSON(cJSON *basic_stream_baseJSON);

cJSON *basic_stream_base_convertToJSON(basic_stream_base_t *basic_stream_base);

#endif /* _basic_stream_base_H_ */

