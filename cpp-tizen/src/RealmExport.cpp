#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RealmExport.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RealmExport::RealmExport()
{
	//__init();
}

RealmExport::~RealmExport()
{
	//__cleanup();
}

void
RealmExport::__init()
{
	//id = int(0);
	//acting_user_id = int(0);
	//export_time = double(0);
	//deleted_timestamp = double(0);
	//failed_timestamp = double(0);
	//export_url = std::string();
	//pending = bool(false);
}

void
RealmExport::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(acting_user_id != NULL) {
	//
	//delete acting_user_id;
	//acting_user_id = NULL;
	//}
	//if(export_time != NULL) {
	//
	//delete export_time;
	//export_time = NULL;
	//}
	//if(deleted_timestamp != NULL) {
	//
	//delete deleted_timestamp;
	//deleted_timestamp = NULL;
	//}
	//if(failed_timestamp != NULL) {
	//
	//delete failed_timestamp;
	//failed_timestamp = NULL;
	//}
	//if(export_url != NULL) {
	//
	//delete export_url;
	//export_url = NULL;
	//}
	//if(pending != NULL) {
	//
	//delete pending;
	//pending = NULL;
	//}
	//
}

void
RealmExport::fromJson(char* jsonStr)
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
	const gchar *acting_user_idKey = "acting_user_id";
	node = json_object_get_member(pJsonObject, acting_user_idKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&acting_user_id, node, "int", "");
		} else {
			
		}
	}
	const gchar *export_timeKey = "export_time";
	node = json_object_get_member(pJsonObject, export_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&export_time, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&export_time);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *deleted_timestampKey = "deleted_timestamp";
	node = json_object_get_member(pJsonObject, deleted_timestampKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&deleted_timestamp, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&deleted_timestamp);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *failed_timestampKey = "failed_timestamp";
	node = json_object_get_member(pJsonObject, failed_timestampKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&failed_timestamp, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&failed_timestamp);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *export_urlKey = "export_url";
	node = json_object_get_member(pJsonObject, export_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&export_url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *pendingKey = "pending";
	node = json_object_get_member(pJsonObject, pendingKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&pending, node, "bool", "");
		} else {
			
		}
	}
}

RealmExport::RealmExport(char* json)
{
	this->fromJson(json);
}

char*
RealmExport::toJson()
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
	if (isprimitive("int")) {
		int obj = getActingUserId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *acting_user_idKey = "acting_user_id";
	json_object_set_member(pJsonObject, acting_user_idKey, node);
	if (isprimitive("long long")) {
		long long obj = getExportTime();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getExportTime());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *export_timeKey = "export_time";
	json_object_set_member(pJsonObject, export_timeKey, node);
	if (isprimitive("long long")) {
		long long obj = getDeletedTimestamp();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getDeletedTimestamp());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *deleted_timestampKey = "deleted_timestamp";
	json_object_set_member(pJsonObject, deleted_timestampKey, node);
	if (isprimitive("long long")) {
		long long obj = getFailedTimestamp();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getFailedTimestamp());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *failed_timestampKey = "failed_timestamp";
	json_object_set_member(pJsonObject, failed_timestampKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getExportUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *export_urlKey = "export_url";
	json_object_set_member(pJsonObject, export_urlKey, node);
	if (isprimitive("bool")) {
		bool obj = getPending();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *pendingKey = "pending";
	json_object_set_member(pJsonObject, pendingKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
RealmExport::getId()
{
	return id;
}

void
RealmExport::setId(int  id)
{
	this->id = id;
}

int
RealmExport::getActingUserId()
{
	return acting_user_id;
}

void
RealmExport::setActingUserId(int  acting_user_id)
{
	this->acting_user_id = acting_user_id;
}

long long
RealmExport::getExportTime()
{
	return export_time;
}

void
RealmExport::setExportTime(long long  export_time)
{
	this->export_time = export_time;
}

long long
RealmExport::getDeletedTimestamp()
{
	return deleted_timestamp;
}

void
RealmExport::setDeletedTimestamp(long long  deleted_timestamp)
{
	this->deleted_timestamp = deleted_timestamp;
}

long long
RealmExport::getFailedTimestamp()
{
	return failed_timestamp;
}

void
RealmExport::setFailedTimestamp(long long  failed_timestamp)
{
	this->failed_timestamp = failed_timestamp;
}

std::string
RealmExport::getExportUrl()
{
	return export_url;
}

void
RealmExport::setExportUrl(std::string  export_url)
{
	this->export_url = export_url;
}

bool
RealmExport::getPending()
{
	return pending;
}

void
RealmExport::setPending(bool  pending)
{
	this->pending = pending;
}


