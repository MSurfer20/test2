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


#include "DefaultStreamGroup.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

DefaultStreamGroup::DefaultStreamGroup()
{
    m_Name = "";
    m_NameIsSet = false;
    m_Description = "";
    m_DescriptionIsSet = false;
    m_Id = 0;
    m_IdIsSet = false;
    m_StreamsIsSet = false;
    
}

void DefaultStreamGroup::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool DefaultStreamGroup::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool DefaultStreamGroup::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "DefaultStreamGroup" : pathPrefix;

                     
    if (streamsIsSet())
    {
        const std::vector<BasicStream>& value = m_Streams;
        const std::string currentValuePath = _pathPrefix + ".streams";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const BasicStream& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".streams") && success;
 
                i++;
            }
        }

    }
    
    return success;
}

bool DefaultStreamGroup::operator==(const DefaultStreamGroup& rhs) const
{
    return
    
    
    
    ((!nameIsSet() && !rhs.nameIsSet()) || (nameIsSet() && rhs.nameIsSet() && getName() == rhs.getName())) &&
    
    
    ((!descriptionIsSet() && !rhs.descriptionIsSet()) || (descriptionIsSet() && rhs.descriptionIsSet() && getDescription() == rhs.getDescription())) &&
    
    
    ((!idIsSet() && !rhs.idIsSet()) || (idIsSet() && rhs.idIsSet() && getId() == rhs.getId())) &&
    
    
    ((!streamsIsSet() && !rhs.streamsIsSet()) || (streamsIsSet() && rhs.streamsIsSet() && getStreams() == rhs.getStreams()))
    
    ;
}

bool DefaultStreamGroup::operator!=(const DefaultStreamGroup& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const DefaultStreamGroup& o)
{
    j = nlohmann::json();
    if(o.nameIsSet())
        j["name"] = o.m_Name;
    if(o.descriptionIsSet())
        j["description"] = o.m_Description;
    if(o.idIsSet())
        j["id"] = o.m_Id;
    if(o.streamsIsSet() || !o.m_Streams.empty())
        j["streams"] = o.m_Streams;
    
}

void from_json(const nlohmann::json& j, DefaultStreamGroup& o)
{
    if(j.find("name") != j.end())
    {
        j.at("name").get_to(o.m_Name);
        o.m_NameIsSet = true;
    } 
    if(j.find("description") != j.end())
    {
        j.at("description").get_to(o.m_Description);
        o.m_DescriptionIsSet = true;
    } 
    if(j.find("id") != j.end())
    {
        j.at("id").get_to(o.m_Id);
        o.m_IdIsSet = true;
    } 
    if(j.find("streams") != j.end())
    {
        j.at("streams").get_to(o.m_Streams);
        o.m_StreamsIsSet = true;
    } 
    
}

std::string DefaultStreamGroup::getName() const
{
    return m_Name;
}
void DefaultStreamGroup::setName(std::string const& value)
{
    m_Name = value;
    m_NameIsSet = true;
}
bool DefaultStreamGroup::nameIsSet() const
{
    return m_NameIsSet;
}
void DefaultStreamGroup::unsetName()
{
    m_NameIsSet = false;
}
std::string DefaultStreamGroup::getDescription() const
{
    return m_Description;
}
void DefaultStreamGroup::setDescription(std::string const& value)
{
    m_Description = value;
    m_DescriptionIsSet = true;
}
bool DefaultStreamGroup::descriptionIsSet() const
{
    return m_DescriptionIsSet;
}
void DefaultStreamGroup::unsetDescription()
{
    m_DescriptionIsSet = false;
}
int32_t DefaultStreamGroup::getId() const
{
    return m_Id;
}
void DefaultStreamGroup::setId(int32_t const value)
{
    m_Id = value;
    m_IdIsSet = true;
}
bool DefaultStreamGroup::idIsSet() const
{
    return m_IdIsSet;
}
void DefaultStreamGroup::unsetId()
{
    m_IdIsSet = false;
}
std::vector<BasicStream> DefaultStreamGroup::getStreams() const
{
    return m_Streams;
}
void DefaultStreamGroup::setStreams(std::vector<BasicStream> const& value)
{
    m_Streams = value;
    m_StreamsIsSet = true;
}
bool DefaultStreamGroup::streamsIsSet() const
{
    return m_StreamsIsSet;
}
void DefaultStreamGroup::unsetStreams()
{
    m_StreamsIsSet = false;
}


} // namespace org::openapitools::server::model

