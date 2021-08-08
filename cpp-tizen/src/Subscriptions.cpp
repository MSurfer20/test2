#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Subscriptions.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Subscriptions::Subscriptions()
{
	//__init();
}

Subscriptions::~Subscriptions()
{
	//__cleanup();
}

void
Subscriptions::__init()
{
	//stream_id = int(0);
	//name = std::string();
	//description = std::string();
	//rendered_description = std::string();
	//date_created = int(0);
	//invite_only = bool(false);
	//new std::list()std::list> subscribers;
	//desktop_notifications = bool(false);
	//email_notifications = bool(false);
	//wildcard_mentions_notify = bool(false);
	//push_notifications = bool(false);
	//audible_notifications = bool(false);
	//pin_to_top = bool(false);
	//email_address = std::string();
	//is_muted = bool(false);
	//in_home_view = bool(false);
	//is_announcement_only = bool(false);
	//is_web_public = bool(false);
	//role = int(0);
	//color = std::string();
	//stream_post_policy = int(0);
	//message_retention_days = int(0);
	//history_public_to_subscribers = bool(false);
	//first_message_id = int(0);
	//stream_weekly_traffic = int(0);
}

void
Subscriptions::__cleanup()
{
	//if(stream_id != NULL) {
	//
	//delete stream_id;
	//stream_id = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(rendered_description != NULL) {
	//
	//delete rendered_description;
	//rendered_description = NULL;
	//}
	//if(date_created != NULL) {
	//
	//delete date_created;
	//date_created = NULL;
	//}
	//if(invite_only != NULL) {
	//
	//delete invite_only;
	//invite_only = NULL;
	//}
	//if(subscribers != NULL) {
	//subscribers.RemoveAll(true);
	//delete subscribers;
	//subscribers = NULL;
	//}
	//if(desktop_notifications != NULL) {
	//
	//delete desktop_notifications;
	//desktop_notifications = NULL;
	//}
	//if(email_notifications != NULL) {
	//
	//delete email_notifications;
	//email_notifications = NULL;
	//}
	//if(wildcard_mentions_notify != NULL) {
	//
	//delete wildcard_mentions_notify;
	//wildcard_mentions_notify = NULL;
	//}
	//if(push_notifications != NULL) {
	//
	//delete push_notifications;
	//push_notifications = NULL;
	//}
	//if(audible_notifications != NULL) {
	//
	//delete audible_notifications;
	//audible_notifications = NULL;
	//}
	//if(pin_to_top != NULL) {
	//
	//delete pin_to_top;
	//pin_to_top = NULL;
	//}
	//if(email_address != NULL) {
	//
	//delete email_address;
	//email_address = NULL;
	//}
	//if(is_muted != NULL) {
	//
	//delete is_muted;
	//is_muted = NULL;
	//}
	//if(in_home_view != NULL) {
	//
	//delete in_home_view;
	//in_home_view = NULL;
	//}
	//if(is_announcement_only != NULL) {
	//
	//delete is_announcement_only;
	//is_announcement_only = NULL;
	//}
	//if(is_web_public != NULL) {
	//
	//delete is_web_public;
	//is_web_public = NULL;
	//}
	//if(role != NULL) {
	//
	//delete role;
	//role = NULL;
	//}
	//if(color != NULL) {
	//
	//delete color;
	//color = NULL;
	//}
	//if(stream_post_policy != NULL) {
	//
	//delete stream_post_policy;
	//stream_post_policy = NULL;
	//}
	//if(message_retention_days != NULL) {
	//
	//delete message_retention_days;
	//message_retention_days = NULL;
	//}
	//if(history_public_to_subscribers != NULL) {
	//
	//delete history_public_to_subscribers;
	//history_public_to_subscribers = NULL;
	//}
	//if(first_message_id != NULL) {
	//
	//delete first_message_id;
	//first_message_id = NULL;
	//}
	//if(stream_weekly_traffic != NULL) {
	//
	//delete stream_weekly_traffic;
	//stream_weekly_traffic = NULL;
	//}
	//
}

