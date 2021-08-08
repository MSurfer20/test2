

#include "GetMessages.h"

using namespace Tiny;

GetMessages::GetMessages()
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
	flags = std::list<std::string>();
	last_edit_timestamp = int(0);
	match_content = std::string();
	match_subject = std::string();
}

GetMessages::GetMessages(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetMessages::~GetMessages()
{

}

void
GetMessages::fromJson(std::string jsonObj)
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

    const char *flagsKey = "flags";
    
    if(object.has_key(flagsKey)) 
    {
        bourne::json value = object[flagsKey];


        std::list<std::string> flags_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");
            
            
            flags_list.push_back(element);
        }
        flags = flags_list;


    }

    const char *last_edit_timestampKey = "last_edit_timestamp";
    
    if(object.has_key(last_edit_timestampKey)) 
    {
        bourne::json value = object[last_edit_timestampKey];


        
        jsonToValue(&last_edit_timestamp, value, "int");


    }

    const char *match_contentKey = "match_content";
    
    if(object.has_key(match_contentKey)) 
    {
        bourne::json value = object[match_contentKey];


        
        jsonToValue(&match_content, value, "std::string");


    }

    const char *match_subjectKey = "match_subject";
    
    if(object.has_key(match_subjectKey)) 
    {
        bourne::json value = object[match_subjectKey];


        
        jsonToValue(&match_subject, value, "std::string");


    }


}

bourne::json
GetMessages::toJson()
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

    
    
    
    std::list<std::string> flags_list = getFlags();
    bourne::json flags_arr = bourne::json::array();

    for(auto& var : flags_list)
    {
        flags_arr.append(var);
    }
    object["flags"] = flags_arr;

    



    



    object["last_edit_timestamp"] = getLastEditTimestamp();


    



    object["match_content"] = getMatchContent();


    



    object["match_subject"] = getMatchSubject();



    return object;

}

AnyType
GetMessages::getAvatarUrl()
{
	return avatar_url;
}

void
GetMessages::setAvatarUrl(AnyType  avatar_url)
{
	this->avatar_url = avatar_url;
}

AnyType
GetMessages::getClient()
{
	return client;
}

void
GetMessages::setClient(AnyType  client)
{
	this->client = client;
}

AnyType
GetMessages::getContent()
{
	return content;
}

void
GetMessages::setContent(AnyType  content)
{
	this->content = content;
}

AnyType
GetMessages::getContentType()
{
	return content_type;
}

void
GetMessages::setContentType(AnyType  content_type)
{
	this->content_type = content_type;
}

AnyType
GetMessages::getDisplayRecipient()
{
	return display_recipient;
}

void
GetMessages::setDisplayRecipient(AnyType  display_recipient)
{
	this->display_recipient = display_recipient;
}

AnyType
GetMessages::getId()
{
	return id;
}

void
GetMessages::setId(AnyType  id)
{
	this->id = id;
}

AnyType
GetMessages::getIsMeMessage()
{
	return is_me_message;
}

void
GetMessages::setIsMeMessage(AnyType  is_me_message)
{
	this->is_me_message = is_me_message;
}

AnyType
GetMessages::getReactions()
{
	return reactions;
}

void
GetMessages::setReactions(AnyType  reactions)
{
	this->reactions = reactions;
}

AnyType
GetMessages::getRecipientId()
{
	return recipient_id;
}

void
GetMessages::setRecipientId(AnyType  recipient_id)
{
	this->recipient_id = recipient_id;
}

AnyType
GetMessages::getSenderEmail()
{
	return sender_email;
}

void
GetMessages::setSenderEmail(AnyType  sender_email)
{
	this->sender_email = sender_email;
}

AnyType
GetMessages::getSenderFullName()
{
	return sender_full_name;
}

void
GetMessages::setSenderFullName(AnyType  sender_full_name)
{
	this->sender_full_name = sender_full_name;
}

AnyType
GetMessages::getSenderId()
{
	return sender_id;
}

void
GetMessages::setSenderId(AnyType  sender_id)
{
	this->sender_id = sender_id;
}

AnyType
GetMessages::getSenderRealmStr()
{
	return sender_realm_str;
}

void
GetMessages::setSenderRealmStr(AnyType  sender_realm_str)
{
	this->sender_realm_str = sender_realm_str;
}

AnyType
GetMessages::getStreamId()
{
	return stream_id;
}

void
GetMessages::setStreamId(AnyType  stream_id)
{
	this->stream_id = stream_id;
}

AnyType
GetMessages::getSubject()
{
	return subject;
}

void
GetMessages::setSubject(AnyType  subject)
{
	this->subject = subject;
}

AnyType
GetMessages::getTopicLinks()
{
	return topic_links;
}

void
GetMessages::setTopicLinks(AnyType  topic_links)
{
	this->topic_links = topic_links;
}

AnyType
GetMessages::getSubmessages()
{
	return submessages;
}

void
GetMessages::setSubmessages(AnyType  submessages)
{
	this->submessages = submessages;
}

AnyType
GetMessages::getTimestamp()
{
	return timestamp;
}

void
GetMessages::setTimestamp(AnyType  timestamp)
{
	this->timestamp = timestamp;
}

AnyType
GetMessages::getType()
{
	return type;
}

void
GetMessages::setType(AnyType  type)
{
	this->type = type;
}

std::list<std::string>
GetMessages::getFlags()
{
	return flags;
}

void
GetMessages::setFlags(std::list <std::string> flags)
{
	this->flags = flags;
}

int
GetMessages::getLastEditTimestamp()
{
	return last_edit_timestamp;
}

void
GetMessages::setLastEditTimestamp(int  last_edit_timestamp)
{
	this->last_edit_timestamp = last_edit_timestamp;
}

std::string
GetMessages::getMatchContent()
{
	return match_content;
}

void
GetMessages::setMatchContent(std::string  match_content)
{
	this->match_content = match_content;
}

std::string
GetMessages::getMatchSubject()
{
	return match_subject;
}

void
GetMessages::setMatchSubject(std::string  match_subject)
{
	this->match_subject = match_subject;
}



