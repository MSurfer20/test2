

#include "RealmDeactivatedError.h"

using namespace Tiny;

RealmDeactivatedError::RealmDeactivatedError()
{
	result = null;
	msg = null;
	code = null;
}

RealmDeactivatedError::RealmDeactivatedError(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealmDeactivatedError::~RealmDeactivatedError()
{

}

void
RealmDeactivatedError::fromJson(std::string jsonObj)
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
RealmDeactivatedError::toJson()
{
    bourne::json object = bourne::json::object();

    




	object["result"] = getResult().toJson();

    




	object["msg"] = getMsg().toJson();

    




	object["code"] = getCode().toJson();


    return object;

}

AnyType
RealmDeactivatedError::getResult()
{
	return result;
}

void
RealmDeactivatedError::setResult(AnyType  result)
{
	this->result = result;
}

AnyType
RealmDeactivatedError::getMsg()
{
	return msg;
}

void
RealmDeactivatedError::setMsg(AnyType  msg)
{
	this->msg = msg;
}

AnyType
RealmDeactivatedError::getCode()
{
	return code;
}

void
RealmDeactivatedError::setCode(AnyType  code)
{
	this->code = code;
}



