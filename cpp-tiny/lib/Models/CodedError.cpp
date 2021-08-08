

#include "CodedError.h"

using namespace Tiny;

CodedError::CodedError()
{
	result = null;
	msg = null;
	code = null;
}

CodedError::CodedError(std::string jsonString)
{
	this->fromJson(jsonString);
}

CodedError::~CodedError()
{

}

void
CodedError::fromJson(std::string jsonObj)
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
CodedError::toJson()
{
    bourne::json object = bourne::json::object();

    




	object["result"] = getResult().toJson();

    




	object["msg"] = getMsg().toJson();

    




	object["code"] = getCode().toJson();


    return object;

}

AnyType
CodedError::getResult()
{
	return result;
}

void
CodedError::setResult(AnyType  result)
{
	this->result = result;
}

AnyType
CodedError::getMsg()
{
	return msg;
}

void
CodedError::setMsg(AnyType  msg)
{
	this->msg = msg;
}

AnyType
CodedError::getCode()
{
	return code;
}

void
CodedError::setCode(AnyType  code)
{
	this->code = code;
}



