#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MissingArgumentError.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MissingArgumentError::MissingArgumentError()
{
	//__init();
}

MissingArgumentError::~MissingArgumentError()
{
	//__cleanup();
}

void
MissingArgumentError::__init()
{
	//result = null;
	//msg = null;
	//code = null;
	//var_name = std::string();
}

void
MissingArgumentError::__cleanup()
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
	//if(code != NULL) {
	//
	//delete code;
	//code = NULL;
	//}
	//if(var_name != NULL) {
	//
	//delete var_name;
	//var_name = NULL;
	//}
	//
}

void
MissingArgumentError::fromJson(char* jsonStr)
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
	const gchar *codeKey = "code";
	node = json_object_get_member(pJsonObject, codeKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&code, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&code);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *var_nameKey = "var_name";
	node = json_object_get_member(pJsonObject, var_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&var_name, node, "std::string", "");
		} else {
			
		}
	}
}

MissingArgumentError::MissingArgumentError(char* json)
{
	this->fromJson(json);
}

char*
MissingArgumentError::toJson()
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
	if (isprimitive("AnyType")) {
		AnyType obj = getCode();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getCode());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *codeKey = "code";
	json_object_set_member(pJsonObject, codeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getVarName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *var_nameKey = "var_name";
	json_object_set_member(pJsonObject, var_nameKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

AnyType
MissingArgumentError::getResult()
{
	return result;
}

void
MissingArgumentError::setResult(AnyType  result)
{
	this->result = result;
}

AnyType
MissingArgumentError::getMsg()
{
	return msg;
}

void
MissingArgumentError::setMsg(AnyType  msg)
{
	this->msg = msg;
}

AnyType
MissingArgumentError::getCode()
{
	return code;
}

void
MissingArgumentError::setCode(AnyType  code)
{
	this->code = code;
}

std::string
MissingArgumentError::getVarName()
{
	return var_name;
}

void
MissingArgumentError::setVarName(std::string  var_name)
{
	this->var_name = var_name;
}


