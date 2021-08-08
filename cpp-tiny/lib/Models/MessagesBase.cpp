

#include "MessagesBase.h"

using namespace Tiny;

MessagesBase::MessagesBase()
{
	avatar_url = std::string();
	client = std::string();
	content = std::string();
	content_type = std::string();
	display_recipient = null;
	id = int(0);
	is_me_message = bool(false);
	reactions = std::list<EmojiReaction>();
	recipient_id = int(0);
	sender_email = std::string();
	sender_full_name = std::string();
	sender_id = int(0);
	sender_realm_str = std::string();
	stream_id = int(0);
	subject = std::string();
	topic_links = std::list<MessagesBase_topic_links>();
	submessages = std::list<std::string>();
	timestamp = int(0);
	type = std::string();
}

MessagesBase::MessagesBase(std::string jsonString)
{
	this->fromJson(jsonString);
}

MessagesBase::~MessagesBase()
{

}

void
MessagesBase::fromJson(std::string jsonObj)
{   
    bourne::json object = bourne::json::parse(jsonObj);

    const char *avatar_urlKey = "avatar_url";
    
    if(object.has_key(avatar_urlKey)) 
    {
        bourne::json value = object[avatar_urlKey];


        
        jsonToValue(&avatar_url, value, "std::string");


    }

    const char *clientKey = "client";
    
    if(object.has_key(clientKey)) 
    {
        bourne::json value = object[clientKey];


        
        jsonToValue(&client, value, "std::string");


    }

    const char *contentKey = "content";
    
    if(object.has_key(contentKey)) 
    {
        bourne::json value = object[contentKey];


        
        jsonToValue(&content, value, "std::string");


    }

    const char *content_typeKey = "content_type";
    
    if(object.has_key(content_typeKey)) 
    {
        bourne::json value = object[content_typeKey];


        
        jsonToValue(&content_type, value, "std::string");


    }

    const char *display_recipientKey = "display_recipient";
    
    if(object.has_key(display_recipientKey)) 
    {
        bourne::json value = object[display_recipientKey];


        

        OneOf&lt;string,array&gt;* obj = &display_recipient;
		obj->fromJson(value.dump());

    }

    const char *idKey = "id";
    
    if(object.has_key(idKey)) 
    {
        bourne::json value = object[idKey];


        
        jsonToValue(&id, value, "int");


    }

    const char *is_me_messageKey = "is_me_message";
    
    if(object.has_key(is_me_messageKey)) 
    {
        bourne::json value = object[is_me_messageKey];


        
        jsonToValue(&is_me_message, value, "bool");


    }

    const char *reactionsKey = "reactions";
    
    if(object.has_key(reactionsKey)) 
    {
        bourne::json value = object[reactionsKey];


        std::list<EmojiReaction> reactions_list;
        EmojiReaction element;
        for(auto& var : value.array_range())
        {

            
            element.fromJson(var.dump());
            
            reactions_list.push_back(element);
        }
        reactions = reactions_list;


    }

    const char *recipient_idKey = "recipient_id";
    
    if(object.has_key(recipient_idKey)) 
    {
        bourne::json value = object[recipient_idKey];


        
        jsonToValue(&recipient_id, value, "int");


    }

    const char *sender_emailKey = "sender_email";
    
    if(object.has_key(sender_emailKey)) 
    {
        bourne::json value = object[sender_emailKey];


        
        jsonToValue(&sender_email, value, "std::string");


    }

    const char *sender_full_nameKey = "sender_full_name";
    
    if(object.has_key(sender_full_nameKey)) 
    {
        bourne::json value = object[sender_full_nameKey];


        
        jsonToValue(&sender_full_name, value, "std::string");


    }

    const char *sender_idKey = "sender_id";
    
    if(object.has_key(sender_idKey)) 
    {
        bourne::json value = object[sender_idKey];


        
        jsonToValue(&sender_id, value, "int");


    }

    const char *sender_realm_strKey = "sender_realm_str";
    
    if(object.has_key(sender_realm_strKey)) 
    {
        bourne::json value = object[sender_realm_strKey];


        
        jsonToValue(&sender_realm_str, value, "std::string");


    }

    const char *stream_idKey = "stream_id";
    
    if(object.has_key(stream_idKey)) 
    {
        bourne::json value = object[stream_idKey];


        
        jsonToValue(&stream_id, value, "int");


    }

    const char *subjectKey = "subject";
    
    if(object.has_key(subjectKey)) 
    {
        bourne::json value = object[subjectKey];


        
        jsonToValue(&subject, value, "std::string");


    }

    const char *topic_linksKey = "topic_links";
    
    if(object.has_key(topic_linksKey)) 
    {
        bourne::json value = object[topic_linksKey];


        std::list<MessagesBase_topic_links> topic_links_list;
        MessagesBase_topic_links element;
        for(auto& var : value.array_range())
        {

            
            element.fromJson(var.dump());
            
            topic_links_list.push_back(element);
        }
        topic_links = topic_links_list;


    }

    const char *submessagesKey = "submessages";
    
    if(object.has_key(submessagesKey)) 
    {
        bourne::json value = object[submessagesKey];


        std::list<std::string> submessages_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");
            
            
            submessages_list.push_back(element);
        }
        submessages = submessages_list;


    }

    const char *timestampKey = "timestamp";
    
    if(object.has_key(timestampKey)) 
    {
        bourne::json value = object[timestampKey];


        
        jsonToValue(&timestamp, value, "int");


    }

    const char *typeKey = "type";
    
    if(object.has_key(typeKey)) 
    {
        bourne::json value = object[typeKey];


        
        jsonToValue(&type, value, "std::string");


    }


}

