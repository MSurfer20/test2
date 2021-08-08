

#include "Draft.h"

using namespace Tiny;

Draft::Draft()
{
	id = int(0);
	type = std::string();
	to = std::list<int>();
	topic = std::string();
	content = std::string();
	timestamp = float(0);
}

Draft::Draft(std::string jsonString)
{
	this->fromJson(jsonString);
}

Draft::~Draft()
{

}

void
Draft::fromJson(std::string jsonObj)
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


        
        jsonToValue(&type, value, "std::string");


    }

    const char *toKey = "to";
    
    if(object.has_key(toKey)) 
    {
        bourne::json value = object[toKey];


        std::list<int> to_list;
        int element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "int");
            
            
            to_list.push_back(element);
        }
        to = to_list;


    }

    const char *topicKey = "topic";
    
    if(object.has_key(topicKey)) 
    {
        bourne::json value = object[topicKey];


        
        jsonToValue(&topic, value, "std::string");


    }

    const char *contentKey = "content";
    
    if(object.has_key(contentKey)) 
    {
        bourne::json value = object[contentKey];


        
        jsonToValue(&content, value, "std::string");


    }

    const char *timestampKey = "timestamp";
    
    if(object.has_key(timestampKey)) 
    {
        bourne::json value = object[timestampKey];


        
        jsonToValue(&timestamp, value, "long");


    }


}

bourne::json
Draft::toJson()
{
    bourne::json object = bourne::json::object();

    



    object["id"] = getId();


    



    object["type"] = getType();


    
    
    
    std::list<int> to_list = getTo();
    bourne::json to_arr = bourne::json::array();

    for(auto& var : to_list)
    {
        to_arr.append(var);
    }
    object["to"] = to_arr;

    



    



    object["topic"] = getTopic();


    



    object["content"] = getContent();


    



    object["timestamp"] = getTimestamp();



    return object;

}

int
Draft::getId()
{
	return id;
}

void
Draft::setId(int  id)
{
	this->id = id;
}

std::string
Draft::getType()
{
	return type;
}

void
Draft::setType(std::string  type)
{
	this->type = type;
}

std::list<int>
Draft::getTo()
{
	return to;
}

void
Draft::setTo(std::list <int> to)
{
	this->to = to;
}

std::string
Draft::getTopic()
{
	return topic;
}

void
Draft::setTopic(std::string  topic)
{
	this->topic = topic;
}

std::string
Draft::getContent()
{
	return content;
}

void
Draft::setContent(std::string  content)
{
	this->content = content;
}

long
Draft::getTimestamp()
{
	return timestamp;
}

void
Draft::setTimestamp(long  timestamp)
{
	this->timestamp = timestamp;
}



