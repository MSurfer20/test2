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


#include "RealmPlayground.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

RealmPlayground::RealmPlayground()
{
    m_Id = 0;
    m_IdIsSet = false;
    m_Name = "";
    m_NameIsSet = false;
    m_Pygments_language = "";
    m_Pygments_languageIsSet = false;
    m_Url_prefix = "";
    m_Url_prefixIsSet = false;
    
}

void RealmPlayground::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool RealmPlayground::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool RealmPlayground::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "RealmPlayground" : pathPrefix;

                    
    return success;
}

bool RealmPlayground::operator==(const RealmPlayground& rhs) const
{
    return
    
    
    
    ((!idIsSet() && !rhs.idIsSet()) || (idIsSet() && rhs.idIsSet() && getId() == rhs.getId())) &&
    
    
    ((!nameIsSet() && !rhs.nameIsSet()) || (nameIsSet() && rhs.nameIsSet() && getName() == rhs.getName())) &&
    
    
    ((!pygmentsLanguageIsSet() && !rhs.pygmentsLanguageIsSet()) || (pygmentsLanguageIsSet() && rhs.pygmentsLanguageIsSet() && getPygmentsLanguage() == rhs.getPygmentsLanguage())) &&
    
    
    ((!urlPrefixIsSet() && !rhs.urlPrefixIsSet()) || (urlPrefixIsSet() && rhs.urlPrefixIsSet() && getUrlPrefix() == rhs.getUrlPrefix()))
    
    ;
}

bool RealmPlayground::operator!=(const RealmPlayground& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const RealmPlayground& o)
{
    j = nlohmann::json();
    if(o.idIsSet())
        j["id"] = o.m_Id;
    if(o.nameIsSet())
        j["name"] = o.m_Name;
    if(o.pygmentsLanguageIsSet())
        j["pygments_language"] = o.m_Pygments_language;
    if(o.urlPrefixIsSet())
        j["url_prefix"] = o.m_Url_prefix;
    
}

void from_json(const nlohmann::json& j, RealmPlayground& o)
{
    if(j.find("id") != j.end())
    {
        j.at("id").get_to(o.m_Id);
        o.m_IdIsSet = true;
    } 
    if(j.find("name") != j.end())
    {
        j.at("name").get_to(o.m_Name);
        o.m_NameIsSet = true;
    } 
    if(j.find("pygments_language") != j.end())
    {
        j.at("pygments_language").get_to(o.m_Pygments_language);
        o.m_Pygments_languageIsSet = true;
    } 
    if(j.find("url_prefix") != j.end())
    {
        j.at("url_prefix").get_to(o.m_Url_prefix);
        o.m_Url_prefixIsSet = true;
    } 
    
}

int32_t RealmPlayground::getId() const
{
    return m_Id;
}
void RealmPlayground::setId(int32_t const value)
{
    m_Id = value;
    m_IdIsSet = true;
}
bool RealmPlayground::idIsSet() const
{
    return m_IdIsSet;
}
void RealmPlayground::unsetId()
{
    m_IdIsSet = false;
}
std::string RealmPlayground::getName() const
{
    return m_Name;
}
void RealmPlayground::setName(std::string const& value)
{
    m_Name = value;
    m_NameIsSet = true;
}
bool RealmPlayground::nameIsSet() const
{
    return m_NameIsSet;
}
void RealmPlayground::unsetName()
{
    m_NameIsSet = false;
}
std::string RealmPlayground::getPygmentsLanguage() const
{
    return m_Pygments_language;
}
void RealmPlayground::setPygmentsLanguage(std::string const& value)
{
    m_Pygments_language = value;
    m_Pygments_languageIsSet = true;
}
bool RealmPlayground::pygmentsLanguageIsSet() const
{
    return m_Pygments_languageIsSet;
}
void RealmPlayground::unsetPygments_language()
{
    m_Pygments_languageIsSet = false;
}
std::string RealmPlayground::getUrlPrefix() const
{
    return m_Url_prefix;
}
void RealmPlayground::setUrlPrefix(std::string const& value)
{
    m_Url_prefix = value;
    m_Url_prefixIsSet = true;
}
bool RealmPlayground::urlPrefixIsSet() const
{
    return m_Url_prefixIsSet;
}
void RealmPlayground::unsetUrl_prefix()
{
    m_Url_prefixIsSet = false;
}


} // namespace org::openapitools::server::model

