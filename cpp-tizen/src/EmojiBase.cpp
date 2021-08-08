#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "EmojiBase.h"

using namespace std;
using namespace Tizen::ArtikCloud;

EmojiBase::EmojiBase()
{
	//__init();
}

EmojiBase::~EmojiBase()
{
	//__cleanup();
}

void
EmojiBase::__init()
{
	//emoji_code = std::string();
	//emoji_name = std::string();
	//reaction_type = std::string();
}

void
EmojiBase::__cleanup()
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
	//
}

void
EmojiBase::fromJson(char* jsonStr)
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
}

EmojiBase::EmojiBase(char* json)
{
	this->fromJson(json);
}

char*
EmojiBase::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
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


