#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "EmojiReactionBase_allOf_user.h"

using namespace std;
using namespace Tizen::ArtikCloud;

EmojiReactionBase_allOf_user::EmojiReactionBase_allOf_user()
{
	//__init();
}

EmojiReactionBase_allOf_user::~EmojiReactionBase_allOf_user()
{
	//__cleanup();
}

void
EmojiReactionBase_allOf_user::__init()
{
	//id = int(0);
	//email = std::string();
	//full_name = std::string();
	//is_mirror_dummy = bool(false);
}

void
EmojiReactionBase_allOf_user::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(email != NULL) {
	//
	//delete email;
	//email = NULL;
	//}
	//if(full_name != NULL) {
	//
	//delete full_name;
	//full_name = NULL;
	//}
	//if(is_mirror_dummy != NULL) {
	//
	//delete is_mirror_dummy;
	//is_mirror_dummy = NULL;
	//}
	//
}

void
EmojiReactionBase_allOf_user::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&id, node, "int", "");
		} else {
			
		}
	}
	const gchar *emailKey = "email";
	node = json_object_get_member(pJsonObject, emailKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&email, node, "std::string", "");
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
	const gchar *is_mirror_dummyKey = "is_mirror_dummy";
	node = json_object_get_member(pJsonObject, is_mirror_dummyKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_mirror_dummy, node, "bool", "");
		} else {
			
		}
	}
}

EmojiReactionBase_allOf_user::EmojiReactionBase_allOf_user(char* json)
{
	this->fromJson(json);
}

char*
EmojiReactionBase_allOf_user::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEmail();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *emailKey = "email";
	json_object_set_member(pJsonObject, emailKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFullName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *full_nameKey = "full_name";
	json_object_set_member(pJsonObject, full_nameKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsMirrorDummy();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_mirror_dummyKey = "is_mirror_dummy";
	json_object_set_member(pJsonObject, is_mirror_dummyKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
EmojiReactionBase_allOf_user::getId()
{
	return id;
}

void
EmojiReactionBase_allOf_user::setId(int  id)
{
	this->id = id;
}

std::string
EmojiReactionBase_allOf_user::getEmail()
{
	return email;
}

void
EmojiReactionBase_allOf_user::setEmail(std::string  email)
{
	this->email = email;
}

std::string
EmojiReactionBase_allOf_user::getFullName()
{
	return full_name;
}

void
EmojiReactionBase_allOf_user::setFullName(std::string  full_name)
{
	this->full_name = full_name;
}

bool
EmojiReactionBase_allOf_user::getIsMirrorDummy()
{
	return is_mirror_dummy;
}

void
EmojiReactionBase_allOf_user::setIsMirrorDummy(bool  is_mirror_dummy)
{
	this->is_mirror_dummy = is_mirror_dummy;
}


