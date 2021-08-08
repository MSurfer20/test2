

#include "BasicStreamBase.h"

using namespace Tiny;

BasicStreamBase::BasicStreamBase()
{
	stream_id = int(0);
	name = std::string();
	description = std::string();
	date_created = int(0);
	invite_only = bool(false);
	rendered_description = std::string();
	is_web_public = bool(false);
	stream_post_policy = int(0);
	message_retention_days = int(0);
	history_public_to_subscribers = bool(false);
	first_message_id = int(0);
	is_announcement_only = bool(false);
}

BasicStreamBase::BasicStreamBase(std::string jsonString)
{
	this->fromJson(jsonString);
}

BasicStreamBase::~BasicStreamBase()
{

}

void
BasicStreamBase::fromJson(std::string jsonObj)
{   
    bourne::json object = bourne::json::parse(jsonObj);

    const char *stream_idKey = "stream_id";
    
    if(object.has_key(stream_idKey)) 
    {
        bourne::json value = object[stream_idKey];


        
        jsonToValue(&stream_id, value, "int");


    }

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

    const char *date_createdKey = "date_created";
    
    if(object.has_key(date_createdKey)) 
    {
        bourne::json value = object[date_createdKey];


        
        jsonToValue(&date_created, value, "int");


    }

    const char *invite_onlyKey = "invite_only";
    
    if(object.has_key(invite_onlyKey)) 
    {
        bourne::json value = object[invite_onlyKey];


        
        jsonToValue(&invite_only, value, "bool");


    }

    const char *rendered_descriptionKey = "rendered_description";
    
    if(object.has_key(rendered_descriptionKey)) 
    {
        bourne::json value = object[rendered_descriptionKey];


        
        jsonToValue(&rendered_description, value, "std::string");


    }

    const char *is_web_publicKey = "is_web_public";
    
    if(object.has_key(is_web_publicKey)) 
    {
        bourne::json value = object[is_web_publicKey];


        
        jsonToValue(&is_web_public, value, "bool");


    }

    const char *stream_post_policyKey = "stream_post_policy";
    
    if(object.has_key(stream_post_policyKey)) 
    {
        bourne::json value = object[stream_post_policyKey];


        
        jsonToValue(&stream_post_policy, value, "int");


    }

    const char *message_retention_daysKey = "message_retention_days";
    
    if(object.has_key(message_retention_daysKey)) 
    {
        bourne::json value = object[message_retention_daysKey];


        
        jsonToValue(&message_retention_days, value, "int");


    }

    const char *history_public_to_subscribersKey = "history_public_to_subscribers";
    
    if(object.has_key(history_public_to_subscribersKey)) 
    {
        bourne::json value = object[history_public_to_subscribersKey];


        
        jsonToValue(&history_public_to_subscribers, value, "bool");


    }

    const char *first_message_idKey = "first_message_id";
    
    if(object.has_key(first_message_idKey)) 
    {
        bourne::json value = object[first_message_idKey];


        
        jsonToValue(&first_message_id, value, "int");


    }

    const char *is_announcement_onlyKey = "is_announcement_only";
    
    if(object.has_key(is_announcement_onlyKey)) 
    {
        bourne::json value = object[is_announcement_onlyKey];


        
        jsonToValue(&is_announcement_only, value, "bool");


    }


}

bourne::json
BasicStreamBase::toJson()
{
    bourne::json object = bourne::json::object();

    



    object["stream_id"] = getStreamId();


    



    object["name"] = getName();


    



    object["description"] = getDescription();


    



    object["date_created"] = getDateCreated();


    



    object["invite_only"] = isInviteOnly();


    



    object["rendered_description"] = getRenderedDescription();


    



    object["is_web_public"] = isIsWebPublic();


    



    object["stream_post_policy"] = getStreamPostPolicy();


    



    object["message_retention_days"] = getMessageRetentionDays();


    



    object["history_public_to_subscribers"] = isHistoryPublicToSubscribers();


    



    object["first_message_id"] = getFirstMessageId();


    



    object["is_announcement_only"] = isIsAnnouncementOnly();



    return object;

}

int
BasicStreamBase::getStreamId()
{
	return stream_id;
}

void
BasicStreamBase::setStreamId(int  stream_id)
{
	this->stream_id = stream_id;
}

std::string
BasicStreamBase::getName()
{
	return name;
}

void
BasicStreamBase::setName(std::string  name)
{
	this->name = name;
}

std::string
BasicStreamBase::getDescription()
{
	return description;
}

void
BasicStreamBase::setDescription(std::string  description)
{
	this->description = description;
}

int
BasicStreamBase::getDateCreated()
{
	return date_created;
}

void
BasicStreamBase::setDateCreated(int  date_created)
{
	this->date_created = date_created;
}

bool
BasicStreamBase::isInviteOnly()
{
	return invite_only;
}

void
BasicStreamBase::setInviteOnly(bool  invite_only)
{
	this->invite_only = invite_only;
}

std::string
BasicStreamBase::getRenderedDescription()
{
	return rendered_description;
}

void
BasicStreamBase::setRenderedDescription(std::string  rendered_description)
{
	this->rendered_description = rendered_description;
}

bool
BasicStreamBase::isIsWebPublic()
{
	return is_web_public;
}

void
BasicStreamBase::setIsWebPublic(bool  is_web_public)
{
	this->is_web_public = is_web_public;
}

int
BasicStreamBase::getStreamPostPolicy()
{
	return stream_post_policy;
}

void
BasicStreamBase::setStreamPostPolicy(int  stream_post_policy)
{
	this->stream_post_policy = stream_post_policy;
}

int
BasicStreamBase::getMessageRetentionDays()
{
	return message_retention_days;
}

void
BasicStreamBase::setMessageRetentionDays(int  message_retention_days)
{
	this->message_retention_days = message_retention_days;
}

bool
BasicStreamBase::isHistoryPublicToSubscribers()
{
	return history_public_to_subscribers;
}

void
BasicStreamBase::setHistoryPublicToSubscribers(bool  history_public_to_subscribers)
{
	this->history_public_to_subscribers = history_public_to_subscribers;
}

int
BasicStreamBase::getFirstMessageId()
{
	return first_message_id;
}

void
BasicStreamBase::setFirstMessageId(int  first_message_id)
{
	this->first_message_id = first_message_id;
}

bool
BasicStreamBase::isIsAnnouncementOnly()
{
	return is_announcement_only;
}

void
BasicStreamBase::setIsAnnouncementOnly(bool  is_announcement_only)
{
	this->is_announcement_only = is_announcement_only;
}



