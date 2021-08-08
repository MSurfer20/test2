/**
 * Zulip REST API
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 5.2.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "Attachments.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {




Attachments::Attachments()
{
    m_Id = 0;
    m_IdIsSet = false;
    m_Name = utility::conversions::to_string_t("");
    m_NameIsSet = false;
    m_Path_id = utility::conversions::to_string_t("");
    m_Path_idIsSet = false;
    m_Size = 0;
    m_SizeIsSet = false;
    m_Create_time = 0;
    m_Create_timeIsSet = false;
    m_MessagesIsSet = false;
}

Attachments::~Attachments()
{
}

void Attachments::validate()
{
    // TODO: implement validation
}

web::json::value Attachments::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_IdIsSet)
    {
        val[utility::conversions::to_string_t("id")] = ModelBase::toJson(m_Id);
    }
    if(m_NameIsSet)
    {
        val[utility::conversions::to_string_t("name")] = ModelBase::toJson(m_Name);
    }
    if(m_Path_idIsSet)
    {
        val[utility::conversions::to_string_t("path_id")] = ModelBase::toJson(m_Path_id);
    }
    if(m_SizeIsSet)
    {
        val[utility::conversions::to_string_t("size")] = ModelBase::toJson(m_Size);
    }
    if(m_Create_timeIsSet)
    {
        val[utility::conversions::to_string_t("create_time")] = ModelBase::toJson(m_Create_time);
    }
    if(m_MessagesIsSet)
    {
        val[utility::conversions::to_string_t("messages")] = ModelBase::toJson(m_Messages);
    }

    return val;
}

bool Attachments::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t("id")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("id"));
        if(!fieldValue.is_null())
        {
            int32_t refVal_id;
            ok &= ModelBase::fromJson(fieldValue, refVal_id);
            setId(refVal_id);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("name")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("name"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_name;
            ok &= ModelBase::fromJson(fieldValue, refVal_name);
            setName(refVal_name);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("path_id")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("path_id"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_path_id;
            ok &= ModelBase::fromJson(fieldValue, refVal_path_id);
            setPathId(refVal_path_id);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("size")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("size"));
        if(!fieldValue.is_null())
        {
            int32_t refVal_size;
            ok &= ModelBase::fromJson(fieldValue, refVal_size);
            setSize(refVal_size);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("create_time")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("create_time"));
        if(!fieldValue.is_null())
        {
            int32_t refVal_create_time;
            ok &= ModelBase::fromJson(fieldValue, refVal_create_time);
            setCreateTime(refVal_create_time);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("messages")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("messages"));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<Attachments_messages>> refVal_messages;
            ok &= ModelBase::fromJson(fieldValue, refVal_messages);
            setMessages(refVal_messages);
        }
    }
    return ok;
}

void Attachments::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }
    if(m_IdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("id"), m_Id));
    }
    if(m_NameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("name"), m_Name));
    }
    if(m_Path_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("path_id"), m_Path_id));
    }
    if(m_SizeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("size"), m_Size));
    }
    if(m_Create_timeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("create_time"), m_Create_time));
    }
    if(m_MessagesIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("messages"), m_Messages));
    }
}

bool Attachments::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("id")))
    {
        int32_t refVal_id;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("id")), refVal_id );
        setId(refVal_id);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("name")))
    {
        utility::string_t refVal_name;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("name")), refVal_name );
        setName(refVal_name);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("path_id")))
    {
        utility::string_t refVal_path_id;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("path_id")), refVal_path_id );
        setPathId(refVal_path_id);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("size")))
    {
        int32_t refVal_size;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("size")), refVal_size );
        setSize(refVal_size);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("create_time")))
    {
        int32_t refVal_create_time;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("create_time")), refVal_create_time );
        setCreateTime(refVal_create_time);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("messages")))
    {
        std::vector<std::shared_ptr<Attachments_messages>> refVal_messages;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("messages")), refVal_messages );
        setMessages(refVal_messages);
    }
    return ok;
}

int32_t Attachments::getId() const
{
    return m_Id;
}

void Attachments::setId(int32_t value)
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
utility::string_t Attachments::getName() const
{
    return m_Name;
}

void Attachments::setName(const utility::string_t& value)
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
utility::string_t Attachments::getPathId() const
{
    return m_Path_id;
}

void Attachments::setPathId(const utility::string_t& value)
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

void Attachments::setSize(int32_t value)
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

void Attachments::setCreateTime(int32_t value)
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
std::vector<std::shared_ptr<Attachments_messages>>& Attachments::getMessages()
{
    return m_Messages;
}

void Attachments::setMessages(const std::vector<std::shared_ptr<Attachments_messages>>& value)
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
}
}
}
}

