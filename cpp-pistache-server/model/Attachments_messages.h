/**
* Zulip REST API
* Powerful open source group chat 
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
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


#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  Attachments_messages
{
public:
    Attachments_messages();
    virtual ~Attachments_messages() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const Attachments_messages& rhs) const;
    bool operator!=(const Attachments_messages& rhs) const;

    /////////////////////////////////////////////
    /// Attachments_messages members

    /// <summary>
    /// Time when the message was sent as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously strangely called &#x60;name&#x60; and was a floating point number. 
    /// </summary>
    int32_t getDateSent() const;
    void setDateSent(int32_t const value);
    bool dateSentIsSet() const;
    void unsetDate_sent();
    /// <summary>
    /// The unique message ID.  Messages should always be displayed sorted by ID. 
    /// </summary>
    int32_t getId() const;
    void setId(int32_t const value);
    bool idIsSet() const;
    void unsetId();

    friend void to_json(nlohmann::json& j, const Attachments_messages& o);
    friend void from_json(const nlohmann::json& j, Attachments_messages& o);
protected:
    int32_t m_Date_sent;
    bool m_Date_sentIsSet;
    int32_t m_Id;
    bool m_IdIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* Attachments_messages_H_ */
