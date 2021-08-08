#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "User_allOf.h"

using namespace std;
using namespace Tizen::ArtikCloud;

User_allOf::User_allOf()
{
	//__init();
}

User_allOf::~User_allOf()
{
	//__cleanup();
}

void
User_allOf::__init()
{
	//email = null;
	//is_bot = null;
	//avatar_url = null;
	//avatar_version = null;
	//full_name = null;
	//is_admin = null;
	//is_owner = null;
	//is_billing_admin = null;
	//role = null;
	//bot_type = null;
	//user_id = null;
	//bot_owner_id = null;
	//is_active = null;
	//is_guest = null;
	//timezone = null;
	//date_joined = null;
	//delivery_email = null;
	//profile_data = null;
}

void
User_allOf::__cleanup()
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
	//
	//delete profile_data;
	//profile_data = NULL;
	//}
	//
}

void
User_allOf::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *emailKey = "email";
	node = json_object_get_member(pJsonObject, emailKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&email, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&email);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *is_botKey = "is_bot";
	node = json_object_get_member(pJsonObject, is_botKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&is_bot, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&is_bot);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *avatar_urlKey = "avatar_url";
	node = json_object_get_member(pJsonObject, avatar_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&avatar_url, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&avatar_url);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *avatar_versionKey = "avatar_version";
	node = json_object_get_member(pJsonObject, avatar_versionKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&avatar_version, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&avatar_version);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *full_nameKey = "full_name";
	node = json_object_get_member(pJsonObject, full_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&full_name, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&full_name);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *is_adminKey = "is_admin";
	node = json_object_get_member(pJsonObject, is_adminKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&is_admin, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&is_admin);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *is_ownerKey = "is_owner";
	node = json_object_get_member(pJsonObject, is_ownerKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&is_owner, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&is_owner);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *is_billing_adminKey = "is_billing_admin";
	node = json_object_get_member(pJsonObject, is_billing_adminKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&is_billing_admin, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&is_billing_admin);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *roleKey = "role";
	node = json_object_get_member(pJsonObject, roleKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&role, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&role);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *bot_typeKey = "bot_type";
	node = json_object_get_member(pJsonObject, bot_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&bot_type, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&bot_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *user_idKey = "user_id";
	node = json_object_get_member(pJsonObject, user_idKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&user_id, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&user_id);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *bot_owner_idKey = "bot_owner_id";
	node = json_object_get_member(pJsonObject, bot_owner_idKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&bot_owner_id, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&bot_owner_id);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *is_activeKey = "is_active";
	node = json_object_get_member(pJsonObject, is_activeKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&is_active, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&is_active);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *is_guestKey = "is_guest";
	node = json_object_get_member(pJsonObject, is_guestKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&is_guest, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&is_guest);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *timezoneKey = "timezone";
	node = json_object_get_member(pJsonObject, timezoneKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&timezone, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&timezone);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *date_joinedKey = "date_joined";
	node = json_object_get_member(pJsonObject, date_joinedKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&date_joined, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&date_joined);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *delivery_emailKey = "delivery_email";
	node = json_object_get_member(pJsonObject, delivery_emailKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&delivery_email, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&delivery_email);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *profile_dataKey = "profile_data";
	node = json_object_get_member(pJsonObject, profile_dataKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&profile_data, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&profile_data);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

User_allOf::User_allOf(char* json)
{
	this->fromJson(json);
}

char*
User_allOf::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AnyType")) {
		AnyType obj = getEmail();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getEmail());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *emailKey = "email";
	json_object_set_member(pJsonObject, emailKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getIsBot();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getIsBot());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *is_botKey = "is_bot";
	json_object_set_member(pJsonObject, is_botKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getAvatarUrl();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getAvatarUrl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *avatar_urlKey = "avatar_url";
	json_object_set_member(pJsonObject, avatar_urlKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getAvatarVersion();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getAvatarVersion());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *avatar_versionKey = "avatar_version";
	json_object_set_member(pJsonObject, avatar_versionKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getFullName();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getFullName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *full_nameKey = "full_name";
	json_object_set_member(pJsonObject, full_nameKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getIsAdmin();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getIsAdmin());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *is_adminKey = "is_admin";
	json_object_set_member(pJsonObject, is_adminKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getIsOwner();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getIsOwner());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *is_ownerKey = "is_owner";
	json_object_set_member(pJsonObject, is_ownerKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getIsBillingAdmin();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getIsBillingAdmin());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *is_billing_adminKey = "is_billing_admin";
	json_object_set_member(pJsonObject, is_billing_adminKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getRole();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getRole());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *roleKey = "role";
	json_object_set_member(pJsonObject, roleKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getBotType();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getBotType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *bot_typeKey = "bot_type";
	json_object_set_member(pJsonObject, bot_typeKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getUserId();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getUserId());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *user_idKey = "user_id";
	json_object_set_member(pJsonObject, user_idKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getBotOwnerId();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getBotOwnerId());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *bot_owner_idKey = "bot_owner_id";
	json_object_set_member(pJsonObject, bot_owner_idKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getIsActive();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getIsActive());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *is_activeKey = "is_active";
	json_object_set_member(pJsonObject, is_activeKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getIsGuest();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getIsGuest());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *is_guestKey = "is_guest";
	json_object_set_member(pJsonObject, is_guestKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getTimezone();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getTimezone());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *timezoneKey = "timezone";
	json_object_set_member(pJsonObject, timezoneKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getDateJoined();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getDateJoined());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *date_joinedKey = "date_joined";
	json_object_set_member(pJsonObject, date_joinedKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getDeliveryEmail();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getDeliveryEmail());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *delivery_emailKey = "delivery_email";
	json_object_set_member(pJsonObject, delivery_emailKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getProfileData();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getProfileData());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
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


