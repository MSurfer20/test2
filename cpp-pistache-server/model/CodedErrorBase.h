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
 * CodedErrorBase.h
 *
 * 
 */

#ifndef CodedErrorBase_H_
#define CodedErrorBase_H_


#include "CodedErrorBase_allOf.h"
#include <string>
#include "JsonErrorBase.h"
#include "AnyType.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  CodedErrorBase
{
public:
    CodedErrorBase();
    virtual ~CodedErrorBase() = default;


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

    bool operator==(const CodedErrorBase& rhs) const;
    bool operator!=(const CodedErrorBase& rhs) const;

    /////////////////////////////////////////////
    /// CodedErrorBase members

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
    /// A string that identifies the error. 
    /// </summary>
    std::string getCode() const;
    void setCode(std::string const& value);
    bool codeIsSet() const;
    void unsetCode();

    friend void to_json(nlohmann::json& j, const CodedErrorBase& o);
    friend void from_json(const nlohmann::json& j, CodedErrorBase& o);
protected:
    AnyType m_Result;

    AnyType m_Msg;

    std::string m_Code;
    bool m_CodeIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* CodedErrorBase_H_ */