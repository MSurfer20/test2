

#include "User_allOf.h"

using namespace Tiny;

User_allOf::User_allOf()
{
	email = null;
	is_bot = null;
	avatar_url = null;
	avatar_version = null;
	full_name = null;
	is_admin = null;
	is_owner = null;
	is_billing_admin = null;
	role = null;
	bot_type = null;
	user_id = null;
	bot_owner_id = null;
	is_active = null;
	is_guest = null;
	timezone = null;
	date_joined = null;
	delivery_email = null;
	profile_data = null;
}

User_allOf::User_allOf(std::string jsonString)
{
	this->fromJson(jsonString);
}

User_allOf::~User_allOf()
{

}

void
User_allOf::fromJson(std::string jsonObj)
{   
    bourne::json object = bourne::json::parse(jsonObj);

    const char *emailKey = "email";
    
    if(object.has_key(emailKey)) 
    {
        bourne::json value = object[emailKey];


        

        AnyType* obj = &email;
		obj->fromJson(value.dump());

    }

    const char *is_botKey = "is_bot";
    
    if(object.has_key(is_botKey)) 
    {
        bourne::json value = object[is_botKey];


        

        AnyType* obj = &is_bot;
		obj->fromJson(value.dump());

    }

    const char *avatar_urlKey = "avatar_url";
    
    if(object.has_key(avatar_urlKey)) 
    {
        bourne::json value = object[avatar_urlKey];


        

        AnyType* obj = &avatar_url;
		obj->fromJson(value.dump());

    }

    const char *avatar_versionKey = "avatar_version";
    
    if(object.has_key(avatar_versionKey)) 
    {
        bourne::json value = object[avatar_versionKey];


        

        AnyType* obj = &avatar_version;
		obj->fromJson(value.dump());

    }

    const char *full_nameKey = "full_name";
    
    if(object.has_key(full_nameKey)) 
    {
        bourne::json value = object[full_nameKey];


        

        AnyType* obj = &full_name;
		obj->fromJson(value.dump());

    }

    const char *is_adminKey = "is_admin";
    
    if(object.has_key(is_adminKey)) 
    {
        bourne::json value = object[is_adminKey];


        

        AnyType* obj = &is_admin;
		obj->fromJson(value.dump());

    }

    const char *is_ownerKey = "is_owner";
    
    if(object.has_key(is_ownerKey)) 
    {
        bourne::json value = object[is_ownerKey];


        

        AnyType* obj = &is_owner;
		obj->fromJson(value.dump());

    }

    const char *is_billing_adminKey = "is_billing_admin";
    
    if(object.has_key(is_billing_adminKey)) 
    {
        bourne::json value = object[is_billing_adminKey];


        

        AnyType* obj = &is_billing_admin;
		obj->fromJson(value.dump());

    }

    const char *roleKey = "role";
    
    if(object.has_key(roleKey)) 
    {
        bourne::json value = object[roleKey];


        

        AnyType* obj = &role;
		obj->fromJson(value.dump());

    }

    const char *bot_typeKey = "bot_type";
    
    if(object.has_key(bot_typeKey)) 
    {
        bourne::json value = object[bot_typeKey];


        

        AnyType* obj = &bot_type;
		obj->fromJson(value.dump());

    }

    const char *user_idKey = "user_id";
    
    if(object.has_key(user_idKey)) 
    {
        bourne::json value = object[user_idKey];


        

        AnyType* obj = &user_id;
		obj->fromJson(value.dump());

    }

    const char *bot_owner_idKey = "bot_owner_id";
    
    if(object.has_key(bot_owner_idKey)) 
    {
        bourne::json value = object[bot_owner_idKey];


        

        AnyType* obj = &bot_owner_id;
		obj->fromJson(value.dump());

    }

    const char *is_activeKey = "is_active";
    
    if(object.has_key(is_activeKey)) 
    {
        bourne::json value = object[is_activeKey];


        

        AnyType* obj = &is_active;
		obj->fromJson(value.dump());

    }

    const char *is_guestKey = "is_guest";
    
    if(object.has_key(is_guestKey)) 
    {
        bourne::json value = object[is_guestKey];


        

        AnyType* obj = &is_guest;
		obj->fromJson(value.dump());

    }

    const char *timezoneKey = "timezone";
    
    if(object.has_key(timezoneKey)) 
    {
        bourne::json value = object[timezoneKey];


        

        AnyType* obj = &timezone;
		obj->fromJson(value.dump());

    }

    const char *date_joinedKey = "date_joined";
    
    if(object.has_key(date_joinedKey)) 
    {
        bourne::json value = object[date_joinedKey];


        

        AnyType* obj = &date_joined;
		obj->fromJson(value.dump());

    }

    const char *delivery_emailKey = "delivery_email";
    
    if(object.has_key(delivery_emailKey)) 
    {
        bourne::json value = object[delivery_emailKey];


        

        AnyType* obj = &delivery_email;
		obj->fromJson(value.dump());

    }

    const char *profile_dataKey = "profile_data";
    
    if(object.has_key(profile_dataKey)) 
    {
        bourne::json value = object[profile_dataKey];


        

        AnyType* obj = &profile_data;
		obj->fromJson(value.dump());

    }


}

