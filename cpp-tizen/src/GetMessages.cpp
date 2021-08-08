#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetMessages.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetMessages::GetMessages()
{
	//__init();
}

GetMessages::~GetMessages()
{
	//__cleanup();
}

void
GetMessages::__init()
{
	//avatar_url = null;
	//client = null;
	//content = null;
	//content_type = null;
	//display_recipient = null;
	//id = null;
	//is_me_message = null;
	//reactions = null;
	//recipient_id = null;
	//sender_email = null;
	//sender_full_name = null;
	//sender_id = null;
	//sender_realm_str = null;
	//stream_id = null;
	//subject = null;
	//topic_links = null;
	//submessages = null;
	//timestamp = null;
	//type = null;
	//new std::list()std::list> flags;
	//last_edit_timestamp = int(0);
	//match_content = std::string();
	//match_subject = std::string();
}

void
GetMessages::__cleanup()
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
	//
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
	//
	//delete topic_links;
	//topic_links = NULL;
	//}
	//if(submessages != NULL) {
	//
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
	//if(flags != NULL) {
	//flags.RemoveAll(true);
	//delete flags;
	//flags = NULL;
	//}
	//if(last_edit_timestamp != NULL) {
	//
	//delete last_edit_timestamp;
	//last_edit_timestamp = NULL;
	//}
	//if(match_content != NULL) {
	//
	//delete match_content;
	//match_content = NULL;
	//}
	//if(match_subject != NULL) {
	//
	//delete match_subject;
	//match_subject = NULL;
	//}
	//
}

void
GetMessages::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *avatar_urlKey = "avatar_url";
	node = json_object_get_member(pJsonObject, avatar_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&avatar_url, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&avatar_url);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *clientKey = "client";
	node = json_object_get_member(pJsonObject, clientKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&client, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&client);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *contentKey = "content";
	node = json_object_get_member(pJsonObject, contentKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&content, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&content);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *content_typeKey = "content_type";
	node = json_object_get_member(pJsonObject, content_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&content_type, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&content_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *display_recipientKey = "display_recipient";
	node = json_object_get_member(pJsonObject, display_recipientKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&display_recipient, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&display_recipient);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&id, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&id);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *is_me_messageKey = "is_me_message";
	node = json_object_get_member(pJsonObject, is_me_messageKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&is_me_message, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&is_me_message);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *reactionsKey = "reactions";
	node = json_object_get_member(pJsonObject, reactionsKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&reactions, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&reactions);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *recipient_idKey = "recipient_id";
	node = json_object_get_member(pJsonObject, recipient_idKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&recipient_id, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&recipient_id);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *sender_emailKey = "sender_email";
	node = json_object_get_member(pJsonObject, sender_emailKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&sender_email, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&sender_email);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *sender_full_nameKey = "sender_full_name";
	node = json_object_get_member(pJsonObject, sender_full_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&sender_full_name, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&sender_full_name);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *sender_idKey = "sender_id";
	node = json_object_get_member(pJsonObject, sender_idKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&sender_id, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&sender_id);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *sender_realm_strKey = "sender_realm_str";
	node = json_object_get_member(pJsonObject, sender_realm_strKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&sender_realm_str, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&sender_realm_str);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
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
	const gchar *subjectKey = "subject";
	node = json_object_get_member(pJsonObject, subjectKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&subject, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&subject);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *topic_linksKey = "topic_links";
	node = json_object_get_member(pJsonObject, topic_linksKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&topic_links, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&topic_links);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *submessagesKey = "submessages";
	node = json_object_get_member(pJsonObject, submessagesKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&submessages, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&submessages);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *timestampKey = "timestamp";
	node = json_object_get_member(pJsonObject, timestampKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&timestamp, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&timestamp);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&type, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *flagsKey = "flags";
	node = json_object_get_member(pJsonObject, flagsKey);
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
			flags = new_list;
		}
		
	}
	const gchar *last_edit_timestampKey = "last_edit_timestamp";
	node = json_object_get_member(pJsonObject, last_edit_timestampKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&last_edit_timestamp, node, "int", "");
		} else {
			
		}
	}
	const gchar *match_contentKey = "match_content";
	node = json_object_get_member(pJsonObject, match_contentKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&match_content, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *match_subjectKey = "match_subject";
	node = json_object_get_member(pJsonObject, match_subjectKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&match_subject, node, "std::string", "");
		} else {
			
		}
	}
}

GetMessages::GetMessages(char* json)
{
	this->fromJson(json);
}

