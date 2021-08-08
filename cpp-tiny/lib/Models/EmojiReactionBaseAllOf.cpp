

#include "EmojiReactionBase_allOf.h"

using namespace Tiny;

EmojiReactionBase_allOf::EmojiReactionBase_allOf()
{
	user_id = int(0);
	user = EmojiReactionBase_allOf_user();
}

EmojiReactionBase_allOf::EmojiReactionBase_allOf(std::string jsonString)
{
	this->fromJson(jsonString);
}

EmojiReactionBase_allOf::~EmojiReactionBase_allOf()
{

}

void
EmojiReactionBase_allOf::fromJson(std::string jsonObj)
{   
    bourne::json object = bourne::json::parse(jsonObj);

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


        

        EmojiReactionBase_allOf_user* obj = &user;
		obj->fromJson(value.dump());

    }


}

bourne::json
EmojiReactionBase_allOf::toJson()
{
    bourne::json object = bourne::json::object();

    



    object["user_id"] = getUserId();


    




	object["user"] = getUser().toJson();


    return object;

}

int
EmojiReactionBase_allOf::getUserId()
{
	return user_id;
}

void
EmojiReactionBase_allOf::setUserId(int  user_id)
{
	this->user_id = user_id;
}

EmojiReactionBase_allOf_user
EmojiReactionBase_allOf::getUser()
{
	return user;
}

void
EmojiReactionBase_allOf::setUser(EmojiReactionBase_allOf_user  user)
{
	this->user = user;
}



