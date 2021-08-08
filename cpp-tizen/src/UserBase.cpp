#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UserBase.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UserBase::UserBase()
{
	//__init();
}

UserBase::~UserBase()
{
	//__cleanup();
}

void
UserBase::__init()
{
	//email = std::string();
	//is_bot = bool(false);
	//avatar_url = std::string();
	//avatar_version = int(0);
	//full_name = std::string();
	//is_admin = bool(false);
	//is_owner = bool(false);
	//is_billing_admin = bool(false);
	//role = int(0);
	//bot_type = int(0);
	//user_id = int(0);
	//bot_owner_id = int(0);
	//is_active = bool(false);
	//is_guest = bool(false);
	//timezone = std::string();
	//date_joined = std::string();
	//delivery_email = std::string();
	//new std::map()std::map> profile_data;
}

void
UserBase::__cleanup()
{
	//if(email != NULL) {
	//
	//delete email;
	//email = NULL;
	//}
	//if(is_bot != NULL) {
	//
	//delete is_bot;
	//is_bot = NULL;
	//}
	//if(avatar_url != NULL) {
	//
	//delete avatar_url;
	//avatar_url = NULL;
	//}
	//if(avatar_version != NULL) {
	//
	//delete avatar_version;
	//avatar_version = NULL;
	//}
	//if(full_name != NULL) {
	//
	//delete full_name;
	//full_name = NULL;
	//}
	//if(is_admin != NULL) {
	//
	//delete is_admin;
	//is_admin = NULL;
	//}
	//if(is_owner != NULL) {
	//
	//delete is_owner;
	//is_owner = NULL;
	//}
	//if(is_billing_admin != NULL) {
	//
	//delete is_billing_admin;
	//is_billing_admin = NULL;
	//}
	//if(role != NULL) {
	//
	//delete role;
	//role = NULL;
	//}
	//if(bot_type != NULL) {
	//
	//delete bot_type;
	//bot_type = NULL;
	//}
	//if(user_id != NULL) {
	//
	//delete user_id;
	//user_id = NULL;
	//}
	//if(bot_owner_id != NULL) {
	//
	//delete bot_owner_id;
	//bot_owner_id = NULL;
	//}
	//if(is_active != NULL) {
	//
	//delete is_active;
	//is_active = NULL;
	//}
	//if(is_guest != NULL) {
	//
	//delete is_guest;
	//is_guest = NULL;
	//}
	//if(timezone != NULL) {
	//
	//delete timezone;
	//timezone = NULL;
	//}
	//if(date_joined != NULL) {
	//
	//delete date_joined;
	//date_joined = NULL;
	//}
	//if(delivery_email != NULL) {
	//
	//delete delivery_email;
	//delivery_email = NULL;
	//}
	//if(profile_data != NULL) {
	//profile_data.RemoveAll(true);
	//delete profile_data;
	//profile_data = NULL;
	//}
	//
}

