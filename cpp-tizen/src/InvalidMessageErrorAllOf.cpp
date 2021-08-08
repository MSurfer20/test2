#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "InvalidMessageError_allOf.h"

using namespace std;
using namespace Tizen::ArtikCloud;

InvalidMessageError_allOf::InvalidMessageError_allOf()
{
	//__init();
}

InvalidMessageError_allOf::~InvalidMessageError_allOf()
{
	//__cleanup();
}

void
InvalidMessageError_allOf::__init()
{
	//result = null;
	//msg = null;
	//raw_content = std::string();
}

void
InvalidMessageError_allOf::__cleanup()
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
	//if(raw_content != NULL) {
	//
	//delete raw_content;
	//raw_content = NULL;
	//}
	//
}

void
InvalidMessageError_allOf::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *resultKey = "result";
	node = json_object_get_member(pJsonObject, resultKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&result, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&result);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *msgKey = "msg";
	node = json_object_get_member(pJsonObject, msgKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&msg, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&msg);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *raw_contentKey = "raw_content";
	node = json_object_get_member(pJsonObject, raw_contentKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&raw_content, node, "std::string", "");
		} else {
			
		}
	}
}

InvalidMessageError_allOf::InvalidMessageError_allOf(char* json)
{
	this->fromJson(json);
}

char*
InvalidMessageError_allOf::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AnyType")) {
		AnyType obj = getResult();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getResult());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *resultKey = "result";
	json_object_set_member(pJsonObject, resultKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getMsg();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getMsg());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *msgKey = "msg";
	json_object_set_member(pJsonObject, msgKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRawContent();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *raw_contentKey = "raw_content";
	json_object_set_member(pJsonObject, raw_contentKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

AnyType
InvalidMessageError_allOf::getResult()
{
	return result;
}

void
InvalidMessageError_allOf::setResult(AnyType  result)
{
	this->result = result;
}

AnyType
InvalidMessageError_allOf::getMsg()
{
	return msg;
}

void
InvalidMessageError_allOf::setMsg(AnyType  msg)
{
	this->msg = msg;
}

std::string
InvalidMessageError_allOf::getRawContent()
{
	return raw_content;
}

void
InvalidMessageError_allOf::setRawContent(std::string  raw_content)
{
	this->raw_content = raw_content;
}


