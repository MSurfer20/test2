

#include "CodedErrorBase.h"

using namespace Tiny;

CodedErrorBase::CodedErrorBase()
{
	result = null;
	msg = null;
	code = std::string();
}

CodedErrorBase::CodedErrorBase(std::string jsonString)
{
	this->fromJson(jsonString);
}

CodedErrorBase::~CodedErrorBase()
{

}

void
CodedErrorBase::fromJson(std::string jsonObj)
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


        
        jsonToValue(&code, value, "std::string");


    }


}

bourne::json
CodedErrorBase::toJson()
{
    bourne::json object = bourne::json::object();

    




	object["result"] = getResult().toJson();

    




	object["msg"] = getMsg().toJson();

    



    object["code"] = getCode();



    return object;

}

AnyType
CodedErrorBase::getResult()
{
	return result;
}

void
CodedErrorBase::setResult(AnyType  result)
{
	this->result = result;
}

AnyType
CodedErrorBase::getMsg()
{
	return msg;
}

void
CodedErrorBase::setMsg(AnyType  msg)
{
	this->msg = msg;
}

std::string
CodedErrorBase::getCode()
{
	return code;
}

void
CodedErrorBase::setCode(std::string  code)
{
	this->code = code;
}



