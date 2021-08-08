

#include "BadEventQueueIdError_allOf.h"

using namespace Tiny;

BadEventQueueIdError_allOf::BadEventQueueIdError_allOf()
{
	result = null;
	msg = null;
	code = null;
	queue_id = std::string();
}

BadEventQueueIdError_allOf::BadEventQueueIdError_allOf(std::string jsonString)
{
	this->fromJson(jsonString);
}

BadEventQueueIdError_allOf::~BadEventQueueIdError_allOf()
{

}

void
BadEventQueueIdError_allOf::fromJson(std::string jsonObj)
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

    const char *queue_idKey = "queue_id";
    
    if(object.has_key(queue_idKey)) 
    {
        bourne::json value = object[queue_idKey];


        
        jsonToValue(&queue_id, value, "std::string");


    }


}

bourne::json
BadEventQueueIdError_allOf::toJson()
{
    bourne::json object = bourne::json::object();

    




	object["result"] = getResult().toJson();

    




	object["msg"] = getMsg().toJson();

    




	object["code"] = getCode().toJson();

    



    object["queue_id"] = getQueueId();



    return object;

}

AnyType
BadEventQueueIdError_allOf::getResult()
{
	return result;
}

void
BadEventQueueIdError_allOf::setResult(AnyType  result)
{
	this->result = result;
}

AnyType
BadEventQueueIdError_allOf::getMsg()
{
	return msg;
}

void
BadEventQueueIdError_allOf::setMsg(AnyType  msg)
{
	this->msg = msg;
}

AnyType
BadEventQueueIdError_allOf::getCode()
{
	return code;
}

void
BadEventQueueIdError_allOf::setCode(AnyType  code)
{
	this->code = code;
}

std::string
BadEventQueueIdError_allOf::getQueueId()
{
	return queue_id;
}

void
BadEventQueueIdError_allOf::setQueueId(std::string  queue_id)
{
	this->queue_id = queue_id;
}



