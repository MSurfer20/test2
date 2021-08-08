

#include "BasicStream_allOf.h"

using namespace Tiny;

BasicStream_allOf::BasicStream_allOf()
{
	stream_id = null;
	name = null;
	description = null;
	date_created = null;
	invite_only = null;
	rendered_description = null;
	is_web_public = null;
	stream_post_policy = null;
	message_retention_days = null;
	history_public_to_subscribers = null;
	first_message_id = null;
	is_announcement_only = null;
}

BasicStream_allOf::BasicStream_allOf(std::string jsonString)
{
	this->fromJson(jsonString);
}

BasicStream_allOf::~BasicStream_allOf()
{

}

void
BasicStream_allOf::fromJson(std::string jsonObj)
{   
    bourne::json object = bourne::json::parse(jsonObj);

    const char *stream_idKey = "stream_id";
    
    if(object.has_key(stream_idKey)) 
    {
        bourne::json value = object[stream_idKey];


        

        AnyType* obj = &stream_id;
		obj->fromJson(value.dump());

    }

    const char *nameKey = "name";
    
    if(object.has_key(nameKey)) 
    {
        bourne::json value = object[nameKey];


        

        AnyType* obj = &name;
		obj->fromJson(value.dump());

    }

    const char *descriptionKey = "description";
    
    if(object.has_key(descriptionKey)) 
    {
        bourne::json value = object[descriptionKey];


        

        AnyType* obj = &description;
		obj->fromJson(value.dump());

    }

    const char *date_createdKey = "date_created";
    
    if(object.has_key(date_createdKey)) 
    {
        bourne::json value = object[date_createdKey];


        

        AnyType* obj = &date_created;
		obj->fromJson(value.dump());

    }

    const char *invite_onlyKey = "invite_only";
    
    if(object.has_key(invite_onlyKey)) 
    {
        bourne::json value = object[invite_onlyKey];


        

        AnyType* obj = &invite_only;
		obj->fromJson(value.dump());

    }

    const char *rendered_descriptionKey = "rendered_description";
    
    if(object.has_key(rendered_descriptionKey)) 
    {
        bourne::json value = object[rendered_descriptionKey];


        

        AnyType* obj = &rendered_description;
		obj->fromJson(value.dump());

    }

    const char *is_web_publicKey = "is_web_public";
    
    if(object.has_key(is_web_publicKey)) 
    {
        bourne::json value = object[is_web_publicKey];


        

        AnyType* obj = &is_web_public;
		obj->fromJson(value.dump());

    }

    const char *stream_post_policyKey = "stream_post_policy";
    
    if(object.has_key(stream_post_policyKey)) 
    {
        bourne::json value = object[stream_post_policyKey];


        

        AnyType* obj = &stream_post_policy;
		obj->fromJson(value.dump());

    }

    const char *message_retention_daysKey = "message_retention_days";
    
    if(object.has_key(message_retention_daysKey)) 
    {
        bourne::json value = object[message_retention_daysKey];


        

        AnyType* obj = &message_retention_days;
		obj->fromJson(value.dump());

    }

    const char *history_public_to_subscribersKey = "history_public_to_subscribers";
    
    if(object.has_key(history_public_to_subscribersKey)) 
    {
        bourne::json value = object[history_public_to_subscribersKey];


        

        AnyType* obj = &history_public_to_subscribers;
		obj->fromJson(value.dump());

    }

    const char *first_message_idKey = "first_message_id";
    
    if(object.has_key(first_message_idKey)) 
    {
        bourne::json value = object[first_message_idKey];


        

        AnyType* obj = &first_message_id;
		obj->fromJson(value.dump());

    }

    const char *is_announcement_onlyKey = "is_announcement_only";
    
    if(object.has_key(is_announcement_onlyKey)) 
    {
        bourne::json value = object[is_announcement_onlyKey];


        

        AnyType* obj = &is_announcement_only;
		obj->fromJson(value.dump());

    }


}

bourne::json
BasicStream_allOf::toJson()
{
    bourne::json object = bourne::json::object();

    




	object["stream_id"] = getStreamId().toJson();

    




	object["name"] = getName().toJson();

    




	object["description"] = getDescription().toJson();

    




	object["date_created"] = getDateCreated().toJson();

    




	object["invite_only"] = getInviteOnly().toJson();

    




	object["rendered_description"] = getRenderedDescription().toJson();

    




	object["is_web_public"] = getIsWebPublic().toJson();

    




	object["stream_post_policy"] = getStreamPostPolicy().toJson();

    




	object["message_retention_days"] = getMessageRetentionDays().toJson();

    




	object["history_public_to_subscribers"] = getHistoryPublicToSubscribers().toJson();

    




	object["first_message_id"] = getFirstMessageId().toJson();

    




	object["is_announcement_only"] = getIsAnnouncementOnly().toJson();


    return object;

}

AnyType
BasicStream_allOf::getStreamId()
{
	return stream_id;
}

void
BasicStream_allOf::setStreamId(AnyType  stream_id)
{
	this->stream_id = stream_id;
}

AnyType
BasicStream_allOf::getName()
{
	return name;
}

void
BasicStream_allOf::setName(AnyType  name)
{
	this->name = name;
}

AnyType
BasicStream_allOf::getDescription()
{
	return description;
}

void
BasicStream_allOf::setDescription(AnyType  description)
{
	this->description = description;
}

AnyType
BasicStream_allOf::getDateCreated()
{
	return date_created;
}

void
BasicStream_allOf::setDateCreated(AnyType  date_created)
{
	this->date_created = date_created;
}

AnyType
BasicStream_allOf::getInviteOnly()
{
	return invite_only;
}

void
BasicStream_allOf::setInviteOnly(AnyType  invite_only)
{
	this->invite_only = invite_only;
}

AnyType
BasicStream_allOf::getRenderedDescription()
{
	return rendered_description;
}

void
BasicStream_allOf::setRenderedDescription(AnyType  rendered_description)
{
	this->rendered_description = rendered_description;
}

AnyType
BasicStream_allOf::getIsWebPublic()
{
	return is_web_public;
}

void
BasicStream_allOf::setIsWebPublic(AnyType  is_web_public)
{
	this->is_web_public = is_web_public;
}

AnyType
BasicStream_allOf::getStreamPostPolicy()
{
	return stream_post_policy;
}

void
BasicStream_allOf::setStreamPostPolicy(AnyType  stream_post_policy)
{
	this->stream_post_policy = stream_post_policy;
}

AnyType
BasicStream_allOf::getMessageRetentionDays()
{
	return message_retention_days;
}

void
BasicStream_allOf::setMessageRetentionDays(AnyType  message_retention_days)
{
	this->message_retention_days = message_retention_days;
}

AnyType
BasicStream_allOf::getHistoryPublicToSubscribers()
{
	return history_public_to_subscribers;
}

void
BasicStream_allOf::setHistoryPublicToSubscribers(AnyType  history_public_to_subscribers)
{
	this->history_public_to_subscribers = history_public_to_subscribers;
}

AnyType
BasicStream_allOf::getFirstMessageId()
{
	return first_message_id;
}

void
BasicStream_allOf::setFirstMessageId(AnyType  first_message_id)
{
	this->first_message_id = first_message_id;
}

AnyType
BasicStream_allOf::getIsAnnouncementOnly()
{
	return is_announcement_only;
}

void
BasicStream_allOf::setIsAnnouncementOnly(AnyType  is_announcement_only)
{
	this->is_announcement_only = is_announcement_only;
}



