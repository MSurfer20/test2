/**
 * Zulip REST API
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 5.2.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * BasicStream.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_BasicStream_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_BasicStream_H_


#include "../ModelBase.h"

#include "BasicStreamBase.h"
#include "BasicStream_allOf.h"
#include "AnyType.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// 
/// </summary>
class  BasicStream
    : public ModelBase
{
public:
    BasicStream();
    virtual ~BasicStream();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// BasicStream members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<AnyType> getStreamId() const;
    bool streamIdIsSet() const;
    void unsetStream_id();

    void setStreamId(const std::shared_ptr<AnyType>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<AnyType> getName() const;
    bool nameIsSet() const;
    void unsetName();

    void setName(const std::shared_ptr<AnyType>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<AnyType> getDescription() const;
    bool descriptionIsSet() const;
    void unsetDescription();

    void setDescription(const std::shared_ptr<AnyType>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<AnyType> getDateCreated() const;
    bool dateCreatedIsSet() const;
    void unsetDate_created();

    void setDateCreated(const std::shared_ptr<AnyType>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<AnyType> getInviteOnly() const;
    bool inviteOnlyIsSet() const;
    void unsetInvite_only();

    void setInviteOnly(const std::shared_ptr<AnyType>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<AnyType> getRenderedDescription() const;
    bool renderedDescriptionIsSet() const;
    void unsetRendered_description();

    void setRenderedDescription(const std::shared_ptr<AnyType>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<AnyType> getIsWebPublic() const;
    bool isWebPublicIsSet() const;
    void unsetIs_web_public();

    void setIsWebPublic(const std::shared_ptr<AnyType>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<AnyType> getStreamPostPolicy() const;
    bool streamPostPolicyIsSet() const;
    void unsetStream_post_policy();

    void setStreamPostPolicy(const std::shared_ptr<AnyType>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<AnyType> getMessageRetentionDays() const;
    bool messageRetentionDaysIsSet() const;
    void unsetMessage_retention_days();

    void setMessageRetentionDays(const std::shared_ptr<AnyType>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<AnyType> getHistoryPublicToSubscribers() const;
    bool historyPublicToSubscribersIsSet() const;
    void unsetHistory_public_to_subscribers();

    void setHistoryPublicToSubscribers(const std::shared_ptr<AnyType>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<AnyType> getFirstMessageId() const;
    bool firstMessageIdIsSet() const;
    void unsetFirst_message_id();

    void setFirstMessageId(const std::shared_ptr<AnyType>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<AnyType> getIsAnnouncementOnly() const;
    bool isAnnouncementOnlyIsSet() const;
    void unsetIs_announcement_only();

    void setIsAnnouncementOnly(const std::shared_ptr<AnyType>& value);


protected:
    std::shared_ptr<AnyType> m_Stream_id;
    bool m_Stream_idIsSet;
    std::shared_ptr<AnyType> m_Name;
    bool m_NameIsSet;
    std::shared_ptr<AnyType> m_Description;
    bool m_DescriptionIsSet;
    std::shared_ptr<AnyType> m_Date_created;
    bool m_Date_createdIsSet;
    std::shared_ptr<AnyType> m_Invite_only;
    bool m_Invite_onlyIsSet;
    std::shared_ptr<AnyType> m_Rendered_description;
    bool m_Rendered_descriptionIsSet;
    std::shared_ptr<AnyType> m_Is_web_public;
    bool m_Is_web_publicIsSet;
    std::shared_ptr<AnyType> m_Stream_post_policy;
    bool m_Stream_post_policyIsSet;
    std::shared_ptr<AnyType> m_Message_retention_days;
    bool m_Message_retention_daysIsSet;
    std::shared_ptr<AnyType> m_History_public_to_subscribers;
    bool m_History_public_to_subscribersIsSet;
    std::shared_ptr<AnyType> m_First_message_id;
    bool m_First_message_idIsSet;
    std::shared_ptr<AnyType> m_Is_announcement_only;
    bool m_Is_announcement_onlyIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_BasicStream_H_ */
