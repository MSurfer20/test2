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

/*
 * AddSubscriptionsResponse.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_AddSubscriptionsResponse_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_AddSubscriptionsResponse_H_


#include "../ModelBase.h"

#include "AddSubscriptionsResponse_allOf.h"
#include "JsonSuccessBase.h"
#include <cpprest/details/basic_types.h>
#include <map>
#include <vector>
#include "AnyType.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// 
/// </summary>
class  AddSubscriptionsResponse
    : public ModelBase
{
public:
    AddSubscriptionsResponse();
    virtual ~AddSubscriptionsResponse();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// AddSubscriptionsResponse members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<AnyType> getResult() const;
    bool resultIsSet() const;
    void unsetResult();

    void setResult(const std::shared_ptr<AnyType>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<AnyType> getMsg() const;
    bool msgIsSet() const;
    void unsetMsg();

    void setMsg(const std::shared_ptr<AnyType>& value);

    /// <summary>
    /// A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. 
    /// </summary>
    std::map<utility::string_t, std::vector<utility::string_t>>& getSubscribed();
    bool subscribedIsSet() const;
    void unsetSubscribed();

    void setSubscribed(const std::map<utility::string_t, std::vector<utility::string_t>>& value);

    /// <summary>
    /// A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. 
    /// </summary>
    std::map<utility::string_t, std::vector<utility::string_t>>& getAlreadySubscribed();
    bool alreadySubscribedIsSet() const;
    void unsetAlready_subscribed();

    void setAlreadySubscribed(const std::map<utility::string_t, std::vector<utility::string_t>>& value);

    /// <summary>
    /// A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if &#x60;authorization_errors_fatal&#x3D;false&#x60;. 
    /// </summary>
    std::vector<utility::string_t>& getUnauthorized();
    bool unauthorizedIsSet() const;
    void unsetUnauthorized();

    void setUnauthorized(const std::vector<utility::string_t>& value);


protected:
    std::shared_ptr<AnyType> m_Result;
    bool m_ResultIsSet;
    std::shared_ptr<AnyType> m_Msg;
    bool m_MsgIsSet;
    std::map<utility::string_t, std::vector<utility::string_t>> m_Subscribed;
    bool m_SubscribedIsSet;
    std::map<utility::string_t, std::vector<utility::string_t>> m_Already_subscribed;
    bool m_Already_subscribedIsSet;
    std::vector<utility::string_t> m_Unauthorized;
    bool m_UnauthorizedIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_AddSubscriptionsResponse_H_ */
