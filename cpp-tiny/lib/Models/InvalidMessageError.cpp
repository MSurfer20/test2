

#include "InvalidMessageError.h"

using namespace Tiny;

InvalidMessageError::InvalidMessageError()
{
	result = null;
	msg = null;
	raw_content = std::string();
}

InvalidMessageError::InvalidMessageError(std::string jsonString)
{
	this->fromJson(jsonString);
}

InvalidMessageError::~InvalidMessageError()
{

}

void
InvalidMessageError::fromJson(std::string jsonObj)
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

    const char *raw_contentKey = "raw_content";
    
    if(object.has_key(raw_contentKey)) 
    {
        bourne::json value = object[raw_contentKey];


        
        jsonToValue(&raw_content, value, "std::string");


    }


}

bourne::json
InvalidMessageError::toJson()
{
    bourne::json object = bourne::json::object();

    




	object["result"] = getResult().toJson();

    




	object["msg"] = getMsg().toJson();

    



    object["raw_content"] = getRawContent();



    return object;

}

AnyType
InvalidMessageError::getResult()
{
	return result;
}

void
InvalidMessageError::setResult(AnyType  result)
{
	this->result = result;
}

AnyType
InvalidMessageError::getMsg()
{
	return msg;
}

void
InvalidMessageError::setMsg(AnyType  msg)
{
	this->msg = msg;
}

std::string
InvalidMessageError::getRawContent()
{
	return raw_content;
}

void
InvalidMessageError::setRawContent(std::string  raw_content)
{
	this->raw_content = raw_content;
}



