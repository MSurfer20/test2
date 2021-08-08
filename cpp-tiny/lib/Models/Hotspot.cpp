

#include "Hotspot.h"

using namespace Tiny;

Hotspot::Hotspot()
{
	delay = float(0);
	name = std::string();
	title = std::string();
	description = std::string();
}

Hotspot::Hotspot(std::string jsonString)
{
	this->fromJson(jsonString);
}

Hotspot::~Hotspot()
{

}

void
Hotspot::fromJson(std::string jsonObj)
{   
    bourne::json object = bourne::json::parse(jsonObj);

    const char *delayKey = "delay";
    
    if(object.has_key(delayKey)) 
    {
        bourne::json value = object[delayKey];


        
        jsonToValue(&delay, value, "long");


    }

    const char *nameKey = "name";
    
    if(object.has_key(nameKey)) 
    {
        bourne::json value = object[nameKey];


        
        jsonToValue(&name, value, "std::string");


    }

    const char *titleKey = "title";
    
    if(object.has_key(titleKey)) 
    {
        bourne::json value = object[titleKey];


        
        jsonToValue(&title, value, "std::string");


    }

    const char *descriptionKey = "description";
    
    if(object.has_key(descriptionKey)) 
    {
        bourne::json value = object[descriptionKey];


        
        jsonToValue(&description, value, "std::string");


    }


}

bourne::json
Hotspot::toJson()
{
    bourne::json object = bourne::json::object();

    



    object["delay"] = getDelay();


    



    object["name"] = getName();


    



    object["title"] = getTitle();


    



    object["description"] = getDescription();



    return object;

}

long
Hotspot::getDelay()
{
	return delay;
}

void
Hotspot::setDelay(long  delay)
{
	this->delay = delay;
}

std::string
Hotspot::getName()
{
	return name;
}

void
Hotspot::setName(std::string  name)
{
	this->name = name;
}

std::string
Hotspot::getTitle()
{
	return title;
}

void
Hotspot::setTitle(std::string  title)
{
	this->title = title;
}

std::string
Hotspot::getDescription()
{
	return description;
}

void
Hotspot::setDescription(std::string  description)
{
	this->description = description;
}



