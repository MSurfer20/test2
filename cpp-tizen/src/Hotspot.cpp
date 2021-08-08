#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Hotspot.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Hotspot::Hotspot()
{
	//__init();
}

Hotspot::~Hotspot()
{
	//__cleanup();
}

void
Hotspot::__init()
{
	//delay = double(0);
	//name = std::string();
	//title = std::string();
	//description = std::string();
}

void
Hotspot::__cleanup()
{
	//if(delay != NULL) {
	//
	//delete delay;
	//delay = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(title != NULL) {
	//
	//delete title;
	//title = NULL;
	//}
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//
}

void
Hotspot::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *delayKey = "delay";
	node = json_object_get_member(pJsonObject, delayKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&delay, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&delay);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *titleKey = "title";
	node = json_object_get_member(pJsonObject, titleKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&title, node, "std::string", "");
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
}

Hotspot::Hotspot(char* json)
{
	this->fromJson(json);
}

char*
Hotspot::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getDelay();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getDelay());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *delayKey = "delay";
	json_object_set_member(pJsonObject, delayKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTitle();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *titleKey = "title";
	json_object_set_member(pJsonObject, titleKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
Hotspot::getDelay()
{
	return delay;
}

void
Hotspot::setDelay(long long  delay)
{
	this->delay = delay;
}

std::string
Hotspot::getName()
{
	return name;
}

void
Hotspot::setName(std::string  name)
{
	this->name = name;
}

std::string
Hotspot::getTitle()
{
	return title;
}

void
Hotspot::setTitle(std::string  title)
{
	this->title = title;
}

std::string
Hotspot::getDescription()
{
	return description;
}

void
Hotspot::setDescription(std::string  description)
{
	this->description = description;
}


