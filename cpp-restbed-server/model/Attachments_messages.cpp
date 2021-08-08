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



#include "Attachments_messages.h"

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

Attachments_messages::Attachments_messages()
{
	m_Date_sent = 0;
	m_Id = 0;
}

Attachments_messages::~Attachments_messages()
{
}

std::string Attachments_messages::toJsonString(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void Attachments_messages::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree Attachments_messages::toPropertyTree()
{
	ptree pt;
	ptree tmp_node;
	pt.put("date_sent", m_Date_sent);
	pt.put("id", m_Id);
	return pt;
}

void Attachments_messages::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Date_sent = pt.get("date_sent", 0);
	m_Id = pt.get("id", 0);
}

int32_t Attachments_messages::getDateSent() const
{
    return m_Date_sent;
}
void Attachments_messages::setDateSent(int32_t value)
{
	m_Date_sent = value;
}
int32_t Attachments_messages::getId() const
{
    return m_Id;
}
void Attachments_messages::setId(int32_t value)
{
	m_Id = value;
}

}
}
}
}
