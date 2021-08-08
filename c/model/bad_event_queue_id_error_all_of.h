/*
 * bad_event_queue_id_error_all_of.h
 *
 * 
 */

#ifndef _bad_event_queue_id_error_all_of_H_
#define _bad_event_queue_id_error_all_of_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct bad_event_queue_id_error_all_of_t bad_event_queue_id_error_all_of_t;

#include "any_type.h"



typedef struct bad_event_queue_id_error_all_of_t {
    char *queue_id; // string

} bad_event_queue_id_error_all_of_t;

bad_event_queue_id_error_all_of_t *bad_event_queue_id_error_all_of_create(
    char *queue_id
);

void bad_event_queue_id_error_all_of_free(bad_event_queue_id_error_all_of_t *bad_event_queue_id_error_all_of);

bad_event_queue_id_error_all_of_t *bad_event_queue_id_error_all_of_parseFromJSON(cJSON *bad_event_queue_id_error_all_ofJSON);

cJSON *bad_event_queue_id_error_all_of_convertToJSON(bad_event_queue_id_error_all_of_t *bad_event_queue_id_error_all_of);

#endif /* _bad_event_queue_id_error_all_of_H_ */

