

#include "JsonResponseBase.h"

using namespace Tiny;

JsonResponseBase::JsonResponseBase()
{
	result = std::string();
}

JsonResponseBase::JsonResponseBase(std::string jsonString)
{
	this->fromJson(jsonString);
}

JsonResponseBase::~JsonResponseBase()
{

}

void
JsonResponseBase::fromJson(std::string jsonObj)
{   
    bourne::json object = bourne::json::parse(jsonObj);

    const char *resultKey = "result";
    
    if(object.has_key(resultKey)) 
    {
        bourne::json value = object[resultKey];


        
        jsonToValue(&result, value, "std::string");


    }


}

bourne::json
JsonResponseBase::toJson()
{
    bourne::json object = bourne::json::object();

    



    object["result"] = getResult();



    return object;

}

std::string
JsonResponseBase::getResult()
{
	return result;
}

void
JsonResponseBase::setResult(std::string  result)
{
	this->result = result;
}



