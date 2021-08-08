#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Draft.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Draft::Draft()
{
	//__init();
}

Draft::~Draft()
{
	//__cleanup();
}

void
Draft::__init()
{
	//id = int(0);
	//type = std::string();
	//new std::list()std::list> to;
	//topic = std::string();
	//content = std::string();
	//timestamp = double(0);
}

void
Draft::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(to != NULL) {
	//to.RemoveAll(true);
	//delete to;
	//to = NULL;
	//}
	//if(topic != NULL) {
	//
	//delete topic;
	//topic = NULL;
	//}
	//if(content != NULL) {
	//
	//delete content;
	//content = NULL;
	//}
	//if(timestamp != NULL) {
	//
	//delete timestamp;
	//timestamp = NULL;
	//}
	//
}

void
Draft::fromJson(char* jsonStr)
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
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *toKey = "to";
	node = json_object_get_member(pJsonObject, toKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<int> new_list;
			int inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("int")) {
					jsonToValue(&inst, temp_json, "int", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			to = new_list;
		}
		
	}
	const gchar *topicKey = "topic";
	node = json_object_get_member(pJsonObject, topicKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&topic, node, "std::string", "");
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
	const gchar *timestampKey = "timestamp";
	node = json_object_get_member(pJsonObject, timestampKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&timestamp, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&timestamp);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

Draft::Draft(char* json)
{
	this->fromJson(json);
}

char*
Draft::toJson()
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
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("int")) {
		list<int> new_list = static_cast<list <int> > (getTo());
		node = converttoJson(&new_list, "int", "array");
	} else {
		node = json_node_alloc();
		list<int> new_list = static_cast<list <int> > (getTo());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *toKey = "to";
	json_object_set_member(pJsonObject, toKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTopic();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *topicKey = "topic";
	json_object_set_member(pJsonObject, topicKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getContent();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *contentKey = "content";
	json_object_set_member(pJsonObject, contentKey, node);
	if (isprimitive("long long")) {
		long long obj = getTimestamp();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getTimestamp());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *timestampKey = "timestamp";
	json_object_set_member(pJsonObject, timestampKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
Draft::getId()
{
	return id;
}

void
Draft::setId(int  id)
{
	this->id = id;
}

std::string
Draft::getType()
{
	return type;
}

void
Draft::setType(std::string  type)
{
	this->type = type;
}

std::list<int>
Draft::getTo()
{
	return to;
}

void
Draft::setTo(std::list <int> to)
{
	this->to = to;
}

std::string
Draft::getTopic()
{
	return topic;
}

void
Draft::setTopic(std::string  topic)
{
	this->topic = topic;
}

std::string
Draft::getContent()
{
	return content;
}

void
Draft::setContent(std::string  content)
{
	this->content = content;
}

long long
Draft::getTimestamp()
{
	return timestamp;
}

void
Draft::setTimestamp(long long  timestamp)
{
	this->timestamp = timestamp;
}


