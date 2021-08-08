#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "JsonErrorBase.h"

using namespace std;
using namespace Tizen::ArtikCloud;

JsonErrorBase::JsonErrorBase()
{
	//__init();
}

JsonErrorBase::~JsonErrorBase()
{
	//__cleanup();
}

void
JsonErrorBase::__init()
{
	//result = std::string();
	//msg = std::string();
}

void
JsonErrorBase::__cleanup()
{
	//if(result != NULL) {
	//
	//delete result;
	//result = NULL;
	//}
	//if(msg != NULL) {
	//
	//delete msg;
	//msg = NULL;
	//}
	//
}

void
JsonErrorBase::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *resultKey = "result";
	node = json_object_get_member(pJsonObject, resultKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&result, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *msgKey = "msg";
	node = json_object_get_member(pJsonObject, msgKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&msg, node, "std::string", "");
		} else {
			
		}
	}
}

JsonErrorBase::JsonErrorBase(char* json)
{
	this->fromJson(json);
}

char*
JsonErrorBase::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getResult();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *resultKey = "result";
	json_object_set_member(pJsonObject, resultKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMsg();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *msgKey = "msg";
	json_object_set_member(pJsonObject, msgKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
JsonErrorBase::getResult()
{
	return result;
}

void
JsonErrorBase::setResult(std::string  result)
{
	this->result = result;
}

std::string
JsonErrorBase::getMsg()
{
	return msg;
}

void
JsonErrorBase::setMsg(std::string  msg)
{
	this->msg = msg;
}


