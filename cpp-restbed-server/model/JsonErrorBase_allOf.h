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
 * JsonErrorBase_allOf.h
 *
 * 
 */

#ifndef JsonErrorBase_allOf_H_
#define JsonErrorBase_allOf_H_



#include <string>
#include <vector>
#include <memory>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  JsonErrorBase_allOf 
{
public:
    JsonErrorBase_allOf();
    virtual ~JsonErrorBase_allOf();
    
    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// JsonErrorBase_allOf members

    /// <summary>
    /// 
    /// </summary>
    std::string getResult() const;
    void setResult(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getMsg() const;
    void setMsg(std::string value);
protected:
    std::string m_Result;
    std::string m_Msg;
    std::vector<std::string> m_ResultEnum;
};

}
}
}
}

#endif /* JsonErrorBase_allOf_H_ */
