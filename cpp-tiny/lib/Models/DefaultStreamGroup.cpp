

#include "DefaultStreamGroup.h"

using namespace Tiny;

DefaultStreamGroup::DefaultStreamGroup()
{
	name = std::string();
	description = std::string();
	id = int(0);
	streams = std::list<BasicStream>();
}

DefaultStreamGroup::DefaultStreamGroup(std::string jsonString)
{
	this->fromJson(jsonString);
}

DefaultStreamGroup::~DefaultStreamGroup()
{

}

void
DefaultStreamGroup::fromJson(std::string jsonObj)
{   
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";
    
    if(object.has_key(nameKey)) 
    {
        bourne::json value = object[nameKey];


        
        jsonToValue(&name, value, "std::string");


    }

    const char *descriptionKey = "description";
    
    if(object.has_key(descriptionKey)) 
    {
        bourne::json value = object[descriptionKey];


        
        jsonToValue(&description, value, "std::string");


    }

    const char *idKey = "id";
    
    if(object.has_key(idKey)) 
    {
        bourne::json value = object[idKey];


        
        jsonToValue(&id, value, "int");


    }

    const char *streamsKey = "streams";
    
    if(object.has_key(streamsKey)) 
    {
        bourne::json value = object[streamsKey];


        std::list<BasicStream> streams_list;
        BasicStream element;
        for(auto& var : value.array_range())
        {

            
            element.fromJson(var.dump());
            
            streams_list.push_back(element);
        }
        streams = streams_list;


    }


}

bourne::json
DefaultStreamGroup::toJson()
{
    bourne::json object = bourne::json::object();

    



    object["name"] = getName();


    



    object["description"] = getDescription();


    



    object["id"] = getId();


    
    

    std::list<BasicStream> streams_list = getStreams();
    bourne::json streams_arr = bourne::json::array();

    for(auto& var : streams_list)
    {
        BasicStream obj = var;
        streams_arr.append(obj.toJson());
    }
    object["streams"] = streams_arr;




    return object;

}

std::string
DefaultStreamGroup::getName()
{
	return name;
}

void
DefaultStreamGroup::setName(std::string  name)
{
	this->name = name;
}

std::string
DefaultStreamGroup::getDescription()
{
	return description;
}

void
DefaultStreamGroup::setDescription(std::string  description)
{
	this->description = description;
}

int
DefaultStreamGroup::getId()
{
	return id;
}

void
DefaultStreamGroup::setId(int  id)
{
	this->id = id;
}

std::list<BasicStream>
DefaultStreamGroup::getStreams()
{
	return streams;
}

void
DefaultStreamGroup::setStreams(std::list <BasicStream> streams)
{
	this->streams = streams;
}



