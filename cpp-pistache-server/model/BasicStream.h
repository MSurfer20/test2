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
 * BasicStream.h
 *
 * 
 */

#ifndef BasicStream_H_
#define BasicStream_H_


#include "BasicStreamBase.h"
#include "BasicStream_allOf.h"
#include "AnyType.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  BasicStream
{
public:
    BasicStream();
    virtual ~BasicStream() = default;


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

    bool operator==(const BasicStream& rhs) const;
    bool operator!=(const BasicStream& rhs) const;

    /////////////////////////////////////////////
    /// BasicStream members

    /// <summary>
    /// 
    /// </summary>
    AnyType getStreamId() const;
    void setStreamId(AnyType const& value);
    bool streamIdIsSet() const;
    void unsetStream_id();
    /// <summary>
    /// 
    /// </summary>
    AnyType getName() const;
    void setName(AnyType const& value);
    bool nameIsSet() const;
    void unsetName();
    /// <summary>
    /// 
    /// </summary>
    AnyType getDescription() const;
    void setDescription(AnyType const& value);
    bool descriptionIsSet() const;
    void unsetDescription();
    /// <summary>
    /// 
    /// </summary>
    AnyType getDateCreated() const;
    void setDateCreated(AnyType const& value);
    bool dateCreatedIsSet() const;
    void unsetDate_created();
    /// <summary>
    /// 
    /// </summary>
    AnyType getInviteOnly() const;
    void setInviteOnly(AnyType const& value);
    bool inviteOnlyIsSet() const;
    void unsetInvite_only();
    /// <summary>
    /// 
    /// </summary>
    AnyType getRenderedDescription() const;
    void setRenderedDescription(AnyType const& value);
    bool renderedDescriptionIsSet() const;
    void unsetRendered_description();
    /// <summary>
    /// 
    /// </summary>
    AnyType getIsWebPublic() const;
    void setIsWebPublic(AnyType const& value);
    bool isWebPublicIsSet() const;
    void unsetIs_web_public();
    /// <summary>
    /// 
    /// </summary>
    AnyType getStreamPostPolicy() const;
    void setStreamPostPolicy(AnyType const& value);
    bool streamPostPolicyIsSet() const;
    void unsetStream_post_policy();
    /// <summary>
    /// 
    /// </summary>
    AnyType getMessageRetentionDays() const;
    void setMessageRetentionDays(AnyType const& value);
    bool messageRetentionDaysIsSet() const;
    void unsetMessage_retention_days();
    /// <summary>
    /// 
    /// </summary>
    AnyType getHistoryPublicToSubscribers() const;
    void setHistoryPublicToSubscribers(AnyType const& value);
    bool historyPublicToSubscribersIsSet() const;
    void unsetHistory_public_to_subscribers();
    /// <summary>
    /// 
    /// </summary>
    AnyType getFirstMessageId() const;
    void setFirstMessageId(AnyType const& value);
    bool firstMessageIdIsSet() const;
    void unsetFirst_message_id();
    /// <summary>
    /// 
    /// </summary>
    AnyType getIsAnnouncementOnly() const;
    void setIsAnnouncementOnly(AnyType const& value);
    bool isAnnouncementOnlyIsSet() const;
    void unsetIs_announcement_only();

    friend void to_json(nlohmann::json& j, const BasicStream& o);
    friend void from_json(const nlohmann::json& j, BasicStream& o);
protected:
    AnyType m_Stream_id;
    bool m_Stream_idIsSet;
    AnyType m_Name;
    bool m_NameIsSet;
    AnyType m_Description;
    bool m_DescriptionIsSet;
    AnyType m_Date_created;
    bool m_Date_createdIsSet;
    AnyType m_Invite_only;
    bool m_Invite_onlyIsSet;
    AnyType m_Rendered_description;
    bool m_Rendered_descriptionIsSet;
    AnyType m_Is_web_public;
    bool m_Is_web_publicIsSet;
    AnyType m_Stream_post_policy;
    bool m_Stream_post_policyIsSet;
    AnyType m_Message_retention_days;
    bool m_Message_retention_daysIsSet;
    AnyType m_History_public_to_subscribers;
    bool m_History_public_to_subscribersIsSet;
    AnyType m_First_message_id;
    bool m_First_message_idIsSet;
    AnyType m_Is_announcement_only;
    bool m_Is_announcement_onlyIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* BasicStream_H_ */
