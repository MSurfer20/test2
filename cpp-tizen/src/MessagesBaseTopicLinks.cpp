#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MessagesBase_topic_links.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MessagesBase_topic_links::MessagesBase_topic_links()
{
	//__init();
}

MessagesBase_topic_links::~MessagesBase_topic_links()
{
	//__cleanup();
}

void
MessagesBase_topic_links::__init()
{
	//text = std::string();
	//url = std::string();
}

void
MessagesBase_topic_links::__cleanup()
{
	//if(text != NULL) {
	//
	//delete text;
	//text = NULL;
	//}
	//if(url != NULL) {
	//
	//delete url;
	//url = NULL;
	//}
	//
}

void
MessagesBase_topic_links::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *textKey = "text";
	node = json_object_get_member(pJsonObject, textKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&text, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *urlKey = "url";
	node = json_object_get_member(pJsonObject, urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&url, node, "std::string", "");
		} else {
			
		}
	}
}

MessagesBase_topic_links::MessagesBase_topic_links(char* json)
{
	this->fromJson(json);
}

char*
MessagesBase_topic_links::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getText();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *textKey = "text";
	json_object_set_member(pJsonObject, textKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *urlKey = "url";
	json_object_set_member(pJsonObject, urlKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
MessagesBase_topic_links::getText()
{
	return text;
}

void
MessagesBase_topic_links::setText(std::string  text)
{
	this->text = text;
}

std::string
MessagesBase_topic_links::getUrl()
{
	return url;
}

void
MessagesBase_topic_links::setUrl(std::string  url)
{
	this->url = url;
}


