/*
 * add_subscriptions_response_all_of.h
 *
 * 
 */

#ifndef _add_subscriptions_response_all_of_H_
#define _add_subscriptions_response_all_of_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct add_subscriptions_response_all_of_t add_subscriptions_response_all_of_t;

#include "any_type.h"



typedef struct add_subscriptions_response_all_of_t {
    list_t* subscribed; //map
    list_t* already_subscribed; //map
    list_t *unauthorized; //primitive container

} add_subscriptions_response_all_of_t;

add_subscriptions_response_all_of_t *add_subscriptions_response_all_of_create(
    list_t* subscribed,
    list_t* already_subscribed,
    list_t *unauthorized
);

void add_subscriptions_response_all_of_free(add_subscriptions_response_all_of_t *add_subscriptions_response_all_of);

add_subscriptions_response_all_of_t *add_subscriptions_response_all_of_parseFromJSON(cJSON *add_subscriptions_response_all_ofJSON);

cJSON *add_subscriptions_response_all_of_convertToJSON(add_subscriptions_response_all_of_t *add_subscriptions_response_all_of);

#endif /* _add_subscriptions_response_all_of_H_ */

