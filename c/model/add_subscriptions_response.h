/*
 * add_subscriptions_response.h
 *
 * 
 */

#ifndef _add_subscriptions_response_H_
#define _add_subscriptions_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct add_subscriptions_response_t add_subscriptions_response_t;

#include "add_subscriptions_response_all_of.h"
#include "any_type.h"
#include "json_success_base.h"



typedef struct add_subscriptions_response_t {
    list_t* subscribed; //map
    list_t* already_subscribed; //map
    list_t *unauthorized; //primitive container

} add_subscriptions_response_t;

add_subscriptions_response_t *add_subscriptions_response_create(
    list_t* subscribed,
    list_t* already_subscribed,
    list_t *unauthorized
);

void add_subscriptions_response_free(add_subscriptions_response_t *add_subscriptions_response);

add_subscriptions_response_t *add_subscriptions_response_parseFromJSON(cJSON *add_subscriptions_responseJSON);

cJSON *add_subscriptions_response_convertToJSON(add_subscriptions_response_t *add_subscriptions_response);

#endif /* _add_subscriptions_response_H_ */