bourne::json
MessagesBase::toJson()
{
    bourne::json object = bourne::json::object();

    



    object["avatar_url"] = getAvatarUrl();


    



    object["client"] = getClient();


    



    object["content"] = getContent();


    



    object["content_type"] = getContentType();


    




	object["display_recipient"] = getDisplayRecipient().toJson();

    



    object["id"] = getId();


    



    object["is_me_message"] = isIsMeMessage();


    
    

    std::list<EmojiReaction> reactions_list = getReactions();
    bourne::json reactions_arr = bourne::json::array();

    for(auto& var : reactions_list)
    {
        EmojiReaction obj = var;
        reactions_arr.append(obj.toJson());
    }
    object["reactions"] = reactions_arr;



    



    object["recipient_id"] = getRecipientId();


    



    object["sender_email"] = getSenderEmail();


    



    object["sender_full_name"] = getSenderFullName();


    



    object["sender_id"] = getSenderId();


    



    object["sender_realm_str"] = getSenderRealmStr();


    



    object["stream_id"] = getStreamId();


    



    object["subject"] = getSubject();


    
    

    std::list<MessagesBase_topic_links> topic_links_list = getTopicLinks();
    bourne::json topic_links_arr = bourne::json::array();

    for(auto& var : topic_links_list)
    {
        MessagesBase_topic_links obj = var;
        topic_links_arr.append(obj.toJson());
    }
    object["topic_links"] = topic_links_arr;



    
    
    
    std::list<std::string> submessages_list = getSubmessages();
    bourne::json submessages_arr = bourne::json::array();

    for(auto& var : submessages_list)
    {
        submessages_arr.append(var);
    }
    object["submessages"] = submessages_arr;

    



    



    object["timestamp"] = getTimestamp();


    



    object["type"] = getType();



    return object;

}

std::string
MessagesBase::getAvatarUrl()
{
	return avatar_url;
}

void
MessagesBase::setAvatarUrl(std::string  avatar_url)
{
	this->avatar_url = avatar_url;
}

std::string
MessagesBase::getClient()
{
	return client;
}

void
MessagesBase::setClient(std::string  client)
{
	this->client = client;
}

std::string
MessagesBase::getContent()
{
	return content;
}

void
MessagesBase::setContent(std::string  content)
{
	this->content = content;
}

std::string
MessagesBase::getContentType()
{
	return content_type;
}

void
MessagesBase::setContentType(std::string  content_type)
{
	this->content_type = content_type;
}

OneOf&lt;string,array&gt;
MessagesBase::getDisplayRecipient()
{
	return display_recipient;
}

void
MessagesBase::setDisplayRecipient(OneOf&lt;string,array&gt;  display_recipient)
{
	this->display_recipient = display_recipient;
}

int
MessagesBase::getId()
{
	return id;
}

void
MessagesBase::setId(int  id)
{
	this->id = id;
}

bool
MessagesBase::isIsMeMessage()
{
	return is_me_message;
}

void
MessagesBase::setIsMeMessage(bool  is_me_message)
{
	this->is_me_message = is_me_message;
}

std::list<EmojiReaction>
MessagesBase::getReactions()
{
	return reactions;
}

void
MessagesBase::setReactions(std::list <EmojiReaction> reactions)
{
	this->reactions = reactions;
}

int
MessagesBase::getRecipientId()
{
	return recipient_id;
}

void
MessagesBase::setRecipientId(int  recipient_id)
{
	this->recipient_id = recipient_id;
}

std::string
MessagesBase::getSenderEmail()
{
	return sender_email;
}

void
MessagesBase::setSenderEmail(std::string  sender_email)
{
	this->sender_email = sender_email;
}

std::string
MessagesBase::getSenderFullName()
{
	return sender_full_name;
}

void
MessagesBase::setSenderFullName(std::string  sender_full_name)
{
	this->sender_full_name = sender_full_name;
}

int
MessagesBase::getSenderId()
{
	return sender_id;
}

void
MessagesBase::setSenderId(int  sender_id)
{
	this->sender_id = sender_id;
}

std::string
MessagesBase::getSenderRealmStr()
{
	return sender_realm_str;
}

void
MessagesBase::setSenderRealmStr(std::string  sender_realm_str)
{
	this->sender_realm_str = sender_realm_str;
}

int
MessagesBase::getStreamId()
{
	return stream_id;
}

void
MessagesBase::setStreamId(int  stream_id)
{
	this->stream_id = stream_id;
}

std::string
MessagesBase::getSubject()
{
	return subject;
}

void
MessagesBase::setSubject(std::string  subject)
{
	this->subject = subject;
}

std::list<MessagesBase_topic_links>
MessagesBase::getTopicLinks()
{
	return topic_links;
}

void
MessagesBase::setTopicLinks(std::list <MessagesBase_topic_links> topic_links)
{
	this->topic_links = topic_links;
}

std::list<std::string>
MessagesBase::getSubmessages()
{
	return submessages;
}

void
MessagesBase::setSubmessages(std::list <std::string> submessages)
{
	this->submessages = submessages;
}

int
MessagesBase::getTimestamp()
{
	return timestamp;
}

void
MessagesBase::setTimestamp(int  timestamp)
{
	this->timestamp = timestamp;
}

std::string
MessagesBase::getType()
{
	return type;
}

void
MessagesBase::setType(std::string  type)
{
	this->type = type;
}



