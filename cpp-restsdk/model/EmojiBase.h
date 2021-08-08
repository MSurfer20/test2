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
 * EmojiBase.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_EmojiBase_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_EmojiBase_H_


#include "../ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// 
/// </summary>
class  EmojiBase
    : public ModelBase
{
public:
    EmojiBase();
    virtual ~EmojiBase();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// EmojiBase members

    /// <summary>
    /// A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For example, for &#x60;unicode_emoji&#x60;, this will be an encoding of the Unicode codepoint; for &#x60;realm_emoji&#x60;, it&#39;ll be the ID of the realm emoji. 
    /// </summary>
    utility::string_t getEmojiCode() const;
    bool emojiCodeIsSet() const;
    void unsetEmoji_code();

    void setEmojiCode(const utility::string_t& value);

    /// <summary>
    /// Name of the emoji. 
    /// </summary>
    utility::string_t getEmojiName() const;
    bool emojiNameIsSet() const;
    void unsetEmoji_name();

    void setEmojiName(const utility::string_t& value);

    /// <summary>
    /// One of the following values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode   codepoint). * &#x60;realm_emoji&#x60;: [Custom emoji](/help/add-custom-emoji).   (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to   namespace the &#x60;zulip&#x60; emoji. 
    /// </summary>
    utility::string_t getReactionType() const;
    bool reactionTypeIsSet() const;
    void unsetReaction_type();

    void setReactionType(const utility::string_t& value);


protected:
    utility::string_t m_Emoji_code;
    bool m_Emoji_codeIsSet;
    utility::string_t m_Emoji_name;
    bool m_Emoji_nameIsSet;
    utility::string_t m_Reaction_type;
    bool m_Reaction_typeIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_EmojiBase_H_ */