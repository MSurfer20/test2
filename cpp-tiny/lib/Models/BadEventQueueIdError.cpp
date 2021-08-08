

#include "BadEventQueueIdError.h"

using namespace Tiny;

BadEventQueueIdError::BadEventQueueIdError()
{
	result = null;
	msg = null;
	code = null;
	queue_id = std::string();
}

BadEventQueueIdError::BadEventQueueIdError(std::string jsonString)
{
	this->fromJson(jsonString);
}

BadEventQueueIdError::~BadEventQueueIdError()
{

}

void
BadEventQueueIdError::fromJson(std::string jsonObj)
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
BadEventQueueIdError::toJson()
{
    bourne::json object = bourne::json::object();

    




	object["result"] = getResult().toJson();

    




	object["msg"] = getMsg().toJson();

    




	object["code"] = getCode().toJson();

    



    object["queue_id"] = getQueueId();



    return object;

}

AnyType
BadEventQueueIdError::getResult()
{
	return result;
}

void
BadEventQueueIdError::setResult(AnyType  result)
{
	this->result = result;
}

AnyType
BadEventQueueIdError::getMsg()
{
	return msg;
}

void
BadEventQueueIdError::setMsg(AnyType  msg)
{
	this->msg = msg;
}

AnyType
BadEventQueueIdError::getCode()
{
	return code;
}

void
BadEventQueueIdError::setCode(AnyType  code)
{
	this->code = code;
}

std::string
BadEventQueueIdError::getQueueId()
{
	return queue_id;
}

void
BadEventQueueIdError::setQueueId(std::string  queue_id)
{
	this->queue_id = queue_id;
}



