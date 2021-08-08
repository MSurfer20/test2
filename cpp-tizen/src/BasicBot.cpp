#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BasicBot.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BasicBot::BasicBot()
{
	//__init();
}

BasicBot::~BasicBot()
{
	//__cleanup();
}

void
BasicBot::__init()
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
}

void
BasicBot::__cleanup()
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
	//
}

void
BasicBot::fromJson(char* jsonStr)
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
}

BasicBot::BasicBot(char* json)
{
	this->fromJson(json);
}

char*
BasicBot::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

AnyType
BasicBot::getUserId()
{
	return user_id;
}

void
BasicBot::setUserId(AnyType  user_id)
{
	this->user_id = user_id;
}

AnyType
BasicBot::getFullName()
{
	return full_name;
}

void
BasicBot::setFullName(AnyType  full_name)
{
	this->full_name = full_name;
}

AnyType
BasicBot::getApiKey()
{
	return api_key;
}

void
BasicBot::setApiKey(AnyType  api_key)
{
	this->api_key = api_key;
}

AnyType
BasicBot::getDefaultSendingStream()
{
	return default_sending_stream;
}

void
BasicBot::setDefaultSendingStream(AnyType  default_sending_stream)
{
	this->default_sending_stream = default_sending_stream;
}

AnyType
BasicBot::getDefaultEventsRegisterStream()
{
	return default_events_register_stream;
}

void
BasicBot::setDefaultEventsRegisterStream(AnyType  default_events_register_stream)
{
	this->default_events_register_stream = default_events_register_stream;
}

AnyType
BasicBot::getDefaultAllPublicStreams()
{
	return default_all_public_streams;
}

void
BasicBot::setDefaultAllPublicStreams(AnyType  default_all_public_streams)
{
	this->default_all_public_streams = default_all_public_streams;
}

AnyType
BasicBot::getAvatarUrl()
{
	return avatar_url;
}

void
BasicBot::setAvatarUrl(AnyType  avatar_url)
{
	this->avatar_url = avatar_url;
}

AnyType
BasicBot::getOwnerId()
{
	return owner_id;
}

void
BasicBot::setOwnerId(AnyType  owner_id)
{
	this->owner_id = owner_id;
}

AnyType
BasicBot::getServices()
{
	return services;
}

void
BasicBot::setServices(AnyType  services)
{
	this->services = services;
}