bourne::json
User_allOf::toJson()
{
    bourne::json object = bourne::json::object();

    




	object["email"] = getEmail().toJson();

    




	object["is_bot"] = getIsBot().toJson();

    




	object["avatar_url"] = getAvatarUrl().toJson();

    




	object["avatar_version"] = getAvatarVersion().toJson();

    




	object["full_name"] = getFullName().toJson();

    




	object["is_admin"] = getIsAdmin().toJson();

    




	object["is_owner"] = getIsOwner().toJson();

    




	object["is_billing_admin"] = getIsBillingAdmin().toJson();

    




	object["role"] = getRole().toJson();

    




	object["bot_type"] = getBotType().toJson();

    




	object["user_id"] = getUserId().toJson();

    




	object["bot_owner_id"] = getBotOwnerId().toJson();

    




	object["is_active"] = getIsActive().toJson();

    




	object["is_guest"] = getIsGuest().toJson();

    




	object["timezone"] = getTimezone().toJson();

    




	object["date_joined"] = getDateJoined().toJson();

    




	object["delivery_email"] = getDeliveryEmail().toJson();

    




	object["profile_data"] = getProfileData().toJson();


    return object;

}

AnyType
User_allOf::getEmail()
{
	return email;
}

void
User_allOf::setEmail(AnyType  email)
{
	this->email = email;
}

AnyType
User_allOf::getIsBot()
{
	return is_bot;
}

void
User_allOf::setIsBot(AnyType  is_bot)
{
	this->is_bot = is_bot;
}

AnyType
User_allOf::getAvatarUrl()
{
	return avatar_url;
}

void
User_allOf::setAvatarUrl(AnyType  avatar_url)
{
	this->avatar_url = avatar_url;
}

AnyType
User_allOf::getAvatarVersion()
{
	return avatar_version;
}

void
User_allOf::setAvatarVersion(AnyType  avatar_version)
{
	this->avatar_version = avatar_version;
}

AnyType
User_allOf::getFullName()
{
	return full_name;
}

void
User_allOf::setFullName(AnyType  full_name)
{
	this->full_name = full_name;
}

AnyType
User_allOf::getIsAdmin()
{
	return is_admin;
}

void
User_allOf::setIsAdmin(AnyType  is_admin)
{
	this->is_admin = is_admin;
}

AnyType
User_allOf::getIsOwner()
{
	return is_owner;
}

void
User_allOf::setIsOwner(AnyType  is_owner)
{
	this->is_owner = is_owner;
}

AnyType
User_allOf::getIsBillingAdmin()
{
	return is_billing_admin;
}

void
User_allOf::setIsBillingAdmin(AnyType  is_billing_admin)
{
	this->is_billing_admin = is_billing_admin;
}

AnyType
User_allOf::getRole()
{
	return role;
}

void
User_allOf::setRole(AnyType  role)
{
	this->role = role;
}

AnyType
User_allOf::getBotType()
{
	return bot_type;
}

void
User_allOf::setBotType(AnyType  bot_type)
{
	this->bot_type = bot_type;
}

AnyType
User_allOf::getUserId()
{
	return user_id;
}

void
User_allOf::setUserId(AnyType  user_id)
{
	this->user_id = user_id;
}

AnyType
User_allOf::getBotOwnerId()
{
	return bot_owner_id;
}

void
User_allOf::setBotOwnerId(AnyType  bot_owner_id)
{
	this->bot_owner_id = bot_owner_id;
}

AnyType
User_allOf::getIsActive()
{
	return is_active;
}

void
User_allOf::setIsActive(AnyType  is_active)
{
	this->is_active = is_active;
}

AnyType
User_allOf::getIsGuest()
{
	return is_guest;
}

void
User_allOf::setIsGuest(AnyType  is_guest)
{
	this->is_guest = is_guest;
}

AnyType
User_allOf::getTimezone()
{
	return timezone;
}

void
User_allOf::setTimezone(AnyType  timezone)
{
	this->timezone = timezone;
}

AnyType
User_allOf::getDateJoined()
{
	return date_joined;
}

void
User_allOf::setDateJoined(AnyType  date_joined)
{
	this->date_joined = date_joined;
}

AnyType
User_allOf::getDeliveryEmail()
{
	return delivery_email;
}

void
User_allOf::setDeliveryEmail(AnyType  delivery_email)
{
	this->delivery_email = delivery_email;
}

AnyType
User_allOf::getProfileData()
{
	return profile_data;
}

void
User_allOf::setProfileData(AnyType  profile_data)
{
	this->profile_data = profile_data;
}



