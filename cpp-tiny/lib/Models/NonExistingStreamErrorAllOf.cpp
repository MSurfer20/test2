

#include "NonExistingStreamError_allOf.h"

using namespace Tiny;

NonExistingStreamError_allOf::NonExistingStreamError_allOf()
{
	result = null;
	msg = null;
	code = null;
	stream = std::string();
}

NonExistingStreamError_allOf::NonExistingStreamError_allOf(std::string jsonString)
{
	this->fromJson(jsonString);
}

NonExistingStreamError_allOf::~NonExistingStreamError_allOf()
{

}

void
NonExistingStreamError_allOf::fromJson(std::string jsonObj)
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

    const char *streamKey = "stream";
    
    if(object.has_key(streamKey)) 
    {
        bourne::json value = object[streamKey];


        
        jsonToValue(&stream, value, "std::string");


    }


}

bourne::json
NonExistingStreamError_allOf::toJson()
{
    bourne::json object = bourne::json::object();

    




	object["result"] = getResult().toJson();

    




	object["msg"] = getMsg().toJson();

    




	object["code"] = getCode().toJson();

    



    object["stream"] = getStream();



    return object;

}

AnyType
NonExistingStreamError_allOf::getResult()
{
	return result;
}

void
NonExistingStreamError_allOf::setResult(AnyType  result)
{
	this->result = result;
}

AnyType
NonExistingStreamError_allOf::getMsg()
{
	return msg;
}

void
NonExistingStreamError_allOf::setMsg(AnyType  msg)
{
	this->msg = msg;
}

AnyType
NonExistingStreamError_allOf::getCode()
{
	return code;
}

void
NonExistingStreamError_allOf::setCode(AnyType  code)
{
	this->code = code;
}

std::string
NonExistingStreamError_allOf::getStream()
{
	return stream;
}

void
NonExistingStreamError_allOf::setStream(std::string  stream)
{
	this->stream = stream;
}



