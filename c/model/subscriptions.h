/*
 * subscriptions.h
 *
 * 
 */

#ifndef _subscriptions_H_
#define _subscriptions_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct subscriptions_t subscriptions_t;


// Enum ROLE for subscriptions

typedef enum  { zulip_rest_api_subscriptions_ROLE_NULL = 0, zulip_rest_api_subscriptions_ROLE__20, zulip_rest_api_subscriptions_ROLE__50 } zulip_rest_api_subscriptions_ROLE_e;

char* subscriptions_role_ToString(zulip_rest_api_subscriptions_ROLE_e role);

zulip_rest_api_subscriptions_ROLE_e subscriptions_role_FromString(char* role);



typedef struct subscriptions_t {
    int stream_id; //numeric
    char *name; // string
    char *description; // string
    char *rendered_description; // string
    int date_created; //numeric
    int invite_only; //boolean
    list_t *subscribers; //primitive container
    int desktop_notifications; //boolean
    int email_notifications; //boolean
    int wildcard_mentions_notify; //boolean
    int push_notifications; //boolean
    int audible_notifications; //boolean
    int pin_to_top; //boolean
    char *email_address; // string
    int is_muted; //boolean
    int in_home_view; //boolean
    int is_announcement_only; //boolean
    int is_web_public; //boolean
    int role; //numeric
    char *color; // string
    int stream_post_policy; //numeric
    int message_retention_days; //numeric
    int history_public_to_subscribers; //boolean
    int first_message_id; //numeric
    int stream_weekly_traffic; //numeric

} subscriptions_t;

subscriptions_t *subscriptions_create(
    int stream_id,
    char *name,
    char *description,
    char *rendered_description,
    int date_created,
    int invite_only,
    list_t *subscribers,
    int desktop_notifications,
    int email_notifications,
    int wildcard_mentions_notify,
    int push_notifications,
    int audible_notifications,
    int pin_to_top,
    char *email_address,
    int is_muted,
    int in_home_view,
    int is_announcement_only,
    int is_web_public,
    int role,
    char *color,
    int stream_post_policy,
    int message_retention_days,
    int history_public_to_subscribers,
    int first_message_id,
    int stream_weekly_traffic
);

void subscriptions_free(subscriptions_t *subscriptions);

subscriptions_t *subscriptions_parseFromJSON(cJSON *subscriptionsJSON);

cJSON *subscriptions_convertToJSON(subscriptions_t *subscriptions);

#endif /* _subscriptions_H_ */

