#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BasicBotBase.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BasicBotBase::BasicBotBase()
{
	//__init();
}

BasicBotBase::~BasicBotBase()
{
	//__cleanup();
}

void
BasicBotBase::__init()
{
	//user_id = int(0);
	//full_name = std::string();
	//api_key = std::string();
	//default_sending_stream = std::string();
	//default_events_register_stream = std::string();
	//default_all_public_streams = bool(false);
	//avatar_url = std::string();
	//owner_id = int(0);
	//new std::list()std::list> services;
}

void
BasicBotBase::__cleanup()
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
	//services.RemoveAll(true);
	//delete services;
	//services = NULL;
	//}
	//
}

void
BasicBotBase::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *user_idKey = "user_id";
	node = json_object_get_member(pJsonObject, user_idKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&user_id, node, "int", "");
		} else {
			
		}
	}
	const gchar *full_nameKey = "full_name";
	node = json_object_get_member(pJsonObject, full_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&full_name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *api_keyKey = "api_key";
	node = json_object_get_member(pJsonObject, api_keyKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&api_key, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *default_sending_streamKey = "default_sending_stream";
	node = json_object_get_member(pJsonObject, default_sending_streamKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&default_sending_stream, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *default_events_register_streamKey = "default_events_register_stream";
	node = json_object_get_member(pJsonObject, default_events_register_streamKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&default_events_register_stream, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *default_all_public_streamsKey = "default_all_public_streams";
	node = json_object_get_member(pJsonObject, default_all_public_streamsKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&default_all_public_streams, node, "bool", "");
		} else {
			
		}
	}
	const gchar *avatar_urlKey = "avatar_url";
	node = json_object_get_member(pJsonObject, avatar_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&avatar_url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *owner_idKey = "owner_id";
	node = json_object_get_member(pJsonObject, owner_idKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&owner_id, node, "int", "");
		} else {
			
		}
	}
	const gchar *servicesKey = "services";
	node = json_object_get_member(pJsonObject, servicesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OneOf&lt;object,object&gt;> new_list;
			OneOf&lt;object,object&gt; inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OneOf&lt;object,object&gt;")) {
					jsonToValue(&inst, temp_json, "OneOf&lt;object,object&gt;", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			services = new_list;
		}
		
	}
}

BasicBotBase::BasicBotBase(char* json)
{
	this->fromJson(json);
}

char*
BasicBotBase::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getUserId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *user_idKey = "user_id";
	json_object_set_member(pJsonObject, user_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFullName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *full_nameKey = "full_name";
	json_object_set_member(pJsonObject, full_nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getApiKey();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *api_keyKey = "api_key";
	json_object_set_member(pJsonObject, api_keyKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDefaultSendingStream();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *default_sending_streamKey = "default_sending_stream";
	json_object_set_member(pJsonObject, default_sending_streamKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDefaultEventsRegisterStream();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *default_events_register_streamKey = "default_events_register_stream";
	json_object_set_member(pJsonObject, default_events_register_streamKey, node);
	if (isprimitive("bool")) {
		bool obj = getDefaultAllPublicStreams();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *default_all_public_streamsKey = "default_all_public_streams";
	json_object_set_member(pJsonObject, default_all_public_streamsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAvatarUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *avatar_urlKey = "avatar_url";
	json_object_set_member(pJsonObject, avatar_urlKey, node);
	if (isprimitive("int")) {
		int obj = getOwnerId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *owner_idKey = "owner_id";
	json_object_set_member(pJsonObject, owner_idKey, node);
	if (isprimitive("OneOf&lt;object,object&gt;")) {
		list<OneOf&lt;object,object&gt;> new_list = static_cast<list <OneOf&lt;object,object&gt;> > (getServices());
		node = converttoJson(&new_list, "OneOf&lt;object,object&gt;", "array");
	} else {
		node = json_node_alloc();
		list<OneOf&lt;object,object&gt;> new_list = static_cast<list <OneOf&lt;object,object&gt;> > (getServices());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OneOf&lt;object,object&gt;>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OneOf&lt;object,object&gt; obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
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

int
BasicBotBase::getUserId()
{
	return user_id;
}

void
BasicBotBase::setUserId(int  user_id)
{
	this->user_id = user_id;
}

std::string
BasicBotBase::getFullName()
{
	return full_name;
}

void
BasicBotBase::setFullName(std::string  full_name)
{
	this->full_name = full_name;
}

std::string
BasicBotBase::getApiKey()
{
	return api_key;
}

void
BasicBotBase::setApiKey(std::string  api_key)
{
	this->api_key = api_key;
}

std::string
BasicBotBase::getDefaultSendingStream()
{
	return default_sending_stream;
}

void
BasicBotBase::setDefaultSendingStream(std::string  default_sending_stream)
{
	this->default_sending_stream = default_sending_stream;
}

std::string
BasicBotBase::getDefaultEventsRegisterStream()
{
	return default_events_register_stream;
}

void
BasicBotBase::setDefaultEventsRegisterStream(std::string  default_events_register_stream)
{
	this->default_events_register_stream = default_events_register_stream;
}

bool
BasicBotBase::getDefaultAllPublicStreams()
{
	return default_all_public_streams;
}

void
BasicBotBase::setDefaultAllPublicStreams(bool  default_all_public_streams)
{
	this->default_all_public_streams = default_all_public_streams;
}

std::string
BasicBotBase::getAvatarUrl()
{
	return avatar_url;
}

void
BasicBotBase::setAvatarUrl(std::string  avatar_url)
{
	this->avatar_url = avatar_url;
}

int
BasicBotBase::getOwnerId()
{
	return owner_id;
}

void
BasicBotBase::setOwnerId(int  owner_id)
{
	this->owner_id = owner_id;
}

std::list<OneOf&lt;object,object&gt;>
BasicBotBase::getServices()
{
	return services;
}

void
BasicBotBase::setServices(std::list <OneOf&lt;object,object&gt;> services)
{
	this->services = services;
}


