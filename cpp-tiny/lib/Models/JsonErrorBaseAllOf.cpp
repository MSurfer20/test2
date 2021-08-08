

#include "JsonErrorBase_allOf.h"

using namespace Tiny;

JsonErrorBase_allOf::JsonErrorBase_allOf()
{
	result = std::string();
	msg = std::string();
}

JsonErrorBase_allOf::JsonErrorBase_allOf(std::string jsonString)
{
	this->fromJson(jsonString);
}

JsonErrorBase_allOf::~JsonErrorBase_allOf()
{

}

void
JsonErrorBase_allOf::fromJson(std::string jsonObj)
{   
    bourne::json object = bourne::json::parse(jsonObj);

    const char *resultKey = "result";
    
    if(object.has_key(resultKey)) 
    {
        bourne::json value = object[resultKey];


        
        jsonToValue(&result, value, "std::string");


    }

    const char *msgKey = "msg";
    
    if(object.has_key(msgKey)) 
    {
        bourne::json value = object[msgKey];


        
        jsonToValue(&msg, value, "std::string");


    }


}

bourne::json
JsonErrorBase_allOf::toJson()
{
    bourne::json object = bourne::json::object();

    



    object["result"] = getResult();


    



    object["msg"] = getMsg();



    return object;

}

std::string
JsonErrorBase_allOf::getResult()
{
	return result;
}

void
JsonErrorBase_allOf::setResult(std::string  result)
{
	this->result = result;
}

std::string
JsonErrorBase_allOf::getMsg()
{
	return msg;
}

void
JsonErrorBase_allOf::setMsg(std::string  msg)
{
	this->msg = msg;
}



