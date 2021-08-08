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
 * InvalidMessageError.h
 *
 * 
 */

#ifndef InvalidMessageError_H_
#define InvalidMessageError_H_


#include <string>
#include "InvalidMessageError_allOf.h"
#include "JsonSuccessBase.h"
#include "AnyType.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  InvalidMessageError
{
public:
    InvalidMessageError();
    virtual ~InvalidMessageError() = default;


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

    bool operator==(const InvalidMessageError& rhs) const;
    bool operator!=(const InvalidMessageError& rhs) const;

    /////////////////////////////////////////////
    /// InvalidMessageError members

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
    /// The raw content of the message. 
    /// </summary>
    std::string getRawContent() const;
    void setRawContent(std::string const& value);
    bool rawContentIsSet() const;
    void unsetRaw_content();

    friend void to_json(nlohmann::json& j, const InvalidMessageError& o);
    friend void from_json(const nlohmann::json& j, InvalidMessageError& o);
protected:
    AnyType m_Result;

    AnyType m_Msg;

    std::string m_Raw_content;
    bool m_Raw_contentIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* InvalidMessageError_H_ */
