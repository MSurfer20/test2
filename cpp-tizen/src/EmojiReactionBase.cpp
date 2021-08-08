#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "EmojiReactionBase.h"

using namespace std;
using namespace Tizen::ArtikCloud;

EmojiReactionBase::EmojiReactionBase()
{
	//__init();
}

EmojiReactionBase::~EmojiReactionBase()
{
	//__cleanup();
}

void
EmojiReactionBase::__init()
{
	//emoji_code = std::string();
	//emoji_name = std::string();
	//reaction_type = std::string();
	//user_id = int(0);
	//user = new EmojiReactionBase_user();
}

void
EmojiReactionBase::__cleanup()
{
	//if(emoji_code != NULL) {
	//
	//delete emoji_code;
	//emoji_code = NULL;
	//}
	//if(emoji_name != NULL) {
	//
	//delete emoji_name;
	//emoji_name = NULL;
	//}
	//if(reaction_type != NULL) {
	//
	//delete reaction_type;
	//reaction_type = NULL;
	//}
	//if(user_id != NULL) {
	//
	//delete user_id;
	//user_id = NULL;
	//}
	//if(user != NULL) {
	//
	//delete user;
	//user = NULL;
	//}
	//
}

void
EmojiReactionBase::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *emoji_codeKey = "emoji_code";
	node = json_object_get_member(pJsonObject, emoji_codeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&emoji_code, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *emoji_nameKey = "emoji_name";
	node = json_object_get_member(pJsonObject, emoji_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&emoji_name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *reaction_typeKey = "reaction_type";
	node = json_object_get_member(pJsonObject, reaction_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&reaction_type, node, "std::string", "");
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
	const gchar *userKey = "user";
	node = json_object_get_member(pJsonObject, userKey);
	if (node !=NULL) {
	

		if (isprimitive("EmojiReactionBase_user")) {
			jsonToValue(&user, node, "EmojiReactionBase_user", "EmojiReactionBase_user");
		} else {
			
			EmojiReactionBase_user* obj = static_cast<EmojiReactionBase_user*> (&user);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

EmojiReactionBase::EmojiReactionBase(char* json)
{
	this->fromJson(json);
}

char*
EmojiReactionBase::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getEmojiCode();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *emoji_codeKey = "emoji_code";
	json_object_set_member(pJsonObject, emoji_codeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEmojiName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *emoji_nameKey = "emoji_name";
	json_object_set_member(pJsonObject, emoji_nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getReactionType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *reaction_typeKey = "reaction_type";
	json_object_set_member(pJsonObject, reaction_typeKey, node);
	if (isprimitive("int")) {
		int obj = getUserId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *user_idKey = "user_id";
	json_object_set_member(pJsonObject, user_idKey, node);
	if (isprimitive("EmojiReactionBase_user")) {
		EmojiReactionBase_user obj = getUser();
		node = converttoJson(&obj, "EmojiReactionBase_user", "");
	}
	else {
		
		EmojiReactionBase_user obj = static_cast<EmojiReactionBase_user> (getUser());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *userKey = "user";
	json_object_set_member(pJsonObject, userKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
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


