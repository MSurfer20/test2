

#include "UserNotAuthorizedError.h"

using namespace Tiny;

UserNotAuthorizedError::UserNotAuthorizedError()
{
	result = null;
	msg = null;
	code = null;
}

UserNotAuthorizedError::UserNotAuthorizedError(std::string jsonString)
{
	this->fromJson(jsonString);
}

UserNotAuthorizedError::~UserNotAuthorizedError()
{

}

void
UserNotAuthorizedError::fromJson(std::string jsonObj)
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
UserNotAuthorizedError::toJson()
{
    bourne::json object = bourne::json::object();

    




	object["result"] = getResult().toJson();

    




	object["msg"] = getMsg().toJson();

    




	object["code"] = getCode().toJson();


    return object;

}

AnyType
UserNotAuthorizedError::getResult()
{
	return result;
}

void
UserNotAuthorizedError::setResult(AnyType  result)
{
	this->result = result;
}

AnyType
UserNotAuthorizedError::getMsg()
{
	return msg;
}

void
UserNotAuthorizedError::setMsg(AnyType  msg)
{
	this->msg = msg;
}

AnyType
UserNotAuthorizedError::getCode()
{
	return code;
}

void
UserNotAuthorizedError::setCode(AnyType  code)
{
	this->code = code;
}



