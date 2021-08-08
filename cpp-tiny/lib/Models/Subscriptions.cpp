

#include "Subscriptions.h"

using namespace Tiny;

Subscriptions::Subscriptions()
{
	stream_id = int(0);
	name = std::string();
	description = std::string();
	rendered_description = std::string();
	date_created = int(0);
	invite_only = bool(false);
	subscribers = std::list<int>();
	desktop_notifications = bool(false);
	email_notifications = bool(false);
	wildcard_mentions_notify = bool(false);
	push_notifications = bool(false);
	audible_notifications = bool(false);
	pin_to_top = bool(false);
	email_address = std::string();
	is_muted = bool(false);
	in_home_view = bool(false);
	is_announcement_only = bool(false);
	is_web_public = bool(false);
	role = int(0);
	color = std::string();
	stream_post_policy = int(0);
	message_retention_days = int(0);
	history_public_to_subscribers = bool(false);
	first_message_id = int(0);
	stream_weekly_traffic = int(0);
}

Subscriptions::Subscriptions(std::string jsonString)
{
	this->fromJson(jsonString);
}

Subscriptions::~Subscriptions()
{

}

void
Subscriptions::fromJson(std::string jsonObj)
{   
    bourne::json object = bourne::json::parse(jsonObj);

    const char *stream_idKey = "stream_id";
    
    if(object.has_key(stream_idKey)) 
    {
        bourne::json value = object[stream_idKey];


        
        jsonToValue(&stream_id, value, "int");


    }

    const char *nameKey = "name";
    
    if(object.has_key(nameKey)) 
    {
        bourne::json value = object[nameKey];


        
        jsonToValue(&name, value, "std::string");


    }

    const char *descriptionKey = "description";
    
    if(object.has_key(descriptionKey)) 
    {
        bourne::json value = object[descriptionKey];


        
        jsonToValue(&description, value, "std::string");


    }

    const char *rendered_descriptionKey = "rendered_description";
    
    if(object.has_key(rendered_descriptionKey)) 
    {
        bourne::json value = object[rendered_descriptionKey];


        
        jsonToValue(&rendered_description, value, "std::string");


    }

    const char *date_createdKey = "date_created";
    
    if(object.has_key(date_createdKey)) 
    {
        bourne::json value = object[date_createdKey];


        
        jsonToValue(&date_created, value, "int");


    }

    const char *invite_onlyKey = "invite_only";
    
    if(object.has_key(invite_onlyKey)) 
    {
        bourne::json value = object[invite_onlyKey];


        
        jsonToValue(&invite_only, value, "bool");


    }

    const char *subscribersKey = "subscribers";
    
    if(object.has_key(subscribersKey)) 
    {
        bourne::json value = object[subscribersKey];


        std::list<int> subscribers_list;
        int element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "int");
            
            
            subscribers_list.push_back(element);
        }
        subscribers = subscribers_list;


    }

    const char *desktop_notificationsKey = "desktop_notifications";
    
    if(object.has_key(desktop_notificationsKey)) 
    {
        bourne::json value = object[desktop_notificationsKey];


        
        jsonToValue(&desktop_notifications, value, "bool");


    }

    const char *email_notificationsKey = "email_notifications";
    
    if(object.has_key(email_notificationsKey)) 
    {
        bourne::json value = object[email_notificationsKey];


        
        jsonToValue(&email_notifications, value, "bool");


    }

    const char *wildcard_mentions_notifyKey = "wildcard_mentions_notify";
    
    if(object.has_key(wildcard_mentions_notifyKey)) 
    {
        bourne::json value = object[wildcard_mentions_notifyKey];


        
        jsonToValue(&wildcard_mentions_notify, value, "bool");


    }

    const char *push_notificationsKey = "push_notifications";
    
    if(object.has_key(push_notificationsKey)) 
    {
        bourne::json value = object[push_notificationsKey];


        
        jsonToValue(&push_notifications, value, "bool");


    }

    const char *audible_notificationsKey = "audible_notifications";
    
    if(object.has_key(audible_notificationsKey)) 
    {
        bourne::json value = object[audible_notificationsKey];


        
        jsonToValue(&audible_notifications, value, "bool");


    }

    const char *pin_to_topKey = "pin_to_top";
    
    if(object.has_key(pin_to_topKey)) 
    {
        bourne::json value = object[pin_to_topKey];


        
        jsonToValue(&pin_to_top, value, "bool");


    }

    const char *email_addressKey = "email_address";
    
    if(object.has_key(email_addressKey)) 
    {
        bourne::json value = object[email_addressKey];


        
        jsonToValue(&email_address, value, "std::string");


    }

    const char *is_mutedKey = "is_muted";
    
    if(object.has_key(is_mutedKey)) 
    {
        bourne::json value = object[is_mutedKey];


        
        jsonToValue(&is_muted, value, "bool");


    }

    const char *in_home_viewKey = "in_home_view";
    
    if(object.has_key(in_home_viewKey)) 
    {
        bourne::json value = object[in_home_viewKey];


        
        jsonToValue(&in_home_view, value, "bool");


    }

    const char *is_announcement_onlyKey = "is_announcement_only";
    
    if(object.has_key(is_announcement_onlyKey)) 
    {
        bourne::json value = object[is_announcement_onlyKey];


        
        jsonToValue(&is_announcement_only, value, "bool");


    }

    const char *is_web_publicKey = "is_web_public";
    
    if(object.has_key(is_web_publicKey)) 
    {
        bourne::json value = object[is_web_publicKey];


        
        jsonToValue(&is_web_public, value, "bool");


    }

    const char *roleKey = "role";
    
    if(object.has_key(roleKey)) 
    {
        bourne::json value = object[roleKey];


        
        jsonToValue(&role, value, "int");


    }

    const char *colorKey = "color";
    
    if(object.has_key(colorKey)) 
    {
        bourne::json value = object[colorKey];


        
        jsonToValue(&color, value, "std::string");


    }

    const char *stream_post_policyKey = "stream_post_policy";
    
    if(object.has_key(stream_post_policyKey)) 
    {
        bourne::json value = object[stream_post_policyKey];


        
        jsonToValue(&stream_post_policy, value, "int");


    }

    const char *message_retention_daysKey = "message_retention_days";
    
    if(object.has_key(message_retention_daysKey)) 
    {
        bourne::json value = object[message_retention_daysKey];


        
        jsonToValue(&message_retention_days, value, "int");


    }

    const char *history_public_to_subscribersKey = "history_public_to_subscribers";
    
    if(object.has_key(history_public_to_subscribersKey)) 
    {
        bourne::json value = object[history_public_to_subscribersKey];


        
        jsonToValue(&history_public_to_subscribers, value, "bool");


    }

    const char *first_message_idKey = "first_message_id";
    
    if(object.has_key(first_message_idKey)) 
    {
        bourne::json value = object[first_message_idKey];


        
        jsonToValue(&first_message_id, value, "int");


    }

    const char *stream_weekly_trafficKey = "stream_weekly_traffic";
    
    if(object.has_key(stream_weekly_trafficKey)) 
    {
        bourne::json value = object[stream_weekly_trafficKey];


        
        jsonToValue(&stream_weekly_traffic, value, "int");


    }


}

