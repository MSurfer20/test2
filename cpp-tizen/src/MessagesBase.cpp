#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MessagesBase.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MessagesBase::MessagesBase()
{
	//__init();
}

MessagesBase::~MessagesBase()
{
	//__cleanup();
}

void
MessagesBase::__init()
{
	//avatar_url = std::string();
	//client = std::string();
	//content = std::string();
	//content_type = std::string();
	//display_recipient = null;
	//id = int(0);
	//is_me_message = bool(false);
	//new std::list()std::list> reactions;
	//recipient_id = int(0);
	//sender_email = std::string();
	//sender_full_name = std::string();
	//sender_id = int(0);
	//sender_realm_str = std::string();
	//stream_id = int(0);
	//subject = std::string();
	//new std::list()std::list> topic_links;
	//new std::list()std::list> submessages;
	//timestamp = int(0);
	//type = std::string();
}

void
MessagesBase::__cleanup()
{
	//if(avatar_url != NULL) {
	//
	//delete avatar_url;
	//avatar_url = NULL;
	//}
	//if(client != NULL) {
	//
	//delete client;
	//client = NULL;
	//}
	//if(content != NULL) {
	//
	//delete content;
	//content = NULL;
	//}
	//if(content_type != NULL) {
	//
	//delete content_type;
	//content_type = NULL;
	//}
	//if(display_recipient != NULL) {
	//
	//delete display_recipient;
	//display_recipient = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(is_me_message != NULL) {
	//
	//delete is_me_message;
	//is_me_message = NULL;
	//}
	//if(reactions != NULL) {
	//reactions.RemoveAll(true);
	//delete reactions;
	//reactions = NULL;
	//}
	//if(recipient_id != NULL) {
	//
	//delete recipient_id;
	//recipient_id = NULL;
	//}
	//if(sender_email != NULL) {
	//
	//delete sender_email;
	//sender_email = NULL;
	//}
	//if(sender_full_name != NULL) {
	//
	//delete sender_full_name;
	//sender_full_name = NULL;
	//}
	//if(sender_id != NULL) {
	//
	//delete sender_id;
	//sender_id = NULL;
	//}
	//if(sender_realm_str != NULL) {
	//
	//delete sender_realm_str;
	//sender_realm_str = NULL;
	//}
	//if(stream_id != NULL) {
	//
	//delete stream_id;
	//stream_id = NULL;
	//}
	//if(subject != NULL) {
	//
	//delete subject;
	//subject = NULL;
	//}
	//if(topic_links != NULL) {
	//topic_links.RemoveAll(true);
	//delete topic_links;
	//topic_links = NULL;
	//}
	//if(submessages != NULL) {
	//submessages.RemoveAll(true);
	//delete submessages;
	//submessages = NULL;
	//}
	//if(timestamp != NULL) {
	//
	//delete timestamp;
	//timestamp = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//
}

