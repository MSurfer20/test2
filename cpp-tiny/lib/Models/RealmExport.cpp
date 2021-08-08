

#include "RealmExport.h"

using namespace Tiny;

RealmExport::RealmExport()
{
	id = int(0);
	acting_user_id = int(0);
	export_time = float(0);
	deleted_timestamp = float(0);
	failed_timestamp = float(0);
	export_url = std::string();
	pending = bool(false);
}

RealmExport::RealmExport(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealmExport::~RealmExport()
{

}

void
RealmExport::fromJson(std::string jsonObj)
{   
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";
    
    if(object.has_key(idKey)) 
    {
        bourne::json value = object[idKey];


        
        jsonToValue(&id, value, "int");


    }

    const char *acting_user_idKey = "acting_user_id";
    
    if(object.has_key(acting_user_idKey)) 
    {
        bourne::json value = object[acting_user_idKey];


        
        jsonToValue(&acting_user_id, value, "int");


    }

    const char *export_timeKey = "export_time";
    
    if(object.has_key(export_timeKey)) 
    {
        bourne::json value = object[export_timeKey];


        
        jsonToValue(&export_time, value, "long");


    }

    const char *deleted_timestampKey = "deleted_timestamp";
    
    if(object.has_key(deleted_timestampKey)) 
    {
        bourne::json value = object[deleted_timestampKey];


        
        jsonToValue(&deleted_timestamp, value, "long");


    }

    const char *failed_timestampKey = "failed_timestamp";
    
    if(object.has_key(failed_timestampKey)) 
    {
        bourne::json value = object[failed_timestampKey];


        
        jsonToValue(&failed_timestamp, value, "long");


    }

    const char *export_urlKey = "export_url";
    
    if(object.has_key(export_urlKey)) 
    {
        bourne::json value = object[export_urlKey];


        
        jsonToValue(&export_url, value, "std::string");


    }

    const char *pendingKey = "pending";
    
    if(object.has_key(pendingKey)) 
    {
        bourne::json value = object[pendingKey];


        
        jsonToValue(&pending, value, "bool");


    }


}

bourne::json
RealmExport::toJson()
{
    bourne::json object = bourne::json::object();

    



    object["id"] = getId();


    



    object["acting_user_id"] = getActingUserId();


    



    object["export_time"] = getExportTime();


    



    object["deleted_timestamp"] = getDeletedTimestamp();


    



    object["failed_timestamp"] = getFailedTimestamp();


    



    object["export_url"] = getExportUrl();


    



    object["pending"] = isPending();



    return object;

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

long
RealmExport::getExportTime()
{
	return export_time;
}

void
RealmExport::setExportTime(long  export_time)
{
	this->export_time = export_time;
}

long
RealmExport::getDeletedTimestamp()
{
	return deleted_timestamp;
}

void
RealmExport::setDeletedTimestamp(long  deleted_timestamp)
{
	this->deleted_timestamp = deleted_timestamp;
}

long
RealmExport::getFailedTimestamp()
{
	return failed_timestamp;
}

void
RealmExport::setFailedTimestamp(long  failed_timestamp)
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
RealmExport::isPending()
{
	return pending;
}

void
RealmExport::setPending(bool  pending)
{
	this->pending = pending;
}



