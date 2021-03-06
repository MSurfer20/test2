/**
 * Zulip REST API
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 5.2.0.
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
#include <memory>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Object containing details of the newly added domain. 
/// </summary>
class  RealmDomain 
{
public:
    RealmDomain();
    virtual ~RealmDomain();
    
    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// RealmDomain members

    /// <summary>
    /// The new allowed domain. 
    /// </summary>
    std::string getDomain() const;
    void setDomain(std::string value);

    /// <summary>
    /// Whether subdomains are allowed for this domain. 
    /// </summary>
    bool isAllowSubdomains() const;
    void setAllowSubdomains(bool value);
protected:
    std::string m_Domain;
    bool m_Allow_subdomains;
};

}
}
}
}

#endif /* RealmDomain_H_ */
