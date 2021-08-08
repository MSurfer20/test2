

#include "UserBase.h"

using namespace Tiny;

UserBase::UserBase()
{
	email = std::string();
	is_bot = bool(false);
	avatar_url = std::string();
	avatar_version = int(0);
	full_name = std::string();
	is_admin = bool(false);
	is_owner = bool(false);
	is_billing_admin = bool(false);
	role = int(0);
	bot_type = int(0);
	user_id = int(0);
	bot_owner_id = int(0);
	is_active = bool(false);
	is_guest = bool(false);
	timezone = std::string();
	date_joined = std::string();
	delivery_email = std::string();
	profile_data = null<Object>();
}

UserBase::UserBase(std::string jsonString)
{
	this->fromJson(jsonString);
}

UserBase::~UserBase()
{

}

void
UserBase::fromJson(std::string jsonObj)
{   
    bourne::json object = bourne::json::parse(jsonObj);

    const char *emailKey = "email";
    
    if(object.has_key(emailKey)) 
    {
        bourne::json value = object[emailKey];


        
        jsonToValue(&email, value, "std::string");


    }

    const char *is_botKey = "is_bot";
    
    if(object.has_key(is_botKey)) 
    {
        bourne::json value = object[is_botKey];


        
        jsonToValue(&is_bot, value, "bool");


    }

    const char *avatar_urlKey = "avatar_url";
    
    if(object.has_key(avatar_urlKey)) 
    {
        bourne::json value = object[avatar_urlKey];


        
        jsonToValue(&avatar_url, value, "std::string");


    }

    const char *avatar_versionKey = "avatar_version";
    
    if(object.has_key(avatar_versionKey)) 
    {
        bourne::json value = object[avatar_versionKey];


        
        jsonToValue(&avatar_version, value, "int");


    }

    const char *full_nameKey = "full_name";
    
    if(object.has_key(full_nameKey)) 
    {
        bourne::json value = object[full_nameKey];


        
        jsonToValue(&full_name, value, "std::string");


    }

    const char *is_adminKey = "is_admin";
    
    if(object.has_key(is_adminKey)) 
    {
        bourne::json value = object[is_adminKey];


        
        jsonToValue(&is_admin, value, "bool");


    }

    const char *is_ownerKey = "is_owner";
    
    if(object.has_key(is_ownerKey)) 
    {
        bourne::json value = object[is_ownerKey];


        
        jsonToValue(&is_owner, value, "bool");


    }

    const char *is_billing_adminKey = "is_billing_admin";
    
    if(object.has_key(is_billing_adminKey)) 
    {
        bourne::json value = object[is_billing_adminKey];


        
        jsonToValue(&is_billing_admin, value, "bool");


    }

    const char *roleKey = "role";
    
    if(object.has_key(roleKey)) 
    {
        bourne::json value = object[roleKey];


        
        jsonToValue(&role, value, "int");


    }

    const char *bot_typeKey = "bot_type";
    
    if(object.has_key(bot_typeKey)) 
    {
        bourne::json value = object[bot_typeKey];


        
        jsonToValue(&bot_type, value, "int");


    }

    const char *user_idKey = "user_id";
    
    if(object.has_key(user_idKey)) 
    {
        bourne::json value = object[user_idKey];


        
        jsonToValue(&user_id, value, "int");


    }

    const char *bot_owner_idKey = "bot_owner_id";
    
    if(object.has_key(bot_owner_idKey)) 
    {
        bourne::json value = object[bot_owner_idKey];


        
        jsonToValue(&bot_owner_id, value, "int");


    }

    const char *is_activeKey = "is_active";
    
    if(object.has_key(is_activeKey)) 
    {
        bourne::json value = object[is_activeKey];


        
        jsonToValue(&is_active, value, "bool");


    }

    const char *is_guestKey = "is_guest";
    
    if(object.has_key(is_guestKey)) 
    {
        bourne::json value = object[is_guestKey];


        
        jsonToValue(&is_guest, value, "bool");


    }

    const char *timezoneKey = "timezone";
    
    if(object.has_key(timezoneKey)) 
    {
        bourne::json value = object[timezoneKey];


        
        jsonToValue(&timezone, value, "std::string");


    }

    const char *date_joinedKey = "date_joined";
    
    if(object.has_key(date_joinedKey)) 
    {
        bourne::json value = object[date_joinedKey];


        
        jsonToValue(&date_joined, value, "std::string");


    }

    const char *delivery_emailKey = "delivery_email";
    
    if(object.has_key(delivery_emailKey)) 
    {
        bourne::json value = object[delivery_emailKey];


        
        jsonToValue(&delivery_email, value, "std::string");


    }

    const char *profile_dataKey = "profile_data";
    
    if(object.has_key(profile_dataKey)) 
    {
        bourne::json value = object[profile_dataKey];


    }


}

