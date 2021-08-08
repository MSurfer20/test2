#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "JsonResponseBase.h"

using namespace std;
using namespace Tizen::ArtikCloud;

JsonResponseBase::JsonResponseBase()
{
	//__init();
}

JsonResponseBase::~JsonResponseBase()
{
	//__cleanup();
}

void
JsonResponseBase::__init()
{
	//result = std::string();
}

void
JsonResponseBase::__cleanup()
{
	//if(result != NULL) {
	//
	//delete result;
	//result = NULL;
	//}
	//
}

void
JsonResponseBase::fromJson(char* jsonStr)
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
}

JsonResponseBase::JsonResponseBase(char* json)
{
	this->fromJson(json);
}

char*
JsonResponseBase::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
JsonResponseBase::getResult()
{
	return result;
}

void
JsonResponseBase::setResult(std::string  result)
{
	this->result = result;
}


