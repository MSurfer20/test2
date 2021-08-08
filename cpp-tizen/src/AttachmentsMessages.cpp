#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Attachments_messages.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Attachments_messages::Attachments_messages()
{
	//__init();
}

Attachments_messages::~Attachments_messages()
{
	//__cleanup();
}

void
Attachments_messages::__init()
{
	//date_sent = int(0);
	//id = int(0);
}

void
Attachments_messages::__cleanup()
{
	//if(date_sent != NULL) {
	//
	//delete date_sent;
	//date_sent = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//
}

void
Attachments_messages::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *date_sentKey = "date_sent";
	node = json_object_get_member(pJsonObject, date_sentKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&date_sent, node, "int", "");
		} else {
			
		}
	}
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&id, node, "int", "");
		} else {
			
		}
	}
}

Attachments_messages::Attachments_messages(char* json)
{
	this->fromJson(json);
}

char*
Attachments_messages::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getDateSent();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *date_sentKey = "date_sent";
	json_object_set_member(pJsonObject, date_sentKey, node);
	if (isprimitive("int")) {
		int obj = getId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
Attachments_messages::getDateSent()
{
	return date_sent;
}

void
Attachments_messages::setDateSent(int  date_sent)
{
	this->date_sent = date_sent;
}

int
Attachments_messages::getId()
{
	return id;
}

void
Attachments_messages::setId(int  id)
{
	this->id = id;
}


