

#include "Attachments_messages.h"

using namespace Tiny;

Attachments_messages::Attachments_messages()
{
	date_sent = int(0);
	id = int(0);
}

Attachments_messages::Attachments_messages(std::string jsonString)
{
	this->fromJson(jsonString);
}

Attachments_messages::~Attachments_messages()
{

}

void
Attachments_messages::fromJson(std::string jsonObj)
{   
    bourne::json object = bourne::json::parse(jsonObj);

    const char *date_sentKey = "date_sent";
    
    if(object.has_key(date_sentKey)) 
    {
        bourne::json value = object[date_sentKey];


        
        jsonToValue(&date_sent, value, "int");


    }

    const char *idKey = "id";
    
    if(object.has_key(idKey)) 
    {
        bourne::json value = object[idKey];


        
        jsonToValue(&id, value, "int");


    }


}

bourne::json
Attachments_messages::toJson()
{
    bourne::json object = bourne::json::object();

    



    object["date_sent"] = getDateSent();


    



    object["id"] = getId();



    return object;

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



