

#include "JsonError.h"

using namespace Tiny;

JsonError::JsonError()
{
	result = null;
	msg = null;
}

JsonError::JsonError(std::string jsonString)
{
	this->fromJson(jsonString);
}

JsonError::~JsonError()
{

}

void
JsonError::fromJson(std::string jsonObj)
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
JsonError::toJson()
{
    bourne::json object = bourne::json::object();

    




	object["result"] = getResult().toJson();

    




	object["msg"] = getMsg().toJson();


    return object;

}

AnyType
JsonError::getResult()
{
	return result;
}

void
JsonError::setResult(AnyType  result)
{
	this->result = result;
}

AnyType
JsonError::getMsg()
{
	return msg;
}

void
JsonError::setMsg(AnyType  msg)
{
	this->msg = msg;
}



