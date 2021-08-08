#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CustomProfileField.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CustomProfileField::CustomProfileField()
{
	//__init();
}

CustomProfileField::~CustomProfileField()
{
	//__cleanup();
}

void
CustomProfileField::__init()
{
	//id = int(0);
	//type = int(0);
	//order = int(0);
	//name = std::string();
	//hint = std::string();
	//field_data = std::string();
}

void
CustomProfileField::__cleanup()
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
	//if(order != NULL) {
	//
	//delete order;
	//order = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(hint != NULL) {
	//
	//delete hint;
	//hint = NULL;
	//}
	//if(field_data != NULL) {
	//
	//delete field_data;
	//field_data = NULL;
	//}
	//
}

void
CustomProfileField::fromJson(char* jsonStr)
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
	

		if (isprimitive("int")) {
			jsonToValue(&type, node, "int", "");
		} else {
			
		}
	}
	const gchar *orderKey = "order";
	node = json_object_get_member(pJsonObject, orderKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&order, node, "int", "");
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
	const gchar *hintKey = "hint";
	node = json_object_get_member(pJsonObject, hintKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&hint, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *field_dataKey = "field_data";
	node = json_object_get_member(pJsonObject, field_dataKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&field_data, node, "std::string", "");
		} else {
			
		}
	}
}

CustomProfileField::CustomProfileField(char* json)
{
	this->fromJson(json);
}

char*
CustomProfileField::toJson()
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
	if (isprimitive("int")) {
		int obj = getType();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("int")) {
		int obj = getOrder();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *orderKey = "order";
	json_object_set_member(pJsonObject, orderKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getHint();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *hintKey = "hint";
	json_object_set_member(pJsonObject, hintKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFieldData();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *field_dataKey = "field_data";
	json_object_set_member(pJsonObject, field_dataKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
CustomProfileField::getId()
{
	return id;
}

void
CustomProfileField::setId(int  id)
{
	this->id = id;
}

int
CustomProfileField::getType()
{
	return type;
}

void
CustomProfileField::setType(int  type)
{
	this->type = type;
}

int
CustomProfileField::getOrder()
{
	return order;
}

void
CustomProfileField::setOrder(int  order)
{
	this->order = order;
}

std::string
CustomProfileField::getName()
{
	return name;
}

void
CustomProfileField::setName(std::string  name)
{
	this->name = name;
}

std::string
CustomProfileField::getHint()
{
	return hint;
}

void
CustomProfileField::setHint(std::string  hint)
{
	this->hint = hint;
}

std::string
CustomProfileField::getFieldData()
{
	return field_data;
}

void
CustomProfileField::setFieldData(std::string  field_data)
{
	this->field_data = field_data;
}