void
MessagesBase::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *avatar_urlKey = "avatar_url";
	node = json_object_get_member(pJsonObject, avatar_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&avatar_url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *clientKey = "client";
	node = json_object_get_member(pJsonObject, clientKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&client, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *contentKey = "content";
	node = json_object_get_member(pJsonObject, contentKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&content, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *content_typeKey = "content_type";
	node = json_object_get_member(pJsonObject, content_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&content_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *display_recipientKey = "display_recipient";
	node = json_object_get_member(pJsonObject, display_recipientKey);
	if (node !=NULL) {
	

		if (isprimitive("OneOf&lt;string,array&gt;")) {
			jsonToValue(&display_recipient, node, "OneOf&lt;string,array&gt;", "OneOf&lt;string,array&gt;");
		} else {
			
			OneOf&lt;string,array&gt;* obj = static_cast<OneOf&lt;string,array&gt;*> (&display_recipient);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&id, node, "int", "");
		} else {
			
		}
	}
	const gchar *is_me_messageKey = "is_me_message";
	node = json_object_get_member(pJsonObject, is_me_messageKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_me_message, node, "bool", "");
		} else {
			
		}
	}
	const gchar *reactionsKey = "reactions";
	node = json_object_get_member(pJsonObject, reactionsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<EmojiReaction> new_list;
			EmojiReaction inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("EmojiReaction")) {
					jsonToValue(&inst, temp_json, "EmojiReaction", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			reactions = new_list;
		}
		
	}
	const gchar *recipient_idKey = "recipient_id";
	node = json_object_get_member(pJsonObject, recipient_idKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&recipient_id, node, "int", "");
		} else {
			
		}
	}
	const gchar *sender_emailKey = "sender_email";
	node = json_object_get_member(pJsonObject, sender_emailKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&sender_email, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *sender_full_nameKey = "sender_full_name";
	node = json_object_get_member(pJsonObject, sender_full_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&sender_full_name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *sender_idKey = "sender_id";
	node = json_object_get_member(pJsonObject, sender_idKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&sender_id, node, "int", "");
		} else {
			
		}
	}
	const gchar *sender_realm_strKey = "sender_realm_str";
	node = json_object_get_member(pJsonObject, sender_realm_strKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&sender_realm_str, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *stream_idKey = "stream_id";
	node = json_object_get_member(pJsonObject, stream_idKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&stream_id, node, "int", "");
		} else {
			
		}
	}
	const gchar *subjectKey = "subject";
	node = json_object_get_member(pJsonObject, subjectKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&subject, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *topic_linksKey = "topic_links";
	node = json_object_get_member(pJsonObject, topic_linksKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<MessagesBase_topic_links> new_list;
			MessagesBase_topic_links inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("MessagesBase_topic_links")) {
					jsonToValue(&inst, temp_json, "MessagesBase_topic_links", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			topic_links = new_list;
		}
		
	}
	const gchar *submessagesKey = "submessages";
	node = json_object_get_member(pJsonObject, submessagesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			submessages = new_list;
		}
		
	}
	const gchar *timestampKey = "timestamp";
	node = json_object_get_member(pJsonObject, timestampKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&timestamp, node, "int", "");
		} else {
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
		} else {
			
		}
	}
}

MessagesBase::MessagesBase(char* json)
{
	this->fromJson(json);
}

