

#include "InvalidApiKeyError.h"

using namespace Tiny;

InvalidApiKeyError::InvalidApiKeyError()
{
	result = null;
	msg = null;
}

InvalidApiKeyError::InvalidApiKeyError(std::string jsonString)
{
	this->fromJson(jsonString);
}

InvalidApiKeyError::~InvalidApiKeyError()
{

}

void
InvalidApiKeyError::fromJson(std::string jsonObj)
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


}

bourne::json
InvalidApiKeyError::toJson()
{
    bourne::json object = bourne::json::object();

    




	object["result"] = getResult().toJson();

    




	object["msg"] = getMsg().toJson();


    return object;

}

AnyType
InvalidApiKeyError::getResult()
{
	return result;
}

void
InvalidApiKeyError::setResult(AnyType  result)
{
	this->result = result;
}

AnyType
InvalidApiKeyError::getMsg()
{
	return msg;
}

void
InvalidApiKeyError::setMsg(AnyType  msg)
{
	this->msg = msg;
}



