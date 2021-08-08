

#include "Presence.h"

using namespace Tiny;

Presence::Presence()
{
	client = std::string();
	status = std::string();
	timestamp = int(0);
	pushable = bool(false);
}

Presence::Presence(std::string jsonString)
{
	this->fromJson(jsonString);
}

Presence::~Presence()
{

}

void
Presence::fromJson(std::string jsonObj)
{   
    bourne::json object = bourne::json::parse(jsonObj);

    const char *clientKey = "client";
    
    if(object.has_key(clientKey)) 
    {
        bourne::json value = object[clientKey];


        
        jsonToValue(&client, value, "std::string");


    }

    const char *statusKey = "status";
    
    if(object.has_key(statusKey)) 
    {
        bourne::json value = object[statusKey];


        
        jsonToValue(&status, value, "std::string");


    }

    const char *timestampKey = "timestamp";
    
    if(object.has_key(timestampKey)) 
    {
        bourne::json value = object[timestampKey];


        
        jsonToValue(&timestamp, value, "int");


    }

    const char *pushableKey = "pushable";
    
    if(object.has_key(pushableKey)) 
    {
        bourne::json value = object[pushableKey];


        
        jsonToValue(&pushable, value, "bool");


    }


}

bourne::json
Presence::toJson()
{
    bourne::json object = bourne::json::object();

    



    object["client"] = getClient();


    



    object["status"] = getStatus();


    



    object["timestamp"] = getTimestamp();


    



    object["pushable"] = isPushable();



    return object;

}

std::string
Presence::getClient()
{
	return client;
}

void
Presence::setClient(std::string  client)
{
	this->client = client;
}

std::string
Presence::getStatus()
{
	return status;
}

void
Presence::setStatus(std::string  status)
{
	this->status = status;
}

int
Presence::getTimestamp()
{
	return timestamp;
}

void
Presence::setTimestamp(int  timestamp)
{
	this->timestamp = timestamp;
}

bool
Presence::isPushable()
{
	return pushable;
}

void
Presence::setPushable(bool  pushable)
{
	this->pushable = pushable;
}



