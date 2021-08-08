

#include "EmojiReactionBase.h"

using namespace Tiny;

EmojiReactionBase::EmojiReactionBase()
{
	emoji_code = std::string();
	emoji_name = std::string();
	reaction_type = std::string();
	user_id = int(0);
	user = EmojiReactionBase_user();
}

EmojiReactionBase::EmojiReactionBase(std::string jsonString)
{
	this->fromJson(jsonString);
}

EmojiReactionBase::~EmojiReactionBase()
{

}

void
EmojiReactionBase::fromJson(std::string jsonObj)
{   
    bourne::json object = bourne::json::parse(jsonObj);

    const char *emoji_codeKey = "emoji_code";
    
    if(object.has_key(emoji_codeKey)) 
    {
        bourne::json value = object[emoji_codeKey];


        
        jsonToValue(&emoji_code, value, "std::string");


    }

    const char *emoji_nameKey = "emoji_name";
    
    if(object.has_key(emoji_nameKey)) 
    {
        bourne::json value = object[emoji_nameKey];


        
        jsonToValue(&emoji_name, value, "std::string");


    }

    const char *reaction_typeKey = "reaction_type";
    
    if(object.has_key(reaction_typeKey)) 
    {
        bourne::json value = object[reaction_typeKey];


        
        jsonToValue(&reaction_type, value, "std::string");


    }

    const char *user_idKey = "user_id";
    
    if(object.has_key(user_idKey)) 
    {
        bourne::json value = object[user_idKey];


        
        jsonToValue(&user_id, value, "int");


    }

    const char *userKey = "user";
    
    if(object.has_key(userKey)) 
    {
        bourne::json value = object[userKey];


        

        EmojiReactionBase_user* obj = &user;
		obj->fromJson(value.dump());

    }


}

bourne::json
EmojiReactionBase::toJson()
{
    bourne::json object = bourne::json::object();

    



    object["emoji_code"] = getEmojiCode();


    



    object["emoji_name"] = getEmojiName();


    



    object["reaction_type"] = getReactionType();


    



    object["user_id"] = getUserId();


    




	object["user"] = getUser().toJson();


    return object;

}

std::string
EmojiReactionBase::getEmojiCode()
{
	return emoji_code;
}

void
EmojiReactionBase::setEmojiCode(std::string  emoji_code)
{
	this->emoji_code = emoji_code;
}

std::string
EmojiReactionBase::getEmojiName()
{
	return emoji_name;
}

void
EmojiReactionBase::setEmojiName(std::string  emoji_name)
{
	this->emoji_name = emoji_name;
}

std::string
EmojiReactionBase::getReactionType()
{
	return reaction_type;
}

void
EmojiReactionBase::setReactionType(std::string  reaction_type)
{
	this->reaction_type = reaction_type;
}

int
EmojiReactionBase::getUserId()
{
	return user_id;
}

void
EmojiReactionBase::setUserId(int  user_id)
{
	this->user_id = user_id;
}

EmojiReactionBase_user
EmojiReactionBase::getUser()
{
	return user;
}

void
EmojiReactionBase::setUser(EmojiReactionBase_user  user)
{
	this->user = user;
}



