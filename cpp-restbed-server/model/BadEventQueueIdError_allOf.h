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
 * BadEventQueueIdError_allOf.h
 *
 * 
 */

#ifndef BadEventQueueIdError_allOf_H_
#define BadEventQueueIdError_allOf_H_



#include <string>
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
class  BadEventQueueIdError_allOf 
{
public:
    BadEventQueueIdError_allOf();
    virtual ~BadEventQueueIdError_allOf();
    
    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// BadEventQueueIdError_allOf members

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

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<AnyType> getCode() const;
    void setCode(std::shared_ptr<AnyType> value);

    /// <summary>
    /// The string that identifies the invalid event queue. 
    /// </summary>
    std::string getQueueId() const;
    void setQueueId(std::string value);
protected:
    std::shared_ptr<AnyType> m_Result;
    std::shared_ptr<AnyType> m_Msg;
    std::shared_ptr<AnyType> m_Code;
    std::string m_Queue_id;
};

}
}
}
}

#endif /* BadEventQueueIdError_allOf_H_ */