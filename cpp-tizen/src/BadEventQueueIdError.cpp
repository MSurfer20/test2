#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BadEventQueueIdError.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BadEventQueueIdError::BadEventQueueIdError()
{
	//__init();
}

BadEventQueueIdError::~BadEventQueueIdError()
{
	//__cleanup();
}

void
BadEventQueueIdError::__init()
{
	//result = null;
	//msg = null;
	//code = null;
	//queue_id = std::string();
}

void
BadEventQueueIdError::__cleanup()
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
	//if(queue_id != NULL) {
	//
	//delete queue_id;
	//queue_id = NULL;
	//}
	//
}

void
BadEventQueueIdError::fromJson(char* jsonStr)
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
	const gchar *queue_idKey = "queue_id";
	node = json_object_get_member(pJsonObject, queue_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&queue_id, node, "std::string", "");
		} else {
			
		}
	}
}

BadEventQueueIdError::BadEventQueueIdError(char* json)
{
	this->fromJson(json);
}

char*
BadEventQueueIdError::toJson()
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
		std::string obj = getQueueId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *queue_idKey = "queue_id";
	json_object_set_member(pJsonObject, queue_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

AnyType
BadEventQueueIdError::getResult()
{
	return result;
}

void
BadEventQueueIdError::setResult(AnyType  result)
{
	this->result = result;
}

AnyType
BadEventQueueIdError::getMsg()
{
	return msg;
}

void
BadEventQueueIdError::setMsg(AnyType  msg)
{
	this->msg = msg;
}

AnyType
BadEventQueueIdError::getCode()
{
	return code;
}

void
BadEventQueueIdError::setCode(AnyType  code)
{
	this->code = code;
}

std::string
BadEventQueueIdError::getQueueId()
{
	return queue_id;
}

void
BadEventQueueIdError::setQueueId(std::string  queue_id)
{
	this->queue_id = queue_id;
}