void
Subscriptions::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *stream_idKey = "stream_id";
	node = json_object_get_member(pJsonObject, stream_idKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&stream_id, node, "int", "");
		} else {
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *rendered_descriptionKey = "rendered_description";
	node = json_object_get_member(pJsonObject, rendered_descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&rendered_description, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *date_createdKey = "date_created";
	node = json_object_get_member(pJsonObject, date_createdKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&date_created, node, "int", "");
		} else {
			
		}
	}
	const gchar *invite_onlyKey = "invite_only";
	node = json_object_get_member(pJsonObject, invite_onlyKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&invite_only, node, "bool", "");
		} else {
			
		}
	}
	const gchar *subscribersKey = "subscribers";
	node = json_object_get_member(pJsonObject, subscribersKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<int> new_list;
			int inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("int")) {
					jsonToValue(&inst, temp_json, "int", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			subscribers = new_list;
		}
		
	}
	const gchar *desktop_notificationsKey = "desktop_notifications";
	node = json_object_get_member(pJsonObject, desktop_notificationsKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&desktop_notifications, node, "bool", "");
		} else {
			
		}
	}
	const gchar *email_notificationsKey = "email_notifications";
	node = json_object_get_member(pJsonObject, email_notificationsKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&email_notifications, node, "bool", "");
		} else {
			
		}
	}
	const gchar *wildcard_mentions_notifyKey = "wildcard_mentions_notify";
	node = json_object_get_member(pJsonObject, wildcard_mentions_notifyKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&wildcard_mentions_notify, node, "bool", "");
		} else {
			
		}
	}
	const gchar *push_notificationsKey = "push_notifications";
	node = json_object_get_member(pJsonObject, push_notificationsKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&push_notifications, node, "bool", "");
		} else {
			
		}
	}
	const gchar *audible_notificationsKey = "audible_notifications";
	node = json_object_get_member(pJsonObject, audible_notificationsKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&audible_notifications, node, "bool", "");
		} else {
			
		}
	}
	const gchar *pin_to_topKey = "pin_to_top";
	node = json_object_get_member(pJsonObject, pin_to_topKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&pin_to_top, node, "bool", "");
		} else {
			
		}
	}
	const gchar *email_addressKey = "email_address";
	node = json_object_get_member(pJsonObject, email_addressKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&email_address, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *is_mutedKey = "is_muted";
	node = json_object_get_member(pJsonObject, is_mutedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_muted, node, "bool", "");
		} else {
			
		}
	}
	const gchar *in_home_viewKey = "in_home_view";
	node = json_object_get_member(pJsonObject, in_home_viewKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&in_home_view, node, "bool", "");
		} else {
			
		}
	}
	const gchar *is_announcement_onlyKey = "is_announcement_only";
	node = json_object_get_member(pJsonObject, is_announcement_onlyKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_announcement_only, node, "bool", "");
		} else {
			
		}
	}
	const gchar *is_web_publicKey = "is_web_public";
	node = json_object_get_member(pJsonObject, is_web_publicKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_web_public, node, "bool", "");
		} else {
			
		}
	}
	const gchar *roleKey = "role";
	node = json_object_get_member(pJsonObject, roleKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&role, node, "int", "");
		} else {
			
		}
	}
	const gchar *colorKey = "color";
	node = json_object_get_member(pJsonObject, colorKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&color, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *stream_post_policyKey = "stream_post_policy";
	node = json_object_get_member(pJsonObject, stream_post_policyKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&stream_post_policy, node, "int", "");
		} else {
			
		}
	}
	const gchar *message_retention_daysKey = "message_retention_days";
	node = json_object_get_member(pJsonObject, message_retention_daysKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&message_retention_days, node, "int", "");
		} else {
			
		}
	}
	const gchar *history_public_to_subscribersKey = "history_public_to_subscribers";
	node = json_object_get_member(pJsonObject, history_public_to_subscribersKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&history_public_to_subscribers, node, "bool", "");
		} else {
			
		}
	}
	const gchar *first_message_idKey = "first_message_id";
	node = json_object_get_member(pJsonObject, first_message_idKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&first_message_id, node, "int", "");
		} else {
			
		}
	}
	const gchar *stream_weekly_trafficKey = "stream_weekly_traffic";
	node = json_object_get_member(pJsonObject, stream_weekly_trafficKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&stream_weekly_traffic, node, "int", "");
		} else {
			
		}
	}
}

Subscriptions::Subscriptions(char* json)
{
	this->fromJson(json);
}

