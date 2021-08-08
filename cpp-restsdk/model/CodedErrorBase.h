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
 * CodedErrorBase.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_CodedErrorBase_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_CodedErrorBase_H_


#include "../ModelBase.h"

#include "CodedErrorBase_allOf.h"
#include <cpprest/details/basic_types.h>
#include "JsonErrorBase.h"
#include "AnyType.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// 
/// </summary>
class  CodedErrorBase
    : public ModelBase
{
public:
    CodedErrorBase();
    virtual ~CodedErrorBase();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// CodedErrorBase members

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
    /// A string that identifies the error. 
    /// </summary>
    utility::string_t getCode() const;
    bool codeIsSet() const;
    void unsetCode();

    void setCode(const utility::string_t& value);


protected:
    std::shared_ptr<AnyType> m_Result;
    bool m_ResultIsSet;
    std::shared_ptr<AnyType> m_Msg;
    bool m_MsgIsSet;
    utility::string_t m_Code;
    bool m_CodeIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_CodedErrorBase_H_ */