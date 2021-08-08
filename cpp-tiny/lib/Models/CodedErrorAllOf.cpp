

#include "CodedError_allOf.h"

using namespace Tiny;

CodedError_allOf::CodedError_allOf()
{
	result = null;
	msg = null;
	code = null;
}

CodedError_allOf::CodedError_allOf(std::string jsonString)
{
	this->fromJson(jsonString);
}

CodedError_allOf::~CodedError_allOf()
{

}

void
CodedError_allOf::fromJson(std::string jsonObj)
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
CodedError_allOf::toJson()
{
    bourne::json object = bourne::json::object();

    




	object["result"] = getResult().toJson();

    




	object["msg"] = getMsg().toJson();

    




	object["code"] = getCode().toJson();


    return object;

}

AnyType
CodedError_allOf::getResult()
{
	return result;
}

void
CodedError_allOf::setResult(AnyType  result)
{
	this->result = result;
}

AnyType
CodedError_allOf::getMsg()
{
	return msg;
}

void
CodedError_allOf::setMsg(AnyType  msg)
{
	this->msg = msg;
}

AnyType
CodedError_allOf::getCode()
{
	return code;
}

void
CodedError_allOf::setCode(AnyType  code)
{
	this->code = code;
}



