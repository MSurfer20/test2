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
 * RateLimitedError.h
 *
 * 
 */

#ifndef RateLimitedError_H_
#define RateLimitedError_H_


#include "CodedError.h"
#include "AnyType.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  RateLimitedError
{
public:
    RateLimitedError();
    virtual ~RateLimitedError() = default;


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

    bool operator==(const RateLimitedError& rhs) const;
    bool operator!=(const RateLimitedError& rhs) const;

    /////////////////////////////////////////////
    /// RateLimitedError members

    /// <summary>
    /// 
    /// </summary>
    AnyType getResult() const;
    void setResult(AnyType const& value);
    /// <summary>
    /// 
    /// </summary>
    AnyType getMsg() const;
    void setMsg(AnyType const& value);
    /// <summary>
    /// 
    /// </summary>
    AnyType getCode() const;
    void setCode(AnyType const& value);
    bool codeIsSet() const;
    void unsetCode();

    friend void to_json(nlohmann::json& j, const RateLimitedError& o);
    friend void from_json(const nlohmann::json& j, RateLimitedError& o);
protected:
    AnyType m_Result;

    AnyType m_Msg;

    AnyType m_Code;
    bool m_CodeIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* RateLimitedError_H_ */