char*
MessagesBase::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAvatarUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *avatar_urlKey = "avatar_url";
	json_object_set_member(pJsonObject, avatar_urlKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getClient();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *clientKey = "client";
	json_object_set_member(pJsonObject, clientKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getContent();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *contentKey = "content";
	json_object_set_member(pJsonObject, contentKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getContentType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *content_typeKey = "content_type";
	json_object_set_member(pJsonObject, content_typeKey, node);
	if (isprimitive("OneOf&lt;string,array&gt;")) {
		OneOf&lt;string,array&gt; obj = getDisplayRecipient();
		node = converttoJson(&obj, "OneOf&lt;string,array&gt;", "");
	}
	else {
		
		OneOf&lt;string,array&gt; obj = static_cast<OneOf&lt;string,array&gt;> (getDisplayRecipient());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *display_recipientKey = "display_recipient";
	json_object_set_member(pJsonObject, display_recipientKey, node);
	if (isprimitive("int")) {
		int obj = getId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsMeMessage();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_me_messageKey = "is_me_message";
	json_object_set_member(pJsonObject, is_me_messageKey, node);
	if (isprimitive("EmojiReaction")) {
		list<EmojiReaction> new_list = static_cast<list <EmojiReaction> > (getReactions());
		node = converttoJson(&new_list, "EmojiReaction", "array");
	} else {
		node = json_node_alloc();
		list<EmojiReaction> new_list = static_cast<list <EmojiReaction> > (getReactions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<EmojiReaction>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			EmojiReaction obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *reactionsKey = "reactions";
	json_object_set_member(pJsonObject, reactionsKey, node);
	if (isprimitive("int")) {
		int obj = getRecipientId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *recipient_idKey = "recipient_id";
	json_object_set_member(pJsonObject, recipient_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSenderEmail();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *sender_emailKey = "sender_email";
	json_object_set_member(pJsonObject, sender_emailKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSenderFullName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *sender_full_nameKey = "sender_full_name";
	json_object_set_member(pJsonObject, sender_full_nameKey, node);
	if (isprimitive("int")) {
		int obj = getSenderId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *sender_idKey = "sender_id";
	json_object_set_member(pJsonObject, sender_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSenderRealmStr();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *sender_realm_strKey = "sender_realm_str";
	json_object_set_member(pJsonObject, sender_realm_strKey, node);
	if (isprimitive("int")) {
		int obj = getStreamId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *stream_idKey = "stream_id";
	json_object_set_member(pJsonObject, stream_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSubject();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *subjectKey = "subject";
	json_object_set_member(pJsonObject, subjectKey, node);
	if (isprimitive("MessagesBase_topic_links")) {
		list<MessagesBase_topic_links> new_list = static_cast<list <MessagesBase_topic_links> > (getTopicLinks());
		node = converttoJson(&new_list, "MessagesBase_topic_links", "array");
	} else {
		node = json_node_alloc();
		list<MessagesBase_topic_links> new_list = static_cast<list <MessagesBase_topic_links> > (getTopicLinks());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<MessagesBase_topic_links>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			MessagesBase_topic_links obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *topic_linksKey = "topic_links";
	json_object_set_member(pJsonObject, topic_linksKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getSubmessages());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getSubmessages());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *submessagesKey = "submessages";
	json_object_set_member(pJsonObject, submessagesKey, node);
	if (isprimitive("int")) {
		int obj = getTimestamp();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *timestampKey = "timestamp";
	json_object_set_member(pJsonObject, timestampKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
MessagesBase::getAvatarUrl()
{
	return avatar_url;
}

void
MessagesBase::setAvatarUrl(std::string  avatar_url)
{
	this->avatar_url = avatar_url;
}

std::string
MessagesBase::getClient()
{
	return client;
}

void
MessagesBase::setClient(std::string  client)
{
	this->client = client;
}

std::string
MessagesBase::getContent()
{
	return content;
}

void
MessagesBase::setContent(std::string  content)
{
	this->content = content;
}

std::string
MessagesBase::getContentType()
{
	return content_type;
}

void
MessagesBase::setContentType(std::string  content_type)
{
	this->content_type = content_type;
}

OneOf&lt;string,array&gt;
MessagesBase::getDisplayRecipient()
{
	return display_recipient;
}

void
MessagesBase::setDisplayRecipient(OneOf&lt;string,array&gt;  display_recipient)
{
	this->display_recipient = display_recipient;
}

int
MessagesBase::getId()
{
	return id;
}

void
MessagesBase::setId(int  id)
{
	this->id = id;
}

bool
MessagesBase::getIsMeMessage()
{
	return is_me_message;
}

void
MessagesBase::setIsMeMessage(bool  is_me_message)
{
	this->is_me_message = is_me_message;
}

std::list<EmojiReaction>
MessagesBase::getReactions()
{
	return reactions;
}

void
MessagesBase::setReactions(std::list <EmojiReaction> reactions)
{
	this->reactions = reactions;
}

int
MessagesBase::getRecipientId()
{
	return recipient_id;
}

void
MessagesBase::setRecipientId(int  recipient_id)
{
	this->recipient_id = recipient_id;
}

std::string
MessagesBase::getSenderEmail()
{
	return sender_email;
}

void
MessagesBase::setSenderEmail(std::string  sender_email)
{
	this->sender_email = sender_email;
}

std::string
MessagesBase::getSenderFullName()
{
	return sender_full_name;
}

void
MessagesBase::setSenderFullName(std::string  sender_full_name)
{
	this->sender_full_name = sender_full_name;
}

int
MessagesBase::getSenderId()
{
	return sender_id;
}

void
MessagesBase::setSenderId(int  sender_id)
{
	this->sender_id = sender_id;
}

std::string
MessagesBase::getSenderRealmStr()
{
	return sender_realm_str;
}

void
MessagesBase::setSenderRealmStr(std::string  sender_realm_str)
{
	this->sender_realm_str = sender_realm_str;
}

int
MessagesBase::getStreamId()
{
	return stream_id;
}

void
MessagesBase::setStreamId(int  stream_id)
{
	this->stream_id = stream_id;
}

std::string
MessagesBase::getSubject()
{
	return subject;
}

void
MessagesBase::setSubject(std::string  subject)
{
	this->subject = subject;
}

std::list<MessagesBase_topic_links>
MessagesBase::getTopicLinks()
{
	return topic_links;
}

void
MessagesBase::setTopicLinks(std::list <MessagesBase_topic_links> topic_links)
{
	this->topic_links = topic_links;
}

std::list<std::string>
MessagesBase::getSubmessages()
{
	return submessages;
}

void
MessagesBase::setSubmessages(std::list <std::string> submessages)
{
	this->submessages = submessages;
}

int
MessagesBase::getTimestamp()
{
	return timestamp;
}

void
MessagesBase::setTimestamp(int  timestamp)
{
	this->timestamp = timestamp;
}

std::string
MessagesBase::getType()
{
	return type;
}

void
MessagesBase::setType(std::string  type)
{
	this->type = type;
}


