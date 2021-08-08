#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DefaultStreamGroup.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DefaultStreamGroup::DefaultStreamGroup()
{
	//__init();
}

DefaultStreamGroup::~DefaultStreamGroup()
{
	//__cleanup();
}

void
DefaultStreamGroup::__init()
{
	//name = std::string();
	//description = std::string();
	//id = int(0);
	//new std::list()std::list> streams;
}

void
DefaultStreamGroup::__cleanup()
{
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
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(streams != NULL) {
	//streams.RemoveAll(true);
	//delete streams;
	//streams = NULL;
	//}
	//
}

void
DefaultStreamGroup::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&id, node, "int", "");
		} else {
			
		}
	}
	const gchar *streamsKey = "streams";
	node = json_object_get_member(pJsonObject, streamsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<BasicStream> new_list;
			BasicStream inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("BasicStream")) {
					jsonToValue(&inst, temp_json, "BasicStream", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			streams = new_list;
		}
		
	}
}

DefaultStreamGroup::DefaultStreamGroup(char* json)
{
	this->fromJson(json);
}

char*
DefaultStreamGroup::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
		int obj = getId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("BasicStream")) {
		list<BasicStream> new_list = static_cast<list <BasicStream> > (getStreams());
		node = converttoJson(&new_list, "BasicStream", "array");
	} else {
		node = json_node_alloc();
		list<BasicStream> new_list = static_cast<list <BasicStream> > (getStreams());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<BasicStream>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			BasicStream obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *streamsKey = "streams";
	json_object_set_member(pJsonObject, streamsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
DefaultStreamGroup::getName()
{
	return name;
}

void
DefaultStreamGroup::setName(std::string  name)
{
	this->name = name;
}

std::string
DefaultStreamGroup::getDescription()
{
	return description;
}

void
DefaultStreamGroup::setDescription(std::string  description)
{
	this->description = description;
}

int
DefaultStreamGroup::getId()
{
	return id;
}

void
DefaultStreamGroup::setId(int  id)
{
	this->id = id;
}

std::list<BasicStream>
DefaultStreamGroup::getStreams()
{
	return streams;
}

void
DefaultStreamGroup::setStreams(std::list <BasicStream> streams)
{
	this->streams = streams;
}


