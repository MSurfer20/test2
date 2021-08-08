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



#include "Hotspot.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {




Hotspot::Hotspot()
{
    m_Delay = 0.0;
    m_DelayIsSet = false;
    m_Name = utility::conversions::to_string_t("");
    m_NameIsSet = false;
    m_Title = utility::conversions::to_string_t("");
    m_TitleIsSet = false;
    m_Description = utility::conversions::to_string_t("");
    m_DescriptionIsSet = false;
}

Hotspot::~Hotspot()
{
}

void Hotspot::validate()
{
    // TODO: implement validation
}

web::json::value Hotspot::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_DelayIsSet)
    {
        val[utility::conversions::to_string_t("delay")] = ModelBase::toJson(m_Delay);
    }
    if(m_NameIsSet)
    {
        val[utility::conversions::to_string_t("name")] = ModelBase::toJson(m_Name);
    }
    if(m_TitleIsSet)
    {
        val[utility::conversions::to_string_t("title")] = ModelBase::toJson(m_Title);
    }
    if(m_DescriptionIsSet)
    {
        val[utility::conversions::to_string_t("description")] = ModelBase::toJson(m_Description);
    }

    return val;
}

bool Hotspot::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t("delay")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("delay"));
        if(!fieldValue.is_null())
        {
            double refVal_delay;
            ok &= ModelBase::fromJson(fieldValue, refVal_delay);
            setDelay(refVal_delay);
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
    if(val.has_field(utility::conversions::to_string_t("title")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("title"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_title;
            ok &= ModelBase::fromJson(fieldValue, refVal_title);
            setTitle(refVal_title);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("description")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("description"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_description;
            ok &= ModelBase::fromJson(fieldValue, refVal_description);
            setDescription(refVal_description);
        }
    }
    return ok;
}

void Hotspot::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }
    if(m_DelayIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("delay"), m_Delay));
    }
    if(m_NameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("name"), m_Name));
    }
    if(m_TitleIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("title"), m_Title));
    }
    if(m_DescriptionIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("description"), m_Description));
    }
}

bool Hotspot::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("delay")))
    {
        double refVal_delay;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("delay")), refVal_delay );
        setDelay(refVal_delay);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("name")))
    {
        utility::string_t refVal_name;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("name")), refVal_name );
        setName(refVal_name);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("title")))
    {
        utility::string_t refVal_title;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("title")), refVal_title );
        setTitle(refVal_title);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("description")))
    {
        utility::string_t refVal_description;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("description")), refVal_description );
        setDescription(refVal_description);
    }
    return ok;
}

double Hotspot::getDelay() const
{
    return m_Delay;
}

void Hotspot::setDelay(double value)
{
    m_Delay = value;
    m_DelayIsSet = true;
}

bool Hotspot::delayIsSet() const
{
    return m_DelayIsSet;
}

void Hotspot::unsetDelay()
{
    m_DelayIsSet = false;
}
utility::string_t Hotspot::getName() const
{
    return m_Name;
}

void Hotspot::setName(const utility::string_t& value)
{
    m_Name = value;
    m_NameIsSet = true;
}

bool Hotspot::nameIsSet() const
{
    return m_NameIsSet;
}

void Hotspot::unsetName()
{
    m_NameIsSet = false;
}
utility::string_t Hotspot::getTitle() const
{
    return m_Title;
}

void Hotspot::setTitle(const utility::string_t& value)
{
    m_Title = value;
    m_TitleIsSet = true;
}

bool Hotspot::titleIsSet() const
{
    return m_TitleIsSet;
}

void Hotspot::unsetTitle()
{
    m_TitleIsSet = false;
}
utility::string_t Hotspot::getDescription() const
{
    return m_Description;
}

void Hotspot::setDescription(const utility::string_t& value)
{
    m_Description = value;
    m_DescriptionIsSet = true;
}

bool Hotspot::descriptionIsSet() const
{
    return m_DescriptionIsSet;
}

void Hotspot::unsetDescription()
{
    m_DescriptionIsSet = false;
}
}
}
}
}


