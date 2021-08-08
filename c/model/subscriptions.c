#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "subscriptions.h"


char* rolesubscriptions_ToString(zulip_rest_api_subscriptions_ROLE_e role) {
    char* roleArray[] =  { "NULL", "20", "50" };
	return roleArray[role];
}

zulip_rest_api_subscriptions_ROLE_e rolesubscriptions_FromString(char* role){
    int stringToReturn = 0;
    char *roleArray[] =  { "NULL", "20", "50" };
    size_t sizeofArray = sizeof(roleArray) / sizeof(roleArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(role, roleArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

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
    ) {
    subscriptions_t *subscriptions_local_var = malloc(sizeof(subscriptions_t));
    if (!subscriptions_local_var) {
        return NULL;
    }
    subscriptions_local_var->stream_id = stream_id;
    subscriptions_local_var->name = name;
    subscriptions_local_var->description = description;
    subscriptions_local_var->rendered_description = rendered_description;
    subscriptions_local_var->date_created = date_created;
    subscriptions_local_var->invite_only = invite_only;
    subscriptions_local_var->subscribers = subscribers;
    subscriptions_local_var->desktop_notifications = desktop_notifications;
    subscriptions_local_var->email_notifications = email_notifications;
    subscriptions_local_var->wildcard_mentions_notify = wildcard_mentions_notify;
    subscriptions_local_var->push_notifications = push_notifications;
    subscriptions_local_var->audible_notifications = audible_notifications;
    subscriptions_local_var->pin_to_top = pin_to_top;
    subscriptions_local_var->email_address = email_address;
    subscriptions_local_var->is_muted = is_muted;
    subscriptions_local_var->in_home_view = in_home_view;
    subscriptions_local_var->is_announcement_only = is_announcement_only;
    subscriptions_local_var->is_web_public = is_web_public;
    subscriptions_local_var->role = role;
    subscriptions_local_var->color = color;
    subscriptions_local_var->stream_post_policy = stream_post_policy;
    subscriptions_local_var->message_retention_days = message_retention_days;
    subscriptions_local_var->history_public_to_subscribers = history_public_to_subscribers;
    subscriptions_local_var->first_message_id = first_message_id;
    subscriptions_local_var->stream_weekly_traffic = stream_weekly_traffic;

    return subscriptions_local_var;
}


void subscriptions_free(subscriptions_t *subscriptions) {
    if(NULL == subscriptions){
        return ;
    }
    listEntry_t *listEntry;
    if (subscriptions->name) {
        free(subscriptions->name);
        subscriptions->name = NULL;
    }
    if (subscriptions->description) {
        free(subscriptions->description);
        subscriptions->description = NULL;
    }
    if (subscriptions->rendered_description) {
        free(subscriptions->rendered_description);
        subscriptions->rendered_description = NULL;
    }
    if (subscriptions->subscribers) {
        list_ForEach(listEntry, subscriptions->subscribers) {
            free(listEntry->data);
        }
        list_free(subscriptions->subscribers);
        subscriptions->subscribers = NULL;
    }
    if (subscriptions->email_address) {
        free(subscriptions->email_address);
        subscriptions->email_address = NULL;
    }
    if (subscriptions->color) {
        free(subscriptions->color);
        subscriptions->color = NULL;
    }
    free(subscriptions);
}

cJSON *subscriptions_convertToJSON(subscriptions_t *subscriptions) {
    cJSON *item = cJSON_CreateObject();

    // subscriptions->stream_id
    if(subscriptions->stream_id) { 
    if(cJSON_AddNumberToObject(item, "stream_id", subscriptions->stream_id) == NULL) {
    goto fail; //Numeric
    }
     } 


    // subscriptions->name
    if(subscriptions->name) { 
    if(cJSON_AddStringToObject(item, "name", subscriptions->name) == NULL) {
    goto fail; //String
    }
     } 


    // subscriptions->description
    if(subscriptions->description) { 
    if(cJSON_AddStringToObject(item, "description", subscriptions->description) == NULL) {
    goto fail; //String
    }
     } 


    // subscriptions->rendered_description
    if(subscriptions->rendered_description) { 
    if(cJSON_AddStringToObject(item, "rendered_description", subscriptions->rendered_description) == NULL) {
    goto fail; //String
    }
     } 


    // subscriptions->date_created
    if(subscriptions->date_created) { 
    if(cJSON_AddNumberToObject(item, "date_created", subscriptions->date_created) == NULL) {
    goto fail; //Numeric
    }
     } 


    // subscriptions->invite_only
    if(subscriptions->invite_only) { 
    if(cJSON_AddBoolToObject(item, "invite_only", subscriptions->invite_only) == NULL) {
    goto fail; //Bool
    }
     } 


    // subscriptions->subscribers
    if(subscriptions->subscribers) { 
    cJSON *subscribers = cJSON_AddArrayToObject(item, "subscribers");
    if(subscribers == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *subscribersListEntry;
    list_ForEach(subscribersListEntry, subscriptions->subscribers) {
    if(cJSON_AddNumberToObject(subscribers, "", *(double *)subscribersListEntry->data) == NULL)
    {
        goto fail;
    }
    }
     } 


    // subscriptions->desktop_notifications
    if(subscriptions->desktop_notifications) { 
    if(cJSON_AddBoolToObject(item, "desktop_notifications", subscriptions->desktop_notifications) == NULL) {
    goto fail; //Bool
    }
     } 


    // subscriptions->email_notifications
    if(subscriptions->email_notifications) { 
    if(cJSON_AddBoolToObject(item, "email_notifications", subscriptions->email_notifications) == NULL) {
    goto fail; //Bool
    }
     } 


    // subscriptions->wildcard_mentions_notify
    if(subscriptions->wildcard_mentions_notify) { 
    if(cJSON_AddBoolToObject(item, "wildcard_mentions_notify", subscriptions->wildcard_mentions_notify) == NULL) {
    goto fail; //Bool
    }
     } 


    // subscriptions->push_notifications
    if(subscriptions->push_notifications) { 
    if(cJSON_AddBoolToObject(item, "push_notifications", subscriptions->push_notifications) == NULL) {
    goto fail; //Bool
    }
     } 


    // subscriptions->audible_notifications
    if(subscriptions->audible_notifications) { 
    if(cJSON_AddBoolToObject(item, "audible_notifications", subscriptions->audible_notifications) == NULL) {
    goto fail; //Bool
    }
     } 


    // subscriptions->pin_to_top
    if(subscriptions->pin_to_top) { 
    if(cJSON_AddBoolToObject(item, "pin_to_top", subscriptions->pin_to_top) == NULL) {
    goto fail; //Bool
    }
     } 


    // subscriptions->email_address
    if(subscriptions->email_address) { 
    if(cJSON_AddStringToObject(item, "email_address", subscriptions->email_address) == NULL) {
    goto fail; //String
    }
     } 


    // subscriptions->is_muted
    if(subscriptions->is_muted) { 
    if(cJSON_AddBoolToObject(item, "is_muted", subscriptions->is_muted) == NULL) {
    goto fail; //Bool
    }
     } 


    // subscriptions->in_home_view
    if(subscriptions->in_home_view) { 
    if(cJSON_AddBoolToObject(item, "in_home_view", subscriptions->in_home_view) == NULL) {
    goto fail; //Bool
    }
     } 


    // subscriptions->is_announcement_only
    if(subscriptions->is_announcement_only) { 
    if(cJSON_AddBoolToObject(item, "is_announcement_only", subscriptions->is_announcement_only) == NULL) {
    goto fail; //Bool
    }
     } 


    // subscriptions->is_web_public
    if(subscriptions->is_web_public) { 
    if(cJSON_AddBoolToObject(item, "is_web_public", subscriptions->is_web_public) == NULL) {
    goto fail; //Bool
    }
     } 


    // subscriptions->role
    
    if(cJSON_AddNumberToObject(item, "role", subscriptions->role) == NULL) {
    goto fail; //Numeric
    }
    


    // subscriptions->color
    if(subscriptions->color) { 
    if(cJSON_AddStringToObject(item, "color", subscriptions->color) == NULL) {
    goto fail; //String
    }
     } 


    // subscriptions->stream_post_policy
    if(subscriptions->stream_post_policy) { 
    if(cJSON_AddNumberToObject(item, "stream_post_policy", subscriptions->stream_post_policy) == NULL) {
    goto fail; //Numeric
    }
     } 


    // subscriptions->message_retention_days
    if(subscriptions->message_retention_days) { 
    if(cJSON_AddNumberToObject(item, "message_retention_days", subscriptions->message_retention_days) == NULL) {
    goto fail; //Numeric
    }
     } 


    // subscriptions->history_public_to_subscribers
    if(subscriptions->history_public_to_subscribers) { 
    if(cJSON_AddBoolToObject(item, "history_public_to_subscribers", subscriptions->history_public_to_subscribers) == NULL) {
    goto fail; //Bool
    }
     } 


    // subscriptions->first_message_id
    if(subscriptions->first_message_id) { 
    if(cJSON_AddNumberToObject(item, "first_message_id", subscriptions->first_message_id) == NULL) {
    goto fail; //Numeric
    }
     } 


    // subscriptions->stream_weekly_traffic
    if(subscriptions->stream_weekly_traffic) { 
    if(cJSON_AddNumberToObject(item, "stream_weekly_traffic", subscriptions->stream_weekly_traffic) == NULL) {
    goto fail; //Numeric
    }
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

subscriptions_t *subscriptions_parseFromJSON(cJSON *subscriptionsJSON){

    subscriptions_t *subscriptions_local_var = NULL;

    // subscriptions->stream_id
    cJSON *stream_id = cJSON_GetObjectItemCaseSensitive(subscriptionsJSON, "stream_id");
    if (stream_id) { 
    if(!cJSON_IsNumber(stream_id))
    {
    goto end; //Numeric
    }
    }

    // subscriptions->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(subscriptionsJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }
    }

    // subscriptions->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(subscriptionsJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description))
    {
    goto end; //String
    }
    }

    // subscriptions->rendered_description
    cJSON *rendered_description = cJSON_GetObjectItemCaseSensitive(subscriptionsJSON, "rendered_description");
    if (rendered_description) { 
    if(!cJSON_IsString(rendered_description))
    {
    goto end; //String
    }
    }

    // subscriptions->date_created
    cJSON *date_created = cJSON_GetObjectItemCaseSensitive(subscriptionsJSON, "date_created");
    if (date_created) { 
    if(!cJSON_IsNumber(date_created))
    {
    goto end; //Numeric
    }
    }

    // subscriptions->invite_only
    cJSON *invite_only = cJSON_GetObjectItemCaseSensitive(subscriptionsJSON, "invite_only");
    if (invite_only) { 
    if(!cJSON_IsBool(invite_only))
    {
    goto end; //Bool
    }
    }

    // subscriptions->subscribers
    cJSON *subscribers = cJSON_GetObjectItemCaseSensitive(subscriptionsJSON, "subscribers");
    list_t *subscribersList;
    if (subscribers) { 
    cJSON *subscribers_local;
    if(!cJSON_IsArray(subscribers)) {
        goto end;//primitive container
    }
    subscribersList = list_create();

    cJSON_ArrayForEach(subscribers_local, subscribers)
    {
        if(!cJSON_IsNumber(subscribers_local))
        {
            goto end;
        }
        list_addElement(subscribersList , &subscribers_local->valuedouble);
    }
    }

    // subscriptions->desktop_notifications
    cJSON *desktop_notifications = cJSON_GetObjectItemCaseSensitive(subscriptionsJSON, "desktop_notifications");
    if (desktop_notifications) { 
    if(!cJSON_IsBool(desktop_notifications))
    {
    goto end; //Bool
    }
    }

    // subscriptions->email_notifications
    cJSON *email_notifications = cJSON_GetObjectItemCaseSensitive(subscriptionsJSON, "email_notifications");
    if (email_notifications) { 
    if(!cJSON_IsBool(email_notifications))
    {
    goto end; //Bool
    }
    }

    // subscriptions->wildcard_mentions_notify
    cJSON *wildcard_mentions_notify = cJSON_GetObjectItemCaseSensitive(subscriptionsJSON, "wildcard_mentions_notify");
    if (wildcard_mentions_notify) { 
    if(!cJSON_IsBool(wildcard_mentions_notify))
    {
    goto end; //Bool
    }
    }

    // subscriptions->push_notifications
    cJSON *push_notifications = cJSON_GetObjectItemCaseSensitive(subscriptionsJSON, "push_notifications");
    if (push_notifications) { 
    if(!cJSON_IsBool(push_notifications))
    {
    goto end; //Bool
    }
    }

    // subscriptions->audible_notifications
    cJSON *audible_notifications = cJSON_GetObjectItemCaseSensitive(subscriptionsJSON, "audible_notifications");
    if (audible_notifications) { 
    if(!cJSON_IsBool(audible_notifications))
    {
    goto end; //Bool
    }
    }

    // subscriptions->pin_to_top
    cJSON *pin_to_top = cJSON_GetObjectItemCaseSensitive(subscriptionsJSON, "pin_to_top");
    if (pin_to_top) { 
    if(!cJSON_IsBool(pin_to_top))
    {
    goto end; //Bool
    }
    }

    // subscriptions->email_address
    cJSON *email_address = cJSON_GetObjectItemCaseSensitive(subscriptionsJSON, "email_address");
    if (email_address) { 
    if(!cJSON_IsString(email_address))
    {
    goto end; //String
    }
    }

    // subscriptions->is_muted
    cJSON *is_muted = cJSON_GetObjectItemCaseSensitive(subscriptionsJSON, "is_muted");
    if (is_muted) { 
    if(!cJSON_IsBool(is_muted))
    {
    goto end; //Bool
    }
    }

    // subscriptions->in_home_view
    cJSON *in_home_view = cJSON_GetObjectItemCaseSensitive(subscriptionsJSON, "in_home_view");
    if (in_home_view) { 
    if(!cJSON_IsBool(in_home_view))
    {
    goto end; //Bool
    }
    }

    // subscriptions->is_announcement_only
    cJSON *is_announcement_only = cJSON_GetObjectItemCaseSensitive(subscriptionsJSON, "is_announcement_only");
    if (is_announcement_only) { 
    if(!cJSON_IsBool(is_announcement_only))
    {
    goto end; //Bool
    }
    }

    // subscriptions->is_web_public
    cJSON *is_web_public = cJSON_GetObjectItemCaseSensitive(subscriptionsJSON, "is_web_public");
    if (is_web_public) { 
    if(!cJSON_IsBool(is_web_public))
    {
    goto end; //Bool
    }
    }

    // subscriptions->role
    cJSON *role = cJSON_GetObjectItemCaseSensitive(subscriptionsJSON, "role");
    if (role) { 
    if(!cJSON_IsNumber(role))
    {
    goto end; //Numeric
    }
    }

    // subscriptions->color
    cJSON *color = cJSON_GetObjectItemCaseSensitive(subscriptionsJSON, "color");
    if (color) { 
    if(!cJSON_IsString(color))
    {
    goto end; //String
    }
    }

    // subscriptions->stream_post_policy
    cJSON *stream_post_policy = cJSON_GetObjectItemCaseSensitive(subscriptionsJSON, "stream_post_policy");
    if (stream_post_policy) { 
    if(!cJSON_IsNumber(stream_post_policy))
    {
    goto end; //Numeric
    }
    }

    // subscriptions->message_retention_days
    cJSON *message_retention_days = cJSON_GetObjectItemCaseSensitive(subscriptionsJSON, "message_retention_days");
    if (message_retention_days) { 
    if(!cJSON_IsNumber(message_retention_days))
    {
    goto end; //Numeric
    }
    }

    // subscriptions->history_public_to_subscribers
    cJSON *history_public_to_subscribers = cJSON_GetObjectItemCaseSensitive(subscriptionsJSON, "history_public_to_subscribers");
    if (history_public_to_subscribers) { 
    if(!cJSON_IsBool(history_public_to_subscribers))
    {
    goto end; //Bool
    }
    }

    // subscriptions->first_message_id
    cJSON *first_message_id = cJSON_GetObjectItemCaseSensitive(subscriptionsJSON, "first_message_id");
    if (first_message_id) { 
    if(!cJSON_IsNumber(first_message_id))
    {
    goto end; //Numeric
    }
    }

    // subscriptions->stream_weekly_traffic
    cJSON *stream_weekly_traffic = cJSON_GetObjectItemCaseSensitive(subscriptionsJSON, "stream_weekly_traffic");
    if (stream_weekly_traffic) { 
    if(!cJSON_IsNumber(stream_weekly_traffic))
    {
    goto end; //Numeric
    }
    }


    subscriptions_local_var = subscriptions_create (
        stream_id ? stream_id->valuedouble : 0,
        name ? strdup(name->valuestring) : NULL,
        description ? strdup(description->valuestring) : NULL,
        rendered_description ? strdup(rendered_description->valuestring) : NULL,
        date_created ? date_created->valuedouble : 0,
        invite_only ? invite_only->valueint : 0,
        subscribers ? subscribersList : NULL,
        desktop_notifications ? desktop_notifications->valueint : 0,
        email_notifications ? email_notifications->valueint : 0,
        wildcard_mentions_notify ? wildcard_mentions_notify->valueint : 0,
        push_notifications ? push_notifications->valueint : 0,
        audible_notifications ? audible_notifications->valueint : 0,
        pin_to_top ? pin_to_top->valueint : 0,
        email_address ? strdup(email_address->valuestring) : NULL,
        is_muted ? is_muted->valueint : 0,
        in_home_view ? in_home_view->valueint : 0,
        is_announcement_only ? is_announcement_only->valueint : 0,
        is_web_public ? is_web_public->valueint : 0,
        role ? role->valuedouble : 0,
        color ? strdup(color->valuestring) : NULL,
        stream_post_policy ? stream_post_policy->valuedouble : 0,
        message_retention_days ? message_retention_days->valuedouble : 0,
        history_public_to_subscribers ? history_public_to_subscribers->valueint : 0,
        first_message_id ? first_message_id->valuedouble : 0,
        stream_weekly_traffic ? stream_weekly_traffic->valuedouble : 0
        );

    return subscriptions_local_var;
end:
    return NULL;

}
