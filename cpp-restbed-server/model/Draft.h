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
 * Draft.h
 *
 * A dictionary for representing a message draft. 
 */

#ifndef Draft_H_
#define Draft_H_



#include <string>
#include <vector>
#include <memory>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// A dictionary for representing a message draft. 
/// </summary>
class  Draft 
{
public:
    Draft();
    virtual ~Draft();
    
    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// Draft members

    /// <summary>
    /// The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited. 
    /// </summary>
    int32_t getId() const;
    void setId(int32_t value);

    /// <summary>
    /// The type of the draft. Either unaddressed (empty string), \&quot;stream\&quot;, or \&quot;private\&quot; (for PMs and private group messages). 
    /// </summary>
    std::string getType() const;
    void setType(std::string value);

    /// <summary>
    /// An array of the tentative target audience IDs. For \&quot;stream\&quot; messages, this should contain exactly 1 ID, the ID of the target stream. For private messages, this should be an array of target user IDs. For unaddressed drafts, this is ignored, and clients should send an empty array. 
    /// </summary>
    std::vector<int32_t> getTo() const;
    void setTo(std::vector<int32_t> value);

    /// <summary>
    /// For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes. 
    /// </summary>
    std::string getTopic() const;
    void setTopic(std::string value);

    /// <summary>
    /// The body of the draft. Should not contain null bytes. 
    /// </summary>
    std::string getContent() const;
    void setContent(std::string value);

    /// <summary>
    /// A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server. 
    /// </summary>
    double getTimestamp() const;
    void setTimestamp(double value);
protected:
    int32_t m_Id;
    std::string m_Type;
    std::vector<int32_t> m_To;
    std::string m_Topic;
    std::string m_Content;
    double m_Timestamp;
    std::vector<std::string> m_TypeEnum;
};

}
}
}
}

#endif /* Draft_H_ */
