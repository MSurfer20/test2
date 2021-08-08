

#include "JsonSuccess_allOf.h"

using namespace Tiny;

JsonSuccess_allOf::JsonSuccess_allOf()
{
	result = null;
	msg = null;
}

JsonSuccess_allOf::JsonSuccess_allOf(std::string jsonString)
{
	this->fromJson(jsonString);
}

JsonSuccess_allOf::~JsonSuccess_allOf()
{

}

void
JsonSuccess_allOf::fromJson(std::string jsonObj)
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
JsonSuccess_allOf::toJson()
{
    bourne::json object = bourne::json::object();

    




	object["result"] = getResult().toJson();

    




	object["msg"] = getMsg().toJson();


    return object;

}

AnyType
JsonSuccess_allOf::getResult()
{
	return result;
}

void
JsonSuccess_allOf::setResult(AnyType  result)
{
	this->result = result;
}

AnyType
JsonSuccess_allOf::getMsg()
{
	return msg;
}

void
JsonSuccess_allOf::setMsg(AnyType  msg)
{
	this->msg = msg;
}



