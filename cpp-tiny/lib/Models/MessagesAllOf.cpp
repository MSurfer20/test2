

#include "Messages_allOf.h"

using namespace Tiny;

Messages_allOf::Messages_allOf()
{
	avatar_url = null;
	client = null;
	content = null;
	content_type = null;
	display_recipient = null;
	id = null;
	is_me_message = null;
	reactions = null;
	recipient_id = null;
	sender_email = null;
	sender_full_name = null;
	sender_id = null;
	sender_realm_str = null;
	stream_id = null;
	subject = null;
	topic_links = null;
	submessages = null;
	timestamp = null;
	type = null;
}

Messages_allOf::Messages_allOf(std::string jsonString)
{
	this->fromJson(jsonString);
}

Messages_allOf::~Messages_allOf()
{

}

void
Messages_allOf::fromJson(std::string jsonObj)
{   
    bourne::json object = bourne::json::parse(jsonObj);

    const char *avatar_urlKey = "avatar_url";
    
    if(object.has_key(avatar_urlKey)) 
    {
        bourne::json value = object[avatar_urlKey];


        

        AnyType* obj = &avatar_url;
		obj->fromJson(value.dump());

    }

    const char *clientKey = "client";
    
    if(object.has_key(clientKey)) 
    {
        bourne::json value = object[clientKey];


        

        AnyType* obj = &client;
		obj->fromJson(value.dump());

    }

    const char *contentKey = "content";
    
    if(object.has_key(contentKey)) 
    {
        bourne::json value = object[contentKey];


        

        AnyType* obj = &content;
		obj->fromJson(value.dump());

    }

    const char *content_typeKey = "content_type";
    
    if(object.has_key(content_typeKey)) 
    {
        bourne::json value = object[content_typeKey];


        

        AnyType* obj = &content_type;
		obj->fromJson(value.dump());

    }

    const char *display_recipientKey = "display_recipient";
    
    if(object.has_key(display_recipientKey)) 
    {
        bourne::json value = object[display_recipientKey];


        

        AnyType* obj = &display_recipient;
		obj->fromJson(value.dump());

    }

    const char *idKey = "id";
    
    if(object.has_key(idKey)) 
    {
        bourne::json value = object[idKey];


        

        AnyType* obj = &id;
		obj->fromJson(value.dump());

    }

    const char *is_me_messageKey = "is_me_message";
    
    if(object.has_key(is_me_messageKey)) 
    {
        bourne::json value = object[is_me_messageKey];


        

        AnyType* obj = &is_me_message;
		obj->fromJson(value.dump());

    }

    const char *reactionsKey = "reactions";
    
    if(object.has_key(reactionsKey)) 
    {
        bourne::json value = object[reactionsKey];


        

        AnyType* obj = &reactions;
		obj->fromJson(value.dump());

    }

    const char *recipient_idKey = "recipient_id";
    
    if(object.has_key(recipient_idKey)) 
    {
        bourne::json value = object[recipient_idKey];


        

        AnyType* obj = &recipient_id;
		obj->fromJson(value.dump());

    }

    const char *sender_emailKey = "sender_email";
    
    if(object.has_key(sender_emailKey)) 
    {
        bourne::json value = object[sender_emailKey];


        

        AnyType* obj = &sender_email;
		obj->fromJson(value.dump());

    }

    const char *sender_full_nameKey = "sender_full_name";
    
    if(object.has_key(sender_full_nameKey)) 
    {
        bourne::json value = object[sender_full_nameKey];


        

        AnyType* obj = &sender_full_name;
		obj->fromJson(value.dump());

    }

    const char *sender_idKey = "sender_id";
    
    if(object.has_key(sender_idKey)) 
    {
        bourne::json value = object[sender_idKey];


        

        AnyType* obj = &sender_id;
		obj->fromJson(value.dump());

    }

    const char *sender_realm_strKey = "sender_realm_str";
    
    if(object.has_key(sender_realm_strKey)) 
    {
        bourne::json value = object[sender_realm_strKey];


        

        AnyType* obj = &sender_realm_str;
		obj->fromJson(value.dump());

    }

    const char *stream_idKey = "stream_id";
    
    if(object.has_key(stream_idKey)) 
    {
        bourne::json value = object[stream_idKey];


        

        AnyType* obj = &stream_id;
		obj->fromJson(value.dump());

    }

    const char *subjectKey = "subject";
    
    if(object.has_key(subjectKey)) 
    {
        bourne::json value = object[subjectKey];


        

        AnyType* obj = &subject;
		obj->fromJson(value.dump());

    }

    const char *topic_linksKey = "topic_links";
    
    if(object.has_key(topic_linksKey)) 
    {
        bourne::json value = object[topic_linksKey];


        

        AnyType* obj = &topic_links;
		obj->fromJson(value.dump());

    }

    const char *submessagesKey = "submessages";
    
    if(object.has_key(submessagesKey)) 
    {
        bourne::json value = object[submessagesKey];


        

        AnyType* obj = &submessages;
		obj->fromJson(value.dump());

    }

    const char *timestampKey = "timestamp";
    
    if(object.has_key(timestampKey)) 
    {
        bourne::json value = object[timestampKey];


        

        AnyType* obj = &timestamp;
		obj->fromJson(value.dump());

    }

    const char *typeKey = "type";
    
    if(object.has_key(typeKey)) 
    {
        bourne::json value = object[typeKey];


        

        AnyType* obj = &type;
		obj->fromJson(value.dump());

    }


}

