#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AddSubscriptionsResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AddSubscriptionsResponse::AddSubscriptionsResponse()
{
	//__init();
}

AddSubscriptionsResponse::~AddSubscriptionsResponse()
{
	//__cleanup();
}

void
AddSubscriptionsResponse::__init()
{
	//result = null;
	//msg = null;
	//new std::map()std::map> subscribed;
	//new std::map()std::map> already_subscribed;
	//new std::list()std::list> unauthorized;
}

void
AddSubscriptionsResponse::__cleanup()
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
	//if(subscribed != NULL) {
	//subscribed.RemoveAll(true);
	//delete subscribed;
	//subscribed = NULL;
	//}
	//if(already_subscribed != NULL) {
	//already_subscribed.RemoveAll(true);
	//delete already_subscribed;
	//already_subscribed = NULL;
	//}
	//if(unauthorized != NULL) {
	//unauthorized.RemoveAll(true);
	//delete unauthorized;
	//unauthorized = NULL;
	//}
	//
}

void
AddSubscriptionsResponse::fromJson(char* jsonStr)
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
	const gchar *subscribedKey = "subscribed";
	node = json_object_get_member(pJsonObject, subscribedKey);
	if (node !=NULL) {
	
		{
			JsonObject* json_obj = json_node_get_object(node);
			map<string,string> new_map;
			json_object_foreach_member(json_obj,helper_func,&new_map);
			subscribed = new_map;
		}
		
	}
	const gchar *already_subscribedKey = "already_subscribed";
	node = json_object_get_member(pJsonObject, already_subscribedKey);
	if (node !=NULL) {
	
		{
			JsonObject* json_obj = json_node_get_object(node);
			map<string,string> new_map;
			json_object_foreach_member(json_obj,helper_func,&new_map);
			already_subscribed = new_map;
		}
		
	}
	const gchar *unauthorizedKey = "unauthorized";
	node = json_object_get_member(pJsonObject, unauthorizedKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			unauthorized = new_list;
		}
		
	}
}

AddSubscriptionsResponse::AddSubscriptionsResponse(char* json)
{
	this->fromJson(json);
}

char*
AddSubscriptionsResponse::toJson()
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


	{
		JsonObject* json_obj;
		map<string, string> new_list = static_cast<map <string, string> > (getSubscribed());
		json_obj = json_object_new();
		for (map<string, string>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			string obj = (*it).first;
			string obj2 = (*it).second;
			JsonNode* tempnode = json_from_string(obj2.c_str(),NULL);
			json_object_set_member(json_obj, obj.c_str(), tempnode);
		}
	node = json_node_alloc();
	json_node_init_object(node, json_obj);
	json_object_unref(json_obj);
	}

	const gchar *subscribedKey = "subscribed";
	json_object_set_member(pJsonObject, subscribedKey, node);


	{
		JsonObject* json_obj;
		map<string, string> new_list = static_cast<map <string, string> > (getAlreadySubscribed());
		json_obj = json_object_new();
		for (map<string, string>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			string obj = (*it).first;
			string obj2 = (*it).second;
			JsonNode* tempnode = json_from_string(obj2.c_str(),NULL);
			json_object_set_member(json_obj, obj.c_str(), tempnode);
		}
	node = json_node_alloc();
	json_node_init_object(node, json_obj);
	json_object_unref(json_obj);
	}

	const gchar *already_subscribedKey = "already_subscribed";
	json_object_set_member(pJsonObject, already_subscribedKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getUnauthorized());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getUnauthorized());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *unauthorizedKey = "unauthorized";
	json_object_set_member(pJsonObject, unauthorizedKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

AnyType
AddSubscriptionsResponse::getResult()
{
	return result;
}

void
AddSubscriptionsResponse::setResult(AnyType  result)
{
	this->result = result;
}

AnyType
AddSubscriptionsResponse::getMsg()
{
	return msg;
}

void
AddSubscriptionsResponse::setMsg(AnyType  msg)
{
	this->msg = msg;
}

std::map<string, string>
AddSubscriptionsResponse::getSubscribed()
{
	return subscribed;
}

void
AddSubscriptionsResponse::setSubscribed(std::map <string, string> subscribed)
{
	this->subscribed = subscribed;
}

std::map<string, string>
AddSubscriptionsResponse::getAlreadySubscribed()
{
	return already_subscribed;
}

void
AddSubscriptionsResponse::setAlreadySubscribed(std::map <string, string> already_subscribed)
{
	this->already_subscribed = already_subscribed;
}

std::list<std::string>
AddSubscriptionsResponse::getUnauthorized()
{
	return unauthorized;
}

void
AddSubscriptionsResponse::setUnauthorized(std::list <std::string> unauthorized)
{
	this->unauthorized = unauthorized;
}


