

#include "CustomProfileField.h"

using namespace Tiny;

CustomProfileField::CustomProfileField()
{
	id = int(0);
	type = int(0);
	order = int(0);
	name = std::string();
	hint = std::string();
	field_data = std::string();
}

CustomProfileField::CustomProfileField(std::string jsonString)
{
	this->fromJson(jsonString);
}

CustomProfileField::~CustomProfileField()
{

}

void
CustomProfileField::fromJson(std::string jsonObj)
{   
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";
    
    if(object.has_key(idKey)) 
    {
        bourne::json value = object[idKey];


        
        jsonToValue(&id, value, "int");


    }

    const char *typeKey = "type";
    
    if(object.has_key(typeKey)) 
    {
        bourne::json value = object[typeKey];


        
        jsonToValue(&type, value, "int");


    }

    const char *orderKey = "order";
    
    if(object.has_key(orderKey)) 
    {
        bourne::json value = object[orderKey];


        
        jsonToValue(&order, value, "int");


    }

    const char *nameKey = "name";
    
    if(object.has_key(nameKey)) 
    {
        bourne::json value = object[nameKey];


        
        jsonToValue(&name, value, "std::string");


    }

    const char *hintKey = "hint";
    
    if(object.has_key(hintKey)) 
    {
        bourne::json value = object[hintKey];


        
        jsonToValue(&hint, value, "std::string");


    }

    const char *field_dataKey = "field_data";
    
    if(object.has_key(field_dataKey)) 
    {
        bourne::json value = object[field_dataKey];


        
        jsonToValue(&field_data, value, "std::string");


    }


}

bourne::json
CustomProfileField::toJson()
{
    bourne::json object = bourne::json::object();

    



    object["id"] = getId();


    



    object["type"] = getType();


    



    object["order"] = getOrder();


    



    object["name"] = getName();


    



    object["hint"] = getHint();


    



    object["field_data"] = getFieldData();



    return object;

}

int
CustomProfileField::getId()
{
	return id;
}

void
CustomProfileField::setId(int  id)
{
	this->id = id;
}

int
CustomProfileField::getType()
{
	return type;
}

void
CustomProfileField::setType(int  type)
{
	this->type = type;
}

int
CustomProfileField::getOrder()
{
	return order;
}

void
CustomProfileField::setOrder(int  order)
{
	this->order = order;
}

std::string
CustomProfileField::getName()
{
	return name;
}

void
CustomProfileField::setName(std::string  name)
{
	this->name = name;
}

std::string
CustomProfileField::getHint()
{
	return hint;
}

void
CustomProfileField::setHint(std::string  hint)
{
	this->hint = hint;
}

std::string
CustomProfileField::getFieldData()
{
	return field_data;
}

void
CustomProfileField::setFieldData(std::string  field_data)
{
	this->field_data = field_data;
}



