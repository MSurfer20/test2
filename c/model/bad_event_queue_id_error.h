/*
 * bad_event_queue_id_error.h
 *
 * 
 */

#ifndef _bad_event_queue_id_error_H_
#define _bad_event_queue_id_error_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct bad_event_queue_id_error_t bad_event_queue_id_error_t;

#include "any_type.h"
#include "bad_event_queue_id_error_all_of.h"
#include "coded_error_base.h"



typedef struct bad_event_queue_id_error_t {
    char *queue_id; // string

} bad_event_queue_id_error_t;

bad_event_queue_id_error_t *bad_event_queue_id_error_create(
    char *queue_id
);

void bad_event_queue_id_error_free(bad_event_queue_id_error_t *bad_event_queue_id_error);

bad_event_queue_id_error_t *bad_event_queue_id_error_parseFromJSON(cJSON *bad_event_queue_id_errorJSON);

cJSON *bad_event_queue_id_error_convertToJSON(bad_event_queue_id_error_t *bad_event_queue_id_error);

#endif /* _bad_event_queue_id_error_H_ */

