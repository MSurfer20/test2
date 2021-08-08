

#include "MessagesBase_topic_links.h"

using namespace Tiny;

MessagesBase_topic_links::MessagesBase_topic_links()
{
	text = std::string();
	url = std::string();
}

MessagesBase_topic_links::MessagesBase_topic_links(std::string jsonString)
{
	this->fromJson(jsonString);
}

MessagesBase_topic_links::~MessagesBase_topic_links()
{

}

void
MessagesBase_topic_links::fromJson(std::string jsonObj)
{   
    bourne::json object = bourne::json::parse(jsonObj);

    const char *textKey = "text";
    
    if(object.has_key(textKey)) 
    {
        bourne::json value = object[textKey];


        
        jsonToValue(&text, value, "std::string");


    }

    const char *urlKey = "url";
    
    if(object.has_key(urlKey)) 
    {
        bourne::json value = object[urlKey];


        
        jsonToValue(&url, value, "std::string");


    }


}

bourne::json
MessagesBase_topic_links::toJson()
{
    bourne::json object = bourne::json::object();

    



    object["text"] = getText();


    



    object["url"] = getUrl();



    return object;

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



