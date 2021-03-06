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
 * ApiKeyResponse.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ApiKeyResponse_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ApiKeyResponse_H_


#include "../ModelBase.h"

#include "ApiKeyResponse_allOf.h"
#include "JsonSuccessBase.h"
#include <cpprest/details/basic_types.h>
#include "AnyType.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// 
/// </summary>
class  ApiKeyResponse
    : public ModelBase
{
public:
    ApiKeyResponse();
    virtual ~ApiKeyResponse();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ApiKeyResponse members

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
    /// The API key that can be used to authenticate as the requested user. 
    /// </summary>
    utility::string_t getApiKey() const;
    bool apiKeyIsSet() const;
    void unsetApi_key();

    void setApiKey(const utility::string_t& value);

    /// <summary>
    /// The email address of the user who owns the API key 
    /// </summary>
    utility::string_t getEmail() const;
    bool emailIsSet() const;
    void unsetEmail();

    void setEmail(const utility::string_t& value);


protected:
    std::shared_ptr<AnyType> m_Result;
    bool m_ResultIsSet;
    std::shared_ptr<AnyType> m_Msg;
    bool m_MsgIsSet;
    utility::string_t m_Api_key;
    bool m_Api_keyIsSet;
    utility::string_t m_Email;
    bool m_EmailIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ApiKeyResponse_H_ */
