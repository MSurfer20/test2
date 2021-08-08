

#include "RealmEmoji.h"

using namespace Tiny;

RealmEmoji::RealmEmoji()
{
	id = std::string();
	name = std::string();
	source_url = std::string();
	deactivated = bool(false);
	author_id = int(0);
}

RealmEmoji::RealmEmoji(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealmEmoji::~RealmEmoji()
{

}

void
RealmEmoji::fromJson(std::string jsonObj)
{   
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";
    
    if(object.has_key(idKey)) 
    {
        bourne::json value = object[idKey];


        
        jsonToValue(&id, value, "std::string");


    }

    const char *nameKey = "name";
    
    if(object.has_key(nameKey)) 
    {
        bourne::json value = object[nameKey];


        
        jsonToValue(&name, value, "std::string");


    }

    const char *source_urlKey = "source_url";
    
    if(object.has_key(source_urlKey)) 
    {
        bourne::json value = object[source_urlKey];


        
        jsonToValue(&source_url, value, "std::string");


    }

    const char *deactivatedKey = "deactivated";
    
    if(object.has_key(deactivatedKey)) 
    {
        bourne::json value = object[deactivatedKey];


        
        jsonToValue(&deactivated, value, "bool");


    }

    const char *author_idKey = "author_id";
    
    if(object.has_key(author_idKey)) 
    {
        bourne::json value = object[author_idKey];


        
        jsonToValue(&author_id, value, "int");


    }


}

bourne::json
RealmEmoji::toJson()
{
    bourne::json object = bourne::json::object();

    



    object["id"] = getId();


    



    object["name"] = getName();


    



    object["source_url"] = getSourceUrl();


    



    object["deactivated"] = isDeactivated();


    



    object["author_id"] = getAuthorId();



    return object;

}

std::string
RealmEmoji::getId()
{
	return id;
}

void
RealmEmoji::setId(std::string  id)
{
	this->id = id;
}

std::string
RealmEmoji::getName()
{
	return name;
}

void
RealmEmoji::setName(std::string  name)
{
	this->name = name;
}

std::string
RealmEmoji::getSourceUrl()
{
	return source_url;
}

void
RealmEmoji::setSourceUrl(std::string  source_url)
{
	this->source_url = source_url;
}

bool
RealmEmoji::isDeactivated()
{
	return deactivated;
}

void
RealmEmoji::setDeactivated(bool  deactivated)
{
	this->deactivated = deactivated;
}

int
RealmEmoji::getAuthorId()
{
	return author_id;
}

void
RealmEmoji::setAuthorId(int  author_id)
{
	this->author_id = author_id;
}



