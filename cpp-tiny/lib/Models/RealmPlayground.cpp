

#include "RealmPlayground.h"

using namespace Tiny;

RealmPlayground::RealmPlayground()
{
	id = int(0);
	name = std::string();
	pygments_language = std::string();
	url_prefix = std::string();
}

RealmPlayground::RealmPlayground(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealmPlayground::~RealmPlayground()
{

}

void
RealmPlayground::fromJson(std::string jsonObj)
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

    const char *pygments_languageKey = "pygments_language";
    
    if(object.has_key(pygments_languageKey)) 
    {
        bourne::json value = object[pygments_languageKey];


        
        jsonToValue(&pygments_language, value, "std::string");


    }

    const char *url_prefixKey = "url_prefix";
    
    if(object.has_key(url_prefixKey)) 
    {
        bourne::json value = object[url_prefixKey];


        
        jsonToValue(&url_prefix, value, "std::string");


    }


}

bourne::json
RealmPlayground::toJson()
{
    bourne::json object = bourne::json::object();

    



    object["id"] = getId();


    



    object["name"] = getName();


    



    object["pygments_language"] = getPygmentsLanguage();


    



    object["url_prefix"] = getUrlPrefix();



    return object;

}

int
RealmPlayground::getId()
{
	return id;
}

void
RealmPlayground::setId(int  id)
{
	this->id = id;
}

std::string
RealmPlayground::getName()
{
	return name;
}

void
RealmPlayground::setName(std::string  name)
{
	this->name = name;
}

std::string
RealmPlayground::getPygmentsLanguage()
{
	return pygments_language;
}

void
RealmPlayground::setPygmentsLanguage(std::string  pygments_language)
{
	this->pygments_language = pygments_language;
}

std::string
RealmPlayground::getUrlPrefix()
{
	return url_prefix;
}

void
RealmPlayground::setUrlPrefix(std::string  url_prefix)
{
	this->url_prefix = url_prefix;
}



