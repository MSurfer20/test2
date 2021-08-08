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
 * JsonSuccess_allOf.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_JsonSuccess_allOf_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_JsonSuccess_allOf_H_


#include "../ModelBase.h"

#include "AnyType.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// 
/// </summary>
class  JsonSuccess_allOf
    : public ModelBase
{
public:
    JsonSuccess_allOf();
    virtual ~JsonSuccess_allOf();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// JsonSuccess_allOf members

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


protected:
    std::shared_ptr<AnyType> m_Result;
    bool m_ResultIsSet;
    std::shared_ptr<AnyType> m_Msg;
    bool m_MsgIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_JsonSuccess_allOf_H_ */
