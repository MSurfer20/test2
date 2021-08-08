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
 * JsonErrorBase_allOf.h
 *
 * 
 */

#ifndef JsonErrorBase_allOf_H_
#define JsonErrorBase_allOf_H_


#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  JsonErrorBase_allOf
{
public:
    JsonErrorBase_allOf();
    virtual ~JsonErrorBase_allOf() = default;


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

    bool operator==(const JsonErrorBase_allOf& rhs) const;
    bool operator!=(const JsonErrorBase_allOf& rhs) const;

    /////////////////////////////////////////////
    /// JsonErrorBase_allOf members

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

    friend void to_json(nlohmann::json& j, const JsonErrorBase_allOf& o);
    friend void from_json(const nlohmann::json& j, JsonErrorBase_allOf& o);
protected:
    std::string m_Result;

    std::string m_Msg;

    
};

} // namespace org::openapitools::server::model

#endif /* JsonErrorBase_allOf_H_ */