bourne::json
Messages_allOf::toJson()
{
    bourne::json object = bourne::json::object();

    




	object["avatar_url"] = getAvatarUrl().toJson();

    




	object["client"] = getClient().toJson();

    




	object["content"] = getContent().toJson();

    




	object["content_type"] = getContentType().toJson();

    




	object["display_recipient"] = getDisplayRecipient().toJson();

    




	object["id"] = getId().toJson();

    




	object["is_me_message"] = getIsMeMessage().toJson();

    




	object["reactions"] = getReactions().toJson();

    




	object["recipient_id"] = getRecipientId().toJson();

    




	object["sender_email"] = getSenderEmail().toJson();

    




	object["sender_full_name"] = getSenderFullName().toJson();

    




	object["sender_id"] = getSenderId().toJson();

    




	object["sender_realm_str"] = getSenderRealmStr().toJson();

    




	object["stream_id"] = getStreamId().toJson();

    




	object["subject"] = getSubject().toJson();

    




	object["topic_links"] = getTopicLinks().toJson();

    




	object["submessages"] = getSubmessages().toJson();

    




	object["timestamp"] = getTimestamp().toJson();

    




	object["type"] = getType().toJson();


    return object;

}

AnyType
Messages_allOf::getAvatarUrl()
{
	return avatar_url;
}

void
Messages_allOf::setAvatarUrl(AnyType  avatar_url)
{
	this->avatar_url = avatar_url;
}

AnyType
Messages_allOf::getClient()
{
	return client;
}

void
Messages_allOf::setClient(AnyType  client)
{
	this->client = client;
}

AnyType
Messages_allOf::getContent()
{
	return content;
}

void
Messages_allOf::setContent(AnyType  content)
{
	this->content = content;
}

AnyType
Messages_allOf::getContentType()
{
	return content_type;
}

void
Messages_allOf::setContentType(AnyType  content_type)
{
	this->content_type = content_type;
}

AnyType
Messages_allOf::getDisplayRecipient()
{
	return display_recipient;
}

void
Messages_allOf::setDisplayRecipient(AnyType  display_recipient)
{
	this->display_recipient = display_recipient;
}

AnyType
Messages_allOf::getId()
{
	return id;
}

void
Messages_allOf::setId(AnyType  id)
{
	this->id = id;
}

AnyType
Messages_allOf::getIsMeMessage()
{
	return is_me_message;
}

void
Messages_allOf::setIsMeMessage(AnyType  is_me_message)
{
	this->is_me_message = is_me_message;
}

AnyType
Messages_allOf::getReactions()
{
	return reactions;
}

void
Messages_allOf::setReactions(AnyType  reactions)
{
	this->reactions = reactions;
}

AnyType
Messages_allOf::getRecipientId()
{
	return recipient_id;
}

void
Messages_allOf::setRecipientId(AnyType  recipient_id)
{
	this->recipient_id = recipient_id;
}

AnyType
Messages_allOf::getSenderEmail()
{
	return sender_email;
}

void
Messages_allOf::setSenderEmail(AnyType  sender_email)
{
	this->sender_email = sender_email;
}

AnyType
Messages_allOf::getSenderFullName()
{
	return sender_full_name;
}

void
Messages_allOf::setSenderFullName(AnyType  sender_full_name)
{
	this->sender_full_name = sender_full_name;
}

AnyType
Messages_allOf::getSenderId()
{
	return sender_id;
}

void
Messages_allOf::setSenderId(AnyType  sender_id)
{
	this->sender_id = sender_id;
}

AnyType
Messages_allOf::getSenderRealmStr()
{
	return sender_realm_str;
}

void
Messages_allOf::setSenderRealmStr(AnyType  sender_realm_str)
{
	this->sender_realm_str = sender_realm_str;
}

AnyType
Messages_allOf::getStreamId()
{
	return stream_id;
}

void
Messages_allOf::setStreamId(AnyType  stream_id)
{
	this->stream_id = stream_id;
}

AnyType
Messages_allOf::getSubject()
{
	return subject;
}

void
Messages_allOf::setSubject(AnyType  subject)
{
	this->subject = subject;
}

AnyType
Messages_allOf::getTopicLinks()
{
	return topic_links;
}

void
Messages_allOf::setTopicLinks(AnyType  topic_links)
{
	this->topic_links = topic_links;
}

AnyType
Messages_allOf::getSubmessages()
{
	return submessages;
}

void
Messages_allOf::setSubmessages(AnyType  submessages)
{
	this->submessages = submessages;
}

AnyType
Messages_allOf::getTimestamp()
{
	return timestamp;
}

void
Messages_allOf::setTimestamp(AnyType  timestamp)
{
	this->timestamp = timestamp;
}

AnyType
Messages_allOf::getType()
{
	return type;
}

void
Messages_allOf::setType(AnyType  type)
{
	this->type = type;
}