char*
GetMessages::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AnyType")) {
		AnyType obj = getAvatarUrl();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getAvatarUrl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *avatar_urlKey = "avatar_url";
	json_object_set_member(pJsonObject, avatar_urlKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getClient();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getClient());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *clientKey = "client";
	json_object_set_member(pJsonObject, clientKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getContent();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getContent());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *contentKey = "content";
	json_object_set_member(pJsonObject, contentKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getContentType();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getContentType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *content_typeKey = "content_type";
	json_object_set_member(pJsonObject, content_typeKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getDisplayRecipient();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getDisplayRecipient());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *display_recipientKey = "display_recipient";
	json_object_set_member(pJsonObject, display_recipientKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getId();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getId());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getIsMeMessage();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getIsMeMessage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *is_me_messageKey = "is_me_message";
	json_object_set_member(pJsonObject, is_me_messageKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getReactions();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getReactions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *reactionsKey = "reactions";
	json_object_set_member(pJsonObject, reactionsKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getRecipientId();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getRecipientId());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *recipient_idKey = "recipient_id";
	json_object_set_member(pJsonObject, recipient_idKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getSenderEmail();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getSenderEmail());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *sender_emailKey = "sender_email";
	json_object_set_member(pJsonObject, sender_emailKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getSenderFullName();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getSenderFullName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *sender_full_nameKey = "sender_full_name";
	json_object_set_member(pJsonObject, sender_full_nameKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getSenderId();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getSenderId());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *sender_idKey = "sender_id";
	json_object_set_member(pJsonObject, sender_idKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getSenderRealmStr();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getSenderRealmStr());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *sender_realm_strKey = "sender_realm_str";
	json_object_set_member(pJsonObject, sender_realm_strKey, node);
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
		AnyType obj = getSubject();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getSubject());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *subjectKey = "subject";
	json_object_set_member(pJsonObject, subjectKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getTopicLinks();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getTopicLinks());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *topic_linksKey = "topic_links";
	json_object_set_member(pJsonObject, topic_linksKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getSubmessages();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getSubmessages());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *submessagesKey = "submessages";
	json_object_set_member(pJsonObject, submessagesKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getTimestamp();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getTimestamp());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *timestampKey = "timestamp";
	json_object_set_member(pJsonObject, timestampKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getType();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getFlags());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getFlags());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *flagsKey = "flags";
	json_object_set_member(pJsonObject, flagsKey, node);
	if (isprimitive("int")) {
		int obj = getLastEditTimestamp();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *last_edit_timestampKey = "last_edit_timestamp";
	json_object_set_member(pJsonObject, last_edit_timestampKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMatchContent();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *match_contentKey = "match_content";
	json_object_set_member(pJsonObject, match_contentKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMatchSubject();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *match_subjectKey = "match_subject";
	json_object_set_member(pJsonObject, match_subjectKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

AnyType
GetMessages::getAvatarUrl()
{
	return avatar_url;
}

void
GetMessages::setAvatarUrl(AnyType  avatar_url)
{
	this->avatar_url = avatar_url;
}

AnyType
GetMessages::getClient()
{
	return client;
}

void
GetMessages::setClient(AnyType  client)
{
	this->client = client;
}

AnyType
GetMessages::getContent()
{
	return content;
}

void
GetMessages::setContent(AnyType  content)
{
	this->content = content;
}

AnyType
GetMessages::getContentType()
{
	return content_type;
}

void
GetMessages::setContentType(AnyType  content_type)
{
	this->content_type = content_type;
}

AnyType
GetMessages::getDisplayRecipient()
{
	return display_recipient;
}

void
GetMessages::setDisplayRecipient(AnyType  display_recipient)
{
	this->display_recipient = display_recipient;
}

AnyType
GetMessages::getId()
{
	return id;
}

void
GetMessages::setId(AnyType  id)
{
	this->id = id;
}

AnyType
GetMessages::getIsMeMessage()
{
	return is_me_message;
}

void
GetMessages::setIsMeMessage(AnyType  is_me_message)
{
	this->is_me_message = is_me_message;
}

AnyType
GetMessages::getReactions()
{
	return reactions;
}

void
GetMessages::setReactions(AnyType  reactions)
{
	this->reactions = reactions;
}

AnyType
GetMessages::getRecipientId()
{
	return recipient_id;
}

void
GetMessages::setRecipientId(AnyType  recipient_id)
{
	this->recipient_id = recipient_id;
}

AnyType
GetMessages::getSenderEmail()
{
	return sender_email;
}

void
GetMessages::setSenderEmail(AnyType  sender_email)
{
	this->sender_email = sender_email;
}

AnyType
GetMessages::getSenderFullName()
{
	return sender_full_name;
}

void
GetMessages::setSenderFullName(AnyType  sender_full_name)
{
	this->sender_full_name = sender_full_name;
}

AnyType
GetMessages::getSenderId()
{
	return sender_id;
}

void
GetMessages::setSenderId(AnyType  sender_id)
{
	this->sender_id = sender_id;
}

AnyType
GetMessages::getSenderRealmStr()
{
	return sender_realm_str;
}

void
GetMessages::setSenderRealmStr(AnyType  sender_realm_str)
{
	this->sender_realm_str = sender_realm_str;
}

AnyType
GetMessages::getStreamId()
{
	return stream_id;
}

void
GetMessages::setStreamId(AnyType  stream_id)
{
	this->stream_id = stream_id;
}

AnyType
GetMessages::getSubject()
{
	return subject;
}

void
GetMessages::setSubject(AnyType  subject)
{
	this->subject = subject;
}

AnyType
GetMessages::getTopicLinks()
{
	return topic_links;
}

void
GetMessages::setTopicLinks(AnyType  topic_links)
{
	this->topic_links = topic_links;
}

AnyType
GetMessages::getSubmessages()
{
	return submessages;
}

void
GetMessages::setSubmessages(AnyType  submessages)
{
	this->submessages = submessages;
}

AnyType
GetMessages::getTimestamp()
{
	return timestamp;
}

void
GetMessages::setTimestamp(AnyType  timestamp)
{
	this->timestamp = timestamp;
}

AnyType
GetMessages::getType()
{
	return type;
}

void
GetMessages::setType(AnyType  type)
{
	this->type = type;
}

std::list<std::string>
GetMessages::getFlags()
{
	return flags;
}

void
GetMessages::setFlags(std::list <std::string> flags)
{
	this->flags = flags;
}

int
GetMessages::getLastEditTimestamp()
{
	return last_edit_timestamp;
}

void
GetMessages::setLastEditTimestamp(int  last_edit_timestamp)
{
	this->last_edit_timestamp = last_edit_timestamp;
}

std::string
GetMessages::getMatchContent()
{
	return match_content;
}

void
GetMessages::setMatchContent(std::string  match_content)
{
	this->match_content = match_content;
}

std::string
GetMessages::getMatchSubject()
{
	return match_subject;
}

void
GetMessages::setMatchSubject(std::string  match_subject)
{
	this->match_subject = match_subject;
}


