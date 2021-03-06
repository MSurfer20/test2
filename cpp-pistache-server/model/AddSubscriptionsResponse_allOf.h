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
 * AddSubscriptionsResponse_allOf.h
 *
 * 
 */

#ifndef AddSubscriptionsResponse_allOf_H_
#define AddSubscriptionsResponse_allOf_H_


#include <string>
#include <map>
#include <vector>
#include "AnyType.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  AddSubscriptionsResponse_allOf
{
public:
    AddSubscriptionsResponse_allOf();
    virtual ~AddSubscriptionsResponse_allOf() = default;


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

    bool operator==(const AddSubscriptionsResponse_allOf& rhs) const;
    bool operator!=(const AddSubscriptionsResponse_allOf& rhs) const;

    /////////////////////////////////////////////
    /// AddSubscriptionsResponse_allOf members

    /// <summary>
    /// 
    /// </summary>
    AnyType getResult() const;
    void setResult(AnyType const& value);
    bool resultIsSet() const;
    void unsetResult();
    /// <summary>
    /// 
    /// </summary>
    AnyType getMsg() const;
    void setMsg(AnyType const& value);
    bool msgIsSet() const;
    void unsetMsg();
    /// <summary>
    /// A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. 
    /// </summary>
    std::map<std::string, std::vector<std::string>> getSubscribed() const;
    void setSubscribed(std::map<std::string, std::vector<std::string>> const& value);
    bool subscribedIsSet() const;
    void unsetSubscribed();
    /// <summary>
    /// A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. 
    /// </summary>
    std::map<std::string, std::vector<std::string>> getAlreadySubscribed() const;
    void setAlreadySubscribed(std::map<std::string, std::vector<std::string>> const& value);
    bool alreadySubscribedIsSet() const;
    void unsetAlready_subscribed();
    /// <summary>
    /// A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if &#x60;authorization_errors_fatal&#x3D;false&#x60;. 
    /// </summary>
    std::vector<std::string> getUnauthorized() const;
    void setUnauthorized(std::vector<std::string> const& value);
    bool unauthorizedIsSet() const;
    void unsetUnauthorized();

    friend void to_json(nlohmann::json& j, const AddSubscriptionsResponse_allOf& o);
    friend void from_json(const nlohmann::json& j, AddSubscriptionsResponse_allOf& o);
protected:
    AnyType m_Result;
    bool m_ResultIsSet;
    AnyType m_Msg;
    bool m_MsgIsSet;
    std::map<std::string, std::vector<std::string>> m_Subscribed;
    bool m_SubscribedIsSet;
    std::map<std::string, std::vector<std::string>> m_Already_subscribed;
    bool m_Already_subscribedIsSet;
    std::vector<std::string> m_Unauthorized;
    bool m_UnauthorizedIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* AddSubscriptionsResponse_allOf_H_ */
