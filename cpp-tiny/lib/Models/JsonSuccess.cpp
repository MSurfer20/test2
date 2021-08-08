

#include "JsonSuccess.h"

using namespace Tiny;

JsonSuccess::JsonSuccess()
{
	result = null;
	msg = null;
}

JsonSuccess::JsonSuccess(std::string jsonString)
{
	this->fromJson(jsonString);
}

JsonSuccess::~JsonSuccess()
{

}

void
JsonSuccess::fromJson(std::string jsonObj)
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
JsonSuccess::toJson()
{
    bourne::json object = bourne::json::object();

    




	object["result"] = getResult().toJson();

    




	object["msg"] = getMsg().toJson();


    return object;

}

AnyType
JsonSuccess::getResult()
{
	return result;
}

void
JsonSuccess::setResult(AnyType  result)
{
	this->result = result;
}

AnyType
JsonSuccess::getMsg()
{
	return msg;
}

void
JsonSuccess::setMsg(AnyType  msg)
{
	this->msg = msg;
}



