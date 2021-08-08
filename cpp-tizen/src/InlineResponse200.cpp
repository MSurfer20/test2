#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Inline_response_200.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Inline_response_200::Inline_response_200()
{
	//__init();
}

Inline_response_200::~Inline_response_200()
{
	//__cleanup();
}

void
Inline_response_200::__init()
{
	//bot_email = std::string();
	//bot_full_name = std::string();
	//data = std::string();
	//trigger = std::string();
	//token = std::string();
	//message = null;
}

void
Inline_response_200::__cleanup()
{
	//if(bot_email != NULL) {
	//
	//delete bot_email;
	//bot_email = NULL;
	//}
	//if(bot_full_name != NULL) {
	//
	//delete bot_full_name;
	//bot_full_name = NULL;
	//}
	//if(data != NULL) {
	//
	//delete data;
	//data = NULL;
	//}
	//if(trigger != NULL) {
	//
	//delete trigger;
	//trigger = NULL;
	//}
	//if(token != NULL) {
	//
	//delete token;
	//token = NULL;
	//}
	//if(message != NULL) {
	//
	//delete message;
	//message = NULL;
	//}
	//
}

void
Inline_response_200::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *bot_emailKey = "bot_email";
	node = json_object_get_member(pJsonObject, bot_emailKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&bot_email, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *bot_full_nameKey = "bot_full_name";
	node = json_object_get_member(pJsonObject, bot_full_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&bot_full_name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *dataKey = "data";
	node = json_object_get_member(pJsonObject, dataKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&data, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *triggerKey = "trigger";
	node = json_object_get_member(pJsonObject, triggerKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&trigger, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *tokenKey = "token";
	node = json_object_get_member(pJsonObject, tokenKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&token, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *messageKey = "message";
	node = json_object_get_member(pJsonObject, messageKey);
	if (node !=NULL) {
	

		if (isprimitive("MessagesBase")) {
			jsonToValue(&message, node, "MessagesBase", "MessagesBase");
		} else {
			
			MessagesBase* obj = static_cast<MessagesBase*> (&message);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

Inline_response_200::Inline_response_200(char* json)
{
	this->fromJson(json);
}

char*
Inline_response_200::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getBotEmail();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *bot_emailKey = "bot_email";
	json_object_set_member(pJsonObject, bot_emailKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getBotFullName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *bot_full_nameKey = "bot_full_name";
	json_object_set_member(pJsonObject, bot_full_nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getData();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *dataKey = "data";
	json_object_set_member(pJsonObject, dataKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTrigger();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *triggerKey = "trigger";
	json_object_set_member(pJsonObject, triggerKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getToken();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *tokenKey = "token";
	json_object_set_member(pJsonObject, tokenKey, node);
	if (isprimitive("MessagesBase")) {
		MessagesBase obj = getMessage();
		node = converttoJson(&obj, "MessagesBase", "");
	}
	else {
		
		MessagesBase obj = static_cast<MessagesBase> (getMessage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *messageKey = "message";
	json_object_set_member(pJsonObject, messageKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Inline_response_200::getBotEmail()
{
	return bot_email;
}

void
Inline_response_200::setBotEmail(std::string  bot_email)
{
	this->bot_email = bot_email;
}

std::string
Inline_response_200::getBotFullName()
{
	return bot_full_name;
}

void
Inline_response_200::setBotFullName(std::string  bot_full_name)
{
	this->bot_full_name = bot_full_name;
}

std::string
Inline_response_200::getData()
{
	return data;
}

void
Inline_response_200::setData(std::string  data)
{
	this->data = data;
}

std::string
Inline_response_200::getTrigger()
{
	return trigger;
}

void
Inline_response_200::setTrigger(std::string  trigger)
{
	this->trigger = trigger;
}

std::string
Inline_response_200::getToken()
{
	return token;
}

void
Inline_response_200::setToken(std::string  token)
{
	this->token = token;
}

MessagesBase
Inline_response_200::getMessage()
{
	return message;
}

void
Inline_response_200::setMessage(MessagesBase  message)
{
	this->message = message;
}