bourne::json
UserBase::toJson()
{
    bourne::json object = bourne::json::object();

    



    object["email"] = getEmail();


    



    object["is_bot"] = isIsBot();


    



    object["avatar_url"] = getAvatarUrl();


    



    object["avatar_version"] = getAvatarVersion();


    



    object["full_name"] = getFullName();


    



    object["is_admin"] = isIsAdmin();


    



    object["is_owner"] = isIsOwner();


    



    object["is_billing_admin"] = isIsBillingAdmin();


    



    object["role"] = getRole();


    



    object["bot_type"] = getBotType();


    



    object["user_id"] = getUserId();


    



    object["bot_owner_id"] = getBotOwnerId();


    



    object["is_active"] = isIsActive();


    



    object["is_guest"] = isIsGuest();


    



    object["timezone"] = getTimezone();


    



    object["date_joined"] = getDateJoined();


    



    object["delivery_email"] = getDeliveryEmail();


    



    return object;

}

std::string
UserBase::getEmail()
{
	return email;
}

void
UserBase::setEmail(std::string  email)
{
	this->email = email;
}

bool
UserBase::isIsBot()
{
	return is_bot;
}

void
UserBase::setIsBot(bool  is_bot)
{
	this->is_bot = is_bot;
}

std::string
UserBase::getAvatarUrl()
{
	return avatar_url;
}

void
UserBase::setAvatarUrl(std::string  avatar_url)
{
	this->avatar_url = avatar_url;
}

int
UserBase::getAvatarVersion()
{
	return avatar_version;
}

void
UserBase::setAvatarVersion(int  avatar_version)
{
	this->avatar_version = avatar_version;
}

std::string
UserBase::getFullName()
{
	return full_name;
}

void
UserBase::setFullName(std::string  full_name)
{
	this->full_name = full_name;
}

bool
UserBase::isIsAdmin()
{
	return is_admin;
}

void
UserBase::setIsAdmin(bool  is_admin)
{
	this->is_admin = is_admin;
}

bool
UserBase::isIsOwner()
{
	return is_owner;
}

void
UserBase::setIsOwner(bool  is_owner)
{
	this->is_owner = is_owner;
}

bool
UserBase::isIsBillingAdmin()
{
	return is_billing_admin;
}

void
UserBase::setIsBillingAdmin(bool  is_billing_admin)
{
	this->is_billing_admin = is_billing_admin;
}

int
UserBase::getRole()
{
	return role;
}

void
UserBase::setRole(int  role)
{
	this->role = role;
}

int
UserBase::getBotType()
{
	return bot_type;
}

void
UserBase::setBotType(int  bot_type)
{
	this->bot_type = bot_type;
}

int
UserBase::getUserId()
{
	return user_id;
}

void
UserBase::setUserId(int  user_id)
{
	this->user_id = user_id;
}

int
UserBase::getBotOwnerId()
{
	return bot_owner_id;
}

void
UserBase::setBotOwnerId(int  bot_owner_id)
{
	this->bot_owner_id = bot_owner_id;
}

bool
UserBase::isIsActive()
{
	return is_active;
}

void
UserBase::setIsActive(bool  is_active)
{
	this->is_active = is_active;
}

bool
UserBase::isIsGuest()
{
	return is_guest;
}

void
UserBase::setIsGuest(bool  is_guest)
{
	this->is_guest = is_guest;
}

std::string
UserBase::getTimezone()
{
	return timezone;
}

void
UserBase::setTimezone(std::string  timezone)
{
	this->timezone = timezone;
}

std::string
UserBase::getDateJoined()
{
	return date_joined;
}

void
UserBase::setDateJoined(std::string  date_joined)
{
	this->date_joined = date_joined;
}

std::string
UserBase::getDeliveryEmail()
{
	return delivery_email;
}

void
UserBase::setDeliveryEmail(std::string  delivery_email)
{
	this->delivery_email = delivery_email;
}

Map<string, string>
UserBase::getProfileData()
{
	return profile_data;
}

void
UserBase::setProfileData(Map <string, string> profile_data)
{
	this->profile_data = profile_data;
}



