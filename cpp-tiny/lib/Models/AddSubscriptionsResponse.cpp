

#include "AddSubscriptionsResponse.h"

using namespace Tiny;

AddSubscriptionsResponse::AddSubscriptionsResponse()
{
	result = null;
	msg = null;
	subscribed = null<std::list>();
	already_subscribed = null<std::list>();
	unauthorized = std::list<std::string>();
}

AddSubscriptionsResponse::AddSubscriptionsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

AddSubscriptionsResponse::~AddSubscriptionsResponse()
{

}

void
AddSubscriptionsResponse::fromJson(std::string jsonObj)
{   
    bourne::json object = bourne::json::parse(jsonObj);

    const char *resultKey = "result";
    
    if(object.has_key(resultKey)) 
    {
        bourne::json value = object[resultKey];


        

        AnyType* obj = &result;
		obj->fromJson(value.dump());

    }

    const char *msgKey = "msg";
    
    if(object.has_key(msgKey)) 
    {
        bourne::json value = object[msgKey];


        

        AnyType* obj = &msg;
		obj->fromJson(value.dump());

    }

    const char *subscribedKey = "subscribed";
    
    if(object.has_key(subscribedKey)) 
    {
        bourne::json value = object[subscribedKey];


    }

    const char *already_subscribedKey = "already_subscribed";
    
    if(object.has_key(already_subscribedKey)) 
    {
        bourne::json value = object[already_subscribedKey];


    }

    const char *unauthorizedKey = "unauthorized";
    
    if(object.has_key(unauthorizedKey)) 
    {
        bourne::json value = object[unauthorizedKey];


        std::list<std::string> unauthorized_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");
            
            
            unauthorized_list.push_back(element);
        }
        unauthorized = unauthorized_list;


    }


}

bourne::json
AddSubscriptionsResponse::toJson()
{
    bourne::json object = bourne::json::object();

    




	object["result"] = getResult().toJson();

    




	object["msg"] = getMsg().toJson();

    


    


    
    
    
    std::list<std::string> unauthorized_list = getUnauthorized();
    bourne::json unauthorized_arr = bourne::json::array();

    for(auto& var : unauthorized_list)
    {
        unauthorized_arr.append(var);
    }
    object["unauthorized"] = unauthorized_arr;

    




    return object;

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

Map<string, string>
AddSubscriptionsResponse::getSubscribed()
{
	return subscribed;
}

void
AddSubscriptionsResponse::setSubscribed(Map <string, string> subscribed)
{
	this->subscribed = subscribed;
}

Map<string, string>
AddSubscriptionsResponse::getAlreadySubscribed()
{
	return already_subscribed;
}

void
AddSubscriptionsResponse::setAlreadySubscribed(Map <string, string> already_subscribed)
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



