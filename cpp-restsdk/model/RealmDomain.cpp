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



#include "RealmDomain.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {




RealmDomain::RealmDomain()
{
    m_Domain = utility::conversions::to_string_t("");
    m_DomainIsSet = false;
    m_Allow_subdomains = false;
    m_Allow_subdomainsIsSet = false;
}

RealmDomain::~RealmDomain()
{
}

void RealmDomain::validate()
{
    // TODO: implement validation
}

web::json::value RealmDomain::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_DomainIsSet)
    {
        val[utility::conversions::to_string_t("domain")] = ModelBase::toJson(m_Domain);
    }
    if(m_Allow_subdomainsIsSet)
    {
        val[utility::conversions::to_string_t("allow_subdomains")] = ModelBase::toJson(m_Allow_subdomains);
    }

    return val;
}

bool RealmDomain::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t("domain")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("domain"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_domain;
            ok &= ModelBase::fromJson(fieldValue, refVal_domain);
            setDomain(refVal_domain);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("allow_subdomains")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("allow_subdomains"));
        if(!fieldValue.is_null())
        {
            bool refVal_allow_subdomains;
            ok &= ModelBase::fromJson(fieldValue, refVal_allow_subdomains);
            setAllowSubdomains(refVal_allow_subdomains);
        }
    }
    return ok;
}

void RealmDomain::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }
    if(m_DomainIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("domain"), m_Domain));
    }
    if(m_Allow_subdomainsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("allow_subdomains"), m_Allow_subdomains));
    }
}

bool RealmDomain::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("domain")))
    {
        utility::string_t refVal_domain;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("domain")), refVal_domain );
        setDomain(refVal_domain);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("allow_subdomains")))
    {
        bool refVal_allow_subdomains;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("allow_subdomains")), refVal_allow_subdomains );
        setAllowSubdomains(refVal_allow_subdomains);
    }
    return ok;
}

utility::string_t RealmDomain::getDomain() const
{
    return m_Domain;
}

void RealmDomain::setDomain(const utility::string_t& value)
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

void RealmDomain::setAllowSubdomains(bool value)
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
}
}
}
}

