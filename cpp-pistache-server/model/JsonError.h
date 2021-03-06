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
 * JsonError.h
 *
 * 
 */

#ifndef JsonError_H_
#define JsonError_H_


#include "JsonErrorBase.h"
#include "JsonSuccess_allOf.h"
#include "AnyType.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  JsonError
{
public:
    JsonError();
    virtual ~JsonError() = default;


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

    bool operator==(const JsonError& rhs) const;
    bool operator!=(const JsonError& rhs) const;

    /////////////////////////////////////////////
    /// JsonError members

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

    friend void to_json(nlohmann::json& j, const JsonError& o);
    friend void from_json(const nlohmann::json& j, JsonError& o);
protected:
    AnyType m_Result;

    AnyType m_Msg;

    
};

} // namespace org::openapitools::server::model

#endif /* JsonError_H_ */