bourne::json
Subscriptions::toJson()
{
    bourne::json object = bourne::json::object();

    



    object["stream_id"] = getStreamId();


    



    object["name"] = getName();


    



    object["description"] = getDescription();


    



    object["rendered_description"] = getRenderedDescription();


    



    object["date_created"] = getDateCreated();


    



    object["invite_only"] = isInviteOnly();


    
    
    
    std::list<int> subscribers_list = getSubscribers();
    bourne::json subscribers_arr = bourne::json::array();

    for(auto& var : subscribers_list)
    {
        subscribers_arr.append(var);
    }
    object["subscribers"] = subscribers_arr;

    



    



    object["desktop_notifications"] = isDesktopNotifications();


    



    object["email_notifications"] = isEmailNotifications();


    



    object["wildcard_mentions_notify"] = isWildcardMentionsNotify();


    



    object["push_notifications"] = isPushNotifications();


    



    object["audible_notifications"] = isAudibleNotifications();


    



    object["pin_to_top"] = isPinToTop();


    



    object["email_address"] = getEmailAddress();


    



    object["is_muted"] = isIsMuted();


    



    object["in_home_view"] = isInHomeView();


    



    object["is_announcement_only"] = isIsAnnouncementOnly();


    



    object["is_web_public"] = isIsWebPublic();


    



    object["role"] = getRole();


    



    object["color"] = getColor();


    



    object["stream_post_policy"] = getStreamPostPolicy();


    



    object["message_retention_days"] = getMessageRetentionDays();


    



    object["history_public_to_subscribers"] = isHistoryPublicToSubscribers();


    



    object["first_message_id"] = getFirstMessageId();


    



    object["stream_weekly_traffic"] = getStreamWeeklyTraffic();



    return object;

}

int
Subscriptions::getStreamId()
{
	return stream_id;
}

void
Subscriptions::setStreamId(int  stream_id)
{
	this->stream_id = stream_id;
}

std::string
Subscriptions::getName()
{
	return name;
}

void
Subscriptions::setName(std::string  name)
{
	this->name = name;
}

std::string
Subscriptions::getDescription()
{
	return description;
}

