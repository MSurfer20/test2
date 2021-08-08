#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UserGroup.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UserGroup::UserGroup()
{
	//__init();
}

UserGroup::~UserGroup()
{
	//__cleanup();
}

void
UserGroup::__init()
{
	//name = std::string();
	//description = std::string();
	//new std::list()std::list> members;
	//id = int(0);
}

void
UserGroup::__cleanup()
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
	//if(members != NULL) {
	//members.RemoveAll(true);
	//delete members;
	//members = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//
}

void
UserGroup::fromJson(char* jsonStr)
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
	const gchar *membersKey = "members";
	node = json_object_get_member(pJsonObject, membersKey);
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
			members = new_list;
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
}

UserGroup::UserGroup(char* json)
{
	this->fromJson(json);
}

char*
UserGroup::toJson()
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
		list<int> new_list = static_cast<list <int> > (getMembers());
		node = converttoJson(&new_list, "int", "array");
	} else {
		node = json_node_alloc();
		list<int> new_list = static_cast<list <int> > (getMembers());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *membersKey = "members";
	json_object_set_member(pJsonObject, membersKey, node);
	if (isprimitive("int")) {
		int obj = getId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
UserGroup::getName()
{
	return name;
}

void
UserGroup::setName(std::string  name)
{
	this->name = name;
}

std::string
UserGroup::getDescription()
{
	return description;
}

void
UserGroup::setDescription(std::string  description)
{
	this->description = description;
}

std::list<int>
UserGroup::getMembers()
{
	return members;
}

void
UserGroup::setMembers(std::list <int> members)
{
	this->members = members;
}

int
UserGroup::getId()
{
	return id;
}

void
UserGroup::setId(int  id)
{
	this->id = id;
}


