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
 * Presence.h
 *
 * &#x60;{client_name}&#x60;: Object containing the details of the user&#39;s presence on a particular platform with the client&#39;s platform name being the object key. 
 */

#ifndef Presence_H_
#define Presence_H_



#include <string>
#include <vector>
#include <memory>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// &#x60;{client_name}&#x60;: Object containing the details of the user&#39;s presence on a particular platform with the client&#39;s platform name being the object key. 
/// </summary>
class  Presence 
{
public:
    Presence();
    virtual ~Presence();
    
    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// Presence members

    /// <summary>
    /// The client&#39;s platform name. 
    /// </summary>
    std::string getClient() const;
    void setClient(std::string value);

    /// <summary>
    /// The status of the user on this client. It is either &#x60;idle&#x60; or &#x60;active&#x60;. 
    /// </summary>
    std::string getStatus() const;
    void setStatus(std::string value);

    /// <summary>
    /// The UNIX timestamp of when this client sent the user&#39;s presence to the server with the precision of a second. 
    /// </summary>
    int32_t getTimestamp() const;
    void setTimestamp(int32_t value);

    /// <summary>
    /// Whether the client is capable of showing mobile/push notifications to the user. 
    /// </summary>
    bool isPushable() const;
    void setPushable(bool value);
protected:
    std::string m_Client;
    std::string m_Status;
    int32_t m_Timestamp;
    bool m_Pushable;
    std::vector<std::string> m_StatusEnum;
};

}
}
}
}

#endif /* Presence_H_ */
