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
#include <memory>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  MissingArgumentError : public CodedErrorBase, public MissingArgumentError_allOf
{
public:
    MissingArgumentError();
    virtual ~MissingArgumentError();
    
    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// MissingArgumentError members

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
    /// It contains the information about the missing parameter. 
    /// </summary>
    std::string getVarName() const;
    void setVarName(std::string value);
protected:
    std::shared_ptr<AnyType> m_Result;
    std::shared_ptr<AnyType> m_Msg;
    std::shared_ptr<AnyType> m_Code;
    std::string m_Var_name;
};

}
}
}
}

#endif /* MissingArgumentError_H_ */
