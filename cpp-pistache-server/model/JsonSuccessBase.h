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
 * JsonSuccessBase.h
 *
 * 
 */

#ifndef JsonSuccessBase_H_
#define JsonSuccessBase_H_


#include <string>
#include "JsonSuccessBase_allOf.h"
#include "JsonResponseBase.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  JsonSuccessBase
{
public:
    JsonSuccessBase();
    virtual ~JsonSuccessBase() = default;


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

    bool operator==(const JsonSuccessBase& rhs) const;
    bool operator!=(const JsonSuccessBase& rhs) const;

    /////////////////////////////////////////////
    /// JsonSuccessBase members

    /// <summary>
    /// 
    /// </summary>
    std::string getResult() const;
    void setResult(std::string const& value);
    /// <summary>
    /// 
    /// </summary>
    std::string getMsg() const;
    void setMsg(std::string const& value);

    friend void to_json(nlohmann::json& j, const JsonSuccessBase& o);
    friend void from_json(const nlohmann::json& j, JsonSuccessBase& o);
protected:
    std::string m_Result;

    std::string m_Msg;

    
};

} // namespace org::openapitools::server::model

#endif /* JsonSuccessBase_H_ */
