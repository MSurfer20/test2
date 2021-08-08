#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Bot.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Bot::Bot()
{
	//__init();
}

Bot::~Bot()
{
	//__cleanup();
}

void
Bot::__init()
{
	//user_id = null;
	//full_name = null;
	//api_key = null;
	//default_sending_stream = null;
	//default_events_register_stream = null;
	//default_all_public_streams = null;
	//avatar_url = null;
	//owner_id = null;
	//services = null;
	//email = std::string();
	//bot_type = int(0);
	//is_active = bool(false);
}

void
Bot::__cleanup()
{
	//if(user_id != NULL) {
	//
	//delete user_id;
	//user_id = NULL;
	//}
	//if(full_name != NULL) {
	//
	//delete full_name;
	//full_name = NULL;
	//}
	//if(api_key != NULL) {
	//
	//delete api_key;
	//api_key = NULL;
	//}
	//if(default_sending_stream != NULL) {
	//
	//delete default_sending_stream;
	//default_sending_stream = NULL;
	//}
	//if(default_events_register_stream != NULL) {
	//
	//delete default_events_register_stream;
	//default_events_register_stream = NULL;
	//}
	//if(default_all_public_streams != NULL) {
	//
	//delete default_all_public_streams;
	//default_all_public_streams = NULL;
	//}
	//if(avatar_url != NULL) {
	//
	//delete avatar_url;
	//avatar_url = NULL;
	//}
	//if(owner_id != NULL) {
	//
	//delete owner_id;
	//owner_id = NULL;
	//}
	//if(services != NULL) {
	//
	//delete services;
	//services = NULL;
	//}
	//if(email != NULL) {
	//
	//delete email;
	//email = NULL;
	//}
	//if(bot_type != NULL) {
	//
	//delete bot_type;
	//bot_type = NULL;
	//}
	//if(is_active != NULL) {
	//
	//delete is_active;
	//is_active = NULL;
	//}
	//
}

void
Bot::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *user_idKey = "user_id";
	node = json_object_get_member(pJsonObject, user_idKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&user_id, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&user_id);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *full_nameKey = "full_name";
	node = json_object_get_member(pJsonObject, full_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&full_name, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&full_name);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *api_keyKey = "api_key";
	node = json_object_get_member(pJsonObject, api_keyKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&api_key, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&api_key);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *default_sending_streamKey = "default_sending_stream";
	node = json_object_get_member(pJsonObject, default_sending_streamKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&default_sending_stream, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&default_sending_stream);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *default_events_register_streamKey = "default_events_register_stream";
	node = json_object_get_member(pJsonObject, default_events_register_streamKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&default_events_register_stream, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&default_events_register_stream);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *default_all_public_streamsKey = "default_all_public_streams";
	node = json_object_get_member(pJsonObject, default_all_public_streamsKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&default_all_public_streams, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&default_all_public_streams);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
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
	const gchar *owner_idKey = "owner_id";
	node = json_object_get_member(pJsonObject, owner_idKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&owner_id, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&owner_id);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *servicesKey = "services";
	node = json_object_get_member(pJsonObject, servicesKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&services, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&services);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *emailKey = "email";
	node = json_object_get_member(pJsonObject, emailKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&email, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *bot_typeKey = "bot_type";
	node = json_object_get_member(pJsonObject, bot_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&bot_type, node, "int", "");
		} else {
			
		}
	}
	const gchar *is_activeKey = "is_active";
	node = json_object_get_member(pJsonObject, is_activeKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_active, node, "bool", "");
		} else {
			
		}
	}
}

Bot::Bot(char* json)
{
	this->fromJson(json);
}

char*
Bot::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AnyType")) {
		AnyType obj = getUserId();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getUserId());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *user_idKey = "user_id";
	json_object_set_member(pJsonObject, user_idKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getFullName();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getFullName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *full_nameKey = "full_name";
	json_object_set_member(pJsonObject, full_nameKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getApiKey();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getApiKey());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *api_keyKey = "api_key";
	json_object_set_member(pJsonObject, api_keyKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getDefaultSendingStream();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getDefaultSendingStream());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *default_sending_streamKey = "default_sending_stream";
	json_object_set_member(pJsonObject, default_sending_streamKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getDefaultEventsRegisterStream();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getDefaultEventsRegisterStream());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *default_events_register_streamKey = "default_events_register_stream";
	json_object_set_member(pJsonObject, default_events_register_streamKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getDefaultAllPublicStreams();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getDefaultAllPublicStreams());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *default_all_public_streamsKey = "default_all_public_streams";
	json_object_set_member(pJsonObject, default_all_public_streamsKey, node);
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
		AnyType obj = getOwnerId();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getOwnerId());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *owner_idKey = "owner_id";
	json_object_set_member(pJsonObject, owner_idKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getServices();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getServices());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *servicesKey = "services";
	json_object_set_member(pJsonObject, servicesKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEmail();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *emailKey = "email";
	json_object_set_member(pJsonObject, emailKey, node);
	if (isprimitive("int")) {
		int obj = getBotType();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *bot_typeKey = "bot_type";
	json_object_set_member(pJsonObject, bot_typeKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsActive();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_activeKey = "is_active";
	json_object_set_member(pJsonObject, is_activeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

AnyType
Bot::getUserId()
{
	return user_id;
}

void
Bot::setUserId(AnyType  user_id)
{
	this->user_id = user_id;
}

AnyType
Bot::getFullName()
{
	return full_name;
}

void
Bot::setFullName(AnyType  full_name)
{
	this->full_name = full_name;
}

AnyType
Bot::getApiKey()
{
	return api_key;
}

void
Bot::setApiKey(AnyType  api_key)
{
	this->api_key = api_key;
}

AnyType
Bot::getDefaultSendingStream()
{
	return default_sending_stream;
}

void
Bot::setDefaultSendingStream(AnyType  default_sending_stream)
{
	this->default_sending_stream = default_sending_stream;
}

AnyType
Bot::getDefaultEventsRegisterStream()
{
	return default_events_register_stream;
}

void
Bot::setDefaultEventsRegisterStream(AnyType  default_events_register_stream)
{
	this->default_events_register_stream = default_events_register_stream;
}

AnyType
Bot::getDefaultAllPublicStreams()
{
	return default_all_public_streams;
}

void
Bot::setDefaultAllPublicStreams(AnyType  default_all_public_streams)
{
	this->default_all_public_streams = default_all_public_streams;
}

AnyType
Bot::getAvatarUrl()
{
	return avatar_url;
}

void
Bot::setAvatarUrl(AnyType  avatar_url)
{
	this->avatar_url = avatar_url;
}

AnyType
Bot::getOwnerId()
{
	return owner_id;
}

void
Bot::setOwnerId(AnyType  owner_id)
{
	this->owner_id = owner_id;
}

AnyType
Bot::getServices()
{
	return services;
}

void
Bot::setServices(AnyType  services)
{
	this->services = services;
}

std::string
Bot::getEmail()
{
	return email;
}

void
Bot::setEmail(std::string  email)
{
	this->email = email;
}

int
Bot::getBotType()
{
	return bot_type;
}

void
Bot::setBotType(int  bot_type)
{
	this->bot_type = bot_type;
}

bool
Bot::getIsActive()
{
	return is_active;
}

void
Bot::setIsActive(bool  is_active)
{
	this->is_active = is_active;
}


