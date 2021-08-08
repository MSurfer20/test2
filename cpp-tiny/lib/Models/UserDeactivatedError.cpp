

#include "UserDeactivatedError.h"

using namespace Tiny;

UserDeactivatedError::UserDeactivatedError()
{
	result = null;
	msg = null;
	code = null;
}

UserDeactivatedError::UserDeactivatedError(std::string jsonString)
{
	this->fromJson(jsonString);
}

UserDeactivatedError::~UserDeactivatedError()
{

}

void
UserDeactivatedError::fromJson(std::string jsonObj)
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
UserDeactivatedError::toJson()
{
    bourne::json object = bourne::json::object();

    




	object["result"] = getResult().toJson();

    




	object["msg"] = getMsg().toJson();

    




	object["code"] = getCode().toJson();


    return object;

}

AnyType
UserDeactivatedError::getResult()
{
	return result;
}

void
UserDeactivatedError::setResult(AnyType  result)
{
	this->result = result;
}

AnyType
UserDeactivatedError::getMsg()
{
	return msg;
}

void
UserDeactivatedError::setMsg(AnyType  msg)
{
	this->msg = msg;
}

AnyType
UserDeactivatedError::getCode()
{
	return code;
}

void
UserDeactivatedError::setCode(AnyType  code)
{
	this->code = code;
}



