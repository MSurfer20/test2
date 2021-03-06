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



#include "ApiKeyResponse_allOf.h"

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

ApiKeyResponse_allOf::ApiKeyResponse_allOf()
{
	m_Api_key = "";
	m_Email = "";
}

ApiKeyResponse_allOf::~ApiKeyResponse_allOf()
{
}

std::string ApiKeyResponse_allOf::toJsonString(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void ApiKeyResponse_allOf::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree ApiKeyResponse_allOf::toPropertyTree()
{
	ptree pt;
	ptree tmp_node;
	pt.put("api_key", m_Api_key);
	pt.put("email", m_Email);
	return pt;
}

void ApiKeyResponse_allOf::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Api_key = pt.get("api_key", "");
	m_Email = pt.get("email", "");
}

std::shared_ptr<AnyType> ApiKeyResponse_allOf::getResult() const
{
    return m_Result;
}
void ApiKeyResponse_allOf::setResult(std::shared_ptr<AnyType> value)
{
	m_Result = value;
}
std::shared_ptr<AnyType> ApiKeyResponse_allOf::getMsg() const
{
    return m_Msg;
}
void ApiKeyResponse_allOf::setMsg(std::shared_ptr<AnyType> value)
{
	m_Msg = value;
}
std::string ApiKeyResponse_allOf::getApiKey() const
{
    return m_Api_key;
}
void ApiKeyResponse_allOf::setApiKey(std::string value)
{
	m_Api_key = value;
}
std::string ApiKeyResponse_allOf::getEmail() const
{
    return m_Email;
}
void ApiKeyResponse_allOf::setEmail(std::string value)
{
	m_Email = value;
}

}
}
}
}

