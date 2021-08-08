#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "EmojiReactionBase_allOf.h"

using namespace std;
using namespace Tizen::ArtikCloud;

EmojiReactionBase_allOf::EmojiReactionBase_allOf()
{
	//__init();
}

EmojiReactionBase_allOf::~EmojiReactionBase_allOf()
{
	//__cleanup();
}

void
EmojiReactionBase_allOf::__init()
{
	//user_id = int(0);
	//user = new EmojiReactionBase_allOf_user();
}

void
EmojiReactionBase_allOf::__cleanup()
{
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
EmojiReactionBase_allOf::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	

		if (isprimitive("EmojiReactionBase_allOf_user")) {
			jsonToValue(&user, node, "EmojiReactionBase_allOf_user", "EmojiReactionBase_allOf_user");
		} else {
			
			EmojiReactionBase_allOf_user* obj = static_cast<EmojiReactionBase_allOf_user*> (&user);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

EmojiReactionBase_allOf::EmojiReactionBase_allOf(char* json)
{
	this->fromJson(json);
}

char*
EmojiReactionBase_allOf::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getUserId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *user_idKey = "user_id";
	json_object_set_member(pJsonObject, user_idKey, node);
	if (isprimitive("EmojiReactionBase_allOf_user")) {
		EmojiReactionBase_allOf_user obj = getUser();
		node = converttoJson(&obj, "EmojiReactionBase_allOf_user", "");
	}
	else {
		
		EmojiReactionBase_allOf_user obj = static_cast<EmojiReactionBase_allOf_user> (getUser());
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


