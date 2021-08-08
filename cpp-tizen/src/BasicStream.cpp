#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BasicStream.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BasicStream::BasicStream()
{
	//__init();
}

BasicStream::~BasicStream()
{
	//__cleanup();
}

void
BasicStream::__init()
{
	//stream_id = null;
	//name = null;
	//description = null;
	//date_created = null;
	//invite_only = null;
	//rendered_description = null;
	//is_web_public = null;
	//stream_post_policy = null;
	//message_retention_days = null;
	//history_public_to_subscribers = null;
	//first_message_id = null;
	//is_announcement_only = null;
}

void
BasicStream::__cleanup()
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
BasicStream::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *stream_idKey = "stream_id";
	node = json_object_get_member(pJsonObject, stream_idKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&stream_id, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&stream_id);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&name, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&name);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&description, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&description);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *date_createdKey = "date_created";
	node = json_object_get_member(pJsonObject, date_createdKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&date_created, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&date_created);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *invite_onlyKey = "invite_only";
	node = json_object_get_member(pJsonObject, invite_onlyKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&invite_only, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&invite_only);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *rendered_descriptionKey = "rendered_description";
	node = json_object_get_member(pJsonObject, rendered_descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&rendered_description, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&rendered_description);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *is_web_publicKey = "is_web_public";
	node = json_object_get_member(pJsonObject, is_web_publicKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&is_web_public, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&is_web_public);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *stream_post_policyKey = "stream_post_policy";
	node = json_object_get_member(pJsonObject, stream_post_policyKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&stream_post_policy, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&stream_post_policy);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *message_retention_daysKey = "message_retention_days";
	node = json_object_get_member(pJsonObject, message_retention_daysKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&message_retention_days, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&message_retention_days);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *history_public_to_subscribersKey = "history_public_to_subscribers";
	node = json_object_get_member(pJsonObject, history_public_to_subscribersKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&history_public_to_subscribers, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&history_public_to_subscribers);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *first_message_idKey = "first_message_id";
	node = json_object_get_member(pJsonObject, first_message_idKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&first_message_id, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&first_message_id);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *is_announcement_onlyKey = "is_announcement_only";
	node = json_object_get_member(pJsonObject, is_announcement_onlyKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&is_announcement_only, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&is_announcement_only);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

BasicStream::BasicStream(char* json)
{
	this->fromJson(json);
}

char*
BasicStream::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AnyType")) {
		AnyType obj = getStreamId();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getStreamId());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *stream_idKey = "stream_id";
	json_object_set_member(pJsonObject, stream_idKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getName();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getDescription();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getDescription());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getDateCreated();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getDateCreated());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *date_createdKey = "date_created";
	json_object_set_member(pJsonObject, date_createdKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getInviteOnly();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getInviteOnly());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *invite_onlyKey = "invite_only";
	json_object_set_member(pJsonObject, invite_onlyKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getRenderedDescription();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getRenderedDescription());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *rendered_descriptionKey = "rendered_description";
	json_object_set_member(pJsonObject, rendered_descriptionKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getIsWebPublic();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getIsWebPublic());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *is_web_publicKey = "is_web_public";
	json_object_set_member(pJsonObject, is_web_publicKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getStreamPostPolicy();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getStreamPostPolicy());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *stream_post_policyKey = "stream_post_policy";
	json_object_set_member(pJsonObject, stream_post_policyKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getMessageRetentionDays();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getMessageRetentionDays());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *message_retention_daysKey = "message_retention_days";
	json_object_set_member(pJsonObject, message_retention_daysKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getHistoryPublicToSubscribers();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getHistoryPublicToSubscribers());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *history_public_to_subscribersKey = "history_public_to_subscribers";
	json_object_set_member(pJsonObject, history_public_to_subscribersKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getFirstMessageId();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getFirstMessageId());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *first_message_idKey = "first_message_id";
	json_object_set_member(pJsonObject, first_message_idKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getIsAnnouncementOnly();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getIsAnnouncementOnly());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
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

AnyType
BasicStream::getStreamId()
{
	return stream_id;
}

void
BasicStream::setStreamId(AnyType  stream_id)
{
	this->stream_id = stream_id;
}

AnyType
BasicStream::getName()
{
	return name;
}

void
BasicStream::setName(AnyType  name)
{
	this->name = name;
}

AnyType
BasicStream::getDescription()
{
	return description;
}

void
BasicStream::setDescription(AnyType  description)
{
	this->description = description;
}

AnyType
BasicStream::getDateCreated()
{
	return date_created;
}

void
BasicStream::setDateCreated(AnyType  date_created)
{
	this->date_created = date_created;
}

AnyType
BasicStream::getInviteOnly()
{
	return invite_only;
}

void
BasicStream::setInviteOnly(AnyType  invite_only)
{
	this->invite_only = invite_only;
}

AnyType
BasicStream::getRenderedDescription()
{
	return rendered_description;
}

void
BasicStream::setRenderedDescription(AnyType  rendered_description)
{
	this->rendered_description = rendered_description;
}

AnyType
BasicStream::getIsWebPublic()
{
	return is_web_public;
}

void
BasicStream::setIsWebPublic(AnyType  is_web_public)
{
	this->is_web_public = is_web_public;
}

AnyType
BasicStream::getStreamPostPolicy()
{
	return stream_post_policy;
}

void
BasicStream::setStreamPostPolicy(AnyType  stream_post_policy)
{
	this->stream_post_policy = stream_post_policy;
}

AnyType
BasicStream::getMessageRetentionDays()
{
	return message_retention_days;
}

void
BasicStream::setMessageRetentionDays(AnyType  message_retention_days)
{
	this->message_retention_days = message_retention_days;
}

AnyType
BasicStream::getHistoryPublicToSubscribers()
{
	return history_public_to_subscribers;
}

void
BasicStream::setHistoryPublicToSubscribers(AnyType  history_public_to_subscribers)
{
	this->history_public_to_subscribers = history_public_to_subscribers;
}

AnyType
BasicStream::getFirstMessageId()
{
	return first_message_id;
}

void
BasicStream::setFirstMessageId(AnyType  first_message_id)
{
	this->first_message_id = first_message_id;
}

AnyType
BasicStream::getIsAnnouncementOnly()
{
	return is_announcement_only;
}

void
BasicStream::setIsAnnouncementOnly(AnyType  is_announcement_only)
{
	this->is_announcement_only = is_announcement_only;
}


