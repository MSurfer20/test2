#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "EmojiReaction.h"

using namespace std;
using namespace Tizen::ArtikCloud;

EmojiReaction::EmojiReaction()
{
	//__init();
}

EmojiReaction::~EmojiReaction()
{
	//__cleanup();
}

void
EmojiReaction::__init()
{
	//emoji_code = null;
	//emoji_name = null;
	//reaction_type = null;
	//user_id = null;
	//user = null;
}

void
EmojiReaction::__cleanup()
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
EmojiReaction::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *emoji_codeKey = "emoji_code";
	node = json_object_get_member(pJsonObject, emoji_codeKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&emoji_code, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&emoji_code);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *emoji_nameKey = "emoji_name";
	node = json_object_get_member(pJsonObject, emoji_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&emoji_name, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&emoji_name);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *reaction_typeKey = "reaction_type";
	node = json_object_get_member(pJsonObject, reaction_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&reaction_type, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&reaction_type);
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
	const gchar *userKey = "user";
	node = json_object_get_member(pJsonObject, userKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&user, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&user);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

EmojiReaction::EmojiReaction(char* json)
{
	this->fromJson(json);
}

char*
EmojiReaction::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AnyType")) {
		AnyType obj = getEmojiCode();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getEmojiCode());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *emoji_codeKey = "emoji_code";
	json_object_set_member(pJsonObject, emoji_codeKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getEmojiName();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getEmojiName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *emoji_nameKey = "emoji_name";
	json_object_set_member(pJsonObject, emoji_nameKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getReactionType();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getReactionType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *reaction_typeKey = "reaction_type";
	json_object_set_member(pJsonObject, reaction_typeKey, node);
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
		AnyType obj = getUser();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getUser());
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

AnyType
EmojiReaction::getEmojiCode()
{
	return emoji_code;
}

void
EmojiReaction::setEmojiCode(AnyType  emoji_code)
{
	this->emoji_code = emoji_code;
}

AnyType
EmojiReaction::getEmojiName()
{
	return emoji_name;
}

void
EmojiReaction::setEmojiName(AnyType  emoji_name)
{
	this->emoji_name = emoji_name;
}

AnyType
EmojiReaction::getReactionType()
{
	return reaction_type;
}

void
EmojiReaction::setReactionType(AnyType  reaction_type)
{
	this->reaction_type = reaction_type;
}

AnyType
EmojiReaction::getUserId()
{
	return user_id;
}

void
EmojiReaction::setUserId(AnyType  user_id)
{
	this->user_id = user_id;
}

AnyType
EmojiReaction::getUser()
{
	return user;
}

void
EmojiReaction::setUser(AnyType  user)
{
	this->user = user;
}


