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


#include "Attachments.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

Attachments::Attachments()
{
    m_Id = 0;
    m_IdIsSet = false;
    m_Name = "";
    m_NameIsSet = false;
    m_Path_id = "";
    m_Path_idIsSet = false;
    m_Size = 0;
    m_SizeIsSet = false;
    m_Create_time = 0;
    m_Create_timeIsSet = false;
    m_MessagesIsSet = false;
    
}

void Attachments::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool Attachments::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool Attachments::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "Attachments" : pathPrefix;

                             
    if (messagesIsSet())
    {
        const std::vector<Attachments_messages>& value = m_Messages;
        const std::string currentValuePath = _pathPrefix + ".messages";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const Attachments_messages& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".messages") && success;
 
                i++;
            }
        }

    }
    
    return success;
}

bool Attachments::operator==(const Attachments& rhs) const
{
    return
    
    
    
    ((!idIsSet() && !rhs.idIsSet()) || (idIsSet() && rhs.idIsSet() && getId() == rhs.getId())) &&
    
    
    ((!nameIsSet() && !rhs.nameIsSet()) || (nameIsSet() && rhs.nameIsSet() && getName() == rhs.getName())) &&
    
    
    ((!pathIdIsSet() && !rhs.pathIdIsSet()) || (pathIdIsSet() && rhs.pathIdIsSet() && getPathId() == rhs.getPathId())) &&
    
    
    ((!sizeIsSet() && !rhs.sizeIsSet()) || (sizeIsSet() && rhs.sizeIsSet() && getSize() == rhs.getSize())) &&
    
    
    ((!createTimeIsSet() && !rhs.createTimeIsSet()) || (createTimeIsSet() && rhs.createTimeIsSet() && getCreateTime() == rhs.getCreateTime())) &&
    
    
    ((!messagesIsSet() && !rhs.messagesIsSet()) || (messagesIsSet() && rhs.messagesIsSet() && getMessages() == rhs.getMessages()))
    
    ;
}

bool Attachments::operator!=(const Attachments& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const Attachments& o)
{
    j = nlohmann::json();
    if(o.idIsSet())
        j["id"] = o.m_Id;
    if(o.nameIsSet())
        j["name"] = o.m_Name;
    if(o.pathIdIsSet())
        j["path_id"] = o.m_Path_id;
    if(o.sizeIsSet())
        j["size"] = o.m_Size;
    if(o.createTimeIsSet())
        j["create_time"] = o.m_Create_time;
    if(o.messagesIsSet() || !o.m_Messages.empty())
        j["messages"] = o.m_Messages;
    
}

void from_json(const nlohmann::json& j, Attachments& o)
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
    if(j.find("path_id") != j.end())
    {
        j.at("path_id").get_to(o.m_Path_id);
        o.m_Path_idIsSet = true;
    } 
    if(j.find("size") != j.end())
    {
        j.at("size").get_to(o.m_Size);
        o.m_SizeIsSet = true;
    } 
    if(j.find("create_time") != j.end())
    {
        j.at("create_time").get_to(o.m_Create_time);
        o.m_Create_timeIsSet = true;
    } 
    if(j.find("messages") != j.end())
    {
        j.at("messages").get_to(o.m_Messages);
        o.m_MessagesIsSet = true;
    } 
    
}

int32_t Attachments::getId() const
{
    return m_Id;
}
void Attachments::setId(int32_t const value)
{
    m_Id = value;
    m_IdIsSet = true;
}
bool Attachments::idIsSet() const
{
    return m_IdIsSet;
}
void Attachments::unsetId()
{
    m_IdIsSet = false;
}
std::string Attachments::getName() const
{
    return m_Name;
}
void Attachments::setName(std::string const& value)
{
    m_Name = value;
    m_NameIsSet = true;
}
bool Attachments::nameIsSet() const
{
    return m_NameIsSet;
}
void Attachments::unsetName()
{
    m_NameIsSet = false;
}
std::string Attachments::getPathId() const
{
    return m_Path_id;
}
void Attachments::setPathId(std::string const& value)
{
    m_Path_id = value;
    m_Path_idIsSet = true;
}
bool Attachments::pathIdIsSet() const
{
    return m_Path_idIsSet;
}
void Attachments::unsetPath_id()
{
    m_Path_idIsSet = false;
}
int32_t Attachments::getSize() const
{
    return m_Size;
}
void Attachments::setSize(int32_t const value)
{
    m_Size = value;
    m_SizeIsSet = true;
}
bool Attachments::sizeIsSet() const
{
    return m_SizeIsSet;
}
void Attachments::unsetSize()
{
    m_SizeIsSet = false;
}
int32_t Attachments::getCreateTime() const
{
    return m_Create_time;
}
void Attachments::setCreateTime(int32_t const value)
{
    m_Create_time = value;
    m_Create_timeIsSet = true;
}
bool Attachments::createTimeIsSet() const
{
    return m_Create_timeIsSet;
}
void Attachments::unsetCreate_time()
{
    m_Create_timeIsSet = false;
}
std::vector<Attachments_messages> Attachments::getMessages() const
{
    return m_Messages;
}
void Attachments::setMessages(std::vector<Attachments_messages> const& value)
{
    m_Messages = value;
    m_MessagesIsSet = true;
}
bool Attachments::messagesIsSet() const
{
    return m_MessagesIsSet;
}
void Attachments::unsetMessages()
{
    m_MessagesIsSet = false;
}


} // namespace org::openapitools::server::model

