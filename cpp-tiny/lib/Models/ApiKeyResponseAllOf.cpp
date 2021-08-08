

#include "ApiKeyResponse_allOf.h"

using namespace Tiny;

ApiKeyResponse_allOf::ApiKeyResponse_allOf()
{
	result = null;
	msg = null;
	api_key = std::string();
	email = std::string();
}

ApiKeyResponse_allOf::ApiKeyResponse_allOf(std::string jsonString)
{
	this->fromJson(jsonString);
}

ApiKeyResponse_allOf::~ApiKeyResponse_allOf()
{

}

void
ApiKeyResponse_allOf::fromJson(std::string jsonObj)
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

    const char *api_keyKey = "api_key";
    
    if(object.has_key(api_keyKey)) 
    {
        bourne::json value = object[api_keyKey];


        
        jsonToValue(&api_key, value, "std::string");


    }

    const char *emailKey = "email";
    
    if(object.has_key(emailKey)) 
    {
        bourne::json value = object[emailKey];


        
        jsonToValue(&email, value, "std::string");


    }


}

bourne::json
ApiKeyResponse_allOf::toJson()
{
    bourne::json object = bourne::json::object();

    




	object["result"] = getResult().toJson();

    




	object["msg"] = getMsg().toJson();

    



    object["api_key"] = getApiKey();


    



    object["email"] = getEmail();



    return object;

}

AnyType
ApiKeyResponse_allOf::getResult()
{
	return result;
}

void
ApiKeyResponse_allOf::setResult(AnyType  result)
{
	this->result = result;
}

AnyType
ApiKeyResponse_allOf::getMsg()
{
	return msg;
}

void
ApiKeyResponse_allOf::setMsg(AnyType  msg)
{
	this->msg = msg;
}

std::string
ApiKeyResponse_allOf::getApiKey()
{
	return api_key;
}

void
ApiKeyResponse_allOf::setApiKey(std::string  api_key)
{
	this->api_key = api_key;
}

std::string
ApiKeyResponse_allOf::getEmail()
{
	return email;
}

void
ApiKeyResponse_allOf::setEmail(std::string  email)
{
	this->email = email;
}



