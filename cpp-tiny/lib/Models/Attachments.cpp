

#include "Attachments.h"

using namespace Tiny;

Attachments::Attachments()
{
	id = int(0);
	name = std::string();
	path_id = std::string();
	size = int(0);
	create_time = int(0);
	messages = std::list<Attachments_messages>();
}

Attachments::Attachments(std::string jsonString)
{
	this->fromJson(jsonString);
}

Attachments::~Attachments()
{

}

void
Attachments::fromJson(std::string jsonObj)
{   
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";
    
    if(object.has_key(idKey)) 
    {
        bourne::json value = object[idKey];


        
        jsonToValue(&id, value, "int");


    }

    const char *nameKey = "name";
    
    if(object.has_key(nameKey)) 
    {
        bourne::json value = object[nameKey];


        
        jsonToValue(&name, value, "std::string");


    }

    const char *path_idKey = "path_id";
    
    if(object.has_key(path_idKey)) 
    {
        bourne::json value = object[path_idKey];


        
        jsonToValue(&path_id, value, "std::string");


    }

    const char *sizeKey = "size";
    
    if(object.has_key(sizeKey)) 
    {
        bourne::json value = object[sizeKey];


        
        jsonToValue(&size, value, "int");


    }

    const char *create_timeKey = "create_time";
    
    if(object.has_key(create_timeKey)) 
    {
        bourne::json value = object[create_timeKey];


        
        jsonToValue(&create_time, value, "int");


    }

    const char *messagesKey = "messages";
    
    if(object.has_key(messagesKey)) 
    {
        bourne::json value = object[messagesKey];


        std::list<Attachments_messages> messages_list;
        Attachments_messages element;
        for(auto& var : value.array_range())
        {

            
            element.fromJson(var.dump());
            
            messages_list.push_back(element);
        }
        messages = messages_list;


    }


}

bourne::json
Attachments::toJson()
{
    bourne::json object = bourne::json::object();

    



    object["id"] = getId();


    



    object["name"] = getName();


    



    object["path_id"] = getPathId();


    



    object["size"] = getSize();


    



    object["create_time"] = getCreateTime();


    
    

    std::list<Attachments_messages> messages_list = getMessages();
    bourne::json messages_arr = bourne::json::array();

    for(auto& var : messages_list)
    {
        Attachments_messages obj = var;
        messages_arr.append(obj.toJson());
    }
    object["messages"] = messages_arr;




    return object;

}

int
Attachments::getId()
{
	return id;
}

void
Attachments::setId(int  id)
{
	this->id = id;
}

std::string
Attachments::getName()
{
	return name;
}

void
Attachments::setName(std::string  name)
{
	this->name = name;
}

std::string
Attachments::getPathId()
{
	return path_id;
}

void
Attachments::setPathId(std::string  path_id)
{
	this->path_id = path_id;
}

int
Attachments::getSize()
{
	return size;
}

void
Attachments::setSize(int  size)
{
	this->size = size;
}

int
Attachments::getCreateTime()
{
	return create_time;
}

void
Attachments::setCreateTime(int  create_time)
{
	this->create_time = create_time;
}

std::list<Attachments_messages>
Attachments::getMessages()
{
	return messages;
}

void
Attachments::setMessages(std::list <Attachments_messages> messages)
{
	this->messages = messages;
}



