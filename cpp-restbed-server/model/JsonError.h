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
 * JsonError.h
 *
 * 
 */

#ifndef JsonError_H_
#define JsonError_H_



#include "JsonErrorBase.h"
#include "JsonSuccess_allOf.h"
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
class  JsonError : public JsonErrorBase, public JsonSuccess_allOf
{
public:
    JsonError();
    virtual ~JsonError();
    
    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// JsonError members

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
protected:
    std::shared_ptr<AnyType> m_Result;
    std::shared_ptr<AnyType> m_Msg;
};

}
}
}
}

#endif /* JsonError_H_ */
