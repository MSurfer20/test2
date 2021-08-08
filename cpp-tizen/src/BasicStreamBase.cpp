#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BasicStreamBase.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BasicStreamBase::BasicStreamBase()
{
	//__init();
}

BasicStreamBase::~BasicStreamBase()
{
	//__cleanup();
}

void
BasicStreamBase::__init()
{
	//stream_id = int(0);
	//name = std::string();
	//description = std::string();
	//date_created = int(0);
	//invite_only = bool(false);
	//rendered_description = std::string();
	//is_web_public = bool(false);
	//stream_post_policy = int(0);
	//message_retention_days = int(0);
	//history_public_to_subscribers = bool(false);
	//first_message_id = int(0);
	//is_announcement_only = bool(false);
}

void
BasicStreamBase::__cleanup()
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
	//if(rendered_description != NULL) {
	//
	//delete rendered_description;
	//rendered_description = NULL;
	//}
	//if(is_web_public != NULL) {
	//
	//delete is_web_public;
	//is_web_public = NULL;
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
	//if(is_announcement_only != NULL) {
	//
	//delete is_announcement_only;
	//is_announcement_only = NULL;
	//}
	//
}

void
BasicStreamBase::fromJson(char* jsonStr)
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
	const gchar *rendered_descriptionKey = "rendered_description";
	node = json_object_get_member(pJsonObject, rendered_descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&rendered_description, node, "std::string", "");
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
	const gchar *is_announcement_onlyKey = "is_announcement_only";
	node = json_object_get_member(pJsonObject, is_announcement_onlyKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_announcement_only, node, "bool", "");
		} else {
			
		}
	}
}

BasicStreamBase::BasicStreamBase(char* json)
{
	this->fromJson(json);
}

char*
BasicStreamBase::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getRenderedDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *rendered_descriptionKey = "rendered_description";
	json_object_set_member(pJsonObject, rendered_descriptionKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsWebPublic();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_web_publicKey = "is_web_public";
	json_object_set_member(pJsonObject, is_web_publicKey, node);
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
	if (isprimitive("bool")) {
		bool obj = getIsAnnouncementOnly();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_announcement_onlyKey = "is_announcement_only";
	json_object_set_member(pJsonObject, is_announcement_onlyKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
BasicStreamBase::getStreamId()
{
	return stream_id;
}

void
BasicStreamBase::setStreamId(int  stream_id)
{
	this->stream_id = stream_id;
}

std::string
BasicStreamBase::getName()
{
	return name;
}

void
BasicStreamBase::setName(std::string  name)
{
	this->name = name;
}

std::string
BasicStreamBase::getDescription()
{
	return description;
}

void
BasicStreamBase::setDescription(std::string  description)
{
	this->description = description;
}

int
BasicStreamBase::getDateCreated()
{
	return date_created;
}

void
BasicStreamBase::setDateCreated(int  date_created)
{
	this->date_created = date_created;
}

bool
BasicStreamBase::getInviteOnly()
{
	return invite_only;
}

void
BasicStreamBase::setInviteOnly(bool  invite_only)
{
	this->invite_only = invite_only;
}

std::string
BasicStreamBase::getRenderedDescription()
{
	return rendered_description;
}

void
BasicStreamBase::setRenderedDescription(std::string  rendered_description)
{
	this->rendered_description = rendered_description;
}

bool
BasicStreamBase::getIsWebPublic()
{
	return is_web_public;
}

void
BasicStreamBase::setIsWebPublic(bool  is_web_public)
{
	this->is_web_public = is_web_public;
}

int
BasicStreamBase::getStreamPostPolicy()
{
	return stream_post_policy;
}

void
BasicStreamBase::setStreamPostPolicy(int  stream_post_policy)
{
	this->stream_post_policy = stream_post_policy;
}

int
BasicStreamBase::getMessageRetentionDays()
{
	return message_retention_days;
}

void
BasicStreamBase::setMessageRetentionDays(int  message_retention_days)
{
	this->message_retention_days = message_retention_days;
}

bool
BasicStreamBase::getHistoryPublicToSubscribers()
{
	return history_public_to_subscribers;
}

void
BasicStreamBase::setHistoryPublicToSubscribers(bool  history_public_to_subscribers)
{
	this->history_public_to_subscribers = history_public_to_subscribers;
}

int
BasicStreamBase::getFirstMessageId()
{
	return first_message_id;
}

void
BasicStreamBase::setFirstMessageId(int  first_message_id)
{
	this->first_message_id = first_message_id;
}

bool
BasicStreamBase::getIsAnnouncementOnly()
{
	return is_announcement_only;
}

void
BasicStreamBase::setIsAnnouncementOnly(bool  is_announcement_only)
{
	this->is_announcement_only = is_announcement_only;
}


