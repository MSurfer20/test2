

#include "RealmDomain.h"

using namespace Tiny;

RealmDomain::RealmDomain()
{
	domain = std::string();
	allow_subdomains = bool(false);
}

RealmDomain::RealmDomain(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealmDomain::~RealmDomain()
{

}

void
RealmDomain::fromJson(std::string jsonObj)
{   
    bourne::json object = bourne::json::parse(jsonObj);

    const char *domainKey = "domain";
    
    if(object.has_key(domainKey)) 
    {
        bourne::json value = object[domainKey];


        
        jsonToValue(&domain, value, "std::string");


    }

    const char *allow_subdomainsKey = "allow_subdomains";
    
    if(object.has_key(allow_subdomainsKey)) 
    {
        bourne::json value = object[allow_subdomainsKey];


        
        jsonToValue(&allow_subdomains, value, "bool");


    }


}

bourne::json
RealmDomain::toJson()
{
    bourne::json object = bourne::json::object();

    



    object["domain"] = getDomain();


    



    object["allow_subdomains"] = isAllowSubdomains();



    return object;

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
RealmDomain::isAllowSubdomains()
{
	return allow_subdomains;
}

void
RealmDomain::setAllowSubdomains(bool  allow_subdomains)
{
	this->allow_subdomains = allow_subdomains;
}



