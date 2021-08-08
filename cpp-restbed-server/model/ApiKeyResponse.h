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
 * ApiKeyResponse.h
 *
 * 
 */

#ifndef ApiKeyResponse_H_
#define ApiKeyResponse_H_



#include <string>
#include "ApiKeyResponse_allOf.h"
#include "JsonSuccessBase.h"
#include "AnyType.h"
#include <memory>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ApiKeyResponse : public JsonSuccessBase, public ApiKeyResponse_allOf
{
public:
    ApiKeyResponse();
    virtual ~ApiKeyResponse();
    
    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// ApiKeyResponse members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<AnyType> getResult() const;
    void setResult(std::shared_ptr<AnyType> value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<AnyType> getMsg() const;
    void setMsg(std::shared_ptr<AnyType> value);

    /// <summary>
    /// The API key that can be used to authenticate as the requested user. 
    /// </summary>
    std::string getApiKey() const;
    void setApiKey(std::string value);

    /// <summary>
    /// The email address of the user who owns the API key 
    /// </summary>
    std::string getEmail() const;
    void setEmail(std::string value);
protected:
    std::shared_ptr<AnyType> m_Result;
    std::shared_ptr<AnyType> m_Msg;
    std::string m_Api_key;
    std::string m_Email;
};

}
}
}
}

#endif /* ApiKeyResponse_H_ */
