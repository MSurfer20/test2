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


#include "EmojiReactionBase_user.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

EmojiReactionBase_user::EmojiReactionBase_user()
{
    m_Id = 0;
    m_IdIsSet = false;
    m_Email = "";
    m_EmailIsSet = false;
    m_Full_name = "";
    m_Full_nameIsSet = false;
    m_Is_mirror_dummy = false;
    m_Is_mirror_dummyIsSet = false;
    
}

void EmojiReactionBase_user::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool EmojiReactionBase_user::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool EmojiReactionBase_user::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "EmojiReactionBase_user" : pathPrefix;

                    
    return success;
}

bool EmojiReactionBase_user::operator==(const EmojiReactionBase_user& rhs) const
{
    return
    
    
    
    ((!idIsSet() && !rhs.idIsSet()) || (idIsSet() && rhs.idIsSet() && getId() == rhs.getId())) &&
    
    
    ((!emailIsSet() && !rhs.emailIsSet()) || (emailIsSet() && rhs.emailIsSet() && getEmail() == rhs.getEmail())) &&
    
    
    ((!fullNameIsSet() && !rhs.fullNameIsSet()) || (fullNameIsSet() && rhs.fullNameIsSet() && getFullName() == rhs.getFullName())) &&
    
    
    ((!isMirrorDummyIsSet() && !rhs.isMirrorDummyIsSet()) || (isMirrorDummyIsSet() && rhs.isMirrorDummyIsSet() && isIsMirrorDummy() == rhs.isIsMirrorDummy()))
    
    ;
}

bool EmojiReactionBase_user::operator!=(const EmojiReactionBase_user& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const EmojiReactionBase_user& o)
{
    j = nlohmann::json();
    if(o.idIsSet())
        j["id"] = o.m_Id;
    if(o.emailIsSet())
        j["email"] = o.m_Email;
    if(o.fullNameIsSet())
        j["full_name"] = o.m_Full_name;
    if(o.isMirrorDummyIsSet())
        j["is_mirror_dummy"] = o.m_Is_mirror_dummy;
    
}

void from_json(const nlohmann::json& j, EmojiReactionBase_user& o)
{
    if(j.find("id") != j.end())
    {
        j.at("id").get_to(o.m_Id);
        o.m_IdIsSet = true;
    } 
    if(j.find("email") != j.end())
    {
        j.at("email").get_to(o.m_Email);
        o.m_EmailIsSet = true;
    } 
    if(j.find("full_name") != j.end())
    {
        j.at("full_name").get_to(o.m_Full_name);
        o.m_Full_nameIsSet = true;
    } 
    if(j.find("is_mirror_dummy") != j.end())
    {
        j.at("is_mirror_dummy").get_to(o.m_Is_mirror_dummy);
        o.m_Is_mirror_dummyIsSet = true;
    } 
    
}

int32_t EmojiReactionBase_user::getId() const
{
    return m_Id;
}
void EmojiReactionBase_user::setId(int32_t const value)
{
    m_Id = value;
    m_IdIsSet = true;
}
bool EmojiReactionBase_user::idIsSet() const
{
    return m_IdIsSet;
}
void EmojiReactionBase_user::unsetId()
{
    m_IdIsSet = false;
}
std::string EmojiReactionBase_user::getEmail() const
{
    return m_Email;
}
void EmojiReactionBase_user::setEmail(std::string const& value)
{
    m_Email = value;
    m_EmailIsSet = true;
}
bool EmojiReactionBase_user::emailIsSet() const
{
    return m_EmailIsSet;
}
void EmojiReactionBase_user::unsetEmail()
{
    m_EmailIsSet = false;
}
std::string EmojiReactionBase_user::getFullName() const
{
    return m_Full_name;
}
void EmojiReactionBase_user::setFullName(std::string const& value)
{
    m_Full_name = value;
    m_Full_nameIsSet = true;
}
bool EmojiReactionBase_user::fullNameIsSet() const
{
    return m_Full_nameIsSet;
}
void EmojiReactionBase_user::unsetFull_name()
{
    m_Full_nameIsSet = false;
}
bool EmojiReactionBase_user::isIsMirrorDummy() const
{
    return m_Is_mirror_dummy;
}
void EmojiReactionBase_user::setIsMirrorDummy(bool const value)
{
    m_Is_mirror_dummy = value;
    m_Is_mirror_dummyIsSet = true;
}
bool EmojiReactionBase_user::isMirrorDummyIsSet() const
{
    return m_Is_mirror_dummyIsSet;
}
void EmojiReactionBase_user::unsetIs_mirror_dummy()
{
    m_Is_mirror_dummyIsSet = false;
}


} // namespace org::openapitools::server::model

