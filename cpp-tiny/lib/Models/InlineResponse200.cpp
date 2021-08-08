

#include "Inline_response_200.h"

using namespace Tiny;

Inline_response_200::Inline_response_200()
{
	bot_email = std::string();
	bot_full_name = std::string();
	data = std::string();
	trigger = std::string();
	token = std::string();
	message = null;
}

Inline_response_200::Inline_response_200(std::string jsonString)
{
	this->fromJson(jsonString);
}

Inline_response_200::~Inline_response_200()
{

}

void
Inline_response_200::fromJson(std::string jsonObj)
{   
    bourne::json object = bourne::json::parse(jsonObj);

    const char *bot_emailKey = "bot_email";
    
    if(object.has_key(bot_emailKey)) 
    {
        bourne::json value = object[bot_emailKey];


        
        jsonToValue(&bot_email, value, "std::string");


    }

    const char *bot_full_nameKey = "bot_full_name";
    
    if(object.has_key(bot_full_nameKey)) 
    {
        bourne::json value = object[bot_full_nameKey];


        
        jsonToValue(&bot_full_name, value, "std::string");


    }

    const char *dataKey = "data";
    
    if(object.has_key(dataKey)) 
    {
        bourne::json value = object[dataKey];


        
        jsonToValue(&data, value, "std::string");


    }

    const char *triggerKey = "trigger";
    
    if(object.has_key(triggerKey)) 
    {
        bourne::json value = object[triggerKey];


        
        jsonToValue(&trigger, value, "std::string");


    }

    const char *tokenKey = "token";
    
    if(object.has_key(tokenKey)) 
    {
        bourne::json value = object[tokenKey];


        
        jsonToValue(&token, value, "std::string");


    }

    const char *messageKey = "message";
    
    if(object.has_key(messageKey)) 
    {
        bourne::json value = object[messageKey];


        

        MessagesBase* obj = &message;
		obj->fromJson(value.dump());

    }


}

bourne::json
Inline_response_200::toJson()
{
    bourne::json object = bourne::json::object();

    



    object["bot_email"] = getBotEmail();


    



    object["bot_full_name"] = getBotFullName();


    



    object["data"] = getData();


    



    object["trigger"] = getTrigger();


    



    object["token"] = getToken();


    




	object["message"] = getMessage().toJson();


    return object;

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



