

#include "BasicBot_allOf.h"

using namespace Tiny;

BasicBot_allOf::BasicBot_allOf()
{
	user_id = null;
	full_name = null;
	api_key = null;
	default_sending_stream = null;
	default_events_register_stream = null;
	default_all_public_streams = null;
	avatar_url = null;
	owner_id = null;
	services = null;
}

BasicBot_allOf::BasicBot_allOf(std::string jsonString)
{
	this->fromJson(jsonString);
}

BasicBot_allOf::~BasicBot_allOf()
{

}

void
BasicBot_allOf::fromJson(std::string jsonObj)
{   
    bourne::json object = bourne::json::parse(jsonObj);

    const char *user_idKey = "user_id";
    
    if(object.has_key(user_idKey)) 
    {
        bourne::json value = object[user_idKey];


        

        AnyType* obj = &user_id;
		obj->fromJson(value.dump());

    }

    const char *full_nameKey = "full_name";
    
    if(object.has_key(full_nameKey)) 
    {
        bourne::json value = object[full_nameKey];


        

        AnyType* obj = &full_name;
		obj->fromJson(value.dump());

    }

    const char *api_keyKey = "api_key";
    
    if(object.has_key(api_keyKey)) 
    {
        bourne::json value = object[api_keyKey];


        

        AnyType* obj = &api_key;
		obj->fromJson(value.dump());

    }

    const char *default_sending_streamKey = "default_sending_stream";
    
    if(object.has_key(default_sending_streamKey)) 
    {
        bourne::json value = object[default_sending_streamKey];


        

        AnyType* obj = &default_sending_stream;
		obj->fromJson(value.dump());

    }

    const char *default_events_register_streamKey = "default_events_register_stream";
    
    if(object.has_key(default_events_register_streamKey)) 
    {
        bourne::json value = object[default_events_register_streamKey];


        

        AnyType* obj = &default_events_register_stream;
		obj->fromJson(value.dump());

    }

    const char *default_all_public_streamsKey = "default_all_public_streams";
    
    if(object.has_key(default_all_public_streamsKey)) 
    {
        bourne::json value = object[default_all_public_streamsKey];


        

        AnyType* obj = &default_all_public_streams;
		obj->fromJson(value.dump());

    }

    const char *avatar_urlKey = "avatar_url";
    
    if(object.has_key(avatar_urlKey)) 
    {
        bourne::json value = object[avatar_urlKey];


        

        AnyType* obj = &avatar_url;
		obj->fromJson(value.dump());

    }

    const char *owner_idKey = "owner_id";
    
    if(object.has_key(owner_idKey)) 
    {
        bourne::json value = object[owner_idKey];


        

        AnyType* obj = &owner_id;
		obj->fromJson(value.dump());

    }

    const char *servicesKey = "services";
    
    if(object.has_key(servicesKey)) 
    {
        bourne::json value = object[servicesKey];


        

        AnyType* obj = &services;
		obj->fromJson(value.dump());

    }


}

bourne::json
BasicBot_allOf::toJson()
{
    bourne::json object = bourne::json::object();

    




	object["user_id"] = getUserId().toJson();

    




	object["full_name"] = getFullName().toJson();

    




	object["api_key"] = getApiKey().toJson();

    




	object["default_sending_stream"] = getDefaultSendingStream().toJson();

    




	object["default_events_register_stream"] = getDefaultEventsRegisterStream().toJson();

    




	object["default_all_public_streams"] = getDefaultAllPublicStreams().toJson();

    




	object["avatar_url"] = getAvatarUrl().toJson();

    




	object["owner_id"] = getOwnerId().toJson();

    




	object["services"] = getServices().toJson();


    return object;

}

AnyType
BasicBot_allOf::getUserId()
{
	return user_id;
}

void
BasicBot_allOf::setUserId(AnyType  user_id)
{
	this->user_id = user_id;
}

AnyType
BasicBot_allOf::getFullName()
{
	return full_name;
}

void
BasicBot_allOf::setFullName(AnyType  full_name)
{
	this->full_name = full_name;
}

AnyType
BasicBot_allOf::getApiKey()
{
	return api_key;
}

void
BasicBot_allOf::setApiKey(AnyType  api_key)
{
	this->api_key = api_key;
}

AnyType
BasicBot_allOf::getDefaultSendingStream()
{
	return default_sending_stream;
}

void
BasicBot_allOf::setDefaultSendingStream(AnyType  default_sending_stream)
{
	this->default_sending_stream = default_sending_stream;
}

AnyType
BasicBot_allOf::getDefaultEventsRegisterStream()
{
	return default_events_register_stream;
}

void
BasicBot_allOf::setDefaultEventsRegisterStream(AnyType  default_events_register_stream)
{
	this->default_events_register_stream = default_events_register_stream;
}

AnyType
BasicBot_allOf::getDefaultAllPublicStreams()
{
	return default_all_public_streams;
}

void
BasicBot_allOf::setDefaultAllPublicStreams(AnyType  default_all_public_streams)
{
	this->default_all_public_streams = default_all_public_streams;
}

AnyType
BasicBot_allOf::getAvatarUrl()
{
	return avatar_url;
}

void
BasicBot_allOf::setAvatarUrl(AnyType  avatar_url)
{
	this->avatar_url = avatar_url;
}

AnyType
BasicBot_allOf::getOwnerId()
{
	return owner_id;
}

void
BasicBot_allOf::setOwnerId(AnyType  owner_id)
{
	this->owner_id = owner_id;
}

AnyType
BasicBot_allOf::getServices()
{
	return services;
}

void
BasicBot_allOf::setServices(AnyType  services)
{
	this->services = services;
}



