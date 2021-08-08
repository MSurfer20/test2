

#include "JsonErrorBase.h"

using namespace Tiny;

JsonErrorBase::JsonErrorBase()
{
	result = std::string();
	msg = std::string();
}

JsonErrorBase::JsonErrorBase(std::string jsonString)
{
	this->fromJson(jsonString);
}

JsonErrorBase::~JsonErrorBase()
{

}

void
JsonErrorBase::fromJson(std::string jsonObj)
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
JsonErrorBase::toJson()
{
    bourne::json object = bourne::json::object();

    



    object["result"] = getResult();


    



    object["msg"] = getMsg();



    return object;

}

std::string
JsonErrorBase::getResult()
{
	return result;
}

void
JsonErrorBase::setResult(std::string  result)
{
	this->result = result;
}

std::string
JsonErrorBase::getMsg()
{
	return msg;
}

void
JsonErrorBase::setMsg(std::string  msg)
{
	this->msg = msg;
}



