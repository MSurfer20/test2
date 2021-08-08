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
/*
 * RealmDomain.h
 *
 * Object containing details of the newly added domain. 
 */

#ifndef RealmDomain_H_
#define RealmDomain_H_


#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Object containing details of the newly added domain. 
/// </summary>
class  RealmDomain
{
public:
    RealmDomain();
    virtual ~RealmDomain() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const RealmDomain& rhs) const;
    bool operator!=(const RealmDomain& rhs) const;

    /////////////////////////////////////////////
    /// RealmDomain members

    /// <summary>
    /// The new allowed domain. 
    /// </summary>
    std::string getDomain() const;
    void setDomain(std::string const& value);
    bool domainIsSet() const;
    void unsetDomain();
    /// <summary>
    /// Whether subdomains are allowed for this domain. 
    /// </summary>
    bool isAllowSubdomains() const;
    void setAllowSubdomains(bool const value);
    bool allowSubdomainsIsSet() const;
    void unsetAllow_subdomains();

    friend void to_json(nlohmann::json& j, const RealmDomain& o);
    friend void from_json(const nlohmann::json& j, RealmDomain& o);
protected:
    std::string m_Domain;
    bool m_DomainIsSet;
    bool m_Allow_subdomains;
    bool m_Allow_subdomainsIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* RealmDomain_H_ */