void
Subscriptions::setDescription(std::string  description)
{
	this->description = description;
}

std::string
Subscriptions::getRenderedDescription()
{
	return rendered_description;
}

void
Subscriptions::setRenderedDescription(std::string  rendered_description)
{
	this->rendered_description = rendered_description;
}

int
Subscriptions::getDateCreated()
{
	return date_created;
}

void
Subscriptions::setDateCreated(int  date_created)
{
	this->date_created = date_created;
}

bool
Subscriptions::isInviteOnly()
{
	return invite_only;
}

void
Subscriptions::setInviteOnly(bool  invite_only)
{
	this->invite_only = invite_only;
}

std::list<int>
Subscriptions::getSubscribers()
{
	return subscribers;
}

void
Subscriptions::setSubscribers(std::list <int> subscribers)
{
	this->subscribers = subscribers;
}

bool
Subscriptions::isDesktopNotifications()
{
	return desktop_notifications;
}

void
Subscriptions::setDesktopNotifications(bool  desktop_notifications)
{
	this->desktop_notifications = desktop_notifications;
}

bool
Subscriptions::isEmailNotifications()
{
	return email_notifications;
}

void
Subscriptions::setEmailNotifications(bool  email_notifications)
{
	this->email_notifications = email_notifications;
}

bool
Subscriptions::isWildcardMentionsNotify()
{
	return wildcard_mentions_notify;
}

void
Subscriptions::setWildcardMentionsNotify(bool  wildcard_mentions_notify)
{
	this->wildcard_mentions_notify = wildcard_mentions_notify;
}

bool
Subscriptions::isPushNotifications()
{
	return push_notifications;
}

void
Subscriptions::setPushNotifications(bool  push_notifications)
{
	this->push_notifications = push_notifications;
}

bool
Subscriptions::isAudibleNotifications()
{
	return audible_notifications;
}

void
Subscriptions::setAudibleNotifications(bool  audible_notifications)
{
	this->audible_notifications = audible_notifications;
}

bool
Subscriptions::isPinToTop()
{
	return pin_to_top;
}

void
Subscriptions::setPinToTop(bool  pin_to_top)
{
	this->pin_to_top = pin_to_top;
}

std::string
Subscriptions::getEmailAddress()
{
	return email_address;
}

void
Subscriptions::setEmailAddress(std::string  email_address)
{
	this->email_address = email_address;
}

bool
Subscriptions::isIsMuted()
{
	return is_muted;
}

void
Subscriptions::setIsMuted(bool  is_muted)
{
	this->is_muted = is_muted;
}

bool
Subscriptions::isInHomeView()
{
	return in_home_view;
}

void
Subscriptions::setInHomeView(bool  in_home_view)
{
	this->in_home_view = in_home_view;
}

bool
Subscriptions::isIsAnnouncementOnly()
{
	return is_announcement_only;
}

void
Subscriptions::setIsAnnouncementOnly(bool  is_announcement_only)
{
	this->is_announcement_only = is_announcement_only;
}

bool
Subscriptions::isIsWebPublic()
{
	return is_web_public;
}

void
Subscriptions::setIsWebPublic(bool  is_web_public)
{
	this->is_web_public = is_web_public;
}

int
Subscriptions::getRole()
{
	return role;
}

void
Subscriptions::setRole(int  role)
{
	this->role = role;
}

std::string
Subscriptions::getColor()
{
	return color;
}

void
Subscriptions::setColor(std::string  color)
{
	this->color = color;
}

int
Subscriptions::getStreamPostPolicy()
{
	return stream_post_policy;
}

void
Subscriptions::setStreamPostPolicy(int  stream_post_policy)
{
	this->stream_post_policy = stream_post_policy;
}

int
Subscriptions::getMessageRetentionDays()
{
	return message_retention_days;
}

void
Subscriptions::setMessageRetentionDays(int  message_retention_days)
{
	this->message_retention_days = message_retention_days;
}

bool
Subscriptions::isHistoryPublicToSubscribers()
{
	return history_public_to_subscribers;
}

void
Subscriptions::setHistoryPublicToSubscribers(bool  history_public_to_subscribers)
{
	this->history_public_to_subscribers = history_public_to_subscribers;
}

int
Subscriptions::getFirstMessageId()
{
	return first_message_id;
}

void
Subscriptions::setFirstMessageId(int  first_message_id)
{
	this->first_message_id = first_message_id;
}

int
Subscriptions::getStreamWeeklyTraffic()
{
	return stream_weekly_traffic;
}

void
Subscriptions::setStreamWeeklyTraffic(int  stream_weekly_traffic)
{
	this->stream_weekly_traffic = stream_weekly_traffic;
}



