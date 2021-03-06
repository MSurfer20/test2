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
 * Attachments_messages.h
 *
 * 
 */

#ifndef Attachments_messages_H_
#define Attachments_messages_H_



#include <memory>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  Attachments_messages 
{
public:
    Attachments_messages();
    virtual ~Attachments_messages();
    
    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// Attachments_messages members

    /// <summary>
    /// Time when the message was sent as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously strangely called &#x60;name&#x60; and was a floating point number. 
    /// </summary>
    int32_t getDateSent() const;
    void setDateSent(int32_t value);

    /// <summary>
    /// The unique message ID.  Messages should always be displayed sorted by ID. 
    /// </summary>
    int32_t getId() const;
    void setId(int32_t value);
protected:
    int32_t m_Date_sent;
    int32_t m_Id;
};

}
}
}
}

#endif /* Attachments_messages_H_ */