void
UserBase::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *emailKey = "email";
	node = json_object_get_member(pJsonObject, emailKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&email, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *is_botKey = "is_bot";
	node = json_object_get_member(pJsonObject, is_botKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_bot, node, "bool", "");
		} else {
			
		}
	}
	const gchar *avatar_urlKey = "avatar_url";
	node = json_object_get_member(pJsonObject, avatar_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&avatar_url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *avatar_versionKey = "avatar_version";
	node = json_object_get_member(pJsonObject, avatar_versionKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&avatar_version, node, "int", "");
		} else {
			
		}
	}
	const gchar *full_nameKey = "full_name";
	node = json_object_get_member(pJsonObject, full_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&full_name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *is_adminKey = "is_admin";
	node = json_object_get_member(pJsonObject, is_adminKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_admin, node, "bool", "");
		} else {
			
		}
	}
	const gchar *is_ownerKey = "is_owner";
	node = json_object_get_member(pJsonObject, is_ownerKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_owner, node, "bool", "");
		} else {
			
		}
	}
	const gchar *is_billing_adminKey = "is_billing_admin";
	node = json_object_get_member(pJsonObject, is_billing_adminKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_billing_admin, node, "bool", "");
		} else {
			
		}
	}
	const gchar *roleKey = "role";
	node = json_object_get_member(pJsonObject, roleKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&role, node, "int", "");
		} else {
			
		}
	}
	const gchar *bot_typeKey = "bot_type";
	node = json_object_get_member(pJsonObject, bot_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&bot_type, node, "int", "");
		} else {
			
		}
	}
	const gchar *user_idKey = "user_id";
	node = json_object_get_member(pJsonObject, user_idKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&user_id, node, "int", "");
		} else {
			
		}
	}
	const gchar *bot_owner_idKey = "bot_owner_id";
	node = json_object_get_member(pJsonObject, bot_owner_idKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&bot_owner_id, node, "int", "");
		} else {
			
		}
	}
	const gchar *is_activeKey = "is_active";
	node = json_object_get_member(pJsonObject, is_activeKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_active, node, "bool", "");
		} else {
			
		}
	}
	const gchar *is_guestKey = "is_guest";
	node = json_object_get_member(pJsonObject, is_guestKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_guest, node, "bool", "");
		} else {
			
		}
	}
	const gchar *timezoneKey = "timezone";
	node = json_object_get_member(pJsonObject, timezoneKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&timezone, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *date_joinedKey = "date_joined";
	node = json_object_get_member(pJsonObject, date_joinedKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&date_joined, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *delivery_emailKey = "delivery_email";
	node = json_object_get_member(pJsonObject, delivery_emailKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&delivery_email, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *profile_dataKey = "profile_data";
	node = json_object_get_member(pJsonObject, profile_dataKey);
	if (node !=NULL) {
	
		{
			JsonObject* json_obj = json_node_get_object(node);
			map<string,string> new_map;
			json_object_foreach_member(json_obj,helper_func,&new_map);
			profile_data = new_map;
		}
		
	}
}

UserBase::UserBase(char* json)
{
	this->fromJson(json);
}

char*
UserBase::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getEmail();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *emailKey = "email";
	json_object_set_member(pJsonObject, emailKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsBot();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_botKey = "is_bot";
	json_object_set_member(pJsonObject, is_botKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAvatarUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *avatar_urlKey = "avatar_url";
	json_object_set_member(pJsonObject, avatar_urlKey, node);
	if (isprimitive("int")) {
		int obj = getAvatarVersion();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *avatar_versionKey = "avatar_version";
	json_object_set_member(pJsonObject, avatar_versionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFullName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *full_nameKey = "full_name";
	json_object_set_member(pJsonObject, full_nameKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsAdmin();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_adminKey = "is_admin";
	json_object_set_member(pJsonObject, is_adminKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsOwner();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_ownerKey = "is_owner";
	json_object_set_member(pJsonObject, is_ownerKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsBillingAdmin();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_billing_adminKey = "is_billing_admin";
	json_object_set_member(pJsonObject, is_billing_adminKey, node);
	if (isprimitive("int")) {
		int obj = getRole();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *roleKey = "role";
	json_object_set_member(pJsonObject, roleKey, node);
	if (isprimitive("int")) {
		int obj = getBotType();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *bot_typeKey = "bot_type";
	json_object_set_member(pJsonObject, bot_typeKey, node);
	if (isprimitive("int")) {
		int obj = getUserId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *user_idKey = "user_id";
	json_object_set_member(pJsonObject, user_idKey, node);
	if (isprimitive("int")) {
		int obj = getBotOwnerId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *bot_owner_idKey = "bot_owner_id";
	json_object_set_member(pJsonObject, bot_owner_idKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsActive();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_activeKey = "is_active";
	json_object_set_member(pJsonObject, is_activeKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsGuest();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_guestKey = "is_guest";
	json_object_set_member(pJsonObject, is_guestKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTimezone();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *timezoneKey = "timezone";
	json_object_set_member(pJsonObject, timezoneKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDateJoined();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *date_joinedKey = "date_joined";
	json_object_set_member(pJsonObject, date_joinedKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDeliveryEmail();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *delivery_emailKey = "delivery_email";
	json_object_set_member(pJsonObject, delivery_emailKey, node);


	{
		JsonObject* json_obj;
		map<string, string> new_list = static_cast<map <string, string> > (getProfileData());
		json_obj = json_object_new();
		for (map<string, string>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			string obj = (*it).first;
			string obj2 = (*it).second;
			JsonNode* tempnode = json_from_string(obj2.c_str(),NULL);
			json_object_set_member(json_obj, obj.c_str(), tempnode);
		}
	node = json_node_alloc();
	json_node_init_object(node, json_obj);
	json_object_unref(json_obj);
	}

	const gchar *profile_dataKey = "profile_data";
	json_object_set_member(pJsonObject, profile_dataKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
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
UserBase::getIsBot()
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
UserBase::getIsAdmin()
{
	return is_admin;
}

void
UserBase::setIsAdmin(bool  is_admin)
{
	this->is_admin = is_admin;
}

bool
UserBase::getIsOwner()
{
	return is_owner;
}

void
UserBase::setIsOwner(bool  is_owner)
{
	this->is_owner = is_owner;
}

bool
UserBase::getIsBillingAdmin()
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
UserBase::getIsActive()
{
	return is_active;
}

void
UserBase::setIsActive(bool  is_active)
{
	this->is_active = is_active;
}

bool
UserBase::getIsGuest()
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

std::map<string, string>
UserBase::getProfileData()
{
	return profile_data;
}

void
UserBase::setProfileData(std::map <string, string> profile_data)
{
	this->profile_data = profile_data;
}


