#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Presence.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Presence::Presence()
{
	//__init();
}

Presence::~Presence()
{
	//__cleanup();
}

void
Presence::__init()
{
	//client = std::string();
	//status = std::string();
	//timestamp = int(0);
	//pushable = bool(false);
}

void
Presence::__cleanup()
{
	//if(client != NULL) {
	//
	//delete client;
	//client = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(timestamp != NULL) {
	//
	//delete timestamp;
	//timestamp = NULL;
	//}
	//if(pushable != NULL) {
	//
	//delete pushable;
	//pushable = NULL;
	//}
	//
}

void
Presence::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *clientKey = "client";
	node = json_object_get_member(pJsonObject, clientKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&client, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&status, node, "std::string", "");
		} else {
			
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
	const gchar *pushableKey = "pushable";
	node = json_object_get_member(pJsonObject, pushableKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&pushable, node, "bool", "");
		} else {
			
		}
	}
}

Presence::Presence(char* json)
{
	this->fromJson(json);
}

char*
Presence::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getClient();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *clientKey = "client";
	json_object_set_member(pJsonObject, clientKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStatus();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("int")) {
		int obj = getTimestamp();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *timestampKey = "timestamp";
	json_object_set_member(pJsonObject, timestampKey, node);
	if (isprimitive("bool")) {
		bool obj = getPushable();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *pushableKey = "pushable";
	json_object_set_member(pJsonObject, pushableKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Presence::getClient()
{
	return client;
}

void
Presence::setClient(std::string  client)
{
	this->client = client;
}

std::string
Presence::getStatus()
{
	return status;
}

void
Presence::setStatus(std::string  status)
{
	this->status = status;
}

int
Presence::getTimestamp()
{
	return timestamp;
}

void
Presence::setTimestamp(int  timestamp)
{
	this->timestamp = timestamp;
}

bool
Presence::getPushable()
{
	return pushable;
}

void
Presence::setPushable(bool  pushable)
{
	this->pushable = pushable;
}


