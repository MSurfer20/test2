#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RealmDomain.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RealmDomain::RealmDomain()
{
	//__init();
}

RealmDomain::~RealmDomain()
{
	//__cleanup();
}

void
RealmDomain::__init()
{
	//domain = std::string();
	//allow_subdomains = bool(false);
}

void
RealmDomain::__cleanup()
{
	//if(domain != NULL) {
	//
	//delete domain;
	//domain = NULL;
	//}
	//if(allow_subdomains != NULL) {
	//
	//delete allow_subdomains;
	//allow_subdomains = NULL;
	//}
	//
}

void
RealmDomain::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *domainKey = "domain";
	node = json_object_get_member(pJsonObject, domainKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&domain, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *allow_subdomainsKey = "allow_subdomains";
	node = json_object_get_member(pJsonObject, allow_subdomainsKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&allow_subdomains, node, "bool", "");
		} else {
			
		}
	}
}

RealmDomain::RealmDomain(char* json)
{
	this->fromJson(json);
}

char*
RealmDomain::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getDomain();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *domainKey = "domain";
	json_object_set_member(pJsonObject, domainKey, node);
	if (isprimitive("bool")) {
		bool obj = getAllowSubdomains();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *allow_subdomainsKey = "allow_subdomains";
	json_object_set_member(pJsonObject, allow_subdomainsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RealmDomain::getDomain()
{
	return domain;
}

void
RealmDomain::setDomain(std::string  domain)
{
	this->domain = domain;
}

bool
RealmDomain::getAllowSubdomains()
{
	return allow_subdomains;
}

void
RealmDomain::setAllowSubdomains(bool  allow_subdomains)
{
	this->allow_subdomains = allow_subdomains;
}


