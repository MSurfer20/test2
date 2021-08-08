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



#include "MissingArgumentError_allOf.h"

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

MissingArgumentError_allOf::MissingArgumentError_allOf()
{
	m_Var_name = "";
}

MissingArgumentError_allOf::~MissingArgumentError_allOf()
{
}

std::string MissingArgumentError_allOf::toJsonString(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void MissingArgumentError_allOf::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree MissingArgumentError_allOf::toPropertyTree()
{
	ptree pt;
	ptree tmp_node;
	pt.put("var_name", m_Var_name);
	return pt;
}

void MissingArgumentError_allOf::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Var_name = pt.get("var_name", "");
}

std::shared_ptr<AnyType> MissingArgumentError_allOf::getResult() const
{
    return m_Result;
}
void MissingArgumentError_allOf::setResult(std::shared_ptr<AnyType> value)
{
	m_Result = value;
}
std::shared_ptr<AnyType> MissingArgumentError_allOf::getMsg() const
{
    return m_Msg;
}
void MissingArgumentError_allOf::setMsg(std::shared_ptr<AnyType> value)
{
	m_Msg = value;
}
std::shared_ptr<AnyType> MissingArgumentError_allOf::getCode() const
{
    return m_Code;
}
void MissingArgumentError_allOf::setCode(std::shared_ptr<AnyType> value)
{
	m_Code = value;
}
std::string MissingArgumentError_allOf::getVarName() const
{
    return m_Var_name;
}
void MissingArgumentError_allOf::setVarName(std::string value)
{
	m_Var_name = value;
}

}
}
}
}