char*
Subscriptions::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getStreamId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *stream_idKey = "stream_id";
	json_object_set_member(pJsonObject, stream_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRenderedDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *rendered_descriptionKey = "rendered_description";
	json_object_set_member(pJsonObject, rendered_descriptionKey, node);
	if (isprimitive("int")) {
		int obj = getDateCreated();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *date_createdKey = "date_created";
	json_object_set_member(pJsonObject, date_createdKey, node);
	if (isprimitive("bool")) {
		bool obj = getInviteOnly();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *invite_onlyKey = "invite_only";
	json_object_set_member(pJsonObject, invite_onlyKey, node);
	if (isprimitive("int")) {
		list<int> new_list = static_cast<list <int> > (getSubscribers());
		node = converttoJson(&new_list, "int", "array");
	} else {
		node = json_node_alloc();
		list<int> new_list = static_cast<list <int> > (getSubscribers());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *subscribersKey = "subscribers";
	json_object_set_member(pJsonObject, subscribersKey, node);
	if (isprimitive("bool")) {
		bool obj = getDesktopNotifications();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *desktop_notificationsKey = "desktop_notifications";
	json_object_set_member(pJsonObject, desktop_notificationsKey, node);
	if (isprimitive("bool")) {
		bool obj = getEmailNotifications();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *email_notificationsKey = "email_notifications";
	json_object_set_member(pJsonObject, email_notificationsKey, node);
	if (isprimitive("bool")) {
		bool obj = getWildcardMentionsNotify();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *wildcard_mentions_notifyKey = "wildcard_mentions_notify";
	json_object_set_member(pJsonObject, wildcard_mentions_notifyKey, node);
	if (isprimitive("bool")) {
		bool obj = getPushNotifications();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *push_notificationsKey = "push_notifications";
	json_object_set_member(pJsonObject, push_notificationsKey, node);
	if (isprimitive("bool")) {
		bool obj = getAudibleNotifications();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *audible_notificationsKey = "audible_notifications";
	json_object_set_member(pJsonObject, audible_notificationsKey, node);
	if (isprimitive("bool")) {
		bool obj = getPinToTop();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *pin_to_topKey = "pin_to_top";
	json_object_set_member(pJsonObject, pin_to_topKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEmailAddress();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *email_addressKey = "email_address";
	json_object_set_member(pJsonObject, email_addressKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsMuted();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_mutedKey = "is_muted";
	json_object_set_member(pJsonObject, is_mutedKey, node);
	if (isprimitive("bool")) {
		bool obj = getInHomeView();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *in_home_viewKey = "in_home_view";
	json_object_set_member(pJsonObject, in_home_viewKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsAnnouncementOnly();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_announcement_onlyKey = "is_announcement_only";
	json_object_set_member(pJsonObject, is_announcement_onlyKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsWebPublic();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_web_publicKey = "is_web_public";
	json_object_set_member(pJsonObject, is_web_publicKey, node);
	if (isprimitive("int")) {
		int obj = getRole();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *roleKey = "role";
	json_object_set_member(pJsonObject, roleKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getColor();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *colorKey = "color";
	json_object_set_member(pJsonObject, colorKey, node);
	if (isprimitive("int")) {
		int obj = getStreamPostPolicy();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *stream_post_policyKey = "stream_post_policy";
	json_object_set_member(pJsonObject, stream_post_policyKey, node);
	if (isprimitive("int")) {
		int obj = getMessageRetentionDays();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *message_retention_daysKey = "message_retention_days";
	json_object_set_member(pJsonObject, message_retention_daysKey, node);
	if (isprimitive("bool")) {
		bool obj = getHistoryPublicToSubscribers();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *history_public_to_subscribersKey = "history_public_to_subscribers";
	json_object_set_member(pJsonObject, history_public_to_subscribersKey, node);
	if (isprimitive("int")) {
		int obj = getFirstMessageId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *first_message_idKey = "first_message_id";
	json_object_set_member(pJsonObject, first_message_idKey, node);
	if (isprimitive("int")) {
		int obj = getStreamWeeklyTraffic();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *stream_weekly_trafficKey = "stream_weekly_traffic";
	json_object_set_member(pJsonObject, stream_weekly_trafficKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
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
Subscriptions::getInviteOnly()
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
Subscriptions::getDesktopNotifications()
{
	return desktop_notifications;
}

void
Subscriptions::setDesktopNotifications(bool  desktop_notifications)
{
	this->desktop_notifications = desktop_notifications;
}

bool
Subscriptions::getEmailNotifications()
{
	return email_notifications;
}

void
Subscriptions::setEmailNotifications(bool  email_notifications)
{
	this->email_notifications = email_notifications;
}

bool
Subscriptions::getWildcardMentionsNotify()
{
	return wildcard_mentions_notify;
}

void
Subscriptions::setWildcardMentionsNotify(bool  wildcard_mentions_notify)
{
	this->wildcard_mentions_notify = wildcard_mentions_notify;
}

bool
Subscriptions::getPushNotifications()
{
	return push_notifications;
}

void
Subscriptions::setPushNotifications(bool  push_notifications)
{
	this->push_notifications = push_notifications;
}

bool
Subscriptions::getAudibleNotifications()
{
	return audible_notifications;
}

void
Subscriptions::setAudibleNotifications(bool  audible_notifications)
{
	this->audible_notifications = audible_notifications;
}

bool
Subscriptions::getPinToTop()
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
Subscriptions::getIsMuted()
{
	return is_muted;
}

void
Subscriptions::setIsMuted(bool  is_muted)
{
	this->is_muted = is_muted;
}

bool
Subscriptions::getInHomeView()
{
	return in_home_view;
}

void
Subscriptions::setInHomeView(bool  in_home_view)
{
	this->in_home_view = in_home_view;
}

bool
Subscriptions::getIsAnnouncementOnly()
{
	return is_announcement_only;
}

void
Subscriptions::setIsAnnouncementOnly(bool  is_announcement_only)
{
	this->is_announcement_only = is_announcement_only;
}

bool
Subscriptions::getIsWebPublic()
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
Subscriptions::getHistoryPublicToSubscribers()
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


