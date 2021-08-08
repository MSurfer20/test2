

#include "MissingArgumentError.h"

using namespace Tiny;

MissingArgumentError::MissingArgumentError()
{
	result = null;
	msg = null;
	code = null;
	var_name = std::string();
}

MissingArgumentError::MissingArgumentError(std::string jsonString)
{
	this->fromJson(jsonString);
}

MissingArgumentError::~MissingArgumentError()
{

}

void
MissingArgumentError::fromJson(std::string jsonObj)
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

    const char *var_nameKey = "var_name";
    
    if(object.has_key(var_nameKey)) 
    {
        bourne::json value = object[var_nameKey];


        
        jsonToValue(&var_name, value, "std::string");


    }


}

bourne::json
MissingArgumentError::toJson()
{
    bourne::json object = bourne::json::object();

    




	object["result"] = getResult().toJson();

    




	object["msg"] = getMsg().toJson();

    




	object["code"] = getCode().toJson();

    



    object["var_name"] = getVarName();



    return object;

}

AnyType
MissingArgumentError::getResult()
{
	return result;
}

void
MissingArgumentError::setResult(AnyType  result)
{
	this->result = result;
}

AnyType
MissingArgumentError::getMsg()
{
	return msg;
}

void
MissingArgumentError::setMsg(AnyType  msg)
{
	this->msg = msg;
}

AnyType
MissingArgumentError::getCode()
{
	return code;
}

void
MissingArgumentError::setCode(AnyType  code)
{
	this->code = code;
}

std::string
MissingArgumentError::getVarName()
{
	return var_name;
}

void
MissingArgumentError::setVarName(std::string  var_name)
{
	this->var_name = var_name;
}



