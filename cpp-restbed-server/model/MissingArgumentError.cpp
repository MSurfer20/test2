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



#include "MissingArgumentError.h"

#include <string>
#include <sstream>
#include <stdexcept>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

MissingArgumentError::MissingArgumentError()
{
	m_Var_name = "";
}

MissingArgumentError::~MissingArgumentError()
{
}

std::string MissingArgumentError::toJsonString(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void MissingArgumentError::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree MissingArgumentError::toPropertyTree()
{
	ptree pt;
	ptree tmp_node;
	pt.put("var_name", m_Var_name);
	return pt;
}

void MissingArgumentError::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Var_name = pt.get("var_name", "");
}

std::shared_ptr<AnyType> MissingArgumentError::getResult() const
{
    return m_Result;
}
void MissingArgumentError::setResult(std::shared_ptr<AnyType> value)
{
	m_Result = value;
}
std::shared_ptr<AnyType> MissingArgumentError::getMsg() const
{
    return m_Msg;
}
void MissingArgumentError::setMsg(std::shared_ptr<AnyType> value)
{
	m_Msg = value;
}
std::shared_ptr<AnyType> MissingArgumentError::getCode() const
{
    return m_Code;
}
void MissingArgumentError::setCode(std::shared_ptr<AnyType> value)
{
	m_Code = value;
}
std::string MissingArgumentError::getVarName() const
{
    return m_Var_name;
}
void MissingArgumentError::setVarName(std::string value)
{
	m_Var_name = value;
}

}
}
}
}

