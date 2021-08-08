#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RealmEmoji.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RealmEmoji::RealmEmoji()
{
	//__init();
}

RealmEmoji::~RealmEmoji()
{
	//__cleanup();
}

void
RealmEmoji::__init()
{
	//id = std::string();
	//name = std::string();
	//source_url = std::string();
	//deactivated = bool(false);
	//author_id = int(0);
}

void
RealmEmoji::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(source_url != NULL) {
	//
	//delete source_url;
	//source_url = NULL;
	//}
	//if(deactivated != NULL) {
	//
	//delete deactivated;
	//deactivated = NULL;
	//}
	//if(author_id != NULL) {
	//
	//delete author_id;
	//author_id = NULL;
	//}
	//
}

void
RealmEmoji::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *source_urlKey = "source_url";
	node = json_object_get_member(pJsonObject, source_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&source_url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *deactivatedKey = "deactivated";
	node = json_object_get_member(pJsonObject, deactivatedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&deactivated, node, "bool", "");
		} else {
			
		}
	}
	const gchar *author_idKey = "author_id";
	node = json_object_get_member(pJsonObject, author_idKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&author_id, node, "int", "");
		} else {
			
		}
	}
}

RealmEmoji::RealmEmoji(char* json)
{
	this->fromJson(json);
}

char*
RealmEmoji::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSourceUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *source_urlKey = "source_url";
	json_object_set_member(pJsonObject, source_urlKey, node);
	if (isprimitive("bool")) {
		bool obj = getDeactivated();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *deactivatedKey = "deactivated";
	json_object_set_member(pJsonObject, deactivatedKey, node);
	if (isprimitive("int")) {
		int obj = getAuthorId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *author_idKey = "author_id";
	json_object_set_member(pJsonObject, author_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RealmEmoji::getId()
{
	return id;
}

void
RealmEmoji::setId(std::string  id)
{
	this->id = id;
}

std::string
RealmEmoji::getName()
{
	return name;
}

void
RealmEmoji::setName(std::string  name)
{
	this->name = name;
}

std::string
RealmEmoji::getSourceUrl()
{
	return source_url;
}

void
RealmEmoji::setSourceUrl(std::string  source_url)
{
	this->source_url = source_url;
}

bool
RealmEmoji::getDeactivated()
{
	return deactivated;
}

void
RealmEmoji::setDeactivated(bool  deactivated)
{
	this->deactivated = deactivated;
}

int
RealmEmoji::getAuthorId()
{
	return author_id;
}

void
RealmEmoji::setAuthorId(int  author_id)
{
	this->author_id = author_id;
}


