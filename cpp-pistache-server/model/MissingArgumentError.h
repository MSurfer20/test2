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
 * MissingArgumentError.h
 *
 * 
 */

#ifndef MissingArgumentError_H_
#define MissingArgumentError_H_


#include <string>
#include "CodedErrorBase.h"
#include "AnyType.h"
#include "MissingArgumentError_allOf.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  MissingArgumentError
{
public:
    MissingArgumentError();
    virtual ~MissingArgumentError() = default;


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

    bool operator==(const MissingArgumentError& rhs) const;
    bool operator!=(const MissingArgumentError& rhs) const;

    /////////////////////////////////////////////
    /// MissingArgumentError members

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
    /// <summary>
    /// It contains the information about the missing parameter. 
    /// </summary>
    std::string getVarName() const;
    void setVarName(std::string const& value);
    bool varNameIsSet() const;
    void unsetVar_name();

    friend void to_json(nlohmann::json& j, const MissingArgumentError& o);
    friend void from_json(const nlohmann::json& j, MissingArgumentError& o);
protected:
    AnyType m_Result;

    AnyType m_Msg;

    AnyType m_Code;
    bool m_CodeIsSet;
    std::string m_Var_name;
    bool m_Var_nameIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* MissingArgumentError_H_ */
