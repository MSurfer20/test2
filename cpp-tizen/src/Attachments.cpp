#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Attachments.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Attachments::Attachments()
{
	//__init();
}

Attachments::~Attachments()
{
	//__cleanup();
}

void
Attachments::__init()
{
	//id = int(0);
	//name = std::string();
	//path_id = std::string();
	//size = int(0);
	//create_time = int(0);
	//new std::list()std::list> messages;
}

void
Attachments::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(path_id != NULL) {
	//
	//delete path_id;
	//path_id = NULL;
	//}
	//if(size != NULL) {
	//
	//delete size;
	//size = NULL;
	//}
	//if(create_time != NULL) {
	//
	//delete create_time;
	//create_time = NULL;
	//}
	//if(messages != NULL) {
	//messages.RemoveAll(true);
	//delete messages;
	//messages = NULL;
	//}
	//
}

void
Attachments::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&id, node, "int", "");
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
	const gchar *path_idKey = "path_id";
	node = json_object_get_member(pJsonObject, path_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&path_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *sizeKey = "size";
	node = json_object_get_member(pJsonObject, sizeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&size, node, "int", "");
		} else {
			
		}
	}
	const gchar *create_timeKey = "create_time";
	node = json_object_get_member(pJsonObject, create_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&create_time, node, "int", "");
		} else {
			
		}
	}
	const gchar *messagesKey = "messages";
	node = json_object_get_member(pJsonObject, messagesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<Attachments_messages> new_list;
			Attachments_messages inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("Attachments_messages")) {
					jsonToValue(&inst, temp_json, "Attachments_messages", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			messages = new_list;
		}
		
	}
}

Attachments::Attachments(char* json)
{
	this->fromJson(json);
}

char*
Attachments::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPathId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *path_idKey = "path_id";
	json_object_set_member(pJsonObject, path_idKey, node);
	if (isprimitive("int")) {
		int obj = getSize();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *sizeKey = "size";
	json_object_set_member(pJsonObject, sizeKey, node);
	if (isprimitive("int")) {
		int obj = getCreateTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *create_timeKey = "create_time";
	json_object_set_member(pJsonObject, create_timeKey, node);
	if (isprimitive("Attachments_messages")) {
		list<Attachments_messages> new_list = static_cast<list <Attachments_messages> > (getMessages());
		node = converttoJson(&new_list, "Attachments_messages", "array");
	} else {
		node = json_node_alloc();
		list<Attachments_messages> new_list = static_cast<list <Attachments_messages> > (getMessages());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<Attachments_messages>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			Attachments_messages obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *messagesKey = "messages";
	json_object_set_member(pJsonObject, messagesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
Attachments::getId()
{
	return id;
}

void
Attachments::setId(int  id)
{
	this->id = id;
}

std::string
Attachments::getName()
{
	return name;
}

void
Attachments::setName(std::string  name)
{
	this->name = name;
}

std::string
Attachments::getPathId()
{
	return path_id;
}

void
Attachments::setPathId(std::string  path_id)
{
	this->path_id = path_id;
}

int
Attachments::getSize()
{
	return size;
}

void
Attachments::setSize(int  size)
{
	this->size = size;
}

int
Attachments::getCreateTime()
{
	return create_time;
}

void
Attachments::setCreateTime(int  create_time)
{
	this->create_time = create_time;
}

std::list<Attachments_messages>
Attachments::getMessages()
{
	return messages;
}

void
Attachments::setMessages(std::list <Attachments_messages> messages)
{
	this->messages = messages;
}


