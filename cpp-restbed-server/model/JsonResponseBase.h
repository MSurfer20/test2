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
 * JsonResponseBase.h
 *
 * 
 */

#ifndef JsonResponseBase_H_
#define JsonResponseBase_H_



#include <string>
#include <memory>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  JsonResponseBase 
{
public:
    JsonResponseBase();
    virtual ~JsonResponseBase();
    
    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// JsonResponseBase members

    /// <summary>
    /// 
    /// </summary>
    std::string getResult() const;
    void setResult(std::string value);
protected:
    std::string m_Result;
};

}
}
}
}

#endif /* JsonResponseBase_H_ */
