

#include "Bot.h"

using namespace Tiny;

Bot::Bot()
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
	email = std::string();
	bot_type = int(0);
	is_active = bool(false);
}

Bot::Bot(std::string jsonString)
{
	this->fromJson(jsonString);
}

Bot::~Bot()
{

}

void
Bot::fromJson(std::string jsonObj)
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

    const char *emailKey = "email";
    
    if(object.has_key(emailKey)) 
    {
        bourne::json value = object[emailKey];


        
        jsonToValue(&email, value, "std::string");


    }

    const char *bot_typeKey = "bot_type";
    
    if(object.has_key(bot_typeKey)) 
    {
        bourne::json value = object[bot_typeKey];


        
        jsonToValue(&bot_type, value, "int");


    }

    const char *is_activeKey = "is_active";
    
    if(object.has_key(is_activeKey)) 
    {
        bourne::json value = object[is_activeKey];


        
        jsonToValue(&is_active, value, "bool");


    }


}

bourne::json
Bot::toJson()
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

    



    object["email"] = getEmail();


    



    object["bot_type"] = getBotType();


    



    object["is_active"] = isIsActive();



    return object;

}

AnyType
Bot::getUserId()
{
	return user_id;
}

void
Bot::setUserId(AnyType  user_id)
{
	this->user_id = user_id;
}

AnyType
Bot::getFullName()
{
	return full_name;
}

void
Bot::setFullName(AnyType  full_name)
{
	this->full_name = full_name;
}

AnyType
Bot::getApiKey()
{
	return api_key;
}

void
Bot::setApiKey(AnyType  api_key)
{
	this->api_key = api_key;
}

AnyType
Bot::getDefaultSendingStream()
{
	return default_sending_stream;
}

void
Bot::setDefaultSendingStream(AnyType  default_sending_stream)
{
	this->default_sending_stream = default_sending_stream;
}

AnyType
Bot::getDefaultEventsRegisterStream()
{
	return default_events_register_stream;
}

void
Bot::setDefaultEventsRegisterStream(AnyType  default_events_register_stream)
{
	this->default_events_register_stream = default_events_register_stream;
}

AnyType
Bot::getDefaultAllPublicStreams()
{
	return default_all_public_streams;
}

void
Bot::setDefaultAllPublicStreams(AnyType  default_all_public_streams)
{
	this->default_all_public_streams = default_all_public_streams;
}

AnyType
Bot::getAvatarUrl()
{
	return avatar_url;
}

void
Bot::setAvatarUrl(AnyType  avatar_url)
{
	this->avatar_url = avatar_url;
}

AnyType
Bot::getOwnerId()
{
	return owner_id;
}

void
Bot::setOwnerId(AnyType  owner_id)
{
	this->owner_id = owner_id;
}

AnyType
Bot::getServices()
{
	return services;
}

void
Bot::setServices(AnyType  services)
{
	this->services = services;
}

std::string
Bot::getEmail()
{
	return email;
}

void
Bot::setEmail(std::string  email)
{
	this->email = email;
}

int
Bot::getBotType()
{
	return bot_type;
}

void
Bot::setBotType(int  bot_type)
{
	this->bot_type = bot_type;
}

bool
Bot::isIsActive()
{
	return is_active;
}

void
Bot::setIsActive(bool  is_active)
{
	this->is_active = is_active;
}



