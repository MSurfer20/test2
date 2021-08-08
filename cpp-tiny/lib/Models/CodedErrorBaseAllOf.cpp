

#include "CodedErrorBase_allOf.h"

using namespace Tiny;

CodedErrorBase_allOf::CodedErrorBase_allOf()
{
	result = null;
	msg = null;
	code = std::string();
}

CodedErrorBase_allOf::CodedErrorBase_allOf(std::string jsonString)
{
	this->fromJson(jsonString);
}

CodedErrorBase_allOf::~CodedErrorBase_allOf()
{

}

void
CodedErrorBase_allOf::fromJson(std::string jsonObj)
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
CodedErrorBase_allOf::toJson()
{
    bourne::json object = bourne::json::object();

    




	object["result"] = getResult().toJson();

    




	object["msg"] = getMsg().toJson();

    



    object["code"] = getCode();



    return object;

}

AnyType
CodedErrorBase_allOf::getResult()
{
	return result;
}

void
CodedErrorBase_allOf::setResult(AnyType  result)
{
	this->result = result;
}

AnyType
CodedErrorBase_allOf::getMsg()
{
	return msg;
}

void
CodedErrorBase_allOf::setMsg(AnyType  msg)
{
	this->msg = msg;
}

std::string
CodedErrorBase_allOf::getCode()
{
	return code;
}

void
CodedErrorBase_allOf::setCode(std::string  code)
{
	this->code = code;
}



