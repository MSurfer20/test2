

#include "EmojiReaction_allOf.h"

using namespace Tiny;

EmojiReaction_allOf::EmojiReaction_allOf()
{
	emoji_code = null;
	emoji_name = null;
	reaction_type = null;
	user_id = null;
	user = null;
}

EmojiReaction_allOf::EmojiReaction_allOf(std::string jsonString)
{
	this->fromJson(jsonString);
}

EmojiReaction_allOf::~EmojiReaction_allOf()
{

}

void
EmojiReaction_allOf::fromJson(std::string jsonObj)
{   
    bourne::json object = bourne::json::parse(jsonObj);

    const char *emoji_codeKey = "emoji_code";
    
    if(object.has_key(emoji_codeKey)) 
    {
        bourne::json value = object[emoji_codeKey];


        

        AnyType* obj = &emoji_code;
		obj->fromJson(value.dump());

    }

    const char *emoji_nameKey = "emoji_name";
    
    if(object.has_key(emoji_nameKey)) 
    {
        bourne::json value = object[emoji_nameKey];


        

        AnyType* obj = &emoji_name;
		obj->fromJson(value.dump());

    }

    const char *reaction_typeKey = "reaction_type";
    
    if(object.has_key(reaction_typeKey)) 
    {
        bourne::json value = object[reaction_typeKey];


        

        AnyType* obj = &reaction_type;
		obj->fromJson(value.dump());

    }

    const char *user_idKey = "user_id";
    
    if(object.has_key(user_idKey)) 
    {
        bourne::json value = object[user_idKey];


        

        AnyType* obj = &user_id;
		obj->fromJson(value.dump());

    }

    const char *userKey = "user";
    
    if(object.has_key(userKey)) 
    {
        bourne::json value = object[userKey];


        

        AnyType* obj = &user;
		obj->fromJson(value.dump());

    }


}

bourne::json
EmojiReaction_allOf::toJson()
{
    bourne::json object = bourne::json::object();

    




	object["emoji_code"] = getEmojiCode().toJson();

    




	object["emoji_name"] = getEmojiName().toJson();

    




	object["reaction_type"] = getReactionType().toJson();

    




	object["user_id"] = getUserId().toJson();

    




	object["user"] = getUser().toJson();


    return object;

}

AnyType
EmojiReaction_allOf::getEmojiCode()
{
	return emoji_code;
}

void
EmojiReaction_allOf::setEmojiCode(AnyType  emoji_code)
{
	this->emoji_code = emoji_code;
}

AnyType
EmojiReaction_allOf::getEmojiName()
{
	return emoji_name;
}

void
EmojiReaction_allOf::setEmojiName(AnyType  emoji_name)
{
	this->emoji_name = emoji_name;
}

AnyType
EmojiReaction_allOf::getReactionType()
{
	return reaction_type;
}

void
EmojiReaction_allOf::setReactionType(AnyType  reaction_type)
{
	this->reaction_type = reaction_type;
}

AnyType
EmojiReaction_allOf::getUserId()
{
	return user_id;
}

void
EmojiReaction_allOf::setUserId(AnyType  user_id)
{
	this->user_id = user_id;
}

AnyType
EmojiReaction_allOf::getUser()
{
	return user;
}

void
EmojiReaction_allOf::setUser(AnyType  user)
{
	this->user = user;
}



