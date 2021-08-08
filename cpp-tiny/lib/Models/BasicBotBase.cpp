

#include "BasicBotBase.h"

using namespace Tiny;

BasicBotBase::BasicBotBase()
{
	user_id = int(0);
	full_name = std::string();
	api_key = std::string();
	default_sending_stream = std::string();
	default_events_register_stream = std::string();
	default_all_public_streams = bool(false);
	avatar_url = std::string();
	owner_id = int(0);
	services = std::list<OneOf&lt;object,object&gt;>();
}

BasicBotBase::BasicBotBase(std::string jsonString)
{
	this->fromJson(jsonString);
}

BasicBotBase::~BasicBotBase()
{

}

void
BasicBotBase::fromJson(std::string jsonObj)
{   
    bourne::json object = bourne::json::parse(jsonObj);

    const char *user_idKey = "user_id";
    
    if(object.has_key(user_idKey)) 
    {
        bourne::json value = object[user_idKey];


        
        jsonToValue(&user_id, value, "int");


    }

    const char *full_nameKey = "full_name";
    
    if(object.has_key(full_nameKey)) 
    {
        bourne::json value = object[full_nameKey];


        
        jsonToValue(&full_name, value, "std::string");


    }

    const char *api_keyKey = "api_key";
    
    if(object.has_key(api_keyKey)) 
    {
        bourne::json value = object[api_keyKey];


        
        jsonToValue(&api_key, value, "std::string");


    }

    const char *default_sending_streamKey = "default_sending_stream";
    
    if(object.has_key(default_sending_streamKey)) 
    {
        bourne::json value = object[default_sending_streamKey];


        
        jsonToValue(&default_sending_stream, value, "std::string");


    }

    const char *default_events_register_streamKey = "default_events_register_stream";
    
    if(object.has_key(default_events_register_streamKey)) 
    {
        bourne::json value = object[default_events_register_streamKey];


        
        jsonToValue(&default_events_register_stream, value, "std::string");


    }

    const char *default_all_public_streamsKey = "default_all_public_streams";
    
    if(object.has_key(default_all_public_streamsKey)) 
    {
        bourne::json value = object[default_all_public_streamsKey];


        
        jsonToValue(&default_all_public_streams, value, "bool");


    }

    const char *avatar_urlKey = "avatar_url";
    
    if(object.has_key(avatar_urlKey)) 
    {
        bourne::json value = object[avatar_urlKey];


        
        jsonToValue(&avatar_url, value, "std::string");


    }

    const char *owner_idKey = "owner_id";
    
    if(object.has_key(owner_idKey)) 
    {
        bourne::json value = object[owner_idKey];


        
        jsonToValue(&owner_id, value, "int");


    }

    const char *servicesKey = "services";
    
    if(object.has_key(servicesKey)) 
    {
        bourne::json value = object[servicesKey];


        std::list<OneOf&lt;object,object&gt;> services_list;
        OneOf&lt;object,object&gt; element;
        for(auto& var : value.array_range())
        {

            
            element.fromJson(var.dump());
            
            services_list.push_back(element);
        }
        services = services_list;


    }


}

bourne::json
BasicBotBase::toJson()
{
    bourne::json object = bourne::json::object();

    



    object["user_id"] = getUserId();


    



    object["full_name"] = getFullName();


    



    object["api_key"] = getApiKey();


    



    object["default_sending_stream"] = getDefaultSendingStream();


    



    object["default_events_register_stream"] = getDefaultEventsRegisterStream();


    



    object["default_all_public_streams"] = isDefaultAllPublicStreams();


    



    object["avatar_url"] = getAvatarUrl();


    



    object["owner_id"] = getOwnerId();


    
    

    std::list<OneOf&lt;object,object&gt;> services_list = getServices();
    bourne::json services_arr = bourne::json::array();

    for(auto& var : services_list)
    {
        OneOf&lt;object,object&gt; obj = var;
        services_arr.append(obj.toJson());
    }
    object["services"] = services_arr;




    return object;

}

int
BasicBotBase::getUserId()
{
	return user_id;
}

void
BasicBotBase::setUserId(int  user_id)
{
	this->user_id = user_id;
}

std::string
BasicBotBase::getFullName()
{
	return full_name;
}

void
BasicBotBase::setFullName(std::string  full_name)
{
	this->full_name = full_name;
}

std::string
BasicBotBase::getApiKey()
{
	return api_key;
}

void
BasicBotBase::setApiKey(std::string  api_key)
{
	this->api_key = api_key;
}

std::string
BasicBotBase::getDefaultSendingStream()
{
	return default_sending_stream;
}

void
BasicBotBase::setDefaultSendingStream(std::string  default_sending_stream)
{
	this->default_sending_stream = default_sending_stream;
}

std::string
BasicBotBase::getDefaultEventsRegisterStream()
{
	return default_events_register_stream;
}

void
BasicBotBase::setDefaultEventsRegisterStream(std::string  default_events_register_stream)
{
	this->default_events_register_stream = default_events_register_stream;
}

bool
BasicBotBase::isDefaultAllPublicStreams()
{
	return default_all_public_streams;
}

void
BasicBotBase::setDefaultAllPublicStreams(bool  default_all_public_streams)
{
	this->default_all_public_streams = default_all_public_streams;
}

std::string
BasicBotBase::getAvatarUrl()
{
	return avatar_url;
}

void
BasicBotBase::setAvatarUrl(std::string  avatar_url)
{
	this->avatar_url = avatar_url;
}

int
BasicBotBase::getOwnerId()
{
	return owner_id;
}

void
BasicBotBase::setOwnerId(int  owner_id)
{
	this->owner_id = owner_id;
}

std::list<OneOf&lt;object,object&gt;>
BasicBotBase::getServices()
{
	return services;
}

void
BasicBotBase::setServices(std::list <OneOf&lt;object,object&gt;> services)
{
	this->services = services;
}



