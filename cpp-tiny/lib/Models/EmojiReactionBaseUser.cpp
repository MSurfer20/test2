

#include "EmojiReactionBase_user.h"

using namespace Tiny;

EmojiReactionBase_user::EmojiReactionBase_user()
{
	id = int(0);
	email = std::string();
	full_name = std::string();
	is_mirror_dummy = bool(false);
}

EmojiReactionBase_user::EmojiReactionBase_user(std::string jsonString)
{
	this->fromJson(jsonString);
}

EmojiReactionBase_user::~EmojiReactionBase_user()
{

}

void
EmojiReactionBase_user::fromJson(std::string jsonObj)
{   
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";
    
    if(object.has_key(idKey)) 
    {
        bourne::json value = object[idKey];


        
        jsonToValue(&id, value, "int");


    }

    const char *emailKey = "email";
    
    if(object.has_key(emailKey)) 
    {
        bourne::json value = object[emailKey];


        
        jsonToValue(&email, value, "std::string");


    }

    const char *full_nameKey = "full_name";
    
    if(object.has_key(full_nameKey)) 
    {
        bourne::json value = object[full_nameKey];


        
        jsonToValue(&full_name, value, "std::string");


    }

    const char *is_mirror_dummyKey = "is_mirror_dummy";
    
    if(object.has_key(is_mirror_dummyKey)) 
    {
        bourne::json value = object[is_mirror_dummyKey];


        
        jsonToValue(&is_mirror_dummy, value, "bool");


    }


}

bourne::json
EmojiReactionBase_user::toJson()
{
    bourne::json object = bourne::json::object();

    



    object["id"] = getId();


    



    object["email"] = getEmail();


    



    object["full_name"] = getFullName();


    



    object["is_mirror_dummy"] = isIsMirrorDummy();



    return object;

}

int
EmojiReactionBase_user::getId()
{
	return id;
}

void
EmojiReactionBase_user::setId(int  id)
{
	this->id = id;
}

std::string
EmojiReactionBase_user::getEmail()
{
	return email;
}

void
EmojiReactionBase_user::setEmail(std::string  email)
{
	this->email = email;
}

std::string
EmojiReactionBase_user::getFullName()
{
	return full_name;
}

void
EmojiReactionBase_user::setFullName(std::string  full_name)
{
	this->full_name = full_name;
}

bool
EmojiReactionBase_user::isIsMirrorDummy()
{
	return is_mirror_dummy;
}

void
EmojiReactionBase_user::setIsMirrorDummy(bool  is_mirror_dummy)
{
	this->is_mirror_dummy = is_mirror_dummy;
}



