

#include "RateLimitedError.h"

using namespace Tiny;

RateLimitedError::RateLimitedError()
{
	result = null;
	msg = null;
	code = null;
}

RateLimitedError::RateLimitedError(std::string jsonString)
{
	this->fromJson(jsonString);
}

RateLimitedError::~RateLimitedError()
{

}

void
RateLimitedError::fromJson(std::string jsonObj)
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

    const char *codeKey = "code";
    
    if(object.has_key(codeKey)) 
    {
        bourne::json value = object[codeKey];


        

        AnyType* obj = &code;
		obj->fromJson(value.dump());

    }


}

bourne::json
RateLimitedError::toJson()
{
    bourne::json object = bourne::json::object();

    




	object["result"] = getResult().toJson();

    




	object["msg"] = getMsg().toJson();

    




	object["code"] = getCode().toJson();


    return object;

}

AnyType
RateLimitedError::getResult()
{
	return result;
}

void
RateLimitedError::setResult(AnyType  result)
{
	this->result = result;
}

AnyType
RateLimitedError::getMsg()
{
	return msg;
}

void
RateLimitedError::setMsg(AnyType  msg)
{
	this->msg = msg;
}

AnyType
RateLimitedError::getCode()
{
	return code;
}

void
RateLimitedError::setCode(AnyType  code)
{
	this->code = code;
}



