

#include "JsonSuccessBase_allOf.h"

using namespace Tiny;

JsonSuccessBase_allOf::JsonSuccessBase_allOf()
{
	result = std::string();
	msg = std::string();
}

JsonSuccessBase_allOf::JsonSuccessBase_allOf(std::string jsonString)
{
	this->fromJson(jsonString);
}

JsonSuccessBase_allOf::~JsonSuccessBase_allOf()
{

}

void
JsonSuccessBase_allOf::fromJson(std::string jsonObj)
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
JsonSuccessBase_allOf::toJson()
{
    bourne::json object = bourne::json::object();

    



    object["result"] = getResult();


    



    object["msg"] = getMsg();



    return object;

}

std::string
JsonSuccessBase_allOf::getResult()
{
	return result;
}

void
JsonSuccessBase_allOf::setResult(std::string  result)
{
	this->result = result;
}

std::string
JsonSuccessBase_allOf::getMsg()
{
	return msg;
}

void
JsonSuccessBase_allOf::setMsg(std::string  msg)
{
	this->msg = msg;
}



