

#include "JsonSuccessBase.h"

using namespace Tiny;

JsonSuccessBase::JsonSuccessBase()
{
	result = std::string();
	msg = std::string();
}

JsonSuccessBase::JsonSuccessBase(std::string jsonString)
{
	this->fromJson(jsonString);
}

JsonSuccessBase::~JsonSuccessBase()
{

}

void
JsonSuccessBase::fromJson(std::string jsonObj)
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
JsonSuccessBase::toJson()
{
    bourne::json object = bourne::json::object();

    



    object["result"] = getResult();


    



    object["msg"] = getMsg();



    return object;

}

std::string
JsonSuccessBase::getResult()
{
	return result;
}

void
JsonSuccessBase::setResult(std::string  result)
{
	this->result = result;
}

std::string
JsonSuccessBase::getMsg()
{
	return msg;
}

void
JsonSuccessBase::setMsg(std::string  msg)
{
	this->msg = msg;
}



