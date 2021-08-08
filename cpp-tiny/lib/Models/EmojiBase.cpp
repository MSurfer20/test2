

#include "EmojiBase.h"

using namespace Tiny;

EmojiBase::EmojiBase()
{
	emoji_code = std::string();
	emoji_name = std::string();
	reaction_type = std::string();
}

EmojiBase::EmojiBase(std::string jsonString)
{
	this->fromJson(jsonString);
}

EmojiBase::~EmojiBase()
{

}

void
EmojiBase::fromJson(std::string jsonObj)
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


}

bourne::json
EmojiBase::toJson()
{
    bourne::json object = bourne::json::object();

    



    object["emoji_code"] = getEmojiCode();


    



    object["emoji_name"] = getEmojiName();


    



    object["reaction_type"] = getReactionType();



    return object;

}

std::string
EmojiBase::getEmojiCode()
{
	return emoji_code;
}

void
EmojiBase::setEmojiCode(std::string  emoji_code)
{
	this->emoji_code = emoji_code;
}

std::string
EmojiBase::getEmojiName()
{
	return emoji_name;
}

void
EmojiBase::setEmojiName(std::string  emoji_name)
{
	this->emoji_name = emoji_name;
}

std::string
EmojiBase::getReactionType()
{
	return reaction_type;
}

void
EmojiBase::setReactionType(std::string  reaction_type)
{
	this->reaction_type = reaction_type;
}



