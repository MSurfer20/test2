#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RealmPlayground.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RealmPlayground::RealmPlayground()
{
	//__init();
}

RealmPlayground::~RealmPlayground()
{
	//__cleanup();
}

void
RealmPlayground::__init()
{
	//id = int(0);
	//name = std::string();
	//pygments_language = std::string();
	//url_prefix = std::string();
}

void
RealmPlayground::__cleanup()
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
	//if(pygments_language != NULL) {
	//
	//delete pygments_language;
	//pygments_language = NULL;
	//}
	//if(url_prefix != NULL) {
	//
	//delete url_prefix;
	//url_prefix = NULL;
	//}
	//
}

void
RealmPlayground::fromJson(char* jsonStr)
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
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *pygments_languageKey = "pygments_language";
	node = json_object_get_member(pJsonObject, pygments_languageKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&pygments_language, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *url_prefixKey = "url_prefix";
	node = json_object_get_member(pJsonObject, url_prefixKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&url_prefix, node, "std::string", "");
		} else {
			
		}
	}
}

RealmPlayground::RealmPlayground(char* json)
{
	this->fromJson(json);
}

char*
RealmPlayground::toJson()
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
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPygmentsLanguage();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *pygments_languageKey = "pygments_language";
	json_object_set_member(pJsonObject, pygments_languageKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUrlPrefix();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *url_prefixKey = "url_prefix";
	json_object_set_member(pJsonObject, url_prefixKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
RealmPlayground::getId()
{
	return id;
}

void
RealmPlayground::setId(int  id)
{
	this->id = id;
}

std::string
RealmPlayground::getName()
{
	return name;
}

void
RealmPlayground::setName(std::string  name)
{
	this->name = name;
}

std::string
RealmPlayground::getPygmentsLanguage()
{
	return pygments_language;
}

void
RealmPlayground::setPygmentsLanguage(std::string  pygments_language)
{
	this->pygments_language = pygments_language;
}

std::string
RealmPlayground::getUrlPrefix()
{
	return url_prefix;
}

void
RealmPlayground::setUrlPrefix(std::string  url_prefix)
{
	this->url_prefix = url_prefix;
}


