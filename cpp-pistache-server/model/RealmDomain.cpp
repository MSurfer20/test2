/**
* Zulip REST API
* Powerful open source group chat 
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "RealmDomain.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

RealmDomain::RealmDomain()
{
    m_Domain = "";
    m_DomainIsSet = false;
    m_Allow_subdomains = false;
    m_Allow_subdomainsIsSet = false;
    
}

void RealmDomain::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool RealmDomain::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool RealmDomain::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "RealmDomain" : pathPrefix;

            
    return success;
}

bool RealmDomain::operator==(const RealmDomain& rhs) const
{
    return
    
    
    
    ((!domainIsSet() && !rhs.domainIsSet()) || (domainIsSet() && rhs.domainIsSet() && getDomain() == rhs.getDomain())) &&
    
    
    ((!allowSubdomainsIsSet() && !rhs.allowSubdomainsIsSet()) || (allowSubdomainsIsSet() && rhs.allowSubdomainsIsSet() && isAllowSubdomains() == rhs.isAllowSubdomains()))
    
    ;
}

bool RealmDomain::operator!=(const RealmDomain& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const RealmDomain& o)
{
    j = nlohmann::json();
    if(o.domainIsSet())
        j["domain"] = o.m_Domain;
    if(o.allowSubdomainsIsSet())
        j["allow_subdomains"] = o.m_Allow_subdomains;
    
}

void from_json(const nlohmann::json& j, RealmDomain& o)
{
    if(j.find("domain") != j.end())
    {
        j.at("domain").get_to(o.m_Domain);
        o.m_DomainIsSet = true;
    } 
    if(j.find("allow_subdomains") != j.end())
    {
        j.at("allow_subdomains").get_to(o.m_Allow_subdomains);
        o.m_Allow_subdomainsIsSet = true;
    } 
    
}

std::string RealmDomain::getDomain() const
{
    return m_Domain;
}
void RealmDomain::setDomain(std::string const& value)
{
    m_Domain = value;
    m_DomainIsSet = true;
}
bool RealmDomain::domainIsSet() const
{
    return m_DomainIsSet;
}
void RealmDomain::unsetDomain()
{
    m_DomainIsSet = false;
}
bool RealmDomain::isAllowSubdomains() const
{
    return m_Allow_subdomains;
}
void RealmDomain::setAllowSubdomains(bool const value)
{
    m_Allow_subdomains = value;
    m_Allow_subdomainsIsSet = true;
}
bool RealmDomain::allowSubdomainsIsSet() const
{
    return m_Allow_subdomainsIsSet;
}
void RealmDomain::unsetAllow_subdomains()
{
    m_Allow_subdomainsIsSet = false;
}


} // namespace org::openapitools::server::model
