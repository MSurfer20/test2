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
 * Inline_response_200.h
 *
 * This is an example of the JSON payload that the Zulip server will &#x60;POST&#x60; to your server 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_Inline_response_200_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_Inline_response_200_H_


#include "../ModelBase.h"

#include "MessagesBase.h"
#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// This is an example of the JSON payload that the Zulip server will &#x60;POST&#x60; to your server 
/// </summary>
class  Inline_response_200
    : public ModelBase
{
public:
    Inline_response_200();
    virtual ~Inline_response_200();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// Inline_response_200 members

    /// <summary>
    /// Email of the bot user. 
    /// </summary>
    utility::string_t getBotEmail() const;
    bool botEmailIsSet() const;
    void unsetBot_email();

    void setBotEmail(const utility::string_t& value);

    /// <summary>
    /// The full name of the bot user. 
    /// </summary>
    utility::string_t getBotFullName() const;
    bool botFullNameIsSet() const;
    void unsetBot_full_name();

    void setBotFullName(const utility::string_t& value);

    /// <summary>
    /// The message content, in raw Markdown format (not rendered to HTML). 
    /// </summary>
    utility::string_t getData() const;
    bool dataIsSet() const;
    void unsetData();

    void setData(const utility::string_t& value);

    /// <summary>
    /// What aspect of the message triggered the outgoing webhook notification. Possible values include &#x60;private_message&#x60; and &#x60;mention&#x60;. 
    /// </summary>
    utility::string_t getTrigger() const;
    bool triggerIsSet() const;
    void unsetTrigger();

    void setTrigger(const utility::string_t& value);

    /// <summary>
    /// A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the &#x60;zuliprc&#x60; file downloaded when creating the bot. 
    /// </summary>
    utility::string_t getToken() const;
    bool tokenIsSet() const;
    void unsetToken();

    void setToken(const utility::string_t& value);

    /// <summary>
    /// A dict containing details on the message that triggered the outgoing webhook, in the format used by [&#x60;GET /messages&#x60;](/api/get-messages). 
    /// </summary>
    std::shared_ptr<MessagesBase> getMessage() const;
    bool messageIsSet() const;
    void unsetMessage();

    void setMessage(const std::shared_ptr<MessagesBase>& value);


protected:
    utility::string_t m_Bot_email;
    bool m_Bot_emailIsSet;
    utility::string_t m_Bot_full_name;
    bool m_Bot_full_nameIsSet;
    utility::string_t m_Data;
    bool m_DataIsSet;
    utility::string_t m_Trigger;
    bool m_TriggerIsSet;
    utility::string_t m_Token;
    bool m_TokenIsSet;
    std::shared_ptr<MessagesBase> m_Message;
    bool m_MessageIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_Inline_response_200_H_ */
